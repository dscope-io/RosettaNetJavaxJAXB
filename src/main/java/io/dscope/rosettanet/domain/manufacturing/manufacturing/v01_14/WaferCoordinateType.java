
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

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
 * <p>Java class for WaferCoordinateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaferCoordinateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MaxY" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MinX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MinY" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
@XmlType(name = "WaferCoordinateType", propOrder = {
    "maxX",
    "maxY",
    "minX",
    "minY"
})
public class WaferCoordinateType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "MaxX")
    protected Float maxX;
    @XmlElement(name = "MaxY")
    protected Float maxY;
    @XmlElement(name = "MinX")
    protected Float minX;
    @XmlElement(name = "MinY")
    protected Float minY;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the maxX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxX() {
        return maxX;
    }

    /**
     * Sets the value of the maxX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxX(Float value) {
        this.maxX = value;
    }

    /**
     * Gets the value of the maxY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxY() {
        return maxY;
    }

    /**
     * Sets the value of the maxY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxY(Float value) {
        this.maxY = value;
    }

    /**
     * Gets the value of the minX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinX() {
        return minX;
    }

    /**
     * Sets the value of the minX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinX(Float value) {
        this.minX = value;
    }

    /**
     * Gets the value of the minY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinY() {
        return minY;
    }

    /**
     * Sets the value of the minY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinY(Float value) {
        this.minY = value;
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
        final WaferCoordinateType that = ((WaferCoordinateType) object);
        {
            Float lhsMaxX;
            lhsMaxX = this.getMaxX();
            Float rhsMaxX;
            rhsMaxX = that.getMaxX();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxX", lhsMaxX), LocatorUtils.property(thatLocator, "maxX", rhsMaxX), lhsMaxX, rhsMaxX, (this.maxX!= null), (that.maxX!= null))) {
                return false;
            }
        }
        {
            Float lhsMaxY;
            lhsMaxY = this.getMaxY();
            Float rhsMaxY;
            rhsMaxY = that.getMaxY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxY", lhsMaxY), LocatorUtils.property(thatLocator, "maxY", rhsMaxY), lhsMaxY, rhsMaxY, (this.maxY!= null), (that.maxY!= null))) {
                return false;
            }
        }
        {
            Float lhsMinX;
            lhsMinX = this.getMinX();
            Float rhsMinX;
            rhsMinX = that.getMinX();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minX", lhsMinX), LocatorUtils.property(thatLocator, "minX", rhsMinX), lhsMinX, rhsMinX, (this.minX!= null), (that.minX!= null))) {
                return false;
            }
        }
        {
            Float lhsMinY;
            lhsMinY = this.getMinY();
            Float rhsMinY;
            rhsMinY = that.getMinY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minY", lhsMinY), LocatorUtils.property(thatLocator, "minY", rhsMinY), lhsMinY, rhsMinY, (this.minY!= null), (that.minY!= null))) {
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
            Float theMaxX;
            theMaxX = this.getMaxX();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxX", theMaxX), currentHashCode, theMaxX, (this.maxX!= null));
        }
        {
            Float theMaxY;
            theMaxY = this.getMaxY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxY", theMaxY), currentHashCode, theMaxY, (this.maxY!= null));
        }
        {
            Float theMinX;
            theMinX = this.getMinX();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minX", theMinX), currentHashCode, theMinX, (this.minX!= null));
        }
        {
            Float theMinY;
            theMinY = this.getMinY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minY", theMinY), currentHashCode, theMinY, (this.minY!= null));
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
            Float theMaxX;
            theMaxX = this.getMaxX();
            strategy.appendField(locator, this, "maxX", buffer, theMaxX, (this.maxX!= null));
        }
        {
            Float theMaxY;
            theMaxY = this.getMaxY();
            strategy.appendField(locator, this, "maxY", buffer, theMaxY, (this.maxY!= null));
        }
        {
            Float theMinX;
            theMinX = this.getMinX();
            strategy.appendField(locator, this, "minX", buffer, theMinX, (this.minX!= null));
        }
        {
            Float theMinY;
            theMinY = this.getMinY();
            strategy.appendField(locator, this, "minY", buffer, theMinY, (this.minY!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
