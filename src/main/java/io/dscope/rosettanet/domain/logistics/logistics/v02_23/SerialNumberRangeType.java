
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

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
 * <p>Java class for SerialNumberRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerialNumberRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Increment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "SerialNumberRangeType", propOrder = {
    "firstSerialNumber",
    "increment",
    "lastSerialNumber",
    "sequenceNumber"
})
public class SerialNumberRangeType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "FirstSerialNumber", required = true)
    protected String firstSerialNumber;
    @XmlElement(name = "Increment", required = true)
    protected String increment;
    @XmlElement(name = "LastSerialNumber", required = true)
    protected String lastSerialNumber;
    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the firstSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstSerialNumber() {
        return firstSerialNumber;
    }

    /**
     * Sets the value of the firstSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstSerialNumber(String value) {
        this.firstSerialNumber = value;
    }

    /**
     * Gets the value of the increment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncrement() {
        return increment;
    }

    /**
     * Sets the value of the increment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncrement(String value) {
        this.increment = value;
    }

    /**
     * Gets the value of the lastSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSerialNumber() {
        return lastSerialNumber;
    }

    /**
     * Sets the value of the lastSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSerialNumber(String value) {
        this.lastSerialNumber = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
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
        final SerialNumberRangeType that = ((SerialNumberRangeType) object);
        {
            String lhsFirstSerialNumber;
            lhsFirstSerialNumber = this.getFirstSerialNumber();
            String rhsFirstSerialNumber;
            rhsFirstSerialNumber = that.getFirstSerialNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstSerialNumber", lhsFirstSerialNumber), LocatorUtils.property(thatLocator, "firstSerialNumber", rhsFirstSerialNumber), lhsFirstSerialNumber, rhsFirstSerialNumber, (this.firstSerialNumber!= null), (that.firstSerialNumber!= null))) {
                return false;
            }
        }
        {
            String lhsIncrement;
            lhsIncrement = this.getIncrement();
            String rhsIncrement;
            rhsIncrement = that.getIncrement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "increment", lhsIncrement), LocatorUtils.property(thatLocator, "increment", rhsIncrement), lhsIncrement, rhsIncrement, (this.increment!= null), (that.increment!= null))) {
                return false;
            }
        }
        {
            String lhsLastSerialNumber;
            lhsLastSerialNumber = this.getLastSerialNumber();
            String rhsLastSerialNumber;
            rhsLastSerialNumber = that.getLastSerialNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastSerialNumber", lhsLastSerialNumber), LocatorUtils.property(thatLocator, "lastSerialNumber", rhsLastSerialNumber), lhsLastSerialNumber, rhsLastSerialNumber, (this.lastSerialNumber!= null), (that.lastSerialNumber!= null))) {
                return false;
            }
        }
        {
            String lhsSequenceNumber;
            lhsSequenceNumber = this.getSequenceNumber();
            String rhsSequenceNumber;
            rhsSequenceNumber = that.getSequenceNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNumber", lhsSequenceNumber), LocatorUtils.property(thatLocator, "sequenceNumber", rhsSequenceNumber), lhsSequenceNumber, rhsSequenceNumber, (this.sequenceNumber!= null), (that.sequenceNumber!= null))) {
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
            String theFirstSerialNumber;
            theFirstSerialNumber = this.getFirstSerialNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstSerialNumber", theFirstSerialNumber), currentHashCode, theFirstSerialNumber, (this.firstSerialNumber!= null));
        }
        {
            String theIncrement;
            theIncrement = this.getIncrement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "increment", theIncrement), currentHashCode, theIncrement, (this.increment!= null));
        }
        {
            String theLastSerialNumber;
            theLastSerialNumber = this.getLastSerialNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastSerialNumber", theLastSerialNumber), currentHashCode, theLastSerialNumber, (this.lastSerialNumber!= null));
        }
        {
            String theSequenceNumber;
            theSequenceNumber = this.getSequenceNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumber", theSequenceNumber), currentHashCode, theSequenceNumber, (this.sequenceNumber!= null));
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
            String theFirstSerialNumber;
            theFirstSerialNumber = this.getFirstSerialNumber();
            strategy.appendField(locator, this, "firstSerialNumber", buffer, theFirstSerialNumber, (this.firstSerialNumber!= null));
        }
        {
            String theIncrement;
            theIncrement = this.getIncrement();
            strategy.appendField(locator, this, "increment", buffer, theIncrement, (this.increment!= null));
        }
        {
            String theLastSerialNumber;
            theLastSerialNumber = this.getLastSerialNumber();
            strategy.appendField(locator, this, "lastSerialNumber", buffer, theLastSerialNumber, (this.lastSerialNumber!= null));
        }
        {
            String theSequenceNumber;
            theSequenceNumber = this.getSequenceNumber();
            strategy.appendField(locator, this, "sequenceNumber", buffer, theSequenceNumber, (this.sequenceNumber!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
