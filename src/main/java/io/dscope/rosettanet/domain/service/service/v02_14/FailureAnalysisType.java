
package io.dscope.rosettanet.domain.service.service.v02_14;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.codelist.failureaction.v01_02.FailureAction;
import io.dscope.rosettanet.domain.service.codelist.failuremodifier.v01_02.FailureModifier;
import io.dscope.rosettanet.domain.service.codelist.failureobservedcondition.v01_02.FailureObservedCondition;
import io.dscope.rosettanet.domain.service.codelist.operatingsystem.v01_02.OperatingSystem;
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
 * <p>Java class for FailureAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailureAnalysisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:FailureAction:xsd:codelist:01.02}FailureAction"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:FailureModifier:xsd:codelist:01.02}FailureModifier"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:FailureObservedCondition:xsd:codelist:01.02}FailureObservedCondition"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:OperatingSystem:xsd:codelist:01.02}OperatingSystem"/&gt;
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
@XmlType(name = "FailureAnalysisType", propOrder = {
    "failureAction",
    "failureModifier",
    "failureObservedCondition",
    "operatingSystem"
})
public class FailureAnalysisType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "FailureAction", namespace = "urn:rosettanet:specification:domain:Service:FailureAction:xsd:codelist:01.02", type = FailureAction.class)
    protected FailureAction failureAction;
    @XmlElementRef(name = "FailureModifier", namespace = "urn:rosettanet:specification:domain:Service:FailureModifier:xsd:codelist:01.02", type = FailureModifier.class)
    protected FailureModifier failureModifier;
    @XmlElementRef(name = "FailureObservedCondition", namespace = "urn:rosettanet:specification:domain:Service:FailureObservedCondition:xsd:codelist:01.02", type = FailureObservedCondition.class)
    protected FailureObservedCondition failureObservedCondition;
    @XmlElementRef(name = "OperatingSystem", namespace = "urn:rosettanet:specification:domain:Service:OperatingSystem:xsd:codelist:01.02", type = OperatingSystem.class)
    protected OperatingSystem operatingSystem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the failureAction property.
     * 
     * @return
     *     possible object is
     *     {@link FailureAction }
     *     
     */
    public FailureAction getFailureAction() {
        return failureAction;
    }

    /**
     * Sets the value of the failureAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureAction }
     *     
     */
    public void setFailureAction(FailureAction value) {
        this.failureAction = value;
    }

    /**
     * Gets the value of the failureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link FailureModifier }
     *     
     */
    public FailureModifier getFailureModifier() {
        return failureModifier;
    }

    /**
     * Sets the value of the failureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureModifier }
     *     
     */
    public void setFailureModifier(FailureModifier value) {
        this.failureModifier = value;
    }

    /**
     * Gets the value of the failureObservedCondition property.
     * 
     * @return
     *     possible object is
     *     {@link FailureObservedCondition }
     *     
     */
    public FailureObservedCondition getFailureObservedCondition() {
        return failureObservedCondition;
    }

    /**
     * Sets the value of the failureObservedCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureObservedCondition }
     *     
     */
    public void setFailureObservedCondition(FailureObservedCondition value) {
        this.failureObservedCondition = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystem }
     *     
     */
    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystem }
     *     
     */
    public void setOperatingSystem(OperatingSystem value) {
        this.operatingSystem = value;
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
        final FailureAnalysisType that = ((FailureAnalysisType) object);
        {
            FailureAction lhsFailureAction;
            lhsFailureAction = this.getFailureAction();
            FailureAction rhsFailureAction;
            rhsFailureAction = that.getFailureAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failureAction", lhsFailureAction), LocatorUtils.property(thatLocator, "failureAction", rhsFailureAction), lhsFailureAction, rhsFailureAction, (this.failureAction!= null), (that.failureAction!= null))) {
                return false;
            }
        }
        {
            FailureModifier lhsFailureModifier;
            lhsFailureModifier = this.getFailureModifier();
            FailureModifier rhsFailureModifier;
            rhsFailureModifier = that.getFailureModifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failureModifier", lhsFailureModifier), LocatorUtils.property(thatLocator, "failureModifier", rhsFailureModifier), lhsFailureModifier, rhsFailureModifier, (this.failureModifier!= null), (that.failureModifier!= null))) {
                return false;
            }
        }
        {
            FailureObservedCondition lhsFailureObservedCondition;
            lhsFailureObservedCondition = this.getFailureObservedCondition();
            FailureObservedCondition rhsFailureObservedCondition;
            rhsFailureObservedCondition = that.getFailureObservedCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failureObservedCondition", lhsFailureObservedCondition), LocatorUtils.property(thatLocator, "failureObservedCondition", rhsFailureObservedCondition), lhsFailureObservedCondition, rhsFailureObservedCondition, (this.failureObservedCondition!= null), (that.failureObservedCondition!= null))) {
                return false;
            }
        }
        {
            OperatingSystem lhsOperatingSystem;
            lhsOperatingSystem = this.getOperatingSystem();
            OperatingSystem rhsOperatingSystem;
            rhsOperatingSystem = that.getOperatingSystem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operatingSystem", lhsOperatingSystem), LocatorUtils.property(thatLocator, "operatingSystem", rhsOperatingSystem), lhsOperatingSystem, rhsOperatingSystem, (this.operatingSystem!= null), (that.operatingSystem!= null))) {
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
            FailureAction theFailureAction;
            theFailureAction = this.getFailureAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failureAction", theFailureAction), currentHashCode, theFailureAction, (this.failureAction!= null));
        }
        {
            FailureModifier theFailureModifier;
            theFailureModifier = this.getFailureModifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failureModifier", theFailureModifier), currentHashCode, theFailureModifier, (this.failureModifier!= null));
        }
        {
            FailureObservedCondition theFailureObservedCondition;
            theFailureObservedCondition = this.getFailureObservedCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failureObservedCondition", theFailureObservedCondition), currentHashCode, theFailureObservedCondition, (this.failureObservedCondition!= null));
        }
        {
            OperatingSystem theOperatingSystem;
            theOperatingSystem = this.getOperatingSystem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operatingSystem", theOperatingSystem), currentHashCode, theOperatingSystem, (this.operatingSystem!= null));
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
            FailureAction theFailureAction;
            theFailureAction = this.getFailureAction();
            strategy.appendField(locator, this, "failureAction", buffer, theFailureAction, (this.failureAction!= null));
        }
        {
            FailureModifier theFailureModifier;
            theFailureModifier = this.getFailureModifier();
            strategy.appendField(locator, this, "failureModifier", buffer, theFailureModifier, (this.failureModifier!= null));
        }
        {
            FailureObservedCondition theFailureObservedCondition;
            theFailureObservedCondition = this.getFailureObservedCondition();
            strategy.appendField(locator, this, "failureObservedCondition", buffer, theFailureObservedCondition, (this.failureObservedCondition!= null));
        }
        {
            OperatingSystem theOperatingSystem;
            theOperatingSystem = this.getOperatingSystem();
            strategy.appendField(locator, this, "operatingSystem", buffer, theOperatingSystem, (this.operatingSystem!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
