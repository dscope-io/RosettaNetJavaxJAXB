
package io.dscope.rosettanet.universal.monetaryexpression.v01_06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.codelist.taxtype.v01_02.TaxType;
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
 * <p>Java class for TaxAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxAmountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmount"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}TaxJurisdiction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:TaxType:xsd:codelist:01.02}TaxType"/&gt;
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
@XmlType(name = "TaxAmountType", propOrder = {
    "financialAmount",
    "taxJurisdiction",
    "taxType"
})
public class TaxAmountType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "FinancialAmount", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06", type = FinancialAmount.class)
    protected FinancialAmount financialAmount;
    @XmlElementRef(name = "TaxJurisdiction", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06", type = TaxJurisdiction.class, required = false)
    protected TaxJurisdiction taxJurisdiction;
    @XmlElementRef(name = "TaxType", namespace = "urn:rosettanet:specification:universal:TaxType:xsd:codelist:01.02", type = TaxType.class)
    protected TaxType taxType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the financialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmount }
     *     
     */
    public FinancialAmount getFinancialAmount() {
        return financialAmount;
    }

    /**
     * Sets the value of the financialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmount }
     *     
     */
    public void setFinancialAmount(FinancialAmount value) {
        this.financialAmount = value;
    }

    /**
     * Gets the value of the taxJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link TaxJurisdiction }
     *     
     */
    public TaxJurisdiction getTaxJurisdiction() {
        return taxJurisdiction;
    }

    /**
     * Sets the value of the taxJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdiction }
     *     
     */
    public void setTaxJurisdiction(TaxJurisdiction value) {
        this.taxJurisdiction = value;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setTaxType(TaxType value) {
        this.taxType = value;
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
        final TaxAmountType that = ((TaxAmountType) object);
        {
            FinancialAmount lhsFinancialAmount;
            lhsFinancialAmount = this.getFinancialAmount();
            FinancialAmount rhsFinancialAmount;
            rhsFinancialAmount = that.getFinancialAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financialAmount", lhsFinancialAmount), LocatorUtils.property(thatLocator, "financialAmount", rhsFinancialAmount), lhsFinancialAmount, rhsFinancialAmount, (this.financialAmount!= null), (that.financialAmount!= null))) {
                return false;
            }
        }
        {
            TaxJurisdiction lhsTaxJurisdiction;
            lhsTaxJurisdiction = this.getTaxJurisdiction();
            TaxJurisdiction rhsTaxJurisdiction;
            rhsTaxJurisdiction = that.getTaxJurisdiction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxJurisdiction", lhsTaxJurisdiction), LocatorUtils.property(thatLocator, "taxJurisdiction", rhsTaxJurisdiction), lhsTaxJurisdiction, rhsTaxJurisdiction, (this.taxJurisdiction!= null), (that.taxJurisdiction!= null))) {
                return false;
            }
        }
        {
            TaxType lhsTaxType;
            lhsTaxType = this.getTaxType();
            TaxType rhsTaxType;
            rhsTaxType = that.getTaxType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxType", lhsTaxType), LocatorUtils.property(thatLocator, "taxType", rhsTaxType), lhsTaxType, rhsTaxType, (this.taxType!= null), (that.taxType!= null))) {
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
            FinancialAmount theFinancialAmount;
            theFinancialAmount = this.getFinancialAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financialAmount", theFinancialAmount), currentHashCode, theFinancialAmount, (this.financialAmount!= null));
        }
        {
            TaxJurisdiction theTaxJurisdiction;
            theTaxJurisdiction = this.getTaxJurisdiction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxJurisdiction", theTaxJurisdiction), currentHashCode, theTaxJurisdiction, (this.taxJurisdiction!= null));
        }
        {
            TaxType theTaxType;
            theTaxType = this.getTaxType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxType", theTaxType), currentHashCode, theTaxType, (this.taxType!= null));
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
            FinancialAmount theFinancialAmount;
            theFinancialAmount = this.getFinancialAmount();
            strategy.appendField(locator, this, "financialAmount", buffer, theFinancialAmount, (this.financialAmount!= null));
        }
        {
            TaxJurisdiction theTaxJurisdiction;
            theTaxJurisdiction = this.getTaxJurisdiction();
            strategy.appendField(locator, this, "taxJurisdiction", buffer, theTaxJurisdiction, (this.taxJurisdiction!= null));
        }
        {
            TaxType theTaxType;
            theTaxType = this.getTaxType();
            strategy.appendField(locator, this, "taxType", buffer, theTaxType, (this.taxType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
