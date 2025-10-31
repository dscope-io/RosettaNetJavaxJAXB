
package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

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
 * <p>Java class for LotIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LotType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Secondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LotIdentificationType", propOrder = {
    "lotType",
    "primary",
    "secondary"
})
public class LotIdentificationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "LotType")
    protected String lotType;
    @XmlElement(name = "Primary", required = true)
    protected String primary;
    @XmlElement(name = "Secondary")
    protected String secondary;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lotType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotType() {
        return lotType;
    }

    /**
     * Sets the value of the lotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotType(String value) {
        this.lotType = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimary(String value) {
        this.primary = value;
    }

    /**
     * Gets the value of the secondary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondary() {
        return secondary;
    }

    /**
     * Sets the value of the secondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondary(String value) {
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
        final LotIdentificationType that = ((LotIdentificationType) object);
        {
            String lhsLotType;
            lhsLotType = this.getLotType();
            String rhsLotType;
            rhsLotType = that.getLotType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotType", lhsLotType), LocatorUtils.property(thatLocator, "lotType", rhsLotType), lhsLotType, rhsLotType, (this.lotType!= null), (that.lotType!= null))) {
                return false;
            }
        }
        {
            String lhsPrimary;
            lhsPrimary = this.getPrimary();
            String rhsPrimary;
            rhsPrimary = that.getPrimary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primary", lhsPrimary), LocatorUtils.property(thatLocator, "primary", rhsPrimary), lhsPrimary, rhsPrimary, (this.primary!= null), (that.primary!= null))) {
                return false;
            }
        }
        {
            String lhsSecondary;
            lhsSecondary = this.getSecondary();
            String rhsSecondary;
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
            String theLotType;
            theLotType = this.getLotType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotType", theLotType), currentHashCode, theLotType, (this.lotType!= null));
        }
        {
            String thePrimary;
            thePrimary = this.getPrimary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primary", thePrimary), currentHashCode, thePrimary, (this.primary!= null));
        }
        {
            String theSecondary;
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
            String theLotType;
            theLotType = this.getLotType();
            strategy.appendField(locator, this, "lotType", buffer, theLotType, (this.lotType!= null));
        }
        {
            String thePrimary;
            thePrimary = this.getPrimary();
            strategy.appendField(locator, this, "primary", buffer, thePrimary, (this.primary!= null));
        }
        {
            String theSecondary;
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
