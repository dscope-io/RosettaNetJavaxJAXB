
package io.dscope.rosettanet.domain.logistics.logistics.v01_09;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.universal.codelist.country.v01_01.CountryType;
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
 * <p>Java class for ManufacturerProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturerProfileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.01}CountryType" minOccurs="0"/&gt;
 *         &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ProductSerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ManufacturerProfileType", propOrder = {
    "countryOfOrigin",
    "manufactureDate",
    "productSerialIdentifier"
})
public class ManufacturerProfileType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CountryOfOrigin")
    protected CountryType countryOfOrigin;
    @XmlElement(name = "ManufactureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar manufactureDate;
    @XmlElement(name = "ProductSerialIdentifier")
    protected String productSerialIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountryOfOrigin(CountryType value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the manufactureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Sets the value of the manufactureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setManufactureDate(XMLGregorianCalendar value) {
        this.manufactureDate = value;
    }

    /**
     * Gets the value of the productSerialIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSerialIdentifier() {
        return productSerialIdentifier;
    }

    /**
     * Sets the value of the productSerialIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSerialIdentifier(String value) {
        this.productSerialIdentifier = value;
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
        final ManufacturerProfileType that = ((ManufacturerProfileType) object);
        {
            CountryType lhsCountryOfOrigin;
            lhsCountryOfOrigin = this.getCountryOfOrigin();
            CountryType rhsCountryOfOrigin;
            rhsCountryOfOrigin = that.getCountryOfOrigin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryOfOrigin", lhsCountryOfOrigin), LocatorUtils.property(thatLocator, "countryOfOrigin", rhsCountryOfOrigin), lhsCountryOfOrigin, rhsCountryOfOrigin, (this.countryOfOrigin!= null), (that.countryOfOrigin!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsManufactureDate;
            lhsManufactureDate = this.getManufactureDate();
            XMLGregorianCalendar rhsManufactureDate;
            rhsManufactureDate = that.getManufactureDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufactureDate", lhsManufactureDate), LocatorUtils.property(thatLocator, "manufactureDate", rhsManufactureDate), lhsManufactureDate, rhsManufactureDate, (this.manufactureDate!= null), (that.manufactureDate!= null))) {
                return false;
            }
        }
        {
            String lhsProductSerialIdentifier;
            lhsProductSerialIdentifier = this.getProductSerialIdentifier();
            String rhsProductSerialIdentifier;
            rhsProductSerialIdentifier = that.getProductSerialIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productSerialIdentifier", lhsProductSerialIdentifier), LocatorUtils.property(thatLocator, "productSerialIdentifier", rhsProductSerialIdentifier), lhsProductSerialIdentifier, rhsProductSerialIdentifier, (this.productSerialIdentifier!= null), (that.productSerialIdentifier!= null))) {
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
            CountryType theCountryOfOrigin;
            theCountryOfOrigin = this.getCountryOfOrigin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countryOfOrigin", theCountryOfOrigin), currentHashCode, theCountryOfOrigin, (this.countryOfOrigin!= null));
        }
        {
            XMLGregorianCalendar theManufactureDate;
            theManufactureDate = this.getManufactureDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufactureDate", theManufactureDate), currentHashCode, theManufactureDate, (this.manufactureDate!= null));
        }
        {
            String theProductSerialIdentifier;
            theProductSerialIdentifier = this.getProductSerialIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productSerialIdentifier", theProductSerialIdentifier), currentHashCode, theProductSerialIdentifier, (this.productSerialIdentifier!= null));
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
            CountryType theCountryOfOrigin;
            theCountryOfOrigin = this.getCountryOfOrigin();
            strategy.appendField(locator, this, "countryOfOrigin", buffer, theCountryOfOrigin, (this.countryOfOrigin!= null));
        }
        {
            XMLGregorianCalendar theManufactureDate;
            theManufactureDate = this.getManufactureDate();
            strategy.appendField(locator, this, "manufactureDate", buffer, theManufactureDate, (this.manufactureDate!= null));
        }
        {
            String theProductSerialIdentifier;
            theProductSerialIdentifier = this.getProductSerialIdentifier();
            strategy.appendField(locator, this, "productSerialIdentifier", buffer, theProductSerialIdentifier, (this.productSerialIdentifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
