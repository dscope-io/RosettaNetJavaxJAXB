
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_28;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.dates.v01_03.DateTimePeriodType;
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
 * <p>Java class for ProcessRoutingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessRoutingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationLotDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DateTimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="PreviousProcessRoutingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousProcessRoutingIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28}WorkInProcessStage"/&gt;
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
@XmlType(name = "ProcessRoutingType", propOrder = {
    "description",
    "identifier",
    "operationLotDate",
    "previousProcessRoutingDescription",
    "previousProcessRoutingIdentifier",
    "workInProcessStage"
})
public class ProcessRoutingType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "OperationLotDate")
    protected DateTimePeriodType operationLotDate;
    @XmlElement(name = "PreviousProcessRoutingDescription")
    protected String previousProcessRoutingDescription;
    @XmlElement(name = "PreviousProcessRoutingIdentifier")
    protected String previousProcessRoutingIdentifier;
    @XmlElementRef(name = "WorkInProcessStage", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28", type = WorkInProcessStage.class)
    protected WorkInProcessStage workInProcessStage;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the operationLotDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    public DateTimePeriodType getOperationLotDate() {
        return operationLotDate;
    }

    /**
     * Sets the value of the operationLotDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    public void setOperationLotDate(DateTimePeriodType value) {
        this.operationLotDate = value;
    }

    /**
     * Gets the value of the previousProcessRoutingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousProcessRoutingDescription() {
        return previousProcessRoutingDescription;
    }

    /**
     * Sets the value of the previousProcessRoutingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousProcessRoutingDescription(String value) {
        this.previousProcessRoutingDescription = value;
    }

    /**
     * Gets the value of the previousProcessRoutingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousProcessRoutingIdentifier() {
        return previousProcessRoutingIdentifier;
    }

    /**
     * Sets the value of the previousProcessRoutingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousProcessRoutingIdentifier(String value) {
        this.previousProcessRoutingIdentifier = value;
    }

    /**
     * Gets the value of the workInProcessStage property.
     * 
     * @return
     *     possible object is
     *     {@link WorkInProcessStage }
     *     
     */
    public WorkInProcessStage getWorkInProcessStage() {
        return workInProcessStage;
    }

    /**
     * Sets the value of the workInProcessStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkInProcessStage }
     *     
     */
    public void setWorkInProcessStage(WorkInProcessStage value) {
        this.workInProcessStage = value;
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
        final ProcessRoutingType that = ((ProcessRoutingType) object);
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
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            DateTimePeriodType lhsOperationLotDate;
            lhsOperationLotDate = this.getOperationLotDate();
            DateTimePeriodType rhsOperationLotDate;
            rhsOperationLotDate = that.getOperationLotDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operationLotDate", lhsOperationLotDate), LocatorUtils.property(thatLocator, "operationLotDate", rhsOperationLotDate), lhsOperationLotDate, rhsOperationLotDate, (this.operationLotDate!= null), (that.operationLotDate!= null))) {
                return false;
            }
        }
        {
            String lhsPreviousProcessRoutingDescription;
            lhsPreviousProcessRoutingDescription = this.getPreviousProcessRoutingDescription();
            String rhsPreviousProcessRoutingDescription;
            rhsPreviousProcessRoutingDescription = that.getPreviousProcessRoutingDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousProcessRoutingDescription", lhsPreviousProcessRoutingDescription), LocatorUtils.property(thatLocator, "previousProcessRoutingDescription", rhsPreviousProcessRoutingDescription), lhsPreviousProcessRoutingDescription, rhsPreviousProcessRoutingDescription, (this.previousProcessRoutingDescription!= null), (that.previousProcessRoutingDescription!= null))) {
                return false;
            }
        }
        {
            String lhsPreviousProcessRoutingIdentifier;
            lhsPreviousProcessRoutingIdentifier = this.getPreviousProcessRoutingIdentifier();
            String rhsPreviousProcessRoutingIdentifier;
            rhsPreviousProcessRoutingIdentifier = that.getPreviousProcessRoutingIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousProcessRoutingIdentifier", lhsPreviousProcessRoutingIdentifier), LocatorUtils.property(thatLocator, "previousProcessRoutingIdentifier", rhsPreviousProcessRoutingIdentifier), lhsPreviousProcessRoutingIdentifier, rhsPreviousProcessRoutingIdentifier, (this.previousProcessRoutingIdentifier!= null), (that.previousProcessRoutingIdentifier!= null))) {
                return false;
            }
        }
        {
            WorkInProcessStage lhsWorkInProcessStage;
            lhsWorkInProcessStage = this.getWorkInProcessStage();
            WorkInProcessStage rhsWorkInProcessStage;
            rhsWorkInProcessStage = that.getWorkInProcessStage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workInProcessStage", lhsWorkInProcessStage), LocatorUtils.property(thatLocator, "workInProcessStage", rhsWorkInProcessStage), lhsWorkInProcessStage, rhsWorkInProcessStage, (this.workInProcessStage!= null), (that.workInProcessStage!= null))) {
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
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            DateTimePeriodType theOperationLotDate;
            theOperationLotDate = this.getOperationLotDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operationLotDate", theOperationLotDate), currentHashCode, theOperationLotDate, (this.operationLotDate!= null));
        }
        {
            String thePreviousProcessRoutingDescription;
            thePreviousProcessRoutingDescription = this.getPreviousProcessRoutingDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousProcessRoutingDescription", thePreviousProcessRoutingDescription), currentHashCode, thePreviousProcessRoutingDescription, (this.previousProcessRoutingDescription!= null));
        }
        {
            String thePreviousProcessRoutingIdentifier;
            thePreviousProcessRoutingIdentifier = this.getPreviousProcessRoutingIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousProcessRoutingIdentifier", thePreviousProcessRoutingIdentifier), currentHashCode, thePreviousProcessRoutingIdentifier, (this.previousProcessRoutingIdentifier!= null));
        }
        {
            WorkInProcessStage theWorkInProcessStage;
            theWorkInProcessStage = this.getWorkInProcessStage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workInProcessStage", theWorkInProcessStage), currentHashCode, theWorkInProcessStage, (this.workInProcessStage!= null));
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
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            DateTimePeriodType theOperationLotDate;
            theOperationLotDate = this.getOperationLotDate();
            strategy.appendField(locator, this, "operationLotDate", buffer, theOperationLotDate, (this.operationLotDate!= null));
        }
        {
            String thePreviousProcessRoutingDescription;
            thePreviousProcessRoutingDescription = this.getPreviousProcessRoutingDescription();
            strategy.appendField(locator, this, "previousProcessRoutingDescription", buffer, thePreviousProcessRoutingDescription, (this.previousProcessRoutingDescription!= null));
        }
        {
            String thePreviousProcessRoutingIdentifier;
            thePreviousProcessRoutingIdentifier = this.getPreviousProcessRoutingIdentifier();
            strategy.appendField(locator, this, "previousProcessRoutingIdentifier", buffer, thePreviousProcessRoutingIdentifier, (this.previousProcessRoutingIdentifier!= null));
        }
        {
            WorkInProcessStage theWorkInProcessStage;
            theWorkInProcessStage = this.getWorkInProcessStage();
            strategy.appendField(locator, this, "workInProcessStage", buffer, theWorkInProcessStage, (this.workInProcessStage!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
