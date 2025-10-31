
package io.dscope.rosettanet.domain.procurement.procurement.v02_29;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for PartPaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartPaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompleteOrderLineQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PartPaymentPercentage" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType"/&gt;
 *         &lt;element name="PartPaymentQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
@XmlType(name = "PartPaymentType", propOrder = {
    "completeOrderLineQuantity",
    "partPaymentPercentage",
    "partPaymentQuantity"
})
public class PartPaymentType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CompleteOrderLineQuantity", required = true)
    protected BigInteger completeOrderLineQuantity;
    @XmlElement(name = "PartPaymentPercentage", required = true)
    protected BigDecimal partPaymentPercentage;
    @XmlElement(name = "PartPaymentQuantity", required = true)
    protected BigInteger partPaymentQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the completeOrderLineQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompleteOrderLineQuantity() {
        return completeOrderLineQuantity;
    }

    /**
     * Sets the value of the completeOrderLineQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompleteOrderLineQuantity(BigInteger value) {
        this.completeOrderLineQuantity = value;
    }

    /**
     * Gets the value of the partPaymentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartPaymentPercentage() {
        return partPaymentPercentage;
    }

    /**
     * Sets the value of the partPaymentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartPaymentPercentage(BigDecimal value) {
        this.partPaymentPercentage = value;
    }

    /**
     * Gets the value of the partPaymentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartPaymentQuantity() {
        return partPaymentQuantity;
    }

    /**
     * Sets the value of the partPaymentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartPaymentQuantity(BigInteger value) {
        this.partPaymentQuantity = value;
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
        final PartPaymentType that = ((PartPaymentType) object);
        {
            BigInteger lhsCompleteOrderLineQuantity;
            lhsCompleteOrderLineQuantity = this.getCompleteOrderLineQuantity();
            BigInteger rhsCompleteOrderLineQuantity;
            rhsCompleteOrderLineQuantity = that.getCompleteOrderLineQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "completeOrderLineQuantity", lhsCompleteOrderLineQuantity), LocatorUtils.property(thatLocator, "completeOrderLineQuantity", rhsCompleteOrderLineQuantity), lhsCompleteOrderLineQuantity, rhsCompleteOrderLineQuantity, (this.completeOrderLineQuantity!= null), (that.completeOrderLineQuantity!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPartPaymentPercentage;
            lhsPartPaymentPercentage = this.getPartPaymentPercentage();
            BigDecimal rhsPartPaymentPercentage;
            rhsPartPaymentPercentage = that.getPartPaymentPercentage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partPaymentPercentage", lhsPartPaymentPercentage), LocatorUtils.property(thatLocator, "partPaymentPercentage", rhsPartPaymentPercentage), lhsPartPaymentPercentage, rhsPartPaymentPercentage, (this.partPaymentPercentage!= null), (that.partPaymentPercentage!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsPartPaymentQuantity;
            lhsPartPaymentQuantity = this.getPartPaymentQuantity();
            BigInteger rhsPartPaymentQuantity;
            rhsPartPaymentQuantity = that.getPartPaymentQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partPaymentQuantity", lhsPartPaymentQuantity), LocatorUtils.property(thatLocator, "partPaymentQuantity", rhsPartPaymentQuantity), lhsPartPaymentQuantity, rhsPartPaymentQuantity, (this.partPaymentQuantity!= null), (that.partPaymentQuantity!= null))) {
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
            BigInteger theCompleteOrderLineQuantity;
            theCompleteOrderLineQuantity = this.getCompleteOrderLineQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "completeOrderLineQuantity", theCompleteOrderLineQuantity), currentHashCode, theCompleteOrderLineQuantity, (this.completeOrderLineQuantity!= null));
        }
        {
            BigDecimal thePartPaymentPercentage;
            thePartPaymentPercentage = this.getPartPaymentPercentage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partPaymentPercentage", thePartPaymentPercentage), currentHashCode, thePartPaymentPercentage, (this.partPaymentPercentage!= null));
        }
        {
            BigInteger thePartPaymentQuantity;
            thePartPaymentQuantity = this.getPartPaymentQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partPaymentQuantity", thePartPaymentQuantity), currentHashCode, thePartPaymentQuantity, (this.partPaymentQuantity!= null));
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
            BigInteger theCompleteOrderLineQuantity;
            theCompleteOrderLineQuantity = this.getCompleteOrderLineQuantity();
            strategy.appendField(locator, this, "completeOrderLineQuantity", buffer, theCompleteOrderLineQuantity, (this.completeOrderLineQuantity!= null));
        }
        {
            BigDecimal thePartPaymentPercentage;
            thePartPaymentPercentage = this.getPartPaymentPercentage();
            strategy.appendField(locator, this, "partPaymentPercentage", buffer, thePartPaymentPercentage, (this.partPaymentPercentage!= null));
        }
        {
            BigInteger thePartPaymentQuantity;
            thePartPaymentQuantity = this.getPartPaymentQuantity();
            strategy.appendField(locator, this, "partPaymentQuantity", buffer, thePartPaymentQuantity, (this.partPaymentQuantity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
