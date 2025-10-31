
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.LotQuantityType;
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
 * <p>Java class for WaferInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaferInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WaferIdentification" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}WaferIdentificationType"/&gt;
 *         &lt;element name="WaferQuantity" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}LotQuantityType"/&gt;
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
@XmlType(name = "WaferInformationType", propOrder = {
    "waferIdentification",
    "waferQuantity"
})
public class WaferInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "WaferIdentification", required = true)
    protected WaferIdentificationType waferIdentification;
    @XmlElement(name = "WaferQuantity", required = true)
    protected LotQuantityType waferQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the waferIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link WaferIdentificationType }
     *     
     */
    public WaferIdentificationType getWaferIdentification() {
        return waferIdentification;
    }

    /**
     * Sets the value of the waferIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferIdentificationType }
     *     
     */
    public void setWaferIdentification(WaferIdentificationType value) {
        this.waferIdentification = value;
    }

    /**
     * Gets the value of the waferQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link LotQuantityType }
     *     
     */
    public LotQuantityType getWaferQuantity() {
        return waferQuantity;
    }

    /**
     * Sets the value of the waferQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotQuantityType }
     *     
     */
    public void setWaferQuantity(LotQuantityType value) {
        this.waferQuantity = value;
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
        final WaferInformationType that = ((WaferInformationType) object);
        {
            WaferIdentificationType lhsWaferIdentification;
            lhsWaferIdentification = this.getWaferIdentification();
            WaferIdentificationType rhsWaferIdentification;
            rhsWaferIdentification = that.getWaferIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferIdentification", lhsWaferIdentification), LocatorUtils.property(thatLocator, "waferIdentification", rhsWaferIdentification), lhsWaferIdentification, rhsWaferIdentification, (this.waferIdentification!= null), (that.waferIdentification!= null))) {
                return false;
            }
        }
        {
            LotQuantityType lhsWaferQuantity;
            lhsWaferQuantity = this.getWaferQuantity();
            LotQuantityType rhsWaferQuantity;
            rhsWaferQuantity = that.getWaferQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferQuantity", lhsWaferQuantity), LocatorUtils.property(thatLocator, "waferQuantity", rhsWaferQuantity), lhsWaferQuantity, rhsWaferQuantity, (this.waferQuantity!= null), (that.waferQuantity!= null))) {
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
            WaferIdentificationType theWaferIdentification;
            theWaferIdentification = this.getWaferIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferIdentification", theWaferIdentification), currentHashCode, theWaferIdentification, (this.waferIdentification!= null));
        }
        {
            LotQuantityType theWaferQuantity;
            theWaferQuantity = this.getWaferQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferQuantity", theWaferQuantity), currentHashCode, theWaferQuantity, (this.waferQuantity!= null));
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
            WaferIdentificationType theWaferIdentification;
            theWaferIdentification = this.getWaferIdentification();
            strategy.appendField(locator, this, "waferIdentification", buffer, theWaferIdentification, (this.waferIdentification!= null));
        }
        {
            LotQuantityType theWaferQuantity;
            theWaferQuantity = this.getWaferQuantity();
            strategy.appendField(locator, this, "waferQuantity", buffer, theWaferQuantity, (this.waferQuantity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
