
package io.dscope.rosettanet.domain.design.design.v01_00;

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
import io.dscope.rosettanet.domain.design.codelist.actioncode.v01_00.ActionCode;
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
 * <p>Java class for DependentConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DependentConditionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01}ActionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}ActualValue" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DependentConditionType", propOrder = {
    "actionCode",
    "actualValue",
    "name"
})
public class DependentConditionType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ActionCode", namespace = "urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01", type = ActionCode.class, required = false)
    protected ActionCode actionCode;
    @XmlElementRef(name = "ActualValue", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = ActualValue.class)
    protected List<ActualValue> actualValue;
    @XmlElement(name = "Name")
    protected String name;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setActionCode(ActionCode value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the actualValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actualValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActualValue }
     * 
     * 
     */
    public List<ActualValue> getActualValue() {
        if (actualValue == null) {
            actualValue = new ArrayList<ActualValue>();
        }
        return this.actualValue;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
        final DependentConditionType that = ((DependentConditionType) object);
        {
            ActionCode lhsActionCode;
            lhsActionCode = this.getActionCode();
            ActionCode rhsActionCode;
            rhsActionCode = that.getActionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionCode", lhsActionCode), LocatorUtils.property(thatLocator, "actionCode", rhsActionCode), lhsActionCode, rhsActionCode, (this.actionCode!= null), (that.actionCode!= null))) {
                return false;
            }
        }
        {
            List<ActualValue> lhsActualValue;
            lhsActualValue = (((this.actualValue!= null)&&(!this.actualValue.isEmpty()))?this.getActualValue():null);
            List<ActualValue> rhsActualValue;
            rhsActualValue = (((that.actualValue!= null)&&(!that.actualValue.isEmpty()))?that.getActualValue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualValue", lhsActualValue), LocatorUtils.property(thatLocator, "actualValue", rhsActualValue), lhsActualValue, rhsActualValue, ((this.actualValue!= null)&&(!this.actualValue.isEmpty())), ((that.actualValue!= null)&&(!that.actualValue.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
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
            ActionCode theActionCode;
            theActionCode = this.getActionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionCode", theActionCode), currentHashCode, theActionCode, (this.actionCode!= null));
        }
        {
            List<ActualValue> theActualValue;
            theActualValue = (((this.actualValue!= null)&&(!this.actualValue.isEmpty()))?this.getActualValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualValue", theActualValue), currentHashCode, theActualValue, ((this.actualValue!= null)&&(!this.actualValue.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
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
            ActionCode theActionCode;
            theActionCode = this.getActionCode();
            strategy.appendField(locator, this, "actionCode", buffer, theActionCode, (this.actionCode!= null));
        }
        {
            List<ActualValue> theActualValue;
            theActualValue = (((this.actualValue!= null)&&(!this.actualValue.isEmpty()))?this.getActualValue():null);
            strategy.appendField(locator, this, "actualValue", buffer, theActualValue, ((this.actualValue!= null)&&(!this.actualValue.isEmpty())));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
