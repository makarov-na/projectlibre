//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.12.28 at 05:49:44 PM GMT
//

package net.sf.mpxj.ganttproject.schema;

import java.util.Date;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1 extends XmlAdapter<String, Date>
{

   @Override public Date unmarshal(String value)
   {
      return (net.sf.mpxj.ganttproject.DatatypeConverter.parseDate(value));
   }

   @Override public String marshal(Date value)
   {
      return (net.sf.mpxj.ganttproject.DatatypeConverter.printDate(value));
   }

}
