
package io.dscope.rosettanet.interchange.priceandavailabilityrequest.v02_01;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.PriceList;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ProductAvailability;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ProductPricingDetail;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.WarehouseInformation;
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
 *         &lt;element name="EstimatedAvailabilityDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}PriceList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04}PricingTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ProductAvailability" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ProductPricingDetail" minOccurs="0"/&gt;
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
    "estimatedAvailabilityDate",
    "lineNumber",
    "priceList",
    "pricingTypeCode",
    "productAvailability",
    "productIdentification",
    "productPricingDetail",
    "productStatusCode",
    "unitOfMeasure",
    "warehouseInformation"
})
public class ProductPriceAndAvailabilityLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "EstimatedAvailabilityDate")
    protected DatePeriodType estimatedAvailabilityDate;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "PriceList", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = PriceList.class, required = false)
    protected List<PriceList> priceList;
    @XmlElementRef(name = "PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04", type = PricingTypeCode.class, required = false)
    protected PricingTypeCode pricingTypeCode;
    @XmlElementRef(name = "ProductAvailability", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ProductAvailability.class)
    protected List<ProductAvailability> productAvailability;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "ProductPricingDetail", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ProductPricingDetail.class, required = false)
    protected ProductPricingDetail productPricingDetail;
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
     * @return
     *     possible object is
     *     {@link PricingTypeCode }
     *     
     */
    public PricingTypeCode getPricingTypeCode() {
        return pricingTypeCode;
    }

    /**
     * Sets the value of the pricingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTypeCode }
     *     
     */
    public void setPricingTypeCode(PricingTypeCode value) {
        this.pricingTypeCode = value;
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
     * Gets the value of the productPricingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingDetail }
     *     
     */
    public ProductPricingDetail getProductPricingDetail() {
        return productPricingDetail;
    }

    /**
     * Sets the value of the productPricingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingDetail }
     *     
     */
    public void setProductPricingDetail(ProductPricingDetail value) {
        this.productPricingDetail = value;
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
            DatePeriodType lhsEstimatedAvailabilityDate;
            lhsEstimatedAvailabilityDate = this.getEstimatedAvailabilityDate();
            DatePeriodType rhsEstimatedAvailabilityDate;
            rhsEstimatedAvailabilityDate = that.getEstimatedAvailabilityDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedAvailabilityDate", lhsEstimatedAvailabilityDate), LocatorUtils.property(thatLocator, "estimatedAvailabilityDate", rhsEstimatedAvailabilityDate), lhsEstimatedAvailabilityDate, rhsEstimatedAvailabilityDate, (this.estimatedAvailabilityDate!= null), (that.estimatedAvailabilityDate!= null))) {
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
            List<PriceList> lhsPriceList;
            lhsPriceList = (((this.priceList!= null)&&(!this.priceList.isEmpty()))?this.getPriceList():null);
            List<PriceList> rhsPriceList;
            rhsPriceList = (((that.priceList!= null)&&(!that.priceList.isEmpty()))?that.getPriceList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceList", lhsPriceList), LocatorUtils.property(thatLocator, "priceList", rhsPriceList), lhsPriceList, rhsPriceList, ((this.priceList!= null)&&(!this.priceList.isEmpty())), ((that.priceList!= null)&&(!that.priceList.isEmpty())))) {
                return false;
            }
        }
        {
            PricingTypeCode lhsPricingTypeCode;
            lhsPricingTypeCode = this.getPricingTypeCode();
            PricingTypeCode rhsPricingTypeCode;
            rhsPricingTypeCode = that.getPricingTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pricingTypeCode", lhsPricingTypeCode), LocatorUtils.property(thatLocator, "pricingTypeCode", rhsPricingTypeCode), lhsPricingTypeCode, rhsPricingTypeCode, (this.pricingTypeCode!= null), (that.pricingTypeCode!= null))) {
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
            ProductPricingDetail lhsProductPricingDetail;
            lhsProductPricingDetail = this.getProductPricingDetail();
            ProductPricingDetail rhsProductPricingDetail;
            rhsProductPricingDetail = that.getProductPricingDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productPricingDetail", lhsProductPricingDetail), LocatorUtils.property(thatLocator, "productPricingDetail", rhsProductPricingDetail), lhsProductPricingDetail, rhsProductPricingDetail, (this.productPricingDetail!= null), (that.productPricingDetail!= null))) {
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
            DatePeriodType theEstimatedAvailabilityDate;
            theEstimatedAvailabilityDate = this.getEstimatedAvailabilityDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedAvailabilityDate", theEstimatedAvailabilityDate), currentHashCode, theEstimatedAvailabilityDate, (this.estimatedAvailabilityDate!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            List<PriceList> thePriceList;
            thePriceList = (((this.priceList!= null)&&(!this.priceList.isEmpty()))?this.getPriceList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceList", thePriceList), currentHashCode, thePriceList, ((this.priceList!= null)&&(!this.priceList.isEmpty())));
        }
        {
            PricingTypeCode thePricingTypeCode;
            thePricingTypeCode = this.getPricingTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pricingTypeCode", thePricingTypeCode), currentHashCode, thePricingTypeCode, (this.pricingTypeCode!= null));
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
            ProductPricingDetail theProductPricingDetail;
            theProductPricingDetail = this.getProductPricingDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productPricingDetail", theProductPricingDetail), currentHashCode, theProductPricingDetail, (this.productPricingDetail!= null));
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
            DatePeriodType theEstimatedAvailabilityDate;
            theEstimatedAvailabilityDate = this.getEstimatedAvailabilityDate();
            strategy.appendField(locator, this, "estimatedAvailabilityDate", buffer, theEstimatedAvailabilityDate, (this.estimatedAvailabilityDate!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            List<PriceList> thePriceList;
            thePriceList = (((this.priceList!= null)&&(!this.priceList.isEmpty()))?this.getPriceList():null);
            strategy.appendField(locator, this, "priceList", buffer, thePriceList, ((this.priceList!= null)&&(!this.priceList.isEmpty())));
        }
        {
            PricingTypeCode thePricingTypeCode;
            thePricingTypeCode = this.getPricingTypeCode();
            strategy.appendField(locator, this, "pricingTypeCode", buffer, thePricingTypeCode, (this.pricingTypeCode!= null));
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
            ProductPricingDetail theProductPricingDetail;
            theProductPricingDetail = this.getProductPricingDetail();
            strategy.appendField(locator, this, "productPricingDetail", buffer, theProductPricingDetail, (this.productPricingDetail!= null));
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
