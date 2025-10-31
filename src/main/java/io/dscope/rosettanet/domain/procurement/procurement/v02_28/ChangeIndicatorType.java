
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

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
 * <p>Java class for ChangeIndicatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeIndicatorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AncillaryDocumentChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DateChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EquipmentOrderChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PurchaseOrderValueChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "ChangeIndicatorType", propOrder = {
    "ancillaryDocumentChangeIndicator",
    "dateChangeIndicator",
    "equipmentOrderChangeIndicator",
    "purchaseOrderValueChangeIndicator"
})
public class ChangeIndicatorType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AncillaryDocumentChangeIndicator")
    protected boolean ancillaryDocumentChangeIndicator;
    @XmlElement(name = "DateChangeIndicator")
    protected boolean dateChangeIndicator;
    @XmlElement(name = "EquipmentOrderChangeIndicator")
    protected boolean equipmentOrderChangeIndicator;
    @XmlElement(name = "PurchaseOrderValueChangeIndicator")
    protected boolean purchaseOrderValueChangeIndicator;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the ancillaryDocumentChangeIndicator property.
     * 
     */
    public boolean isAncillaryDocumentChangeIndicator() {
        return ancillaryDocumentChangeIndicator;
    }

    /**
     * Sets the value of the ancillaryDocumentChangeIndicator property.
     * 
     */
    public void setAncillaryDocumentChangeIndicator(boolean value) {
        this.ancillaryDocumentChangeIndicator = value;
    }

    /**
     * Gets the value of the dateChangeIndicator property.
     * 
     */
    public boolean isDateChangeIndicator() {
        return dateChangeIndicator;
    }

    /**
     * Sets the value of the dateChangeIndicator property.
     * 
     */
    public void setDateChangeIndicator(boolean value) {
        this.dateChangeIndicator = value;
    }

    /**
     * Gets the value of the equipmentOrderChangeIndicator property.
     * 
     */
    public boolean isEquipmentOrderChangeIndicator() {
        return equipmentOrderChangeIndicator;
    }

    /**
     * Sets the value of the equipmentOrderChangeIndicator property.
     * 
     */
    public void setEquipmentOrderChangeIndicator(boolean value) {
        this.equipmentOrderChangeIndicator = value;
    }

    /**
     * Gets the value of the purchaseOrderValueChangeIndicator property.
     * 
     */
    public boolean isPurchaseOrderValueChangeIndicator() {
        return purchaseOrderValueChangeIndicator;
    }

    /**
     * Sets the value of the purchaseOrderValueChangeIndicator property.
     * 
     */
    public void setPurchaseOrderValueChangeIndicator(boolean value) {
        this.purchaseOrderValueChangeIndicator = value;
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
        final ChangeIndicatorType that = ((ChangeIndicatorType) object);
        {
            boolean lhsAncillaryDocumentChangeIndicator;
            lhsAncillaryDocumentChangeIndicator = this.isAncillaryDocumentChangeIndicator();
            boolean rhsAncillaryDocumentChangeIndicator;
            rhsAncillaryDocumentChangeIndicator = that.isAncillaryDocumentChangeIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ancillaryDocumentChangeIndicator", lhsAncillaryDocumentChangeIndicator), LocatorUtils.property(thatLocator, "ancillaryDocumentChangeIndicator", rhsAncillaryDocumentChangeIndicator), lhsAncillaryDocumentChangeIndicator, rhsAncillaryDocumentChangeIndicator, true, true)) {
                return false;
            }
        }
        {
            boolean lhsDateChangeIndicator;
            lhsDateChangeIndicator = this.isDateChangeIndicator();
            boolean rhsDateChangeIndicator;
            rhsDateChangeIndicator = that.isDateChangeIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateChangeIndicator", lhsDateChangeIndicator), LocatorUtils.property(thatLocator, "dateChangeIndicator", rhsDateChangeIndicator), lhsDateChangeIndicator, rhsDateChangeIndicator, true, true)) {
                return false;
            }
        }
        {
            boolean lhsEquipmentOrderChangeIndicator;
            lhsEquipmentOrderChangeIndicator = this.isEquipmentOrderChangeIndicator();
            boolean rhsEquipmentOrderChangeIndicator;
            rhsEquipmentOrderChangeIndicator = that.isEquipmentOrderChangeIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "equipmentOrderChangeIndicator", lhsEquipmentOrderChangeIndicator), LocatorUtils.property(thatLocator, "equipmentOrderChangeIndicator", rhsEquipmentOrderChangeIndicator), lhsEquipmentOrderChangeIndicator, rhsEquipmentOrderChangeIndicator, true, true)) {
                return false;
            }
        }
        {
            boolean lhsPurchaseOrderValueChangeIndicator;
            lhsPurchaseOrderValueChangeIndicator = this.isPurchaseOrderValueChangeIndicator();
            boolean rhsPurchaseOrderValueChangeIndicator;
            rhsPurchaseOrderValueChangeIndicator = that.isPurchaseOrderValueChangeIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderValueChangeIndicator", lhsPurchaseOrderValueChangeIndicator), LocatorUtils.property(thatLocator, "purchaseOrderValueChangeIndicator", rhsPurchaseOrderValueChangeIndicator), lhsPurchaseOrderValueChangeIndicator, rhsPurchaseOrderValueChangeIndicator, true, true)) {
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
            boolean theAncillaryDocumentChangeIndicator;
            theAncillaryDocumentChangeIndicator = this.isAncillaryDocumentChangeIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ancillaryDocumentChangeIndicator", theAncillaryDocumentChangeIndicator), currentHashCode, theAncillaryDocumentChangeIndicator, true);
        }
        {
            boolean theDateChangeIndicator;
            theDateChangeIndicator = this.isDateChangeIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateChangeIndicator", theDateChangeIndicator), currentHashCode, theDateChangeIndicator, true);
        }
        {
            boolean theEquipmentOrderChangeIndicator;
            theEquipmentOrderChangeIndicator = this.isEquipmentOrderChangeIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "equipmentOrderChangeIndicator", theEquipmentOrderChangeIndicator), currentHashCode, theEquipmentOrderChangeIndicator, true);
        }
        {
            boolean thePurchaseOrderValueChangeIndicator;
            thePurchaseOrderValueChangeIndicator = this.isPurchaseOrderValueChangeIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderValueChangeIndicator", thePurchaseOrderValueChangeIndicator), currentHashCode, thePurchaseOrderValueChangeIndicator, true);
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
            boolean theAncillaryDocumentChangeIndicator;
            theAncillaryDocumentChangeIndicator = this.isAncillaryDocumentChangeIndicator();
            strategy.appendField(locator, this, "ancillaryDocumentChangeIndicator", buffer, theAncillaryDocumentChangeIndicator, true);
        }
        {
            boolean theDateChangeIndicator;
            theDateChangeIndicator = this.isDateChangeIndicator();
            strategy.appendField(locator, this, "dateChangeIndicator", buffer, theDateChangeIndicator, true);
        }
        {
            boolean theEquipmentOrderChangeIndicator;
            theEquipmentOrderChangeIndicator = this.isEquipmentOrderChangeIndicator();
            strategy.appendField(locator, this, "equipmentOrderChangeIndicator", buffer, theEquipmentOrderChangeIndicator, true);
        }
        {
            boolean thePurchaseOrderValueChangeIndicator;
            thePurchaseOrderValueChangeIndicator = this.isPurchaseOrderValueChangeIndicator();
            strategy.appendField(locator, this, "purchaseOrderValueChangeIndicator", buffer, thePurchaseOrderValueChangeIndicator, true);
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
