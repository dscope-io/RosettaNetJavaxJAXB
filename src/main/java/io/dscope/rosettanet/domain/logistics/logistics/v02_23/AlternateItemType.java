
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

import java.math.BigInteger;
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
import io.dscope.rosettanet.domain.logistics.codelist.preferredstatus.v01_00.PreferredStatus;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
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
 * <p>Java class for AlternateItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternateItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EffectiveDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="IsIncludeInRollUpCostIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsProductItemOptional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MakeOrBuyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentProductIdentifier" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:PreferredStatus:xsd:codelist:01.00}PreferredStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="ProductItemSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductWIPSupplyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}ReferenceDesignators" minOccurs="0"/&gt;
 *         &lt;element name="RequestedNumberOfLevels" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure" minOccurs="0"/&gt;
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
@XmlType(name = "AlternateItemType", propOrder = {
    "effectiveDate",
    "isIncludeInRollUpCostIndicator",
    "isProductItemOptional",
    "makeOrBuyIndicator",
    "parentProductIdentifier",
    "preferredStatus",
    "productIdentification",
    "productItemSequence",
    "productItemType",
    "productWIPSupplyType",
    "quantity",
    "referenceDesignators",
    "requestedNumberOfLevels",
    "unitOfMeasure"
})
public class AlternateItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "EffectiveDate")
    protected DatePeriodType effectiveDate;
    @XmlElement(name = "IsIncludeInRollUpCostIndicator")
    protected Boolean isIncludeInRollUpCostIndicator;
    @XmlElement(name = "IsProductItemOptional")
    protected Boolean isProductItemOptional;
    @XmlElement(name = "MakeOrBuyIndicator")
    protected String makeOrBuyIndicator;
    @XmlElement(name = "ParentProductIdentifier")
    protected List<ProductIdentificationType> parentProductIdentifier;
    @XmlElementRef(name = "PreferredStatus", namespace = "urn:rosettanet:specification:domain:Logistics:PreferredStatus:xsd:codelist:01.00", type = PreferredStatus.class, required = false)
    protected PreferredStatus preferredStatus;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProductItemSequence")
    protected String productItemSequence;
    @XmlElement(name = "ProductItemType")
    protected String productItemType;
    @XmlElement(name = "ProductWIPSupplyType")
    protected String productWIPSupplyType;
    @XmlElement(name = "Quantity")
    protected Float quantity;
    @XmlElementRef(name = "ReferenceDesignators", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = ReferenceDesignators.class, required = false)
    protected ReferenceDesignators referenceDesignators;
    @XmlElement(name = "RequestedNumberOfLevels")
    protected BigInteger requestedNumberOfLevels;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class, required = false)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveDate(DatePeriodType value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the isIncludeInRollUpCostIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIncludeInRollUpCostIndicator() {
        return isIncludeInRollUpCostIndicator;
    }

    /**
     * Sets the value of the isIncludeInRollUpCostIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIncludeInRollUpCostIndicator(Boolean value) {
        this.isIncludeInRollUpCostIndicator = value;
    }

    /**
     * Gets the value of the isProductItemOptional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProductItemOptional() {
        return isProductItemOptional;
    }

    /**
     * Sets the value of the isProductItemOptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProductItemOptional(Boolean value) {
        this.isProductItemOptional = value;
    }

    /**
     * Gets the value of the makeOrBuyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeOrBuyIndicator() {
        return makeOrBuyIndicator;
    }

    /**
     * Sets the value of the makeOrBuyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeOrBuyIndicator(String value) {
        this.makeOrBuyIndicator = value;
    }

    /**
     * Gets the value of the parentProductIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentProductIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentProductIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getParentProductIdentifier() {
        if (parentProductIdentifier == null) {
            parentProductIdentifier = new ArrayList<ProductIdentificationType>();
        }
        return this.parentProductIdentifier;
    }

    /**
     * Gets the value of the preferredStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredStatus }
     *     
     */
    public PreferredStatus getPreferredStatus() {
        return preferredStatus;
    }

    /**
     * Sets the value of the preferredStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredStatus }
     *     
     */
    public void setPreferredStatus(PreferredStatus value) {
        this.preferredStatus = value;
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
     * Gets the value of the productItemSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductItemSequence() {
        return productItemSequence;
    }

    /**
     * Sets the value of the productItemSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductItemSequence(String value) {
        this.productItemSequence = value;
    }

    /**
     * Gets the value of the productItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductItemType() {
        return productItemType;
    }

    /**
     * Sets the value of the productItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductItemType(String value) {
        this.productItemType = value;
    }

    /**
     * Gets the value of the productWIPSupplyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductWIPSupplyType() {
        return productWIPSupplyType;
    }

    /**
     * Sets the value of the productWIPSupplyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductWIPSupplyType(String value) {
        this.productWIPSupplyType = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuantity(Float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the referenceDesignators property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDesignators }
     *     
     */
    public ReferenceDesignators getReferenceDesignators() {
        return referenceDesignators;
    }

    /**
     * Sets the value of the referenceDesignators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDesignators }
     *     
     */
    public void setReferenceDesignators(ReferenceDesignators value) {
        this.referenceDesignators = value;
    }

    /**
     * Gets the value of the requestedNumberOfLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestedNumberOfLevels() {
        return requestedNumberOfLevels;
    }

    /**
     * Sets the value of the requestedNumberOfLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestedNumberOfLevels(BigInteger value) {
        this.requestedNumberOfLevels = value;
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
        final AlternateItemType that = ((AlternateItemType) object);
        {
            DatePeriodType lhsEffectiveDate;
            lhsEffectiveDate = this.getEffectiveDate();
            DatePeriodType rhsEffectiveDate;
            rhsEffectiveDate = that.getEffectiveDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveDate", lhsEffectiveDate), LocatorUtils.property(thatLocator, "effectiveDate", rhsEffectiveDate), lhsEffectiveDate, rhsEffectiveDate, (this.effectiveDate!= null), (that.effectiveDate!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsIncludeInRollUpCostIndicator;
            lhsIsIncludeInRollUpCostIndicator = this.isIsIncludeInRollUpCostIndicator();
            Boolean rhsIsIncludeInRollUpCostIndicator;
            rhsIsIncludeInRollUpCostIndicator = that.isIsIncludeInRollUpCostIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isIncludeInRollUpCostIndicator", lhsIsIncludeInRollUpCostIndicator), LocatorUtils.property(thatLocator, "isIncludeInRollUpCostIndicator", rhsIsIncludeInRollUpCostIndicator), lhsIsIncludeInRollUpCostIndicator, rhsIsIncludeInRollUpCostIndicator, (this.isIncludeInRollUpCostIndicator!= null), (that.isIncludeInRollUpCostIndicator!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsProductItemOptional;
            lhsIsProductItemOptional = this.isIsProductItemOptional();
            Boolean rhsIsProductItemOptional;
            rhsIsProductItemOptional = that.isIsProductItemOptional();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isProductItemOptional", lhsIsProductItemOptional), LocatorUtils.property(thatLocator, "isProductItemOptional", rhsIsProductItemOptional), lhsIsProductItemOptional, rhsIsProductItemOptional, (this.isProductItemOptional!= null), (that.isProductItemOptional!= null))) {
                return false;
            }
        }
        {
            String lhsMakeOrBuyIndicator;
            lhsMakeOrBuyIndicator = this.getMakeOrBuyIndicator();
            String rhsMakeOrBuyIndicator;
            rhsMakeOrBuyIndicator = that.getMakeOrBuyIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "makeOrBuyIndicator", lhsMakeOrBuyIndicator), LocatorUtils.property(thatLocator, "makeOrBuyIndicator", rhsMakeOrBuyIndicator), lhsMakeOrBuyIndicator, rhsMakeOrBuyIndicator, (this.makeOrBuyIndicator!= null), (that.makeOrBuyIndicator!= null))) {
                return false;
            }
        }
        {
            List<ProductIdentificationType> lhsParentProductIdentifier;
            lhsParentProductIdentifier = (((this.parentProductIdentifier!= null)&&(!this.parentProductIdentifier.isEmpty()))?this.getParentProductIdentifier():null);
            List<ProductIdentificationType> rhsParentProductIdentifier;
            rhsParentProductIdentifier = (((that.parentProductIdentifier!= null)&&(!that.parentProductIdentifier.isEmpty()))?that.getParentProductIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentProductIdentifier", lhsParentProductIdentifier), LocatorUtils.property(thatLocator, "parentProductIdentifier", rhsParentProductIdentifier), lhsParentProductIdentifier, rhsParentProductIdentifier, ((this.parentProductIdentifier!= null)&&(!this.parentProductIdentifier.isEmpty())), ((that.parentProductIdentifier!= null)&&(!that.parentProductIdentifier.isEmpty())))) {
                return false;
            }
        }
        {
            PreferredStatus lhsPreferredStatus;
            lhsPreferredStatus = this.getPreferredStatus();
            PreferredStatus rhsPreferredStatus;
            rhsPreferredStatus = that.getPreferredStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preferredStatus", lhsPreferredStatus), LocatorUtils.property(thatLocator, "preferredStatus", rhsPreferredStatus), lhsPreferredStatus, rhsPreferredStatus, (this.preferredStatus!= null), (that.preferredStatus!= null))) {
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
            String lhsProductItemSequence;
            lhsProductItemSequence = this.getProductItemSequence();
            String rhsProductItemSequence;
            rhsProductItemSequence = that.getProductItemSequence();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productItemSequence", lhsProductItemSequence), LocatorUtils.property(thatLocator, "productItemSequence", rhsProductItemSequence), lhsProductItemSequence, rhsProductItemSequence, (this.productItemSequence!= null), (that.productItemSequence!= null))) {
                return false;
            }
        }
        {
            String lhsProductItemType;
            lhsProductItemType = this.getProductItemType();
            String rhsProductItemType;
            rhsProductItemType = that.getProductItemType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productItemType", lhsProductItemType), LocatorUtils.property(thatLocator, "productItemType", rhsProductItemType), lhsProductItemType, rhsProductItemType, (this.productItemType!= null), (that.productItemType!= null))) {
                return false;
            }
        }
        {
            String lhsProductWIPSupplyType;
            lhsProductWIPSupplyType = this.getProductWIPSupplyType();
            String rhsProductWIPSupplyType;
            rhsProductWIPSupplyType = that.getProductWIPSupplyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productWIPSupplyType", lhsProductWIPSupplyType), LocatorUtils.property(thatLocator, "productWIPSupplyType", rhsProductWIPSupplyType), lhsProductWIPSupplyType, rhsProductWIPSupplyType, (this.productWIPSupplyType!= null), (that.productWIPSupplyType!= null))) {
                return false;
            }
        }
        {
            Float lhsQuantity;
            lhsQuantity = this.getQuantity();
            Float rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, (this.quantity!= null), (that.quantity!= null))) {
                return false;
            }
        }
        {
            ReferenceDesignators lhsReferenceDesignators;
            lhsReferenceDesignators = this.getReferenceDesignators();
            ReferenceDesignators rhsReferenceDesignators;
            rhsReferenceDesignators = that.getReferenceDesignators();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceDesignators", lhsReferenceDesignators), LocatorUtils.property(thatLocator, "referenceDesignators", rhsReferenceDesignators), lhsReferenceDesignators, rhsReferenceDesignators, (this.referenceDesignators!= null), (that.referenceDesignators!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsRequestedNumberOfLevels;
            lhsRequestedNumberOfLevels = this.getRequestedNumberOfLevels();
            BigInteger rhsRequestedNumberOfLevels;
            rhsRequestedNumberOfLevels = that.getRequestedNumberOfLevels();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedNumberOfLevels", lhsRequestedNumberOfLevels), LocatorUtils.property(thatLocator, "requestedNumberOfLevels", rhsRequestedNumberOfLevels), lhsRequestedNumberOfLevels, rhsRequestedNumberOfLevels, (this.requestedNumberOfLevels!= null), (that.requestedNumberOfLevels!= null))) {
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
            DatePeriodType theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveDate", theEffectiveDate), currentHashCode, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            Boolean theIsIncludeInRollUpCostIndicator;
            theIsIncludeInRollUpCostIndicator = this.isIsIncludeInRollUpCostIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isIncludeInRollUpCostIndicator", theIsIncludeInRollUpCostIndicator), currentHashCode, theIsIncludeInRollUpCostIndicator, (this.isIncludeInRollUpCostIndicator!= null));
        }
        {
            Boolean theIsProductItemOptional;
            theIsProductItemOptional = this.isIsProductItemOptional();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isProductItemOptional", theIsProductItemOptional), currentHashCode, theIsProductItemOptional, (this.isProductItemOptional!= null));
        }
        {
            String theMakeOrBuyIndicator;
            theMakeOrBuyIndicator = this.getMakeOrBuyIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "makeOrBuyIndicator", theMakeOrBuyIndicator), currentHashCode, theMakeOrBuyIndicator, (this.makeOrBuyIndicator!= null));
        }
        {
            List<ProductIdentificationType> theParentProductIdentifier;
            theParentProductIdentifier = (((this.parentProductIdentifier!= null)&&(!this.parentProductIdentifier.isEmpty()))?this.getParentProductIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentProductIdentifier", theParentProductIdentifier), currentHashCode, theParentProductIdentifier, ((this.parentProductIdentifier!= null)&&(!this.parentProductIdentifier.isEmpty())));
        }
        {
            PreferredStatus thePreferredStatus;
            thePreferredStatus = this.getPreferredStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preferredStatus", thePreferredStatus), currentHashCode, thePreferredStatus, (this.preferredStatus!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theProductItemSequence;
            theProductItemSequence = this.getProductItemSequence();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productItemSequence", theProductItemSequence), currentHashCode, theProductItemSequence, (this.productItemSequence!= null));
        }
        {
            String theProductItemType;
            theProductItemType = this.getProductItemType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productItemType", theProductItemType), currentHashCode, theProductItemType, (this.productItemType!= null));
        }
        {
            String theProductWIPSupplyType;
            theProductWIPSupplyType = this.getProductWIPSupplyType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productWIPSupplyType", theProductWIPSupplyType), currentHashCode, theProductWIPSupplyType, (this.productWIPSupplyType!= null));
        }
        {
            Float theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, (this.quantity!= null));
        }
        {
            ReferenceDesignators theReferenceDesignators;
            theReferenceDesignators = this.getReferenceDesignators();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceDesignators", theReferenceDesignators), currentHashCode, theReferenceDesignators, (this.referenceDesignators!= null));
        }
        {
            BigInteger theRequestedNumberOfLevels;
            theRequestedNumberOfLevels = this.getRequestedNumberOfLevels();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedNumberOfLevels", theRequestedNumberOfLevels), currentHashCode, theRequestedNumberOfLevels, (this.requestedNumberOfLevels!= null));
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
            DatePeriodType theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            strategy.appendField(locator, this, "effectiveDate", buffer, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            Boolean theIsIncludeInRollUpCostIndicator;
            theIsIncludeInRollUpCostIndicator = this.isIsIncludeInRollUpCostIndicator();
            strategy.appendField(locator, this, "isIncludeInRollUpCostIndicator", buffer, theIsIncludeInRollUpCostIndicator, (this.isIncludeInRollUpCostIndicator!= null));
        }
        {
            Boolean theIsProductItemOptional;
            theIsProductItemOptional = this.isIsProductItemOptional();
            strategy.appendField(locator, this, "isProductItemOptional", buffer, theIsProductItemOptional, (this.isProductItemOptional!= null));
        }
        {
            String theMakeOrBuyIndicator;
            theMakeOrBuyIndicator = this.getMakeOrBuyIndicator();
            strategy.appendField(locator, this, "makeOrBuyIndicator", buffer, theMakeOrBuyIndicator, (this.makeOrBuyIndicator!= null));
        }
        {
            List<ProductIdentificationType> theParentProductIdentifier;
            theParentProductIdentifier = (((this.parentProductIdentifier!= null)&&(!this.parentProductIdentifier.isEmpty()))?this.getParentProductIdentifier():null);
            strategy.appendField(locator, this, "parentProductIdentifier", buffer, theParentProductIdentifier, ((this.parentProductIdentifier!= null)&&(!this.parentProductIdentifier.isEmpty())));
        }
        {
            PreferredStatus thePreferredStatus;
            thePreferredStatus = this.getPreferredStatus();
            strategy.appendField(locator, this, "preferredStatus", buffer, thePreferredStatus, (this.preferredStatus!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theProductItemSequence;
            theProductItemSequence = this.getProductItemSequence();
            strategy.appendField(locator, this, "productItemSequence", buffer, theProductItemSequence, (this.productItemSequence!= null));
        }
        {
            String theProductItemType;
            theProductItemType = this.getProductItemType();
            strategy.appendField(locator, this, "productItemType", buffer, theProductItemType, (this.productItemType!= null));
        }
        {
            String theProductWIPSupplyType;
            theProductWIPSupplyType = this.getProductWIPSupplyType();
            strategy.appendField(locator, this, "productWIPSupplyType", buffer, theProductWIPSupplyType, (this.productWIPSupplyType!= null));
        }
        {
            Float theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, (this.quantity!= null));
        }
        {
            ReferenceDesignators theReferenceDesignators;
            theReferenceDesignators = this.getReferenceDesignators();
            strategy.appendField(locator, this, "referenceDesignators", buffer, theReferenceDesignators, (this.referenceDesignators!= null));
        }
        {
            BigInteger theRequestedNumberOfLevels;
            theRequestedNumberOfLevels = this.getRequestedNumberOfLevels();
            strategy.appendField(locator, this, "requestedNumberOfLevels", buffer, theRequestedNumberOfLevels, (this.requestedNumberOfLevels!= null));
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
