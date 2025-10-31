
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.ECIDReport;
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
 * <p>Java class for ChipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChipType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChipPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerChipPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DieReticlePN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}ECIDReport" minOccurs="0"/&gt;
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
@XmlType(name = "ChipType", propOrder = {
    "chipPN",
    "customerChipPN",
    "dieReticlePN",
    "ecidReport"
})
public class ChipType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ChipPN")
    protected String chipPN;
    @XmlElement(name = "CustomerChipPN")
    protected String customerChipPN;
    @XmlElement(name = "DieReticlePN")
    protected String dieReticlePN;
    @XmlElementRef(name = "ECIDReport", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = ECIDReport.class, required = false)
    protected ECIDReport ecidReport;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the chipPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipPN() {
        return chipPN;
    }

    /**
     * Sets the value of the chipPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipPN(String value) {
        this.chipPN = value;
    }

    /**
     * Gets the value of the customerChipPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerChipPN() {
        return customerChipPN;
    }

    /**
     * Sets the value of the customerChipPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerChipPN(String value) {
        this.customerChipPN = value;
    }

    /**
     * Gets the value of the dieReticlePN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDieReticlePN() {
        return dieReticlePN;
    }

    /**
     * Sets the value of the dieReticlePN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDieReticlePN(String value) {
        this.dieReticlePN = value;
    }

    /**
     * Gets the value of the ecidReport property.
     * 
     * @return
     *     possible object is
     *     {@link ECIDReport }
     *     
     */
    public ECIDReport getECIDReport() {
        return ecidReport;
    }

    /**
     * Sets the value of the ecidReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECIDReport }
     *     
     */
    public void setECIDReport(ECIDReport value) {
        this.ecidReport = value;
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
        final ChipType that = ((ChipType) object);
        {
            String lhsChipPN;
            lhsChipPN = this.getChipPN();
            String rhsChipPN;
            rhsChipPN = that.getChipPN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chipPN", lhsChipPN), LocatorUtils.property(thatLocator, "chipPN", rhsChipPN), lhsChipPN, rhsChipPN, (this.chipPN!= null), (that.chipPN!= null))) {
                return false;
            }
        }
        {
            String lhsCustomerChipPN;
            lhsCustomerChipPN = this.getCustomerChipPN();
            String rhsCustomerChipPN;
            rhsCustomerChipPN = that.getCustomerChipPN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerChipPN", lhsCustomerChipPN), LocatorUtils.property(thatLocator, "customerChipPN", rhsCustomerChipPN), lhsCustomerChipPN, rhsCustomerChipPN, (this.customerChipPN!= null), (that.customerChipPN!= null))) {
                return false;
            }
        }
        {
            String lhsDieReticlePN;
            lhsDieReticlePN = this.getDieReticlePN();
            String rhsDieReticlePN;
            rhsDieReticlePN = that.getDieReticlePN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dieReticlePN", lhsDieReticlePN), LocatorUtils.property(thatLocator, "dieReticlePN", rhsDieReticlePN), lhsDieReticlePN, rhsDieReticlePN, (this.dieReticlePN!= null), (that.dieReticlePN!= null))) {
                return false;
            }
        }
        {
            ECIDReport lhsECIDReport;
            lhsECIDReport = this.getECIDReport();
            ECIDReport rhsECIDReport;
            rhsECIDReport = that.getECIDReport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ecidReport", lhsECIDReport), LocatorUtils.property(thatLocator, "ecidReport", rhsECIDReport), lhsECIDReport, rhsECIDReport, (this.ecidReport!= null), (that.ecidReport!= null))) {
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
            String theChipPN;
            theChipPN = this.getChipPN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chipPN", theChipPN), currentHashCode, theChipPN, (this.chipPN!= null));
        }
        {
            String theCustomerChipPN;
            theCustomerChipPN = this.getCustomerChipPN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerChipPN", theCustomerChipPN), currentHashCode, theCustomerChipPN, (this.customerChipPN!= null));
        }
        {
            String theDieReticlePN;
            theDieReticlePN = this.getDieReticlePN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dieReticlePN", theDieReticlePN), currentHashCode, theDieReticlePN, (this.dieReticlePN!= null));
        }
        {
            ECIDReport theECIDReport;
            theECIDReport = this.getECIDReport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ecidReport", theECIDReport), currentHashCode, theECIDReport, (this.ecidReport!= null));
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
            String theChipPN;
            theChipPN = this.getChipPN();
            strategy.appendField(locator, this, "chipPN", buffer, theChipPN, (this.chipPN!= null));
        }
        {
            String theCustomerChipPN;
            theCustomerChipPN = this.getCustomerChipPN();
            strategy.appendField(locator, this, "customerChipPN", buffer, theCustomerChipPN, (this.customerChipPN!= null));
        }
        {
            String theDieReticlePN;
            theDieReticlePN = this.getDieReticlePN();
            strategy.appendField(locator, this, "dieReticlePN", buffer, theDieReticlePN, (this.dieReticlePN!= null));
        }
        {
            ECIDReport theECIDReport;
            theECIDReport = this.getECIDReport();
            strategy.appendField(locator, this, "ecidReport", buffer, theECIDReport, (this.ecidReport!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
