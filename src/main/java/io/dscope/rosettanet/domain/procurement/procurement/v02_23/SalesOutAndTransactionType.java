
package io.dscope.rosettanet.domain.procurement.procurement.v02_23;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.procurement.codelist.purchasemethod.v01_03.PurchaseMethod;
import io.dscope.rosettanet.domain.procurement.codelist.transactiontype.v01_04.TransactionType;
import io.dscope.rosettanet.domain.shared.codelist.paymentmethod.v01_02.PaymentMethod;
import io.dscope.rosettanet.universal.monetaryexpression.v01_05.FinancialAmountType;
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
 * <p>Java class for SalesOutAndTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOutAndTransactionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23}BookPrice" minOccurs="0"/&gt;
 *         &lt;element name="LeaseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.02}PaymentMethod" minOccurs="0"/&gt;
 *         &lt;element name="PriceListIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseMethod:xsd:codelist:01.03}PurchaseMethod" minOccurs="0"/&gt;
 *         &lt;element name="ResaleUnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.05}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23}SalesOut"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:TransactionType:xsd:codelist:01.04}TransactionType" minOccurs="0"/&gt;
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
@XmlType(name = "SalesOutAndTransactionType", propOrder = {
    "bookDate",
    "bookPrice",
    "leaseDescription",
    "paymentMethod",
    "priceListIdentifier",
    "purchaseMethod",
    "resaleUnitPrice",
    "salesOut",
    "transactionType"
})
public class SalesOutAndTransactionType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BookDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookDate;
    @XmlElementRef(name = "BookPrice", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23", type = BookPrice.class, required = false)
    protected BookPrice bookPrice;
    @XmlElement(name = "LeaseDescription")
    protected String leaseDescription;
    @XmlElementRef(name = "PaymentMethod", namespace = "urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.02", type = PaymentMethod.class, required = false)
    protected PaymentMethod paymentMethod;
    @XmlElement(name = "PriceListIdentifier")
    protected String priceListIdentifier;
    @XmlElementRef(name = "PurchaseMethod", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseMethod:xsd:codelist:01.03", type = PurchaseMethod.class, required = false)
    protected PurchaseMethod purchaseMethod;
    @XmlElement(name = "ResaleUnitPrice")
    protected FinancialAmountType resaleUnitPrice;
    @XmlElementRef(name = "SalesOut", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23", type = SalesOut.class)
    protected SalesOut salesOut;
    @XmlElementRef(name = "TransactionType", namespace = "urn:rosettanet:specification:domain:Procurement:TransactionType:xsd:codelist:01.04", type = TransactionType.class, required = false)
    protected TransactionType transactionType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the bookDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookDate() {
        return bookDate;
    }

    /**
     * Sets the value of the bookDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookDate(XMLGregorianCalendar value) {
        this.bookDate = value;
    }

    /**
     * Gets the value of the bookPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BookPrice }
     *     
     */
    public BookPrice getBookPrice() {
        return bookPrice;
    }

    /**
     * Sets the value of the bookPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookPrice }
     *     
     */
    public void setBookPrice(BookPrice value) {
        this.bookPrice = value;
    }

    /**
     * Gets the value of the leaseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseDescription() {
        return leaseDescription;
    }

    /**
     * Sets the value of the leaseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseDescription(String value) {
        this.leaseDescription = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod }
     *     
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod }
     *     
     */
    public void setPaymentMethod(PaymentMethod value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the priceListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListIdentifier() {
        return priceListIdentifier;
    }

    /**
     * Sets the value of the priceListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListIdentifier(String value) {
        this.priceListIdentifier = value;
    }

    /**
     * Gets the value of the purchaseMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseMethod }
     *     
     */
    public PurchaseMethod getPurchaseMethod() {
        return purchaseMethod;
    }

    /**
     * Sets the value of the purchaseMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseMethod }
     *     
     */
    public void setPurchaseMethod(PurchaseMethod value) {
        this.purchaseMethod = value;
    }

    /**
     * Gets the value of the resaleUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getResaleUnitPrice() {
        return resaleUnitPrice;
    }

    /**
     * Sets the value of the resaleUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setResaleUnitPrice(FinancialAmountType value) {
        this.resaleUnitPrice = value;
    }

    /**
     * Gets the value of the salesOut property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOut }
     *     
     */
    public SalesOut getSalesOut() {
        return salesOut;
    }

    /**
     * Sets the value of the salesOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOut }
     *     
     */
    public void setSalesOut(SalesOut value) {
        this.salesOut = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
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
        final SalesOutAndTransactionType that = ((SalesOutAndTransactionType) object);
        {
            XMLGregorianCalendar lhsBookDate;
            lhsBookDate = this.getBookDate();
            XMLGregorianCalendar rhsBookDate;
            rhsBookDate = that.getBookDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bookDate", lhsBookDate), LocatorUtils.property(thatLocator, "bookDate", rhsBookDate), lhsBookDate, rhsBookDate, (this.bookDate!= null), (that.bookDate!= null))) {
                return false;
            }
        }
        {
            BookPrice lhsBookPrice;
            lhsBookPrice = this.getBookPrice();
            BookPrice rhsBookPrice;
            rhsBookPrice = that.getBookPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bookPrice", lhsBookPrice), LocatorUtils.property(thatLocator, "bookPrice", rhsBookPrice), lhsBookPrice, rhsBookPrice, (this.bookPrice!= null), (that.bookPrice!= null))) {
                return false;
            }
        }
        {
            String lhsLeaseDescription;
            lhsLeaseDescription = this.getLeaseDescription();
            String rhsLeaseDescription;
            rhsLeaseDescription = that.getLeaseDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leaseDescription", lhsLeaseDescription), LocatorUtils.property(thatLocator, "leaseDescription", rhsLeaseDescription), lhsLeaseDescription, rhsLeaseDescription, (this.leaseDescription!= null), (that.leaseDescription!= null))) {
                return false;
            }
        }
        {
            PaymentMethod lhsPaymentMethod;
            lhsPaymentMethod = this.getPaymentMethod();
            PaymentMethod rhsPaymentMethod;
            rhsPaymentMethod = that.getPaymentMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentMethod", lhsPaymentMethod), LocatorUtils.property(thatLocator, "paymentMethod", rhsPaymentMethod), lhsPaymentMethod, rhsPaymentMethod, (this.paymentMethod!= null), (that.paymentMethod!= null))) {
                return false;
            }
        }
        {
            String lhsPriceListIdentifier;
            lhsPriceListIdentifier = this.getPriceListIdentifier();
            String rhsPriceListIdentifier;
            rhsPriceListIdentifier = that.getPriceListIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceListIdentifier", lhsPriceListIdentifier), LocatorUtils.property(thatLocator, "priceListIdentifier", rhsPriceListIdentifier), lhsPriceListIdentifier, rhsPriceListIdentifier, (this.priceListIdentifier!= null), (that.priceListIdentifier!= null))) {
                return false;
            }
        }
        {
            PurchaseMethod lhsPurchaseMethod;
            lhsPurchaseMethod = this.getPurchaseMethod();
            PurchaseMethod rhsPurchaseMethod;
            rhsPurchaseMethod = that.getPurchaseMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseMethod", lhsPurchaseMethod), LocatorUtils.property(thatLocator, "purchaseMethod", rhsPurchaseMethod), lhsPurchaseMethod, rhsPurchaseMethod, (this.purchaseMethod!= null), (that.purchaseMethod!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsResaleUnitPrice;
            lhsResaleUnitPrice = this.getResaleUnitPrice();
            FinancialAmountType rhsResaleUnitPrice;
            rhsResaleUnitPrice = that.getResaleUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resaleUnitPrice", lhsResaleUnitPrice), LocatorUtils.property(thatLocator, "resaleUnitPrice", rhsResaleUnitPrice), lhsResaleUnitPrice, rhsResaleUnitPrice, (this.resaleUnitPrice!= null), (that.resaleUnitPrice!= null))) {
                return false;
            }
        }
        {
            SalesOut lhsSalesOut;
            lhsSalesOut = this.getSalesOut();
            SalesOut rhsSalesOut;
            rhsSalesOut = that.getSalesOut();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesOut", lhsSalesOut), LocatorUtils.property(thatLocator, "salesOut", rhsSalesOut), lhsSalesOut, rhsSalesOut, (this.salesOut!= null), (that.salesOut!= null))) {
                return false;
            }
        }
        {
            TransactionType lhsTransactionType;
            lhsTransactionType = this.getTransactionType();
            TransactionType rhsTransactionType;
            rhsTransactionType = that.getTransactionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionType", lhsTransactionType), LocatorUtils.property(thatLocator, "transactionType", rhsTransactionType), lhsTransactionType, rhsTransactionType, (this.transactionType!= null), (that.transactionType!= null))) {
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
            XMLGregorianCalendar theBookDate;
            theBookDate = this.getBookDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bookDate", theBookDate), currentHashCode, theBookDate, (this.bookDate!= null));
        }
        {
            BookPrice theBookPrice;
            theBookPrice = this.getBookPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bookPrice", theBookPrice), currentHashCode, theBookPrice, (this.bookPrice!= null));
        }
        {
            String theLeaseDescription;
            theLeaseDescription = this.getLeaseDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leaseDescription", theLeaseDescription), currentHashCode, theLeaseDescription, (this.leaseDescription!= null));
        }
        {
            PaymentMethod thePaymentMethod;
            thePaymentMethod = this.getPaymentMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentMethod", thePaymentMethod), currentHashCode, thePaymentMethod, (this.paymentMethod!= null));
        }
        {
            String thePriceListIdentifier;
            thePriceListIdentifier = this.getPriceListIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceListIdentifier", thePriceListIdentifier), currentHashCode, thePriceListIdentifier, (this.priceListIdentifier!= null));
        }
        {
            PurchaseMethod thePurchaseMethod;
            thePurchaseMethod = this.getPurchaseMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseMethod", thePurchaseMethod), currentHashCode, thePurchaseMethod, (this.purchaseMethod!= null));
        }
        {
            FinancialAmountType theResaleUnitPrice;
            theResaleUnitPrice = this.getResaleUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resaleUnitPrice", theResaleUnitPrice), currentHashCode, theResaleUnitPrice, (this.resaleUnitPrice!= null));
        }
        {
            SalesOut theSalesOut;
            theSalesOut = this.getSalesOut();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesOut", theSalesOut), currentHashCode, theSalesOut, (this.salesOut!= null));
        }
        {
            TransactionType theTransactionType;
            theTransactionType = this.getTransactionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionType", theTransactionType), currentHashCode, theTransactionType, (this.transactionType!= null));
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
            XMLGregorianCalendar theBookDate;
            theBookDate = this.getBookDate();
            strategy.appendField(locator, this, "bookDate", buffer, theBookDate, (this.bookDate!= null));
        }
        {
            BookPrice theBookPrice;
            theBookPrice = this.getBookPrice();
            strategy.appendField(locator, this, "bookPrice", buffer, theBookPrice, (this.bookPrice!= null));
        }
        {
            String theLeaseDescription;
            theLeaseDescription = this.getLeaseDescription();
            strategy.appendField(locator, this, "leaseDescription", buffer, theLeaseDescription, (this.leaseDescription!= null));
        }
        {
            PaymentMethod thePaymentMethod;
            thePaymentMethod = this.getPaymentMethod();
            strategy.appendField(locator, this, "paymentMethod", buffer, thePaymentMethod, (this.paymentMethod!= null));
        }
        {
            String thePriceListIdentifier;
            thePriceListIdentifier = this.getPriceListIdentifier();
            strategy.appendField(locator, this, "priceListIdentifier", buffer, thePriceListIdentifier, (this.priceListIdentifier!= null));
        }
        {
            PurchaseMethod thePurchaseMethod;
            thePurchaseMethod = this.getPurchaseMethod();
            strategy.appendField(locator, this, "purchaseMethod", buffer, thePurchaseMethod, (this.purchaseMethod!= null));
        }
        {
            FinancialAmountType theResaleUnitPrice;
            theResaleUnitPrice = this.getResaleUnitPrice();
            strategy.appendField(locator, this, "resaleUnitPrice", buffer, theResaleUnitPrice, (this.resaleUnitPrice!= null));
        }
        {
            SalesOut theSalesOut;
            theSalesOut = this.getSalesOut();
            strategy.appendField(locator, this, "salesOut", buffer, theSalesOut, (this.salesOut!= null));
        }
        {
            TransactionType theTransactionType;
            theTransactionType = this.getTransactionType();
            strategy.appendField(locator, this, "transactionType", buffer, theTransactionType, (this.transactionType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
