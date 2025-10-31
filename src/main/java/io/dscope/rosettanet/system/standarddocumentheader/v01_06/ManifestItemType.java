
package io.dscope.rosettanet.system.standarddocumentheader.v01_06;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.codelist.language.v01_01.LanguageType;
import io.dscope.rosettanet.universal.codelist.mimetypequalifier.v01_01.MimeTypeQualifierType;
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
 * <p>Java class for ManifestItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManifestItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{urn:rosettanet:specification:universal:Language:xsd:codelist:01.01}LanguageType" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="MimeTypeQualifier" type="{urn:rosettanet:specification:universal:MimeTypeQualifier:xsd:codelist:01.01}MimeTypeQualifierType"/&gt;
 *         &lt;element name="UniversalResourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ManifestItemType", propOrder = {
    "description",
    "language",
    "length",
    "mimeTypeQualifier",
    "universalResourceIdentifier"
})
public class ManifestItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Language")
    protected LanguageType language;
    @XmlElement(name = "Length")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger length;
    @XmlElement(name = "MimeTypeQualifier", required = true)
    protected MimeTypeQualifierType mimeTypeQualifier;
    @XmlElement(name = "UniversalResourceIdentifier", required = true)
    protected String universalResourceIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLanguage(LanguageType value) {
        this.language = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the mimeTypeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link MimeTypeQualifierType }
     *     
     */
    public MimeTypeQualifierType getMimeTypeQualifier() {
        return mimeTypeQualifier;
    }

    /**
     * Sets the value of the mimeTypeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeTypeQualifierType }
     *     
     */
    public void setMimeTypeQualifier(MimeTypeQualifierType value) {
        this.mimeTypeQualifier = value;
    }

    /**
     * Gets the value of the universalResourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalResourceIdentifier() {
        return universalResourceIdentifier;
    }

    /**
     * Sets the value of the universalResourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalResourceIdentifier(String value) {
        this.universalResourceIdentifier = value;
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
        final ManifestItemType that = ((ManifestItemType) object);
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
            LanguageType lhsLanguage;
            lhsLanguage = this.getLanguage();
            LanguageType rhsLanguage;
            rhsLanguage = that.getLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage, (this.language!= null), (that.language!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsLength;
            lhsLength = this.getLength();
            BigInteger rhsLength;
            rhsLength = that.getLength();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "length", lhsLength), LocatorUtils.property(thatLocator, "length", rhsLength), lhsLength, rhsLength, (this.length!= null), (that.length!= null))) {
                return false;
            }
        }
        {
            MimeTypeQualifierType lhsMimeTypeQualifier;
            lhsMimeTypeQualifier = this.getMimeTypeQualifier();
            MimeTypeQualifierType rhsMimeTypeQualifier;
            rhsMimeTypeQualifier = that.getMimeTypeQualifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mimeTypeQualifier", lhsMimeTypeQualifier), LocatorUtils.property(thatLocator, "mimeTypeQualifier", rhsMimeTypeQualifier), lhsMimeTypeQualifier, rhsMimeTypeQualifier, (this.mimeTypeQualifier!= null), (that.mimeTypeQualifier!= null))) {
                return false;
            }
        }
        {
            String lhsUniversalResourceIdentifier;
            lhsUniversalResourceIdentifier = this.getUniversalResourceIdentifier();
            String rhsUniversalResourceIdentifier;
            rhsUniversalResourceIdentifier = that.getUniversalResourceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "universalResourceIdentifier", lhsUniversalResourceIdentifier), LocatorUtils.property(thatLocator, "universalResourceIdentifier", rhsUniversalResourceIdentifier), lhsUniversalResourceIdentifier, rhsUniversalResourceIdentifier, (this.universalResourceIdentifier!= null), (that.universalResourceIdentifier!= null))) {
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
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            LanguageType theLanguage;
            theLanguage = this.getLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage, (this.language!= null));
        }
        {
            BigInteger theLength;
            theLength = this.getLength();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "length", theLength), currentHashCode, theLength, (this.length!= null));
        }
        {
            MimeTypeQualifierType theMimeTypeQualifier;
            theMimeTypeQualifier = this.getMimeTypeQualifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mimeTypeQualifier", theMimeTypeQualifier), currentHashCode, theMimeTypeQualifier, (this.mimeTypeQualifier!= null));
        }
        {
            String theUniversalResourceIdentifier;
            theUniversalResourceIdentifier = this.getUniversalResourceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "universalResourceIdentifier", theUniversalResourceIdentifier), currentHashCode, theUniversalResourceIdentifier, (this.universalResourceIdentifier!= null));
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
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            LanguageType theLanguage;
            theLanguage = this.getLanguage();
            strategy.appendField(locator, this, "language", buffer, theLanguage, (this.language!= null));
        }
        {
            BigInteger theLength;
            theLength = this.getLength();
            strategy.appendField(locator, this, "length", buffer, theLength, (this.length!= null));
        }
        {
            MimeTypeQualifierType theMimeTypeQualifier;
            theMimeTypeQualifier = this.getMimeTypeQualifier();
            strategy.appendField(locator, this, "mimeTypeQualifier", buffer, theMimeTypeQualifier, (this.mimeTypeQualifier!= null));
        }
        {
            String theUniversalResourceIdentifier;
            theUniversalResourceIdentifier = this.getUniversalResourceIdentifier();
            strategy.appendField(locator, this, "universalResourceIdentifier", buffer, theUniversalResourceIdentifier, (this.universalResourceIdentifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
