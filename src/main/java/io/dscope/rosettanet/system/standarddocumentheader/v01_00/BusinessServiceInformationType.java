
package io.dscope.rosettanet.system.standarddocumentheader.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for BusinessServiceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessServiceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProcessIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProcessReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProcessState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "BusinessServiceInformationType", propOrder = {
    "actionName",
    "processIdentifier",
    "processReference",
    "processState",
    "serviceName"
})
public class BusinessServiceInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ActionName", required = true)
    protected String actionName;
    @XmlElement(name = "ProcessIdentifier", required = true)
    protected String processIdentifier;
    @XmlElement(name = "ProcessReference")
    protected String processReference;
    @XmlElement(name = "ProcessState")
    protected String processState;
    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the value of the actionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    /**
     * Gets the value of the processIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessIdentifier() {
        return processIdentifier;
    }

    /**
     * Sets the value of the processIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessIdentifier(String value) {
        this.processIdentifier = value;
    }

    /**
     * Gets the value of the processReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessReference() {
        return processReference;
    }

    /**
     * Sets the value of the processReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessReference(String value) {
        this.processReference = value;
    }

    /**
     * Gets the value of the processState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessState() {
        return processState;
    }

    /**
     * Sets the value of the processState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessState(String value) {
        this.processState = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
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
        final BusinessServiceInformationType that = ((BusinessServiceInformationType) object);
        {
            String lhsActionName;
            lhsActionName = this.getActionName();
            String rhsActionName;
            rhsActionName = that.getActionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionName", lhsActionName), LocatorUtils.property(thatLocator, "actionName", rhsActionName), lhsActionName, rhsActionName, (this.actionName!= null), (that.actionName!= null))) {
                return false;
            }
        }
        {
            String lhsProcessIdentifier;
            lhsProcessIdentifier = this.getProcessIdentifier();
            String rhsProcessIdentifier;
            rhsProcessIdentifier = that.getProcessIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processIdentifier", lhsProcessIdentifier), LocatorUtils.property(thatLocator, "processIdentifier", rhsProcessIdentifier), lhsProcessIdentifier, rhsProcessIdentifier, (this.processIdentifier!= null), (that.processIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsProcessReference;
            lhsProcessReference = this.getProcessReference();
            String rhsProcessReference;
            rhsProcessReference = that.getProcessReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processReference", lhsProcessReference), LocatorUtils.property(thatLocator, "processReference", rhsProcessReference), lhsProcessReference, rhsProcessReference, (this.processReference!= null), (that.processReference!= null))) {
                return false;
            }
        }
        {
            String lhsProcessState;
            lhsProcessState = this.getProcessState();
            String rhsProcessState;
            rhsProcessState = that.getProcessState();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processState", lhsProcessState), LocatorUtils.property(thatLocator, "processState", rhsProcessState), lhsProcessState, rhsProcessState, (this.processState!= null), (that.processState!= null))) {
                return false;
            }
        }
        {
            String lhsServiceName;
            lhsServiceName = this.getServiceName();
            String rhsServiceName;
            rhsServiceName = that.getServiceName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceName", lhsServiceName), LocatorUtils.property(thatLocator, "serviceName", rhsServiceName), lhsServiceName, rhsServiceName, (this.serviceName!= null), (that.serviceName!= null))) {
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
            String theActionName;
            theActionName = this.getActionName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionName", theActionName), currentHashCode, theActionName, (this.actionName!= null));
        }
        {
            String theProcessIdentifier;
            theProcessIdentifier = this.getProcessIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processIdentifier", theProcessIdentifier), currentHashCode, theProcessIdentifier, (this.processIdentifier!= null));
        }
        {
            String theProcessReference;
            theProcessReference = this.getProcessReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processReference", theProcessReference), currentHashCode, theProcessReference, (this.processReference!= null));
        }
        {
            String theProcessState;
            theProcessState = this.getProcessState();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processState", theProcessState), currentHashCode, theProcessState, (this.processState!= null));
        }
        {
            String theServiceName;
            theServiceName = this.getServiceName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceName", theServiceName), currentHashCode, theServiceName, (this.serviceName!= null));
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
            String theActionName;
            theActionName = this.getActionName();
            strategy.appendField(locator, this, "actionName", buffer, theActionName, (this.actionName!= null));
        }
        {
            String theProcessIdentifier;
            theProcessIdentifier = this.getProcessIdentifier();
            strategy.appendField(locator, this, "processIdentifier", buffer, theProcessIdentifier, (this.processIdentifier!= null));
        }
        {
            String theProcessReference;
            theProcessReference = this.getProcessReference();
            strategy.appendField(locator, this, "processReference", buffer, theProcessReference, (this.processReference!= null));
        }
        {
            String theProcessState;
            theProcessState = this.getProcessState();
            strategy.appendField(locator, this, "processState", buffer, theProcessState, (this.processState!= null));
        }
        {
            String theServiceName;
            theServiceName = this.getServiceName();
            strategy.appendField(locator, this, "serviceName", buffer, theServiceName, (this.serviceName!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
