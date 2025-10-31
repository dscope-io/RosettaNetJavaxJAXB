
package io.dscope.rosettanet.domain.logistics.logistics.v02_05;

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
import io.dscope.rosettanet.domain.logistics.codelist.porttype.v01_03.PortType;
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
 * <p>Java class for PortInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.05}PortIdentification" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:PortType:xsd:codelist:01.03}PortType"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
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
@XmlType(name = "PortInformationType", propOrder = {
    "name",
    "portIdentification",
    "portType",
    "sequenceNumber"
})
public class PortInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "PortIdentification", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.05", type = PortIdentification.class)
    protected List<PortIdentification> portIdentification;
    @XmlElementRef(name = "PortType", namespace = "urn:rosettanet:specification:domain:Logistics:PortType:xsd:codelist:01.03", type = PortType.class)
    protected PortType portType;
    @XmlElement(name = "SequenceNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the portIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortIdentification }
     * 
     * 
     */
    public List<PortIdentification> getPortIdentification() {
        if (portIdentification == null) {
            portIdentification = new ArrayList<PortIdentification>();
        }
        return this.portIdentification;
    }

    /**
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link PortType }
     *     
     */
    public PortType getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortType }
     *     
     */
    public void setPortType(PortType value) {
        this.portType = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
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
        final PortInformationType that = ((PortInformationType) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            List<PortIdentification> lhsPortIdentification;
            lhsPortIdentification = (((this.portIdentification!= null)&&(!this.portIdentification.isEmpty()))?this.getPortIdentification():null);
            List<PortIdentification> rhsPortIdentification;
            rhsPortIdentification = (((that.portIdentification!= null)&&(!that.portIdentification.isEmpty()))?that.getPortIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portIdentification", lhsPortIdentification), LocatorUtils.property(thatLocator, "portIdentification", rhsPortIdentification), lhsPortIdentification, rhsPortIdentification, ((this.portIdentification!= null)&&(!this.portIdentification.isEmpty())), ((that.portIdentification!= null)&&(!that.portIdentification.isEmpty())))) {
                return false;
            }
        }
        {
            PortType lhsPortType;
            lhsPortType = this.getPortType();
            PortType rhsPortType;
            rhsPortType = that.getPortType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portType", lhsPortType), LocatorUtils.property(thatLocator, "portType", rhsPortType), lhsPortType, rhsPortType, (this.portType!= null), (that.portType!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsSequenceNumber;
            lhsSequenceNumber = this.getSequenceNumber();
            BigInteger rhsSequenceNumber;
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            List<PortIdentification> thePortIdentification;
            thePortIdentification = (((this.portIdentification!= null)&&(!this.portIdentification.isEmpty()))?this.getPortIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portIdentification", thePortIdentification), currentHashCode, thePortIdentification, ((this.portIdentification!= null)&&(!this.portIdentification.isEmpty())));
        }
        {
            PortType thePortType;
            thePortType = this.getPortType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portType", thePortType), currentHashCode, thePortType, (this.portType!= null));
        }
        {
            BigInteger theSequenceNumber;
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
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            List<PortIdentification> thePortIdentification;
            thePortIdentification = (((this.portIdentification!= null)&&(!this.portIdentification.isEmpty()))?this.getPortIdentification():null);
            strategy.appendField(locator, this, "portIdentification", buffer, thePortIdentification, ((this.portIdentification!= null)&&(!this.portIdentification.isEmpty())));
        }
        {
            PortType thePortType;
            thePortType = this.getPortType();
            strategy.appendField(locator, this, "portType", buffer, thePortType, (this.portType!= null));
        }
        {
            BigInteger theSequenceNumber;
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
