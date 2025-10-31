
package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_03.LeadTimeClassificationCode;
import io.dscope.rosettanet.domain.shared.codelist.interval.v01_01.Interval;
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
 * <p>Java class for ProductLeadTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLeadTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:Interval:xsd:codelist:01.01}Interval"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}IsCallFactory" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03}LeadTimeClassificationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}LeadTimeQuantity" minOccurs="0"/&gt;
 *         &lt;element name="PeriodNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ProductLeadTimeType", propOrder = {
    "interval",
    "isCallFactory",
    "leadTimeClassificationCode",
    "leadTimeQuantity",
    "periodNumber"
})
public class ProductLeadTimeType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "Interval", namespace = "urn:rosettanet:specification:domain:Shared:Interval:xsd:codelist:01.01", type = Interval.class)
    protected Interval interval;
    @XmlElementRef(name = "IsCallFactory", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = IsCallFactory.class, required = false)
    protected IsCallFactory isCallFactory;
    @XmlElementRef(name = "LeadTimeClassificationCode", namespace = "urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03", type = LeadTimeClassificationCode.class, required = false)
    protected LeadTimeClassificationCode leadTimeClassificationCode;
    @XmlElementRef(name = "LeadTimeQuantity", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = LeadTimeQuantity.class, required = false)
    protected LeadTimeQuantity leadTimeQuantity;
    @XmlElement(name = "PeriodNumber", required = true)
    protected String periodNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link Interval }
     *     
     */
    public Interval getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interval }
     *     
     */
    public void setInterval(Interval value) {
        this.interval = value;
    }

    /**
     * Gets the value of the isCallFactory property.
     * 
     * @return
     *     possible object is
     *     {@link IsCallFactory }
     *     
     */
    public IsCallFactory getIsCallFactory() {
        return isCallFactory;
    }

    /**
     * Sets the value of the isCallFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsCallFactory }
     *     
     */
    public void setIsCallFactory(IsCallFactory value) {
        this.isCallFactory = value;
    }

    /**
     * Gets the value of the leadTimeClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link LeadTimeClassificationCode }
     *     
     */
    public LeadTimeClassificationCode getLeadTimeClassificationCode() {
        return leadTimeClassificationCode;
    }

    /**
     * Sets the value of the leadTimeClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadTimeClassificationCode }
     *     
     */
    public void setLeadTimeClassificationCode(LeadTimeClassificationCode value) {
        this.leadTimeClassificationCode = value;
    }

    /**
     * Gets the value of the leadTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link LeadTimeQuantity }
     *     
     */
    public LeadTimeQuantity getLeadTimeQuantity() {
        return leadTimeQuantity;
    }

    /**
     * Sets the value of the leadTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadTimeQuantity }
     *     
     */
    public void setLeadTimeQuantity(LeadTimeQuantity value) {
        this.leadTimeQuantity = value;
    }

    /**
     * Gets the value of the periodNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodNumber() {
        return periodNumber;
    }

    /**
     * Sets the value of the periodNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodNumber(String value) {
        this.periodNumber = value;
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
        final ProductLeadTimeType that = ((ProductLeadTimeType) object);
        {
            Interval lhsInterval;
            lhsInterval = this.getInterval();
            Interval rhsInterval;
            rhsInterval = that.getInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interval", lhsInterval), LocatorUtils.property(thatLocator, "interval", rhsInterval), lhsInterval, rhsInterval, (this.interval!= null), (that.interval!= null))) {
                return false;
            }
        }
        {
            IsCallFactory lhsIsCallFactory;
            lhsIsCallFactory = this.getIsCallFactory();
            IsCallFactory rhsIsCallFactory;
            rhsIsCallFactory = that.getIsCallFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isCallFactory", lhsIsCallFactory), LocatorUtils.property(thatLocator, "isCallFactory", rhsIsCallFactory), lhsIsCallFactory, rhsIsCallFactory, (this.isCallFactory!= null), (that.isCallFactory!= null))) {
                return false;
            }
        }
        {
            LeadTimeClassificationCode lhsLeadTimeClassificationCode;
            lhsLeadTimeClassificationCode = this.getLeadTimeClassificationCode();
            LeadTimeClassificationCode rhsLeadTimeClassificationCode;
            rhsLeadTimeClassificationCode = that.getLeadTimeClassificationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leadTimeClassificationCode", lhsLeadTimeClassificationCode), LocatorUtils.property(thatLocator, "leadTimeClassificationCode", rhsLeadTimeClassificationCode), lhsLeadTimeClassificationCode, rhsLeadTimeClassificationCode, (this.leadTimeClassificationCode!= null), (that.leadTimeClassificationCode!= null))) {
                return false;
            }
        }
        {
            LeadTimeQuantity lhsLeadTimeQuantity;
            lhsLeadTimeQuantity = this.getLeadTimeQuantity();
            LeadTimeQuantity rhsLeadTimeQuantity;
            rhsLeadTimeQuantity = that.getLeadTimeQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leadTimeQuantity", lhsLeadTimeQuantity), LocatorUtils.property(thatLocator, "leadTimeQuantity", rhsLeadTimeQuantity), lhsLeadTimeQuantity, rhsLeadTimeQuantity, (this.leadTimeQuantity!= null), (that.leadTimeQuantity!= null))) {
                return false;
            }
        }
        {
            String lhsPeriodNumber;
            lhsPeriodNumber = this.getPeriodNumber();
            String rhsPeriodNumber;
            rhsPeriodNumber = that.getPeriodNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "periodNumber", lhsPeriodNumber), LocatorUtils.property(thatLocator, "periodNumber", rhsPeriodNumber), lhsPeriodNumber, rhsPeriodNumber, (this.periodNumber!= null), (that.periodNumber!= null))) {
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
            Interval theInterval;
            theInterval = this.getInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "interval", theInterval), currentHashCode, theInterval, (this.interval!= null));
        }
        {
            IsCallFactory theIsCallFactory;
            theIsCallFactory = this.getIsCallFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isCallFactory", theIsCallFactory), currentHashCode, theIsCallFactory, (this.isCallFactory!= null));
        }
        {
            LeadTimeClassificationCode theLeadTimeClassificationCode;
            theLeadTimeClassificationCode = this.getLeadTimeClassificationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leadTimeClassificationCode", theLeadTimeClassificationCode), currentHashCode, theLeadTimeClassificationCode, (this.leadTimeClassificationCode!= null));
        }
        {
            LeadTimeQuantity theLeadTimeQuantity;
            theLeadTimeQuantity = this.getLeadTimeQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leadTimeQuantity", theLeadTimeQuantity), currentHashCode, theLeadTimeQuantity, (this.leadTimeQuantity!= null));
        }
        {
            String thePeriodNumber;
            thePeriodNumber = this.getPeriodNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "periodNumber", thePeriodNumber), currentHashCode, thePeriodNumber, (this.periodNumber!= null));
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
            Interval theInterval;
            theInterval = this.getInterval();
            strategy.appendField(locator, this, "interval", buffer, theInterval, (this.interval!= null));
        }
        {
            IsCallFactory theIsCallFactory;
            theIsCallFactory = this.getIsCallFactory();
            strategy.appendField(locator, this, "isCallFactory", buffer, theIsCallFactory, (this.isCallFactory!= null));
        }
        {
            LeadTimeClassificationCode theLeadTimeClassificationCode;
            theLeadTimeClassificationCode = this.getLeadTimeClassificationCode();
            strategy.appendField(locator, this, "leadTimeClassificationCode", buffer, theLeadTimeClassificationCode, (this.leadTimeClassificationCode!= null));
        }
        {
            LeadTimeQuantity theLeadTimeQuantity;
            theLeadTimeQuantity = this.getLeadTimeQuantity();
            strategy.appendField(locator, this, "leadTimeQuantity", buffer, theLeadTimeQuantity, (this.leadTimeQuantity!= null));
        }
        {
            String thePeriodNumber;
            thePeriodNumber = this.getPeriodNumber();
            strategy.appendField(locator, this, "periodNumber", buffer, thePeriodNumber, (this.periodNumber!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
