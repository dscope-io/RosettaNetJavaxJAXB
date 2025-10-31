
package io.dscope.rosettanet.interchange.remittanceadvicenotification.v02_04;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.AccountDescriptionType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;
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
 * <p>Java class for PaymentOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankTraceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TotalRemittanceAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType"/&gt;
 *         &lt;element name="TransferFrom" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}AccountDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="TransferTo" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}AccountDescriptionType"/&gt;
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
@XmlType(name = "PaymentOrderType", propOrder = {
    "bankTraceIdentifier",
    "checkNumber",
    "effectiveDate",
    "totalRemittanceAmount",
    "transferFrom",
    "transferTo"
})
public class PaymentOrderType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BankTraceIdentifier")
    protected String bankTraceIdentifier;
    @XmlElement(name = "CheckNumber")
    protected String checkNumber;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "TotalRemittanceAmount", required = true)
    protected FinancialAmountType totalRemittanceAmount;
    @XmlElement(name = "TransferFrom")
    protected AccountDescriptionType transferFrom;
    @XmlElement(name = "TransferTo", required = true)
    protected AccountDescriptionType transferTo;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the bankTraceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTraceIdentifier() {
        return bankTraceIdentifier;
    }

    /**
     * Sets the value of the bankTraceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTraceIdentifier(String value) {
        this.bankTraceIdentifier = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the totalRemittanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalRemittanceAmount() {
        return totalRemittanceAmount;
    }

    /**
     * Sets the value of the totalRemittanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalRemittanceAmount(FinancialAmountType value) {
        this.totalRemittanceAmount = value;
    }

    /**
     * Gets the value of the transferFrom property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDescriptionType }
     *     
     */
    public AccountDescriptionType getTransferFrom() {
        return transferFrom;
    }

    /**
     * Sets the value of the transferFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDescriptionType }
     *     
     */
    public void setTransferFrom(AccountDescriptionType value) {
        this.transferFrom = value;
    }

    /**
     * Gets the value of the transferTo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDescriptionType }
     *     
     */
    public AccountDescriptionType getTransferTo() {
        return transferTo;
    }

    /**
     * Sets the value of the transferTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDescriptionType }
     *     
     */
    public void setTransferTo(AccountDescriptionType value) {
        this.transferTo = value;
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
        final PaymentOrderType that = ((PaymentOrderType) object);
        {
            String lhsBankTraceIdentifier;
            lhsBankTraceIdentifier = this.getBankTraceIdentifier();
            String rhsBankTraceIdentifier;
            rhsBankTraceIdentifier = that.getBankTraceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bankTraceIdentifier", lhsBankTraceIdentifier), LocatorUtils.property(thatLocator, "bankTraceIdentifier", rhsBankTraceIdentifier), lhsBankTraceIdentifier, rhsBankTraceIdentifier, (this.bankTraceIdentifier!= null), (that.bankTraceIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsCheckNumber;
            lhsCheckNumber = this.getCheckNumber();
            String rhsCheckNumber;
            rhsCheckNumber = that.getCheckNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkNumber", lhsCheckNumber), LocatorUtils.property(thatLocator, "checkNumber", rhsCheckNumber), lhsCheckNumber, rhsCheckNumber, (this.checkNumber!= null), (that.checkNumber!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEffectiveDate;
            lhsEffectiveDate = this.getEffectiveDate();
            XMLGregorianCalendar rhsEffectiveDate;
            rhsEffectiveDate = that.getEffectiveDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveDate", lhsEffectiveDate), LocatorUtils.property(thatLocator, "effectiveDate", rhsEffectiveDate), lhsEffectiveDate, rhsEffectiveDate, (this.effectiveDate!= null), (that.effectiveDate!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsTotalRemittanceAmount;
            lhsTotalRemittanceAmount = this.getTotalRemittanceAmount();
            FinancialAmountType rhsTotalRemittanceAmount;
            rhsTotalRemittanceAmount = that.getTotalRemittanceAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalRemittanceAmount", lhsTotalRemittanceAmount), LocatorUtils.property(thatLocator, "totalRemittanceAmount", rhsTotalRemittanceAmount), lhsTotalRemittanceAmount, rhsTotalRemittanceAmount, (this.totalRemittanceAmount!= null), (that.totalRemittanceAmount!= null))) {
                return false;
            }
        }
        {
            AccountDescriptionType lhsTransferFrom;
            lhsTransferFrom = this.getTransferFrom();
            AccountDescriptionType rhsTransferFrom;
            rhsTransferFrom = that.getTransferFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transferFrom", lhsTransferFrom), LocatorUtils.property(thatLocator, "transferFrom", rhsTransferFrom), lhsTransferFrom, rhsTransferFrom, (this.transferFrom!= null), (that.transferFrom!= null))) {
                return false;
            }
        }
        {
            AccountDescriptionType lhsTransferTo;
            lhsTransferTo = this.getTransferTo();
            AccountDescriptionType rhsTransferTo;
            rhsTransferTo = that.getTransferTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transferTo", lhsTransferTo), LocatorUtils.property(thatLocator, "transferTo", rhsTransferTo), lhsTransferTo, rhsTransferTo, (this.transferTo!= null), (that.transferTo!= null))) {
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
            String theBankTraceIdentifier;
            theBankTraceIdentifier = this.getBankTraceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bankTraceIdentifier", theBankTraceIdentifier), currentHashCode, theBankTraceIdentifier, (this.bankTraceIdentifier!= null));
        }
        {
            String theCheckNumber;
            theCheckNumber = this.getCheckNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkNumber", theCheckNumber), currentHashCode, theCheckNumber, (this.checkNumber!= null));
        }
        {
            XMLGregorianCalendar theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveDate", theEffectiveDate), currentHashCode, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            FinancialAmountType theTotalRemittanceAmount;
            theTotalRemittanceAmount = this.getTotalRemittanceAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalRemittanceAmount", theTotalRemittanceAmount), currentHashCode, theTotalRemittanceAmount, (this.totalRemittanceAmount!= null));
        }
        {
            AccountDescriptionType theTransferFrom;
            theTransferFrom = this.getTransferFrom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transferFrom", theTransferFrom), currentHashCode, theTransferFrom, (this.transferFrom!= null));
        }
        {
            AccountDescriptionType theTransferTo;
            theTransferTo = this.getTransferTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transferTo", theTransferTo), currentHashCode, theTransferTo, (this.transferTo!= null));
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
            String theBankTraceIdentifier;
            theBankTraceIdentifier = this.getBankTraceIdentifier();
            strategy.appendField(locator, this, "bankTraceIdentifier", buffer, theBankTraceIdentifier, (this.bankTraceIdentifier!= null));
        }
        {
            String theCheckNumber;
            theCheckNumber = this.getCheckNumber();
            strategy.appendField(locator, this, "checkNumber", buffer, theCheckNumber, (this.checkNumber!= null));
        }
        {
            XMLGregorianCalendar theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            strategy.appendField(locator, this, "effectiveDate", buffer, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            FinancialAmountType theTotalRemittanceAmount;
            theTotalRemittanceAmount = this.getTotalRemittanceAmount();
            strategy.appendField(locator, this, "totalRemittanceAmount", buffer, theTotalRemittanceAmount, (this.totalRemittanceAmount!= null));
        }
        {
            AccountDescriptionType theTransferFrom;
            theTransferFrom = this.getTransferFrom();
            strategy.appendField(locator, this, "transferFrom", buffer, theTransferFrom, (this.transferFrom!= null));
        }
        {
            AccountDescriptionType theTransferTo;
            theTransferTo = this.getTransferTo();
            strategy.appendField(locator, this, "transferTo", buffer, theTransferTo, (this.transferTo!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
