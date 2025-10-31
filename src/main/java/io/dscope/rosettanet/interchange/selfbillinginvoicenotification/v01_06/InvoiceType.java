
package io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_06;

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
import io.dscope.rosettanet.domain.procurement.codelist.saletype.v01_04.SaleType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.AccountSummaryType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.Financing;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.PaymentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.TaxSummaryType;
import io.dscope.rosettanet.domain.shared.shared.v01_05.MonetaryAmountType;
import io.dscope.rosettanet.universal.codelist.documenttype.v01_05.DocumentType;
import io.dscope.rosettanet.universal.partneridentification.v01_08.SpecifiedPartnerDescriptionType;
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
 *         &lt;element name="AncillaryAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}MonetaryAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BillToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.05}DocumentType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}Financing" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineItem" type="{urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.06}InvoiceLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="IsLockBoxUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsRebill" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PurchasedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemitTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="RemitToAccount" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}AccountSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemitToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.04}SaleType" minOccurs="0"/&gt;
 *         &lt;element name="SelfBillingFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="SelfBillingTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="ShipFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="SoldBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="SoldToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SoldToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="TotalInvoiceAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}MonetaryAmountType"/&gt;
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
    "billToAccount",
    "documentType",
    "financing",
    "invoiceLineItem",
    "isLockBoxUsed",
    "isRebill",
    "paymentTerms",
    "purchasedBy",
    "remitTo",
    "remitToAccount",
    "remitToTax",
    "saleType",
    "selfBillingFrom",
    "selfBillingTo",
    "shipFrom",
    "shipTo",
    "soldBy",
    "soldToAccount",
    "soldToTax",
    "totalInvoiceAmount",
    "transferToAccount"
})
public class InvoiceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AncillaryAmount")
    protected List<MonetaryAmountType> ancillaryAmount;
    @XmlElement(name = "BillToAccount")
    protected List<String> billToAccount;
    @XmlElementRef(name = "DocumentType", namespace = "urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.05", type = DocumentType.class)
    protected DocumentType documentType;
    @XmlElementRef(name = "Financing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = Financing.class, required = false)
    protected Financing financing;
    @XmlElement(name = "InvoiceLineItem", required = true)
    protected List<InvoiceLineItemType> invoiceLineItem;
    @XmlElement(name = "IsLockBoxUsed")
    protected boolean isLockBoxUsed;
    @XmlElement(name = "IsRebill")
    protected boolean isRebill;
    @XmlElementRef(name = "PaymentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = PaymentTerms.class, required = false)
    protected List<PaymentTerms> paymentTerms;
    @XmlElement(name = "PurchasedBy")
    protected List<SpecifiedPartnerDescriptionType> purchasedBy;
    @XmlElement(name = "RemitTo", required = true)
    protected SpecifiedPartnerDescriptionType remitTo;
    @XmlElement(name = "RemitToAccount")
    protected List<AccountSummaryType> remitToAccount;
    @XmlElement(name = "RemitToTax")
    protected TaxSummaryType remitToTax;
    @XmlElementRef(name = "SaleType", namespace = "urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.04", type = SaleType.class, required = false)
    protected SaleType saleType;
    @XmlElement(name = "SelfBillingFrom", required = true)
    protected SpecifiedPartnerDescriptionType selfBillingFrom;
    @XmlElement(name = "SelfBillingTo", required = true)
    protected SpecifiedPartnerDescriptionType selfBillingTo;
    @XmlElement(name = "ShipFrom")
    protected SpecifiedPartnerDescriptionType shipFrom;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElement(name = "SoldBy")
    protected SpecifiedPartnerDescriptionType soldBy;
    @XmlElement(name = "SoldToAccount")
    protected List<String> soldToAccount;
    @XmlElement(name = "SoldToTax")
    protected TaxSummaryType soldToTax;
    @XmlElement(name = "TotalInvoiceAmount", required = true)
    protected MonetaryAmountType totalInvoiceAmount;
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
     * {@link MonetaryAmountType }
     * 
     * 
     */
    public List<MonetaryAmountType> getAncillaryAmount() {
        if (ancillaryAmount == null) {
            ancillaryAmount = new ArrayList<MonetaryAmountType>();
        }
        return this.ancillaryAmount;
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
     * Gets the value of the paymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerms }
     * 
     * 
     */
    public List<PaymentTerms> getPaymentTerms() {
        if (paymentTerms == null) {
            paymentTerms = new ArrayList<PaymentTerms>();
        }
        return this.paymentTerms;
    }

    /**
     * Gets the value of the purchasedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchasedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchasedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedPartnerDescriptionType }
     * 
     * 
     */
    public List<SpecifiedPartnerDescriptionType> getPurchasedBy() {
        if (purchasedBy == null) {
            purchasedBy = new ArrayList<SpecifiedPartnerDescriptionType>();
        }
        return this.purchasedBy;
    }

    /**
     * Gets the value of the remitTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getRemitTo() {
        return remitTo;
    }

    /**
     * Sets the value of the remitTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setRemitTo(SpecifiedPartnerDescriptionType value) {
        this.remitTo = value;
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
     * Gets the value of the saleType property.
     * 
     * @return
     *     possible object is
     *     {@link SaleType }
     *     
     */
    public SaleType getSaleType() {
        return saleType;
    }

    /**
     * Sets the value of the saleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleType }
     *     
     */
    public void setSaleType(SaleType value) {
        this.saleType = value;
    }

    /**
     * Gets the value of the selfBillingFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getSelfBillingFrom() {
        return selfBillingFrom;
    }

    /**
     * Sets the value of the selfBillingFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setSelfBillingFrom(SpecifiedPartnerDescriptionType value) {
        this.selfBillingFrom = value;
    }

    /**
     * Gets the value of the selfBillingTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getSelfBillingTo() {
        return selfBillingTo;
    }

    /**
     * Sets the value of the selfBillingTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setSelfBillingTo(SpecifiedPartnerDescriptionType value) {
        this.selfBillingTo = value;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipFrom(SpecifiedPartnerDescriptionType value) {
        this.shipFrom = value;
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
     * Gets the value of the soldBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getSoldBy() {
        return soldBy;
    }

    /**
     * Sets the value of the soldBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setSoldBy(SpecifiedPartnerDescriptionType value) {
        this.soldBy = value;
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
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /**
     * Sets the value of the totalInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setTotalInvoiceAmount(MonetaryAmountType value) {
        this.totalInvoiceAmount = value;
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
            List<MonetaryAmountType> lhsAncillaryAmount;
            lhsAncillaryAmount = (((this.ancillaryAmount!= null)&&(!this.ancillaryAmount.isEmpty()))?this.getAncillaryAmount():null);
            List<MonetaryAmountType> rhsAncillaryAmount;
            rhsAncillaryAmount = (((that.ancillaryAmount!= null)&&(!that.ancillaryAmount.isEmpty()))?that.getAncillaryAmount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ancillaryAmount", lhsAncillaryAmount), LocatorUtils.property(thatLocator, "ancillaryAmount", rhsAncillaryAmount), lhsAncillaryAmount, rhsAncillaryAmount, ((this.ancillaryAmount!= null)&&(!this.ancillaryAmount.isEmpty())), ((that.ancillaryAmount!= null)&&(!that.ancillaryAmount.isEmpty())))) {
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
            List<PaymentTerms> lhsPaymentTerms;
            lhsPaymentTerms = (((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty()))?this.getPaymentTerms():null);
            List<PaymentTerms> rhsPaymentTerms;
            rhsPaymentTerms = (((that.paymentTerms!= null)&&(!that.paymentTerms.isEmpty()))?that.getPaymentTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentTerms", lhsPaymentTerms), LocatorUtils.property(thatLocator, "paymentTerms", rhsPaymentTerms), lhsPaymentTerms, rhsPaymentTerms, ((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty())), ((that.paymentTerms!= null)&&(!that.paymentTerms.isEmpty())))) {
                return false;
            }
        }
        {
            List<SpecifiedPartnerDescriptionType> lhsPurchasedBy;
            lhsPurchasedBy = (((this.purchasedBy!= null)&&(!this.purchasedBy.isEmpty()))?this.getPurchasedBy():null);
            List<SpecifiedPartnerDescriptionType> rhsPurchasedBy;
            rhsPurchasedBy = (((that.purchasedBy!= null)&&(!that.purchasedBy.isEmpty()))?that.getPurchasedBy():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchasedBy", lhsPurchasedBy), LocatorUtils.property(thatLocator, "purchasedBy", rhsPurchasedBy), lhsPurchasedBy, rhsPurchasedBy, ((this.purchasedBy!= null)&&(!this.purchasedBy.isEmpty())), ((that.purchasedBy!= null)&&(!that.purchasedBy.isEmpty())))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsRemitTo;
            lhsRemitTo = this.getRemitTo();
            SpecifiedPartnerDescriptionType rhsRemitTo;
            rhsRemitTo = that.getRemitTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remitTo", lhsRemitTo), LocatorUtils.property(thatLocator, "remitTo", rhsRemitTo), lhsRemitTo, rhsRemitTo, (this.remitTo!= null), (that.remitTo!= null))) {
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
            SaleType lhsSaleType;
            lhsSaleType = this.getSaleType();
            SaleType rhsSaleType;
            rhsSaleType = that.getSaleType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "saleType", lhsSaleType), LocatorUtils.property(thatLocator, "saleType", rhsSaleType), lhsSaleType, rhsSaleType, (this.saleType!= null), (that.saleType!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsSelfBillingFrom;
            lhsSelfBillingFrom = this.getSelfBillingFrom();
            SpecifiedPartnerDescriptionType rhsSelfBillingFrom;
            rhsSelfBillingFrom = that.getSelfBillingFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selfBillingFrom", lhsSelfBillingFrom), LocatorUtils.property(thatLocator, "selfBillingFrom", rhsSelfBillingFrom), lhsSelfBillingFrom, rhsSelfBillingFrom, (this.selfBillingFrom!= null), (that.selfBillingFrom!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsSelfBillingTo;
            lhsSelfBillingTo = this.getSelfBillingTo();
            SpecifiedPartnerDescriptionType rhsSelfBillingTo;
            rhsSelfBillingTo = that.getSelfBillingTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selfBillingTo", lhsSelfBillingTo), LocatorUtils.property(thatLocator, "selfBillingTo", rhsSelfBillingTo), lhsSelfBillingTo, rhsSelfBillingTo, (this.selfBillingTo!= null), (that.selfBillingTo!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsShipFrom;
            lhsShipFrom = this.getShipFrom();
            SpecifiedPartnerDescriptionType rhsShipFrom;
            rhsShipFrom = that.getShipFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipFrom", lhsShipFrom), LocatorUtils.property(thatLocator, "shipFrom", rhsShipFrom), lhsShipFrom, rhsShipFrom, (this.shipFrom!= null), (that.shipFrom!= null))) {
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
            SpecifiedPartnerDescriptionType lhsSoldBy;
            lhsSoldBy = this.getSoldBy();
            SpecifiedPartnerDescriptionType rhsSoldBy;
            rhsSoldBy = that.getSoldBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "soldBy", lhsSoldBy), LocatorUtils.property(thatLocator, "soldBy", rhsSoldBy), lhsSoldBy, rhsSoldBy, (this.soldBy!= null), (that.soldBy!= null))) {
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
            MonetaryAmountType lhsTotalInvoiceAmount;
            lhsTotalInvoiceAmount = this.getTotalInvoiceAmount();
            MonetaryAmountType rhsTotalInvoiceAmount;
            rhsTotalInvoiceAmount = that.getTotalInvoiceAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalInvoiceAmount", lhsTotalInvoiceAmount), LocatorUtils.property(thatLocator, "totalInvoiceAmount", rhsTotalInvoiceAmount), lhsTotalInvoiceAmount, rhsTotalInvoiceAmount, (this.totalInvoiceAmount!= null), (that.totalInvoiceAmount!= null))) {
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
            List<MonetaryAmountType> theAncillaryAmount;
            theAncillaryAmount = (((this.ancillaryAmount!= null)&&(!this.ancillaryAmount.isEmpty()))?this.getAncillaryAmount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ancillaryAmount", theAncillaryAmount), currentHashCode, theAncillaryAmount, ((this.ancillaryAmount!= null)&&(!this.ancillaryAmount.isEmpty())));
        }
        {
            List<String> theBillToAccount;
            theBillToAccount = (((this.billToAccount!= null)&&(!this.billToAccount.isEmpty()))?this.getBillToAccount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billToAccount", theBillToAccount), currentHashCode, theBillToAccount, ((this.billToAccount!= null)&&(!this.billToAccount.isEmpty())));
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
            List<PaymentTerms> thePaymentTerms;
            thePaymentTerms = (((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty()))?this.getPaymentTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentTerms", thePaymentTerms), currentHashCode, thePaymentTerms, ((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty())));
        }
        {
            List<SpecifiedPartnerDescriptionType> thePurchasedBy;
            thePurchasedBy = (((this.purchasedBy!= null)&&(!this.purchasedBy.isEmpty()))?this.getPurchasedBy():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchasedBy", thePurchasedBy), currentHashCode, thePurchasedBy, ((this.purchasedBy!= null)&&(!this.purchasedBy.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theRemitTo;
            theRemitTo = this.getRemitTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remitTo", theRemitTo), currentHashCode, theRemitTo, (this.remitTo!= null));
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
            SaleType theSaleType;
            theSaleType = this.getSaleType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "saleType", theSaleType), currentHashCode, theSaleType, (this.saleType!= null));
        }
        {
            SpecifiedPartnerDescriptionType theSelfBillingFrom;
            theSelfBillingFrom = this.getSelfBillingFrom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selfBillingFrom", theSelfBillingFrom), currentHashCode, theSelfBillingFrom, (this.selfBillingFrom!= null));
        }
        {
            SpecifiedPartnerDescriptionType theSelfBillingTo;
            theSelfBillingTo = this.getSelfBillingTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selfBillingTo", theSelfBillingTo), currentHashCode, theSelfBillingTo, (this.selfBillingTo!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipFrom;
            theShipFrom = this.getShipFrom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipFrom", theShipFrom), currentHashCode, theShipFrom, (this.shipFrom!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipTo", theShipTo), currentHashCode, theShipTo, (this.shipTo!= null));
        }
        {
            SpecifiedPartnerDescriptionType theSoldBy;
            theSoldBy = this.getSoldBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "soldBy", theSoldBy), currentHashCode, theSoldBy, (this.soldBy!= null));
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
            MonetaryAmountType theTotalInvoiceAmount;
            theTotalInvoiceAmount = this.getTotalInvoiceAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalInvoiceAmount", theTotalInvoiceAmount), currentHashCode, theTotalInvoiceAmount, (this.totalInvoiceAmount!= null));
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
            List<MonetaryAmountType> theAncillaryAmount;
            theAncillaryAmount = (((this.ancillaryAmount!= null)&&(!this.ancillaryAmount.isEmpty()))?this.getAncillaryAmount():null);
            strategy.appendField(locator, this, "ancillaryAmount", buffer, theAncillaryAmount, ((this.ancillaryAmount!= null)&&(!this.ancillaryAmount.isEmpty())));
        }
        {
            List<String> theBillToAccount;
            theBillToAccount = (((this.billToAccount!= null)&&(!this.billToAccount.isEmpty()))?this.getBillToAccount():null);
            strategy.appendField(locator, this, "billToAccount", buffer, theBillToAccount, ((this.billToAccount!= null)&&(!this.billToAccount.isEmpty())));
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
            List<PaymentTerms> thePaymentTerms;
            thePaymentTerms = (((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty()))?this.getPaymentTerms():null);
            strategy.appendField(locator, this, "paymentTerms", buffer, thePaymentTerms, ((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty())));
        }
        {
            List<SpecifiedPartnerDescriptionType> thePurchasedBy;
            thePurchasedBy = (((this.purchasedBy!= null)&&(!this.purchasedBy.isEmpty()))?this.getPurchasedBy():null);
            strategy.appendField(locator, this, "purchasedBy", buffer, thePurchasedBy, ((this.purchasedBy!= null)&&(!this.purchasedBy.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theRemitTo;
            theRemitTo = this.getRemitTo();
            strategy.appendField(locator, this, "remitTo", buffer, theRemitTo, (this.remitTo!= null));
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
            SaleType theSaleType;
            theSaleType = this.getSaleType();
            strategy.appendField(locator, this, "saleType", buffer, theSaleType, (this.saleType!= null));
        }
        {
            SpecifiedPartnerDescriptionType theSelfBillingFrom;
            theSelfBillingFrom = this.getSelfBillingFrom();
            strategy.appendField(locator, this, "selfBillingFrom", buffer, theSelfBillingFrom, (this.selfBillingFrom!= null));
        }
        {
            SpecifiedPartnerDescriptionType theSelfBillingTo;
            theSelfBillingTo = this.getSelfBillingTo();
            strategy.appendField(locator, this, "selfBillingTo", buffer, theSelfBillingTo, (this.selfBillingTo!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipFrom;
            theShipFrom = this.getShipFrom();
            strategy.appendField(locator, this, "shipFrom", buffer, theShipFrom, (this.shipFrom!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            strategy.appendField(locator, this, "shipTo", buffer, theShipTo, (this.shipTo!= null));
        }
        {
            SpecifiedPartnerDescriptionType theSoldBy;
            theSoldBy = this.getSoldBy();
            strategy.appendField(locator, this, "soldBy", buffer, theSoldBy, (this.soldBy!= null));
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
            MonetaryAmountType theTotalInvoiceAmount;
            theTotalInvoiceAmount = this.getTotalInvoiceAmount();
            strategy.appendField(locator, this, "totalInvoiceAmount", buffer, theTotalInvoiceAmount, (this.totalInvoiceAmount!= null));
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
