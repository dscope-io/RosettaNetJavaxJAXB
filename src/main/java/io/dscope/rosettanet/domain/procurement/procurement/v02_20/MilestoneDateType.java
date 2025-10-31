
package io.dscope.rosettanet.domain.procurement.procurement.v02_20;

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
import io.dscope.rosettanet.domain.procurement.codelist.datetype.v01_00.DateType;
import io.dscope.rosettanet.domain.procurement.codelist.event.v01_00.Event;
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
 * <p>Java class for MilestoneDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MilestoneDateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:DateType:xsd:codelist:01.00}DateType"/&gt;
 *         &lt;element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20}AlternativeEvent"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Procurement:Event:xsd:codelist:01.00}Event"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "MilestoneDateType", propOrder = {
    "dateType",
    "eventDate",
    "alternativeEvent",
    "event"
})
public class MilestoneDateType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DateType", namespace = "urn:rosettanet:specification:domain:Procurement:DateType:xsd:codelist:01.00", type = DateType.class)
    protected DateType dateType;
    @XmlElement(name = "EventDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElementRef(name = "AlternativeEvent", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20", type = AlternativeEvent.class, required = false)
    protected AlternativeEvent alternativeEvent;
    @XmlElementRef(name = "Event", namespace = "urn:rosettanet:specification:domain:Procurement:Event:xsd:codelist:01.00", type = Event.class, required = false)
    protected Event event;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDateType(DateType value) {
        this.dateType = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the alternativeEvent property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeEvent }
     *     
     */
    public AlternativeEvent getAlternativeEvent() {
        return alternativeEvent;
    }

    /**
     * Sets the value of the alternativeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeEvent }
     *     
     */
    public void setAlternativeEvent(AlternativeEvent value) {
        this.alternativeEvent = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setEvent(Event value) {
        this.event = value;
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
        final MilestoneDateType that = ((MilestoneDateType) object);
        {
            DateType lhsDateType;
            lhsDateType = this.getDateType();
            DateType rhsDateType;
            rhsDateType = that.getDateType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateType", lhsDateType), LocatorUtils.property(thatLocator, "dateType", rhsDateType), lhsDateType, rhsDateType, (this.dateType!= null), (that.dateType!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEventDate;
            lhsEventDate = this.getEventDate();
            XMLGregorianCalendar rhsEventDate;
            rhsEventDate = that.getEventDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventDate", lhsEventDate), LocatorUtils.property(thatLocator, "eventDate", rhsEventDate), lhsEventDate, rhsEventDate, (this.eventDate!= null), (that.eventDate!= null))) {
                return false;
            }
        }
        {
            AlternativeEvent lhsAlternativeEvent;
            lhsAlternativeEvent = this.getAlternativeEvent();
            AlternativeEvent rhsAlternativeEvent;
            rhsAlternativeEvent = that.getAlternativeEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativeEvent", lhsAlternativeEvent), LocatorUtils.property(thatLocator, "alternativeEvent", rhsAlternativeEvent), lhsAlternativeEvent, rhsAlternativeEvent, (this.alternativeEvent!= null), (that.alternativeEvent!= null))) {
                return false;
            }
        }
        {
            Event lhsEvent;
            lhsEvent = this.getEvent();
            Event rhsEvent;
            rhsEvent = that.getEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "event", lhsEvent), LocatorUtils.property(thatLocator, "event", rhsEvent), lhsEvent, rhsEvent, (this.event!= null), (that.event!= null))) {
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
            DateType theDateType;
            theDateType = this.getDateType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateType", theDateType), currentHashCode, theDateType, (this.dateType!= null));
        }
        {
            XMLGregorianCalendar theEventDate;
            theEventDate = this.getEventDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventDate", theEventDate), currentHashCode, theEventDate, (this.eventDate!= null));
        }
        {
            AlternativeEvent theAlternativeEvent;
            theAlternativeEvent = this.getAlternativeEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativeEvent", theAlternativeEvent), currentHashCode, theAlternativeEvent, (this.alternativeEvent!= null));
        }
        {
            Event theEvent;
            theEvent = this.getEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "event", theEvent), currentHashCode, theEvent, (this.event!= null));
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
            DateType theDateType;
            theDateType = this.getDateType();
            strategy.appendField(locator, this, "dateType", buffer, theDateType, (this.dateType!= null));
        }
        {
            XMLGregorianCalendar theEventDate;
            theEventDate = this.getEventDate();
            strategy.appendField(locator, this, "eventDate", buffer, theEventDate, (this.eventDate!= null));
        }
        {
            AlternativeEvent theAlternativeEvent;
            theAlternativeEvent = this.getAlternativeEvent();
            strategy.appendField(locator, this, "alternativeEvent", buffer, theAlternativeEvent, (this.alternativeEvent!= null));
        }
        {
            Event theEvent;
            theEvent = this.getEvent();
            strategy.appendField(locator, this, "event", buffer, theEvent, (this.event!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
