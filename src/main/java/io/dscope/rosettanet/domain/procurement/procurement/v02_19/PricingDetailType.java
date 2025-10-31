
package io.dscope.rosettanet.domain.procurement.procurement.v02_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
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
 * <p>Java class for PricingDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EffectiveDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="OrderSizeRounding" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="PreviousUnitPrice" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}PriceListType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ProductQuantityRange"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}PriceListType" minOccurs="0"/&gt;
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
@XmlType(name = "PricingDetailType", propOrder = {
    "effectiveDate",
    "orderSizeRounding",
    "previousUnitPrice",
    "productQuantityRange",
    "unitPrice"
})
public class PricingDetailType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "EffectiveDate")
    protected DatePeriodType effectiveDate;
    @XmlElement(name = "OrderSizeRounding")
    protected Float orderSizeRounding;
    @XmlElement(name = "PreviousUnitPrice")
    protected PriceListType previousUnitPrice;
    @XmlElementRef(name = "ProductQuantityRange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = ProductQuantityRange.class)
    protected ProductQuantityRange productQuantityRange;
    @XmlElement(name = "UnitPrice")
    protected PriceListType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveDate(DatePeriodType value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the orderSizeRounding property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOrderSizeRounding() {
        return orderSizeRounding;
    }

    /**
     * Sets the value of the orderSizeRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOrderSizeRounding(Float value) {
        this.orderSizeRounding = value;
    }

    /**
     * Gets the value of the previousUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceListType }
     *     
     */
    public PriceListType getPreviousUnitPrice() {
        return previousUnitPrice;
    }

    /**
     * Sets the value of the previousUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceListType }
     *     
     */
    public void setPreviousUnitPrice(PriceListType value) {
        this.previousUnitPrice = value;
    }

    /**
     * Gets the value of the productQuantityRange property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityRange }
     *     
     */
    public ProductQuantityRange getProductQuantityRange() {
        return productQuantityRange;
    }

    /**
     * Sets the value of the productQuantityRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityRange }
     *     
     */
    public void setProductQuantityRange(ProductQuantityRange value) {
        this.productQuantityRange = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceListType }
     *     
     */
    public PriceListType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceListType }
     *     
     */
    public void setUnitPrice(PriceListType value) {
        this.unitPrice = value;
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
        final PricingDetailType that = ((PricingDetailType) object);
        {
            DatePeriodType lhsEffectiveDate;
            lhsEffectiveDate = this.getEffectiveDate();
            DatePeriodType rhsEffectiveDate;
            rhsEffectiveDate = that.getEffectiveDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveDate", lhsEffectiveDate), LocatorUtils.property(thatLocator, "effectiveDate", rhsEffectiveDate), lhsEffectiveDate, rhsEffectiveDate, (this.effectiveDate!= null), (that.effectiveDate!= null))) {
                return false;
            }
        }
        {
            Float lhsOrderSizeRounding;
            lhsOrderSizeRounding = this.getOrderSizeRounding();
            Float rhsOrderSizeRounding;
            rhsOrderSizeRounding = that.getOrderSizeRounding();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderSizeRounding", lhsOrderSizeRounding), LocatorUtils.property(thatLocator, "orderSizeRounding", rhsOrderSizeRounding), lhsOrderSizeRounding, rhsOrderSizeRounding, (this.orderSizeRounding!= null), (that.orderSizeRounding!= null))) {
                return false;
            }
        }
        {
            PriceListType lhsPreviousUnitPrice;
            lhsPreviousUnitPrice = this.getPreviousUnitPrice();
            PriceListType rhsPreviousUnitPrice;
            rhsPreviousUnitPrice = that.getPreviousUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousUnitPrice", lhsPreviousUnitPrice), LocatorUtils.property(thatLocator, "previousUnitPrice", rhsPreviousUnitPrice), lhsPreviousUnitPrice, rhsPreviousUnitPrice, (this.previousUnitPrice!= null), (that.previousUnitPrice!= null))) {
                return false;
            }
        }
        {
            ProductQuantityRange lhsProductQuantityRange;
            lhsProductQuantityRange = this.getProductQuantityRange();
            ProductQuantityRange rhsProductQuantityRange;
            rhsProductQuantityRange = that.getProductQuantityRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productQuantityRange", lhsProductQuantityRange), LocatorUtils.property(thatLocator, "productQuantityRange", rhsProductQuantityRange), lhsProductQuantityRange, rhsProductQuantityRange, (this.productQuantityRange!= null), (that.productQuantityRange!= null))) {
                return false;
            }
        }
        {
            PriceListType lhsUnitPrice;
            lhsUnitPrice = this.getUnitPrice();
            PriceListType rhsUnitPrice;
            rhsUnitPrice = that.getUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitPrice", lhsUnitPrice), LocatorUtils.property(thatLocator, "unitPrice", rhsUnitPrice), lhsUnitPrice, rhsUnitPrice, (this.unitPrice!= null), (that.unitPrice!= null))) {
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
            DatePeriodType theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveDate", theEffectiveDate), currentHashCode, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            Float theOrderSizeRounding;
            theOrderSizeRounding = this.getOrderSizeRounding();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderSizeRounding", theOrderSizeRounding), currentHashCode, theOrderSizeRounding, (this.orderSizeRounding!= null));
        }
        {
            PriceListType thePreviousUnitPrice;
            thePreviousUnitPrice = this.getPreviousUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousUnitPrice", thePreviousUnitPrice), currentHashCode, thePreviousUnitPrice, (this.previousUnitPrice!= null));
        }
        {
            ProductQuantityRange theProductQuantityRange;
            theProductQuantityRange = this.getProductQuantityRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantityRange", theProductQuantityRange), currentHashCode, theProductQuantityRange, (this.productQuantityRange!= null));
        }
        {
            PriceListType theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitPrice", theUnitPrice), currentHashCode, theUnitPrice, (this.unitPrice!= null));
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
            DatePeriodType theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            strategy.appendField(locator, this, "effectiveDate", buffer, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            Float theOrderSizeRounding;
            theOrderSizeRounding = this.getOrderSizeRounding();
            strategy.appendField(locator, this, "orderSizeRounding", buffer, theOrderSizeRounding, (this.orderSizeRounding!= null));
        }
        {
            PriceListType thePreviousUnitPrice;
            thePreviousUnitPrice = this.getPreviousUnitPrice();
            strategy.appendField(locator, this, "previousUnitPrice", buffer, thePreviousUnitPrice, (this.previousUnitPrice!= null));
        }
        {
            ProductQuantityRange theProductQuantityRange;
            theProductQuantityRange = this.getProductQuantityRange();
            strategy.appendField(locator, this, "productQuantityRange", buffer, theProductQuantityRange, (this.productQuantityRange!= null));
        }
        {
            PriceListType theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            strategy.appendField(locator, this, "unitPrice", buffer, theUnitPrice, (this.unitPrice!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
