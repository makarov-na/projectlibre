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
 * <p>Java class for ActivityStepCreateType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActivityStepCreateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActivityStepName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ActivityStepObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChangeSetObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RequestUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StepPercentComplete" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *               &lt;maxInclusive value="100.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StepWeight" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *               &lt;maxInclusive value="999999.0"/>
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
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ActivityStepCreateType", propOrder =
{
   "activityObjectId",
   "activityStepName",
   "activityStepObjectId",
   "changeSetObjectId",
   "date",
   "requestUserObjectId",
   "stepPercentComplete",
   "stepWeight"
}) public class ActivityStepCreateType
{

   @XmlElement(name = "ActivityObjectId") protected Integer activityObjectId;
   @XmlElement(name = "ActivityStepName") protected String activityStepName;
   @XmlElement(name = "ActivityStepObjectId") protected Integer activityStepObjectId;
   @XmlElement(name = "ChangeSetObjectId") protected Integer changeSetObjectId;
   @XmlElement(name = "Date", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date date;
   @XmlElement(name = "RequestUserObjectId", nillable = true) protected Integer requestUserObjectId;
   @XmlElement(name = "StepPercentComplete", nillable = true) protected Double stepPercentComplete;
   @XmlElement(name = "StepWeight", nillable = true) protected Double stepWeight;

   /**
    * Gets the value of the activityObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getActivityObjectId()
   {
      return activityObjectId;
   }

   /**
    * Sets the value of the activityObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setActivityObjectId(Integer value)
   {
      this.activityObjectId = value;
   }

   /**
    * Gets the value of the activityStepName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getActivityStepName()
   {
      return activityStepName;
   }

   /**
    * Sets the value of the activityStepName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActivityStepName(String value)
   {
      this.activityStepName = value;
   }

   /**
    * Gets the value of the activityStepObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getActivityStepObjectId()
   {
      return activityStepObjectId;
   }

   /**
    * Sets the value of the activityStepObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setActivityStepObjectId(Integer value)
   {
      this.activityStepObjectId = value;
   }

   /**
    * Gets the value of the changeSetObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getChangeSetObjectId()
   {
      return changeSetObjectId;
   }

   /**
    * Sets the value of the changeSetObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setChangeSetObjectId(Integer value)
   {
      this.changeSetObjectId = value;
   }

   /**
    * Gets the value of the date property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getDate()
   {
      return date;
   }

   /**
    * Sets the value of the date property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDate(Date value)
   {
      this.date = value;
   }

   /**
    * Gets the value of the requestUserObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRequestUserObjectId()
   {
      return requestUserObjectId;
   }

   /**
    * Sets the value of the requestUserObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRequestUserObjectId(Integer value)
   {
      this.requestUserObjectId = value;
   }

   /**
    * Gets the value of the stepPercentComplete property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getStepPercentComplete()
   {
      return stepPercentComplete;
   }

   /**
    * Sets the value of the stepPercentComplete property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setStepPercentComplete(Double value)
   {
      this.stepPercentComplete = value;
   }

   /**
    * Gets the value of the stepWeight property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getStepWeight()
   {
      return stepWeight;
   }

   /**
    * Sets the value of the stepWeight property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setStepWeight(Double value)
   {
      this.stepWeight = value;
   }

}
