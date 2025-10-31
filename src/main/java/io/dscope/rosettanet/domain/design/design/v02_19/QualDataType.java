
package io.dscope.rosettanet.domain.design.design.v02_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for QualDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Plan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QualificationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Schedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "QualDataType", propOrder = {
    "plan",
    "qualificationStatus",
    "result",
    "schedule"
})
public class QualDataType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Plan")
    protected String plan;
    @XmlElement(name = "QualificationStatus")
    protected String qualificationStatus;
    @XmlElement(name = "Result")
    protected String result;
    @XmlElement(name = "Schedule")
    protected String schedule;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlan(String value) {
        this.plan = value;
    }

    /**
     * Gets the value of the qualificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationStatus() {
        return qualificationStatus;
    }

    /**
     * Sets the value of the qualificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationStatus(String value) {
        this.qualificationStatus = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedule(String value) {
        this.schedule = value;
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
        final QualDataType that = ((QualDataType) object);
        {
            String lhsPlan;
            lhsPlan = this.getPlan();
            String rhsPlan;
            rhsPlan = that.getPlan();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plan", lhsPlan), LocatorUtils.property(thatLocator, "plan", rhsPlan), lhsPlan, rhsPlan, (this.plan!= null), (that.plan!= null))) {
                return false;
            }
        }
        {
            String lhsQualificationStatus;
            lhsQualificationStatus = this.getQualificationStatus();
            String rhsQualificationStatus;
            rhsQualificationStatus = that.getQualificationStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qualificationStatus", lhsQualificationStatus), LocatorUtils.property(thatLocator, "qualificationStatus", rhsQualificationStatus), lhsQualificationStatus, rhsQualificationStatus, (this.qualificationStatus!= null), (that.qualificationStatus!= null))) {
                return false;
            }
        }
        {
            String lhsResult;
            lhsResult = this.getResult();
            String rhsResult;
            rhsResult = that.getResult();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "result", lhsResult), LocatorUtils.property(thatLocator, "result", rhsResult), lhsResult, rhsResult, (this.result!= null), (that.result!= null))) {
                return false;
            }
        }
        {
            String lhsSchedule;
            lhsSchedule = this.getSchedule();
            String rhsSchedule;
            rhsSchedule = that.getSchedule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schedule", lhsSchedule), LocatorUtils.property(thatLocator, "schedule", rhsSchedule), lhsSchedule, rhsSchedule, (this.schedule!= null), (that.schedule!= null))) {
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
            String thePlan;
            thePlan = this.getPlan();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "plan", thePlan), currentHashCode, thePlan, (this.plan!= null));
        }
        {
            String theQualificationStatus;
            theQualificationStatus = this.getQualificationStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualificationStatus", theQualificationStatus), currentHashCode, theQualificationStatus, (this.qualificationStatus!= null));
        }
        {
            String theResult;
            theResult = this.getResult();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "result", theResult), currentHashCode, theResult, (this.result!= null));
        }
        {
            String theSchedule;
            theSchedule = this.getSchedule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schedule", theSchedule), currentHashCode, theSchedule, (this.schedule!= null));
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
            String thePlan;
            thePlan = this.getPlan();
            strategy.appendField(locator, this, "plan", buffer, thePlan, (this.plan!= null));
        }
        {
            String theQualificationStatus;
            theQualificationStatus = this.getQualificationStatus();
            strategy.appendField(locator, this, "qualificationStatus", buffer, theQualificationStatus, (this.qualificationStatus!= null));
        }
        {
            String theResult;
            theResult = this.getResult();
            strategy.appendField(locator, this, "result", buffer, theResult, (this.result!= null));
        }
        {
            String theSchedule;
            theSchedule = this.getSchedule();
            strategy.appendField(locator, this, "schedule", buffer, theSchedule, (this.schedule!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
