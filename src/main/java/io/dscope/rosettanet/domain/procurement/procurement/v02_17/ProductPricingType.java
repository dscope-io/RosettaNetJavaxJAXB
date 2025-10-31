
package io.dscope.rosettanet.domain.procurement.procurement.v02_17;

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
import io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_03.PricingTypeCode;
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
 * <p>Java class for ProductPricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssociatedProduct" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}SubstituteProductReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}IsCallFactory" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}IsCostChange"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}IsPriceProtect"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}IsSuggestedResaleChange"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}PricingDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.03}PricingTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure" minOccurs="0"/&gt;
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
@XmlType(name = "ProductPricingType", propOrder = {
    "associatedProduct",
    "isCallFactory",
    "isCostChange",
    "isPriceProtect",
    "isSuggestedResaleChange",
    "pricingDetail",
    "pricingTypeCode",
    "unitOfMeasure"
})
public class ProductPricingType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AssociatedProduct")
    protected List<SubstituteProductReferenceType> associatedProduct;
    @XmlElementRef(name = "IsCallFactory", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = IsCallFactory.class, required = false)
    protected IsCallFactory isCallFactory;
    @XmlElementRef(name = "IsCostChange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = IsCostChange.class)
    protected IsCostChange isCostChange;
    @XmlElementRef(name = "IsPriceProtect", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = IsPriceProtect.class)
    protected IsPriceProtect isPriceProtect;
    @XmlElementRef(name = "IsSuggestedResaleChange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = IsSuggestedResaleChange.class)
    protected IsSuggestedResaleChange isSuggestedResaleChange;
    @XmlElementRef(name = "PricingDetail", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = PricingDetail.class, required = false)
    protected List<PricingDetail> pricingDetail;
    @XmlElementRef(name = "PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.03", type = PricingTypeCode.class, required = false)
    protected List<PricingTypeCode> pricingTypeCode;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class, required = false)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the associatedProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstituteProductReferenceType }
     * 
     * 
     */
    public List<SubstituteProductReferenceType> getAssociatedProduct() {
        if (associatedProduct == null) {
            associatedProduct = new ArrayList<SubstituteProductReferenceType>();
        }
        return this.associatedProduct;
    }

    /**
     * Gets the value of the isCallFactory property.
     * 
     * @return
     *     possible object is
     *     {@link IsCallFactory }
     *     
     */
    public IsCallFactory getIsCallFactory() {
        return isCallFactory;
    }

    /**
     * Sets the value of the isCallFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsCallFactory }
     *     
     */
    public void setIsCallFactory(IsCallFactory value) {
        this.isCallFactory = value;
    }

    /**
     * Gets the value of the isCostChange property.
     * 
     * @return
     *     possible object is
     *     {@link IsCostChange }
     *     
     */
    public IsCostChange getIsCostChange() {
        return isCostChange;
    }

    /**
     * Sets the value of the isCostChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsCostChange }
     *     
     */
    public void setIsCostChange(IsCostChange value) {
        this.isCostChange = value;
    }

    /**
     * Gets the value of the isPriceProtect property.
     * 
     * @return
     *     possible object is
     *     {@link IsPriceProtect }
     *     
     */
    public IsPriceProtect getIsPriceProtect() {
        return isPriceProtect;
    }

    /**
     * Sets the value of the isPriceProtect property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsPriceProtect }
     *     
     */
    public void setIsPriceProtect(IsPriceProtect value) {
        this.isPriceProtect = value;
    }

    /**
     * Gets the value of the isSuggestedResaleChange property.
     * 
     * @return
     *     possible object is
     *     {@link IsSuggestedResaleChange }
     *     
     */
    public IsSuggestedResaleChange getIsSuggestedResaleChange() {
        return isSuggestedResaleChange;
    }

    /**
     * Sets the value of the isSuggestedResaleChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsSuggestedResaleChange }
     *     
     */
    public void setIsSuggestedResaleChange(IsSuggestedResaleChange value) {
        this.isSuggestedResaleChange = value;
    }

    /**
     * Gets the value of the pricingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingDetail }
     * 
     * 
     */
    public List<PricingDetail> getPricingDetail() {
        if (pricingDetail == null) {
            pricingDetail = new ArrayList<PricingDetail>();
        }
        return this.pricingDetail;
    }

    /**
     * Gets the value of the pricingTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingTypeCode }
     * 
     * 
     */
    public List<PricingTypeCode> getPricingTypeCode() {
        if (pricingTypeCode == null) {
            pricingTypeCode = new ArrayList<PricingTypeCode>();
        }
        return this.pricingTypeCode;
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
        final ProductPricingType that = ((ProductPricingType) object);
        {
            List<SubstituteProductReferenceType> lhsAssociatedProduct;
            lhsAssociatedProduct = (((this.associatedProduct!= null)&&(!this.associatedProduct.isEmpty()))?this.getAssociatedProduct():null);
            List<SubstituteProductReferenceType> rhsAssociatedProduct;
            rhsAssociatedProduct = (((that.associatedProduct!= null)&&(!that.associatedProduct.isEmpty()))?that.getAssociatedProduct():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "associatedProduct", lhsAssociatedProduct), LocatorUtils.property(thatLocator, "associatedProduct", rhsAssociatedProduct), lhsAssociatedProduct, rhsAssociatedProduct, ((this.associatedProduct!= null)&&(!this.associatedProduct.isEmpty())), ((that.associatedProduct!= null)&&(!that.associatedProduct.isEmpty())))) {
                return false;
            }
        }
        {
            IsCallFactory lhsIsCallFactory;
            lhsIsCallFactory = this.getIsCallFactory();
            IsCallFactory rhsIsCallFactory;
            rhsIsCallFactory = that.getIsCallFactory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isCallFactory", lhsIsCallFactory), LocatorUtils.property(thatLocator, "isCallFactory", rhsIsCallFactory), lhsIsCallFactory, rhsIsCallFactory, (this.isCallFactory!= null), (that.isCallFactory!= null))) {
                return false;
            }
        }
        {
            IsCostChange lhsIsCostChange;
            lhsIsCostChange = this.getIsCostChange();
            IsCostChange rhsIsCostChange;
            rhsIsCostChange = that.getIsCostChange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isCostChange", lhsIsCostChange), LocatorUtils.property(thatLocator, "isCostChange", rhsIsCostChange), lhsIsCostChange, rhsIsCostChange, (this.isCostChange!= null), (that.isCostChange!= null))) {
                return false;
            }
        }
        {
            IsPriceProtect lhsIsPriceProtect;
            lhsIsPriceProtect = this.getIsPriceProtect();
            IsPriceProtect rhsIsPriceProtect;
            rhsIsPriceProtect = that.getIsPriceProtect();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isPriceProtect", lhsIsPriceProtect), LocatorUtils.property(thatLocator, "isPriceProtect", rhsIsPriceProtect), lhsIsPriceProtect, rhsIsPriceProtect, (this.isPriceProtect!= null), (that.isPriceProtect!= null))) {
                return false;
            }
        }
        {
            IsSuggestedResaleChange lhsIsSuggestedResaleChange;
            lhsIsSuggestedResaleChange = this.getIsSuggestedResaleChange();
            IsSuggestedResaleChange rhsIsSuggestedResaleChange;
            rhsIsSuggestedResaleChange = that.getIsSuggestedResaleChange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isSuggestedResaleChange", lhsIsSuggestedResaleChange), LocatorUtils.property(thatLocator, "isSuggestedResaleChange", rhsIsSuggestedResaleChange), lhsIsSuggestedResaleChange, rhsIsSuggestedResaleChange, (this.isSuggestedResaleChange!= null), (that.isSuggestedResaleChange!= null))) {
                return false;
            }
        }
        {
            List<PricingDetail> lhsPricingDetail;
            lhsPricingDetail = (((this.pricingDetail!= null)&&(!this.pricingDetail.isEmpty()))?this.getPricingDetail():null);
            List<PricingDetail> rhsPricingDetail;
            rhsPricingDetail = (((that.pricingDetail!= null)&&(!that.pricingDetail.isEmpty()))?that.getPricingDetail():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pricingDetail", lhsPricingDetail), LocatorUtils.property(thatLocator, "pricingDetail", rhsPricingDetail), lhsPricingDetail, rhsPricingDetail, ((this.pricingDetail!= null)&&(!this.pricingDetail.isEmpty())), ((that.pricingDetail!= null)&&(!that.pricingDetail.isEmpty())))) {
                return false;
            }
        }
        {
            List<PricingTypeCode> lhsPricingTypeCode;
            lhsPricingTypeCode = (((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty()))?this.getPricingTypeCode():null);
            List<PricingTypeCode> rhsPricingTypeCode;
            rhsPricingTypeCode = (((that.pricingTypeCode!= null)&&(!that.pricingTypeCode.isEmpty()))?that.getPricingTypeCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pricingTypeCode", lhsPricingTypeCode), LocatorUtils.property(thatLocator, "pricingTypeCode", rhsPricingTypeCode), lhsPricingTypeCode, rhsPricingTypeCode, ((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty())), ((that.pricingTypeCode!= null)&&(!that.pricingTypeCode.isEmpty())))) {
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
            List<SubstituteProductReferenceType> theAssociatedProduct;
            theAssociatedProduct = (((this.associatedProduct!= null)&&(!this.associatedProduct.isEmpty()))?this.getAssociatedProduct():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "associatedProduct", theAssociatedProduct), currentHashCode, theAssociatedProduct, ((this.associatedProduct!= null)&&(!this.associatedProduct.isEmpty())));
        }
        {
            IsCallFactory theIsCallFactory;
            theIsCallFactory = this.getIsCallFactory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isCallFactory", theIsCallFactory), currentHashCode, theIsCallFactory, (this.isCallFactory!= null));
        }
        {
            IsCostChange theIsCostChange;
            theIsCostChange = this.getIsCostChange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isCostChange", theIsCostChange), currentHashCode, theIsCostChange, (this.isCostChange!= null));
        }
        {
            IsPriceProtect theIsPriceProtect;
            theIsPriceProtect = this.getIsPriceProtect();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isPriceProtect", theIsPriceProtect), currentHashCode, theIsPriceProtect, (this.isPriceProtect!= null));
        }
        {
            IsSuggestedResaleChange theIsSuggestedResaleChange;
            theIsSuggestedResaleChange = this.getIsSuggestedResaleChange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isSuggestedResaleChange", theIsSuggestedResaleChange), currentHashCode, theIsSuggestedResaleChange, (this.isSuggestedResaleChange!= null));
        }
        {
            List<PricingDetail> thePricingDetail;
            thePricingDetail = (((this.pricingDetail!= null)&&(!this.pricingDetail.isEmpty()))?this.getPricingDetail():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pricingDetail", thePricingDetail), currentHashCode, thePricingDetail, ((this.pricingDetail!= null)&&(!this.pricingDetail.isEmpty())));
        }
        {
            List<PricingTypeCode> thePricingTypeCode;
            thePricingTypeCode = (((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty()))?this.getPricingTypeCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pricingTypeCode", thePricingTypeCode), currentHashCode, thePricingTypeCode, ((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty())));
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
            List<SubstituteProductReferenceType> theAssociatedProduct;
            theAssociatedProduct = (((this.associatedProduct!= null)&&(!this.associatedProduct.isEmpty()))?this.getAssociatedProduct():null);
            strategy.appendField(locator, this, "associatedProduct", buffer, theAssociatedProduct, ((this.associatedProduct!= null)&&(!this.associatedProduct.isEmpty())));
        }
        {
            IsCallFactory theIsCallFactory;
            theIsCallFactory = this.getIsCallFactory();
            strategy.appendField(locator, this, "isCallFactory", buffer, theIsCallFactory, (this.isCallFactory!= null));
        }
        {
            IsCostChange theIsCostChange;
            theIsCostChange = this.getIsCostChange();
            strategy.appendField(locator, this, "isCostChange", buffer, theIsCostChange, (this.isCostChange!= null));
        }
        {
            IsPriceProtect theIsPriceProtect;
            theIsPriceProtect = this.getIsPriceProtect();
            strategy.appendField(locator, this, "isPriceProtect", buffer, theIsPriceProtect, (this.isPriceProtect!= null));
        }
        {
            IsSuggestedResaleChange theIsSuggestedResaleChange;
            theIsSuggestedResaleChange = this.getIsSuggestedResaleChange();
            strategy.appendField(locator, this, "isSuggestedResaleChange", buffer, theIsSuggestedResaleChange, (this.isSuggestedResaleChange!= null));
        }
        {
            List<PricingDetail> thePricingDetail;
            thePricingDetail = (((this.pricingDetail!= null)&&(!this.pricingDetail.isEmpty()))?this.getPricingDetail():null);
            strategy.appendField(locator, this, "pricingDetail", buffer, thePricingDetail, ((this.pricingDetail!= null)&&(!this.pricingDetail.isEmpty())));
        }
        {
            List<PricingTypeCode> thePricingTypeCode;
            thePricingTypeCode = (((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty()))?this.getPricingTypeCode():null);
            strategy.appendField(locator, this, "pricingTypeCode", buffer, thePricingTypeCode, ((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty())));
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
