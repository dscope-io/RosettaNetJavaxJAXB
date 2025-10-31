
package io.dscope.rosettanet.interchange.purchaseorderchangerequest.v02_01;

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
import io.dscope.rosettanet.domain.design.codelist.actioncode.v01_03.ActionCode;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03.PurchaseOrderFillPriority;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.CustomerInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.OrderQuantity;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.OrderShippingInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.TransportationEventType;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.locations.v01_03.LocationType;
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
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dac="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07" xmlns:dpoct="urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.03" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04" xmlns:p141717_="http://annox.dev.java.net" xmlns:p570617_="http://java.sun.com/xml/ns/jaxb" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderChangeRequest:xsd:schema:02.01" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.04" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.03" xmlns:ume="urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.03" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductSubLineItem, at least one occurrence of OrderShippingInformation/SpecialHandlingInstruction/Text or OrderShippingInformation/SpecialHandlingInstruction/SpecialHandling.&lt;/urss:Constraint&gt;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03}ActionCode"/&gt;
 *         &lt;element name="BuyerSubLineItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}ContractInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}CustomerInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExpediteReferenceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallAt" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="IsDropShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}OrderQuantity"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}OrderShippingInformation" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03}PurchaseOrderFillPriority" minOccurs="0"/&gt;
 *         &lt;element name="RequestedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TransportationEventType"/&gt;
 *         &lt;element name="RequestedShipFrom" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.03}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedUnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.03}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="SubLineItem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
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
    "actionCode",
    "buyerSubLineItem",
    "comments",
    "contractInformation",
    "countryOfOrigin",
    "customerInformation",
    "expediteReferenceIdentifier",
    "installAt",
    "isDropShip",
    "orderQuantity",
    "orderShippingInformation",
    "originalScheduledEvent",
    "productInformation",
    "purchaseOrderFillPriority",
    "requestedEvent",
    "requestedShipFrom",
    "requestedUnitPrice",
    "revisionNumber",
    "scheduledEvent",
    "shipTo",
    "subLineItem",
    "unitOfMeasure"
})
public class ProductSubLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ActionCode", namespace = "urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03", type = ActionCode.class)
    protected ActionCode actionCode;
    @XmlElement(name = "BuyerSubLineItem")
    protected String buyerSubLineItem;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = ContractInformation.class, required = false)
    protected List<ContractInformation> contractInformation;
    @XmlElement(name = "CountryOfOrigin")
    protected List<CountryType> countryOfOrigin;
    @XmlElementRef(name = "CustomerInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = CustomerInformation.class, required = false)
    protected List<CustomerInformation> customerInformation;
    @XmlElement(name = "ExpediteReferenceIdentifier")
    protected String expediteReferenceIdentifier;
    @XmlElement(name = "InstallAt")
    protected SpecifiedPartnerDescriptionType installAt;
    @XmlElement(name = "IsDropShip")
    protected boolean isDropShip;
    @XmlElementRef(name = "OrderQuantity", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = OrderQuantity.class)
    protected OrderQuantity orderQuantity;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = OrderShippingInformation.class, required = false)
    protected OrderShippingInformation orderShippingInformation;
    @XmlElement(name = "OriginalScheduledEvent")
    protected List<TransportationEventType> originalScheduledEvent;
    @XmlElement(name = "ProductInformation")
    protected String productInformation;
    @XmlElementRef(name = "PurchaseOrderFillPriority", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", type = PurchaseOrderFillPriority.class, required = false)
    protected PurchaseOrderFillPriority purchaseOrderFillPriority;
    @XmlElement(name = "RequestedEvent", required = true)
    protected TransportationEventType requestedEvent;
    @XmlElement(name = "RequestedShipFrom")
    protected List<LocationType> requestedShipFrom;
    @XmlElement(name = "RequestedUnitPrice")
    protected FinancialAmountType requestedUnitPrice;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
    @XmlElement(name = "ScheduledEvent")
    protected TransportationEventType scheduledEvent;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElement(name = "SubLineItem", required = true)
    protected String subLineItem;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setActionCode(ActionCode value) {
        this.actionCode = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getCountryOfOrigin() {
        if (countryOfOrigin == null) {
            countryOfOrigin = new ArrayList<CountryType>();
        }
        return this.countryOfOrigin;
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
     * Gets the value of the productInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductInformation() {
        return productInformation;
    }

    /**
     * Sets the value of the productInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductInformation(String value) {
        this.productInformation = value;
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
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getRequestedUnitPrice() {
        return requestedUnitPrice;
    }

    /**
     * Sets the value of the requestedUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setRequestedUnitPrice(FinancialAmountType value) {
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
        final ProductSubLineItemType that = ((ProductSubLineItemType) object);
        {
            ActionCode lhsActionCode;
            lhsActionCode = this.getActionCode();
            ActionCode rhsActionCode;
            rhsActionCode = that.getActionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionCode", lhsActionCode), LocatorUtils.property(thatLocator, "actionCode", rhsActionCode), lhsActionCode, rhsActionCode, (this.actionCode!= null), (that.actionCode!= null))) {
                return false;
            }
        }
        {
            String lhsBuyerSubLineItem;
            lhsBuyerSubLineItem = this.getBuyerSubLineItem();
            String rhsBuyerSubLineItem;
            rhsBuyerSubLineItem = that.getBuyerSubLineItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buyerSubLineItem", lhsBuyerSubLineItem), LocatorUtils.property(thatLocator, "buyerSubLineItem", rhsBuyerSubLineItem), lhsBuyerSubLineItem, rhsBuyerSubLineItem, (this.buyerSubLineItem!= null), (that.buyerSubLineItem!= null))) {
                return false;
            }
        }
        {
            String lhsComments;
            lhsComments = this.getComments();
            String rhsComments;
            rhsComments = that.getComments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comments", lhsComments), LocatorUtils.property(thatLocator, "comments", rhsComments), lhsComments, rhsComments, (this.comments!= null), (that.comments!= null))) {
                return false;
            }
        }
        {
            List<ContractInformation> lhsContractInformation;
            lhsContractInformation = (((this.contractInformation!= null)&&(!this.contractInformation.isEmpty()))?this.getContractInformation():null);
            List<ContractInformation> rhsContractInformation;
            rhsContractInformation = (((that.contractInformation!= null)&&(!that.contractInformation.isEmpty()))?that.getContractInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractInformation", lhsContractInformation), LocatorUtils.property(thatLocator, "contractInformation", rhsContractInformation), lhsContractInformation, rhsContractInformation, ((this.contractInformation!= null)&&(!this.contractInformation.isEmpty())), ((that.contractInformation!= null)&&(!that.contractInformation.isEmpty())))) {
                return false;
            }
        }
        {
            List<CountryType> lhsCountryOfOrigin;
            lhsCountryOfOrigin = (((this.countryOfOrigin!= null)&&(!this.countryOfOrigin.isEmpty()))?this.getCountryOfOrigin():null);
            List<CountryType> rhsCountryOfOrigin;
            rhsCountryOfOrigin = (((that.countryOfOrigin!= null)&&(!that.countryOfOrigin.isEmpty()))?that.getCountryOfOrigin():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryOfOrigin", lhsCountryOfOrigin), LocatorUtils.property(thatLocator, "countryOfOrigin", rhsCountryOfOrigin), lhsCountryOfOrigin, rhsCountryOfOrigin, ((this.countryOfOrigin!= null)&&(!this.countryOfOrigin.isEmpty())), ((that.countryOfOrigin!= null)&&(!that.countryOfOrigin.isEmpty())))) {
                return false;
            }
        }
        {
            List<CustomerInformation> lhsCustomerInformation;
            lhsCustomerInformation = (((this.customerInformation!= null)&&(!this.customerInformation.isEmpty()))?this.getCustomerInformation():null);
            List<CustomerInformation> rhsCustomerInformation;
            rhsCustomerInformation = (((that.customerInformation!= null)&&(!that.customerInformation.isEmpty()))?that.getCustomerInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerInformation", lhsCustomerInformation), LocatorUtils.property(thatLocator, "customerInformation", rhsCustomerInformation), lhsCustomerInformation, rhsCustomerInformation, ((this.customerInformation!= null)&&(!this.customerInformation.isEmpty())), ((that.customerInformation!= null)&&(!that.customerInformation.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsExpediteReferenceIdentifier;
            lhsExpediteReferenceIdentifier = this.getExpediteReferenceIdentifier();
            String rhsExpediteReferenceIdentifier;
            rhsExpediteReferenceIdentifier = that.getExpediteReferenceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expediteReferenceIdentifier", lhsExpediteReferenceIdentifier), LocatorUtils.property(thatLocator, "expediteReferenceIdentifier", rhsExpediteReferenceIdentifier), lhsExpediteReferenceIdentifier, rhsExpediteReferenceIdentifier, (this.expediteReferenceIdentifier!= null), (that.expediteReferenceIdentifier!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsInstallAt;
            lhsInstallAt = this.getInstallAt();
            SpecifiedPartnerDescriptionType rhsInstallAt;
            rhsInstallAt = that.getInstallAt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "installAt", lhsInstallAt), LocatorUtils.property(thatLocator, "installAt", rhsInstallAt), lhsInstallAt, rhsInstallAt, (this.installAt!= null), (that.installAt!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsDropShip;
            lhsIsDropShip = this.isIsDropShip();
            boolean rhsIsDropShip;
            rhsIsDropShip = that.isIsDropShip();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isDropShip", lhsIsDropShip), LocatorUtils.property(thatLocator, "isDropShip", rhsIsDropShip), lhsIsDropShip, rhsIsDropShip, true, true)) {
                return false;
            }
        }
        {
            OrderQuantity lhsOrderQuantity;
            lhsOrderQuantity = this.getOrderQuantity();
            OrderQuantity rhsOrderQuantity;
            rhsOrderQuantity = that.getOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderQuantity", lhsOrderQuantity), LocatorUtils.property(thatLocator, "orderQuantity", rhsOrderQuantity), lhsOrderQuantity, rhsOrderQuantity, (this.orderQuantity!= null), (that.orderQuantity!= null))) {
                return false;
            }
        }
        {
            OrderShippingInformation lhsOrderShippingInformation;
            lhsOrderShippingInformation = this.getOrderShippingInformation();
            OrderShippingInformation rhsOrderShippingInformation;
            rhsOrderShippingInformation = that.getOrderShippingInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderShippingInformation", lhsOrderShippingInformation), LocatorUtils.property(thatLocator, "orderShippingInformation", rhsOrderShippingInformation), lhsOrderShippingInformation, rhsOrderShippingInformation, (this.orderShippingInformation!= null), (that.orderShippingInformation!= null))) {
                return false;
            }
        }
        {
            List<TransportationEventType> lhsOriginalScheduledEvent;
            lhsOriginalScheduledEvent = (((this.originalScheduledEvent!= null)&&(!this.originalScheduledEvent.isEmpty()))?this.getOriginalScheduledEvent():null);
            List<TransportationEventType> rhsOriginalScheduledEvent;
            rhsOriginalScheduledEvent = (((that.originalScheduledEvent!= null)&&(!that.originalScheduledEvent.isEmpty()))?that.getOriginalScheduledEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalScheduledEvent", lhsOriginalScheduledEvent), LocatorUtils.property(thatLocator, "originalScheduledEvent", rhsOriginalScheduledEvent), lhsOriginalScheduledEvent, rhsOriginalScheduledEvent, ((this.originalScheduledEvent!= null)&&(!this.originalScheduledEvent.isEmpty())), ((that.originalScheduledEvent!= null)&&(!that.originalScheduledEvent.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsProductInformation;
            lhsProductInformation = this.getProductInformation();
            String rhsProductInformation;
            rhsProductInformation = that.getProductInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productInformation", lhsProductInformation), LocatorUtils.property(thatLocator, "productInformation", rhsProductInformation), lhsProductInformation, rhsProductInformation, (this.productInformation!= null), (that.productInformation!= null))) {
                return false;
            }
        }
        {
            PurchaseOrderFillPriority lhsPurchaseOrderFillPriority;
            lhsPurchaseOrderFillPriority = this.getPurchaseOrderFillPriority();
            PurchaseOrderFillPriority rhsPurchaseOrderFillPriority;
            rhsPurchaseOrderFillPriority = that.getPurchaseOrderFillPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderFillPriority", lhsPurchaseOrderFillPriority), LocatorUtils.property(thatLocator, "purchaseOrderFillPriority", rhsPurchaseOrderFillPriority), lhsPurchaseOrderFillPriority, rhsPurchaseOrderFillPriority, (this.purchaseOrderFillPriority!= null), (that.purchaseOrderFillPriority!= null))) {
                return false;
            }
        }
        {
            TransportationEventType lhsRequestedEvent;
            lhsRequestedEvent = this.getRequestedEvent();
            TransportationEventType rhsRequestedEvent;
            rhsRequestedEvent = that.getRequestedEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedEvent", lhsRequestedEvent), LocatorUtils.property(thatLocator, "requestedEvent", rhsRequestedEvent), lhsRequestedEvent, rhsRequestedEvent, (this.requestedEvent!= null), (that.requestedEvent!= null))) {
                return false;
            }
        }
        {
            List<LocationType> lhsRequestedShipFrom;
            lhsRequestedShipFrom = (((this.requestedShipFrom!= null)&&(!this.requestedShipFrom.isEmpty()))?this.getRequestedShipFrom():null);
            List<LocationType> rhsRequestedShipFrom;
            rhsRequestedShipFrom = (((that.requestedShipFrom!= null)&&(!that.requestedShipFrom.isEmpty()))?that.getRequestedShipFrom():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedShipFrom", lhsRequestedShipFrom), LocatorUtils.property(thatLocator, "requestedShipFrom", rhsRequestedShipFrom), lhsRequestedShipFrom, rhsRequestedShipFrom, ((this.requestedShipFrom!= null)&&(!this.requestedShipFrom.isEmpty())), ((that.requestedShipFrom!= null)&&(!that.requestedShipFrom.isEmpty())))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsRequestedUnitPrice;
            lhsRequestedUnitPrice = this.getRequestedUnitPrice();
            FinancialAmountType rhsRequestedUnitPrice;
            rhsRequestedUnitPrice = that.getRequestedUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedUnitPrice", lhsRequestedUnitPrice), LocatorUtils.property(thatLocator, "requestedUnitPrice", rhsRequestedUnitPrice), lhsRequestedUnitPrice, rhsRequestedUnitPrice, (this.requestedUnitPrice!= null), (that.requestedUnitPrice!= null))) {
                return false;
            }
        }
        {
            String lhsRevisionNumber;
            lhsRevisionNumber = this.getRevisionNumber();
            String rhsRevisionNumber;
            rhsRevisionNumber = that.getRevisionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revisionNumber", lhsRevisionNumber), LocatorUtils.property(thatLocator, "revisionNumber", rhsRevisionNumber), lhsRevisionNumber, rhsRevisionNumber, (this.revisionNumber!= null), (that.revisionNumber!= null))) {
                return false;
            }
        }
        {
            TransportationEventType lhsScheduledEvent;
            lhsScheduledEvent = this.getScheduledEvent();
            TransportationEventType rhsScheduledEvent;
            rhsScheduledEvent = that.getScheduledEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledEvent", lhsScheduledEvent), LocatorUtils.property(thatLocator, "scheduledEvent", rhsScheduledEvent), lhsScheduledEvent, rhsScheduledEvent, (this.scheduledEvent!= null), (that.scheduledEvent!= null))) {
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
            String lhsSubLineItem;
            lhsSubLineItem = this.getSubLineItem();
            String rhsSubLineItem;
            rhsSubLineItem = that.getSubLineItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subLineItem", lhsSubLineItem), LocatorUtils.property(thatLocator, "subLineItem", rhsSubLineItem), lhsSubLineItem, rhsSubLineItem, (this.subLineItem!= null), (that.subLineItem!= null))) {
                return false;
            }
        }
        {
            UnitOfMeasure lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            UnitOfMeasure rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, (this.unitOfMeasure!= null), (that.unitOfMeasure!= null))) {
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
            ActionCode theActionCode;
            theActionCode = this.getActionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionCode", theActionCode), currentHashCode, theActionCode, (this.actionCode!= null));
        }
        {
            String theBuyerSubLineItem;
            theBuyerSubLineItem = this.getBuyerSubLineItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buyerSubLineItem", theBuyerSubLineItem), currentHashCode, theBuyerSubLineItem, (this.buyerSubLineItem!= null));
        }
        {
            String theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments, (this.comments!= null));
        }
        {
            List<ContractInformation> theContractInformation;
            theContractInformation = (((this.contractInformation!= null)&&(!this.contractInformation.isEmpty()))?this.getContractInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractInformation", theContractInformation), currentHashCode, theContractInformation, ((this.contractInformation!= null)&&(!this.contractInformation.isEmpty())));
        }
        {
            List<CountryType> theCountryOfOrigin;
            theCountryOfOrigin = (((this.countryOfOrigin!= null)&&(!this.countryOfOrigin.isEmpty()))?this.getCountryOfOrigin():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countryOfOrigin", theCountryOfOrigin), currentHashCode, theCountryOfOrigin, ((this.countryOfOrigin!= null)&&(!this.countryOfOrigin.isEmpty())));
        }
        {
            List<CustomerInformation> theCustomerInformation;
            theCustomerInformation = (((this.customerInformation!= null)&&(!this.customerInformation.isEmpty()))?this.getCustomerInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerInformation", theCustomerInformation), currentHashCode, theCustomerInformation, ((this.customerInformation!= null)&&(!this.customerInformation.isEmpty())));
        }
        {
            String theExpediteReferenceIdentifier;
            theExpediteReferenceIdentifier = this.getExpediteReferenceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expediteReferenceIdentifier", theExpediteReferenceIdentifier), currentHashCode, theExpediteReferenceIdentifier, (this.expediteReferenceIdentifier!= null));
        }
        {
            SpecifiedPartnerDescriptionType theInstallAt;
            theInstallAt = this.getInstallAt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "installAt", theInstallAt), currentHashCode, theInstallAt, (this.installAt!= null));
        }
        {
            boolean theIsDropShip;
            theIsDropShip = this.isIsDropShip();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isDropShip", theIsDropShip), currentHashCode, theIsDropShip, true);
        }
        {
            OrderQuantity theOrderQuantity;
            theOrderQuantity = this.getOrderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderQuantity", theOrderQuantity), currentHashCode, theOrderQuantity, (this.orderQuantity!= null));
        }
        {
            OrderShippingInformation theOrderShippingInformation;
            theOrderShippingInformation = this.getOrderShippingInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderShippingInformation", theOrderShippingInformation), currentHashCode, theOrderShippingInformation, (this.orderShippingInformation!= null));
        }
        {
            List<TransportationEventType> theOriginalScheduledEvent;
            theOriginalScheduledEvent = (((this.originalScheduledEvent!= null)&&(!this.originalScheduledEvent.isEmpty()))?this.getOriginalScheduledEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalScheduledEvent", theOriginalScheduledEvent), currentHashCode, theOriginalScheduledEvent, ((this.originalScheduledEvent!= null)&&(!this.originalScheduledEvent.isEmpty())));
        }
        {
            String theProductInformation;
            theProductInformation = this.getProductInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productInformation", theProductInformation), currentHashCode, theProductInformation, (this.productInformation!= null));
        }
        {
            PurchaseOrderFillPriority thePurchaseOrderFillPriority;
            thePurchaseOrderFillPriority = this.getPurchaseOrderFillPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderFillPriority", thePurchaseOrderFillPriority), currentHashCode, thePurchaseOrderFillPriority, (this.purchaseOrderFillPriority!= null));
        }
        {
            TransportationEventType theRequestedEvent;
            theRequestedEvent = this.getRequestedEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedEvent", theRequestedEvent), currentHashCode, theRequestedEvent, (this.requestedEvent!= null));
        }
        {
            List<LocationType> theRequestedShipFrom;
            theRequestedShipFrom = (((this.requestedShipFrom!= null)&&(!this.requestedShipFrom.isEmpty()))?this.getRequestedShipFrom():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedShipFrom", theRequestedShipFrom), currentHashCode, theRequestedShipFrom, ((this.requestedShipFrom!= null)&&(!this.requestedShipFrom.isEmpty())));
        }
        {
            FinancialAmountType theRequestedUnitPrice;
            theRequestedUnitPrice = this.getRequestedUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedUnitPrice", theRequestedUnitPrice), currentHashCode, theRequestedUnitPrice, (this.requestedUnitPrice!= null));
        }
        {
            String theRevisionNumber;
            theRevisionNumber = this.getRevisionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revisionNumber", theRevisionNumber), currentHashCode, theRevisionNumber, (this.revisionNumber!= null));
        }
        {
            TransportationEventType theScheduledEvent;
            theScheduledEvent = this.getScheduledEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledEvent", theScheduledEvent), currentHashCode, theScheduledEvent, (this.scheduledEvent!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipTo", theShipTo), currentHashCode, theShipTo, (this.shipTo!= null));
        }
        {
            String theSubLineItem;
            theSubLineItem = this.getSubLineItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subLineItem", theSubLineItem), currentHashCode, theSubLineItem, (this.subLineItem!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
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
            ActionCode theActionCode;
            theActionCode = this.getActionCode();
            strategy.appendField(locator, this, "actionCode", buffer, theActionCode, (this.actionCode!= null));
        }
        {
            String theBuyerSubLineItem;
            theBuyerSubLineItem = this.getBuyerSubLineItem();
            strategy.appendField(locator, this, "buyerSubLineItem", buffer, theBuyerSubLineItem, (this.buyerSubLineItem!= null));
        }
        {
            String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments, (this.comments!= null));
        }
        {
            List<ContractInformation> theContractInformation;
            theContractInformation = (((this.contractInformation!= null)&&(!this.contractInformation.isEmpty()))?this.getContractInformation():null);
            strategy.appendField(locator, this, "contractInformation", buffer, theContractInformation, ((this.contractInformation!= null)&&(!this.contractInformation.isEmpty())));
        }
        {
            List<CountryType> theCountryOfOrigin;
            theCountryOfOrigin = (((this.countryOfOrigin!= null)&&(!this.countryOfOrigin.isEmpty()))?this.getCountryOfOrigin():null);
            strategy.appendField(locator, this, "countryOfOrigin", buffer, theCountryOfOrigin, ((this.countryOfOrigin!= null)&&(!this.countryOfOrigin.isEmpty())));
        }
        {
            List<CustomerInformation> theCustomerInformation;
            theCustomerInformation = (((this.customerInformation!= null)&&(!this.customerInformation.isEmpty()))?this.getCustomerInformation():null);
            strategy.appendField(locator, this, "customerInformation", buffer, theCustomerInformation, ((this.customerInformation!= null)&&(!this.customerInformation.isEmpty())));
        }
        {
            String theExpediteReferenceIdentifier;
            theExpediteReferenceIdentifier = this.getExpediteReferenceIdentifier();
            strategy.appendField(locator, this, "expediteReferenceIdentifier", buffer, theExpediteReferenceIdentifier, (this.expediteReferenceIdentifier!= null));
        }
        {
            SpecifiedPartnerDescriptionType theInstallAt;
            theInstallAt = this.getInstallAt();
            strategy.appendField(locator, this, "installAt", buffer, theInstallAt, (this.installAt!= null));
        }
        {
            boolean theIsDropShip;
            theIsDropShip = this.isIsDropShip();
            strategy.appendField(locator, this, "isDropShip", buffer, theIsDropShip, true);
        }
        {
            OrderQuantity theOrderQuantity;
            theOrderQuantity = this.getOrderQuantity();
            strategy.appendField(locator, this, "orderQuantity", buffer, theOrderQuantity, (this.orderQuantity!= null));
        }
        {
            OrderShippingInformation theOrderShippingInformation;
            theOrderShippingInformation = this.getOrderShippingInformation();
            strategy.appendField(locator, this, "orderShippingInformation", buffer, theOrderShippingInformation, (this.orderShippingInformation!= null));
        }
        {
            List<TransportationEventType> theOriginalScheduledEvent;
            theOriginalScheduledEvent = (((this.originalScheduledEvent!= null)&&(!this.originalScheduledEvent.isEmpty()))?this.getOriginalScheduledEvent():null);
            strategy.appendField(locator, this, "originalScheduledEvent", buffer, theOriginalScheduledEvent, ((this.originalScheduledEvent!= null)&&(!this.originalScheduledEvent.isEmpty())));
        }
        {
            String theProductInformation;
            theProductInformation = this.getProductInformation();
            strategy.appendField(locator, this, "productInformation", buffer, theProductInformation, (this.productInformation!= null));
        }
        {
            PurchaseOrderFillPriority thePurchaseOrderFillPriority;
            thePurchaseOrderFillPriority = this.getPurchaseOrderFillPriority();
            strategy.appendField(locator, this, "purchaseOrderFillPriority", buffer, thePurchaseOrderFillPriority, (this.purchaseOrderFillPriority!= null));
        }
        {
            TransportationEventType theRequestedEvent;
            theRequestedEvent = this.getRequestedEvent();
            strategy.appendField(locator, this, "requestedEvent", buffer, theRequestedEvent, (this.requestedEvent!= null));
        }
        {
            List<LocationType> theRequestedShipFrom;
            theRequestedShipFrom = (((this.requestedShipFrom!= null)&&(!this.requestedShipFrom.isEmpty()))?this.getRequestedShipFrom():null);
            strategy.appendField(locator, this, "requestedShipFrom", buffer, theRequestedShipFrom, ((this.requestedShipFrom!= null)&&(!this.requestedShipFrom.isEmpty())));
        }
        {
            FinancialAmountType theRequestedUnitPrice;
            theRequestedUnitPrice = this.getRequestedUnitPrice();
            strategy.appendField(locator, this, "requestedUnitPrice", buffer, theRequestedUnitPrice, (this.requestedUnitPrice!= null));
        }
        {
            String theRevisionNumber;
            theRevisionNumber = this.getRevisionNumber();
            strategy.appendField(locator, this, "revisionNumber", buffer, theRevisionNumber, (this.revisionNumber!= null));
        }
        {
            TransportationEventType theScheduledEvent;
            theScheduledEvent = this.getScheduledEvent();
            strategy.appendField(locator, this, "scheduledEvent", buffer, theScheduledEvent, (this.scheduledEvent!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            strategy.appendField(locator, this, "shipTo", buffer, theShipTo, (this.shipTo!= null));
        }
        {
            String theSubLineItem;
            theSubLineItem = this.getSubLineItem();
            strategy.appendField(locator, this, "subLineItem", buffer, theSubLineItem, (this.subLineItem!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
