
package io.dscope.rosettanet.domain.logistics.logistics.v01_05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.logistics.codelist.shipdatecode.v01_02.ShipDateCode;
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
 * <p>Java class for ShipmentDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentDateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipDateCode:xsd:codelist:01.02}ShipDateCode"/&gt;
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
@XmlType(name = "ShipmentDateType", propOrder = {
    "dateTimeStamp",
    "shipDateCode"
})
public class ShipmentDateType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DateTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStamp;
    @XmlElementRef(name = "ShipDateCode", namespace = "urn:rosettanet:specification:domain:Logistics:ShipDateCode:xsd:codelist:01.02", type = ShipDateCode.class)
    protected ShipDateCode shipDateCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the dateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Sets the value of the dateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeStamp(XMLGregorianCalendar value) {
        this.dateTimeStamp = value;
    }

    /**
     * Gets the value of the shipDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipDateCode }
     *     
     */
    public ShipDateCode getShipDateCode() {
        return shipDateCode;
    }

    /**
     * Sets the value of the shipDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipDateCode }
     *     
     */
    public void setShipDateCode(ShipDateCode value) {
        this.shipDateCode = value;
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
        final ShipmentDateType that = ((ShipmentDateType) object);
        {
            XMLGregorianCalendar lhsDateTimeStamp;
            lhsDateTimeStamp = this.getDateTimeStamp();
            XMLGregorianCalendar rhsDateTimeStamp;
            rhsDateTimeStamp = that.getDateTimeStamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTimeStamp", lhsDateTimeStamp), LocatorUtils.property(thatLocator, "dateTimeStamp", rhsDateTimeStamp), lhsDateTimeStamp, rhsDateTimeStamp, (this.dateTimeStamp!= null), (that.dateTimeStamp!= null))) {
                return false;
            }
        }
        {
            ShipDateCode lhsShipDateCode;
            lhsShipDateCode = this.getShipDateCode();
            ShipDateCode rhsShipDateCode;
            rhsShipDateCode = that.getShipDateCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipDateCode", lhsShipDateCode), LocatorUtils.property(thatLocator, "shipDateCode", rhsShipDateCode), lhsShipDateCode, rhsShipDateCode, (this.shipDateCode!= null), (that.shipDateCode!= null))) {
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
            XMLGregorianCalendar theDateTimeStamp;
            theDateTimeStamp = this.getDateTimeStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateTimeStamp", theDateTimeStamp), currentHashCode, theDateTimeStamp, (this.dateTimeStamp!= null));
        }
        {
            ShipDateCode theShipDateCode;
            theShipDateCode = this.getShipDateCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipDateCode", theShipDateCode), currentHashCode, theShipDateCode, (this.shipDateCode!= null));
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
            XMLGregorianCalendar theDateTimeStamp;
            theDateTimeStamp = this.getDateTimeStamp();
            strategy.appendField(locator, this, "dateTimeStamp", buffer, theDateTimeStamp, (this.dateTimeStamp!= null));
        }
        {
            ShipDateCode theShipDateCode;
            theShipDateCode = this.getShipDateCode();
            strategy.appendField(locator, this, "shipDateCode", buffer, theShipDateCode, (this.shipDateCode!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
