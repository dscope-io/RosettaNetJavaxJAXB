
package io.dscope.rosettanet.interchange.purchaseorderrequest.v01_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_03.GovernmentPriorityRating;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03.PurchaseOrderFillPriority;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.AccountDescription;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.AncillaryDocument;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.FinancingTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.MapReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.MilestoneDate;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.OrderShippingInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.PortalAccess;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.SecondaryBuyer;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.SpecialDiscount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TaxExemptStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TransportationEventType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.MonetaryAmountType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductPricingType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.locations.v01_04.Location;
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
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01" xmlns:p210546_="http://annox.dev.java.net" xmlns:p32397_="http://java.sun.com/xml/ns/jaxb" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.17" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderRequestNotification:xsd:schema:01.00" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.12" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.04" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In PurchaseOrder, at least one occurrence of FinancingTerms/PaymentTerms/NetTerms/Day or FinancingTerms/PaymentTerms/NetTerms/Days.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01" xmlns:p210546_="http://annox.dev.java.net" xmlns:p32397_="http://java.sun.com/xml/ns/jaxb" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.17" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderRequestNotification:xsd:schema:01.00" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.12" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.04" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In PurchaseOrder, at least one occurrence of OrderShippingInformation/SpecialHandlingInstruction/Text or OrderShippingInformation/SpecialHandlingInstruction/SpecialHandling.&lt;/urss:Constraint&gt;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}AccountDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}AncillaryDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BuildingSecurityAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ContractInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}FinancingTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03}GovernmentPriorityRating" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDropShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsRequiredToRespondAtDetailLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}Location" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}MapReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}MilestoneDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderRequestNotification:xsd:schema:01.00}OrderLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}OrderShippingInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}PortalAccess" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03}PurchaseOrderFillPriority" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05}PurchaseOrderType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RequestedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}SecondaryBuyer" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" minOccurs="0"/&gt;
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
    "ancillaryDocument",
    "buildingSecurityAccessCode",
    "businessDocumentReference",
    "comments",
    "contractInformation",
    "financingTerms",
    "governmentContractIdentifier",
    "governmentPriorityRating",
    "information",
    "isDropShip",
    "isRequiredToRespondAtDetailLevel",
    "listPrice",
    "location",
    "mapReference",
    "milestoneDate",
    "orderLineItem",
    "orderShippingInformation",
    "partnerDescription",
    "portalAccess",
    "purchaseOrderFillPriority",
    "purchaseOrderType",
    "requestedEvent",
    "secondaryBuyer",
    "specialDiscount",
    "taxExemptStatus",
    "totalAmount"
})
public class PurchaseOrderType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AccountDescription", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = AccountDescription.class, required = false)
    protected AccountDescription accountDescription;
    @XmlElementRef(name = "AncillaryDocument", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = AncillaryDocument.class, required = false)
    protected List<AncillaryDocument> ancillaryDocument;
    @XmlElement(name = "BuildingSecurityAccessCode")
    protected String buildingSecurityAccessCode;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ContractInformation.class, required = false)
    protected List<ContractInformation> contractInformation;
    @XmlElementRef(name = "FinancingTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = FinancingTerms.class, required = false)
    protected List<FinancingTerms> financingTerms;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElementRef(name = "GovernmentPriorityRating", namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", type = GovernmentPriorityRating.class, required = false)
    protected GovernmentPriorityRating governmentPriorityRating;
    @XmlElement(name = "Information")
    protected String information;
    @XmlElement(name = "IsDropShip")
    protected boolean isDropShip;
    @XmlElement(name = "IsRequiredToRespondAtDetailLevel")
    protected Boolean isRequiredToRespondAtDetailLevel;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElementRef(name = "Location", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = Location.class, required = false)
    protected List<Location> location;
    @XmlElementRef(name = "MapReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = MapReference.class, required = false)
    protected List<MapReference> mapReference;
    @XmlElementRef(name = "MilestoneDate", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = MilestoneDate.class, required = false)
    protected List<MilestoneDate> milestoneDate;
    @XmlElement(name = "OrderLineItem", required = true)
    protected List<OrderLineItemType> orderLineItem;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = OrderShippingInformation.class, required = false)
    protected OrderShippingInformation orderShippingInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "PortalAccess", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = PortalAccess.class, required = false)
    protected List<PortalAccess> portalAccess;
    @XmlElementRef(name = "PurchaseOrderFillPriority", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", type = PurchaseOrderFillPriority.class, required = false)
    protected PurchaseOrderFillPriority purchaseOrderFillPriority;
    @XmlElementRef(name = "PurchaseOrderType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05", type = io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType.class)
    protected List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType> purchaseOrderType;
    @XmlElement(name = "RequestedEvent")
    protected TransportationEventType requestedEvent;
    @XmlElementRef(name = "SecondaryBuyer", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = SecondaryBuyer.class, required = false)
    protected SecondaryBuyer secondaryBuyer;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
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
     * Gets the value of the ancillaryDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryDocument }
     * 
     * 
     */
    public List<AncillaryDocument> getAncillaryDocument() {
        if (ancillaryDocument == null) {
            ancillaryDocument = new ArrayList<AncillaryDocument>();
        }
        return this.ancillaryDocument;
    }

    /**
     * Gets the value of the buildingSecurityAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingSecurityAccessCode() {
        return buildingSecurityAccessCode;
    }

    /**
     * Sets the value of the buildingSecurityAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingSecurityAccessCode(String value) {
        this.buildingSecurityAccessCode = value;
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
     * Gets the value of the isRequiredToRespondAtDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequiredToRespondAtDetailLevel() {
        return isRequiredToRespondAtDetailLevel;
    }

    /**
     * Sets the value of the isRequiredToRespondAtDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequiredToRespondAtDetailLevel(Boolean value) {
        this.isRequiredToRespondAtDetailLevel = value;
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
     * Gets the value of the mapReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapReference }
     * 
     * 
     */
    public List<MapReference> getMapReference() {
        if (mapReference == null) {
            mapReference = new ArrayList<MapReference>();
        }
        return this.mapReference;
    }

    /**
     * Gets the value of the milestoneDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the milestoneDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilestoneDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MilestoneDate }
     * 
     * 
     */
    public List<MilestoneDate> getMilestoneDate() {
        if (milestoneDate == null) {
            milestoneDate = new ArrayList<MilestoneDate>();
        }
        return this.milestoneDate;
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
     * Gets the value of the portalAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portalAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortalAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortalAccess }
     * 
     * 
     */
    public List<PortalAccess> getPortalAccess() {
        if (portalAccess == null) {
            portalAccess = new ArrayList<PortalAccess>();
        }
        return this.portalAccess;
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
            List<AncillaryDocument> lhsAncillaryDocument;
            lhsAncillaryDocument = (((this.ancillaryDocument!= null)&&(!this.ancillaryDocument.isEmpty()))?this.getAncillaryDocument():null);
            List<AncillaryDocument> rhsAncillaryDocument;
            rhsAncillaryDocument = (((that.ancillaryDocument!= null)&&(!that.ancillaryDocument.isEmpty()))?that.getAncillaryDocument():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ancillaryDocument", lhsAncillaryDocument), LocatorUtils.property(thatLocator, "ancillaryDocument", rhsAncillaryDocument), lhsAncillaryDocument, rhsAncillaryDocument, ((this.ancillaryDocument!= null)&&(!this.ancillaryDocument.isEmpty())), ((that.ancillaryDocument!= null)&&(!that.ancillaryDocument.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsBuildingSecurityAccessCode;
            lhsBuildingSecurityAccessCode = this.getBuildingSecurityAccessCode();
            String rhsBuildingSecurityAccessCode;
            rhsBuildingSecurityAccessCode = that.getBuildingSecurityAccessCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingSecurityAccessCode", lhsBuildingSecurityAccessCode), LocatorUtils.property(thatLocator, "buildingSecurityAccessCode", rhsBuildingSecurityAccessCode), lhsBuildingSecurityAccessCode, rhsBuildingSecurityAccessCode, (this.buildingSecurityAccessCode!= null), (that.buildingSecurityAccessCode!= null))) {
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
            boolean lhsIsDropShip;
            lhsIsDropShip = this.isIsDropShip();
            boolean rhsIsDropShip;
            rhsIsDropShip = that.isIsDropShip();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isDropShip", lhsIsDropShip), LocatorUtils.property(thatLocator, "isDropShip", rhsIsDropShip), lhsIsDropShip, rhsIsDropShip, true, true)) {
                return false;
            }
        }
        {
            Boolean lhsIsRequiredToRespondAtDetailLevel;
            lhsIsRequiredToRespondAtDetailLevel = this.isIsRequiredToRespondAtDetailLevel();
            Boolean rhsIsRequiredToRespondAtDetailLevel;
            rhsIsRequiredToRespondAtDetailLevel = that.isIsRequiredToRespondAtDetailLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRequiredToRespondAtDetailLevel", lhsIsRequiredToRespondAtDetailLevel), LocatorUtils.property(thatLocator, "isRequiredToRespondAtDetailLevel", rhsIsRequiredToRespondAtDetailLevel), lhsIsRequiredToRespondAtDetailLevel, rhsIsRequiredToRespondAtDetailLevel, (this.isRequiredToRespondAtDetailLevel!= null), (that.isRequiredToRespondAtDetailLevel!= null))) {
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
            List<MapReference> lhsMapReference;
            lhsMapReference = (((this.mapReference!= null)&&(!this.mapReference.isEmpty()))?this.getMapReference():null);
            List<MapReference> rhsMapReference;
            rhsMapReference = (((that.mapReference!= null)&&(!that.mapReference.isEmpty()))?that.getMapReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mapReference", lhsMapReference), LocatorUtils.property(thatLocator, "mapReference", rhsMapReference), lhsMapReference, rhsMapReference, ((this.mapReference!= null)&&(!this.mapReference.isEmpty())), ((that.mapReference!= null)&&(!that.mapReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<MilestoneDate> lhsMilestoneDate;
            lhsMilestoneDate = (((this.milestoneDate!= null)&&(!this.milestoneDate.isEmpty()))?this.getMilestoneDate():null);
            List<MilestoneDate> rhsMilestoneDate;
            rhsMilestoneDate = (((that.milestoneDate!= null)&&(!that.milestoneDate.isEmpty()))?that.getMilestoneDate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "milestoneDate", lhsMilestoneDate), LocatorUtils.property(thatLocator, "milestoneDate", rhsMilestoneDate), lhsMilestoneDate, rhsMilestoneDate, ((this.milestoneDate!= null)&&(!this.milestoneDate.isEmpty())), ((that.milestoneDate!= null)&&(!that.milestoneDate.isEmpty())))) {
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
            List<PartnerDescription> lhsPartnerDescription;
            lhsPartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            List<PartnerDescription> rhsPartnerDescription;
            rhsPartnerDescription = (((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty()))?that.getPartnerDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())), ((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty())))) {
                return false;
            }
        }
        {
            List<PortalAccess> lhsPortalAccess;
            lhsPortalAccess = (((this.portalAccess!= null)&&(!this.portalAccess.isEmpty()))?this.getPortalAccess():null);
            List<PortalAccess> rhsPortalAccess;
            rhsPortalAccess = (((that.portalAccess!= null)&&(!that.portalAccess.isEmpty()))?that.getPortalAccess():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portalAccess", lhsPortalAccess), LocatorUtils.property(thatLocator, "portalAccess", rhsPortalAccess), lhsPortalAccess, rhsPortalAccess, ((this.portalAccess!= null)&&(!this.portalAccess.isEmpty())), ((that.portalAccess!= null)&&(!that.portalAccess.isEmpty())))) {
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
            SecondaryBuyer lhsSecondaryBuyer;
            lhsSecondaryBuyer = this.getSecondaryBuyer();
            SecondaryBuyer rhsSecondaryBuyer;
            rhsSecondaryBuyer = that.getSecondaryBuyer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secondaryBuyer", lhsSecondaryBuyer), LocatorUtils.property(thatLocator, "secondaryBuyer", rhsSecondaryBuyer), lhsSecondaryBuyer, rhsSecondaryBuyer, (this.secondaryBuyer!= null), (that.secondaryBuyer!= null))) {
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
            List<AncillaryDocument> theAncillaryDocument;
            theAncillaryDocument = (((this.ancillaryDocument!= null)&&(!this.ancillaryDocument.isEmpty()))?this.getAncillaryDocument():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ancillaryDocument", theAncillaryDocument), currentHashCode, theAncillaryDocument, ((this.ancillaryDocument!= null)&&(!this.ancillaryDocument.isEmpty())));
        }
        {
            String theBuildingSecurityAccessCode;
            theBuildingSecurityAccessCode = this.getBuildingSecurityAccessCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buildingSecurityAccessCode", theBuildingSecurityAccessCode), currentHashCode, theBuildingSecurityAccessCode, (this.buildingSecurityAccessCode!= null));
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
            boolean theIsDropShip;
            theIsDropShip = this.isIsDropShip();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isDropShip", theIsDropShip), currentHashCode, theIsDropShip, true);
        }
        {
            Boolean theIsRequiredToRespondAtDetailLevel;
            theIsRequiredToRespondAtDetailLevel = this.isIsRequiredToRespondAtDetailLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRequiredToRespondAtDetailLevel", theIsRequiredToRespondAtDetailLevel), currentHashCode, theIsRequiredToRespondAtDetailLevel, (this.isRequiredToRespondAtDetailLevel!= null));
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
            List<MapReference> theMapReference;
            theMapReference = (((this.mapReference!= null)&&(!this.mapReference.isEmpty()))?this.getMapReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mapReference", theMapReference), currentHashCode, theMapReference, ((this.mapReference!= null)&&(!this.mapReference.isEmpty())));
        }
        {
            List<MilestoneDate> theMilestoneDate;
            theMilestoneDate = (((this.milestoneDate!= null)&&(!this.milestoneDate.isEmpty()))?this.getMilestoneDate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "milestoneDate", theMilestoneDate), currentHashCode, theMilestoneDate, ((this.milestoneDate!= null)&&(!this.milestoneDate.isEmpty())));
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
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            List<PortalAccess> thePortalAccess;
            thePortalAccess = (((this.portalAccess!= null)&&(!this.portalAccess.isEmpty()))?this.getPortalAccess():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portalAccess", thePortalAccess), currentHashCode, thePortalAccess, ((this.portalAccess!= null)&&(!this.portalAccess.isEmpty())));
        }
        {
            PurchaseOrderFillPriority thePurchaseOrderFillPriority;
            thePurchaseOrderFillPriority = this.getPurchaseOrderFillPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderFillPriority", thePurchaseOrderFillPriority), currentHashCode, thePurchaseOrderFillPriority, (this.purchaseOrderFillPriority!= null));
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
            SecondaryBuyer theSecondaryBuyer;
            theSecondaryBuyer = this.getSecondaryBuyer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondaryBuyer", theSecondaryBuyer), currentHashCode, theSecondaryBuyer, (this.secondaryBuyer!= null));
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
            List<AncillaryDocument> theAncillaryDocument;
            theAncillaryDocument = (((this.ancillaryDocument!= null)&&(!this.ancillaryDocument.isEmpty()))?this.getAncillaryDocument():null);
            strategy.appendField(locator, this, "ancillaryDocument", buffer, theAncillaryDocument, ((this.ancillaryDocument!= null)&&(!this.ancillaryDocument.isEmpty())));
        }
        {
            String theBuildingSecurityAccessCode;
            theBuildingSecurityAccessCode = this.getBuildingSecurityAccessCode();
            strategy.appendField(locator, this, "buildingSecurityAccessCode", buffer, theBuildingSecurityAccessCode, (this.buildingSecurityAccessCode!= null));
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
            boolean theIsDropShip;
            theIsDropShip = this.isIsDropShip();
            strategy.appendField(locator, this, "isDropShip", buffer, theIsDropShip, true);
        }
        {
            Boolean theIsRequiredToRespondAtDetailLevel;
            theIsRequiredToRespondAtDetailLevel = this.isIsRequiredToRespondAtDetailLevel();
            strategy.appendField(locator, this, "isRequiredToRespondAtDetailLevel", buffer, theIsRequiredToRespondAtDetailLevel, (this.isRequiredToRespondAtDetailLevel!= null));
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
            List<MapReference> theMapReference;
            theMapReference = (((this.mapReference!= null)&&(!this.mapReference.isEmpty()))?this.getMapReference():null);
            strategy.appendField(locator, this, "mapReference", buffer, theMapReference, ((this.mapReference!= null)&&(!this.mapReference.isEmpty())));
        }
        {
            List<MilestoneDate> theMilestoneDate;
            theMilestoneDate = (((this.milestoneDate!= null)&&(!this.milestoneDate.isEmpty()))?this.getMilestoneDate():null);
            strategy.appendField(locator, this, "milestoneDate", buffer, theMilestoneDate, ((this.milestoneDate!= null)&&(!this.milestoneDate.isEmpty())));
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
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            List<PortalAccess> thePortalAccess;
            thePortalAccess = (((this.portalAccess!= null)&&(!this.portalAccess.isEmpty()))?this.getPortalAccess():null);
            strategy.appendField(locator, this, "portalAccess", buffer, thePortalAccess, ((this.portalAccess!= null)&&(!this.portalAccess.isEmpty())));
        }
        {
            PurchaseOrderFillPriority thePurchaseOrderFillPriority;
            thePurchaseOrderFillPriority = this.getPurchaseOrderFillPriority();
            strategy.appendField(locator, this, "purchaseOrderFillPriority", buffer, thePurchaseOrderFillPriority, (this.purchaseOrderFillPriority!= null));
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
            SecondaryBuyer theSecondaryBuyer;
            theSecondaryBuyer = this.getSecondaryBuyer();
            strategy.appendField(locator, this, "secondaryBuyer", buffer, theSecondaryBuyer, (this.secondaryBuyer!= null));
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
