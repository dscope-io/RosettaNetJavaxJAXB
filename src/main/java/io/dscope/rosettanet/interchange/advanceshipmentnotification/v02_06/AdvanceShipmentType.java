
package io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for AdvanceShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvanceShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PurchasedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="ShipFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="Shipment" type="{urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.06}ShipmentType"/&gt;
 *         &lt;element name="SoldBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
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
@XmlType(name = "AdvanceShipmentType", propOrder = {
    "purchasedBy",
    "shipFrom",
    "shipment",
    "soldBy"
})
public class AdvanceShipmentType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "PurchasedBy", required = true)
    protected SpecifiedPartnerDescriptionType purchasedBy;
    @XmlElement(name = "ShipFrom", required = true)
    protected SpecifiedPartnerDescriptionType shipFrom;
    @XmlElement(name = "Shipment", required = true)
    protected ShipmentType shipment;
    @XmlElement(name = "SoldBy", required = true)
    protected SpecifiedPartnerDescriptionType soldBy;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the purchasedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getPurchasedBy() {
        return purchasedBy;
    }

    /**
     * Sets the value of the purchasedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setPurchasedBy(SpecifiedPartnerDescriptionType value) {
        this.purchasedBy = value;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipFrom(SpecifiedPartnerDescriptionType value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentType }
     *     
     */
    public ShipmentType getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentType }
     *     
     */
    public void setShipment(ShipmentType value) {
        this.shipment = value;
    }

    /**
     * Gets the value of the soldBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getSoldBy() {
        return soldBy;
    }

    /**
     * Sets the value of the soldBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setSoldBy(SpecifiedPartnerDescriptionType value) {
        this.soldBy = value;
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
        final AdvanceShipmentType that = ((AdvanceShipmentType) object);
        {
            SpecifiedPartnerDescriptionType lhsPurchasedBy;
            lhsPurchasedBy = this.getPurchasedBy();
            SpecifiedPartnerDescriptionType rhsPurchasedBy;
            rhsPurchasedBy = that.getPurchasedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchasedBy", lhsPurchasedBy), LocatorUtils.property(thatLocator, "purchasedBy", rhsPurchasedBy), lhsPurchasedBy, rhsPurchasedBy, (this.purchasedBy!= null), (that.purchasedBy!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsShipFrom;
            lhsShipFrom = this.getShipFrom();
            SpecifiedPartnerDescriptionType rhsShipFrom;
            rhsShipFrom = that.getShipFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipFrom", lhsShipFrom), LocatorUtils.property(thatLocator, "shipFrom", rhsShipFrom), lhsShipFrom, rhsShipFrom, (this.shipFrom!= null), (that.shipFrom!= null))) {
                return false;
            }
        }
        {
            ShipmentType lhsShipment;
            lhsShipment = this.getShipment();
            ShipmentType rhsShipment;
            rhsShipment = that.getShipment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipment", lhsShipment), LocatorUtils.property(thatLocator, "shipment", rhsShipment), lhsShipment, rhsShipment, (this.shipment!= null), (that.shipment!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsSoldBy;
            lhsSoldBy = this.getSoldBy();
            SpecifiedPartnerDescriptionType rhsSoldBy;
            rhsSoldBy = that.getSoldBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "soldBy", lhsSoldBy), LocatorUtils.property(thatLocator, "soldBy", rhsSoldBy), lhsSoldBy, rhsSoldBy, (this.soldBy!= null), (that.soldBy!= null))) {
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
            SpecifiedPartnerDescriptionType thePurchasedBy;
            thePurchasedBy = this.getPurchasedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchasedBy", thePurchasedBy), currentHashCode, thePurchasedBy, (this.purchasedBy!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipFrom;
            theShipFrom = this.getShipFrom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipFrom", theShipFrom), currentHashCode, theShipFrom, (this.shipFrom!= null));
        }
        {
            ShipmentType theShipment;
            theShipment = this.getShipment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipment", theShipment), currentHashCode, theShipment, (this.shipment!= null));
        }
        {
            SpecifiedPartnerDescriptionType theSoldBy;
            theSoldBy = this.getSoldBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "soldBy", theSoldBy), currentHashCode, theSoldBy, (this.soldBy!= null));
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
            SpecifiedPartnerDescriptionType thePurchasedBy;
            thePurchasedBy = this.getPurchasedBy();
            strategy.appendField(locator, this, "purchasedBy", buffer, thePurchasedBy, (this.purchasedBy!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipFrom;
            theShipFrom = this.getShipFrom();
            strategy.appendField(locator, this, "shipFrom", buffer, theShipFrom, (this.shipFrom!= null));
        }
        {
            ShipmentType theShipment;
            theShipment = this.getShipment();
            strategy.appendField(locator, this, "shipment", buffer, theShipment, (this.shipment!= null));
        }
        {
            SpecifiedPartnerDescriptionType theSoldBy;
            theSoldBy = this.getSoldBy();
            strategy.appendField(locator, this, "soldBy", buffer, theSoldBy, (this.soldBy!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
