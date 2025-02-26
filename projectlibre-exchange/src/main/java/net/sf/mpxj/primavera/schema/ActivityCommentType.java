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
 * <p>Java class for ActivityCommentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActivityCommentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CommentText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
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
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PersonalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReadFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TimeDiff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ActivityCommentType", propOrder =
{
   "activityObjectId",
   "commentDate",
   "commentText",
   "createDate",
   "createUser",
   "lastUpdateDate",
   "lastUpdateUser",
   "objectId",
   "personalName",
   "readFlag",
   "timeDiff",
   "userObjectId"
}) public class ActivityCommentType
{

   @XmlElement(name = "ActivityObjectId") protected Integer activityObjectId;
   @XmlElement(name = "CommentDate", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date commentDate;
   @XmlElement(name = "CommentText") protected String commentText;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "PersonalName") protected String personalName;
   @XmlElement(name = "ReadFlag") protected Boolean readFlag;
   @XmlElement(name = "TimeDiff") protected String timeDiff;
   @XmlElement(name = "UserObjectId") protected Integer userObjectId;

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
    * Gets the value of the commentDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getCommentDate()
   {
      return commentDate;
   }

   /**
    * Sets the value of the commentDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCommentDate(Date value)
   {
      this.commentDate = value;
   }

   /**
    * Gets the value of the commentText property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCommentText()
   {
      return commentText;
   }

   /**
    * Sets the value of the commentText property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCommentText(String value)
   {
      this.commentText = value;
   }

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
    * Gets the value of the personalName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPersonalName()
   {
      return personalName;
   }

   /**
    * Sets the value of the personalName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPersonalName(String value)
   {
      this.personalName = value;
   }

   /**
    * Gets the value of the readFlag property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isReadFlag()
   {
      return readFlag;
   }

   /**
    * Sets the value of the readFlag property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setReadFlag(Boolean value)
   {
      this.readFlag = value;
   }

   /**
    * Gets the value of the timeDiff property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTimeDiff()
   {
      return timeDiff;
   }

   /**
    * Sets the value of the timeDiff property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTimeDiff(String value)
   {
      this.timeDiff = value;
   }

   /**
    * Gets the value of the userObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getUserObjectId()
   {
      return userObjectId;
   }

   /**
    * Sets the value of the userObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setUserObjectId(Integer value)
   {
      this.userObjectId = value;
   }

}
