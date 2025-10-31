
package io.dscope.rosettanet.interchange.shippingorderconfirmation.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.shippingorderrejectreason.v01_01.ShippingOrderRejectReason;
import io.dscope.rosettanet.domain.logistics.codelist.shippingorderstatus.v01_01.ShippingOrderStatus;
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
 * <p>Java class for OrderConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShippingOrderRejectReason:xsd:codelist:01.01}ShippingOrderRejectReason" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShippingOrderStatus:xsd:codelist:01.01}ShippingOrderStatus"/&gt;
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
@XmlType(name = "OrderConfirmationType", propOrder = {
    "shippingOrderRejectReason",
    "shippingOrderStatus"
})
public class OrderConfirmationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ShippingOrderRejectReason", namespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderRejectReason:xsd:codelist:01.01", type = ShippingOrderRejectReason.class, required = false)
    protected ShippingOrderRejectReason shippingOrderRejectReason;
    @XmlElementRef(name = "ShippingOrderStatus", namespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderStatus:xsd:codelist:01.01", type = ShippingOrderStatus.class)
    protected ShippingOrderStatus shippingOrderStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the shippingOrderRejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOrderRejectReason }
     *     
     */
    public ShippingOrderRejectReason getShippingOrderRejectReason() {
        return shippingOrderRejectReason;
    }

    /**
     * Sets the value of the shippingOrderRejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOrderRejectReason }
     *     
     */
    public void setShippingOrderRejectReason(ShippingOrderRejectReason value) {
        this.shippingOrderRejectReason = value;
    }

    /**
     * Gets the value of the shippingOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOrderStatus }
     *     
     */
    public ShippingOrderStatus getShippingOrderStatus() {
        return shippingOrderStatus;
    }

    /**
     * Sets the value of the shippingOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOrderStatus }
     *     
     */
    public void setShippingOrderStatus(ShippingOrderStatus value) {
        this.shippingOrderStatus = value;
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
        final OrderConfirmationType that = ((OrderConfirmationType) object);
        {
            ShippingOrderRejectReason lhsShippingOrderRejectReason;
            lhsShippingOrderRejectReason = this.getShippingOrderRejectReason();
            ShippingOrderRejectReason rhsShippingOrderRejectReason;
            rhsShippingOrderRejectReason = that.getShippingOrderRejectReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingOrderRejectReason", lhsShippingOrderRejectReason), LocatorUtils.property(thatLocator, "shippingOrderRejectReason", rhsShippingOrderRejectReason), lhsShippingOrderRejectReason, rhsShippingOrderRejectReason, (this.shippingOrderRejectReason!= null), (that.shippingOrderRejectReason!= null))) {
                return false;
            }
        }
        {
            ShippingOrderStatus lhsShippingOrderStatus;
            lhsShippingOrderStatus = this.getShippingOrderStatus();
            ShippingOrderStatus rhsShippingOrderStatus;
            rhsShippingOrderStatus = that.getShippingOrderStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingOrderStatus", lhsShippingOrderStatus), LocatorUtils.property(thatLocator, "shippingOrderStatus", rhsShippingOrderStatus), lhsShippingOrderStatus, rhsShippingOrderStatus, (this.shippingOrderStatus!= null), (that.shippingOrderStatus!= null))) {
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
            ShippingOrderRejectReason theShippingOrderRejectReason;
            theShippingOrderRejectReason = this.getShippingOrderRejectReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingOrderRejectReason", theShippingOrderRejectReason), currentHashCode, theShippingOrderRejectReason, (this.shippingOrderRejectReason!= null));
        }
        {
            ShippingOrderStatus theShippingOrderStatus;
            theShippingOrderStatus = this.getShippingOrderStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingOrderStatus", theShippingOrderStatus), currentHashCode, theShippingOrderStatus, (this.shippingOrderStatus!= null));
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
            ShippingOrderRejectReason theShippingOrderRejectReason;
            theShippingOrderRejectReason = this.getShippingOrderRejectReason();
            strategy.appendField(locator, this, "shippingOrderRejectReason", buffer, theShippingOrderRejectReason, (this.shippingOrderRejectReason!= null));
        }
        {
            ShippingOrderStatus theShippingOrderStatus;
            theShippingOrderStatus = this.getShippingOrderStatus();
            strategy.appendField(locator, this, "shippingOrderStatus", buffer, theShippingOrderStatus, (this.shippingOrderStatus!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
