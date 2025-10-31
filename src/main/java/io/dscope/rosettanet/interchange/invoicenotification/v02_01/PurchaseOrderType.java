
package io.dscope.rosettanet.interchange.invoicenotification.v02_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.shipmentterms.v01_03.ShipmentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_18.SpecifiedBusinessDocumentReferenceType;
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
 * <p>Java class for PurchaseOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18}SpecifiedBusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ProductLineItem" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.01}ProductLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18}SpecifiedBusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03}ShipmentTerms" minOccurs="0"/&gt;
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
@XmlType(name = "PurchaseOrderType", propOrder = {
    "governmentContractIdentifier",
    "productLineItem",
    "purchaseOrderNumber",
    "shipmentTerms"
})
public class PurchaseOrderType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "GovernmentContractIdentifier")
    protected SpecifiedBusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElement(name = "ProductLineItem", required = true)
    protected List<ProductLineItemType> productLineItem;
    @XmlElement(name = "PurchaseOrderNumber")
    protected SpecifiedBusinessDocumentReferenceType purchaseOrderNumber;
    @XmlElementRef(name = "ShipmentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03", type = ShipmentTerms.class, required = false)
    protected ShipmentTerms shipmentTerms;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the governmentContractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public SpecifiedBusinessDocumentReferenceType getGovernmentContractIdentifier() {
        return governmentContractIdentifier;
    }

    /**
     * Sets the value of the governmentContractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public void setGovernmentContractIdentifier(SpecifiedBusinessDocumentReferenceType value) {
        this.governmentContractIdentifier = value;
    }

    /**
     * Gets the value of the productLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLineItemType }
     * 
     * 
     */
    public List<ProductLineItemType> getProductLineItem() {
        if (productLineItem == null) {
            productLineItem = new ArrayList<ProductLineItemType>();
        }
        return this.productLineItem;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public SpecifiedBusinessDocumentReferenceType getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public void setPurchaseOrderNumber(SpecifiedBusinessDocumentReferenceType value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the shipmentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentTerms }
     *     
     */
    public ShipmentTerms getShipmentTerms() {
        return shipmentTerms;
    }

    /**
     * Sets the value of the shipmentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTerms }
     *     
     */
    public void setShipmentTerms(ShipmentTerms value) {
        this.shipmentTerms = value;
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
        final PurchaseOrderType that = ((PurchaseOrderType) object);
        {
            SpecifiedBusinessDocumentReferenceType lhsGovernmentContractIdentifier;
            lhsGovernmentContractIdentifier = this.getGovernmentContractIdentifier();
            SpecifiedBusinessDocumentReferenceType rhsGovernmentContractIdentifier;
            rhsGovernmentContractIdentifier = that.getGovernmentContractIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "governmentContractIdentifier", lhsGovernmentContractIdentifier), LocatorUtils.property(thatLocator, "governmentContractIdentifier", rhsGovernmentContractIdentifier), lhsGovernmentContractIdentifier, rhsGovernmentContractIdentifier, (this.governmentContractIdentifier!= null), (that.governmentContractIdentifier!= null))) {
                return false;
            }
        }
        {
            List<ProductLineItemType> lhsProductLineItem;
            lhsProductLineItem = (((this.productLineItem!= null)&&(!this.productLineItem.isEmpty()))?this.getProductLineItem():null);
            List<ProductLineItemType> rhsProductLineItem;
            rhsProductLineItem = (((that.productLineItem!= null)&&(!that.productLineItem.isEmpty()))?that.getProductLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productLineItem", lhsProductLineItem), LocatorUtils.property(thatLocator, "productLineItem", rhsProductLineItem), lhsProductLineItem, rhsProductLineItem, ((this.productLineItem!= null)&&(!this.productLineItem.isEmpty())), ((that.productLineItem!= null)&&(!that.productLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            SpecifiedBusinessDocumentReferenceType lhsPurchaseOrderNumber;
            lhsPurchaseOrderNumber = this.getPurchaseOrderNumber();
            SpecifiedBusinessDocumentReferenceType rhsPurchaseOrderNumber;
            rhsPurchaseOrderNumber = that.getPurchaseOrderNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderNumber", lhsPurchaseOrderNumber), LocatorUtils.property(thatLocator, "purchaseOrderNumber", rhsPurchaseOrderNumber), lhsPurchaseOrderNumber, rhsPurchaseOrderNumber, (this.purchaseOrderNumber!= null), (that.purchaseOrderNumber!= null))) {
                return false;
            }
        }
        {
            ShipmentTerms lhsShipmentTerms;
            lhsShipmentTerms = this.getShipmentTerms();
            ShipmentTerms rhsShipmentTerms;
            rhsShipmentTerms = that.getShipmentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentTerms", lhsShipmentTerms), LocatorUtils.property(thatLocator, "shipmentTerms", rhsShipmentTerms), lhsShipmentTerms, rhsShipmentTerms, (this.shipmentTerms!= null), (that.shipmentTerms!= null))) {
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
            SpecifiedBusinessDocumentReferenceType theGovernmentContractIdentifier;
            theGovernmentContractIdentifier = this.getGovernmentContractIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "governmentContractIdentifier", theGovernmentContractIdentifier), currentHashCode, theGovernmentContractIdentifier, (this.governmentContractIdentifier!= null));
        }
        {
            List<ProductLineItemType> theProductLineItem;
            theProductLineItem = (((this.productLineItem!= null)&&(!this.productLineItem.isEmpty()))?this.getProductLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLineItem", theProductLineItem), currentHashCode, theProductLineItem, ((this.productLineItem!= null)&&(!this.productLineItem.isEmpty())));
        }
        {
            SpecifiedBusinessDocumentReferenceType thePurchaseOrderNumber;
            thePurchaseOrderNumber = this.getPurchaseOrderNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderNumber", thePurchaseOrderNumber), currentHashCode, thePurchaseOrderNumber, (this.purchaseOrderNumber!= null));
        }
        {
            ShipmentTerms theShipmentTerms;
            theShipmentTerms = this.getShipmentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentTerms", theShipmentTerms), currentHashCode, theShipmentTerms, (this.shipmentTerms!= null));
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
            SpecifiedBusinessDocumentReferenceType theGovernmentContractIdentifier;
            theGovernmentContractIdentifier = this.getGovernmentContractIdentifier();
            strategy.appendField(locator, this, "governmentContractIdentifier", buffer, theGovernmentContractIdentifier, (this.governmentContractIdentifier!= null));
        }
        {
            List<ProductLineItemType> theProductLineItem;
            theProductLineItem = (((this.productLineItem!= null)&&(!this.productLineItem.isEmpty()))?this.getProductLineItem():null);
            strategy.appendField(locator, this, "productLineItem", buffer, theProductLineItem, ((this.productLineItem!= null)&&(!this.productLineItem.isEmpty())));
        }
        {
            SpecifiedBusinessDocumentReferenceType thePurchaseOrderNumber;
            thePurchaseOrderNumber = this.getPurchaseOrderNumber();
            strategy.appendField(locator, this, "purchaseOrderNumber", buffer, thePurchaseOrderNumber, (this.purchaseOrderNumber!= null));
        }
        {
            ShipmentTerms theShipmentTerms;
            theShipmentTerms = this.getShipmentTerms();
            strategy.appendField(locator, this, "shipmentTerms", buffer, theShipmentTerms, (this.shipmentTerms!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
