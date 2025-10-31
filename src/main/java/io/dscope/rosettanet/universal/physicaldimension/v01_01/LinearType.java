
package io.dscope.rosettanet.universal.physicaldimension.v01_01;

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
 * <p>Java class for LinearType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Height" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.01}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.01}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.01}MeasureType" minOccurs="0"/&gt;
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
@XmlType(name = "LinearType", propOrder = {
    "height",
    "length",
    "width"
})
public class LinearType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Height")
    protected MeasureType height;
    @XmlElement(name = "Length")
    protected MeasureType length;
    @XmlElement(name = "Width")
    protected MeasureType width;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setHeight(MeasureType value) {
        this.height = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLength(MeasureType value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWidth(MeasureType value) {
        this.width = value;
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
        final LinearType that = ((LinearType) object);
        {
            MeasureType lhsHeight;
            lhsHeight = this.getHeight();
            MeasureType rhsHeight;
            rhsHeight = that.getHeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "height", lhsHeight), LocatorUtils.property(thatLocator, "height", rhsHeight), lhsHeight, rhsHeight, (this.height!= null), (that.height!= null))) {
                return false;
            }
        }
        {
            MeasureType lhsLength;
            lhsLength = this.getLength();
            MeasureType rhsLength;
            rhsLength = that.getLength();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "length", lhsLength), LocatorUtils.property(thatLocator, "length", rhsLength), lhsLength, rhsLength, (this.length!= null), (that.length!= null))) {
                return false;
            }
        }
        {
            MeasureType lhsWidth;
            lhsWidth = this.getWidth();
            MeasureType rhsWidth;
            rhsWidth = that.getWidth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "width", lhsWidth), LocatorUtils.property(thatLocator, "width", rhsWidth), lhsWidth, rhsWidth, (this.width!= null), (that.width!= null))) {
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
            MeasureType theHeight;
            theHeight = this.getHeight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "height", theHeight), currentHashCode, theHeight, (this.height!= null));
        }
        {
            MeasureType theLength;
            theLength = this.getLength();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "length", theLength), currentHashCode, theLength, (this.length!= null));
        }
        {
            MeasureType theWidth;
            theWidth = this.getWidth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "width", theWidth), currentHashCode, theWidth, (this.width!= null));
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
            MeasureType theHeight;
            theHeight = this.getHeight();
            strategy.appendField(locator, this, "height", buffer, theHeight, (this.height!= null));
        }
        {
            MeasureType theLength;
            theLength = this.getLength();
            strategy.appendField(locator, this, "length", buffer, theLength, (this.length!= null));
        }
        {
            MeasureType theWidth;
            theWidth = this.getWidth();
            strategy.appendField(locator, this, "width", buffer, theWidth, (this.width!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
