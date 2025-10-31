
package io.dscope.rosettanet.interchange.purchaseorderconfirmation.v02_04;

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
 * <p>Java class for OrderLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ProductLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.04}ProductLineItemType"/&gt;
 *           &lt;element name="ServiceLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.04}ServiceLineItemType"/&gt;
 *           &lt;element name="ServiceLineItemByOption" type="{urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.04}ServiceLineItemByOptionType"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "OrderLineItemType", propOrder = {
    "productLineItem",
    "serviceLineItem",
    "serviceLineItemByOption"
})
public class OrderLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ProductLineItem")
    protected ProductLineItemType productLineItem;
    @XmlElement(name = "ServiceLineItem")
    protected ServiceLineItemType serviceLineItem;
    @XmlElement(name = "ServiceLineItemByOption")
    protected ServiceLineItemByOptionType serviceLineItemByOption;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the productLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLineItemType }
     *     
     */
    public ProductLineItemType getProductLineItem() {
        return productLineItem;
    }

    /**
     * Sets the value of the productLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLineItemType }
     *     
     */
    public void setProductLineItem(ProductLineItemType value) {
        this.productLineItem = value;
    }

    /**
     * Gets the value of the serviceLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLineItemType }
     *     
     */
    public ServiceLineItemType getServiceLineItem() {
        return serviceLineItem;
    }

    /**
     * Sets the value of the serviceLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLineItemType }
     *     
     */
    public void setServiceLineItem(ServiceLineItemType value) {
        this.serviceLineItem = value;
    }

    /**
     * Gets the value of the serviceLineItemByOption property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLineItemByOptionType }
     *     
     */
    public ServiceLineItemByOptionType getServiceLineItemByOption() {
        return serviceLineItemByOption;
    }

    /**
     * Sets the value of the serviceLineItemByOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLineItemByOptionType }
     *     
     */
    public void setServiceLineItemByOption(ServiceLineItemByOptionType value) {
        this.serviceLineItemByOption = value;
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
        final OrderLineItemType that = ((OrderLineItemType) object);
        {
            ProductLineItemType lhsProductLineItem;
            lhsProductLineItem = this.getProductLineItem();
            ProductLineItemType rhsProductLineItem;
            rhsProductLineItem = that.getProductLineItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productLineItem", lhsProductLineItem), LocatorUtils.property(thatLocator, "productLineItem", rhsProductLineItem), lhsProductLineItem, rhsProductLineItem, (this.productLineItem!= null), (that.productLineItem!= null))) {
                return false;
            }
        }
        {
            ServiceLineItemType lhsServiceLineItem;
            lhsServiceLineItem = this.getServiceLineItem();
            ServiceLineItemType rhsServiceLineItem;
            rhsServiceLineItem = that.getServiceLineItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceLineItem", lhsServiceLineItem), LocatorUtils.property(thatLocator, "serviceLineItem", rhsServiceLineItem), lhsServiceLineItem, rhsServiceLineItem, (this.serviceLineItem!= null), (that.serviceLineItem!= null))) {
                return false;
            }
        }
        {
            ServiceLineItemByOptionType lhsServiceLineItemByOption;
            lhsServiceLineItemByOption = this.getServiceLineItemByOption();
            ServiceLineItemByOptionType rhsServiceLineItemByOption;
            rhsServiceLineItemByOption = that.getServiceLineItemByOption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceLineItemByOption", lhsServiceLineItemByOption), LocatorUtils.property(thatLocator, "serviceLineItemByOption", rhsServiceLineItemByOption), lhsServiceLineItemByOption, rhsServiceLineItemByOption, (this.serviceLineItemByOption!= null), (that.serviceLineItemByOption!= null))) {
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
            ProductLineItemType theProductLineItem;
            theProductLineItem = this.getProductLineItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLineItem", theProductLineItem), currentHashCode, theProductLineItem, (this.productLineItem!= null));
        }
        {
            ServiceLineItemType theServiceLineItem;
            theServiceLineItem = this.getServiceLineItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceLineItem", theServiceLineItem), currentHashCode, theServiceLineItem, (this.serviceLineItem!= null));
        }
        {
            ServiceLineItemByOptionType theServiceLineItemByOption;
            theServiceLineItemByOption = this.getServiceLineItemByOption();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceLineItemByOption", theServiceLineItemByOption), currentHashCode, theServiceLineItemByOption, (this.serviceLineItemByOption!= null));
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
            ProductLineItemType theProductLineItem;
            theProductLineItem = this.getProductLineItem();
            strategy.appendField(locator, this, "productLineItem", buffer, theProductLineItem, (this.productLineItem!= null));
        }
        {
            ServiceLineItemType theServiceLineItem;
            theServiceLineItem = this.getServiceLineItem();
            strategy.appendField(locator, this, "serviceLineItem", buffer, theServiceLineItem, (this.serviceLineItem!= null));
        }
        {
            ServiceLineItemByOptionType theServiceLineItemByOption;
            theServiceLineItemByOption = this.getServiceLineItemByOption();
            strategy.appendField(locator, this, "serviceLineItemByOption", buffer, theServiceLineItemByOption, (this.serviceLineItemByOption!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
