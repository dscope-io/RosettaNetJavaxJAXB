
package io.dscope.rosettanet.interchange.manufacturingworkorderreplynotification.v02_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasureType;
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
 * <p>Java class for CustomerProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineItemQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="LineItemQuantityUOM" type="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasureType"/&gt;
 *         &lt;element name="RequestedEvent" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RequestedStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ShipToIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerProfileType", propOrder = {
    "lineItemQuantity",
    "lineItemQuantityUOM",
    "requestedEvent",
    "requestedStartDate",
    "shipToIdentifier"
})
public class CustomerProfileType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "LineItemQuantity")
    protected float lineItemQuantity;
    @XmlElement(name = "LineItemQuantityUOM", required = true)
    protected UnitOfMeasureType lineItemQuantityUOM;
    @XmlElement(name = "RequestedEvent")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedEvent;
    @XmlElement(name = "RequestedStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedStartDate;
    @XmlElement(name = "ShipToIdentifier")
    protected String shipToIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lineItemQuantity property.
     * 
     */
    public float getLineItemQuantity() {
        return lineItemQuantity;
    }

    /**
     * Sets the value of the lineItemQuantity property.
     * 
     */
    public void setLineItemQuantity(float value) {
        this.lineItemQuantity = value;
    }

    /**
     * Gets the value of the lineItemQuantityUOM property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getLineItemQuantityUOM() {
        return lineItemQuantityUOM;
    }

    /**
     * Sets the value of the lineItemQuantityUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setLineItemQuantityUOM(UnitOfMeasureType value) {
        this.lineItemQuantityUOM = value;
    }

    /**
     * Gets the value of the requestedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedEvent() {
        return requestedEvent;
    }

    /**
     * Sets the value of the requestedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedEvent(XMLGregorianCalendar value) {
        this.requestedEvent = value;
    }

    /**
     * Gets the value of the requestedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedStartDate() {
        return requestedStartDate;
    }

    /**
     * Sets the value of the requestedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedStartDate(XMLGregorianCalendar value) {
        this.requestedStartDate = value;
    }

    /**
     * Gets the value of the shipToIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToIdentifier() {
        return shipToIdentifier;
    }

    /**
     * Sets the value of the shipToIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToIdentifier(String value) {
        this.shipToIdentifier = value;
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
        final CustomerProfileType that = ((CustomerProfileType) object);
        {
            float lhsLineItemQuantity;
            lhsLineItemQuantity = this.getLineItemQuantity();
            float rhsLineItemQuantity;
            rhsLineItemQuantity = that.getLineItemQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineItemQuantity", lhsLineItemQuantity), LocatorUtils.property(thatLocator, "lineItemQuantity", rhsLineItemQuantity), lhsLineItemQuantity, rhsLineItemQuantity, true, true)) {
                return false;
            }
        }
        {
            UnitOfMeasureType lhsLineItemQuantityUOM;
            lhsLineItemQuantityUOM = this.getLineItemQuantityUOM();
            UnitOfMeasureType rhsLineItemQuantityUOM;
            rhsLineItemQuantityUOM = that.getLineItemQuantityUOM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineItemQuantityUOM", lhsLineItemQuantityUOM), LocatorUtils.property(thatLocator, "lineItemQuantityUOM", rhsLineItemQuantityUOM), lhsLineItemQuantityUOM, rhsLineItemQuantityUOM, (this.lineItemQuantityUOM!= null), (that.lineItemQuantityUOM!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsRequestedEvent;
            lhsRequestedEvent = this.getRequestedEvent();
            XMLGregorianCalendar rhsRequestedEvent;
            rhsRequestedEvent = that.getRequestedEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedEvent", lhsRequestedEvent), LocatorUtils.property(thatLocator, "requestedEvent", rhsRequestedEvent), lhsRequestedEvent, rhsRequestedEvent, (this.requestedEvent!= null), (that.requestedEvent!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsRequestedStartDate;
            lhsRequestedStartDate = this.getRequestedStartDate();
            XMLGregorianCalendar rhsRequestedStartDate;
            rhsRequestedStartDate = that.getRequestedStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedStartDate", lhsRequestedStartDate), LocatorUtils.property(thatLocator, "requestedStartDate", rhsRequestedStartDate), lhsRequestedStartDate, rhsRequestedStartDate, (this.requestedStartDate!= null), (that.requestedStartDate!= null))) {
                return false;
            }
        }
        {
            String lhsShipToIdentifier;
            lhsShipToIdentifier = this.getShipToIdentifier();
            String rhsShipToIdentifier;
            rhsShipToIdentifier = that.getShipToIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipToIdentifier", lhsShipToIdentifier), LocatorUtils.property(thatLocator, "shipToIdentifier", rhsShipToIdentifier), lhsShipToIdentifier, rhsShipToIdentifier, (this.shipToIdentifier!= null), (that.shipToIdentifier!= null))) {
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
            float theLineItemQuantity;
            theLineItemQuantity = this.getLineItemQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineItemQuantity", theLineItemQuantity), currentHashCode, theLineItemQuantity, true);
        }
        {
            UnitOfMeasureType theLineItemQuantityUOM;
            theLineItemQuantityUOM = this.getLineItemQuantityUOM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineItemQuantityUOM", theLineItemQuantityUOM), currentHashCode, theLineItemQuantityUOM, (this.lineItemQuantityUOM!= null));
        }
        {
            XMLGregorianCalendar theRequestedEvent;
            theRequestedEvent = this.getRequestedEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedEvent", theRequestedEvent), currentHashCode, theRequestedEvent, (this.requestedEvent!= null));
        }
        {
            XMLGregorianCalendar theRequestedStartDate;
            theRequestedStartDate = this.getRequestedStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedStartDate", theRequestedStartDate), currentHashCode, theRequestedStartDate, (this.requestedStartDate!= null));
        }
        {
            String theShipToIdentifier;
            theShipToIdentifier = this.getShipToIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipToIdentifier", theShipToIdentifier), currentHashCode, theShipToIdentifier, (this.shipToIdentifier!= null));
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
            float theLineItemQuantity;
            theLineItemQuantity = this.getLineItemQuantity();
            strategy.appendField(locator, this, "lineItemQuantity", buffer, theLineItemQuantity, true);
        }
        {
            UnitOfMeasureType theLineItemQuantityUOM;
            theLineItemQuantityUOM = this.getLineItemQuantityUOM();
            strategy.appendField(locator, this, "lineItemQuantityUOM", buffer, theLineItemQuantityUOM, (this.lineItemQuantityUOM!= null));
        }
        {
            XMLGregorianCalendar theRequestedEvent;
            theRequestedEvent = this.getRequestedEvent();
            strategy.appendField(locator, this, "requestedEvent", buffer, theRequestedEvent, (this.requestedEvent!= null));
        }
        {
            XMLGregorianCalendar theRequestedStartDate;
            theRequestedStartDate = this.getRequestedStartDate();
            strategy.appendField(locator, this, "requestedStartDate", buffer, theRequestedStartDate, (this.requestedStartDate!= null));
        }
        {
            String theShipToIdentifier;
            theShipToIdentifier = this.getShipToIdentifier();
            strategy.appendField(locator, this, "shipToIdentifier", buffer, theShipToIdentifier, (this.shipToIdentifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
