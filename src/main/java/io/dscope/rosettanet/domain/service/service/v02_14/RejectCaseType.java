
package io.dscope.rosettanet.domain.service.service.v02_14;

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
 * <p>Java class for RejectCaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RejectCaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldRejected" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "RejectCaseType", propOrder = {
    "fieldRejected",
    "reason",
    "sr"
})
public class RejectCaseType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "FieldRejected", required = true)
    protected String fieldRejected;
    @XmlElement(name = "Reason", required = true)
    protected String reason;
    @XmlElement(name = "SR", required = true)
    protected String sr;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the fieldRejected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldRejected() {
        return fieldRejected;
    }

    /**
     * Sets the value of the fieldRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldRejected(String value) {
        this.fieldRejected = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the sr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSR() {
        return sr;
    }

    /**
     * Sets the value of the sr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSR(String value) {
        this.sr = value;
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
        final RejectCaseType that = ((RejectCaseType) object);
        {
            String lhsFieldRejected;
            lhsFieldRejected = this.getFieldRejected();
            String rhsFieldRejected;
            rhsFieldRejected = that.getFieldRejected();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldRejected", lhsFieldRejected), LocatorUtils.property(thatLocator, "fieldRejected", rhsFieldRejected), lhsFieldRejected, rhsFieldRejected, (this.fieldRejected!= null), (that.fieldRejected!= null))) {
                return false;
            }
        }
        {
            String lhsReason;
            lhsReason = this.getReason();
            String rhsReason;
            rhsReason = that.getReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reason", lhsReason), LocatorUtils.property(thatLocator, "reason", rhsReason), lhsReason, rhsReason, (this.reason!= null), (that.reason!= null))) {
                return false;
            }
        }
        {
            String lhsSR;
            lhsSR = this.getSR();
            String rhsSR;
            rhsSR = that.getSR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sr", lhsSR), LocatorUtils.property(thatLocator, "sr", rhsSR), lhsSR, rhsSR, (this.sr!= null), (that.sr!= null))) {
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
            String theFieldRejected;
            theFieldRejected = this.getFieldRejected();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldRejected", theFieldRejected), currentHashCode, theFieldRejected, (this.fieldRejected!= null));
        }
        {
            String theReason;
            theReason = this.getReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reason", theReason), currentHashCode, theReason, (this.reason!= null));
        }
        {
            String theSR;
            theSR = this.getSR();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sr", theSR), currentHashCode, theSR, (this.sr!= null));
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
            String theFieldRejected;
            theFieldRejected = this.getFieldRejected();
            strategy.appendField(locator, this, "fieldRejected", buffer, theFieldRejected, (this.fieldRejected!= null));
        }
        {
            String theReason;
            theReason = this.getReason();
            strategy.appendField(locator, this, "reason", buffer, theReason, (this.reason!= null));
        }
        {
            String theSR;
            theSR = this.getSR();
            strategy.appendField(locator, this, "sr", buffer, theSR, (this.sr!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
