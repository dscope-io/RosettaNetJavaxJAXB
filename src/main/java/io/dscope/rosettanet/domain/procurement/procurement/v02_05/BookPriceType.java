
package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.bookpricequalifier.v01_04.BookPriceQualifier;
import io.dscope.rosettanet.universal.monetaryexpression.v01_02.FinancialAmount;
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
 * <p>Java class for BookPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:BookPriceQualifier:xsd:codelist:01.04}BookPriceQualifier"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02}FinancialAmount"/&gt;
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
@XmlType(name = "BookPriceType", propOrder = {
    "bookPriceQualifier",
    "financialAmount"
})
public class BookPriceType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BookPriceQualifier", namespace = "urn:rosettanet:specification:domain:Procurement:BookPriceQualifier:xsd:codelist:01.04", type = BookPriceQualifier.class)
    protected BookPriceQualifier bookPriceQualifier;
    @XmlElementRef(name = "FinancialAmount", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02", type = FinancialAmount.class)
    protected FinancialAmount financialAmount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the bookPriceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link BookPriceQualifier }
     *     
     */
    public BookPriceQualifier getBookPriceQualifier() {
        return bookPriceQualifier;
    }

    /**
     * Sets the value of the bookPriceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookPriceQualifier }
     *     
     */
    public void setBookPriceQualifier(BookPriceQualifier value) {
        this.bookPriceQualifier = value;
    }

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
        final BookPriceType that = ((BookPriceType) object);
        {
            BookPriceQualifier lhsBookPriceQualifier;
            lhsBookPriceQualifier = this.getBookPriceQualifier();
            BookPriceQualifier rhsBookPriceQualifier;
            rhsBookPriceQualifier = that.getBookPriceQualifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bookPriceQualifier", lhsBookPriceQualifier), LocatorUtils.property(thatLocator, "bookPriceQualifier", rhsBookPriceQualifier), lhsBookPriceQualifier, rhsBookPriceQualifier, (this.bookPriceQualifier!= null), (that.bookPriceQualifier!= null))) {
                return false;
            }
        }
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
            BookPriceQualifier theBookPriceQualifier;
            theBookPriceQualifier = this.getBookPriceQualifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bookPriceQualifier", theBookPriceQualifier), currentHashCode, theBookPriceQualifier, (this.bookPriceQualifier!= null));
        }
        {
            FinancialAmount theFinancialAmount;
            theFinancialAmount = this.getFinancialAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financialAmount", theFinancialAmount), currentHashCode, theFinancialAmount, (this.financialAmount!= null));
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
            BookPriceQualifier theBookPriceQualifier;
            theBookPriceQualifier = this.getBookPriceQualifier();
            strategy.appendField(locator, this, "bookPriceQualifier", buffer, theBookPriceQualifier, (this.bookPriceQualifier!= null));
        }
        {
            FinancialAmount theFinancialAmount;
            theFinancialAmount = this.getFinancialAmount();
            strategy.appendField(locator, this, "financialAmount", buffer, theFinancialAmount, (this.financialAmount!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
