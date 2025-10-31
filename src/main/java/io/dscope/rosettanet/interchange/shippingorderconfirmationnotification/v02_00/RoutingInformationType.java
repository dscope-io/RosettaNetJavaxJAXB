
package io.dscope.rosettanet.interchange.shippingorderconfirmationnotification.v02_00;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_05.ShipmentMode;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.FreightPaymentInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.TrackingReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.SpecialHandlingInstruction;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_12.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for RoutingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryPriorityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreightEquipmentNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}FreightPaymentInformation" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05}ShipmentMode"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel" minOccurs="0"/&gt;
 *         &lt;element name="ShipVia" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}SpecialHandlingInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}TrackingReference" minOccurs="0"/&gt;
 *         &lt;element name="TransportedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType"/&gt;
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
@XmlType(name = "RoutingInformationType", propOrder = {
    "deliveryPriorityIdentifier",
    "freightEquipmentNumber",
    "freightPaymentInformation",
    "sequenceNumber",
    "shipmentMode",
    "shippingServiceLevel",
    "shipVia",
    "specialHandlingInstruction",
    "trackingReference",
    "transportedBy"
})
public class RoutingInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DeliveryPriorityIdentifier")
    protected String deliveryPriorityIdentifier;
    @XmlElement(name = "FreightEquipmentNumber")
    protected BusinessDocumentReferenceType freightEquipmentNumber;
    @XmlElementRef(name = "FreightPaymentInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = FreightPaymentInformation.class, required = false)
    protected FreightPaymentInformation freightPaymentInformation;
    @XmlElement(name = "SequenceNumber", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlElementRef(name = "ShipmentMode", namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05", type = ShipmentMode.class)
    protected ShipmentMode shipmentMode;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class, required = false)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElement(name = "ShipVia")
    protected SpecifiedPartnerDescriptionType shipVia;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = SpecialHandlingInstruction.class, required = false)
    protected SpecialHandlingInstruction specialHandlingInstruction;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = TrackingReference.class, required = false)
    protected TrackingReference trackingReference;
    @XmlElement(name = "TransportedBy", required = true)
    protected SpecifiedPartnerDescriptionType transportedBy;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the deliveryPriorityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPriorityIdentifier() {
        return deliveryPriorityIdentifier;
    }

    /**
     * Sets the value of the deliveryPriorityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPriorityIdentifier(String value) {
        this.deliveryPriorityIdentifier = value;
    }

    /**
     * Gets the value of the freightEquipmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getFreightEquipmentNumber() {
        return freightEquipmentNumber;
    }

    /**
     * Sets the value of the freightEquipmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setFreightEquipmentNumber(BusinessDocumentReferenceType value) {
        this.freightEquipmentNumber = value;
    }

    /**
     * Gets the value of the freightPaymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FreightPaymentInformation }
     *     
     */
    public FreightPaymentInformation getFreightPaymentInformation() {
        return freightPaymentInformation;
    }

    /**
     * Sets the value of the freightPaymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightPaymentInformation }
     *     
     */
    public void setFreightPaymentInformation(FreightPaymentInformation value) {
        this.freightPaymentInformation = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the shipmentMode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentMode }
     *     
     */
    public ShipmentMode getShipmentMode() {
        return shipmentMode;
    }

    /**
     * Sets the value of the shipmentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentMode }
     *     
     */
    public void setShipmentMode(ShipmentMode value) {
        this.shipmentMode = value;
    }

    /**
     * Gets the value of the shippingServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public ShippingServiceLevel getShippingServiceLevel() {
        return shippingServiceLevel;
    }

    /**
     * Sets the value of the shippingServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public void setShippingServiceLevel(ShippingServiceLevel value) {
        this.shippingServiceLevel = value;
    }

    /**
     * Gets the value of the shipVia property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipVia() {
        return shipVia;
    }

    /**
     * Sets the value of the shipVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipVia(SpecifiedPartnerDescriptionType value) {
        this.shipVia = value;
    }

    /**
     * Gets the value of the specialHandlingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialHandlingInstruction }
     *     
     */
    public SpecialHandlingInstruction getSpecialHandlingInstruction() {
        return specialHandlingInstruction;
    }

    /**
     * Sets the value of the specialHandlingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialHandlingInstruction }
     *     
     */
    public void setSpecialHandlingInstruction(SpecialHandlingInstruction value) {
        this.specialHandlingInstruction = value;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingReference }
     *     
     */
    public TrackingReference getTrackingReference() {
        return trackingReference;
    }

    /**
     * Sets the value of the trackingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingReference }
     *     
     */
    public void setTrackingReference(TrackingReference value) {
        this.trackingReference = value;
    }

    /**
     * Gets the value of the transportedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getTransportedBy() {
        return transportedBy;
    }

    /**
     * Sets the value of the transportedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setTransportedBy(SpecifiedPartnerDescriptionType value) {
        this.transportedBy = value;
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
        final RoutingInformationType that = ((RoutingInformationType) object);
        {
            String lhsDeliveryPriorityIdentifier;
            lhsDeliveryPriorityIdentifier = this.getDeliveryPriorityIdentifier();
            String rhsDeliveryPriorityIdentifier;
            rhsDeliveryPriorityIdentifier = that.getDeliveryPriorityIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryPriorityIdentifier", lhsDeliveryPriorityIdentifier), LocatorUtils.property(thatLocator, "deliveryPriorityIdentifier", rhsDeliveryPriorityIdentifier), lhsDeliveryPriorityIdentifier, rhsDeliveryPriorityIdentifier, (this.deliveryPriorityIdentifier!= null), (that.deliveryPriorityIdentifier!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsFreightEquipmentNumber;
            lhsFreightEquipmentNumber = this.getFreightEquipmentNumber();
            BusinessDocumentReferenceType rhsFreightEquipmentNumber;
            rhsFreightEquipmentNumber = that.getFreightEquipmentNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightEquipmentNumber", lhsFreightEquipmentNumber), LocatorUtils.property(thatLocator, "freightEquipmentNumber", rhsFreightEquipmentNumber), lhsFreightEquipmentNumber, rhsFreightEquipmentNumber, (this.freightEquipmentNumber!= null), (that.freightEquipmentNumber!= null))) {
                return false;
            }
        }
        {
            FreightPaymentInformation lhsFreightPaymentInformation;
            lhsFreightPaymentInformation = this.getFreightPaymentInformation();
            FreightPaymentInformation rhsFreightPaymentInformation;
            rhsFreightPaymentInformation = that.getFreightPaymentInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightPaymentInformation", lhsFreightPaymentInformation), LocatorUtils.property(thatLocator, "freightPaymentInformation", rhsFreightPaymentInformation), lhsFreightPaymentInformation, rhsFreightPaymentInformation, (this.freightPaymentInformation!= null), (that.freightPaymentInformation!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsSequenceNumber;
            lhsSequenceNumber = this.getSequenceNumber();
            BigInteger rhsSequenceNumber;
            rhsSequenceNumber = that.getSequenceNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNumber", lhsSequenceNumber), LocatorUtils.property(thatLocator, "sequenceNumber", rhsSequenceNumber), lhsSequenceNumber, rhsSequenceNumber, (this.sequenceNumber!= null), (that.sequenceNumber!= null))) {
                return false;
            }
        }
        {
            ShipmentMode lhsShipmentMode;
            lhsShipmentMode = this.getShipmentMode();
            ShipmentMode rhsShipmentMode;
            rhsShipmentMode = that.getShipmentMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentMode", lhsShipmentMode), LocatorUtils.property(thatLocator, "shipmentMode", rhsShipmentMode), lhsShipmentMode, rhsShipmentMode, (this.shipmentMode!= null), (that.shipmentMode!= null))) {
                return false;
            }
        }
        {
            ShippingServiceLevel lhsShippingServiceLevel;
            lhsShippingServiceLevel = this.getShippingServiceLevel();
            ShippingServiceLevel rhsShippingServiceLevel;
            rhsShippingServiceLevel = that.getShippingServiceLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingServiceLevel", lhsShippingServiceLevel), LocatorUtils.property(thatLocator, "shippingServiceLevel", rhsShippingServiceLevel), lhsShippingServiceLevel, rhsShippingServiceLevel, (this.shippingServiceLevel!= null), (that.shippingServiceLevel!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsShipVia;
            lhsShipVia = this.getShipVia();
            SpecifiedPartnerDescriptionType rhsShipVia;
            rhsShipVia = that.getShipVia();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipVia", lhsShipVia), LocatorUtils.property(thatLocator, "shipVia", rhsShipVia), lhsShipVia, rhsShipVia, (this.shipVia!= null), (that.shipVia!= null))) {
                return false;
            }
        }
        {
            SpecialHandlingInstruction lhsSpecialHandlingInstruction;
            lhsSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            SpecialHandlingInstruction rhsSpecialHandlingInstruction;
            rhsSpecialHandlingInstruction = that.getSpecialHandlingInstruction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialHandlingInstruction", lhsSpecialHandlingInstruction), LocatorUtils.property(thatLocator, "specialHandlingInstruction", rhsSpecialHandlingInstruction), lhsSpecialHandlingInstruction, rhsSpecialHandlingInstruction, (this.specialHandlingInstruction!= null), (that.specialHandlingInstruction!= null))) {
                return false;
            }
        }
        {
            TrackingReference lhsTrackingReference;
            lhsTrackingReference = this.getTrackingReference();
            TrackingReference rhsTrackingReference;
            rhsTrackingReference = that.getTrackingReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingReference", lhsTrackingReference), LocatorUtils.property(thatLocator, "trackingReference", rhsTrackingReference), lhsTrackingReference, rhsTrackingReference, (this.trackingReference!= null), (that.trackingReference!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsTransportedBy;
            lhsTransportedBy = this.getTransportedBy();
            SpecifiedPartnerDescriptionType rhsTransportedBy;
            rhsTransportedBy = that.getTransportedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportedBy", lhsTransportedBy), LocatorUtils.property(thatLocator, "transportedBy", rhsTransportedBy), lhsTransportedBy, rhsTransportedBy, (this.transportedBy!= null), (that.transportedBy!= null))) {
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
            String theDeliveryPriorityIdentifier;
            theDeliveryPriorityIdentifier = this.getDeliveryPriorityIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryPriorityIdentifier", theDeliveryPriorityIdentifier), currentHashCode, theDeliveryPriorityIdentifier, (this.deliveryPriorityIdentifier!= null));
        }
        {
            BusinessDocumentReferenceType theFreightEquipmentNumber;
            theFreightEquipmentNumber = this.getFreightEquipmentNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightEquipmentNumber", theFreightEquipmentNumber), currentHashCode, theFreightEquipmentNumber, (this.freightEquipmentNumber!= null));
        }
        {
            FreightPaymentInformation theFreightPaymentInformation;
            theFreightPaymentInformation = this.getFreightPaymentInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightPaymentInformation", theFreightPaymentInformation), currentHashCode, theFreightPaymentInformation, (this.freightPaymentInformation!= null));
        }
        {
            BigInteger theSequenceNumber;
            theSequenceNumber = this.getSequenceNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumber", theSequenceNumber), currentHashCode, theSequenceNumber, (this.sequenceNumber!= null));
        }
        {
            ShipmentMode theShipmentMode;
            theShipmentMode = this.getShipmentMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentMode", theShipmentMode), currentHashCode, theShipmentMode, (this.shipmentMode!= null));
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingServiceLevel", theShippingServiceLevel), currentHashCode, theShippingServiceLevel, (this.shippingServiceLevel!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipVia;
            theShipVia = this.getShipVia();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipVia", theShipVia), currentHashCode, theShipVia, (this.shipVia!= null));
        }
        {
            SpecialHandlingInstruction theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialHandlingInstruction", theSpecialHandlingInstruction), currentHashCode, theSpecialHandlingInstruction, (this.specialHandlingInstruction!= null));
        }
        {
            TrackingReference theTrackingReference;
            theTrackingReference = this.getTrackingReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingReference", theTrackingReference), currentHashCode, theTrackingReference, (this.trackingReference!= null));
        }
        {
            SpecifiedPartnerDescriptionType theTransportedBy;
            theTransportedBy = this.getTransportedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportedBy", theTransportedBy), currentHashCode, theTransportedBy, (this.transportedBy!= null));
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
            String theDeliveryPriorityIdentifier;
            theDeliveryPriorityIdentifier = this.getDeliveryPriorityIdentifier();
            strategy.appendField(locator, this, "deliveryPriorityIdentifier", buffer, theDeliveryPriorityIdentifier, (this.deliveryPriorityIdentifier!= null));
        }
        {
            BusinessDocumentReferenceType theFreightEquipmentNumber;
            theFreightEquipmentNumber = this.getFreightEquipmentNumber();
            strategy.appendField(locator, this, "freightEquipmentNumber", buffer, theFreightEquipmentNumber, (this.freightEquipmentNumber!= null));
        }
        {
            FreightPaymentInformation theFreightPaymentInformation;
            theFreightPaymentInformation = this.getFreightPaymentInformation();
            strategy.appendField(locator, this, "freightPaymentInformation", buffer, theFreightPaymentInformation, (this.freightPaymentInformation!= null));
        }
        {
            BigInteger theSequenceNumber;
            theSequenceNumber = this.getSequenceNumber();
            strategy.appendField(locator, this, "sequenceNumber", buffer, theSequenceNumber, (this.sequenceNumber!= null));
        }
        {
            ShipmentMode theShipmentMode;
            theShipmentMode = this.getShipmentMode();
            strategy.appendField(locator, this, "shipmentMode", buffer, theShipmentMode, (this.shipmentMode!= null));
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            strategy.appendField(locator, this, "shippingServiceLevel", buffer, theShippingServiceLevel, (this.shippingServiceLevel!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipVia;
            theShipVia = this.getShipVia();
            strategy.appendField(locator, this, "shipVia", buffer, theShipVia, (this.shipVia!= null));
        }
        {
            SpecialHandlingInstruction theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            strategy.appendField(locator, this, "specialHandlingInstruction", buffer, theSpecialHandlingInstruction, (this.specialHandlingInstruction!= null));
        }
        {
            TrackingReference theTrackingReference;
            theTrackingReference = this.getTrackingReference();
            strategy.appendField(locator, this, "trackingReference", buffer, theTrackingReference, (this.trackingReference!= null));
        }
        {
            SpecifiedPartnerDescriptionType theTransportedBy;
            theTransportedBy = this.getTransportedBy();
            strategy.appendField(locator, this, "transportedBy", buffer, theTransportedBy, (this.transportedBy!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
