
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.procurement.v02_22.CurrencyConversion;
import io.dscope.rosettanet.domain.shared.shared.v01_15.MonetaryAmount;
import io.dscope.rosettanet.domain.shared.shared.v01_15.Rate;
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
 * <p>Java class for PricingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.22}CurrencyConversion" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.15}MonetaryAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.15}Rate" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PricingInformationType", propOrder = {
    "currencyConversion",
    "monetaryAmount",
    "rate"
})
public class PricingInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "CurrencyConversion", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.22", type = CurrencyConversion.class, required = false)
    protected CurrencyConversion currencyConversion;
    @XmlElementRef(name = "MonetaryAmount", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.15", type = MonetaryAmount.class, required = false)
    protected List<MonetaryAmount> monetaryAmount;
    @XmlElementRef(name = "Rate", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.15", type = Rate.class, required = false)
    protected List<Rate> rate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the currencyConversion property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion }
     *     
     */
    public CurrencyConversion getCurrencyConversion() {
        return currencyConversion;
    }

    /**
     * Sets the value of the currencyConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion }
     *     
     */
    public void setCurrencyConversion(CurrencyConversion value) {
        this.currencyConversion = value;
    }

    /**
     * Gets the value of the monetaryAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryAmount }
     * 
     * 
     */
    public List<MonetaryAmount> getMonetaryAmount() {
        if (monetaryAmount == null) {
            monetaryAmount = new ArrayList<MonetaryAmount>();
        }
        return this.monetaryAmount;
    }

    /**
     * Gets the value of the rate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rate }
     * 
     * 
     */
    public List<Rate> getRate() {
        if (rate == null) {
            rate = new ArrayList<Rate>();
        }
        return this.rate;
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
        final PricingInformationType that = ((PricingInformationType) object);
        {
            CurrencyConversion lhsCurrencyConversion;
            lhsCurrencyConversion = this.getCurrencyConversion();
            CurrencyConversion rhsCurrencyConversion;
            rhsCurrencyConversion = that.getCurrencyConversion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currencyConversion", lhsCurrencyConversion), LocatorUtils.property(thatLocator, "currencyConversion", rhsCurrencyConversion), lhsCurrencyConversion, rhsCurrencyConversion, (this.currencyConversion!= null), (that.currencyConversion!= null))) {
                return false;
            }
        }
        {
            List<MonetaryAmount> lhsMonetaryAmount;
            lhsMonetaryAmount = (((this.monetaryAmount!= null)&&(!this.monetaryAmount.isEmpty()))?this.getMonetaryAmount():null);
            List<MonetaryAmount> rhsMonetaryAmount;
            rhsMonetaryAmount = (((that.monetaryAmount!= null)&&(!that.monetaryAmount.isEmpty()))?that.getMonetaryAmount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monetaryAmount", lhsMonetaryAmount), LocatorUtils.property(thatLocator, "monetaryAmount", rhsMonetaryAmount), lhsMonetaryAmount, rhsMonetaryAmount, ((this.monetaryAmount!= null)&&(!this.monetaryAmount.isEmpty())), ((that.monetaryAmount!= null)&&(!that.monetaryAmount.isEmpty())))) {
                return false;
            }
        }
        {
            List<Rate> lhsRate;
            lhsRate = (((this.rate!= null)&&(!this.rate.isEmpty()))?this.getRate():null);
            List<Rate> rhsRate;
            rhsRate = (((that.rate!= null)&&(!that.rate.isEmpty()))?that.getRate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rate", lhsRate), LocatorUtils.property(thatLocator, "rate", rhsRate), lhsRate, rhsRate, ((this.rate!= null)&&(!this.rate.isEmpty())), ((that.rate!= null)&&(!that.rate.isEmpty())))) {
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
            CurrencyConversion theCurrencyConversion;
            theCurrencyConversion = this.getCurrencyConversion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currencyConversion", theCurrencyConversion), currentHashCode, theCurrencyConversion, (this.currencyConversion!= null));
        }
        {
            List<MonetaryAmount> theMonetaryAmount;
            theMonetaryAmount = (((this.monetaryAmount!= null)&&(!this.monetaryAmount.isEmpty()))?this.getMonetaryAmount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monetaryAmount", theMonetaryAmount), currentHashCode, theMonetaryAmount, ((this.monetaryAmount!= null)&&(!this.monetaryAmount.isEmpty())));
        }
        {
            List<Rate> theRate;
            theRate = (((this.rate!= null)&&(!this.rate.isEmpty()))?this.getRate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rate", theRate), currentHashCode, theRate, ((this.rate!= null)&&(!this.rate.isEmpty())));
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
            CurrencyConversion theCurrencyConversion;
            theCurrencyConversion = this.getCurrencyConversion();
            strategy.appendField(locator, this, "currencyConversion", buffer, theCurrencyConversion, (this.currencyConversion!= null));
        }
        {
            List<MonetaryAmount> theMonetaryAmount;
            theMonetaryAmount = (((this.monetaryAmount!= null)&&(!this.monetaryAmount.isEmpty()))?this.getMonetaryAmount():null);
            strategy.appendField(locator, this, "monetaryAmount", buffer, theMonetaryAmount, ((this.monetaryAmount!= null)&&(!this.monetaryAmount.isEmpty())));
        }
        {
            List<Rate> theRate;
            theRate = (((this.rate!= null)&&(!this.rate.isEmpty()))?this.getRate():null);
            strategy.appendField(locator, this, "rate", buffer, theRate, ((this.rate!= null)&&(!this.rate.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
