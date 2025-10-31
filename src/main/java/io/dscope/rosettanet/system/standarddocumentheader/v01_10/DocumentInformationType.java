
package io.dscope.rosettanet.system.standarddocumentheader.v01_10;

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
 * <p>Java class for DocumentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Creation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10}DocumentIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10}DocumentManifest" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10}DocumentSecurity" minOccurs="0"/&gt;
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
@XmlType(name = "DocumentInformationType", propOrder = {
    "creation",
    "documentIdentification",
    "documentManifest",
    "documentSecurity"
})
public class DocumentInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Creation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creation;
    @XmlElementRef(name = "DocumentIdentification", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10", type = DocumentIdentification.class)
    protected DocumentIdentification documentIdentification;
    @XmlElementRef(name = "DocumentManifest", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10", type = DocumentManifest.class, required = false)
    protected DocumentManifest documentManifest;
    @XmlElementRef(name = "DocumentSecurity", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10", type = DocumentSecurity.class, required = false)
    protected DocumentSecurity documentSecurity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the creation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreation() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreation(XMLGregorianCalendar value) {
        this.creation = value;
    }

    /**
     * Gets the value of the documentIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification }
     *     
     */
    public DocumentIdentification getDocumentIdentification() {
        return documentIdentification;
    }

    /**
     * Sets the value of the documentIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification }
     *     
     */
    public void setDocumentIdentification(DocumentIdentification value) {
        this.documentIdentification = value;
    }

    /**
     * Gets the value of the documentManifest property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentManifest }
     *     
     */
    public DocumentManifest getDocumentManifest() {
        return documentManifest;
    }

    /**
     * Sets the value of the documentManifest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentManifest }
     *     
     */
    public void setDocumentManifest(DocumentManifest value) {
        this.documentManifest = value;
    }

    /**
     * Gets the value of the documentSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSecurity }
     *     
     */
    public DocumentSecurity getDocumentSecurity() {
        return documentSecurity;
    }

    /**
     * Sets the value of the documentSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSecurity }
     *     
     */
    public void setDocumentSecurity(DocumentSecurity value) {
        this.documentSecurity = value;
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
        final DocumentInformationType that = ((DocumentInformationType) object);
        {
            XMLGregorianCalendar lhsCreation;
            lhsCreation = this.getCreation();
            XMLGregorianCalendar rhsCreation;
            rhsCreation = that.getCreation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creation", lhsCreation), LocatorUtils.property(thatLocator, "creation", rhsCreation), lhsCreation, rhsCreation, (this.creation!= null), (that.creation!= null))) {
                return false;
            }
        }
        {
            DocumentIdentification lhsDocumentIdentification;
            lhsDocumentIdentification = this.getDocumentIdentification();
            DocumentIdentification rhsDocumentIdentification;
            rhsDocumentIdentification = that.getDocumentIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentIdentification", lhsDocumentIdentification), LocatorUtils.property(thatLocator, "documentIdentification", rhsDocumentIdentification), lhsDocumentIdentification, rhsDocumentIdentification, (this.documentIdentification!= null), (that.documentIdentification!= null))) {
                return false;
            }
        }
        {
            DocumentManifest lhsDocumentManifest;
            lhsDocumentManifest = this.getDocumentManifest();
            DocumentManifest rhsDocumentManifest;
            rhsDocumentManifest = that.getDocumentManifest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentManifest", lhsDocumentManifest), LocatorUtils.property(thatLocator, "documentManifest", rhsDocumentManifest), lhsDocumentManifest, rhsDocumentManifest, (this.documentManifest!= null), (that.documentManifest!= null))) {
                return false;
            }
        }
        {
            DocumentSecurity lhsDocumentSecurity;
            lhsDocumentSecurity = this.getDocumentSecurity();
            DocumentSecurity rhsDocumentSecurity;
            rhsDocumentSecurity = that.getDocumentSecurity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentSecurity", lhsDocumentSecurity), LocatorUtils.property(thatLocator, "documentSecurity", rhsDocumentSecurity), lhsDocumentSecurity, rhsDocumentSecurity, (this.documentSecurity!= null), (that.documentSecurity!= null))) {
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
            XMLGregorianCalendar theCreation;
            theCreation = this.getCreation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creation", theCreation), currentHashCode, theCreation, (this.creation!= null));
        }
        {
            DocumentIdentification theDocumentIdentification;
            theDocumentIdentification = this.getDocumentIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentIdentification", theDocumentIdentification), currentHashCode, theDocumentIdentification, (this.documentIdentification!= null));
        }
        {
            DocumentManifest theDocumentManifest;
            theDocumentManifest = this.getDocumentManifest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentManifest", theDocumentManifest), currentHashCode, theDocumentManifest, (this.documentManifest!= null));
        }
        {
            DocumentSecurity theDocumentSecurity;
            theDocumentSecurity = this.getDocumentSecurity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentSecurity", theDocumentSecurity), currentHashCode, theDocumentSecurity, (this.documentSecurity!= null));
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
            XMLGregorianCalendar theCreation;
            theCreation = this.getCreation();
            strategy.appendField(locator, this, "creation", buffer, theCreation, (this.creation!= null));
        }
        {
            DocumentIdentification theDocumentIdentification;
            theDocumentIdentification = this.getDocumentIdentification();
            strategy.appendField(locator, this, "documentIdentification", buffer, theDocumentIdentification, (this.documentIdentification!= null));
        }
        {
            DocumentManifest theDocumentManifest;
            theDocumentManifest = this.getDocumentManifest();
            strategy.appendField(locator, this, "documentManifest", buffer, theDocumentManifest, (this.documentManifest!= null));
        }
        {
            DocumentSecurity theDocumentSecurity;
            theDocumentSecurity = this.getDocumentSecurity();
            strategy.appendField(locator, this, "documentSecurity", buffer, theDocumentSecurity, (this.documentSecurity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
