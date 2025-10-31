
package io.dscope.rosettanet.interchange.quoteconfirmation.v02_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for QuoteQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ManufacturerMinimumPackageQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MinimumOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="TransportationSchedule" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.01}TransportationScheduleType"/&gt;
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
@XmlType(name = "QuoteQuantityType", propOrder = {
    "manufacturerMinimumPackageQuantity",
    "minimumOrderQuantity",
    "transportationSchedule"
})
public class QuoteQuantityType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ManufacturerMinimumPackageQuantity")
    protected Float manufacturerMinimumPackageQuantity;
    @XmlElement(name = "MinimumOrderQuantity")
    protected Float minimumOrderQuantity;
    @XmlElement(name = "TransportationSchedule", required = true)
    protected TransportationScheduleType transportationSchedule;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the manufacturerMinimumPackageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getManufacturerMinimumPackageQuantity() {
        return manufacturerMinimumPackageQuantity;
    }

    /**
     * Sets the value of the manufacturerMinimumPackageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setManufacturerMinimumPackageQuantity(Float value) {
        this.manufacturerMinimumPackageQuantity = value;
    }

    /**
     * Gets the value of the minimumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the value of the minimumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumOrderQuantity(Float value) {
        this.minimumOrderQuantity = value;
    }

    /**
     * Gets the value of the transportationSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationScheduleType }
     *     
     */
    public TransportationScheduleType getTransportationSchedule() {
        return transportationSchedule;
    }

    /**
     * Sets the value of the transportationSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationScheduleType }
     *     
     */
    public void setTransportationSchedule(TransportationScheduleType value) {
        this.transportationSchedule = value;
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
        final QuoteQuantityType that = ((QuoteQuantityType) object);
        {
            Float lhsManufacturerMinimumPackageQuantity;
            lhsManufacturerMinimumPackageQuantity = this.getManufacturerMinimumPackageQuantity();
            Float rhsManufacturerMinimumPackageQuantity;
            rhsManufacturerMinimumPackageQuantity = that.getManufacturerMinimumPackageQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturerMinimumPackageQuantity", lhsManufacturerMinimumPackageQuantity), LocatorUtils.property(thatLocator, "manufacturerMinimumPackageQuantity", rhsManufacturerMinimumPackageQuantity), lhsManufacturerMinimumPackageQuantity, rhsManufacturerMinimumPackageQuantity, (this.manufacturerMinimumPackageQuantity!= null), (that.manufacturerMinimumPackageQuantity!= null))) {
                return false;
            }
        }
        {
            Float lhsMinimumOrderQuantity;
            lhsMinimumOrderQuantity = this.getMinimumOrderQuantity();
            Float rhsMinimumOrderQuantity;
            rhsMinimumOrderQuantity = that.getMinimumOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumOrderQuantity", lhsMinimumOrderQuantity), LocatorUtils.property(thatLocator, "minimumOrderQuantity", rhsMinimumOrderQuantity), lhsMinimumOrderQuantity, rhsMinimumOrderQuantity, (this.minimumOrderQuantity!= null), (that.minimumOrderQuantity!= null))) {
                return false;
            }
        }
        {
            TransportationScheduleType lhsTransportationSchedule;
            lhsTransportationSchedule = this.getTransportationSchedule();
            TransportationScheduleType rhsTransportationSchedule;
            rhsTransportationSchedule = that.getTransportationSchedule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportationSchedule", lhsTransportationSchedule), LocatorUtils.property(thatLocator, "transportationSchedule", rhsTransportationSchedule), lhsTransportationSchedule, rhsTransportationSchedule, (this.transportationSchedule!= null), (that.transportationSchedule!= null))) {
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
            Float theManufacturerMinimumPackageQuantity;
            theManufacturerMinimumPackageQuantity = this.getManufacturerMinimumPackageQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturerMinimumPackageQuantity", theManufacturerMinimumPackageQuantity), currentHashCode, theManufacturerMinimumPackageQuantity, (this.manufacturerMinimumPackageQuantity!= null));
        }
        {
            Float theMinimumOrderQuantity;
            theMinimumOrderQuantity = this.getMinimumOrderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumOrderQuantity", theMinimumOrderQuantity), currentHashCode, theMinimumOrderQuantity, (this.minimumOrderQuantity!= null));
        }
        {
            TransportationScheduleType theTransportationSchedule;
            theTransportationSchedule = this.getTransportationSchedule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportationSchedule", theTransportationSchedule), currentHashCode, theTransportationSchedule, (this.transportationSchedule!= null));
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
            Float theManufacturerMinimumPackageQuantity;
            theManufacturerMinimumPackageQuantity = this.getManufacturerMinimumPackageQuantity();
            strategy.appendField(locator, this, "manufacturerMinimumPackageQuantity", buffer, theManufacturerMinimumPackageQuantity, (this.manufacturerMinimumPackageQuantity!= null));
        }
        {
            Float theMinimumOrderQuantity;
            theMinimumOrderQuantity = this.getMinimumOrderQuantity();
            strategy.appendField(locator, this, "minimumOrderQuantity", buffer, theMinimumOrderQuantity, (this.minimumOrderQuantity!= null));
        }
        {
            TransportationScheduleType theTransportationSchedule;
            theTransportationSchedule = this.getTransportationSchedule();
            strategy.appendField(locator, this, "transportationSchedule", buffer, theTransportationSchedule, (this.transportationSchedule!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
