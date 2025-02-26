/*
 * file:       MSPDIFile.java
 * author:     Jon Iles
 * copyright:  (c) Tapster Rock Limited 2002-2003
 * date:       20/02/2003
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package com.projectlibre1.server.data.mspdi;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;


import net.sf.mpxj.ProjectCalendar;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Resource;
import net.sf.mpxj.ResourceAssignment;
import net.sf.mpxj.Task;
import net.sf.mpxj.mspdi.DatatypeConverter;
import net.sf.mpxj.mspdi.MSPDIWriter;
import net.sf.mpxj.mspdi.schema.Project;
import net.sf.mpxj.mspdi.schema.TimephasedDataType;

import com.projectlibre.core.time.TimeUtil;
import com.projectlibre.core.time.TimephasedType;
import com.projectlibre.pm.tasks.SnapshotList;
import com.projectlibre1.exchange.ImportedCalendarService;
import com.projectlibre1.server.data.MPXConverter;
import com.projectlibre1.association.AssociationList;
import com.projectlibre1.configuration.Settings;
import com.projectlibre1.contrib.util.Log;
import com.projectlibre1.contrib.util.LogFactory;
import com.projectlibre1.pm.assignment.Assignment;
import com.projectlibre1.pm.calendar.CalendarService;
import com.projectlibre1.pm.resource.EnterpriseResource;
import com.projectlibre1.pm.resource.ResourceImpl;
import com.projectlibre1.pm.snapshot.Snapshottable;
import com.projectlibre1.pm.task.NormalTask;
import com.projectlibre1.pm.task.TaskSnapshot;
import com.projectlibre1.util.DateTime;

/**
 * This class is used to represent a Microsoft Project Data Interchange (MSPDI)
 * XML file. This implementation allows the file to be read, and the data it
 * contains exported as a set of MPX objects. These objects can be interrogated
 * to retrieve any required data, or stored as an MPX file.
 */
public class ModifiedMSPDIWriter extends MSPDIWriter {
	//static Log logg=LogFactory.getLog(ModifiedMSPDIFile.class);
	/**
	 * This constructor allows a new MSPDI file to be created from scratch.
	 */
	public ModifiedMSPDIWriter() {
		super();
	}

	protected Boolean formatOutput()  {
		return Boolean.FALSE;
	}

	public void setProjectFile(ProjectFile pf) {
		m_projectFile = pf;
	}

	private Resource unassignedResource() {
		// add the unassigned resource
		if (UNASSIGNED == null) {
			UNASSIGNED = m_projectFile.addResource();
			UNASSIGNED.setUniqueID(EnterpriseResource.UNASSIGNED_ID);
		}
		return UNASSIGNED;

	}
	protected void writeProjectCalendar(Project project) {
		// projectlibre addition
		int id = 1; // if not found below, use the default standard calendar
		ProjectCalendar cal = ImportedCalendarService.getInstance().findExportedCalendar(
				CalendarService.findBaseCalendar(m_projectFile.getProjectProperties().getDefaultCalendarName()));
		if (cal != null) {
			id = cal.getUniqueID();
		} else {
			log.warn("EXPORT: Could not export project calendar: Project: " + m_projectFile.getProjectProperties().getName() + " calendar "
					+ m_projectFile.getProjectProperties().getDefaultCalendarName());
		}
		project.setCalendarUID(BigInteger.valueOf(id));

	}


	/**
	 * This method writes resource data to an MSPDI file.
	 *
	 * @param factory
	 *            ObjectFactory instance
	 * @param project
	 *            Root node of the MSPDI file
	 * @throws JAXBException
	 *             on xml creation errors
	 */
	@Override
	protected void writeResources(Project project){ //claur signature update
		Project.Resources resources = m_factory.createProjectResources(); //this ok?
		project.setResources(resources);
		List<Project.Resources.Resource> list = resources.getResource();

		Iterator iter = m_projectFile.getAllResources().iterator();
		Resource resource;
		while (iter.hasNext()) {
			resource = (Resource) iter.next();
			if (resource.getUniqueID() == EnterpriseResource.UNASSIGNED_ID) // don't
				continue;
			//DEF167699	 Export  -> mspdi cannot have ',' or msp complains.
//			if (Environment.isNoPodServer()) { //claur
//				String name = resource.getName();
//				if (name.contains(",")) {
//					//Fannon, Tommy -> Tommy Fannon
//					String fname = name.substring(name.indexOf(',')+2);
//					//fname = fname.replace(" ", "");
//					String lname = name.substring(0, name.indexOf(','));
//					name = fname + " " + lname;
//					//name = name.replace(",", " ");
//					resource.setName(name);
//				}
//			}

			list.add(writeResource(/*factory,*/ resource));
		}
	}



	/**
	 * This method writes data for a single task to an MSPDI file.
	 *
	 * @param factory
	 *            ObjectFactory instance
	 * @param mpx
	 *            Task data
	 * @return new task instance
	 * @throws JAXBException
	 *             on xml creation errors
	 */
	@Override
	protected Project.Tasks.Task writeTask(Task mpx) { //signature updated

		/* DEF167859:   MS Project Export not working
		   mpxj doesn't handle NaN.  this would be better fixed in mpxj code itself in the DatatypeConverter, but
		   it would be a pain to setup the development environment to build this... so we will hack this for now
		   --TAF2009-07-29
	    */
		Number fixedCost = mpx.getFixedCost();
		if (fixedCost == null || Double.isNaN(fixedCost.doubleValue()))
			mpx.setFixedCost(null);

		Project.Tasks.Task xml = super.writeTask(mpx);
		if (!mpx.getNull())
			writeTaskBaselinesAndTimephased(xml, mpx);
		return xml;
	}

	/**
	 * This method writes data for a single assignment to an MSPDI file.
	 *
	 * @param factory
	 *            ObjectFactory instance
	 * @param mpx
	 *            Resource assignment data
	 * @param uid
	 *            Unique ID for the new assignment
	 * @return New MSPDI assignment instance
	 * @throws JAXBException
	 *             on xml creation errors
	 */
	@Override
	protected Project.Assignments.Assignment writeAssignment(ResourceAssignment mpx) {
		Project.Assignments.Assignment xml = super.writeAssignment(mpx);

		//Microsoft Project does something strange: The unassigned resource has a 0 id for the resource, but assignments use the (short)-1 value.
		if (mpx.getResourceUniqueID() == 0)
			xml.setResourceUID(BigInteger.valueOf(EnterpriseResource.UNASSIGNED_ID));

		Assignment projectlibreAssignment = (Assignment) projectlibreAssignmentMap.get(mpx);
		Calendar stop = DateTime.calendarInstance();
		stop.setTimeInMillis(DateTime.fromGmt(projectlibreAssignment.getStop())); //claur adding fromGmt to fix time zone
		xml.setStop(stop);
		Calendar resume = DateTime.calendarInstance();
		resume.setTimeInMillis(DateTime.fromGmt(projectlibreAssignment.getResume())); //claur adding fromGmt to fix time zone
		xml.setResume(resume);
		writeAssigmentBaselinesAndTimephased(xml, mpx,DateTime.fromGmt(projectlibreAssignment.getStart()),DateTime.fromGmt(projectlibreAssignment.getFinish()));

		return (xml);
	}

	// ProjectLibre specific

	static Log log = LogFactory.getLog(ModifiedMSPDIWriter.class);
	protected com.projectlibre1.pm.task.Project projectlibre1Project;
	protected Map projectlibreTaskMap = new HashMap();
	protected Map projectlibreAssignmentMap = new HashMap();
	protected Map projectlibreSnapshotIdMap = new HashMap();
	protected Map timephasedMap = new HashMap();
	private static Resource UNASSIGNED = null;


	public void setOPPrProject(com.projectlibre1.pm.task.Project projectlibre1Project) {
		this.projectlibre1Project = projectlibre1Project;
	}

	public void putOPPrTaskMap(Object mpx, Object projectlibre1) {
		projectlibreTaskMap.put(mpx, projectlibre1);
	}

	public void putOPPrAssignmentMap(Object mpx, Object projectlibre1) {
		projectlibreAssignmentMap.put(mpx, projectlibre1);
	}

	public void putOPPrSnapshotIdMap(Object mpx, Object projectlibre1) {
		projectlibreSnapshotIdMap.put(mpx, projectlibre1);
	}

	public void putTimephasedList(Object mpx, Object timephasedList) {
		if (mpx == null || timephasedList == null)
			return;
		timephasedMap.put(mpx, timephasedList);
	}

	public List getTimephasedList(Object mpx) {
		return (List) timephasedMap.get(mpx);
	}

	/**
	 * overloads default behavior to return the "unassigned" resource
	 */
	public Resource getResourceByUniqueID(int id) {
		Resource r;
		if (id == EnterpriseResource.UNASSIGNED_ID)
			r = unassignedResource();
		else
			r = m_projectFile.getResourceByUniqueID(id);
		return r;

	}
	private void writeTaskBaselinesAndTimephased(final Project.Tasks.Task xml, Task mpx){
		// baselines
		final List<Project.Tasks.Task.Baseline> baselineList = xml.getBaseline();

		NormalTask projectlibre1Task = (NormalTask) projectlibreTaskMap.get(mpx);
		if (projectlibre1Task == null)
			return;
		for (int s = 0; s < Settings.numBaselines(); s++) {
			if (s == Snapshottable.CURRENT.intValue())
				continue;
			TaskSnapshot snapshot = (TaskSnapshot) projectlibre1Task.getSnapshot(new Integer(s));
			if (snapshot == null)
				continue;
			Project.Tasks.Task.Baseline baseline = m_factory.createProjectTasksTaskBaseline();
			baseline.setNumber(BigInteger.valueOf(s));
			Calendar start=Calendar.getInstance();
			start.setTimeInMillis(DateTime.fromGmt(projectlibre1Task.getBaselineStart(s)));
			baseline.setStart(start);
			Calendar finish=Calendar.getInstance();
			finish.setTimeInMillis(DateTime.fromGmt(projectlibre1Task.getBaselineFinish(s)));
			baseline.setFinish(finish);
			baseline.setWork(DatatypeConverter.printDuration(this, MPXConverter.toMPXDuration((long) projectlibre1Task.getBaselineWork(s))));
			baselineList.add(baseline);



		}
	}
	private void writeAssigmentBaselinesAndTimephased(final Project.Assignments.Assignment xml,
			ResourceAssignment mpx, final long assignmentStart, final long assignmentFinish){ //claur signature changed
		int snapshotId = ((Integer) projectlibreSnapshotIdMap.get(mpx)).intValue();
		final Assignment projectlibreAssignment = (Assignment) projectlibreAssignmentMap.get(mpx);
		// baselines
		final List<TimephasedDataType> timephasedList = xml.getTimephasedData();
		final long[] offset=new long[1];
		offset[0]=-1L;
		final long[] baseLineStart=new long[SnapshotList.BASELINE_COUNT];
		final long[] baseLineFinish=new long[SnapshotList.BASELINE_COUNT];
		TimephasedService.getInstance().consumeTimephased(projectlibreAssignment, new TimephasedConsumer() {
			public void consumeTimephased(Object timephased) {
				TimephasedDataType t=(TimephasedDataType) timephased;
				if (offset[0]==-1L){ //workaround for scheduling bug
					//assuming easliest timephased comes first
					if (t.getStart().getTimeInMillis()<assignmentStart)
						offset[0]=assignmentStart-t.getStart().getTimeInMillis();
					else offset[0]=0;
				}
				if (offset[0]>0){
					t.getStart().setTimeInMillis(t.getStart().getTimeInMillis()+offset[0]);
					t.getFinish().setTimeInMillis(t.getFinish().getTimeInMillis()+offset[0]);
				}
				//if ("PT0H0M0S".equals(t.getValue())) return;
				((TimephasedDataType) timephased).setUID(xml.getUID());
				TimephasedType type=TimephasedType.getInstance(t.getType().intValue());
				int i=type.getSnapshotId();
				if (i>=0 && i<SnapshotList.BASELINE_COUNT){
					if(baseLineStart[i]<=0L || baseLineStart[i] < t.getStart().getTimeInMillis())
						baseLineStart[i]=t.getStart().getTimeInMillis();
					if(baseLineFinish[i]<=0L || baseLineFinish[i] < t.getFinish().getTimeInMillis())
						baseLineFinish[i]=t.getFinish().getTimeInMillis();
				}

				timephasedList.add(t);
			}
			public boolean acceptValue(double value) { //TODO hack, consumeTimephased shouldn't give PT0H0M0S
				return value!=0.0;
			}
		}, m_factory);
		
		for (int i=0; i<SnapshotList.BASELINE_COUNT; i++){
			if (baseLineStart[i]>0 && baseLineFinish[i]>0){
				Project.Assignments.Assignment.Baseline baseline = m_factory.createProjectAssignmentsAssignmentBaseline();
				baseline.setStart(DatatypeConverter.printExtendedAttributeDate(new Date(baseLineStart[i])));
				baseline.setFinish(DatatypeConverter.printExtendedAttributeDate(new Date(baseLineFinish[i])));
				baseline.setNumber(Integer.toString(i));
				xml.getBaseline().add(baseline);
			}
			
		}
		


	}
	public ProjectFile getProjectFile() {
		return m_projectFile;
	}

}
