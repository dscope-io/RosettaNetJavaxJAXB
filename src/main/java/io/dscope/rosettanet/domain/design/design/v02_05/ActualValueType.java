
package io.dscope.rosettanet.domain.design.design.v02_05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.design.codelist.level.v01_02.LevelType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
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
 * <p>Java class for ActualValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActualValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NegativeTolerance" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.05}ToleranceType" minOccurs="0"/&gt;
 *         &lt;element name="PositiveTolerance" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.05}ToleranceType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.02}LevelType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
@XmlType(name = "ActualValueType", propOrder = {
    "negativeTolerance",
    "positiveTolerance",
    "type",
    "unitOfMeasure",
    "value"
})
public class ActualValueType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "NegativeTolerance")
    protected ToleranceType negativeTolerance;
    @XmlElement(name = "PositiveTolerance")
    protected ToleranceType positiveTolerance;
    @XmlElement(name = "Type")
    protected LevelType type;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "Value")
    protected float value;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the negativeTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link ToleranceType }
     *     
     */
    public ToleranceType getNegativeTolerance() {
        return negativeTolerance;
    }

    /**
     * Sets the value of the negativeTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToleranceType }
     *     
     */
    public void setNegativeTolerance(ToleranceType value) {
        this.negativeTolerance = value;
    }

    /**
     * Gets the value of the positiveTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link ToleranceType }
     *     
     */
    public ToleranceType getPositiveTolerance() {
        return positiveTolerance;
    }

    /**
     * Sets the value of the positiveTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToleranceType }
     *     
     */
    public void setPositiveTolerance(ToleranceType value) {
        this.positiveTolerance = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LevelType }
     *     
     */
    public LevelType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelType }
     *     
     */
    public void setType(LevelType value) {
        this.type = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
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
        final ActualValueType that = ((ActualValueType) object);
        {
            ToleranceType lhsNegativeTolerance;
            lhsNegativeTolerance = this.getNegativeTolerance();
            ToleranceType rhsNegativeTolerance;
            rhsNegativeTolerance = that.getNegativeTolerance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "negativeTolerance", lhsNegativeTolerance), LocatorUtils.property(thatLocator, "negativeTolerance", rhsNegativeTolerance), lhsNegativeTolerance, rhsNegativeTolerance, (this.negativeTolerance!= null), (that.negativeTolerance!= null))) {
                return false;
            }
        }
        {
            ToleranceType lhsPositiveTolerance;
            lhsPositiveTolerance = this.getPositiveTolerance();
            ToleranceType rhsPositiveTolerance;
            rhsPositiveTolerance = that.getPositiveTolerance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "positiveTolerance", lhsPositiveTolerance), LocatorUtils.property(thatLocator, "positiveTolerance", rhsPositiveTolerance), lhsPositiveTolerance, rhsPositiveTolerance, (this.positiveTolerance!= null), (that.positiveTolerance!= null))) {
                return false;
            }
        }
        {
            LevelType lhsType;
            lhsType = this.getType();
            LevelType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            UnitOfMeasure lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            UnitOfMeasure rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, (this.unitOfMeasure!= null), (that.unitOfMeasure!= null))) {
                return false;
            }
        }
        {
            float lhsValue;
            lhsValue = this.getValue();
            float rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, true, true)) {
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
            ToleranceType theNegativeTolerance;
            theNegativeTolerance = this.getNegativeTolerance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "negativeTolerance", theNegativeTolerance), currentHashCode, theNegativeTolerance, (this.negativeTolerance!= null));
        }
        {
            ToleranceType thePositiveTolerance;
            thePositiveTolerance = this.getPositiveTolerance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "positiveTolerance", thePositiveTolerance), currentHashCode, thePositiveTolerance, (this.positiveTolerance!= null));
        }
        {
            LevelType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType, (this.type!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            float theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, true);
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
            ToleranceType theNegativeTolerance;
            theNegativeTolerance = this.getNegativeTolerance();
            strategy.appendField(locator, this, "negativeTolerance", buffer, theNegativeTolerance, (this.negativeTolerance!= null));
        }
        {
            ToleranceType thePositiveTolerance;
            thePositiveTolerance = this.getPositiveTolerance();
            strategy.appendField(locator, this, "positiveTolerance", buffer, thePositiveTolerance, (this.positiveTolerance!= null));
        }
        {
            LevelType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            float theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, true);
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
