
package io.dscope.rosettanet.interchange.priceandavailabilityresponse.v01_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_03.LeadTimeClassificationCode;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.PriceList;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ProductAvailability;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ProductLeadTime;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ProductPricingDetail;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.WarehouseInformation;
import io.dscope.rosettanet.domain.shared.codelist.packagetypecode.v01_01.PackageTypeCode;
import io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_04.PricingTypeCode;
import io.dscope.rosettanet.domain.shared.codelist.productstatuscode.v01_01.ProductStatusCode;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
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
 * <p>Java class for ProductPriceAndAvailabilityLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPriceAndAvailabilityLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalProductPriceAndAvailabilityLineItem" type="{urn:rosettanet:specification:interchange:PriceAndAvailabilityResponseNotification:xsd:schema:01.00}AdditionalProductPriceAndAvailabilityLineItemType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedAvailabilityDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="IsAdditionalInformationIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsNonCancelNonReturnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsSpecialPricingExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03}LeadTimeClassificationCode" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01}PackageTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}PriceList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04}PricingTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ProductAvailability" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ProductLeadTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ProductPricingDetail" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ProductStatusCode:xsd:codelist:01.01}ProductStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}WarehouseInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductPriceAndAvailabilityLineItemType", propOrder = {
    "additionalProductPriceAndAvailabilityLineItem",
    "estimatedAvailabilityDate",
    "isAdditionalInformationIncluded",
    "isNonCancelNonReturnable",
    "isSpecialPricingExists",
    "leadTimeClassificationCode",
    "lineNumber",
    "packageTypeCode",
    "priceList",
    "pricingTypeCode",
    "productAvailability",
    "productIdentification",
    "productLeadTime",
    "productPricingDetail",
    "productStatusCode",
    "unitOfMeasure",
    "warehouseInformation"
})
public class ProductPriceAndAvailabilityLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AdditionalProductPriceAndAvailabilityLineItem")
    protected AdditionalProductPriceAndAvailabilityLineItemType additionalProductPriceAndAvailabilityLineItem;
    @XmlElement(name = "EstimatedAvailabilityDate")
    protected DatePeriodType estimatedAvailabilityDate;
    @XmlElement(name = "IsAdditionalInformationIncluded")
    protected boolean isAdditionalInformationIncluded;
    @XmlElement(name = "IsNonCancelNonReturnable")
    protected boolean isNonCancelNonReturnable;
    @XmlElement(name = "IsSpecialPricingExists")
    protected boolean isSpecialPricingExists;
    @XmlElementRef(name = "LeadTimeClassificationCode", namespace = "urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03", type = LeadTimeClassificationCode.class, required = false)
    protected LeadTimeClassificationCode leadTimeClassificationCode;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "PackageTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01", type = PackageTypeCode.class, required = false)
    protected List<PackageTypeCode> packageTypeCode;
    @XmlElementRef(name = "PriceList", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = PriceList.class, required = false)
    protected List<PriceList> priceList;
    @XmlElementRef(name = "PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04", type = PricingTypeCode.class, required = false)
    protected List<PricingTypeCode> pricingTypeCode;
    @XmlElementRef(name = "ProductAvailability", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ProductAvailability.class)
    protected List<ProductAvailability> productAvailability;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "ProductLeadTime", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ProductLeadTime.class, required = false)
    protected List<ProductLeadTime> productLeadTime;
    @XmlElementRef(name = "ProductPricingDetail", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ProductPricingDetail.class)
    protected List<ProductPricingDetail> productPricingDetail;
    @XmlElementRef(name = "ProductStatusCode", namespace = "urn:rosettanet:specification:domain:Shared:ProductStatusCode:xsd:codelist:01.01", type = ProductStatusCode.class, required = false)
    protected ProductStatusCode productStatusCode;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class, required = false)
    protected List<UnitOfMeasure> unitOfMeasure;
    @XmlElementRef(name = "WarehouseInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = WarehouseInformation.class, required = false)
    protected List<WarehouseInformation> warehouseInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the additionalProductPriceAndAvailabilityLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductPriceAndAvailabilityLineItemType }
     *     
     */
    public AdditionalProductPriceAndAvailabilityLineItemType getAdditionalProductPriceAndAvailabilityLineItem() {
        return additionalProductPriceAndAvailabilityLineItem;
    }

    /**
     * Sets the value of the additionalProductPriceAndAvailabilityLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductPriceAndAvailabilityLineItemType }
     *     
     */
    public void setAdditionalProductPriceAndAvailabilityLineItem(AdditionalProductPriceAndAvailabilityLineItemType value) {
        this.additionalProductPriceAndAvailabilityLineItem = value;
    }

    /**
     * Gets the value of the estimatedAvailabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEstimatedAvailabilityDate() {
        return estimatedAvailabilityDate;
    }

    /**
     * Sets the value of the estimatedAvailabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEstimatedAvailabilityDate(DatePeriodType value) {
        this.estimatedAvailabilityDate = value;
    }

    /**
     * Gets the value of the isAdditionalInformationIncluded property.
     * 
     */
    public boolean isIsAdditionalInformationIncluded() {
        return isAdditionalInformationIncluded;
    }

    /**
     * Sets the value of the isAdditionalInformationIncluded property.
     * 
     */
    public void setIsAdditionalInformationIncluded(boolean value) {
        this.isAdditionalInformationIncluded = value;
    }

    /**
     * Gets the value of the isNonCancelNonReturnable property.
     * 
     */
    public boolean isIsNonCancelNonReturnable() {
        return isNonCancelNonReturnable;
    }

    /**
     * Sets the value of the isNonCancelNonReturnable property.
     * 
     */
    public void setIsNonCancelNonReturnable(boolean value) {
        this.isNonCancelNonReturnable = value;
    }

    /**
     * Gets the value of the isSpecialPricingExists property.
     * 
     */
    public boolean isIsSpecialPricingExists() {
        return isSpecialPricingExists;
    }

    /**
     * Sets the value of the isSpecialPricingExists property.
     * 
     */
    public void setIsSpecialPricingExists(boolean value) {
        this.isSpecialPricingExists = value;
    }

    /**
     * Gets the value of the leadTimeClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link LeadTimeClassificationCode }
     *     
     */
    public LeadTimeClassificationCode getLeadTimeClassificationCode() {
        return leadTimeClassificationCode;
    }

    /**
     * Sets the value of the leadTimeClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadTimeClassificationCode }
     *     
     */
    public void setLeadTimeClassificationCode(LeadTimeClassificationCode value) {
        this.leadTimeClassificationCode = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

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
     * Gets the value of the priceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceList }
     * 
     * 
     */
    public List<PriceList> getPriceList() {
        if (priceList == null) {
            priceList = new ArrayList<PriceList>();
        }
        return this.priceList;
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
     * Gets the value of the productAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductAvailability }
     * 
     * 
     */
    public List<ProductAvailability> getProductAvailability() {
        if (productAvailability == null) {
            productAvailability = new ArrayList<ProductAvailability>();
        }
        return this.productAvailability;
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
     * Gets the value of the productLeadTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLeadTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLeadTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLeadTime }
     * 
     * 
     */
    public List<ProductLeadTime> getProductLeadTime() {
        if (productLeadTime == null) {
            productLeadTime = new ArrayList<ProductLeadTime>();
        }
        return this.productLeadTime;
    }

    /**
     * Gets the value of the productPricingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPricingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPricingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPricingDetail }
     * 
     * 
     */
    public List<ProductPricingDetail> getProductPricingDetail() {
        if (productPricingDetail == null) {
            productPricingDetail = new ArrayList<ProductPricingDetail>();
        }
        return this.productPricingDetail;
    }

    /**
     * Gets the value of the productStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStatusCode }
     *     
     */
    public ProductStatusCode getProductStatusCode() {
        return productStatusCode;
    }

    /**
     * Sets the value of the productStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStatusCode }
     *     
     */
    public void setProductStatusCode(ProductStatusCode value) {
        this.productStatusCode = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitOfMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitOfMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitOfMeasure }
     * 
     * 
     */
    public List<UnitOfMeasure> getUnitOfMeasure() {
        if (unitOfMeasure == null) {
            unitOfMeasure = new ArrayList<UnitOfMeasure>();
        }
        return this.unitOfMeasure;
    }

    /**
     * Gets the value of the warehouseInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warehouseInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarehouseInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarehouseInformation }
     * 
     * 
     */
    public List<WarehouseInformation> getWarehouseInformation() {
        if (warehouseInformation == null) {
            warehouseInformation = new ArrayList<WarehouseInformation>();
        }
        return this.warehouseInformation;
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
        final ProductPriceAndAvailabilityLineItemType that = ((ProductPriceAndAvailabilityLineItemType) object);
        {
            AdditionalProductPriceAndAvailabilityLineItemType lhsAdditionalProductPriceAndAvailabilityLineItem;
            lhsAdditionalProductPriceAndAvailabilityLineItem = this.getAdditionalProductPriceAndAvailabilityLineItem();
            AdditionalProductPriceAndAvailabilityLineItemType rhsAdditionalProductPriceAndAvailabilityLineItem;
            rhsAdditionalProductPriceAndAvailabilityLineItem = that.getAdditionalProductPriceAndAvailabilityLineItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalProductPriceAndAvailabilityLineItem", lhsAdditionalProductPriceAndAvailabilityLineItem), LocatorUtils.property(thatLocator, "additionalProductPriceAndAvailabilityLineItem", rhsAdditionalProductPriceAndAvailabilityLineItem), lhsAdditionalProductPriceAndAvailabilityLineItem, rhsAdditionalProductPriceAndAvailabilityLineItem, (this.additionalProductPriceAndAvailabilityLineItem!= null), (that.additionalProductPriceAndAvailabilityLineItem!= null))) {
                return false;
            }
        }
        {
            DatePeriodType lhsEstimatedAvailabilityDate;
            lhsEstimatedAvailabilityDate = this.getEstimatedAvailabilityDate();
            DatePeriodType rhsEstimatedAvailabilityDate;
            rhsEstimatedAvailabilityDate = that.getEstimatedAvailabilityDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedAvailabilityDate", lhsEstimatedAvailabilityDate), LocatorUtils.property(thatLocator, "estimatedAvailabilityDate", rhsEstimatedAvailabilityDate), lhsEstimatedAvailabilityDate, rhsEstimatedAvailabilityDate, (this.estimatedAvailabilityDate!= null), (that.estimatedAvailabilityDate!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsAdditionalInformationIncluded;
            lhsIsAdditionalInformationIncluded = this.isIsAdditionalInformationIncluded();
            boolean rhsIsAdditionalInformationIncluded;
            rhsIsAdditionalInformationIncluded = that.isIsAdditionalInformationIncluded();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isAdditionalInformationIncluded", lhsIsAdditionalInformationIncluded), LocatorUtils.property(thatLocator, "isAdditionalInformationIncluded", rhsIsAdditionalInformationIncluded), lhsIsAdditionalInformationIncluded, rhsIsAdditionalInformationIncluded, true, true)) {
                return false;
            }
        }
        {
            boolean lhsIsNonCancelNonReturnable;
            lhsIsNonCancelNonReturnable = this.isIsNonCancelNonReturnable();
            boolean rhsIsNonCancelNonReturnable;
            rhsIsNonCancelNonReturnable = that.isIsNonCancelNonReturnable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isNonCancelNonReturnable", lhsIsNonCancelNonReturnable), LocatorUtils.property(thatLocator, "isNonCancelNonReturnable", rhsIsNonCancelNonReturnable), lhsIsNonCancelNonReturnable, rhsIsNonCancelNonReturnable, true, true)) {
                return false;
            }
        }
        {
            boolean lhsIsSpecialPricingExists;
            lhsIsSpecialPricingExists = this.isIsSpecialPricingExists();
            boolean rhsIsSpecialPricingExists;
            rhsIsSpecialPricingExists = that.isIsSpecialPricingExists();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isSpecialPricingExists", lhsIsSpecialPricingExists), LocatorUtils.property(thatLocator, "isSpecialPricingExists", rhsIsSpecialPricingExists), lhsIsSpecialPricingExists, rhsIsSpecialPricingExists, true, true)) {
                return false;
            }
        }
        {
            LeadTimeClassificationCode lhsLeadTimeClassificationCode;
            lhsLeadTimeClassificationCode = this.getLeadTimeClassificationCode();
            LeadTimeClassificationCode rhsLeadTimeClassificationCode;
            rhsLeadTimeClassificationCode = that.getLeadTimeClassificationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leadTimeClassificationCode", lhsLeadTimeClassificationCode), LocatorUtils.property(thatLocator, "leadTimeClassificationCode", rhsLeadTimeClassificationCode), lhsLeadTimeClassificationCode, rhsLeadTimeClassificationCode, (this.leadTimeClassificationCode!= null), (that.leadTimeClassificationCode!= null))) {
                return false;
            }
        }
        {
            String lhsLineNumber;
            lhsLineNumber = this.getLineNumber();
            String rhsLineNumber;
            rhsLineNumber = that.getLineNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineNumber", lhsLineNumber), LocatorUtils.property(thatLocator, "lineNumber", rhsLineNumber), lhsLineNumber, rhsLineNumber, (this.lineNumber!= null), (that.lineNumber!= null))) {
                return false;
            }
        }
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
            List<PriceList> lhsPriceList;
            lhsPriceList = (((this.priceList!= null)&&(!this.priceList.isEmpty()))?this.getPriceList():null);
            List<PriceList> rhsPriceList;
            rhsPriceList = (((that.priceList!= null)&&(!that.priceList.isEmpty()))?that.getPriceList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceList", lhsPriceList), LocatorUtils.property(thatLocator, "priceList", rhsPriceList), lhsPriceList, rhsPriceList, ((this.priceList!= null)&&(!this.priceList.isEmpty())), ((that.priceList!= null)&&(!that.priceList.isEmpty())))) {
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
            List<ProductAvailability> lhsProductAvailability;
            lhsProductAvailability = (((this.productAvailability!= null)&&(!this.productAvailability.isEmpty()))?this.getProductAvailability():null);
            List<ProductAvailability> rhsProductAvailability;
            rhsProductAvailability = (((that.productAvailability!= null)&&(!that.productAvailability.isEmpty()))?that.getProductAvailability():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productAvailability", lhsProductAvailability), LocatorUtils.property(thatLocator, "productAvailability", rhsProductAvailability), lhsProductAvailability, rhsProductAvailability, ((this.productAvailability!= null)&&(!this.productAvailability.isEmpty())), ((that.productAvailability!= null)&&(!that.productAvailability.isEmpty())))) {
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
            List<ProductLeadTime> lhsProductLeadTime;
            lhsProductLeadTime = (((this.productLeadTime!= null)&&(!this.productLeadTime.isEmpty()))?this.getProductLeadTime():null);
            List<ProductLeadTime> rhsProductLeadTime;
            rhsProductLeadTime = (((that.productLeadTime!= null)&&(!that.productLeadTime.isEmpty()))?that.getProductLeadTime():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productLeadTime", lhsProductLeadTime), LocatorUtils.property(thatLocator, "productLeadTime", rhsProductLeadTime), lhsProductLeadTime, rhsProductLeadTime, ((this.productLeadTime!= null)&&(!this.productLeadTime.isEmpty())), ((that.productLeadTime!= null)&&(!that.productLeadTime.isEmpty())))) {
                return false;
            }
        }
        {
            List<ProductPricingDetail> lhsProductPricingDetail;
            lhsProductPricingDetail = (((this.productPricingDetail!= null)&&(!this.productPricingDetail.isEmpty()))?this.getProductPricingDetail():null);
            List<ProductPricingDetail> rhsProductPricingDetail;
            rhsProductPricingDetail = (((that.productPricingDetail!= null)&&(!that.productPricingDetail.isEmpty()))?that.getProductPricingDetail():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productPricingDetail", lhsProductPricingDetail), LocatorUtils.property(thatLocator, "productPricingDetail", rhsProductPricingDetail), lhsProductPricingDetail, rhsProductPricingDetail, ((this.productPricingDetail!= null)&&(!this.productPricingDetail.isEmpty())), ((that.productPricingDetail!= null)&&(!that.productPricingDetail.isEmpty())))) {
                return false;
            }
        }
        {
            ProductStatusCode lhsProductStatusCode;
            lhsProductStatusCode = this.getProductStatusCode();
            ProductStatusCode rhsProductStatusCode;
            rhsProductStatusCode = that.getProductStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productStatusCode", lhsProductStatusCode), LocatorUtils.property(thatLocator, "productStatusCode", rhsProductStatusCode), lhsProductStatusCode, rhsProductStatusCode, (this.productStatusCode!= null), (that.productStatusCode!= null))) {
                return false;
            }
        }
        {
            List<UnitOfMeasure> lhsUnitOfMeasure;
            lhsUnitOfMeasure = (((this.unitOfMeasure!= null)&&(!this.unitOfMeasure.isEmpty()))?this.getUnitOfMeasure():null);
            List<UnitOfMeasure> rhsUnitOfMeasure;
            rhsUnitOfMeasure = (((that.unitOfMeasure!= null)&&(!that.unitOfMeasure.isEmpty()))?that.getUnitOfMeasure():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, ((this.unitOfMeasure!= null)&&(!this.unitOfMeasure.isEmpty())), ((that.unitOfMeasure!= null)&&(!that.unitOfMeasure.isEmpty())))) {
                return false;
            }
        }
        {
            List<WarehouseInformation> lhsWarehouseInformation;
            lhsWarehouseInformation = (((this.warehouseInformation!= null)&&(!this.warehouseInformation.isEmpty()))?this.getWarehouseInformation():null);
            List<WarehouseInformation> rhsWarehouseInformation;
            rhsWarehouseInformation = (((that.warehouseInformation!= null)&&(!that.warehouseInformation.isEmpty()))?that.getWarehouseInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warehouseInformation", lhsWarehouseInformation), LocatorUtils.property(thatLocator, "warehouseInformation", rhsWarehouseInformation), lhsWarehouseInformation, rhsWarehouseInformation, ((this.warehouseInformation!= null)&&(!this.warehouseInformation.isEmpty())), ((that.warehouseInformation!= null)&&(!that.warehouseInformation.isEmpty())))) {
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
            AdditionalProductPriceAndAvailabilityLineItemType theAdditionalProductPriceAndAvailabilityLineItem;
            theAdditionalProductPriceAndAvailabilityLineItem = this.getAdditionalProductPriceAndAvailabilityLineItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalProductPriceAndAvailabilityLineItem", theAdditionalProductPriceAndAvailabilityLineItem), currentHashCode, theAdditionalProductPriceAndAvailabilityLineItem, (this.additionalProductPriceAndAvailabilityLineItem!= null));
        }
        {
            DatePeriodType theEstimatedAvailabilityDate;
            theEstimatedAvailabilityDate = this.getEstimatedAvailabilityDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedAvailabilityDate", theEstimatedAvailabilityDate), currentHashCode, theEstimatedAvailabilityDate, (this.estimatedAvailabilityDate!= null));
        }
        {
            boolean theIsAdditionalInformationIncluded;
            theIsAdditionalInformationIncluded = this.isIsAdditionalInformationIncluded();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isAdditionalInformationIncluded", theIsAdditionalInformationIncluded), currentHashCode, theIsAdditionalInformationIncluded, true);
        }
        {
            boolean theIsNonCancelNonReturnable;
            theIsNonCancelNonReturnable = this.isIsNonCancelNonReturnable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isNonCancelNonReturnable", theIsNonCancelNonReturnable), currentHashCode, theIsNonCancelNonReturnable, true);
        }
        {
            boolean theIsSpecialPricingExists;
            theIsSpecialPricingExists = this.isIsSpecialPricingExists();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isSpecialPricingExists", theIsSpecialPricingExists), currentHashCode, theIsSpecialPricingExists, true);
        }
        {
            LeadTimeClassificationCode theLeadTimeClassificationCode;
            theLeadTimeClassificationCode = this.getLeadTimeClassificationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leadTimeClassificationCode", theLeadTimeClassificationCode), currentHashCode, theLeadTimeClassificationCode, (this.leadTimeClassificationCode!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            List<PackageTypeCode> thePackageTypeCode;
            thePackageTypeCode = (((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty()))?this.getPackageTypeCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageTypeCode", thePackageTypeCode), currentHashCode, thePackageTypeCode, ((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty())));
        }
        {
            List<PriceList> thePriceList;
            thePriceList = (((this.priceList!= null)&&(!this.priceList.isEmpty()))?this.getPriceList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceList", thePriceList), currentHashCode, thePriceList, ((this.priceList!= null)&&(!this.priceList.isEmpty())));
        }
        {
            List<PricingTypeCode> thePricingTypeCode;
            thePricingTypeCode = (((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty()))?this.getPricingTypeCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pricingTypeCode", thePricingTypeCode), currentHashCode, thePricingTypeCode, ((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty())));
        }
        {
            List<ProductAvailability> theProductAvailability;
            theProductAvailability = (((this.productAvailability!= null)&&(!this.productAvailability.isEmpty()))?this.getProductAvailability():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productAvailability", theProductAvailability), currentHashCode, theProductAvailability, ((this.productAvailability!= null)&&(!this.productAvailability.isEmpty())));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            List<ProductLeadTime> theProductLeadTime;
            theProductLeadTime = (((this.productLeadTime!= null)&&(!this.productLeadTime.isEmpty()))?this.getProductLeadTime():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLeadTime", theProductLeadTime), currentHashCode, theProductLeadTime, ((this.productLeadTime!= null)&&(!this.productLeadTime.isEmpty())));
        }
        {
            List<ProductPricingDetail> theProductPricingDetail;
            theProductPricingDetail = (((this.productPricingDetail!= null)&&(!this.productPricingDetail.isEmpty()))?this.getProductPricingDetail():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productPricingDetail", theProductPricingDetail), currentHashCode, theProductPricingDetail, ((this.productPricingDetail!= null)&&(!this.productPricingDetail.isEmpty())));
        }
        {
            ProductStatusCode theProductStatusCode;
            theProductStatusCode = this.getProductStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productStatusCode", theProductStatusCode), currentHashCode, theProductStatusCode, (this.productStatusCode!= null));
        }
        {
            List<UnitOfMeasure> theUnitOfMeasure;
            theUnitOfMeasure = (((this.unitOfMeasure!= null)&&(!this.unitOfMeasure.isEmpty()))?this.getUnitOfMeasure():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, ((this.unitOfMeasure!= null)&&(!this.unitOfMeasure.isEmpty())));
        }
        {
            List<WarehouseInformation> theWarehouseInformation;
            theWarehouseInformation = (((this.warehouseInformation!= null)&&(!this.warehouseInformation.isEmpty()))?this.getWarehouseInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warehouseInformation", theWarehouseInformation), currentHashCode, theWarehouseInformation, ((this.warehouseInformation!= null)&&(!this.warehouseInformation.isEmpty())));
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
            AdditionalProductPriceAndAvailabilityLineItemType theAdditionalProductPriceAndAvailabilityLineItem;
            theAdditionalProductPriceAndAvailabilityLineItem = this.getAdditionalProductPriceAndAvailabilityLineItem();
            strategy.appendField(locator, this, "additionalProductPriceAndAvailabilityLineItem", buffer, theAdditionalProductPriceAndAvailabilityLineItem, (this.additionalProductPriceAndAvailabilityLineItem!= null));
        }
        {
            DatePeriodType theEstimatedAvailabilityDate;
            theEstimatedAvailabilityDate = this.getEstimatedAvailabilityDate();
            strategy.appendField(locator, this, "estimatedAvailabilityDate", buffer, theEstimatedAvailabilityDate, (this.estimatedAvailabilityDate!= null));
        }
        {
            boolean theIsAdditionalInformationIncluded;
            theIsAdditionalInformationIncluded = this.isIsAdditionalInformationIncluded();
            strategy.appendField(locator, this, "isAdditionalInformationIncluded", buffer, theIsAdditionalInformationIncluded, true);
        }
        {
            boolean theIsNonCancelNonReturnable;
            theIsNonCancelNonReturnable = this.isIsNonCancelNonReturnable();
            strategy.appendField(locator, this, "isNonCancelNonReturnable", buffer, theIsNonCancelNonReturnable, true);
        }
        {
            boolean theIsSpecialPricingExists;
            theIsSpecialPricingExists = this.isIsSpecialPricingExists();
            strategy.appendField(locator, this, "isSpecialPricingExists", buffer, theIsSpecialPricingExists, true);
        }
        {
            LeadTimeClassificationCode theLeadTimeClassificationCode;
            theLeadTimeClassificationCode = this.getLeadTimeClassificationCode();
            strategy.appendField(locator, this, "leadTimeClassificationCode", buffer, theLeadTimeClassificationCode, (this.leadTimeClassificationCode!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            List<PackageTypeCode> thePackageTypeCode;
            thePackageTypeCode = (((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty()))?this.getPackageTypeCode():null);
            strategy.appendField(locator, this, "packageTypeCode", buffer, thePackageTypeCode, ((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty())));
        }
        {
            List<PriceList> thePriceList;
            thePriceList = (((this.priceList!= null)&&(!this.priceList.isEmpty()))?this.getPriceList():null);
            strategy.appendField(locator, this, "priceList", buffer, thePriceList, ((this.priceList!= null)&&(!this.priceList.isEmpty())));
        }
        {
            List<PricingTypeCode> thePricingTypeCode;
            thePricingTypeCode = (((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty()))?this.getPricingTypeCode():null);
            strategy.appendField(locator, this, "pricingTypeCode", buffer, thePricingTypeCode, ((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty())));
        }
        {
            List<ProductAvailability> theProductAvailability;
            theProductAvailability = (((this.productAvailability!= null)&&(!this.productAvailability.isEmpty()))?this.getProductAvailability():null);
            strategy.appendField(locator, this, "productAvailability", buffer, theProductAvailability, ((this.productAvailability!= null)&&(!this.productAvailability.isEmpty())));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            List<ProductLeadTime> theProductLeadTime;
            theProductLeadTime = (((this.productLeadTime!= null)&&(!this.productLeadTime.isEmpty()))?this.getProductLeadTime():null);
            strategy.appendField(locator, this, "productLeadTime", buffer, theProductLeadTime, ((this.productLeadTime!= null)&&(!this.productLeadTime.isEmpty())));
        }
        {
            List<ProductPricingDetail> theProductPricingDetail;
            theProductPricingDetail = (((this.productPricingDetail!= null)&&(!this.productPricingDetail.isEmpty()))?this.getProductPricingDetail():null);
            strategy.appendField(locator, this, "productPricingDetail", buffer, theProductPricingDetail, ((this.productPricingDetail!= null)&&(!this.productPricingDetail.isEmpty())));
        }
        {
            ProductStatusCode theProductStatusCode;
            theProductStatusCode = this.getProductStatusCode();
            strategy.appendField(locator, this, "productStatusCode", buffer, theProductStatusCode, (this.productStatusCode!= null));
        }
        {
            List<UnitOfMeasure> theUnitOfMeasure;
            theUnitOfMeasure = (((this.unitOfMeasure!= null)&&(!this.unitOfMeasure.isEmpty()))?this.getUnitOfMeasure():null);
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, ((this.unitOfMeasure!= null)&&(!this.unitOfMeasure.isEmpty())));
        }
        {
            List<WarehouseInformation> theWarehouseInformation;
            theWarehouseInformation = (((this.warehouseInformation!= null)&&(!this.warehouseInformation.isEmpty()))?this.getWarehouseInformation():null);
            strategy.appendField(locator, this, "warehouseInformation", buffer, theWarehouseInformation, ((this.warehouseInformation!= null)&&(!this.warehouseInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
