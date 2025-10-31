
package io.dscope.rosettanet.domain.service.service.v02_20;

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
 * <p>Java class for ReplacedPartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplacedPartType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AWBNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ReplacedPartType", propOrder = {
    "awbNumber",
    "description",
    "number",
    "serialNumber"
})
public class ReplacedPartType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AWBNumber")
    protected List<String> awbNumber;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "SerialNumber")
    protected List<String> serialNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the awbNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awbNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAWBNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAWBNumber() {
        if (awbNumber == null) {
            awbNumber = new ArrayList<String>();
        }
        return this.awbNumber;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSerialNumber() {
        if (serialNumber == null) {
            serialNumber = new ArrayList<String>();
        }
        return this.serialNumber;
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
        final ReplacedPartType that = ((ReplacedPartType) object);
        {
            List<String> lhsAWBNumber;
            lhsAWBNumber = (((this.awbNumber!= null)&&(!this.awbNumber.isEmpty()))?this.getAWBNumber():null);
            List<String> rhsAWBNumber;
            rhsAWBNumber = (((that.awbNumber!= null)&&(!that.awbNumber.isEmpty()))?that.getAWBNumber():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awbNumber", lhsAWBNumber), LocatorUtils.property(thatLocator, "awbNumber", rhsAWBNumber), lhsAWBNumber, rhsAWBNumber, ((this.awbNumber!= null)&&(!this.awbNumber.isEmpty())), ((that.awbNumber!= null)&&(!that.awbNumber.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            String lhsNumber;
            lhsNumber = this.getNumber();
            String rhsNumber;
            rhsNumber = that.getNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "number", lhsNumber), LocatorUtils.property(thatLocator, "number", rhsNumber), lhsNumber, rhsNumber, (this.number!= null), (that.number!= null))) {
                return false;
            }
        }
        {
            List<String> lhsSerialNumber;
            lhsSerialNumber = (((this.serialNumber!= null)&&(!this.serialNumber.isEmpty()))?this.getSerialNumber():null);
            List<String> rhsSerialNumber;
            rhsSerialNumber = (((that.serialNumber!= null)&&(!that.serialNumber.isEmpty()))?that.getSerialNumber():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serialNumber", lhsSerialNumber), LocatorUtils.property(thatLocator, "serialNumber", rhsSerialNumber), lhsSerialNumber, rhsSerialNumber, ((this.serialNumber!= null)&&(!this.serialNumber.isEmpty())), ((that.serialNumber!= null)&&(!that.serialNumber.isEmpty())))) {
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
            List<String> theAWBNumber;
            theAWBNumber = (((this.awbNumber!= null)&&(!this.awbNumber.isEmpty()))?this.getAWBNumber():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awbNumber", theAWBNumber), currentHashCode, theAWBNumber, ((this.awbNumber!= null)&&(!this.awbNumber.isEmpty())));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            String theNumber;
            theNumber = this.getNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "number", theNumber), currentHashCode, theNumber, (this.number!= null));
        }
        {
            List<String> theSerialNumber;
            theSerialNumber = (((this.serialNumber!= null)&&(!this.serialNumber.isEmpty()))?this.getSerialNumber():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialNumber", theSerialNumber), currentHashCode, theSerialNumber, ((this.serialNumber!= null)&&(!this.serialNumber.isEmpty())));
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
            List<String> theAWBNumber;
            theAWBNumber = (((this.awbNumber!= null)&&(!this.awbNumber.isEmpty()))?this.getAWBNumber():null);
            strategy.appendField(locator, this, "awbNumber", buffer, theAWBNumber, ((this.awbNumber!= null)&&(!this.awbNumber.isEmpty())));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            String theNumber;
            theNumber = this.getNumber();
            strategy.appendField(locator, this, "number", buffer, theNumber, (this.number!= null));
        }
        {
            List<String> theSerialNumber;
            theSerialNumber = (((this.serialNumber!= null)&&(!this.serialNumber.isEmpty()))?this.getSerialNumber():null);
            strategy.appendField(locator, this, "serialNumber", buffer, theSerialNumber, ((this.serialNumber!= null)&&(!this.serialNumber.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
