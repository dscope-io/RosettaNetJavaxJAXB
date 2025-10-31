
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.componenttype.v01_00.ComponentType;
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
 * <p>Java class for BuildInfoReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildInfoReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComponentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComponentLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComponentNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ComponentParentNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ComponentSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:ComponentType:xsd:codelist:01.00}ComponentType" minOccurs="0"/&gt;
 *         &lt;element name="UserSite" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "BuildInfoReportType", propOrder = {
    "componentDescription",
    "componentID",
    "componentLocation",
    "componentNumber",
    "componentParentNumber",
    "componentSerialNumber",
    "componentType",
    "userSite"
})
public class BuildInfoReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ComponentDescription")
    protected String componentDescription;
    @XmlElement(name = "ComponentID")
    protected String componentID;
    @XmlElement(name = "ComponentLocation")
    protected String componentLocation;
    @XmlElement(name = "ComponentNumber", required = true)
    protected BigInteger componentNumber;
    @XmlElement(name = "ComponentParentNumber")
    protected BigInteger componentParentNumber;
    @XmlElement(name = "ComponentSerialNumber")
    protected String componentSerialNumber;
    @XmlElementRef(name = "ComponentType", namespace = "urn:rosettanet:specification:domain:Manufacturing:ComponentType:xsd:codelist:01.00", type = ComponentType.class, required = false)
    protected ComponentType componentType;
    @XmlElement(name = "UserSite")
    protected BigInteger userSite;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the componentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentDescription() {
        return componentDescription;
    }

    /**
     * Sets the value of the componentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentDescription(String value) {
        this.componentDescription = value;
    }

    /**
     * Gets the value of the componentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentID() {
        return componentID;
    }

    /**
     * Sets the value of the componentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentID(String value) {
        this.componentID = value;
    }

    /**
     * Gets the value of the componentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentLocation() {
        return componentLocation;
    }

    /**
     * Sets the value of the componentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentLocation(String value) {
        this.componentLocation = value;
    }

    /**
     * Gets the value of the componentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentNumber() {
        return componentNumber;
    }

    /**
     * Sets the value of the componentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentNumber(BigInteger value) {
        this.componentNumber = value;
    }

    /**
     * Gets the value of the componentParentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentParentNumber() {
        return componentParentNumber;
    }

    /**
     * Sets the value of the componentParentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentParentNumber(BigInteger value) {
        this.componentParentNumber = value;
    }

    /**
     * Gets the value of the componentSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentSerialNumber() {
        return componentSerialNumber;
    }

    /**
     * Sets the value of the componentSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentSerialNumber(String value) {
        this.componentSerialNumber = value;
    }

    /**
     * Gets the value of the componentType property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentType }
     *     
     */
    public ComponentType getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentType }
     *     
     */
    public void setComponentType(ComponentType value) {
        this.componentType = value;
    }

    /**
     * Gets the value of the userSite property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserSite() {
        return userSite;
    }

    /**
     * Sets the value of the userSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserSite(BigInteger value) {
        this.userSite = value;
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
        final BuildInfoReportType that = ((BuildInfoReportType) object);
        {
            String lhsComponentDescription;
            lhsComponentDescription = this.getComponentDescription();
            String rhsComponentDescription;
            rhsComponentDescription = that.getComponentDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "componentDescription", lhsComponentDescription), LocatorUtils.property(thatLocator, "componentDescription", rhsComponentDescription), lhsComponentDescription, rhsComponentDescription, (this.componentDescription!= null), (that.componentDescription!= null))) {
                return false;
            }
        }
        {
            String lhsComponentID;
            lhsComponentID = this.getComponentID();
            String rhsComponentID;
            rhsComponentID = that.getComponentID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "componentID", lhsComponentID), LocatorUtils.property(thatLocator, "componentID", rhsComponentID), lhsComponentID, rhsComponentID, (this.componentID!= null), (that.componentID!= null))) {
                return false;
            }
        }
        {
            String lhsComponentLocation;
            lhsComponentLocation = this.getComponentLocation();
            String rhsComponentLocation;
            rhsComponentLocation = that.getComponentLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "componentLocation", lhsComponentLocation), LocatorUtils.property(thatLocator, "componentLocation", rhsComponentLocation), lhsComponentLocation, rhsComponentLocation, (this.componentLocation!= null), (that.componentLocation!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsComponentNumber;
            lhsComponentNumber = this.getComponentNumber();
            BigInteger rhsComponentNumber;
            rhsComponentNumber = that.getComponentNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "componentNumber", lhsComponentNumber), LocatorUtils.property(thatLocator, "componentNumber", rhsComponentNumber), lhsComponentNumber, rhsComponentNumber, (this.componentNumber!= null), (that.componentNumber!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsComponentParentNumber;
            lhsComponentParentNumber = this.getComponentParentNumber();
            BigInteger rhsComponentParentNumber;
            rhsComponentParentNumber = that.getComponentParentNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "componentParentNumber", lhsComponentParentNumber), LocatorUtils.property(thatLocator, "componentParentNumber", rhsComponentParentNumber), lhsComponentParentNumber, rhsComponentParentNumber, (this.componentParentNumber!= null), (that.componentParentNumber!= null))) {
                return false;
            }
        }
        {
            String lhsComponentSerialNumber;
            lhsComponentSerialNumber = this.getComponentSerialNumber();
            String rhsComponentSerialNumber;
            rhsComponentSerialNumber = that.getComponentSerialNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "componentSerialNumber", lhsComponentSerialNumber), LocatorUtils.property(thatLocator, "componentSerialNumber", rhsComponentSerialNumber), lhsComponentSerialNumber, rhsComponentSerialNumber, (this.componentSerialNumber!= null), (that.componentSerialNumber!= null))) {
                return false;
            }
        }
        {
            ComponentType lhsComponentType;
            lhsComponentType = this.getComponentType();
            ComponentType rhsComponentType;
            rhsComponentType = that.getComponentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "componentType", lhsComponentType), LocatorUtils.property(thatLocator, "componentType", rhsComponentType), lhsComponentType, rhsComponentType, (this.componentType!= null), (that.componentType!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsUserSite;
            lhsUserSite = this.getUserSite();
            BigInteger rhsUserSite;
            rhsUserSite = that.getUserSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userSite", lhsUserSite), LocatorUtils.property(thatLocator, "userSite", rhsUserSite), lhsUserSite, rhsUserSite, (this.userSite!= null), (that.userSite!= null))) {
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
            String theComponentDescription;
            theComponentDescription = this.getComponentDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "componentDescription", theComponentDescription), currentHashCode, theComponentDescription, (this.componentDescription!= null));
        }
        {
            String theComponentID;
            theComponentID = this.getComponentID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "componentID", theComponentID), currentHashCode, theComponentID, (this.componentID!= null));
        }
        {
            String theComponentLocation;
            theComponentLocation = this.getComponentLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "componentLocation", theComponentLocation), currentHashCode, theComponentLocation, (this.componentLocation!= null));
        }
        {
            BigInteger theComponentNumber;
            theComponentNumber = this.getComponentNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "componentNumber", theComponentNumber), currentHashCode, theComponentNumber, (this.componentNumber!= null));
        }
        {
            BigInteger theComponentParentNumber;
            theComponentParentNumber = this.getComponentParentNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "componentParentNumber", theComponentParentNumber), currentHashCode, theComponentParentNumber, (this.componentParentNumber!= null));
        }
        {
            String theComponentSerialNumber;
            theComponentSerialNumber = this.getComponentSerialNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "componentSerialNumber", theComponentSerialNumber), currentHashCode, theComponentSerialNumber, (this.componentSerialNumber!= null));
        }
        {
            ComponentType theComponentType;
            theComponentType = this.getComponentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "componentType", theComponentType), currentHashCode, theComponentType, (this.componentType!= null));
        }
        {
            BigInteger theUserSite;
            theUserSite = this.getUserSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userSite", theUserSite), currentHashCode, theUserSite, (this.userSite!= null));
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
            String theComponentDescription;
            theComponentDescription = this.getComponentDescription();
            strategy.appendField(locator, this, "componentDescription", buffer, theComponentDescription, (this.componentDescription!= null));
        }
        {
            String theComponentID;
            theComponentID = this.getComponentID();
            strategy.appendField(locator, this, "componentID", buffer, theComponentID, (this.componentID!= null));
        }
        {
            String theComponentLocation;
            theComponentLocation = this.getComponentLocation();
            strategy.appendField(locator, this, "componentLocation", buffer, theComponentLocation, (this.componentLocation!= null));
        }
        {
            BigInteger theComponentNumber;
            theComponentNumber = this.getComponentNumber();
            strategy.appendField(locator, this, "componentNumber", buffer, theComponentNumber, (this.componentNumber!= null));
        }
        {
            BigInteger theComponentParentNumber;
            theComponentParentNumber = this.getComponentParentNumber();
            strategy.appendField(locator, this, "componentParentNumber", buffer, theComponentParentNumber, (this.componentParentNumber!= null));
        }
        {
            String theComponentSerialNumber;
            theComponentSerialNumber = this.getComponentSerialNumber();
            strategy.appendField(locator, this, "componentSerialNumber", buffer, theComponentSerialNumber, (this.componentSerialNumber!= null));
        }
        {
            ComponentType theComponentType;
            theComponentType = this.getComponentType();
            strategy.appendField(locator, this, "componentType", buffer, theComponentType, (this.componentType!= null));
        }
        {
            BigInteger theUserSite;
            theUserSite = this.getUserSite();
            strategy.appendField(locator, this, "userSite", buffer, theUserSite, (this.userSite!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
