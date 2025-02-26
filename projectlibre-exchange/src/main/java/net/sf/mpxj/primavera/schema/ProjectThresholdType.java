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
 * <p>Java class for ProjectThresholdType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProjectThresholdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DetailToMonitor" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Activity"/>
 *               &lt;enumeration value="WBS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FromDateExpression" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IssuePriority" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Top"/>
 *               &lt;enumeration value="High"/>
 *               &lt;enumeration value="Normal"/>
 *               &lt;enumeration value="Low"/>
 *               &lt;enumeration value="Lowest"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LowerThreshold" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="-9.99999999999999E12"/>
 *               &lt;maxInclusive value="9.99999999999999E12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProjectId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Enabled"/>
 *               &lt;enumeration value="Disabled"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ThresholdParameterObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ToDateExpression" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UpperThreshold" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="-9.99999999999999E12"/>
 *               &lt;maxInclusive value="9.99999999999999E12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WBSCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WBSName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ProjectThresholdType", propOrder =
{
   "createDate",
   "createUser",
   "detailToMonitor",
   "fromDate",
   "fromDateExpression",
   "isBaseline",
   "isTemplate",
   "issuePriority",
   "lastUpdateDate",
   "lastUpdateUser",
   "lowerThreshold",
   "obsObjectId",
   "objectId",
   "projectId",
   "projectObjectId",
   "status",
   "thresholdParameterObjectId",
   "toDate",
   "toDateExpression",
   "upperThreshold",
   "wbsCode",
   "wbsName",
   "wbsObjectId"
}) public class ProjectThresholdType
{

   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "DetailToMonitor") protected String detailToMonitor;
   @XmlElement(name = "FromDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date fromDate;
   @XmlElement(name = "FromDateExpression") protected String fromDateExpression;
   @XmlElement(name = "IsBaseline") protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate") protected Boolean isTemplate;
   @XmlElement(name = "IssuePriority") protected String issuePriority;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "LowerThreshold", nillable = true) protected Double lowerThreshold;
   @XmlElement(name = "OBSObjectId") protected Integer obsObjectId;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "ProjectId") protected String projectId;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "Status") protected String status;
   @XmlElement(name = "ThresholdParameterObjectId") protected Integer thresholdParameterObjectId;
   @XmlElement(name = "ToDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date toDate;
   @XmlElement(name = "ToDateExpression") protected String toDateExpression;
   @XmlElement(name = "UpperThreshold", nillable = true) protected Double upperThreshold;
   @XmlElement(name = "WBSCode") protected String wbsCode;
   @XmlElement(name = "WBSName") protected String wbsName;
   @XmlElement(name = "WBSObjectId", nillable = true) protected Integer wbsObjectId;

   /**
    * Gets the value of the createDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateDate(Date value)
   {
      this.createDate = value;
   }

   /**
    * Gets the value of the createUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the detailToMonitor property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDetailToMonitor()
   {
      return detailToMonitor;
   }

   /**
    * Sets the value of the detailToMonitor property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDetailToMonitor(String value)
   {
      this.detailToMonitor = value;
   }

   /**
    * Gets the value of the fromDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getFromDate()
   {
      return fromDate;
   }

   /**
    * Sets the value of the fromDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setFromDate(Date value)
   {
      this.fromDate = value;
   }

   /**
    * Gets the value of the fromDateExpression property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getFromDateExpression()
   {
      return fromDateExpression;
   }

   /**
    * Sets the value of the fromDateExpression property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setFromDateExpression(String value)
   {
      this.fromDateExpression = value;
   }

   /**
    * Gets the value of the isBaseline property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isIsBaseline()
   {
      return isBaseline;
   }

   /**
    * Sets the value of the isBaseline property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setIsBaseline(Boolean value)
   {
      this.isBaseline = value;
   }

   /**
    * Gets the value of the isTemplate property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isIsTemplate()
   {
      return isTemplate;
   }

   /**
    * Sets the value of the isTemplate property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setIsTemplate(Boolean value)
   {
      this.isTemplate = value;
   }

   /**
    * Gets the value of the issuePriority property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getIssuePriority()
   {
      return issuePriority;
   }

   /**
    * Sets the value of the issuePriority property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIssuePriority(String value)
   {
      this.issuePriority = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateDate(Date value)
   {
      this.lastUpdateDate = value;
   }

   /**
    * Gets the value of the lastUpdateUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the lowerThreshold property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getLowerThreshold()
   {
      return lowerThreshold;
   }

   /**
    * Sets the value of the lowerThreshold property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setLowerThreshold(Double value)
   {
      this.lowerThreshold = value;
   }

   /**
    * Gets the value of the obsObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getOBSObjectId()
   {
      return obsObjectId;
   }

   /**
    * Sets the value of the obsObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setOBSObjectId(Integer value)
   {
      this.obsObjectId = value;
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
    * Gets the value of the status property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getStatus()
   {
      return status;
   }

   /**
    * Sets the value of the status property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setStatus(String value)
   {
      this.status = value;
   }

   /**
    * Gets the value of the thresholdParameterObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getThresholdParameterObjectId()
   {
      return thresholdParameterObjectId;
   }

   /**
    * Sets the value of the thresholdParameterObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setThresholdParameterObjectId(Integer value)
   {
      this.thresholdParameterObjectId = value;
   }

   /**
    * Gets the value of the toDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getToDate()
   {
      return toDate;
   }

   /**
    * Sets the value of the toDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setToDate(Date value)
   {
      this.toDate = value;
   }

   /**
    * Gets the value of the toDateExpression property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getToDateExpression()
   {
      return toDateExpression;
   }

   /**
    * Sets the value of the toDateExpression property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setToDateExpression(String value)
   {
      this.toDateExpression = value;
   }

   /**
    * Gets the value of the upperThreshold property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getUpperThreshold()
   {
      return upperThreshold;
   }

   /**
    * Sets the value of the upperThreshold property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setUpperThreshold(Double value)
   {
      this.upperThreshold = value;
   }

   /**
    * Gets the value of the wbsCode property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getWBSCode()
   {
      return wbsCode;
   }

   /**
    * Sets the value of the wbsCode property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setWBSCode(String value)
   {
      this.wbsCode = value;
   }

   /**
    * Gets the value of the wbsName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getWBSName()
   {
      return wbsName;
   }

   /**
    * Sets the value of the wbsName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setWBSName(String value)
   {
      this.wbsName = value;
   }

   /**
    * Gets the value of the wbsObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getWBSObjectId()
   {
      return wbsObjectId;
   }

   /**
    * Sets the value of the wbsObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setWBSObjectId(Integer value)
   {
      this.wbsObjectId = value;
   }

}
