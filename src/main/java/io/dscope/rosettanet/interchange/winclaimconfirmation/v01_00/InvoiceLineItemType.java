
package io.dscope.rosettanet.interchange.winclaimconfirmation.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DebitAuthorizationNumber;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductQuantity;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;
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
 * <p>Java class for InvoiceLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DebitAuthorizationNumber" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="LineItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantity" minOccurs="0"/&gt;
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
@XmlType(name = "InvoiceLineItemType", propOrder = {
    "debitAuthorizationNumber",
    "invoiceAmount",
    "lineItemNumber",
    "productQuantity",
    "unitOfMeasure"
})
public class InvoiceLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DebitAuthorizationNumber", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DebitAuthorizationNumber.class, required = false)
    protected DebitAuthorizationNumber debitAuthorizationNumber;
    @XmlElement(name = "InvoiceAmount")
    protected FinancialAmountType invoiceAmount;
    @XmlElement(name = "LineItemNumber", required = true)
    protected String lineItemNumber;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.17", type = ProductQuantity.class, required = false)
    protected ProductQuantity productQuantity;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class, required = false)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the debitAuthorizationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorizationNumber }
     *     
     */
    public DebitAuthorizationNumber getDebitAuthorizationNumber() {
        return debitAuthorizationNumber;
    }

    /**
     * Sets the value of the debitAuthorizationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorizationNumber }
     *     
     */
    public void setDebitAuthorizationNumber(DebitAuthorizationNumber value) {
        this.debitAuthorizationNumber = value;
    }

    /**
     * Gets the value of the invoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Sets the value of the invoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setInvoiceAmount(FinancialAmountType value) {
        this.invoiceAmount = value;
    }

    /**
     * Gets the value of the lineItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemNumber(String value) {
        this.lineItemNumber = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
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
        final InvoiceLineItemType that = ((InvoiceLineItemType) object);
        {
            DebitAuthorizationNumber lhsDebitAuthorizationNumber;
            lhsDebitAuthorizationNumber = this.getDebitAuthorizationNumber();
            DebitAuthorizationNumber rhsDebitAuthorizationNumber;
            rhsDebitAuthorizationNumber = that.getDebitAuthorizationNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debitAuthorizationNumber", lhsDebitAuthorizationNumber), LocatorUtils.property(thatLocator, "debitAuthorizationNumber", rhsDebitAuthorizationNumber), lhsDebitAuthorizationNumber, rhsDebitAuthorizationNumber, (this.debitAuthorizationNumber!= null), (that.debitAuthorizationNumber!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsInvoiceAmount;
            lhsInvoiceAmount = this.getInvoiceAmount();
            FinancialAmountType rhsInvoiceAmount;
            rhsInvoiceAmount = that.getInvoiceAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoiceAmount", lhsInvoiceAmount), LocatorUtils.property(thatLocator, "invoiceAmount", rhsInvoiceAmount), lhsInvoiceAmount, rhsInvoiceAmount, (this.invoiceAmount!= null), (that.invoiceAmount!= null))) {
                return false;
            }
        }
        {
            String lhsLineItemNumber;
            lhsLineItemNumber = this.getLineItemNumber();
            String rhsLineItemNumber;
            rhsLineItemNumber = that.getLineItemNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineItemNumber", lhsLineItemNumber), LocatorUtils.property(thatLocator, "lineItemNumber", rhsLineItemNumber), lhsLineItemNumber, rhsLineItemNumber, (this.lineItemNumber!= null), (that.lineItemNumber!= null))) {
                return false;
            }
        }
        {
            ProductQuantity lhsProductQuantity;
            lhsProductQuantity = this.getProductQuantity();
            ProductQuantity rhsProductQuantity;
            rhsProductQuantity = that.getProductQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productQuantity", lhsProductQuantity), LocatorUtils.property(thatLocator, "productQuantity", rhsProductQuantity), lhsProductQuantity, rhsProductQuantity, (this.productQuantity!= null), (that.productQuantity!= null))) {
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
            DebitAuthorizationNumber theDebitAuthorizationNumber;
            theDebitAuthorizationNumber = this.getDebitAuthorizationNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debitAuthorizationNumber", theDebitAuthorizationNumber), currentHashCode, theDebitAuthorizationNumber, (this.debitAuthorizationNumber!= null));
        }
        {
            FinancialAmountType theInvoiceAmount;
            theInvoiceAmount = this.getInvoiceAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoiceAmount", theInvoiceAmount), currentHashCode, theInvoiceAmount, (this.invoiceAmount!= null));
        }
        {
            String theLineItemNumber;
            theLineItemNumber = this.getLineItemNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineItemNumber", theLineItemNumber), currentHashCode, theLineItemNumber, (this.lineItemNumber!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantity", theProductQuantity), currentHashCode, theProductQuantity, (this.productQuantity!= null));
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
            DebitAuthorizationNumber theDebitAuthorizationNumber;
            theDebitAuthorizationNumber = this.getDebitAuthorizationNumber();
            strategy.appendField(locator, this, "debitAuthorizationNumber", buffer, theDebitAuthorizationNumber, (this.debitAuthorizationNumber!= null));
        }
        {
            FinancialAmountType theInvoiceAmount;
            theInvoiceAmount = this.getInvoiceAmount();
            strategy.appendField(locator, this, "invoiceAmount", buffer, theInvoiceAmount, (this.invoiceAmount!= null));
        }
        {
            String theLineItemNumber;
            theLineItemNumber = this.getLineItemNumber();
            strategy.appendField(locator, this, "lineItemNumber", buffer, theLineItemNumber, (this.lineItemNumber!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            strategy.appendField(locator, this, "productQuantity", buffer, theProductQuantity, (this.productQuantity!= null));
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
