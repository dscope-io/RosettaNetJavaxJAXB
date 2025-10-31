
package io.dscope.rosettanet.interchange.manufacturingworkordernotification.v02_02;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.devicetype.v01_03.DeviceType;
import io.dscope.rosettanet.domain.manufacturing.codelist.priority.v01_04.Priority;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27.WaferBacksideInformation;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;
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
 * <p>Java class for TargetDeviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetDeviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerLotNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerTargetDevice" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:DeviceType:xsd:codelist:01.03}DeviceType" minOccurs="0"/&gt;
 *         &lt;element name="IsTargetDeviceStatusEOL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:01.04}Priority" minOccurs="0"/&gt;
 *         &lt;element name="TargetDeviceLotNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VendorTargetDevice" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27}WaferBacksideInformation" minOccurs="0"/&gt;
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
@XmlType(name = "TargetDeviceType", propOrder = {
    "customerLotNumber",
    "customerTargetDevice",
    "deviceType",
    "isTargetDeviceStatusEOL",
    "priority",
    "targetDeviceLotNumber",
    "vendorTargetDevice",
    "waferBacksideInformation"
})
public class TargetDeviceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CustomerLotNumber")
    protected List<String> customerLotNumber;
    @XmlElement(name = "CustomerTargetDevice", required = true)
    protected ProductIdentificationType customerTargetDevice;
    @XmlElementRef(name = "DeviceType", namespace = "urn:rosettanet:specification:domain:Manufacturing:DeviceType:xsd:codelist:01.03", type = DeviceType.class, required = false)
    protected DeviceType deviceType;
    @XmlElement(name = "IsTargetDeviceStatusEOL")
    protected Boolean isTargetDeviceStatusEOL;
    @XmlElementRef(name = "Priority", namespace = "urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:01.04", type = Priority.class, required = false)
    protected Priority priority;
    @XmlElement(name = "TargetDeviceLotNumber")
    protected List<String> targetDeviceLotNumber;
    @XmlElement(name = "VendorTargetDevice")
    protected ProductIdentificationType vendorTargetDevice;
    @XmlElementRef(name = "WaferBacksideInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", type = WaferBacksideInformation.class, required = false)
    protected WaferBacksideInformation waferBacksideInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customerLotNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerLotNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerLotNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomerLotNumber() {
        if (customerLotNumber == null) {
            customerLotNumber = new ArrayList<String>();
        }
        return this.customerLotNumber;
    }

    /**
     * Gets the value of the customerTargetDevice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getCustomerTargetDevice() {
        return customerTargetDevice;
    }

    /**
     * Sets the value of the customerTargetDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setCustomerTargetDevice(ProductIdentificationType value) {
        this.customerTargetDevice = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     */
    public void setDeviceType(DeviceType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the isTargetDeviceStatusEOL property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTargetDeviceStatusEOL() {
        return isTargetDeviceStatusEOL;
    }

    /**
     * Sets the value of the isTargetDeviceStatusEOL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTargetDeviceStatusEOL(Boolean value) {
        this.isTargetDeviceStatusEOL = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the targetDeviceLotNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetDeviceLotNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetDeviceLotNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTargetDeviceLotNumber() {
        if (targetDeviceLotNumber == null) {
            targetDeviceLotNumber = new ArrayList<String>();
        }
        return this.targetDeviceLotNumber;
    }

    /**
     * Gets the value of the vendorTargetDevice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getVendorTargetDevice() {
        return vendorTargetDevice;
    }

    /**
     * Sets the value of the vendorTargetDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setVendorTargetDevice(ProductIdentificationType value) {
        this.vendorTargetDevice = value;
    }

    /**
     * Gets the value of the waferBacksideInformation property.
     * 
     * @return
     *     possible object is
     *     {@link WaferBacksideInformation }
     *     
     */
    public WaferBacksideInformation getWaferBacksideInformation() {
        return waferBacksideInformation;
    }

    /**
     * Sets the value of the waferBacksideInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferBacksideInformation }
     *     
     */
    public void setWaferBacksideInformation(WaferBacksideInformation value) {
        this.waferBacksideInformation = value;
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
        final TargetDeviceType that = ((TargetDeviceType) object);
        {
            List<String> lhsCustomerLotNumber;
            lhsCustomerLotNumber = (((this.customerLotNumber!= null)&&(!this.customerLotNumber.isEmpty()))?this.getCustomerLotNumber():null);
            List<String> rhsCustomerLotNumber;
            rhsCustomerLotNumber = (((that.customerLotNumber!= null)&&(!that.customerLotNumber.isEmpty()))?that.getCustomerLotNumber():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerLotNumber", lhsCustomerLotNumber), LocatorUtils.property(thatLocator, "customerLotNumber", rhsCustomerLotNumber), lhsCustomerLotNumber, rhsCustomerLotNumber, ((this.customerLotNumber!= null)&&(!this.customerLotNumber.isEmpty())), ((that.customerLotNumber!= null)&&(!that.customerLotNumber.isEmpty())))) {
                return false;
            }
        }
        {
            ProductIdentificationType lhsCustomerTargetDevice;
            lhsCustomerTargetDevice = this.getCustomerTargetDevice();
            ProductIdentificationType rhsCustomerTargetDevice;
            rhsCustomerTargetDevice = that.getCustomerTargetDevice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerTargetDevice", lhsCustomerTargetDevice), LocatorUtils.property(thatLocator, "customerTargetDevice", rhsCustomerTargetDevice), lhsCustomerTargetDevice, rhsCustomerTargetDevice, (this.customerTargetDevice!= null), (that.customerTargetDevice!= null))) {
                return false;
            }
        }
        {
            DeviceType lhsDeviceType;
            lhsDeviceType = this.getDeviceType();
            DeviceType rhsDeviceType;
            rhsDeviceType = that.getDeviceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deviceType", lhsDeviceType), LocatorUtils.property(thatLocator, "deviceType", rhsDeviceType), lhsDeviceType, rhsDeviceType, (this.deviceType!= null), (that.deviceType!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsTargetDeviceStatusEOL;
            lhsIsTargetDeviceStatusEOL = this.isIsTargetDeviceStatusEOL();
            Boolean rhsIsTargetDeviceStatusEOL;
            rhsIsTargetDeviceStatusEOL = that.isIsTargetDeviceStatusEOL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isTargetDeviceStatusEOL", lhsIsTargetDeviceStatusEOL), LocatorUtils.property(thatLocator, "isTargetDeviceStatusEOL", rhsIsTargetDeviceStatusEOL), lhsIsTargetDeviceStatusEOL, rhsIsTargetDeviceStatusEOL, (this.isTargetDeviceStatusEOL!= null), (that.isTargetDeviceStatusEOL!= null))) {
                return false;
            }
        }
        {
            Priority lhsPriority;
            lhsPriority = this.getPriority();
            Priority rhsPriority;
            rhsPriority = that.getPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priority", lhsPriority), LocatorUtils.property(thatLocator, "priority", rhsPriority), lhsPriority, rhsPriority, (this.priority!= null), (that.priority!= null))) {
                return false;
            }
        }
        {
            List<String> lhsTargetDeviceLotNumber;
            lhsTargetDeviceLotNumber = (((this.targetDeviceLotNumber!= null)&&(!this.targetDeviceLotNumber.isEmpty()))?this.getTargetDeviceLotNumber():null);
            List<String> rhsTargetDeviceLotNumber;
            rhsTargetDeviceLotNumber = (((that.targetDeviceLotNumber!= null)&&(!that.targetDeviceLotNumber.isEmpty()))?that.getTargetDeviceLotNumber():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetDeviceLotNumber", lhsTargetDeviceLotNumber), LocatorUtils.property(thatLocator, "targetDeviceLotNumber", rhsTargetDeviceLotNumber), lhsTargetDeviceLotNumber, rhsTargetDeviceLotNumber, ((this.targetDeviceLotNumber!= null)&&(!this.targetDeviceLotNumber.isEmpty())), ((that.targetDeviceLotNumber!= null)&&(!that.targetDeviceLotNumber.isEmpty())))) {
                return false;
            }
        }
        {
            ProductIdentificationType lhsVendorTargetDevice;
            lhsVendorTargetDevice = this.getVendorTargetDevice();
            ProductIdentificationType rhsVendorTargetDevice;
            rhsVendorTargetDevice = that.getVendorTargetDevice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorTargetDevice", lhsVendorTargetDevice), LocatorUtils.property(thatLocator, "vendorTargetDevice", rhsVendorTargetDevice), lhsVendorTargetDevice, rhsVendorTargetDevice, (this.vendorTargetDevice!= null), (that.vendorTargetDevice!= null))) {
                return false;
            }
        }
        {
            WaferBacksideInformation lhsWaferBacksideInformation;
            lhsWaferBacksideInformation = this.getWaferBacksideInformation();
            WaferBacksideInformation rhsWaferBacksideInformation;
            rhsWaferBacksideInformation = that.getWaferBacksideInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferBacksideInformation", lhsWaferBacksideInformation), LocatorUtils.property(thatLocator, "waferBacksideInformation", rhsWaferBacksideInformation), lhsWaferBacksideInformation, rhsWaferBacksideInformation, (this.waferBacksideInformation!= null), (that.waferBacksideInformation!= null))) {
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
            List<String> theCustomerLotNumber;
            theCustomerLotNumber = (((this.customerLotNumber!= null)&&(!this.customerLotNumber.isEmpty()))?this.getCustomerLotNumber():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerLotNumber", theCustomerLotNumber), currentHashCode, theCustomerLotNumber, ((this.customerLotNumber!= null)&&(!this.customerLotNumber.isEmpty())));
        }
        {
            ProductIdentificationType theCustomerTargetDevice;
            theCustomerTargetDevice = this.getCustomerTargetDevice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerTargetDevice", theCustomerTargetDevice), currentHashCode, theCustomerTargetDevice, (this.customerTargetDevice!= null));
        }
        {
            DeviceType theDeviceType;
            theDeviceType = this.getDeviceType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deviceType", theDeviceType), currentHashCode, theDeviceType, (this.deviceType!= null));
        }
        {
            Boolean theIsTargetDeviceStatusEOL;
            theIsTargetDeviceStatusEOL = this.isIsTargetDeviceStatusEOL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isTargetDeviceStatusEOL", theIsTargetDeviceStatusEOL), currentHashCode, theIsTargetDeviceStatusEOL, (this.isTargetDeviceStatusEOL!= null));
        }
        {
            Priority thePriority;
            thePriority = this.getPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priority", thePriority), currentHashCode, thePriority, (this.priority!= null));
        }
        {
            List<String> theTargetDeviceLotNumber;
            theTargetDeviceLotNumber = (((this.targetDeviceLotNumber!= null)&&(!this.targetDeviceLotNumber.isEmpty()))?this.getTargetDeviceLotNumber():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetDeviceLotNumber", theTargetDeviceLotNumber), currentHashCode, theTargetDeviceLotNumber, ((this.targetDeviceLotNumber!= null)&&(!this.targetDeviceLotNumber.isEmpty())));
        }
        {
            ProductIdentificationType theVendorTargetDevice;
            theVendorTargetDevice = this.getVendorTargetDevice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorTargetDevice", theVendorTargetDevice), currentHashCode, theVendorTargetDevice, (this.vendorTargetDevice!= null));
        }
        {
            WaferBacksideInformation theWaferBacksideInformation;
            theWaferBacksideInformation = this.getWaferBacksideInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferBacksideInformation", theWaferBacksideInformation), currentHashCode, theWaferBacksideInformation, (this.waferBacksideInformation!= null));
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
            List<String> theCustomerLotNumber;
            theCustomerLotNumber = (((this.customerLotNumber!= null)&&(!this.customerLotNumber.isEmpty()))?this.getCustomerLotNumber():null);
            strategy.appendField(locator, this, "customerLotNumber", buffer, theCustomerLotNumber, ((this.customerLotNumber!= null)&&(!this.customerLotNumber.isEmpty())));
        }
        {
            ProductIdentificationType theCustomerTargetDevice;
            theCustomerTargetDevice = this.getCustomerTargetDevice();
            strategy.appendField(locator, this, "customerTargetDevice", buffer, theCustomerTargetDevice, (this.customerTargetDevice!= null));
        }
        {
            DeviceType theDeviceType;
            theDeviceType = this.getDeviceType();
            strategy.appendField(locator, this, "deviceType", buffer, theDeviceType, (this.deviceType!= null));
        }
        {
            Boolean theIsTargetDeviceStatusEOL;
            theIsTargetDeviceStatusEOL = this.isIsTargetDeviceStatusEOL();
            strategy.appendField(locator, this, "isTargetDeviceStatusEOL", buffer, theIsTargetDeviceStatusEOL, (this.isTargetDeviceStatusEOL!= null));
        }
        {
            Priority thePriority;
            thePriority = this.getPriority();
            strategy.appendField(locator, this, "priority", buffer, thePriority, (this.priority!= null));
        }
        {
            List<String> theTargetDeviceLotNumber;
            theTargetDeviceLotNumber = (((this.targetDeviceLotNumber!= null)&&(!this.targetDeviceLotNumber.isEmpty()))?this.getTargetDeviceLotNumber():null);
            strategy.appendField(locator, this, "targetDeviceLotNumber", buffer, theTargetDeviceLotNumber, ((this.targetDeviceLotNumber!= null)&&(!this.targetDeviceLotNumber.isEmpty())));
        }
        {
            ProductIdentificationType theVendorTargetDevice;
            theVendorTargetDevice = this.getVendorTargetDevice();
            strategy.appendField(locator, this, "vendorTargetDevice", buffer, theVendorTargetDevice, (this.vendorTargetDevice!= null));
        }
        {
            WaferBacksideInformation theWaferBacksideInformation;
            theWaferBacksideInformation = this.getWaferBacksideInformation();
            strategy.appendField(locator, this, "waferBacksideInformation", buffer, theWaferBacksideInformation, (this.waferBacksideInformation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
