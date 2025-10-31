
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}ConditionExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="fromBusinessState" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fromBusinessStateIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="conditionGuard"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="ProtocolSuccess"/&gt;
 *             &lt;enumeration value="AnyProtocolFailure"/&gt;
 *             &lt;enumeration value="RequestReceiptFailure"/&gt;
 *             &lt;enumeration value="RequestAcceptanceFailure"/&gt;
 *             &lt;enumeration value="ResponseReceiptFailure"/&gt;
 *             &lt;enumeration value="ResponseAcceptanceFailure"/&gt;
 *             &lt;enumeration value="SignalTimeout"/&gt;
 *             &lt;enumeration value="ResponseTimeout"/&gt;
 *             &lt;enumeration value="BusinessSuccess"/&gt;
 *             &lt;enumeration value="BusinessFailure"/&gt;
 *             &lt;enumeration value="Success"/&gt;
 *             &lt;enumeration value="Failure"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentation",
    "conditionExpression"
})
@XmlRootElement(name = "Success")
public class Success implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlElement(name = "ConditionExpression")
    protected ConditionExpression conditionExpression;
    @XmlAttribute(name = "fromBusinessState", required = true)
    protected String fromBusinessState;
    @XmlAttribute(name = "fromBusinessStateIDREF")
    protected String fromBusinessStateIDREF;
    @XmlAttribute(name = "conditionGuard")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String conditionGuard;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "nameID", required = true)
    protected String nameID;

    /**
     * Gets the value of the documentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Documentation }
     * 
     * 
     */
    public List<Documentation> getDocumentation() {
        if (documentation == null) {
            documentation = new ArrayList<Documentation>();
        }
        return this.documentation;
    }

    /**
     * Gets the value of the conditionExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionExpression }
     *     
     */
    public ConditionExpression getConditionExpression() {
        return conditionExpression;
    }

    /**
     * Sets the value of the conditionExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionExpression }
     *     
     */
    public void setConditionExpression(ConditionExpression value) {
        this.conditionExpression = value;
    }

    /**
     * Gets the value of the fromBusinessState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBusinessState() {
        return fromBusinessState;
    }

    /**
     * Sets the value of the fromBusinessState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBusinessState(String value) {
        this.fromBusinessState = value;
    }

    /**
     * Gets the value of the fromBusinessStateIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBusinessStateIDREF() {
        return fromBusinessStateIDREF;
    }

    /**
     * Sets the value of the fromBusinessStateIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBusinessStateIDREF(String value) {
        this.fromBusinessStateIDREF = value;
    }

    /**
     * Gets the value of the conditionGuard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionGuard() {
        return conditionGuard;
    }

    /**
     * Sets the value of the conditionGuard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionGuard(String value) {
        this.conditionGuard = value;
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
     * Gets the value of the nameID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameID() {
        return nameID;
    }

    /**
     * Sets the value of the nameID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameID(String value) {
        this.nameID = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Success that = ((Success) object);
        {
            List<Documentation> lhsDocumentation;
            lhsDocumentation = (((this.documentation!= null)&&(!this.documentation.isEmpty()))?this.getDocumentation():null);
            List<Documentation> rhsDocumentation;
            rhsDocumentation = (((that.documentation!= null)&&(!that.documentation.isEmpty()))?that.getDocumentation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentation", lhsDocumentation), LocatorUtils.property(thatLocator, "documentation", rhsDocumentation), lhsDocumentation, rhsDocumentation, ((this.documentation!= null)&&(!this.documentation.isEmpty())), ((that.documentation!= null)&&(!that.documentation.isEmpty())))) {
                return false;
            }
        }
        {
            ConditionExpression lhsConditionExpression;
            lhsConditionExpression = this.getConditionExpression();
            ConditionExpression rhsConditionExpression;
            rhsConditionExpression = that.getConditionExpression();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conditionExpression", lhsConditionExpression), LocatorUtils.property(thatLocator, "conditionExpression", rhsConditionExpression), lhsConditionExpression, rhsConditionExpression, (this.conditionExpression!= null), (that.conditionExpression!= null))) {
                return false;
            }
        }
        {
            String lhsFromBusinessState;
            lhsFromBusinessState = this.getFromBusinessState();
            String rhsFromBusinessState;
            rhsFromBusinessState = that.getFromBusinessState();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromBusinessState", lhsFromBusinessState), LocatorUtils.property(thatLocator, "fromBusinessState", rhsFromBusinessState), lhsFromBusinessState, rhsFromBusinessState, (this.fromBusinessState!= null), (that.fromBusinessState!= null))) {
                return false;
            }
        }
        {
            String lhsFromBusinessStateIDREF;
            lhsFromBusinessStateIDREF = this.getFromBusinessStateIDREF();
            String rhsFromBusinessStateIDREF;
            rhsFromBusinessStateIDREF = that.getFromBusinessStateIDREF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromBusinessStateIDREF", lhsFromBusinessStateIDREF), LocatorUtils.property(thatLocator, "fromBusinessStateIDREF", rhsFromBusinessStateIDREF), lhsFromBusinessStateIDREF, rhsFromBusinessStateIDREF, (this.fromBusinessStateIDREF!= null), (that.fromBusinessStateIDREF!= null))) {
                return false;
            }
        }
        {
            String lhsConditionGuard;
            lhsConditionGuard = this.getConditionGuard();
            String rhsConditionGuard;
            rhsConditionGuard = that.getConditionGuard();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conditionGuard", lhsConditionGuard), LocatorUtils.property(thatLocator, "conditionGuard", rhsConditionGuard), lhsConditionGuard, rhsConditionGuard, (this.conditionGuard!= null), (that.conditionGuard!= null))) {
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
            String lhsNameID;
            lhsNameID = this.getNameID();
            String rhsNameID;
            rhsNameID = that.getNameID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameID", lhsNameID), LocatorUtils.property(thatLocator, "nameID", rhsNameID), lhsNameID, rhsNameID, (this.nameID!= null), (that.nameID!= null))) {
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
            List<Documentation> theDocumentation;
            theDocumentation = (((this.documentation!= null)&&(!this.documentation.isEmpty()))?this.getDocumentation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentation", theDocumentation), currentHashCode, theDocumentation, ((this.documentation!= null)&&(!this.documentation.isEmpty())));
        }
        {
            ConditionExpression theConditionExpression;
            theConditionExpression = this.getConditionExpression();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conditionExpression", theConditionExpression), currentHashCode, theConditionExpression, (this.conditionExpression!= null));
        }
        {
            String theFromBusinessState;
            theFromBusinessState = this.getFromBusinessState();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromBusinessState", theFromBusinessState), currentHashCode, theFromBusinessState, (this.fromBusinessState!= null));
        }
        {
            String theFromBusinessStateIDREF;
            theFromBusinessStateIDREF = this.getFromBusinessStateIDREF();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromBusinessStateIDREF", theFromBusinessStateIDREF), currentHashCode, theFromBusinessStateIDREF, (this.fromBusinessStateIDREF!= null));
        }
        {
            String theConditionGuard;
            theConditionGuard = this.getConditionGuard();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conditionGuard", theConditionGuard), currentHashCode, theConditionGuard, (this.conditionGuard!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theNameID;
            theNameID = this.getNameID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameID", theNameID), currentHashCode, theNameID, (this.nameID!= null));
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
            List<Documentation> theDocumentation;
            theDocumentation = (((this.documentation!= null)&&(!this.documentation.isEmpty()))?this.getDocumentation():null);
            strategy.appendField(locator, this, "documentation", buffer, theDocumentation, ((this.documentation!= null)&&(!this.documentation.isEmpty())));
        }
        {
            ConditionExpression theConditionExpression;
            theConditionExpression = this.getConditionExpression();
            strategy.appendField(locator, this, "conditionExpression", buffer, theConditionExpression, (this.conditionExpression!= null));
        }
        {
            String theFromBusinessState;
            theFromBusinessState = this.getFromBusinessState();
            strategy.appendField(locator, this, "fromBusinessState", buffer, theFromBusinessState, (this.fromBusinessState!= null));
        }
        {
            String theFromBusinessStateIDREF;
            theFromBusinessStateIDREF = this.getFromBusinessStateIDREF();
            strategy.appendField(locator, this, "fromBusinessStateIDREF", buffer, theFromBusinessStateIDREF, (this.fromBusinessStateIDREF!= null));
        }
        {
            String theConditionGuard;
            theConditionGuard = this.getConditionGuard();
            strategy.appendField(locator, this, "conditionGuard", buffer, theConditionGuard, (this.conditionGuard!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theNameID;
            theNameID = this.getNameID();
            strategy.appendField(locator, this, "nameID", buffer, theNameID, (this.nameID!= null));
        }
        return buffer;
    }

}
