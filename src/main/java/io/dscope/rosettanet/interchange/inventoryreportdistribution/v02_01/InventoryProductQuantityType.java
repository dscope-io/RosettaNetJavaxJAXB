
package io.dscope.rosettanet.interchange.inventoryreportdistribution.v02_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_03.InventoryType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.InventoryItemIdentification;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductQuantity;
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
 * <p>Java class for InventoryProductQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryProductQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}InventoryItemIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InventoryMovement" type="{urn:rosettanet:specification:interchange:InventoryReportDistribution:xsd:schema:02.01}InventoryMovementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03}InventoryType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantity"/&gt;
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
@XmlType(name = "InventoryProductQuantityType", propOrder = {
    "deviceNumber",
    "inventoryItemIdentification",
    "inventoryMovement",
    "inventoryType",
    "productQuantity"
})
public class InventoryProductQuantityType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DeviceNumber")
    protected List<String> deviceNumber;
    @XmlElementRef(name = "InventoryItemIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = InventoryItemIdentification.class, required = false)
    protected List<InventoryItemIdentification> inventoryItemIdentification;
    @XmlElement(name = "InventoryMovement")
    protected List<InventoryMovementType> inventoryMovement;
    @XmlElementRef(name = "InventoryType", namespace = "urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03", type = InventoryType.class)
    protected InventoryType inventoryType;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.17", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the deviceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeviceNumber() {
        if (deviceNumber == null) {
            deviceNumber = new ArrayList<String>();
        }
        return this.deviceNumber;
    }

    /**
     * Gets the value of the inventoryItemIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryItemIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryItemIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryItemIdentification }
     * 
     * 
     */
    public List<InventoryItemIdentification> getInventoryItemIdentification() {
        if (inventoryItemIdentification == null) {
            inventoryItemIdentification = new ArrayList<InventoryItemIdentification>();
        }
        return this.inventoryItemIdentification;
    }

    /**
     * Gets the value of the inventoryMovement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryMovement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryMovement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryMovementType }
     * 
     * 
     */
    public List<InventoryMovementType> getInventoryMovement() {
        if (inventoryMovement == null) {
            inventoryMovement = new ArrayList<InventoryMovementType>();
        }
        return this.inventoryMovement;
    }

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
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
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
        final InventoryProductQuantityType that = ((InventoryProductQuantityType) object);
        {
            List<String> lhsDeviceNumber;
            lhsDeviceNumber = (((this.deviceNumber!= null)&&(!this.deviceNumber.isEmpty()))?this.getDeviceNumber():null);
            List<String> rhsDeviceNumber;
            rhsDeviceNumber = (((that.deviceNumber!= null)&&(!that.deviceNumber.isEmpty()))?that.getDeviceNumber():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deviceNumber", lhsDeviceNumber), LocatorUtils.property(thatLocator, "deviceNumber", rhsDeviceNumber), lhsDeviceNumber, rhsDeviceNumber, ((this.deviceNumber!= null)&&(!this.deviceNumber.isEmpty())), ((that.deviceNumber!= null)&&(!that.deviceNumber.isEmpty())))) {
                return false;
            }
        }
        {
            List<InventoryItemIdentification> lhsInventoryItemIdentification;
            lhsInventoryItemIdentification = (((this.inventoryItemIdentification!= null)&&(!this.inventoryItemIdentification.isEmpty()))?this.getInventoryItemIdentification():null);
            List<InventoryItemIdentification> rhsInventoryItemIdentification;
            rhsInventoryItemIdentification = (((that.inventoryItemIdentification!= null)&&(!that.inventoryItemIdentification.isEmpty()))?that.getInventoryItemIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inventoryItemIdentification", lhsInventoryItemIdentification), LocatorUtils.property(thatLocator, "inventoryItemIdentification", rhsInventoryItemIdentification), lhsInventoryItemIdentification, rhsInventoryItemIdentification, ((this.inventoryItemIdentification!= null)&&(!this.inventoryItemIdentification.isEmpty())), ((that.inventoryItemIdentification!= null)&&(!that.inventoryItemIdentification.isEmpty())))) {
                return false;
            }
        }
        {
            List<InventoryMovementType> lhsInventoryMovement;
            lhsInventoryMovement = (((this.inventoryMovement!= null)&&(!this.inventoryMovement.isEmpty()))?this.getInventoryMovement():null);
            List<InventoryMovementType> rhsInventoryMovement;
            rhsInventoryMovement = (((that.inventoryMovement!= null)&&(!that.inventoryMovement.isEmpty()))?that.getInventoryMovement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inventoryMovement", lhsInventoryMovement), LocatorUtils.property(thatLocator, "inventoryMovement", rhsInventoryMovement), lhsInventoryMovement, rhsInventoryMovement, ((this.inventoryMovement!= null)&&(!this.inventoryMovement.isEmpty())), ((that.inventoryMovement!= null)&&(!that.inventoryMovement.isEmpty())))) {
                return false;
            }
        }
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
            ProductQuantity lhsProductQuantity;
            lhsProductQuantity = this.getProductQuantity();
            ProductQuantity rhsProductQuantity;
            rhsProductQuantity = that.getProductQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productQuantity", lhsProductQuantity), LocatorUtils.property(thatLocator, "productQuantity", rhsProductQuantity), lhsProductQuantity, rhsProductQuantity, (this.productQuantity!= null), (that.productQuantity!= null))) {
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
            List<String> theDeviceNumber;
            theDeviceNumber = (((this.deviceNumber!= null)&&(!this.deviceNumber.isEmpty()))?this.getDeviceNumber():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deviceNumber", theDeviceNumber), currentHashCode, theDeviceNumber, ((this.deviceNumber!= null)&&(!this.deviceNumber.isEmpty())));
        }
        {
            List<InventoryItemIdentification> theInventoryItemIdentification;
            theInventoryItemIdentification = (((this.inventoryItemIdentification!= null)&&(!this.inventoryItemIdentification.isEmpty()))?this.getInventoryItemIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inventoryItemIdentification", theInventoryItemIdentification), currentHashCode, theInventoryItemIdentification, ((this.inventoryItemIdentification!= null)&&(!this.inventoryItemIdentification.isEmpty())));
        }
        {
            List<InventoryMovementType> theInventoryMovement;
            theInventoryMovement = (((this.inventoryMovement!= null)&&(!this.inventoryMovement.isEmpty()))?this.getInventoryMovement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inventoryMovement", theInventoryMovement), currentHashCode, theInventoryMovement, ((this.inventoryMovement!= null)&&(!this.inventoryMovement.isEmpty())));
        }
        {
            InventoryType theInventoryType;
            theInventoryType = this.getInventoryType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inventoryType", theInventoryType), currentHashCode, theInventoryType, (this.inventoryType!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantity", theProductQuantity), currentHashCode, theProductQuantity, (this.productQuantity!= null));
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
            List<String> theDeviceNumber;
            theDeviceNumber = (((this.deviceNumber!= null)&&(!this.deviceNumber.isEmpty()))?this.getDeviceNumber():null);
            strategy.appendField(locator, this, "deviceNumber", buffer, theDeviceNumber, ((this.deviceNumber!= null)&&(!this.deviceNumber.isEmpty())));
        }
        {
            List<InventoryItemIdentification> theInventoryItemIdentification;
            theInventoryItemIdentification = (((this.inventoryItemIdentification!= null)&&(!this.inventoryItemIdentification.isEmpty()))?this.getInventoryItemIdentification():null);
            strategy.appendField(locator, this, "inventoryItemIdentification", buffer, theInventoryItemIdentification, ((this.inventoryItemIdentification!= null)&&(!this.inventoryItemIdentification.isEmpty())));
        }
        {
            List<InventoryMovementType> theInventoryMovement;
            theInventoryMovement = (((this.inventoryMovement!= null)&&(!this.inventoryMovement.isEmpty()))?this.getInventoryMovement():null);
            strategy.appendField(locator, this, "inventoryMovement", buffer, theInventoryMovement, ((this.inventoryMovement!= null)&&(!this.inventoryMovement.isEmpty())));
        }
        {
            InventoryType theInventoryType;
            theInventoryType = this.getInventoryType();
            strategy.appendField(locator, this, "inventoryType", buffer, theInventoryType, (this.inventoryType!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            strategy.appendField(locator, this, "productQuantity", buffer, theProductQuantity, (this.productQuantity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
