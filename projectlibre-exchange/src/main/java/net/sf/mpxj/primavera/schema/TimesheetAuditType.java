//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.09.18 at 02:35:45 PM BST
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for TimesheetAuditType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TimesheetAuditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApproverUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApproverUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AuditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OverheadHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OverheadOvertimeHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PendingOverheadHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PendingOverheadOvertimeHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PendingProjectHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PendingProjectOvertimeHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ProjectHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProjectOvertimeHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ResourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimesheetActivityStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Submitted"/>
 *               &lt;enumeration value="Approved"/>
 *               &lt;enumeration value="Resource Manager Approved"/>
 *               &lt;enumeration value="Project Manager Approved"/>
 *               &lt;enumeration value="Active"/>
 *               &lt;enumeration value="Rejected"/>
 *               &lt;enumeration value="Resubmitted"/>
 *               &lt;enumeration value="Reopened"/>
 *               &lt;enumeration value="Submitted for RM"/>
 *               &lt;enumeration value="Resubmitted for RM"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TimesheetApprovingAs" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Project Manager"/>
 *               &lt;enumeration value="Resource Manager"/>
 *               &lt;enumeration value="Project Manager Delegate"/>
 *               &lt;enumeration value="Resource Manager Delegate"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TimesheetPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TimesheetPeriodObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimesheetPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TimesheetStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Submitted"/>
 *               &lt;enumeration value="Approved"/>
 *               &lt;enumeration value="Resource Manager Approved"/>
 *               &lt;enumeration value="Project Manager Approved"/>
 *               &lt;enumeration value="Active"/>
 *               &lt;enumeration value="Rejected"/>
 *               &lt;enumeration value="Not Started"/>
 *               &lt;enumeration value="Resubmitted"/>
 *               &lt;enumeration value="Reopened"/>
 *               &lt;enumeration value="Submitted for RM"/>
 *               &lt;enumeration value="Resubmitted for RM"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "TimesheetAuditType", propOrder =
{
   "approverUserName",
   "approverUserObjectId",
   "auditDate",
   "objectId",
   "overheadHours",
   "overheadOvertimeHours",
   "pendingOverheadHours",
   "pendingOverheadOvertimeHours",
   "pendingProjectHours",
   "pendingProjectOvertimeHours",
   "projectHours",
   "projectId",
   "projectObjectId",
   "projectOvertimeHours",
   "resourceId",
   "resourceName",
   "resourceObjectId",
   "timesheetActivityStatus",
   "timesheetApprovingAs",
   "timesheetPeriodEndDate",
   "timesheetPeriodObjectId",
   "timesheetPeriodStartDate",
   "timesheetStatus"
}) public class TimesheetAuditType
{

   @XmlElement(name = "ApproverUserName") protected String approverUserName;
   @XmlElement(name = "ApproverUserObjectId", nillable = true) protected Integer approverUserObjectId;
   @XmlElement(name = "AuditDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date auditDate;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "OverheadHours", nillable = true) protected Double overheadHours;
   @XmlElement(name = "OverheadOvertimeHours", nillable = true) protected Double overheadOvertimeHours;
   @XmlElement(name = "PendingOverheadHours", nillable = true) protected Double pendingOverheadHours;
   @XmlElement(name = "PendingOverheadOvertimeHours", nillable = true) protected Double pendingOverheadOvertimeHours;
   @XmlElement(name = "PendingProjectHours", nillable = true) protected Double pendingProjectHours;
   @XmlElement(name = "PendingProjectOvertimeHours", nillable = true) protected Double pendingProjectOvertimeHours;
   @XmlElement(name = "ProjectHours", nillable = true) protected Double projectHours;
   @XmlElement(name = "ProjectId") protected String projectId;
   @XmlElement(name = "ProjectObjectId", nillable = true) protected Integer projectObjectId;
   @XmlElement(name = "ProjectOvertimeHours", nillable = true) protected Double projectOvertimeHours;
   @XmlElement(name = "ResourceId") protected String resourceId;
   @XmlElement(name = "ResourceName") protected String resourceName;
   @XmlElement(name = "ResourceObjectId", nillable = true) protected Integer resourceObjectId;
   @XmlElement(name = "TimesheetActivityStatus") protected String timesheetActivityStatus;
   @XmlElement(name = "TimesheetApprovingAs") protected String timesheetApprovingAs;
   @XmlElement(name = "TimesheetPeriodEndDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date timesheetPeriodEndDate;
   @XmlElement(name = "TimesheetPeriodObjectId", nillable = true) protected Integer timesheetPeriodObjectId;
   @XmlElement(name = "TimesheetPeriodStartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date timesheetPeriodStartDate;
   @XmlElement(name = "TimesheetStatus") protected String timesheetStatus;

   /**
    * Gets the value of the approverUserName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getApproverUserName()
   {
      return approverUserName;
   }

   /**
    * Sets the value of the approverUserName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setApproverUserName(String value)
   {
      this.approverUserName = value;
   }

   /**
    * Gets the value of the approverUserObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getApproverUserObjectId()
   {
      return approverUserObjectId;
   }

   /**
    * Sets the value of the approverUserObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setApproverUserObjectId(Integer value)
   {
      this.approverUserObjectId = value;
   }

   /**
    * Gets the value of the auditDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getAuditDate()
   {
      return auditDate;
   }

   /**
    * Sets the value of the auditDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setAuditDate(Date value)
   {
      this.auditDate = value;
   }

   /**
    * Gets the value of the objectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the overheadHours property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getOverheadHours()
   {
      return overheadHours;
   }

   /**
    * Sets the value of the overheadHours property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setOverheadHours(Double value)
   {
      this.overheadHours = value;
   }

   /**
    * Gets the value of the overheadOvertimeHours property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getOverheadOvertimeHours()
   {
      return overheadOvertimeHours;
   }

   /**
    * Sets the value of the overheadOvertimeHours property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setOverheadOvertimeHours(Double value)
   {
      this.overheadOvertimeHours = value;
   }

   /**
    * Gets the value of the pendingOverheadHours property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getPendingOverheadHours()
   {
      return pendingOverheadHours;
   }

   /**
    * Sets the value of the pendingOverheadHours property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setPendingOverheadHours(Double value)
   {
      this.pendingOverheadHours = value;
   }

   /**
    * Gets the value of the pendingOverheadOvertimeHours property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getPendingOverheadOvertimeHours()
   {
      return pendingOverheadOvertimeHours;
   }

   /**
    * Sets the value of the pendingOverheadOvertimeHours property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setPendingOverheadOvertimeHours(Double value)
   {
      this.pendingOverheadOvertimeHours = value;
   }

   /**
    * Gets the value of the pendingProjectHours property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getPendingProjectHours()
   {
      return pendingProjectHours;
   }

   /**
    * Sets the value of the pendingProjectHours property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setPendingProjectHours(Double value)
   {
      this.pendingProjectHours = value;
   }

   /**
    * Gets the value of the pendingProjectOvertimeHours property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getPendingProjectOvertimeHours()
   {
      return pendingProjectOvertimeHours;
   }

   /**
    * Sets the value of the pendingProjectOvertimeHours property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setPendingProjectOvertimeHours(Double value)
   {
      this.pendingProjectOvertimeHours = value;
   }

   /**
    * Gets the value of the projectHours property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getProjectHours()
   {
      return projectHours;
   }

   /**
    * Sets the value of the projectHours property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setProjectHours(Double value)
   {
      this.projectHours = value;
   }

   /**
    * Gets the value of the projectId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectId()
   {
      return projectId;
   }

   /**
    * Sets the value of the projectId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectId(String value)
   {
      this.projectId = value;
   }

   /**
    * Gets the value of the projectObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setProjectObjectId(Integer value)
   {
      this.projectObjectId = value;
   }

   /**
    * Gets the value of the projectOvertimeHours property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getProjectOvertimeHours()
   {
      return projectOvertimeHours;
   }

   /**
    * Sets the value of the projectOvertimeHours property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setProjectOvertimeHours(Double value)
   {
      this.projectOvertimeHours = value;
   }

   /**
    * Gets the value of the resourceId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getResourceId()
   {
      return resourceId;
   }

   /**
    * Sets the value of the resourceId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setResourceId(String value)
   {
      this.resourceId = value;
   }

   /**
    * Gets the value of the resourceName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getResourceName()
   {
      return resourceName;
   }

   /**
    * Sets the value of the resourceName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setResourceName(String value)
   {
      this.resourceName = value;
   }

   /**
    * Gets the value of the resourceObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getResourceObjectId()
   {
      return resourceObjectId;
   }

   /**
    * Sets the value of the resourceObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setResourceObjectId(Integer value)
   {
      this.resourceObjectId = value;
   }

   /**
    * Gets the value of the timesheetActivityStatus property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTimesheetActivityStatus()
   {
      return timesheetActivityStatus;
   }

   /**
    * Sets the value of the timesheetActivityStatus property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTimesheetActivityStatus(String value)
   {
      this.timesheetActivityStatus = value;
   }

   /**
    * Gets the value of the timesheetApprovingAs property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTimesheetApprovingAs()
   {
      return timesheetApprovingAs;
   }

   /**
    * Sets the value of the timesheetApprovingAs property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTimesheetApprovingAs(String value)
   {
      this.timesheetApprovingAs = value;
   }

   /**
    * Gets the value of the timesheetPeriodEndDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getTimesheetPeriodEndDate()
   {
      return timesheetPeriodEndDate;
   }

   /**
    * Sets the value of the timesheetPeriodEndDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTimesheetPeriodEndDate(Date value)
   {
      this.timesheetPeriodEndDate = value;
   }

   /**
    * Gets the value of the timesheetPeriodObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getTimesheetPeriodObjectId()
   {
      return timesheetPeriodObjectId;
   }

   /**
    * Sets the value of the timesheetPeriodObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setTimesheetPeriodObjectId(Integer value)
   {
      this.timesheetPeriodObjectId = value;
   }

   /**
    * Gets the value of the timesheetPeriodStartDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getTimesheetPeriodStartDate()
   {
      return timesheetPeriodStartDate;
   }

   /**
    * Sets the value of the timesheetPeriodStartDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTimesheetPeriodStartDate(Date value)
   {
      this.timesheetPeriodStartDate = value;
   }

   /**
    * Gets the value of the timesheetStatus property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTimesheetStatus()
   {
      return timesheetStatus;
   }

   /**
    * Sets the value of the timesheetStatus property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTimesheetStatus(String value)
   {
      this.timesheetStatus = value;
   }

}
