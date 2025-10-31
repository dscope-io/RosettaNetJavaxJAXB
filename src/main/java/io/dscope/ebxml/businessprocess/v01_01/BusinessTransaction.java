
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}RequestingBusinessActivity"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}RespondingBusinessActivity"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="isGuaranteedDeliveryRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
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
    "requestingBusinessActivity",
    "respondingBusinessActivity"
})
@XmlRootElement(name = "BusinessTransaction")
public class BusinessTransaction implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlElement(name = "RequestingBusinessActivity", required = true)
    protected RequestingBusinessActivity requestingBusinessActivity;
    @XmlElement(name = "RespondingBusinessActivity", required = true)
    protected RespondingBusinessActivity respondingBusinessActivity;
    @XmlAttribute(name = "pattern")
    @XmlSchemaType(name = "anyURI")
    protected String pattern;
    @XmlAttribute(name = "isGuaranteedDeliveryRequired")
    protected Boolean isGuaranteedDeliveryRequired;
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
     * Gets the value of the requestingBusinessActivity property.
     * 
     * @return
     *     possible object is
     *     {@link RequestingBusinessActivity }
     *     
     */
    public RequestingBusinessActivity getRequestingBusinessActivity() {
        return requestingBusinessActivity;
    }

    /**
     * Sets the value of the requestingBusinessActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestingBusinessActivity }
     *     
     */
    public void setRequestingBusinessActivity(RequestingBusinessActivity value) {
        this.requestingBusinessActivity = value;
    }

    /**
     * Gets the value of the respondingBusinessActivity property.
     * 
     * @return
     *     possible object is
     *     {@link RespondingBusinessActivity }
     *     
     */
    public RespondingBusinessActivity getRespondingBusinessActivity() {
        return respondingBusinessActivity;
    }

    /**
     * Sets the value of the respondingBusinessActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespondingBusinessActivity }
     *     
     */
    public void setRespondingBusinessActivity(RespondingBusinessActivity value) {
        this.respondingBusinessActivity = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the isGuaranteedDeliveryRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsGuaranteedDeliveryRequired() {
        if (isGuaranteedDeliveryRequired == null) {
            return false;
        } else {
            return isGuaranteedDeliveryRequired;
        }
    }

    /**
     * Sets the value of the isGuaranteedDeliveryRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGuaranteedDeliveryRequired(Boolean value) {
        this.isGuaranteedDeliveryRequired = value;
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
        final BusinessTransaction that = ((BusinessTransaction) object);
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
            RequestingBusinessActivity lhsRequestingBusinessActivity;
            lhsRequestingBusinessActivity = this.getRequestingBusinessActivity();
            RequestingBusinessActivity rhsRequestingBusinessActivity;
            rhsRequestingBusinessActivity = that.getRequestingBusinessActivity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestingBusinessActivity", lhsRequestingBusinessActivity), LocatorUtils.property(thatLocator, "requestingBusinessActivity", rhsRequestingBusinessActivity), lhsRequestingBusinessActivity, rhsRequestingBusinessActivity, (this.requestingBusinessActivity!= null), (that.requestingBusinessActivity!= null))) {
                return false;
            }
        }
        {
            RespondingBusinessActivity lhsRespondingBusinessActivity;
            lhsRespondingBusinessActivity = this.getRespondingBusinessActivity();
            RespondingBusinessActivity rhsRespondingBusinessActivity;
            rhsRespondingBusinessActivity = that.getRespondingBusinessActivity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "respondingBusinessActivity", lhsRespondingBusinessActivity), LocatorUtils.property(thatLocator, "respondingBusinessActivity", rhsRespondingBusinessActivity), lhsRespondingBusinessActivity, rhsRespondingBusinessActivity, (this.respondingBusinessActivity!= null), (that.respondingBusinessActivity!= null))) {
                return false;
            }
        }
        {
            String lhsPattern;
            lhsPattern = this.getPattern();
            String rhsPattern;
            rhsPattern = that.getPattern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pattern", lhsPattern), LocatorUtils.property(thatLocator, "pattern", rhsPattern), lhsPattern, rhsPattern, (this.pattern!= null), (that.pattern!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsGuaranteedDeliveryRequired;
            lhsIsGuaranteedDeliveryRequired = ((this.isGuaranteedDeliveryRequired!= null)?this.isIsGuaranteedDeliveryRequired():false);
            boolean rhsIsGuaranteedDeliveryRequired;
            rhsIsGuaranteedDeliveryRequired = ((that.isGuaranteedDeliveryRequired!= null)?that.isIsGuaranteedDeliveryRequired():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isGuaranteedDeliveryRequired", lhsIsGuaranteedDeliveryRequired), LocatorUtils.property(thatLocator, "isGuaranteedDeliveryRequired", rhsIsGuaranteedDeliveryRequired), lhsIsGuaranteedDeliveryRequired, rhsIsGuaranteedDeliveryRequired, (this.isGuaranteedDeliveryRequired!= null), (that.isGuaranteedDeliveryRequired!= null))) {
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
            RequestingBusinessActivity theRequestingBusinessActivity;
            theRequestingBusinessActivity = this.getRequestingBusinessActivity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestingBusinessActivity", theRequestingBusinessActivity), currentHashCode, theRequestingBusinessActivity, (this.requestingBusinessActivity!= null));
        }
        {
            RespondingBusinessActivity theRespondingBusinessActivity;
            theRespondingBusinessActivity = this.getRespondingBusinessActivity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "respondingBusinessActivity", theRespondingBusinessActivity), currentHashCode, theRespondingBusinessActivity, (this.respondingBusinessActivity!= null));
        }
        {
            String thePattern;
            thePattern = this.getPattern();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pattern", thePattern), currentHashCode, thePattern, (this.pattern!= null));
        }
        {
            boolean theIsGuaranteedDeliveryRequired;
            theIsGuaranteedDeliveryRequired = ((this.isGuaranteedDeliveryRequired!= null)?this.isIsGuaranteedDeliveryRequired():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isGuaranteedDeliveryRequired", theIsGuaranteedDeliveryRequired), currentHashCode, theIsGuaranteedDeliveryRequired, (this.isGuaranteedDeliveryRequired!= null));
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
            RequestingBusinessActivity theRequestingBusinessActivity;
            theRequestingBusinessActivity = this.getRequestingBusinessActivity();
            strategy.appendField(locator, this, "requestingBusinessActivity", buffer, theRequestingBusinessActivity, (this.requestingBusinessActivity!= null));
        }
        {
            RespondingBusinessActivity theRespondingBusinessActivity;
            theRespondingBusinessActivity = this.getRespondingBusinessActivity();
            strategy.appendField(locator, this, "respondingBusinessActivity", buffer, theRespondingBusinessActivity, (this.respondingBusinessActivity!= null));
        }
        {
            String thePattern;
            thePattern = this.getPattern();
            strategy.appendField(locator, this, "pattern", buffer, thePattern, (this.pattern!= null));
        }
        {
            boolean theIsGuaranteedDeliveryRequired;
            theIsGuaranteedDeliveryRequired = ((this.isGuaranteedDeliveryRequired!= null)?this.isIsGuaranteedDeliveryRequired():false);
            strategy.appendField(locator, this, "isGuaranteedDeliveryRequired", buffer, theIsGuaranteedDeliveryRequired, (this.isGuaranteedDeliveryRequired!= null));
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
