
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.processtype.v01_02.ProcessType;
import io.dscope.rosettanet.domain.manufacturing.codelist.specialinstructioncategory.v01_02.SpecialInstructionCategory;
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
 * <p>Java class for SpecialProcessingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialProcessingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:01.02}ProcessType" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:SpecialInstructionCategory:xsd:codelist:01.02}SpecialInstructionCategory"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SpecialProcessingInformationType", propOrder = {
    "processType",
    "sequenceNumber",
    "specialInstructionCategory",
    "specialInstructions"
})
public class SpecialProcessingInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ProcessType", namespace = "urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:01.02", type = ProcessType.class, required = false)
    protected ProcessType processType;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElementRef(name = "SpecialInstructionCategory", namespace = "urn:rosettanet:specification:domain:Manufacturing:SpecialInstructionCategory:xsd:codelist:01.02", type = SpecialInstructionCategory.class)
    protected SpecialInstructionCategory specialInstructionCategory;
    @XmlElement(name = "SpecialInstructions")
    protected String specialInstructions;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the specialInstructionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialInstructionCategory }
     *     
     */
    public SpecialInstructionCategory getSpecialInstructionCategory() {
        return specialInstructionCategory;
    }

    /**
     * Sets the value of the specialInstructionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialInstructionCategory }
     *     
     */
    public void setSpecialInstructionCategory(SpecialInstructionCategory value) {
        this.specialInstructionCategory = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Sets the value of the specialInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstructions(String value) {
        this.specialInstructions = value;
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
        final SpecialProcessingInformationType that = ((SpecialProcessingInformationType) object);
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
            SpecialInstructionCategory lhsSpecialInstructionCategory;
            lhsSpecialInstructionCategory = this.getSpecialInstructionCategory();
            SpecialInstructionCategory rhsSpecialInstructionCategory;
            rhsSpecialInstructionCategory = that.getSpecialInstructionCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialInstructionCategory", lhsSpecialInstructionCategory), LocatorUtils.property(thatLocator, "specialInstructionCategory", rhsSpecialInstructionCategory), lhsSpecialInstructionCategory, rhsSpecialInstructionCategory, (this.specialInstructionCategory!= null), (that.specialInstructionCategory!= null))) {
                return false;
            }
        }
        {
            String lhsSpecialInstructions;
            lhsSpecialInstructions = this.getSpecialInstructions();
            String rhsSpecialInstructions;
            rhsSpecialInstructions = that.getSpecialInstructions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialInstructions", lhsSpecialInstructions), LocatorUtils.property(thatLocator, "specialInstructions", rhsSpecialInstructions), lhsSpecialInstructions, rhsSpecialInstructions, (this.specialInstructions!= null), (that.specialInstructions!= null))) {
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
            SpecialInstructionCategory theSpecialInstructionCategory;
            theSpecialInstructionCategory = this.getSpecialInstructionCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialInstructionCategory", theSpecialInstructionCategory), currentHashCode, theSpecialInstructionCategory, (this.specialInstructionCategory!= null));
        }
        {
            String theSpecialInstructions;
            theSpecialInstructions = this.getSpecialInstructions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialInstructions", theSpecialInstructions), currentHashCode, theSpecialInstructions, (this.specialInstructions!= null));
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
            SpecialInstructionCategory theSpecialInstructionCategory;
            theSpecialInstructionCategory = this.getSpecialInstructionCategory();
            strategy.appendField(locator, this, "specialInstructionCategory", buffer, theSpecialInstructionCategory, (this.specialInstructionCategory!= null));
        }
        {
            String theSpecialInstructions;
            theSpecialInstructions = this.getSpecialInstructions();
            strategy.appendField(locator, this, "specialInstructions", buffer, theSpecialInstructions, (this.specialInstructions!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
