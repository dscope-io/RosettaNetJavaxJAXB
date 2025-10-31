
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.attachmentdescription.v01_03.AttachmentDescription;
import io.dscope.rosettanet.universal.codelist.mimetypequalifier.v01_02.MimeTypeQualifier;
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
 * <p>Java class for AttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:AttachmentDescription:xsd:codelist:01.03}AttachmentDescription" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MimeTypeQualifier:xsd:codelist:01.02}MimeTypeQualifier"/&gt;
 *         &lt;element name="UniversalResourceLocator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "AttachmentType", propOrder = {
    "attachmentDescription",
    "description",
    "mimeTypeQualifier",
    "universalResourceLocator"
})
public class AttachmentType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AttachmentDescription", namespace = "urn:rosettanet:specification:domain:Manufacturing:AttachmentDescription:xsd:codelist:01.03", type = AttachmentDescription.class, required = false)
    protected AttachmentDescription attachmentDescription;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "MimeTypeQualifier", namespace = "urn:rosettanet:specification:universal:MimeTypeQualifier:xsd:codelist:01.02", type = MimeTypeQualifier.class)
    protected MimeTypeQualifier mimeTypeQualifier;
    @XmlElement(name = "UniversalResourceLocator", required = true)
    protected String universalResourceLocator;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the attachmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentDescription }
     *     
     */
    public AttachmentDescription getAttachmentDescription() {
        return attachmentDescription;
    }

    /**
     * Sets the value of the attachmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentDescription }
     *     
     */
    public void setAttachmentDescription(AttachmentDescription value) {
        this.attachmentDescription = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
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
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the mimeTypeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link MimeTypeQualifier }
     *     
     */
    public MimeTypeQualifier getMimeTypeQualifier() {
        return mimeTypeQualifier;
    }

    /**
     * Sets the value of the mimeTypeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeTypeQualifier }
     *     
     */
    public void setMimeTypeQualifier(MimeTypeQualifier value) {
        this.mimeTypeQualifier = value;
    }

    /**
     * Gets the value of the universalResourceLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalResourceLocator() {
        return universalResourceLocator;
    }

    /**
     * Sets the value of the universalResourceLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalResourceLocator(String value) {
        this.universalResourceLocator = value;
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
        final AttachmentType that = ((AttachmentType) object);
        {
            AttachmentDescription lhsAttachmentDescription;
            lhsAttachmentDescription = this.getAttachmentDescription();
            AttachmentDescription rhsAttachmentDescription;
            rhsAttachmentDescription = that.getAttachmentDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachmentDescription", lhsAttachmentDescription), LocatorUtils.property(thatLocator, "attachmentDescription", rhsAttachmentDescription), lhsAttachmentDescription, rhsAttachmentDescription, (this.attachmentDescription!= null), (that.attachmentDescription!= null))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            MimeTypeQualifier lhsMimeTypeQualifier;
            lhsMimeTypeQualifier = this.getMimeTypeQualifier();
            MimeTypeQualifier rhsMimeTypeQualifier;
            rhsMimeTypeQualifier = that.getMimeTypeQualifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mimeTypeQualifier", lhsMimeTypeQualifier), LocatorUtils.property(thatLocator, "mimeTypeQualifier", rhsMimeTypeQualifier), lhsMimeTypeQualifier, rhsMimeTypeQualifier, (this.mimeTypeQualifier!= null), (that.mimeTypeQualifier!= null))) {
                return false;
            }
        }
        {
            String lhsUniversalResourceLocator;
            lhsUniversalResourceLocator = this.getUniversalResourceLocator();
            String rhsUniversalResourceLocator;
            rhsUniversalResourceLocator = that.getUniversalResourceLocator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "universalResourceLocator", lhsUniversalResourceLocator), LocatorUtils.property(thatLocator, "universalResourceLocator", rhsUniversalResourceLocator), lhsUniversalResourceLocator, rhsUniversalResourceLocator, (this.universalResourceLocator!= null), (that.universalResourceLocator!= null))) {
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
            AttachmentDescription theAttachmentDescription;
            theAttachmentDescription = this.getAttachmentDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachmentDescription", theAttachmentDescription), currentHashCode, theAttachmentDescription, (this.attachmentDescription!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            MimeTypeQualifier theMimeTypeQualifier;
            theMimeTypeQualifier = this.getMimeTypeQualifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mimeTypeQualifier", theMimeTypeQualifier), currentHashCode, theMimeTypeQualifier, (this.mimeTypeQualifier!= null));
        }
        {
            String theUniversalResourceLocator;
            theUniversalResourceLocator = this.getUniversalResourceLocator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "universalResourceLocator", theUniversalResourceLocator), currentHashCode, theUniversalResourceLocator, (this.universalResourceLocator!= null));
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
            AttachmentDescription theAttachmentDescription;
            theAttachmentDescription = this.getAttachmentDescription();
            strategy.appendField(locator, this, "attachmentDescription", buffer, theAttachmentDescription, (this.attachmentDescription!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            MimeTypeQualifier theMimeTypeQualifier;
            theMimeTypeQualifier = this.getMimeTypeQualifier();
            strategy.appendField(locator, this, "mimeTypeQualifier", buffer, theMimeTypeQualifier, (this.mimeTypeQualifier!= null));
        }
        {
            String theUniversalResourceLocator;
            theUniversalResourceLocator = this.getUniversalResourceLocator();
            strategy.appendField(locator, this, "universalResourceLocator", buffer, theUniversalResourceLocator, (this.universalResourceLocator!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
