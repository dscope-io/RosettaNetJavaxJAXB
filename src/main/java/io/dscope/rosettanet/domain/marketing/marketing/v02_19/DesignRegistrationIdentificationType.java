
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.marketing.codelist.designregistrationnotification.v01_02.DesignRegistrationNotification;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
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
 * <p>Java class for DesignRegistrationIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignRegistrationIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesignRegistrationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:DesignRegistrationNotification:xsd:codelist:01.02}DesignRegistrationNotification"/&gt;
 *         &lt;element name="DesignRegistrationRevision" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EffectiveRegistrationDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
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
@XmlType(name = "DesignRegistrationIdentificationType", propOrder = {
    "designRegistrationIdentifier",
    "designRegistrationNotification",
    "designRegistrationRevision",
    "effectiveRegistrationDate"
})
public class DesignRegistrationIdentificationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DesignRegistrationIdentifier")
    protected String designRegistrationIdentifier;
    @XmlElementRef(name = "DesignRegistrationNotification", namespace = "urn:rosettanet:specification:domain:Marketing:DesignRegistrationNotification:xsd:codelist:01.02", type = DesignRegistrationNotification.class)
    protected DesignRegistrationNotification designRegistrationNotification;
    @XmlElement(name = "DesignRegistrationRevision", required = true)
    protected String designRegistrationRevision;
    @XmlElement(name = "EffectiveRegistrationDate")
    protected DatePeriodType effectiveRegistrationDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designRegistrationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignRegistrationIdentifier() {
        return designRegistrationIdentifier;
    }

    /**
     * Sets the value of the designRegistrationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignRegistrationIdentifier(String value) {
        this.designRegistrationIdentifier = value;
    }

    /**
     * Gets the value of the designRegistrationNotification property.
     * 
     * @return
     *     possible object is
     *     {@link DesignRegistrationNotification }
     *     
     */
    public DesignRegistrationNotification getDesignRegistrationNotification() {
        return designRegistrationNotification;
    }

    /**
     * Sets the value of the designRegistrationNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignRegistrationNotification }
     *     
     */
    public void setDesignRegistrationNotification(DesignRegistrationNotification value) {
        this.designRegistrationNotification = value;
    }

    /**
     * Gets the value of the designRegistrationRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignRegistrationRevision() {
        return designRegistrationRevision;
    }

    /**
     * Sets the value of the designRegistrationRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignRegistrationRevision(String value) {
        this.designRegistrationRevision = value;
    }

    /**
     * Gets the value of the effectiveRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveRegistrationDate() {
        return effectiveRegistrationDate;
    }

    /**
     * Sets the value of the effectiveRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveRegistrationDate(DatePeriodType value) {
        this.effectiveRegistrationDate = value;
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
        final DesignRegistrationIdentificationType that = ((DesignRegistrationIdentificationType) object);
        {
            String lhsDesignRegistrationIdentifier;
            lhsDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            String rhsDesignRegistrationIdentifier;
            rhsDesignRegistrationIdentifier = that.getDesignRegistrationIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designRegistrationIdentifier", lhsDesignRegistrationIdentifier), LocatorUtils.property(thatLocator, "designRegistrationIdentifier", rhsDesignRegistrationIdentifier), lhsDesignRegistrationIdentifier, rhsDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null), (that.designRegistrationIdentifier!= null))) {
                return false;
            }
        }
        {
            DesignRegistrationNotification lhsDesignRegistrationNotification;
            lhsDesignRegistrationNotification = this.getDesignRegistrationNotification();
            DesignRegistrationNotification rhsDesignRegistrationNotification;
            rhsDesignRegistrationNotification = that.getDesignRegistrationNotification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designRegistrationNotification", lhsDesignRegistrationNotification), LocatorUtils.property(thatLocator, "designRegistrationNotification", rhsDesignRegistrationNotification), lhsDesignRegistrationNotification, rhsDesignRegistrationNotification, (this.designRegistrationNotification!= null), (that.designRegistrationNotification!= null))) {
                return false;
            }
        }
        {
            String lhsDesignRegistrationRevision;
            lhsDesignRegistrationRevision = this.getDesignRegistrationRevision();
            String rhsDesignRegistrationRevision;
            rhsDesignRegistrationRevision = that.getDesignRegistrationRevision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designRegistrationRevision", lhsDesignRegistrationRevision), LocatorUtils.property(thatLocator, "designRegistrationRevision", rhsDesignRegistrationRevision), lhsDesignRegistrationRevision, rhsDesignRegistrationRevision, (this.designRegistrationRevision!= null), (that.designRegistrationRevision!= null))) {
                return false;
            }
        }
        {
            DatePeriodType lhsEffectiveRegistrationDate;
            lhsEffectiveRegistrationDate = this.getEffectiveRegistrationDate();
            DatePeriodType rhsEffectiveRegistrationDate;
            rhsEffectiveRegistrationDate = that.getEffectiveRegistrationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveRegistrationDate", lhsEffectiveRegistrationDate), LocatorUtils.property(thatLocator, "effectiveRegistrationDate", rhsEffectiveRegistrationDate), lhsEffectiveRegistrationDate, rhsEffectiveRegistrationDate, (this.effectiveRegistrationDate!= null), (that.effectiveRegistrationDate!= null))) {
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
            String theDesignRegistrationIdentifier;
            theDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designRegistrationIdentifier", theDesignRegistrationIdentifier), currentHashCode, theDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null));
        }
        {
            DesignRegistrationNotification theDesignRegistrationNotification;
            theDesignRegistrationNotification = this.getDesignRegistrationNotification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designRegistrationNotification", theDesignRegistrationNotification), currentHashCode, theDesignRegistrationNotification, (this.designRegistrationNotification!= null));
        }
        {
            String theDesignRegistrationRevision;
            theDesignRegistrationRevision = this.getDesignRegistrationRevision();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designRegistrationRevision", theDesignRegistrationRevision), currentHashCode, theDesignRegistrationRevision, (this.designRegistrationRevision!= null));
        }
        {
            DatePeriodType theEffectiveRegistrationDate;
            theEffectiveRegistrationDate = this.getEffectiveRegistrationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveRegistrationDate", theEffectiveRegistrationDate), currentHashCode, theEffectiveRegistrationDate, (this.effectiveRegistrationDate!= null));
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
            String theDesignRegistrationIdentifier;
            theDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            strategy.appendField(locator, this, "designRegistrationIdentifier", buffer, theDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null));
        }
        {
            DesignRegistrationNotification theDesignRegistrationNotification;
            theDesignRegistrationNotification = this.getDesignRegistrationNotification();
            strategy.appendField(locator, this, "designRegistrationNotification", buffer, theDesignRegistrationNotification, (this.designRegistrationNotification!= null));
        }
        {
            String theDesignRegistrationRevision;
            theDesignRegistrationRevision = this.getDesignRegistrationRevision();
            strategy.appendField(locator, this, "designRegistrationRevision", buffer, theDesignRegistrationRevision, (this.designRegistrationRevision!= null));
        }
        {
            DatePeriodType theEffectiveRegistrationDate;
            theEffectiveRegistrationDate = this.getEffectiveRegistrationDate();
            strategy.appendField(locator, this, "effectiveRegistrationDate", buffer, theEffectiveRegistrationDate, (this.effectiveRegistrationDate!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
