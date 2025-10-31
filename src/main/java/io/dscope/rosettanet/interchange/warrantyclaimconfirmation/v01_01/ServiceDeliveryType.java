
package io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02.ServiceDeliveryMethodType;
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
 * <p>Java class for ServiceDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApprovedMethod" type="{urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02}ServiceDeliveryMethodType"/&gt;
 *         &lt;element name="IsRequestedMethodAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RequestedMethod" type="{urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02}ServiceDeliveryMethodType"/&gt;
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
@XmlType(name = "ServiceDeliveryType", propOrder = {
    "approvedMethod",
    "isRequestedMethodAllowed",
    "requestedMethod"
})
public class ServiceDeliveryType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ApprovedMethod", required = true)
    protected ServiceDeliveryMethodType approvedMethod;
    @XmlElement(name = "IsRequestedMethodAllowed")
    protected boolean isRequestedMethodAllowed;
    @XmlElement(name = "RequestedMethod", required = true)
    protected ServiceDeliveryMethodType requestedMethod;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the approvedMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public ServiceDeliveryMethodType getApprovedMethod() {
        return approvedMethod;
    }

    /**
     * Sets the value of the approvedMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public void setApprovedMethod(ServiceDeliveryMethodType value) {
        this.approvedMethod = value;
    }

    /**
     * Gets the value of the isRequestedMethodAllowed property.
     * 
     */
    public boolean isIsRequestedMethodAllowed() {
        return isRequestedMethodAllowed;
    }

    /**
     * Sets the value of the isRequestedMethodAllowed property.
     * 
     */
    public void setIsRequestedMethodAllowed(boolean value) {
        this.isRequestedMethodAllowed = value;
    }

    /**
     * Gets the value of the requestedMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public ServiceDeliveryMethodType getRequestedMethod() {
        return requestedMethod;
    }

    /**
     * Sets the value of the requestedMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public void setRequestedMethod(ServiceDeliveryMethodType value) {
        this.requestedMethod = value;
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
        final ServiceDeliveryType that = ((ServiceDeliveryType) object);
        {
            ServiceDeliveryMethodType lhsApprovedMethod;
            lhsApprovedMethod = this.getApprovedMethod();
            ServiceDeliveryMethodType rhsApprovedMethod;
            rhsApprovedMethod = that.getApprovedMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approvedMethod", lhsApprovedMethod), LocatorUtils.property(thatLocator, "approvedMethod", rhsApprovedMethod), lhsApprovedMethod, rhsApprovedMethod, (this.approvedMethod!= null), (that.approvedMethod!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsRequestedMethodAllowed;
            lhsIsRequestedMethodAllowed = this.isIsRequestedMethodAllowed();
            boolean rhsIsRequestedMethodAllowed;
            rhsIsRequestedMethodAllowed = that.isIsRequestedMethodAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRequestedMethodAllowed", lhsIsRequestedMethodAllowed), LocatorUtils.property(thatLocator, "isRequestedMethodAllowed", rhsIsRequestedMethodAllowed), lhsIsRequestedMethodAllowed, rhsIsRequestedMethodAllowed, true, true)) {
                return false;
            }
        }
        {
            ServiceDeliveryMethodType lhsRequestedMethod;
            lhsRequestedMethod = this.getRequestedMethod();
            ServiceDeliveryMethodType rhsRequestedMethod;
            rhsRequestedMethod = that.getRequestedMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedMethod", lhsRequestedMethod), LocatorUtils.property(thatLocator, "requestedMethod", rhsRequestedMethod), lhsRequestedMethod, rhsRequestedMethod, (this.requestedMethod!= null), (that.requestedMethod!= null))) {
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
            ServiceDeliveryMethodType theApprovedMethod;
            theApprovedMethod = this.getApprovedMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approvedMethod", theApprovedMethod), currentHashCode, theApprovedMethod, (this.approvedMethod!= null));
        }
        {
            boolean theIsRequestedMethodAllowed;
            theIsRequestedMethodAllowed = this.isIsRequestedMethodAllowed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRequestedMethodAllowed", theIsRequestedMethodAllowed), currentHashCode, theIsRequestedMethodAllowed, true);
        }
        {
            ServiceDeliveryMethodType theRequestedMethod;
            theRequestedMethod = this.getRequestedMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedMethod", theRequestedMethod), currentHashCode, theRequestedMethod, (this.requestedMethod!= null));
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
            ServiceDeliveryMethodType theApprovedMethod;
            theApprovedMethod = this.getApprovedMethod();
            strategy.appendField(locator, this, "approvedMethod", buffer, theApprovedMethod, (this.approvedMethod!= null));
        }
        {
            boolean theIsRequestedMethodAllowed;
            theIsRequestedMethodAllowed = this.isIsRequestedMethodAllowed();
            strategy.appendField(locator, this, "isRequestedMethodAllowed", buffer, theIsRequestedMethodAllowed, true);
        }
        {
            ServiceDeliveryMethodType theRequestedMethod;
            theRequestedMethod = this.getRequestedMethod();
            strategy.appendField(locator, this, "requestedMethod", buffer, theRequestedMethod, (this.requestedMethod!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
