
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
import io.dscope.rosettanet.domain.procurement.codelist.notificationtype.v01_04.NotificationType;
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
 * <p>Java class for OrderStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:NotificationType:xsd:codelist:01.04}NotificationType"/&gt;
 *         &lt;element name="PurchaseOrder" type="{urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01}PurchaseOrderType"/&gt;
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
@XmlType(name = "OrderStatusType", propOrder = {
    "notificationType",
    "purchaseOrder"
})
public class OrderStatusType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "NotificationType", namespace = "urn:rosettanet:specification:domain:Procurement:NotificationType:xsd:codelist:01.04", type = NotificationType.class)
    protected NotificationType notificationType;
    @XmlElement(name = "PurchaseOrder", required = true)
    protected PurchaseOrderType purchaseOrder;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType }
     *     
     */
    public NotificationType getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType }
     *     
     */
    public void setNotificationType(NotificationType value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderType }
     *     
     */
    public PurchaseOrderType getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Sets the value of the purchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderType }
     *     
     */
    public void setPurchaseOrder(PurchaseOrderType value) {
        this.purchaseOrder = value;
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
        final OrderStatusType that = ((OrderStatusType) object);
        {
            NotificationType lhsNotificationType;
            lhsNotificationType = this.getNotificationType();
            NotificationType rhsNotificationType;
            rhsNotificationType = that.getNotificationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notificationType", lhsNotificationType), LocatorUtils.property(thatLocator, "notificationType", rhsNotificationType), lhsNotificationType, rhsNotificationType, (this.notificationType!= null), (that.notificationType!= null))) {
                return false;
            }
        }
        {
            PurchaseOrderType lhsPurchaseOrder;
            lhsPurchaseOrder = this.getPurchaseOrder();
            PurchaseOrderType rhsPurchaseOrder;
            rhsPurchaseOrder = that.getPurchaseOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrder", lhsPurchaseOrder), LocatorUtils.property(thatLocator, "purchaseOrder", rhsPurchaseOrder), lhsPurchaseOrder, rhsPurchaseOrder, (this.purchaseOrder!= null), (that.purchaseOrder!= null))) {
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
            NotificationType theNotificationType;
            theNotificationType = this.getNotificationType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notificationType", theNotificationType), currentHashCode, theNotificationType, (this.notificationType!= null));
        }
        {
            PurchaseOrderType thePurchaseOrder;
            thePurchaseOrder = this.getPurchaseOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrder", thePurchaseOrder), currentHashCode, thePurchaseOrder, (this.purchaseOrder!= null));
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
            NotificationType theNotificationType;
            theNotificationType = this.getNotificationType();
            strategy.appendField(locator, this, "notificationType", buffer, theNotificationType, (this.notificationType!= null));
        }
        {
            PurchaseOrderType thePurchaseOrder;
            thePurchaseOrder = this.getPurchaseOrder();
            strategy.appendField(locator, this, "purchaseOrder", buffer, thePurchaseOrder, (this.purchaseOrder!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
