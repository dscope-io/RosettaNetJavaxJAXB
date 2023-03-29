
package io.dscope.rosettanet.interchange.purchaseorderupdatenotification.v02_02;

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
import io.dscope.rosettanet.domain.procurement.codelist.actiontype.v01_04.ActionType;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderacknowledgmentreason.v01_04.PurchaseOrderAcknowledgmentReason;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03.PurchaseOrderFillPriority;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_03.PurchaseOrderStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.CustomerInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.OrderQuantity;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.OrderShippingInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.ShippedQuantityInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.TransportationEventType;
import io.dscope.rosettanet.domain.shared.shared.v01_05.MonetaryAmountType;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.locations.v01_03.LocationType;
import io.dscope.rosettanet.universal.partneridentification.v01_08.SpecifiedPartnerDescriptionType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dat="urn:rosettanet:specification:domain:Procurement:ActionType:xsd:codelist:01.04" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07" xmlns:dpoar="urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpos="urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.03" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04" xmlns:p455652_="http://java.sun.com/xml/ns/jaxb" xmlns:p906822_="http://annox.dev.java.net" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.05" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderUpdateNotification:xsd:schema:02.02" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.04" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.03" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductSubLineItem, at least one occurrence of OrderShippingInformation/SpecialHandlingInstruction/Text or OrderShippingInformation/SpecialHandlingInstruction/SpecialHandling.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductSubLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSubLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ActionType:xsd:codelist:01.04}ActionType" minOccurs="0"/&gt;
 *         &lt;element name="BuyerSubLineItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}ContractInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}CustomerInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExpediteReferenceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallAt" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="IsContainsChanges" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsDropShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}OrderQuantity"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}OrderShippingInformation" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04}PurchaseOrderAcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03}PurchaseOrderFillPriority" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.03}PurchaseOrderStatus"/&gt;
 *         &lt;element name="RequestedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TransportationEventType"/&gt;
 *         &lt;element name="RequestedShipFrom" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.03}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedUnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element name="ShipFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}ShippedQuantityInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="SubLineItem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalLineItemAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}MonetaryAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductSubLineItemType", propOrder = {
    "actionType",
    "buyerSubLineItem",
    "comments",
    "contractInformation",
    "countryOfOrigin",
    "customerInformation",
    "expediteReferenceIdentifier",
    "information",
    "installAt",
    "isContainsChanges",
    "isDropShip",
    "orderQuantity",
    "orderShippingInformation",
    "originalScheduledEvent",
    "purchaseOrderAcknowledgmentReason",
    "purchaseOrderFillPriority",
    "purchaseOrderStatus",
    "requestedEvent",
    "requestedShipFrom",
    "requestedUnitPrice",
    "revisionNumber",
    "scheduledEvent",
    "shipFrom",
    "shippedQuantityInformation",
    "shipTo",
    "subLineItem",
    "totalLineItemAmount",
    "unitOfMeasure",
    "unitPrice"
})
public class ProductSubLineItemType {

    @XmlElementRef(name = "ActionType", namespace = "urn:rosettanet:specification:domain:Procurement:ActionType:xsd:codelist:01.04", type = ActionType.class, required = false)
    protected ActionType actionType;
    @XmlElement(name = "BuyerSubLineItem")
    protected String buyerSubLineItem;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = ContractInformation.class, required = false)
    protected List<ContractInformation> contractInformation;
    @XmlElement(name = "CountryOfOrigin")
    protected CountryType countryOfOrigin;
    @XmlElementRef(name = "CustomerInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = CustomerInformation.class, required = false)
    protected List<CustomerInformation> customerInformation;
    @XmlElement(name = "ExpediteReferenceIdentifier")
    protected String expediteReferenceIdentifier;
    @XmlElement(name = "Information")
    protected String information;
    @XmlElement(name = "InstallAt")
    protected SpecifiedPartnerDescriptionType installAt;
    @XmlElement(name = "IsContainsChanges")
    protected boolean isContainsChanges;
    @XmlElement(name = "IsDropShip")
    protected boolean isDropShip;
    @XmlElementRef(name = "OrderQuantity", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = OrderQuantity.class)
    protected OrderQuantity orderQuantity;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = OrderShippingInformation.class, required = false)
    protected OrderShippingInformation orderShippingInformation;
    @XmlElement(name = "OriginalScheduledEvent")
    protected List<TransportationEventType> originalScheduledEvent;
    @XmlElementRef(name = "PurchaseOrderAcknowledgmentReason", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04", type = PurchaseOrderAcknowledgmentReason.class, required = false)
    protected List<PurchaseOrderAcknowledgmentReason> purchaseOrderAcknowledgmentReason;
    @XmlElementRef(name = "PurchaseOrderFillPriority", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", type = PurchaseOrderFillPriority.class, required = false)
    protected PurchaseOrderFillPriority purchaseOrderFillPriority;
    @XmlElementRef(name = "PurchaseOrderStatus", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.03", type = PurchaseOrderStatus.class)
    protected PurchaseOrderStatus purchaseOrderStatus;
    @XmlElement(name = "RequestedEvent", required = true)
    protected TransportationEventType requestedEvent;
    @XmlElement(name = "RequestedShipFrom")
    protected List<LocationType> requestedShipFrom;
    @XmlElement(name = "RequestedUnitPrice")
    protected MonetaryAmountType requestedUnitPrice;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
    @XmlElement(name = "ScheduledEvent")
    protected TransportationEventType scheduledEvent;
    @XmlElement(name = "ShipFrom")
    protected List<SpecifiedPartnerDescriptionType> shipFrom;
    @XmlElementRef(name = "ShippedQuantityInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = ShippedQuantityInformation.class, required = false)
    protected List<ShippedQuantityInformation> shippedQuantityInformation;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElement(name = "SubLineItem", required = true)
    protected String subLineItem;
    @XmlElement(name = "TotalLineItemAmount")
    protected MonetaryAmountType totalLineItemAmount;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "UnitPrice")
    protected MonetaryAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setActionType(ActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the buyerSubLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerSubLineItem() {
        return buyerSubLineItem;
    }

    /**
     * Sets the value of the buyerSubLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerSubLineItem(String value) {
        this.buyerSubLineItem = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the contractInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractInformation }
     * 
     * 
     */
    public List<ContractInformation> getContractInformation() {
        if (contractInformation == null) {
            contractInformation = new ArrayList<ContractInformation>();
        }
        return this.contractInformation;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountryOfOrigin(CountryType value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the customerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerInformation }
     * 
     * 
     */
    public List<CustomerInformation> getCustomerInformation() {
        if (customerInformation == null) {
            customerInformation = new ArrayList<CustomerInformation>();
        }
        return this.customerInformation;
    }

    /**
     * Gets the value of the expediteReferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpediteReferenceIdentifier() {
        return expediteReferenceIdentifier;
    }

    /**
     * Sets the value of the expediteReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpediteReferenceIdentifier(String value) {
        this.expediteReferenceIdentifier = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformation(String value) {
        this.information = value;
    }

    /**
     * Gets the value of the installAt property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getInstallAt() {
        return installAt;
    }

    /**
     * Sets the value of the installAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setInstallAt(SpecifiedPartnerDescriptionType value) {
        this.installAt = value;
    }

    /**
     * Gets the value of the isContainsChanges property.
     * 
     */
    public boolean isIsContainsChanges() {
        return isContainsChanges;
    }

    /**
     * Sets the value of the isContainsChanges property.
     * 
     */
    public void setIsContainsChanges(boolean value) {
        this.isContainsChanges = value;
    }

    /**
     * Gets the value of the isDropShip property.
     * 
     */
    public boolean isIsDropShip() {
        return isDropShip;
    }

    /**
     * Sets the value of the isDropShip property.
     * 
     */
    public void setIsDropShip(boolean value) {
        this.isDropShip = value;
    }

    /**
     * Gets the value of the orderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity }
     *     
     */
    public OrderQuantity getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Sets the value of the orderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity }
     *     
     */
    public void setOrderQuantity(OrderQuantity value) {
        this.orderQuantity = value;
    }

    /**
     * Gets the value of the orderShippingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrderShippingInformation }
     *     
     */
    public OrderShippingInformation getOrderShippingInformation() {
        return orderShippingInformation;
    }

    /**
     * Sets the value of the orderShippingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderShippingInformation }
     *     
     */
    public void setOrderShippingInformation(OrderShippingInformation value) {
        this.orderShippingInformation = value;
    }

    /**
     * Gets the value of the originalScheduledEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originalScheduledEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginalScheduledEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationEventType }
     * 
     * 
     */
    public List<TransportationEventType> getOriginalScheduledEvent() {
        if (originalScheduledEvent == null) {
            originalScheduledEvent = new ArrayList<TransportationEventType>();
        }
        return this.originalScheduledEvent;
    }

    /**
     * Gets the value of the purchaseOrderAcknowledgmentReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderAcknowledgmentReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderAcknowledgmentReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseOrderAcknowledgmentReason }
     * 
     * 
     */
    public List<PurchaseOrderAcknowledgmentReason> getPurchaseOrderAcknowledgmentReason() {
        if (purchaseOrderAcknowledgmentReason == null) {
            purchaseOrderAcknowledgmentReason = new ArrayList<PurchaseOrderAcknowledgmentReason>();
        }
        return this.purchaseOrderAcknowledgmentReason;
    }

    /**
     * Gets the value of the purchaseOrderFillPriority property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderFillPriority }
     *     
     */
    public PurchaseOrderFillPriority getPurchaseOrderFillPriority() {
        return purchaseOrderFillPriority;
    }

    /**
     * Sets the value of the purchaseOrderFillPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderFillPriority }
     *     
     */
    public void setPurchaseOrderFillPriority(PurchaseOrderFillPriority value) {
        this.purchaseOrderFillPriority = value;
    }

    /**
     * Gets the value of the purchaseOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderStatus }
     *     
     */
    public PurchaseOrderStatus getPurchaseOrderStatus() {
        return purchaseOrderStatus;
    }

    /**
     * Sets the value of the purchaseOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderStatus }
     *     
     */
    public void setPurchaseOrderStatus(PurchaseOrderStatus value) {
        this.purchaseOrderStatus = value;
    }

    /**
     * Gets the value of the requestedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationEventType }
     *     
     */
    public TransportationEventType getRequestedEvent() {
        return requestedEvent;
    }

    /**
     * Sets the value of the requestedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationEventType }
     *     
     */
    public void setRequestedEvent(TransportationEventType value) {
        this.requestedEvent = value;
    }

    /**
     * Gets the value of the requestedShipFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedShipFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedShipFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getRequestedShipFrom() {
        if (requestedShipFrom == null) {
            requestedShipFrom = new ArrayList<LocationType>();
        }
        return this.requestedShipFrom;
    }

    /**
     * Gets the value of the requestedUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getRequestedUnitPrice() {
        return requestedUnitPrice;
    }

    /**
     * Sets the value of the requestedUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setRequestedUnitPrice(MonetaryAmountType value) {
        this.requestedUnitPrice = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
    }

    /**
     * Gets the value of the scheduledEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationEventType }
     *     
     */
    public TransportationEventType getScheduledEvent() {
        return scheduledEvent;
    }

    /**
     * Sets the value of the scheduledEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationEventType }
     *     
     */
    public void setScheduledEvent(TransportationEventType value) {
        this.scheduledEvent = value;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedPartnerDescriptionType }
     * 
     * 
     */
    public List<SpecifiedPartnerDescriptionType> getShipFrom() {
        if (shipFrom == null) {
            shipFrom = new ArrayList<SpecifiedPartnerDescriptionType>();
        }
        return this.shipFrom;
    }

    /**
     * Gets the value of the shippedQuantityInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippedQuantityInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippedQuantityInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippedQuantityInformation }
     * 
     * 
     */
    public List<ShippedQuantityInformation> getShippedQuantityInformation() {
        if (shippedQuantityInformation == null) {
            shippedQuantityInformation = new ArrayList<ShippedQuantityInformation>();
        }
        return this.shippedQuantityInformation;
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
     * Gets the value of the subLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLineItem() {
        return subLineItem;
    }

    /**
     * Sets the value of the subLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLineItem(String value) {
        this.subLineItem = value;
    }

    /**
     * Gets the value of the totalLineItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getTotalLineItemAmount() {
        return totalLineItemAmount;
    }

    /**
     * Sets the value of the totalLineItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setTotalLineItemAmount(MonetaryAmountType value) {
        this.totalLineItemAmount = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setUnitPrice(MonetaryAmountType value) {
        this.unitPrice = value;
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

}
