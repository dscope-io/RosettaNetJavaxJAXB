
package io.dscope.rosettanet.domain.shared.shared.v01_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.codelist.interval.v01_01.IntervalType;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriod;
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
 * <p>Java class for WarrantyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarrantyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{urn:rosettanet:specification:domain:Shared:Interval:xsd:codelist:01.01}IntervalType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01}WarrantyType" minOccurs="0"/&gt;
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
@XmlType(name = "WarrantyType", propOrder = {
    "datePeriod",
    "description",
    "duration",
    "warrantyType"
})
public class WarrantyType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DatePeriod", namespace = "urn:rosettanet:specification:universal:Dates:xsd:schema:01.03", type = DatePeriod.class, required = false)
    protected DatePeriod datePeriod;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Duration")
    protected IntervalType duration;
    @XmlElementRef(name = "WarrantyType", namespace = "urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01", type = io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType.class, required = false)
    protected io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType warrantyType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the datePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod }
     *     
     */
    public DatePeriod getDatePeriod() {
        return datePeriod;
    }

    /**
     * Sets the value of the datePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod }
     *     
     */
    public void setDatePeriod(DatePeriod value) {
        this.datePeriod = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalType }
     *     
     */
    public IntervalType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalType }
     *     
     */
    public void setDuration(IntervalType value) {
        this.duration = value;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType }
     *     
     */
    public io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType getWarrantyType() {
        return warrantyType;
    }

    /**
     * Sets the value of the warrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType }
     *     
     */
    public void setWarrantyType(io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType value) {
        this.warrantyType = value;
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
        final WarrantyType that = ((WarrantyType) object);
        {
            DatePeriod lhsDatePeriod;
            lhsDatePeriod = this.getDatePeriod();
            DatePeriod rhsDatePeriod;
            rhsDatePeriod = that.getDatePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datePeriod", lhsDatePeriod), LocatorUtils.property(thatLocator, "datePeriod", rhsDatePeriod), lhsDatePeriod, rhsDatePeriod, (this.datePeriod!= null), (that.datePeriod!= null))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            IntervalType lhsDuration;
            lhsDuration = this.getDuration();
            IntervalType rhsDuration;
            rhsDuration = that.getDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duration", lhsDuration), LocatorUtils.property(thatLocator, "duration", rhsDuration), lhsDuration, rhsDuration, (this.duration!= null), (that.duration!= null))) {
                return false;
            }
        }
        {
            io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType lhsWarrantyType;
            lhsWarrantyType = this.getWarrantyType();
            io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType rhsWarrantyType;
            rhsWarrantyType = that.getWarrantyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyType", lhsWarrantyType), LocatorUtils.property(thatLocator, "warrantyType", rhsWarrantyType), lhsWarrantyType, rhsWarrantyType, (this.warrantyType!= null), (that.warrantyType!= null))) {
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
            DatePeriod theDatePeriod;
            theDatePeriod = this.getDatePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datePeriod", theDatePeriod), currentHashCode, theDatePeriod, (this.datePeriod!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            IntervalType theDuration;
            theDuration = this.getDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duration", theDuration), currentHashCode, theDuration, (this.duration!= null));
        }
        {
            io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType theWarrantyType;
            theWarrantyType = this.getWarrantyType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyType", theWarrantyType), currentHashCode, theWarrantyType, (this.warrantyType!= null));
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
            DatePeriod theDatePeriod;
            theDatePeriod = this.getDatePeriod();
            strategy.appendField(locator, this, "datePeriod", buffer, theDatePeriod, (this.datePeriod!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            IntervalType theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration, (this.duration!= null));
        }
        {
            io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType theWarrantyType;
            theWarrantyType = this.getWarrantyType();
            strategy.appendField(locator, this, "warrantyType", buffer, theWarrantyType, (this.warrantyType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
