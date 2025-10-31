
package io.dscope.rosettanet.universal.locations.v01_04;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.codelist.country.v01_02.Country;
import io.dscope.rosettanet.universal.codelist.countrysubdivision.v01_02.CountrySubdivision;
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
 * <p>Java class for PhysicalAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}Country"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:CountrySubdivision:xsd:codelist:01.02}CountrySubdivision" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostOfficeBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PhysicalAddressType", propOrder = {
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "addressLine5",
    "cityName",
    "country",
    "countrySubdivision",
    "postalCode",
    "postOfficeBox"
})
public class PhysicalAddressType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AddressLine1", required = true)
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "AddressLine3")
    protected String addressLine3;
    @XmlElement(name = "AddressLine4")
    protected String addressLine4;
    @XmlElement(name = "AddressLine5")
    protected String addressLine5;
    @XmlElement(name = "CityName", required = true)
    protected String cityName;
    @XmlElementRef(name = "Country", namespace = "urn:rosettanet:specification:universal:Country:xsd:codelist:01.02", type = Country.class)
    protected Country country;
    @XmlElementRef(name = "CountrySubdivision", namespace = "urn:rosettanet:specification:universal:CountrySubdivision:xsd:codelist:01.02", type = CountrySubdivision.class, required = false)
    protected CountrySubdivision countrySubdivision;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PostOfficeBox")
    protected String postOfficeBox;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the addressLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine5() {
        return addressLine5;
    }

    /**
     * Sets the value of the addressLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine5(String value) {
        this.addressLine5 = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the countrySubdivision property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubdivision }
     *     
     */
    public CountrySubdivision getCountrySubdivision() {
        return countrySubdivision;
    }

    /**
     * Sets the value of the countrySubdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubdivision }
     *     
     */
    public void setCountrySubdivision(CountrySubdivision value) {
        this.countrySubdivision = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postOfficeBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOfficeBox() {
        return postOfficeBox;
    }

    /**
     * Sets the value of the postOfficeBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOfficeBox(String value) {
        this.postOfficeBox = value;
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
        final PhysicalAddressType that = ((PhysicalAddressType) object);
        {
            String lhsAddressLine1;
            lhsAddressLine1 = this.getAddressLine1();
            String rhsAddressLine1;
            rhsAddressLine1 = that.getAddressLine1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressLine1", lhsAddressLine1), LocatorUtils.property(thatLocator, "addressLine1", rhsAddressLine1), lhsAddressLine1, rhsAddressLine1, (this.addressLine1 != null), (that.addressLine1 != null))) {
                return false;
            }
        }
        {
            String lhsAddressLine2;
            lhsAddressLine2 = this.getAddressLine2();
            String rhsAddressLine2;
            rhsAddressLine2 = that.getAddressLine2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressLine2", lhsAddressLine2), LocatorUtils.property(thatLocator, "addressLine2", rhsAddressLine2), lhsAddressLine2, rhsAddressLine2, (this.addressLine2 != null), (that.addressLine2 != null))) {
                return false;
            }
        }
        {
            String lhsAddressLine3;
            lhsAddressLine3 = this.getAddressLine3();
            String rhsAddressLine3;
            rhsAddressLine3 = that.getAddressLine3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressLine3", lhsAddressLine3), LocatorUtils.property(thatLocator, "addressLine3", rhsAddressLine3), lhsAddressLine3, rhsAddressLine3, (this.addressLine3 != null), (that.addressLine3 != null))) {
                return false;
            }
        }
        {
            String lhsAddressLine4;
            lhsAddressLine4 = this.getAddressLine4();
            String rhsAddressLine4;
            rhsAddressLine4 = that.getAddressLine4();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressLine4", lhsAddressLine4), LocatorUtils.property(thatLocator, "addressLine4", rhsAddressLine4), lhsAddressLine4, rhsAddressLine4, (this.addressLine4 != null), (that.addressLine4 != null))) {
                return false;
            }
        }
        {
            String lhsAddressLine5;
            lhsAddressLine5 = this.getAddressLine5();
            String rhsAddressLine5;
            rhsAddressLine5 = that.getAddressLine5();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressLine5", lhsAddressLine5), LocatorUtils.property(thatLocator, "addressLine5", rhsAddressLine5), lhsAddressLine5, rhsAddressLine5, (this.addressLine5 != null), (that.addressLine5 != null))) {
                return false;
            }
        }
        {
            String lhsCityName;
            lhsCityName = this.getCityName();
            String rhsCityName;
            rhsCityName = that.getCityName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cityName", lhsCityName), LocatorUtils.property(thatLocator, "cityName", rhsCityName), lhsCityName, rhsCityName, (this.cityName!= null), (that.cityName!= null))) {
                return false;
            }
        }
        {
            Country lhsCountry;
            lhsCountry = this.getCountry();
            Country rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry, (this.country!= null), (that.country!= null))) {
                return false;
            }
        }
        {
            CountrySubdivision lhsCountrySubdivision;
            lhsCountrySubdivision = this.getCountrySubdivision();
            CountrySubdivision rhsCountrySubdivision;
            rhsCountrySubdivision = that.getCountrySubdivision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countrySubdivision", lhsCountrySubdivision), LocatorUtils.property(thatLocator, "countrySubdivision", rhsCountrySubdivision), lhsCountrySubdivision, rhsCountrySubdivision, (this.countrySubdivision!= null), (that.countrySubdivision!= null))) {
                return false;
            }
        }
        {
            String lhsPostalCode;
            lhsPostalCode = this.getPostalCode();
            String rhsPostalCode;
            rhsPostalCode = that.getPostalCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postalCode", lhsPostalCode), LocatorUtils.property(thatLocator, "postalCode", rhsPostalCode), lhsPostalCode, rhsPostalCode, (this.postalCode!= null), (that.postalCode!= null))) {
                return false;
            }
        }
        {
            String lhsPostOfficeBox;
            lhsPostOfficeBox = this.getPostOfficeBox();
            String rhsPostOfficeBox;
            rhsPostOfficeBox = that.getPostOfficeBox();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postOfficeBox", lhsPostOfficeBox), LocatorUtils.property(thatLocator, "postOfficeBox", rhsPostOfficeBox), lhsPostOfficeBox, rhsPostOfficeBox, (this.postOfficeBox!= null), (that.postOfficeBox!= null))) {
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
            String theAddressLine1;
            theAddressLine1 = this.getAddressLine1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressLine1", theAddressLine1), currentHashCode, theAddressLine1, (this.addressLine1 != null));
        }
        {
            String theAddressLine2;
            theAddressLine2 = this.getAddressLine2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressLine2", theAddressLine2), currentHashCode, theAddressLine2, (this.addressLine2 != null));
        }
        {
            String theAddressLine3;
            theAddressLine3 = this.getAddressLine3();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressLine3", theAddressLine3), currentHashCode, theAddressLine3, (this.addressLine3 != null));
        }
        {
            String theAddressLine4;
            theAddressLine4 = this.getAddressLine4();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressLine4", theAddressLine4), currentHashCode, theAddressLine4, (this.addressLine4 != null));
        }
        {
            String theAddressLine5;
            theAddressLine5 = this.getAddressLine5();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressLine5", theAddressLine5), currentHashCode, theAddressLine5, (this.addressLine5 != null));
        }
        {
            String theCityName;
            theCityName = this.getCityName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cityName", theCityName), currentHashCode, theCityName, (this.cityName!= null));
        }
        {
            Country theCountry;
            theCountry = this.getCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "country", theCountry), currentHashCode, theCountry, (this.country!= null));
        }
        {
            CountrySubdivision theCountrySubdivision;
            theCountrySubdivision = this.getCountrySubdivision();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countrySubdivision", theCountrySubdivision), currentHashCode, theCountrySubdivision, (this.countrySubdivision!= null));
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postalCode", thePostalCode), currentHashCode, thePostalCode, (this.postalCode!= null));
        }
        {
            String thePostOfficeBox;
            thePostOfficeBox = this.getPostOfficeBox();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postOfficeBox", thePostOfficeBox), currentHashCode, thePostOfficeBox, (this.postOfficeBox!= null));
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
            String theAddressLine1;
            theAddressLine1 = this.getAddressLine1();
            strategy.appendField(locator, this, "addressLine1", buffer, theAddressLine1, (this.addressLine1 != null));
        }
        {
            String theAddressLine2;
            theAddressLine2 = this.getAddressLine2();
            strategy.appendField(locator, this, "addressLine2", buffer, theAddressLine2, (this.addressLine2 != null));
        }
        {
            String theAddressLine3;
            theAddressLine3 = this.getAddressLine3();
            strategy.appendField(locator, this, "addressLine3", buffer, theAddressLine3, (this.addressLine3 != null));
        }
        {
            String theAddressLine4;
            theAddressLine4 = this.getAddressLine4();
            strategy.appendField(locator, this, "addressLine4", buffer, theAddressLine4, (this.addressLine4 != null));
        }
        {
            String theAddressLine5;
            theAddressLine5 = this.getAddressLine5();
            strategy.appendField(locator, this, "addressLine5", buffer, theAddressLine5, (this.addressLine5 != null));
        }
        {
            String theCityName;
            theCityName = this.getCityName();
            strategy.appendField(locator, this, "cityName", buffer, theCityName, (this.cityName!= null));
        }
        {
            Country theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry, (this.country!= null));
        }
        {
            CountrySubdivision theCountrySubdivision;
            theCountrySubdivision = this.getCountrySubdivision();
            strategy.appendField(locator, this, "countrySubdivision", buffer, theCountrySubdivision, (this.countrySubdivision!= null));
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            strategy.appendField(locator, this, "postalCode", buffer, thePostalCode, (this.postalCode!= null));
        }
        {
            String thePostOfficeBox;
            thePostOfficeBox = this.getPostOfficeBox();
            strategy.appendField(locator, this, "postOfficeBox", buffer, thePostOfficeBox, (this.postOfficeBox!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
