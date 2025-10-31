
package io.dscope.rosettanet.system.standarddocumentheader.v01_11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.system.codelist.tpirfiletype.v01_01.TPIRFileTypeType;
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
 * <p>Java class for TpirPipIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpirPipIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileType" type="{urn:rosettanet:specification:system:TPIRFileType:xsd:codelist:01.01}TPIRFileTypeType" minOccurs="0"/&gt;
 *         &lt;element name="PartnerId" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.03}DUNSPlus4Type"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11}PipIdentifier"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11}PipVersion"/&gt;
 *         &lt;element name="TpirBusinessProcessIdentifier" type="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11}BusinessProcessIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="TpirPipVersion" type="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11}VersionIdentifierType"/&gt;
 *         &lt;element name="Uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
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
@XmlType(name = "TpirPipIdentificationType", propOrder = {
    "fileType",
    "partnerId",
    "pipIdentifier",
    "pipVersion",
    "tpirBusinessProcessIdentifier",
    "tpirPipVersion",
    "uri"
})
public class TpirPipIdentificationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "FileType")
    protected TPIRFileTypeType fileType;
    @XmlElement(name = "PartnerId", required = true)
    protected String partnerId;
    @XmlElementRef(name = "PipIdentifier", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11", type = PipIdentifier.class)
    protected PipIdentifier pipIdentifier;
    @XmlElementRef(name = "PipVersion", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11", type = PipVersion.class)
    protected PipVersion pipVersion;
    @XmlElement(name = "TpirBusinessProcessIdentifier")
    protected String tpirBusinessProcessIdentifier;
    @XmlElement(name = "TpirPipVersion", required = true)
    protected String tpirPipVersion;
    @XmlElement(name = "Uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link TPIRFileTypeType }
     *     
     */
    public TPIRFileTypeType getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPIRFileTypeType }
     *     
     */
    public void setFileType(TPIRFileTypeType value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the pipIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PipIdentifier }
     *     
     */
    public PipIdentifier getPipIdentifier() {
        return pipIdentifier;
    }

    /**
     * Sets the value of the pipIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipIdentifier }
     *     
     */
    public void setPipIdentifier(PipIdentifier value) {
        this.pipIdentifier = value;
    }

    /**
     * Gets the value of the pipVersion property.
     * 
     * @return
     *     possible object is
     *     {@link PipVersion }
     *     
     */
    public PipVersion getPipVersion() {
        return pipVersion;
    }

    /**
     * Sets the value of the pipVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipVersion }
     *     
     */
    public void setPipVersion(PipVersion value) {
        this.pipVersion = value;
    }

    /**
     * Gets the value of the tpirBusinessProcessIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpirBusinessProcessIdentifier() {
        return tpirBusinessProcessIdentifier;
    }

    /**
     * Sets the value of the tpirBusinessProcessIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpirBusinessProcessIdentifier(String value) {
        this.tpirBusinessProcessIdentifier = value;
    }

    /**
     * Gets the value of the tpirPipVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpirPipVersion() {
        return tpirPipVersion;
    }

    /**
     * Sets the value of the tpirPipVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpirPipVersion(String value) {
        this.tpirPipVersion = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
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
        final TpirPipIdentificationType that = ((TpirPipIdentificationType) object);
        {
            TPIRFileTypeType lhsFileType;
            lhsFileType = this.getFileType();
            TPIRFileTypeType rhsFileType;
            rhsFileType = that.getFileType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileType", lhsFileType), LocatorUtils.property(thatLocator, "fileType", rhsFileType), lhsFileType, rhsFileType, (this.fileType!= null), (that.fileType!= null))) {
                return false;
            }
        }
        {
            String lhsPartnerId;
            lhsPartnerId = this.getPartnerId();
            String rhsPartnerId;
            rhsPartnerId = that.getPartnerId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerId", lhsPartnerId), LocatorUtils.property(thatLocator, "partnerId", rhsPartnerId), lhsPartnerId, rhsPartnerId, (this.partnerId!= null), (that.partnerId!= null))) {
                return false;
            }
        }
        {
            PipIdentifier lhsPipIdentifier;
            lhsPipIdentifier = this.getPipIdentifier();
            PipIdentifier rhsPipIdentifier;
            rhsPipIdentifier = that.getPipIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pipIdentifier", lhsPipIdentifier), LocatorUtils.property(thatLocator, "pipIdentifier", rhsPipIdentifier), lhsPipIdentifier, rhsPipIdentifier, (this.pipIdentifier!= null), (that.pipIdentifier!= null))) {
                return false;
            }
        }
        {
            PipVersion lhsPipVersion;
            lhsPipVersion = this.getPipVersion();
            PipVersion rhsPipVersion;
            rhsPipVersion = that.getPipVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pipVersion", lhsPipVersion), LocatorUtils.property(thatLocator, "pipVersion", rhsPipVersion), lhsPipVersion, rhsPipVersion, (this.pipVersion!= null), (that.pipVersion!= null))) {
                return false;
            }
        }
        {
            String lhsTpirBusinessProcessIdentifier;
            lhsTpirBusinessProcessIdentifier = this.getTpirBusinessProcessIdentifier();
            String rhsTpirBusinessProcessIdentifier;
            rhsTpirBusinessProcessIdentifier = that.getTpirBusinessProcessIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tpirBusinessProcessIdentifier", lhsTpirBusinessProcessIdentifier), LocatorUtils.property(thatLocator, "tpirBusinessProcessIdentifier", rhsTpirBusinessProcessIdentifier), lhsTpirBusinessProcessIdentifier, rhsTpirBusinessProcessIdentifier, (this.tpirBusinessProcessIdentifier!= null), (that.tpirBusinessProcessIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsTpirPipVersion;
            lhsTpirPipVersion = this.getTpirPipVersion();
            String rhsTpirPipVersion;
            rhsTpirPipVersion = that.getTpirPipVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tpirPipVersion", lhsTpirPipVersion), LocatorUtils.property(thatLocator, "tpirPipVersion", rhsTpirPipVersion), lhsTpirPipVersion, rhsTpirPipVersion, (this.tpirPipVersion!= null), (that.tpirPipVersion!= null))) {
                return false;
            }
        }
        {
            String lhsUri;
            lhsUri = this.getUri();
            String rhsUri;
            rhsUri = that.getUri();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uri", lhsUri), LocatorUtils.property(thatLocator, "uri", rhsUri), lhsUri, rhsUri, (this.uri!= null), (that.uri!= null))) {
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
            TPIRFileTypeType theFileType;
            theFileType = this.getFileType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileType", theFileType), currentHashCode, theFileType, (this.fileType!= null));
        }
        {
            String thePartnerId;
            thePartnerId = this.getPartnerId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerId", thePartnerId), currentHashCode, thePartnerId, (this.partnerId!= null));
        }
        {
            PipIdentifier thePipIdentifier;
            thePipIdentifier = this.getPipIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pipIdentifier", thePipIdentifier), currentHashCode, thePipIdentifier, (this.pipIdentifier!= null));
        }
        {
            PipVersion thePipVersion;
            thePipVersion = this.getPipVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pipVersion", thePipVersion), currentHashCode, thePipVersion, (this.pipVersion!= null));
        }
        {
            String theTpirBusinessProcessIdentifier;
            theTpirBusinessProcessIdentifier = this.getTpirBusinessProcessIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tpirBusinessProcessIdentifier", theTpirBusinessProcessIdentifier), currentHashCode, theTpirBusinessProcessIdentifier, (this.tpirBusinessProcessIdentifier!= null));
        }
        {
            String theTpirPipVersion;
            theTpirPipVersion = this.getTpirPipVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tpirPipVersion", theTpirPipVersion), currentHashCode, theTpirPipVersion, (this.tpirPipVersion!= null));
        }
        {
            String theUri;
            theUri = this.getUri();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uri", theUri), currentHashCode, theUri, (this.uri!= null));
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
            TPIRFileTypeType theFileType;
            theFileType = this.getFileType();
            strategy.appendField(locator, this, "fileType", buffer, theFileType, (this.fileType!= null));
        }
        {
            String thePartnerId;
            thePartnerId = this.getPartnerId();
            strategy.appendField(locator, this, "partnerId", buffer, thePartnerId, (this.partnerId!= null));
        }
        {
            PipIdentifier thePipIdentifier;
            thePipIdentifier = this.getPipIdentifier();
            strategy.appendField(locator, this, "pipIdentifier", buffer, thePipIdentifier, (this.pipIdentifier!= null));
        }
        {
            PipVersion thePipVersion;
            thePipVersion = this.getPipVersion();
            strategy.appendField(locator, this, "pipVersion", buffer, thePipVersion, (this.pipVersion!= null));
        }
        {
            String theTpirBusinessProcessIdentifier;
            theTpirBusinessProcessIdentifier = this.getTpirBusinessProcessIdentifier();
            strategy.appendField(locator, this, "tpirBusinessProcessIdentifier", buffer, theTpirBusinessProcessIdentifier, (this.tpirBusinessProcessIdentifier!= null));
        }
        {
            String theTpirPipVersion;
            theTpirPipVersion = this.getTpirPipVersion();
            strategy.appendField(locator, this, "tpirPipVersion", buffer, theTpirPipVersion, (this.tpirPipVersion!= null));
        }
        {
            String theUri;
            theUri = this.getUri();
            strategy.appendField(locator, this, "uri", buffer, theUri, (this.uri!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
