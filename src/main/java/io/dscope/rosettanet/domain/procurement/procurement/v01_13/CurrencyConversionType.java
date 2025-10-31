
package io.dscope.rosettanet.domain.procurement.procurement.v01_13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.universal.codelist.currency.v01_01.CurrencyType;
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
 * <p>Java class for CurrencyConversionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyConversionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="FromCurrency" type="{urn:rosettanet:specification:universal:Currency:xsd:codelist:01.01}CurrencyType"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ToCurrency" type="{urn:rosettanet:specification:universal:Currency:xsd:codelist:01.01}CurrencyType"/&gt;
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
@XmlType(name = "CurrencyConversionType", propOrder = {
    "date",
    "factor",
    "fromCurrency",
    "source",
    "toCurrency"
})
public class CurrencyConversionType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Factor")
    protected float factor;
    @XmlElement(name = "FromCurrency", required = true)
    protected CurrencyType fromCurrency;
    @XmlElement(name = "Source", required = true)
    protected String source;
    @XmlElement(name = "ToCurrency", required = true)
    protected CurrencyType toCurrency;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the factor property.
     * 
     */
    public float getFactor() {
        return factor;
    }

    /**
     * Sets the value of the factor property.
     * 
     */
    public void setFactor(float value) {
        this.factor = value;
    }

    /**
     * Gets the value of the fromCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getFromCurrency() {
        return fromCurrency;
    }

    /**
     * Sets the value of the fromCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setFromCurrency(CurrencyType value) {
        this.fromCurrency = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the toCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getToCurrency() {
        return toCurrency;
    }

    /**
     * Sets the value of the toCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setToCurrency(CurrencyType value) {
        this.toCurrency = value;
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
        final CurrencyConversionType that = ((CurrencyConversionType) object);
        {
            XMLGregorianCalendar lhsDate;
            lhsDate = this.getDate();
            XMLGregorianCalendar rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate, (this.date!= null), (that.date!= null))) {
                return false;
            }
        }
        {
            float lhsFactor;
            lhsFactor = this.getFactor();
            float rhsFactor;
            rhsFactor = that.getFactor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "factor", lhsFactor), LocatorUtils.property(thatLocator, "factor", rhsFactor), lhsFactor, rhsFactor, true, true)) {
                return false;
            }
        }
        {
            CurrencyType lhsFromCurrency;
            lhsFromCurrency = this.getFromCurrency();
            CurrencyType rhsFromCurrency;
            rhsFromCurrency = that.getFromCurrency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromCurrency", lhsFromCurrency), LocatorUtils.property(thatLocator, "fromCurrency", rhsFromCurrency), lhsFromCurrency, rhsFromCurrency, (this.fromCurrency!= null), (that.fromCurrency!= null))) {
                return false;
            }
        }
        {
            String lhsSource;
            lhsSource = this.getSource();
            String rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource, (this.source!= null), (that.source!= null))) {
                return false;
            }
        }
        {
            CurrencyType lhsToCurrency;
            lhsToCurrency = this.getToCurrency();
            CurrencyType rhsToCurrency;
            rhsToCurrency = that.getToCurrency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toCurrency", lhsToCurrency), LocatorUtils.property(thatLocator, "toCurrency", rhsToCurrency), lhsToCurrency, rhsToCurrency, (this.toCurrency!= null), (that.toCurrency!= null))) {
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
            XMLGregorianCalendar theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate, (this.date!= null));
        }
        {
            float theFactor;
            theFactor = this.getFactor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "factor", theFactor), currentHashCode, theFactor, true);
        }
        {
            CurrencyType theFromCurrency;
            theFromCurrency = this.getFromCurrency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromCurrency", theFromCurrency), currentHashCode, theFromCurrency, (this.fromCurrency!= null));
        }
        {
            String theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource, (this.source!= null));
        }
        {
            CurrencyType theToCurrency;
            theToCurrency = this.getToCurrency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toCurrency", theToCurrency), currentHashCode, theToCurrency, (this.toCurrency!= null));
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
            XMLGregorianCalendar theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate, (this.date!= null));
        }
        {
            float theFactor;
            theFactor = this.getFactor();
            strategy.appendField(locator, this, "factor", buffer, theFactor, true);
        }
        {
            CurrencyType theFromCurrency;
            theFromCurrency = this.getFromCurrency();
            strategy.appendField(locator, this, "fromCurrency", buffer, theFromCurrency, (this.fromCurrency!= null));
        }
        {
            String theSource;
            theSource = this.getSource();
            strategy.appendField(locator, this, "source", buffer, theSource, (this.source!= null));
        }
        {
            CurrencyType theToCurrency;
            theToCurrency = this.getToCurrency();
            strategy.appendField(locator, this, "toCurrency", buffer, theToCurrency, (this.toCurrency!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
