
package io.dscope.rosettanet.domain.procurement.procurement.v02_24;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.shared.shared.v01_17.MonetaryAmount;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.TaxJurisdiction;
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
 * <p>Java class for TaxInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmount"/&gt;
 *         &lt;element name="Rate" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}TaxJurisdiction" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TaxInformationType", propOrder = {
    "effectiveDate",
    "monetaryAmount",
    "rate",
    "taxJurisdiction"
})
@XmlSeeAlso({
    OtherTaxesType.class
})
public class TaxInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElementRef(name = "MonetaryAmount", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.17", type = MonetaryAmount.class)
    protected MonetaryAmount monetaryAmount;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElementRef(name = "TaxJurisdiction", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06", type = TaxJurisdiction.class, required = false)
    protected List<TaxJurisdiction> taxJurisdiction;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the taxJurisdiction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxJurisdiction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxJurisdiction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxJurisdiction }
     * 
     * 
     */
    public List<TaxJurisdiction> getTaxJurisdiction() {
        if (taxJurisdiction == null) {
            taxJurisdiction = new ArrayList<TaxJurisdiction>();
        }
        return this.taxJurisdiction;
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
        final TaxInformationType that = ((TaxInformationType) object);
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
            MonetaryAmount lhsMonetaryAmount;
            lhsMonetaryAmount = this.getMonetaryAmount();
            MonetaryAmount rhsMonetaryAmount;
            rhsMonetaryAmount = that.getMonetaryAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monetaryAmount", lhsMonetaryAmount), LocatorUtils.property(thatLocator, "monetaryAmount", rhsMonetaryAmount), lhsMonetaryAmount, rhsMonetaryAmount, (this.monetaryAmount!= null), (that.monetaryAmount!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsRate;
            lhsRate = this.getRate();
            BigDecimal rhsRate;
            rhsRate = that.getRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rate", lhsRate), LocatorUtils.property(thatLocator, "rate", rhsRate), lhsRate, rhsRate, (this.rate!= null), (that.rate!= null))) {
                return false;
            }
        }
        {
            List<TaxJurisdiction> lhsTaxJurisdiction;
            lhsTaxJurisdiction = (((this.taxJurisdiction!= null)&&(!this.taxJurisdiction.isEmpty()))?this.getTaxJurisdiction():null);
            List<TaxJurisdiction> rhsTaxJurisdiction;
            rhsTaxJurisdiction = (((that.taxJurisdiction!= null)&&(!that.taxJurisdiction.isEmpty()))?that.getTaxJurisdiction():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxJurisdiction", lhsTaxJurisdiction), LocatorUtils.property(thatLocator, "taxJurisdiction", rhsTaxJurisdiction), lhsTaxJurisdiction, rhsTaxJurisdiction, ((this.taxJurisdiction!= null)&&(!this.taxJurisdiction.isEmpty())), ((that.taxJurisdiction!= null)&&(!that.taxJurisdiction.isEmpty())))) {
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
            XMLGregorianCalendar theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveDate", theEffectiveDate), currentHashCode, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            MonetaryAmount theMonetaryAmount;
            theMonetaryAmount = this.getMonetaryAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monetaryAmount", theMonetaryAmount), currentHashCode, theMonetaryAmount, (this.monetaryAmount!= null));
        }
        {
            BigDecimal theRate;
            theRate = this.getRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rate", theRate), currentHashCode, theRate, (this.rate!= null));
        }
        {
            List<TaxJurisdiction> theTaxJurisdiction;
            theTaxJurisdiction = (((this.taxJurisdiction!= null)&&(!this.taxJurisdiction.isEmpty()))?this.getTaxJurisdiction():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxJurisdiction", theTaxJurisdiction), currentHashCode, theTaxJurisdiction, ((this.taxJurisdiction!= null)&&(!this.taxJurisdiction.isEmpty())));
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
            XMLGregorianCalendar theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            strategy.appendField(locator, this, "effectiveDate", buffer, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            MonetaryAmount theMonetaryAmount;
            theMonetaryAmount = this.getMonetaryAmount();
            strategy.appendField(locator, this, "monetaryAmount", buffer, theMonetaryAmount, (this.monetaryAmount!= null));
        }
        {
            BigDecimal theRate;
            theRate = this.getRate();
            strategy.appendField(locator, this, "rate", buffer, theRate, (this.rate!= null));
        }
        {
            List<TaxJurisdiction> theTaxJurisdiction;
            theTaxJurisdiction = (((this.taxJurisdiction!= null)&&(!this.taxJurisdiction.isEmpty()))?this.getTaxJurisdiction():null);
            strategy.appendField(locator, this, "taxJurisdiction", buffer, theTaxJurisdiction, ((this.taxJurisdiction!= null)&&(!this.taxJurisdiction.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
