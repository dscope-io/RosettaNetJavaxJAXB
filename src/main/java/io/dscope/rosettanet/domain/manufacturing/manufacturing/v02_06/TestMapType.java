
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_06;

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
 * <p>Java class for TestMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestMapType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CenterX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CenterY" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="LogicalMax" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="LogicalMin" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.06}MeasurementUnit" minOccurs="0"/&gt;
 *         &lt;element name="PosDirX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="PosDirY" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RetDieRelationX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RetDieRelationY" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RetDimensionX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RetDimensionY" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
@XmlType(name = "TestMapType", propOrder = {
    "centerX",
    "centerY",
    "logicalMax",
    "logicalMin",
    "measurementUnit",
    "posDirX",
    "posDirY",
    "retDieRelationX",
    "retDieRelationY",
    "retDimensionX",
    "retDimensionY"
})
public class TestMapType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CenterX")
    protected Float centerX;
    @XmlElement(name = "CenterY")
    protected Float centerY;
    @XmlElement(name = "LogicalMax")
    protected Float logicalMax;
    @XmlElement(name = "LogicalMin")
    protected Float logicalMin;
    @XmlElementRef(name = "MeasurementUnit", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.06", type = MeasurementUnit.class, required = false)
    protected MeasurementUnit measurementUnit;
    @XmlElement(name = "PosDirX")
    protected Float posDirX;
    @XmlElement(name = "PosDirY")
    protected Float posDirY;
    @XmlElement(name = "RetDieRelationX")
    protected Float retDieRelationX;
    @XmlElement(name = "RetDieRelationY")
    protected Float retDieRelationY;
    @XmlElement(name = "RetDimensionX")
    protected Float retDimensionX;
    @XmlElement(name = "RetDimensionY")
    protected Float retDimensionY;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the centerX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCenterX() {
        return centerX;
    }

    /**
     * Sets the value of the centerX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCenterX(Float value) {
        this.centerX = value;
    }

    /**
     * Gets the value of the centerY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCenterY() {
        return centerY;
    }

    /**
     * Sets the value of the centerY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCenterY(Float value) {
        this.centerY = value;
    }

    /**
     * Gets the value of the logicalMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLogicalMax() {
        return logicalMax;
    }

    /**
     * Sets the value of the logicalMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLogicalMax(Float value) {
        this.logicalMax = value;
    }

    /**
     * Gets the value of the logicalMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLogicalMin() {
        return logicalMin;
    }

    /**
     * Sets the value of the logicalMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLogicalMin(Float value) {
        this.logicalMin = value;
    }

    /**
     * Gets the value of the measurementUnit property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementUnit }
     *     
     */
    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * Sets the value of the measurementUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementUnit }
     *     
     */
    public void setMeasurementUnit(MeasurementUnit value) {
        this.measurementUnit = value;
    }

    /**
     * Gets the value of the posDirX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPosDirX() {
        return posDirX;
    }

    /**
     * Sets the value of the posDirX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPosDirX(Float value) {
        this.posDirX = value;
    }

    /**
     * Gets the value of the posDirY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPosDirY() {
        return posDirY;
    }

    /**
     * Sets the value of the posDirY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPosDirY(Float value) {
        this.posDirY = value;
    }

    /**
     * Gets the value of the retDieRelationX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetDieRelationX() {
        return retDieRelationX;
    }

    /**
     * Sets the value of the retDieRelationX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetDieRelationX(Float value) {
        this.retDieRelationX = value;
    }

    /**
     * Gets the value of the retDieRelationY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetDieRelationY() {
        return retDieRelationY;
    }

    /**
     * Sets the value of the retDieRelationY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetDieRelationY(Float value) {
        this.retDieRelationY = value;
    }

    /**
     * Gets the value of the retDimensionX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetDimensionX() {
        return retDimensionX;
    }

    /**
     * Sets the value of the retDimensionX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetDimensionX(Float value) {
        this.retDimensionX = value;
    }

    /**
     * Gets the value of the retDimensionY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetDimensionY() {
        return retDimensionY;
    }

    /**
     * Sets the value of the retDimensionY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetDimensionY(Float value) {
        this.retDimensionY = value;
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
        final TestMapType that = ((TestMapType) object);
        {
            Float lhsCenterX;
            lhsCenterX = this.getCenterX();
            Float rhsCenterX;
            rhsCenterX = that.getCenterX();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "centerX", lhsCenterX), LocatorUtils.property(thatLocator, "centerX", rhsCenterX), lhsCenterX, rhsCenterX, (this.centerX!= null), (that.centerX!= null))) {
                return false;
            }
        }
        {
            Float lhsCenterY;
            lhsCenterY = this.getCenterY();
            Float rhsCenterY;
            rhsCenterY = that.getCenterY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "centerY", lhsCenterY), LocatorUtils.property(thatLocator, "centerY", rhsCenterY), lhsCenterY, rhsCenterY, (this.centerY!= null), (that.centerY!= null))) {
                return false;
            }
        }
        {
            Float lhsLogicalMax;
            lhsLogicalMax = this.getLogicalMax();
            Float rhsLogicalMax;
            rhsLogicalMax = that.getLogicalMax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logicalMax", lhsLogicalMax), LocatorUtils.property(thatLocator, "logicalMax", rhsLogicalMax), lhsLogicalMax, rhsLogicalMax, (this.logicalMax!= null), (that.logicalMax!= null))) {
                return false;
            }
        }
        {
            Float lhsLogicalMin;
            lhsLogicalMin = this.getLogicalMin();
            Float rhsLogicalMin;
            rhsLogicalMin = that.getLogicalMin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logicalMin", lhsLogicalMin), LocatorUtils.property(thatLocator, "logicalMin", rhsLogicalMin), lhsLogicalMin, rhsLogicalMin, (this.logicalMin!= null), (that.logicalMin!= null))) {
                return false;
            }
        }
        {
            MeasurementUnit lhsMeasurementUnit;
            lhsMeasurementUnit = this.getMeasurementUnit();
            MeasurementUnit rhsMeasurementUnit;
            rhsMeasurementUnit = that.getMeasurementUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementUnit", lhsMeasurementUnit), LocatorUtils.property(thatLocator, "measurementUnit", rhsMeasurementUnit), lhsMeasurementUnit, rhsMeasurementUnit, (this.measurementUnit!= null), (that.measurementUnit!= null))) {
                return false;
            }
        }
        {
            Float lhsPosDirX;
            lhsPosDirX = this.getPosDirX();
            Float rhsPosDirX;
            rhsPosDirX = that.getPosDirX();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "posDirX", lhsPosDirX), LocatorUtils.property(thatLocator, "posDirX", rhsPosDirX), lhsPosDirX, rhsPosDirX, (this.posDirX!= null), (that.posDirX!= null))) {
                return false;
            }
        }
        {
            Float lhsPosDirY;
            lhsPosDirY = this.getPosDirY();
            Float rhsPosDirY;
            rhsPosDirY = that.getPosDirY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "posDirY", lhsPosDirY), LocatorUtils.property(thatLocator, "posDirY", rhsPosDirY), lhsPosDirY, rhsPosDirY, (this.posDirY!= null), (that.posDirY!= null))) {
                return false;
            }
        }
        {
            Float lhsRetDieRelationX;
            lhsRetDieRelationX = this.getRetDieRelationX();
            Float rhsRetDieRelationX;
            rhsRetDieRelationX = that.getRetDieRelationX();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retDieRelationX", lhsRetDieRelationX), LocatorUtils.property(thatLocator, "retDieRelationX", rhsRetDieRelationX), lhsRetDieRelationX, rhsRetDieRelationX, (this.retDieRelationX!= null), (that.retDieRelationX!= null))) {
                return false;
            }
        }
        {
            Float lhsRetDieRelationY;
            lhsRetDieRelationY = this.getRetDieRelationY();
            Float rhsRetDieRelationY;
            rhsRetDieRelationY = that.getRetDieRelationY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retDieRelationY", lhsRetDieRelationY), LocatorUtils.property(thatLocator, "retDieRelationY", rhsRetDieRelationY), lhsRetDieRelationY, rhsRetDieRelationY, (this.retDieRelationY!= null), (that.retDieRelationY!= null))) {
                return false;
            }
        }
        {
            Float lhsRetDimensionX;
            lhsRetDimensionX = this.getRetDimensionX();
            Float rhsRetDimensionX;
            rhsRetDimensionX = that.getRetDimensionX();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retDimensionX", lhsRetDimensionX), LocatorUtils.property(thatLocator, "retDimensionX", rhsRetDimensionX), lhsRetDimensionX, rhsRetDimensionX, (this.retDimensionX!= null), (that.retDimensionX!= null))) {
                return false;
            }
        }
        {
            Float lhsRetDimensionY;
            lhsRetDimensionY = this.getRetDimensionY();
            Float rhsRetDimensionY;
            rhsRetDimensionY = that.getRetDimensionY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retDimensionY", lhsRetDimensionY), LocatorUtils.property(thatLocator, "retDimensionY", rhsRetDimensionY), lhsRetDimensionY, rhsRetDimensionY, (this.retDimensionY!= null), (that.retDimensionY!= null))) {
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
            Float theCenterX;
            theCenterX = this.getCenterX();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "centerX", theCenterX), currentHashCode, theCenterX, (this.centerX!= null));
        }
        {
            Float theCenterY;
            theCenterY = this.getCenterY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "centerY", theCenterY), currentHashCode, theCenterY, (this.centerY!= null));
        }
        {
            Float theLogicalMax;
            theLogicalMax = this.getLogicalMax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logicalMax", theLogicalMax), currentHashCode, theLogicalMax, (this.logicalMax!= null));
        }
        {
            Float theLogicalMin;
            theLogicalMin = this.getLogicalMin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logicalMin", theLogicalMin), currentHashCode, theLogicalMin, (this.logicalMin!= null));
        }
        {
            MeasurementUnit theMeasurementUnit;
            theMeasurementUnit = this.getMeasurementUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementUnit", theMeasurementUnit), currentHashCode, theMeasurementUnit, (this.measurementUnit!= null));
        }
        {
            Float thePosDirX;
            thePosDirX = this.getPosDirX();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "posDirX", thePosDirX), currentHashCode, thePosDirX, (this.posDirX!= null));
        }
        {
            Float thePosDirY;
            thePosDirY = this.getPosDirY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "posDirY", thePosDirY), currentHashCode, thePosDirY, (this.posDirY!= null));
        }
        {
            Float theRetDieRelationX;
            theRetDieRelationX = this.getRetDieRelationX();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retDieRelationX", theRetDieRelationX), currentHashCode, theRetDieRelationX, (this.retDieRelationX!= null));
        }
        {
            Float theRetDieRelationY;
            theRetDieRelationY = this.getRetDieRelationY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retDieRelationY", theRetDieRelationY), currentHashCode, theRetDieRelationY, (this.retDieRelationY!= null));
        }
        {
            Float theRetDimensionX;
            theRetDimensionX = this.getRetDimensionX();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retDimensionX", theRetDimensionX), currentHashCode, theRetDimensionX, (this.retDimensionX!= null));
        }
        {
            Float theRetDimensionY;
            theRetDimensionY = this.getRetDimensionY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retDimensionY", theRetDimensionY), currentHashCode, theRetDimensionY, (this.retDimensionY!= null));
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
            Float theCenterX;
            theCenterX = this.getCenterX();
            strategy.appendField(locator, this, "centerX", buffer, theCenterX, (this.centerX!= null));
        }
        {
            Float theCenterY;
            theCenterY = this.getCenterY();
            strategy.appendField(locator, this, "centerY", buffer, theCenterY, (this.centerY!= null));
        }
        {
            Float theLogicalMax;
            theLogicalMax = this.getLogicalMax();
            strategy.appendField(locator, this, "logicalMax", buffer, theLogicalMax, (this.logicalMax!= null));
        }
        {
            Float theLogicalMin;
            theLogicalMin = this.getLogicalMin();
            strategy.appendField(locator, this, "logicalMin", buffer, theLogicalMin, (this.logicalMin!= null));
        }
        {
            MeasurementUnit theMeasurementUnit;
            theMeasurementUnit = this.getMeasurementUnit();
            strategy.appendField(locator, this, "measurementUnit", buffer, theMeasurementUnit, (this.measurementUnit!= null));
        }
        {
            Float thePosDirX;
            thePosDirX = this.getPosDirX();
            strategy.appendField(locator, this, "posDirX", buffer, thePosDirX, (this.posDirX!= null));
        }
        {
            Float thePosDirY;
            thePosDirY = this.getPosDirY();
            strategy.appendField(locator, this, "posDirY", buffer, thePosDirY, (this.posDirY!= null));
        }
        {
            Float theRetDieRelationX;
            theRetDieRelationX = this.getRetDieRelationX();
            strategy.appendField(locator, this, "retDieRelationX", buffer, theRetDieRelationX, (this.retDieRelationX!= null));
        }
        {
            Float theRetDieRelationY;
            theRetDieRelationY = this.getRetDieRelationY();
            strategy.appendField(locator, this, "retDieRelationY", buffer, theRetDieRelationY, (this.retDieRelationY!= null));
        }
        {
            Float theRetDimensionX;
            theRetDimensionX = this.getRetDimensionX();
            strategy.appendField(locator, this, "retDimensionX", buffer, theRetDimensionX, (this.retDimensionX!= null));
        }
        {
            Float theRetDimensionY;
            theRetDimensionY = this.getRetDimensionY();
            strategy.appendField(locator, this, "retDimensionY", buffer, theRetDimensionY, (this.retDimensionY!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
