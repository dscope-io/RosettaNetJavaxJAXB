
package io.dscope.rosettanet.domain.service.service.v02_14;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.codelist.repairtype.v01_02.RepairType;
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
 * <p>Java class for RepairEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepairEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncidentRepairCodeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:RepairType:xsd:codelist:01.02}RepairType" minOccurs="0"/&gt;
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
@XmlType(name = "RepairEventType", propOrder = {
    "incidentRepairCodeValue",
    "repairType"
})
public class RepairEventType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "IncidentRepairCodeValue")
    protected String incidentRepairCodeValue;
    @XmlElementRef(name = "RepairType", namespace = "urn:rosettanet:specification:domain:Service:RepairType:xsd:codelist:01.02", type = RepairType.class, required = false)
    protected RepairType repairType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the incidentRepairCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentRepairCodeValue() {
        return incidentRepairCodeValue;
    }

    /**
     * Sets the value of the incidentRepairCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentRepairCodeValue(String value) {
        this.incidentRepairCodeValue = value;
    }

    /**
     * Gets the value of the repairType property.
     * 
     * @return
     *     possible object is
     *     {@link RepairType }
     *     
     */
    public RepairType getRepairType() {
        return repairType;
    }

    /**
     * Sets the value of the repairType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairType }
     *     
     */
    public void setRepairType(RepairType value) {
        this.repairType = value;
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
        final RepairEventType that = ((RepairEventType) object);
        {
            String lhsIncidentRepairCodeValue;
            lhsIncidentRepairCodeValue = this.getIncidentRepairCodeValue();
            String rhsIncidentRepairCodeValue;
            rhsIncidentRepairCodeValue = that.getIncidentRepairCodeValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "incidentRepairCodeValue", lhsIncidentRepairCodeValue), LocatorUtils.property(thatLocator, "incidentRepairCodeValue", rhsIncidentRepairCodeValue), lhsIncidentRepairCodeValue, rhsIncidentRepairCodeValue, (this.incidentRepairCodeValue!= null), (that.incidentRepairCodeValue!= null))) {
                return false;
            }
        }
        {
            RepairType lhsRepairType;
            lhsRepairType = this.getRepairType();
            RepairType rhsRepairType;
            rhsRepairType = that.getRepairType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "repairType", lhsRepairType), LocatorUtils.property(thatLocator, "repairType", rhsRepairType), lhsRepairType, rhsRepairType, (this.repairType!= null), (that.repairType!= null))) {
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
            String theIncidentRepairCodeValue;
            theIncidentRepairCodeValue = this.getIncidentRepairCodeValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "incidentRepairCodeValue", theIncidentRepairCodeValue), currentHashCode, theIncidentRepairCodeValue, (this.incidentRepairCodeValue!= null));
        }
        {
            RepairType theRepairType;
            theRepairType = this.getRepairType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "repairType", theRepairType), currentHashCode, theRepairType, (this.repairType!= null));
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
            String theIncidentRepairCodeValue;
            theIncidentRepairCodeValue = this.getIncidentRepairCodeValue();
            strategy.appendField(locator, this, "incidentRepairCodeValue", buffer, theIncidentRepairCodeValue, (this.incidentRepairCodeValue!= null));
        }
        {
            RepairType theRepairType;
            theRepairType = this.getRepairType();
            strategy.appendField(locator, this, "repairType", buffer, theRepairType, (this.repairType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
