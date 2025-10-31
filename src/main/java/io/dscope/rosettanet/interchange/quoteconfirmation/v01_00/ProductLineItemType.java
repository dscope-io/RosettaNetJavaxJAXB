
package io.dscope.rosettanet.interchange.quoteconfirmation.v01_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_06.PurchaseOrderStatusType;
import io.dscope.rosettanet.domain.procurement.codelist.quoteacknowledgmentreason.v01_01.QuoteAcknowledgmentReason;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.SpecialDiscount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.StepPricing;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.SubstituteProductReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TaxExemptStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TaxSummary;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductPricingType;
import io.dscope.rosettanet.interchange.codelist.productterms.v01_01.ProductTerms;
import io.dscope.rosettanet.interchange.codelist.quotelineitemstatus.v01_01.QuoteLineItemStatus;
import io.dscope.rosettanet.interchange.codelist.stockindicator.v01_01.StockIndicator;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
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
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompetitorReference" type="{urn:rosettanet:specification:interchange:QuoteConfirmationNotification:xsd:schema:01.00}CompetitorReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" minOccurs="0"/&gt;
 *         &lt;element name="DesignRegistrationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedAvailableQuantity" type="{urn:rosettanet:specification:interchange:QuoteConfirmationNotification:xsd:schema:01.00}QuoteQuantityType"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03}GovernmentPriorityRating" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element name="OrderLeadTime" type="{urn:rosettanet:specification:interchange:QuoteConfirmationNotification:xsd:schema:01.00}OrderLeadTimeType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:ProductTerms:xsd:codelist:01.01}ProductTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01}QuoteAcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuoteCustomerInformation" type="{urn:rosettanet:specification:interchange:QuoteConfirmationNotification:xsd:schema:01.00}QuoteCustomerInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:QuoteLineItemStatus:xsd:codelist:01.01}QuoteLineItemStatus"/&gt;
 *         &lt;element name="QuoteReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="QuoteStatus" type="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06}PurchaseOrderStatusType"/&gt;
 *         &lt;element name="RequestedQuantity" type="{urn:rosettanet:specification:interchange:QuoteConfirmationNotification:xsd:schema:01.00}QuoteQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedUnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequoteLineStatus" type="{urn:rosettanet:specification:interchange:QuoteConfirmationNotification:xsd:schema:01.00}RequoteLineStatusType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledQuantity" type="{urn:rosettanet:specification:interchange:QuoteConfirmationNotification:xsd:schema:01.00}QuoteQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}StepPricing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.01}StockIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}SubstituteProductReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TaxSummary" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType"/&gt;
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
    "businessDocumentReference",
    "comments",
    "competitorReference",
    "countryOfOrigin",
    "designRegistrationIdentifier",
    "estimatedAvailableQuantity",
    "governmentContractIdentifier",
    "governmentPriorityRating",
    "identifier",
    "lineNumber",
    "listPrice",
    "orderLeadTime",
    "partnerDescription",
    "productIdentification",
    "productTerms",
    "quoteAcknowledgmentReason",
    "quoteCustomerInformation",
    "quoteLineItemStatus",
    "quoteReference",
    "quoteStatus",
    "requestedQuantity",
    "requestedUnitPrice",
    "requoteLineStatus",
    "responseDescription",
    "scheduledQuantity",
    "specialDiscount",
    "stepPricing",
    "stockIndicator",
    "substituteProductReference",
    "taxExemptStatus",
    "taxSummary",
    "unitOfMeasure",
    "unitPrice"
})
public class ProductLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "CompetitorReference")
    protected List<CompetitorReferenceType> competitorReference;
    @XmlElement(name = "CountryOfOrigin")
    protected CountryType countryOfOrigin;
    @XmlElement(name = "DesignRegistrationIdentifier")
    protected String designRegistrationIdentifier;
    @XmlElement(name = "EstimatedAvailableQuantity", required = true)
    protected QuoteQuantityType estimatedAvailableQuantity;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElementRef(name = "GovernmentPriorityRating", namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", type = GovernmentPriorityRating.class, required = false)
    protected GovernmentPriorityRating governmentPriorityRating;
    @XmlElement(name = "Identifier")
    protected List<String> identifier;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElement(name = "OrderLeadTime")
    protected OrderLeadTimeType orderLeadTime;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "ProductTerms", namespace = "urn:rosettanet:specification:interchange:ProductTerms:xsd:codelist:01.01", type = ProductTerms.class, required = false)
    protected List<ProductTerms> productTerms;
    @XmlElementRef(name = "QuoteAcknowledgmentReason", namespace = "urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01", type = QuoteAcknowledgmentReason.class, required = false)
    protected List<QuoteAcknowledgmentReason> quoteAcknowledgmentReason;
    @XmlElement(name = "QuoteCustomerInformation")
    protected List<QuoteCustomerInformationType> quoteCustomerInformation;
    @XmlElementRef(name = "QuoteLineItemStatus", namespace = "urn:rosettanet:specification:interchange:QuoteLineItemStatus:xsd:codelist:01.01", type = QuoteLineItemStatus.class)
    protected QuoteLineItemStatus quoteLineItemStatus;
    @XmlElement(name = "QuoteReference")
    protected BusinessDocumentReferenceType quoteReference;
    @XmlElement(name = "QuoteStatus", required = true)
    protected PurchaseOrderStatusType quoteStatus;
    @XmlElement(name = "RequestedQuantity")
    protected QuoteQuantityType requestedQuantity;
    @XmlElement(name = "RequestedUnitPrice")
    protected List<ProductPricingType> requestedUnitPrice;
    @XmlElement(name = "RequoteLineStatus")
    protected RequoteLineStatusType requoteLineStatus;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElement(name = "ScheduledQuantity")
    protected QuoteQuantityType scheduledQuantity;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlElementRef(name = "StepPricing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = StepPricing.class, required = false)
    protected List<StepPricing> stepPricing;
    @XmlElementRef(name = "StockIndicator", namespace = "urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.01", type = StockIndicator.class, required = false)
    protected StockIndicator stockIndicator;
    @XmlElementRef(name = "SubstituteProductReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = SubstituteProductReference.class, required = false)
    protected List<SubstituteProductReference> substituteProductReference;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElementRef(name = "TaxSummary", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = TaxSummary.class, required = false)
    protected TaxSummary taxSummary;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "UnitPrice", required = true)
    protected ProductPricingType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public BusinessDocumentReference getBusinessDocumentReference() {
        return businessDocumentReference;
    }

    /**
     * Sets the value of the businessDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public void setBusinessDocumentReference(BusinessDocumentReference value) {
        this.businessDocumentReference = value;
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
     * Gets the value of the competitorReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competitorReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetitorReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetitorReferenceType }
     * 
     * 
     */
    public List<CompetitorReferenceType> getCompetitorReference() {
        if (competitorReference == null) {
            competitorReference = new ArrayList<CompetitorReferenceType>();
        }
        return this.competitorReference;
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
     * Gets the value of the designRegistrationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignRegistrationIdentifier() {
        return designRegistrationIdentifier;
    }

    /**
     * Sets the value of the designRegistrationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignRegistrationIdentifier(String value) {
        this.designRegistrationIdentifier = value;
    }

    /**
     * Gets the value of the estimatedAvailableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteQuantityType }
     *     
     */
    public QuoteQuantityType getEstimatedAvailableQuantity() {
        return estimatedAvailableQuantity;
    }

    /**
     * Sets the value of the estimatedAvailableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteQuantityType }
     *     
     */
    public void setEstimatedAvailableQuantity(QuoteQuantityType value) {
        this.estimatedAvailableQuantity = value;
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
     * Gets the value of the orderLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLeadTimeType }
     *     
     */
    public OrderLeadTimeType getOrderLeadTime() {
        return orderLeadTime;
    }

    /**
     * Sets the value of the orderLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLeadTimeType }
     *     
     */
    public void setOrderLeadTime(OrderLeadTimeType value) {
        this.orderLeadTime = value;
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
     * Gets the value of the productTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductTerms }
     * 
     * 
     */
    public List<ProductTerms> getProductTerms() {
        if (productTerms == null) {
            productTerms = new ArrayList<ProductTerms>();
        }
        return this.productTerms;
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
     * Gets the value of the quoteCustomerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteCustomerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteCustomerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteCustomerInformationType }
     * 
     * 
     */
    public List<QuoteCustomerInformationType> getQuoteCustomerInformation() {
        if (quoteCustomerInformation == null) {
            quoteCustomerInformation = new ArrayList<QuoteCustomerInformationType>();
        }
        return this.quoteCustomerInformation;
    }

    /**
     * Gets the value of the quoteLineItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteLineItemStatus }
     *     
     */
    public QuoteLineItemStatus getQuoteLineItemStatus() {
        return quoteLineItemStatus;
    }

    /**
     * Sets the value of the quoteLineItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteLineItemStatus }
     *     
     */
    public void setQuoteLineItemStatus(QuoteLineItemStatus value) {
        this.quoteLineItemStatus = value;
    }

    /**
     * Gets the value of the quoteReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getQuoteReference() {
        return quoteReference;
    }

    /**
     * Sets the value of the quoteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setQuoteReference(BusinessDocumentReferenceType value) {
        this.quoteReference = value;
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
     * Gets the value of the requestedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteQuantityType }
     *     
     */
    public QuoteQuantityType getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Sets the value of the requestedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteQuantityType }
     *     
     */
    public void setRequestedQuantity(QuoteQuantityType value) {
        this.requestedQuantity = value;
    }

    /**
     * Gets the value of the requestedUnitPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedUnitPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedUnitPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPricingType }
     * 
     * 
     */
    public List<ProductPricingType> getRequestedUnitPrice() {
        if (requestedUnitPrice == null) {
            requestedUnitPrice = new ArrayList<ProductPricingType>();
        }
        return this.requestedUnitPrice;
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
     * Gets the value of the scheduledQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteQuantityType }
     *     
     */
    public QuoteQuantityType getScheduledQuantity() {
        return scheduledQuantity;
    }

    /**
     * Sets the value of the scheduledQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteQuantityType }
     *     
     */
    public void setScheduledQuantity(QuoteQuantityType value) {
        this.scheduledQuantity = value;
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
     * Gets the value of the stepPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStepPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StepPricing }
     * 
     * 
     */
    public List<StepPricing> getStepPricing() {
        if (stepPricing == null) {
            stepPricing = new ArrayList<StepPricing>();
        }
        return this.stepPricing;
    }

    /**
     * Gets the value of the stockIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StockIndicator }
     *     
     */
    public StockIndicator getStockIndicator() {
        return stockIndicator;
    }

    /**
     * Sets the value of the stockIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockIndicator }
     *     
     */
    public void setStockIndicator(StockIndicator value) {
        this.stockIndicator = value;
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
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setUnitPrice(ProductPricingType value) {
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
            BusinessDocumentReference lhsBusinessDocumentReference;
            lhsBusinessDocumentReference = this.getBusinessDocumentReference();
            BusinessDocumentReference rhsBusinessDocumentReference;
            rhsBusinessDocumentReference = that.getBusinessDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentReference", lhsBusinessDocumentReference), LocatorUtils.property(thatLocator, "businessDocumentReference", rhsBusinessDocumentReference), lhsBusinessDocumentReference, rhsBusinessDocumentReference, (this.businessDocumentReference!= null), (that.businessDocumentReference!= null))) {
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
            List<CompetitorReferenceType> lhsCompetitorReference;
            lhsCompetitorReference = (((this.competitorReference!= null)&&(!this.competitorReference.isEmpty()))?this.getCompetitorReference():null);
            List<CompetitorReferenceType> rhsCompetitorReference;
            rhsCompetitorReference = (((that.competitorReference!= null)&&(!that.competitorReference.isEmpty()))?that.getCompetitorReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "competitorReference", lhsCompetitorReference), LocatorUtils.property(thatLocator, "competitorReference", rhsCompetitorReference), lhsCompetitorReference, rhsCompetitorReference, ((this.competitorReference!= null)&&(!this.competitorReference.isEmpty())), ((that.competitorReference!= null)&&(!that.competitorReference.isEmpty())))) {
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
            String lhsDesignRegistrationIdentifier;
            lhsDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            String rhsDesignRegistrationIdentifier;
            rhsDesignRegistrationIdentifier = that.getDesignRegistrationIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designRegistrationIdentifier", lhsDesignRegistrationIdentifier), LocatorUtils.property(thatLocator, "designRegistrationIdentifier", rhsDesignRegistrationIdentifier), lhsDesignRegistrationIdentifier, rhsDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null), (that.designRegistrationIdentifier!= null))) {
                return false;
            }
        }
        {
            QuoteQuantityType lhsEstimatedAvailableQuantity;
            lhsEstimatedAvailableQuantity = this.getEstimatedAvailableQuantity();
            QuoteQuantityType rhsEstimatedAvailableQuantity;
            rhsEstimatedAvailableQuantity = that.getEstimatedAvailableQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedAvailableQuantity", lhsEstimatedAvailableQuantity), LocatorUtils.property(thatLocator, "estimatedAvailableQuantity", rhsEstimatedAvailableQuantity), lhsEstimatedAvailableQuantity, rhsEstimatedAvailableQuantity, (this.estimatedAvailableQuantity!= null), (that.estimatedAvailableQuantity!= null))) {
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
            List<String> lhsIdentifier;
            lhsIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            List<String> rhsIdentifier;
            rhsIdentifier = (((that.identifier!= null)&&(!that.identifier.isEmpty()))?that.getIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, ((this.identifier!= null)&&(!this.identifier.isEmpty())), ((that.identifier!= null)&&(!that.identifier.isEmpty())))) {
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
            OrderLeadTimeType lhsOrderLeadTime;
            lhsOrderLeadTime = this.getOrderLeadTime();
            OrderLeadTimeType rhsOrderLeadTime;
            rhsOrderLeadTime = that.getOrderLeadTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderLeadTime", lhsOrderLeadTime), LocatorUtils.property(thatLocator, "orderLeadTime", rhsOrderLeadTime), lhsOrderLeadTime, rhsOrderLeadTime, (this.orderLeadTime!= null), (that.orderLeadTime!= null))) {
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
            List<ProductTerms> lhsProductTerms;
            lhsProductTerms = (((this.productTerms!= null)&&(!this.productTerms.isEmpty()))?this.getProductTerms():null);
            List<ProductTerms> rhsProductTerms;
            rhsProductTerms = (((that.productTerms!= null)&&(!that.productTerms.isEmpty()))?that.getProductTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productTerms", lhsProductTerms), LocatorUtils.property(thatLocator, "productTerms", rhsProductTerms), lhsProductTerms, rhsProductTerms, ((this.productTerms!= null)&&(!this.productTerms.isEmpty())), ((that.productTerms!= null)&&(!that.productTerms.isEmpty())))) {
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
            List<QuoteCustomerInformationType> lhsQuoteCustomerInformation;
            lhsQuoteCustomerInformation = (((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty()))?this.getQuoteCustomerInformation():null);
            List<QuoteCustomerInformationType> rhsQuoteCustomerInformation;
            rhsQuoteCustomerInformation = (((that.quoteCustomerInformation!= null)&&(!that.quoteCustomerInformation.isEmpty()))?that.getQuoteCustomerInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quoteCustomerInformation", lhsQuoteCustomerInformation), LocatorUtils.property(thatLocator, "quoteCustomerInformation", rhsQuoteCustomerInformation), lhsQuoteCustomerInformation, rhsQuoteCustomerInformation, ((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty())), ((that.quoteCustomerInformation!= null)&&(!that.quoteCustomerInformation.isEmpty())))) {
                return false;
            }
        }
        {
            QuoteLineItemStatus lhsQuoteLineItemStatus;
            lhsQuoteLineItemStatus = this.getQuoteLineItemStatus();
            QuoteLineItemStatus rhsQuoteLineItemStatus;
            rhsQuoteLineItemStatus = that.getQuoteLineItemStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quoteLineItemStatus", lhsQuoteLineItemStatus), LocatorUtils.property(thatLocator, "quoteLineItemStatus", rhsQuoteLineItemStatus), lhsQuoteLineItemStatus, rhsQuoteLineItemStatus, (this.quoteLineItemStatus!= null), (that.quoteLineItemStatus!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsQuoteReference;
            lhsQuoteReference = this.getQuoteReference();
            BusinessDocumentReferenceType rhsQuoteReference;
            rhsQuoteReference = that.getQuoteReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quoteReference", lhsQuoteReference), LocatorUtils.property(thatLocator, "quoteReference", rhsQuoteReference), lhsQuoteReference, rhsQuoteReference, (this.quoteReference!= null), (that.quoteReference!= null))) {
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
            QuoteQuantityType lhsRequestedQuantity;
            lhsRequestedQuantity = this.getRequestedQuantity();
            QuoteQuantityType rhsRequestedQuantity;
            rhsRequestedQuantity = that.getRequestedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedQuantity", lhsRequestedQuantity), LocatorUtils.property(thatLocator, "requestedQuantity", rhsRequestedQuantity), lhsRequestedQuantity, rhsRequestedQuantity, (this.requestedQuantity!= null), (that.requestedQuantity!= null))) {
                return false;
            }
        }
        {
            List<ProductPricingType> lhsRequestedUnitPrice;
            lhsRequestedUnitPrice = (((this.requestedUnitPrice!= null)&&(!this.requestedUnitPrice.isEmpty()))?this.getRequestedUnitPrice():null);
            List<ProductPricingType> rhsRequestedUnitPrice;
            rhsRequestedUnitPrice = (((that.requestedUnitPrice!= null)&&(!that.requestedUnitPrice.isEmpty()))?that.getRequestedUnitPrice():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedUnitPrice", lhsRequestedUnitPrice), LocatorUtils.property(thatLocator, "requestedUnitPrice", rhsRequestedUnitPrice), lhsRequestedUnitPrice, rhsRequestedUnitPrice, ((this.requestedUnitPrice!= null)&&(!this.requestedUnitPrice.isEmpty())), ((that.requestedUnitPrice!= null)&&(!that.requestedUnitPrice.isEmpty())))) {
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
            QuoteQuantityType lhsScheduledQuantity;
            lhsScheduledQuantity = this.getScheduledQuantity();
            QuoteQuantityType rhsScheduledQuantity;
            rhsScheduledQuantity = that.getScheduledQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledQuantity", lhsScheduledQuantity), LocatorUtils.property(thatLocator, "scheduledQuantity", rhsScheduledQuantity), lhsScheduledQuantity, rhsScheduledQuantity, (this.scheduledQuantity!= null), (that.scheduledQuantity!= null))) {
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
            List<StepPricing> lhsStepPricing;
            lhsStepPricing = (((this.stepPricing!= null)&&(!this.stepPricing.isEmpty()))?this.getStepPricing():null);
            List<StepPricing> rhsStepPricing;
            rhsStepPricing = (((that.stepPricing!= null)&&(!that.stepPricing.isEmpty()))?that.getStepPricing():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stepPricing", lhsStepPricing), LocatorUtils.property(thatLocator, "stepPricing", rhsStepPricing), lhsStepPricing, rhsStepPricing, ((this.stepPricing!= null)&&(!this.stepPricing.isEmpty())), ((that.stepPricing!= null)&&(!that.stepPricing.isEmpty())))) {
                return false;
            }
        }
        {
            StockIndicator lhsStockIndicator;
            lhsStockIndicator = this.getStockIndicator();
            StockIndicator rhsStockIndicator;
            rhsStockIndicator = that.getStockIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stockIndicator", lhsStockIndicator), LocatorUtils.property(thatLocator, "stockIndicator", rhsStockIndicator), lhsStockIndicator, rhsStockIndicator, (this.stockIndicator!= null), (that.stockIndicator!= null))) {
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
            UnitOfMeasure lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            UnitOfMeasure rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, (this.unitOfMeasure!= null), (that.unitOfMeasure!= null))) {
                return false;
            }
        }
        {
            ProductPricingType lhsUnitPrice;
            lhsUnitPrice = this.getUnitPrice();
            ProductPricingType rhsUnitPrice;
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
            BusinessDocumentReference theBusinessDocumentReference;
            theBusinessDocumentReference = this.getBusinessDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, (this.businessDocumentReference!= null));
        }
        {
            String theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments, (this.comments!= null));
        }
        {
            List<CompetitorReferenceType> theCompetitorReference;
            theCompetitorReference = (((this.competitorReference!= null)&&(!this.competitorReference.isEmpty()))?this.getCompetitorReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "competitorReference", theCompetitorReference), currentHashCode, theCompetitorReference, ((this.competitorReference!= null)&&(!this.competitorReference.isEmpty())));
        }
        {
            CountryType theCountryOfOrigin;
            theCountryOfOrigin = this.getCountryOfOrigin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countryOfOrigin", theCountryOfOrigin), currentHashCode, theCountryOfOrigin, (this.countryOfOrigin!= null));
        }
        {
            String theDesignRegistrationIdentifier;
            theDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designRegistrationIdentifier", theDesignRegistrationIdentifier), currentHashCode, theDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null));
        }
        {
            QuoteQuantityType theEstimatedAvailableQuantity;
            theEstimatedAvailableQuantity = this.getEstimatedAvailableQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedAvailableQuantity", theEstimatedAvailableQuantity), currentHashCode, theEstimatedAvailableQuantity, (this.estimatedAvailableQuantity!= null));
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
            List<String> theIdentifier;
            theIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, ((this.identifier!= null)&&(!this.identifier.isEmpty())));
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
            OrderLeadTimeType theOrderLeadTime;
            theOrderLeadTime = this.getOrderLeadTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderLeadTime", theOrderLeadTime), currentHashCode, theOrderLeadTime, (this.orderLeadTime!= null));
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
            List<ProductTerms> theProductTerms;
            theProductTerms = (((this.productTerms!= null)&&(!this.productTerms.isEmpty()))?this.getProductTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productTerms", theProductTerms), currentHashCode, theProductTerms, ((this.productTerms!= null)&&(!this.productTerms.isEmpty())));
        }
        {
            List<QuoteAcknowledgmentReason> theQuoteAcknowledgmentReason;
            theQuoteAcknowledgmentReason = (((this.quoteAcknowledgmentReason!= null)&&(!this.quoteAcknowledgmentReason.isEmpty()))?this.getQuoteAcknowledgmentReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteAcknowledgmentReason", theQuoteAcknowledgmentReason), currentHashCode, theQuoteAcknowledgmentReason, ((this.quoteAcknowledgmentReason!= null)&&(!this.quoteAcknowledgmentReason.isEmpty())));
        }
        {
            List<QuoteCustomerInformationType> theQuoteCustomerInformation;
            theQuoteCustomerInformation = (((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty()))?this.getQuoteCustomerInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteCustomerInformation", theQuoteCustomerInformation), currentHashCode, theQuoteCustomerInformation, ((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty())));
        }
        {
            QuoteLineItemStatus theQuoteLineItemStatus;
            theQuoteLineItemStatus = this.getQuoteLineItemStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteLineItemStatus", theQuoteLineItemStatus), currentHashCode, theQuoteLineItemStatus, (this.quoteLineItemStatus!= null));
        }
        {
            BusinessDocumentReferenceType theQuoteReference;
            theQuoteReference = this.getQuoteReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteReference", theQuoteReference), currentHashCode, theQuoteReference, (this.quoteReference!= null));
        }
        {
            PurchaseOrderStatusType theQuoteStatus;
            theQuoteStatus = this.getQuoteStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteStatus", theQuoteStatus), currentHashCode, theQuoteStatus, (this.quoteStatus!= null));
        }
        {
            QuoteQuantityType theRequestedQuantity;
            theRequestedQuantity = this.getRequestedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedQuantity", theRequestedQuantity), currentHashCode, theRequestedQuantity, (this.requestedQuantity!= null));
        }
        {
            List<ProductPricingType> theRequestedUnitPrice;
            theRequestedUnitPrice = (((this.requestedUnitPrice!= null)&&(!this.requestedUnitPrice.isEmpty()))?this.getRequestedUnitPrice():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedUnitPrice", theRequestedUnitPrice), currentHashCode, theRequestedUnitPrice, ((this.requestedUnitPrice!= null)&&(!this.requestedUnitPrice.isEmpty())));
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
            QuoteQuantityType theScheduledQuantity;
            theScheduledQuantity = this.getScheduledQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledQuantity", theScheduledQuantity), currentHashCode, theScheduledQuantity, (this.scheduledQuantity!= null));
        }
        {
            List<SpecialDiscount> theSpecialDiscount;
            theSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialDiscount", theSpecialDiscount), currentHashCode, theSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())));
        }
        {
            List<StepPricing> theStepPricing;
            theStepPricing = (((this.stepPricing!= null)&&(!this.stepPricing.isEmpty()))?this.getStepPricing():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stepPricing", theStepPricing), currentHashCode, theStepPricing, ((this.stepPricing!= null)&&(!this.stepPricing.isEmpty())));
        }
        {
            StockIndicator theStockIndicator;
            theStockIndicator = this.getStockIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stockIndicator", theStockIndicator), currentHashCode, theStockIndicator, (this.stockIndicator!= null));
        }
        {
            List<SubstituteProductReference> theSubstituteProductReference;
            theSubstituteProductReference = (((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty()))?this.getSubstituteProductReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substituteProductReference", theSubstituteProductReference), currentHashCode, theSubstituteProductReference, ((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty())));
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
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            ProductPricingType theUnitPrice;
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
            BusinessDocumentReference theBusinessDocumentReference;
            theBusinessDocumentReference = this.getBusinessDocumentReference();
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, (this.businessDocumentReference!= null));
        }
        {
            String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments, (this.comments!= null));
        }
        {
            List<CompetitorReferenceType> theCompetitorReference;
            theCompetitorReference = (((this.competitorReference!= null)&&(!this.competitorReference.isEmpty()))?this.getCompetitorReference():null);
            strategy.appendField(locator, this, "competitorReference", buffer, theCompetitorReference, ((this.competitorReference!= null)&&(!this.competitorReference.isEmpty())));
        }
        {
            CountryType theCountryOfOrigin;
            theCountryOfOrigin = this.getCountryOfOrigin();
            strategy.appendField(locator, this, "countryOfOrigin", buffer, theCountryOfOrigin, (this.countryOfOrigin!= null));
        }
        {
            String theDesignRegistrationIdentifier;
            theDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            strategy.appendField(locator, this, "designRegistrationIdentifier", buffer, theDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null));
        }
        {
            QuoteQuantityType theEstimatedAvailableQuantity;
            theEstimatedAvailableQuantity = this.getEstimatedAvailableQuantity();
            strategy.appendField(locator, this, "estimatedAvailableQuantity", buffer, theEstimatedAvailableQuantity, (this.estimatedAvailableQuantity!= null));
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
            List<String> theIdentifier;
            theIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, ((this.identifier!= null)&&(!this.identifier.isEmpty())));
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
            OrderLeadTimeType theOrderLeadTime;
            theOrderLeadTime = this.getOrderLeadTime();
            strategy.appendField(locator, this, "orderLeadTime", buffer, theOrderLeadTime, (this.orderLeadTime!= null));
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
            List<ProductTerms> theProductTerms;
            theProductTerms = (((this.productTerms!= null)&&(!this.productTerms.isEmpty()))?this.getProductTerms():null);
            strategy.appendField(locator, this, "productTerms", buffer, theProductTerms, ((this.productTerms!= null)&&(!this.productTerms.isEmpty())));
        }
        {
            List<QuoteAcknowledgmentReason> theQuoteAcknowledgmentReason;
            theQuoteAcknowledgmentReason = (((this.quoteAcknowledgmentReason!= null)&&(!this.quoteAcknowledgmentReason.isEmpty()))?this.getQuoteAcknowledgmentReason():null);
            strategy.appendField(locator, this, "quoteAcknowledgmentReason", buffer, theQuoteAcknowledgmentReason, ((this.quoteAcknowledgmentReason!= null)&&(!this.quoteAcknowledgmentReason.isEmpty())));
        }
        {
            List<QuoteCustomerInformationType> theQuoteCustomerInformation;
            theQuoteCustomerInformation = (((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty()))?this.getQuoteCustomerInformation():null);
            strategy.appendField(locator, this, "quoteCustomerInformation", buffer, theQuoteCustomerInformation, ((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty())));
        }
        {
            QuoteLineItemStatus theQuoteLineItemStatus;
            theQuoteLineItemStatus = this.getQuoteLineItemStatus();
            strategy.appendField(locator, this, "quoteLineItemStatus", buffer, theQuoteLineItemStatus, (this.quoteLineItemStatus!= null));
        }
        {
            BusinessDocumentReferenceType theQuoteReference;
            theQuoteReference = this.getQuoteReference();
            strategy.appendField(locator, this, "quoteReference", buffer, theQuoteReference, (this.quoteReference!= null));
        }
        {
            PurchaseOrderStatusType theQuoteStatus;
            theQuoteStatus = this.getQuoteStatus();
            strategy.appendField(locator, this, "quoteStatus", buffer, theQuoteStatus, (this.quoteStatus!= null));
        }
        {
            QuoteQuantityType theRequestedQuantity;
            theRequestedQuantity = this.getRequestedQuantity();
            strategy.appendField(locator, this, "requestedQuantity", buffer, theRequestedQuantity, (this.requestedQuantity!= null));
        }
        {
            List<ProductPricingType> theRequestedUnitPrice;
            theRequestedUnitPrice = (((this.requestedUnitPrice!= null)&&(!this.requestedUnitPrice.isEmpty()))?this.getRequestedUnitPrice():null);
            strategy.appendField(locator, this, "requestedUnitPrice", buffer, theRequestedUnitPrice, ((this.requestedUnitPrice!= null)&&(!this.requestedUnitPrice.isEmpty())));
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
            QuoteQuantityType theScheduledQuantity;
            theScheduledQuantity = this.getScheduledQuantity();
            strategy.appendField(locator, this, "scheduledQuantity", buffer, theScheduledQuantity, (this.scheduledQuantity!= null));
        }
        {
            List<SpecialDiscount> theSpecialDiscount;
            theSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            strategy.appendField(locator, this, "specialDiscount", buffer, theSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())));
        }
        {
            List<StepPricing> theStepPricing;
            theStepPricing = (((this.stepPricing!= null)&&(!this.stepPricing.isEmpty()))?this.getStepPricing():null);
            strategy.appendField(locator, this, "stepPricing", buffer, theStepPricing, ((this.stepPricing!= null)&&(!this.stepPricing.isEmpty())));
        }
        {
            StockIndicator theStockIndicator;
            theStockIndicator = this.getStockIndicator();
            strategy.appendField(locator, this, "stockIndicator", buffer, theStockIndicator, (this.stockIndicator!= null));
        }
        {
            List<SubstituteProductReference> theSubstituteProductReference;
            theSubstituteProductReference = (((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty()))?this.getSubstituteProductReference():null);
            strategy.appendField(locator, this, "substituteProductReference", buffer, theSubstituteProductReference, ((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty())));
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
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            ProductPricingType theUnitPrice;
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
