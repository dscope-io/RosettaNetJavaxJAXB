
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
import io.dscope.rosettanet.domain.design.codelist.abccode.v01_02.ABCCode;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.ExportLicense;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.IsHazardousMaterial;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.ProductLicenseRequired;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductQuantityRange;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;
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
 * <p>Java class for ProductProcurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductProcurementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02}ABCCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}ExportLicense" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}IsHazardousMaterial" minOccurs="0"/&gt;
 *         &lt;element name="IsLeadFree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderSizeRounding" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}ProductLicenseRequired" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03}ProductProcurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductQuantityRange"/&gt;
 *         &lt;element name="RestrictedCountry" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SampleOrder" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="StandardClassificationIdentification" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductProcurementType", propOrder = {
    "abcCode",
    "exportLicense",
    "isHazardousMaterial",
    "isLeadFree",
    "orderSizeRounding",
    "productLicenseRequired",
    "productProcurementType",
    "productQuantityRange",
    "restrictedCountry",
    "sampleOrder",
    "standardClassificationIdentification",
    "unitOfMeasure"
})
public class ProductProcurementType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ABCCode", namespace = "urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02", type = ABCCode.class, required = false)
    protected ABCCode abcCode;
    @XmlElementRef(name = "ExportLicense", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = ExportLicense.class, required = false)
    protected List<ExportLicense> exportLicense;
    @XmlElementRef(name = "IsHazardousMaterial", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = IsHazardousMaterial.class, required = false)
    protected IsHazardousMaterial isHazardousMaterial;
    @XmlElement(name = "IsLeadFree")
    protected Boolean isLeadFree;
    @XmlElement(name = "OrderSizeRounding")
    protected Float orderSizeRounding;
    @XmlElementRef(name = "ProductLicenseRequired", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = ProductLicenseRequired.class, required = false)
    protected ProductLicenseRequired productLicenseRequired;
    @XmlElementRef(name = "ProductProcurementType", namespace = "urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03", type = io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType.class, required = false)
    protected List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> productProcurementType;
    @XmlElementRef(name = "ProductQuantityRange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ProductQuantityRange.class)
    protected ProductQuantityRange productQuantityRange;
    @XmlElement(name = "RestrictedCountry")
    protected List<CountryType> restrictedCountry;
    @XmlElement(name = "SampleOrder")
    protected Float sampleOrder;
    @XmlElement(name = "StandardClassificationIdentification")
    protected List<ProductIdentificationType> standardClassificationIdentification;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the abcCode property.
     * 
     * @return
     *     possible object is
     *     {@link ABCCode }
     *     
     */
    public ABCCode getABCCode() {
        return abcCode;
    }

    /**
     * Sets the value of the abcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ABCCode }
     *     
     */
    public void setABCCode(ABCCode value) {
        this.abcCode = value;
    }

    /**
     * Gets the value of the exportLicense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportLicense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportLicense }
     * 
     * 
     */
    public List<ExportLicense> getExportLicense() {
        if (exportLicense == null) {
            exportLicense = new ArrayList<ExportLicense>();
        }
        return this.exportLicense;
    }

    /**
     * Gets the value of the isHazardousMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link IsHazardousMaterial }
     *     
     */
    public IsHazardousMaterial getIsHazardousMaterial() {
        return isHazardousMaterial;
    }

    /**
     * Sets the value of the isHazardousMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsHazardousMaterial }
     *     
     */
    public void setIsHazardousMaterial(IsHazardousMaterial value) {
        this.isHazardousMaterial = value;
    }

    /**
     * Gets the value of the isLeadFree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLeadFree() {
        return isLeadFree;
    }

    /**
     * Sets the value of the isLeadFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLeadFree(Boolean value) {
        this.isLeadFree = value;
    }

    /**
     * Gets the value of the orderSizeRounding property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOrderSizeRounding() {
        return orderSizeRounding;
    }

    /**
     * Sets the value of the orderSizeRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOrderSizeRounding(Float value) {
        this.orderSizeRounding = value;
    }

    /**
     * Gets the value of the productLicenseRequired property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLicenseRequired }
     *     
     */
    public ProductLicenseRequired getProductLicenseRequired() {
        return productLicenseRequired;
    }

    /**
     * Sets the value of the productLicenseRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLicenseRequired }
     *     
     */
    public void setProductLicenseRequired(ProductLicenseRequired value) {
        this.productLicenseRequired = value;
    }

    /**
     * Gets the value of the productProcurementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productProcurementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductProcurementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType }
     * 
     * 
     */
    public List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> getProductProcurementType() {
        if (productProcurementType == null) {
            productProcurementType = new ArrayList<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType>();
        }
        return this.productProcurementType;
    }

    /**
     * Gets the value of the productQuantityRange property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityRange }
     *     
     */
    public ProductQuantityRange getProductQuantityRange() {
        return productQuantityRange;
    }

    /**
     * Sets the value of the productQuantityRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityRange }
     *     
     */
    public void setProductQuantityRange(ProductQuantityRange value) {
        this.productQuantityRange = value;
    }

    /**
     * Gets the value of the restrictedCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getRestrictedCountry() {
        if (restrictedCountry == null) {
            restrictedCountry = new ArrayList<CountryType>();
        }
        return this.restrictedCountry;
    }

    /**
     * Gets the value of the sampleOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSampleOrder() {
        return sampleOrder;
    }

    /**
     * Sets the value of the sampleOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSampleOrder(Float value) {
        this.sampleOrder = value;
    }

    /**
     * Gets the value of the standardClassificationIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardClassificationIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardClassificationIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getStandardClassificationIdentification() {
        if (standardClassificationIdentification == null) {
            standardClassificationIdentification = new ArrayList<ProductIdentificationType>();
        }
        return this.standardClassificationIdentification;
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
        final ProductProcurementType that = ((ProductProcurementType) object);
        {
            ABCCode lhsABCCode;
            lhsABCCode = this.getABCCode();
            ABCCode rhsABCCode;
            rhsABCCode = that.getABCCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abcCode", lhsABCCode), LocatorUtils.property(thatLocator, "abcCode", rhsABCCode), lhsABCCode, rhsABCCode, (this.abcCode!= null), (that.abcCode!= null))) {
                return false;
            }
        }
        {
            List<ExportLicense> lhsExportLicense;
            lhsExportLicense = (((this.exportLicense!= null)&&(!this.exportLicense.isEmpty()))?this.getExportLicense():null);
            List<ExportLicense> rhsExportLicense;
            rhsExportLicense = (((that.exportLicense!= null)&&(!that.exportLicense.isEmpty()))?that.getExportLicense():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exportLicense", lhsExportLicense), LocatorUtils.property(thatLocator, "exportLicense", rhsExportLicense), lhsExportLicense, rhsExportLicense, ((this.exportLicense!= null)&&(!this.exportLicense.isEmpty())), ((that.exportLicense!= null)&&(!that.exportLicense.isEmpty())))) {
                return false;
            }
        }
        {
            IsHazardousMaterial lhsIsHazardousMaterial;
            lhsIsHazardousMaterial = this.getIsHazardousMaterial();
            IsHazardousMaterial rhsIsHazardousMaterial;
            rhsIsHazardousMaterial = that.getIsHazardousMaterial();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isHazardousMaterial", lhsIsHazardousMaterial), LocatorUtils.property(thatLocator, "isHazardousMaterial", rhsIsHazardousMaterial), lhsIsHazardousMaterial, rhsIsHazardousMaterial, (this.isHazardousMaterial!= null), (that.isHazardousMaterial!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsLeadFree;
            lhsIsLeadFree = this.isIsLeadFree();
            Boolean rhsIsLeadFree;
            rhsIsLeadFree = that.isIsLeadFree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isLeadFree", lhsIsLeadFree), LocatorUtils.property(thatLocator, "isLeadFree", rhsIsLeadFree), lhsIsLeadFree, rhsIsLeadFree, (this.isLeadFree!= null), (that.isLeadFree!= null))) {
                return false;
            }
        }
        {
            Float lhsOrderSizeRounding;
            lhsOrderSizeRounding = this.getOrderSizeRounding();
            Float rhsOrderSizeRounding;
            rhsOrderSizeRounding = that.getOrderSizeRounding();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderSizeRounding", lhsOrderSizeRounding), LocatorUtils.property(thatLocator, "orderSizeRounding", rhsOrderSizeRounding), lhsOrderSizeRounding, rhsOrderSizeRounding, (this.orderSizeRounding!= null), (that.orderSizeRounding!= null))) {
                return false;
            }
        }
        {
            ProductLicenseRequired lhsProductLicenseRequired;
            lhsProductLicenseRequired = this.getProductLicenseRequired();
            ProductLicenseRequired rhsProductLicenseRequired;
            rhsProductLicenseRequired = that.getProductLicenseRequired();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productLicenseRequired", lhsProductLicenseRequired), LocatorUtils.property(thatLocator, "productLicenseRequired", rhsProductLicenseRequired), lhsProductLicenseRequired, rhsProductLicenseRequired, (this.productLicenseRequired!= null), (that.productLicenseRequired!= null))) {
                return false;
            }
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> lhsProductProcurementType;
            lhsProductProcurementType = (((this.productProcurementType!= null)&&(!this.productProcurementType.isEmpty()))?this.getProductProcurementType():null);
            List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> rhsProductProcurementType;
            rhsProductProcurementType = (((that.productProcurementType!= null)&&(!that.productProcurementType.isEmpty()))?that.getProductProcurementType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productProcurementType", lhsProductProcurementType), LocatorUtils.property(thatLocator, "productProcurementType", rhsProductProcurementType), lhsProductProcurementType, rhsProductProcurementType, ((this.productProcurementType!= null)&&(!this.productProcurementType.isEmpty())), ((that.productProcurementType!= null)&&(!that.productProcurementType.isEmpty())))) {
                return false;
            }
        }
        {
            ProductQuantityRange lhsProductQuantityRange;
            lhsProductQuantityRange = this.getProductQuantityRange();
            ProductQuantityRange rhsProductQuantityRange;
            rhsProductQuantityRange = that.getProductQuantityRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productQuantityRange", lhsProductQuantityRange), LocatorUtils.property(thatLocator, "productQuantityRange", rhsProductQuantityRange), lhsProductQuantityRange, rhsProductQuantityRange, (this.productQuantityRange!= null), (that.productQuantityRange!= null))) {
                return false;
            }
        }
        {
            List<CountryType> lhsRestrictedCountry;
            lhsRestrictedCountry = (((this.restrictedCountry!= null)&&(!this.restrictedCountry.isEmpty()))?this.getRestrictedCountry():null);
            List<CountryType> rhsRestrictedCountry;
            rhsRestrictedCountry = (((that.restrictedCountry!= null)&&(!that.restrictedCountry.isEmpty()))?that.getRestrictedCountry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "restrictedCountry", lhsRestrictedCountry), LocatorUtils.property(thatLocator, "restrictedCountry", rhsRestrictedCountry), lhsRestrictedCountry, rhsRestrictedCountry, ((this.restrictedCountry!= null)&&(!this.restrictedCountry.isEmpty())), ((that.restrictedCountry!= null)&&(!that.restrictedCountry.isEmpty())))) {
                return false;
            }
        }
        {
            Float lhsSampleOrder;
            lhsSampleOrder = this.getSampleOrder();
            Float rhsSampleOrder;
            rhsSampleOrder = that.getSampleOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sampleOrder", lhsSampleOrder), LocatorUtils.property(thatLocator, "sampleOrder", rhsSampleOrder), lhsSampleOrder, rhsSampleOrder, (this.sampleOrder!= null), (that.sampleOrder!= null))) {
                return false;
            }
        }
        {
            List<ProductIdentificationType> lhsStandardClassificationIdentification;
            lhsStandardClassificationIdentification = (((this.standardClassificationIdentification!= null)&&(!this.standardClassificationIdentification.isEmpty()))?this.getStandardClassificationIdentification():null);
            List<ProductIdentificationType> rhsStandardClassificationIdentification;
            rhsStandardClassificationIdentification = (((that.standardClassificationIdentification!= null)&&(!that.standardClassificationIdentification.isEmpty()))?that.getStandardClassificationIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standardClassificationIdentification", lhsStandardClassificationIdentification), LocatorUtils.property(thatLocator, "standardClassificationIdentification", rhsStandardClassificationIdentification), lhsStandardClassificationIdentification, rhsStandardClassificationIdentification, ((this.standardClassificationIdentification!= null)&&(!this.standardClassificationIdentification.isEmpty())), ((that.standardClassificationIdentification!= null)&&(!that.standardClassificationIdentification.isEmpty())))) {
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
            ABCCode theABCCode;
            theABCCode = this.getABCCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abcCode", theABCCode), currentHashCode, theABCCode, (this.abcCode!= null));
        }
        {
            List<ExportLicense> theExportLicense;
            theExportLicense = (((this.exportLicense!= null)&&(!this.exportLicense.isEmpty()))?this.getExportLicense():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exportLicense", theExportLicense), currentHashCode, theExportLicense, ((this.exportLicense!= null)&&(!this.exportLicense.isEmpty())));
        }
        {
            IsHazardousMaterial theIsHazardousMaterial;
            theIsHazardousMaterial = this.getIsHazardousMaterial();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isHazardousMaterial", theIsHazardousMaterial), currentHashCode, theIsHazardousMaterial, (this.isHazardousMaterial!= null));
        }
        {
            Boolean theIsLeadFree;
            theIsLeadFree = this.isIsLeadFree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isLeadFree", theIsLeadFree), currentHashCode, theIsLeadFree, (this.isLeadFree!= null));
        }
        {
            Float theOrderSizeRounding;
            theOrderSizeRounding = this.getOrderSizeRounding();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderSizeRounding", theOrderSizeRounding), currentHashCode, theOrderSizeRounding, (this.orderSizeRounding!= null));
        }
        {
            ProductLicenseRequired theProductLicenseRequired;
            theProductLicenseRequired = this.getProductLicenseRequired();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLicenseRequired", theProductLicenseRequired), currentHashCode, theProductLicenseRequired, (this.productLicenseRequired!= null));
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> theProductProcurementType;
            theProductProcurementType = (((this.productProcurementType!= null)&&(!this.productProcurementType.isEmpty()))?this.getProductProcurementType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productProcurementType", theProductProcurementType), currentHashCode, theProductProcurementType, ((this.productProcurementType!= null)&&(!this.productProcurementType.isEmpty())));
        }
        {
            ProductQuantityRange theProductQuantityRange;
            theProductQuantityRange = this.getProductQuantityRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantityRange", theProductQuantityRange), currentHashCode, theProductQuantityRange, (this.productQuantityRange!= null));
        }
        {
            List<CountryType> theRestrictedCountry;
            theRestrictedCountry = (((this.restrictedCountry!= null)&&(!this.restrictedCountry.isEmpty()))?this.getRestrictedCountry():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "restrictedCountry", theRestrictedCountry), currentHashCode, theRestrictedCountry, ((this.restrictedCountry!= null)&&(!this.restrictedCountry.isEmpty())));
        }
        {
            Float theSampleOrder;
            theSampleOrder = this.getSampleOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sampleOrder", theSampleOrder), currentHashCode, theSampleOrder, (this.sampleOrder!= null));
        }
        {
            List<ProductIdentificationType> theStandardClassificationIdentification;
            theStandardClassificationIdentification = (((this.standardClassificationIdentification!= null)&&(!this.standardClassificationIdentification.isEmpty()))?this.getStandardClassificationIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standardClassificationIdentification", theStandardClassificationIdentification), currentHashCode, theStandardClassificationIdentification, ((this.standardClassificationIdentification!= null)&&(!this.standardClassificationIdentification.isEmpty())));
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
            ABCCode theABCCode;
            theABCCode = this.getABCCode();
            strategy.appendField(locator, this, "abcCode", buffer, theABCCode, (this.abcCode!= null));
        }
        {
            List<ExportLicense> theExportLicense;
            theExportLicense = (((this.exportLicense!= null)&&(!this.exportLicense.isEmpty()))?this.getExportLicense():null);
            strategy.appendField(locator, this, "exportLicense", buffer, theExportLicense, ((this.exportLicense!= null)&&(!this.exportLicense.isEmpty())));
        }
        {
            IsHazardousMaterial theIsHazardousMaterial;
            theIsHazardousMaterial = this.getIsHazardousMaterial();
            strategy.appendField(locator, this, "isHazardousMaterial", buffer, theIsHazardousMaterial, (this.isHazardousMaterial!= null));
        }
        {
            Boolean theIsLeadFree;
            theIsLeadFree = this.isIsLeadFree();
            strategy.appendField(locator, this, "isLeadFree", buffer, theIsLeadFree, (this.isLeadFree!= null));
        }
        {
            Float theOrderSizeRounding;
            theOrderSizeRounding = this.getOrderSizeRounding();
            strategy.appendField(locator, this, "orderSizeRounding", buffer, theOrderSizeRounding, (this.orderSizeRounding!= null));
        }
        {
            ProductLicenseRequired theProductLicenseRequired;
            theProductLicenseRequired = this.getProductLicenseRequired();
            strategy.appendField(locator, this, "productLicenseRequired", buffer, theProductLicenseRequired, (this.productLicenseRequired!= null));
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> theProductProcurementType;
            theProductProcurementType = (((this.productProcurementType!= null)&&(!this.productProcurementType.isEmpty()))?this.getProductProcurementType():null);
            strategy.appendField(locator, this, "productProcurementType", buffer, theProductProcurementType, ((this.productProcurementType!= null)&&(!this.productProcurementType.isEmpty())));
        }
        {
            ProductQuantityRange theProductQuantityRange;
            theProductQuantityRange = this.getProductQuantityRange();
            strategy.appendField(locator, this, "productQuantityRange", buffer, theProductQuantityRange, (this.productQuantityRange!= null));
        }
        {
            List<CountryType> theRestrictedCountry;
            theRestrictedCountry = (((this.restrictedCountry!= null)&&(!this.restrictedCountry.isEmpty()))?this.getRestrictedCountry():null);
            strategy.appendField(locator, this, "restrictedCountry", buffer, theRestrictedCountry, ((this.restrictedCountry!= null)&&(!this.restrictedCountry.isEmpty())));
        }
        {
            Float theSampleOrder;
            theSampleOrder = this.getSampleOrder();
            strategy.appendField(locator, this, "sampleOrder", buffer, theSampleOrder, (this.sampleOrder!= null));
        }
        {
            List<ProductIdentificationType> theStandardClassificationIdentification;
            theStandardClassificationIdentification = (((this.standardClassificationIdentification!= null)&&(!this.standardClassificationIdentification.isEmpty()))?this.getStandardClassificationIdentification():null);
            strategy.appendField(locator, this, "standardClassificationIdentification", buffer, theStandardClassificationIdentification, ((this.standardClassificationIdentification!= null)&&(!this.standardClassificationIdentification.isEmpty())));
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
