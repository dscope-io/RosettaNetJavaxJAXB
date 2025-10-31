
package io.dscope.rosettanet.interchange.quoterequest.v02_02;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.SpecialDiscount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.TaxExemptStatus;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductPricingType;
import io.dscope.rosettanet.interchange.codelist.stockindicator.v01_01.StockIndicator;
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
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompetitorReference" type="{urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:02.02}CompetitorReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DesignRegistrationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03}GovernmentPriorityRating" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsRequiredToResponseAtDetailLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSubstituteProductAcceptable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="QuoteCustomerInformation" type="{urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:02.02}QuoteCustomerInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedQuantity" type="{urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:02.02}QuoteQuantityType"/&gt;
 *         &lt;element name="RequestedUnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequoteLineStatus" type="{urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:02.02}RequoteLineStatusType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.01}StockIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}TaxExemptStatus" minOccurs="0"/&gt;
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
    "businessDocumentReference",
    "comments",
    "competitorReference",
    "designRegistrationIdentifier",
    "governmentContractIdentifier",
    "governmentPriorityRating",
    "identifier",
    "isRequiredToResponseAtDetailLevel",
    "isSubstituteProductAcceptable",
    "lineNumber",
    "listPrice",
    "partnerDescription",
    "productIdentification",
    "quoteCustomerInformation",
    "requestedQuantity",
    "requestedUnitPrice",
    "requoteLineStatus",
    "specialDiscount",
    "stockIndicator",
    "taxExemptStatus",
    "unitOfMeasure"
})
public class ProductLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "CompetitorReference")
    protected List<CompetitorReferenceType> competitorReference;
    @XmlElement(name = "DesignRegistrationIdentifier")
    protected String designRegistrationIdentifier;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElementRef(name = "GovernmentPriorityRating", namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", type = GovernmentPriorityRating.class, required = false)
    protected GovernmentPriorityRating governmentPriorityRating;
    @XmlElement(name = "Identifier")
    protected List<String> identifier;
    @XmlElement(name = "IsRequiredToResponseAtDetailLevel")
    protected Boolean isRequiredToResponseAtDetailLevel;
    @XmlElement(name = "IsSubstituteProductAcceptable")
    protected boolean isSubstituteProductAcceptable;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "QuoteCustomerInformation")
    protected List<QuoteCustomerInformationType> quoteCustomerInformation;
    @XmlElement(name = "RequestedQuantity", required = true)
    protected QuoteQuantityType requestedQuantity;
    @XmlElement(name = "RequestedUnitPrice")
    protected List<ProductPricingType> requestedUnitPrice;
    @XmlElement(name = "RequoteLineStatus")
    protected RequoteLineStatusType requoteLineStatus;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlElementRef(name = "StockIndicator", namespace = "urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.01", type = StockIndicator.class, required = false)
    protected StockIndicator stockIndicator;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
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
     * Gets the value of the isRequiredToResponseAtDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequiredToResponseAtDetailLevel() {
        return isRequiredToResponseAtDetailLevel;
    }

    /**
     * Sets the value of the isRequiredToResponseAtDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequiredToResponseAtDetailLevel(Boolean value) {
        this.isRequiredToResponseAtDetailLevel = value;
    }

    /**
     * Gets the value of the isSubstituteProductAcceptable property.
     * 
     */
    public boolean isIsSubstituteProductAcceptable() {
        return isSubstituteProductAcceptable;
    }

    /**
     * Sets the value of the isSubstituteProductAcceptable property.
     * 
     */
    public void setIsSubstituteProductAcceptable(boolean value) {
        this.isSubstituteProductAcceptable = value;
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
            List<CompetitorReferenceType> lhsCompetitorReference;
            lhsCompetitorReference = (((this.competitorReference!= null)&&(!this.competitorReference.isEmpty()))?this.getCompetitorReference():null);
            List<CompetitorReferenceType> rhsCompetitorReference;
            rhsCompetitorReference = (((that.competitorReference!= null)&&(!that.competitorReference.isEmpty()))?that.getCompetitorReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "competitorReference", lhsCompetitorReference), LocatorUtils.property(thatLocator, "competitorReference", rhsCompetitorReference), lhsCompetitorReference, rhsCompetitorReference, ((this.competitorReference!= null)&&(!this.competitorReference.isEmpty())), ((that.competitorReference!= null)&&(!that.competitorReference.isEmpty())))) {
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
            Boolean lhsIsRequiredToResponseAtDetailLevel;
            lhsIsRequiredToResponseAtDetailLevel = this.isIsRequiredToResponseAtDetailLevel();
            Boolean rhsIsRequiredToResponseAtDetailLevel;
            rhsIsRequiredToResponseAtDetailLevel = that.isIsRequiredToResponseAtDetailLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRequiredToResponseAtDetailLevel", lhsIsRequiredToResponseAtDetailLevel), LocatorUtils.property(thatLocator, "isRequiredToResponseAtDetailLevel", rhsIsRequiredToResponseAtDetailLevel), lhsIsRequiredToResponseAtDetailLevel, rhsIsRequiredToResponseAtDetailLevel, (this.isRequiredToResponseAtDetailLevel!= null), (that.isRequiredToResponseAtDetailLevel!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsSubstituteProductAcceptable;
            lhsIsSubstituteProductAcceptable = this.isIsSubstituteProductAcceptable();
            boolean rhsIsSubstituteProductAcceptable;
            rhsIsSubstituteProductAcceptable = that.isIsSubstituteProductAcceptable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isSubstituteProductAcceptable", lhsIsSubstituteProductAcceptable), LocatorUtils.property(thatLocator, "isSubstituteProductAcceptable", rhsIsSubstituteProductAcceptable), lhsIsSubstituteProductAcceptable, rhsIsSubstituteProductAcceptable, true, true)) {
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
            List<QuoteCustomerInformationType> lhsQuoteCustomerInformation;
            lhsQuoteCustomerInformation = (((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty()))?this.getQuoteCustomerInformation():null);
            List<QuoteCustomerInformationType> rhsQuoteCustomerInformation;
            rhsQuoteCustomerInformation = (((that.quoteCustomerInformation!= null)&&(!that.quoteCustomerInformation.isEmpty()))?that.getQuoteCustomerInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quoteCustomerInformation", lhsQuoteCustomerInformation), LocatorUtils.property(thatLocator, "quoteCustomerInformation", rhsQuoteCustomerInformation), lhsQuoteCustomerInformation, rhsQuoteCustomerInformation, ((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty())), ((that.quoteCustomerInformation!= null)&&(!that.quoteCustomerInformation.isEmpty())))) {
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
            List<SpecialDiscount> lhsSpecialDiscount;
            lhsSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            List<SpecialDiscount> rhsSpecialDiscount;
            rhsSpecialDiscount = (((that.specialDiscount!= null)&&(!that.specialDiscount.isEmpty()))?that.getSpecialDiscount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialDiscount", lhsSpecialDiscount), LocatorUtils.property(thatLocator, "specialDiscount", rhsSpecialDiscount), lhsSpecialDiscount, rhsSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())), ((that.specialDiscount!= null)&&(!that.specialDiscount.isEmpty())))) {
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
            TaxExemptStatus lhsTaxExemptStatus;
            lhsTaxExemptStatus = this.getTaxExemptStatus();
            TaxExemptStatus rhsTaxExemptStatus;
            rhsTaxExemptStatus = that.getTaxExemptStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxExemptStatus", lhsTaxExemptStatus), LocatorUtils.property(thatLocator, "taxExemptStatus", rhsTaxExemptStatus), lhsTaxExemptStatus, rhsTaxExemptStatus, (this.taxExemptStatus!= null), (that.taxExemptStatus!= null))) {
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
            List<CompetitorReferenceType> theCompetitorReference;
            theCompetitorReference = (((this.competitorReference!= null)&&(!this.competitorReference.isEmpty()))?this.getCompetitorReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "competitorReference", theCompetitorReference), currentHashCode, theCompetitorReference, ((this.competitorReference!= null)&&(!this.competitorReference.isEmpty())));
        }
        {
            String theDesignRegistrationIdentifier;
            theDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designRegistrationIdentifier", theDesignRegistrationIdentifier), currentHashCode, theDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null));
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
            Boolean theIsRequiredToResponseAtDetailLevel;
            theIsRequiredToResponseAtDetailLevel = this.isIsRequiredToResponseAtDetailLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRequiredToResponseAtDetailLevel", theIsRequiredToResponseAtDetailLevel), currentHashCode, theIsRequiredToResponseAtDetailLevel, (this.isRequiredToResponseAtDetailLevel!= null));
        }
        {
            boolean theIsSubstituteProductAcceptable;
            theIsSubstituteProductAcceptable = this.isIsSubstituteProductAcceptable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isSubstituteProductAcceptable", theIsSubstituteProductAcceptable), currentHashCode, theIsSubstituteProductAcceptable, true);
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
            List<QuoteCustomerInformationType> theQuoteCustomerInformation;
            theQuoteCustomerInformation = (((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty()))?this.getQuoteCustomerInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteCustomerInformation", theQuoteCustomerInformation), currentHashCode, theQuoteCustomerInformation, ((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty())));
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
            List<SpecialDiscount> theSpecialDiscount;
            theSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialDiscount", theSpecialDiscount), currentHashCode, theSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())));
        }
        {
            StockIndicator theStockIndicator;
            theStockIndicator = this.getStockIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stockIndicator", theStockIndicator), currentHashCode, theStockIndicator, (this.stockIndicator!= null));
        }
        {
            TaxExemptStatus theTaxExemptStatus;
            theTaxExemptStatus = this.getTaxExemptStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxExemptStatus", theTaxExemptStatus), currentHashCode, theTaxExemptStatus, (this.taxExemptStatus!= null));
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
            List<CompetitorReferenceType> theCompetitorReference;
            theCompetitorReference = (((this.competitorReference!= null)&&(!this.competitorReference.isEmpty()))?this.getCompetitorReference():null);
            strategy.appendField(locator, this, "competitorReference", buffer, theCompetitorReference, ((this.competitorReference!= null)&&(!this.competitorReference.isEmpty())));
        }
        {
            String theDesignRegistrationIdentifier;
            theDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            strategy.appendField(locator, this, "designRegistrationIdentifier", buffer, theDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null));
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
            Boolean theIsRequiredToResponseAtDetailLevel;
            theIsRequiredToResponseAtDetailLevel = this.isIsRequiredToResponseAtDetailLevel();
            strategy.appendField(locator, this, "isRequiredToResponseAtDetailLevel", buffer, theIsRequiredToResponseAtDetailLevel, (this.isRequiredToResponseAtDetailLevel!= null));
        }
        {
            boolean theIsSubstituteProductAcceptable;
            theIsSubstituteProductAcceptable = this.isIsSubstituteProductAcceptable();
            strategy.appendField(locator, this, "isSubstituteProductAcceptable", buffer, theIsSubstituteProductAcceptable, true);
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
            List<QuoteCustomerInformationType> theQuoteCustomerInformation;
            theQuoteCustomerInformation = (((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty()))?this.getQuoteCustomerInformation():null);
            strategy.appendField(locator, this, "quoteCustomerInformation", buffer, theQuoteCustomerInformation, ((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty())));
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
            List<SpecialDiscount> theSpecialDiscount;
            theSpecialDiscount = (((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty()))?this.getSpecialDiscount():null);
            strategy.appendField(locator, this, "specialDiscount", buffer, theSpecialDiscount, ((this.specialDiscount!= null)&&(!this.specialDiscount.isEmpty())));
        }
        {
            StockIndicator theStockIndicator;
            theStockIndicator = this.getStockIndicator();
            strategy.appendField(locator, this, "stockIndicator", buffer, theStockIndicator, (this.stockIndicator!= null));
        }
        {
            TaxExemptStatus theTaxExemptStatus;
            theTaxExemptStatus = this.getTaxExemptStatus();
            strategy.appendField(locator, this, "taxExemptStatus", buffer, theTaxExemptStatus, (this.taxExemptStatus!= null));
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
