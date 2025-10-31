
package io.dscope.rosettanet.interchange.quoteconfirmation.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_03.LeadTimeClassificationCode;
import io.dscope.rosettanet.domain.shared.shared.v01_17.DatePeriodAndDuration;
import io.dscope.rosettanet.interchange.codelist.leadtimecommencement.v01_01.LeadTimeCommencement;
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
 * <p>Java class for OrderLeadTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLeadTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}DatePeriodAndDuration"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03}LeadTimeClassificationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:LeadTimeCommencement:xsd:codelist:01.01}LeadTimeCommencement" minOccurs="0"/&gt;
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
@XmlType(name = "OrderLeadTimeType", propOrder = {
    "datePeriodAndDuration",
    "leadTimeClassificationCode",
    "leadTimeCommencement"
})
public class OrderLeadTimeType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DatePeriodAndDuration", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.17", type = DatePeriodAndDuration.class)
    protected DatePeriodAndDuration datePeriodAndDuration;
    @XmlElementRef(name = "LeadTimeClassificationCode", namespace = "urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03", type = LeadTimeClassificationCode.class, required = false)
    protected LeadTimeClassificationCode leadTimeClassificationCode;
    @XmlElementRef(name = "LeadTimeCommencement", namespace = "urn:rosettanet:specification:interchange:LeadTimeCommencement:xsd:codelist:01.01", type = LeadTimeCommencement.class, required = false)
    protected LeadTimeCommencement leadTimeCommencement;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the datePeriodAndDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDuration }
     *     
     */
    public DatePeriodAndDuration getDatePeriodAndDuration() {
        return datePeriodAndDuration;
    }

    /**
     * Sets the value of the datePeriodAndDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDuration }
     *     
     */
    public void setDatePeriodAndDuration(DatePeriodAndDuration value) {
        this.datePeriodAndDuration = value;
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
     * Gets the value of the leadTimeCommencement property.
     * 
     * @return
     *     possible object is
     *     {@link LeadTimeCommencement }
     *     
     */
    public LeadTimeCommencement getLeadTimeCommencement() {
        return leadTimeCommencement;
    }

    /**
     * Sets the value of the leadTimeCommencement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadTimeCommencement }
     *     
     */
    public void setLeadTimeCommencement(LeadTimeCommencement value) {
        this.leadTimeCommencement = value;
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
        final OrderLeadTimeType that = ((OrderLeadTimeType) object);
        {
            DatePeriodAndDuration lhsDatePeriodAndDuration;
            lhsDatePeriodAndDuration = this.getDatePeriodAndDuration();
            DatePeriodAndDuration rhsDatePeriodAndDuration;
            rhsDatePeriodAndDuration = that.getDatePeriodAndDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datePeriodAndDuration", lhsDatePeriodAndDuration), LocatorUtils.property(thatLocator, "datePeriodAndDuration", rhsDatePeriodAndDuration), lhsDatePeriodAndDuration, rhsDatePeriodAndDuration, (this.datePeriodAndDuration!= null), (that.datePeriodAndDuration!= null))) {
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
            LeadTimeCommencement lhsLeadTimeCommencement;
            lhsLeadTimeCommencement = this.getLeadTimeCommencement();
            LeadTimeCommencement rhsLeadTimeCommencement;
            rhsLeadTimeCommencement = that.getLeadTimeCommencement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leadTimeCommencement", lhsLeadTimeCommencement), LocatorUtils.property(thatLocator, "leadTimeCommencement", rhsLeadTimeCommencement), lhsLeadTimeCommencement, rhsLeadTimeCommencement, (this.leadTimeCommencement!= null), (that.leadTimeCommencement!= null))) {
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
            DatePeriodAndDuration theDatePeriodAndDuration;
            theDatePeriodAndDuration = this.getDatePeriodAndDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datePeriodAndDuration", theDatePeriodAndDuration), currentHashCode, theDatePeriodAndDuration, (this.datePeriodAndDuration!= null));
        }
        {
            LeadTimeClassificationCode theLeadTimeClassificationCode;
            theLeadTimeClassificationCode = this.getLeadTimeClassificationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leadTimeClassificationCode", theLeadTimeClassificationCode), currentHashCode, theLeadTimeClassificationCode, (this.leadTimeClassificationCode!= null));
        }
        {
            LeadTimeCommencement theLeadTimeCommencement;
            theLeadTimeCommencement = this.getLeadTimeCommencement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leadTimeCommencement", theLeadTimeCommencement), currentHashCode, theLeadTimeCommencement, (this.leadTimeCommencement!= null));
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
            DatePeriodAndDuration theDatePeriodAndDuration;
            theDatePeriodAndDuration = this.getDatePeriodAndDuration();
            strategy.appendField(locator, this, "datePeriodAndDuration", buffer, theDatePeriodAndDuration, (this.datePeriodAndDuration!= null));
        }
        {
            LeadTimeClassificationCode theLeadTimeClassificationCode;
            theLeadTimeClassificationCode = this.getLeadTimeClassificationCode();
            strategy.appendField(locator, this, "leadTimeClassificationCode", buffer, theLeadTimeClassificationCode, (this.leadTimeClassificationCode!= null));
        }
        {
            LeadTimeCommencement theLeadTimeCommencement;
            theLeadTimeCommencement = this.getLeadTimeCommencement();
            strategy.appendField(locator, this, "leadTimeCommencement", buffer, theLeadTimeCommencement, (this.leadTimeCommencement!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
