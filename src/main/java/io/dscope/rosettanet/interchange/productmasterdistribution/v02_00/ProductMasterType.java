
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_12.SpecifiedKnownPartnerType;
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
 * <p>Java class for ProductMasterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMasterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternalBusinessEntity" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedKnownPartnerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductMasterLineItem" type="{urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00}ProductMasterLineItemType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ProductMasterType", propOrder = {
    "internalBusinessEntity",
    "productMasterLineItem"
})
public class ProductMasterType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "InternalBusinessEntity")
    protected List<SpecifiedKnownPartnerType> internalBusinessEntity;
    @XmlElement(name = "ProductMasterLineItem", required = true)
    protected List<ProductMasterLineItemType> productMasterLineItem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the internalBusinessEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalBusinessEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalBusinessEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedKnownPartnerType }
     * 
     * 
     */
    public List<SpecifiedKnownPartnerType> getInternalBusinessEntity() {
        if (internalBusinessEntity == null) {
            internalBusinessEntity = new ArrayList<SpecifiedKnownPartnerType>();
        }
        return this.internalBusinessEntity;
    }

    /**
     * Gets the value of the productMasterLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productMasterLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMasterLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMasterLineItemType }
     * 
     * 
     */
    public List<ProductMasterLineItemType> getProductMasterLineItem() {
        if (productMasterLineItem == null) {
            productMasterLineItem = new ArrayList<ProductMasterLineItemType>();
        }
        return this.productMasterLineItem;
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
        final ProductMasterType that = ((ProductMasterType) object);
        {
            List<SpecifiedKnownPartnerType> lhsInternalBusinessEntity;
            lhsInternalBusinessEntity = (((this.internalBusinessEntity!= null)&&(!this.internalBusinessEntity.isEmpty()))?this.getInternalBusinessEntity():null);
            List<SpecifiedKnownPartnerType> rhsInternalBusinessEntity;
            rhsInternalBusinessEntity = (((that.internalBusinessEntity!= null)&&(!that.internalBusinessEntity.isEmpty()))?that.getInternalBusinessEntity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "internalBusinessEntity", lhsInternalBusinessEntity), LocatorUtils.property(thatLocator, "internalBusinessEntity", rhsInternalBusinessEntity), lhsInternalBusinessEntity, rhsInternalBusinessEntity, ((this.internalBusinessEntity!= null)&&(!this.internalBusinessEntity.isEmpty())), ((that.internalBusinessEntity!= null)&&(!that.internalBusinessEntity.isEmpty())))) {
                return false;
            }
        }
        {
            List<ProductMasterLineItemType> lhsProductMasterLineItem;
            lhsProductMasterLineItem = (((this.productMasterLineItem!= null)&&(!this.productMasterLineItem.isEmpty()))?this.getProductMasterLineItem():null);
            List<ProductMasterLineItemType> rhsProductMasterLineItem;
            rhsProductMasterLineItem = (((that.productMasterLineItem!= null)&&(!that.productMasterLineItem.isEmpty()))?that.getProductMasterLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productMasterLineItem", lhsProductMasterLineItem), LocatorUtils.property(thatLocator, "productMasterLineItem", rhsProductMasterLineItem), lhsProductMasterLineItem, rhsProductMasterLineItem, ((this.productMasterLineItem!= null)&&(!this.productMasterLineItem.isEmpty())), ((that.productMasterLineItem!= null)&&(!that.productMasterLineItem.isEmpty())))) {
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
            List<SpecifiedKnownPartnerType> theInternalBusinessEntity;
            theInternalBusinessEntity = (((this.internalBusinessEntity!= null)&&(!this.internalBusinessEntity.isEmpty()))?this.getInternalBusinessEntity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "internalBusinessEntity", theInternalBusinessEntity), currentHashCode, theInternalBusinessEntity, ((this.internalBusinessEntity!= null)&&(!this.internalBusinessEntity.isEmpty())));
        }
        {
            List<ProductMasterLineItemType> theProductMasterLineItem;
            theProductMasterLineItem = (((this.productMasterLineItem!= null)&&(!this.productMasterLineItem.isEmpty()))?this.getProductMasterLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productMasterLineItem", theProductMasterLineItem), currentHashCode, theProductMasterLineItem, ((this.productMasterLineItem!= null)&&(!this.productMasterLineItem.isEmpty())));
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
            List<SpecifiedKnownPartnerType> theInternalBusinessEntity;
            theInternalBusinessEntity = (((this.internalBusinessEntity!= null)&&(!this.internalBusinessEntity.isEmpty()))?this.getInternalBusinessEntity():null);
            strategy.appendField(locator, this, "internalBusinessEntity", buffer, theInternalBusinessEntity, ((this.internalBusinessEntity!= null)&&(!this.internalBusinessEntity.isEmpty())));
        }
        {
            List<ProductMasterLineItemType> theProductMasterLineItem;
            theProductMasterLineItem = (((this.productMasterLineItem!= null)&&(!this.productMasterLineItem.isEmpty()))?this.getProductMasterLineItem():null);
            strategy.appendField(locator, this, "productMasterLineItem", buffer, theProductMasterLineItem, ((this.productMasterLineItem!= null)&&(!this.productMasterLineItem.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
