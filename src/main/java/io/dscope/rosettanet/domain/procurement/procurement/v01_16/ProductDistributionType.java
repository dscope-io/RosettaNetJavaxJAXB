
package io.dscope.rosettanet.domain.procurement.procurement.v01_16;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.dates.v01_01.DatePeriodType;
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
 * <p>Java class for ProductDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsAvailableToShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsWaiverRequiredToShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SafetyStockQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16}ProductQuantityRangeType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingAvailability" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.01}DatePeriodType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductDistributionType", propOrder = {
    "isAvailableToShip",
    "isWaiverRequiredToShip",
    "safetyStockQuantity",
    "shippingAvailability"
})
public class ProductDistributionType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "IsAvailableToShip")
    protected boolean isAvailableToShip;
    @XmlElement(name = "IsWaiverRequiredToShip")
    protected boolean isWaiverRequiredToShip;
    @XmlElement(name = "SafetyStockQuantity")
    protected ProductQuantityRangeType safetyStockQuantity;
    @XmlElement(name = "ShippingAvailability")
    protected DatePeriodType shippingAvailability;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isAvailableToShip property.
     * 
     */
    public boolean isIsAvailableToShip() {
        return isAvailableToShip;
    }

    /**
     * Sets the value of the isAvailableToShip property.
     * 
     */
    public void setIsAvailableToShip(boolean value) {
        this.isAvailableToShip = value;
    }

    /**
     * Gets the value of the isWaiverRequiredToShip property.
     * 
     */
    public boolean isIsWaiverRequiredToShip() {
        return isWaiverRequiredToShip;
    }

    /**
     * Sets the value of the isWaiverRequiredToShip property.
     * 
     */
    public void setIsWaiverRequiredToShip(boolean value) {
        this.isWaiverRequiredToShip = value;
    }

    /**
     * Gets the value of the safetyStockQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityRangeType }
     *     
     */
    public ProductQuantityRangeType getSafetyStockQuantity() {
        return safetyStockQuantity;
    }

    /**
     * Sets the value of the safetyStockQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityRangeType }
     *     
     */
    public void setSafetyStockQuantity(ProductQuantityRangeType value) {
        this.safetyStockQuantity = value;
    }

    /**
     * Gets the value of the shippingAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getShippingAvailability() {
        return shippingAvailability;
    }

    /**
     * Sets the value of the shippingAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setShippingAvailability(DatePeriodType value) {
        this.shippingAvailability = value;
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
        final ProductDistributionType that = ((ProductDistributionType) object);
        {
            boolean lhsIsAvailableToShip;
            lhsIsAvailableToShip = this.isIsAvailableToShip();
            boolean rhsIsAvailableToShip;
            rhsIsAvailableToShip = that.isIsAvailableToShip();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isAvailableToShip", lhsIsAvailableToShip), LocatorUtils.property(thatLocator, "isAvailableToShip", rhsIsAvailableToShip), lhsIsAvailableToShip, rhsIsAvailableToShip, true, true)) {
                return false;
            }
        }
        {
            boolean lhsIsWaiverRequiredToShip;
            lhsIsWaiverRequiredToShip = this.isIsWaiverRequiredToShip();
            boolean rhsIsWaiverRequiredToShip;
            rhsIsWaiverRequiredToShip = that.isIsWaiverRequiredToShip();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isWaiverRequiredToShip", lhsIsWaiverRequiredToShip), LocatorUtils.property(thatLocator, "isWaiverRequiredToShip", rhsIsWaiverRequiredToShip), lhsIsWaiverRequiredToShip, rhsIsWaiverRequiredToShip, true, true)) {
                return false;
            }
        }
        {
            ProductQuantityRangeType lhsSafetyStockQuantity;
            lhsSafetyStockQuantity = this.getSafetyStockQuantity();
            ProductQuantityRangeType rhsSafetyStockQuantity;
            rhsSafetyStockQuantity = that.getSafetyStockQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "safetyStockQuantity", lhsSafetyStockQuantity), LocatorUtils.property(thatLocator, "safetyStockQuantity", rhsSafetyStockQuantity), lhsSafetyStockQuantity, rhsSafetyStockQuantity, (this.safetyStockQuantity!= null), (that.safetyStockQuantity!= null))) {
                return false;
            }
        }
        {
            DatePeriodType lhsShippingAvailability;
            lhsShippingAvailability = this.getShippingAvailability();
            DatePeriodType rhsShippingAvailability;
            rhsShippingAvailability = that.getShippingAvailability();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingAvailability", lhsShippingAvailability), LocatorUtils.property(thatLocator, "shippingAvailability", rhsShippingAvailability), lhsShippingAvailability, rhsShippingAvailability, (this.shippingAvailability!= null), (that.shippingAvailability!= null))) {
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
            boolean theIsAvailableToShip;
            theIsAvailableToShip = this.isIsAvailableToShip();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isAvailableToShip", theIsAvailableToShip), currentHashCode, theIsAvailableToShip, true);
        }
        {
            boolean theIsWaiverRequiredToShip;
            theIsWaiverRequiredToShip = this.isIsWaiverRequiredToShip();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isWaiverRequiredToShip", theIsWaiverRequiredToShip), currentHashCode, theIsWaiverRequiredToShip, true);
        }
        {
            ProductQuantityRangeType theSafetyStockQuantity;
            theSafetyStockQuantity = this.getSafetyStockQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "safetyStockQuantity", theSafetyStockQuantity), currentHashCode, theSafetyStockQuantity, (this.safetyStockQuantity!= null));
        }
        {
            DatePeriodType theShippingAvailability;
            theShippingAvailability = this.getShippingAvailability();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingAvailability", theShippingAvailability), currentHashCode, theShippingAvailability, (this.shippingAvailability!= null));
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
            boolean theIsAvailableToShip;
            theIsAvailableToShip = this.isIsAvailableToShip();
            strategy.appendField(locator, this, "isAvailableToShip", buffer, theIsAvailableToShip, true);
        }
        {
            boolean theIsWaiverRequiredToShip;
            theIsWaiverRequiredToShip = this.isIsWaiverRequiredToShip();
            strategy.appendField(locator, this, "isWaiverRequiredToShip", buffer, theIsWaiverRequiredToShip, true);
        }
        {
            ProductQuantityRangeType theSafetyStockQuantity;
            theSafetyStockQuantity = this.getSafetyStockQuantity();
            strategy.appendField(locator, this, "safetyStockQuantity", buffer, theSafetyStockQuantity, (this.safetyStockQuantity!= null));
        }
        {
            DatePeriodType theShippingAvailability;
            theShippingAvailability = this.getShippingAvailability();
            strategy.appendField(locator, this, "shippingAvailability", buffer, theShippingAvailability, (this.shippingAvailability!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
