
package io.dscope.rosettanet.domain.procurement.procurement.v02_30;

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
 * <p>Java class for OrderQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RemainingQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RequestedQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ScheduledShipQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="TotalReceivedQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
@XmlType(name = "OrderQuantityType", propOrder = {
    "remainingQuantity",
    "requestedQuantity",
    "scheduledShipQuantity",
    "totalReceivedQuantity"
})
public class OrderQuantityType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "RemainingQuantity")
    protected Float remainingQuantity;
    @XmlElement(name = "RequestedQuantity")
    protected float requestedQuantity;
    @XmlElement(name = "ScheduledShipQuantity")
    protected Float scheduledShipQuantity;
    @XmlElement(name = "TotalReceivedQuantity")
    protected Float totalReceivedQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the remainingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRemainingQuantity() {
        return remainingQuantity;
    }

    /**
     * Sets the value of the remainingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRemainingQuantity(Float value) {
        this.remainingQuantity = value;
    }

    /**
     * Gets the value of the requestedQuantity property.
     * 
     */
    public float getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Sets the value of the requestedQuantity property.
     * 
     */
    public void setRequestedQuantity(float value) {
        this.requestedQuantity = value;
    }

    /**
     * Gets the value of the scheduledShipQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getScheduledShipQuantity() {
        return scheduledShipQuantity;
    }

    /**
     * Sets the value of the scheduledShipQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setScheduledShipQuantity(Float value) {
        this.scheduledShipQuantity = value;
    }

    /**
     * Gets the value of the totalReceivedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalReceivedQuantity() {
        return totalReceivedQuantity;
    }

    /**
     * Sets the value of the totalReceivedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalReceivedQuantity(Float value) {
        this.totalReceivedQuantity = value;
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
        final OrderQuantityType that = ((OrderQuantityType) object);
        {
            Float lhsRemainingQuantity;
            lhsRemainingQuantity = this.getRemainingQuantity();
            Float rhsRemainingQuantity;
            rhsRemainingQuantity = that.getRemainingQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remainingQuantity", lhsRemainingQuantity), LocatorUtils.property(thatLocator, "remainingQuantity", rhsRemainingQuantity), lhsRemainingQuantity, rhsRemainingQuantity, (this.remainingQuantity!= null), (that.remainingQuantity!= null))) {
                return false;
            }
        }
        {
            float lhsRequestedQuantity;
            lhsRequestedQuantity = this.getRequestedQuantity();
            float rhsRequestedQuantity;
            rhsRequestedQuantity = that.getRequestedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedQuantity", lhsRequestedQuantity), LocatorUtils.property(thatLocator, "requestedQuantity", rhsRequestedQuantity), lhsRequestedQuantity, rhsRequestedQuantity, true, true)) {
                return false;
            }
        }
        {
            Float lhsScheduledShipQuantity;
            lhsScheduledShipQuantity = this.getScheduledShipQuantity();
            Float rhsScheduledShipQuantity;
            rhsScheduledShipQuantity = that.getScheduledShipQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledShipQuantity", lhsScheduledShipQuantity), LocatorUtils.property(thatLocator, "scheduledShipQuantity", rhsScheduledShipQuantity), lhsScheduledShipQuantity, rhsScheduledShipQuantity, (this.scheduledShipQuantity!= null), (that.scheduledShipQuantity!= null))) {
                return false;
            }
        }
        {
            Float lhsTotalReceivedQuantity;
            lhsTotalReceivedQuantity = this.getTotalReceivedQuantity();
            Float rhsTotalReceivedQuantity;
            rhsTotalReceivedQuantity = that.getTotalReceivedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalReceivedQuantity", lhsTotalReceivedQuantity), LocatorUtils.property(thatLocator, "totalReceivedQuantity", rhsTotalReceivedQuantity), lhsTotalReceivedQuantity, rhsTotalReceivedQuantity, (this.totalReceivedQuantity!= null), (that.totalReceivedQuantity!= null))) {
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
            Float theRemainingQuantity;
            theRemainingQuantity = this.getRemainingQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remainingQuantity", theRemainingQuantity), currentHashCode, theRemainingQuantity, (this.remainingQuantity!= null));
        }
        {
            float theRequestedQuantity;
            theRequestedQuantity = this.getRequestedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedQuantity", theRequestedQuantity), currentHashCode, theRequestedQuantity, true);
        }
        {
            Float theScheduledShipQuantity;
            theScheduledShipQuantity = this.getScheduledShipQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledShipQuantity", theScheduledShipQuantity), currentHashCode, theScheduledShipQuantity, (this.scheduledShipQuantity!= null));
        }
        {
            Float theTotalReceivedQuantity;
            theTotalReceivedQuantity = this.getTotalReceivedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalReceivedQuantity", theTotalReceivedQuantity), currentHashCode, theTotalReceivedQuantity, (this.totalReceivedQuantity!= null));
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
            Float theRemainingQuantity;
            theRemainingQuantity = this.getRemainingQuantity();
            strategy.appendField(locator, this, "remainingQuantity", buffer, theRemainingQuantity, (this.remainingQuantity!= null));
        }
        {
            float theRequestedQuantity;
            theRequestedQuantity = this.getRequestedQuantity();
            strategy.appendField(locator, this, "requestedQuantity", buffer, theRequestedQuantity, true);
        }
        {
            Float theScheduledShipQuantity;
            theScheduledShipQuantity = this.getScheduledShipQuantity();
            strategy.appendField(locator, this, "scheduledShipQuantity", buffer, theScheduledShipQuantity, (this.scheduledShipQuantity!= null));
        }
        {
            Float theTotalReceivedQuantity;
            theTotalReceivedQuantity = this.getTotalReceivedQuantity();
            strategy.appendField(locator, this, "totalReceivedQuantity", buffer, theTotalReceivedQuantity, (this.totalReceivedQuantity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
