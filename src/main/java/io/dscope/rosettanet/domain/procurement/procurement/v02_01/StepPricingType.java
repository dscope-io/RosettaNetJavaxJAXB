
package io.dscope.rosettanet.domain.procurement.procurement.v02_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_00.RNPricingTypeCode;
import io.dscope.rosettanet.domain.shared.shared.v01_01.MonetaryAmount;
import io.dscope.rosettanet.universal.dates.v01_02.DatePeriod;
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
 * <p>Java class for StepPricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StepPricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.02}DatePeriod"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.01}MonetaryAmount"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01}ProductQuantityRange"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.00}RN_PricingTypeCode" minOccurs="0"/&gt;
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
@XmlType(name = "StepPricingType", propOrder = {
    "datePeriod",
    "monetaryAmount",
    "productQuantityRange",
    "rnPricingTypeCode"
})
public class StepPricingType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DatePeriod", namespace = "urn:rosettanet:specification:universal:Dates:xsd:schema:01.02", type = DatePeriod.class)
    protected DatePeriod datePeriod;
    @XmlElementRef(name = "MonetaryAmount", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.01", type = MonetaryAmount.class)
    protected MonetaryAmount monetaryAmount;
    @XmlElementRef(name = "ProductQuantityRange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01", type = ProductQuantityRange.class)
    protected ProductQuantityRange productQuantityRange;
    @XmlElementRef(name = "RN_PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.00", type = RNPricingTypeCode.class, required = false)
    protected RNPricingTypeCode rnPricingTypeCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the datePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod }
     *     
     */
    public DatePeriod getDatePeriod() {
        return datePeriod;
    }

    /**
     * Sets the value of the datePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod }
     *     
     */
    public void setDatePeriod(DatePeriod value) {
        this.datePeriod = value;
    }

    /**
     * Gets the value of the monetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getMonetaryAmount() {
        return monetaryAmount;
    }

    /**
     * Sets the value of the monetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setMonetaryAmount(MonetaryAmount value) {
        this.monetaryAmount = value;
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
     * Gets the value of the rnPricingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RNPricingTypeCode }
     *     
     */
    public RNPricingTypeCode getRNPricingTypeCode() {
        return rnPricingTypeCode;
    }

    /**
     * Sets the value of the rnPricingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RNPricingTypeCode }
     *     
     */
    public void setRNPricingTypeCode(RNPricingTypeCode value) {
        this.rnPricingTypeCode = value;
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
        final StepPricingType that = ((StepPricingType) object);
        {
            DatePeriod lhsDatePeriod;
            lhsDatePeriod = this.getDatePeriod();
            DatePeriod rhsDatePeriod;
            rhsDatePeriod = that.getDatePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datePeriod", lhsDatePeriod), LocatorUtils.property(thatLocator, "datePeriod", rhsDatePeriod), lhsDatePeriod, rhsDatePeriod, (this.datePeriod!= null), (that.datePeriod!= null))) {
                return false;
            }
        }
        {
            MonetaryAmount lhsMonetaryAmount;
            lhsMonetaryAmount = this.getMonetaryAmount();
            MonetaryAmount rhsMonetaryAmount;
            rhsMonetaryAmount = that.getMonetaryAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monetaryAmount", lhsMonetaryAmount), LocatorUtils.property(thatLocator, "monetaryAmount", rhsMonetaryAmount), lhsMonetaryAmount, rhsMonetaryAmount, (this.monetaryAmount!= null), (that.monetaryAmount!= null))) {
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
            RNPricingTypeCode lhsRNPricingTypeCode;
            lhsRNPricingTypeCode = this.getRNPricingTypeCode();
            RNPricingTypeCode rhsRNPricingTypeCode;
            rhsRNPricingTypeCode = that.getRNPricingTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rnPricingTypeCode", lhsRNPricingTypeCode), LocatorUtils.property(thatLocator, "rnPricingTypeCode", rhsRNPricingTypeCode), lhsRNPricingTypeCode, rhsRNPricingTypeCode, (this.rnPricingTypeCode!= null), (that.rnPricingTypeCode!= null))) {
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
            DatePeriod theDatePeriod;
            theDatePeriod = this.getDatePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datePeriod", theDatePeriod), currentHashCode, theDatePeriod, (this.datePeriod!= null));
        }
        {
            MonetaryAmount theMonetaryAmount;
            theMonetaryAmount = this.getMonetaryAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monetaryAmount", theMonetaryAmount), currentHashCode, theMonetaryAmount, (this.monetaryAmount!= null));
        }
        {
            ProductQuantityRange theProductQuantityRange;
            theProductQuantityRange = this.getProductQuantityRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantityRange", theProductQuantityRange), currentHashCode, theProductQuantityRange, (this.productQuantityRange!= null));
        }
        {
            RNPricingTypeCode theRNPricingTypeCode;
            theRNPricingTypeCode = this.getRNPricingTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rnPricingTypeCode", theRNPricingTypeCode), currentHashCode, theRNPricingTypeCode, (this.rnPricingTypeCode!= null));
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
            DatePeriod theDatePeriod;
            theDatePeriod = this.getDatePeriod();
            strategy.appendField(locator, this, "datePeriod", buffer, theDatePeriod, (this.datePeriod!= null));
        }
        {
            MonetaryAmount theMonetaryAmount;
            theMonetaryAmount = this.getMonetaryAmount();
            strategy.appendField(locator, this, "monetaryAmount", buffer, theMonetaryAmount, (this.monetaryAmount!= null));
        }
        {
            ProductQuantityRange theProductQuantityRange;
            theProductQuantityRange = this.getProductQuantityRange();
            strategy.appendField(locator, this, "productQuantityRange", buffer, theProductQuantityRange, (this.productQuantityRange!= null));
        }
        {
            RNPricingTypeCode theRNPricingTypeCode;
            theRNPricingTypeCode = this.getRNPricingTypeCode();
            strategy.appendField(locator, this, "rnPricingTypeCode", buffer, theRNPricingTypeCode, (this.rnPricingTypeCode!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
