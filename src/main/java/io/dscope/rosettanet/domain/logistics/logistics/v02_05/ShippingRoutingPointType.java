
package io.dscope.rosettanet.domain.logistics.logistics.v02_05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.routelocation.v01_03.RouteLocation;
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
 * <p>Java class for ShippingRoutingPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingRoutingPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:RouteLocation:xsd:codelist:01.03}RouteLocation"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.05}PortAddress"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.05}PortIdentification"/&gt;
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
@XmlType(name = "ShippingRoutingPointType", propOrder = {
    "routeLocation",
    "portAddress",
    "portIdentification"
})
public class ShippingRoutingPointType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "RouteLocation", namespace = "urn:rosettanet:specification:domain:Logistics:RouteLocation:xsd:codelist:01.03", type = RouteLocation.class)
    protected RouteLocation routeLocation;
    @XmlElementRef(name = "PortAddress", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.05", type = PortAddress.class, required = false)
    protected PortAddress portAddress;
    @XmlElementRef(name = "PortIdentification", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.05", type = PortIdentification.class, required = false)
    protected PortIdentification portIdentification;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the routeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RouteLocation }
     *     
     */
    public RouteLocation getRouteLocation() {
        return routeLocation;
    }

    /**
     * Sets the value of the routeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteLocation }
     *     
     */
    public void setRouteLocation(RouteLocation value) {
        this.routeLocation = value;
    }

    /**
     * Gets the value of the portAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PortAddress }
     *     
     */
    public PortAddress getPortAddress() {
        return portAddress;
    }

    /**
     * Sets the value of the portAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortAddress }
     *     
     */
    public void setPortAddress(PortAddress value) {
        this.portAddress = value;
    }

    /**
     * Gets the value of the portIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PortIdentification }
     *     
     */
    public PortIdentification getPortIdentification() {
        return portIdentification;
    }

    /**
     * Sets the value of the portIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortIdentification }
     *     
     */
    public void setPortIdentification(PortIdentification value) {
        this.portIdentification = value;
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
        final ShippingRoutingPointType that = ((ShippingRoutingPointType) object);
        {
            RouteLocation lhsRouteLocation;
            lhsRouteLocation = this.getRouteLocation();
            RouteLocation rhsRouteLocation;
            rhsRouteLocation = that.getRouteLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "routeLocation", lhsRouteLocation), LocatorUtils.property(thatLocator, "routeLocation", rhsRouteLocation), lhsRouteLocation, rhsRouteLocation, (this.routeLocation!= null), (that.routeLocation!= null))) {
                return false;
            }
        }
        {
            PortAddress lhsPortAddress;
            lhsPortAddress = this.getPortAddress();
            PortAddress rhsPortAddress;
            rhsPortAddress = that.getPortAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portAddress", lhsPortAddress), LocatorUtils.property(thatLocator, "portAddress", rhsPortAddress), lhsPortAddress, rhsPortAddress, (this.portAddress!= null), (that.portAddress!= null))) {
                return false;
            }
        }
        {
            PortIdentification lhsPortIdentification;
            lhsPortIdentification = this.getPortIdentification();
            PortIdentification rhsPortIdentification;
            rhsPortIdentification = that.getPortIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portIdentification", lhsPortIdentification), LocatorUtils.property(thatLocator, "portIdentification", rhsPortIdentification), lhsPortIdentification, rhsPortIdentification, (this.portIdentification!= null), (that.portIdentification!= null))) {
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
            RouteLocation theRouteLocation;
            theRouteLocation = this.getRouteLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "routeLocation", theRouteLocation), currentHashCode, theRouteLocation, (this.routeLocation!= null));
        }
        {
            PortAddress thePortAddress;
            thePortAddress = this.getPortAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portAddress", thePortAddress), currentHashCode, thePortAddress, (this.portAddress!= null));
        }
        {
            PortIdentification thePortIdentification;
            thePortIdentification = this.getPortIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portIdentification", thePortIdentification), currentHashCode, thePortIdentification, (this.portIdentification!= null));
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
            RouteLocation theRouteLocation;
            theRouteLocation = this.getRouteLocation();
            strategy.appendField(locator, this, "routeLocation", buffer, theRouteLocation, (this.routeLocation!= null));
        }
        {
            PortAddress thePortAddress;
            thePortAddress = this.getPortAddress();
            strategy.appendField(locator, this, "portAddress", buffer, thePortAddress, (this.portAddress!= null));
        }
        {
            PortIdentification thePortIdentification;
            thePortIdentification = this.getPortIdentification();
            strategy.appendField(locator, this, "portIdentification", buffer, thePortIdentification, (this.portIdentification!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
