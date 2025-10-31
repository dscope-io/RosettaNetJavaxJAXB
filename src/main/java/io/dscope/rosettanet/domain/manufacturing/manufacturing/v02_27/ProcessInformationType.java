
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.processtype.v01_03.ProcessType;
import io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesslocation.v01_03.WorkInProcessLocation;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriod;
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
 * <p>Java class for ProcessInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="MachinePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlatformHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlatformSoftwareProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:01.03}ProcessType"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:WorkInProcessLocation:xsd:codelist:01.03}WorkInProcessLocation" minOccurs="0"/&gt;
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
@XmlType(name = "ProcessInformationType", propOrder = {
    "datePeriod",
    "machinePlatform",
    "platformHandle",
    "platformSoftwareProgram",
    "processingInstructions",
    "processType",
    "sequenceNumber",
    "workInProcessLocation"
})
public class ProcessInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DatePeriod", namespace = "urn:rosettanet:specification:universal:Dates:xsd:schema:01.03", type = DatePeriod.class, required = false)
    protected DatePeriod datePeriod;
    @XmlElement(name = "MachinePlatform")
    protected String machinePlatform;
    @XmlElement(name = "PlatformHandle")
    protected String platformHandle;
    @XmlElement(name = "PlatformSoftwareProgram")
    protected String platformSoftwareProgram;
    @XmlElement(name = "ProcessingInstructions")
    protected String processingInstructions;
    @XmlElementRef(name = "ProcessType", namespace = "urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:01.03", type = ProcessType.class)
    protected ProcessType processType;
    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElementRef(name = "WorkInProcessLocation", namespace = "urn:rosettanet:specification:domain:Manufacturing:WorkInProcessLocation:xsd:codelist:01.03", type = WorkInProcessLocation.class, required = false)
    protected WorkInProcessLocation workInProcessLocation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the datePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod }
     *     
     */
    public DatePeriod getDatePeriod() {
        return datePeriod;
    }

    /**
     * Sets the value of the datePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod }
     *     
     */
    public void setDatePeriod(DatePeriod value) {
        this.datePeriod = value;
    }

    /**
     * Gets the value of the machinePlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachinePlatform() {
        return machinePlatform;
    }

    /**
     * Sets the value of the machinePlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachinePlatform(String value) {
        this.machinePlatform = value;
    }

    /**
     * Gets the value of the platformHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformHandle() {
        return platformHandle;
    }

    /**
     * Sets the value of the platformHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformHandle(String value) {
        this.platformHandle = value;
    }

    /**
     * Gets the value of the platformSoftwareProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformSoftwareProgram() {
        return platformSoftwareProgram;
    }

    /**
     * Sets the value of the platformSoftwareProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformSoftwareProgram(String value) {
        this.platformSoftwareProgram = value;
    }

    /**
     * Gets the value of the processingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingInstructions() {
        return processingInstructions;
    }

    /**
     * Sets the value of the processingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingInstructions(String value) {
        this.processingInstructions = value;
    }

    /**
     * Gets the value of the processType property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessType }
     *     
     */
    public ProcessType getProcessType() {
        return processType;
    }

    /**
     * Sets the value of the processType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessType }
     *     
     */
    public void setProcessType(ProcessType value) {
        this.processType = value;
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
     * Gets the value of the workInProcessLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WorkInProcessLocation }
     *     
     */
    public WorkInProcessLocation getWorkInProcessLocation() {
        return workInProcessLocation;
    }

    /**
     * Sets the value of the workInProcessLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkInProcessLocation }
     *     
     */
    public void setWorkInProcessLocation(WorkInProcessLocation value) {
        this.workInProcessLocation = value;
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
        final ProcessInformationType that = ((ProcessInformationType) object);
        {
            DatePeriod lhsDatePeriod;
            lhsDatePeriod = this.getDatePeriod();
            DatePeriod rhsDatePeriod;
            rhsDatePeriod = that.getDatePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datePeriod", lhsDatePeriod), LocatorUtils.property(thatLocator, "datePeriod", rhsDatePeriod), lhsDatePeriod, rhsDatePeriod, (this.datePeriod!= null), (that.datePeriod!= null))) {
                return false;
            }
        }
        {
            String lhsMachinePlatform;
            lhsMachinePlatform = this.getMachinePlatform();
            String rhsMachinePlatform;
            rhsMachinePlatform = that.getMachinePlatform();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "machinePlatform", lhsMachinePlatform), LocatorUtils.property(thatLocator, "machinePlatform", rhsMachinePlatform), lhsMachinePlatform, rhsMachinePlatform, (this.machinePlatform!= null), (that.machinePlatform!= null))) {
                return false;
            }
        }
        {
            String lhsPlatformHandle;
            lhsPlatformHandle = this.getPlatformHandle();
            String rhsPlatformHandle;
            rhsPlatformHandle = that.getPlatformHandle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "platformHandle", lhsPlatformHandle), LocatorUtils.property(thatLocator, "platformHandle", rhsPlatformHandle), lhsPlatformHandle, rhsPlatformHandle, (this.platformHandle!= null), (that.platformHandle!= null))) {
                return false;
            }
        }
        {
            String lhsPlatformSoftwareProgram;
            lhsPlatformSoftwareProgram = this.getPlatformSoftwareProgram();
            String rhsPlatformSoftwareProgram;
            rhsPlatformSoftwareProgram = that.getPlatformSoftwareProgram();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "platformSoftwareProgram", lhsPlatformSoftwareProgram), LocatorUtils.property(thatLocator, "platformSoftwareProgram", rhsPlatformSoftwareProgram), lhsPlatformSoftwareProgram, rhsPlatformSoftwareProgram, (this.platformSoftwareProgram!= null), (that.platformSoftwareProgram!= null))) {
                return false;
            }
        }
        {
            String lhsProcessingInstructions;
            lhsProcessingInstructions = this.getProcessingInstructions();
            String rhsProcessingInstructions;
            rhsProcessingInstructions = that.getProcessingInstructions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processingInstructions", lhsProcessingInstructions), LocatorUtils.property(thatLocator, "processingInstructions", rhsProcessingInstructions), lhsProcessingInstructions, rhsProcessingInstructions, (this.processingInstructions!= null), (that.processingInstructions!= null))) {
                return false;
            }
        }
        {
            ProcessType lhsProcessType;
            lhsProcessType = this.getProcessType();
            ProcessType rhsProcessType;
            rhsProcessType = that.getProcessType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processType", lhsProcessType), LocatorUtils.property(thatLocator, "processType", rhsProcessType), lhsProcessType, rhsProcessType, (this.processType!= null), (that.processType!= null))) {
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
            WorkInProcessLocation lhsWorkInProcessLocation;
            lhsWorkInProcessLocation = this.getWorkInProcessLocation();
            WorkInProcessLocation rhsWorkInProcessLocation;
            rhsWorkInProcessLocation = that.getWorkInProcessLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workInProcessLocation", lhsWorkInProcessLocation), LocatorUtils.property(thatLocator, "workInProcessLocation", rhsWorkInProcessLocation), lhsWorkInProcessLocation, rhsWorkInProcessLocation, (this.workInProcessLocation!= null), (that.workInProcessLocation!= null))) {
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
            DatePeriod theDatePeriod;
            theDatePeriod = this.getDatePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datePeriod", theDatePeriod), currentHashCode, theDatePeriod, (this.datePeriod!= null));
        }
        {
            String theMachinePlatform;
            theMachinePlatform = this.getMachinePlatform();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "machinePlatform", theMachinePlatform), currentHashCode, theMachinePlatform, (this.machinePlatform!= null));
        }
        {
            String thePlatformHandle;
            thePlatformHandle = this.getPlatformHandle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "platformHandle", thePlatformHandle), currentHashCode, thePlatformHandle, (this.platformHandle!= null));
        }
        {
            String thePlatformSoftwareProgram;
            thePlatformSoftwareProgram = this.getPlatformSoftwareProgram();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "platformSoftwareProgram", thePlatformSoftwareProgram), currentHashCode, thePlatformSoftwareProgram, (this.platformSoftwareProgram!= null));
        }
        {
            String theProcessingInstructions;
            theProcessingInstructions = this.getProcessingInstructions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processingInstructions", theProcessingInstructions), currentHashCode, theProcessingInstructions, (this.processingInstructions!= null));
        }
        {
            ProcessType theProcessType;
            theProcessType = this.getProcessType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processType", theProcessType), currentHashCode, theProcessType, (this.processType!= null));
        }
        {
            String theSequenceNumber;
            theSequenceNumber = this.getSequenceNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumber", theSequenceNumber), currentHashCode, theSequenceNumber, (this.sequenceNumber!= null));
        }
        {
            WorkInProcessLocation theWorkInProcessLocation;
            theWorkInProcessLocation = this.getWorkInProcessLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workInProcessLocation", theWorkInProcessLocation), currentHashCode, theWorkInProcessLocation, (this.workInProcessLocation!= null));
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
            DatePeriod theDatePeriod;
            theDatePeriod = this.getDatePeriod();
            strategy.appendField(locator, this, "datePeriod", buffer, theDatePeriod, (this.datePeriod!= null));
        }
        {
            String theMachinePlatform;
            theMachinePlatform = this.getMachinePlatform();
            strategy.appendField(locator, this, "machinePlatform", buffer, theMachinePlatform, (this.machinePlatform!= null));
        }
        {
            String thePlatformHandle;
            thePlatformHandle = this.getPlatformHandle();
            strategy.appendField(locator, this, "platformHandle", buffer, thePlatformHandle, (this.platformHandle!= null));
        }
        {
            String thePlatformSoftwareProgram;
            thePlatformSoftwareProgram = this.getPlatformSoftwareProgram();
            strategy.appendField(locator, this, "platformSoftwareProgram", buffer, thePlatformSoftwareProgram, (this.platformSoftwareProgram!= null));
        }
        {
            String theProcessingInstructions;
            theProcessingInstructions = this.getProcessingInstructions();
            strategy.appendField(locator, this, "processingInstructions", buffer, theProcessingInstructions, (this.processingInstructions!= null));
        }
        {
            ProcessType theProcessType;
            theProcessType = this.getProcessType();
            strategy.appendField(locator, this, "processType", buffer, theProcessType, (this.processType!= null));
        }
        {
            String theSequenceNumber;
            theSequenceNumber = this.getSequenceNumber();
            strategy.appendField(locator, this, "sequenceNumber", buffer, theSequenceNumber, (this.sequenceNumber!= null));
        }
        {
            WorkInProcessLocation theWorkInProcessLocation;
            theWorkInProcessLocation = this.getWorkInProcessLocation();
            strategy.appendField(locator, this, "workInProcessLocation", buffer, theWorkInProcessLocation, (this.workInProcessLocation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
