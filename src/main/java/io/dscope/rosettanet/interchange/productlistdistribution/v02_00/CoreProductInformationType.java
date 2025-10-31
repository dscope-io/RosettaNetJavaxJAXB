
package io.dscope.rosettanet.interchange.productlistdistribution.v02_00;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for CoreProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceProductInformation" type="{urn:rosettanet:specification:interchange:ProductListDistribution:xsd:schema:02.00}DeviceProductInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EligibleProductInformation" type="{urn:rosettanet:specification:interchange:ProductListDistribution:xsd:schema:02.00}EligibleProductInformationType"/&gt;
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
@XmlType(name = "CoreProductInformationType", propOrder = {
    "deviceProductInformation",
    "eligibleProductInformation"
})
public class CoreProductInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DeviceProductInformation")
    protected List<DeviceProductInformationType> deviceProductInformation;
    @XmlElement(name = "EligibleProductInformation", required = true)
    protected EligibleProductInformationType eligibleProductInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the deviceProductInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceProductInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceProductInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceProductInformationType }
     * 
     * 
     */
    public List<DeviceProductInformationType> getDeviceProductInformation() {
        if (deviceProductInformation == null) {
            deviceProductInformation = new ArrayList<DeviceProductInformationType>();
        }
        return this.deviceProductInformation;
    }

    /**
     * Gets the value of the eligibleProductInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EligibleProductInformationType }
     *     
     */
    public EligibleProductInformationType getEligibleProductInformation() {
        return eligibleProductInformation;
    }

    /**
     * Sets the value of the eligibleProductInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibleProductInformationType }
     *     
     */
    public void setEligibleProductInformation(EligibleProductInformationType value) {
        this.eligibleProductInformation = value;
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
        final CoreProductInformationType that = ((CoreProductInformationType) object);
        {
            List<DeviceProductInformationType> lhsDeviceProductInformation;
            lhsDeviceProductInformation = (((this.deviceProductInformation!= null)&&(!this.deviceProductInformation.isEmpty()))?this.getDeviceProductInformation():null);
            List<DeviceProductInformationType> rhsDeviceProductInformation;
            rhsDeviceProductInformation = (((that.deviceProductInformation!= null)&&(!that.deviceProductInformation.isEmpty()))?that.getDeviceProductInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deviceProductInformation", lhsDeviceProductInformation), LocatorUtils.property(thatLocator, "deviceProductInformation", rhsDeviceProductInformation), lhsDeviceProductInformation, rhsDeviceProductInformation, ((this.deviceProductInformation!= null)&&(!this.deviceProductInformation.isEmpty())), ((that.deviceProductInformation!= null)&&(!that.deviceProductInformation.isEmpty())))) {
                return false;
            }
        }
        {
            EligibleProductInformationType lhsEligibleProductInformation;
            lhsEligibleProductInformation = this.getEligibleProductInformation();
            EligibleProductInformationType rhsEligibleProductInformation;
            rhsEligibleProductInformation = that.getEligibleProductInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eligibleProductInformation", lhsEligibleProductInformation), LocatorUtils.property(thatLocator, "eligibleProductInformation", rhsEligibleProductInformation), lhsEligibleProductInformation, rhsEligibleProductInformation, (this.eligibleProductInformation!= null), (that.eligibleProductInformation!= null))) {
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
            List<DeviceProductInformationType> theDeviceProductInformation;
            theDeviceProductInformation = (((this.deviceProductInformation!= null)&&(!this.deviceProductInformation.isEmpty()))?this.getDeviceProductInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deviceProductInformation", theDeviceProductInformation), currentHashCode, theDeviceProductInformation, ((this.deviceProductInformation!= null)&&(!this.deviceProductInformation.isEmpty())));
        }
        {
            EligibleProductInformationType theEligibleProductInformation;
            theEligibleProductInformation = this.getEligibleProductInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eligibleProductInformation", theEligibleProductInformation), currentHashCode, theEligibleProductInformation, (this.eligibleProductInformation!= null));
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
            List<DeviceProductInformationType> theDeviceProductInformation;
            theDeviceProductInformation = (((this.deviceProductInformation!= null)&&(!this.deviceProductInformation.isEmpty()))?this.getDeviceProductInformation():null);
            strategy.appendField(locator, this, "deviceProductInformation", buffer, theDeviceProductInformation, ((this.deviceProductInformation!= null)&&(!this.deviceProductInformation.isEmpty())));
        }
        {
            EligibleProductInformationType theEligibleProductInformation;
            theEligibleProductInformation = this.getEligibleProductInformation();
            strategy.appendField(locator, this, "eligibleProductInformation", buffer, theEligibleProductInformation, (this.eligibleProductInformation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
