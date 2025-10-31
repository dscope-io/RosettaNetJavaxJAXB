
package io.dscope.rosettanet.interchange.invoicerejectnotification.v02_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.invoicerejection.v01_04.InvoiceRejection;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.Financing;
import io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_01.MonetaryAmountTypeType;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReferenceType;
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
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FinancialAmount" type="{urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.01}MonetaryAmountTypeType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}Financing" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineItem" type="{urn:rosettanet:specification:interchange:InvoiceRejectNotification:xsd:schema:02.00}InvoiceLineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:InvoiceRejection:xsd:codelist:01.04}InvoiceRejection"/&gt;
 *         &lt;element name="PurchaseOrder" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType"/&gt;
 *         &lt;element name="SalesOrder" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" minOccurs="0"/&gt;
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
    "comments",
    "financialAmount",
    "financing",
    "invoiceLineItem",
    "invoiceRejection",
    "purchaseOrder",
    "salesOrder"
})
public class InvoiceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Comments", required = true)
    protected String comments;
    @XmlElement(name = "FinancialAmount", required = true)
    protected MonetaryAmountTypeType financialAmount;
    @XmlElementRef(name = "Financing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = Financing.class, required = false)
    protected Financing financing;
    @XmlElement(name = "InvoiceLineItem")
    protected List<InvoiceLineItemType> invoiceLineItem;
    @XmlElementRef(name = "InvoiceRejection", namespace = "urn:rosettanet:specification:domain:Procurement:InvoiceRejection:xsd:codelist:01.04", type = InvoiceRejection.class)
    protected InvoiceRejection invoiceRejection;
    @XmlElement(name = "PurchaseOrder", required = true)
    protected BusinessDocumentReferenceType purchaseOrder;
    @XmlElement(name = "SalesOrder")
    protected BusinessDocumentReferenceType salesOrder;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the financialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountTypeType }
     *     
     */
    public MonetaryAmountTypeType getFinancialAmount() {
        return financialAmount;
    }

    /**
     * Sets the value of the financialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountTypeType }
     *     
     */
    public void setFinancialAmount(MonetaryAmountTypeType value) {
        this.financialAmount = value;
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
     * Gets the value of the invoiceRejection property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceRejection }
     *     
     */
    public InvoiceRejection getInvoiceRejection() {
        return invoiceRejection;
    }

    /**
     * Sets the value of the invoiceRejection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceRejection }
     *     
     */
    public void setInvoiceRejection(InvoiceRejection value) {
        this.invoiceRejection = value;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Sets the value of the purchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPurchaseOrder(BusinessDocumentReferenceType value) {
        this.purchaseOrder = value;
    }

    /**
     * Gets the value of the salesOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getSalesOrder() {
        return salesOrder;
    }

    /**
     * Sets the value of the salesOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setSalesOrder(BusinessDocumentReferenceType value) {
        this.salesOrder = value;
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
            String lhsComments;
            lhsComments = this.getComments();
            String rhsComments;
            rhsComments = that.getComments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comments", lhsComments), LocatorUtils.property(thatLocator, "comments", rhsComments), lhsComments, rhsComments, (this.comments!= null), (that.comments!= null))) {
                return false;
            }
        }
        {
            MonetaryAmountTypeType lhsFinancialAmount;
            lhsFinancialAmount = this.getFinancialAmount();
            MonetaryAmountTypeType rhsFinancialAmount;
            rhsFinancialAmount = that.getFinancialAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financialAmount", lhsFinancialAmount), LocatorUtils.property(thatLocator, "financialAmount", rhsFinancialAmount), lhsFinancialAmount, rhsFinancialAmount, (this.financialAmount!= null), (that.financialAmount!= null))) {
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
            InvoiceRejection lhsInvoiceRejection;
            lhsInvoiceRejection = this.getInvoiceRejection();
            InvoiceRejection rhsInvoiceRejection;
            rhsInvoiceRejection = that.getInvoiceRejection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoiceRejection", lhsInvoiceRejection), LocatorUtils.property(thatLocator, "invoiceRejection", rhsInvoiceRejection), lhsInvoiceRejection, rhsInvoiceRejection, (this.invoiceRejection!= null), (that.invoiceRejection!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsPurchaseOrder;
            lhsPurchaseOrder = this.getPurchaseOrder();
            BusinessDocumentReferenceType rhsPurchaseOrder;
            rhsPurchaseOrder = that.getPurchaseOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrder", lhsPurchaseOrder), LocatorUtils.property(thatLocator, "purchaseOrder", rhsPurchaseOrder), lhsPurchaseOrder, rhsPurchaseOrder, (this.purchaseOrder!= null), (that.purchaseOrder!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsSalesOrder;
            lhsSalesOrder = this.getSalesOrder();
            BusinessDocumentReferenceType rhsSalesOrder;
            rhsSalesOrder = that.getSalesOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesOrder", lhsSalesOrder), LocatorUtils.property(thatLocator, "salesOrder", rhsSalesOrder), lhsSalesOrder, rhsSalesOrder, (this.salesOrder!= null), (that.salesOrder!= null))) {
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
            String theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments, (this.comments!= null));
        }
        {
            MonetaryAmountTypeType theFinancialAmount;
            theFinancialAmount = this.getFinancialAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financialAmount", theFinancialAmount), currentHashCode, theFinancialAmount, (this.financialAmount!= null));
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
            InvoiceRejection theInvoiceRejection;
            theInvoiceRejection = this.getInvoiceRejection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoiceRejection", theInvoiceRejection), currentHashCode, theInvoiceRejection, (this.invoiceRejection!= null));
        }
        {
            BusinessDocumentReferenceType thePurchaseOrder;
            thePurchaseOrder = this.getPurchaseOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrder", thePurchaseOrder), currentHashCode, thePurchaseOrder, (this.purchaseOrder!= null));
        }
        {
            BusinessDocumentReferenceType theSalesOrder;
            theSalesOrder = this.getSalesOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesOrder", theSalesOrder), currentHashCode, theSalesOrder, (this.salesOrder!= null));
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
            String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments, (this.comments!= null));
        }
        {
            MonetaryAmountTypeType theFinancialAmount;
            theFinancialAmount = this.getFinancialAmount();
            strategy.appendField(locator, this, "financialAmount", buffer, theFinancialAmount, (this.financialAmount!= null));
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
            InvoiceRejection theInvoiceRejection;
            theInvoiceRejection = this.getInvoiceRejection();
            strategy.appendField(locator, this, "invoiceRejection", buffer, theInvoiceRejection, (this.invoiceRejection!= null));
        }
        {
            BusinessDocumentReferenceType thePurchaseOrder;
            thePurchaseOrder = this.getPurchaseOrder();
            strategy.appendField(locator, this, "purchaseOrder", buffer, thePurchaseOrder, (this.purchaseOrder!= null));
        }
        {
            BusinessDocumentReferenceType theSalesOrder;
            theSalesOrder = this.getSalesOrder();
            strategy.appendField(locator, this, "salesOrder", buffer, theSalesOrder, (this.salesOrder!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
