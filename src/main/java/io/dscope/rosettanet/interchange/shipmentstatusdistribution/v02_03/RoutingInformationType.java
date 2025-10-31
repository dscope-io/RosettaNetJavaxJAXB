
package io.dscope.rosettanet.interchange.shipmentstatusdistribution.v02_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.CustomsInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.ProofOfDeliveryInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.ShipmentDate;
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.ShippingRoutingPointType;
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.TrackingReference;
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.TransportInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_22.SpecialHandlingInstruction;
import io.dscope.rosettanet.domain.shared.shared.v01_15.SCAC;
import io.dscope.rosettanet.interchange.codelist.shipmentstatusreportinglevel.v01_01.ShipmentStatusReportingLevel;
import io.dscope.rosettanet.universal.partneridentification.v01_15.PartnerDescription;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}CustomsInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.15}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}ProofOfDeliveryInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.15}SCAC" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}ShipmentDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentStatusEvent" type="{urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:02.03}ShipmentStatusEventType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:ShipmentStatusReportingLevel:xsd:codelist:01.01}ShipmentStatusReportingLevel" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ShipmentTransportationEvent" type="{urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:02.03}ShipmentTransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipVia" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}ShippingRoutingPointType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.22}SpecialHandlingInstruction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}TrackingReference" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}TransportInformation" minOccurs="0"/&gt;
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
    "customsInformation",
    "partnerDescription",
    "proofOfDeliveryInformation",
    "scac",
    "shipmentDate",
    "shipmentStatusEvent",
    "shipmentStatusReportingLevel",
    "shipmentTransportationEvent",
    "shipVia",
    "specialHandlingInstruction",
    "trackingReference",
    "transportInformation"
})
public class RoutingInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "CustomsInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", type = CustomsInformation.class, required = false)
    protected CustomsInformation customsInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.15", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "ProofOfDeliveryInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", type = ProofOfDeliveryInformation.class, required = false)
    protected ProofOfDeliveryInformation proofOfDeliveryInformation;
    @XmlElementRef(name = "SCAC", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.15", type = SCAC.class, required = false)
    protected SCAC scac;
    @XmlElementRef(name = "ShipmentDate", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", type = ShipmentDate.class, required = false)
    protected List<ShipmentDate> shipmentDate;
    @XmlElement(name = "ShipmentStatusEvent", required = true)
    protected List<ShipmentStatusEventType> shipmentStatusEvent;
    @XmlElementRef(name = "ShipmentStatusReportingLevel", namespace = "urn:rosettanet:specification:interchange:ShipmentStatusReportingLevel:xsd:codelist:01.01", type = ShipmentStatusReportingLevel.class)
    protected List<ShipmentStatusReportingLevel> shipmentStatusReportingLevel;
    @XmlElement(name = "ShipmentTransportationEvent")
    protected List<ShipmentTransportationEventType> shipmentTransportationEvent;
    @XmlElement(name = "ShipVia")
    protected List<ShippingRoutingPointType> shipVia;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.22", type = SpecialHandlingInstruction.class, required = false)
    protected List<SpecialHandlingInstruction> specialHandlingInstruction;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", type = TrackingReference.class)
    protected List<TrackingReference> trackingReference;
    @XmlElementRef(name = "TransportInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", type = TransportInformation.class, required = false)
    protected TransportInformation transportInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsInformation }
     *     
     */
    public CustomsInformation getCustomsInformation() {
        return customsInformation;
    }

    /**
     * Sets the value of the customsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsInformation }
     *     
     */
    public void setCustomsInformation(CustomsInformation value) {
        this.customsInformation = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
    }

    /**
     * Gets the value of the proofOfDeliveryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProofOfDeliveryInformation }
     *     
     */
    public ProofOfDeliveryInformation getProofOfDeliveryInformation() {
        return proofOfDeliveryInformation;
    }

    /**
     * Sets the value of the proofOfDeliveryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProofOfDeliveryInformation }
     *     
     */
    public void setProofOfDeliveryInformation(ProofOfDeliveryInformation value) {
        this.proofOfDeliveryInformation = value;
    }

    /**
     * Gets the value of the scac property.
     * 
     * @return
     *     possible object is
     *     {@link SCAC }
     *     
     */
    public SCAC getSCAC() {
        return scac;
    }

    /**
     * Sets the value of the scac property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCAC }
     *     
     */
    public void setSCAC(SCAC value) {
        this.scac = value;
    }

    /**
     * Gets the value of the shipmentDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentDate }
     * 
     * 
     */
    public List<ShipmentDate> getShipmentDate() {
        if (shipmentDate == null) {
            shipmentDate = new ArrayList<ShipmentDate>();
        }
        return this.shipmentDate;
    }

    /**
     * Gets the value of the shipmentStatusEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStatusEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStatusEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStatusEventType }
     * 
     * 
     */
    public List<ShipmentStatusEventType> getShipmentStatusEvent() {
        if (shipmentStatusEvent == null) {
            shipmentStatusEvent = new ArrayList<ShipmentStatusEventType>();
        }
        return this.shipmentStatusEvent;
    }

    /**
     * Gets the value of the shipmentStatusReportingLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStatusReportingLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStatusReportingLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStatusReportingLevel }
     * 
     * 
     */
    public List<ShipmentStatusReportingLevel> getShipmentStatusReportingLevel() {
        if (shipmentStatusReportingLevel == null) {
            shipmentStatusReportingLevel = new ArrayList<ShipmentStatusReportingLevel>();
        }
        return this.shipmentStatusReportingLevel;
    }

    /**
     * Gets the value of the shipmentTransportationEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentTransportationEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentTransportationEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentTransportationEventType }
     * 
     * 
     */
    public List<ShipmentTransportationEventType> getShipmentTransportationEvent() {
        if (shipmentTransportationEvent == null) {
            shipmentTransportationEvent = new ArrayList<ShipmentTransportationEventType>();
        }
        return this.shipmentTransportationEvent;
    }

    /**
     * Gets the value of the shipVia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipVia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingRoutingPointType }
     * 
     * 
     */
    public List<ShippingRoutingPointType> getShipVia() {
        if (shipVia == null) {
            shipVia = new ArrayList<ShippingRoutingPointType>();
        }
        return this.shipVia;
    }

    /**
     * Gets the value of the specialHandlingInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandlingInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandlingInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialHandlingInstruction }
     * 
     * 
     */
    public List<SpecialHandlingInstruction> getSpecialHandlingInstruction() {
        if (specialHandlingInstruction == null) {
            specialHandlingInstruction = new ArrayList<SpecialHandlingInstruction>();
        }
        return this.specialHandlingInstruction;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingReference }
     * 
     * 
     */
    public List<TrackingReference> getTrackingReference() {
        if (trackingReference == null) {
            trackingReference = new ArrayList<TrackingReference>();
        }
        return this.trackingReference;
    }

    /**
     * Gets the value of the transportInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TransportInformation }
     *     
     */
    public TransportInformation getTransportInformation() {
        return transportInformation;
    }

    /**
     * Sets the value of the transportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportInformation }
     *     
     */
    public void setTransportInformation(TransportInformation value) {
        this.transportInformation = value;
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
            CustomsInformation lhsCustomsInformation;
            lhsCustomsInformation = this.getCustomsInformation();
            CustomsInformation rhsCustomsInformation;
            rhsCustomsInformation = that.getCustomsInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customsInformation", lhsCustomsInformation), LocatorUtils.property(thatLocator, "customsInformation", rhsCustomsInformation), lhsCustomsInformation, rhsCustomsInformation, (this.customsInformation!= null), (that.customsInformation!= null))) {
                return false;
            }
        }
        {
            PartnerDescription lhsPartnerDescription;
            lhsPartnerDescription = this.getPartnerDescription();
            PartnerDescription rhsPartnerDescription;
            rhsPartnerDescription = that.getPartnerDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, (this.partnerDescription!= null), (that.partnerDescription!= null))) {
                return false;
            }
        }
        {
            ProofOfDeliveryInformation lhsProofOfDeliveryInformation;
            lhsProofOfDeliveryInformation = this.getProofOfDeliveryInformation();
            ProofOfDeliveryInformation rhsProofOfDeliveryInformation;
            rhsProofOfDeliveryInformation = that.getProofOfDeliveryInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "proofOfDeliveryInformation", lhsProofOfDeliveryInformation), LocatorUtils.property(thatLocator, "proofOfDeliveryInformation", rhsProofOfDeliveryInformation), lhsProofOfDeliveryInformation, rhsProofOfDeliveryInformation, (this.proofOfDeliveryInformation!= null), (that.proofOfDeliveryInformation!= null))) {
                return false;
            }
        }
        {
            SCAC lhsSCAC;
            lhsSCAC = this.getSCAC();
            SCAC rhsSCAC;
            rhsSCAC = that.getSCAC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scac", lhsSCAC), LocatorUtils.property(thatLocator, "scac", rhsSCAC), lhsSCAC, rhsSCAC, (this.scac!= null), (that.scac!= null))) {
                return false;
            }
        }
        {
            List<ShipmentDate> lhsShipmentDate;
            lhsShipmentDate = (((this.shipmentDate!= null)&&(!this.shipmentDate.isEmpty()))?this.getShipmentDate():null);
            List<ShipmentDate> rhsShipmentDate;
            rhsShipmentDate = (((that.shipmentDate!= null)&&(!that.shipmentDate.isEmpty()))?that.getShipmentDate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentDate", lhsShipmentDate), LocatorUtils.property(thatLocator, "shipmentDate", rhsShipmentDate), lhsShipmentDate, rhsShipmentDate, ((this.shipmentDate!= null)&&(!this.shipmentDate.isEmpty())), ((that.shipmentDate!= null)&&(!that.shipmentDate.isEmpty())))) {
                return false;
            }
        }
        {
            List<ShipmentStatusEventType> lhsShipmentStatusEvent;
            lhsShipmentStatusEvent = (((this.shipmentStatusEvent!= null)&&(!this.shipmentStatusEvent.isEmpty()))?this.getShipmentStatusEvent():null);
            List<ShipmentStatusEventType> rhsShipmentStatusEvent;
            rhsShipmentStatusEvent = (((that.shipmentStatusEvent!= null)&&(!that.shipmentStatusEvent.isEmpty()))?that.getShipmentStatusEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentStatusEvent", lhsShipmentStatusEvent), LocatorUtils.property(thatLocator, "shipmentStatusEvent", rhsShipmentStatusEvent), lhsShipmentStatusEvent, rhsShipmentStatusEvent, ((this.shipmentStatusEvent!= null)&&(!this.shipmentStatusEvent.isEmpty())), ((that.shipmentStatusEvent!= null)&&(!that.shipmentStatusEvent.isEmpty())))) {
                return false;
            }
        }
        {
            List<ShipmentStatusReportingLevel> lhsShipmentStatusReportingLevel;
            lhsShipmentStatusReportingLevel = (((this.shipmentStatusReportingLevel!= null)&&(!this.shipmentStatusReportingLevel.isEmpty()))?this.getShipmentStatusReportingLevel():null);
            List<ShipmentStatusReportingLevel> rhsShipmentStatusReportingLevel;
            rhsShipmentStatusReportingLevel = (((that.shipmentStatusReportingLevel!= null)&&(!that.shipmentStatusReportingLevel.isEmpty()))?that.getShipmentStatusReportingLevel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentStatusReportingLevel", lhsShipmentStatusReportingLevel), LocatorUtils.property(thatLocator, "shipmentStatusReportingLevel", rhsShipmentStatusReportingLevel), lhsShipmentStatusReportingLevel, rhsShipmentStatusReportingLevel, ((this.shipmentStatusReportingLevel!= null)&&(!this.shipmentStatusReportingLevel.isEmpty())), ((that.shipmentStatusReportingLevel!= null)&&(!that.shipmentStatusReportingLevel.isEmpty())))) {
                return false;
            }
        }
        {
            List<ShipmentTransportationEventType> lhsShipmentTransportationEvent;
            lhsShipmentTransportationEvent = (((this.shipmentTransportationEvent!= null)&&(!this.shipmentTransportationEvent.isEmpty()))?this.getShipmentTransportationEvent():null);
            List<ShipmentTransportationEventType> rhsShipmentTransportationEvent;
            rhsShipmentTransportationEvent = (((that.shipmentTransportationEvent!= null)&&(!that.shipmentTransportationEvent.isEmpty()))?that.getShipmentTransportationEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentTransportationEvent", lhsShipmentTransportationEvent), LocatorUtils.property(thatLocator, "shipmentTransportationEvent", rhsShipmentTransportationEvent), lhsShipmentTransportationEvent, rhsShipmentTransportationEvent, ((this.shipmentTransportationEvent!= null)&&(!this.shipmentTransportationEvent.isEmpty())), ((that.shipmentTransportationEvent!= null)&&(!that.shipmentTransportationEvent.isEmpty())))) {
                return false;
            }
        }
        {
            List<ShippingRoutingPointType> lhsShipVia;
            lhsShipVia = (((this.shipVia!= null)&&(!this.shipVia.isEmpty()))?this.getShipVia():null);
            List<ShippingRoutingPointType> rhsShipVia;
            rhsShipVia = (((that.shipVia!= null)&&(!that.shipVia.isEmpty()))?that.getShipVia():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipVia", lhsShipVia), LocatorUtils.property(thatLocator, "shipVia", rhsShipVia), lhsShipVia, rhsShipVia, ((this.shipVia!= null)&&(!this.shipVia.isEmpty())), ((that.shipVia!= null)&&(!that.shipVia.isEmpty())))) {
                return false;
            }
        }
        {
            List<SpecialHandlingInstruction> lhsSpecialHandlingInstruction;
            lhsSpecialHandlingInstruction = (((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty()))?this.getSpecialHandlingInstruction():null);
            List<SpecialHandlingInstruction> rhsSpecialHandlingInstruction;
            rhsSpecialHandlingInstruction = (((that.specialHandlingInstruction!= null)&&(!that.specialHandlingInstruction.isEmpty()))?that.getSpecialHandlingInstruction():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialHandlingInstruction", lhsSpecialHandlingInstruction), LocatorUtils.property(thatLocator, "specialHandlingInstruction", rhsSpecialHandlingInstruction), lhsSpecialHandlingInstruction, rhsSpecialHandlingInstruction, ((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty())), ((that.specialHandlingInstruction!= null)&&(!that.specialHandlingInstruction.isEmpty())))) {
                return false;
            }
        }
        {
            List<TrackingReference> lhsTrackingReference;
            lhsTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            List<TrackingReference> rhsTrackingReference;
            rhsTrackingReference = (((that.trackingReference!= null)&&(!that.trackingReference.isEmpty()))?that.getTrackingReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingReference", lhsTrackingReference), LocatorUtils.property(thatLocator, "trackingReference", rhsTrackingReference), lhsTrackingReference, rhsTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())), ((that.trackingReference!= null)&&(!that.trackingReference.isEmpty())))) {
                return false;
            }
        }
        {
            TransportInformation lhsTransportInformation;
            lhsTransportInformation = this.getTransportInformation();
            TransportInformation rhsTransportInformation;
            rhsTransportInformation = that.getTransportInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportInformation", lhsTransportInformation), LocatorUtils.property(thatLocator, "transportInformation", rhsTransportInformation), lhsTransportInformation, rhsTransportInformation, (this.transportInformation!= null), (that.transportInformation!= null))) {
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
            CustomsInformation theCustomsInformation;
            theCustomsInformation = this.getCustomsInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customsInformation", theCustomsInformation), currentHashCode, theCustomsInformation, (this.customsInformation!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            ProofOfDeliveryInformation theProofOfDeliveryInformation;
            theProofOfDeliveryInformation = this.getProofOfDeliveryInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "proofOfDeliveryInformation", theProofOfDeliveryInformation), currentHashCode, theProofOfDeliveryInformation, (this.proofOfDeliveryInformation!= null));
        }
        {
            SCAC theSCAC;
            theSCAC = this.getSCAC();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scac", theSCAC), currentHashCode, theSCAC, (this.scac!= null));
        }
        {
            List<ShipmentDate> theShipmentDate;
            theShipmentDate = (((this.shipmentDate!= null)&&(!this.shipmentDate.isEmpty()))?this.getShipmentDate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentDate", theShipmentDate), currentHashCode, theShipmentDate, ((this.shipmentDate!= null)&&(!this.shipmentDate.isEmpty())));
        }
        {
            List<ShipmentStatusEventType> theShipmentStatusEvent;
            theShipmentStatusEvent = (((this.shipmentStatusEvent!= null)&&(!this.shipmentStatusEvent.isEmpty()))?this.getShipmentStatusEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentStatusEvent", theShipmentStatusEvent), currentHashCode, theShipmentStatusEvent, ((this.shipmentStatusEvent!= null)&&(!this.shipmentStatusEvent.isEmpty())));
        }
        {
            List<ShipmentStatusReportingLevel> theShipmentStatusReportingLevel;
            theShipmentStatusReportingLevel = (((this.shipmentStatusReportingLevel!= null)&&(!this.shipmentStatusReportingLevel.isEmpty()))?this.getShipmentStatusReportingLevel():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentStatusReportingLevel", theShipmentStatusReportingLevel), currentHashCode, theShipmentStatusReportingLevel, ((this.shipmentStatusReportingLevel!= null)&&(!this.shipmentStatusReportingLevel.isEmpty())));
        }
        {
            List<ShipmentTransportationEventType> theShipmentTransportationEvent;
            theShipmentTransportationEvent = (((this.shipmentTransportationEvent!= null)&&(!this.shipmentTransportationEvent.isEmpty()))?this.getShipmentTransportationEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentTransportationEvent", theShipmentTransportationEvent), currentHashCode, theShipmentTransportationEvent, ((this.shipmentTransportationEvent!= null)&&(!this.shipmentTransportationEvent.isEmpty())));
        }
        {
            List<ShippingRoutingPointType> theShipVia;
            theShipVia = (((this.shipVia!= null)&&(!this.shipVia.isEmpty()))?this.getShipVia():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipVia", theShipVia), currentHashCode, theShipVia, ((this.shipVia!= null)&&(!this.shipVia.isEmpty())));
        }
        {
            List<SpecialHandlingInstruction> theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = (((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty()))?this.getSpecialHandlingInstruction():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialHandlingInstruction", theSpecialHandlingInstruction), currentHashCode, theSpecialHandlingInstruction, ((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty())));
        }
        {
            List<TrackingReference> theTrackingReference;
            theTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingReference", theTrackingReference), currentHashCode, theTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())));
        }
        {
            TransportInformation theTransportInformation;
            theTransportInformation = this.getTransportInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportInformation", theTransportInformation), currentHashCode, theTransportInformation, (this.transportInformation!= null));
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
            CustomsInformation theCustomsInformation;
            theCustomsInformation = this.getCustomsInformation();
            strategy.appendField(locator, this, "customsInformation", buffer, theCustomsInformation, (this.customsInformation!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            ProofOfDeliveryInformation theProofOfDeliveryInformation;
            theProofOfDeliveryInformation = this.getProofOfDeliveryInformation();
            strategy.appendField(locator, this, "proofOfDeliveryInformation", buffer, theProofOfDeliveryInformation, (this.proofOfDeliveryInformation!= null));
        }
        {
            SCAC theSCAC;
            theSCAC = this.getSCAC();
            strategy.appendField(locator, this, "scac", buffer, theSCAC, (this.scac!= null));
        }
        {
            List<ShipmentDate> theShipmentDate;
            theShipmentDate = (((this.shipmentDate!= null)&&(!this.shipmentDate.isEmpty()))?this.getShipmentDate():null);
            strategy.appendField(locator, this, "shipmentDate", buffer, theShipmentDate, ((this.shipmentDate!= null)&&(!this.shipmentDate.isEmpty())));
        }
        {
            List<ShipmentStatusEventType> theShipmentStatusEvent;
            theShipmentStatusEvent = (((this.shipmentStatusEvent!= null)&&(!this.shipmentStatusEvent.isEmpty()))?this.getShipmentStatusEvent():null);
            strategy.appendField(locator, this, "shipmentStatusEvent", buffer, theShipmentStatusEvent, ((this.shipmentStatusEvent!= null)&&(!this.shipmentStatusEvent.isEmpty())));
        }
        {
            List<ShipmentStatusReportingLevel> theShipmentStatusReportingLevel;
            theShipmentStatusReportingLevel = (((this.shipmentStatusReportingLevel!= null)&&(!this.shipmentStatusReportingLevel.isEmpty()))?this.getShipmentStatusReportingLevel():null);
            strategy.appendField(locator, this, "shipmentStatusReportingLevel", buffer, theShipmentStatusReportingLevel, ((this.shipmentStatusReportingLevel!= null)&&(!this.shipmentStatusReportingLevel.isEmpty())));
        }
        {
            List<ShipmentTransportationEventType> theShipmentTransportationEvent;
            theShipmentTransportationEvent = (((this.shipmentTransportationEvent!= null)&&(!this.shipmentTransportationEvent.isEmpty()))?this.getShipmentTransportationEvent():null);
            strategy.appendField(locator, this, "shipmentTransportationEvent", buffer, theShipmentTransportationEvent, ((this.shipmentTransportationEvent!= null)&&(!this.shipmentTransportationEvent.isEmpty())));
        }
        {
            List<ShippingRoutingPointType> theShipVia;
            theShipVia = (((this.shipVia!= null)&&(!this.shipVia.isEmpty()))?this.getShipVia():null);
            strategy.appendField(locator, this, "shipVia", buffer, theShipVia, ((this.shipVia!= null)&&(!this.shipVia.isEmpty())));
        }
        {
            List<SpecialHandlingInstruction> theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = (((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty()))?this.getSpecialHandlingInstruction():null);
            strategy.appendField(locator, this, "specialHandlingInstruction", buffer, theSpecialHandlingInstruction, ((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty())));
        }
        {
            List<TrackingReference> theTrackingReference;
            theTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            strategy.appendField(locator, this, "trackingReference", buffer, theTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())));
        }
        {
            TransportInformation theTransportInformation;
            theTransportInformation = this.getTransportInformation();
            strategy.appendField(locator, this, "transportInformation", buffer, theTransportInformation, (this.transportInformation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
