
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.physicaldimension.v01_05.LinearType;
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
 * <p>Java class for PackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalDimension" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.05}LinearType" minOccurs="0"/&gt;
 *         &lt;element name="PinCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "PackageType", propOrder = {
    "packageDescription",
    "packageFamily",
    "packageType",
    "physicalDimension",
    "pinCount"
})
public class PackageType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "PackageDescription")
    protected String packageDescription;
    @XmlElement(name = "PackageFamily")
    protected String packageFamily;
    @XmlElement(name = "PackageType")
    protected String packageType;
    @XmlElement(name = "PhysicalDimension")
    protected LinearType physicalDimension;
    @XmlElement(name = "PinCount")
    protected BigInteger pinCount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the packageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDescription() {
        return packageDescription;
    }

    /**
     * Sets the value of the packageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDescription(String value) {
        this.packageDescription = value;
    }

    /**
     * Gets the value of the packageFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageFamily() {
        return packageFamily;
    }

    /**
     * Sets the value of the packageFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageFamily(String value) {
        this.packageFamily = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageType(String value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the physicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link LinearType }
     *     
     */
    public LinearType getPhysicalDimension() {
        return physicalDimension;
    }

    /**
     * Sets the value of the physicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearType }
     *     
     */
    public void setPhysicalDimension(LinearType value) {
        this.physicalDimension = value;
    }

    /**
     * Gets the value of the pinCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPinCount() {
        return pinCount;
    }

    /**
     * Sets the value of the pinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPinCount(BigInteger value) {
        this.pinCount = value;
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
        final PackageType that = ((PackageType) object);
        {
            String lhsPackageDescription;
            lhsPackageDescription = this.getPackageDescription();
            String rhsPackageDescription;
            rhsPackageDescription = that.getPackageDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageDescription", lhsPackageDescription), LocatorUtils.property(thatLocator, "packageDescription", rhsPackageDescription), lhsPackageDescription, rhsPackageDescription, (this.packageDescription!= null), (that.packageDescription!= null))) {
                return false;
            }
        }
        {
            String lhsPackageFamily;
            lhsPackageFamily = this.getPackageFamily();
            String rhsPackageFamily;
            rhsPackageFamily = that.getPackageFamily();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageFamily", lhsPackageFamily), LocatorUtils.property(thatLocator, "packageFamily", rhsPackageFamily), lhsPackageFamily, rhsPackageFamily, (this.packageFamily!= null), (that.packageFamily!= null))) {
                return false;
            }
        }
        {
            String lhsPackageType;
            lhsPackageType = this.getPackageType();
            String rhsPackageType;
            rhsPackageType = that.getPackageType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageType", lhsPackageType), LocatorUtils.property(thatLocator, "packageType", rhsPackageType), lhsPackageType, rhsPackageType, (this.packageType!= null), (that.packageType!= null))) {
                return false;
            }
        }
        {
            LinearType lhsPhysicalDimension;
            lhsPhysicalDimension = this.getPhysicalDimension();
            LinearType rhsPhysicalDimension;
            rhsPhysicalDimension = that.getPhysicalDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "physicalDimension", lhsPhysicalDimension), LocatorUtils.property(thatLocator, "physicalDimension", rhsPhysicalDimension), lhsPhysicalDimension, rhsPhysicalDimension, (this.physicalDimension!= null), (that.physicalDimension!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsPinCount;
            lhsPinCount = this.getPinCount();
            BigInteger rhsPinCount;
            rhsPinCount = that.getPinCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pinCount", lhsPinCount), LocatorUtils.property(thatLocator, "pinCount", rhsPinCount), lhsPinCount, rhsPinCount, (this.pinCount!= null), (that.pinCount!= null))) {
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
            String thePackageDescription;
            thePackageDescription = this.getPackageDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageDescription", thePackageDescription), currentHashCode, thePackageDescription, (this.packageDescription!= null));
        }
        {
            String thePackageFamily;
            thePackageFamily = this.getPackageFamily();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageFamily", thePackageFamily), currentHashCode, thePackageFamily, (this.packageFamily!= null));
        }
        {
            String thePackageType;
            thePackageType = this.getPackageType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageType", thePackageType), currentHashCode, thePackageType, (this.packageType!= null));
        }
        {
            LinearType thePhysicalDimension;
            thePhysicalDimension = this.getPhysicalDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "physicalDimension", thePhysicalDimension), currentHashCode, thePhysicalDimension, (this.physicalDimension!= null));
        }
        {
            BigInteger thePinCount;
            thePinCount = this.getPinCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pinCount", thePinCount), currentHashCode, thePinCount, (this.pinCount!= null));
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
            String thePackageDescription;
            thePackageDescription = this.getPackageDescription();
            strategy.appendField(locator, this, "packageDescription", buffer, thePackageDescription, (this.packageDescription!= null));
        }
        {
            String thePackageFamily;
            thePackageFamily = this.getPackageFamily();
            strategy.appendField(locator, this, "packageFamily", buffer, thePackageFamily, (this.packageFamily!= null));
        }
        {
            String thePackageType;
            thePackageType = this.getPackageType();
            strategy.appendField(locator, this, "packageType", buffer, thePackageType, (this.packageType!= null));
        }
        {
            LinearType thePhysicalDimension;
            thePhysicalDimension = this.getPhysicalDimension();
            strategy.appendField(locator, this, "physicalDimension", buffer, thePhysicalDimension, (this.physicalDimension!= null));
        }
        {
            BigInteger thePinCount;
            thePinCount = this.getPinCount();
            strategy.appendField(locator, this, "pinCount", buffer, thePinCount, (this.pinCount!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
