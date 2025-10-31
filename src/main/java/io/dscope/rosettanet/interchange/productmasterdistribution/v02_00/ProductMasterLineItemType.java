
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductDistribution;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.partneridentification.v01_12.KnownPartnerContact;
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
 * <p>Java class for ProductMasterLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMasterLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}KnownPartnerContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductAttribute" type="{urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00}ProductAttributeType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductDistribution" minOccurs="0"/&gt;
 *         &lt;element name="ProductLifeCycle" type="{urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00}ProductLifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="ProductProcurement" type="{urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00}ProductProcurementType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductMasterLineItemType", propOrder = {
    "knownPartnerContact",
    "productAttribute",
    "productDistribution",
    "productLifeCycle",
    "productProcurement",
    "unitOfMeasure"
})
public class ProductMasterLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "KnownPartnerContact", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", type = KnownPartnerContact.class, required = false)
    protected List<KnownPartnerContact> knownPartnerContact;
    @XmlElement(name = "ProductAttribute", required = true)
    protected ProductAttributeType productAttribute;
    @XmlElementRef(name = "ProductDistribution", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ProductDistribution.class, required = false)
    protected ProductDistribution productDistribution;
    @XmlElement(name = "ProductLifeCycle")
    protected ProductLifeCycleType productLifeCycle;
    @XmlElement(name = "ProductProcurement")
    protected ProductProcurementType productProcurement;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the knownPartnerContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knownPartnerContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnownPartnerContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KnownPartnerContact }
     * 
     * 
     */
    public List<KnownPartnerContact> getKnownPartnerContact() {
        if (knownPartnerContact == null) {
            knownPartnerContact = new ArrayList<KnownPartnerContact>();
        }
        return this.knownPartnerContact;
    }

    /**
     * Gets the value of the productAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAttributeType }
     *     
     */
    public ProductAttributeType getProductAttribute() {
        return productAttribute;
    }

    /**
     * Sets the value of the productAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAttributeType }
     *     
     */
    public void setProductAttribute(ProductAttributeType value) {
        this.productAttribute = value;
    }

    /**
     * Gets the value of the productDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDistribution }
     *     
     */
    public ProductDistribution getProductDistribution() {
        return productDistribution;
    }

    /**
     * Sets the value of the productDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDistribution }
     *     
     */
    public void setProductDistribution(ProductDistribution value) {
        this.productDistribution = value;
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
        final ProductMasterLineItemType that = ((ProductMasterLineItemType) object);
        {
            List<KnownPartnerContact> lhsKnownPartnerContact;
            lhsKnownPartnerContact = (((this.knownPartnerContact!= null)&&(!this.knownPartnerContact.isEmpty()))?this.getKnownPartnerContact():null);
            List<KnownPartnerContact> rhsKnownPartnerContact;
            rhsKnownPartnerContact = (((that.knownPartnerContact!= null)&&(!that.knownPartnerContact.isEmpty()))?that.getKnownPartnerContact():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "knownPartnerContact", lhsKnownPartnerContact), LocatorUtils.property(thatLocator, "knownPartnerContact", rhsKnownPartnerContact), lhsKnownPartnerContact, rhsKnownPartnerContact, ((this.knownPartnerContact!= null)&&(!this.knownPartnerContact.isEmpty())), ((that.knownPartnerContact!= null)&&(!that.knownPartnerContact.isEmpty())))) {
                return false;
            }
        }
        {
            ProductAttributeType lhsProductAttribute;
            lhsProductAttribute = this.getProductAttribute();
            ProductAttributeType rhsProductAttribute;
            rhsProductAttribute = that.getProductAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productAttribute", lhsProductAttribute), LocatorUtils.property(thatLocator, "productAttribute", rhsProductAttribute), lhsProductAttribute, rhsProductAttribute, (this.productAttribute!= null), (that.productAttribute!= null))) {
                return false;
            }
        }
        {
            ProductDistribution lhsProductDistribution;
            lhsProductDistribution = this.getProductDistribution();
            ProductDistribution rhsProductDistribution;
            rhsProductDistribution = that.getProductDistribution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productDistribution", lhsProductDistribution), LocatorUtils.property(thatLocator, "productDistribution", rhsProductDistribution), lhsProductDistribution, rhsProductDistribution, (this.productDistribution!= null), (that.productDistribution!= null))) {
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
            ProductProcurementType lhsProductProcurement;
            lhsProductProcurement = this.getProductProcurement();
            ProductProcurementType rhsProductProcurement;
            rhsProductProcurement = that.getProductProcurement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productProcurement", lhsProductProcurement), LocatorUtils.property(thatLocator, "productProcurement", rhsProductProcurement), lhsProductProcurement, rhsProductProcurement, (this.productProcurement!= null), (that.productProcurement!= null))) {
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
            List<KnownPartnerContact> theKnownPartnerContact;
            theKnownPartnerContact = (((this.knownPartnerContact!= null)&&(!this.knownPartnerContact.isEmpty()))?this.getKnownPartnerContact():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "knownPartnerContact", theKnownPartnerContact), currentHashCode, theKnownPartnerContact, ((this.knownPartnerContact!= null)&&(!this.knownPartnerContact.isEmpty())));
        }
        {
            ProductAttributeType theProductAttribute;
            theProductAttribute = this.getProductAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productAttribute", theProductAttribute), currentHashCode, theProductAttribute, (this.productAttribute!= null));
        }
        {
            ProductDistribution theProductDistribution;
            theProductDistribution = this.getProductDistribution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productDistribution", theProductDistribution), currentHashCode, theProductDistribution, (this.productDistribution!= null));
        }
        {
            ProductLifeCycleType theProductLifeCycle;
            theProductLifeCycle = this.getProductLifeCycle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLifeCycle", theProductLifeCycle), currentHashCode, theProductLifeCycle, (this.productLifeCycle!= null));
        }
        {
            ProductProcurementType theProductProcurement;
            theProductProcurement = this.getProductProcurement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productProcurement", theProductProcurement), currentHashCode, theProductProcurement, (this.productProcurement!= null));
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
            List<KnownPartnerContact> theKnownPartnerContact;
            theKnownPartnerContact = (((this.knownPartnerContact!= null)&&(!this.knownPartnerContact.isEmpty()))?this.getKnownPartnerContact():null);
            strategy.appendField(locator, this, "knownPartnerContact", buffer, theKnownPartnerContact, ((this.knownPartnerContact!= null)&&(!this.knownPartnerContact.isEmpty())));
        }
        {
            ProductAttributeType theProductAttribute;
            theProductAttribute = this.getProductAttribute();
            strategy.appendField(locator, this, "productAttribute", buffer, theProductAttribute, (this.productAttribute!= null));
        }
        {
            ProductDistribution theProductDistribution;
            theProductDistribution = this.getProductDistribution();
            strategy.appendField(locator, this, "productDistribution", buffer, theProductDistribution, (this.productDistribution!= null));
        }
        {
            ProductLifeCycleType theProductLifeCycle;
            theProductLifeCycle = this.getProductLifeCycle();
            strategy.appendField(locator, this, "productLifeCycle", buffer, theProductLifeCycle, (this.productLifeCycle!= null));
        }
        {
            ProductProcurementType theProductProcurement;
            theProductProcurement = this.getProductProcurement();
            strategy.appendField(locator, this, "productProcurement", buffer, theProductProcurement, (this.productProcurement!= null));
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
