
package io.dscope.rosettanet.domain.procurement.procurement.v01_15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.dates.v01_01.DatePeriodType;
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
 * <p>Java class for WarehouseQuantityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarehouseQuantityInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WarehouseAvailabilityDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.01}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="WarehouseQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}ProductQuantityType" minOccurs="0"/&gt;
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
@XmlType(name = "WarehouseQuantityInformationType", propOrder = {
    "warehouseAvailabilityDate",
    "warehouseQuantity"
})
public class WarehouseQuantityInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "WarehouseAvailabilityDate")
    protected DatePeriodType warehouseAvailabilityDate;
    @XmlElement(name = "WarehouseQuantity")
    protected Float warehouseQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the warehouseAvailabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getWarehouseAvailabilityDate() {
        return warehouseAvailabilityDate;
    }

    /**
     * Sets the value of the warehouseAvailabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setWarehouseAvailabilityDate(DatePeriodType value) {
        this.warehouseAvailabilityDate = value;
    }

    /**
     * Gets the value of the warehouseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWarehouseQuantity() {
        return warehouseQuantity;
    }

    /**
     * Sets the value of the warehouseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWarehouseQuantity(Float value) {
        this.warehouseQuantity = value;
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
        final WarehouseQuantityInformationType that = ((WarehouseQuantityInformationType) object);
        {
            DatePeriodType lhsWarehouseAvailabilityDate;
            lhsWarehouseAvailabilityDate = this.getWarehouseAvailabilityDate();
            DatePeriodType rhsWarehouseAvailabilityDate;
            rhsWarehouseAvailabilityDate = that.getWarehouseAvailabilityDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warehouseAvailabilityDate", lhsWarehouseAvailabilityDate), LocatorUtils.property(thatLocator, "warehouseAvailabilityDate", rhsWarehouseAvailabilityDate), lhsWarehouseAvailabilityDate, rhsWarehouseAvailabilityDate, (this.warehouseAvailabilityDate!= null), (that.warehouseAvailabilityDate!= null))) {
                return false;
            }
        }
        {
            Float lhsWarehouseQuantity;
            lhsWarehouseQuantity = this.getWarehouseQuantity();
            Float rhsWarehouseQuantity;
            rhsWarehouseQuantity = that.getWarehouseQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warehouseQuantity", lhsWarehouseQuantity), LocatorUtils.property(thatLocator, "warehouseQuantity", rhsWarehouseQuantity), lhsWarehouseQuantity, rhsWarehouseQuantity, (this.warehouseQuantity!= null), (that.warehouseQuantity!= null))) {
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
            DatePeriodType theWarehouseAvailabilityDate;
            theWarehouseAvailabilityDate = this.getWarehouseAvailabilityDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warehouseAvailabilityDate", theWarehouseAvailabilityDate), currentHashCode, theWarehouseAvailabilityDate, (this.warehouseAvailabilityDate!= null));
        }
        {
            Float theWarehouseQuantity;
            theWarehouseQuantity = this.getWarehouseQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warehouseQuantity", theWarehouseQuantity), currentHashCode, theWarehouseQuantity, (this.warehouseQuantity!= null));
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
            DatePeriodType theWarehouseAvailabilityDate;
            theWarehouseAvailabilityDate = this.getWarehouseAvailabilityDate();
            strategy.appendField(locator, this, "warehouseAvailabilityDate", buffer, theWarehouseAvailabilityDate, (this.warehouseAvailabilityDate!= null));
        }
        {
            Float theWarehouseQuantity;
            theWarehouseQuantity = this.getWarehouseQuantity();
            strategy.appendField(locator, this, "warehouseQuantity", buffer, theWarehouseQuantity, (this.warehouseQuantity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
