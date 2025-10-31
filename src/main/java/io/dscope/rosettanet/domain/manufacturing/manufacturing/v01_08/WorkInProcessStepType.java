
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_08;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.equipmenttype.v01_02.EquipmentType;
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
 * <p>Java class for WorkInProcessStepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkInProcessStepType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternateResourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentStepName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:EquipmentType:xsd:codelist:01.02}EquipmentType" minOccurs="0"/&gt;
 *         &lt;element name="InverseYield" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.02}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element name="MaximumStepNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousStepNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StepNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Yield" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.02}PercentAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "WorkInProcessStepType", propOrder = {
    "alternateResourceIdentifier",
    "currentStepName",
    "equipmentType",
    "inverseYield",
    "maximumStepNumber",
    "previousStepNumber",
    "resourceIdentifier",
    "resourceType",
    "stepNumber",
    "yield"
})
public class WorkInProcessStepType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AlternateResourceIdentifier")
    protected String alternateResourceIdentifier;
    @XmlElement(name = "CurrentStepName")
    protected String currentStepName;
    @XmlElementRef(name = "EquipmentType", namespace = "urn:rosettanet:specification:domain:Manufacturing:EquipmentType:xsd:codelist:01.02", type = EquipmentType.class, required = false)
    protected EquipmentType equipmentType;
    @XmlElement(name = "InverseYield")
    protected BigDecimal inverseYield;
    @XmlElement(name = "MaximumStepNumber")
    protected String maximumStepNumber;
    @XmlElement(name = "PreviousStepNumber")
    protected String previousStepNumber;
    @XmlElement(name = "ResourceIdentifier")
    protected String resourceIdentifier;
    @XmlElement(name = "ResourceType")
    protected String resourceType;
    @XmlElement(name = "StepNumber")
    protected String stepNumber;
    @XmlElement(name = "Yield")
    protected BigDecimal yield;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternateResourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateResourceIdentifier() {
        return alternateResourceIdentifier;
    }

    /**
     * Sets the value of the alternateResourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateResourceIdentifier(String value) {
        this.alternateResourceIdentifier = value;
    }

    /**
     * Gets the value of the currentStepName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStepName() {
        return currentStepName;
    }

    /**
     * Sets the value of the currentStepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStepName(String value) {
        this.currentStepName = value;
    }

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentType }
     *     
     */
    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentType }
     *     
     */
    public void setEquipmentType(EquipmentType value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the inverseYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInverseYield() {
        return inverseYield;
    }

    /**
     * Sets the value of the inverseYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInverseYield(BigDecimal value) {
        this.inverseYield = value;
    }

    /**
     * Gets the value of the maximumStepNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumStepNumber() {
        return maximumStepNumber;
    }

    /**
     * Sets the value of the maximumStepNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStepNumber(String value) {
        this.maximumStepNumber = value;
    }

    /**
     * Gets the value of the previousStepNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousStepNumber() {
        return previousStepNumber;
    }

    /**
     * Sets the value of the previousStepNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousStepNumber(String value) {
        this.previousStepNumber = value;
    }

    /**
     * Gets the value of the resourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * Sets the value of the resourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceIdentifier(String value) {
        this.resourceIdentifier = value;
    }

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceType(String value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the stepNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepNumber() {
        return stepNumber;
    }

    /**
     * Sets the value of the stepNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepNumber(String value) {
        this.stepNumber = value;
    }

    /**
     * Gets the value of the yield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYield() {
        return yield;
    }

    /**
     * Sets the value of the yield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYield(BigDecimal value) {
        this.yield = value;
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
        final WorkInProcessStepType that = ((WorkInProcessStepType) object);
        {
            String lhsAlternateResourceIdentifier;
            lhsAlternateResourceIdentifier = this.getAlternateResourceIdentifier();
            String rhsAlternateResourceIdentifier;
            rhsAlternateResourceIdentifier = that.getAlternateResourceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternateResourceIdentifier", lhsAlternateResourceIdentifier), LocatorUtils.property(thatLocator, "alternateResourceIdentifier", rhsAlternateResourceIdentifier), lhsAlternateResourceIdentifier, rhsAlternateResourceIdentifier, (this.alternateResourceIdentifier!= null), (that.alternateResourceIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsCurrentStepName;
            lhsCurrentStepName = this.getCurrentStepName();
            String rhsCurrentStepName;
            rhsCurrentStepName = that.getCurrentStepName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentStepName", lhsCurrentStepName), LocatorUtils.property(thatLocator, "currentStepName", rhsCurrentStepName), lhsCurrentStepName, rhsCurrentStepName, (this.currentStepName!= null), (that.currentStepName!= null))) {
                return false;
            }
        }
        {
            EquipmentType lhsEquipmentType;
            lhsEquipmentType = this.getEquipmentType();
            EquipmentType rhsEquipmentType;
            rhsEquipmentType = that.getEquipmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "equipmentType", lhsEquipmentType), LocatorUtils.property(thatLocator, "equipmentType", rhsEquipmentType), lhsEquipmentType, rhsEquipmentType, (this.equipmentType!= null), (that.equipmentType!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsInverseYield;
            lhsInverseYield = this.getInverseYield();
            BigDecimal rhsInverseYield;
            rhsInverseYield = that.getInverseYield();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inverseYield", lhsInverseYield), LocatorUtils.property(thatLocator, "inverseYield", rhsInverseYield), lhsInverseYield, rhsInverseYield, (this.inverseYield!= null), (that.inverseYield!= null))) {
                return false;
            }
        }
        {
            String lhsMaximumStepNumber;
            lhsMaximumStepNumber = this.getMaximumStepNumber();
            String rhsMaximumStepNumber;
            rhsMaximumStepNumber = that.getMaximumStepNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumStepNumber", lhsMaximumStepNumber), LocatorUtils.property(thatLocator, "maximumStepNumber", rhsMaximumStepNumber), lhsMaximumStepNumber, rhsMaximumStepNumber, (this.maximumStepNumber!= null), (that.maximumStepNumber!= null))) {
                return false;
            }
        }
        {
            String lhsPreviousStepNumber;
            lhsPreviousStepNumber = this.getPreviousStepNumber();
            String rhsPreviousStepNumber;
            rhsPreviousStepNumber = that.getPreviousStepNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousStepNumber", lhsPreviousStepNumber), LocatorUtils.property(thatLocator, "previousStepNumber", rhsPreviousStepNumber), lhsPreviousStepNumber, rhsPreviousStepNumber, (this.previousStepNumber!= null), (that.previousStepNumber!= null))) {
                return false;
            }
        }
        {
            String lhsResourceIdentifier;
            lhsResourceIdentifier = this.getResourceIdentifier();
            String rhsResourceIdentifier;
            rhsResourceIdentifier = that.getResourceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resourceIdentifier", lhsResourceIdentifier), LocatorUtils.property(thatLocator, "resourceIdentifier", rhsResourceIdentifier), lhsResourceIdentifier, rhsResourceIdentifier, (this.resourceIdentifier!= null), (that.resourceIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsResourceType;
            lhsResourceType = this.getResourceType();
            String rhsResourceType;
            rhsResourceType = that.getResourceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resourceType", lhsResourceType), LocatorUtils.property(thatLocator, "resourceType", rhsResourceType), lhsResourceType, rhsResourceType, (this.resourceType!= null), (that.resourceType!= null))) {
                return false;
            }
        }
        {
            String lhsStepNumber;
            lhsStepNumber = this.getStepNumber();
            String rhsStepNumber;
            rhsStepNumber = that.getStepNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stepNumber", lhsStepNumber), LocatorUtils.property(thatLocator, "stepNumber", rhsStepNumber), lhsStepNumber, rhsStepNumber, (this.stepNumber!= null), (that.stepNumber!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsYield;
            lhsYield = this.getYield();
            BigDecimal rhsYield;
            rhsYield = that.getYield();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "yield", lhsYield), LocatorUtils.property(thatLocator, "yield", rhsYield), lhsYield, rhsYield, (this.yield!= null), (that.yield!= null))) {
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
            String theAlternateResourceIdentifier;
            theAlternateResourceIdentifier = this.getAlternateResourceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternateResourceIdentifier", theAlternateResourceIdentifier), currentHashCode, theAlternateResourceIdentifier, (this.alternateResourceIdentifier!= null));
        }
        {
            String theCurrentStepName;
            theCurrentStepName = this.getCurrentStepName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentStepName", theCurrentStepName), currentHashCode, theCurrentStepName, (this.currentStepName!= null));
        }
        {
            EquipmentType theEquipmentType;
            theEquipmentType = this.getEquipmentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "equipmentType", theEquipmentType), currentHashCode, theEquipmentType, (this.equipmentType!= null));
        }
        {
            BigDecimal theInverseYield;
            theInverseYield = this.getInverseYield();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inverseYield", theInverseYield), currentHashCode, theInverseYield, (this.inverseYield!= null));
        }
        {
            String theMaximumStepNumber;
            theMaximumStepNumber = this.getMaximumStepNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumStepNumber", theMaximumStepNumber), currentHashCode, theMaximumStepNumber, (this.maximumStepNumber!= null));
        }
        {
            String thePreviousStepNumber;
            thePreviousStepNumber = this.getPreviousStepNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousStepNumber", thePreviousStepNumber), currentHashCode, thePreviousStepNumber, (this.previousStepNumber!= null));
        }
        {
            String theResourceIdentifier;
            theResourceIdentifier = this.getResourceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resourceIdentifier", theResourceIdentifier), currentHashCode, theResourceIdentifier, (this.resourceIdentifier!= null));
        }
        {
            String theResourceType;
            theResourceType = this.getResourceType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resourceType", theResourceType), currentHashCode, theResourceType, (this.resourceType!= null));
        }
        {
            String theStepNumber;
            theStepNumber = this.getStepNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stepNumber", theStepNumber), currentHashCode, theStepNumber, (this.stepNumber!= null));
        }
        {
            BigDecimal theYield;
            theYield = this.getYield();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "yield", theYield), currentHashCode, theYield, (this.yield!= null));
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
            String theAlternateResourceIdentifier;
            theAlternateResourceIdentifier = this.getAlternateResourceIdentifier();
            strategy.appendField(locator, this, "alternateResourceIdentifier", buffer, theAlternateResourceIdentifier, (this.alternateResourceIdentifier!= null));
        }
        {
            String theCurrentStepName;
            theCurrentStepName = this.getCurrentStepName();
            strategy.appendField(locator, this, "currentStepName", buffer, theCurrentStepName, (this.currentStepName!= null));
        }
        {
            EquipmentType theEquipmentType;
            theEquipmentType = this.getEquipmentType();
            strategy.appendField(locator, this, "equipmentType", buffer, theEquipmentType, (this.equipmentType!= null));
        }
        {
            BigDecimal theInverseYield;
            theInverseYield = this.getInverseYield();
            strategy.appendField(locator, this, "inverseYield", buffer, theInverseYield, (this.inverseYield!= null));
        }
        {
            String theMaximumStepNumber;
            theMaximumStepNumber = this.getMaximumStepNumber();
            strategy.appendField(locator, this, "maximumStepNumber", buffer, theMaximumStepNumber, (this.maximumStepNumber!= null));
        }
        {
            String thePreviousStepNumber;
            thePreviousStepNumber = this.getPreviousStepNumber();
            strategy.appendField(locator, this, "previousStepNumber", buffer, thePreviousStepNumber, (this.previousStepNumber!= null));
        }
        {
            String theResourceIdentifier;
            theResourceIdentifier = this.getResourceIdentifier();
            strategy.appendField(locator, this, "resourceIdentifier", buffer, theResourceIdentifier, (this.resourceIdentifier!= null));
        }
        {
            String theResourceType;
            theResourceType = this.getResourceType();
            strategy.appendField(locator, this, "resourceType", buffer, theResourceType, (this.resourceType!= null));
        }
        {
            String theStepNumber;
            theStepNumber = this.getStepNumber();
            strategy.appendField(locator, this, "stepNumber", buffer, theStepNumber, (this.stepNumber!= null));
        }
        {
            BigDecimal theYield;
            theYield = this.getYield();
            strategy.appendField(locator, this, "yield", buffer, theYield, (this.yield!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
