
package io.dscope.rosettanet.interchange.shipmentreceiptnotification.v02_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancy.v01_03.ReceivingDiscrepancy;
import io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancyreason.v01_03.ReceivingDiscrepancyReason;
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
 * <p>Java class for DiscrepancyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscrepancyInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancy:xsd:codelist:01.03}ReceivingDiscrepancy"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancyReason:xsd:codelist:01.03}ReceivingDiscrepancyReason"/&gt;
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
@XmlType(name = "DiscrepancyInformationType", propOrder = {
    "receivingDiscrepancy",
    "receivingDiscrepancyReason"
})
public class DiscrepancyInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ReceivingDiscrepancy", namespace = "urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancy:xsd:codelist:01.03", type = ReceivingDiscrepancy.class)
    protected ReceivingDiscrepancy receivingDiscrepancy;
    @XmlElementRef(name = "ReceivingDiscrepancyReason", namespace = "urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancyReason:xsd:codelist:01.03", type = ReceivingDiscrepancyReason.class)
    protected ReceivingDiscrepancyReason receivingDiscrepancyReason;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the receivingDiscrepancy property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingDiscrepancy }
     *     
     */
    public ReceivingDiscrepancy getReceivingDiscrepancy() {
        return receivingDiscrepancy;
    }

    /**
     * Sets the value of the receivingDiscrepancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingDiscrepancy }
     *     
     */
    public void setReceivingDiscrepancy(ReceivingDiscrepancy value) {
        this.receivingDiscrepancy = value;
    }

    /**
     * Gets the value of the receivingDiscrepancyReason property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingDiscrepancyReason }
     *     
     */
    public ReceivingDiscrepancyReason getReceivingDiscrepancyReason() {
        return receivingDiscrepancyReason;
    }

    /**
     * Sets the value of the receivingDiscrepancyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingDiscrepancyReason }
     *     
     */
    public void setReceivingDiscrepancyReason(ReceivingDiscrepancyReason value) {
        this.receivingDiscrepancyReason = value;
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
        final DiscrepancyInformationType that = ((DiscrepancyInformationType) object);
        {
            ReceivingDiscrepancy lhsReceivingDiscrepancy;
            lhsReceivingDiscrepancy = this.getReceivingDiscrepancy();
            ReceivingDiscrepancy rhsReceivingDiscrepancy;
            rhsReceivingDiscrepancy = that.getReceivingDiscrepancy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivingDiscrepancy", lhsReceivingDiscrepancy), LocatorUtils.property(thatLocator, "receivingDiscrepancy", rhsReceivingDiscrepancy), lhsReceivingDiscrepancy, rhsReceivingDiscrepancy, (this.receivingDiscrepancy!= null), (that.receivingDiscrepancy!= null))) {
                return false;
            }
        }
        {
            ReceivingDiscrepancyReason lhsReceivingDiscrepancyReason;
            lhsReceivingDiscrepancyReason = this.getReceivingDiscrepancyReason();
            ReceivingDiscrepancyReason rhsReceivingDiscrepancyReason;
            rhsReceivingDiscrepancyReason = that.getReceivingDiscrepancyReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivingDiscrepancyReason", lhsReceivingDiscrepancyReason), LocatorUtils.property(thatLocator, "receivingDiscrepancyReason", rhsReceivingDiscrepancyReason), lhsReceivingDiscrepancyReason, rhsReceivingDiscrepancyReason, (this.receivingDiscrepancyReason!= null), (that.receivingDiscrepancyReason!= null))) {
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
            ReceivingDiscrepancy theReceivingDiscrepancy;
            theReceivingDiscrepancy = this.getReceivingDiscrepancy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivingDiscrepancy", theReceivingDiscrepancy), currentHashCode, theReceivingDiscrepancy, (this.receivingDiscrepancy!= null));
        }
        {
            ReceivingDiscrepancyReason theReceivingDiscrepancyReason;
            theReceivingDiscrepancyReason = this.getReceivingDiscrepancyReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivingDiscrepancyReason", theReceivingDiscrepancyReason), currentHashCode, theReceivingDiscrepancyReason, (this.receivingDiscrepancyReason!= null));
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
            ReceivingDiscrepancy theReceivingDiscrepancy;
            theReceivingDiscrepancy = this.getReceivingDiscrepancy();
            strategy.appendField(locator, this, "receivingDiscrepancy", buffer, theReceivingDiscrepancy, (this.receivingDiscrepancy!= null));
        }
        {
            ReceivingDiscrepancyReason theReceivingDiscrepancyReason;
            theReceivingDiscrepancyReason = this.getReceivingDiscrepancyReason();
            strategy.appendField(locator, this, "receivingDiscrepancyReason", buffer, theReceivingDiscrepancyReason, (this.receivingDiscrepancyReason!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
