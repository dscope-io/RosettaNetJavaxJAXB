
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_06;

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
 * <p>Java class for FloatCoordinateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatCoordinateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Z" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
@XmlType(name = "FloatCoordinateType", propOrder = {
    "x",
    "y",
    "z"
})
public class FloatCoordinateType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "X")
    protected Float x;
    @XmlElement(name = "Y")
    protected Float y;
    @XmlElement(name = "Z")
    protected Float z;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setX(Float value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setY(Float value) {
        this.y = value;
    }

    /**
     * Gets the value of the z property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setZ(Float value) {
        this.z = value;
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
        final FloatCoordinateType that = ((FloatCoordinateType) object);
        {
            Float lhsX;
            lhsX = this.getX();
            Float rhsX;
            rhsX = that.getX();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "x", lhsX), LocatorUtils.property(thatLocator, "x", rhsX), lhsX, rhsX, (this.x!= null), (that.x!= null))) {
                return false;
            }
        }
        {
            Float lhsY;
            lhsY = this.getY();
            Float rhsY;
            rhsY = that.getY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "y", lhsY), LocatorUtils.property(thatLocator, "y", rhsY), lhsY, rhsY, (this.y!= null), (that.y!= null))) {
                return false;
            }
        }
        {
            Float lhsZ;
            lhsZ = this.getZ();
            Float rhsZ;
            rhsZ = that.getZ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "z", lhsZ), LocatorUtils.property(thatLocator, "z", rhsZ), lhsZ, rhsZ, (this.z!= null), (that.z!= null))) {
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
            Float theX;
            theX = this.getX();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "x", theX), currentHashCode, theX, (this.x!= null));
        }
        {
            Float theY;
            theY = this.getY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "y", theY), currentHashCode, theY, (this.y!= null));
        }
        {
            Float theZ;
            theZ = this.getZ();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "z", theZ), currentHashCode, theZ, (this.z!= null));
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
            Float theX;
            theX = this.getX();
            strategy.appendField(locator, this, "x", buffer, theX, (this.x!= null));
        }
        {
            Float theY;
            theY = this.getY();
            strategy.appendField(locator, this, "y", buffer, theY, (this.y!= null));
        }
        {
            Float theZ;
            theZ = this.getZ();
            strategy.appendField(locator, this, "z", buffer, theZ, (this.z!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
