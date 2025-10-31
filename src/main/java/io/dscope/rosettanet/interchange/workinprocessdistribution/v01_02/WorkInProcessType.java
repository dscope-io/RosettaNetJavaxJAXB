
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.ProcessRouting;
import io.dscope.rosettanet.universal.partneridentification.v01_12.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for WorkInProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkInProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IsPreviousNotificationSuperceded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ManufacturedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="ManufacturingLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturingLot" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}ManufacturingLotType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}ProcessRouting"/&gt;
 *         &lt;element name="QuantityChangeDescription" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}QuantityChangeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="StatusChangeDescription" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}StatusChangeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:WorkInProcessType:xsd:codelist:01.04}WorkInProcessType"/&gt;
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
@XmlType(name = "WorkInProcessType", propOrder = {
    "eventDateTime",
    "isPreviousNotificationSuperceded",
    "manufacturedBy",
    "manufacturingLine",
    "manufacturingLot",
    "processRouting",
    "quantityChangeDescription",
    "statusChangeDescription",
    "workInProcessType"
})
public class WorkInProcessType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "EventDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;
    @XmlElement(name = "IsPreviousNotificationSuperceded")
    protected boolean isPreviousNotificationSuperceded;
    @XmlElement(name = "ManufacturedBy", required = true)
    protected SpecifiedPartnerDescriptionType manufacturedBy;
    @XmlElement(name = "ManufacturingLine")
    protected String manufacturingLine;
    @XmlElement(name = "ManufacturingLot", required = true)
    protected ManufacturingLotType manufacturingLot;
    @XmlElementRef(name = "ProcessRouting", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", type = ProcessRouting.class)
    protected ProcessRouting processRouting;
    @XmlElement(name = "QuantityChangeDescription")
    protected QuantityChangeDescriptionType quantityChangeDescription;
    @XmlElement(name = "StatusChangeDescription")
    protected StatusChangeDescriptionType statusChangeDescription;
    @XmlElementRef(name = "WorkInProcessType", namespace = "urn:rosettanet:specification:domain:Manufacturing:WorkInProcessType:xsd:codelist:01.04", type = io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType.class)
    protected io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType workInProcessType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the eventDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Sets the value of the eventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDateTime(XMLGregorianCalendar value) {
        this.eventDateTime = value;
    }

    /**
     * Gets the value of the isPreviousNotificationSuperceded property.
     * 
     */
    public boolean isIsPreviousNotificationSuperceded() {
        return isPreviousNotificationSuperceded;
    }

    /**
     * Sets the value of the isPreviousNotificationSuperceded property.
     * 
     */
    public void setIsPreviousNotificationSuperceded(boolean value) {
        this.isPreviousNotificationSuperceded = value;
    }

    /**
     * Gets the value of the manufacturedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getManufacturedBy() {
        return manufacturedBy;
    }

    /**
     * Sets the value of the manufacturedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setManufacturedBy(SpecifiedPartnerDescriptionType value) {
        this.manufacturedBy = value;
    }

    /**
     * Gets the value of the manufacturingLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingLine() {
        return manufacturingLine;
    }

    /**
     * Sets the value of the manufacturingLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingLine(String value) {
        this.manufacturingLine = value;
    }

    /**
     * Gets the value of the manufacturingLot property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingLotType }
     *     
     */
    public ManufacturingLotType getManufacturingLot() {
        return manufacturingLot;
    }

    /**
     * Sets the value of the manufacturingLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingLotType }
     *     
     */
    public void setManufacturingLot(ManufacturingLotType value) {
        this.manufacturingLot = value;
    }

    /**
     * Gets the value of the processRouting property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRouting }
     *     
     */
    public ProcessRouting getProcessRouting() {
        return processRouting;
    }

    /**
     * Sets the value of the processRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRouting }
     *     
     */
    public void setProcessRouting(ProcessRouting value) {
        this.processRouting = value;
    }

    /**
     * Gets the value of the quantityChangeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityChangeDescriptionType }
     *     
     */
    public QuantityChangeDescriptionType getQuantityChangeDescription() {
        return quantityChangeDescription;
    }

    /**
     * Sets the value of the quantityChangeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityChangeDescriptionType }
     *     
     */
    public void setQuantityChangeDescription(QuantityChangeDescriptionType value) {
        this.quantityChangeDescription = value;
    }

    /**
     * Gets the value of the statusChangeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link StatusChangeDescriptionType }
     *     
     */
    public StatusChangeDescriptionType getStatusChangeDescription() {
        return statusChangeDescription;
    }

    /**
     * Sets the value of the statusChangeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusChangeDescriptionType }
     *     
     */
    public void setStatusChangeDescription(StatusChangeDescriptionType value) {
        this.statusChangeDescription = value;
    }

    /**
     * Gets the value of the workInProcessType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType }
     *     
     */
    public io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType getWorkInProcessType() {
        return workInProcessType;
    }

    /**
     * Sets the value of the workInProcessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType }
     *     
     */
    public void setWorkInProcessType(io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType value) {
        this.workInProcessType = value;
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
        final WorkInProcessType that = ((WorkInProcessType) object);
        {
            XMLGregorianCalendar lhsEventDateTime;
            lhsEventDateTime = this.getEventDateTime();
            XMLGregorianCalendar rhsEventDateTime;
            rhsEventDateTime = that.getEventDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventDateTime", lhsEventDateTime), LocatorUtils.property(thatLocator, "eventDateTime", rhsEventDateTime), lhsEventDateTime, rhsEventDateTime, (this.eventDateTime!= null), (that.eventDateTime!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsPreviousNotificationSuperceded;
            lhsIsPreviousNotificationSuperceded = this.isIsPreviousNotificationSuperceded();
            boolean rhsIsPreviousNotificationSuperceded;
            rhsIsPreviousNotificationSuperceded = that.isIsPreviousNotificationSuperceded();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isPreviousNotificationSuperceded", lhsIsPreviousNotificationSuperceded), LocatorUtils.property(thatLocator, "isPreviousNotificationSuperceded", rhsIsPreviousNotificationSuperceded), lhsIsPreviousNotificationSuperceded, rhsIsPreviousNotificationSuperceded, true, true)) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsManufacturedBy;
            lhsManufacturedBy = this.getManufacturedBy();
            SpecifiedPartnerDescriptionType rhsManufacturedBy;
            rhsManufacturedBy = that.getManufacturedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturedBy", lhsManufacturedBy), LocatorUtils.property(thatLocator, "manufacturedBy", rhsManufacturedBy), lhsManufacturedBy, rhsManufacturedBy, (this.manufacturedBy!= null), (that.manufacturedBy!= null))) {
                return false;
            }
        }
        {
            String lhsManufacturingLine;
            lhsManufacturingLine = this.getManufacturingLine();
            String rhsManufacturingLine;
            rhsManufacturingLine = that.getManufacturingLine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturingLine", lhsManufacturingLine), LocatorUtils.property(thatLocator, "manufacturingLine", rhsManufacturingLine), lhsManufacturingLine, rhsManufacturingLine, (this.manufacturingLine!= null), (that.manufacturingLine!= null))) {
                return false;
            }
        }
        {
            ManufacturingLotType lhsManufacturingLot;
            lhsManufacturingLot = this.getManufacturingLot();
            ManufacturingLotType rhsManufacturingLot;
            rhsManufacturingLot = that.getManufacturingLot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturingLot", lhsManufacturingLot), LocatorUtils.property(thatLocator, "manufacturingLot", rhsManufacturingLot), lhsManufacturingLot, rhsManufacturingLot, (this.manufacturingLot!= null), (that.manufacturingLot!= null))) {
                return false;
            }
        }
        {
            ProcessRouting lhsProcessRouting;
            lhsProcessRouting = this.getProcessRouting();
            ProcessRouting rhsProcessRouting;
            rhsProcessRouting = that.getProcessRouting();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processRouting", lhsProcessRouting), LocatorUtils.property(thatLocator, "processRouting", rhsProcessRouting), lhsProcessRouting, rhsProcessRouting, (this.processRouting!= null), (that.processRouting!= null))) {
                return false;
            }
        }
        {
            QuantityChangeDescriptionType lhsQuantityChangeDescription;
            lhsQuantityChangeDescription = this.getQuantityChangeDescription();
            QuantityChangeDescriptionType rhsQuantityChangeDescription;
            rhsQuantityChangeDescription = that.getQuantityChangeDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityChangeDescription", lhsQuantityChangeDescription), LocatorUtils.property(thatLocator, "quantityChangeDescription", rhsQuantityChangeDescription), lhsQuantityChangeDescription, rhsQuantityChangeDescription, (this.quantityChangeDescription!= null), (that.quantityChangeDescription!= null))) {
                return false;
            }
        }
        {
            StatusChangeDescriptionType lhsStatusChangeDescription;
            lhsStatusChangeDescription = this.getStatusChangeDescription();
            StatusChangeDescriptionType rhsStatusChangeDescription;
            rhsStatusChangeDescription = that.getStatusChangeDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusChangeDescription", lhsStatusChangeDescription), LocatorUtils.property(thatLocator, "statusChangeDescription", rhsStatusChangeDescription), lhsStatusChangeDescription, rhsStatusChangeDescription, (this.statusChangeDescription!= null), (that.statusChangeDescription!= null))) {
                return false;
            }
        }
        {
            io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType lhsWorkInProcessType;
            lhsWorkInProcessType = this.getWorkInProcessType();
            io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType rhsWorkInProcessType;
            rhsWorkInProcessType = that.getWorkInProcessType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workInProcessType", lhsWorkInProcessType), LocatorUtils.property(thatLocator, "workInProcessType", rhsWorkInProcessType), lhsWorkInProcessType, rhsWorkInProcessType, (this.workInProcessType!= null), (that.workInProcessType!= null))) {
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
            XMLGregorianCalendar theEventDateTime;
            theEventDateTime = this.getEventDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventDateTime", theEventDateTime), currentHashCode, theEventDateTime, (this.eventDateTime!= null));
        }
        {
            boolean theIsPreviousNotificationSuperceded;
            theIsPreviousNotificationSuperceded = this.isIsPreviousNotificationSuperceded();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isPreviousNotificationSuperceded", theIsPreviousNotificationSuperceded), currentHashCode, theIsPreviousNotificationSuperceded, true);
        }
        {
            SpecifiedPartnerDescriptionType theManufacturedBy;
            theManufacturedBy = this.getManufacturedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturedBy", theManufacturedBy), currentHashCode, theManufacturedBy, (this.manufacturedBy!= null));
        }
        {
            String theManufacturingLine;
            theManufacturingLine = this.getManufacturingLine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturingLine", theManufacturingLine), currentHashCode, theManufacturingLine, (this.manufacturingLine!= null));
        }
        {
            ManufacturingLotType theManufacturingLot;
            theManufacturingLot = this.getManufacturingLot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturingLot", theManufacturingLot), currentHashCode, theManufacturingLot, (this.manufacturingLot!= null));
        }
        {
            ProcessRouting theProcessRouting;
            theProcessRouting = this.getProcessRouting();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processRouting", theProcessRouting), currentHashCode, theProcessRouting, (this.processRouting!= null));
        }
        {
            QuantityChangeDescriptionType theQuantityChangeDescription;
            theQuantityChangeDescription = this.getQuantityChangeDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityChangeDescription", theQuantityChangeDescription), currentHashCode, theQuantityChangeDescription, (this.quantityChangeDescription!= null));
        }
        {
            StatusChangeDescriptionType theStatusChangeDescription;
            theStatusChangeDescription = this.getStatusChangeDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusChangeDescription", theStatusChangeDescription), currentHashCode, theStatusChangeDescription, (this.statusChangeDescription!= null));
        }
        {
            io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType theWorkInProcessType;
            theWorkInProcessType = this.getWorkInProcessType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workInProcessType", theWorkInProcessType), currentHashCode, theWorkInProcessType, (this.workInProcessType!= null));
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
            XMLGregorianCalendar theEventDateTime;
            theEventDateTime = this.getEventDateTime();
            strategy.appendField(locator, this, "eventDateTime", buffer, theEventDateTime, (this.eventDateTime!= null));
        }
        {
            boolean theIsPreviousNotificationSuperceded;
            theIsPreviousNotificationSuperceded = this.isIsPreviousNotificationSuperceded();
            strategy.appendField(locator, this, "isPreviousNotificationSuperceded", buffer, theIsPreviousNotificationSuperceded, true);
        }
        {
            SpecifiedPartnerDescriptionType theManufacturedBy;
            theManufacturedBy = this.getManufacturedBy();
            strategy.appendField(locator, this, "manufacturedBy", buffer, theManufacturedBy, (this.manufacturedBy!= null));
        }
        {
            String theManufacturingLine;
            theManufacturingLine = this.getManufacturingLine();
            strategy.appendField(locator, this, "manufacturingLine", buffer, theManufacturingLine, (this.manufacturingLine!= null));
        }
        {
            ManufacturingLotType theManufacturingLot;
            theManufacturingLot = this.getManufacturingLot();
            strategy.appendField(locator, this, "manufacturingLot", buffer, theManufacturingLot, (this.manufacturingLot!= null));
        }
        {
            ProcessRouting theProcessRouting;
            theProcessRouting = this.getProcessRouting();
            strategy.appendField(locator, this, "processRouting", buffer, theProcessRouting, (this.processRouting!= null));
        }
        {
            QuantityChangeDescriptionType theQuantityChangeDescription;
            theQuantityChangeDescription = this.getQuantityChangeDescription();
            strategy.appendField(locator, this, "quantityChangeDescription", buffer, theQuantityChangeDescription, (this.quantityChangeDescription!= null));
        }
        {
            StatusChangeDescriptionType theStatusChangeDescription;
            theStatusChangeDescription = this.getStatusChangeDescription();
            strategy.appendField(locator, this, "statusChangeDescription", buffer, theStatusChangeDescription, (this.statusChangeDescription!= null));
        }
        {
            io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType theWorkInProcessType;
            theWorkInProcessType = this.getWorkInProcessType();
            strategy.appendField(locator, this, "workInProcessType", buffer, theWorkInProcessType, (this.workInProcessType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
