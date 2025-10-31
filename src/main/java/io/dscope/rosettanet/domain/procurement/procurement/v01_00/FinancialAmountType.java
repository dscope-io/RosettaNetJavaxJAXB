
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.codelist.invoicechargetype.v01_00.InvoiceChargeType;
import io.dscope.rosettanet.domain.procurement.codelist.monetaryamounttype.v01_00.MonetaryAmountType;
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
 * <p>Java class for FinancialAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialAmountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0}FinancialAmountType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:InvoiceChargeType:xsd:codelist:1.0}InvoiceChargeType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:MonetaryAmountType:xsd:codelist:1.0}MonetaryAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAmountType", propOrder = {
    "invoiceChargeType",
    "monetaryAmountType"
})
public class FinancialAmountType
    extends io.dscope.rosettanet.universal.monetaryexpression.v01_00.FinancialAmountType
    implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "InvoiceChargeType", namespace = "urn:rosettanet:specification:domain:Procurement:InvoiceChargeType:xsd:codelist:1.0", type = InvoiceChargeType.class, required = false)
    protected InvoiceChargeType invoiceChargeType;
    @XmlElementRef(name = "MonetaryAmountType", namespace = "urn:rosettanet:specification:domain:Procurement:MonetaryAmountType:xsd:codelist:1.0", type = MonetaryAmountType.class, required = false)
    protected MonetaryAmountType monetaryAmountType;

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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FinancialAmountType that = ((FinancialAmountType) object);
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
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
        super.appendFields(locator, buffer, strategy);
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
        return buffer;
    }

}
