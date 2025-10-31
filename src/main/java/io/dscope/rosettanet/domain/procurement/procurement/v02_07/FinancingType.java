
package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

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
 * <p>Java class for FinancingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApprovalIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PlanIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FinancingType", propOrder = {
    "approvalIdentifier",
    "planIdentifier"
})
public class FinancingType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ApprovalIdentifier", required = true)
    protected String approvalIdentifier;
    @XmlElement(name = "PlanIdentifier")
    protected String planIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the approvalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalIdentifier() {
        return approvalIdentifier;
    }

    /**
     * Sets the value of the approvalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalIdentifier(String value) {
        this.approvalIdentifier = value;
    }

    /**
     * Gets the value of the planIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanIdentifier() {
        return planIdentifier;
    }

    /**
     * Sets the value of the planIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanIdentifier(String value) {
        this.planIdentifier = value;
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
        final FinancingType that = ((FinancingType) object);
        {
            String lhsApprovalIdentifier;
            lhsApprovalIdentifier = this.getApprovalIdentifier();
            String rhsApprovalIdentifier;
            rhsApprovalIdentifier = that.getApprovalIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approvalIdentifier", lhsApprovalIdentifier), LocatorUtils.property(thatLocator, "approvalIdentifier", rhsApprovalIdentifier), lhsApprovalIdentifier, rhsApprovalIdentifier, (this.approvalIdentifier!= null), (that.approvalIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsPlanIdentifier;
            lhsPlanIdentifier = this.getPlanIdentifier();
            String rhsPlanIdentifier;
            rhsPlanIdentifier = that.getPlanIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "planIdentifier", lhsPlanIdentifier), LocatorUtils.property(thatLocator, "planIdentifier", rhsPlanIdentifier), lhsPlanIdentifier, rhsPlanIdentifier, (this.planIdentifier!= null), (that.planIdentifier!= null))) {
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
            String theApprovalIdentifier;
            theApprovalIdentifier = this.getApprovalIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approvalIdentifier", theApprovalIdentifier), currentHashCode, theApprovalIdentifier, (this.approvalIdentifier!= null));
        }
        {
            String thePlanIdentifier;
            thePlanIdentifier = this.getPlanIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "planIdentifier", thePlanIdentifier), currentHashCode, thePlanIdentifier, (this.planIdentifier!= null));
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
            String theApprovalIdentifier;
            theApprovalIdentifier = this.getApprovalIdentifier();
            strategy.appendField(locator, this, "approvalIdentifier", buffer, theApprovalIdentifier, (this.approvalIdentifier!= null));
        }
        {
            String thePlanIdentifier;
            thePlanIdentifier = this.getPlanIdentifier();
            strategy.appendField(locator, this, "planIdentifier", buffer, thePlanIdentifier, (this.planIdentifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
