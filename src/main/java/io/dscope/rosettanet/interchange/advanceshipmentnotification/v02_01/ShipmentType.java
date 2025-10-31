
package io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_01;

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
import io.dscope.rosettanet.domain.logistics.codelist.incoterms.v01_03.Incoterms;
import io.dscope.rosettanet.domain.logistics.codelist.shipmentchangedisposition.v01_03.ShipmentChangeDisposition;
import io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_05.ShipmentMode;
import io.dscope.rosettanet.domain.logistics.logistics.v02_08.ShipmentDate;
import io.dscope.rosettanet.domain.logistics.logistics.v02_08.TrackingReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.SpecialHandlingInstruction;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.universal.monetaryexpression.v01_03.FinancialAmountType;
import io.dscope.rosettanet.universal.partneridentification.v01_08.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for ShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierCode" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}SCACType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FreightAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.03}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FreightPaymentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03}Incoterms" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfShippingContainers" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipmentChangeDisposition:xsd:codelist:01.03}ShipmentChangeDisposition" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentChangeReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08}ShipmentDate" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05}ShipmentMode" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainer" type="{urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.01}ShippingContainerType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}SpecialHandlingInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08}TrackingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransportedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType"/&gt;
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
@XmlType(name = "ShipmentType", propOrder = {
    "carrierCode",
    "freightAmount",
    "freightPaymentAccount",
    "identifier",
    "incoterms",
    "numberOfShippingContainers",
    "shipmentChangeDisposition",
    "shipmentChangeReason",
    "shipmentDate",
    "shipmentMode",
    "shippingContainer",
    "shippingServiceLevel",
    "shipTo",
    "specialHandlingInstruction",
    "trackingReference",
    "transportedBy"
})
public class ShipmentType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CarrierCode", required = true)
    protected List<String> carrierCode;
    @XmlElement(name = "FreightAmount")
    protected FinancialAmountType freightAmount;
    @XmlElement(name = "FreightPaymentAccount")
    protected String freightPaymentAccount;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElementRef(name = "Incoterms", namespace = "urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03", type = Incoterms.class, required = false)
    protected Incoterms incoterms;
    @XmlElement(name = "NumberOfShippingContainers")
    protected float numberOfShippingContainers;
    @XmlElementRef(name = "ShipmentChangeDisposition", namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentChangeDisposition:xsd:codelist:01.03", type = ShipmentChangeDisposition.class, required = false)
    protected ShipmentChangeDisposition shipmentChangeDisposition;
    @XmlElement(name = "ShipmentChangeReason")
    protected String shipmentChangeReason;
    @XmlElementRef(name = "ShipmentDate", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08", type = ShipmentDate.class)
    protected List<ShipmentDate> shipmentDate;
    @XmlElementRef(name = "ShipmentMode", namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05", type = ShipmentMode.class, required = false)
    protected ShipmentMode shipmentMode;
    @XmlElement(name = "ShippingContainer", required = true)
    protected List<ShippingContainerType> shippingContainer;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElement(name = "ShipTo", required = true)
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = SpecialHandlingInstruction.class, required = false)
    protected SpecialHandlingInstruction specialHandlingInstruction;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08", type = TrackingReference.class, required = false)
    protected List<TrackingReference> trackingReference;
    @XmlElement(name = "TransportedBy", required = true)
    protected SpecifiedPartnerDescriptionType transportedBy;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the carrierCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarrierCode() {
        if (carrierCode == null) {
            carrierCode = new ArrayList<String>();
        }
        return this.carrierCode;
    }

    /**
     * Gets the value of the freightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getFreightAmount() {
        return freightAmount;
    }

    /**
     * Sets the value of the freightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setFreightAmount(FinancialAmountType value) {
        this.freightAmount = value;
    }

    /**
     * Gets the value of the freightPaymentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightPaymentAccount() {
        return freightPaymentAccount;
    }

    /**
     * Sets the value of the freightPaymentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightPaymentAccount(String value) {
        this.freightPaymentAccount = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the incoterms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms }
     *     
     */
    public Incoterms getIncoterms() {
        return incoterms;
    }

    /**
     * Sets the value of the incoterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms }
     *     
     */
    public void setIncoterms(Incoterms value) {
        this.incoterms = value;
    }

    /**
     * Gets the value of the numberOfShippingContainers property.
     * 
     */
    public float getNumberOfShippingContainers() {
        return numberOfShippingContainers;
    }

    /**
     * Sets the value of the numberOfShippingContainers property.
     * 
     */
    public void setNumberOfShippingContainers(float value) {
        this.numberOfShippingContainers = value;
    }

    /**
     * Gets the value of the shipmentChangeDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentChangeDisposition }
     *     
     */
    public ShipmentChangeDisposition getShipmentChangeDisposition() {
        return shipmentChangeDisposition;
    }

    /**
     * Sets the value of the shipmentChangeDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentChangeDisposition }
     *     
     */
    public void setShipmentChangeDisposition(ShipmentChangeDisposition value) {
        this.shipmentChangeDisposition = value;
    }

    /**
     * Gets the value of the shipmentChangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentChangeReason() {
        return shipmentChangeReason;
    }

    /**
     * Sets the value of the shipmentChangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentChangeReason(String value) {
        this.shipmentChangeReason = value;
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
     * Gets the value of the shippingContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingContainerType }
     * 
     * 
     */
    public List<ShippingContainerType> getShippingContainer() {
        if (shippingContainer == null) {
            shippingContainer = new ArrayList<ShippingContainerType>();
        }
        return this.shippingContainer;
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
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipTo(SpecifiedPartnerDescriptionType value) {
        this.shipTo = value;
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
        final ShipmentType that = ((ShipmentType) object);
        {
            List<String> lhsCarrierCode;
            lhsCarrierCode = (((this.carrierCode!= null)&&(!this.carrierCode.isEmpty()))?this.getCarrierCode():null);
            List<String> rhsCarrierCode;
            rhsCarrierCode = (((that.carrierCode!= null)&&(!that.carrierCode.isEmpty()))?that.getCarrierCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carrierCode", lhsCarrierCode), LocatorUtils.property(thatLocator, "carrierCode", rhsCarrierCode), lhsCarrierCode, rhsCarrierCode, ((this.carrierCode!= null)&&(!this.carrierCode.isEmpty())), ((that.carrierCode!= null)&&(!that.carrierCode.isEmpty())))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsFreightAmount;
            lhsFreightAmount = this.getFreightAmount();
            FinancialAmountType rhsFreightAmount;
            rhsFreightAmount = that.getFreightAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightAmount", lhsFreightAmount), LocatorUtils.property(thatLocator, "freightAmount", rhsFreightAmount), lhsFreightAmount, rhsFreightAmount, (this.freightAmount!= null), (that.freightAmount!= null))) {
                return false;
            }
        }
        {
            String lhsFreightPaymentAccount;
            lhsFreightPaymentAccount = this.getFreightPaymentAccount();
            String rhsFreightPaymentAccount;
            rhsFreightPaymentAccount = that.getFreightPaymentAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightPaymentAccount", lhsFreightPaymentAccount), LocatorUtils.property(thatLocator, "freightPaymentAccount", rhsFreightPaymentAccount), lhsFreightPaymentAccount, rhsFreightPaymentAccount, (this.freightPaymentAccount!= null), (that.freightPaymentAccount!= null))) {
                return false;
            }
        }
        {
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            Incoterms lhsIncoterms;
            lhsIncoterms = this.getIncoterms();
            Incoterms rhsIncoterms;
            rhsIncoterms = that.getIncoterms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "incoterms", lhsIncoterms), LocatorUtils.property(thatLocator, "incoterms", rhsIncoterms), lhsIncoterms, rhsIncoterms, (this.incoterms!= null), (that.incoterms!= null))) {
                return false;
            }
        }
        {
            float lhsNumberOfShippingContainers;
            lhsNumberOfShippingContainers = this.getNumberOfShippingContainers();
            float rhsNumberOfShippingContainers;
            rhsNumberOfShippingContainers = that.getNumberOfShippingContainers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfShippingContainers", lhsNumberOfShippingContainers), LocatorUtils.property(thatLocator, "numberOfShippingContainers", rhsNumberOfShippingContainers), lhsNumberOfShippingContainers, rhsNumberOfShippingContainers, true, true)) {
                return false;
            }
        }
        {
            ShipmentChangeDisposition lhsShipmentChangeDisposition;
            lhsShipmentChangeDisposition = this.getShipmentChangeDisposition();
            ShipmentChangeDisposition rhsShipmentChangeDisposition;
            rhsShipmentChangeDisposition = that.getShipmentChangeDisposition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentChangeDisposition", lhsShipmentChangeDisposition), LocatorUtils.property(thatLocator, "shipmentChangeDisposition", rhsShipmentChangeDisposition), lhsShipmentChangeDisposition, rhsShipmentChangeDisposition, (this.shipmentChangeDisposition!= null), (that.shipmentChangeDisposition!= null))) {
                return false;
            }
        }
        {
            String lhsShipmentChangeReason;
            lhsShipmentChangeReason = this.getShipmentChangeReason();
            String rhsShipmentChangeReason;
            rhsShipmentChangeReason = that.getShipmentChangeReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentChangeReason", lhsShipmentChangeReason), LocatorUtils.property(thatLocator, "shipmentChangeReason", rhsShipmentChangeReason), lhsShipmentChangeReason, rhsShipmentChangeReason, (this.shipmentChangeReason!= null), (that.shipmentChangeReason!= null))) {
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
            ShipmentMode lhsShipmentMode;
            lhsShipmentMode = this.getShipmentMode();
            ShipmentMode rhsShipmentMode;
            rhsShipmentMode = that.getShipmentMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentMode", lhsShipmentMode), LocatorUtils.property(thatLocator, "shipmentMode", rhsShipmentMode), lhsShipmentMode, rhsShipmentMode, (this.shipmentMode!= null), (that.shipmentMode!= null))) {
                return false;
            }
        }
        {
            List<ShippingContainerType> lhsShippingContainer;
            lhsShippingContainer = (((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty()))?this.getShippingContainer():null);
            List<ShippingContainerType> rhsShippingContainer;
            rhsShippingContainer = (((that.shippingContainer!= null)&&(!that.shippingContainer.isEmpty()))?that.getShippingContainer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingContainer", lhsShippingContainer), LocatorUtils.property(thatLocator, "shippingContainer", rhsShippingContainer), lhsShippingContainer, rhsShippingContainer, ((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty())), ((that.shippingContainer!= null)&&(!that.shippingContainer.isEmpty())))) {
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
            SpecifiedPartnerDescriptionType lhsShipTo;
            lhsShipTo = this.getShipTo();
            SpecifiedPartnerDescriptionType rhsShipTo;
            rhsShipTo = that.getShipTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipTo", lhsShipTo), LocatorUtils.property(thatLocator, "shipTo", rhsShipTo), lhsShipTo, rhsShipTo, (this.shipTo!= null), (that.shipTo!= null))) {
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
            List<TrackingReference> lhsTrackingReference;
            lhsTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            List<TrackingReference> rhsTrackingReference;
            rhsTrackingReference = (((that.trackingReference!= null)&&(!that.trackingReference.isEmpty()))?that.getTrackingReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingReference", lhsTrackingReference), LocatorUtils.property(thatLocator, "trackingReference", rhsTrackingReference), lhsTrackingReference, rhsTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())), ((that.trackingReference!= null)&&(!that.trackingReference.isEmpty())))) {
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
            List<String> theCarrierCode;
            theCarrierCode = (((this.carrierCode!= null)&&(!this.carrierCode.isEmpty()))?this.getCarrierCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierCode", theCarrierCode), currentHashCode, theCarrierCode, ((this.carrierCode!= null)&&(!this.carrierCode.isEmpty())));
        }
        {
            FinancialAmountType theFreightAmount;
            theFreightAmount = this.getFreightAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightAmount", theFreightAmount), currentHashCode, theFreightAmount, (this.freightAmount!= null));
        }
        {
            String theFreightPaymentAccount;
            theFreightPaymentAccount = this.getFreightPaymentAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightPaymentAccount", theFreightPaymentAccount), currentHashCode, theFreightPaymentAccount, (this.freightPaymentAccount!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            Incoterms theIncoterms;
            theIncoterms = this.getIncoterms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "incoterms", theIncoterms), currentHashCode, theIncoterms, (this.incoterms!= null));
        }
        {
            float theNumberOfShippingContainers;
            theNumberOfShippingContainers = this.getNumberOfShippingContainers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberOfShippingContainers", theNumberOfShippingContainers), currentHashCode, theNumberOfShippingContainers, true);
        }
        {
            ShipmentChangeDisposition theShipmentChangeDisposition;
            theShipmentChangeDisposition = this.getShipmentChangeDisposition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentChangeDisposition", theShipmentChangeDisposition), currentHashCode, theShipmentChangeDisposition, (this.shipmentChangeDisposition!= null));
        }
        {
            String theShipmentChangeReason;
            theShipmentChangeReason = this.getShipmentChangeReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentChangeReason", theShipmentChangeReason), currentHashCode, theShipmentChangeReason, (this.shipmentChangeReason!= null));
        }
        {
            List<ShipmentDate> theShipmentDate;
            theShipmentDate = (((this.shipmentDate!= null)&&(!this.shipmentDate.isEmpty()))?this.getShipmentDate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentDate", theShipmentDate), currentHashCode, theShipmentDate, ((this.shipmentDate!= null)&&(!this.shipmentDate.isEmpty())));
        }
        {
            ShipmentMode theShipmentMode;
            theShipmentMode = this.getShipmentMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentMode", theShipmentMode), currentHashCode, theShipmentMode, (this.shipmentMode!= null));
        }
        {
            List<ShippingContainerType> theShippingContainer;
            theShippingContainer = (((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty()))?this.getShippingContainer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingContainer", theShippingContainer), currentHashCode, theShippingContainer, ((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty())));
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingServiceLevel", theShippingServiceLevel), currentHashCode, theShippingServiceLevel, (this.shippingServiceLevel!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipTo", theShipTo), currentHashCode, theShipTo, (this.shipTo!= null));
        }
        {
            SpecialHandlingInstruction theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialHandlingInstruction", theSpecialHandlingInstruction), currentHashCode, theSpecialHandlingInstruction, (this.specialHandlingInstruction!= null));
        }
        {
            List<TrackingReference> theTrackingReference;
            theTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingReference", theTrackingReference), currentHashCode, theTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())));
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
            List<String> theCarrierCode;
            theCarrierCode = (((this.carrierCode!= null)&&(!this.carrierCode.isEmpty()))?this.getCarrierCode():null);
            strategy.appendField(locator, this, "carrierCode", buffer, theCarrierCode, ((this.carrierCode!= null)&&(!this.carrierCode.isEmpty())));
        }
        {
            FinancialAmountType theFreightAmount;
            theFreightAmount = this.getFreightAmount();
            strategy.appendField(locator, this, "freightAmount", buffer, theFreightAmount, (this.freightAmount!= null));
        }
        {
            String theFreightPaymentAccount;
            theFreightPaymentAccount = this.getFreightPaymentAccount();
            strategy.appendField(locator, this, "freightPaymentAccount", buffer, theFreightPaymentAccount, (this.freightPaymentAccount!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            Incoterms theIncoterms;
            theIncoterms = this.getIncoterms();
            strategy.appendField(locator, this, "incoterms", buffer, theIncoterms, (this.incoterms!= null));
        }
        {
            float theNumberOfShippingContainers;
            theNumberOfShippingContainers = this.getNumberOfShippingContainers();
            strategy.appendField(locator, this, "numberOfShippingContainers", buffer, theNumberOfShippingContainers, true);
        }
        {
            ShipmentChangeDisposition theShipmentChangeDisposition;
            theShipmentChangeDisposition = this.getShipmentChangeDisposition();
            strategy.appendField(locator, this, "shipmentChangeDisposition", buffer, theShipmentChangeDisposition, (this.shipmentChangeDisposition!= null));
        }
        {
            String theShipmentChangeReason;
            theShipmentChangeReason = this.getShipmentChangeReason();
            strategy.appendField(locator, this, "shipmentChangeReason", buffer, theShipmentChangeReason, (this.shipmentChangeReason!= null));
        }
        {
            List<ShipmentDate> theShipmentDate;
            theShipmentDate = (((this.shipmentDate!= null)&&(!this.shipmentDate.isEmpty()))?this.getShipmentDate():null);
            strategy.appendField(locator, this, "shipmentDate", buffer, theShipmentDate, ((this.shipmentDate!= null)&&(!this.shipmentDate.isEmpty())));
        }
        {
            ShipmentMode theShipmentMode;
            theShipmentMode = this.getShipmentMode();
            strategy.appendField(locator, this, "shipmentMode", buffer, theShipmentMode, (this.shipmentMode!= null));
        }
        {
            List<ShippingContainerType> theShippingContainer;
            theShippingContainer = (((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty()))?this.getShippingContainer():null);
            strategy.appendField(locator, this, "shippingContainer", buffer, theShippingContainer, ((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty())));
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            strategy.appendField(locator, this, "shippingServiceLevel", buffer, theShippingServiceLevel, (this.shippingServiceLevel!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            strategy.appendField(locator, this, "shipTo", buffer, theShipTo, (this.shipTo!= null));
        }
        {
            SpecialHandlingInstruction theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            strategy.appendField(locator, this, "specialHandlingInstruction", buffer, theSpecialHandlingInstruction, (this.specialHandlingInstruction!= null));
        }
        {
            List<TrackingReference> theTrackingReference;
            theTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            strategy.appendField(locator, this, "trackingReference", buffer, theTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())));
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
