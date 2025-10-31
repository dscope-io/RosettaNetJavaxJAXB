
package io.dscope.rosettanet.interchange.productlistdistribution.v02_00;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.GeographicRegion;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.IsRegisterable;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductClassification;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductPricingType;
import io.dscope.rosettanet.interchange.codelist.parttype.v02_00.PartType;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_04.TextualDescription;
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
 * <p>Java class for EligibleProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligibleProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EffectiveRegistrationDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}GeographicRegion" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}IsRegisterable"/&gt;
 *         &lt;element name="LastShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MinimumOrderQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:PartType:xsd:codelist:02.00}PartType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductClassification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescription" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductPricingType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "EligibleProductInformationType", propOrder = {
    "effectiveRegistrationDate",
    "geographicRegion",
    "isRegisterable",
    "lastShipDate",
    "minimumOrderQuantity",
    "partType",
    "productClassification",
    "productIdentification",
    "textualDescription",
    "unitPrice"
})
public class EligibleProductInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "EffectiveRegistrationDate")
    protected DatePeriodType effectiveRegistrationDate;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = GeographicRegion.class, required = false)
    protected GeographicRegion geographicRegion;
    @XmlElementRef(name = "IsRegisterable", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = IsRegisterable.class)
    protected IsRegisterable isRegisterable;
    @XmlElement(name = "LastShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastShipDate;
    @XmlElement(name = "MinimumOrderQuantity")
    protected Float minimumOrderQuantity;
    @XmlElementRef(name = "PartType", namespace = "urn:rosettanet:specification:interchange:PartType:xsd:codelist:02.00", type = PartType.class)
    protected PartType partType;
    @XmlElementRef(name = "ProductClassification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ProductClassification.class, required = false)
    protected ProductClassification productClassification;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "TextualDescription", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = TextualDescription.class, required = false)
    protected TextualDescription textualDescription;
    @XmlElement(name = "UnitPrice")
    protected List<ProductPricingType> unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the effectiveRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveRegistrationDate() {
        return effectiveRegistrationDate;
    }

    /**
     * Sets the value of the effectiveRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveRegistrationDate(DatePeriodType value) {
        this.effectiveRegistrationDate = value;
    }

    /**
     * Gets the value of the geographicRegion property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicRegion }
     *     
     */
    public GeographicRegion getGeographicRegion() {
        return geographicRegion;
    }

    /**
     * Sets the value of the geographicRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicRegion }
     *     
     */
    public void setGeographicRegion(GeographicRegion value) {
        this.geographicRegion = value;
    }

    /**
     * Gets the value of the isRegisterable property.
     * 
     * @return
     *     possible object is
     *     {@link IsRegisterable }
     *     
     */
    public IsRegisterable getIsRegisterable() {
        return isRegisterable;
    }

    /**
     * Sets the value of the isRegisterable property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsRegisterable }
     *     
     */
    public void setIsRegisterable(IsRegisterable value) {
        this.isRegisterable = value;
    }

    /**
     * Gets the value of the lastShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastShipDate() {
        return lastShipDate;
    }

    /**
     * Sets the value of the lastShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastShipDate(XMLGregorianCalendar value) {
        this.lastShipDate = value;
    }

    /**
     * Gets the value of the minimumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the value of the minimumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumOrderQuantity(Float value) {
        this.minimumOrderQuantity = value;
    }

    /**
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link PartType }
     *     
     */
    public PartType getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartType }
     *     
     */
    public void setPartType(PartType value) {
        this.partType = value;
    }

    /**
     * Gets the value of the productClassification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductClassification }
     *     
     */
    public ProductClassification getProductClassification() {
        return productClassification;
    }

    /**
     * Sets the value of the productClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductClassification }
     *     
     */
    public void setProductClassification(ProductClassification value) {
        this.productClassification = value;
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
     * Gets the value of the textualDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescription }
     *     
     */
    public TextualDescription getTextualDescription() {
        return textualDescription;
    }

    /**
     * Sets the value of the textualDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescription }
     *     
     */
    public void setTextualDescription(TextualDescription value) {
        this.textualDescription = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPricingType }
     * 
     * 
     */
    public List<ProductPricingType> getUnitPrice() {
        if (unitPrice == null) {
            unitPrice = new ArrayList<ProductPricingType>();
        }
        return this.unitPrice;
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
        final EligibleProductInformationType that = ((EligibleProductInformationType) object);
        {
            DatePeriodType lhsEffectiveRegistrationDate;
            lhsEffectiveRegistrationDate = this.getEffectiveRegistrationDate();
            DatePeriodType rhsEffectiveRegistrationDate;
            rhsEffectiveRegistrationDate = that.getEffectiveRegistrationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveRegistrationDate", lhsEffectiveRegistrationDate), LocatorUtils.property(thatLocator, "effectiveRegistrationDate", rhsEffectiveRegistrationDate), lhsEffectiveRegistrationDate, rhsEffectiveRegistrationDate, (this.effectiveRegistrationDate!= null), (that.effectiveRegistrationDate!= null))) {
                return false;
            }
        }
        {
            GeographicRegion lhsGeographicRegion;
            lhsGeographicRegion = this.getGeographicRegion();
            GeographicRegion rhsGeographicRegion;
            rhsGeographicRegion = that.getGeographicRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geographicRegion", lhsGeographicRegion), LocatorUtils.property(thatLocator, "geographicRegion", rhsGeographicRegion), lhsGeographicRegion, rhsGeographicRegion, (this.geographicRegion!= null), (that.geographicRegion!= null))) {
                return false;
            }
        }
        {
            IsRegisterable lhsIsRegisterable;
            lhsIsRegisterable = this.getIsRegisterable();
            IsRegisterable rhsIsRegisterable;
            rhsIsRegisterable = that.getIsRegisterable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRegisterable", lhsIsRegisterable), LocatorUtils.property(thatLocator, "isRegisterable", rhsIsRegisterable), lhsIsRegisterable, rhsIsRegisterable, (this.isRegisterable!= null), (that.isRegisterable!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsLastShipDate;
            lhsLastShipDate = this.getLastShipDate();
            XMLGregorianCalendar rhsLastShipDate;
            rhsLastShipDate = that.getLastShipDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastShipDate", lhsLastShipDate), LocatorUtils.property(thatLocator, "lastShipDate", rhsLastShipDate), lhsLastShipDate, rhsLastShipDate, (this.lastShipDate!= null), (that.lastShipDate!= null))) {
                return false;
            }
        }
        {
            Float lhsMinimumOrderQuantity;
            lhsMinimumOrderQuantity = this.getMinimumOrderQuantity();
            Float rhsMinimumOrderQuantity;
            rhsMinimumOrderQuantity = that.getMinimumOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumOrderQuantity", lhsMinimumOrderQuantity), LocatorUtils.property(thatLocator, "minimumOrderQuantity", rhsMinimumOrderQuantity), lhsMinimumOrderQuantity, rhsMinimumOrderQuantity, (this.minimumOrderQuantity!= null), (that.minimumOrderQuantity!= null))) {
                return false;
            }
        }
        {
            PartType lhsPartType;
            lhsPartType = this.getPartType();
            PartType rhsPartType;
            rhsPartType = that.getPartType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partType", lhsPartType), LocatorUtils.property(thatLocator, "partType", rhsPartType), lhsPartType, rhsPartType, (this.partType!= null), (that.partType!= null))) {
                return false;
            }
        }
        {
            ProductClassification lhsProductClassification;
            lhsProductClassification = this.getProductClassification();
            ProductClassification rhsProductClassification;
            rhsProductClassification = that.getProductClassification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productClassification", lhsProductClassification), LocatorUtils.property(thatLocator, "productClassification", rhsProductClassification), lhsProductClassification, rhsProductClassification, (this.productClassification!= null), (that.productClassification!= null))) {
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
            TextualDescription lhsTextualDescription;
            lhsTextualDescription = this.getTextualDescription();
            TextualDescription rhsTextualDescription;
            rhsTextualDescription = that.getTextualDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "textualDescription", lhsTextualDescription), LocatorUtils.property(thatLocator, "textualDescription", rhsTextualDescription), lhsTextualDescription, rhsTextualDescription, (this.textualDescription!= null), (that.textualDescription!= null))) {
                return false;
            }
        }
        {
            List<ProductPricingType> lhsUnitPrice;
            lhsUnitPrice = (((this.unitPrice!= null)&&(!this.unitPrice.isEmpty()))?this.getUnitPrice():null);
            List<ProductPricingType> rhsUnitPrice;
            rhsUnitPrice = (((that.unitPrice!= null)&&(!that.unitPrice.isEmpty()))?that.getUnitPrice():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitPrice", lhsUnitPrice), LocatorUtils.property(thatLocator, "unitPrice", rhsUnitPrice), lhsUnitPrice, rhsUnitPrice, ((this.unitPrice!= null)&&(!this.unitPrice.isEmpty())), ((that.unitPrice!= null)&&(!that.unitPrice.isEmpty())))) {
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
            DatePeriodType theEffectiveRegistrationDate;
            theEffectiveRegistrationDate = this.getEffectiveRegistrationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveRegistrationDate", theEffectiveRegistrationDate), currentHashCode, theEffectiveRegistrationDate, (this.effectiveRegistrationDate!= null));
        }
        {
            GeographicRegion theGeographicRegion;
            theGeographicRegion = this.getGeographicRegion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geographicRegion", theGeographicRegion), currentHashCode, theGeographicRegion, (this.geographicRegion!= null));
        }
        {
            IsRegisterable theIsRegisterable;
            theIsRegisterable = this.getIsRegisterable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRegisterable", theIsRegisterable), currentHashCode, theIsRegisterable, (this.isRegisterable!= null));
        }
        {
            XMLGregorianCalendar theLastShipDate;
            theLastShipDate = this.getLastShipDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastShipDate", theLastShipDate), currentHashCode, theLastShipDate, (this.lastShipDate!= null));
        }
        {
            Float theMinimumOrderQuantity;
            theMinimumOrderQuantity = this.getMinimumOrderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumOrderQuantity", theMinimumOrderQuantity), currentHashCode, theMinimumOrderQuantity, (this.minimumOrderQuantity!= null));
        }
        {
            PartType thePartType;
            thePartType = this.getPartType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partType", thePartType), currentHashCode, thePartType, (this.partType!= null));
        }
        {
            ProductClassification theProductClassification;
            theProductClassification = this.getProductClassification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productClassification", theProductClassification), currentHashCode, theProductClassification, (this.productClassification!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            TextualDescription theTextualDescription;
            theTextualDescription = this.getTextualDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "textualDescription", theTextualDescription), currentHashCode, theTextualDescription, (this.textualDescription!= null));
        }
        {
            List<ProductPricingType> theUnitPrice;
            theUnitPrice = (((this.unitPrice!= null)&&(!this.unitPrice.isEmpty()))?this.getUnitPrice():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitPrice", theUnitPrice), currentHashCode, theUnitPrice, ((this.unitPrice!= null)&&(!this.unitPrice.isEmpty())));
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
            DatePeriodType theEffectiveRegistrationDate;
            theEffectiveRegistrationDate = this.getEffectiveRegistrationDate();
            strategy.appendField(locator, this, "effectiveRegistrationDate", buffer, theEffectiveRegistrationDate, (this.effectiveRegistrationDate!= null));
        }
        {
            GeographicRegion theGeographicRegion;
            theGeographicRegion = this.getGeographicRegion();
            strategy.appendField(locator, this, "geographicRegion", buffer, theGeographicRegion, (this.geographicRegion!= null));
        }
        {
            IsRegisterable theIsRegisterable;
            theIsRegisterable = this.getIsRegisterable();
            strategy.appendField(locator, this, "isRegisterable", buffer, theIsRegisterable, (this.isRegisterable!= null));
        }
        {
            XMLGregorianCalendar theLastShipDate;
            theLastShipDate = this.getLastShipDate();
            strategy.appendField(locator, this, "lastShipDate", buffer, theLastShipDate, (this.lastShipDate!= null));
        }
        {
            Float theMinimumOrderQuantity;
            theMinimumOrderQuantity = this.getMinimumOrderQuantity();
            strategy.appendField(locator, this, "minimumOrderQuantity", buffer, theMinimumOrderQuantity, (this.minimumOrderQuantity!= null));
        }
        {
            PartType thePartType;
            thePartType = this.getPartType();
            strategy.appendField(locator, this, "partType", buffer, thePartType, (this.partType!= null));
        }
        {
            ProductClassification theProductClassification;
            theProductClassification = this.getProductClassification();
            strategy.appendField(locator, this, "productClassification", buffer, theProductClassification, (this.productClassification!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            TextualDescription theTextualDescription;
            theTextualDescription = this.getTextualDescription();
            strategy.appendField(locator, this, "textualDescription", buffer, theTextualDescription, (this.textualDescription!= null));
        }
        {
            List<ProductPricingType> theUnitPrice;
            theUnitPrice = (((this.unitPrice!= null)&&(!this.unitPrice.isEmpty()))?this.getUnitPrice():null);
            strategy.appendField(locator, this, "unitPrice", buffer, theUnitPrice, ((this.unitPrice!= null)&&(!this.unitPrice.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
