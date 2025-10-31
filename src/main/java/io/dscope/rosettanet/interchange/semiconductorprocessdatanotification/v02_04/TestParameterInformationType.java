
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.MeasurementUnit;
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
 * <p>Java class for TestParameterInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestParameterInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Calculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CensorHLim" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CensorLLim" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HighLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LowLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}MeasurementUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Target" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
@XmlType(name = "TestParameterInformationType", propOrder = {
    "calculation",
    "censorHLim",
    "censorLLim",
    "condition",
    "highLimit",
    "label",
    "lowLimit",
    "measurementUnit",
    "target"
})
public class TestParameterInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Calculation")
    protected String calculation;
    @XmlElement(name = "CensorHLim")
    protected Float censorHLim;
    @XmlElement(name = "CensorLLim")
    protected Float censorLLim;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "HighLimit")
    protected Float highLimit;
    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "LowLimit")
    protected Float lowLimit;
    @XmlElementRef(name = "MeasurementUnit", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = MeasurementUnit.class, required = false)
    protected List<MeasurementUnit> measurementUnit;
    @XmlElement(name = "Target")
    protected Float target;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the calculation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculation() {
        return calculation;
    }

    /**
     * Sets the value of the calculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculation(String value) {
        this.calculation = value;
    }

    /**
     * Gets the value of the censorHLim property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCensorHLim() {
        return censorHLim;
    }

    /**
     * Sets the value of the censorHLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCensorHLim(Float value) {
        this.censorHLim = value;
    }

    /**
     * Gets the value of the censorLLim property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCensorLLim() {
        return censorLLim;
    }

    /**
     * Sets the value of the censorLLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCensorLLim(Float value) {
        this.censorLLim = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the highLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHighLimit() {
        return highLimit;
    }

    /**
     * Sets the value of the highLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHighLimit(Float value) {
        this.highLimit = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the lowLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLowLimit() {
        return lowLimit;
    }

    /**
     * Sets the value of the lowLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLowLimit(Float value) {
        this.lowLimit = value;
    }

    /**
     * Gets the value of the measurementUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementUnit }
     * 
     * 
     */
    public List<MeasurementUnit> getMeasurementUnit() {
        if (measurementUnit == null) {
            measurementUnit = new ArrayList<MeasurementUnit>();
        }
        return this.measurementUnit;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTarget(Float value) {
        this.target = value;
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
        final TestParameterInformationType that = ((TestParameterInformationType) object);
        {
            String lhsCalculation;
            lhsCalculation = this.getCalculation();
            String rhsCalculation;
            rhsCalculation = that.getCalculation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculation", lhsCalculation), LocatorUtils.property(thatLocator, "calculation", rhsCalculation), lhsCalculation, rhsCalculation, (this.calculation!= null), (that.calculation!= null))) {
                return false;
            }
        }
        {
            Float lhsCensorHLim;
            lhsCensorHLim = this.getCensorHLim();
            Float rhsCensorHLim;
            rhsCensorHLim = that.getCensorHLim();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "censorHLim", lhsCensorHLim), LocatorUtils.property(thatLocator, "censorHLim", rhsCensorHLim), lhsCensorHLim, rhsCensorHLim, (this.censorHLim!= null), (that.censorHLim!= null))) {
                return false;
            }
        }
        {
            Float lhsCensorLLim;
            lhsCensorLLim = this.getCensorLLim();
            Float rhsCensorLLim;
            rhsCensorLLim = that.getCensorLLim();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "censorLLim", lhsCensorLLim), LocatorUtils.property(thatLocator, "censorLLim", rhsCensorLLim), lhsCensorLLim, rhsCensorLLim, (this.censorLLim!= null), (that.censorLLim!= null))) {
                return false;
            }
        }
        {
            String lhsCondition;
            lhsCondition = this.getCondition();
            String rhsCondition;
            rhsCondition = that.getCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "condition", lhsCondition), LocatorUtils.property(thatLocator, "condition", rhsCondition), lhsCondition, rhsCondition, (this.condition!= null), (that.condition!= null))) {
                return false;
            }
        }
        {
            Float lhsHighLimit;
            lhsHighLimit = this.getHighLimit();
            Float rhsHighLimit;
            rhsHighLimit = that.getHighLimit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "highLimit", lhsHighLimit), LocatorUtils.property(thatLocator, "highLimit", rhsHighLimit), lhsHighLimit, rhsHighLimit, (this.highLimit!= null), (that.highLimit!= null))) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel, (this.label!= null), (that.label!= null))) {
                return false;
            }
        }
        {
            Float lhsLowLimit;
            lhsLowLimit = this.getLowLimit();
            Float rhsLowLimit;
            rhsLowLimit = that.getLowLimit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lowLimit", lhsLowLimit), LocatorUtils.property(thatLocator, "lowLimit", rhsLowLimit), lhsLowLimit, rhsLowLimit, (this.lowLimit!= null), (that.lowLimit!= null))) {
                return false;
            }
        }
        {
            List<MeasurementUnit> lhsMeasurementUnit;
            lhsMeasurementUnit = (((this.measurementUnit!= null)&&(!this.measurementUnit.isEmpty()))?this.getMeasurementUnit():null);
            List<MeasurementUnit> rhsMeasurementUnit;
            rhsMeasurementUnit = (((that.measurementUnit!= null)&&(!that.measurementUnit.isEmpty()))?that.getMeasurementUnit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementUnit", lhsMeasurementUnit), LocatorUtils.property(thatLocator, "measurementUnit", rhsMeasurementUnit), lhsMeasurementUnit, rhsMeasurementUnit, ((this.measurementUnit!= null)&&(!this.measurementUnit.isEmpty())), ((that.measurementUnit!= null)&&(!that.measurementUnit.isEmpty())))) {
                return false;
            }
        }
        {
            Float lhsTarget;
            lhsTarget = this.getTarget();
            Float rhsTarget;
            rhsTarget = that.getTarget();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "target", lhsTarget), LocatorUtils.property(thatLocator, "target", rhsTarget), lhsTarget, rhsTarget, (this.target!= null), (that.target!= null))) {
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
            String theCalculation;
            theCalculation = this.getCalculation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calculation", theCalculation), currentHashCode, theCalculation, (this.calculation!= null));
        }
        {
            Float theCensorHLim;
            theCensorHLim = this.getCensorHLim();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "censorHLim", theCensorHLim), currentHashCode, theCensorHLim, (this.censorHLim!= null));
        }
        {
            Float theCensorLLim;
            theCensorLLim = this.getCensorLLim();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "censorLLim", theCensorLLim), currentHashCode, theCensorLLim, (this.censorLLim!= null));
        }
        {
            String theCondition;
            theCondition = this.getCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "condition", theCondition), currentHashCode, theCondition, (this.condition!= null));
        }
        {
            Float theHighLimit;
            theHighLimit = this.getHighLimit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "highLimit", theHighLimit), currentHashCode, theHighLimit, (this.highLimit!= null));
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel, (this.label!= null));
        }
        {
            Float theLowLimit;
            theLowLimit = this.getLowLimit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lowLimit", theLowLimit), currentHashCode, theLowLimit, (this.lowLimit!= null));
        }
        {
            List<MeasurementUnit> theMeasurementUnit;
            theMeasurementUnit = (((this.measurementUnit!= null)&&(!this.measurementUnit.isEmpty()))?this.getMeasurementUnit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementUnit", theMeasurementUnit), currentHashCode, theMeasurementUnit, ((this.measurementUnit!= null)&&(!this.measurementUnit.isEmpty())));
        }
        {
            Float theTarget;
            theTarget = this.getTarget();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "target", theTarget), currentHashCode, theTarget, (this.target!= null));
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
            String theCalculation;
            theCalculation = this.getCalculation();
            strategy.appendField(locator, this, "calculation", buffer, theCalculation, (this.calculation!= null));
        }
        {
            Float theCensorHLim;
            theCensorHLim = this.getCensorHLim();
            strategy.appendField(locator, this, "censorHLim", buffer, theCensorHLim, (this.censorHLim!= null));
        }
        {
            Float theCensorLLim;
            theCensorLLim = this.getCensorLLim();
            strategy.appendField(locator, this, "censorLLim", buffer, theCensorLLim, (this.censorLLim!= null));
        }
        {
            String theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition, (this.condition!= null));
        }
        {
            Float theHighLimit;
            theHighLimit = this.getHighLimit();
            strategy.appendField(locator, this, "highLimit", buffer, theHighLimit, (this.highLimit!= null));
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            Float theLowLimit;
            theLowLimit = this.getLowLimit();
            strategy.appendField(locator, this, "lowLimit", buffer, theLowLimit, (this.lowLimit!= null));
        }
        {
            List<MeasurementUnit> theMeasurementUnit;
            theMeasurementUnit = (((this.measurementUnit!= null)&&(!this.measurementUnit.isEmpty()))?this.getMeasurementUnit():null);
            strategy.appendField(locator, this, "measurementUnit", buffer, theMeasurementUnit, ((this.measurementUnit!= null)&&(!this.measurementUnit.isEmpty())));
        }
        {
            Float theTarget;
            theTarget = this.getTarget();
            strategy.appendField(locator, this, "target", buffer, theTarget, (this.target!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
