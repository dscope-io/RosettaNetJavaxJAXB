
package io.dscope.rosettanet.domain.logistics.logistics.v02_17;

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
import io.dscope.rosettanet.domain.shared.codelist.packagetypecode.v01_01.PackageTypeCode;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
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
 * <p>Java class for ProductAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01}PackageTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PackingQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}ProductQuantityType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}ProductPackaging" minOccurs="0"/&gt;
 *         &lt;element name="SmallestPackingQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}ProductQuantityType"/&gt;
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
@XmlType(name = "ProductAttributeType", propOrder = {
    "packageTypeCode",
    "packingQuantity",
    "productPackaging",
    "smallestPackingQuantity",
    "unitOfMeasure"
})
public class ProductAttributeType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "PackageTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01", type = PackageTypeCode.class, required = false)
    protected List<PackageTypeCode> packageTypeCode;
    @XmlElement(name = "PackingQuantity")
    protected float packingQuantity;
    @XmlElementRef(name = "ProductPackaging", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = ProductPackaging.class, required = false)
    protected ProductPackaging productPackaging;
    @XmlElement(name = "SmallestPackingQuantity")
    protected float smallestPackingQuantity;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the packageTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageTypeCode }
     * 
     * 
     */
    public List<PackageTypeCode> getPackageTypeCode() {
        if (packageTypeCode == null) {
            packageTypeCode = new ArrayList<PackageTypeCode>();
        }
        return this.packageTypeCode;
    }

    /**
     * Gets the value of the packingQuantity property.
     * 
     */
    public float getPackingQuantity() {
        return packingQuantity;
    }

    /**
     * Sets the value of the packingQuantity property.
     * 
     */
    public void setPackingQuantity(float value) {
        this.packingQuantity = value;
    }

    /**
     * Gets the value of the productPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPackaging }
     *     
     */
    public ProductPackaging getProductPackaging() {
        return productPackaging;
    }

    /**
     * Sets the value of the productPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPackaging }
     *     
     */
    public void setProductPackaging(ProductPackaging value) {
        this.productPackaging = value;
    }

    /**
     * Gets the value of the smallestPackingQuantity property.
     * 
     */
    public float getSmallestPackingQuantity() {
        return smallestPackingQuantity;
    }

    /**
     * Sets the value of the smallestPackingQuantity property.
     * 
     */
    public void setSmallestPackingQuantity(float value) {
        this.smallestPackingQuantity = value;
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
        final ProductAttributeType that = ((ProductAttributeType) object);
        {
            List<PackageTypeCode> lhsPackageTypeCode;
            lhsPackageTypeCode = (((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty()))?this.getPackageTypeCode():null);
            List<PackageTypeCode> rhsPackageTypeCode;
            rhsPackageTypeCode = (((that.packageTypeCode!= null)&&(!that.packageTypeCode.isEmpty()))?that.getPackageTypeCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageTypeCode", lhsPackageTypeCode), LocatorUtils.property(thatLocator, "packageTypeCode", rhsPackageTypeCode), lhsPackageTypeCode, rhsPackageTypeCode, ((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty())), ((that.packageTypeCode!= null)&&(!that.packageTypeCode.isEmpty())))) {
                return false;
            }
        }
        {
            float lhsPackingQuantity;
            lhsPackingQuantity = this.getPackingQuantity();
            float rhsPackingQuantity;
            rhsPackingQuantity = that.getPackingQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packingQuantity", lhsPackingQuantity), LocatorUtils.property(thatLocator, "packingQuantity", rhsPackingQuantity), lhsPackingQuantity, rhsPackingQuantity, true, true)) {
                return false;
            }
        }
        {
            ProductPackaging lhsProductPackaging;
            lhsProductPackaging = this.getProductPackaging();
            ProductPackaging rhsProductPackaging;
            rhsProductPackaging = that.getProductPackaging();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productPackaging", lhsProductPackaging), LocatorUtils.property(thatLocator, "productPackaging", rhsProductPackaging), lhsProductPackaging, rhsProductPackaging, (this.productPackaging!= null), (that.productPackaging!= null))) {
                return false;
            }
        }
        {
            float lhsSmallestPackingQuantity;
            lhsSmallestPackingQuantity = this.getSmallestPackingQuantity();
            float rhsSmallestPackingQuantity;
            rhsSmallestPackingQuantity = that.getSmallestPackingQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "smallestPackingQuantity", lhsSmallestPackingQuantity), LocatorUtils.property(thatLocator, "smallestPackingQuantity", rhsSmallestPackingQuantity), lhsSmallestPackingQuantity, rhsSmallestPackingQuantity, true, true)) {
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
            List<PackageTypeCode> thePackageTypeCode;
            thePackageTypeCode = (((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty()))?this.getPackageTypeCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageTypeCode", thePackageTypeCode), currentHashCode, thePackageTypeCode, ((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty())));
        }
        {
            float thePackingQuantity;
            thePackingQuantity = this.getPackingQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packingQuantity", thePackingQuantity), currentHashCode, thePackingQuantity, true);
        }
        {
            ProductPackaging theProductPackaging;
            theProductPackaging = this.getProductPackaging();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productPackaging", theProductPackaging), currentHashCode, theProductPackaging, (this.productPackaging!= null));
        }
        {
            float theSmallestPackingQuantity;
            theSmallestPackingQuantity = this.getSmallestPackingQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "smallestPackingQuantity", theSmallestPackingQuantity), currentHashCode, theSmallestPackingQuantity, true);
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
            List<PackageTypeCode> thePackageTypeCode;
            thePackageTypeCode = (((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty()))?this.getPackageTypeCode():null);
            strategy.appendField(locator, this, "packageTypeCode", buffer, thePackageTypeCode, ((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty())));
        }
        {
            float thePackingQuantity;
            thePackingQuantity = this.getPackingQuantity();
            strategy.appendField(locator, this, "packingQuantity", buffer, thePackingQuantity, true);
        }
        {
            ProductPackaging theProductPackaging;
            theProductPackaging = this.getProductPackaging();
            strategy.appendField(locator, this, "productPackaging", buffer, theProductPackaging, (this.productPackaging!= null));
        }
        {
            float theSmallestPackingQuantity;
            theSmallestPackingQuantity = this.getSmallestPackingQuantity();
            strategy.appendField(locator, this, "smallestPackingQuantity", buffer, theSmallestPackingQuantity, true);
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
