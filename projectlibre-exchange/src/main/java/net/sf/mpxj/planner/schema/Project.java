//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.08.02 at 09:18:52 PM BST
//

package net.sf.mpxj.planner.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
{
   "properties",
   "phases",
   "calendars",
   "tasks",
   "resourceGroups",
   "resources",
   "allocations"
}) @XmlRootElement(name = "project") public class Project
{

   @XmlAttribute(name = "mrproject-version", required = true) @XmlJavaTypeAdapter(NormalizedStringAdapter.class) protected String mrprojectVersion;
   @XmlAttribute(required = true) @XmlJavaTypeAdapter(NormalizedStringAdapter.class) protected String name;
   @XmlAttribute @XmlJavaTypeAdapter(NormalizedStringAdapter.class) protected String company;
   @XmlAttribute @XmlJavaTypeAdapter(NormalizedStringAdapter.class) protected String manager;
   @XmlAttribute(name = "project-start", required = true) @XmlJavaTypeAdapter(NormalizedStringAdapter.class) protected String projectStart;
   @XmlAttribute @XmlJavaTypeAdapter(NormalizedStringAdapter.class) protected String calendar;
   @XmlAttribute @XmlJavaTypeAdapter(NormalizedStringAdapter.class) protected String phase;
   protected List<Properties> properties;
   protected Phases phases;
   protected Calendars calendars;
   protected Tasks tasks;
   @XmlElement(name = "resource-groups") protected ResourceGroups resourceGroups;
   protected Resources resources;
   protected Allocations allocations;

   /**
    * Gets the value of the mrprojectVersion property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getMrprojectVersion()
   {
      return mrprojectVersion;
   }

   /**
    * Sets the value of the mrprojectVersion property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setMrprojectVersion(String value)
   {
      this.mrprojectVersion = value;
   }

   /**
    * Gets the value of the name property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the name property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setName(String value)
   {
      this.name = value;
   }

   /**
    * Gets the value of the company property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCompany()
   {
      return company;
   }

   /**
    * Sets the value of the company property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCompany(String value)
   {
      this.company = value;
   }

   /**
    * Gets the value of the manager property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getManager()
   {
      return manager;
   }

   /**
    * Sets the value of the manager property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setManager(String value)
   {
      this.manager = value;
   }

   /**
    * Gets the value of the projectStart property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectStart()
   {
      return projectStart;
   }

   /**
    * Sets the value of the projectStart property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectStart(String value)
   {
      this.projectStart = value;
   }

   /**
    * Gets the value of the calendar property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCalendar()
   {
      return calendar;
   }

   /**
    * Sets the value of the calendar property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCalendar(String value)
   {
      this.calendar = value;
   }

   /**
    * Gets the value of the phase property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPhase()
   {
      return phase;
   }

   /**
    * Sets the value of the phase property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPhase(String value)
   {
      this.phase = value;
   }

   /**
    * Gets the value of the properties property.
    *
    * <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a <CODE>set</CODE> method for the properties property.
    *
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getProperties().add(newItem);
    * </pre>
    *
    *
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link Properties }
    *
    *
    */
   public List<Properties> getProperties()
   {
      if (properties == null)
      {
         properties = new ArrayList<Properties>();
      }
      return this.properties;
   }

   /**
    * Gets the value of the phases property.
    *
    * @return
    *     possible object is
    *     {@link Phases }
    *
    */
   public Phases getPhases()
   {
      return phases;
   }

   /**
    * Sets the value of the phases property.
    *
    * @param value
    *     allowed object is
    *     {@link Phases }
    *
    */
   public void setPhases(Phases value)
   {
      this.phases = value;
   }

   /**
    * Gets the value of the calendars property.
    *
    * @return
    *     possible object is
    *     {@link Calendars }
    *
    */
   public Calendars getCalendars()
   {
      return calendars;
   }

   /**
    * Sets the value of the calendars property.
    *
    * @param value
    *     allowed object is
    *     {@link Calendars }
    *
    */
   public void setCalendars(Calendars value)
   {
      this.calendars = value;
   }

   /**
    * Gets the value of the tasks property.
    *
    * @return
    *     possible object is
    *     {@link Tasks }
    *
    */
   public Tasks getTasks()
   {
      return tasks;
   }

   /**
    * Sets the value of the tasks property.
    *
    * @param value
    *     allowed object is
    *     {@link Tasks }
    *
    */
   public void setTasks(Tasks value)
   {
      this.tasks = value;
   }

   /**
    * Gets the value of the resourceGroups property.
    *
    * @return
    *     possible object is
    *     {@link ResourceGroups }
    *
    */
   public ResourceGroups getResourceGroups()
   {
      return resourceGroups;
   }

   /**
    * Sets the value of the resourceGroups property.
    *
    * @param value
    *     allowed object is
    *     {@link ResourceGroups }
    *
    */
   public void setResourceGroups(ResourceGroups value)
   {
      this.resourceGroups = value;
   }

   /**
    * Gets the value of the resources property.
    *
    * @return
    *     possible object is
    *     {@link Resources }
    *
    */
   public Resources getResources()
   {
      return resources;
   }

   /**
    * Sets the value of the resources property.
    *
    * @param value
    *     allowed object is
    *     {@link Resources }
    *
    */
   public void setResources(Resources value)
   {
      this.resources = value;
   }

   /**
    * Gets the value of the allocations property.
    *
    * @return
    *     possible object is
    *     {@link Allocations }
    *
    */
   public Allocations getAllocations()
   {
      return allocations;
   }

   /**
    * Sets the value of the allocations property.
    *
    * @param value
    *     allowed object is
    *     {@link Allocations }
    *
    */
   public void setAllocations(Allocations value)
   {
      this.allocations = value;
   }

}
