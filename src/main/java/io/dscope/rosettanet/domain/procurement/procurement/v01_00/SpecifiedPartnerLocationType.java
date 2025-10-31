
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for SpecifiedPartnerLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedPartnerLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}LocationDescription"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}SpecifiedPartnerNameIdentification"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "SpecifiedPartnerLocationType", propOrder = {
    "locationDescription",
    "specifiedPartnerNameIdentification"
})
public class SpecifiedPartnerLocationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "LocationDescription", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = LocationDescription.class, required = false)
    protected LocationDescription locationDescription;
    @XmlElementRef(name = "SpecifiedPartnerNameIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = SpecifiedPartnerNameIdentification.class, required = false)
    protected SpecifiedPartnerNameIdentification specifiedPartnerNameIdentification;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDescription }
     *     
     */
    public LocationDescription getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDescription }
     *     
     */
    public void setLocationDescription(LocationDescription value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the specifiedPartnerNameIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerNameIdentification }
     *     
     */
    public SpecifiedPartnerNameIdentification getSpecifiedPartnerNameIdentification() {
        return specifiedPartnerNameIdentification;
    }

    /**
     * Sets the value of the specifiedPartnerNameIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerNameIdentification }
     *     
     */
    public void setSpecifiedPartnerNameIdentification(SpecifiedPartnerNameIdentification value) {
        this.specifiedPartnerNameIdentification = value;
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
        final SpecifiedPartnerLocationType that = ((SpecifiedPartnerLocationType) object);
        {
            LocationDescription lhsLocationDescription;
            lhsLocationDescription = this.getLocationDescription();
            LocationDescription rhsLocationDescription;
            rhsLocationDescription = that.getLocationDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationDescription", lhsLocationDescription), LocatorUtils.property(thatLocator, "locationDescription", rhsLocationDescription), lhsLocationDescription, rhsLocationDescription, (this.locationDescription!= null), (that.locationDescription!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerNameIdentification lhsSpecifiedPartnerNameIdentification;
            lhsSpecifiedPartnerNameIdentification = this.getSpecifiedPartnerNameIdentification();
            SpecifiedPartnerNameIdentification rhsSpecifiedPartnerNameIdentification;
            rhsSpecifiedPartnerNameIdentification = that.getSpecifiedPartnerNameIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specifiedPartnerNameIdentification", lhsSpecifiedPartnerNameIdentification), LocatorUtils.property(thatLocator, "specifiedPartnerNameIdentification", rhsSpecifiedPartnerNameIdentification), lhsSpecifiedPartnerNameIdentification, rhsSpecifiedPartnerNameIdentification, (this.specifiedPartnerNameIdentification!= null), (that.specifiedPartnerNameIdentification!= null))) {
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
            LocationDescription theLocationDescription;
            theLocationDescription = this.getLocationDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationDescription", theLocationDescription), currentHashCode, theLocationDescription, (this.locationDescription!= null));
        }
        {
            SpecifiedPartnerNameIdentification theSpecifiedPartnerNameIdentification;
            theSpecifiedPartnerNameIdentification = this.getSpecifiedPartnerNameIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specifiedPartnerNameIdentification", theSpecifiedPartnerNameIdentification), currentHashCode, theSpecifiedPartnerNameIdentification, (this.specifiedPartnerNameIdentification!= null));
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
            LocationDescription theLocationDescription;
            theLocationDescription = this.getLocationDescription();
            strategy.appendField(locator, this, "locationDescription", buffer, theLocationDescription, (this.locationDescription!= null));
        }
        {
            SpecifiedPartnerNameIdentification theSpecifiedPartnerNameIdentification;
            theSpecifiedPartnerNameIdentification = this.getSpecifiedPartnerNameIdentification();
            strategy.appendField(locator, this, "specifiedPartnerNameIdentification", buffer, theSpecifiedPartnerNameIdentification, (this.specifiedPartnerNameIdentification!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
