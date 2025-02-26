//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.12.28 at 05:49:44 PM GMT
//

package net.sf.mpxj.ganttproject.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for calendars complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="calendars">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="day-types" type="{}day-types"/>
 *         &lt;element name="date" type="{}date" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="base-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "calendars", propOrder =
{
   "dayTypes",
   "date"
}) public class Calendars
{

   @XmlElement(name = "day-types", required = true) protected DayTypes dayTypes;
   protected List<Date> date;
   @XmlAttribute(name = "base-id") protected String baseId;

   /**
    * Gets the value of the dayTypes property.
    * 
    * @return
    *     possible object is
    *     {@link DayTypes }
    *     
    */
   public DayTypes getDayTypes()
   {
      return dayTypes;
   }

   /**
    * Sets the value of the dayTypes property.
    * 
    * @param value
    *     allowed object is
    *     {@link DayTypes }
    *     
    */
   public void setDayTypes(DayTypes value)
   {
      this.dayTypes = value;
   }

   /**
    * Gets the value of the date property.
    * 
    * <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a <CODE>set</CODE> method for the date property.
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getDate().add(newItem);
    * </pre>
    * 
    * 
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link Date }
    * 
    * 
    */
   public List<Date> getDate()
   {
      if (date == null)
      {
         date = new ArrayList<Date>();
      }
      return this.date;
   }

   /**
    * Gets the value of the baseId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getBaseId()
   {
      return baseId;
   }

   /**
    * Sets the value of the baseId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setBaseId(String value)
   {
      this.baseId = value;
   }

}
