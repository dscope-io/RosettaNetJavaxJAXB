
package io.dscope.rosettanet.domain.logistics.logistics.v02_05;

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
 * <p>Java class for CustomsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}Country"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:CustomsType:xsd:codelist:01.03}CustomsType"/&gt;
 *         &lt;element name="EntryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CustomsType", propOrder = {
    "country",
    "customsType",
    "entryNumber",
    "identifier"
})
public class CustomsType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "Country", namespace = "urn:rosettanet:specification:universal:Country:xsd:codelist:01.02", type = Country.class)
    protected Country country;
    @XmlElementRef(name = "CustomsType", namespace = "urn:rosettanet:specification:domain:Logistics:CustomsType:xsd:codelist:01.03", type = io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_03.CustomsType.class)
    protected io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_03.CustomsType customsType;
    @XmlElement(name = "EntryNumber")
    protected String entryNumber;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the customsType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_03.CustomsType }
     *     
     */
    public io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_03.CustomsType getCustomsType() {
        return customsType;
    }

    /**
     * Sets the value of the customsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_03.CustomsType }
     *     
     */
    public void setCustomsType(io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_03.CustomsType value) {
        this.customsType = value;
    }

    /**
     * Gets the value of the entryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryNumber() {
        return entryNumber;
    }

    /**
     * Sets the value of the entryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryNumber(String value) {
        this.entryNumber = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
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
        final CustomsType that = ((CustomsType) object);
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
            io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_03.CustomsType lhsCustomsType;
            lhsCustomsType = this.getCustomsType();
            io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_03.CustomsType rhsCustomsType;
            rhsCustomsType = that.getCustomsType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customsType", lhsCustomsType), LocatorUtils.property(thatLocator, "customsType", rhsCustomsType), lhsCustomsType, rhsCustomsType, (this.customsType!= null), (that.customsType!= null))) {
                return false;
            }
        }
        {
            String lhsEntryNumber;
            lhsEntryNumber = this.getEntryNumber();
            String rhsEntryNumber;
            rhsEntryNumber = that.getEntryNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entryNumber", lhsEntryNumber), LocatorUtils.property(thatLocator, "entryNumber", rhsEntryNumber), lhsEntryNumber, rhsEntryNumber, (this.entryNumber!= null), (that.entryNumber!= null))) {
                return false;
            }
        }
        {
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
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
            Country theCountry;
            theCountry = this.getCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "country", theCountry), currentHashCode, theCountry, (this.country!= null));
        }
        {
            io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_03.CustomsType theCustomsType;
            theCustomsType = this.getCustomsType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customsType", theCustomsType), currentHashCode, theCustomsType, (this.customsType!= null));
        }
        {
            String theEntryNumber;
            theEntryNumber = this.getEntryNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entryNumber", theEntryNumber), currentHashCode, theEntryNumber, (this.entryNumber!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
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
            Country theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry, (this.country!= null));
        }
        {
            io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_03.CustomsType theCustomsType;
            theCustomsType = this.getCustomsType();
            strategy.appendField(locator, this, "customsType", buffer, theCustomsType, (this.customsType!= null));
        }
        {
            String theEntryNumber;
            theEntryNumber = this.getEntryNumber();
            strategy.appendField(locator, this, "entryNumber", buffer, theEntryNumber, (this.entryNumber!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
