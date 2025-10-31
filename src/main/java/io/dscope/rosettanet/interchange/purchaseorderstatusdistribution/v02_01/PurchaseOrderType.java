
package io.dscope.rosettanet.interchange.purchaseorderstatusdistribution.v02_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_03.GovernmentPriorityRating;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderacknowledgmentreason.v01_04.PurchaseOrderAcknowledgmentReason;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03.PurchaseOrderFillPriority;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_06.PurchaseOrderStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.AccountDescription;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.FinancingTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.OrderShippingInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.SecondaryBuyer;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TaxExemptStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TaxSummary;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TransportationEventType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductPricingType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.locations.v01_04.LocationType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
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
 * <p>Java class for PurchaseOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}AccountDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ContractInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}FinancingTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GeneralServicesAdministrationNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03}GovernmentPriorityRating" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element name="OrderLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01}OrderLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}OrderShippingInformation" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04}PurchaseOrderAcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03}PurchaseOrderFillPriority" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06}PurchaseOrderStatus"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05}PurchaseOrderType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RequestedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedShipFrom" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}SecondaryBuyer" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentStatusInformation" type="{urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01}ShipmentStatusInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShippedQuantityInformation" type="{urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01}ShippedQuantityInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TaxSummary" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
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
    "lineNumber",
    "listPrice",
    "orderLineItem",
    "orderShippingInformation",
    "originalScheduledEvent",
    "partnerDescription",
    "productInformation",
    "purchaseOrderAcknowledgmentReason",
    "purchaseOrderFillPriority",
    "purchaseOrderIdentifier",
    "purchaseOrderStatus",
    "purchaseOrderType",
    "requestedEvent",
    "requestedShipFrom",
    "responseDescription",
    "revisionNumber",
    "scheduledEvent",
    "secondaryBuyer",
    "shipmentStatusInformation",
    "shippedQuantityInformation",
    "taxExemptStatus",
    "taxSummary",
    "totalAmount"
})
public class PurchaseOrderType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AccountDescription", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = AccountDescription.class, required = false)
    protected AccountDescription accountDescription;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ContractInformation.class, required = false)
    protected List<ContractInformation> contractInformation;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "FinancingTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = FinancingTerms.class, required = false)
    protected List<FinancingTerms> financingTerms;
    @XmlElement(name = "GeneralServicesAdministrationNumber")
    protected BusinessDocumentReferenceType generalServicesAdministrationNumber;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElementRef(name = "GovernmentPriorityRating", namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", type = GovernmentPriorityRating.class, required = false)
    protected GovernmentPriorityRating governmentPriorityRating;
    @XmlElement(name = "LineNumber")
    protected String lineNumber;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElement(name = "OrderLineItem", required = true)
    protected List<OrderLineItemType> orderLineItem;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = OrderShippingInformation.class, required = false)
    protected OrderShippingInformation orderShippingInformation;
    @XmlElement(name = "OriginalScheduledEvent")
    protected List<TransportationEventType> originalScheduledEvent;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "ProductInformation")
    protected String productInformation;
    @XmlElementRef(name = "PurchaseOrderAcknowledgmentReason", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04", type = PurchaseOrderAcknowledgmentReason.class, required = false)
    protected List<PurchaseOrderAcknowledgmentReason> purchaseOrderAcknowledgmentReason;
    @XmlElementRef(name = "PurchaseOrderFillPriority", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", type = PurchaseOrderFillPriority.class, required = false)
    protected PurchaseOrderFillPriority purchaseOrderFillPriority;
    @XmlElement(name = "PurchaseOrderIdentifier", required = true)
    protected BusinessDocumentReferenceType purchaseOrderIdentifier;
    @XmlElementRef(name = "PurchaseOrderStatus", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06", type = PurchaseOrderStatus.class)
    protected PurchaseOrderStatus purchaseOrderStatus;
    @XmlElementRef(name = "PurchaseOrderType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05", type = io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType.class)
    protected List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType> purchaseOrderType;
    @XmlElement(name = "RequestedEvent")
    protected TransportationEventType requestedEvent;
    @XmlElement(name = "RequestedShipFrom")
    protected List<LocationType> requestedShipFrom;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
    @XmlElement(name = "ScheduledEvent")
    protected List<TransportationEventType> scheduledEvent;
    @XmlElementRef(name = "SecondaryBuyer", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = SecondaryBuyer.class, required = false)
    protected SecondaryBuyer secondaryBuyer;
    @XmlElement(name = "ShipmentStatusInformation")
    protected List<ShipmentStatusInformationType> shipmentStatusInformation;
    @XmlElement(name = "ShippedQuantityInformation")
    protected List<ShippedQuantityInformationType> shippedQuantityInformation;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElementRef(name = "TaxSummary", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = TaxSummary.class, required = false)
    protected TaxSummary taxSummary;
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
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setListPrice(ProductPricingType value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the orderLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderLineItemType }
     * 
     * 
     */
    public List<OrderLineItemType> getOrderLineItem() {
        if (orderLineItem == null) {
            orderLineItem = new ArrayList<OrderLineItemType>();
        }
        return this.orderLineItem;
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
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
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
     * {@link io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType }
     * 
     * 
     */
    public List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType> getPurchaseOrderType() {
        if (purchaseOrderType == null) {
            purchaseOrderType = new ArrayList<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType>();
        }
        return this.purchaseOrderType;
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
     * Gets the value of the responseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDescription() {
        return responseDescription;
    }

    /**
     * Sets the value of the responseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDescription(String value) {
        this.responseDescription = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduledEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduledEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationEventType }
     * 
     * 
     */
    public List<TransportationEventType> getScheduledEvent() {
        if (scheduledEvent == null) {
            scheduledEvent = new ArrayList<TransportationEventType>();
        }
        return this.scheduledEvent;
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
     * Gets the value of the shipmentStatusInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStatusInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStatusInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStatusInformationType }
     * 
     * 
     */
    public List<ShipmentStatusInformationType> getShipmentStatusInformation() {
        if (shipmentStatusInformation == null) {
            shipmentStatusInformation = new ArrayList<ShipmentStatusInformationType>();
        }
        return this.shipmentStatusInformation;
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
     * {@link ShippedQuantityInformationType }
     * 
     * 
     */
    public List<ShippedQuantityInformationType> getShippedQuantityInformation() {
        if (shippedQuantityInformation == null) {
            shippedQuantityInformation = new ArrayList<ShippedQuantityInformationType>();
        }
        return this.shippedQuantityInformation;
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
     * Gets the value of the taxSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummary }
     *     
     */
    public TaxSummary getTaxSummary() {
        return taxSummary;
    }

    /**
     * Sets the value of the taxSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummary }
     *     
     */
    public void setTaxSummary(TaxSummary value) {
        this.taxSummary = value;
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
            String lhsLineNumber;
            lhsLineNumber = this.getLineNumber();
            String rhsLineNumber;
            rhsLineNumber = that.getLineNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineNumber", lhsLineNumber), LocatorUtils.property(thatLocator, "lineNumber", rhsLineNumber), lhsLineNumber, rhsLineNumber, (this.lineNumber!= null), (that.lineNumber!= null))) {
                return false;
            }
        }
        {
            ProductPricingType lhsListPrice;
            lhsListPrice = this.getListPrice();
            ProductPricingType rhsListPrice;
            rhsListPrice = that.getListPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listPrice", lhsListPrice), LocatorUtils.property(thatLocator, "listPrice", rhsListPrice), lhsListPrice, rhsListPrice, (this.listPrice!= null), (that.listPrice!= null))) {
                return false;
            }
        }
        {
            List<OrderLineItemType> lhsOrderLineItem;
            lhsOrderLineItem = (((this.orderLineItem!= null)&&(!this.orderLineItem.isEmpty()))?this.getOrderLineItem():null);
            List<OrderLineItemType> rhsOrderLineItem;
            rhsOrderLineItem = (((that.orderLineItem!= null)&&(!that.orderLineItem.isEmpty()))?that.getOrderLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderLineItem", lhsOrderLineItem), LocatorUtils.property(thatLocator, "orderLineItem", rhsOrderLineItem), lhsOrderLineItem, rhsOrderLineItem, ((this.orderLineItem!= null)&&(!this.orderLineItem.isEmpty())), ((that.orderLineItem!= null)&&(!that.orderLineItem.isEmpty())))) {
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
            List<PartnerDescription> lhsPartnerDescription;
            lhsPartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            List<PartnerDescription> rhsPartnerDescription;
            rhsPartnerDescription = (((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty()))?that.getPartnerDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())), ((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty())))) {
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
            List<PurchaseOrderAcknowledgmentReason> lhsPurchaseOrderAcknowledgmentReason;
            lhsPurchaseOrderAcknowledgmentReason = (((this.purchaseOrderAcknowledgmentReason!= null)&&(!this.purchaseOrderAcknowledgmentReason.isEmpty()))?this.getPurchaseOrderAcknowledgmentReason():null);
            List<PurchaseOrderAcknowledgmentReason> rhsPurchaseOrderAcknowledgmentReason;
            rhsPurchaseOrderAcknowledgmentReason = (((that.purchaseOrderAcknowledgmentReason!= null)&&(!that.purchaseOrderAcknowledgmentReason.isEmpty()))?that.getPurchaseOrderAcknowledgmentReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderAcknowledgmentReason", lhsPurchaseOrderAcknowledgmentReason), LocatorUtils.property(thatLocator, "purchaseOrderAcknowledgmentReason", rhsPurchaseOrderAcknowledgmentReason), lhsPurchaseOrderAcknowledgmentReason, rhsPurchaseOrderAcknowledgmentReason, ((this.purchaseOrderAcknowledgmentReason!= null)&&(!this.purchaseOrderAcknowledgmentReason.isEmpty())), ((that.purchaseOrderAcknowledgmentReason!= null)&&(!that.purchaseOrderAcknowledgmentReason.isEmpty())))) {
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
            PurchaseOrderStatus lhsPurchaseOrderStatus;
            lhsPurchaseOrderStatus = this.getPurchaseOrderStatus();
            PurchaseOrderStatus rhsPurchaseOrderStatus;
            rhsPurchaseOrderStatus = that.getPurchaseOrderStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderStatus", lhsPurchaseOrderStatus), LocatorUtils.property(thatLocator, "purchaseOrderStatus", rhsPurchaseOrderStatus), lhsPurchaseOrderStatus, rhsPurchaseOrderStatus, (this.purchaseOrderStatus!= null), (that.purchaseOrderStatus!= null))) {
                return false;
            }
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType> lhsPurchaseOrderType;
            lhsPurchaseOrderType = (((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty()))?this.getPurchaseOrderType():null);
            List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType> rhsPurchaseOrderType;
            rhsPurchaseOrderType = (((that.purchaseOrderType!= null)&&(!that.purchaseOrderType.isEmpty()))?that.getPurchaseOrderType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderType", lhsPurchaseOrderType), LocatorUtils.property(thatLocator, "purchaseOrderType", rhsPurchaseOrderType), lhsPurchaseOrderType, rhsPurchaseOrderType, ((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty())), ((that.purchaseOrderType!= null)&&(!that.purchaseOrderType.isEmpty())))) {
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
            String lhsResponseDescription;
            lhsResponseDescription = this.getResponseDescription();
            String rhsResponseDescription;
            rhsResponseDescription = that.getResponseDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseDescription", lhsResponseDescription), LocatorUtils.property(thatLocator, "responseDescription", rhsResponseDescription), lhsResponseDescription, rhsResponseDescription, (this.responseDescription!= null), (that.responseDescription!= null))) {
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
            List<TransportationEventType> lhsScheduledEvent;
            lhsScheduledEvent = (((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty()))?this.getScheduledEvent():null);
            List<TransportationEventType> rhsScheduledEvent;
            rhsScheduledEvent = (((that.scheduledEvent!= null)&&(!that.scheduledEvent.isEmpty()))?that.getScheduledEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledEvent", lhsScheduledEvent), LocatorUtils.property(thatLocator, "scheduledEvent", rhsScheduledEvent), lhsScheduledEvent, rhsScheduledEvent, ((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty())), ((that.scheduledEvent!= null)&&(!that.scheduledEvent.isEmpty())))) {
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
            List<ShipmentStatusInformationType> lhsShipmentStatusInformation;
            lhsShipmentStatusInformation = (((this.shipmentStatusInformation!= null)&&(!this.shipmentStatusInformation.isEmpty()))?this.getShipmentStatusInformation():null);
            List<ShipmentStatusInformationType> rhsShipmentStatusInformation;
            rhsShipmentStatusInformation = (((that.shipmentStatusInformation!= null)&&(!that.shipmentStatusInformation.isEmpty()))?that.getShipmentStatusInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentStatusInformation", lhsShipmentStatusInformation), LocatorUtils.property(thatLocator, "shipmentStatusInformation", rhsShipmentStatusInformation), lhsShipmentStatusInformation, rhsShipmentStatusInformation, ((this.shipmentStatusInformation!= null)&&(!this.shipmentStatusInformation.isEmpty())), ((that.shipmentStatusInformation!= null)&&(!that.shipmentStatusInformation.isEmpty())))) {
                return false;
            }
        }
        {
            List<ShippedQuantityInformationType> lhsShippedQuantityInformation;
            lhsShippedQuantityInformation = (((this.shippedQuantityInformation!= null)&&(!this.shippedQuantityInformation.isEmpty()))?this.getShippedQuantityInformation():null);
            List<ShippedQuantityInformationType> rhsShippedQuantityInformation;
            rhsShippedQuantityInformation = (((that.shippedQuantityInformation!= null)&&(!that.shippedQuantityInformation.isEmpty()))?that.getShippedQuantityInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippedQuantityInformation", lhsShippedQuantityInformation), LocatorUtils.property(thatLocator, "shippedQuantityInformation", rhsShippedQuantityInformation), lhsShippedQuantityInformation, rhsShippedQuantityInformation, ((this.shippedQuantityInformation!= null)&&(!this.shippedQuantityInformation.isEmpty())), ((that.shippedQuantityInformation!= null)&&(!that.shippedQuantityInformation.isEmpty())))) {
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
            TaxSummary lhsTaxSummary;
            lhsTaxSummary = this.getTaxSummary();
            TaxSummary rhsTaxSummary;
            rhsTaxSummary = that.getTaxSummary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxSummary", lhsTaxSummary), LocatorUtils.property(thatLocator, "taxSummary", rhsTaxSummary), lhsTaxSummary, rhsTaxSummary, (this.taxSummary!= null), (that.taxSummary!= null))) {
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
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            ProductPricingType theListPrice;
            theListPrice = this.getListPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listPrice", theListPrice), currentHashCode, theListPrice, (this.listPrice!= null));
        }
        {
            List<OrderLineItemType> theOrderLineItem;
            theOrderLineItem = (((this.orderLineItem!= null)&&(!this.orderLineItem.isEmpty()))?this.getOrderLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderLineItem", theOrderLineItem), currentHashCode, theOrderLineItem, ((this.orderLineItem!= null)&&(!this.orderLineItem.isEmpty())));
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
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            String theProductInformation;
            theProductInformation = this.getProductInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productInformation", theProductInformation), currentHashCode, theProductInformation, (this.productInformation!= null));
        }
        {
            List<PurchaseOrderAcknowledgmentReason> thePurchaseOrderAcknowledgmentReason;
            thePurchaseOrderAcknowledgmentReason = (((this.purchaseOrderAcknowledgmentReason!= null)&&(!this.purchaseOrderAcknowledgmentReason.isEmpty()))?this.getPurchaseOrderAcknowledgmentReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderAcknowledgmentReason", thePurchaseOrderAcknowledgmentReason), currentHashCode, thePurchaseOrderAcknowledgmentReason, ((this.purchaseOrderAcknowledgmentReason!= null)&&(!this.purchaseOrderAcknowledgmentReason.isEmpty())));
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
            PurchaseOrderStatus thePurchaseOrderStatus;
            thePurchaseOrderStatus = this.getPurchaseOrderStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderStatus", thePurchaseOrderStatus), currentHashCode, thePurchaseOrderStatus, (this.purchaseOrderStatus!= null));
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType> thePurchaseOrderType;
            thePurchaseOrderType = (((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty()))?this.getPurchaseOrderType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderType", thePurchaseOrderType), currentHashCode, thePurchaseOrderType, ((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty())));
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
            String theResponseDescription;
            theResponseDescription = this.getResponseDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseDescription", theResponseDescription), currentHashCode, theResponseDescription, (this.responseDescription!= null));
        }
        {
            String theRevisionNumber;
            theRevisionNumber = this.getRevisionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revisionNumber", theRevisionNumber), currentHashCode, theRevisionNumber, (this.revisionNumber!= null));
        }
        {
            List<TransportationEventType> theScheduledEvent;
            theScheduledEvent = (((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty()))?this.getScheduledEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledEvent", theScheduledEvent), currentHashCode, theScheduledEvent, ((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty())));
        }
        {
            SecondaryBuyer theSecondaryBuyer;
            theSecondaryBuyer = this.getSecondaryBuyer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondaryBuyer", theSecondaryBuyer), currentHashCode, theSecondaryBuyer, (this.secondaryBuyer!= null));
        }
        {
            List<ShipmentStatusInformationType> theShipmentStatusInformation;
            theShipmentStatusInformation = (((this.shipmentStatusInformation!= null)&&(!this.shipmentStatusInformation.isEmpty()))?this.getShipmentStatusInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentStatusInformation", theShipmentStatusInformation), currentHashCode, theShipmentStatusInformation, ((this.shipmentStatusInformation!= null)&&(!this.shipmentStatusInformation.isEmpty())));
        }
        {
            List<ShippedQuantityInformationType> theShippedQuantityInformation;
            theShippedQuantityInformation = (((this.shippedQuantityInformation!= null)&&(!this.shippedQuantityInformation.isEmpty()))?this.getShippedQuantityInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippedQuantityInformation", theShippedQuantityInformation), currentHashCode, theShippedQuantityInformation, ((this.shippedQuantityInformation!= null)&&(!this.shippedQuantityInformation.isEmpty())));
        }
        {
            TaxExemptStatus theTaxExemptStatus;
            theTaxExemptStatus = this.getTaxExemptStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxExemptStatus", theTaxExemptStatus), currentHashCode, theTaxExemptStatus, (this.taxExemptStatus!= null));
        }
        {
            TaxSummary theTaxSummary;
            theTaxSummary = this.getTaxSummary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxSummary", theTaxSummary), currentHashCode, theTaxSummary, (this.taxSummary!= null));
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
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            ProductPricingType theListPrice;
            theListPrice = this.getListPrice();
            strategy.appendField(locator, this, "listPrice", buffer, theListPrice, (this.listPrice!= null));
        }
        {
            List<OrderLineItemType> theOrderLineItem;
            theOrderLineItem = (((this.orderLineItem!= null)&&(!this.orderLineItem.isEmpty()))?this.getOrderLineItem():null);
            strategy.appendField(locator, this, "orderLineItem", buffer, theOrderLineItem, ((this.orderLineItem!= null)&&(!this.orderLineItem.isEmpty())));
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
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            String theProductInformation;
            theProductInformation = this.getProductInformation();
            strategy.appendField(locator, this, "productInformation", buffer, theProductInformation, (this.productInformation!= null));
        }
        {
            List<PurchaseOrderAcknowledgmentReason> thePurchaseOrderAcknowledgmentReason;
            thePurchaseOrderAcknowledgmentReason = (((this.purchaseOrderAcknowledgmentReason!= null)&&(!this.purchaseOrderAcknowledgmentReason.isEmpty()))?this.getPurchaseOrderAcknowledgmentReason():null);
            strategy.appendField(locator, this, "purchaseOrderAcknowledgmentReason", buffer, thePurchaseOrderAcknowledgmentReason, ((this.purchaseOrderAcknowledgmentReason!= null)&&(!this.purchaseOrderAcknowledgmentReason.isEmpty())));
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
            PurchaseOrderStatus thePurchaseOrderStatus;
            thePurchaseOrderStatus = this.getPurchaseOrderStatus();
            strategy.appendField(locator, this, "purchaseOrderStatus", buffer, thePurchaseOrderStatus, (this.purchaseOrderStatus!= null));
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType> thePurchaseOrderType;
            thePurchaseOrderType = (((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty()))?this.getPurchaseOrderType():null);
            strategy.appendField(locator, this, "purchaseOrderType", buffer, thePurchaseOrderType, ((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty())));
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
            String theResponseDescription;
            theResponseDescription = this.getResponseDescription();
            strategy.appendField(locator, this, "responseDescription", buffer, theResponseDescription, (this.responseDescription!= null));
        }
        {
            String theRevisionNumber;
            theRevisionNumber = this.getRevisionNumber();
            strategy.appendField(locator, this, "revisionNumber", buffer, theRevisionNumber, (this.revisionNumber!= null));
        }
        {
            List<TransportationEventType> theScheduledEvent;
            theScheduledEvent = (((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty()))?this.getScheduledEvent():null);
            strategy.appendField(locator, this, "scheduledEvent", buffer, theScheduledEvent, ((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty())));
        }
        {
            SecondaryBuyer theSecondaryBuyer;
            theSecondaryBuyer = this.getSecondaryBuyer();
            strategy.appendField(locator, this, "secondaryBuyer", buffer, theSecondaryBuyer, (this.secondaryBuyer!= null));
        }
        {
            List<ShipmentStatusInformationType> theShipmentStatusInformation;
            theShipmentStatusInformation = (((this.shipmentStatusInformation!= null)&&(!this.shipmentStatusInformation.isEmpty()))?this.getShipmentStatusInformation():null);
            strategy.appendField(locator, this, "shipmentStatusInformation", buffer, theShipmentStatusInformation, ((this.shipmentStatusInformation!= null)&&(!this.shipmentStatusInformation.isEmpty())));
        }
        {
            List<ShippedQuantityInformationType> theShippedQuantityInformation;
            theShippedQuantityInformation = (((this.shippedQuantityInformation!= null)&&(!this.shippedQuantityInformation.isEmpty()))?this.getShippedQuantityInformation():null);
            strategy.appendField(locator, this, "shippedQuantityInformation", buffer, theShippedQuantityInformation, ((this.shippedQuantityInformation!= null)&&(!this.shippedQuantityInformation.isEmpty())));
        }
        {
            TaxExemptStatus theTaxExemptStatus;
            theTaxExemptStatus = this.getTaxExemptStatus();
            strategy.appendField(locator, this, "taxExemptStatus", buffer, theTaxExemptStatus, (this.taxExemptStatus!= null));
        }
        {
            TaxSummary theTaxSummary;
            theTaxSummary = this.getTaxSummary();
            strategy.appendField(locator, this, "taxSummary", buffer, theTaxSummary, (this.taxSummary!= null));
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
