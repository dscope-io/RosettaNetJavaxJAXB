
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_08;

import java.math.BigInteger;
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
import io.dscope.rosettanet.domain.logistics.codelist.packagetype.v01_03.PackageType;
import io.dscope.rosettanet.domain.manufacturing.codelist.devicepackagetype.v01_02.DevicePackageType;
import io.dscope.rosettanet.universal.physicaldimension.v01_01.LinearType;
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
 * <p>Java class for EngineeringInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EngineeringInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalDescription" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.08}AttachmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:DevicePackageType:xsd:codelist:01.02}DevicePackageType" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedDaysPerLayer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="PackageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageDimension" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.01}LinearType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:PackageType:xsd:codelist:01.03}PackageType" minOccurs="0"/&gt;
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
@XmlType(name = "EngineeringInformationType", propOrder = {
    "additionalDescription",
    "devicePackageType",
    "expectedDaysPerLayer",
    "packageDescription",
    "packageDimension",
    "packageType"
})
public class EngineeringInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AdditionalDescription")
    protected List<AttachmentType> additionalDescription;
    @XmlElementRef(name = "DevicePackageType", namespace = "urn:rosettanet:specification:domain:Manufacturing:DevicePackageType:xsd:codelist:01.02", type = DevicePackageType.class, required = false)
    protected DevicePackageType devicePackageType;
    @XmlElement(name = "ExpectedDaysPerLayer")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger expectedDaysPerLayer;
    @XmlElement(name = "PackageDescription")
    protected String packageDescription;
    @XmlElement(name = "PackageDimension")
    protected LinearType packageDimension;
    @XmlElementRef(name = "PackageType", namespace = "urn:rosettanet:specification:domain:Logistics:PackageType:xsd:codelist:01.03", type = PackageType.class, required = false)
    protected PackageType packageType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the additionalDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAdditionalDescription() {
        if (additionalDescription == null) {
            additionalDescription = new ArrayList<AttachmentType>();
        }
        return this.additionalDescription;
    }

    /**
     * Gets the value of the devicePackageType property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePackageType }
     *     
     */
    public DevicePackageType getDevicePackageType() {
        return devicePackageType;
    }

    /**
     * Sets the value of the devicePackageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePackageType }
     *     
     */
    public void setDevicePackageType(DevicePackageType value) {
        this.devicePackageType = value;
    }

    /**
     * Gets the value of the expectedDaysPerLayer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpectedDaysPerLayer() {
        return expectedDaysPerLayer;
    }

    /**
     * Sets the value of the expectedDaysPerLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpectedDaysPerLayer(BigInteger value) {
        this.expectedDaysPerLayer = value;
    }

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
     * Gets the value of the packageDimension property.
     * 
     * @return
     *     possible object is
     *     {@link LinearType }
     *     
     */
    public LinearType getPackageDimension() {
        return packageDimension;
    }

    /**
     * Sets the value of the packageDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearType }
     *     
     */
    public void setPackageDimension(LinearType value) {
        this.packageDimension = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackageType(PackageType value) {
        this.packageType = value;
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
        final EngineeringInformationType that = ((EngineeringInformationType) object);
        {
            List<AttachmentType> lhsAdditionalDescription;
            lhsAdditionalDescription = (((this.additionalDescription!= null)&&(!this.additionalDescription.isEmpty()))?this.getAdditionalDescription():null);
            List<AttachmentType> rhsAdditionalDescription;
            rhsAdditionalDescription = (((that.additionalDescription!= null)&&(!that.additionalDescription.isEmpty()))?that.getAdditionalDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalDescription", lhsAdditionalDescription), LocatorUtils.property(thatLocator, "additionalDescription", rhsAdditionalDescription), lhsAdditionalDescription, rhsAdditionalDescription, ((this.additionalDescription!= null)&&(!this.additionalDescription.isEmpty())), ((that.additionalDescription!= null)&&(!that.additionalDescription.isEmpty())))) {
                return false;
            }
        }
        {
            DevicePackageType lhsDevicePackageType;
            lhsDevicePackageType = this.getDevicePackageType();
            DevicePackageType rhsDevicePackageType;
            rhsDevicePackageType = that.getDevicePackageType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "devicePackageType", lhsDevicePackageType), LocatorUtils.property(thatLocator, "devicePackageType", rhsDevicePackageType), lhsDevicePackageType, rhsDevicePackageType, (this.devicePackageType!= null), (that.devicePackageType!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsExpectedDaysPerLayer;
            lhsExpectedDaysPerLayer = this.getExpectedDaysPerLayer();
            BigInteger rhsExpectedDaysPerLayer;
            rhsExpectedDaysPerLayer = that.getExpectedDaysPerLayer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedDaysPerLayer", lhsExpectedDaysPerLayer), LocatorUtils.property(thatLocator, "expectedDaysPerLayer", rhsExpectedDaysPerLayer), lhsExpectedDaysPerLayer, rhsExpectedDaysPerLayer, (this.expectedDaysPerLayer!= null), (that.expectedDaysPerLayer!= null))) {
                return false;
            }
        }
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
            LinearType lhsPackageDimension;
            lhsPackageDimension = this.getPackageDimension();
            LinearType rhsPackageDimension;
            rhsPackageDimension = that.getPackageDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageDimension", lhsPackageDimension), LocatorUtils.property(thatLocator, "packageDimension", rhsPackageDimension), lhsPackageDimension, rhsPackageDimension, (this.packageDimension!= null), (that.packageDimension!= null))) {
                return false;
            }
        }
        {
            PackageType lhsPackageType;
            lhsPackageType = this.getPackageType();
            PackageType rhsPackageType;
            rhsPackageType = that.getPackageType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageType", lhsPackageType), LocatorUtils.property(thatLocator, "packageType", rhsPackageType), lhsPackageType, rhsPackageType, (this.packageType!= null), (that.packageType!= null))) {
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
            List<AttachmentType> theAdditionalDescription;
            theAdditionalDescription = (((this.additionalDescription!= null)&&(!this.additionalDescription.isEmpty()))?this.getAdditionalDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalDescription", theAdditionalDescription), currentHashCode, theAdditionalDescription, ((this.additionalDescription!= null)&&(!this.additionalDescription.isEmpty())));
        }
        {
            DevicePackageType theDevicePackageType;
            theDevicePackageType = this.getDevicePackageType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "devicePackageType", theDevicePackageType), currentHashCode, theDevicePackageType, (this.devicePackageType!= null));
        }
        {
            BigInteger theExpectedDaysPerLayer;
            theExpectedDaysPerLayer = this.getExpectedDaysPerLayer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedDaysPerLayer", theExpectedDaysPerLayer), currentHashCode, theExpectedDaysPerLayer, (this.expectedDaysPerLayer!= null));
        }
        {
            String thePackageDescription;
            thePackageDescription = this.getPackageDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageDescription", thePackageDescription), currentHashCode, thePackageDescription, (this.packageDescription!= null));
        }
        {
            LinearType thePackageDimension;
            thePackageDimension = this.getPackageDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageDimension", thePackageDimension), currentHashCode, thePackageDimension, (this.packageDimension!= null));
        }
        {
            PackageType thePackageType;
            thePackageType = this.getPackageType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageType", thePackageType), currentHashCode, thePackageType, (this.packageType!= null));
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
            List<AttachmentType> theAdditionalDescription;
            theAdditionalDescription = (((this.additionalDescription!= null)&&(!this.additionalDescription.isEmpty()))?this.getAdditionalDescription():null);
            strategy.appendField(locator, this, "additionalDescription", buffer, theAdditionalDescription, ((this.additionalDescription!= null)&&(!this.additionalDescription.isEmpty())));
        }
        {
            DevicePackageType theDevicePackageType;
            theDevicePackageType = this.getDevicePackageType();
            strategy.appendField(locator, this, "devicePackageType", buffer, theDevicePackageType, (this.devicePackageType!= null));
        }
        {
            BigInteger theExpectedDaysPerLayer;
            theExpectedDaysPerLayer = this.getExpectedDaysPerLayer();
            strategy.appendField(locator, this, "expectedDaysPerLayer", buffer, theExpectedDaysPerLayer, (this.expectedDaysPerLayer!= null));
        }
        {
            String thePackageDescription;
            thePackageDescription = this.getPackageDescription();
            strategy.appendField(locator, this, "packageDescription", buffer, thePackageDescription, (this.packageDescription!= null));
        }
        {
            LinearType thePackageDimension;
            thePackageDimension = this.getPackageDimension();
            strategy.appendField(locator, this, "packageDimension", buffer, thePackageDimension, (this.packageDimension!= null));
        }
        {
            PackageType thePackageType;
            thePackageType = this.getPackageType();
            strategy.appendField(locator, this, "packageType", buffer, thePackageType, (this.packageType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
