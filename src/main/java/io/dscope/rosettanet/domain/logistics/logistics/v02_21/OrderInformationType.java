
package io.dscope.rosettanet.domain.logistics.logistics.v02_21;

import java.math.BigInteger;
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
import io.dscope.rosettanet.universal.document.v01_11.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.locations.v01_04.AlternativeIdentifier;
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
 * <p>Java class for OrderInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}AlternativeIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="OrderAllocationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OrderReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.11}BusinessDocumentReferenceType"/&gt;
 *         &lt;element name="TotalAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.05}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItems" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItemsAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.05}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.05}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "OrderInformationType", propOrder = {
    "alternativeIdentifier",
    "orderAllocationDate",
    "orderReference",
    "totalAmount",
    "totalLineItems",
    "totalLineItemsAmount",
    "unitPrice"
})
public class OrderInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = AlternativeIdentifier.class, required = false)
    protected AlternativeIdentifier alternativeIdentifier;
    @XmlElement(name = "OrderAllocationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderAllocationDate;
    @XmlElement(name = "OrderReference", required = true)
    protected BusinessDocumentReferenceType orderReference;
    @XmlElement(name = "TotalAmount")
    protected FinancialAmountType totalAmount;
    @XmlElement(name = "TotalLineItems")
    protected BigInteger totalLineItems;
    @XmlElement(name = "TotalLineItemsAmount")
    protected FinancialAmountType totalLineItemsAmount;
    @XmlElement(name = "UnitPrice")
    protected FinancialAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternativeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeIdentifier }
     *     
     */
    public AlternativeIdentifier getAlternativeIdentifier() {
        return alternativeIdentifier;
    }

    /**
     * Sets the value of the alternativeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeIdentifier }
     *     
     */
    public void setAlternativeIdentifier(AlternativeIdentifier value) {
        this.alternativeIdentifier = value;
    }

    /**
     * Gets the value of the orderAllocationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderAllocationDate() {
        return orderAllocationDate;
    }

    /**
     * Sets the value of the orderAllocationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderAllocationDate(XMLGregorianCalendar value) {
        this.orderAllocationDate = value;
    }

    /**
     * Gets the value of the orderReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setOrderReference(BusinessDocumentReferenceType value) {
        this.orderReference = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalAmount(FinancialAmountType value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the totalLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalLineItems() {
        return totalLineItems;
    }

    /**
     * Sets the value of the totalLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalLineItems(BigInteger value) {
        this.totalLineItems = value;
    }

    /**
     * Gets the value of the totalLineItemsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalLineItemsAmount() {
        return totalLineItemsAmount;
    }

    /**
     * Sets the value of the totalLineItemsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalLineItemsAmount(FinancialAmountType value) {
        this.totalLineItemsAmount = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setUnitPrice(FinancialAmountType value) {
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
        final OrderInformationType that = ((OrderInformationType) object);
        {
            AlternativeIdentifier lhsAlternativeIdentifier;
            lhsAlternativeIdentifier = this.getAlternativeIdentifier();
            AlternativeIdentifier rhsAlternativeIdentifier;
            rhsAlternativeIdentifier = that.getAlternativeIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativeIdentifier", lhsAlternativeIdentifier), LocatorUtils.property(thatLocator, "alternativeIdentifier", rhsAlternativeIdentifier), lhsAlternativeIdentifier, rhsAlternativeIdentifier, (this.alternativeIdentifier!= null), (that.alternativeIdentifier!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsOrderAllocationDate;
            lhsOrderAllocationDate = this.getOrderAllocationDate();
            XMLGregorianCalendar rhsOrderAllocationDate;
            rhsOrderAllocationDate = that.getOrderAllocationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderAllocationDate", lhsOrderAllocationDate), LocatorUtils.property(thatLocator, "orderAllocationDate", rhsOrderAllocationDate), lhsOrderAllocationDate, rhsOrderAllocationDate, (this.orderAllocationDate!= null), (that.orderAllocationDate!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsOrderReference;
            lhsOrderReference = this.getOrderReference();
            BusinessDocumentReferenceType rhsOrderReference;
            rhsOrderReference = that.getOrderReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderReference", lhsOrderReference), LocatorUtils.property(thatLocator, "orderReference", rhsOrderReference), lhsOrderReference, rhsOrderReference, (this.orderReference!= null), (that.orderReference!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsTotalAmount;
            lhsTotalAmount = this.getTotalAmount();
            FinancialAmountType rhsTotalAmount;
            rhsTotalAmount = that.getTotalAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAmount", lhsTotalAmount), LocatorUtils.property(thatLocator, "totalAmount", rhsTotalAmount), lhsTotalAmount, rhsTotalAmount, (this.totalAmount!= null), (that.totalAmount!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsTotalLineItems;
            lhsTotalLineItems = this.getTotalLineItems();
            BigInteger rhsTotalLineItems;
            rhsTotalLineItems = that.getTotalLineItems();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalLineItems", lhsTotalLineItems), LocatorUtils.property(thatLocator, "totalLineItems", rhsTotalLineItems), lhsTotalLineItems, rhsTotalLineItems, (this.totalLineItems!= null), (that.totalLineItems!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsTotalLineItemsAmount;
            lhsTotalLineItemsAmount = this.getTotalLineItemsAmount();
            FinancialAmountType rhsTotalLineItemsAmount;
            rhsTotalLineItemsAmount = that.getTotalLineItemsAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalLineItemsAmount", lhsTotalLineItemsAmount), LocatorUtils.property(thatLocator, "totalLineItemsAmount", rhsTotalLineItemsAmount), lhsTotalLineItemsAmount, rhsTotalLineItemsAmount, (this.totalLineItemsAmount!= null), (that.totalLineItemsAmount!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsUnitPrice;
            lhsUnitPrice = this.getUnitPrice();
            FinancialAmountType rhsUnitPrice;
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
            AlternativeIdentifier theAlternativeIdentifier;
            theAlternativeIdentifier = this.getAlternativeIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativeIdentifier", theAlternativeIdentifier), currentHashCode, theAlternativeIdentifier, (this.alternativeIdentifier!= null));
        }
        {
            XMLGregorianCalendar theOrderAllocationDate;
            theOrderAllocationDate = this.getOrderAllocationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderAllocationDate", theOrderAllocationDate), currentHashCode, theOrderAllocationDate, (this.orderAllocationDate!= null));
        }
        {
            BusinessDocumentReferenceType theOrderReference;
            theOrderReference = this.getOrderReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderReference", theOrderReference), currentHashCode, theOrderReference, (this.orderReference!= null));
        }
        {
            FinancialAmountType theTotalAmount;
            theTotalAmount = this.getTotalAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmount", theTotalAmount), currentHashCode, theTotalAmount, (this.totalAmount!= null));
        }
        {
            BigInteger theTotalLineItems;
            theTotalLineItems = this.getTotalLineItems();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalLineItems", theTotalLineItems), currentHashCode, theTotalLineItems, (this.totalLineItems!= null));
        }
        {
            FinancialAmountType theTotalLineItemsAmount;
            theTotalLineItemsAmount = this.getTotalLineItemsAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalLineItemsAmount", theTotalLineItemsAmount), currentHashCode, theTotalLineItemsAmount, (this.totalLineItemsAmount!= null));
        }
        {
            FinancialAmountType theUnitPrice;
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
            AlternativeIdentifier theAlternativeIdentifier;
            theAlternativeIdentifier = this.getAlternativeIdentifier();
            strategy.appendField(locator, this, "alternativeIdentifier", buffer, theAlternativeIdentifier, (this.alternativeIdentifier!= null));
        }
        {
            XMLGregorianCalendar theOrderAllocationDate;
            theOrderAllocationDate = this.getOrderAllocationDate();
            strategy.appendField(locator, this, "orderAllocationDate", buffer, theOrderAllocationDate, (this.orderAllocationDate!= null));
        }
        {
            BusinessDocumentReferenceType theOrderReference;
            theOrderReference = this.getOrderReference();
            strategy.appendField(locator, this, "orderReference", buffer, theOrderReference, (this.orderReference!= null));
        }
        {
            FinancialAmountType theTotalAmount;
            theTotalAmount = this.getTotalAmount();
            strategy.appendField(locator, this, "totalAmount", buffer, theTotalAmount, (this.totalAmount!= null));
        }
        {
            BigInteger theTotalLineItems;
            theTotalLineItems = this.getTotalLineItems();
            strategy.appendField(locator, this, "totalLineItems", buffer, theTotalLineItems, (this.totalLineItems!= null));
        }
        {
            FinancialAmountType theTotalLineItemsAmount;
            theTotalLineItemsAmount = this.getTotalLineItemsAmount();
            strategy.appendField(locator, this, "totalLineItemsAmount", buffer, theTotalLineItemsAmount, (this.totalLineItemsAmount!= null));
        }
        {
            FinancialAmountType theUnitPrice;
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
