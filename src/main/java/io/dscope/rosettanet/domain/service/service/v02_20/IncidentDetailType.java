
package io.dscope.rosettanet.domain.service.service.v02_20;

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
 * <p>Java class for IncidentDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncidentDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IncidentCodeValueDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperatorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}FailureEvent"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}RepairEvent"/&gt;
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
@XmlType(name = "IncidentDetailType", propOrder = {
    "eventDate",
    "incidentCodeValueDescription",
    "operatorIdentifier",
    "workCenter",
    "failureEvent",
    "repairEvent"
})
public class IncidentDetailType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "EventDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "IncidentCodeValueDescription")
    protected String incidentCodeValueDescription;
    @XmlElement(name = "OperatorIdentifier")
    protected String operatorIdentifier;
    @XmlElement(name = "WorkCenter")
    protected String workCenter;
    @XmlElementRef(name = "FailureEvent", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = FailureEvent.class, required = false)
    protected FailureEvent failureEvent;
    @XmlElementRef(name = "RepairEvent", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = RepairEvent.class, required = false)
    protected RepairEvent repairEvent;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the incidentCodeValueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentCodeValueDescription() {
        return incidentCodeValueDescription;
    }

    /**
     * Sets the value of the incidentCodeValueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentCodeValueDescription(String value) {
        this.incidentCodeValueDescription = value;
    }

    /**
     * Gets the value of the operatorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorIdentifier() {
        return operatorIdentifier;
    }

    /**
     * Sets the value of the operatorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorIdentifier(String value) {
        this.operatorIdentifier = value;
    }

    /**
     * Gets the value of the workCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCenter() {
        return workCenter;
    }

    /**
     * Sets the value of the workCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCenter(String value) {
        this.workCenter = value;
    }

    /**
     * Gets the value of the failureEvent property.
     * 
     * @return
     *     possible object is
     *     {@link FailureEvent }
     *     
     */
    public FailureEvent getFailureEvent() {
        return failureEvent;
    }

    /**
     * Sets the value of the failureEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureEvent }
     *     
     */
    public void setFailureEvent(FailureEvent value) {
        this.failureEvent = value;
    }

    /**
     * Gets the value of the repairEvent property.
     * 
     * @return
     *     possible object is
     *     {@link RepairEvent }
     *     
     */
    public RepairEvent getRepairEvent() {
        return repairEvent;
    }

    /**
     * Sets the value of the repairEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairEvent }
     *     
     */
    public void setRepairEvent(RepairEvent value) {
        this.repairEvent = value;
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
        final IncidentDetailType that = ((IncidentDetailType) object);
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
            String lhsIncidentCodeValueDescription;
            lhsIncidentCodeValueDescription = this.getIncidentCodeValueDescription();
            String rhsIncidentCodeValueDescription;
            rhsIncidentCodeValueDescription = that.getIncidentCodeValueDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "incidentCodeValueDescription", lhsIncidentCodeValueDescription), LocatorUtils.property(thatLocator, "incidentCodeValueDescription", rhsIncidentCodeValueDescription), lhsIncidentCodeValueDescription, rhsIncidentCodeValueDescription, (this.incidentCodeValueDescription!= null), (that.incidentCodeValueDescription!= null))) {
                return false;
            }
        }
        {
            String lhsOperatorIdentifier;
            lhsOperatorIdentifier = this.getOperatorIdentifier();
            String rhsOperatorIdentifier;
            rhsOperatorIdentifier = that.getOperatorIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operatorIdentifier", lhsOperatorIdentifier), LocatorUtils.property(thatLocator, "operatorIdentifier", rhsOperatorIdentifier), lhsOperatorIdentifier, rhsOperatorIdentifier, (this.operatorIdentifier!= null), (that.operatorIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsWorkCenter;
            lhsWorkCenter = this.getWorkCenter();
            String rhsWorkCenter;
            rhsWorkCenter = that.getWorkCenter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workCenter", lhsWorkCenter), LocatorUtils.property(thatLocator, "workCenter", rhsWorkCenter), lhsWorkCenter, rhsWorkCenter, (this.workCenter!= null), (that.workCenter!= null))) {
                return false;
            }
        }
        {
            FailureEvent lhsFailureEvent;
            lhsFailureEvent = this.getFailureEvent();
            FailureEvent rhsFailureEvent;
            rhsFailureEvent = that.getFailureEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failureEvent", lhsFailureEvent), LocatorUtils.property(thatLocator, "failureEvent", rhsFailureEvent), lhsFailureEvent, rhsFailureEvent, (this.failureEvent!= null), (that.failureEvent!= null))) {
                return false;
            }
        }
        {
            RepairEvent lhsRepairEvent;
            lhsRepairEvent = this.getRepairEvent();
            RepairEvent rhsRepairEvent;
            rhsRepairEvent = that.getRepairEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "repairEvent", lhsRepairEvent), LocatorUtils.property(thatLocator, "repairEvent", rhsRepairEvent), lhsRepairEvent, rhsRepairEvent, (this.repairEvent!= null), (that.repairEvent!= null))) {
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
            XMLGregorianCalendar theEventDate;
            theEventDate = this.getEventDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventDate", theEventDate), currentHashCode, theEventDate, (this.eventDate!= null));
        }
        {
            String theIncidentCodeValueDescription;
            theIncidentCodeValueDescription = this.getIncidentCodeValueDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "incidentCodeValueDescription", theIncidentCodeValueDescription), currentHashCode, theIncidentCodeValueDescription, (this.incidentCodeValueDescription!= null));
        }
        {
            String theOperatorIdentifier;
            theOperatorIdentifier = this.getOperatorIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operatorIdentifier", theOperatorIdentifier), currentHashCode, theOperatorIdentifier, (this.operatorIdentifier!= null));
        }
        {
            String theWorkCenter;
            theWorkCenter = this.getWorkCenter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workCenter", theWorkCenter), currentHashCode, theWorkCenter, (this.workCenter!= null));
        }
        {
            FailureEvent theFailureEvent;
            theFailureEvent = this.getFailureEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failureEvent", theFailureEvent), currentHashCode, theFailureEvent, (this.failureEvent!= null));
        }
        {
            RepairEvent theRepairEvent;
            theRepairEvent = this.getRepairEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "repairEvent", theRepairEvent), currentHashCode, theRepairEvent, (this.repairEvent!= null));
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
            XMLGregorianCalendar theEventDate;
            theEventDate = this.getEventDate();
            strategy.appendField(locator, this, "eventDate", buffer, theEventDate, (this.eventDate!= null));
        }
        {
            String theIncidentCodeValueDescription;
            theIncidentCodeValueDescription = this.getIncidentCodeValueDescription();
            strategy.appendField(locator, this, "incidentCodeValueDescription", buffer, theIncidentCodeValueDescription, (this.incidentCodeValueDescription!= null));
        }
        {
            String theOperatorIdentifier;
            theOperatorIdentifier = this.getOperatorIdentifier();
            strategy.appendField(locator, this, "operatorIdentifier", buffer, theOperatorIdentifier, (this.operatorIdentifier!= null));
        }
        {
            String theWorkCenter;
            theWorkCenter = this.getWorkCenter();
            strategy.appendField(locator, this, "workCenter", buffer, theWorkCenter, (this.workCenter!= null));
        }
        {
            FailureEvent theFailureEvent;
            theFailureEvent = this.getFailureEvent();
            strategy.appendField(locator, this, "failureEvent", buffer, theFailureEvent, (this.failureEvent!= null));
        }
        {
            RepairEvent theRepairEvent;
            theRepairEvent = this.getRepairEvent();
            strategy.appendField(locator, this, "repairEvent", buffer, theRepairEvent, (this.repairEvent!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
