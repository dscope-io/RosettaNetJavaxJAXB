
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

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
import io.dscope.rosettanet.universal.monetaryexpression.v01_00.TaxAmount;
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
 * <p>Java class for TaxSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}CurrencyConversion" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}MonetaryAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0}TaxAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}TaxPhrase" minOccurs="0"/&gt;
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
@XmlType(name = "TaxSummaryType", propOrder = {
    "currencyConversion",
    "monetaryAmount",
    "taxAmount",
    "taxPhrase"
})
public class TaxSummaryType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "CurrencyConversion", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = CurrencyConversion.class, required = false)
    protected CurrencyConversion currencyConversion;
    @XmlElementRef(name = "MonetaryAmount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = MonetaryAmount.class, required = false)
    protected MonetaryAmount monetaryAmount;
    @XmlElementRef(name = "TaxAmount", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0", type = TaxAmount.class, required = false)
    protected List<TaxAmount> taxAmount;
    @XmlElementRef(name = "TaxPhrase", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = TaxPhrase.class, required = false)
    protected TaxPhrase taxPhrase;
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
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getMonetaryAmount() {
        return monetaryAmount;
    }

    /**
     * Sets the value of the monetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setMonetaryAmount(MonetaryAmount value) {
        this.monetaryAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAmount }
     * 
     * 
     */
    public List<TaxAmount> getTaxAmount() {
        if (taxAmount == null) {
            taxAmount = new ArrayList<TaxAmount>();
        }
        return this.taxAmount;
    }

    /**
     * Gets the value of the taxPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPhrase }
     *     
     */
    public TaxPhrase getTaxPhrase() {
        return taxPhrase;
    }

    /**
     * Sets the value of the taxPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPhrase }
     *     
     */
    public void setTaxPhrase(TaxPhrase value) {
        this.taxPhrase = value;
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
        final TaxSummaryType that = ((TaxSummaryType) object);
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
            MonetaryAmount lhsMonetaryAmount;
            lhsMonetaryAmount = this.getMonetaryAmount();
            MonetaryAmount rhsMonetaryAmount;
            rhsMonetaryAmount = that.getMonetaryAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monetaryAmount", lhsMonetaryAmount), LocatorUtils.property(thatLocator, "monetaryAmount", rhsMonetaryAmount), lhsMonetaryAmount, rhsMonetaryAmount, (this.monetaryAmount!= null), (that.monetaryAmount!= null))) {
                return false;
            }
        }
        {
            List<TaxAmount> lhsTaxAmount;
            lhsTaxAmount = (((this.taxAmount!= null)&&(!this.taxAmount.isEmpty()))?this.getTaxAmount():null);
            List<TaxAmount> rhsTaxAmount;
            rhsTaxAmount = (((that.taxAmount!= null)&&(!that.taxAmount.isEmpty()))?that.getTaxAmount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxAmount", lhsTaxAmount), LocatorUtils.property(thatLocator, "taxAmount", rhsTaxAmount), lhsTaxAmount, rhsTaxAmount, ((this.taxAmount!= null)&&(!this.taxAmount.isEmpty())), ((that.taxAmount!= null)&&(!that.taxAmount.isEmpty())))) {
                return false;
            }
        }
        {
            TaxPhrase lhsTaxPhrase;
            lhsTaxPhrase = this.getTaxPhrase();
            TaxPhrase rhsTaxPhrase;
            rhsTaxPhrase = that.getTaxPhrase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxPhrase", lhsTaxPhrase), LocatorUtils.property(thatLocator, "taxPhrase", rhsTaxPhrase), lhsTaxPhrase, rhsTaxPhrase, (this.taxPhrase!= null), (that.taxPhrase!= null))) {
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
            MonetaryAmount theMonetaryAmount;
            theMonetaryAmount = this.getMonetaryAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monetaryAmount", theMonetaryAmount), currentHashCode, theMonetaryAmount, (this.monetaryAmount!= null));
        }
        {
            List<TaxAmount> theTaxAmount;
            theTaxAmount = (((this.taxAmount!= null)&&(!this.taxAmount.isEmpty()))?this.getTaxAmount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxAmount", theTaxAmount), currentHashCode, theTaxAmount, ((this.taxAmount!= null)&&(!this.taxAmount.isEmpty())));
        }
        {
            TaxPhrase theTaxPhrase;
            theTaxPhrase = this.getTaxPhrase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxPhrase", theTaxPhrase), currentHashCode, theTaxPhrase, (this.taxPhrase!= null));
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
            MonetaryAmount theMonetaryAmount;
            theMonetaryAmount = this.getMonetaryAmount();
            strategy.appendField(locator, this, "monetaryAmount", buffer, theMonetaryAmount, (this.monetaryAmount!= null));
        }
        {
            List<TaxAmount> theTaxAmount;
            theTaxAmount = (((this.taxAmount!= null)&&(!this.taxAmount.isEmpty()))?this.getTaxAmount():null);
            strategy.appendField(locator, this, "taxAmount", buffer, theTaxAmount, ((this.taxAmount!= null)&&(!this.taxAmount.isEmpty())));
        }
        {
            TaxPhrase theTaxPhrase;
            theTaxPhrase = this.getTaxPhrase();
            strategy.appendField(locator, this, "taxPhrase", buffer, theTaxPhrase, (this.taxPhrase!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
