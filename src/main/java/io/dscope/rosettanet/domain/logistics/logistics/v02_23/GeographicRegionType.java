
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

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
import io.dscope.rosettanet.universal.codelist.country.v01_02.Country;
import io.dscope.rosettanet.universal.locations.v01_04.LocationType;
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
 * <p>Java class for GeographicRegionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicRegionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}Country" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RegionIdentifier" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}LocationType" minOccurs="0"/&gt;
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
@XmlType(name = "GeographicRegionType", propOrder = {
    "country",
    "regionIdentifier"
})
public class GeographicRegionType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "Country", namespace = "urn:rosettanet:specification:universal:Country:xsd:codelist:01.02", type = Country.class, required = false)
    protected List<Country> country;
    @XmlElement(name = "RegionIdentifier")
    protected LocationType regionIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Country }
     * 
     * 
     */
    public List<Country> getCountry() {
        if (country == null) {
            country = new ArrayList<Country>();
        }
        return this.country;
    }

    /**
     * Gets the value of the regionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getRegionIdentifier() {
        return regionIdentifier;
    }

    /**
     * Sets the value of the regionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setRegionIdentifier(LocationType value) {
        this.regionIdentifier = value;
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
        final GeographicRegionType that = ((GeographicRegionType) object);
        {
            List<Country> lhsCountry;
            lhsCountry = (((this.country!= null)&&(!this.country.isEmpty()))?this.getCountry():null);
            List<Country> rhsCountry;
            rhsCountry = (((that.country!= null)&&(!that.country.isEmpty()))?that.getCountry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry, ((this.country!= null)&&(!this.country.isEmpty())), ((that.country!= null)&&(!that.country.isEmpty())))) {
                return false;
            }
        }
        {
            LocationType lhsRegionIdentifier;
            lhsRegionIdentifier = this.getRegionIdentifier();
            LocationType rhsRegionIdentifier;
            rhsRegionIdentifier = that.getRegionIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionIdentifier", lhsRegionIdentifier), LocatorUtils.property(thatLocator, "regionIdentifier", rhsRegionIdentifier), lhsRegionIdentifier, rhsRegionIdentifier, (this.regionIdentifier!= null), (that.regionIdentifier!= null))) {
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
            List<Country> theCountry;
            theCountry = (((this.country!= null)&&(!this.country.isEmpty()))?this.getCountry():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "country", theCountry), currentHashCode, theCountry, ((this.country!= null)&&(!this.country.isEmpty())));
        }
        {
            LocationType theRegionIdentifier;
            theRegionIdentifier = this.getRegionIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regionIdentifier", theRegionIdentifier), currentHashCode, theRegionIdentifier, (this.regionIdentifier!= null));
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
            List<Country> theCountry;
            theCountry = (((this.country!= null)&&(!this.country.isEmpty()))?this.getCountry():null);
            strategy.appendField(locator, this, "country", buffer, theCountry, ((this.country!= null)&&(!this.country.isEmpty())));
        }
        {
            LocationType theRegionIdentifier;
            theRegionIdentifier = this.getRegionIdentifier();
            strategy.appendField(locator, this, "regionIdentifier", buffer, theRegionIdentifier, (this.regionIdentifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
