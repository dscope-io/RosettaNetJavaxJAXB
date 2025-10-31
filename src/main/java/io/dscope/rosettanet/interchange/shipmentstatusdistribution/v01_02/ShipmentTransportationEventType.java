
package io.dscope.rosettanet.interchange.shipmentstatusdistribution.v01_02;

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
import io.dscope.rosettanet.domain.procurement.procurement.v01_06.TransportationEventType;
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
 * <p>Java class for ShipmentTransportationEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentTransportationEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfirmedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.06}TransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RevisedScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.06}TransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.06}TransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentTransportationEventType", propOrder = {
    "confirmedEvent",
    "revisedScheduledEvent",
    "scheduledEvent"
})
public class ShipmentTransportationEventType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ConfirmedEvent")
    protected List<TransportationEventType> confirmedEvent;
    @XmlElement(name = "RevisedScheduledEvent")
    protected List<TransportationEventType> revisedScheduledEvent;
    @XmlElement(name = "ScheduledEvent")
    protected List<TransportationEventType> scheduledEvent;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the confirmedEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmedEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmedEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationEventType }
     * 
     * 
     */
    public List<TransportationEventType> getConfirmedEvent() {
        if (confirmedEvent == null) {
            confirmedEvent = new ArrayList<TransportationEventType>();
        }
        return this.confirmedEvent;
    }

    /**
     * Gets the value of the revisedScheduledEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revisedScheduledEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevisedScheduledEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationEventType }
     * 
     * 
     */
    public List<TransportationEventType> getRevisedScheduledEvent() {
        if (revisedScheduledEvent == null) {
            revisedScheduledEvent = new ArrayList<TransportationEventType>();
        }
        return this.revisedScheduledEvent;
    }

    /**
     * Gets the value of the scheduledEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduledEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduledEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationEventType }
     * 
     * 
     */
    public List<TransportationEventType> getScheduledEvent() {
        if (scheduledEvent == null) {
            scheduledEvent = new ArrayList<TransportationEventType>();
        }
        return this.scheduledEvent;
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
        final ShipmentTransportationEventType that = ((ShipmentTransportationEventType) object);
        {
            List<TransportationEventType> lhsConfirmedEvent;
            lhsConfirmedEvent = (((this.confirmedEvent!= null)&&(!this.confirmedEvent.isEmpty()))?this.getConfirmedEvent():null);
            List<TransportationEventType> rhsConfirmedEvent;
            rhsConfirmedEvent = (((that.confirmedEvent!= null)&&(!that.confirmedEvent.isEmpty()))?that.getConfirmedEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confirmedEvent", lhsConfirmedEvent), LocatorUtils.property(thatLocator, "confirmedEvent", rhsConfirmedEvent), lhsConfirmedEvent, rhsConfirmedEvent, ((this.confirmedEvent!= null)&&(!this.confirmedEvent.isEmpty())), ((that.confirmedEvent!= null)&&(!that.confirmedEvent.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportationEventType> lhsRevisedScheduledEvent;
            lhsRevisedScheduledEvent = (((this.revisedScheduledEvent!= null)&&(!this.revisedScheduledEvent.isEmpty()))?this.getRevisedScheduledEvent():null);
            List<TransportationEventType> rhsRevisedScheduledEvent;
            rhsRevisedScheduledEvent = (((that.revisedScheduledEvent!= null)&&(!that.revisedScheduledEvent.isEmpty()))?that.getRevisedScheduledEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revisedScheduledEvent", lhsRevisedScheduledEvent), LocatorUtils.property(thatLocator, "revisedScheduledEvent", rhsRevisedScheduledEvent), lhsRevisedScheduledEvent, rhsRevisedScheduledEvent, ((this.revisedScheduledEvent!= null)&&(!this.revisedScheduledEvent.isEmpty())), ((that.revisedScheduledEvent!= null)&&(!that.revisedScheduledEvent.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportationEventType> lhsScheduledEvent;
            lhsScheduledEvent = (((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty()))?this.getScheduledEvent():null);
            List<TransportationEventType> rhsScheduledEvent;
            rhsScheduledEvent = (((that.scheduledEvent!= null)&&(!that.scheduledEvent.isEmpty()))?that.getScheduledEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledEvent", lhsScheduledEvent), LocatorUtils.property(thatLocator, "scheduledEvent", rhsScheduledEvent), lhsScheduledEvent, rhsScheduledEvent, ((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty())), ((that.scheduledEvent!= null)&&(!that.scheduledEvent.isEmpty())))) {
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
            List<TransportationEventType> theConfirmedEvent;
            theConfirmedEvent = (((this.confirmedEvent!= null)&&(!this.confirmedEvent.isEmpty()))?this.getConfirmedEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confirmedEvent", theConfirmedEvent), currentHashCode, theConfirmedEvent, ((this.confirmedEvent!= null)&&(!this.confirmedEvent.isEmpty())));
        }
        {
            List<TransportationEventType> theRevisedScheduledEvent;
            theRevisedScheduledEvent = (((this.revisedScheduledEvent!= null)&&(!this.revisedScheduledEvent.isEmpty()))?this.getRevisedScheduledEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revisedScheduledEvent", theRevisedScheduledEvent), currentHashCode, theRevisedScheduledEvent, ((this.revisedScheduledEvent!= null)&&(!this.revisedScheduledEvent.isEmpty())));
        }
        {
            List<TransportationEventType> theScheduledEvent;
            theScheduledEvent = (((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty()))?this.getScheduledEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledEvent", theScheduledEvent), currentHashCode, theScheduledEvent, ((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty())));
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
            List<TransportationEventType> theConfirmedEvent;
            theConfirmedEvent = (((this.confirmedEvent!= null)&&(!this.confirmedEvent.isEmpty()))?this.getConfirmedEvent():null);
            strategy.appendField(locator, this, "confirmedEvent", buffer, theConfirmedEvent, ((this.confirmedEvent!= null)&&(!this.confirmedEvent.isEmpty())));
        }
        {
            List<TransportationEventType> theRevisedScheduledEvent;
            theRevisedScheduledEvent = (((this.revisedScheduledEvent!= null)&&(!this.revisedScheduledEvent.isEmpty()))?this.getRevisedScheduledEvent():null);
            strategy.appendField(locator, this, "revisedScheduledEvent", buffer, theRevisedScheduledEvent, ((this.revisedScheduledEvent!= null)&&(!this.revisedScheduledEvent.isEmpty())));
        }
        {
            List<TransportationEventType> theScheduledEvent;
            theScheduledEvent = (((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty()))?this.getScheduledEvent():null);
            strategy.appendField(locator, this, "scheduledEvent", buffer, theScheduledEvent, ((this.scheduledEvent!= null)&&(!this.scheduledEvent.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
