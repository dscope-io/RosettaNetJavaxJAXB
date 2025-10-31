
package io.dscope.rosettanet.interchange.purchaseorderconfirmation.v02_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.confirmationtype.v01_03.ConfirmationType;
import io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_03.GovernmentPriorityRating;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderacknowledgmentreason.v01_03.PurchaseOrderAcknowledgmentReason;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03.PurchaseOrderFillPriority;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_03.PurchaseOrderStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.AccountDescription;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.FinancingTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.OrderShippingInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.SecondaryBuyer;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.SpecialDiscount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.TaxExemptStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.TransportationEventType;
import io.dscope.rosettanet.domain.shared.shared.v01_04.MonetaryAmountType;
import io.dscope.rosettanet.domain.shared.shared.v01_04.ProductPricingType;
import io.dscope.rosettanet.universal.document.v01_03.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_03.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.locations.v01_03.Location;
import io.dscope.rosettanet.universal.partneridentification.v01_07.SpecifiedPartnerDescriptionType;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dct="urn:rosettanet:specification:domain:Procurement:ConfirmationType:xsd:codelist:01.03" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05" xmlns:dpoar="urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.03" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpos="urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.03" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01" xmlns:p469900_="http://java.sun.com/xml/ns/jaxb" xmlns:p879019_="http://annox.dev.java.net" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.04" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.00" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.03" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.03" xmlns:ume="urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.02" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In PurchaseOrder, at least one occurrence of FinancingTerms/PaymentTerms/NetTerms/Day or FinancingTerms/PaymentTerms/NetTerms/Days.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dct="urn:rosettanet:specification:domain:Procurement:ConfirmationType:xsd:codelist:01.03" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05" xmlns:dpoar="urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.03" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpos="urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.03" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01" xmlns:p469900_="http://java.sun.com/xml/ns/jaxb" xmlns:p879019_="http://annox.dev.java.net" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.04" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.00" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.03" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.03" xmlns:ume="urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.02" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In PurchaseOrder, at least one occurrence of OrderShippingInformation/SpecialHandlingInstruction/Text or OrderShippingInformation/SpecialHandlingInstruction/SpecialHandling.&lt;/urss:Constraint&gt;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}AccountDescription" minOccurs="0"/&gt;
 *         &lt;element name="BillTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.03}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ConfirmationType:xsd:codelist:01.03}ConfirmationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}ContractInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContractOwner" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}FinancingTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.03}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03}GovernmentPriorityRating" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallAt" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="IsDropShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.03}Location" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.00}OrderLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}OrderShippingInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.03}PurchaseOrderAcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03}PurchaseOrderFillPriority" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.03}PurchaseOrderStatus"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04}PurchaseOrderType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RequestedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element name="RespondTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}SecondaryBuyer" minOccurs="0"/&gt;
 *         &lt;element name="ShipFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element name="TaxSummary" type="{urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.00}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}MonetaryAmountType" minOccurs="0"/&gt;
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
    "billTo",
    "businessDocumentReference",
    "comments",
    "confirmationType",
    "contractInformation",
    "contractOwner",
    "financingTerms",
    "governmentContractIdentifier",
    "governmentPriorityRating",
    "information",
    "installAt",
    "isDropShip",
    "listPrice",
    "location",
    "orderLineItem",
    "orderShippingInformation",
    "purchaseOrderAcknowledgmentReason",
    "purchaseOrderFillPriority",
    "purchaseOrderStatus",
    "purchaseOrderType",
    "requestedEvent",
    "respondTo",
    "responseDescription",
    "scheduledEvent",
    "secondaryBuyer",
    "shipFrom",
    "shipTo",
    "specialDiscount",
    "taxExemptStatus",
    "taxSummary",
    "totalAmount"
})
public class PurchaseOrderType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AccountDescription", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = AccountDescription.class, required = false)
    protected AccountDescription accountDescription;
    @XmlElement(name = "BillTo")
    protected SpecifiedPartnerDescriptionType billTo;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.03", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "ConfirmationType", namespace = "urn:rosettanet:specification:domain:Procurement:ConfirmationType:xsd:codelist:01.03", type = ConfirmationType.class, required = false)
    protected ConfirmationType confirmationType;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = ContractInformation.class, required = false)
    protected List<ContractInformation> contractInformation;
    @XmlElement(name = "ContractOwner")
    protected SpecifiedPartnerDescriptionType contractOwner;
    @XmlElementRef(name = "FinancingTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = FinancingTerms.class, required = false)
    protected List<FinancingTerms> financingTerms;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElementRef(name = "GovernmentPriorityRating", namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", type = GovernmentPriorityRating.class, required = false)
    protected GovernmentPriorityRating governmentPriorityRating;
    @XmlElement(name = "Information")
    protected String information;
    @XmlElement(name = "InstallAt")
    protected SpecifiedPartnerDescriptionType installAt;
    @XmlElement(name = "IsDropShip")
    protected boolean isDropShip;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElementRef(name = "Location", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.03", type = Location.class, required = false)
    protected List<Location> location;
    @XmlElement(name = "OrderLineItem", required = true)
    protected List<OrderLineItemType> orderLineItem;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = OrderShippingInformation.class, required = false)
    protected OrderShippingInformation orderShippingInformation;
    @XmlElementRef(name = "PurchaseOrderAcknowledgmentReason", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.03", type = PurchaseOrderAcknowledgmentReason.class, required = false)
    protected List<PurchaseOrderAcknowledgmentReason> purchaseOrderAcknowledgmentReason;
    @XmlElementRef(name = "PurchaseOrderFillPriority", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", type = PurchaseOrderFillPriority.class, required = false)
    protected PurchaseOrderFillPriority purchaseOrderFillPriority;
    @XmlElementRef(name = "PurchaseOrderStatus", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.03", type = PurchaseOrderStatus.class)
    protected PurchaseOrderStatus purchaseOrderStatus;
    @XmlElementRef(name = "PurchaseOrderType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04", type = io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType.class)
    protected List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType> purchaseOrderType;
    @XmlElement(name = "RequestedEvent")
    protected TransportationEventType requestedEvent;
    @XmlElement(name = "RespondTo")
    protected List<SpecifiedPartnerDescriptionType> respondTo;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElement(name = "ScheduledEvent")
    protected TransportationEventType scheduledEvent;
    @XmlElementRef(name = "SecondaryBuyer", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = SecondaryBuyer.class, required = false)
    protected SecondaryBuyer secondaryBuyer;
    @XmlElement(name = "ShipFrom")
    protected List<SpecifiedPartnerDescriptionType> shipFrom;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElement(name = "TaxSummary")
    protected TaxSummaryType taxSummary;
    @XmlElement(name = "TotalAmount")
    protected MonetaryAmountType totalAmount;
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
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setBillTo(SpecifiedPartnerDescriptionType value) {
        this.billTo = value;
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
     * Gets the value of the confirmationType property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationType }
     *     
     */
    public ConfirmationType getConfirmationType() {
        return confirmationType;
    }

    /**
     * Sets the value of the confirmationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationType }
     *     
     */
    public void setConfirmationType(ConfirmationType value) {
        this.confirmationType = value;
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
     * Gets the value of the contractOwner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getContractOwner() {
        return contractOwner;
    }

    /**
     * Sets the value of the contractOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setContractOwner(SpecifiedPartnerDescriptionType value) {
        this.contractOwner = value;
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
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocation() {
        if (location == null) {
            location = new ArrayList<Location>();
        }
        return this.location;
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
     * Gets the value of the respondTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respondTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespondTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedPartnerDescriptionType }
     * 
     * 
     */
    public List<SpecifiedPartnerDescriptionType> getRespondTo() {
        if (respondTo == null) {
            respondTo = new ArrayList<SpecifiedPartnerDescriptionType>();
        }
        return this.respondTo;
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
     * Gets the value of the specialDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialDiscount }
     * 
     * 
     */
    public List<SpecialDiscount> getSpecialDiscount() {
        if (specialDiscount == null) {
            specialDiscount = new ArrayList<SpecialDiscount>();
        }
        return this.specialDiscount;
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
     *     {@link TaxSummaryType }
     *     
     */
    public TaxSummaryType getTaxSummary() {
        return taxSummary;
    }

    /**
     * Sets the value of the taxSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryType }
     *     
     */
    public void setTaxSummary(TaxSummaryType value) {
        this.taxSummary = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setTotalAmount(MonetaryAmountType value) {
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
            SpecifiedPartnerDescriptionType lhsBillTo;
            lhsBillTo = this.getBillTo();
            SpecifiedPartnerDescriptionType rhsBillTo;
            rhsBillTo = that.getBillTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billTo", lhsBillTo), LocatorUtils.property(thatLocator, "billTo", rhsBillTo), lhsBillTo, rhsBillTo, (this.billTo!= null), (that.billTo!= null))) {
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
            ConfirmationType lhsConfirmationType;
            lhsConfirmationType = this.getConfirmationType();
            ConfirmationType rhsConfirmationType;
            rhsConfirmationType = that.getConfirmationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confirmationType", lhsConfirmationType), LocatorUtils.property(thatLocator, "confirmationType", rhsConfirmationType), lhsConfirmationType, rhsConfirmationType, (this.confirmationType!= null), (that.confirmationType!= null))) {
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
            SpecifiedPartnerDescriptionType lhsContractOwner;
            lhsContractOwner = this.getContractOwner();
            SpecifiedPartnerDescriptionType rhsContractOwner;
            rhsContractOwner = that.getContractOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractOwner", lhsContractOwner), LocatorUtils.property(thatLocator, "contractOwner", rhsContractOwner), lhsContractOwner, rhsContractOwner, (this.contractOwner!= null), (that.contractOwner!= null))) {
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
            String lhsInformation;
            lhsInformation = this.getInformation();
            String rhsInformation;
            rhsInformation = that.getInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "information", lhsInformation), LocatorUtils.property(thatLocator, "information", rhsInformation), lhsInformation, rhsInformation, (this.information!= null), (that.information!= null))) {
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
            ProductPricingType lhsListPrice;
            lhsListPrice = this.getListPrice();
            ProductPricingType rhsListPrice;
            rhsListPrice = that.getListPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listPrice", lhsListPrice), LocatorUtils.property(thatLocator, "listPrice", rhsListPrice), lhsListPrice, rhsListPrice, (this.listPrice!= null), (that.listPrice!= null))) {
                return false;
            }
        }
        {
            List<Location> lhsLocation;
            lhsLocation = (((this.location!= null)&&(!this.location.isEmpty()))?this.getLocation():null);
            List<Location> rhsLocation;
            rhsLocation = (((that.location!= null)&&(!that.location.isEmpty()))?that.getLocation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation, ((this.location!= null)&&(!this.location.isEmpty())), ((that.location!= null)&&(!that.location.isEmpty())))) {
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
            PurchaseOrderStatus lhsPurchaseOrderStatus;
            lhsPurchaseOrderStatus = this.getPurchaseOrderStatus();
            PurchaseOrderStatus rhsPurchaseOrderStatus;
            rhsPurchaseOrderStatus = that.getPurchaseOrderStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderStatus", lhsPurchaseOrderStatus), LocatorUtils.property(thatLocator, "purchaseOrderStatus", rhsPurchaseOrderStatus), lhsPurchaseOrderStatus, rhsPurchaseOrderStatus, (this.purchaseOrderStatus!= null), (that.purchaseOrderStatus!= null))) {
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
            TransportationEventType lhsRequestedEvent;
            lhsRequestedEvent = this.getRequestedEvent();
            TransportationEventType rhsRequestedEvent;
            rhsRequestedEvent = that.getRequestedEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedEvent", lhsRequestedEvent), LocatorUtils.property(thatLocator, "requestedEvent", rhsRequestedEvent), lhsRequestedEvent, rhsRequestedEvent, (this.requestedEvent!= null), (that.requestedEvent!= null))) {
                return false;
            }
        }
        {
            List<SpecifiedPartnerDescriptionType> lhsRespondTo;
            lhsRespondTo = (((this.respondTo!= null)&&(!this.respondTo.isEmpty()))?this.getRespondTo():null);
            List<SpecifiedPartnerDescriptionType> rhsRespondTo;
            rhsRespondTo = (((that.respondTo!= null)&&(!that.respondTo.isEmpty()))?that.getRespondTo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "respondTo", lhsRespondTo), LocatorUtils.property(thatLocator, "respondTo", rhsRespondTo), lhsRespondTo, rhsRespondTo, ((this.respondTo!= null)&&(!this.respondTo.isEmpty())), ((that.respondTo!= null)&&(!that.respondTo.isEmpty())))) {
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
            List<SpecifiedPartnerDescriptionType> lhsShipFrom;
            lhsShipFrom = (((this.shipFrom!= null)&&(!this.shipFrom.isEmpty()))?this.getShipFrom():null);
            List<SpecifiedPartnerDescriptionType> rhsShipFrom;
            rhsShipFrom = (((that.shipFrom!= null)&&(!that.shipFrom.isEmpty()))?that.getShipFrom():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipFrom", lhsShipFrom), LocatorUtils.property(thatLocator, "shipFrom", rhsShipFrom), lhsShipFrom, rhsShipFrom, ((this.shipFrom!= null)&&(!this.shipFrom.isEmpty())), ((that.shipFrom!= null)&&(!that.shipFrom.isEmpty())))) {
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
            List<SpecialDiscount> lhsSpecialDiscount;
            lhsSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            List<SpecialDiscount> rhsSpecialDiscount;
            rhsSpecialDiscount = (((that.specialDiscount!= null)&&(!that.specialDiscount.isEmpty()))?that.getSpecialDiscount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialDiscount", lhsSpecialDiscount), LocatorUtils.property(thatLocator, "specialDiscount", rhsSpecialDiscount), lhsSpecialDiscount, rhsSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())), ((that.specialDiscount!= null)&&(!that.specialDiscount.isEmpty())))) {
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
            TaxSummaryType lhsTaxSummary;
            lhsTaxSummary = this.getTaxSummary();
            TaxSummaryType rhsTaxSummary;
            rhsTaxSummary = that.getTaxSummary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxSummary", lhsTaxSummary), LocatorUtils.property(thatLocator, "taxSummary", rhsTaxSummary), lhsTaxSummary, rhsTaxSummary, (this.taxSummary!= null), (that.taxSummary!= null))) {
                return false;
            }
        }
        {
            MonetaryAmountType lhsTotalAmount;
            lhsTotalAmount = this.getTotalAmount();
            MonetaryAmountType rhsTotalAmount;
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
            SpecifiedPartnerDescriptionType theBillTo;
            theBillTo = this.getBillTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billTo", theBillTo), currentHashCode, theBillTo, (this.billTo!= null));
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
            ConfirmationType theConfirmationType;
            theConfirmationType = this.getConfirmationType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confirmationType", theConfirmationType), currentHashCode, theConfirmationType, (this.confirmationType!= null));
        }
        {
            List<ContractInformation> theContractInformation;
            theContractInformation = (((this.contractInformation!= null)&&(!this.contractInformation.isEmpty()))?this.getContractInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractInformation", theContractInformation), currentHashCode, theContractInformation, ((this.contractInformation!= null)&&(!this.contractInformation.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theContractOwner;
            theContractOwner = this.getContractOwner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractOwner", theContractOwner), currentHashCode, theContractOwner, (this.contractOwner!= null));
        }
        {
            List<FinancingTerms> theFinancingTerms;
            theFinancingTerms = (((this.financingTerms!= null)&&(!this.financingTerms.isEmpty()))?this.getFinancingTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financingTerms", theFinancingTerms), currentHashCode, theFinancingTerms, ((this.financingTerms!= null)&&(!this.financingTerms.isEmpty())));
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
            String theInformation;
            theInformation = this.getInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "information", theInformation), currentHashCode, theInformation, (this.information!= null));
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
            ProductPricingType theListPrice;
            theListPrice = this.getListPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listPrice", theListPrice), currentHashCode, theListPrice, (this.listPrice!= null));
        }
        {
            List<Location> theLocation;
            theLocation = (((this.location!= null)&&(!this.location.isEmpty()))?this.getLocation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation, ((this.location!= null)&&(!this.location.isEmpty())));
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
            PurchaseOrderStatus thePurchaseOrderStatus;
            thePurchaseOrderStatus = this.getPurchaseOrderStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderStatus", thePurchaseOrderStatus), currentHashCode, thePurchaseOrderStatus, (this.purchaseOrderStatus!= null));
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType> thePurchaseOrderType;
            thePurchaseOrderType = (((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty()))?this.getPurchaseOrderType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderType", thePurchaseOrderType), currentHashCode, thePurchaseOrderType, ((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty())));
        }
        {
            TransportationEventType theRequestedEvent;
            theRequestedEvent = this.getRequestedEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedEvent", theRequestedEvent), currentHashCode, theRequestedEvent, (this.requestedEvent!= null));
        }
        {
            List<SpecifiedPartnerDescriptionType> theRespondTo;
            theRespondTo = (((this.respondTo!= null)&&(!this.respondTo.isEmpty()))?this.getRespondTo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "respondTo", theRespondTo), currentHashCode, theRespondTo, ((this.respondTo!= null)&&(!this.respondTo.isEmpty())));
        }
        {
            String theResponseDescription;
            theResponseDescription = this.getResponseDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseDescription", theResponseDescription), currentHashCode, theResponseDescription, (this.responseDescription!= null));
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
            List<SpecifiedPartnerDescriptionType> theShipFrom;
            theShipFrom = (((this.shipFrom!= null)&&(!this.shipFrom.isEmpty()))?this.getShipFrom():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipFrom", theShipFrom), currentHashCode, theShipFrom, ((this.shipFrom!= null)&&(!this.shipFrom.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipTo", theShipTo), currentHashCode, theShipTo, (this.shipTo!= null));
        }
        {
            List<SpecialDiscount> theSpecialDiscount;
            theSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialDiscount", theSpecialDiscount), currentHashCode, theSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())));
        }
        {
            TaxExemptStatus theTaxExemptStatus;
            theTaxExemptStatus = this.getTaxExemptStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxExemptStatus", theTaxExemptStatus), currentHashCode, theTaxExemptStatus, (this.taxExemptStatus!= null));
        }
        {
            TaxSummaryType theTaxSummary;
            theTaxSummary = this.getTaxSummary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxSummary", theTaxSummary), currentHashCode, theTaxSummary, (this.taxSummary!= null));
        }
        {
            MonetaryAmountType theTotalAmount;
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
            SpecifiedPartnerDescriptionType theBillTo;
            theBillTo = this.getBillTo();
            strategy.appendField(locator, this, "billTo", buffer, theBillTo, (this.billTo!= null));
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
            ConfirmationType theConfirmationType;
            theConfirmationType = this.getConfirmationType();
            strategy.appendField(locator, this, "confirmationType", buffer, theConfirmationType, (this.confirmationType!= null));
        }
        {
            List<ContractInformation> theContractInformation;
            theContractInformation = (((this.contractInformation!= null)&&(!this.contractInformation.isEmpty()))?this.getContractInformation():null);
            strategy.appendField(locator, this, "contractInformation", buffer, theContractInformation, ((this.contractInformation!= null)&&(!this.contractInformation.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theContractOwner;
            theContractOwner = this.getContractOwner();
            strategy.appendField(locator, this, "contractOwner", buffer, theContractOwner, (this.contractOwner!= null));
        }
        {
            List<FinancingTerms> theFinancingTerms;
            theFinancingTerms = (((this.financingTerms!= null)&&(!this.financingTerms.isEmpty()))?this.getFinancingTerms():null);
            strategy.appendField(locator, this, "financingTerms", buffer, theFinancingTerms, ((this.financingTerms!= null)&&(!this.financingTerms.isEmpty())));
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
            String theInformation;
            theInformation = this.getInformation();
            strategy.appendField(locator, this, "information", buffer, theInformation, (this.information!= null));
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
            ProductPricingType theListPrice;
            theListPrice = this.getListPrice();
            strategy.appendField(locator, this, "listPrice", buffer, theListPrice, (this.listPrice!= null));
        }
        {
            List<Location> theLocation;
            theLocation = (((this.location!= null)&&(!this.location.isEmpty()))?this.getLocation():null);
            strategy.appendField(locator, this, "location", buffer, theLocation, ((this.location!= null)&&(!this.location.isEmpty())));
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
            PurchaseOrderStatus thePurchaseOrderStatus;
            thePurchaseOrderStatus = this.getPurchaseOrderStatus();
            strategy.appendField(locator, this, "purchaseOrderStatus", buffer, thePurchaseOrderStatus, (this.purchaseOrderStatus!= null));
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType> thePurchaseOrderType;
            thePurchaseOrderType = (((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty()))?this.getPurchaseOrderType():null);
            strategy.appendField(locator, this, "purchaseOrderType", buffer, thePurchaseOrderType, ((this.purchaseOrderType!= null)&&(!this.purchaseOrderType.isEmpty())));
        }
        {
            TransportationEventType theRequestedEvent;
            theRequestedEvent = this.getRequestedEvent();
            strategy.appendField(locator, this, "requestedEvent", buffer, theRequestedEvent, (this.requestedEvent!= null));
        }
        {
            List<SpecifiedPartnerDescriptionType> theRespondTo;
            theRespondTo = (((this.respondTo!= null)&&(!this.respondTo.isEmpty()))?this.getRespondTo():null);
            strategy.appendField(locator, this, "respondTo", buffer, theRespondTo, ((this.respondTo!= null)&&(!this.respondTo.isEmpty())));
        }
        {
            String theResponseDescription;
            theResponseDescription = this.getResponseDescription();
            strategy.appendField(locator, this, "responseDescription", buffer, theResponseDescription, (this.responseDescription!= null));
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
            List<SpecifiedPartnerDescriptionType> theShipFrom;
            theShipFrom = (((this.shipFrom!= null)&&(!this.shipFrom.isEmpty()))?this.getShipFrom():null);
            strategy.appendField(locator, this, "shipFrom", buffer, theShipFrom, ((this.shipFrom!= null)&&(!this.shipFrom.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            strategy.appendField(locator, this, "shipTo", buffer, theShipTo, (this.shipTo!= null));
        }
        {
            List<SpecialDiscount> theSpecialDiscount;
            theSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            strategy.appendField(locator, this, "specialDiscount", buffer, theSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())));
        }
        {
            TaxExemptStatus theTaxExemptStatus;
            theTaxExemptStatus = this.getTaxExemptStatus();
            strategy.appendField(locator, this, "taxExemptStatus", buffer, theTaxExemptStatus, (this.taxExemptStatus!= null));
        }
        {
            TaxSummaryType theTaxSummary;
            theTaxSummary = this.getTaxSummary();
            strategy.appendField(locator, this, "taxSummary", buffer, theTaxSummary, (this.taxSummary!= null));
        }
        {
            MonetaryAmountType theTotalAmount;
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
