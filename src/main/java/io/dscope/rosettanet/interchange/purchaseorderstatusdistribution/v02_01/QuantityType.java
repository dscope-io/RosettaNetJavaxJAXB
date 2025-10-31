
package io.dscope.rosettanet.interchange.purchaseorderstatusdistribution.v02_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.ordertype.v01_03.OrderType;
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
 * <p>Java class for QuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderStatusQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:OrderType:xsd:codelist:01.03}OrderType"/&gt;
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
@XmlType(name = "QuantityType", propOrder = {
    "orderStatusQuantity",
    "orderType"
})
public class QuantityType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "OrderStatusQuantity")
    protected float orderStatusQuantity;
    @XmlElementRef(name = "OrderType", namespace = "urn:rosettanet:specification:domain:Procurement:OrderType:xsd:codelist:01.03", type = OrderType.class)
    protected OrderType orderType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the orderStatusQuantity property.
     * 
     */
    public float getOrderStatusQuantity() {
        return orderStatusQuantity;
    }

    /**
     * Sets the value of the orderStatusQuantity property.
     * 
     */
    public void setOrderStatusQuantity(float value) {
        this.orderStatusQuantity = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrderType(OrderType value) {
        this.orderType = value;
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
        final QuantityType that = ((QuantityType) object);
        {
            float lhsOrderStatusQuantity;
            lhsOrderStatusQuantity = this.getOrderStatusQuantity();
            float rhsOrderStatusQuantity;
            rhsOrderStatusQuantity = that.getOrderStatusQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderStatusQuantity", lhsOrderStatusQuantity), LocatorUtils.property(thatLocator, "orderStatusQuantity", rhsOrderStatusQuantity), lhsOrderStatusQuantity, rhsOrderStatusQuantity, true, true)) {
                return false;
            }
        }
        {
            OrderType lhsOrderType;
            lhsOrderType = this.getOrderType();
            OrderType rhsOrderType;
            rhsOrderType = that.getOrderType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderType", lhsOrderType), LocatorUtils.property(thatLocator, "orderType", rhsOrderType), lhsOrderType, rhsOrderType, (this.orderType!= null), (that.orderType!= null))) {
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
            float theOrderStatusQuantity;
            theOrderStatusQuantity = this.getOrderStatusQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderStatusQuantity", theOrderStatusQuantity), currentHashCode, theOrderStatusQuantity, true);
        }
        {
            OrderType theOrderType;
            theOrderType = this.getOrderType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderType", theOrderType), currentHashCode, theOrderType, (this.orderType!= null));
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
            float theOrderStatusQuantity;
            theOrderStatusQuantity = this.getOrderStatusQuantity();
            strategy.appendField(locator, this, "orderStatusQuantity", buffer, theOrderStatusQuantity, true);
        }
        {
            OrderType theOrderType;
            theOrderType = this.getOrderType();
            strategy.appendField(locator, this, "orderType", buffer, theOrderType, (this.orderType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
