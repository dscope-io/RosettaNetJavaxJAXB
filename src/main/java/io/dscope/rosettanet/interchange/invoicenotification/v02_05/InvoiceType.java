
package io.dscope.rosettanet.interchange.invoicenotification.v02_05;

import java.math.BigInteger;
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
import io.dscope.rosettanet.domain.procurement.codelist.documenttype.v01_05.DocumentType;
import io.dscope.rosettanet.domain.procurement.codelist.purchasetype.v01_03.PurchaseType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.AccountSummaryType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.AncillaryDates;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.Financing;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.InvoiceAmountType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.PaymentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.SpecifiedBusinessDocumentReferenceType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.TaxSummaryType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for InvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AncillaryAmount" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}InvoiceAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}AncillaryDates" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BillFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="BillTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="BillToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:DocumentType:xsd:codelist:01.05}DocumentType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}Financing" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineItem" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.05}InvoiceLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="IsLockBoxUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsRebill" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OriginalInvoiceNumber" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}SpecifiedBusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}PaymentTerms" minOccurs="0"/&gt;
 *         &lt;element name="PreTaxAmount" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.05}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}SpecifiedBusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseType:xsd:codelist:01.03}PurchaseType" minOccurs="0"/&gt;
 *         &lt;element name="RemitToAccount" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}AccountSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemitToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderIdentifier" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}SpecifiedBusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SoldToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SoldToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="TotalInvoiceAmount" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.05}AmountType"/&gt;
 *         &lt;element name="TotalNumberOfItems" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TransferToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "InvoiceType", propOrder = {
    "ancillaryAmount",
    "ancillaryDates",
    "billFrom",
    "billTo",
    "billToAccount",
    "comments",
    "documentType",
    "financing",
    "invoiceLineItem",
    "isLockBoxUsed",
    "isRebill",
    "originalInvoiceNumber",
    "partnerDescription",
    "paymentTerms",
    "preTaxAmount",
    "purchaseOrderNumber",
    "purchaseType",
    "remitToAccount",
    "remitToTax",
    "salesOrderIdentifier",
    "soldToAccount",
    "soldToTax",
    "totalInvoiceAmount",
    "totalNumberOfItems",
    "transferToAccount"
})
public class InvoiceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AncillaryAmount")
    protected List<InvoiceAmountType> ancillaryAmount;
    @XmlElementRef(name = "AncillaryDates", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = AncillaryDates.class, required = false)
    protected List<AncillaryDates> ancillaryDates;
    @XmlElement(name = "BillFrom", required = true)
    protected SpecifiedPartnerDescriptionType billFrom;
    @XmlElement(name = "BillTo", required = true)
    protected SpecifiedPartnerDescriptionType billTo;
    @XmlElement(name = "BillToAccount")
    protected List<String> billToAccount;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "DocumentType", namespace = "urn:rosettanet:specification:domain:Procurement:DocumentType:xsd:codelist:01.05", type = DocumentType.class)
    protected DocumentType documentType;
    @XmlElementRef(name = "Financing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = Financing.class, required = false)
    protected Financing financing;
    @XmlElement(name = "InvoiceLineItem", required = true)
    protected List<InvoiceLineItemType> invoiceLineItem;
    @XmlElement(name = "IsLockBoxUsed")
    protected boolean isLockBoxUsed;
    @XmlElement(name = "IsRebill")
    protected boolean isRebill;
    @XmlElement(name = "OriginalInvoiceNumber")
    protected SpecifiedBusinessDocumentReferenceType originalInvoiceNumber;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "PaymentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = PaymentTerms.class, required = false)
    protected PaymentTerms paymentTerms;
    @XmlElement(name = "PreTaxAmount")
    protected AmountType preTaxAmount;
    @XmlElement(name = "PurchaseOrderNumber")
    protected SpecifiedBusinessDocumentReferenceType purchaseOrderNumber;
    @XmlElementRef(name = "PurchaseType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseType:xsd:codelist:01.03", type = PurchaseType.class, required = false)
    protected PurchaseType purchaseType;
    @XmlElement(name = "RemitToAccount")
    protected List<AccountSummaryType> remitToAccount;
    @XmlElement(name = "RemitToTax")
    protected TaxSummaryType remitToTax;
    @XmlElement(name = "SalesOrderIdentifier")
    protected List<SpecifiedBusinessDocumentReferenceType> salesOrderIdentifier;
    @XmlElement(name = "SoldToAccount")
    protected List<String> soldToAccount;
    @XmlElement(name = "SoldToTax")
    protected TaxSummaryType soldToTax;
    @XmlElement(name = "TotalInvoiceAmount", required = true)
    protected AmountType totalInvoiceAmount;
    @XmlElement(name = "TotalNumberOfItems")
    protected BigInteger totalNumberOfItems;
    @XmlElement(name = "TransferToAccount")
    protected List<String> transferToAccount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the ancillaryAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceAmountType }
     * 
     * 
     */
    public List<InvoiceAmountType> getAncillaryAmount() {
        if (ancillaryAmount == null) {
            ancillaryAmount = new ArrayList<InvoiceAmountType>();
        }
        return this.ancillaryAmount;
    }

    /**
     * Gets the value of the ancillaryDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryDates }
     * 
     * 
     */
    public List<AncillaryDates> getAncillaryDates() {
        if (ancillaryDates == null) {
            ancillaryDates = new ArrayList<AncillaryDates>();
        }
        return this.ancillaryDates;
    }

    /**
     * Gets the value of the billFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getBillFrom() {
        return billFrom;
    }

    /**
     * Sets the value of the billFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setBillFrom(SpecifiedPartnerDescriptionType value) {
        this.billFrom = value;
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
     * Gets the value of the billToAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billToAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillToAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBillToAccount() {
        if (billToAccount == null) {
            billToAccount = new ArrayList<String>();
        }
        return this.billToAccount;
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
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the financing property.
     * 
     * @return
     *     possible object is
     *     {@link Financing }
     *     
     */
    public Financing getFinancing() {
        return financing;
    }

    /**
     * Sets the value of the financing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Financing }
     *     
     */
    public void setFinancing(Financing value) {
        this.financing = value;
    }

    /**
     * Gets the value of the invoiceLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLineItemType }
     * 
     * 
     */
    public List<InvoiceLineItemType> getInvoiceLineItem() {
        if (invoiceLineItem == null) {
            invoiceLineItem = new ArrayList<InvoiceLineItemType>();
        }
        return this.invoiceLineItem;
    }

    /**
     * Gets the value of the isLockBoxUsed property.
     * 
     */
    public boolean isIsLockBoxUsed() {
        return isLockBoxUsed;
    }

    /**
     * Sets the value of the isLockBoxUsed property.
     * 
     */
    public void setIsLockBoxUsed(boolean value) {
        this.isLockBoxUsed = value;
    }

    /**
     * Gets the value of the isRebill property.
     * 
     */
    public boolean isIsRebill() {
        return isRebill;
    }

    /**
     * Sets the value of the isRebill property.
     * 
     */
    public void setIsRebill(boolean value) {
        this.isRebill = value;
    }

    /**
     * Gets the value of the originalInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public SpecifiedBusinessDocumentReferenceType getOriginalInvoiceNumber() {
        return originalInvoiceNumber;
    }

    /**
     * Sets the value of the originalInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public void setOriginalInvoiceNumber(SpecifiedBusinessDocumentReferenceType value) {
        this.originalInvoiceNumber = value;
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
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTerms }
     *     
     */
    public PaymentTerms getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTerms }
     *     
     */
    public void setPaymentTerms(PaymentTerms value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the preTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPreTaxAmount() {
        return preTaxAmount;
    }

    /**
     * Sets the value of the preTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPreTaxAmount(AmountType value) {
        this.preTaxAmount = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public SpecifiedBusinessDocumentReferenceType getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public void setPurchaseOrderNumber(SpecifiedBusinessDocumentReferenceType value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the purchaseType property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseType }
     *     
     */
    public PurchaseType getPurchaseType() {
        return purchaseType;
    }

    /**
     * Sets the value of the purchaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseType }
     *     
     */
    public void setPurchaseType(PurchaseType value) {
        this.purchaseType = value;
    }

    /**
     * Gets the value of the remitToAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remitToAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemitToAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountSummaryType }
     * 
     * 
     */
    public List<AccountSummaryType> getRemitToAccount() {
        if (remitToAccount == null) {
            remitToAccount = new ArrayList<AccountSummaryType>();
        }
        return this.remitToAccount;
    }

    /**
     * Gets the value of the remitToTax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummaryType }
     *     
     */
    public TaxSummaryType getRemitToTax() {
        return remitToTax;
    }

    /**
     * Sets the value of the remitToTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryType }
     *     
     */
    public void setRemitToTax(TaxSummaryType value) {
        this.remitToTax = value;
    }

    /**
     * Gets the value of the salesOrderIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedBusinessDocumentReferenceType }
     * 
     * 
     */
    public List<SpecifiedBusinessDocumentReferenceType> getSalesOrderIdentifier() {
        if (salesOrderIdentifier == null) {
            salesOrderIdentifier = new ArrayList<SpecifiedBusinessDocumentReferenceType>();
        }
        return this.salesOrderIdentifier;
    }

    /**
     * Gets the value of the soldToAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soldToAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoldToAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSoldToAccount() {
        if (soldToAccount == null) {
            soldToAccount = new ArrayList<String>();
        }
        return this.soldToAccount;
    }

    /**
     * Gets the value of the soldToTax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummaryType }
     *     
     */
    public TaxSummaryType getSoldToTax() {
        return soldToTax;
    }

    /**
     * Sets the value of the soldToTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryType }
     *     
     */
    public void setSoldToTax(TaxSummaryType value) {
        this.soldToTax = value;
    }

    /**
     * Gets the value of the totalInvoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /**
     * Sets the value of the totalInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalInvoiceAmount(AmountType value) {
        this.totalInvoiceAmount = value;
    }

    /**
     * Gets the value of the totalNumberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfItems() {
        return totalNumberOfItems;
    }

    /**
     * Sets the value of the totalNumberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfItems(BigInteger value) {
        this.totalNumberOfItems = value;
    }

    /**
     * Gets the value of the transferToAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferToAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferToAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransferToAccount() {
        if (transferToAccount == null) {
            transferToAccount = new ArrayList<String>();
        }
        return this.transferToAccount;
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
        final InvoiceType that = ((InvoiceType) object);
        {
            List<InvoiceAmountType> lhsAncillaryAmount;
            lhsAncillaryAmount = (((this.ancillaryAmount!= null)&&(!this.ancillaryAmount.isEmpty()))?this.getAncillaryAmount():null);
            List<InvoiceAmountType> rhsAncillaryAmount;
            rhsAncillaryAmount = (((that.ancillaryAmount!= null)&&(!that.ancillaryAmount.isEmpty()))?that.getAncillaryAmount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ancillaryAmount", lhsAncillaryAmount), LocatorUtils.property(thatLocator, "ancillaryAmount", rhsAncillaryAmount), lhsAncillaryAmount, rhsAncillaryAmount, ((this.ancillaryAmount!= null)&&(!this.ancillaryAmount.isEmpty())), ((that.ancillaryAmount!= null)&&(!that.ancillaryAmount.isEmpty())))) {
                return false;
            }
        }
        {
            List<AncillaryDates> lhsAncillaryDates;
            lhsAncillaryDates = (((this.ancillaryDates!= null)&&(!this.ancillaryDates.isEmpty()))?this.getAncillaryDates():null);
            List<AncillaryDates> rhsAncillaryDates;
            rhsAncillaryDates = (((that.ancillaryDates!= null)&&(!that.ancillaryDates.isEmpty()))?that.getAncillaryDates():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ancillaryDates", lhsAncillaryDates), LocatorUtils.property(thatLocator, "ancillaryDates", rhsAncillaryDates), lhsAncillaryDates, rhsAncillaryDates, ((this.ancillaryDates!= null)&&(!this.ancillaryDates.isEmpty())), ((that.ancillaryDates!= null)&&(!that.ancillaryDates.isEmpty())))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsBillFrom;
            lhsBillFrom = this.getBillFrom();
            SpecifiedPartnerDescriptionType rhsBillFrom;
            rhsBillFrom = that.getBillFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billFrom", lhsBillFrom), LocatorUtils.property(thatLocator, "billFrom", rhsBillFrom), lhsBillFrom, rhsBillFrom, (this.billFrom!= null), (that.billFrom!= null))) {
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
            List<String> lhsBillToAccount;
            lhsBillToAccount = (((this.billToAccount!= null)&&(!this.billToAccount.isEmpty()))?this.getBillToAccount():null);
            List<String> rhsBillToAccount;
            rhsBillToAccount = (((that.billToAccount!= null)&&(!that.billToAccount.isEmpty()))?that.getBillToAccount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billToAccount", lhsBillToAccount), LocatorUtils.property(thatLocator, "billToAccount", rhsBillToAccount), lhsBillToAccount, rhsBillToAccount, ((this.billToAccount!= null)&&(!this.billToAccount.isEmpty())), ((that.billToAccount!= null)&&(!that.billToAccount.isEmpty())))) {
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
            DocumentType lhsDocumentType;
            lhsDocumentType = this.getDocumentType();
            DocumentType rhsDocumentType;
            rhsDocumentType = that.getDocumentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentType", lhsDocumentType), LocatorUtils.property(thatLocator, "documentType", rhsDocumentType), lhsDocumentType, rhsDocumentType, (this.documentType!= null), (that.documentType!= null))) {
                return false;
            }
        }
        {
            Financing lhsFinancing;
            lhsFinancing = this.getFinancing();
            Financing rhsFinancing;
            rhsFinancing = that.getFinancing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financing", lhsFinancing), LocatorUtils.property(thatLocator, "financing", rhsFinancing), lhsFinancing, rhsFinancing, (this.financing!= null), (that.financing!= null))) {
                return false;
            }
        }
        {
            List<InvoiceLineItemType> lhsInvoiceLineItem;
            lhsInvoiceLineItem = (((this.invoiceLineItem!= null)&&(!this.invoiceLineItem.isEmpty()))?this.getInvoiceLineItem():null);
            List<InvoiceLineItemType> rhsInvoiceLineItem;
            rhsInvoiceLineItem = (((that.invoiceLineItem!= null)&&(!that.invoiceLineItem.isEmpty()))?that.getInvoiceLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoiceLineItem", lhsInvoiceLineItem), LocatorUtils.property(thatLocator, "invoiceLineItem", rhsInvoiceLineItem), lhsInvoiceLineItem, rhsInvoiceLineItem, ((this.invoiceLineItem!= null)&&(!this.invoiceLineItem.isEmpty())), ((that.invoiceLineItem!= null)&&(!that.invoiceLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            boolean lhsIsLockBoxUsed;
            lhsIsLockBoxUsed = this.isIsLockBoxUsed();
            boolean rhsIsLockBoxUsed;
            rhsIsLockBoxUsed = that.isIsLockBoxUsed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isLockBoxUsed", lhsIsLockBoxUsed), LocatorUtils.property(thatLocator, "isLockBoxUsed", rhsIsLockBoxUsed), lhsIsLockBoxUsed, rhsIsLockBoxUsed, true, true)) {
                return false;
            }
        }
        {
            boolean lhsIsRebill;
            lhsIsRebill = this.isIsRebill();
            boolean rhsIsRebill;
            rhsIsRebill = that.isIsRebill();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRebill", lhsIsRebill), LocatorUtils.property(thatLocator, "isRebill", rhsIsRebill), lhsIsRebill, rhsIsRebill, true, true)) {
                return false;
            }
        }
        {
            SpecifiedBusinessDocumentReferenceType lhsOriginalInvoiceNumber;
            lhsOriginalInvoiceNumber = this.getOriginalInvoiceNumber();
            SpecifiedBusinessDocumentReferenceType rhsOriginalInvoiceNumber;
            rhsOriginalInvoiceNumber = that.getOriginalInvoiceNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalInvoiceNumber", lhsOriginalInvoiceNumber), LocatorUtils.property(thatLocator, "originalInvoiceNumber", rhsOriginalInvoiceNumber), lhsOriginalInvoiceNumber, rhsOriginalInvoiceNumber, (this.originalInvoiceNumber!= null), (that.originalInvoiceNumber!= null))) {
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
            PaymentTerms lhsPaymentTerms;
            lhsPaymentTerms = this.getPaymentTerms();
            PaymentTerms rhsPaymentTerms;
            rhsPaymentTerms = that.getPaymentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentTerms", lhsPaymentTerms), LocatorUtils.property(thatLocator, "paymentTerms", rhsPaymentTerms), lhsPaymentTerms, rhsPaymentTerms, (this.paymentTerms!= null), (that.paymentTerms!= null))) {
                return false;
            }
        }
        {
            AmountType lhsPreTaxAmount;
            lhsPreTaxAmount = this.getPreTaxAmount();
            AmountType rhsPreTaxAmount;
            rhsPreTaxAmount = that.getPreTaxAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preTaxAmount", lhsPreTaxAmount), LocatorUtils.property(thatLocator, "preTaxAmount", rhsPreTaxAmount), lhsPreTaxAmount, rhsPreTaxAmount, (this.preTaxAmount!= null), (that.preTaxAmount!= null))) {
                return false;
            }
        }
        {
            SpecifiedBusinessDocumentReferenceType lhsPurchaseOrderNumber;
            lhsPurchaseOrderNumber = this.getPurchaseOrderNumber();
            SpecifiedBusinessDocumentReferenceType rhsPurchaseOrderNumber;
            rhsPurchaseOrderNumber = that.getPurchaseOrderNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderNumber", lhsPurchaseOrderNumber), LocatorUtils.property(thatLocator, "purchaseOrderNumber", rhsPurchaseOrderNumber), lhsPurchaseOrderNumber, rhsPurchaseOrderNumber, (this.purchaseOrderNumber!= null), (that.purchaseOrderNumber!= null))) {
                return false;
            }
        }
        {
            PurchaseType lhsPurchaseType;
            lhsPurchaseType = this.getPurchaseType();
            PurchaseType rhsPurchaseType;
            rhsPurchaseType = that.getPurchaseType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseType", lhsPurchaseType), LocatorUtils.property(thatLocator, "purchaseType", rhsPurchaseType), lhsPurchaseType, rhsPurchaseType, (this.purchaseType!= null), (that.purchaseType!= null))) {
                return false;
            }
        }
        {
            List<AccountSummaryType> lhsRemitToAccount;
            lhsRemitToAccount = (((this.remitToAccount!= null)&&(!this.remitToAccount.isEmpty()))?this.getRemitToAccount():null);
            List<AccountSummaryType> rhsRemitToAccount;
            rhsRemitToAccount = (((that.remitToAccount!= null)&&(!that.remitToAccount.isEmpty()))?that.getRemitToAccount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remitToAccount", lhsRemitToAccount), LocatorUtils.property(thatLocator, "remitToAccount", rhsRemitToAccount), lhsRemitToAccount, rhsRemitToAccount, ((this.remitToAccount!= null)&&(!this.remitToAccount.isEmpty())), ((that.remitToAccount!= null)&&(!that.remitToAccount.isEmpty())))) {
                return false;
            }
        }
        {
            TaxSummaryType lhsRemitToTax;
            lhsRemitToTax = this.getRemitToTax();
            TaxSummaryType rhsRemitToTax;
            rhsRemitToTax = that.getRemitToTax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remitToTax", lhsRemitToTax), LocatorUtils.property(thatLocator, "remitToTax", rhsRemitToTax), lhsRemitToTax, rhsRemitToTax, (this.remitToTax!= null), (that.remitToTax!= null))) {
                return false;
            }
        }
        {
            List<SpecifiedBusinessDocumentReferenceType> lhsSalesOrderIdentifier;
            lhsSalesOrderIdentifier = (((this.salesOrderIdentifier!= null)&&(!this.salesOrderIdentifier.isEmpty()))?this.getSalesOrderIdentifier():null);
            List<SpecifiedBusinessDocumentReferenceType> rhsSalesOrderIdentifier;
            rhsSalesOrderIdentifier = (((that.salesOrderIdentifier!= null)&&(!that.salesOrderIdentifier.isEmpty()))?that.getSalesOrderIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesOrderIdentifier", lhsSalesOrderIdentifier), LocatorUtils.property(thatLocator, "salesOrderIdentifier", rhsSalesOrderIdentifier), lhsSalesOrderIdentifier, rhsSalesOrderIdentifier, ((this.salesOrderIdentifier!= null)&&(!this.salesOrderIdentifier.isEmpty())), ((that.salesOrderIdentifier!= null)&&(!that.salesOrderIdentifier.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsSoldToAccount;
            lhsSoldToAccount = (((this.soldToAccount!= null)&&(!this.soldToAccount.isEmpty()))?this.getSoldToAccount():null);
            List<String> rhsSoldToAccount;
            rhsSoldToAccount = (((that.soldToAccount!= null)&&(!that.soldToAccount.isEmpty()))?that.getSoldToAccount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "soldToAccount", lhsSoldToAccount), LocatorUtils.property(thatLocator, "soldToAccount", rhsSoldToAccount), lhsSoldToAccount, rhsSoldToAccount, ((this.soldToAccount!= null)&&(!this.soldToAccount.isEmpty())), ((that.soldToAccount!= null)&&(!that.soldToAccount.isEmpty())))) {
                return false;
            }
        }
        {
            TaxSummaryType lhsSoldToTax;
            lhsSoldToTax = this.getSoldToTax();
            TaxSummaryType rhsSoldToTax;
            rhsSoldToTax = that.getSoldToTax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "soldToTax", lhsSoldToTax), LocatorUtils.property(thatLocator, "soldToTax", rhsSoldToTax), lhsSoldToTax, rhsSoldToTax, (this.soldToTax!= null), (that.soldToTax!= null))) {
                return false;
            }
        }
        {
            AmountType lhsTotalInvoiceAmount;
            lhsTotalInvoiceAmount = this.getTotalInvoiceAmount();
            AmountType rhsTotalInvoiceAmount;
            rhsTotalInvoiceAmount = that.getTotalInvoiceAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalInvoiceAmount", lhsTotalInvoiceAmount), LocatorUtils.property(thatLocator, "totalInvoiceAmount", rhsTotalInvoiceAmount), lhsTotalInvoiceAmount, rhsTotalInvoiceAmount, (this.totalInvoiceAmount!= null), (that.totalInvoiceAmount!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsTotalNumberOfItems;
            lhsTotalNumberOfItems = this.getTotalNumberOfItems();
            BigInteger rhsTotalNumberOfItems;
            rhsTotalNumberOfItems = that.getTotalNumberOfItems();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalNumberOfItems", lhsTotalNumberOfItems), LocatorUtils.property(thatLocator, "totalNumberOfItems", rhsTotalNumberOfItems), lhsTotalNumberOfItems, rhsTotalNumberOfItems, (this.totalNumberOfItems!= null), (that.totalNumberOfItems!= null))) {
                return false;
            }
        }
        {
            List<String> lhsTransferToAccount;
            lhsTransferToAccount = (((this.transferToAccount!= null)&&(!this.transferToAccount.isEmpty()))?this.getTransferToAccount():null);
            List<String> rhsTransferToAccount;
            rhsTransferToAccount = (((that.transferToAccount!= null)&&(!that.transferToAccount.isEmpty()))?that.getTransferToAccount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transferToAccount", lhsTransferToAccount), LocatorUtils.property(thatLocator, "transferToAccount", rhsTransferToAccount), lhsTransferToAccount, rhsTransferToAccount, ((this.transferToAccount!= null)&&(!this.transferToAccount.isEmpty())), ((that.transferToAccount!= null)&&(!that.transferToAccount.isEmpty())))) {
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
            List<InvoiceAmountType> theAncillaryAmount;
            theAncillaryAmount = (((this.ancillaryAmount!= null)&&(!this.ancillaryAmount.isEmpty()))?this.getAncillaryAmount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ancillaryAmount", theAncillaryAmount), currentHashCode, theAncillaryAmount, ((this.ancillaryAmount!= null)&&(!this.ancillaryAmount.isEmpty())));
        }
        {
            List<AncillaryDates> theAncillaryDates;
            theAncillaryDates = (((this.ancillaryDates!= null)&&(!this.ancillaryDates.isEmpty()))?this.getAncillaryDates():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ancillaryDates", theAncillaryDates), currentHashCode, theAncillaryDates, ((this.ancillaryDates!= null)&&(!this.ancillaryDates.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theBillFrom;
            theBillFrom = this.getBillFrom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billFrom", theBillFrom), currentHashCode, theBillFrom, (this.billFrom!= null));
        }
        {
            SpecifiedPartnerDescriptionType theBillTo;
            theBillTo = this.getBillTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billTo", theBillTo), currentHashCode, theBillTo, (this.billTo!= null));
        }
        {
            List<String> theBillToAccount;
            theBillToAccount = (((this.billToAccount!= null)&&(!this.billToAccount.isEmpty()))?this.getBillToAccount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billToAccount", theBillToAccount), currentHashCode, theBillToAccount, ((this.billToAccount!= null)&&(!this.billToAccount.isEmpty())));
        }
        {
            String theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments, (this.comments!= null));
        }
        {
            DocumentType theDocumentType;
            theDocumentType = this.getDocumentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentType", theDocumentType), currentHashCode, theDocumentType, (this.documentType!= null));
        }
        {
            Financing theFinancing;
            theFinancing = this.getFinancing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financing", theFinancing), currentHashCode, theFinancing, (this.financing!= null));
        }
        {
            List<InvoiceLineItemType> theInvoiceLineItem;
            theInvoiceLineItem = (((this.invoiceLineItem!= null)&&(!this.invoiceLineItem.isEmpty()))?this.getInvoiceLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoiceLineItem", theInvoiceLineItem), currentHashCode, theInvoiceLineItem, ((this.invoiceLineItem!= null)&&(!this.invoiceLineItem.isEmpty())));
        }
        {
            boolean theIsLockBoxUsed;
            theIsLockBoxUsed = this.isIsLockBoxUsed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isLockBoxUsed", theIsLockBoxUsed), currentHashCode, theIsLockBoxUsed, true);
        }
        {
            boolean theIsRebill;
            theIsRebill = this.isIsRebill();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRebill", theIsRebill), currentHashCode, theIsRebill, true);
        }
        {
            SpecifiedBusinessDocumentReferenceType theOriginalInvoiceNumber;
            theOriginalInvoiceNumber = this.getOriginalInvoiceNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalInvoiceNumber", theOriginalInvoiceNumber), currentHashCode, theOriginalInvoiceNumber, (this.originalInvoiceNumber!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            PaymentTerms thePaymentTerms;
            thePaymentTerms = this.getPaymentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentTerms", thePaymentTerms), currentHashCode, thePaymentTerms, (this.paymentTerms!= null));
        }
        {
            AmountType thePreTaxAmount;
            thePreTaxAmount = this.getPreTaxAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preTaxAmount", thePreTaxAmount), currentHashCode, thePreTaxAmount, (this.preTaxAmount!= null));
        }
        {
            SpecifiedBusinessDocumentReferenceType thePurchaseOrderNumber;
            thePurchaseOrderNumber = this.getPurchaseOrderNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderNumber", thePurchaseOrderNumber), currentHashCode, thePurchaseOrderNumber, (this.purchaseOrderNumber!= null));
        }
        {
            PurchaseType thePurchaseType;
            thePurchaseType = this.getPurchaseType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseType", thePurchaseType), currentHashCode, thePurchaseType, (this.purchaseType!= null));
        }
        {
            List<AccountSummaryType> theRemitToAccount;
            theRemitToAccount = (((this.remitToAccount!= null)&&(!this.remitToAccount.isEmpty()))?this.getRemitToAccount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remitToAccount", theRemitToAccount), currentHashCode, theRemitToAccount, ((this.remitToAccount!= null)&&(!this.remitToAccount.isEmpty())));
        }
        {
            TaxSummaryType theRemitToTax;
            theRemitToTax = this.getRemitToTax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remitToTax", theRemitToTax), currentHashCode, theRemitToTax, (this.remitToTax!= null));
        }
        {
            List<SpecifiedBusinessDocumentReferenceType> theSalesOrderIdentifier;
            theSalesOrderIdentifier = (((this.salesOrderIdentifier!= null)&&(!this.salesOrderIdentifier.isEmpty()))?this.getSalesOrderIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesOrderIdentifier", theSalesOrderIdentifier), currentHashCode, theSalesOrderIdentifier, ((this.salesOrderIdentifier!= null)&&(!this.salesOrderIdentifier.isEmpty())));
        }
        {
            List<String> theSoldToAccount;
            theSoldToAccount = (((this.soldToAccount!= null)&&(!this.soldToAccount.isEmpty()))?this.getSoldToAccount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "soldToAccount", theSoldToAccount), currentHashCode, theSoldToAccount, ((this.soldToAccount!= null)&&(!this.soldToAccount.isEmpty())));
        }
        {
            TaxSummaryType theSoldToTax;
            theSoldToTax = this.getSoldToTax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "soldToTax", theSoldToTax), currentHashCode, theSoldToTax, (this.soldToTax!= null));
        }
        {
            AmountType theTotalInvoiceAmount;
            theTotalInvoiceAmount = this.getTotalInvoiceAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalInvoiceAmount", theTotalInvoiceAmount), currentHashCode, theTotalInvoiceAmount, (this.totalInvoiceAmount!= null));
        }
        {
            BigInteger theTotalNumberOfItems;
            theTotalNumberOfItems = this.getTotalNumberOfItems();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalNumberOfItems", theTotalNumberOfItems), currentHashCode, theTotalNumberOfItems, (this.totalNumberOfItems!= null));
        }
        {
            List<String> theTransferToAccount;
            theTransferToAccount = (((this.transferToAccount!= null)&&(!this.transferToAccount.isEmpty()))?this.getTransferToAccount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transferToAccount", theTransferToAccount), currentHashCode, theTransferToAccount, ((this.transferToAccount!= null)&&(!this.transferToAccount.isEmpty())));
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
            List<InvoiceAmountType> theAncillaryAmount;
            theAncillaryAmount = (((this.ancillaryAmount!= null)&&(!this.ancillaryAmount.isEmpty()))?this.getAncillaryAmount():null);
            strategy.appendField(locator, this, "ancillaryAmount", buffer, theAncillaryAmount, ((this.ancillaryAmount!= null)&&(!this.ancillaryAmount.isEmpty())));
        }
        {
            List<AncillaryDates> theAncillaryDates;
            theAncillaryDates = (((this.ancillaryDates!= null)&&(!this.ancillaryDates.isEmpty()))?this.getAncillaryDates():null);
            strategy.appendField(locator, this, "ancillaryDates", buffer, theAncillaryDates, ((this.ancillaryDates!= null)&&(!this.ancillaryDates.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theBillFrom;
            theBillFrom = this.getBillFrom();
            strategy.appendField(locator, this, "billFrom", buffer, theBillFrom, (this.billFrom!= null));
        }
        {
            SpecifiedPartnerDescriptionType theBillTo;
            theBillTo = this.getBillTo();
            strategy.appendField(locator, this, "billTo", buffer, theBillTo, (this.billTo!= null));
        }
        {
            List<String> theBillToAccount;
            theBillToAccount = (((this.billToAccount!= null)&&(!this.billToAccount.isEmpty()))?this.getBillToAccount():null);
            strategy.appendField(locator, this, "billToAccount", buffer, theBillToAccount, ((this.billToAccount!= null)&&(!this.billToAccount.isEmpty())));
        }
        {
            String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments, (this.comments!= null));
        }
        {
            DocumentType theDocumentType;
            theDocumentType = this.getDocumentType();
            strategy.appendField(locator, this, "documentType", buffer, theDocumentType, (this.documentType!= null));
        }
        {
            Financing theFinancing;
            theFinancing = this.getFinancing();
            strategy.appendField(locator, this, "financing", buffer, theFinancing, (this.financing!= null));
        }
        {
            List<InvoiceLineItemType> theInvoiceLineItem;
            theInvoiceLineItem = (((this.invoiceLineItem!= null)&&(!this.invoiceLineItem.isEmpty()))?this.getInvoiceLineItem():null);
            strategy.appendField(locator, this, "invoiceLineItem", buffer, theInvoiceLineItem, ((this.invoiceLineItem!= null)&&(!this.invoiceLineItem.isEmpty())));
        }
        {
            boolean theIsLockBoxUsed;
            theIsLockBoxUsed = this.isIsLockBoxUsed();
            strategy.appendField(locator, this, "isLockBoxUsed", buffer, theIsLockBoxUsed, true);
        }
        {
            boolean theIsRebill;
            theIsRebill = this.isIsRebill();
            strategy.appendField(locator, this, "isRebill", buffer, theIsRebill, true);
        }
        {
            SpecifiedBusinessDocumentReferenceType theOriginalInvoiceNumber;
            theOriginalInvoiceNumber = this.getOriginalInvoiceNumber();
            strategy.appendField(locator, this, "originalInvoiceNumber", buffer, theOriginalInvoiceNumber, (this.originalInvoiceNumber!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            PaymentTerms thePaymentTerms;
            thePaymentTerms = this.getPaymentTerms();
            strategy.appendField(locator, this, "paymentTerms", buffer, thePaymentTerms, (this.paymentTerms!= null));
        }
        {
            AmountType thePreTaxAmount;
            thePreTaxAmount = this.getPreTaxAmount();
            strategy.appendField(locator, this, "preTaxAmount", buffer, thePreTaxAmount, (this.preTaxAmount!= null));
        }
        {
            SpecifiedBusinessDocumentReferenceType thePurchaseOrderNumber;
            thePurchaseOrderNumber = this.getPurchaseOrderNumber();
            strategy.appendField(locator, this, "purchaseOrderNumber", buffer, thePurchaseOrderNumber, (this.purchaseOrderNumber!= null));
        }
        {
            PurchaseType thePurchaseType;
            thePurchaseType = this.getPurchaseType();
            strategy.appendField(locator, this, "purchaseType", buffer, thePurchaseType, (this.purchaseType!= null));
        }
        {
            List<AccountSummaryType> theRemitToAccount;
            theRemitToAccount = (((this.remitToAccount!= null)&&(!this.remitToAccount.isEmpty()))?this.getRemitToAccount():null);
            strategy.appendField(locator, this, "remitToAccount", buffer, theRemitToAccount, ((this.remitToAccount!= null)&&(!this.remitToAccount.isEmpty())));
        }
        {
            TaxSummaryType theRemitToTax;
            theRemitToTax = this.getRemitToTax();
            strategy.appendField(locator, this, "remitToTax", buffer, theRemitToTax, (this.remitToTax!= null));
        }
        {
            List<SpecifiedBusinessDocumentReferenceType> theSalesOrderIdentifier;
            theSalesOrderIdentifier = (((this.salesOrderIdentifier!= null)&&(!this.salesOrderIdentifier.isEmpty()))?this.getSalesOrderIdentifier():null);
            strategy.appendField(locator, this, "salesOrderIdentifier", buffer, theSalesOrderIdentifier, ((this.salesOrderIdentifier!= null)&&(!this.salesOrderIdentifier.isEmpty())));
        }
        {
            List<String> theSoldToAccount;
            theSoldToAccount = (((this.soldToAccount!= null)&&(!this.soldToAccount.isEmpty()))?this.getSoldToAccount():null);
            strategy.appendField(locator, this, "soldToAccount", buffer, theSoldToAccount, ((this.soldToAccount!= null)&&(!this.soldToAccount.isEmpty())));
        }
        {
            TaxSummaryType theSoldToTax;
            theSoldToTax = this.getSoldToTax();
            strategy.appendField(locator, this, "soldToTax", buffer, theSoldToTax, (this.soldToTax!= null));
        }
        {
            AmountType theTotalInvoiceAmount;
            theTotalInvoiceAmount = this.getTotalInvoiceAmount();
            strategy.appendField(locator, this, "totalInvoiceAmount", buffer, theTotalInvoiceAmount, (this.totalInvoiceAmount!= null));
        }
        {
            BigInteger theTotalNumberOfItems;
            theTotalNumberOfItems = this.getTotalNumberOfItems();
            strategy.appendField(locator, this, "totalNumberOfItems", buffer, theTotalNumberOfItems, (this.totalNumberOfItems!= null));
        }
        {
            List<String> theTransferToAccount;
            theTransferToAccount = (((this.transferToAccount!= null)&&(!this.transferToAccount.isEmpty()))?this.getTransferToAccount():null);
            strategy.appendField(locator, this, "transferToAccount", buffer, theTransferToAccount, ((this.transferToAccount!= null)&&(!this.transferToAccount.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
