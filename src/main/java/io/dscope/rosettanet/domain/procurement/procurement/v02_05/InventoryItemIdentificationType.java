
package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.shared.v01_04.ManufacturedDate;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.productidentification.v01_03.ProductIdentification;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dacc="urn:rosettanet:specification:domain:Procurement:AccountClassification:xsd:codelist:01.03" xmlns:dbpq="urn:rosettanet:specification:domain:Procurement:BookPriceQualifier:xsd:codelist:01.04" xmlns:dccc="urn:rosettanet:specification:domain:Procurement:CreditCardClassification:xsd:codelist:01.03" xmlns:dcrt="urn:rosettanet:specification:domain:Procurement:CustomerType:xsd:codelist:01.03" xmlns:dfe="urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03" xmlns:dfrt="urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.03" xmlns:dft="urn:rosettanet:specification:domain:Procurement:FinanceTerms:xsd:codelist:01.03" xmlns:dit="urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03" xmlns:dltcc="urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03" xmlns:dpc="urn:rosettanet:specification:domain:Procurement:PaymentCondition:xsd:codelist:01.03" xmlns:dpcm="urn:rosettanet:specification:domain:Procurement:PurchaseMethod:xsd:codelist:01.03" xmlns:dpsr="urn:rosettanet:specification:domain:Procurement:ProductSubstitutionReason:xsd:codelist:01.03" xmlns:dsfr="urn:rosettanet:specification:domain:Procurement:SpecialFulfillmentRequest:xsd:codelist:01.03" xmlns:dsh="urn:rosettanet:specification:domain:Procurement:SpecialHandling:xsd:codelist:01.03" xmlns:dslt="urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.03" xmlns:dst="urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03" xmlns:dte="urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03" xmlns:dtec="urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:01.03" xmlns:dtq="urn:rosettanet:specification:domain:Procurement:TotalQualifier:xsd:codelist:01.03" xmlns:dtt="urn:rosettanet:specification:domain:Procurement:TransactionType:xsd:codelist:01.04" xmlns:rfob="urn:rosettanet:specification:domain:Shared:FreeOnBoard:xsd:codelist:01.01" xmlns:ri="urn:rosettanet:specification:domain:Shared:Interval:xsd:codelist:01.01" xmlns:rict="urn:rosettanet:specification:domain:Shared:InvoiceChargeType:xsd:codelist:01.01" xmlns:rmat="urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.01" xmlns:rpm="urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.01" xmlns:rptc="urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.02" xmlns:rssl="urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.04" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05" xmlns:uat="urn:rosettanet:specification:universal:AbstractType:xsd:schema:01.02" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:ucr="urn:rosettanet:specification:universal:Currency:xsd:codelist:01.02" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.03" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.03" xmlns:udt="urn:rosettanet:specification:universal:DataType:xsd:schema:01.03" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.03" xmlns:ume="urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.02" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In InventoryItemIdentification, at least one occurrence of CountryOfOrigin, ManufacturedDate or ProductIdentification.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for InventoryItemIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryItemIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}ManufacturedDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03}ProductIdentification" minOccurs="0"/&gt;
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
@XmlType(name = "InventoryItemIdentificationType", propOrder = {
    "countryOfOrigin",
    "manufacturedDate",
    "productIdentification"
})
public class InventoryItemIdentificationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CountryOfOrigin")
    protected CountryType countryOfOrigin;
    @XmlElementRef(name = "ManufacturedDate", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.04", type = ManufacturedDate.class, required = false)
    protected ManufacturedDate manufacturedDate;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03", type = ProductIdentification.class, required = false)
    protected ProductIdentification productIdentification;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountryOfOrigin(CountryType value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the manufacturedDate property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturedDate }
     *     
     */
    public ManufacturedDate getManufacturedDate() {
        return manufacturedDate;
    }

    /**
     * Sets the value of the manufacturedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturedDate }
     *     
     */
    public void setManufacturedDate(ManufacturedDate value) {
        this.manufacturedDate = value;
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
        final InventoryItemIdentificationType that = ((InventoryItemIdentificationType) object);
        {
            CountryType lhsCountryOfOrigin;
            lhsCountryOfOrigin = this.getCountryOfOrigin();
            CountryType rhsCountryOfOrigin;
            rhsCountryOfOrigin = that.getCountryOfOrigin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryOfOrigin", lhsCountryOfOrigin), LocatorUtils.property(thatLocator, "countryOfOrigin", rhsCountryOfOrigin), lhsCountryOfOrigin, rhsCountryOfOrigin, (this.countryOfOrigin!= null), (that.countryOfOrigin!= null))) {
                return false;
            }
        }
        {
            ManufacturedDate lhsManufacturedDate;
            lhsManufacturedDate = this.getManufacturedDate();
            ManufacturedDate rhsManufacturedDate;
            rhsManufacturedDate = that.getManufacturedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturedDate", lhsManufacturedDate), LocatorUtils.property(thatLocator, "manufacturedDate", rhsManufacturedDate), lhsManufacturedDate, rhsManufacturedDate, (this.manufacturedDate!= null), (that.manufacturedDate!= null))) {
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
            CountryType theCountryOfOrigin;
            theCountryOfOrigin = this.getCountryOfOrigin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countryOfOrigin", theCountryOfOrigin), currentHashCode, theCountryOfOrigin, (this.countryOfOrigin!= null));
        }
        {
            ManufacturedDate theManufacturedDate;
            theManufacturedDate = this.getManufacturedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturedDate", theManufacturedDate), currentHashCode, theManufacturedDate, (this.manufacturedDate!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
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
            CountryType theCountryOfOrigin;
            theCountryOfOrigin = this.getCountryOfOrigin();
            strategy.appendField(locator, this, "countryOfOrigin", buffer, theCountryOfOrigin, (this.countryOfOrigin!= null));
        }
        {
            ManufacturedDate theManufacturedDate;
            theManufacturedDate = this.getManufacturedDate();
            strategy.appendField(locator, this, "manufacturedDate", buffer, theManufacturedDate, (this.manufacturedDate!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
