
package io.dscope.rosettanet.domain.shared.shared.v01_13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.datatype.v01_04.PercentAmount;
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
 * <p>Java class for RateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmount"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:RateType:xsd:codelist:01.01}RateType" minOccurs="0"/&gt;
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
@XmlType(name = "RateType", propOrder = {
    "percentAmount",
    "rateType"
})
public class RateType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "PercentAmount", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.04", type = PercentAmount.class)
    protected PercentAmount percentAmount;
    @XmlElementRef(name = "RateType", namespace = "urn:rosettanet:specification:domain:Shared:RateType:xsd:codelist:01.01", type = io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType.class, required = false)
    protected io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType rateType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the percentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PercentAmount }
     *     
     */
    public PercentAmount getPercentAmount() {
        return percentAmount;
    }

    /**
     * Sets the value of the percentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentAmount }
     *     
     */
    public void setPercentAmount(PercentAmount value) {
        this.percentAmount = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType }
     *     
     */
    public io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType }
     *     
     */
    public void setRateType(io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType value) {
        this.rateType = value;
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
        final RateType that = ((RateType) object);
        {
            PercentAmount lhsPercentAmount;
            lhsPercentAmount = this.getPercentAmount();
            PercentAmount rhsPercentAmount;
            rhsPercentAmount = that.getPercentAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentAmount", lhsPercentAmount), LocatorUtils.property(thatLocator, "percentAmount", rhsPercentAmount), lhsPercentAmount, rhsPercentAmount, (this.percentAmount!= null), (that.percentAmount!= null))) {
                return false;
            }
        }
        {
            io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType lhsRateType;
            lhsRateType = this.getRateType();
            io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType rhsRateType;
            rhsRateType = that.getRateType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rateType", lhsRateType), LocatorUtils.property(thatLocator, "rateType", rhsRateType), lhsRateType, rhsRateType, (this.rateType!= null), (that.rateType!= null))) {
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
            PercentAmount thePercentAmount;
            thePercentAmount = this.getPercentAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentAmount", thePercentAmount), currentHashCode, thePercentAmount, (this.percentAmount!= null));
        }
        {
            io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType theRateType;
            theRateType = this.getRateType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rateType", theRateType), currentHashCode, theRateType, (this.rateType!= null));
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
            PercentAmount thePercentAmount;
            thePercentAmount = this.getPercentAmount();
            strategy.appendField(locator, this, "percentAmount", buffer, thePercentAmount, (this.percentAmount!= null));
        }
        {
            io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType theRateType;
            theRateType = this.getRateType();
            strategy.appendField(locator, this, "rateType", buffer, theRateType, (this.rateType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
