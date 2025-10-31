
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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.logistics.logistics.v02_08.DeliveryInformationType;
import io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_03.GovernmentPriorityRating;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderchangetype.v01_03.PurchaseOrderChangeType;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03.PurchaseOrderFillPriority;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.AccountDescription;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.FinancingTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.OrderShippingInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.SecondaryBuyer;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.TaxExemptStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.TransportationEventType;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReferenceType;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dac="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07" xmlns:dpoct="urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.03" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04" xmlns:p141717_="http://annox.dev.java.net" xmlns:p570617_="http://java.sun.com/xml/ns/jaxb" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderChangeRequest:xsd:schema:02.01" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.04" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.03" xmlns:ume="urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.03" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In PurchaseOrder, at least one occurrence of OrderShippingInformation/SpecialHandlingInstruction/Text or OrderShippingInformation/SpecialHandlingInstruction/SpecialHandling.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for PurchaseOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}AccountDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}ContractInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}FinancingTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GeneralServicesAdministrationNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03}GovernmentPriorityRating" minOccurs="0"/&gt;
 *         &lt;element name="InstallAt" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="IsDropShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}OrderShippingInformation" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderChangeRequest:xsd:schema:02.01}ProductLineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.03}PurchaseOrderChangeType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03}PurchaseOrderFillPriority" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04}PurchaseOrderType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ReceivedQuantityInformation" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08}DeliveryInformationType"/&gt;
 *         &lt;element name="RequestedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedShipFrom" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.03}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}SecondaryBuyer" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.03}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "PurchaseOrderType", propOrder = {
    "accountDescription",
    "businessDocumentReference",
    "comments",
    "contractInformation",
    "date",
    "financingTerms",
    "generalServicesAdministrationNumber",
    "governmentContractIdentifier",
    "governmentPriorityRating",
    "installAt",
    "isDropShip",
    "orderShippingInformation",
    "originalScheduledEvent",
    "productInformation",
    "productLineItem",
    "purchaseOrderChangeType",
    "purchaseOrderFillPriority",
    "purchaseOrderIdentifier",
    "purchaseOrderType",
    "receivedQuantityInformation",
    "requestedEvent",
    "requestedShipFrom",
    "revisionNumber",
    "scheduledEvent",
    "secondaryBuyer",
    "shipTo",
    "taxExemptStatus",
    "totalAmount"
})
public class PurchaseOrderType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AccountDescription", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = AccountDescription.class, required = false)
    protected AccountDescription accountDescription;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.04", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = ContractInformation.class, required = false)
    protected List<ContractInformation> contractInformation;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "FinancingTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = FinancingTerms.class, required = false)
    protected List<FinancingTerms> financingTerms;
    @XmlElement(name = "GeneralServicesAdministrationNumber")
    protected BusinessDocumentReferenceType generalServicesAdministrationNumber;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElementRef(name = "GovernmentPriorityRating", namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", type = GovernmentPriorityRating.class, required = false)
    protected GovernmentPriorityRating governmentPriorityRating;
    @XmlElement(name = "InstallAt")
    protected SpecifiedPartnerDescriptionType installAt;
    @XmlElement(name = "IsDropShip")
    protected boolean isDropShip;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = OrderShippingInformation.class, required = false)
    protected OrderShippingInformation orderShippingInformation;
    @XmlElement(name = "OriginalScheduledEvent")
    protected List<TransportationEventType> originalScheduledEvent;
    @XmlElement(name = "ProductInformation")
    protected String productInformation;
    @XmlElement(name = "ProductLineItem")
    protected List<ProductLineItemType> productLineItem;
    @XmlElementRef(name = "PurchaseOrderChangeType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.03", type = PurchaseOrderChangeType.class)
    protected PurchaseOrderChangeType purchaseOrderChangeType;
    @XmlElementRef(name = "PurchaseOrderFillPriority", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", type = PurchaseOrderFillPriority.class, required = false)
    protected PurchaseOrderFillPriority purchaseOrderFillPriority;
    @XmlElement(name = "PurchaseOrderIdentifier", required = true)
    protected BusinessDocumentReferenceType purchaseOrderIdentifier;
    @XmlElementRef(name = "PurchaseOrderType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04", type = io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType.class)
    protected List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType> purchaseOrderType;
    @XmlElement(name = "ReceivedQuantityInformation", required = true)
    protected DeliveryInformationType receivedQuantityInformation;
    @XmlElement(name = "RequestedEvent")
    protected TransportationEventType requestedEvent;
    @XmlElement(name = "RequestedShipFrom")
    protected List<LocationType> requestedShipFrom;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
    @XmlElement(name = "ScheduledEvent")
    protected TransportationEventType scheduledEvent;
    @XmlElementRef(name = "SecondaryBuyer", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = SecondaryBuyer.class, required = false)
    protected SecondaryBuyer secondaryBuyer;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElement(name = "TotalAmount")
    protected FinancialAmountType totalAmount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the accountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDescription }
     *     
     */
    public AccountDescription getAccountDescription() {
        return accountDescription;
    }

    /**
     * Sets the value of the accountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDescription }
     *     
     */
    public void setAccountDescription(AccountDescription value) {
        this.accountDescription = value;
    }

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the financingTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financingTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancingTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingTerms }
     * 
     * 
     */
    public List<FinancingTerms> getFinancingTerms() {
        if (financingTerms == null) {
            financingTerms = new ArrayList<FinancingTerms>();
        }
        return this.financingTerms;
    }

    /**
     * Gets the value of the generalServicesAdministrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getGeneralServicesAdministrationNumber() {
        return generalServicesAdministrationNumber;
    }

    /**
     * Sets the value of the generalServicesAdministrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setGeneralServicesAdministrationNumber(BusinessDocumentReferenceType value) {
        this.generalServicesAdministrationNumber = value;
    }

    /**
     * Gets the value of the governmentContractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getGovernmentContractIdentifier() {
        return governmentContractIdentifier;
    }

    /**
     * Sets the value of the governmentContractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setGovernmentContractIdentifier(BusinessDocumentReferenceType value) {
        this.governmentContractIdentifier = value;
    }

    /**
     * Gets the value of the governmentPriorityRating property.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentPriorityRating }
     *     
     */
    public GovernmentPriorityRating getGovernmentPriorityRating() {
        return governmentPriorityRating;
    }

    /**
     * Sets the value of the governmentPriorityRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentPriorityRating }
     *     
     */
    public void setGovernmentPriorityRating(GovernmentPriorityRating value) {
        this.governmentPriorityRating = value;
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
     * Gets the value of the productLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLineItemType }
     * 
     * 
     */
    public List<ProductLineItemType> getProductLineItem() {
        if (productLineItem == null) {
            productLineItem = new ArrayList<ProductLineItemType>();
        }
        return this.productLineItem;
    }

    /**
     * Gets the value of the purchaseOrderChangeType property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderChangeType }
     *     
     */
    public PurchaseOrderChangeType getPurchaseOrderChangeType() {
        return purchaseOrderChangeType;
    }

    /**
     * Sets the value of the purchaseOrderChangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderChangeType }
     *     
     */
    public void setPurchaseOrderChangeType(PurchaseOrderChangeType value) {
        this.purchaseOrderChangeType = value;
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
     * Gets the value of the purchaseOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPurchaseOrderIdentifier() {
        return purchaseOrderIdentifier;
    }

    /**
     * Sets the value of the purchaseOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPurchaseOrderIdentifier(BusinessDocumentReferenceType value) {
        this.purchaseOrderIdentifier = value;
    }

    /**
     * Gets the value of the purchaseOrderType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType }
     * 
     * 
     */
    public List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType> getPurchaseOrderType() {
        if (purchaseOrderType == null) {
            purchaseOrderType = new ArrayList<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType>();
        }
        return this.purchaseOrderType;
    }

    /**
     * Gets the value of the receivedQuantityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInformationType }
     *     
     */
    public DeliveryInformationType getReceivedQuantityInformation() {
        return receivedQuantityInformation;
    }

    /**
     * Sets the value of the receivedQuantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInformationType }
     *     
     */
    public void setReceivedQuantityInformation(DeliveryInformationType value) {
        this.receivedQuantityInformation = value;
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
     * Gets the value of the secondaryBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryBuyer }
     *     
     */
    public SecondaryBuyer getSecondaryBuyer() {
        return secondaryBuyer;
    }

    /**
     * Sets the value of the secondaryBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryBuyer }
     *     
     */
    public void setSecondaryBuyer(SecondaryBuyer value) {
        this.secondaryBuyer = value;
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
     * Gets the value of the taxExemptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptStatus }
     *     
     */
    public TaxExemptStatus getTaxExemptStatus() {
        return taxExemptStatus;
    }

    /**
     * Sets the value of the taxExemptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptStatus }
     *     
     */
    public void setTaxExemptStatus(TaxExemptStatus value) {
        this.taxExemptStatus = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalAmount(FinancialAmountType value) {
        this.totalAmount = value;
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
        final PurchaseOrderType that = ((PurchaseOrderType) object);
        {
            AccountDescription lhsAccountDescription;
            lhsAccountDescription = this.getAccountDescription();
            AccountDescription rhsAccountDescription;
            rhsAccountDescription = that.getAccountDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountDescription", lhsAccountDescription), LocatorUtils.property(thatLocator, "accountDescription", rhsAccountDescription), lhsAccountDescription, rhsAccountDescription, (this.accountDescription!= null), (that.accountDescription!= null))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReference> lhsBusinessDocumentReference;
            lhsBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            List<BusinessDocumentReference> rhsBusinessDocumentReference;
            rhsBusinessDocumentReference = (((that.businessDocumentReference!= null)&&(!that.businessDocumentReference.isEmpty()))?that.getBusinessDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentReference", lhsBusinessDocumentReference), LocatorUtils.property(thatLocator, "businessDocumentReference", rhsBusinessDocumentReference), lhsBusinessDocumentReference, rhsBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())), ((that.businessDocumentReference!= null)&&(!that.businessDocumentReference.isEmpty())))) {
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
            XMLGregorianCalendar lhsDate;
            lhsDate = this.getDate();
            XMLGregorianCalendar rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate, (this.date!= null), (that.date!= null))) {
                return false;
            }
        }
        {
            List<FinancingTerms> lhsFinancingTerms;
            lhsFinancingTerms = (((this.financingTerms!= null)&&(!this.financingTerms.isEmpty()))?this.getFinancingTerms():null);
            List<FinancingTerms> rhsFinancingTerms;
            rhsFinancingTerms = (((that.financingTerms!= null)&&(!that.financingTerms.isEmpty()))?that.getFinancingTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financingTerms", lhsFinancingTerms), LocatorUtils.property(thatLocator, "financingTerms", rhsFinancingTerms), lhsFinancingTerms, rhsFinancingTerms, ((this.financingTerms!= null)&&(!this.financingTerms.isEmpty())), ((that.financingTerms!= null)&&(!that.financingTerms.isEmpty())))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsGeneralServicesAdministrationNumber;
            lhsGeneralServicesAdministrationNumber = this.getGeneralServicesAdministrationNumber();
            BusinessDocumentReferenceType rhsGeneralServicesAdministrationNumber;
            rhsGeneralServicesAdministrationNumber = that.getGeneralServicesAdministrationNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "generalServicesAdministrationNumber", lhsGeneralServicesAdministrationNumber), LocatorUtils.property(thatLocator, "generalServicesAdministrationNumber", rhsGeneralServicesAdministrationNumber), lhsGeneralServicesAdministrationNumber, rhsGeneralServicesAdministrationNumber, (this.generalServicesAdministrationNumber!= null), (that.generalServicesAdministrationNumber!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsGovernmentContractIdentifier;
            lhsGovernmentContractIdentifier = this.getGovernmentContractIdentifier();
            BusinessDocumentReferenceType rhsGovernmentContractIdentifier;
            rhsGovernmentContractIdentifier = that.getGovernmentContractIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "governmentContractIdentifier", lhsGovernmentContractIdentifier), LocatorUtils.property(thatLocator, "governmentContractIdentifier", rhsGovernmentContractIdentifier), lhsGovernmentContractIdentifier, rhsGovernmentContractIdentifier, (this.governmentContractIdentifier!= null), (that.governmentContractIdentifier!= null))) {
                return false;
            }
        }
        {
            GovernmentPriorityRating lhsGovernmentPriorityRating;
            lhsGovernmentPriorityRating = this.getGovernmentPriorityRating();
            GovernmentPriorityRating rhsGovernmentPriorityRating;
            rhsGovernmentPriorityRating = that.getGovernmentPriorityRating();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "governmentPriorityRating", lhsGovernmentPriorityRating), LocatorUtils.property(thatLocator, "governmentPriorityRating", rhsGovernmentPriorityRating), lhsGovernmentPriorityRating, rhsGovernmentPriorityRating, (this.governmentPriorityRating!= null), (that.governmentPriorityRating!= null))) {
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
            List<ProductLineItemType> lhsProductLineItem;
            lhsProductLineItem = (((this.productLineItem!= null)&&(!this.productLineItem.isEmpty()))?this.getProductLineItem():null);
            List<ProductLineItemType> rhsProductLineItem;
            rhsProductLineItem = (((that.productLineItem!= null)&&(!that.productLineItem.isEmpty()))?that.getProductLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productLineItem", lhsProductLineItem), LocatorUtils.property(thatLocator, "productLineItem", rhsProductLineItem), lhsProductLineItem, rhsProductLineItem, ((this.productLineItem!= null)&&(!this.productLineItem.isEmpty())), ((that.productLineItem!= null)&&(!that.productLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            PurchaseOrderChangeType lhsPurchaseOrderChangeType;
            lhsPurchaseOrderChangeType = this.getPurchaseOrderChangeType();
            PurchaseOrderChangeType rhsPurchaseOrderChangeType;
            rhsPurchaseOrderChangeType = that.getPurchaseOrderChangeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderChangeType", lhsPurchaseOrderChangeType), LocatorUtils.property(thatLocator, "purchaseOrderChangeType", rhsPurchaseOrderChangeType), lhsPurchaseOrderChangeType, rhsPurchaseOrderChangeType, (this.purchaseOrderChangeType!= null), (that.purchaseOrderChangeType!= null))) {
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
            BusinessDocumentReferenceType lhsPurchaseOrderIdentifier;
            lhsPurchaseOrderIdentifier = this.getPurchaseOrderIdentifier();
            BusinessDocumentReferenceType rhsPurchaseOrderIdentifier;
            rhsPurchaseOrderIdentifier = that.getPurchaseOrderIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderIdentifier", lhsPurchaseOrderIdentifier), LocatorUtils.property(thatLocator, "purchaseOrderIdentifier", rhsPurchaseOrderIdentifier), lhsPurchaseOrderIdentifier, rhsPurchaseOrderIdentifier, (this.purchaseOrderIdentifier!= null), (that.purchaseOrderIdentifier!= null))) {
                return false;
            }
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType> lhsPurchaseOrderType;
            lhsPurchaseOrderType = (((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty()))?this.getPurchaseOrderType():null);
            List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType> rhsPurchaseOrderType;
            rhsPurchaseOrderType = (((that.purchaseOrderType!= null)&&(!that.purchaseOrderType.isEmpty()))?that.getPurchaseOrderType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderType", lhsPurchaseOrderType), LocatorUtils.property(thatLocator, "purchaseOrderType", rhsPurchaseOrderType), lhsPurchaseOrderType, rhsPurchaseOrderType, ((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty())), ((that.purchaseOrderType!= null)&&(!that.purchaseOrderType.isEmpty())))) {
                return false;
            }
        }
        {
            DeliveryInformationType lhsReceivedQuantityInformation;
            lhsReceivedQuantityInformation = this.getReceivedQuantityInformation();
            DeliveryInformationType rhsReceivedQuantityInformation;
            rhsReceivedQuantityInformation = that.getReceivedQuantityInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivedQuantityInformation", lhsReceivedQuantityInformation), LocatorUtils.property(thatLocator, "receivedQuantityInformation", rhsReceivedQuantityInformation), lhsReceivedQuantityInformation, rhsReceivedQuantityInformation, (this.receivedQuantityInformation!= null), (that.receivedQuantityInformation!= null))) {
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
            SecondaryBuyer lhsSecondaryBuyer;
            lhsSecondaryBuyer = this.getSecondaryBuyer();
            SecondaryBuyer rhsSecondaryBuyer;
            rhsSecondaryBuyer = that.getSecondaryBuyer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secondaryBuyer", lhsSecondaryBuyer), LocatorUtils.property(thatLocator, "secondaryBuyer", rhsSecondaryBuyer), lhsSecondaryBuyer, rhsSecondaryBuyer, (this.secondaryBuyer!= null), (that.secondaryBuyer!= null))) {
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
            TaxExemptStatus lhsTaxExemptStatus;
            lhsTaxExemptStatus = this.getTaxExemptStatus();
            TaxExemptStatus rhsTaxExemptStatus;
            rhsTaxExemptStatus = that.getTaxExemptStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxExemptStatus", lhsTaxExemptStatus), LocatorUtils.property(thatLocator, "taxExemptStatus", rhsTaxExemptStatus), lhsTaxExemptStatus, rhsTaxExemptStatus, (this.taxExemptStatus!= null), (that.taxExemptStatus!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsTotalAmount;
            lhsTotalAmount = this.getTotalAmount();
            FinancialAmountType rhsTotalAmount;
            rhsTotalAmount = that.getTotalAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAmount", lhsTotalAmount), LocatorUtils.property(thatLocator, "totalAmount", rhsTotalAmount), lhsTotalAmount, rhsTotalAmount, (this.totalAmount!= null), (that.totalAmount!= null))) {
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
            AccountDescription theAccountDescription;
            theAccountDescription = this.getAccountDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountDescription", theAccountDescription), currentHashCode, theAccountDescription, (this.accountDescription!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
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
            XMLGregorianCalendar theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate, (this.date!= null));
        }
        {
            List<FinancingTerms> theFinancingTerms;
            theFinancingTerms = (((this.financingTerms!= null)&&(!this.financingTerms.isEmpty()))?this.getFinancingTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financingTerms", theFinancingTerms), currentHashCode, theFinancingTerms, ((this.financingTerms!= null)&&(!this.financingTerms.isEmpty())));
        }
        {
            BusinessDocumentReferenceType theGeneralServicesAdministrationNumber;
            theGeneralServicesAdministrationNumber = this.getGeneralServicesAdministrationNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "generalServicesAdministrationNumber", theGeneralServicesAdministrationNumber), currentHashCode, theGeneralServicesAdministrationNumber, (this.generalServicesAdministrationNumber!= null));
        }
        {
            BusinessDocumentReferenceType theGovernmentContractIdentifier;
            theGovernmentContractIdentifier = this.getGovernmentContractIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "governmentContractIdentifier", theGovernmentContractIdentifier), currentHashCode, theGovernmentContractIdentifier, (this.governmentContractIdentifier!= null));
        }
        {
            GovernmentPriorityRating theGovernmentPriorityRating;
            theGovernmentPriorityRating = this.getGovernmentPriorityRating();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "governmentPriorityRating", theGovernmentPriorityRating), currentHashCode, theGovernmentPriorityRating, (this.governmentPriorityRating!= null));
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
            List<ProductLineItemType> theProductLineItem;
            theProductLineItem = (((this.productLineItem!= null)&&(!this.productLineItem.isEmpty()))?this.getProductLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLineItem", theProductLineItem), currentHashCode, theProductLineItem, ((this.productLineItem!= null)&&(!this.productLineItem.isEmpty())));
        }
        {
            PurchaseOrderChangeType thePurchaseOrderChangeType;
            thePurchaseOrderChangeType = this.getPurchaseOrderChangeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderChangeType", thePurchaseOrderChangeType), currentHashCode, thePurchaseOrderChangeType, (this.purchaseOrderChangeType!= null));
        }
        {
            PurchaseOrderFillPriority thePurchaseOrderFillPriority;
            thePurchaseOrderFillPriority = this.getPurchaseOrderFillPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderFillPriority", thePurchaseOrderFillPriority), currentHashCode, thePurchaseOrderFillPriority, (this.purchaseOrderFillPriority!= null));
        }
        {
            BusinessDocumentReferenceType thePurchaseOrderIdentifier;
            thePurchaseOrderIdentifier = this.getPurchaseOrderIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderIdentifier", thePurchaseOrderIdentifier), currentHashCode, thePurchaseOrderIdentifier, (this.purchaseOrderIdentifier!= null));
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType> thePurchaseOrderType;
            thePurchaseOrderType = (((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty()))?this.getPurchaseOrderType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderType", thePurchaseOrderType), currentHashCode, thePurchaseOrderType, ((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty())));
        }
        {
            DeliveryInformationType theReceivedQuantityInformation;
            theReceivedQuantityInformation = this.getReceivedQuantityInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivedQuantityInformation", theReceivedQuantityInformation), currentHashCode, theReceivedQuantityInformation, (this.receivedQuantityInformation!= null));
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
            SecondaryBuyer theSecondaryBuyer;
            theSecondaryBuyer = this.getSecondaryBuyer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondaryBuyer", theSecondaryBuyer), currentHashCode, theSecondaryBuyer, (this.secondaryBuyer!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipTo", theShipTo), currentHashCode, theShipTo, (this.shipTo!= null));
        }
        {
            TaxExemptStatus theTaxExemptStatus;
            theTaxExemptStatus = this.getTaxExemptStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxExemptStatus", theTaxExemptStatus), currentHashCode, theTaxExemptStatus, (this.taxExemptStatus!= null));
        }
        {
            FinancialAmountType theTotalAmount;
            theTotalAmount = this.getTotalAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmount", theTotalAmount), currentHashCode, theTotalAmount, (this.totalAmount!= null));
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
            AccountDescription theAccountDescription;
            theAccountDescription = this.getAccountDescription();
            strategy.appendField(locator, this, "accountDescription", buffer, theAccountDescription, (this.accountDescription!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
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
            XMLGregorianCalendar theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate, (this.date!= null));
        }
        {
            List<FinancingTerms> theFinancingTerms;
            theFinancingTerms = (((this.financingTerms!= null)&&(!this.financingTerms.isEmpty()))?this.getFinancingTerms():null);
            strategy.appendField(locator, this, "financingTerms", buffer, theFinancingTerms, ((this.financingTerms!= null)&&(!this.financingTerms.isEmpty())));
        }
        {
            BusinessDocumentReferenceType theGeneralServicesAdministrationNumber;
            theGeneralServicesAdministrationNumber = this.getGeneralServicesAdministrationNumber();
            strategy.appendField(locator, this, "generalServicesAdministrationNumber", buffer, theGeneralServicesAdministrationNumber, (this.generalServicesAdministrationNumber!= null));
        }
        {
            BusinessDocumentReferenceType theGovernmentContractIdentifier;
            theGovernmentContractIdentifier = this.getGovernmentContractIdentifier();
            strategy.appendField(locator, this, "governmentContractIdentifier", buffer, theGovernmentContractIdentifier, (this.governmentContractIdentifier!= null));
        }
        {
            GovernmentPriorityRating theGovernmentPriorityRating;
            theGovernmentPriorityRating = this.getGovernmentPriorityRating();
            strategy.appendField(locator, this, "governmentPriorityRating", buffer, theGovernmentPriorityRating, (this.governmentPriorityRating!= null));
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
            List<ProductLineItemType> theProductLineItem;
            theProductLineItem = (((this.productLineItem!= null)&&(!this.productLineItem.isEmpty()))?this.getProductLineItem():null);
            strategy.appendField(locator, this, "productLineItem", buffer, theProductLineItem, ((this.productLineItem!= null)&&(!this.productLineItem.isEmpty())));
        }
        {
            PurchaseOrderChangeType thePurchaseOrderChangeType;
            thePurchaseOrderChangeType = this.getPurchaseOrderChangeType();
            strategy.appendField(locator, this, "purchaseOrderChangeType", buffer, thePurchaseOrderChangeType, (this.purchaseOrderChangeType!= null));
        }
        {
            PurchaseOrderFillPriority thePurchaseOrderFillPriority;
            thePurchaseOrderFillPriority = this.getPurchaseOrderFillPriority();
            strategy.appendField(locator, this, "purchaseOrderFillPriority", buffer, thePurchaseOrderFillPriority, (this.purchaseOrderFillPriority!= null));
        }
        {
            BusinessDocumentReferenceType thePurchaseOrderIdentifier;
            thePurchaseOrderIdentifier = this.getPurchaseOrderIdentifier();
            strategy.appendField(locator, this, "purchaseOrderIdentifier", buffer, thePurchaseOrderIdentifier, (this.purchaseOrderIdentifier!= null));
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType> thePurchaseOrderType;
            thePurchaseOrderType = (((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty()))?this.getPurchaseOrderType():null);
            strategy.appendField(locator, this, "purchaseOrderType", buffer, thePurchaseOrderType, ((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty())));
        }
        {
            DeliveryInformationType theReceivedQuantityInformation;
            theReceivedQuantityInformation = this.getReceivedQuantityInformation();
            strategy.appendField(locator, this, "receivedQuantityInformation", buffer, theReceivedQuantityInformation, (this.receivedQuantityInformation!= null));
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
            SecondaryBuyer theSecondaryBuyer;
            theSecondaryBuyer = this.getSecondaryBuyer();
            strategy.appendField(locator, this, "secondaryBuyer", buffer, theSecondaryBuyer, (this.secondaryBuyer!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            strategy.appendField(locator, this, "shipTo", buffer, theShipTo, (this.shipTo!= null));
        }
        {
            TaxExemptStatus theTaxExemptStatus;
            theTaxExemptStatus = this.getTaxExemptStatus();
            strategy.appendField(locator, this, "taxExemptStatus", buffer, theTaxExemptStatus, (this.taxExemptStatus!= null));
        }
        {
            FinancialAmountType theTotalAmount;
            theTotalAmount = this.getTotalAmount();
            strategy.appendField(locator, this, "totalAmount", buffer, theTotalAmount, (this.totalAmount!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
