
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for LeadTimeQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeadTimeQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderSizeRoundingQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}ProductQuantityRange"/&gt;
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
@XmlType(name = "LeadTimeQuantityType", propOrder = {
    "orderSizeRoundingQuantity",
    "productQuantityRange"
})
public class LeadTimeQuantityType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "OrderSizeRoundingQuantity")
    protected Float orderSizeRoundingQuantity;
    @XmlElementRef(name = "ProductQuantityRange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = ProductQuantityRange.class)
    protected ProductQuantityRange productQuantityRange;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the orderSizeRoundingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOrderSizeRoundingQuantity() {
        return orderSizeRoundingQuantity;
    }

    /**
     * Sets the value of the orderSizeRoundingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOrderSizeRoundingQuantity(Float value) {
        this.orderSizeRoundingQuantity = value;
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
        final LeadTimeQuantityType that = ((LeadTimeQuantityType) object);
        {
            Float lhsOrderSizeRoundingQuantity;
            lhsOrderSizeRoundingQuantity = this.getOrderSizeRoundingQuantity();
            Float rhsOrderSizeRoundingQuantity;
            rhsOrderSizeRoundingQuantity = that.getOrderSizeRoundingQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderSizeRoundingQuantity", lhsOrderSizeRoundingQuantity), LocatorUtils.property(thatLocator, "orderSizeRoundingQuantity", rhsOrderSizeRoundingQuantity), lhsOrderSizeRoundingQuantity, rhsOrderSizeRoundingQuantity, (this.orderSizeRoundingQuantity!= null), (that.orderSizeRoundingQuantity!= null))) {
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
            Float theOrderSizeRoundingQuantity;
            theOrderSizeRoundingQuantity = this.getOrderSizeRoundingQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderSizeRoundingQuantity", theOrderSizeRoundingQuantity), currentHashCode, theOrderSizeRoundingQuantity, (this.orderSizeRoundingQuantity!= null));
        }
        {
            ProductQuantityRange theProductQuantityRange;
            theProductQuantityRange = this.getProductQuantityRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantityRange", theProductQuantityRange), currentHashCode, theProductQuantityRange, (this.productQuantityRange!= null));
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
            Float theOrderSizeRoundingQuantity;
            theOrderSizeRoundingQuantity = this.getOrderSizeRoundingQuantity();
            strategy.appendField(locator, this, "orderSizeRoundingQuantity", buffer, theOrderSizeRoundingQuantity, (this.orderSizeRoundingQuantity!= null));
        }
        {
            ProductQuantityRange theProductQuantityRange;
            theProductQuantityRange = this.getProductQuantityRange();
            strategy.appendField(locator, this, "productQuantityRange", buffer, theProductQuantityRange, (this.productQuantityRange!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
