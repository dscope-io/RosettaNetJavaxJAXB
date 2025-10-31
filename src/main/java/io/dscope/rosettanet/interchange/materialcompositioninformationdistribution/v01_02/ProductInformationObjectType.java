
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v01_02;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.design.design.v01_05.ReferenceLocator;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ProductInformationObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentTypeReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionNote" type="{urn:rosettanet:specification:domain:Design:xsd:schema:01.05}NoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.05}ReferenceLocator" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformationObjectType", propOrder = {
    "contentTypeReference",
    "descriptionNote",
    "effectiveDate",
    "identifier",
    "modificationDate",
    "name",
    "referenceLocator",
    "version"
})
public class ProductInformationObjectType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ContentTypeReference")
    protected String contentTypeReference;
    @XmlElement(name = "DescriptionNote")
    protected List<String> descriptionNote;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Identifier", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identifier;
    @XmlElement(name = "ModificationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationDate;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElementRef(name = "ReferenceLocator", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.05", type = ReferenceLocator.class, required = false)
    protected ReferenceLocator referenceLocator;
    @XmlElement(name = "Version")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger version;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contentTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentTypeReference() {
        return contentTypeReference;
    }

    /**
     * Sets the value of the contentTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentTypeReference(String value) {
        this.contentTypeReference = value;
    }

    /**
     * Gets the value of the descriptionNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescriptionNote() {
        if (descriptionNote == null) {
            descriptionNote = new ArrayList<String>();
        }
        return this.descriptionNote;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentifier(BigInteger value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the modificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the value of the modificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationDate(XMLGregorianCalendar value) {
        this.modificationDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
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
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the referenceLocator property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLocator }
     *     
     */
    public ReferenceLocator getReferenceLocator() {
        return referenceLocator;
    }

    /**
     * Sets the value of the referenceLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLocator }
     *     
     */
    public void setReferenceLocator(ReferenceLocator value) {
        this.referenceLocator = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProductInformationObjectType that = ((ProductInformationObjectType) object);
        {
            String lhsContentTypeReference;
            lhsContentTypeReference = this.getContentTypeReference();
            String rhsContentTypeReference;
            rhsContentTypeReference = that.getContentTypeReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contentTypeReference", lhsContentTypeReference), LocatorUtils.property(thatLocator, "contentTypeReference", rhsContentTypeReference), lhsContentTypeReference, rhsContentTypeReference, (this.contentTypeReference!= null), (that.contentTypeReference!= null))) {
                return false;
            }
        }
        {
            List<String> lhsDescriptionNote;
            lhsDescriptionNote = (((this.descriptionNote!= null)&&(!this.descriptionNote.isEmpty()))?this.getDescriptionNote():null);
            List<String> rhsDescriptionNote;
            rhsDescriptionNote = (((that.descriptionNote!= null)&&(!that.descriptionNote.isEmpty()))?that.getDescriptionNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "descriptionNote", lhsDescriptionNote), LocatorUtils.property(thatLocator, "descriptionNote", rhsDescriptionNote), lhsDescriptionNote, rhsDescriptionNote, ((this.descriptionNote!= null)&&(!this.descriptionNote.isEmpty())), ((that.descriptionNote!= null)&&(!that.descriptionNote.isEmpty())))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEffectiveDate;
            lhsEffectiveDate = this.getEffectiveDate();
            XMLGregorianCalendar rhsEffectiveDate;
            rhsEffectiveDate = that.getEffectiveDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveDate", lhsEffectiveDate), LocatorUtils.property(thatLocator, "effectiveDate", rhsEffectiveDate), lhsEffectiveDate, rhsEffectiveDate, (this.effectiveDate!= null), (that.effectiveDate!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            BigInteger rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsModificationDate;
            lhsModificationDate = this.getModificationDate();
            XMLGregorianCalendar rhsModificationDate;
            rhsModificationDate = that.getModificationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modificationDate", lhsModificationDate), LocatorUtils.property(thatLocator, "modificationDate", rhsModificationDate), lhsModificationDate, rhsModificationDate, (this.modificationDate!= null), (that.modificationDate!= null))) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            ReferenceLocator lhsReferenceLocator;
            lhsReferenceLocator = this.getReferenceLocator();
            ReferenceLocator rhsReferenceLocator;
            rhsReferenceLocator = that.getReferenceLocator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceLocator", lhsReferenceLocator), LocatorUtils.property(thatLocator, "referenceLocator", rhsReferenceLocator), lhsReferenceLocator, rhsReferenceLocator, (this.referenceLocator!= null), (that.referenceLocator!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsVersion;
            lhsVersion = this.getVersion();
            BigInteger rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion, (this.version!= null), (that.version!= null))) {
                return false;
            }
        }
        {
            String lhsSchemaVersion;
            lhsSchemaVersion = this.getSchemaVersion();
            String rhsSchemaVersion;
            rhsSchemaVersion = that.getSchemaVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemaVersion", lhsSchemaVersion), LocatorUtils.property(thatLocator, "schemaVersion", rhsSchemaVersion), lhsSchemaVersion, rhsSchemaVersion, (this.schemaVersion!= null), (that.schemaVersion!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String theContentTypeReference;
            theContentTypeReference = this.getContentTypeReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contentTypeReference", theContentTypeReference), currentHashCode, theContentTypeReference, (this.contentTypeReference!= null));
        }
        {
            List<String> theDescriptionNote;
            theDescriptionNote = (((this.descriptionNote!= null)&&(!this.descriptionNote.isEmpty()))?this.getDescriptionNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "descriptionNote", theDescriptionNote), currentHashCode, theDescriptionNote, ((this.descriptionNote!= null)&&(!this.descriptionNote.isEmpty())));
        }
        {
            XMLGregorianCalendar theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveDate", theEffectiveDate), currentHashCode, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            BigInteger theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            XMLGregorianCalendar theModificationDate;
            theModificationDate = this.getModificationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modificationDate", theModificationDate), currentHashCode, theModificationDate, (this.modificationDate!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            ReferenceLocator theReferenceLocator;
            theReferenceLocator = this.getReferenceLocator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceLocator", theReferenceLocator), currentHashCode, theReferenceLocator, (this.referenceLocator!= null));
        }
        {
            BigInteger theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion, (this.version!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemaVersion", theSchemaVersion), currentHashCode, theSchemaVersion, (this.schemaVersion!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theContentTypeReference;
            theContentTypeReference = this.getContentTypeReference();
            strategy.appendField(locator, this, "contentTypeReference", buffer, theContentTypeReference, (this.contentTypeReference!= null));
        }
        {
            List<String> theDescriptionNote;
            theDescriptionNote = (((this.descriptionNote!= null)&&(!this.descriptionNote.isEmpty()))?this.getDescriptionNote():null);
            strategy.appendField(locator, this, "descriptionNote", buffer, theDescriptionNote, ((this.descriptionNote!= null)&&(!this.descriptionNote.isEmpty())));
        }
        {
            XMLGregorianCalendar theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            strategy.appendField(locator, this, "effectiveDate", buffer, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            BigInteger theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            XMLGregorianCalendar theModificationDate;
            theModificationDate = this.getModificationDate();
            strategy.appendField(locator, this, "modificationDate", buffer, theModificationDate, (this.modificationDate!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            ReferenceLocator theReferenceLocator;
            theReferenceLocator = this.getReferenceLocator();
            strategy.appendField(locator, this, "referenceLocator", buffer, theReferenceLocator, (this.referenceLocator!= null));
        }
        {
            BigInteger theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion, (this.version!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
