
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
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.ManufacturerProfile;
import io.dscope.rosettanet.domain.procurement.codelist.lineitemstatus.v01_04.LineItemStatus;
import io.dscope.rosettanet.domain.procurement.codelist.notificationtype.v01_04.NotificationType;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderacknowledgmentreason.v01_04.PurchaseOrderAcknowledgmentReason;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03.PurchaseOrderFillPriority;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_06.PurchaseOrderStatus;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.CustomerInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.OrderShippingInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.RequestedUnitPrice;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.RequestedUnitPriceType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.SpecialDiscount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.SubstituteProductReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TaxCalculation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TaxExemptStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TransportationEventType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.MonetaryAmountType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductPricingType;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.dates.v01_03.DateTimePeriodType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
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
 * <p>Java class for ProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualDeliveryDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DateTimePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BuyerLineItem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ContractInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}CustomerInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExpediteReferenceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.04}LineItemStatus"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}ManufacturerProfile" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:NotificationType:xsd:codelist:01.04}NotificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}OrderShippingInformation" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="ProductInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductSubLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01}ProductSubLineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04}PurchaseOrderAcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03}PurchaseOrderFillPriority" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06}PurchaseOrderStatus"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05}PurchaseOrderType" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01}QuantityType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RequestedDeliveryDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DateTimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TransportationEventType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}RequestedUnitPrice" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledDeliveryDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DateTimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentStatusInformation" type="{urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01}ShipmentStatusInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShippedQuantityInformation" type="{urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01}ShippedQuantityInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}SubstituteProductReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TaxCalculation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItemAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}RequestedUnitPriceType" minOccurs="0"/&gt;
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
    "actualDeliveryDate",
    "businessDocumentReference",
    "buyerLineItem",
    "comments",
    "contractInformation",
    "countryOfOrigin",
    "customerInformation",
    "expediteReferenceIdentifier",
    "identifier",
    "lineItemStatus",
    "lineNumber",
    "listPrice",
    "manufacturerProfile",
    "notificationType",
    "orderShippingInformation",
    "originalScheduledEvent",
    "partnerDescription",
    "productIdentification",
    "productInformation",
    "productSubLineItem",
    "purchaseOrderAcknowledgmentReason",
    "purchaseOrderFillPriority",
    "purchaseOrderReference",
    "purchaseOrderStatus",
    "purchaseOrderType",
    "quantity",
    "requestedDeliveryDate",
    "requestedEvent",
    "requestedUnitPrice",
    "responseDescription",
    "revisionNumber",
    "scheduledDeliveryDate",
    "scheduledEvent",
    "shipmentStatusInformation",
    "shippedQuantityInformation",
    "specialDiscount",
    "substituteProductReference",
    "taxCalculation",
    "taxExemptStatus",
    "totalLineItemAmount",
    "unitOfMeasure",
    "unitPrice"
})
public class ProductLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ActualDeliveryDate")
    protected DateTimePeriodType actualDeliveryDate;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "BuyerLineItem", required = true)
    protected String buyerLineItem;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ContractInformation.class, required = false)
    protected List<ContractInformation> contractInformation;
    @XmlElement(name = "CountryOfOrigin")
    protected CountryType countryOfOrigin;
    @XmlElementRef(name = "CustomerInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = CustomerInformation.class, required = false)
    protected List<CustomerInformation> customerInformation;
    @XmlElement(name = "ExpediteReferenceIdentifier")
    protected String expediteReferenceIdentifier;
    @XmlElement(name = "Identifier")
    protected List<String> identifier;
    @XmlElementRef(name = "LineItemStatus", namespace = "urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.04", type = LineItemStatus.class)
    protected LineItemStatus lineItemStatus;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElementRef(name = "ManufacturerProfile", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = ManufacturerProfile.class, required = false)
    protected ManufacturerProfile manufacturerProfile;
    @XmlElementRef(name = "NotificationType", namespace = "urn:rosettanet:specification:domain:Procurement:NotificationType:xsd:codelist:01.04", type = NotificationType.class, required = false)
    protected NotificationType notificationType;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = OrderShippingInformation.class, required = false)
    protected OrderShippingInformation orderShippingInformation;
    @XmlElement(name = "OriginalScheduledEvent")
    protected List<TransportationEventType> originalScheduledEvent;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProductInformation")
    protected String productInformation;
    @XmlElement(name = "ProductSubLineItem")
    protected List<ProductSubLineItemType> productSubLineItem;
    @XmlElementRef(name = "PurchaseOrderAcknowledgmentReason", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04", type = PurchaseOrderAcknowledgmentReason.class, required = false)
    protected List<PurchaseOrderAcknowledgmentReason> purchaseOrderAcknowledgmentReason;
    @XmlElementRef(name = "PurchaseOrderFillPriority", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", type = PurchaseOrderFillPriority.class, required = false)
    protected PurchaseOrderFillPriority purchaseOrderFillPriority;
    @XmlElement(name = "PurchaseOrderReference")
    protected BusinessDocumentReferenceType purchaseOrderReference;
    @XmlElementRef(name = "PurchaseOrderStatus", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06", type = PurchaseOrderStatus.class)
    protected PurchaseOrderStatus purchaseOrderStatus;
    @XmlElementRef(name = "PurchaseOrderType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05", type = PurchaseOrderType.class, required = false)
    protected PurchaseOrderType purchaseOrderType;
    @XmlElement(name = "Quantity", required = true)
    protected List<QuantityType> quantity;
    @XmlElement(name = "RequestedDeliveryDate")
    protected DateTimePeriodType requestedDeliveryDate;
    @XmlElement(name = "RequestedEvent", required = true)
    protected TransportationEventType requestedEvent;
    @XmlElementRef(name = "RequestedUnitPrice", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = RequestedUnitPrice.class, required = false)
    protected RequestedUnitPrice requestedUnitPrice;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
    @XmlElement(name = "ScheduledDeliveryDate")
    protected DateTimePeriodType scheduledDeliveryDate;
    @XmlElement(name = "ScheduledEvent")
    protected List<TransportationEventType> scheduledEvent;
    @XmlElement(name = "ShipmentStatusInformation")
    protected List<ShipmentStatusInformationType> shipmentStatusInformation;
    @XmlElement(name = "ShippedQuantityInformation")
    protected List<ShippedQuantityInformationType> shippedQuantityInformation;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlElementRef(name = "SubstituteProductReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = SubstituteProductReference.class, required = false)
    protected List<SubstituteProductReference> substituteProductReference;
    @XmlElementRef(name = "TaxCalculation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = TaxCalculation.class, required = false)
    protected TaxCalculation taxCalculation;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElement(name = "TotalLineItemAmount")
    protected MonetaryAmountType totalLineItemAmount;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "UnitPrice")
    protected RequestedUnitPriceType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actualDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    public DateTimePeriodType getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * Sets the value of the actualDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    public void setActualDeliveryDate(DateTimePeriodType value) {
        this.actualDeliveryDate = value;
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
     * Gets the value of the buyerLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerLineItem() {
        return buyerLineItem;
    }

    /**
     * Sets the value of the buyerLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerLineItem(String value) {
        this.buyerLineItem = value;
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
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<String>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the lineItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemStatus }
     *     
     */
    public LineItemStatus getLineItemStatus() {
        return lineItemStatus;
    }

    /**
     * Sets the value of the lineItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemStatus }
     *     
     */
    public void setLineItemStatus(LineItemStatus value) {
        this.lineItemStatus = value;
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
     * Gets the value of the manufacturerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturerProfile }
     *     
     */
    public ManufacturerProfile getManufacturerProfile() {
        return manufacturerProfile;
    }

    /**
     * Sets the value of the manufacturerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturerProfile }
     *     
     */
    public void setManufacturerProfile(ManufacturerProfile value) {
        this.manufacturerProfile = value;
    }

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType }
     *     
     */
    public NotificationType getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType }
     *     
     */
    public void setNotificationType(NotificationType value) {
        this.notificationType = value;
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
     * Gets the value of the purchaseOrderReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPurchaseOrderReference() {
        return purchaseOrderReference;
    }

    /**
     * Sets the value of the purchaseOrderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPurchaseOrderReference(BusinessDocumentReferenceType value) {
        this.purchaseOrderReference = value;
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
     * @return
     *     possible object is
     *     {@link PurchaseOrderType }
     *     
     */
    public PurchaseOrderType getPurchaseOrderType() {
        return purchaseOrderType;
    }

    /**
     * Sets the value of the purchaseOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderType }
     *     
     */
    public void setPurchaseOrderType(PurchaseOrderType value) {
        this.purchaseOrderType = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<QuantityType>();
        }
        return this.quantity;
    }

    /**
     * Gets the value of the requestedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    public DateTimePeriodType getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Sets the value of the requestedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    public void setRequestedDeliveryDate(DateTimePeriodType value) {
        this.requestedDeliveryDate = value;
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
     * Gets the value of the requestedUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedUnitPrice }
     *     
     */
    public RequestedUnitPrice getRequestedUnitPrice() {
        return requestedUnitPrice;
    }

    /**
     * Sets the value of the requestedUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedUnitPrice }
     *     
     */
    public void setRequestedUnitPrice(RequestedUnitPrice value) {
        this.requestedUnitPrice = value;
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
     * Gets the value of the scheduledDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    public DateTimePeriodType getScheduledDeliveryDate() {
        return scheduledDeliveryDate;
    }

    /**
     * Sets the value of the scheduledDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    public void setScheduledDeliveryDate(DateTimePeriodType value) {
        this.scheduledDeliveryDate = value;
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
     * Gets the value of the substituteProductReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substituteProductReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstituteProductReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstituteProductReference }
     * 
     * 
     */
    public List<SubstituteProductReference> getSubstituteProductReference() {
        if (substituteProductReference == null) {
            substituteProductReference = new ArrayList<SubstituteProductReference>();
        }
        return this.substituteProductReference;
    }

    /**
     * Gets the value of the taxCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCalculation }
     *     
     */
    public TaxCalculation getTaxCalculation() {
        return taxCalculation;
    }

    /**
     * Sets the value of the taxCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCalculation }
     *     
     */
    public void setTaxCalculation(TaxCalculation value) {
        this.taxCalculation = value;
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
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedUnitPriceType }
     *     
     */
    public RequestedUnitPriceType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedUnitPriceType }
     *     
     */
    public void setUnitPrice(RequestedUnitPriceType value) {
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProductLineItemType that = ((ProductLineItemType) object);
        {
            DateTimePeriodType lhsActualDeliveryDate;
            lhsActualDeliveryDate = this.getActualDeliveryDate();
            DateTimePeriodType rhsActualDeliveryDate;
            rhsActualDeliveryDate = that.getActualDeliveryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualDeliveryDate", lhsActualDeliveryDate), LocatorUtils.property(thatLocator, "actualDeliveryDate", rhsActualDeliveryDate), lhsActualDeliveryDate, rhsActualDeliveryDate, (this.actualDeliveryDate!= null), (that.actualDeliveryDate!= null))) {
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
            String lhsBuyerLineItem;
            lhsBuyerLineItem = this.getBuyerLineItem();
            String rhsBuyerLineItem;
            rhsBuyerLineItem = that.getBuyerLineItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buyerLineItem", lhsBuyerLineItem), LocatorUtils.property(thatLocator, "buyerLineItem", rhsBuyerLineItem), lhsBuyerLineItem, rhsBuyerLineItem, (this.buyerLineItem!= null), (that.buyerLineItem!= null))) {
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
            List<String> lhsIdentifier;
            lhsIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            List<String> rhsIdentifier;
            rhsIdentifier = (((that.identifier!= null)&&(!that.identifier.isEmpty()))?that.getIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, ((this.identifier!= null)&&(!this.identifier.isEmpty())), ((that.identifier!= null)&&(!that.identifier.isEmpty())))) {
                return false;
            }
        }
        {
            LineItemStatus lhsLineItemStatus;
            lhsLineItemStatus = this.getLineItemStatus();
            LineItemStatus rhsLineItemStatus;
            rhsLineItemStatus = that.getLineItemStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineItemStatus", lhsLineItemStatus), LocatorUtils.property(thatLocator, "lineItemStatus", rhsLineItemStatus), lhsLineItemStatus, rhsLineItemStatus, (this.lineItemStatus!= null), (that.lineItemStatus!= null))) {
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
            ManufacturerProfile lhsManufacturerProfile;
            lhsManufacturerProfile = this.getManufacturerProfile();
            ManufacturerProfile rhsManufacturerProfile;
            rhsManufacturerProfile = that.getManufacturerProfile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturerProfile", lhsManufacturerProfile), LocatorUtils.property(thatLocator, "manufacturerProfile", rhsManufacturerProfile), lhsManufacturerProfile, rhsManufacturerProfile, (this.manufacturerProfile!= null), (that.manufacturerProfile!= null))) {
                return false;
            }
        }
        {
            NotificationType lhsNotificationType;
            lhsNotificationType = this.getNotificationType();
            NotificationType rhsNotificationType;
            rhsNotificationType = that.getNotificationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notificationType", lhsNotificationType), LocatorUtils.property(thatLocator, "notificationType", rhsNotificationType), lhsNotificationType, rhsNotificationType, (this.notificationType!= null), (that.notificationType!= null))) {
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
            ProductIdentification lhsProductIdentification;
            lhsProductIdentification = this.getProductIdentification();
            ProductIdentification rhsProductIdentification;
            rhsProductIdentification = that.getProductIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentification", lhsProductIdentification), LocatorUtils.property(thatLocator, "productIdentification", rhsProductIdentification), lhsProductIdentification, rhsProductIdentification, (this.productIdentification!= null), (that.productIdentification!= null))) {
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
            List<ProductSubLineItemType> lhsProductSubLineItem;
            lhsProductSubLineItem = (((this.productSubLineItem!= null)&&(!this.productSubLineItem.isEmpty()))?this.getProductSubLineItem():null);
            List<ProductSubLineItemType> rhsProductSubLineItem;
            rhsProductSubLineItem = (((that.productSubLineItem!= null)&&(!that.productSubLineItem.isEmpty()))?that.getProductSubLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productSubLineItem", lhsProductSubLineItem), LocatorUtils.property(thatLocator, "productSubLineItem", rhsProductSubLineItem), lhsProductSubLineItem, rhsProductSubLineItem, ((this.productSubLineItem!= null)&&(!this.productSubLineItem.isEmpty())), ((that.productSubLineItem!= null)&&(!that.productSubLineItem.isEmpty())))) {
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
            BusinessDocumentReferenceType lhsPurchaseOrderReference;
            lhsPurchaseOrderReference = this.getPurchaseOrderReference();
            BusinessDocumentReferenceType rhsPurchaseOrderReference;
            rhsPurchaseOrderReference = that.getPurchaseOrderReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderReference", lhsPurchaseOrderReference), LocatorUtils.property(thatLocator, "purchaseOrderReference", rhsPurchaseOrderReference), lhsPurchaseOrderReference, rhsPurchaseOrderReference, (this.purchaseOrderReference!= null), (that.purchaseOrderReference!= null))) {
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
            PurchaseOrderType lhsPurchaseOrderType;
            lhsPurchaseOrderType = this.getPurchaseOrderType();
            PurchaseOrderType rhsPurchaseOrderType;
            rhsPurchaseOrderType = that.getPurchaseOrderType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderType", lhsPurchaseOrderType), LocatorUtils.property(thatLocator, "purchaseOrderType", rhsPurchaseOrderType), lhsPurchaseOrderType, rhsPurchaseOrderType, (this.purchaseOrderType!= null), (that.purchaseOrderType!= null))) {
                return false;
            }
        }
        {
            List<QuantityType> lhsQuantity;
            lhsQuantity = (((this.quantity!= null)&&(!this.quantity.isEmpty()))?this.getQuantity():null);
            List<QuantityType> rhsQuantity;
            rhsQuantity = (((that.quantity!= null)&&(!that.quantity.isEmpty()))?that.getQuantity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, ((this.quantity!= null)&&(!this.quantity.isEmpty())), ((that.quantity!= null)&&(!that.quantity.isEmpty())))) {
                return false;
            }
        }
        {
            DateTimePeriodType lhsRequestedDeliveryDate;
            lhsRequestedDeliveryDate = this.getRequestedDeliveryDate();
            DateTimePeriodType rhsRequestedDeliveryDate;
            rhsRequestedDeliveryDate = that.getRequestedDeliveryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedDeliveryDate", lhsRequestedDeliveryDate), LocatorUtils.property(thatLocator, "requestedDeliveryDate", rhsRequestedDeliveryDate), lhsRequestedDeliveryDate, rhsRequestedDeliveryDate, (this.requestedDeliveryDate!= null), (that.requestedDeliveryDate!= null))) {
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
            RequestedUnitPrice lhsRequestedUnitPrice;
            lhsRequestedUnitPrice = this.getRequestedUnitPrice();
            RequestedUnitPrice rhsRequestedUnitPrice;
            rhsRequestedUnitPrice = that.getRequestedUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedUnitPrice", lhsRequestedUnitPrice), LocatorUtils.property(thatLocator, "requestedUnitPrice", rhsRequestedUnitPrice), lhsRequestedUnitPrice, rhsRequestedUnitPrice, (this.requestedUnitPrice!= null), (that.requestedUnitPrice!= null))) {
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
            DateTimePeriodType lhsScheduledDeliveryDate;
            lhsScheduledDeliveryDate = this.getScheduledDeliveryDate();
            DateTimePeriodType rhsScheduledDeliveryDate;
            rhsScheduledDeliveryDate = that.getScheduledDeliveryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledDeliveryDate", lhsScheduledDeliveryDate), LocatorUtils.property(thatLocator, "scheduledDeliveryDate", rhsScheduledDeliveryDate), lhsScheduledDeliveryDate, rhsScheduledDeliveryDate, (this.scheduledDeliveryDate!= null), (that.scheduledDeliveryDate!= null))) {
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
            List<SpecialDiscount> lhsSpecialDiscount;
            lhsSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            List<SpecialDiscount> rhsSpecialDiscount;
            rhsSpecialDiscount = (((that.specialDiscount!= null)&&(!that.specialDiscount.isEmpty()))?that.getSpecialDiscount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialDiscount", lhsSpecialDiscount), LocatorUtils.property(thatLocator, "specialDiscount", rhsSpecialDiscount), lhsSpecialDiscount, rhsSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())), ((that.specialDiscount!= null)&&(!that.specialDiscount.isEmpty())))) {
                return false;
            }
        }
        {
            List<SubstituteProductReference> lhsSubstituteProductReference;
            lhsSubstituteProductReference = (((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty()))?this.getSubstituteProductReference():null);
            List<SubstituteProductReference> rhsSubstituteProductReference;
            rhsSubstituteProductReference = (((that.substituteProductReference!= null)&&(!that.substituteProductReference.isEmpty()))?that.getSubstituteProductReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substituteProductReference", lhsSubstituteProductReference), LocatorUtils.property(thatLocator, "substituteProductReference", rhsSubstituteProductReference), lhsSubstituteProductReference, rhsSubstituteProductReference, ((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty())), ((that.substituteProductReference!= null)&&(!that.substituteProductReference.isEmpty())))) {
                return false;
            }
        }
        {
            TaxCalculation lhsTaxCalculation;
            lhsTaxCalculation = this.getTaxCalculation();
            TaxCalculation rhsTaxCalculation;
            rhsTaxCalculation = that.getTaxCalculation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxCalculation", lhsTaxCalculation), LocatorUtils.property(thatLocator, "taxCalculation", rhsTaxCalculation), lhsTaxCalculation, rhsTaxCalculation, (this.taxCalculation!= null), (that.taxCalculation!= null))) {
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
            RequestedUnitPriceType lhsUnitPrice;
            lhsUnitPrice = this.getUnitPrice();
            RequestedUnitPriceType rhsUnitPrice;
            rhsUnitPrice = that.getUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitPrice", lhsUnitPrice), LocatorUtils.property(thatLocator, "unitPrice", rhsUnitPrice), lhsUnitPrice, rhsUnitPrice, (this.unitPrice!= null), (that.unitPrice!= null))) {
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
            DateTimePeriodType theActualDeliveryDate;
            theActualDeliveryDate = this.getActualDeliveryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualDeliveryDate", theActualDeliveryDate), currentHashCode, theActualDeliveryDate, (this.actualDeliveryDate!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            String theBuyerLineItem;
            theBuyerLineItem = this.getBuyerLineItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buyerLineItem", theBuyerLineItem), currentHashCode, theBuyerLineItem, (this.buyerLineItem!= null));
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
            List<String> theIdentifier;
            theIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, ((this.identifier!= null)&&(!this.identifier.isEmpty())));
        }
        {
            LineItemStatus theLineItemStatus;
            theLineItemStatus = this.getLineItemStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineItemStatus", theLineItemStatus), currentHashCode, theLineItemStatus, (this.lineItemStatus!= null));
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
            ManufacturerProfile theManufacturerProfile;
            theManufacturerProfile = this.getManufacturerProfile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturerProfile", theManufacturerProfile), currentHashCode, theManufacturerProfile, (this.manufacturerProfile!= null));
        }
        {
            NotificationType theNotificationType;
            theNotificationType = this.getNotificationType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notificationType", theNotificationType), currentHashCode, theNotificationType, (this.notificationType!= null));
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
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theProductInformation;
            theProductInformation = this.getProductInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productInformation", theProductInformation), currentHashCode, theProductInformation, (this.productInformation!= null));
        }
        {
            List<ProductSubLineItemType> theProductSubLineItem;
            theProductSubLineItem = (((this.productSubLineItem!= null)&&(!this.productSubLineItem.isEmpty()))?this.getProductSubLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productSubLineItem", theProductSubLineItem), currentHashCode, theProductSubLineItem, ((this.productSubLineItem!= null)&&(!this.productSubLineItem.isEmpty())));
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
            BusinessDocumentReferenceType thePurchaseOrderReference;
            thePurchaseOrderReference = this.getPurchaseOrderReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderReference", thePurchaseOrderReference), currentHashCode, thePurchaseOrderReference, (this.purchaseOrderReference!= null));
        }
        {
            PurchaseOrderStatus thePurchaseOrderStatus;
            thePurchaseOrderStatus = this.getPurchaseOrderStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderStatus", thePurchaseOrderStatus), currentHashCode, thePurchaseOrderStatus, (this.purchaseOrderStatus!= null));
        }
        {
            PurchaseOrderType thePurchaseOrderType;
            thePurchaseOrderType = this.getPurchaseOrderType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderType", thePurchaseOrderType), currentHashCode, thePurchaseOrderType, (this.purchaseOrderType!= null));
        }
        {
            List<QuantityType> theQuantity;
            theQuantity = (((this.quantity!= null)&&(!this.quantity.isEmpty()))?this.getQuantity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, ((this.quantity!= null)&&(!this.quantity.isEmpty())));
        }
        {
            DateTimePeriodType theRequestedDeliveryDate;
            theRequestedDeliveryDate = this.getRequestedDeliveryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedDeliveryDate", theRequestedDeliveryDate), currentHashCode, theRequestedDeliveryDate, (this.requestedDeliveryDate!= null));
        }
        {
            TransportationEventType theRequestedEvent;
            theRequestedEvent = this.getRequestedEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedEvent", theRequestedEvent), currentHashCode, theRequestedEvent, (this.requestedEvent!= null));
        }
        {
            RequestedUnitPrice theRequestedUnitPrice;
            theRequestedUnitPrice = this.getRequestedUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedUnitPrice", theRequestedUnitPrice), currentHashCode, theRequestedUnitPrice, (this.requestedUnitPrice!= null));
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
            DateTimePeriodType theScheduledDeliveryDate;
            theScheduledDeliveryDate = this.getScheduledDeliveryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledDeliveryDate", theScheduledDeliveryDate), currentHashCode, theScheduledDeliveryDate, (this.scheduledDeliveryDate!= null));
        }
        {
            List<TransportationEventType> theScheduledEvent;
            theScheduledEvent = (((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty()))?this.getScheduledEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledEvent", theScheduledEvent), currentHashCode, theScheduledEvent, ((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty())));
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
            List<SpecialDiscount> theSpecialDiscount;
            theSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialDiscount", theSpecialDiscount), currentHashCode, theSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())));
        }
        {
            List<SubstituteProductReference> theSubstituteProductReference;
            theSubstituteProductReference = (((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty()))?this.getSubstituteProductReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substituteProductReference", theSubstituteProductReference), currentHashCode, theSubstituteProductReference, ((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty())));
        }
        {
            TaxCalculation theTaxCalculation;
            theTaxCalculation = this.getTaxCalculation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxCalculation", theTaxCalculation), currentHashCode, theTaxCalculation, (this.taxCalculation!= null));
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
            RequestedUnitPriceType theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitPrice", theUnitPrice), currentHashCode, theUnitPrice, (this.unitPrice!= null));
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
            DateTimePeriodType theActualDeliveryDate;
            theActualDeliveryDate = this.getActualDeliveryDate();
            strategy.appendField(locator, this, "actualDeliveryDate", buffer, theActualDeliveryDate, (this.actualDeliveryDate!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            String theBuyerLineItem;
            theBuyerLineItem = this.getBuyerLineItem();
            strategy.appendField(locator, this, "buyerLineItem", buffer, theBuyerLineItem, (this.buyerLineItem!= null));
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
            List<String> theIdentifier;
            theIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, ((this.identifier!= null)&&(!this.identifier.isEmpty())));
        }
        {
            LineItemStatus theLineItemStatus;
            theLineItemStatus = this.getLineItemStatus();
            strategy.appendField(locator, this, "lineItemStatus", buffer, theLineItemStatus, (this.lineItemStatus!= null));
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
            ManufacturerProfile theManufacturerProfile;
            theManufacturerProfile = this.getManufacturerProfile();
            strategy.appendField(locator, this, "manufacturerProfile", buffer, theManufacturerProfile, (this.manufacturerProfile!= null));
        }
        {
            NotificationType theNotificationType;
            theNotificationType = this.getNotificationType();
            strategy.appendField(locator, this, "notificationType", buffer, theNotificationType, (this.notificationType!= null));
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
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theProductInformation;
            theProductInformation = this.getProductInformation();
            strategy.appendField(locator, this, "productInformation", buffer, theProductInformation, (this.productInformation!= null));
        }
        {
            List<ProductSubLineItemType> theProductSubLineItem;
            theProductSubLineItem = (((this.productSubLineItem!= null)&&(!this.productSubLineItem.isEmpty()))?this.getProductSubLineItem():null);
            strategy.appendField(locator, this, "productSubLineItem", buffer, theProductSubLineItem, ((this.productSubLineItem!= null)&&(!this.productSubLineItem.isEmpty())));
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
            BusinessDocumentReferenceType thePurchaseOrderReference;
            thePurchaseOrderReference = this.getPurchaseOrderReference();
            strategy.appendField(locator, this, "purchaseOrderReference", buffer, thePurchaseOrderReference, (this.purchaseOrderReference!= null));
        }
        {
            PurchaseOrderStatus thePurchaseOrderStatus;
            thePurchaseOrderStatus = this.getPurchaseOrderStatus();
            strategy.appendField(locator, this, "purchaseOrderStatus", buffer, thePurchaseOrderStatus, (this.purchaseOrderStatus!= null));
        }
        {
            PurchaseOrderType thePurchaseOrderType;
            thePurchaseOrderType = this.getPurchaseOrderType();
            strategy.appendField(locator, this, "purchaseOrderType", buffer, thePurchaseOrderType, (this.purchaseOrderType!= null));
        }
        {
            List<QuantityType> theQuantity;
            theQuantity = (((this.quantity!= null)&&(!this.quantity.isEmpty()))?this.getQuantity():null);
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, ((this.quantity!= null)&&(!this.quantity.isEmpty())));
        }
        {
            DateTimePeriodType theRequestedDeliveryDate;
            theRequestedDeliveryDate = this.getRequestedDeliveryDate();
            strategy.appendField(locator, this, "requestedDeliveryDate", buffer, theRequestedDeliveryDate, (this.requestedDeliveryDate!= null));
        }
        {
            TransportationEventType theRequestedEvent;
            theRequestedEvent = this.getRequestedEvent();
            strategy.appendField(locator, this, "requestedEvent", buffer, theRequestedEvent, (this.requestedEvent!= null));
        }
        {
            RequestedUnitPrice theRequestedUnitPrice;
            theRequestedUnitPrice = this.getRequestedUnitPrice();
            strategy.appendField(locator, this, "requestedUnitPrice", buffer, theRequestedUnitPrice, (this.requestedUnitPrice!= null));
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
            DateTimePeriodType theScheduledDeliveryDate;
            theScheduledDeliveryDate = this.getScheduledDeliveryDate();
            strategy.appendField(locator, this, "scheduledDeliveryDate", buffer, theScheduledDeliveryDate, (this.scheduledDeliveryDate!= null));
        }
        {
            List<TransportationEventType> theScheduledEvent;
            theScheduledEvent = (((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty()))?this.getScheduledEvent():null);
            strategy.appendField(locator, this, "scheduledEvent", buffer, theScheduledEvent, ((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty())));
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
            List<SpecialDiscount> theSpecialDiscount;
            theSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            strategy.appendField(locator, this, "specialDiscount", buffer, theSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())));
        }
        {
            List<SubstituteProductReference> theSubstituteProductReference;
            theSubstituteProductReference = (((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty()))?this.getSubstituteProductReference():null);
            strategy.appendField(locator, this, "substituteProductReference", buffer, theSubstituteProductReference, ((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty())));
        }
        {
            TaxCalculation theTaxCalculation;
            theTaxCalculation = this.getTaxCalculation();
            strategy.appendField(locator, this, "taxCalculation", buffer, theTaxCalculation, (this.taxCalculation!= null));
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
            RequestedUnitPriceType theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            strategy.appendField(locator, this, "unitPrice", buffer, theUnitPrice, (this.unitPrice!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
