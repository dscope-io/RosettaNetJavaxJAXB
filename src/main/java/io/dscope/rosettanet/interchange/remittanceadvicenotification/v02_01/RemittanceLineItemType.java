
package io.dscope.rosettanet.interchange.remittanceadvicenotification.v02_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.financialadjustmentreason.v01_03.FinancialAdjustmentReason;
import io.dscope.rosettanet.domain.shared.shared.v01_12.MonetaryAmountType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerDescription;
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
 * <p>Java class for RemittanceLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdjustmentAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}MonetaryAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DiscountAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:FinancialAdjustmentReason:xsd:codelist:01.03}FinancialAdjustmentReason" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RemittanceLineItemType", propOrder = {
    "adjustmentAmount",
    "businessDocumentReference",
    "discountAmount",
    "financialAdjustmentReason",
    "lineNumber",
    "partnerDescription",
    "paymentAmount",
    "transactionIdentifier"
})
public class RemittanceLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AdjustmentAmount")
    protected List<MonetaryAmountType> adjustmentAmount;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "DiscountAmount")
    protected MonetaryAmountType discountAmount;
    @XmlElementRef(name = "FinancialAdjustmentReason", namespace = "urn:rosettanet:specification:domain:Procurement:FinancialAdjustmentReason:xsd:codelist:01.03", type = FinancialAdjustmentReason.class, required = false)
    protected FinancialAdjustmentReason financialAdjustmentReason;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElement(name = "PaymentAmount")
    protected MonetaryAmountType paymentAmount;
    @XmlElement(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryAmountType }
     * 
     * 
     */
    public List<MonetaryAmountType> getAdjustmentAmount() {
        if (adjustmentAmount == null) {
            adjustmentAmount = new ArrayList<MonetaryAmountType>();
        }
        return this.adjustmentAmount;
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
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setDiscountAmount(MonetaryAmountType value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the financialAdjustmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAdjustmentReason }
     *     
     */
    public FinancialAdjustmentReason getFinancialAdjustmentReason() {
        return financialAdjustmentReason;
    }

    /**
     * Sets the value of the financialAdjustmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAdjustmentReason }
     *     
     */
    public void setFinancialAdjustmentReason(FinancialAdjustmentReason value) {
        this.financialAdjustmentReason = value;
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
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setPaymentAmount(MonetaryAmountType value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
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
        final RemittanceLineItemType that = ((RemittanceLineItemType) object);
        {
            List<MonetaryAmountType> lhsAdjustmentAmount;
            lhsAdjustmentAmount = (((this.adjustmentAmount!= null)&&(!this.adjustmentAmount.isEmpty()))?this.getAdjustmentAmount():null);
            List<MonetaryAmountType> rhsAdjustmentAmount;
            rhsAdjustmentAmount = (((that.adjustmentAmount!= null)&&(!that.adjustmentAmount.isEmpty()))?that.getAdjustmentAmount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adjustmentAmount", lhsAdjustmentAmount), LocatorUtils.property(thatLocator, "adjustmentAmount", rhsAdjustmentAmount), lhsAdjustmentAmount, rhsAdjustmentAmount, ((this.adjustmentAmount!= null)&&(!this.adjustmentAmount.isEmpty())), ((that.adjustmentAmount!= null)&&(!that.adjustmentAmount.isEmpty())))) {
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
            MonetaryAmountType lhsDiscountAmount;
            lhsDiscountAmount = this.getDiscountAmount();
            MonetaryAmountType rhsDiscountAmount;
            rhsDiscountAmount = that.getDiscountAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountAmount", lhsDiscountAmount), LocatorUtils.property(thatLocator, "discountAmount", rhsDiscountAmount), lhsDiscountAmount, rhsDiscountAmount, (this.discountAmount!= null), (that.discountAmount!= null))) {
                return false;
            }
        }
        {
            FinancialAdjustmentReason lhsFinancialAdjustmentReason;
            lhsFinancialAdjustmentReason = this.getFinancialAdjustmentReason();
            FinancialAdjustmentReason rhsFinancialAdjustmentReason;
            rhsFinancialAdjustmentReason = that.getFinancialAdjustmentReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financialAdjustmentReason", lhsFinancialAdjustmentReason), LocatorUtils.property(thatLocator, "financialAdjustmentReason", rhsFinancialAdjustmentReason), lhsFinancialAdjustmentReason, rhsFinancialAdjustmentReason, (this.financialAdjustmentReason!= null), (that.financialAdjustmentReason!= null))) {
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
            PartnerDescription lhsPartnerDescription;
            lhsPartnerDescription = this.getPartnerDescription();
            PartnerDescription rhsPartnerDescription;
            rhsPartnerDescription = that.getPartnerDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, (this.partnerDescription!= null), (that.partnerDescription!= null))) {
                return false;
            }
        }
        {
            MonetaryAmountType lhsPaymentAmount;
            lhsPaymentAmount = this.getPaymentAmount();
            MonetaryAmountType rhsPaymentAmount;
            rhsPaymentAmount = that.getPaymentAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentAmount", lhsPaymentAmount), LocatorUtils.property(thatLocator, "paymentAmount", rhsPaymentAmount), lhsPaymentAmount, rhsPaymentAmount, (this.paymentAmount!= null), (that.paymentAmount!= null))) {
                return false;
            }
        }
        {
            String lhsTransactionIdentifier;
            lhsTransactionIdentifier = this.getTransactionIdentifier();
            String rhsTransactionIdentifier;
            rhsTransactionIdentifier = that.getTransactionIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionIdentifier", lhsTransactionIdentifier), LocatorUtils.property(thatLocator, "transactionIdentifier", rhsTransactionIdentifier), lhsTransactionIdentifier, rhsTransactionIdentifier, (this.transactionIdentifier!= null), (that.transactionIdentifier!= null))) {
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
            List<MonetaryAmountType> theAdjustmentAmount;
            theAdjustmentAmount = (((this.adjustmentAmount!= null)&&(!this.adjustmentAmount.isEmpty()))?this.getAdjustmentAmount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adjustmentAmount", theAdjustmentAmount), currentHashCode, theAdjustmentAmount, ((this.adjustmentAmount!= null)&&(!this.adjustmentAmount.isEmpty())));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            MonetaryAmountType theDiscountAmount;
            theDiscountAmount = this.getDiscountAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountAmount", theDiscountAmount), currentHashCode, theDiscountAmount, (this.discountAmount!= null));
        }
        {
            FinancialAdjustmentReason theFinancialAdjustmentReason;
            theFinancialAdjustmentReason = this.getFinancialAdjustmentReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financialAdjustmentReason", theFinancialAdjustmentReason), currentHashCode, theFinancialAdjustmentReason, (this.financialAdjustmentReason!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            MonetaryAmountType thePaymentAmount;
            thePaymentAmount = this.getPaymentAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentAmount", thePaymentAmount), currentHashCode, thePaymentAmount, (this.paymentAmount!= null));
        }
        {
            String theTransactionIdentifier;
            theTransactionIdentifier = this.getTransactionIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionIdentifier", theTransactionIdentifier), currentHashCode, theTransactionIdentifier, (this.transactionIdentifier!= null));
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
            List<MonetaryAmountType> theAdjustmentAmount;
            theAdjustmentAmount = (((this.adjustmentAmount!= null)&&(!this.adjustmentAmount.isEmpty()))?this.getAdjustmentAmount():null);
            strategy.appendField(locator, this, "adjustmentAmount", buffer, theAdjustmentAmount, ((this.adjustmentAmount!= null)&&(!this.adjustmentAmount.isEmpty())));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            MonetaryAmountType theDiscountAmount;
            theDiscountAmount = this.getDiscountAmount();
            strategy.appendField(locator, this, "discountAmount", buffer, theDiscountAmount, (this.discountAmount!= null));
        }
        {
            FinancialAdjustmentReason theFinancialAdjustmentReason;
            theFinancialAdjustmentReason = this.getFinancialAdjustmentReason();
            strategy.appendField(locator, this, "financialAdjustmentReason", buffer, theFinancialAdjustmentReason, (this.financialAdjustmentReason!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            MonetaryAmountType thePaymentAmount;
            thePaymentAmount = this.getPaymentAmount();
            strategy.appendField(locator, this, "paymentAmount", buffer, thePaymentAmount, (this.paymentAmount!= null));
        }
        {
            String theTransactionIdentifier;
            theTransactionIdentifier = this.getTransactionIdentifier();
            strategy.appendField(locator, this, "transactionIdentifier", buffer, theTransactionIdentifier, (this.transactionIdentifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
