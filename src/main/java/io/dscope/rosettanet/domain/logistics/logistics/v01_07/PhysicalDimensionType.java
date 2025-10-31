
package io.dscope.rosettanet.domain.logistics.logistics.v01_07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.physicaldimension.v01_01.Linear;
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
 * <p>Java class for PhysicalDimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalDimensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.01}Linear" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}MassPhysicalDimension" minOccurs="0"/&gt;
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
@XmlType(name = "PhysicalDimensionType", propOrder = {
    "linear",
    "massPhysicalDimension"
})
public class PhysicalDimensionType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "Linear", namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.01", type = Linear.class, required = false)
    protected Linear linear;
    @XmlElementRef(name = "MassPhysicalDimension", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = MassPhysicalDimension.class, required = false)
    protected MassPhysicalDimension massPhysicalDimension;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the linear property.
     * 
     * @return
     *     possible object is
     *     {@link Linear }
     *     
     */
    public Linear getLinear() {
        return linear;
    }

    /**
     * Sets the value of the linear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linear }
     *     
     */
    public void setLinear(Linear value) {
        this.linear = value;
    }

    /**
     * Gets the value of the massPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link MassPhysicalDimension }
     *     
     */
    public MassPhysicalDimension getMassPhysicalDimension() {
        return massPhysicalDimension;
    }

    /**
     * Sets the value of the massPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassPhysicalDimension }
     *     
     */
    public void setMassPhysicalDimension(MassPhysicalDimension value) {
        this.massPhysicalDimension = value;
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
        final PhysicalDimensionType that = ((PhysicalDimensionType) object);
        {
            Linear lhsLinear;
            lhsLinear = this.getLinear();
            Linear rhsLinear;
            rhsLinear = that.getLinear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "linear", lhsLinear), LocatorUtils.property(thatLocator, "linear", rhsLinear), lhsLinear, rhsLinear, (this.linear!= null), (that.linear!= null))) {
                return false;
            }
        }
        {
            MassPhysicalDimension lhsMassPhysicalDimension;
            lhsMassPhysicalDimension = this.getMassPhysicalDimension();
            MassPhysicalDimension rhsMassPhysicalDimension;
            rhsMassPhysicalDimension = that.getMassPhysicalDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "massPhysicalDimension", lhsMassPhysicalDimension), LocatorUtils.property(thatLocator, "massPhysicalDimension", rhsMassPhysicalDimension), lhsMassPhysicalDimension, rhsMassPhysicalDimension, (this.massPhysicalDimension!= null), (that.massPhysicalDimension!= null))) {
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
            Linear theLinear;
            theLinear = this.getLinear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "linear", theLinear), currentHashCode, theLinear, (this.linear!= null));
        }
        {
            MassPhysicalDimension theMassPhysicalDimension;
            theMassPhysicalDimension = this.getMassPhysicalDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "massPhysicalDimension", theMassPhysicalDimension), currentHashCode, theMassPhysicalDimension, (this.massPhysicalDimension!= null));
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
            Linear theLinear;
            theLinear = this.getLinear();
            strategy.appendField(locator, this, "linear", buffer, theLinear, (this.linear!= null));
        }
        {
            MassPhysicalDimension theMassPhysicalDimension;
            theMassPhysicalDimension = this.getMassPhysicalDimension();
            strategy.appendField(locator, this, "massPhysicalDimension", buffer, theMassPhysicalDimension, (this.massPhysicalDimension!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
