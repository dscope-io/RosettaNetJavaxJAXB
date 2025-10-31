
package io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_09;

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
import io.dscope.rosettanet.domain.logistics.codelist.nationalexportcontrolclassification.v01_03.NationalExportControlClassification;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.LotIdentification;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.TaxSummary;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.TaxSummaryType;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductSerialIdentification;
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
 * <p>Java class for ProductDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}LotIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03}NationalExportControlClassification" minOccurs="0"/&gt;
 *         &lt;element name="NationalHarmonizedTariffScheduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductMovement" type="{urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.09}ProductMovementType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductSerialIdentification" minOccurs="0"/&gt;
 *         &lt;element name="ProprietaryInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemitToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel" minOccurs="0"/&gt;
 *         &lt;element name="SoldToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}TaxSummary" minOccurs="0"/&gt;
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
@XmlType(name = "ProductDescriptionType", propOrder = {
    "countryOfOrigin",
    "lotIdentification",
    "nationalExportControlClassification",
    "nationalHarmonizedTariffScheduleCode",
    "productMovement",
    "productSerialIdentification",
    "proprietaryInformation",
    "remitToTax",
    "shippingServiceLevel",
    "soldToTax",
    "taxSummary"
})
public class ProductDescriptionType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CountryOfOrigin")
    protected CountryType countryOfOrigin;
    @XmlElementRef(name = "LotIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = LotIdentification.class, required = false)
    protected LotIdentification lotIdentification;
    @XmlElementRef(name = "NationalExportControlClassification", namespace = "urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03", type = NationalExportControlClassification.class, required = false)
    protected NationalExportControlClassification nationalExportControlClassification;
    @XmlElement(name = "NationalHarmonizedTariffScheduleCode")
    protected String nationalHarmonizedTariffScheduleCode;
    @XmlElement(name = "ProductMovement", required = true)
    protected List<ProductMovementType> productMovement;
    @XmlElementRef(name = "ProductSerialIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductSerialIdentification.class, required = false)
    protected ProductSerialIdentification productSerialIdentification;
    @XmlElement(name = "ProprietaryInformation")
    protected String proprietaryInformation;
    @XmlElement(name = "RemitToTax")
    protected TaxSummaryType remitToTax;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class, required = false)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElement(name = "SoldToTax")
    protected TaxSummaryType soldToTax;
    @XmlElementRef(name = "TaxSummary", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = TaxSummary.class, required = false)
    protected TaxSummary taxSummary;
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
     * Gets the value of the lotIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentification }
     *     
     */
    public LotIdentification getLotIdentification() {
        return lotIdentification;
    }

    /**
     * Sets the value of the lotIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentification }
     *     
     */
    public void setLotIdentification(LotIdentification value) {
        this.lotIdentification = value;
    }

    /**
     * Gets the value of the nationalExportControlClassification property.
     * 
     * @return
     *     possible object is
     *     {@link NationalExportControlClassification }
     *     
     */
    public NationalExportControlClassification getNationalExportControlClassification() {
        return nationalExportControlClassification;
    }

    /**
     * Sets the value of the nationalExportControlClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalExportControlClassification }
     *     
     */
    public void setNationalExportControlClassification(NationalExportControlClassification value) {
        this.nationalExportControlClassification = value;
    }

    /**
     * Gets the value of the nationalHarmonizedTariffScheduleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalHarmonizedTariffScheduleCode() {
        return nationalHarmonizedTariffScheduleCode;
    }

    /**
     * Sets the value of the nationalHarmonizedTariffScheduleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalHarmonizedTariffScheduleCode(String value) {
        this.nationalHarmonizedTariffScheduleCode = value;
    }

    /**
     * Gets the value of the productMovement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productMovement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMovement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMovementType }
     * 
     * 
     */
    public List<ProductMovementType> getProductMovement() {
        if (productMovement == null) {
            productMovement = new ArrayList<ProductMovementType>();
        }
        return this.productMovement;
    }

    /**
     * Gets the value of the productSerialIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSerialIdentification }
     *     
     */
    public ProductSerialIdentification getProductSerialIdentification() {
        return productSerialIdentification;
    }

    /**
     * Sets the value of the productSerialIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSerialIdentification }
     *     
     */
    public void setProductSerialIdentification(ProductSerialIdentification value) {
        this.productSerialIdentification = value;
    }

    /**
     * Gets the value of the proprietaryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryInformation() {
        return proprietaryInformation;
    }

    /**
     * Sets the value of the proprietaryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryInformation(String value) {
        this.proprietaryInformation = value;
    }

    /**
     * Gets the value of the remitToTax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummaryType }
     *     
     */
    public TaxSummaryType getRemitToTax() {
        return remitToTax;
    }

    /**
     * Sets the value of the remitToTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryType }
     *     
     */
    public void setRemitToTax(TaxSummaryType value) {
        this.remitToTax = value;
    }

    /**
     * Gets the value of the shippingServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public ShippingServiceLevel getShippingServiceLevel() {
        return shippingServiceLevel;
    }

    /**
     * Sets the value of the shippingServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public void setShippingServiceLevel(ShippingServiceLevel value) {
        this.shippingServiceLevel = value;
    }

    /**
     * Gets the value of the soldToTax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummaryType }
     *     
     */
    public TaxSummaryType getSoldToTax() {
        return soldToTax;
    }

    /**
     * Sets the value of the soldToTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryType }
     *     
     */
    public void setSoldToTax(TaxSummaryType value) {
        this.soldToTax = value;
    }

    /**
     * Gets the value of the taxSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummary }
     *     
     */
    public TaxSummary getTaxSummary() {
        return taxSummary;
    }

    /**
     * Sets the value of the taxSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummary }
     *     
     */
    public void setTaxSummary(TaxSummary value) {
        this.taxSummary = value;
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
        final ProductDescriptionType that = ((ProductDescriptionType) object);
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
            LotIdentification lhsLotIdentification;
            lhsLotIdentification = this.getLotIdentification();
            LotIdentification rhsLotIdentification;
            rhsLotIdentification = that.getLotIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotIdentification", lhsLotIdentification), LocatorUtils.property(thatLocator, "lotIdentification", rhsLotIdentification), lhsLotIdentification, rhsLotIdentification, (this.lotIdentification!= null), (that.lotIdentification!= null))) {
                return false;
            }
        }
        {
            NationalExportControlClassification lhsNationalExportControlClassification;
            lhsNationalExportControlClassification = this.getNationalExportControlClassification();
            NationalExportControlClassification rhsNationalExportControlClassification;
            rhsNationalExportControlClassification = that.getNationalExportControlClassification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nationalExportControlClassification", lhsNationalExportControlClassification), LocatorUtils.property(thatLocator, "nationalExportControlClassification", rhsNationalExportControlClassification), lhsNationalExportControlClassification, rhsNationalExportControlClassification, (this.nationalExportControlClassification!= null), (that.nationalExportControlClassification!= null))) {
                return false;
            }
        }
        {
            String lhsNationalHarmonizedTariffScheduleCode;
            lhsNationalHarmonizedTariffScheduleCode = this.getNationalHarmonizedTariffScheduleCode();
            String rhsNationalHarmonizedTariffScheduleCode;
            rhsNationalHarmonizedTariffScheduleCode = that.getNationalHarmonizedTariffScheduleCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nationalHarmonizedTariffScheduleCode", lhsNationalHarmonizedTariffScheduleCode), LocatorUtils.property(thatLocator, "nationalHarmonizedTariffScheduleCode", rhsNationalHarmonizedTariffScheduleCode), lhsNationalHarmonizedTariffScheduleCode, rhsNationalHarmonizedTariffScheduleCode, (this.nationalHarmonizedTariffScheduleCode!= null), (that.nationalHarmonizedTariffScheduleCode!= null))) {
                return false;
            }
        }
        {
            List<ProductMovementType> lhsProductMovement;
            lhsProductMovement = (((this.productMovement!= null)&&(!this.productMovement.isEmpty()))?this.getProductMovement():null);
            List<ProductMovementType> rhsProductMovement;
            rhsProductMovement = (((that.productMovement!= null)&&(!that.productMovement.isEmpty()))?that.getProductMovement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productMovement", lhsProductMovement), LocatorUtils.property(thatLocator, "productMovement", rhsProductMovement), lhsProductMovement, rhsProductMovement, ((this.productMovement!= null)&&(!this.productMovement.isEmpty())), ((that.productMovement!= null)&&(!that.productMovement.isEmpty())))) {
                return false;
            }
        }
        {
            ProductSerialIdentification lhsProductSerialIdentification;
            lhsProductSerialIdentification = this.getProductSerialIdentification();
            ProductSerialIdentification rhsProductSerialIdentification;
            rhsProductSerialIdentification = that.getProductSerialIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productSerialIdentification", lhsProductSerialIdentification), LocatorUtils.property(thatLocator, "productSerialIdentification", rhsProductSerialIdentification), lhsProductSerialIdentification, rhsProductSerialIdentification, (this.productSerialIdentification!= null), (that.productSerialIdentification!= null))) {
                return false;
            }
        }
        {
            String lhsProprietaryInformation;
            lhsProprietaryInformation = this.getProprietaryInformation();
            String rhsProprietaryInformation;
            rhsProprietaryInformation = that.getProprietaryInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "proprietaryInformation", lhsProprietaryInformation), LocatorUtils.property(thatLocator, "proprietaryInformation", rhsProprietaryInformation), lhsProprietaryInformation, rhsProprietaryInformation, (this.proprietaryInformation!= null), (that.proprietaryInformation!= null))) {
                return false;
            }
        }
        {
            TaxSummaryType lhsRemitToTax;
            lhsRemitToTax = this.getRemitToTax();
            TaxSummaryType rhsRemitToTax;
            rhsRemitToTax = that.getRemitToTax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remitToTax", lhsRemitToTax), LocatorUtils.property(thatLocator, "remitToTax", rhsRemitToTax), lhsRemitToTax, rhsRemitToTax, (this.remitToTax!= null), (that.remitToTax!= null))) {
                return false;
            }
        }
        {
            ShippingServiceLevel lhsShippingServiceLevel;
            lhsShippingServiceLevel = this.getShippingServiceLevel();
            ShippingServiceLevel rhsShippingServiceLevel;
            rhsShippingServiceLevel = that.getShippingServiceLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingServiceLevel", lhsShippingServiceLevel), LocatorUtils.property(thatLocator, "shippingServiceLevel", rhsShippingServiceLevel), lhsShippingServiceLevel, rhsShippingServiceLevel, (this.shippingServiceLevel!= null), (that.shippingServiceLevel!= null))) {
                return false;
            }
        }
        {
            TaxSummaryType lhsSoldToTax;
            lhsSoldToTax = this.getSoldToTax();
            TaxSummaryType rhsSoldToTax;
            rhsSoldToTax = that.getSoldToTax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "soldToTax", lhsSoldToTax), LocatorUtils.property(thatLocator, "soldToTax", rhsSoldToTax), lhsSoldToTax, rhsSoldToTax, (this.soldToTax!= null), (that.soldToTax!= null))) {
                return false;
            }
        }
        {
            TaxSummary lhsTaxSummary;
            lhsTaxSummary = this.getTaxSummary();
            TaxSummary rhsTaxSummary;
            rhsTaxSummary = that.getTaxSummary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxSummary", lhsTaxSummary), LocatorUtils.property(thatLocator, "taxSummary", rhsTaxSummary), lhsTaxSummary, rhsTaxSummary, (this.taxSummary!= null), (that.taxSummary!= null))) {
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
            LotIdentification theLotIdentification;
            theLotIdentification = this.getLotIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotIdentification", theLotIdentification), currentHashCode, theLotIdentification, (this.lotIdentification!= null));
        }
        {
            NationalExportControlClassification theNationalExportControlClassification;
            theNationalExportControlClassification = this.getNationalExportControlClassification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nationalExportControlClassification", theNationalExportControlClassification), currentHashCode, theNationalExportControlClassification, (this.nationalExportControlClassification!= null));
        }
        {
            String theNationalHarmonizedTariffScheduleCode;
            theNationalHarmonizedTariffScheduleCode = this.getNationalHarmonizedTariffScheduleCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nationalHarmonizedTariffScheduleCode", theNationalHarmonizedTariffScheduleCode), currentHashCode, theNationalHarmonizedTariffScheduleCode, (this.nationalHarmonizedTariffScheduleCode!= null));
        }
        {
            List<ProductMovementType> theProductMovement;
            theProductMovement = (((this.productMovement!= null)&&(!this.productMovement.isEmpty()))?this.getProductMovement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productMovement", theProductMovement), currentHashCode, theProductMovement, ((this.productMovement!= null)&&(!this.productMovement.isEmpty())));
        }
        {
            ProductSerialIdentification theProductSerialIdentification;
            theProductSerialIdentification = this.getProductSerialIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productSerialIdentification", theProductSerialIdentification), currentHashCode, theProductSerialIdentification, (this.productSerialIdentification!= null));
        }
        {
            String theProprietaryInformation;
            theProprietaryInformation = this.getProprietaryInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "proprietaryInformation", theProprietaryInformation), currentHashCode, theProprietaryInformation, (this.proprietaryInformation!= null));
        }
        {
            TaxSummaryType theRemitToTax;
            theRemitToTax = this.getRemitToTax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remitToTax", theRemitToTax), currentHashCode, theRemitToTax, (this.remitToTax!= null));
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingServiceLevel", theShippingServiceLevel), currentHashCode, theShippingServiceLevel, (this.shippingServiceLevel!= null));
        }
        {
            TaxSummaryType theSoldToTax;
            theSoldToTax = this.getSoldToTax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "soldToTax", theSoldToTax), currentHashCode, theSoldToTax, (this.soldToTax!= null));
        }
        {
            TaxSummary theTaxSummary;
            theTaxSummary = this.getTaxSummary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxSummary", theTaxSummary), currentHashCode, theTaxSummary, (this.taxSummary!= null));
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
            LotIdentification theLotIdentification;
            theLotIdentification = this.getLotIdentification();
            strategy.appendField(locator, this, "lotIdentification", buffer, theLotIdentification, (this.lotIdentification!= null));
        }
        {
            NationalExportControlClassification theNationalExportControlClassification;
            theNationalExportControlClassification = this.getNationalExportControlClassification();
            strategy.appendField(locator, this, "nationalExportControlClassification", buffer, theNationalExportControlClassification, (this.nationalExportControlClassification!= null));
        }
        {
            String theNationalHarmonizedTariffScheduleCode;
            theNationalHarmonizedTariffScheduleCode = this.getNationalHarmonizedTariffScheduleCode();
            strategy.appendField(locator, this, "nationalHarmonizedTariffScheduleCode", buffer, theNationalHarmonizedTariffScheduleCode, (this.nationalHarmonizedTariffScheduleCode!= null));
        }
        {
            List<ProductMovementType> theProductMovement;
            theProductMovement = (((this.productMovement!= null)&&(!this.productMovement.isEmpty()))?this.getProductMovement():null);
            strategy.appendField(locator, this, "productMovement", buffer, theProductMovement, ((this.productMovement!= null)&&(!this.productMovement.isEmpty())));
        }
        {
            ProductSerialIdentification theProductSerialIdentification;
            theProductSerialIdentification = this.getProductSerialIdentification();
            strategy.appendField(locator, this, "productSerialIdentification", buffer, theProductSerialIdentification, (this.productSerialIdentification!= null));
        }
        {
            String theProprietaryInformation;
            theProprietaryInformation = this.getProprietaryInformation();
            strategy.appendField(locator, this, "proprietaryInformation", buffer, theProprietaryInformation, (this.proprietaryInformation!= null));
        }
        {
            TaxSummaryType theRemitToTax;
            theRemitToTax = this.getRemitToTax();
            strategy.appendField(locator, this, "remitToTax", buffer, theRemitToTax, (this.remitToTax!= null));
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            strategy.appendField(locator, this, "shippingServiceLevel", buffer, theShippingServiceLevel, (this.shippingServiceLevel!= null));
        }
        {
            TaxSummaryType theSoldToTax;
            theSoldToTax = this.getSoldToTax();
            strategy.appendField(locator, this, "soldToTax", buffer, theSoldToTax, (this.soldToTax!= null));
        }
        {
            TaxSummary theTaxSummary;
            theTaxSummary = this.getTaxSummary();
            strategy.appendField(locator, this, "taxSummary", buffer, theTaxSummary, (this.taxSummary!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
