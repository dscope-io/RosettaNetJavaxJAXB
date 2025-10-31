
package io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_00;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.ProductAttribute;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.MarketingInstruction;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}MarketingInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}ProductAttribute"/&gt;
 *         &lt;element name="ProductLifeCycle" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.00}ProductLifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="ProductPriceAndAvailability" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.00}ProductPriceAndAvailabilityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductProcurement" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.00}ProductProcurementType" minOccurs="0"/&gt;
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
    "marketingInstruction",
    "productAttribute",
    "productLifeCycle",
    "productPriceAndAvailability",
    "productProcurement"
})
public class ProductInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "MarketingInstruction", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = MarketingInstruction.class, required = false)
    protected MarketingInstruction marketingInstruction;
    @XmlElementRef(name = "ProductAttribute", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = ProductAttribute.class)
    protected ProductAttribute productAttribute;
    @XmlElement(name = "ProductLifeCycle")
    protected ProductLifeCycleType productLifeCycle;
    @XmlElement(name = "ProductPriceAndAvailability")
    protected List<ProductPriceAndAvailabilityType> productPriceAndAvailability;
    @XmlElement(name = "ProductProcurement")
    protected ProductProcurementType productProcurement;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the marketingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingInstruction }
     *     
     */
    public MarketingInstruction getMarketingInstruction() {
        return marketingInstruction;
    }

    /**
     * Sets the value of the marketingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingInstruction }
     *     
     */
    public void setMarketingInstruction(MarketingInstruction value) {
        this.marketingInstruction = value;
    }

    /**
     * Gets the value of the productAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAttribute }
     *     
     */
    public ProductAttribute getProductAttribute() {
        return productAttribute;
    }

    /**
     * Sets the value of the productAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAttribute }
     *     
     */
    public void setProductAttribute(ProductAttribute value) {
        this.productAttribute = value;
    }

    /**
     * Gets the value of the productLifeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLifeCycleType }
     *     
     */
    public ProductLifeCycleType getProductLifeCycle() {
        return productLifeCycle;
    }

    /**
     * Sets the value of the productLifeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLifeCycleType }
     *     
     */
    public void setProductLifeCycle(ProductLifeCycleType value) {
        this.productLifeCycle = value;
    }

    /**
     * Gets the value of the productPriceAndAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPriceAndAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPriceAndAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPriceAndAvailabilityType }
     * 
     * 
     */
    public List<ProductPriceAndAvailabilityType> getProductPriceAndAvailability() {
        if (productPriceAndAvailability == null) {
            productPriceAndAvailability = new ArrayList<ProductPriceAndAvailabilityType>();
        }
        return this.productPriceAndAvailability;
    }

    /**
     * Gets the value of the productProcurement property.
     * 
     * @return
     *     possible object is
     *     {@link ProductProcurementType }
     *     
     */
    public ProductProcurementType getProductProcurement() {
        return productProcurement;
    }

    /**
     * Sets the value of the productProcurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductProcurementType }
     *     
     */
    public void setProductProcurement(ProductProcurementType value) {
        this.productProcurement = value;
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
            MarketingInstruction lhsMarketingInstruction;
            lhsMarketingInstruction = this.getMarketingInstruction();
            MarketingInstruction rhsMarketingInstruction;
            rhsMarketingInstruction = that.getMarketingInstruction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketingInstruction", lhsMarketingInstruction), LocatorUtils.property(thatLocator, "marketingInstruction", rhsMarketingInstruction), lhsMarketingInstruction, rhsMarketingInstruction, (this.marketingInstruction!= null), (that.marketingInstruction!= null))) {
                return false;
            }
        }
        {
            ProductAttribute lhsProductAttribute;
            lhsProductAttribute = this.getProductAttribute();
            ProductAttribute rhsProductAttribute;
            rhsProductAttribute = that.getProductAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productAttribute", lhsProductAttribute), LocatorUtils.property(thatLocator, "productAttribute", rhsProductAttribute), lhsProductAttribute, rhsProductAttribute, (this.productAttribute!= null), (that.productAttribute!= null))) {
                return false;
            }
        }
        {
            ProductLifeCycleType lhsProductLifeCycle;
            lhsProductLifeCycle = this.getProductLifeCycle();
            ProductLifeCycleType rhsProductLifeCycle;
            rhsProductLifeCycle = that.getProductLifeCycle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productLifeCycle", lhsProductLifeCycle), LocatorUtils.property(thatLocator, "productLifeCycle", rhsProductLifeCycle), lhsProductLifeCycle, rhsProductLifeCycle, (this.productLifeCycle!= null), (that.productLifeCycle!= null))) {
                return false;
            }
        }
        {
            List<ProductPriceAndAvailabilityType> lhsProductPriceAndAvailability;
            lhsProductPriceAndAvailability = (((this.productPriceAndAvailability!= null)&&(!this.productPriceAndAvailability.isEmpty()))?this.getProductPriceAndAvailability():null);
            List<ProductPriceAndAvailabilityType> rhsProductPriceAndAvailability;
            rhsProductPriceAndAvailability = (((that.productPriceAndAvailability!= null)&&(!that.productPriceAndAvailability.isEmpty()))?that.getProductPriceAndAvailability():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productPriceAndAvailability", lhsProductPriceAndAvailability), LocatorUtils.property(thatLocator, "productPriceAndAvailability", rhsProductPriceAndAvailability), lhsProductPriceAndAvailability, rhsProductPriceAndAvailability, ((this.productPriceAndAvailability!= null)&&(!this.productPriceAndAvailability.isEmpty())), ((that.productPriceAndAvailability!= null)&&(!that.productPriceAndAvailability.isEmpty())))) {
                return false;
            }
        }
        {
            ProductProcurementType lhsProductProcurement;
            lhsProductProcurement = this.getProductProcurement();
            ProductProcurementType rhsProductProcurement;
            rhsProductProcurement = that.getProductProcurement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productProcurement", lhsProductProcurement), LocatorUtils.property(thatLocator, "productProcurement", rhsProductProcurement), lhsProductProcurement, rhsProductProcurement, (this.productProcurement!= null), (that.productProcurement!= null))) {
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
            MarketingInstruction theMarketingInstruction;
            theMarketingInstruction = this.getMarketingInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "marketingInstruction", theMarketingInstruction), currentHashCode, theMarketingInstruction, (this.marketingInstruction!= null));
        }
        {
            ProductAttribute theProductAttribute;
            theProductAttribute = this.getProductAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productAttribute", theProductAttribute), currentHashCode, theProductAttribute, (this.productAttribute!= null));
        }
        {
            ProductLifeCycleType theProductLifeCycle;
            theProductLifeCycle = this.getProductLifeCycle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLifeCycle", theProductLifeCycle), currentHashCode, theProductLifeCycle, (this.productLifeCycle!= null));
        }
        {
            List<ProductPriceAndAvailabilityType> theProductPriceAndAvailability;
            theProductPriceAndAvailability = (((this.productPriceAndAvailability!= null)&&(!this.productPriceAndAvailability.isEmpty()))?this.getProductPriceAndAvailability():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productPriceAndAvailability", theProductPriceAndAvailability), currentHashCode, theProductPriceAndAvailability, ((this.productPriceAndAvailability!= null)&&(!this.productPriceAndAvailability.isEmpty())));
        }
        {
            ProductProcurementType theProductProcurement;
            theProductProcurement = this.getProductProcurement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productProcurement", theProductProcurement), currentHashCode, theProductProcurement, (this.productProcurement!= null));
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
            MarketingInstruction theMarketingInstruction;
            theMarketingInstruction = this.getMarketingInstruction();
            strategy.appendField(locator, this, "marketingInstruction", buffer, theMarketingInstruction, (this.marketingInstruction!= null));
        }
        {
            ProductAttribute theProductAttribute;
            theProductAttribute = this.getProductAttribute();
            strategy.appendField(locator, this, "productAttribute", buffer, theProductAttribute, (this.productAttribute!= null));
        }
        {
            ProductLifeCycleType theProductLifeCycle;
            theProductLifeCycle = this.getProductLifeCycle();
            strategy.appendField(locator, this, "productLifeCycle", buffer, theProductLifeCycle, (this.productLifeCycle!= null));
        }
        {
            List<ProductPriceAndAvailabilityType> theProductPriceAndAvailability;
            theProductPriceAndAvailability = (((this.productPriceAndAvailability!= null)&&(!this.productPriceAndAvailability.isEmpty()))?this.getProductPriceAndAvailability():null);
            strategy.appendField(locator, this, "productPriceAndAvailability", buffer, theProductPriceAndAvailability, ((this.productPriceAndAvailability!= null)&&(!this.productPriceAndAvailability.isEmpty())));
        }
        {
            ProductProcurementType theProductProcurement;
            theProductProcurement = this.getProductProcurement();
            strategy.appendField(locator, this, "productProcurement", buffer, theProductProcurement, (this.productProcurement!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
