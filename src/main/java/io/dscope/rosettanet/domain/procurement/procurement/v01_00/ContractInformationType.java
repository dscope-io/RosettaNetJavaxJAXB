
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for ContractInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Primary" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}ContractWithType" minOccurs="0"/&gt;
 *         &lt;element name="Secondary" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}ContractWithType" minOccurs="0"/&gt;
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
@XmlType(name = "ContractInformationType", propOrder = {
    "identifier",
    "primary",
    "secondary"
})
public class ContractInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "Primary")
    protected ContractWithType primary;
    @XmlElement(name = "Secondary")
    protected ContractWithType secondary;
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
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link ContractWithType }
     *     
     */
    public ContractWithType getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractWithType }
     *     
     */
    public void setPrimary(ContractWithType value) {
        this.primary = value;
    }

    /**
     * Gets the value of the secondary property.
     * 
     * @return
     *     possible object is
     *     {@link ContractWithType }
     *     
     */
    public ContractWithType getSecondary() {
        return secondary;
    }

    /**
     * Sets the value of the secondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractWithType }
     *     
     */
    public void setSecondary(ContractWithType value) {
        this.secondary = value;
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
        final ContractInformationType that = ((ContractInformationType) object);
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
            ContractWithType lhsPrimary;
            lhsPrimary = this.getPrimary();
            ContractWithType rhsPrimary;
            rhsPrimary = that.getPrimary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primary", lhsPrimary), LocatorUtils.property(thatLocator, "primary", rhsPrimary), lhsPrimary, rhsPrimary, (this.primary!= null), (that.primary!= null))) {
                return false;
            }
        }
        {
            ContractWithType lhsSecondary;
            lhsSecondary = this.getSecondary();
            ContractWithType rhsSecondary;
            rhsSecondary = that.getSecondary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secondary", lhsSecondary), LocatorUtils.property(thatLocator, "secondary", rhsSecondary), lhsSecondary, rhsSecondary, (this.secondary!= null), (that.secondary!= null))) {
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
            ContractWithType thePrimary;
            thePrimary = this.getPrimary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primary", thePrimary), currentHashCode, thePrimary, (this.primary!= null));
        }
        {
            ContractWithType theSecondary;
            theSecondary = this.getSecondary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondary", theSecondary), currentHashCode, theSecondary, (this.secondary!= null));
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
            ContractWithType thePrimary;
            thePrimary = this.getPrimary();
            strategy.appendField(locator, this, "primary", buffer, thePrimary, (this.primary!= null));
        }
        {
            ContractWithType theSecondary;
            theSecondary = this.getSecondary();
            strategy.appendField(locator, this, "secondary", buffer, theSecondary, (this.secondary!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
