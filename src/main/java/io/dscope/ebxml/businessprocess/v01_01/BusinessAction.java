
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
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
 * <p>Java class for BusinessAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="isAuthorizationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="isIntelligibleCheckRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="isNonRepudiationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="isNonRepudiationReceiptRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="timeToAcknowledgeReceipt" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="timeToAcknowledgeAcceptance" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessAction", propOrder = {
    "documentation"
})
@XmlSeeAlso({
    RespondingBusinessActivity.class,
    RequestingBusinessActivity.class
})
public class BusinessAction implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlAttribute(name = "isAuthorizationRequired")
    protected Boolean isAuthorizationRequired;
    @XmlAttribute(name = "isIntelligibleCheckRequired")
    protected Boolean isIntelligibleCheckRequired;
    @XmlAttribute(name = "isNonRepudiationRequired")
    protected Boolean isNonRepudiationRequired;
    @XmlAttribute(name = "isNonRepudiationReceiptRequired")
    protected Boolean isNonRepudiationReceiptRequired;
    @XmlAttribute(name = "timeToAcknowledgeReceipt")
    protected Duration timeToAcknowledgeReceipt;
    @XmlAttribute(name = "timeToAcknowledgeAcceptance")
    protected Duration timeToAcknowledgeAcceptance;
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
     * Gets the value of the isAuthorizationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsAuthorizationRequired() {
        if (isAuthorizationRequired == null) {
            return false;
        } else {
            return isAuthorizationRequired;
        }
    }

    /**
     * Sets the value of the isAuthorizationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAuthorizationRequired(Boolean value) {
        this.isAuthorizationRequired = value;
    }

    /**
     * Gets the value of the isIntelligibleCheckRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsIntelligibleCheckRequired() {
        if (isIntelligibleCheckRequired == null) {
            return false;
        } else {
            return isIntelligibleCheckRequired;
        }
    }

    /**
     * Sets the value of the isIntelligibleCheckRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntelligibleCheckRequired(Boolean value) {
        this.isIntelligibleCheckRequired = value;
    }

    /**
     * Gets the value of the isNonRepudiationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsNonRepudiationRequired() {
        if (isNonRepudiationRequired == null) {
            return false;
        } else {
            return isNonRepudiationRequired;
        }
    }

    /**
     * Sets the value of the isNonRepudiationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonRepudiationRequired(Boolean value) {
        this.isNonRepudiationRequired = value;
    }

    /**
     * Gets the value of the isNonRepudiationReceiptRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsNonRepudiationReceiptRequired() {
        if (isNonRepudiationReceiptRequired == null) {
            return false;
        } else {
            return isNonRepudiationReceiptRequired;
        }
    }

    /**
     * Sets the value of the isNonRepudiationReceiptRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonRepudiationReceiptRequired(Boolean value) {
        this.isNonRepudiationReceiptRequired = value;
    }

    /**
     * Gets the value of the timeToAcknowledgeReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeToAcknowledgeReceipt() {
        return timeToAcknowledgeReceipt;
    }

    /**
     * Sets the value of the timeToAcknowledgeReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeToAcknowledgeReceipt(Duration value) {
        this.timeToAcknowledgeReceipt = value;
    }

    /**
     * Gets the value of the timeToAcknowledgeAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeToAcknowledgeAcceptance() {
        return timeToAcknowledgeAcceptance;
    }

    /**
     * Sets the value of the timeToAcknowledgeAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeToAcknowledgeAcceptance(Duration value) {
        this.timeToAcknowledgeAcceptance = value;
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
        final BusinessAction that = ((BusinessAction) object);
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
            boolean lhsIsAuthorizationRequired;
            lhsIsAuthorizationRequired = ((this.isAuthorizationRequired!= null)?this.isIsAuthorizationRequired():false);
            boolean rhsIsAuthorizationRequired;
            rhsIsAuthorizationRequired = ((that.isAuthorizationRequired!= null)?that.isIsAuthorizationRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isAuthorizationRequired", lhsIsAuthorizationRequired), LocatorUtils.property(thatLocator, "isAuthorizationRequired", rhsIsAuthorizationRequired), lhsIsAuthorizationRequired, rhsIsAuthorizationRequired, (this.isAuthorizationRequired!= null), (that.isAuthorizationRequired!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsIntelligibleCheckRequired;
            lhsIsIntelligibleCheckRequired = ((this.isIntelligibleCheckRequired!= null)?this.isIsIntelligibleCheckRequired():false);
            boolean rhsIsIntelligibleCheckRequired;
            rhsIsIntelligibleCheckRequired = ((that.isIntelligibleCheckRequired!= null)?that.isIsIntelligibleCheckRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isIntelligibleCheckRequired", lhsIsIntelligibleCheckRequired), LocatorUtils.property(thatLocator, "isIntelligibleCheckRequired", rhsIsIntelligibleCheckRequired), lhsIsIntelligibleCheckRequired, rhsIsIntelligibleCheckRequired, (this.isIntelligibleCheckRequired!= null), (that.isIntelligibleCheckRequired!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsNonRepudiationRequired;
            lhsIsNonRepudiationRequired = ((this.isNonRepudiationRequired!= null)?this.isIsNonRepudiationRequired():false);
            boolean rhsIsNonRepudiationRequired;
            rhsIsNonRepudiationRequired = ((that.isNonRepudiationRequired!= null)?that.isIsNonRepudiationRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isNonRepudiationRequired", lhsIsNonRepudiationRequired), LocatorUtils.property(thatLocator, "isNonRepudiationRequired", rhsIsNonRepudiationRequired), lhsIsNonRepudiationRequired, rhsIsNonRepudiationRequired, (this.isNonRepudiationRequired!= null), (that.isNonRepudiationRequired!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsNonRepudiationReceiptRequired;
            lhsIsNonRepudiationReceiptRequired = ((this.isNonRepudiationReceiptRequired!= null)?this.isIsNonRepudiationReceiptRequired():false);
            boolean rhsIsNonRepudiationReceiptRequired;
            rhsIsNonRepudiationReceiptRequired = ((that.isNonRepudiationReceiptRequired!= null)?that.isIsNonRepudiationReceiptRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isNonRepudiationReceiptRequired", lhsIsNonRepudiationReceiptRequired), LocatorUtils.property(thatLocator, "isNonRepudiationReceiptRequired", rhsIsNonRepudiationReceiptRequired), lhsIsNonRepudiationReceiptRequired, rhsIsNonRepudiationReceiptRequired, (this.isNonRepudiationReceiptRequired!= null), (that.isNonRepudiationReceiptRequired!= null))) {
                return false;
            }
        }
        {
            Duration lhsTimeToAcknowledgeReceipt;
            lhsTimeToAcknowledgeReceipt = this.getTimeToAcknowledgeReceipt();
            Duration rhsTimeToAcknowledgeReceipt;
            rhsTimeToAcknowledgeReceipt = that.getTimeToAcknowledgeReceipt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeToAcknowledgeReceipt", lhsTimeToAcknowledgeReceipt), LocatorUtils.property(thatLocator, "timeToAcknowledgeReceipt", rhsTimeToAcknowledgeReceipt), lhsTimeToAcknowledgeReceipt, rhsTimeToAcknowledgeReceipt, (this.timeToAcknowledgeReceipt!= null), (that.timeToAcknowledgeReceipt!= null))) {
                return false;
            }
        }
        {
            Duration lhsTimeToAcknowledgeAcceptance;
            lhsTimeToAcknowledgeAcceptance = this.getTimeToAcknowledgeAcceptance();
            Duration rhsTimeToAcknowledgeAcceptance;
            rhsTimeToAcknowledgeAcceptance = that.getTimeToAcknowledgeAcceptance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeToAcknowledgeAcceptance", lhsTimeToAcknowledgeAcceptance), LocatorUtils.property(thatLocator, "timeToAcknowledgeAcceptance", rhsTimeToAcknowledgeAcceptance), lhsTimeToAcknowledgeAcceptance, rhsTimeToAcknowledgeAcceptance, (this.timeToAcknowledgeAcceptance!= null), (that.timeToAcknowledgeAcceptance!= null))) {
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
            boolean theIsAuthorizationRequired;
            theIsAuthorizationRequired = ((this.isAuthorizationRequired!= null)?this.isIsAuthorizationRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isAuthorizationRequired", theIsAuthorizationRequired), currentHashCode, theIsAuthorizationRequired, (this.isAuthorizationRequired!= null));
        }
        {
            boolean theIsIntelligibleCheckRequired;
            theIsIntelligibleCheckRequired = ((this.isIntelligibleCheckRequired!= null)?this.isIsIntelligibleCheckRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isIntelligibleCheckRequired", theIsIntelligibleCheckRequired), currentHashCode, theIsIntelligibleCheckRequired, (this.isIntelligibleCheckRequired!= null));
        }
        {
            boolean theIsNonRepudiationRequired;
            theIsNonRepudiationRequired = ((this.isNonRepudiationRequired!= null)?this.isIsNonRepudiationRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isNonRepudiationRequired", theIsNonRepudiationRequired), currentHashCode, theIsNonRepudiationRequired, (this.isNonRepudiationRequired!= null));
        }
        {
            boolean theIsNonRepudiationReceiptRequired;
            theIsNonRepudiationReceiptRequired = ((this.isNonRepudiationReceiptRequired!= null)?this.isIsNonRepudiationReceiptRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isNonRepudiationReceiptRequired", theIsNonRepudiationReceiptRequired), currentHashCode, theIsNonRepudiationReceiptRequired, (this.isNonRepudiationReceiptRequired!= null));
        }
        {
            Duration theTimeToAcknowledgeReceipt;
            theTimeToAcknowledgeReceipt = this.getTimeToAcknowledgeReceipt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeToAcknowledgeReceipt", theTimeToAcknowledgeReceipt), currentHashCode, theTimeToAcknowledgeReceipt, (this.timeToAcknowledgeReceipt!= null));
        }
        {
            Duration theTimeToAcknowledgeAcceptance;
            theTimeToAcknowledgeAcceptance = this.getTimeToAcknowledgeAcceptance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeToAcknowledgeAcceptance", theTimeToAcknowledgeAcceptance), currentHashCode, theTimeToAcknowledgeAcceptance, (this.timeToAcknowledgeAcceptance!= null));
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
            boolean theIsAuthorizationRequired;
            theIsAuthorizationRequired = ((this.isAuthorizationRequired!= null)?this.isIsAuthorizationRequired():false);
            strategy.appendField(locator, this, "isAuthorizationRequired", buffer, theIsAuthorizationRequired, (this.isAuthorizationRequired!= null));
        }
        {
            boolean theIsIntelligibleCheckRequired;
            theIsIntelligibleCheckRequired = ((this.isIntelligibleCheckRequired!= null)?this.isIsIntelligibleCheckRequired():false);
            strategy.appendField(locator, this, "isIntelligibleCheckRequired", buffer, theIsIntelligibleCheckRequired, (this.isIntelligibleCheckRequired!= null));
        }
        {
            boolean theIsNonRepudiationRequired;
            theIsNonRepudiationRequired = ((this.isNonRepudiationRequired!= null)?this.isIsNonRepudiationRequired():false);
            strategy.appendField(locator, this, "isNonRepudiationRequired", buffer, theIsNonRepudiationRequired, (this.isNonRepudiationRequired!= null));
        }
        {
            boolean theIsNonRepudiationReceiptRequired;
            theIsNonRepudiationReceiptRequired = ((this.isNonRepudiationReceiptRequired!= null)?this.isIsNonRepudiationReceiptRequired():false);
            strategy.appendField(locator, this, "isNonRepudiationReceiptRequired", buffer, theIsNonRepudiationReceiptRequired, (this.isNonRepudiationReceiptRequired!= null));
        }
        {
            Duration theTimeToAcknowledgeReceipt;
            theTimeToAcknowledgeReceipt = this.getTimeToAcknowledgeReceipt();
            strategy.appendField(locator, this, "timeToAcknowledgeReceipt", buffer, theTimeToAcknowledgeReceipt, (this.timeToAcknowledgeReceipt!= null));
        }
        {
            Duration theTimeToAcknowledgeAcceptance;
            theTimeToAcknowledgeAcceptance = this.getTimeToAcknowledgeAcceptance();
            strategy.appendField(locator, this, "timeToAcknowledgeAcceptance", buffer, theTimeToAcknowledgeAcceptance, (this.timeToAcknowledgeAcceptance!= null));
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
