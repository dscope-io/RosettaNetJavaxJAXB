
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_03;

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
 * <p>Java class for ValveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GovernanceBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Material" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OutletConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RFOSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ValveType", propOrder = {
    "governanceBody",
    "material",
    "outletConnection",
    "rfoSize"
})
public class ValveType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "GovernanceBody")
    protected String governanceBody;
    @XmlElement(name = "Material")
    protected String material;
    @XmlElement(name = "OutletConnection")
    protected String outletConnection;
    @XmlElement(name = "RFOSize")
    protected String rfoSize;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the governanceBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernanceBody() {
        return governanceBody;
    }

    /**
     * Sets the value of the governanceBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernanceBody(String value) {
        this.governanceBody = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the outletConnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutletConnection() {
        return outletConnection;
    }

    /**
     * Sets the value of the outletConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutletConnection(String value) {
        this.outletConnection = value;
    }

    /**
     * Gets the value of the rfoSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFOSize() {
        return rfoSize;
    }

    /**
     * Sets the value of the rfoSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFOSize(String value) {
        this.rfoSize = value;
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
        final ValveType that = ((ValveType) object);
        {
            String lhsGovernanceBody;
            lhsGovernanceBody = this.getGovernanceBody();
            String rhsGovernanceBody;
            rhsGovernanceBody = that.getGovernanceBody();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "governanceBody", lhsGovernanceBody), LocatorUtils.property(thatLocator, "governanceBody", rhsGovernanceBody), lhsGovernanceBody, rhsGovernanceBody, (this.governanceBody!= null), (that.governanceBody!= null))) {
                return false;
            }
        }
        {
            String lhsMaterial;
            lhsMaterial = this.getMaterial();
            String rhsMaterial;
            rhsMaterial = that.getMaterial();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "material", lhsMaterial), LocatorUtils.property(thatLocator, "material", rhsMaterial), lhsMaterial, rhsMaterial, (this.material!= null), (that.material!= null))) {
                return false;
            }
        }
        {
            String lhsOutletConnection;
            lhsOutletConnection = this.getOutletConnection();
            String rhsOutletConnection;
            rhsOutletConnection = that.getOutletConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outletConnection", lhsOutletConnection), LocatorUtils.property(thatLocator, "outletConnection", rhsOutletConnection), lhsOutletConnection, rhsOutletConnection, (this.outletConnection!= null), (that.outletConnection!= null))) {
                return false;
            }
        }
        {
            String lhsRFOSize;
            lhsRFOSize = this.getRFOSize();
            String rhsRFOSize;
            rhsRFOSize = that.getRFOSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rfoSize", lhsRFOSize), LocatorUtils.property(thatLocator, "rfoSize", rhsRFOSize), lhsRFOSize, rhsRFOSize, (this.rfoSize!= null), (that.rfoSize!= null))) {
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
            String theGovernanceBody;
            theGovernanceBody = this.getGovernanceBody();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "governanceBody", theGovernanceBody), currentHashCode, theGovernanceBody, (this.governanceBody!= null));
        }
        {
            String theMaterial;
            theMaterial = this.getMaterial();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "material", theMaterial), currentHashCode, theMaterial, (this.material!= null));
        }
        {
            String theOutletConnection;
            theOutletConnection = this.getOutletConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outletConnection", theOutletConnection), currentHashCode, theOutletConnection, (this.outletConnection!= null));
        }
        {
            String theRFOSize;
            theRFOSize = this.getRFOSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rfoSize", theRFOSize), currentHashCode, theRFOSize, (this.rfoSize!= null));
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
            String theGovernanceBody;
            theGovernanceBody = this.getGovernanceBody();
            strategy.appendField(locator, this, "governanceBody", buffer, theGovernanceBody, (this.governanceBody!= null));
        }
        {
            String theMaterial;
            theMaterial = this.getMaterial();
            strategy.appendField(locator, this, "material", buffer, theMaterial, (this.material!= null));
        }
        {
            String theOutletConnection;
            theOutletConnection = this.getOutletConnection();
            strategy.appendField(locator, this, "outletConnection", buffer, theOutletConnection, (this.outletConnection!= null));
        }
        {
            String theRFOSize;
            theRFOSize = this.getRFOSize();
            strategy.appendField(locator, this, "rfoSize", buffer, theRFOSize, (this.rfoSize!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
