
package io.dscope.rosettanet.interchange.remittanceadvicenotification.v02_02;

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
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
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
 * <p>Java class for RemittanceAdviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceAdviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscountAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element name="PaymentOrder" type="{urn:rosettanet:specification:interchange:RemittanceAdviceNotification:xsd:schema:02.02}PaymentOrderType"/&gt;
 *         &lt;element name="RemittanceLineItem" type="{urn:rosettanet:specification:interchange:RemittanceAdviceNotification:xsd:schema:02.02}RemittanceLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="UniqueRemittanceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RemittanceAdviceType", propOrder = {
    "discountAmount",
    "partnerDescription",
    "paymentOrder",
    "remittanceLineItem",
    "uniqueRemittanceIdentifier"
})
public class RemittanceAdviceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DiscountAmount")
    protected FinancialAmountType discountAmount;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElement(name = "PaymentOrder", required = true)
    protected PaymentOrderType paymentOrder;
    @XmlElement(name = "RemittanceLineItem", required = true)
    protected List<RemittanceLineItemType> remittanceLineItem;
    @XmlElement(name = "UniqueRemittanceIdentifier")
    protected String uniqueRemittanceIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setDiscountAmount(FinancialAmountType value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
    }

    /**
     * Gets the value of the paymentOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOrderType }
     *     
     */
    public PaymentOrderType getPaymentOrder() {
        return paymentOrder;
    }

    /**
     * Sets the value of the paymentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOrderType }
     *     
     */
    public void setPaymentOrder(PaymentOrderType value) {
        this.paymentOrder = value;
    }

    /**
     * Gets the value of the remittanceLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remittanceLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemittanceLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLineItemType }
     * 
     * 
     */
    public List<RemittanceLineItemType> getRemittanceLineItem() {
        if (remittanceLineItem == null) {
            remittanceLineItem = new ArrayList<RemittanceLineItemType>();
        }
        return this.remittanceLineItem;
    }

    /**
     * Gets the value of the uniqueRemittanceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueRemittanceIdentifier() {
        return uniqueRemittanceIdentifier;
    }

    /**
     * Sets the value of the uniqueRemittanceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueRemittanceIdentifier(String value) {
        this.uniqueRemittanceIdentifier = value;
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
        final RemittanceAdviceType that = ((RemittanceAdviceType) object);
        {
            FinancialAmountType lhsDiscountAmount;
            lhsDiscountAmount = this.getDiscountAmount();
            FinancialAmountType rhsDiscountAmount;
            rhsDiscountAmount = that.getDiscountAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountAmount", lhsDiscountAmount), LocatorUtils.property(thatLocator, "discountAmount", rhsDiscountAmount), lhsDiscountAmount, rhsDiscountAmount, (this.discountAmount!= null), (that.discountAmount!= null))) {
                return false;
            }
        }
        {
            PartnerDescription lhsPartnerDescription;
            lhsPartnerDescription = this.getPartnerDescription();
            PartnerDescription rhsPartnerDescription;
            rhsPartnerDescription = that.getPartnerDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, (this.partnerDescription!= null), (that.partnerDescription!= null))) {
                return false;
            }
        }
        {
            PaymentOrderType lhsPaymentOrder;
            lhsPaymentOrder = this.getPaymentOrder();
            PaymentOrderType rhsPaymentOrder;
            rhsPaymentOrder = that.getPaymentOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentOrder", lhsPaymentOrder), LocatorUtils.property(thatLocator, "paymentOrder", rhsPaymentOrder), lhsPaymentOrder, rhsPaymentOrder, (this.paymentOrder!= null), (that.paymentOrder!= null))) {
                return false;
            }
        }
        {
            List<RemittanceLineItemType> lhsRemittanceLineItem;
            lhsRemittanceLineItem = (((this.remittanceLineItem!= null)&&(!this.remittanceLineItem.isEmpty()))?this.getRemittanceLineItem():null);
            List<RemittanceLineItemType> rhsRemittanceLineItem;
            rhsRemittanceLineItem = (((that.remittanceLineItem!= null)&&(!that.remittanceLineItem.isEmpty()))?that.getRemittanceLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remittanceLineItem", lhsRemittanceLineItem), LocatorUtils.property(thatLocator, "remittanceLineItem", rhsRemittanceLineItem), lhsRemittanceLineItem, rhsRemittanceLineItem, ((this.remittanceLineItem!= null)&&(!this.remittanceLineItem.isEmpty())), ((that.remittanceLineItem!= null)&&(!that.remittanceLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsUniqueRemittanceIdentifier;
            lhsUniqueRemittanceIdentifier = this.getUniqueRemittanceIdentifier();
            String rhsUniqueRemittanceIdentifier;
            rhsUniqueRemittanceIdentifier = that.getUniqueRemittanceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uniqueRemittanceIdentifier", lhsUniqueRemittanceIdentifier), LocatorUtils.property(thatLocator, "uniqueRemittanceIdentifier", rhsUniqueRemittanceIdentifier), lhsUniqueRemittanceIdentifier, rhsUniqueRemittanceIdentifier, (this.uniqueRemittanceIdentifier!= null), (that.uniqueRemittanceIdentifier!= null))) {
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
            FinancialAmountType theDiscountAmount;
            theDiscountAmount = this.getDiscountAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountAmount", theDiscountAmount), currentHashCode, theDiscountAmount, (this.discountAmount!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            PaymentOrderType thePaymentOrder;
            thePaymentOrder = this.getPaymentOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentOrder", thePaymentOrder), currentHashCode, thePaymentOrder, (this.paymentOrder!= null));
        }
        {
            List<RemittanceLineItemType> theRemittanceLineItem;
            theRemittanceLineItem = (((this.remittanceLineItem!= null)&&(!this.remittanceLineItem.isEmpty()))?this.getRemittanceLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remittanceLineItem", theRemittanceLineItem), currentHashCode, theRemittanceLineItem, ((this.remittanceLineItem!= null)&&(!this.remittanceLineItem.isEmpty())));
        }
        {
            String theUniqueRemittanceIdentifier;
            theUniqueRemittanceIdentifier = this.getUniqueRemittanceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uniqueRemittanceIdentifier", theUniqueRemittanceIdentifier), currentHashCode, theUniqueRemittanceIdentifier, (this.uniqueRemittanceIdentifier!= null));
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
            FinancialAmountType theDiscountAmount;
            theDiscountAmount = this.getDiscountAmount();
            strategy.appendField(locator, this, "discountAmount", buffer, theDiscountAmount, (this.discountAmount!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            PaymentOrderType thePaymentOrder;
            thePaymentOrder = this.getPaymentOrder();
            strategy.appendField(locator, this, "paymentOrder", buffer, thePaymentOrder, (this.paymentOrder!= null));
        }
        {
            List<RemittanceLineItemType> theRemittanceLineItem;
            theRemittanceLineItem = (((this.remittanceLineItem!= null)&&(!this.remittanceLineItem.isEmpty()))?this.getRemittanceLineItem():null);
            strategy.appendField(locator, this, "remittanceLineItem", buffer, theRemittanceLineItem, ((this.remittanceLineItem!= null)&&(!this.remittanceLineItem.isEmpty())));
        }
        {
            String theUniqueRemittanceIdentifier;
            theUniqueRemittanceIdentifier = this.getUniqueRemittanceIdentifier();
            strategy.appendField(locator, this, "uniqueRemittanceIdentifier", buffer, theUniqueRemittanceIdentifier, (this.uniqueRemittanceIdentifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
