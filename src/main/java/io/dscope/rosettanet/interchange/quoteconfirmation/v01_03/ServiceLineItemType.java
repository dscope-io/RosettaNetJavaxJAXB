
package io.dscope.rosettanet.interchange.quoteconfirmation.v01_03;

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
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_02.PurchaseOrderStatusType;
import io.dscope.rosettanet.domain.procurement.codelist.quoteacknowledgmentreason.v01_00.QuoteAcknowledgmentReason;
import io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_03.QuoteType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_15.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v01_15.DatePeriodAndDurationType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_15.ProductPricingType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_15.SpecialDiscount;
import io.dscope.rosettanet.universal.document.v01_01.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_01.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_04.SpecifiedPartnerDescriptionType;
import io.dscope.rosettanet.universal.productidentification.v01_02.ProductIdentification;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.02" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:01.09" xmlns:dltcc="urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.02" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15" xmlns:dpos="urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.02" xmlns:dqar="urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.00" xmlns:dqs="urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.01" xmlns:dqt="urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.03" xmlns:dra="urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:01.02" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.00" xmlns:dte="urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.02" xmlns:iltc="urn:rosettanet:specification:interchange:LeadTimeCommencement:xsd:codelist:01.00" xmlns:ipts="urn:rosettanet:specification:interchange:ProductTerms:xsd:codelist:01.00" xmlns:iqlis="urn:rosettanet:specification:interchange:QuoteLineItemStatus:xsd:codelist:01.00" xmlns:isi="urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.00" xmlns:p439138_="http://annox.dev.java.net" xmlns:p931315_="http://java.sun.com/xml/ns/jaxb" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.06" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:01.03" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.01" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.01" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.01" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ServiceLineItem, if the value of QuoteStatus is equal to 'REJ' then the occurence of QuoteAcknowledgmentReason MUST be 1.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ServiceLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}ContractInformation" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedAvailableProductQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedAvailableServiceQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}ProductQuantityType"/&gt;
 *         &lt;element name="HandlingInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallAt" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02}ProductIdentification" minOccurs="0"/&gt;
 *         &lt;element name="ProductLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductSerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Quote" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.00}QuoteAcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuoteStatus" type="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.02}PurchaseOrderStatusType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.03}QuoteType"/&gt;
 *         &lt;element name="RequestedProductQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedServiceQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedUnitPrice" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}ProductPricingType"/&gt;
 *         &lt;element name="RequoteLineStatus" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:01.03}RequoteLineStatusType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServicePeriod" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}DatePeriodAndDurationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceLineItemType", propOrder = {
    "businessDocumentReference",
    "contractInformation",
    "estimatedAvailableProductQuantity",
    "estimatedAvailableServiceQuantity",
    "handlingInstruction",
    "installAt",
    "lineNumber",
    "productIdentification",
    "productLineNumber",
    "productSerialIdentifier",
    "quote",
    "quoteAcknowledgmentReason",
    "quoteStatus",
    "quoteType",
    "requestedProductQuantity",
    "requestedServiceQuantity",
    "requestedUnitPrice",
    "requoteLineStatus",
    "responseDescription",
    "serviceIdentification",
    "serviceLevel",
    "servicePeriod",
    "specialDiscount"
})
public class ServiceLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.01", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", type = ContractInformation.class, required = false)
    protected ContractInformation contractInformation;
    @XmlElement(name = "EstimatedAvailableProductQuantity")
    protected Float estimatedAvailableProductQuantity;
    @XmlElement(name = "EstimatedAvailableServiceQuantity")
    protected float estimatedAvailableServiceQuantity;
    @XmlElement(name = "HandlingInstruction")
    protected String handlingInstruction;
    @XmlElement(name = "InstallAt")
    protected SpecifiedPartnerDescriptionType installAt;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02", type = ProductIdentification.class, required = false)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProductLineNumber")
    protected String productLineNumber;
    @XmlElement(name = "ProductSerialIdentifier")
    protected List<String> productSerialIdentifier;
    @XmlElement(name = "Quote")
    protected BusinessDocumentReferenceType quote;
    @XmlElementRef(name = "QuoteAcknowledgmentReason", namespace = "urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.00", type = QuoteAcknowledgmentReason.class, required = false)
    protected List<QuoteAcknowledgmentReason> quoteAcknowledgmentReason;
    @XmlElement(name = "QuoteStatus", required = true)
    protected PurchaseOrderStatusType quoteStatus;
    @XmlElementRef(name = "QuoteType", namespace = "urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.03", type = QuoteType.class)
    protected QuoteType quoteType;
    @XmlElement(name = "RequestedProductQuantity")
    protected Float requestedProductQuantity;
    @XmlElement(name = "RequestedServiceQuantity")
    protected Float requestedServiceQuantity;
    @XmlElement(name = "RequestedUnitPrice", required = true)
    protected ProductPricingType requestedUnitPrice;
    @XmlElement(name = "RequoteLineStatus")
    protected RequoteLineStatusType requoteLineStatus;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElement(name = "ServiceIdentification")
    protected List<String> serviceIdentification;
    @XmlElement(name = "ServiceLevel", required = true)
    protected String serviceLevel;
    @XmlElement(name = "ServicePeriod", required = true)
    protected DatePeriodAndDurationType servicePeriod;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the contractInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContractInformation }
     *     
     */
    public ContractInformation getContractInformation() {
        return contractInformation;
    }

    /**
     * Sets the value of the contractInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractInformation }
     *     
     */
    public void setContractInformation(ContractInformation value) {
        this.contractInformation = value;
    }

    /**
     * Gets the value of the estimatedAvailableProductQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEstimatedAvailableProductQuantity() {
        return estimatedAvailableProductQuantity;
    }

    /**
     * Sets the value of the estimatedAvailableProductQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEstimatedAvailableProductQuantity(Float value) {
        this.estimatedAvailableProductQuantity = value;
    }

    /**
     * Gets the value of the estimatedAvailableServiceQuantity property.
     * 
     */
    public float getEstimatedAvailableServiceQuantity() {
        return estimatedAvailableServiceQuantity;
    }

    /**
     * Sets the value of the estimatedAvailableServiceQuantity property.
     * 
     */
    public void setEstimatedAvailableServiceQuantity(float value) {
        this.estimatedAvailableServiceQuantity = value;
    }

    /**
     * Gets the value of the handlingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingInstruction() {
        return handlingInstruction;
    }

    /**
     * Sets the value of the handlingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingInstruction(String value) {
        this.handlingInstruction = value;
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
     * Gets the value of the productLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLineNumber() {
        return productLineNumber;
    }

    /**
     * Sets the value of the productLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLineNumber(String value) {
        this.productLineNumber = value;
    }

    /**
     * Gets the value of the productSerialIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSerialIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSerialIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductSerialIdentifier() {
        if (productSerialIdentifier == null) {
            productSerialIdentifier = new ArrayList<String>();
        }
        return this.productSerialIdentifier;
    }

    /**
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setQuote(BusinessDocumentReferenceType value) {
        this.quote = value;
    }

    /**
     * Gets the value of the quoteAcknowledgmentReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteAcknowledgmentReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteAcknowledgmentReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteAcknowledgmentReason }
     * 
     * 
     */
    public List<QuoteAcknowledgmentReason> getQuoteAcknowledgmentReason() {
        if (quoteAcknowledgmentReason == null) {
            quoteAcknowledgmentReason = new ArrayList<QuoteAcknowledgmentReason>();
        }
        return this.quoteAcknowledgmentReason;
    }

    /**
     * Gets the value of the quoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public PurchaseOrderStatusType getQuoteStatus() {
        return quoteStatus;
    }

    /**
     * Sets the value of the quoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public void setQuoteStatus(PurchaseOrderStatusType value) {
        this.quoteStatus = value;
    }

    /**
     * Gets the value of the quoteType property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteType }
     *     
     */
    public QuoteType getQuoteType() {
        return quoteType;
    }

    /**
     * Sets the value of the quoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteType }
     *     
     */
    public void setQuoteType(QuoteType value) {
        this.quoteType = value;
    }

    /**
     * Gets the value of the requestedProductQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRequestedProductQuantity() {
        return requestedProductQuantity;
    }

    /**
     * Sets the value of the requestedProductQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRequestedProductQuantity(Float value) {
        this.requestedProductQuantity = value;
    }

    /**
     * Gets the value of the requestedServiceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRequestedServiceQuantity() {
        return requestedServiceQuantity;
    }

    /**
     * Sets the value of the requestedServiceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRequestedServiceQuantity(Float value) {
        this.requestedServiceQuantity = value;
    }

    /**
     * Gets the value of the requestedUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getRequestedUnitPrice() {
        return requestedUnitPrice;
    }

    /**
     * Sets the value of the requestedUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setRequestedUnitPrice(ProductPricingType value) {
        this.requestedUnitPrice = value;
    }

    /**
     * Gets the value of the requoteLineStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RequoteLineStatusType }
     *     
     */
    public RequoteLineStatusType getRequoteLineStatus() {
        return requoteLineStatus;
    }

    /**
     * Sets the value of the requoteLineStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequoteLineStatusType }
     *     
     */
    public void setRequoteLineStatus(RequoteLineStatusType value) {
        this.requoteLineStatus = value;
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
     * Gets the value of the serviceIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceIdentification() {
        if (serviceIdentification == null) {
            serviceIdentification = new ArrayList<String>();
        }
        return this.serviceIdentification;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the servicePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public DatePeriodAndDurationType getServicePeriod() {
        return servicePeriod;
    }

    /**
     * Sets the value of the servicePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public void setServicePeriod(DatePeriodAndDurationType value) {
        this.servicePeriod = value;
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
        final ServiceLineItemType that = ((ServiceLineItemType) object);
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
            ContractInformation lhsContractInformation;
            lhsContractInformation = this.getContractInformation();
            ContractInformation rhsContractInformation;
            rhsContractInformation = that.getContractInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractInformation", lhsContractInformation), LocatorUtils.property(thatLocator, "contractInformation", rhsContractInformation), lhsContractInformation, rhsContractInformation, (this.contractInformation!= null), (that.contractInformation!= null))) {
                return false;
            }
        }
        {
            Float lhsEstimatedAvailableProductQuantity;
            lhsEstimatedAvailableProductQuantity = this.getEstimatedAvailableProductQuantity();
            Float rhsEstimatedAvailableProductQuantity;
            rhsEstimatedAvailableProductQuantity = that.getEstimatedAvailableProductQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedAvailableProductQuantity", lhsEstimatedAvailableProductQuantity), LocatorUtils.property(thatLocator, "estimatedAvailableProductQuantity", rhsEstimatedAvailableProductQuantity), lhsEstimatedAvailableProductQuantity, rhsEstimatedAvailableProductQuantity, (this.estimatedAvailableProductQuantity!= null), (that.estimatedAvailableProductQuantity!= null))) {
                return false;
            }
        }
        {
            float lhsEstimatedAvailableServiceQuantity;
            lhsEstimatedAvailableServiceQuantity = this.getEstimatedAvailableServiceQuantity();
            float rhsEstimatedAvailableServiceQuantity;
            rhsEstimatedAvailableServiceQuantity = that.getEstimatedAvailableServiceQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedAvailableServiceQuantity", lhsEstimatedAvailableServiceQuantity), LocatorUtils.property(thatLocator, "estimatedAvailableServiceQuantity", rhsEstimatedAvailableServiceQuantity), lhsEstimatedAvailableServiceQuantity, rhsEstimatedAvailableServiceQuantity, true, true)) {
                return false;
            }
        }
        {
            String lhsHandlingInstruction;
            lhsHandlingInstruction = this.getHandlingInstruction();
            String rhsHandlingInstruction;
            rhsHandlingInstruction = that.getHandlingInstruction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handlingInstruction", lhsHandlingInstruction), LocatorUtils.property(thatLocator, "handlingInstruction", rhsHandlingInstruction), lhsHandlingInstruction, rhsHandlingInstruction, (this.handlingInstruction!= null), (that.handlingInstruction!= null))) {
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
            String lhsLineNumber;
            lhsLineNumber = this.getLineNumber();
            String rhsLineNumber;
            rhsLineNumber = that.getLineNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineNumber", lhsLineNumber), LocatorUtils.property(thatLocator, "lineNumber", rhsLineNumber), lhsLineNumber, rhsLineNumber, (this.lineNumber!= null), (that.lineNumber!= null))) {
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
            String lhsProductLineNumber;
            lhsProductLineNumber = this.getProductLineNumber();
            String rhsProductLineNumber;
            rhsProductLineNumber = that.getProductLineNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productLineNumber", lhsProductLineNumber), LocatorUtils.property(thatLocator, "productLineNumber", rhsProductLineNumber), lhsProductLineNumber, rhsProductLineNumber, (this.productLineNumber!= null), (that.productLineNumber!= null))) {
                return false;
            }
        }
        {
            List<String> lhsProductSerialIdentifier;
            lhsProductSerialIdentifier = (((this.productSerialIdentifier!= null)&&(!this.productSerialIdentifier.isEmpty()))?this.getProductSerialIdentifier():null);
            List<String> rhsProductSerialIdentifier;
            rhsProductSerialIdentifier = (((that.productSerialIdentifier!= null)&&(!that.productSerialIdentifier.isEmpty()))?that.getProductSerialIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productSerialIdentifier", lhsProductSerialIdentifier), LocatorUtils.property(thatLocator, "productSerialIdentifier", rhsProductSerialIdentifier), lhsProductSerialIdentifier, rhsProductSerialIdentifier, ((this.productSerialIdentifier!= null)&&(!this.productSerialIdentifier.isEmpty())), ((that.productSerialIdentifier!= null)&&(!that.productSerialIdentifier.isEmpty())))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsQuote;
            lhsQuote = this.getQuote();
            BusinessDocumentReferenceType rhsQuote;
            rhsQuote = that.getQuote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quote", lhsQuote), LocatorUtils.property(thatLocator, "quote", rhsQuote), lhsQuote, rhsQuote, (this.quote!= null), (that.quote!= null))) {
                return false;
            }
        }
        {
            List<QuoteAcknowledgmentReason> lhsQuoteAcknowledgmentReason;
            lhsQuoteAcknowledgmentReason = (((this.quoteAcknowledgmentReason!= null)&&(!this.quoteAcknowledgmentReason.isEmpty()))?this.getQuoteAcknowledgmentReason():null);
            List<QuoteAcknowledgmentReason> rhsQuoteAcknowledgmentReason;
            rhsQuoteAcknowledgmentReason = (((that.quoteAcknowledgmentReason!= null)&&(!that.quoteAcknowledgmentReason.isEmpty()))?that.getQuoteAcknowledgmentReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quoteAcknowledgmentReason", lhsQuoteAcknowledgmentReason), LocatorUtils.property(thatLocator, "quoteAcknowledgmentReason", rhsQuoteAcknowledgmentReason), lhsQuoteAcknowledgmentReason, rhsQuoteAcknowledgmentReason, ((this.quoteAcknowledgmentReason!= null)&&(!this.quoteAcknowledgmentReason.isEmpty())), ((that.quoteAcknowledgmentReason!= null)&&(!that.quoteAcknowledgmentReason.isEmpty())))) {
                return false;
            }
        }
        {
            PurchaseOrderStatusType lhsQuoteStatus;
            lhsQuoteStatus = this.getQuoteStatus();
            PurchaseOrderStatusType rhsQuoteStatus;
            rhsQuoteStatus = that.getQuoteStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quoteStatus", lhsQuoteStatus), LocatorUtils.property(thatLocator, "quoteStatus", rhsQuoteStatus), lhsQuoteStatus, rhsQuoteStatus, (this.quoteStatus!= null), (that.quoteStatus!= null))) {
                return false;
            }
        }
        {
            QuoteType lhsQuoteType;
            lhsQuoteType = this.getQuoteType();
            QuoteType rhsQuoteType;
            rhsQuoteType = that.getQuoteType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quoteType", lhsQuoteType), LocatorUtils.property(thatLocator, "quoteType", rhsQuoteType), lhsQuoteType, rhsQuoteType, (this.quoteType!= null), (that.quoteType!= null))) {
                return false;
            }
        }
        {
            Float lhsRequestedProductQuantity;
            lhsRequestedProductQuantity = this.getRequestedProductQuantity();
            Float rhsRequestedProductQuantity;
            rhsRequestedProductQuantity = that.getRequestedProductQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedProductQuantity", lhsRequestedProductQuantity), LocatorUtils.property(thatLocator, "requestedProductQuantity", rhsRequestedProductQuantity), lhsRequestedProductQuantity, rhsRequestedProductQuantity, (this.requestedProductQuantity!= null), (that.requestedProductQuantity!= null))) {
                return false;
            }
        }
        {
            Float lhsRequestedServiceQuantity;
            lhsRequestedServiceQuantity = this.getRequestedServiceQuantity();
            Float rhsRequestedServiceQuantity;
            rhsRequestedServiceQuantity = that.getRequestedServiceQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedServiceQuantity", lhsRequestedServiceQuantity), LocatorUtils.property(thatLocator, "requestedServiceQuantity", rhsRequestedServiceQuantity), lhsRequestedServiceQuantity, rhsRequestedServiceQuantity, (this.requestedServiceQuantity!= null), (that.requestedServiceQuantity!= null))) {
                return false;
            }
        }
        {
            ProductPricingType lhsRequestedUnitPrice;
            lhsRequestedUnitPrice = this.getRequestedUnitPrice();
            ProductPricingType rhsRequestedUnitPrice;
            rhsRequestedUnitPrice = that.getRequestedUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedUnitPrice", lhsRequestedUnitPrice), LocatorUtils.property(thatLocator, "requestedUnitPrice", rhsRequestedUnitPrice), lhsRequestedUnitPrice, rhsRequestedUnitPrice, (this.requestedUnitPrice!= null), (that.requestedUnitPrice!= null))) {
                return false;
            }
        }
        {
            RequoteLineStatusType lhsRequoteLineStatus;
            lhsRequoteLineStatus = this.getRequoteLineStatus();
            RequoteLineStatusType rhsRequoteLineStatus;
            rhsRequoteLineStatus = that.getRequoteLineStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requoteLineStatus", lhsRequoteLineStatus), LocatorUtils.property(thatLocator, "requoteLineStatus", rhsRequoteLineStatus), lhsRequoteLineStatus, rhsRequoteLineStatus, (this.requoteLineStatus!= null), (that.requoteLineStatus!= null))) {
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
            List<String> lhsServiceIdentification;
            lhsServiceIdentification = (((this.serviceIdentification!= null)&&(!this.serviceIdentification.isEmpty()))?this.getServiceIdentification():null);
            List<String> rhsServiceIdentification;
            rhsServiceIdentification = (((that.serviceIdentification!= null)&&(!that.serviceIdentification.isEmpty()))?that.getServiceIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceIdentification", lhsServiceIdentification), LocatorUtils.property(thatLocator, "serviceIdentification", rhsServiceIdentification), lhsServiceIdentification, rhsServiceIdentification, ((this.serviceIdentification!= null)&&(!this.serviceIdentification.isEmpty())), ((that.serviceIdentification!= null)&&(!that.serviceIdentification.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsServiceLevel;
            lhsServiceLevel = this.getServiceLevel();
            String rhsServiceLevel;
            rhsServiceLevel = that.getServiceLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceLevel", lhsServiceLevel), LocatorUtils.property(thatLocator, "serviceLevel", rhsServiceLevel), lhsServiceLevel, rhsServiceLevel, (this.serviceLevel!= null), (that.serviceLevel!= null))) {
                return false;
            }
        }
        {
            DatePeriodAndDurationType lhsServicePeriod;
            lhsServicePeriod = this.getServicePeriod();
            DatePeriodAndDurationType rhsServicePeriod;
            rhsServicePeriod = that.getServicePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "servicePeriod", lhsServicePeriod), LocatorUtils.property(thatLocator, "servicePeriod", rhsServicePeriod), lhsServicePeriod, rhsServicePeriod, (this.servicePeriod!= null), (that.servicePeriod!= null))) {
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
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            ContractInformation theContractInformation;
            theContractInformation = this.getContractInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractInformation", theContractInformation), currentHashCode, theContractInformation, (this.contractInformation!= null));
        }
        {
            Float theEstimatedAvailableProductQuantity;
            theEstimatedAvailableProductQuantity = this.getEstimatedAvailableProductQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedAvailableProductQuantity", theEstimatedAvailableProductQuantity), currentHashCode, theEstimatedAvailableProductQuantity, (this.estimatedAvailableProductQuantity!= null));
        }
        {
            float theEstimatedAvailableServiceQuantity;
            theEstimatedAvailableServiceQuantity = this.getEstimatedAvailableServiceQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedAvailableServiceQuantity", theEstimatedAvailableServiceQuantity), currentHashCode, theEstimatedAvailableServiceQuantity, true);
        }
        {
            String theHandlingInstruction;
            theHandlingInstruction = this.getHandlingInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handlingInstruction", theHandlingInstruction), currentHashCode, theHandlingInstruction, (this.handlingInstruction!= null));
        }
        {
            SpecifiedPartnerDescriptionType theInstallAt;
            theInstallAt = this.getInstallAt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "installAt", theInstallAt), currentHashCode, theInstallAt, (this.installAt!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theProductLineNumber;
            theProductLineNumber = this.getProductLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLineNumber", theProductLineNumber), currentHashCode, theProductLineNumber, (this.productLineNumber!= null));
        }
        {
            List<String> theProductSerialIdentifier;
            theProductSerialIdentifier = (((this.productSerialIdentifier!= null)&&(!this.productSerialIdentifier.isEmpty()))?this.getProductSerialIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productSerialIdentifier", theProductSerialIdentifier), currentHashCode, theProductSerialIdentifier, ((this.productSerialIdentifier!= null)&&(!this.productSerialIdentifier.isEmpty())));
        }
        {
            BusinessDocumentReferenceType theQuote;
            theQuote = this.getQuote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quote", theQuote), currentHashCode, theQuote, (this.quote!= null));
        }
        {
            List<QuoteAcknowledgmentReason> theQuoteAcknowledgmentReason;
            theQuoteAcknowledgmentReason = (((this.quoteAcknowledgmentReason!= null)&&(!this.quoteAcknowledgmentReason.isEmpty()))?this.getQuoteAcknowledgmentReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteAcknowledgmentReason", theQuoteAcknowledgmentReason), currentHashCode, theQuoteAcknowledgmentReason, ((this.quoteAcknowledgmentReason!= null)&&(!this.quoteAcknowledgmentReason.isEmpty())));
        }
        {
            PurchaseOrderStatusType theQuoteStatus;
            theQuoteStatus = this.getQuoteStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteStatus", theQuoteStatus), currentHashCode, theQuoteStatus, (this.quoteStatus!= null));
        }
        {
            QuoteType theQuoteType;
            theQuoteType = this.getQuoteType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteType", theQuoteType), currentHashCode, theQuoteType, (this.quoteType!= null));
        }
        {
            Float theRequestedProductQuantity;
            theRequestedProductQuantity = this.getRequestedProductQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedProductQuantity", theRequestedProductQuantity), currentHashCode, theRequestedProductQuantity, (this.requestedProductQuantity!= null));
        }
        {
            Float theRequestedServiceQuantity;
            theRequestedServiceQuantity = this.getRequestedServiceQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedServiceQuantity", theRequestedServiceQuantity), currentHashCode, theRequestedServiceQuantity, (this.requestedServiceQuantity!= null));
        }
        {
            ProductPricingType theRequestedUnitPrice;
            theRequestedUnitPrice = this.getRequestedUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedUnitPrice", theRequestedUnitPrice), currentHashCode, theRequestedUnitPrice, (this.requestedUnitPrice!= null));
        }
        {
            RequoteLineStatusType theRequoteLineStatus;
            theRequoteLineStatus = this.getRequoteLineStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requoteLineStatus", theRequoteLineStatus), currentHashCode, theRequoteLineStatus, (this.requoteLineStatus!= null));
        }
        {
            String theResponseDescription;
            theResponseDescription = this.getResponseDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseDescription", theResponseDescription), currentHashCode, theResponseDescription, (this.responseDescription!= null));
        }
        {
            List<String> theServiceIdentification;
            theServiceIdentification = (((this.serviceIdentification!= null)&&(!this.serviceIdentification.isEmpty()))?this.getServiceIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceIdentification", theServiceIdentification), currentHashCode, theServiceIdentification, ((this.serviceIdentification!= null)&&(!this.serviceIdentification.isEmpty())));
        }
        {
            String theServiceLevel;
            theServiceLevel = this.getServiceLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceLevel", theServiceLevel), currentHashCode, theServiceLevel, (this.serviceLevel!= null));
        }
        {
            DatePeriodAndDurationType theServicePeriod;
            theServicePeriod = this.getServicePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "servicePeriod", theServicePeriod), currentHashCode, theServicePeriod, (this.servicePeriod!= null));
        }
        {
            List<SpecialDiscount> theSpecialDiscount;
            theSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialDiscount", theSpecialDiscount), currentHashCode, theSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())));
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
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            ContractInformation theContractInformation;
            theContractInformation = this.getContractInformation();
            strategy.appendField(locator, this, "contractInformation", buffer, theContractInformation, (this.contractInformation!= null));
        }
        {
            Float theEstimatedAvailableProductQuantity;
            theEstimatedAvailableProductQuantity = this.getEstimatedAvailableProductQuantity();
            strategy.appendField(locator, this, "estimatedAvailableProductQuantity", buffer, theEstimatedAvailableProductQuantity, (this.estimatedAvailableProductQuantity!= null));
        }
        {
            float theEstimatedAvailableServiceQuantity;
            theEstimatedAvailableServiceQuantity = this.getEstimatedAvailableServiceQuantity();
            strategy.appendField(locator, this, "estimatedAvailableServiceQuantity", buffer, theEstimatedAvailableServiceQuantity, true);
        }
        {
            String theHandlingInstruction;
            theHandlingInstruction = this.getHandlingInstruction();
            strategy.appendField(locator, this, "handlingInstruction", buffer, theHandlingInstruction, (this.handlingInstruction!= null));
        }
        {
            SpecifiedPartnerDescriptionType theInstallAt;
            theInstallAt = this.getInstallAt();
            strategy.appendField(locator, this, "installAt", buffer, theInstallAt, (this.installAt!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theProductLineNumber;
            theProductLineNumber = this.getProductLineNumber();
            strategy.appendField(locator, this, "productLineNumber", buffer, theProductLineNumber, (this.productLineNumber!= null));
        }
        {
            List<String> theProductSerialIdentifier;
            theProductSerialIdentifier = (((this.productSerialIdentifier!= null)&&(!this.productSerialIdentifier.isEmpty()))?this.getProductSerialIdentifier():null);
            strategy.appendField(locator, this, "productSerialIdentifier", buffer, theProductSerialIdentifier, ((this.productSerialIdentifier!= null)&&(!this.productSerialIdentifier.isEmpty())));
        }
        {
            BusinessDocumentReferenceType theQuote;
            theQuote = this.getQuote();
            strategy.appendField(locator, this, "quote", buffer, theQuote, (this.quote!= null));
        }
        {
            List<QuoteAcknowledgmentReason> theQuoteAcknowledgmentReason;
            theQuoteAcknowledgmentReason = (((this.quoteAcknowledgmentReason!= null)&&(!this.quoteAcknowledgmentReason.isEmpty()))?this.getQuoteAcknowledgmentReason():null);
            strategy.appendField(locator, this, "quoteAcknowledgmentReason", buffer, theQuoteAcknowledgmentReason, ((this.quoteAcknowledgmentReason!= null)&&(!this.quoteAcknowledgmentReason.isEmpty())));
        }
        {
            PurchaseOrderStatusType theQuoteStatus;
            theQuoteStatus = this.getQuoteStatus();
            strategy.appendField(locator, this, "quoteStatus", buffer, theQuoteStatus, (this.quoteStatus!= null));
        }
        {
            QuoteType theQuoteType;
            theQuoteType = this.getQuoteType();
            strategy.appendField(locator, this, "quoteType", buffer, theQuoteType, (this.quoteType!= null));
        }
        {
            Float theRequestedProductQuantity;
            theRequestedProductQuantity = this.getRequestedProductQuantity();
            strategy.appendField(locator, this, "requestedProductQuantity", buffer, theRequestedProductQuantity, (this.requestedProductQuantity!= null));
        }
        {
            Float theRequestedServiceQuantity;
            theRequestedServiceQuantity = this.getRequestedServiceQuantity();
            strategy.appendField(locator, this, "requestedServiceQuantity", buffer, theRequestedServiceQuantity, (this.requestedServiceQuantity!= null));
        }
        {
            ProductPricingType theRequestedUnitPrice;
            theRequestedUnitPrice = this.getRequestedUnitPrice();
            strategy.appendField(locator, this, "requestedUnitPrice", buffer, theRequestedUnitPrice, (this.requestedUnitPrice!= null));
        }
        {
            RequoteLineStatusType theRequoteLineStatus;
            theRequoteLineStatus = this.getRequoteLineStatus();
            strategy.appendField(locator, this, "requoteLineStatus", buffer, theRequoteLineStatus, (this.requoteLineStatus!= null));
        }
        {
            String theResponseDescription;
            theResponseDescription = this.getResponseDescription();
            strategy.appendField(locator, this, "responseDescription", buffer, theResponseDescription, (this.responseDescription!= null));
        }
        {
            List<String> theServiceIdentification;
            theServiceIdentification = (((this.serviceIdentification!= null)&&(!this.serviceIdentification.isEmpty()))?this.getServiceIdentification():null);
            strategy.appendField(locator, this, "serviceIdentification", buffer, theServiceIdentification, ((this.serviceIdentification!= null)&&(!this.serviceIdentification.isEmpty())));
        }
        {
            String theServiceLevel;
            theServiceLevel = this.getServiceLevel();
            strategy.appendField(locator, this, "serviceLevel", buffer, theServiceLevel, (this.serviceLevel!= null));
        }
        {
            DatePeriodAndDurationType theServicePeriod;
            theServicePeriod = this.getServicePeriod();
            strategy.appendField(locator, this, "servicePeriod", buffer, theServicePeriod, (this.servicePeriod!= null));
        }
        {
            List<SpecialDiscount> theSpecialDiscount;
            theSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            strategy.appendField(locator, this, "specialDiscount", buffer, theSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
