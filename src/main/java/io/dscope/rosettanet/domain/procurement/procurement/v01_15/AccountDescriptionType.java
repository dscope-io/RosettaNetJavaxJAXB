
package io.dscope.rosettanet.domain.procurement.procurement.v01_15;

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
import io.dscope.rosettanet.domain.procurement.codelist.accountclassification.v01_02.AccountClassification;
import io.dscope.rosettanet.domain.procurement.codelist.paymentmethod.v01_02.PaymentMethod;
import io.dscope.rosettanet.universal.partneridentification.v01_04.PartnerDescription;
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
 * <p>Java class for AccountDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:AccountClassification:xsd:codelist:01.02}AccountClassification" minOccurs="0"/&gt;
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}CreditCard" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PaymentMethod:xsd:codelist:01.02}PaymentMethod" minOccurs="0"/&gt;
 *         &lt;element name="PrePaymentCheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WireTransferIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "AccountDescriptionType", propOrder = {
    "accountClassification",
    "accountName",
    "accountNumber",
    "creditCard",
    "partnerDescription",
    "paymentMethod",
    "prePaymentCheckNumber",
    "wireTransferIdentifier"
})
public class AccountDescriptionType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AccountClassification", namespace = "urn:rosettanet:specification:domain:Procurement:AccountClassification:xsd:codelist:01.02", type = AccountClassification.class, required = false)
    protected AccountClassification accountClassification;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElementRef(name = "CreditCard", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", type = CreditCard.class, required = false)
    protected CreditCard creditCard;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "PaymentMethod", namespace = "urn:rosettanet:specification:domain:Procurement:PaymentMethod:xsd:codelist:01.02", type = PaymentMethod.class, required = false)
    protected PaymentMethod paymentMethod;
    @XmlElement(name = "PrePaymentCheckNumber")
    protected String prePaymentCheckNumber;
    @XmlElement(name = "WireTransferIdentifier")
    protected String wireTransferIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the accountClassification property.
     * 
     * @return
     *     possible object is
     *     {@link AccountClassification }
     *     
     */
    public AccountClassification getAccountClassification() {
        return accountClassification;
    }

    /**
     * Sets the value of the accountClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountClassification }
     *     
     */
    public void setAccountClassification(AccountClassification value) {
        this.accountClassification = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

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
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
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
     * Gets the value of the prePaymentCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePaymentCheckNumber() {
        return prePaymentCheckNumber;
    }

    /**
     * Sets the value of the prePaymentCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePaymentCheckNumber(String value) {
        this.prePaymentCheckNumber = value;
    }

    /**
     * Gets the value of the wireTransferIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireTransferIdentifier() {
        return wireTransferIdentifier;
    }

    /**
     * Sets the value of the wireTransferIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireTransferIdentifier(String value) {
        this.wireTransferIdentifier = value;
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
        final AccountDescriptionType that = ((AccountDescriptionType) object);
        {
            AccountClassification lhsAccountClassification;
            lhsAccountClassification = this.getAccountClassification();
            AccountClassification rhsAccountClassification;
            rhsAccountClassification = that.getAccountClassification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountClassification", lhsAccountClassification), LocatorUtils.property(thatLocator, "accountClassification", rhsAccountClassification), lhsAccountClassification, rhsAccountClassification, (this.accountClassification!= null), (that.accountClassification!= null))) {
                return false;
            }
        }
        {
            String lhsAccountName;
            lhsAccountName = this.getAccountName();
            String rhsAccountName;
            rhsAccountName = that.getAccountName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountName", lhsAccountName), LocatorUtils.property(thatLocator, "accountName", rhsAccountName), lhsAccountName, rhsAccountName, (this.accountName!= null), (that.accountName!= null))) {
                return false;
            }
        }
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
            CreditCard lhsCreditCard;
            lhsCreditCard = this.getCreditCard();
            CreditCard rhsCreditCard;
            rhsCreditCard = that.getCreditCard();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditCard", lhsCreditCard), LocatorUtils.property(thatLocator, "creditCard", rhsCreditCard), lhsCreditCard, rhsCreditCard, (this.creditCard!= null), (that.creditCard!= null))) {
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
            PaymentMethod lhsPaymentMethod;
            lhsPaymentMethod = this.getPaymentMethod();
            PaymentMethod rhsPaymentMethod;
            rhsPaymentMethod = that.getPaymentMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentMethod", lhsPaymentMethod), LocatorUtils.property(thatLocator, "paymentMethod", rhsPaymentMethod), lhsPaymentMethod, rhsPaymentMethod, (this.paymentMethod!= null), (that.paymentMethod!= null))) {
                return false;
            }
        }
        {
            String lhsPrePaymentCheckNumber;
            lhsPrePaymentCheckNumber = this.getPrePaymentCheckNumber();
            String rhsPrePaymentCheckNumber;
            rhsPrePaymentCheckNumber = that.getPrePaymentCheckNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prePaymentCheckNumber", lhsPrePaymentCheckNumber), LocatorUtils.property(thatLocator, "prePaymentCheckNumber", rhsPrePaymentCheckNumber), lhsPrePaymentCheckNumber, rhsPrePaymentCheckNumber, (this.prePaymentCheckNumber!= null), (that.prePaymentCheckNumber!= null))) {
                return false;
            }
        }
        {
            String lhsWireTransferIdentifier;
            lhsWireTransferIdentifier = this.getWireTransferIdentifier();
            String rhsWireTransferIdentifier;
            rhsWireTransferIdentifier = that.getWireTransferIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wireTransferIdentifier", lhsWireTransferIdentifier), LocatorUtils.property(thatLocator, "wireTransferIdentifier", rhsWireTransferIdentifier), lhsWireTransferIdentifier, rhsWireTransferIdentifier, (this.wireTransferIdentifier!= null), (that.wireTransferIdentifier!= null))) {
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
            AccountClassification theAccountClassification;
            theAccountClassification = this.getAccountClassification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountClassification", theAccountClassification), currentHashCode, theAccountClassification, (this.accountClassification!= null));
        }
        {
            String theAccountName;
            theAccountName = this.getAccountName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountName", theAccountName), currentHashCode, theAccountName, (this.accountName!= null));
        }
        {
            String theAccountNumber;
            theAccountNumber = this.getAccountNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountNumber", theAccountNumber), currentHashCode, theAccountNumber, (this.accountNumber!= null));
        }
        {
            CreditCard theCreditCard;
            theCreditCard = this.getCreditCard();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditCard", theCreditCard), currentHashCode, theCreditCard, (this.creditCard!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            PaymentMethod thePaymentMethod;
            thePaymentMethod = this.getPaymentMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentMethod", thePaymentMethod), currentHashCode, thePaymentMethod, (this.paymentMethod!= null));
        }
        {
            String thePrePaymentCheckNumber;
            thePrePaymentCheckNumber = this.getPrePaymentCheckNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prePaymentCheckNumber", thePrePaymentCheckNumber), currentHashCode, thePrePaymentCheckNumber, (this.prePaymentCheckNumber!= null));
        }
        {
            String theWireTransferIdentifier;
            theWireTransferIdentifier = this.getWireTransferIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wireTransferIdentifier", theWireTransferIdentifier), currentHashCode, theWireTransferIdentifier, (this.wireTransferIdentifier!= null));
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
            AccountClassification theAccountClassification;
            theAccountClassification = this.getAccountClassification();
            strategy.appendField(locator, this, "accountClassification", buffer, theAccountClassification, (this.accountClassification!= null));
        }
        {
            String theAccountName;
            theAccountName = this.getAccountName();
            strategy.appendField(locator, this, "accountName", buffer, theAccountName, (this.accountName!= null));
        }
        {
            String theAccountNumber;
            theAccountNumber = this.getAccountNumber();
            strategy.appendField(locator, this, "accountNumber", buffer, theAccountNumber, (this.accountNumber!= null));
        }
        {
            CreditCard theCreditCard;
            theCreditCard = this.getCreditCard();
            strategy.appendField(locator, this, "creditCard", buffer, theCreditCard, (this.creditCard!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            PaymentMethod thePaymentMethod;
            thePaymentMethod = this.getPaymentMethod();
            strategy.appendField(locator, this, "paymentMethod", buffer, thePaymentMethod, (this.paymentMethod!= null));
        }
        {
            String thePrePaymentCheckNumber;
            thePrePaymentCheckNumber = this.getPrePaymentCheckNumber();
            strategy.appendField(locator, this, "prePaymentCheckNumber", buffer, thePrePaymentCheckNumber, (this.prePaymentCheckNumber!= null));
        }
        {
            String theWireTransferIdentifier;
            theWireTransferIdentifier = this.getWireTransferIdentifier();
            strategy.appendField(locator, this, "wireTransferIdentifier", buffer, theWireTransferIdentifier, (this.wireTransferIdentifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
