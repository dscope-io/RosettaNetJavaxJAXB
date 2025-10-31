
package io.dscope.rosettanet.domain.procurement.procurement.v01_22;

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
 *         &lt;element name="CityTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22}TaxInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22}CurrencyConversion" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22}MonetaryAmount" minOccurs="0"/&gt;
 *         &lt;element name="NationalTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22}TaxInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RegionalTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22}TaxInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22}TaxPhrase" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "cityTax",
    "currencyConversion",
    "monetaryAmount",
    "nationalTax",
    "regionalTax",
    "taxPhrase"
})
public class TaxSummaryType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CityTax")
    protected List<TaxInformationType> cityTax;
    @XmlElementRef(name = "CurrencyConversion", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", type = CurrencyConversion.class, required = false)
    protected CurrencyConversion currencyConversion;
    @XmlElementRef(name = "MonetaryAmount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", type = MonetaryAmount.class, required = false)
    protected MonetaryAmount monetaryAmount;
    @XmlElement(name = "NationalTax")
    protected List<TaxInformationType> nationalTax;
    @XmlElement(name = "RegionalTax")
    protected List<TaxInformationType> regionalTax;
    @XmlElementRef(name = "TaxPhrase", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", type = TaxPhrase.class, required = false)
    protected List<TaxPhrase> taxPhrase;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the cityTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxInformationType }
     * 
     * 
     */
    public List<TaxInformationType> getCityTax() {
        if (cityTax == null) {
            cityTax = new ArrayList<TaxInformationType>();
        }
        return this.cityTax;
    }

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
     * Gets the value of the nationalTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxInformationType }
     * 
     * 
     */
    public List<TaxInformationType> getNationalTax() {
        if (nationalTax == null) {
            nationalTax = new ArrayList<TaxInformationType>();
        }
        return this.nationalTax;
    }

    /**
     * Gets the value of the regionalTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionalTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionalTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxInformationType }
     * 
     * 
     */
    public List<TaxInformationType> getRegionalTax() {
        if (regionalTax == null) {
            regionalTax = new ArrayList<TaxInformationType>();
        }
        return this.regionalTax;
    }

    /**
     * Gets the value of the taxPhrase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxPhrase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxPhrase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxPhrase }
     * 
     * 
     */
    public List<TaxPhrase> getTaxPhrase() {
        if (taxPhrase == null) {
            taxPhrase = new ArrayList<TaxPhrase>();
        }
        return this.taxPhrase;
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
            List<TaxInformationType> lhsCityTax;
            lhsCityTax = (((this.cityTax!= null)&&(!this.cityTax.isEmpty()))?this.getCityTax():null);
            List<TaxInformationType> rhsCityTax;
            rhsCityTax = (((that.cityTax!= null)&&(!that.cityTax.isEmpty()))?that.getCityTax():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cityTax", lhsCityTax), LocatorUtils.property(thatLocator, "cityTax", rhsCityTax), lhsCityTax, rhsCityTax, ((this.cityTax!= null)&&(!this.cityTax.isEmpty())), ((that.cityTax!= null)&&(!that.cityTax.isEmpty())))) {
                return false;
            }
        }
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
            List<TaxInformationType> lhsNationalTax;
            lhsNationalTax = (((this.nationalTax!= null)&&(!this.nationalTax.isEmpty()))?this.getNationalTax():null);
            List<TaxInformationType> rhsNationalTax;
            rhsNationalTax = (((that.nationalTax!= null)&&(!that.nationalTax.isEmpty()))?that.getNationalTax():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nationalTax", lhsNationalTax), LocatorUtils.property(thatLocator, "nationalTax", rhsNationalTax), lhsNationalTax, rhsNationalTax, ((this.nationalTax!= null)&&(!this.nationalTax.isEmpty())), ((that.nationalTax!= null)&&(!that.nationalTax.isEmpty())))) {
                return false;
            }
        }
        {
            List<TaxInformationType> lhsRegionalTax;
            lhsRegionalTax = (((this.regionalTax!= null)&&(!this.regionalTax.isEmpty()))?this.getRegionalTax():null);
            List<TaxInformationType> rhsRegionalTax;
            rhsRegionalTax = (((that.regionalTax!= null)&&(!that.regionalTax.isEmpty()))?that.getRegionalTax():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionalTax", lhsRegionalTax), LocatorUtils.property(thatLocator, "regionalTax", rhsRegionalTax), lhsRegionalTax, rhsRegionalTax, ((this.regionalTax!= null)&&(!this.regionalTax.isEmpty())), ((that.regionalTax!= null)&&(!that.regionalTax.isEmpty())))) {
                return false;
            }
        }
        {
            List<TaxPhrase> lhsTaxPhrase;
            lhsTaxPhrase = (((this.taxPhrase!= null)&&(!this.taxPhrase.isEmpty()))?this.getTaxPhrase():null);
            List<TaxPhrase> rhsTaxPhrase;
            rhsTaxPhrase = (((that.taxPhrase!= null)&&(!that.taxPhrase.isEmpty()))?that.getTaxPhrase():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxPhrase", lhsTaxPhrase), LocatorUtils.property(thatLocator, "taxPhrase", rhsTaxPhrase), lhsTaxPhrase, rhsTaxPhrase, ((this.taxPhrase!= null)&&(!this.taxPhrase.isEmpty())), ((that.taxPhrase!= null)&&(!that.taxPhrase.isEmpty())))) {
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
            List<TaxInformationType> theCityTax;
            theCityTax = (((this.cityTax!= null)&&(!this.cityTax.isEmpty()))?this.getCityTax():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cityTax", theCityTax), currentHashCode, theCityTax, ((this.cityTax!= null)&&(!this.cityTax.isEmpty())));
        }
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
            List<TaxInformationType> theNationalTax;
            theNationalTax = (((this.nationalTax!= null)&&(!this.nationalTax.isEmpty()))?this.getNationalTax():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nationalTax", theNationalTax), currentHashCode, theNationalTax, ((this.nationalTax!= null)&&(!this.nationalTax.isEmpty())));
        }
        {
            List<TaxInformationType> theRegionalTax;
            theRegionalTax = (((this.regionalTax!= null)&&(!this.regionalTax.isEmpty()))?this.getRegionalTax():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regionalTax", theRegionalTax), currentHashCode, theRegionalTax, ((this.regionalTax!= null)&&(!this.regionalTax.isEmpty())));
        }
        {
            List<TaxPhrase> theTaxPhrase;
            theTaxPhrase = (((this.taxPhrase!= null)&&(!this.taxPhrase.isEmpty()))?this.getTaxPhrase():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxPhrase", theTaxPhrase), currentHashCode, theTaxPhrase, ((this.taxPhrase!= null)&&(!this.taxPhrase.isEmpty())));
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
            List<TaxInformationType> theCityTax;
            theCityTax = (((this.cityTax!= null)&&(!this.cityTax.isEmpty()))?this.getCityTax():null);
            strategy.appendField(locator, this, "cityTax", buffer, theCityTax, ((this.cityTax!= null)&&(!this.cityTax.isEmpty())));
        }
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
            List<TaxInformationType> theNationalTax;
            theNationalTax = (((this.nationalTax!= null)&&(!this.nationalTax.isEmpty()))?this.getNationalTax():null);
            strategy.appendField(locator, this, "nationalTax", buffer, theNationalTax, ((this.nationalTax!= null)&&(!this.nationalTax.isEmpty())));
        }
        {
            List<TaxInformationType> theRegionalTax;
            theRegionalTax = (((this.regionalTax!= null)&&(!this.regionalTax.isEmpty()))?this.getRegionalTax():null);
            strategy.appendField(locator, this, "regionalTax", buffer, theRegionalTax, ((this.regionalTax!= null)&&(!this.regionalTax.isEmpty())));
        }
        {
            List<TaxPhrase> theTaxPhrase;
            theTaxPhrase = (((this.taxPhrase!= null)&&(!this.taxPhrase.isEmpty()))?this.getTaxPhrase():null);
            strategy.appendField(locator, this, "taxPhrase", buffer, theTaxPhrase, ((this.taxPhrase!= null)&&(!this.taxPhrase.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
