
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
 * <p>Java class for PinInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChipPinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModulePinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Signal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PinInformationType", propOrder = {
    "chipPinName",
    "modulePinName",
    "pin",
    "signal"
})
public class PinInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ChipPinName")
    protected String chipPinName;
    @XmlElement(name = "ModulePinName")
    protected String modulePinName;
    @XmlElement(name = "Pin")
    protected BigInteger pin;
    @XmlElement(name = "Signal")
    protected String signal;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the chipPinName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipPinName() {
        return chipPinName;
    }

    /**
     * Sets the value of the chipPinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipPinName(String value) {
        this.chipPinName = value;
    }

    /**
     * Gets the value of the modulePinName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulePinName() {
        return modulePinName;
    }

    /**
     * Sets the value of the modulePinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulePinName(String value) {
        this.modulePinName = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPin(BigInteger value) {
        this.pin = value;
    }

    /**
     * Gets the value of the signal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignal() {
        return signal;
    }

    /**
     * Sets the value of the signal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignal(String value) {
        this.signal = value;
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
        final PinInformationType that = ((PinInformationType) object);
        {
            String lhsChipPinName;
            lhsChipPinName = this.getChipPinName();
            String rhsChipPinName;
            rhsChipPinName = that.getChipPinName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chipPinName", lhsChipPinName), LocatorUtils.property(thatLocator, "chipPinName", rhsChipPinName), lhsChipPinName, rhsChipPinName, (this.chipPinName!= null), (that.chipPinName!= null))) {
                return false;
            }
        }
        {
            String lhsModulePinName;
            lhsModulePinName = this.getModulePinName();
            String rhsModulePinName;
            rhsModulePinName = that.getModulePinName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modulePinName", lhsModulePinName), LocatorUtils.property(thatLocator, "modulePinName", rhsModulePinName), lhsModulePinName, rhsModulePinName, (this.modulePinName!= null), (that.modulePinName!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsPin;
            lhsPin = this.getPin();
            BigInteger rhsPin;
            rhsPin = that.getPin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pin", lhsPin), LocatorUtils.property(thatLocator, "pin", rhsPin), lhsPin, rhsPin, (this.pin!= null), (that.pin!= null))) {
                return false;
            }
        }
        {
            String lhsSignal;
            lhsSignal = this.getSignal();
            String rhsSignal;
            rhsSignal = that.getSignal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signal", lhsSignal), LocatorUtils.property(thatLocator, "signal", rhsSignal), lhsSignal, rhsSignal, (this.signal!= null), (that.signal!= null))) {
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
            String theChipPinName;
            theChipPinName = this.getChipPinName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chipPinName", theChipPinName), currentHashCode, theChipPinName, (this.chipPinName!= null));
        }
        {
            String theModulePinName;
            theModulePinName = this.getModulePinName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modulePinName", theModulePinName), currentHashCode, theModulePinName, (this.modulePinName!= null));
        }
        {
            BigInteger thePin;
            thePin = this.getPin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pin", thePin), currentHashCode, thePin, (this.pin!= null));
        }
        {
            String theSignal;
            theSignal = this.getSignal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signal", theSignal), currentHashCode, theSignal, (this.signal!= null));
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
            String theChipPinName;
            theChipPinName = this.getChipPinName();
            strategy.appendField(locator, this, "chipPinName", buffer, theChipPinName, (this.chipPinName!= null));
        }
        {
            String theModulePinName;
            theModulePinName = this.getModulePinName();
            strategy.appendField(locator, this, "modulePinName", buffer, theModulePinName, (this.modulePinName!= null));
        }
        {
            BigInteger thePin;
            thePin = this.getPin();
            strategy.appendField(locator, this, "pin", buffer, thePin, (this.pin!= null));
        }
        {
            String theSignal;
            theSignal = this.getSignal();
            strategy.appendField(locator, this, "signal", buffer, theSignal, (this.signal!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
