
package io.dscope.rosettanet.domain.procurement.procurement.v01_16;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_02.InventoryType;
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
 * <p>Java class for ForecastProductInventoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastProductInventoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.02}InventoryType"/&gt;
 *         &lt;element name="ProductInventory" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
@XmlType(name = "ForecastProductInventoryType", propOrder = {
    "inventoryType",
    "productInventory"
})
public class ForecastProductInventoryType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "InventoryType", namespace = "urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.02", type = InventoryType.class)
    protected InventoryType inventoryType;
    @XmlElement(name = "ProductInventory")
    protected float productInventory;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the inventoryType property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryType }
     *     
     */
    public InventoryType getInventoryType() {
        return inventoryType;
    }

    /**
     * Sets the value of the inventoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryType }
     *     
     */
    public void setInventoryType(InventoryType value) {
        this.inventoryType = value;
    }

    /**
     * Gets the value of the productInventory property.
     * 
     */
    public float getProductInventory() {
        return productInventory;
    }

    /**
     * Sets the value of the productInventory property.
     * 
     */
    public void setProductInventory(float value) {
        this.productInventory = value;
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
        final ForecastProductInventoryType that = ((ForecastProductInventoryType) object);
        {
            InventoryType lhsInventoryType;
            lhsInventoryType = this.getInventoryType();
            InventoryType rhsInventoryType;
            rhsInventoryType = that.getInventoryType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inventoryType", lhsInventoryType), LocatorUtils.property(thatLocator, "inventoryType", rhsInventoryType), lhsInventoryType, rhsInventoryType, (this.inventoryType!= null), (that.inventoryType!= null))) {
                return false;
            }
        }
        {
            float lhsProductInventory;
            lhsProductInventory = this.getProductInventory();
            float rhsProductInventory;
            rhsProductInventory = that.getProductInventory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productInventory", lhsProductInventory), LocatorUtils.property(thatLocator, "productInventory", rhsProductInventory), lhsProductInventory, rhsProductInventory, true, true)) {
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
            InventoryType theInventoryType;
            theInventoryType = this.getInventoryType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inventoryType", theInventoryType), currentHashCode, theInventoryType, (this.inventoryType!= null));
        }
        {
            float theProductInventory;
            theProductInventory = this.getProductInventory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productInventory", theProductInventory), currentHashCode, theProductInventory, true);
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
            InventoryType theInventoryType;
            theInventoryType = this.getInventoryType();
            strategy.appendField(locator, this, "inventoryType", buffer, theInventoryType, (this.inventoryType!= null));
        }
        {
            float theProductInventory;
            theProductInventory = this.getProductInventory();
            strategy.appendField(locator, this, "productInventory", buffer, theProductInventory, true);
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
