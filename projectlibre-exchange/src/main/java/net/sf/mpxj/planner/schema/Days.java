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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
{
   "day"
}) @XmlRootElement(name = "days") public class Days
{

   protected List<Day> day;

   /**
    * Gets the value of the day property.
    *
    * <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a <CODE>set</CODE> method for the day property.
    *
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getDay().add(newItem);
    * </pre>
    *
    *
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link Day }
    *
    *
    */
   public List<Day> getDay()
   {
      if (day == null)
      {
         day = new ArrayList<Day>();
      }
      return this.day;
   }

}
