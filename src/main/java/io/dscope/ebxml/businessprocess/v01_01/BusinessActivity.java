
package io.dscope.ebxml.businessprocess.v01_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for BusinessActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="fromRole" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fromRoleIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="toRole" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="toRoleIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="beginsWhen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="endsWhen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="preCondition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="postCondition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessActivity")
@XmlSeeAlso({
    CollaborationActivity.class,
    BusinessTransactionActivity.class
})
public class BusinessActivity implements Equals2, HashCode2, ToString2
{

    @XmlAttribute(name = "fromRole", required = true)
    protected String fromRole;
    @XmlAttribute(name = "fromRoleIDREF")
    protected String fromRoleIDREF;
    @XmlAttribute(name = "toRole", required = true)
    protected String toRole;
    @XmlAttribute(name = "toRoleIDREF")
    protected String toRoleIDREF;
    @XmlAttribute(name = "beginsWhen")
    protected String beginsWhen;
    @XmlAttribute(name = "endsWhen")
    protected String endsWhen;
    @XmlAttribute(name = "preCondition")
    protected String preCondition;
    @XmlAttribute(name = "postCondition")
    protected String postCondition;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "nameID", required = true)
    protected String nameID;

    /**
     * Gets the value of the fromRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromRole() {
        return fromRole;
    }

    /**
     * Sets the value of the fromRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromRole(String value) {
        this.fromRole = value;
    }

    /**
     * Gets the value of the fromRoleIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromRoleIDREF() {
        return fromRoleIDREF;
    }

    /**
     * Sets the value of the fromRoleIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromRoleIDREF(String value) {
        this.fromRoleIDREF = value;
    }

    /**
     * Gets the value of the toRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRole() {
        return toRole;
    }

    /**
     * Sets the value of the toRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRole(String value) {
        this.toRole = value;
    }

    /**
     * Gets the value of the toRoleIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRoleIDREF() {
        return toRoleIDREF;
    }

    /**
     * Sets the value of the toRoleIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRoleIDREF(String value) {
        this.toRoleIDREF = value;
    }

    /**
     * Gets the value of the beginsWhen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginsWhen() {
        return beginsWhen;
    }

    /**
     * Sets the value of the beginsWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginsWhen(String value) {
        this.beginsWhen = value;
    }

    /**
     * Gets the value of the endsWhen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndsWhen() {
        return endsWhen;
    }

    /**
     * Sets the value of the endsWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndsWhen(String value) {
        this.endsWhen = value;
    }

    /**
     * Gets the value of the preCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreCondition() {
        return preCondition;
    }

    /**
     * Sets the value of the preCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreCondition(String value) {
        this.preCondition = value;
    }

    /**
     * Gets the value of the postCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCondition() {
        return postCondition;
    }

    /**
     * Sets the value of the postCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCondition(String value) {
        this.postCondition = value;
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
        final BusinessActivity that = ((BusinessActivity) object);
        {
            String lhsFromRole;
            lhsFromRole = this.getFromRole();
            String rhsFromRole;
            rhsFromRole = that.getFromRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromRole", lhsFromRole), LocatorUtils.property(thatLocator, "fromRole", rhsFromRole), lhsFromRole, rhsFromRole, (this.fromRole!= null), (that.fromRole!= null))) {
                return false;
            }
        }
        {
            String lhsFromRoleIDREF;
            lhsFromRoleIDREF = this.getFromRoleIDREF();
            String rhsFromRoleIDREF;
            rhsFromRoleIDREF = that.getFromRoleIDREF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromRoleIDREF", lhsFromRoleIDREF), LocatorUtils.property(thatLocator, "fromRoleIDREF", rhsFromRoleIDREF), lhsFromRoleIDREF, rhsFromRoleIDREF, (this.fromRoleIDREF!= null), (that.fromRoleIDREF!= null))) {
                return false;
            }
        }
        {
            String lhsToRole;
            lhsToRole = this.getToRole();
            String rhsToRole;
            rhsToRole = that.getToRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toRole", lhsToRole), LocatorUtils.property(thatLocator, "toRole", rhsToRole), lhsToRole, rhsToRole, (this.toRole!= null), (that.toRole!= null))) {
                return false;
            }
        }
        {
            String lhsToRoleIDREF;
            lhsToRoleIDREF = this.getToRoleIDREF();
            String rhsToRoleIDREF;
            rhsToRoleIDREF = that.getToRoleIDREF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toRoleIDREF", lhsToRoleIDREF), LocatorUtils.property(thatLocator, "toRoleIDREF", rhsToRoleIDREF), lhsToRoleIDREF, rhsToRoleIDREF, (this.toRoleIDREF!= null), (that.toRoleIDREF!= null))) {
                return false;
            }
        }
        {
            String lhsBeginsWhen;
            lhsBeginsWhen = this.getBeginsWhen();
            String rhsBeginsWhen;
            rhsBeginsWhen = that.getBeginsWhen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beginsWhen", lhsBeginsWhen), LocatorUtils.property(thatLocator, "beginsWhen", rhsBeginsWhen), lhsBeginsWhen, rhsBeginsWhen, (this.beginsWhen!= null), (that.beginsWhen!= null))) {
                return false;
            }
        }
        {
            String lhsEndsWhen;
            lhsEndsWhen = this.getEndsWhen();
            String rhsEndsWhen;
            rhsEndsWhen = that.getEndsWhen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endsWhen", lhsEndsWhen), LocatorUtils.property(thatLocator, "endsWhen", rhsEndsWhen), lhsEndsWhen, rhsEndsWhen, (this.endsWhen!= null), (that.endsWhen!= null))) {
                return false;
            }
        }
        {
            String lhsPreCondition;
            lhsPreCondition = this.getPreCondition();
            String rhsPreCondition;
            rhsPreCondition = that.getPreCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preCondition", lhsPreCondition), LocatorUtils.property(thatLocator, "preCondition", rhsPreCondition), lhsPreCondition, rhsPreCondition, (this.preCondition!= null), (that.preCondition!= null))) {
                return false;
            }
        }
        {
            String lhsPostCondition;
            lhsPostCondition = this.getPostCondition();
            String rhsPostCondition;
            rhsPostCondition = that.getPostCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postCondition", lhsPostCondition), LocatorUtils.property(thatLocator, "postCondition", rhsPostCondition), lhsPostCondition, rhsPostCondition, (this.postCondition!= null), (that.postCondition!= null))) {
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
            String theFromRole;
            theFromRole = this.getFromRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromRole", theFromRole), currentHashCode, theFromRole, (this.fromRole!= null));
        }
        {
            String theFromRoleIDREF;
            theFromRoleIDREF = this.getFromRoleIDREF();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromRoleIDREF", theFromRoleIDREF), currentHashCode, theFromRoleIDREF, (this.fromRoleIDREF!= null));
        }
        {
            String theToRole;
            theToRole = this.getToRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toRole", theToRole), currentHashCode, theToRole, (this.toRole!= null));
        }
        {
            String theToRoleIDREF;
            theToRoleIDREF = this.getToRoleIDREF();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toRoleIDREF", theToRoleIDREF), currentHashCode, theToRoleIDREF, (this.toRoleIDREF!= null));
        }
        {
            String theBeginsWhen;
            theBeginsWhen = this.getBeginsWhen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beginsWhen", theBeginsWhen), currentHashCode, theBeginsWhen, (this.beginsWhen!= null));
        }
        {
            String theEndsWhen;
            theEndsWhen = this.getEndsWhen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endsWhen", theEndsWhen), currentHashCode, theEndsWhen, (this.endsWhen!= null));
        }
        {
            String thePreCondition;
            thePreCondition = this.getPreCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preCondition", thePreCondition), currentHashCode, thePreCondition, (this.preCondition!= null));
        }
        {
            String thePostCondition;
            thePostCondition = this.getPostCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postCondition", thePostCondition), currentHashCode, thePostCondition, (this.postCondition!= null));
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
            String theFromRole;
            theFromRole = this.getFromRole();
            strategy.appendField(locator, this, "fromRole", buffer, theFromRole, (this.fromRole!= null));
        }
        {
            String theFromRoleIDREF;
            theFromRoleIDREF = this.getFromRoleIDREF();
            strategy.appendField(locator, this, "fromRoleIDREF", buffer, theFromRoleIDREF, (this.fromRoleIDREF!= null));
        }
        {
            String theToRole;
            theToRole = this.getToRole();
            strategy.appendField(locator, this, "toRole", buffer, theToRole, (this.toRole!= null));
        }
        {
            String theToRoleIDREF;
            theToRoleIDREF = this.getToRoleIDREF();
            strategy.appendField(locator, this, "toRoleIDREF", buffer, theToRoleIDREF, (this.toRoleIDREF!= null));
        }
        {
            String theBeginsWhen;
            theBeginsWhen = this.getBeginsWhen();
            strategy.appendField(locator, this, "beginsWhen", buffer, theBeginsWhen, (this.beginsWhen!= null));
        }
        {
            String theEndsWhen;
            theEndsWhen = this.getEndsWhen();
            strategy.appendField(locator, this, "endsWhen", buffer, theEndsWhen, (this.endsWhen!= null));
        }
        {
            String thePreCondition;
            thePreCondition = this.getPreCondition();
            strategy.appendField(locator, this, "preCondition", buffer, thePreCondition, (this.preCondition!= null));
        }
        {
            String thePostCondition;
            thePostCondition = this.getPostCondition();
            strategy.appendField(locator, this, "postCondition", buffer, thePostCondition, (this.postCondition!= null));
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
