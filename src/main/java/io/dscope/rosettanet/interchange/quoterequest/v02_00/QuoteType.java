
package io.dscope.rosettanet.interchange.quoterequest.v02_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.PriceCondition;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.SpecialDiscount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.TaxExemptStatus;
import io.dscope.rosettanet.domain.shared.shared.v01_04.CarrierInformation;
import io.dscope.rosettanet.domain.shared.shared.v01_04.MonetaryAmountType;
import io.dscope.rosettanet.domain.shared.shared.v01_04.ProductPricingType;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_03.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_03.BusinessDocumentReferenceType;
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
 * <p>Java class for QuoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.03}BusinessDocumentReference" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}CarrierInformation" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractOwner" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="DistributedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FinancedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.03}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03}GovernmentPriorityRating" minOccurs="0"/&gt;
 *         &lt;element name="IsRequiredToResponseAtDetailLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}PriceCondition" minOccurs="0"/&gt;
 *         &lt;element name="QuoteCustomerInformation" type="{urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:02.00}QuoteCustomerInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuoteLineItem" type="{urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:02.00}QuoteLineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.05}QuoteType"/&gt;
 *         &lt;element name="RequestedResponseDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="RequoteReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.03}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RespondTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element name="TotalPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}MonetaryAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "QuoteType", propOrder = {
    "billTo",
    "businessDocumentReference",
    "carrierInformation",
    "comments",
    "contractOwner",
    "distributedBy",
    "financedBy",
    "governmentContractIdentifier",
    "governmentPriorityRating",
    "isRequiredToResponseAtDetailLevel",
    "listPrice",
    "priceCondition",
    "quoteCustomerInformation",
    "quoteLineItem",
    "quoteType",
    "requestedResponseDate",
    "requoteReference",
    "respondTo",
    "specialDiscount",
    "taxExemptStatus",
    "totalPrice"
})
public class QuoteType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BillTo")
    protected SpecifiedPartnerDescriptionType billTo;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.03", type = BusinessDocumentReference.class)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "CarrierInformation", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.04", type = CarrierInformation.class, required = false)
    protected CarrierInformation carrierInformation;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "ContractOwner")
    protected SpecifiedPartnerDescriptionType contractOwner;
    @XmlElement(name = "DistributedBy")
    protected List<SpecifiedPartnerDescriptionType> distributedBy;
    @XmlElement(name = "FinancedBy")
    protected SpecifiedPartnerDescriptionType financedBy;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElementRef(name = "GovernmentPriorityRating", namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", type = GovernmentPriorityRating.class, required = false)
    protected GovernmentPriorityRating governmentPriorityRating;
    @XmlElement(name = "IsRequiredToResponseAtDetailLevel")
    protected Boolean isRequiredToResponseAtDetailLevel;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElementRef(name = "PriceCondition", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = PriceCondition.class, required = false)
    protected PriceCondition priceCondition;
    @XmlElement(name = "QuoteCustomerInformation")
    protected List<QuoteCustomerInformationType> quoteCustomerInformation;
    @XmlElement(name = "QuoteLineItem")
    protected List<QuoteLineItemType> quoteLineItem;
    @XmlElementRef(name = "QuoteType", namespace = "urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.05", type = io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType.class)
    protected io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType quoteType;
    @XmlElement(name = "RequestedResponseDate")
    protected DatePeriodType requestedResponseDate;
    @XmlElement(name = "RequoteReference")
    protected List<BusinessDocumentReferenceType> requoteReference;
    @XmlElement(name = "RespondTo")
    protected List<SpecifiedPartnerDescriptionType> respondTo;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElement(name = "TotalPrice")
    protected MonetaryAmountType totalPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the carrierInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierInformation }
     *     
     */
    public CarrierInformation getCarrierInformation() {
        return carrierInformation;
    }

    /**
     * Sets the value of the carrierInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierInformation }
     *     
     */
    public void setCarrierInformation(CarrierInformation value) {
        this.carrierInformation = value;
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
     * Gets the value of the distributedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedPartnerDescriptionType }
     * 
     * 
     */
    public List<SpecifiedPartnerDescriptionType> getDistributedBy() {
        if (distributedBy == null) {
            distributedBy = new ArrayList<SpecifiedPartnerDescriptionType>();
        }
        return this.distributedBy;
    }

    /**
     * Gets the value of the financedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getFinancedBy() {
        return financedBy;
    }

    /**
     * Sets the value of the financedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setFinancedBy(SpecifiedPartnerDescriptionType value) {
        this.financedBy = value;
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
     * Gets the value of the priceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link PriceCondition }
     *     
     */
    public PriceCondition getPriceCondition() {
        return priceCondition;
    }

    /**
     * Sets the value of the priceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceCondition }
     *     
     */
    public void setPriceCondition(PriceCondition value) {
        this.priceCondition = value;
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
     * Gets the value of the quoteLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteLineItemType }
     * 
     * 
     */
    public List<QuoteLineItemType> getQuoteLineItem() {
        if (quoteLineItem == null) {
            quoteLineItem = new ArrayList<QuoteLineItemType>();
        }
        return this.quoteLineItem;
    }

    /**
     * Gets the value of the quoteType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType }
     *     
     */
    public io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType getQuoteType() {
        return quoteType;
    }

    /**
     * Sets the value of the quoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType }
     *     
     */
    public void setQuoteType(io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType value) {
        this.quoteType = value;
    }

    /**
     * Gets the value of the requestedResponseDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getRequestedResponseDate() {
        return requestedResponseDate;
    }

    /**
     * Sets the value of the requestedResponseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setRequestedResponseDate(DatePeriodType value) {
        this.requestedResponseDate = value;
    }

    /**
     * Gets the value of the requoteReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requoteReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequoteReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getRequoteReference() {
        if (requoteReference == null) {
            requoteReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.requoteReference;
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
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setTotalPrice(MonetaryAmountType value) {
        this.totalPrice = value;
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
        final QuoteType that = ((QuoteType) object);
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
            CarrierInformation lhsCarrierInformation;
            lhsCarrierInformation = this.getCarrierInformation();
            CarrierInformation rhsCarrierInformation;
            rhsCarrierInformation = that.getCarrierInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carrierInformation", lhsCarrierInformation), LocatorUtils.property(thatLocator, "carrierInformation", rhsCarrierInformation), lhsCarrierInformation, rhsCarrierInformation, (this.carrierInformation!= null), (that.carrierInformation!= null))) {
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
            SpecifiedPartnerDescriptionType lhsContractOwner;
            lhsContractOwner = this.getContractOwner();
            SpecifiedPartnerDescriptionType rhsContractOwner;
            rhsContractOwner = that.getContractOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractOwner", lhsContractOwner), LocatorUtils.property(thatLocator, "contractOwner", rhsContractOwner), lhsContractOwner, rhsContractOwner, (this.contractOwner!= null), (that.contractOwner!= null))) {
                return false;
            }
        }
        {
            List<SpecifiedPartnerDescriptionType> lhsDistributedBy;
            lhsDistributedBy = (((this.distributedBy!= null)&&(!this.distributedBy.isEmpty()))?this.getDistributedBy():null);
            List<SpecifiedPartnerDescriptionType> rhsDistributedBy;
            rhsDistributedBy = (((that.distributedBy!= null)&&(!that.distributedBy.isEmpty()))?that.getDistributedBy():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distributedBy", lhsDistributedBy), LocatorUtils.property(thatLocator, "distributedBy", rhsDistributedBy), lhsDistributedBy, rhsDistributedBy, ((this.distributedBy!= null)&&(!this.distributedBy.isEmpty())), ((that.distributedBy!= null)&&(!that.distributedBy.isEmpty())))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsFinancedBy;
            lhsFinancedBy = this.getFinancedBy();
            SpecifiedPartnerDescriptionType rhsFinancedBy;
            rhsFinancedBy = that.getFinancedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financedBy", lhsFinancedBy), LocatorUtils.property(thatLocator, "financedBy", rhsFinancedBy), lhsFinancedBy, rhsFinancedBy, (this.financedBy!= null), (that.financedBy!= null))) {
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
            Boolean lhsIsRequiredToResponseAtDetailLevel;
            lhsIsRequiredToResponseAtDetailLevel = this.isIsRequiredToResponseAtDetailLevel();
            Boolean rhsIsRequiredToResponseAtDetailLevel;
            rhsIsRequiredToResponseAtDetailLevel = that.isIsRequiredToResponseAtDetailLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRequiredToResponseAtDetailLevel", lhsIsRequiredToResponseAtDetailLevel), LocatorUtils.property(thatLocator, "isRequiredToResponseAtDetailLevel", rhsIsRequiredToResponseAtDetailLevel), lhsIsRequiredToResponseAtDetailLevel, rhsIsRequiredToResponseAtDetailLevel, (this.isRequiredToResponseAtDetailLevel!= null), (that.isRequiredToResponseAtDetailLevel!= null))) {
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
            PriceCondition lhsPriceCondition;
            lhsPriceCondition = this.getPriceCondition();
            PriceCondition rhsPriceCondition;
            rhsPriceCondition = that.getPriceCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceCondition", lhsPriceCondition), LocatorUtils.property(thatLocator, "priceCondition", rhsPriceCondition), lhsPriceCondition, rhsPriceCondition, (this.priceCondition!= null), (that.priceCondition!= null))) {
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
            List<QuoteLineItemType> lhsQuoteLineItem;
            lhsQuoteLineItem = (((this.quoteLineItem!= null)&&(!this.quoteLineItem.isEmpty()))?this.getQuoteLineItem():null);
            List<QuoteLineItemType> rhsQuoteLineItem;
            rhsQuoteLineItem = (((that.quoteLineItem!= null)&&(!that.quoteLineItem.isEmpty()))?that.getQuoteLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quoteLineItem", lhsQuoteLineItem), LocatorUtils.property(thatLocator, "quoteLineItem", rhsQuoteLineItem), lhsQuoteLineItem, rhsQuoteLineItem, ((this.quoteLineItem!= null)&&(!this.quoteLineItem.isEmpty())), ((that.quoteLineItem!= null)&&(!that.quoteLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType lhsQuoteType;
            lhsQuoteType = this.getQuoteType();
            io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType rhsQuoteType;
            rhsQuoteType = that.getQuoteType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quoteType", lhsQuoteType), LocatorUtils.property(thatLocator, "quoteType", rhsQuoteType), lhsQuoteType, rhsQuoteType, (this.quoteType!= null), (that.quoteType!= null))) {
                return false;
            }
        }
        {
            DatePeriodType lhsRequestedResponseDate;
            lhsRequestedResponseDate = this.getRequestedResponseDate();
            DatePeriodType rhsRequestedResponseDate;
            rhsRequestedResponseDate = that.getRequestedResponseDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedResponseDate", lhsRequestedResponseDate), LocatorUtils.property(thatLocator, "requestedResponseDate", rhsRequestedResponseDate), lhsRequestedResponseDate, rhsRequestedResponseDate, (this.requestedResponseDate!= null), (that.requestedResponseDate!= null))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsRequoteReference;
            lhsRequoteReference = (((this.requoteReference!= null)&&(!this.requoteReference.isEmpty()))?this.getRequoteReference():null);
            List<BusinessDocumentReferenceType> rhsRequoteReference;
            rhsRequoteReference = (((that.requoteReference!= null)&&(!that.requoteReference.isEmpty()))?that.getRequoteReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requoteReference", lhsRequoteReference), LocatorUtils.property(thatLocator, "requoteReference", rhsRequoteReference), lhsRequoteReference, rhsRequoteReference, ((this.requoteReference!= null)&&(!this.requoteReference.isEmpty())), ((that.requoteReference!= null)&&(!that.requoteReference.isEmpty())))) {
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
            MonetaryAmountType lhsTotalPrice;
            lhsTotalPrice = this.getTotalPrice();
            MonetaryAmountType rhsTotalPrice;
            rhsTotalPrice = that.getTotalPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalPrice", lhsTotalPrice), LocatorUtils.property(thatLocator, "totalPrice", rhsTotalPrice), lhsTotalPrice, rhsTotalPrice, (this.totalPrice!= null), (that.totalPrice!= null))) {
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
            CarrierInformation theCarrierInformation;
            theCarrierInformation = this.getCarrierInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierInformation", theCarrierInformation), currentHashCode, theCarrierInformation, (this.carrierInformation!= null));
        }
        {
            String theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments, (this.comments!= null));
        }
        {
            SpecifiedPartnerDescriptionType theContractOwner;
            theContractOwner = this.getContractOwner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractOwner", theContractOwner), currentHashCode, theContractOwner, (this.contractOwner!= null));
        }
        {
            List<SpecifiedPartnerDescriptionType> theDistributedBy;
            theDistributedBy = (((this.distributedBy!= null)&&(!this.distributedBy.isEmpty()))?this.getDistributedBy():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distributedBy", theDistributedBy), currentHashCode, theDistributedBy, ((this.distributedBy!= null)&&(!this.distributedBy.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theFinancedBy;
            theFinancedBy = this.getFinancedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financedBy", theFinancedBy), currentHashCode, theFinancedBy, (this.financedBy!= null));
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
            Boolean theIsRequiredToResponseAtDetailLevel;
            theIsRequiredToResponseAtDetailLevel = this.isIsRequiredToResponseAtDetailLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRequiredToResponseAtDetailLevel", theIsRequiredToResponseAtDetailLevel), currentHashCode, theIsRequiredToResponseAtDetailLevel, (this.isRequiredToResponseAtDetailLevel!= null));
        }
        {
            ProductPricingType theListPrice;
            theListPrice = this.getListPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listPrice", theListPrice), currentHashCode, theListPrice, (this.listPrice!= null));
        }
        {
            PriceCondition thePriceCondition;
            thePriceCondition = this.getPriceCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceCondition", thePriceCondition), currentHashCode, thePriceCondition, (this.priceCondition!= null));
        }
        {
            List<QuoteCustomerInformationType> theQuoteCustomerInformation;
            theQuoteCustomerInformation = (((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty()))?this.getQuoteCustomerInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteCustomerInformation", theQuoteCustomerInformation), currentHashCode, theQuoteCustomerInformation, ((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty())));
        }
        {
            List<QuoteLineItemType> theQuoteLineItem;
            theQuoteLineItem = (((this.quoteLineItem!= null)&&(!this.quoteLineItem.isEmpty()))?this.getQuoteLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteLineItem", theQuoteLineItem), currentHashCode, theQuoteLineItem, ((this.quoteLineItem!= null)&&(!this.quoteLineItem.isEmpty())));
        }
        {
            io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType theQuoteType;
            theQuoteType = this.getQuoteType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteType", theQuoteType), currentHashCode, theQuoteType, (this.quoteType!= null));
        }
        {
            DatePeriodType theRequestedResponseDate;
            theRequestedResponseDate = this.getRequestedResponseDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedResponseDate", theRequestedResponseDate), currentHashCode, theRequestedResponseDate, (this.requestedResponseDate!= null));
        }
        {
            List<BusinessDocumentReferenceType> theRequoteReference;
            theRequoteReference = (((this.requoteReference!= null)&&(!this.requoteReference.isEmpty()))?this.getRequoteReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requoteReference", theRequoteReference), currentHashCode, theRequoteReference, ((this.requoteReference!= null)&&(!this.requoteReference.isEmpty())));
        }
        {
            List<SpecifiedPartnerDescriptionType> theRespondTo;
            theRespondTo = (((this.respondTo!= null)&&(!this.respondTo.isEmpty()))?this.getRespondTo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "respondTo", theRespondTo), currentHashCode, theRespondTo, ((this.respondTo!= null)&&(!this.respondTo.isEmpty())));
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
            MonetaryAmountType theTotalPrice;
            theTotalPrice = this.getTotalPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalPrice", theTotalPrice), currentHashCode, theTotalPrice, (this.totalPrice!= null));
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
            CarrierInformation theCarrierInformation;
            theCarrierInformation = this.getCarrierInformation();
            strategy.appendField(locator, this, "carrierInformation", buffer, theCarrierInformation, (this.carrierInformation!= null));
        }
        {
            String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments, (this.comments!= null));
        }
        {
            SpecifiedPartnerDescriptionType theContractOwner;
            theContractOwner = this.getContractOwner();
            strategy.appendField(locator, this, "contractOwner", buffer, theContractOwner, (this.contractOwner!= null));
        }
        {
            List<SpecifiedPartnerDescriptionType> theDistributedBy;
            theDistributedBy = (((this.distributedBy!= null)&&(!this.distributedBy.isEmpty()))?this.getDistributedBy():null);
            strategy.appendField(locator, this, "distributedBy", buffer, theDistributedBy, ((this.distributedBy!= null)&&(!this.distributedBy.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theFinancedBy;
            theFinancedBy = this.getFinancedBy();
            strategy.appendField(locator, this, "financedBy", buffer, theFinancedBy, (this.financedBy!= null));
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
            Boolean theIsRequiredToResponseAtDetailLevel;
            theIsRequiredToResponseAtDetailLevel = this.isIsRequiredToResponseAtDetailLevel();
            strategy.appendField(locator, this, "isRequiredToResponseAtDetailLevel", buffer, theIsRequiredToResponseAtDetailLevel, (this.isRequiredToResponseAtDetailLevel!= null));
        }
        {
            ProductPricingType theListPrice;
            theListPrice = this.getListPrice();
            strategy.appendField(locator, this, "listPrice", buffer, theListPrice, (this.listPrice!= null));
        }
        {
            PriceCondition thePriceCondition;
            thePriceCondition = this.getPriceCondition();
            strategy.appendField(locator, this, "priceCondition", buffer, thePriceCondition, (this.priceCondition!= null));
        }
        {
            List<QuoteCustomerInformationType> theQuoteCustomerInformation;
            theQuoteCustomerInformation = (((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty()))?this.getQuoteCustomerInformation():null);
            strategy.appendField(locator, this, "quoteCustomerInformation", buffer, theQuoteCustomerInformation, ((this.quoteCustomerInformation!= null)&&(!this.quoteCustomerInformation.isEmpty())));
        }
        {
            List<QuoteLineItemType> theQuoteLineItem;
            theQuoteLineItem = (((this.quoteLineItem!= null)&&(!this.quoteLineItem.isEmpty()))?this.getQuoteLineItem():null);
            strategy.appendField(locator, this, "quoteLineItem", buffer, theQuoteLineItem, ((this.quoteLineItem!= null)&&(!this.quoteLineItem.isEmpty())));
        }
        {
            io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType theQuoteType;
            theQuoteType = this.getQuoteType();
            strategy.appendField(locator, this, "quoteType", buffer, theQuoteType, (this.quoteType!= null));
        }
        {
            DatePeriodType theRequestedResponseDate;
            theRequestedResponseDate = this.getRequestedResponseDate();
            strategy.appendField(locator, this, "requestedResponseDate", buffer, theRequestedResponseDate, (this.requestedResponseDate!= null));
        }
        {
            List<BusinessDocumentReferenceType> theRequoteReference;
            theRequoteReference = (((this.requoteReference!= null)&&(!this.requoteReference.isEmpty()))?this.getRequoteReference():null);
            strategy.appendField(locator, this, "requoteReference", buffer, theRequoteReference, ((this.requoteReference!= null)&&(!this.requoteReference.isEmpty())));
        }
        {
            List<SpecifiedPartnerDescriptionType> theRespondTo;
            theRespondTo = (((this.respondTo!= null)&&(!this.respondTo.isEmpty()))?this.getRespondTo():null);
            strategy.appendField(locator, this, "respondTo", buffer, theRespondTo, ((this.respondTo!= null)&&(!this.respondTo.isEmpty())));
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
            MonetaryAmountType theTotalPrice;
            theTotalPrice = this.getTotalPrice();
            strategy.appendField(locator, this, "totalPrice", buffer, theTotalPrice, (this.totalPrice!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
