
package io.dscope.rosettanet.interchange.inventoryreportdistribution.v02_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_03.InventoryTypeType;
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
 * <p>Java class for InventoryMovementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryMovementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromStatus" type="{urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03}InventoryTypeType" minOccurs="0"/&gt;
 *         &lt;element name="ToStatus" type="{urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03}InventoryTypeType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "InventoryMovementType", propOrder = {
    "fromStatus",
    "toStatus",
    "type"
})
public class InventoryMovementType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "FromStatus")
    protected InventoryTypeType fromStatus;
    @XmlElement(name = "ToStatus")
    protected InventoryTypeType toStatus;
    @XmlElement(name = "Type")
    protected String type;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the fromStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryTypeType }
     *     
     */
    public InventoryTypeType getFromStatus() {
        return fromStatus;
    }

    /**
     * Sets the value of the fromStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryTypeType }
     *     
     */
    public void setFromStatus(InventoryTypeType value) {
        this.fromStatus = value;
    }

    /**
     * Gets the value of the toStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryTypeType }
     *     
     */
    public InventoryTypeType getToStatus() {
        return toStatus;
    }

    /**
     * Sets the value of the toStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryTypeType }
     *     
     */
    public void setToStatus(InventoryTypeType value) {
        this.toStatus = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
        final InventoryMovementType that = ((InventoryMovementType) object);
        {
            InventoryTypeType lhsFromStatus;
            lhsFromStatus = this.getFromStatus();
            InventoryTypeType rhsFromStatus;
            rhsFromStatus = that.getFromStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromStatus", lhsFromStatus), LocatorUtils.property(thatLocator, "fromStatus", rhsFromStatus), lhsFromStatus, rhsFromStatus, (this.fromStatus!= null), (that.fromStatus!= null))) {
                return false;
            }
        }
        {
            InventoryTypeType lhsToStatus;
            lhsToStatus = this.getToStatus();
            InventoryTypeType rhsToStatus;
            rhsToStatus = that.getToStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toStatus", lhsToStatus), LocatorUtils.property(thatLocator, "toStatus", rhsToStatus), lhsToStatus, rhsToStatus, (this.toStatus!= null), (that.toStatus!= null))) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
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
            InventoryTypeType theFromStatus;
            theFromStatus = this.getFromStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromStatus", theFromStatus), currentHashCode, theFromStatus, (this.fromStatus!= null));
        }
        {
            InventoryTypeType theToStatus;
            theToStatus = this.getToStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toStatus", theToStatus), currentHashCode, theToStatus, (this.toStatus!= null));
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType, (this.type!= null));
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
            InventoryTypeType theFromStatus;
            theFromStatus = this.getFromStatus();
            strategy.appendField(locator, this, "fromStatus", buffer, theFromStatus, (this.fromStatus!= null));
        }
        {
            InventoryTypeType theToStatus;
            theToStatus = this.getToStatus();
            strategy.appendField(locator, this, "toStatus", buffer, theToStatus, (this.toStatus!= null));
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
