
package io.dscope.rosettanet.domain.procurement.procurement.v02_27;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.shared.v01_17.DatePeriodAndDurationType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.ProductPricing;
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
 * <p>Java class for SpecialPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmountIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EligiblePeriod" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element name="EligibleUnits" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}ProductPricing"/&gt;
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
@XmlType(name = "SpecialPriceType", propOrder = {
    "amountIdentifier",
    "eligiblePeriod",
    "eligibleUnits",
    "productPricing"
})
public class SpecialPriceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AmountIdentifier")
    protected String amountIdentifier;
    @XmlElement(name = "EligiblePeriod")
    protected DatePeriodAndDurationType eligiblePeriod;
    @XmlElement(name = "EligibleUnits")
    protected Float eligibleUnits;
    @XmlElementRef(name = "ProductPricing", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06", type = ProductPricing.class)
    protected ProductPricing productPricing;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the amountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountIdentifier() {
        return amountIdentifier;
    }

    /**
     * Sets the value of the amountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountIdentifier(String value) {
        this.amountIdentifier = value;
    }

    /**
     * Gets the value of the eligiblePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public DatePeriodAndDurationType getEligiblePeriod() {
        return eligiblePeriod;
    }

    /**
     * Sets the value of the eligiblePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public void setEligiblePeriod(DatePeriodAndDurationType value) {
        this.eligiblePeriod = value;
    }

    /**
     * Gets the value of the eligibleUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEligibleUnits() {
        return eligibleUnits;
    }

    /**
     * Sets the value of the eligibleUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEligibleUnits(Float value) {
        this.eligibleUnits = value;
    }

    /**
     * Gets the value of the productPricing property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricing }
     *     
     */
    public ProductPricing getProductPricing() {
        return productPricing;
    }

    /**
     * Sets the value of the productPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricing }
     *     
     */
    public void setProductPricing(ProductPricing value) {
        this.productPricing = value;
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
        final SpecialPriceType that = ((SpecialPriceType) object);
        {
            String lhsAmountIdentifier;
            lhsAmountIdentifier = this.getAmountIdentifier();
            String rhsAmountIdentifier;
            rhsAmountIdentifier = that.getAmountIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amountIdentifier", lhsAmountIdentifier), LocatorUtils.property(thatLocator, "amountIdentifier", rhsAmountIdentifier), lhsAmountIdentifier, rhsAmountIdentifier, (this.amountIdentifier!= null), (that.amountIdentifier!= null))) {
                return false;
            }
        }
        {
            DatePeriodAndDurationType lhsEligiblePeriod;
            lhsEligiblePeriod = this.getEligiblePeriod();
            DatePeriodAndDurationType rhsEligiblePeriod;
            rhsEligiblePeriod = that.getEligiblePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eligiblePeriod", lhsEligiblePeriod), LocatorUtils.property(thatLocator, "eligiblePeriod", rhsEligiblePeriod), lhsEligiblePeriod, rhsEligiblePeriod, (this.eligiblePeriod!= null), (that.eligiblePeriod!= null))) {
                return false;
            }
        }
        {
            Float lhsEligibleUnits;
            lhsEligibleUnits = this.getEligibleUnits();
            Float rhsEligibleUnits;
            rhsEligibleUnits = that.getEligibleUnits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eligibleUnits", lhsEligibleUnits), LocatorUtils.property(thatLocator, "eligibleUnits", rhsEligibleUnits), lhsEligibleUnits, rhsEligibleUnits, (this.eligibleUnits!= null), (that.eligibleUnits!= null))) {
                return false;
            }
        }
        {
            ProductPricing lhsProductPricing;
            lhsProductPricing = this.getProductPricing();
            ProductPricing rhsProductPricing;
            rhsProductPricing = that.getProductPricing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productPricing", lhsProductPricing), LocatorUtils.property(thatLocator, "productPricing", rhsProductPricing), lhsProductPricing, rhsProductPricing, (this.productPricing!= null), (that.productPricing!= null))) {
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
            String theAmountIdentifier;
            theAmountIdentifier = this.getAmountIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amountIdentifier", theAmountIdentifier), currentHashCode, theAmountIdentifier, (this.amountIdentifier!= null));
        }
        {
            DatePeriodAndDurationType theEligiblePeriod;
            theEligiblePeriod = this.getEligiblePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eligiblePeriod", theEligiblePeriod), currentHashCode, theEligiblePeriod, (this.eligiblePeriod!= null));
        }
        {
            Float theEligibleUnits;
            theEligibleUnits = this.getEligibleUnits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eligibleUnits", theEligibleUnits), currentHashCode, theEligibleUnits, (this.eligibleUnits!= null));
        }
        {
            ProductPricing theProductPricing;
            theProductPricing = this.getProductPricing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productPricing", theProductPricing), currentHashCode, theProductPricing, (this.productPricing!= null));
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
            String theAmountIdentifier;
            theAmountIdentifier = this.getAmountIdentifier();
            strategy.appendField(locator, this, "amountIdentifier", buffer, theAmountIdentifier, (this.amountIdentifier!= null));
        }
        {
            DatePeriodAndDurationType theEligiblePeriod;
            theEligiblePeriod = this.getEligiblePeriod();
            strategy.appendField(locator, this, "eligiblePeriod", buffer, theEligiblePeriod, (this.eligiblePeriod!= null));
        }
        {
            Float theEligibleUnits;
            theEligibleUnits = this.getEligibleUnits();
            strategy.appendField(locator, this, "eligibleUnits", buffer, theEligibleUnits, (this.eligibleUnits!= null));
        }
        {
            ProductPricing theProductPricing;
            theProductPricing = this.getProductPricing();
            strategy.appendField(locator, this, "productPricing", buffer, theProductPricing, (this.productPricing!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
