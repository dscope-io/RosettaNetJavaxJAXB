
package io.dscope.rosettanet.domain.logistics.logistics.v02_22;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.freightpaymentterms.v01_03.FreightPaymentTerms;
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
 * <p>Java class for FreightPaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightPaymentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreightCharges" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FreightPaymentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.03}FreightPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element name="TaxDutiesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FreightPaymentInformationType", propOrder = {
    "freightCharges",
    "freightPaymentAccount",
    "freightPaymentTerms",
    "taxDutiesAccount"
})
public class FreightPaymentInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "FreightCharges")
    protected FinancialAmountType freightCharges;
    @XmlElement(name = "FreightPaymentAccount")
    protected String freightPaymentAccount;
    @XmlElementRef(name = "FreightPaymentTerms", namespace = "urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.03", type = FreightPaymentTerms.class, required = false)
    protected FreightPaymentTerms freightPaymentTerms;
    @XmlElement(name = "TaxDutiesAccount")
    protected String taxDutiesAccount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the freightCharges property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getFreightCharges() {
        return freightCharges;
    }

    /**
     * Sets the value of the freightCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setFreightCharges(FinancialAmountType value) {
        this.freightCharges = value;
    }

    /**
     * Gets the value of the freightPaymentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightPaymentAccount() {
        return freightPaymentAccount;
    }

    /**
     * Sets the value of the freightPaymentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightPaymentAccount(String value) {
        this.freightPaymentAccount = value;
    }

    /**
     * Gets the value of the freightPaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link FreightPaymentTerms }
     *     
     */
    public FreightPaymentTerms getFreightPaymentTerms() {
        return freightPaymentTerms;
    }

    /**
     * Sets the value of the freightPaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightPaymentTerms }
     *     
     */
    public void setFreightPaymentTerms(FreightPaymentTerms value) {
        this.freightPaymentTerms = value;
    }

    /**
     * Gets the value of the taxDutiesAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDutiesAccount() {
        return taxDutiesAccount;
    }

    /**
     * Sets the value of the taxDutiesAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDutiesAccount(String value) {
        this.taxDutiesAccount = value;
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
        final FreightPaymentInformationType that = ((FreightPaymentInformationType) object);
        {
            FinancialAmountType lhsFreightCharges;
            lhsFreightCharges = this.getFreightCharges();
            FinancialAmountType rhsFreightCharges;
            rhsFreightCharges = that.getFreightCharges();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightCharges", lhsFreightCharges), LocatorUtils.property(thatLocator, "freightCharges", rhsFreightCharges), lhsFreightCharges, rhsFreightCharges, (this.freightCharges!= null), (that.freightCharges!= null))) {
                return false;
            }
        }
        {
            String lhsFreightPaymentAccount;
            lhsFreightPaymentAccount = this.getFreightPaymentAccount();
            String rhsFreightPaymentAccount;
            rhsFreightPaymentAccount = that.getFreightPaymentAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightPaymentAccount", lhsFreightPaymentAccount), LocatorUtils.property(thatLocator, "freightPaymentAccount", rhsFreightPaymentAccount), lhsFreightPaymentAccount, rhsFreightPaymentAccount, (this.freightPaymentAccount!= null), (that.freightPaymentAccount!= null))) {
                return false;
            }
        }
        {
            FreightPaymentTerms lhsFreightPaymentTerms;
            lhsFreightPaymentTerms = this.getFreightPaymentTerms();
            FreightPaymentTerms rhsFreightPaymentTerms;
            rhsFreightPaymentTerms = that.getFreightPaymentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightPaymentTerms", lhsFreightPaymentTerms), LocatorUtils.property(thatLocator, "freightPaymentTerms", rhsFreightPaymentTerms), lhsFreightPaymentTerms, rhsFreightPaymentTerms, (this.freightPaymentTerms!= null), (that.freightPaymentTerms!= null))) {
                return false;
            }
        }
        {
            String lhsTaxDutiesAccount;
            lhsTaxDutiesAccount = this.getTaxDutiesAccount();
            String rhsTaxDutiesAccount;
            rhsTaxDutiesAccount = that.getTaxDutiesAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxDutiesAccount", lhsTaxDutiesAccount), LocatorUtils.property(thatLocator, "taxDutiesAccount", rhsTaxDutiesAccount), lhsTaxDutiesAccount, rhsTaxDutiesAccount, (this.taxDutiesAccount!= null), (that.taxDutiesAccount!= null))) {
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
            FinancialAmountType theFreightCharges;
            theFreightCharges = this.getFreightCharges();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightCharges", theFreightCharges), currentHashCode, theFreightCharges, (this.freightCharges!= null));
        }
        {
            String theFreightPaymentAccount;
            theFreightPaymentAccount = this.getFreightPaymentAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightPaymentAccount", theFreightPaymentAccount), currentHashCode, theFreightPaymentAccount, (this.freightPaymentAccount!= null));
        }
        {
            FreightPaymentTerms theFreightPaymentTerms;
            theFreightPaymentTerms = this.getFreightPaymentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightPaymentTerms", theFreightPaymentTerms), currentHashCode, theFreightPaymentTerms, (this.freightPaymentTerms!= null));
        }
        {
            String theTaxDutiesAccount;
            theTaxDutiesAccount = this.getTaxDutiesAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxDutiesAccount", theTaxDutiesAccount), currentHashCode, theTaxDutiesAccount, (this.taxDutiesAccount!= null));
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
            FinancialAmountType theFreightCharges;
            theFreightCharges = this.getFreightCharges();
            strategy.appendField(locator, this, "freightCharges", buffer, theFreightCharges, (this.freightCharges!= null));
        }
        {
            String theFreightPaymentAccount;
            theFreightPaymentAccount = this.getFreightPaymentAccount();
            strategy.appendField(locator, this, "freightPaymentAccount", buffer, theFreightPaymentAccount, (this.freightPaymentAccount!= null));
        }
        {
            FreightPaymentTerms theFreightPaymentTerms;
            theFreightPaymentTerms = this.getFreightPaymentTerms();
            strategy.appendField(locator, this, "freightPaymentTerms", buffer, theFreightPaymentTerms, (this.freightPaymentTerms!= null));
        }
        {
            String theTaxDutiesAccount;
            theTaxDutiesAccount = this.getTaxDutiesAccount();
            strategy.appendField(locator, this, "taxDutiesAccount", buffer, theTaxDutiesAccount, (this.taxDutiesAccount!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
