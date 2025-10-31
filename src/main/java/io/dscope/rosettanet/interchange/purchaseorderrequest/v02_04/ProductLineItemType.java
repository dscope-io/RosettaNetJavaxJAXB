
package io.dscope.rosettanet.interchange.purchaseorderrequest.v02_04;

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
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03.PurchaseOrderFillPriority;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.AncillaryDocument;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.CustomerInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.MapReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.MilestoneDate;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.OrderQuantity;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.OrderShippingInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.PortalAccess;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.SpecialDiscount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.TaxExemptStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.TransportationEventType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.MonetaryAmountType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductPricingType;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.locations.v01_04.LocationType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedNewPartnerType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedPartnerDescriptionType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01" xmlns:p59657_="http://java.sun.com/xml/ns/jaxb" xmlns:p742199_="http://annox.dev.java.net" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.17" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderRequest:xsd:schema:02.04" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.12" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.04" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductLineItem, at least one occurrence of OrderShippingInformation/SpecialHandlingInstruction/Text or OrderShippingInformation/SpecialHandlingInstruction/SpecialHandling.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}AncillaryDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}ContractInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}CustomerInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExpediteReferenceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallAtPartnerLine" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedNewPartnerType" minOccurs="0"/&gt;
 *         &lt;element name="IsDropShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsRequiredToRespondAtDetailLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}MapReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}MilestoneDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}OrderQuantity"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}OrderShippingInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}PortalAccess" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="ProductSubLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderRequest:xsd:schema:02.04}ProductSubLineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03}PurchaseOrderFillPriority" minOccurs="0"/&gt;
 *         &lt;element name="RequestedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}TransportationEventType"/&gt;
 *         &lt;element name="RequestedShipFrom" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedUnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItemAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure"/&gt;
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
@XmlType(name = "ProductLineItemType", propOrder = {
    "ancillaryDocument",
    "businessDocumentReference",
    "comments",
    "contractInformation",
    "countryOfOrigin",
    "customerInformation",
    "expediteReferenceIdentifier",
    "information",
    "installAtPartnerLine",
    "isDropShip",
    "isRequiredToRespondAtDetailLevel",
    "lineNumber",
    "listPrice",
    "mapReference",
    "milestoneDate",
    "orderQuantity",
    "orderShippingInformation",
    "partnerDescription",
    "portalAccess",
    "productIdentification",
    "productSubLineItem",
    "purchaseOrderFillPriority",
    "requestedEvent",
    "requestedShipFrom",
    "requestedUnitPrice",
    "shipTo",
    "specialDiscount",
    "taxExemptStatus",
    "totalLineItemAmount",
    "unitOfMeasure"
})
public class ProductLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AncillaryDocument", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = AncillaryDocument.class, required = false)
    protected List<AncillaryDocument> ancillaryDocument;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = ContractInformation.class, required = false)
    protected List<ContractInformation> contractInformation;
    @XmlElement(name = "CountryOfOrigin")
    protected CountryType countryOfOrigin;
    @XmlElementRef(name = "CustomerInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = CustomerInformation.class, required = false)
    protected List<CustomerInformation> customerInformation;
    @XmlElement(name = "ExpediteReferenceIdentifier")
    protected String expediteReferenceIdentifier;
    @XmlElement(name = "Information")
    protected String information;
    @XmlElement(name = "InstallAtPartnerLine")
    protected SpecifiedNewPartnerType installAtPartnerLine;
    @XmlElement(name = "IsDropShip")
    protected boolean isDropShip;
    @XmlElement(name = "IsRequiredToRespondAtDetailLevel")
    protected Boolean isRequiredToRespondAtDetailLevel;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElementRef(name = "MapReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = MapReference.class, required = false)
    protected List<MapReference> mapReference;
    @XmlElementRef(name = "MilestoneDate", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = MilestoneDate.class, required = false)
    protected List<MilestoneDate> milestoneDate;
    @XmlElementRef(name = "OrderQuantity", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = OrderQuantity.class)
    protected OrderQuantity orderQuantity;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = OrderShippingInformation.class, required = false)
    protected OrderShippingInformation orderShippingInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "PortalAccess", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = PortalAccess.class, required = false)
    protected List<PortalAccess> portalAccess;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProductSubLineItem")
    protected List<ProductSubLineItemType> productSubLineItem;
    @XmlElementRef(name = "PurchaseOrderFillPriority", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", type = PurchaseOrderFillPriority.class, required = false)
    protected PurchaseOrderFillPriority purchaseOrderFillPriority;
    @XmlElement(name = "RequestedEvent", required = true)
    protected TransportationEventType requestedEvent;
    @XmlElement(name = "RequestedShipFrom")
    protected List<LocationType> requestedShipFrom;
    @XmlElement(name = "RequestedUnitPrice")
    protected MonetaryAmountType requestedUnitPrice;
    @XmlElement(name = "ShipTo", required = true)
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElement(name = "TotalLineItemAmount")
    protected MonetaryAmountType totalLineItemAmount;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the installAtPartnerLine property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedNewPartnerType }
     *     
     */
    public SpecifiedNewPartnerType getInstallAtPartnerLine() {
        return installAtPartnerLine;
    }

    /**
     * Sets the value of the installAtPartnerLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedNewPartnerType }
     *     
     */
    public void setInstallAtPartnerLine(SpecifiedNewPartnerType value) {
        this.installAtPartnerLine = value;
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
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the productSubLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSubLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSubLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSubLineItemType }
     * 
     * 
     */
    public List<ProductSubLineItemType> getProductSubLineItem() {
        if (productSubLineItem == null) {
            productSubLineItem = new ArrayList<ProductSubLineItemType>();
        }
        return this.productSubLineItem;
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
        final ProductLineItemType that = ((ProductLineItemType) object);
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
            CountryType lhsCountryOfOrigin;
            lhsCountryOfOrigin = this.getCountryOfOrigin();
            CountryType rhsCountryOfOrigin;
            rhsCountryOfOrigin = that.getCountryOfOrigin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryOfOrigin", lhsCountryOfOrigin), LocatorUtils.property(thatLocator, "countryOfOrigin", rhsCountryOfOrigin), lhsCountryOfOrigin, rhsCountryOfOrigin, (this.countryOfOrigin!= null), (that.countryOfOrigin!= null))) {
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
            String lhsInformation;
            lhsInformation = this.getInformation();
            String rhsInformation;
            rhsInformation = that.getInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "information", lhsInformation), LocatorUtils.property(thatLocator, "information", rhsInformation), lhsInformation, rhsInformation, (this.information!= null), (that.information!= null))) {
                return false;
            }
        }
        {
            SpecifiedNewPartnerType lhsInstallAtPartnerLine;
            lhsInstallAtPartnerLine = this.getInstallAtPartnerLine();
            SpecifiedNewPartnerType rhsInstallAtPartnerLine;
            rhsInstallAtPartnerLine = that.getInstallAtPartnerLine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "installAtPartnerLine", lhsInstallAtPartnerLine), LocatorUtils.property(thatLocator, "installAtPartnerLine", rhsInstallAtPartnerLine), lhsInstallAtPartnerLine, rhsInstallAtPartnerLine, (this.installAtPartnerLine!= null), (that.installAtPartnerLine!= null))) {
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
            PartnerDescription lhsPartnerDescription;
            lhsPartnerDescription = this.getPartnerDescription();
            PartnerDescription rhsPartnerDescription;
            rhsPartnerDescription = that.getPartnerDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, (this.partnerDescription!= null), (that.partnerDescription!= null))) {
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
            ProductIdentification lhsProductIdentification;
            lhsProductIdentification = this.getProductIdentification();
            ProductIdentification rhsProductIdentification;
            rhsProductIdentification = that.getProductIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentification", lhsProductIdentification), LocatorUtils.property(thatLocator, "productIdentification", rhsProductIdentification), lhsProductIdentification, rhsProductIdentification, (this.productIdentification!= null), (that.productIdentification!= null))) {
                return false;
            }
        }
        {
            List<ProductSubLineItemType> lhsProductSubLineItem;
            lhsProductSubLineItem = (((this.productSubLineItem!= null)&&(!this.productSubLineItem.isEmpty()))?this.getProductSubLineItem():null);
            List<ProductSubLineItemType> rhsProductSubLineItem;
            rhsProductSubLineItem = (((that.productSubLineItem!= null)&&(!that.productSubLineItem.isEmpty()))?that.getProductSubLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productSubLineItem", lhsProductSubLineItem), LocatorUtils.property(thatLocator, "productSubLineItem", rhsProductSubLineItem), lhsProductSubLineItem, rhsProductSubLineItem, ((this.productSubLineItem!= null)&&(!this.productSubLineItem.isEmpty())), ((that.productSubLineItem!= null)&&(!that.productSubLineItem.isEmpty())))) {
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
            MonetaryAmountType lhsRequestedUnitPrice;
            lhsRequestedUnitPrice = this.getRequestedUnitPrice();
            MonetaryAmountType rhsRequestedUnitPrice;
            rhsRequestedUnitPrice = that.getRequestedUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedUnitPrice", lhsRequestedUnitPrice), LocatorUtils.property(thatLocator, "requestedUnitPrice", rhsRequestedUnitPrice), lhsRequestedUnitPrice, rhsRequestedUnitPrice, (this.requestedUnitPrice!= null), (that.requestedUnitPrice!= null))) {
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
            MonetaryAmountType lhsTotalLineItemAmount;
            lhsTotalLineItemAmount = this.getTotalLineItemAmount();
            MonetaryAmountType rhsTotalLineItemAmount;
            rhsTotalLineItemAmount = that.getTotalLineItemAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalLineItemAmount", lhsTotalLineItemAmount), LocatorUtils.property(thatLocator, "totalLineItemAmount", rhsTotalLineItemAmount), lhsTotalLineItemAmount, rhsTotalLineItemAmount, (this.totalLineItemAmount!= null), (that.totalLineItemAmount!= null))) {
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
            List<AncillaryDocument> theAncillaryDocument;
            theAncillaryDocument = (((this.ancillaryDocument!= null)&&(!this.ancillaryDocument.isEmpty()))?this.getAncillaryDocument():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ancillaryDocument", theAncillaryDocument), currentHashCode, theAncillaryDocument, ((this.ancillaryDocument!= null)&&(!this.ancillaryDocument.isEmpty())));
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
            CountryType theCountryOfOrigin;
            theCountryOfOrigin = this.getCountryOfOrigin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countryOfOrigin", theCountryOfOrigin), currentHashCode, theCountryOfOrigin, (this.countryOfOrigin!= null));
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
            String theInformation;
            theInformation = this.getInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "information", theInformation), currentHashCode, theInformation, (this.information!= null));
        }
        {
            SpecifiedNewPartnerType theInstallAtPartnerLine;
            theInstallAtPartnerLine = this.getInstallAtPartnerLine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "installAtPartnerLine", theInstallAtPartnerLine), currentHashCode, theInstallAtPartnerLine, (this.installAtPartnerLine!= null));
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
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            List<PortalAccess> thePortalAccess;
            thePortalAccess = (((this.portalAccess!= null)&&(!this.portalAccess.isEmpty()))?this.getPortalAccess():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portalAccess", thePortalAccess), currentHashCode, thePortalAccess, ((this.portalAccess!= null)&&(!this.portalAccess.isEmpty())));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            List<ProductSubLineItemType> theProductSubLineItem;
            theProductSubLineItem = (((this.productSubLineItem!= null)&&(!this.productSubLineItem.isEmpty()))?this.getProductSubLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productSubLineItem", theProductSubLineItem), currentHashCode, theProductSubLineItem, ((this.productSubLineItem!= null)&&(!this.productSubLineItem.isEmpty())));
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
            MonetaryAmountType theRequestedUnitPrice;
            theRequestedUnitPrice = this.getRequestedUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedUnitPrice", theRequestedUnitPrice), currentHashCode, theRequestedUnitPrice, (this.requestedUnitPrice!= null));
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
            MonetaryAmountType theTotalLineItemAmount;
            theTotalLineItemAmount = this.getTotalLineItemAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalLineItemAmount", theTotalLineItemAmount), currentHashCode, theTotalLineItemAmount, (this.totalLineItemAmount!= null));
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
            List<AncillaryDocument> theAncillaryDocument;
            theAncillaryDocument = (((this.ancillaryDocument!= null)&&(!this.ancillaryDocument.isEmpty()))?this.getAncillaryDocument():null);
            strategy.appendField(locator, this, "ancillaryDocument", buffer, theAncillaryDocument, ((this.ancillaryDocument!= null)&&(!this.ancillaryDocument.isEmpty())));
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
            CountryType theCountryOfOrigin;
            theCountryOfOrigin = this.getCountryOfOrigin();
            strategy.appendField(locator, this, "countryOfOrigin", buffer, theCountryOfOrigin, (this.countryOfOrigin!= null));
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
            String theInformation;
            theInformation = this.getInformation();
            strategy.appendField(locator, this, "information", buffer, theInformation, (this.information!= null));
        }
        {
            SpecifiedNewPartnerType theInstallAtPartnerLine;
            theInstallAtPartnerLine = this.getInstallAtPartnerLine();
            strategy.appendField(locator, this, "installAtPartnerLine", buffer, theInstallAtPartnerLine, (this.installAtPartnerLine!= null));
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
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            List<PortalAccess> thePortalAccess;
            thePortalAccess = (((this.portalAccess!= null)&&(!this.portalAccess.isEmpty()))?this.getPortalAccess():null);
            strategy.appendField(locator, this, "portalAccess", buffer, thePortalAccess, ((this.portalAccess!= null)&&(!this.portalAccess.isEmpty())));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            List<ProductSubLineItemType> theProductSubLineItem;
            theProductSubLineItem = (((this.productSubLineItem!= null)&&(!this.productSubLineItem.isEmpty()))?this.getProductSubLineItem():null);
            strategy.appendField(locator, this, "productSubLineItem", buffer, theProductSubLineItem, ((this.productSubLineItem!= null)&&(!this.productSubLineItem.isEmpty())));
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
            MonetaryAmountType theRequestedUnitPrice;
            theRequestedUnitPrice = this.getRequestedUnitPrice();
            strategy.appendField(locator, this, "requestedUnitPrice", buffer, theRequestedUnitPrice, (this.requestedUnitPrice!= null));
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
            MonetaryAmountType theTotalLineItemAmount;
            theTotalLineItemAmount = this.getTotalLineItemAmount();
            strategy.appendField(locator, this, "totalLineItemAmount", buffer, theTotalLineItemAmount, (this.totalLineItemAmount!= null));
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
