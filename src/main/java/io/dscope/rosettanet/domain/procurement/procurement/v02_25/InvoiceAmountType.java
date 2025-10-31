
package io.dscope.rosettanet.domain.procurement.procurement.v02_25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.codelist.invoicechargetype.v01_02.InvoiceChargeType;
import io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_01.MonetaryAmountType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmount;
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
 * <p>Java class for InvoiceAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceAmountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmount"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:InvoiceChargeType:xsd:codelist:01.02}InvoiceChargeType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.01}MonetaryAmountType"/&gt;
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
@XmlType(name = "InvoiceAmountType", propOrder = {
    "financialAmount",
    "invoiceChargeType",
    "monetaryAmountType"
})
public class InvoiceAmountType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "FinancialAmount", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06", type = FinancialAmount.class)
    protected FinancialAmount financialAmount;
    @XmlElementRef(name = "InvoiceChargeType", namespace = "urn:rosettanet:specification:domain:Shared:InvoiceChargeType:xsd:codelist:01.02", type = InvoiceChargeType.class)
    protected InvoiceChargeType invoiceChargeType;
    @XmlElementRef(name = "MonetaryAmountType", namespace = "urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.01", type = MonetaryAmountType.class)
    protected MonetaryAmountType monetaryAmountType;
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
     * Gets the value of the invoiceChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceChargeType }
     *     
     */
    public InvoiceChargeType getInvoiceChargeType() {
        return invoiceChargeType;
    }

    /**
     * Sets the value of the invoiceChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceChargeType }
     *     
     */
    public void setInvoiceChargeType(InvoiceChargeType value) {
        this.invoiceChargeType = value;
    }

    /**
     * Gets the value of the monetaryAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getMonetaryAmountType() {
        return monetaryAmountType;
    }

    /**
     * Sets the value of the monetaryAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setMonetaryAmountType(MonetaryAmountType value) {
        this.monetaryAmountType = value;
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
        final InvoiceAmountType that = ((InvoiceAmountType) object);
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
            InvoiceChargeType lhsInvoiceChargeType;
            lhsInvoiceChargeType = this.getInvoiceChargeType();
            InvoiceChargeType rhsInvoiceChargeType;
            rhsInvoiceChargeType = that.getInvoiceChargeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoiceChargeType", lhsInvoiceChargeType), LocatorUtils.property(thatLocator, "invoiceChargeType", rhsInvoiceChargeType), lhsInvoiceChargeType, rhsInvoiceChargeType, (this.invoiceChargeType!= null), (that.invoiceChargeType!= null))) {
                return false;
            }
        }
        {
            MonetaryAmountType lhsMonetaryAmountType;
            lhsMonetaryAmountType = this.getMonetaryAmountType();
            MonetaryAmountType rhsMonetaryAmountType;
            rhsMonetaryAmountType = that.getMonetaryAmountType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monetaryAmountType", lhsMonetaryAmountType), LocatorUtils.property(thatLocator, "monetaryAmountType", rhsMonetaryAmountType), lhsMonetaryAmountType, rhsMonetaryAmountType, (this.monetaryAmountType!= null), (that.monetaryAmountType!= null))) {
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
            InvoiceChargeType theInvoiceChargeType;
            theInvoiceChargeType = this.getInvoiceChargeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoiceChargeType", theInvoiceChargeType), currentHashCode, theInvoiceChargeType, (this.invoiceChargeType!= null));
        }
        {
            MonetaryAmountType theMonetaryAmountType;
            theMonetaryAmountType = this.getMonetaryAmountType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monetaryAmountType", theMonetaryAmountType), currentHashCode, theMonetaryAmountType, (this.monetaryAmountType!= null));
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
            InvoiceChargeType theInvoiceChargeType;
            theInvoiceChargeType = this.getInvoiceChargeType();
            strategy.appendField(locator, this, "invoiceChargeType", buffer, theInvoiceChargeType, (this.invoiceChargeType!= null));
        }
        {
            MonetaryAmountType theMonetaryAmountType;
            theMonetaryAmountType = this.getMonetaryAmountType();
            strategy.appendField(locator, this, "monetaryAmountType", buffer, theMonetaryAmountType, (this.monetaryAmountType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
