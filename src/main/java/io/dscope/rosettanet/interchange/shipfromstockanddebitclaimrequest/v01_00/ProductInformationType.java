
package io.dscope.rosettanet.interchange.shipfromstockanddebitclaimrequest.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.PricingInformationType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
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
 * <p>Java class for ProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesignRegistrationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistributorPricing" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}PricingInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ShippedQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="SupplierAuthorizationLineItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
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
@XmlType(name = "ProductInformationType", propOrder = {
    "designRegistrationIdentifier",
    "distributorPricing",
    "productIdentification",
    "shipDate",
    "shippedQuantity",
    "supplierAuthorizationLineItem",
    "unitOfMeasure"
})
public class ProductInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DesignRegistrationIdentifier")
    protected String designRegistrationIdentifier;
    @XmlElement(name = "DistributorPricing")
    protected PricingInformationType distributorPricing;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ShipDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDate;
    @XmlElement(name = "ShippedQuantity")
    protected float shippedQuantity;
    @XmlElement(name = "SupplierAuthorizationLineItem")
    protected String supplierAuthorizationLineItem;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designRegistrationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignRegistrationIdentifier() {
        return designRegistrationIdentifier;
    }

    /**
     * Sets the value of the designRegistrationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignRegistrationIdentifier(String value) {
        this.designRegistrationIdentifier = value;
    }

    /**
     * Gets the value of the distributorPricing property.
     * 
     * @return
     *     possible object is
     *     {@link PricingInformationType }
     *     
     */
    public PricingInformationType getDistributorPricing() {
        return distributorPricing;
    }

    /**
     * Sets the value of the distributorPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingInformationType }
     *     
     */
    public void setDistributorPricing(PricingInformationType value) {
        this.distributorPricing = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shippedQuantity property.
     * 
     */
    public float getShippedQuantity() {
        return shippedQuantity;
    }

    /**
     * Sets the value of the shippedQuantity property.
     * 
     */
    public void setShippedQuantity(float value) {
        this.shippedQuantity = value;
    }

    /**
     * Gets the value of the supplierAuthorizationLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierAuthorizationLineItem() {
        return supplierAuthorizationLineItem;
    }

    /**
     * Sets the value of the supplierAuthorizationLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierAuthorizationLineItem(String value) {
        this.supplierAuthorizationLineItem = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
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
        final ProductInformationType that = ((ProductInformationType) object);
        {
            String lhsDesignRegistrationIdentifier;
            lhsDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            String rhsDesignRegistrationIdentifier;
            rhsDesignRegistrationIdentifier = that.getDesignRegistrationIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designRegistrationIdentifier", lhsDesignRegistrationIdentifier), LocatorUtils.property(thatLocator, "designRegistrationIdentifier", rhsDesignRegistrationIdentifier), lhsDesignRegistrationIdentifier, rhsDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null), (that.designRegistrationIdentifier!= null))) {
                return false;
            }
        }
        {
            PricingInformationType lhsDistributorPricing;
            lhsDistributorPricing = this.getDistributorPricing();
            PricingInformationType rhsDistributorPricing;
            rhsDistributorPricing = that.getDistributorPricing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distributorPricing", lhsDistributorPricing), LocatorUtils.property(thatLocator, "distributorPricing", rhsDistributorPricing), lhsDistributorPricing, rhsDistributorPricing, (this.distributorPricing!= null), (that.distributorPricing!= null))) {
                return false;
            }
        }
        {
            ProductIdentification lhsProductIdentification;
            lhsProductIdentification = this.getProductIdentification();
            ProductIdentification rhsProductIdentification;
            rhsProductIdentification = that.getProductIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentification", lhsProductIdentification), LocatorUtils.property(thatLocator, "productIdentification", rhsProductIdentification), lhsProductIdentification, rhsProductIdentification, (this.productIdentification!= null), (that.productIdentification!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsShipDate;
            lhsShipDate = this.getShipDate();
            XMLGregorianCalendar rhsShipDate;
            rhsShipDate = that.getShipDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipDate", lhsShipDate), LocatorUtils.property(thatLocator, "shipDate", rhsShipDate), lhsShipDate, rhsShipDate, (this.shipDate!= null), (that.shipDate!= null))) {
                return false;
            }
        }
        {
            float lhsShippedQuantity;
            lhsShippedQuantity = this.getShippedQuantity();
            float rhsShippedQuantity;
            rhsShippedQuantity = that.getShippedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippedQuantity", lhsShippedQuantity), LocatorUtils.property(thatLocator, "shippedQuantity", rhsShippedQuantity), lhsShippedQuantity, rhsShippedQuantity, true, true)) {
                return false;
            }
        }
        {
            String lhsSupplierAuthorizationLineItem;
            lhsSupplierAuthorizationLineItem = this.getSupplierAuthorizationLineItem();
            String rhsSupplierAuthorizationLineItem;
            rhsSupplierAuthorizationLineItem = that.getSupplierAuthorizationLineItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplierAuthorizationLineItem", lhsSupplierAuthorizationLineItem), LocatorUtils.property(thatLocator, "supplierAuthorizationLineItem", rhsSupplierAuthorizationLineItem), lhsSupplierAuthorizationLineItem, rhsSupplierAuthorizationLineItem, (this.supplierAuthorizationLineItem!= null), (that.supplierAuthorizationLineItem!= null))) {
                return false;
            }
        }
        {
            UnitOfMeasure lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            UnitOfMeasure rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, (this.unitOfMeasure!= null), (that.unitOfMeasure!= null))) {
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
            String theDesignRegistrationIdentifier;
            theDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designRegistrationIdentifier", theDesignRegistrationIdentifier), currentHashCode, theDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null));
        }
        {
            PricingInformationType theDistributorPricing;
            theDistributorPricing = this.getDistributorPricing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distributorPricing", theDistributorPricing), currentHashCode, theDistributorPricing, (this.distributorPricing!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            XMLGregorianCalendar theShipDate;
            theShipDate = this.getShipDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipDate", theShipDate), currentHashCode, theShipDate, (this.shipDate!= null));
        }
        {
            float theShippedQuantity;
            theShippedQuantity = this.getShippedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippedQuantity", theShippedQuantity), currentHashCode, theShippedQuantity, true);
        }
        {
            String theSupplierAuthorizationLineItem;
            theSupplierAuthorizationLineItem = this.getSupplierAuthorizationLineItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplierAuthorizationLineItem", theSupplierAuthorizationLineItem), currentHashCode, theSupplierAuthorizationLineItem, (this.supplierAuthorizationLineItem!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
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
            String theDesignRegistrationIdentifier;
            theDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            strategy.appendField(locator, this, "designRegistrationIdentifier", buffer, theDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null));
        }
        {
            PricingInformationType theDistributorPricing;
            theDistributorPricing = this.getDistributorPricing();
            strategy.appendField(locator, this, "distributorPricing", buffer, theDistributorPricing, (this.distributorPricing!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            XMLGregorianCalendar theShipDate;
            theShipDate = this.getShipDate();
            strategy.appendField(locator, this, "shipDate", buffer, theShipDate, (this.shipDate!= null));
        }
        {
            float theShippedQuantity;
            theShippedQuantity = this.getShippedQuantity();
            strategy.appendField(locator, this, "shippedQuantity", buffer, theShippedQuantity, true);
        }
        {
            String theSupplierAuthorizationLineItem;
            theSupplierAuthorizationLineItem = this.getSupplierAuthorizationLineItem();
            strategy.appendField(locator, this, "supplierAuthorizationLineItem", buffer, theSupplierAuthorizationLineItem, (this.supplierAuthorizationLineItem!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
