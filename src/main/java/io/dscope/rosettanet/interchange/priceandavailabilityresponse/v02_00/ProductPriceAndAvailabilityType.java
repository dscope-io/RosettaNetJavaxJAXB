
package io.dscope.rosettanet.interchange.priceandavailabilityresponse.v02_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.PriceCondition;
import io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_03.PricingTypeCode;
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
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dcac="urn:rosettanet:specification:domain:Procurement:CustomerAuthorizationCode:xsd:codelist:01.03" xmlns:dltcc="urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17" xmlns:dpac="urn:rosettanet:specification:domain:Procurement:ProductAvailabilityCode:xsd:codelist:01.03" xmlns:p377348_="http://java.sun.com/xml/ns/jaxb" xmlns:p953932_="http://annox.dev.java.net" xmlns:rpktc="urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01" xmlns:rpsc="urn:rosettanet:specification:domain:Shared:ProductStatusCode:xsd:codelist:01.01" xmlns:rptc="urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.03" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.10" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PriceAndAvailabilityResponse:xsd:schema:02.00" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.03" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductPriceAndAvailability, if the value of IsSpecialPricingExists is equal to 'true' then the occurence of PriceCondition/SpecialPricingDatePeriod MUST be 1.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductPriceAndAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPriceAndAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsAdditionalInformationIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsSpecialPricingExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}PriceCondition" minOccurs="0"/&gt;
 *         &lt;element name="PriceListIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.03}PricingTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductPriceAndAvailabilityLineItem" type="{urn:rosettanet:specification:interchange:PriceAndAvailabilityResponse:xsd:schema:02.00}ProductPriceAndAvailabilityLineItemType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ProductPriceAndAvailabilityType", propOrder = {
    "isAdditionalInformationIncluded",
    "isSpecialPricingExists",
    "priceCondition",
    "priceListIdentifier",
    "pricingTypeCode",
    "productPriceAndAvailabilityLineItem"
})
public class ProductPriceAndAvailabilityType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "IsAdditionalInformationIncluded")
    protected boolean isAdditionalInformationIncluded;
    @XmlElement(name = "IsSpecialPricingExists")
    protected boolean isSpecialPricingExists;
    @XmlElementRef(name = "PriceCondition", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = PriceCondition.class, required = false)
    protected PriceCondition priceCondition;
    @XmlElement(name = "PriceListIdentifier", required = true)
    protected String priceListIdentifier;
    @XmlElementRef(name = "PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.03", type = PricingTypeCode.class, required = false)
    protected List<PricingTypeCode> pricingTypeCode;
    @XmlElement(name = "ProductPriceAndAvailabilityLineItem", required = true)
    protected List<ProductPriceAndAvailabilityLineItemType> productPriceAndAvailabilityLineItem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the priceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link PriceCondition }
     *     
     */
    public PriceCondition getPriceCondition() {
        return priceCondition;
    }

    /**
     * Sets the value of the priceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceCondition }
     *     
     */
    public void setPriceCondition(PriceCondition value) {
        this.priceCondition = value;
    }

    /**
     * Gets the value of the priceListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListIdentifier() {
        return priceListIdentifier;
    }

    /**
     * Sets the value of the priceListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListIdentifier(String value) {
        this.priceListIdentifier = value;
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
     * Gets the value of the productPriceAndAvailabilityLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPriceAndAvailabilityLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPriceAndAvailabilityLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPriceAndAvailabilityLineItemType }
     * 
     * 
     */
    public List<ProductPriceAndAvailabilityLineItemType> getProductPriceAndAvailabilityLineItem() {
        if (productPriceAndAvailabilityLineItem == null) {
            productPriceAndAvailabilityLineItem = new ArrayList<ProductPriceAndAvailabilityLineItemType>();
        }
        return this.productPriceAndAvailabilityLineItem;
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
        final ProductPriceAndAvailabilityType that = ((ProductPriceAndAvailabilityType) object);
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
            boolean lhsIsSpecialPricingExists;
            lhsIsSpecialPricingExists = this.isIsSpecialPricingExists();
            boolean rhsIsSpecialPricingExists;
            rhsIsSpecialPricingExists = that.isIsSpecialPricingExists();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isSpecialPricingExists", lhsIsSpecialPricingExists), LocatorUtils.property(thatLocator, "isSpecialPricingExists", rhsIsSpecialPricingExists), lhsIsSpecialPricingExists, rhsIsSpecialPricingExists, true, true)) {
                return false;
            }
        }
        {
            PriceCondition lhsPriceCondition;
            lhsPriceCondition = this.getPriceCondition();
            PriceCondition rhsPriceCondition;
            rhsPriceCondition = that.getPriceCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceCondition", lhsPriceCondition), LocatorUtils.property(thatLocator, "priceCondition", rhsPriceCondition), lhsPriceCondition, rhsPriceCondition, (this.priceCondition!= null), (that.priceCondition!= null))) {
                return false;
            }
        }
        {
            String lhsPriceListIdentifier;
            lhsPriceListIdentifier = this.getPriceListIdentifier();
            String rhsPriceListIdentifier;
            rhsPriceListIdentifier = that.getPriceListIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceListIdentifier", lhsPriceListIdentifier), LocatorUtils.property(thatLocator, "priceListIdentifier", rhsPriceListIdentifier), lhsPriceListIdentifier, rhsPriceListIdentifier, (this.priceListIdentifier!= null), (that.priceListIdentifier!= null))) {
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
            List<ProductPriceAndAvailabilityLineItemType> lhsProductPriceAndAvailabilityLineItem;
            lhsProductPriceAndAvailabilityLineItem = (((this.productPriceAndAvailabilityLineItem!= null)&&(!this.productPriceAndAvailabilityLineItem.isEmpty()))?this.getProductPriceAndAvailabilityLineItem():null);
            List<ProductPriceAndAvailabilityLineItemType> rhsProductPriceAndAvailabilityLineItem;
            rhsProductPriceAndAvailabilityLineItem = (((that.productPriceAndAvailabilityLineItem!= null)&&(!that.productPriceAndAvailabilityLineItem.isEmpty()))?that.getProductPriceAndAvailabilityLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productPriceAndAvailabilityLineItem", lhsProductPriceAndAvailabilityLineItem), LocatorUtils.property(thatLocator, "productPriceAndAvailabilityLineItem", rhsProductPriceAndAvailabilityLineItem), lhsProductPriceAndAvailabilityLineItem, rhsProductPriceAndAvailabilityLineItem, ((this.productPriceAndAvailabilityLineItem!= null)&&(!this.productPriceAndAvailabilityLineItem.isEmpty())), ((that.productPriceAndAvailabilityLineItem!= null)&&(!that.productPriceAndAvailabilityLineItem.isEmpty())))) {
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
            boolean theIsAdditionalInformationIncluded;
            theIsAdditionalInformationIncluded = this.isIsAdditionalInformationIncluded();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isAdditionalInformationIncluded", theIsAdditionalInformationIncluded), currentHashCode, theIsAdditionalInformationIncluded, true);
        }
        {
            boolean theIsSpecialPricingExists;
            theIsSpecialPricingExists = this.isIsSpecialPricingExists();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isSpecialPricingExists", theIsSpecialPricingExists), currentHashCode, theIsSpecialPricingExists, true);
        }
        {
            PriceCondition thePriceCondition;
            thePriceCondition = this.getPriceCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceCondition", thePriceCondition), currentHashCode, thePriceCondition, (this.priceCondition!= null));
        }
        {
            String thePriceListIdentifier;
            thePriceListIdentifier = this.getPriceListIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceListIdentifier", thePriceListIdentifier), currentHashCode, thePriceListIdentifier, (this.priceListIdentifier!= null));
        }
        {
            List<PricingTypeCode> thePricingTypeCode;
            thePricingTypeCode = (((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty()))?this.getPricingTypeCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pricingTypeCode", thePricingTypeCode), currentHashCode, thePricingTypeCode, ((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty())));
        }
        {
            List<ProductPriceAndAvailabilityLineItemType> theProductPriceAndAvailabilityLineItem;
            theProductPriceAndAvailabilityLineItem = (((this.productPriceAndAvailabilityLineItem!= null)&&(!this.productPriceAndAvailabilityLineItem.isEmpty()))?this.getProductPriceAndAvailabilityLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productPriceAndAvailabilityLineItem", theProductPriceAndAvailabilityLineItem), currentHashCode, theProductPriceAndAvailabilityLineItem, ((this.productPriceAndAvailabilityLineItem!= null)&&(!this.productPriceAndAvailabilityLineItem.isEmpty())));
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
            boolean theIsAdditionalInformationIncluded;
            theIsAdditionalInformationIncluded = this.isIsAdditionalInformationIncluded();
            strategy.appendField(locator, this, "isAdditionalInformationIncluded", buffer, theIsAdditionalInformationIncluded, true);
        }
        {
            boolean theIsSpecialPricingExists;
            theIsSpecialPricingExists = this.isIsSpecialPricingExists();
            strategy.appendField(locator, this, "isSpecialPricingExists", buffer, theIsSpecialPricingExists, true);
        }
        {
            PriceCondition thePriceCondition;
            thePriceCondition = this.getPriceCondition();
            strategy.appendField(locator, this, "priceCondition", buffer, thePriceCondition, (this.priceCondition!= null));
        }
        {
            String thePriceListIdentifier;
            thePriceListIdentifier = this.getPriceListIdentifier();
            strategy.appendField(locator, this, "priceListIdentifier", buffer, thePriceListIdentifier, (this.priceListIdentifier!= null));
        }
        {
            List<PricingTypeCode> thePricingTypeCode;
            thePricingTypeCode = (((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty()))?this.getPricingTypeCode():null);
            strategy.appendField(locator, this, "pricingTypeCode", buffer, thePricingTypeCode, ((this.pricingTypeCode!= null)&&(!this.pricingTypeCode.isEmpty())));
        }
        {
            List<ProductPriceAndAvailabilityLineItemType> theProductPriceAndAvailabilityLineItem;
            theProductPriceAndAvailabilityLineItem = (((this.productPriceAndAvailabilityLineItem!= null)&&(!this.productPriceAndAvailabilityLineItem.isEmpty()))?this.getProductPriceAndAvailabilityLineItem():null);
            strategy.appendField(locator, this, "productPriceAndAvailabilityLineItem", buffer, theProductPriceAndAvailabilityLineItem, ((this.productPriceAndAvailabilityLineItem!= null)&&(!this.productPriceAndAvailabilityLineItem.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
