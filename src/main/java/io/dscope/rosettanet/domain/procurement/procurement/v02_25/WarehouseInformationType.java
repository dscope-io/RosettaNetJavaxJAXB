
package io.dscope.rosettanet.domain.procurement.procurement.v02_25;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for WarehouseInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarehouseInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}WarehouseLocation"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}WarehouseQuantityInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "WarehouseInformationType", propOrder = {
    "warehouseLocation",
    "warehouseQuantityInformation"
})
public class WarehouseInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "WarehouseLocation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = WarehouseLocation.class)
    protected WarehouseLocation warehouseLocation;
    @XmlElementRef(name = "WarehouseQuantityInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = WarehouseQuantityInformation.class, required = false)
    protected List<WarehouseQuantityInformation> warehouseQuantityInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the warehouseLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WarehouseLocation }
     *     
     */
    public WarehouseLocation getWarehouseLocation() {
        return warehouseLocation;
    }

    /**
     * Sets the value of the warehouseLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarehouseLocation }
     *     
     */
    public void setWarehouseLocation(WarehouseLocation value) {
        this.warehouseLocation = value;
    }

    /**
     * Gets the value of the warehouseQuantityInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warehouseQuantityInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarehouseQuantityInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarehouseQuantityInformation }
     * 
     * 
     */
    public List<WarehouseQuantityInformation> getWarehouseQuantityInformation() {
        if (warehouseQuantityInformation == null) {
            warehouseQuantityInformation = new ArrayList<WarehouseQuantityInformation>();
        }
        return this.warehouseQuantityInformation;
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
        final WarehouseInformationType that = ((WarehouseInformationType) object);
        {
            WarehouseLocation lhsWarehouseLocation;
            lhsWarehouseLocation = this.getWarehouseLocation();
            WarehouseLocation rhsWarehouseLocation;
            rhsWarehouseLocation = that.getWarehouseLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warehouseLocation", lhsWarehouseLocation), LocatorUtils.property(thatLocator, "warehouseLocation", rhsWarehouseLocation), lhsWarehouseLocation, rhsWarehouseLocation, (this.warehouseLocation!= null), (that.warehouseLocation!= null))) {
                return false;
            }
        }
        {
            List<WarehouseQuantityInformation> lhsWarehouseQuantityInformation;
            lhsWarehouseQuantityInformation = (((this.warehouseQuantityInformation!= null)&&(!this.warehouseQuantityInformation.isEmpty()))?this.getWarehouseQuantityInformation():null);
            List<WarehouseQuantityInformation> rhsWarehouseQuantityInformation;
            rhsWarehouseQuantityInformation = (((that.warehouseQuantityInformation!= null)&&(!that.warehouseQuantityInformation.isEmpty()))?that.getWarehouseQuantityInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warehouseQuantityInformation", lhsWarehouseQuantityInformation), LocatorUtils.property(thatLocator, "warehouseQuantityInformation", rhsWarehouseQuantityInformation), lhsWarehouseQuantityInformation, rhsWarehouseQuantityInformation, ((this.warehouseQuantityInformation!= null)&&(!this.warehouseQuantityInformation.isEmpty())), ((that.warehouseQuantityInformation!= null)&&(!that.warehouseQuantityInformation.isEmpty())))) {
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
            WarehouseLocation theWarehouseLocation;
            theWarehouseLocation = this.getWarehouseLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warehouseLocation", theWarehouseLocation), currentHashCode, theWarehouseLocation, (this.warehouseLocation!= null));
        }
        {
            List<WarehouseQuantityInformation> theWarehouseQuantityInformation;
            theWarehouseQuantityInformation = (((this.warehouseQuantityInformation!= null)&&(!this.warehouseQuantityInformation.isEmpty()))?this.getWarehouseQuantityInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warehouseQuantityInformation", theWarehouseQuantityInformation), currentHashCode, theWarehouseQuantityInformation, ((this.warehouseQuantityInformation!= null)&&(!this.warehouseQuantityInformation.isEmpty())));
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
            WarehouseLocation theWarehouseLocation;
            theWarehouseLocation = this.getWarehouseLocation();
            strategy.appendField(locator, this, "warehouseLocation", buffer, theWarehouseLocation, (this.warehouseLocation!= null));
        }
        {
            List<WarehouseQuantityInformation> theWarehouseQuantityInformation;
            theWarehouseQuantityInformation = (((this.warehouseQuantityInformation!= null)&&(!this.warehouseQuantityInformation.isEmpty()))?this.getWarehouseQuantityInformation():null);
            strategy.appendField(locator, this, "warehouseQuantityInformation", buffer, theWarehouseQuantityInformation, ((this.warehouseQuantityInformation!= null)&&(!this.warehouseQuantityInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
