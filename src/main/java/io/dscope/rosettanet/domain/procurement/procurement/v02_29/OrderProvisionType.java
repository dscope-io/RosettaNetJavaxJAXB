
package io.dscope.rosettanet.domain.procurement.procurement.v02_29;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for OrderProvisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProvisionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ProductAvailabilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ProductQuantityRangeType"/&gt;
 *         &lt;element name="OrderSizeRounding" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ProductLeadTime" minOccurs="0"/&gt;
 *         &lt;element name="SampleAvailability" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderProvisionType", propOrder = {
    "orderQuantity",
    "orderSizeRounding",
    "productLeadTime",
    "sampleAvailability"
})
public class OrderProvisionType
    extends ProductAvailabilityType
    implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "OrderQuantity", required = true)
    protected ProductQuantityRangeType orderQuantity;
    @XmlElement(name = "OrderSizeRounding")
    protected Float orderSizeRounding;
    @XmlElementRef(name = "ProductLeadTime", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = ProductLeadTime.class, required = false)
    protected ProductLeadTime productLeadTime;
    @XmlElement(name = "SampleAvailability", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sampleAvailability;

    /**
     * Gets the value of the orderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityRangeType }
     *     
     */
    public ProductQuantityRangeType getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Sets the value of the orderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityRangeType }
     *     
     */
    public void setOrderQuantity(ProductQuantityRangeType value) {
        this.orderQuantity = value;
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
     * Gets the value of the productLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLeadTime }
     *     
     */
    public ProductLeadTime getProductLeadTime() {
        return productLeadTime;
    }

    /**
     * Sets the value of the productLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLeadTime }
     *     
     */
    public void setProductLeadTime(ProductLeadTime value) {
        this.productLeadTime = value;
    }

    /**
     * Gets the value of the sampleAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSampleAvailability() {
        return sampleAvailability;
    }

    /**
     * Sets the value of the sampleAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSampleAvailability(XMLGregorianCalendar value) {
        this.sampleAvailability = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OrderProvisionType that = ((OrderProvisionType) object);
        {
            ProductQuantityRangeType lhsOrderQuantity;
            lhsOrderQuantity = this.getOrderQuantity();
            ProductQuantityRangeType rhsOrderQuantity;
            rhsOrderQuantity = that.getOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderQuantity", lhsOrderQuantity), LocatorUtils.property(thatLocator, "orderQuantity", rhsOrderQuantity), lhsOrderQuantity, rhsOrderQuantity, (this.orderQuantity!= null), (that.orderQuantity!= null))) {
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
            ProductLeadTime lhsProductLeadTime;
            lhsProductLeadTime = this.getProductLeadTime();
            ProductLeadTime rhsProductLeadTime;
            rhsProductLeadTime = that.getProductLeadTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productLeadTime", lhsProductLeadTime), LocatorUtils.property(thatLocator, "productLeadTime", rhsProductLeadTime), lhsProductLeadTime, rhsProductLeadTime, (this.productLeadTime!= null), (that.productLeadTime!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsSampleAvailability;
            lhsSampleAvailability = this.getSampleAvailability();
            XMLGregorianCalendar rhsSampleAvailability;
            rhsSampleAvailability = that.getSampleAvailability();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sampleAvailability", lhsSampleAvailability), LocatorUtils.property(thatLocator, "sampleAvailability", rhsSampleAvailability), lhsSampleAvailability, rhsSampleAvailability, (this.sampleAvailability!= null), (that.sampleAvailability!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ProductQuantityRangeType theOrderQuantity;
            theOrderQuantity = this.getOrderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderQuantity", theOrderQuantity), currentHashCode, theOrderQuantity, (this.orderQuantity!= null));
        }
        {
            Float theOrderSizeRounding;
            theOrderSizeRounding = this.getOrderSizeRounding();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderSizeRounding", theOrderSizeRounding), currentHashCode, theOrderSizeRounding, (this.orderSizeRounding!= null));
        }
        {
            ProductLeadTime theProductLeadTime;
            theProductLeadTime = this.getProductLeadTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLeadTime", theProductLeadTime), currentHashCode, theProductLeadTime, (this.productLeadTime!= null));
        }
        {
            XMLGregorianCalendar theSampleAvailability;
            theSampleAvailability = this.getSampleAvailability();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sampleAvailability", theSampleAvailability), currentHashCode, theSampleAvailability, (this.sampleAvailability!= null));
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
        super.appendFields(locator, buffer, strategy);
        {
            ProductQuantityRangeType theOrderQuantity;
            theOrderQuantity = this.getOrderQuantity();
            strategy.appendField(locator, this, "orderQuantity", buffer, theOrderQuantity, (this.orderQuantity!= null));
        }
        {
            Float theOrderSizeRounding;
            theOrderSizeRounding = this.getOrderSizeRounding();
            strategy.appendField(locator, this, "orderSizeRounding", buffer, theOrderSizeRounding, (this.orderSizeRounding!= null));
        }
        {
            ProductLeadTime theProductLeadTime;
            theProductLeadTime = this.getProductLeadTime();
            strategy.appendField(locator, this, "productLeadTime", buffer, theProductLeadTime, (this.productLeadTime!= null));
        }
        {
            XMLGregorianCalendar theSampleAvailability;
            theSampleAvailability = this.getSampleAvailability();
            strategy.appendField(locator, this, "sampleAvailability", buffer, theSampleAvailability, (this.sampleAvailability!= null));
        }
        return buffer;
    }

}
