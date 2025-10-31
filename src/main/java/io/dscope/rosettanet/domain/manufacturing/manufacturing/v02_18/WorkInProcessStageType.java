
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for WorkInProcessStageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkInProcessStageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}WorkInProcessStep" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "WorkInProcessStageType", propOrder = {
    "stageName",
    "workInProcessStep"
})
public class WorkInProcessStageType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "StageName")
    protected String stageName;
    @XmlElementRef(name = "WorkInProcessStep", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", type = WorkInProcessStep.class)
    protected List<WorkInProcessStep> workInProcessStep;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the stageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * Sets the value of the stageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageName(String value) {
        this.stageName = value;
    }

    /**
     * Gets the value of the workInProcessStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workInProcessStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkInProcessStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkInProcessStep }
     * 
     * 
     */
    public List<WorkInProcessStep> getWorkInProcessStep() {
        if (workInProcessStep == null) {
            workInProcessStep = new ArrayList<WorkInProcessStep>();
        }
        return this.workInProcessStep;
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
        final WorkInProcessStageType that = ((WorkInProcessStageType) object);
        {
            String lhsStageName;
            lhsStageName = this.getStageName();
            String rhsStageName;
            rhsStageName = that.getStageName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stageName", lhsStageName), LocatorUtils.property(thatLocator, "stageName", rhsStageName), lhsStageName, rhsStageName, (this.stageName!= null), (that.stageName!= null))) {
                return false;
            }
        }
        {
            List<WorkInProcessStep> lhsWorkInProcessStep;
            lhsWorkInProcessStep = (((this.workInProcessStep!= null)&&(!this.workInProcessStep.isEmpty()))?this.getWorkInProcessStep():null);
            List<WorkInProcessStep> rhsWorkInProcessStep;
            rhsWorkInProcessStep = (((that.workInProcessStep!= null)&&(!that.workInProcessStep.isEmpty()))?that.getWorkInProcessStep():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workInProcessStep", lhsWorkInProcessStep), LocatorUtils.property(thatLocator, "workInProcessStep", rhsWorkInProcessStep), lhsWorkInProcessStep, rhsWorkInProcessStep, ((this.workInProcessStep!= null)&&(!this.workInProcessStep.isEmpty())), ((that.workInProcessStep!= null)&&(!that.workInProcessStep.isEmpty())))) {
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
            String theStageName;
            theStageName = this.getStageName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stageName", theStageName), currentHashCode, theStageName, (this.stageName!= null));
        }
        {
            List<WorkInProcessStep> theWorkInProcessStep;
            theWorkInProcessStep = (((this.workInProcessStep!= null)&&(!this.workInProcessStep.isEmpty()))?this.getWorkInProcessStep():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workInProcessStep", theWorkInProcessStep), currentHashCode, theWorkInProcessStep, ((this.workInProcessStep!= null)&&(!this.workInProcessStep.isEmpty())));
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
            String theStageName;
            theStageName = this.getStageName();
            strategy.appendField(locator, this, "stageName", buffer, theStageName, (this.stageName!= null));
        }
        {
            List<WorkInProcessStep> theWorkInProcessStep;
            theWorkInProcessStep = (((this.workInProcessStep!= null)&&(!this.workInProcessStep.isEmpty()))?this.getWorkInProcessStep():null);
            strategy.appendField(locator, this, "workInProcessStep", buffer, theWorkInProcessStep, ((this.workInProcessStep!= null)&&(!this.workInProcessStep.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
