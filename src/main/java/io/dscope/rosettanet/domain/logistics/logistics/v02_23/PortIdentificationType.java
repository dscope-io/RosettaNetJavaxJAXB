
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.portidentifierauthoritycode.v01_03.PortIdentifierAuthorityCode;
import io.dscope.rosettanet.universal.locations.v01_04.AlternativeIdentifier;
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
 * <p>Java class for PortIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}AlternativeIdentifier"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Logistics:PortIdentifierAuthorityCode:xsd:codelist:01.03}PortIdentifierAuthorityCode"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "PortIdentificationType", propOrder = {
    "identifier",
    "alternativeIdentifier",
    "portIdentifierAuthorityCode"
})
public class PortIdentificationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = AlternativeIdentifier.class, required = false)
    protected AlternativeIdentifier alternativeIdentifier;
    @XmlElementRef(name = "PortIdentifierAuthorityCode", namespace = "urn:rosettanet:specification:domain:Logistics:PortIdentifierAuthorityCode:xsd:codelist:01.03", type = PortIdentifierAuthorityCode.class, required = false)
    protected PortIdentifierAuthorityCode portIdentifierAuthorityCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the alternativeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeIdentifier }
     *     
     */
    public AlternativeIdentifier getAlternativeIdentifier() {
        return alternativeIdentifier;
    }

    /**
     * Sets the value of the alternativeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeIdentifier }
     *     
     */
    public void setAlternativeIdentifier(AlternativeIdentifier value) {
        this.alternativeIdentifier = value;
    }

    /**
     * Gets the value of the portIdentifierAuthorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link PortIdentifierAuthorityCode }
     *     
     */
    public PortIdentifierAuthorityCode getPortIdentifierAuthorityCode() {
        return portIdentifierAuthorityCode;
    }

    /**
     * Sets the value of the portIdentifierAuthorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortIdentifierAuthorityCode }
     *     
     */
    public void setPortIdentifierAuthorityCode(PortIdentifierAuthorityCode value) {
        this.portIdentifierAuthorityCode = value;
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
        final PortIdentificationType that = ((PortIdentificationType) object);
        {
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            AlternativeIdentifier lhsAlternativeIdentifier;
            lhsAlternativeIdentifier = this.getAlternativeIdentifier();
            AlternativeIdentifier rhsAlternativeIdentifier;
            rhsAlternativeIdentifier = that.getAlternativeIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativeIdentifier", lhsAlternativeIdentifier), LocatorUtils.property(thatLocator, "alternativeIdentifier", rhsAlternativeIdentifier), lhsAlternativeIdentifier, rhsAlternativeIdentifier, (this.alternativeIdentifier!= null), (that.alternativeIdentifier!= null))) {
                return false;
            }
        }
        {
            PortIdentifierAuthorityCode lhsPortIdentifierAuthorityCode;
            lhsPortIdentifierAuthorityCode = this.getPortIdentifierAuthorityCode();
            PortIdentifierAuthorityCode rhsPortIdentifierAuthorityCode;
            rhsPortIdentifierAuthorityCode = that.getPortIdentifierAuthorityCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portIdentifierAuthorityCode", lhsPortIdentifierAuthorityCode), LocatorUtils.property(thatLocator, "portIdentifierAuthorityCode", rhsPortIdentifierAuthorityCode), lhsPortIdentifierAuthorityCode, rhsPortIdentifierAuthorityCode, (this.portIdentifierAuthorityCode!= null), (that.portIdentifierAuthorityCode!= null))) {
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
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            AlternativeIdentifier theAlternativeIdentifier;
            theAlternativeIdentifier = this.getAlternativeIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativeIdentifier", theAlternativeIdentifier), currentHashCode, theAlternativeIdentifier, (this.alternativeIdentifier!= null));
        }
        {
            PortIdentifierAuthorityCode thePortIdentifierAuthorityCode;
            thePortIdentifierAuthorityCode = this.getPortIdentifierAuthorityCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portIdentifierAuthorityCode", thePortIdentifierAuthorityCode), currentHashCode, thePortIdentifierAuthorityCode, (this.portIdentifierAuthorityCode!= null));
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
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            AlternativeIdentifier theAlternativeIdentifier;
            theAlternativeIdentifier = this.getAlternativeIdentifier();
            strategy.appendField(locator, this, "alternativeIdentifier", buffer, theAlternativeIdentifier, (this.alternativeIdentifier!= null));
        }
        {
            PortIdentifierAuthorityCode thePortIdentifierAuthorityCode;
            thePortIdentifierAuthorityCode = this.getPortIdentifierAuthorityCode();
            strategy.appendField(locator, this, "portIdentifierAuthorityCode", buffer, thePortIdentifierAuthorityCode, (this.portIdentifierAuthorityCode!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
