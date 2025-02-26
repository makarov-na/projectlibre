//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.09.18 at 02:35:45 PM BST
//

package net.sf.mpxj.primavera.schema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for DocumentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Author" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContentRepositoryDocumentInternalId" minOccurs="0">
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
 *         &lt;element name="Deliverable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentCategoryName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocumentCategoryObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DocumentStatusCodeName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="36"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocumentStatusCodeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DocumentType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Non-Collaboration Document"/>
 *               &lt;enumeration value="Collaboration Document"/>
 *               &lt;enumeration value="Repository Document"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GUID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\{[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}\}|"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrivateLocation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjectId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PublicLocation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReferenceNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResourceId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResourceName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RevisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Title" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Version" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UDF" type="{http://xmlns.oracle.com/Primavera/P6/V17.7/API/BusinessObjects}UDFAssignmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "DocumentType", propOrder =
{
   "author",
   "contentRepositoryDocumentInternalId",
   "createDate",
   "createUser",
   "deliverable",
   "description",
   "documentCategoryName",
   "documentCategoryObjectId",
   "documentStatusCodeName",
   "documentStatusCodeObjectId",
   "documentType",
   "guid",
   "isBaseline",
   "isTemplate",
   "lastUpdateDate",
   "lastUpdateUser",
   "objectId",
   "parentObjectId",
   "privateLocation",
   "projectId",
   "projectObjectId",
   "publicLocation",
   "referenceNumber",
   "resourceId",
   "resourceName",
   "resourceObjectId",
   "revisionDate",
   "sequenceNumber",
   "title",
   "version",
   "udf"
}) public class DocumentType
{

   @XmlElement(name = "Author") protected String author;
   @XmlElement(name = "ContentRepositoryDocumentInternalId") protected String contentRepositoryDocumentInternalId;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "Deliverable") protected Boolean deliverable;
   @XmlElement(name = "Description") protected String description;
   @XmlElement(name = "DocumentCategoryName") protected String documentCategoryName;
   @XmlElement(name = "DocumentCategoryObjectId", nillable = true) protected Integer documentCategoryObjectId;
   @XmlElement(name = "DocumentStatusCodeName") protected String documentStatusCodeName;
   @XmlElement(name = "DocumentStatusCodeObjectId", nillable = true) protected Integer documentStatusCodeObjectId;
   @XmlElement(name = "DocumentType") protected String documentType;
   @XmlElement(name = "GUID") protected String guid;
   @XmlElement(name = "IsBaseline", nillable = true) protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate") protected Boolean isTemplate;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "ParentObjectId", nillable = true) protected Integer parentObjectId;
   @XmlElement(name = "PrivateLocation") protected String privateLocation;
   @XmlElement(name = "ProjectId") protected String projectId;
   @XmlElement(name = "ProjectObjectId", nillable = true) protected Integer projectObjectId;
   @XmlElement(name = "PublicLocation") protected String publicLocation;
   @XmlElement(name = "ReferenceNumber") protected String referenceNumber;
   @XmlElement(name = "ResourceId") protected String resourceId;
   @XmlElement(name = "ResourceName") protected String resourceName;
   @XmlElement(name = "ResourceObjectId", nillable = true) protected Integer resourceObjectId;
   @XmlElement(name = "RevisionDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date revisionDate;
   @XmlElement(name = "SequenceNumber") protected Integer sequenceNumber;
   @XmlElement(name = "Title") protected String title;
   @XmlElement(name = "Version") protected String version;
   @XmlElement(name = "UDF") protected List<UDFAssignmentType> udf;

   /**
    * Gets the value of the author property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getAuthor()
   {
      return author;
   }

   /**
    * Sets the value of the author property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setAuthor(String value)
   {
      this.author = value;
   }

   /**
    * Gets the value of the contentRepositoryDocumentInternalId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getContentRepositoryDocumentInternalId()
   {
      return contentRepositoryDocumentInternalId;
   }

   /**
    * Sets the value of the contentRepositoryDocumentInternalId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setContentRepositoryDocumentInternalId(String value)
   {
      this.contentRepositoryDocumentInternalId = value;
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
    * Gets the value of the deliverable property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isDeliverable()
   {
      return deliverable;
   }

   /**
    * Sets the value of the deliverable property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setDeliverable(Boolean value)
   {
      this.deliverable = value;
   }

   /**
    * Gets the value of the description property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDescription()
   {
      return description;
   }

   /**
    * Sets the value of the description property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDescription(String value)
   {
      this.description = value;
   }

   /**
    * Gets the value of the documentCategoryName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDocumentCategoryName()
   {
      return documentCategoryName;
   }

   /**
    * Sets the value of the documentCategoryName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDocumentCategoryName(String value)
   {
      this.documentCategoryName = value;
   }

   /**
    * Gets the value of the documentCategoryObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getDocumentCategoryObjectId()
   {
      return documentCategoryObjectId;
   }

   /**
    * Sets the value of the documentCategoryObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setDocumentCategoryObjectId(Integer value)
   {
      this.documentCategoryObjectId = value;
   }

   /**
    * Gets the value of the documentStatusCodeName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDocumentStatusCodeName()
   {
      return documentStatusCodeName;
   }

   /**
    * Sets the value of the documentStatusCodeName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDocumentStatusCodeName(String value)
   {
      this.documentStatusCodeName = value;
   }

   /**
    * Gets the value of the documentStatusCodeObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getDocumentStatusCodeObjectId()
   {
      return documentStatusCodeObjectId;
   }

   /**
    * Sets the value of the documentStatusCodeObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setDocumentStatusCodeObjectId(Integer value)
   {
      this.documentStatusCodeObjectId = value;
   }

   /**
    * Gets the value of the documentType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDocumentType()
   {
      return documentType;
   }

   /**
    * Sets the value of the documentType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDocumentType(String value)
   {
      this.documentType = value;
   }

   /**
    * Gets the value of the guid property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getGUID()
   {
      return guid;
   }

   /**
    * Sets the value of the guid property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setGUID(String value)
   {
      this.guid = value;
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
    * Gets the value of the parentObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getParentObjectId()
   {
      return parentObjectId;
   }

   /**
    * Sets the value of the parentObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setParentObjectId(Integer value)
   {
      this.parentObjectId = value;
   }

   /**
    * Gets the value of the privateLocation property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPrivateLocation()
   {
      return privateLocation;
   }

   /**
    * Sets the value of the privateLocation property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPrivateLocation(String value)
   {
      this.privateLocation = value;
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
    * Gets the value of the publicLocation property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPublicLocation()
   {
      return publicLocation;
   }

   /**
    * Sets the value of the publicLocation property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPublicLocation(String value)
   {
      this.publicLocation = value;
   }

   /**
    * Gets the value of the referenceNumber property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getReferenceNumber()
   {
      return referenceNumber;
   }

   /**
    * Sets the value of the referenceNumber property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setReferenceNumber(String value)
   {
      this.referenceNumber = value;
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
    * Gets the value of the revisionDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getRevisionDate()
   {
      return revisionDate;
   }

   /**
    * Sets the value of the revisionDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRevisionDate(Date value)
   {
      this.revisionDate = value;
   }

   /**
    * Gets the value of the sequenceNumber property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getSequenceNumber()
   {
      return sequenceNumber;
   }

   /**
    * Sets the value of the sequenceNumber property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setSequenceNumber(Integer value)
   {
      this.sequenceNumber = value;
   }

   /**
    * Gets the value of the title property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTitle()
   {
      return title;
   }

   /**
    * Sets the value of the title property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTitle(String value)
   {
      this.title = value;
   }

   /**
    * Gets the value of the version property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getVersion()
   {
      return version;
   }

   /**
    * Sets the value of the version property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setVersion(String value)
   {
      this.version = value;
   }

   /**
    * Gets the value of the udf property.
    *
    * <p>
    * This accessor method returns a reference to the live list,
    * not a snapshot. Therefore any modification you make to the
    * returned list will be present inside the JAXB object.
    * This is why there is not a <CODE>set</CODE> method for the udf property.
    *
    * <p>
    * For example, to add a new item, do as follows:
    * <pre>
    *    getUDF().add(newItem);
    * </pre>
    *
    *
    * <p>
    * Objects of the following type(s) are allowed in the list
    * {@link UDFAssignmentType }
    *
    *
    */
   public List<UDFAssignmentType> getUDF()
   {
      if (udf == null)
      {
         udf = new ArrayList<UDFAssignmentType>();
      }
      return this.udf;
   }

}
