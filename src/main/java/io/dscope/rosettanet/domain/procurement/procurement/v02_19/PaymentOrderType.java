
package io.dscope.rosettanet.domain.procurement.procurement.v02_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BankTraceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FundTransferRoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "accountNumber",
    "bankTraceIdentifier",
    "fundTransferRoutingNumber"
})
public class PaymentOrderType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AccountNumber", required = true)
    protected String accountNumber;
    @XmlElement(name = "BankTraceIdentifier")
    protected String bankTraceIdentifier;
    @XmlElement(name = "FundTransferRoutingNumber")
    protected String fundTransferRoutingNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

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
     * Gets the value of the fundTransferRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferRoutingNumber() {
        return fundTransferRoutingNumber;
    }

    /**
     * Sets the value of the fundTransferRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferRoutingNumber(String value) {
        this.fundTransferRoutingNumber = value;
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
            String lhsAccountNumber;
            lhsAccountNumber = this.getAccountNumber();
            String rhsAccountNumber;
            rhsAccountNumber = that.getAccountNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountNumber", lhsAccountNumber), LocatorUtils.property(thatLocator, "accountNumber", rhsAccountNumber), lhsAccountNumber, rhsAccountNumber, (this.accountNumber!= null), (that.accountNumber!= null))) {
                return false;
            }
        }
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
            String lhsFundTransferRoutingNumber;
            lhsFundTransferRoutingNumber = this.getFundTransferRoutingNumber();
            String rhsFundTransferRoutingNumber;
            rhsFundTransferRoutingNumber = that.getFundTransferRoutingNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fundTransferRoutingNumber", lhsFundTransferRoutingNumber), LocatorUtils.property(thatLocator, "fundTransferRoutingNumber", rhsFundTransferRoutingNumber), lhsFundTransferRoutingNumber, rhsFundTransferRoutingNumber, (this.fundTransferRoutingNumber!= null), (that.fundTransferRoutingNumber!= null))) {
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
            String theAccountNumber;
            theAccountNumber = this.getAccountNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountNumber", theAccountNumber), currentHashCode, theAccountNumber, (this.accountNumber!= null));
        }
        {
            String theBankTraceIdentifier;
            theBankTraceIdentifier = this.getBankTraceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bankTraceIdentifier", theBankTraceIdentifier), currentHashCode, theBankTraceIdentifier, (this.bankTraceIdentifier!= null));
        }
        {
            String theFundTransferRoutingNumber;
            theFundTransferRoutingNumber = this.getFundTransferRoutingNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fundTransferRoutingNumber", theFundTransferRoutingNumber), currentHashCode, theFundTransferRoutingNumber, (this.fundTransferRoutingNumber!= null));
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
            String theAccountNumber;
            theAccountNumber = this.getAccountNumber();
            strategy.appendField(locator, this, "accountNumber", buffer, theAccountNumber, (this.accountNumber!= null));
        }
        {
            String theBankTraceIdentifier;
            theBankTraceIdentifier = this.getBankTraceIdentifier();
            strategy.appendField(locator, this, "bankTraceIdentifier", buffer, theBankTraceIdentifier, (this.bankTraceIdentifier!= null));
        }
        {
            String theFundTransferRoutingNumber;
            theFundTransferRoutingNumber = this.getFundTransferRoutingNumber();
            strategy.appendField(locator, this, "fundTransferRoutingNumber", buffer, theFundTransferRoutingNumber, (this.fundTransferRoutingNumber!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
