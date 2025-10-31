
package io.dscope.rosettanet.domain.logistics.logistics.v02_17;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for TrackingReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipmentTrackingIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:TrackingReferenceType:xsd:codelist:01.06}TrackingReferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "TrackingReferenceType", propOrder = {
    "shipmentTrackingIdentifier",
    "trackingReferenceType"
})
public class TrackingReferenceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ShipmentTrackingIdentifier")
    protected String shipmentTrackingIdentifier;
    @XmlElementRef(name = "TrackingReferenceType", namespace = "urn:rosettanet:specification:domain:Logistics:TrackingReferenceType:xsd:codelist:01.06", type = io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType.class, required = false)
    protected io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType trackingReferenceType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the shipmentTrackingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentTrackingIdentifier() {
        return shipmentTrackingIdentifier;
    }

    /**
     * Sets the value of the shipmentTrackingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentTrackingIdentifier(String value) {
        this.shipmentTrackingIdentifier = value;
    }

    /**
     * Gets the value of the trackingReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType }
     *     
     */
    public io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType getTrackingReferenceType() {
        return trackingReferenceType;
    }

    /**
     * Sets the value of the trackingReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType }
     *     
     */
    public void setTrackingReferenceType(io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType value) {
        this.trackingReferenceType = value;
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
        final TrackingReferenceType that = ((TrackingReferenceType) object);
        {
            String lhsShipmentTrackingIdentifier;
            lhsShipmentTrackingIdentifier = this.getShipmentTrackingIdentifier();
            String rhsShipmentTrackingIdentifier;
            rhsShipmentTrackingIdentifier = that.getShipmentTrackingIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentTrackingIdentifier", lhsShipmentTrackingIdentifier), LocatorUtils.property(thatLocator, "shipmentTrackingIdentifier", rhsShipmentTrackingIdentifier), lhsShipmentTrackingIdentifier, rhsShipmentTrackingIdentifier, (this.shipmentTrackingIdentifier!= null), (that.shipmentTrackingIdentifier!= null))) {
                return false;
            }
        }
        {
            io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType lhsTrackingReferenceType;
            lhsTrackingReferenceType = this.getTrackingReferenceType();
            io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType rhsTrackingReferenceType;
            rhsTrackingReferenceType = that.getTrackingReferenceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingReferenceType", lhsTrackingReferenceType), LocatorUtils.property(thatLocator, "trackingReferenceType", rhsTrackingReferenceType), lhsTrackingReferenceType, rhsTrackingReferenceType, (this.trackingReferenceType!= null), (that.trackingReferenceType!= null))) {
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
            String theShipmentTrackingIdentifier;
            theShipmentTrackingIdentifier = this.getShipmentTrackingIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentTrackingIdentifier", theShipmentTrackingIdentifier), currentHashCode, theShipmentTrackingIdentifier, (this.shipmentTrackingIdentifier!= null));
        }
        {
            io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType theTrackingReferenceType;
            theTrackingReferenceType = this.getTrackingReferenceType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingReferenceType", theTrackingReferenceType), currentHashCode, theTrackingReferenceType, (this.trackingReferenceType!= null));
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
            String theShipmentTrackingIdentifier;
            theShipmentTrackingIdentifier = this.getShipmentTrackingIdentifier();
            strategy.appendField(locator, this, "shipmentTrackingIdentifier", buffer, theShipmentTrackingIdentifier, (this.shipmentTrackingIdentifier!= null));
        }
        {
            io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType theTrackingReferenceType;
            theTrackingReferenceType = this.getTrackingReferenceType();
            strategy.appendField(locator, this, "trackingReferenceType", buffer, theTrackingReferenceType, (this.trackingReferenceType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
