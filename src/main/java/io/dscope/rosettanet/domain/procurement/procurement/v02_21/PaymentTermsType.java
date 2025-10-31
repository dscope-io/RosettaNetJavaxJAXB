
package io.dscope.rosettanet.domain.procurement.procurement.v02_21;

import java.math.BigDecimal;
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
import io.dscope.rosettanet.domain.procurement.codelist.paymentcondition.v01_03.PaymentCondition;
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
 * <p>Java class for PaymentTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.21}Discounts" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.21}NetTerms"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PaymentCondition:xsd:codelist:01.03}PaymentCondition" minOccurs="0"/&gt;
 *         &lt;element name="PercentDue" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "PaymentTermsType", propOrder = {
    "discounts",
    "netTerms",
    "paymentCondition",
    "percentDue"
})
public class PaymentTermsType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "Discounts", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.21", type = Discounts.class, required = false)
    protected List<Discounts> discounts;
    @XmlElementRef(name = "NetTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.21", type = NetTerms.class)
    protected NetTerms netTerms;
    @XmlElementRef(name = "PaymentCondition", namespace = "urn:rosettanet:specification:domain:Procurement:PaymentCondition:xsd:codelist:01.03", type = PaymentCondition.class, required = false)
    protected PaymentCondition paymentCondition;
    @XmlElement(name = "PercentDue")
    protected BigDecimal percentDue;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the discounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discounts }
     * 
     * 
     */
    public List<Discounts> getDiscounts() {
        if (discounts == null) {
            discounts = new ArrayList<Discounts>();
        }
        return this.discounts;
    }

    /**
     * Gets the value of the netTerms property.
     * 
     * @return
     *     possible object is
     *     {@link NetTerms }
     *     
     */
    public NetTerms getNetTerms() {
        return netTerms;
    }

    /**
     * Sets the value of the netTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetTerms }
     *     
     */
    public void setNetTerms(NetTerms value) {
        this.netTerms = value;
    }

    /**
     * Gets the value of the paymentCondition property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCondition }
     *     
     */
    public PaymentCondition getPaymentCondition() {
        return paymentCondition;
    }

    /**
     * Sets the value of the paymentCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCondition }
     *     
     */
    public void setPaymentCondition(PaymentCondition value) {
        this.paymentCondition = value;
    }

    /**
     * Gets the value of the percentDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentDue() {
        return percentDue;
    }

    /**
     * Sets the value of the percentDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentDue(BigDecimal value) {
        this.percentDue = value;
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
        final PaymentTermsType that = ((PaymentTermsType) object);
        {
            List<Discounts> lhsDiscounts;
            lhsDiscounts = (((this.discounts!= null)&&(!this.discounts.isEmpty()))?this.getDiscounts():null);
            List<Discounts> rhsDiscounts;
            rhsDiscounts = (((that.discounts!= null)&&(!that.discounts.isEmpty()))?that.getDiscounts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discounts", lhsDiscounts), LocatorUtils.property(thatLocator, "discounts", rhsDiscounts), lhsDiscounts, rhsDiscounts, ((this.discounts!= null)&&(!this.discounts.isEmpty())), ((that.discounts!= null)&&(!that.discounts.isEmpty())))) {
                return false;
            }
        }
        {
            NetTerms lhsNetTerms;
            lhsNetTerms = this.getNetTerms();
            NetTerms rhsNetTerms;
            rhsNetTerms = that.getNetTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netTerms", lhsNetTerms), LocatorUtils.property(thatLocator, "netTerms", rhsNetTerms), lhsNetTerms, rhsNetTerms, (this.netTerms!= null), (that.netTerms!= null))) {
                return false;
            }
        }
        {
            PaymentCondition lhsPaymentCondition;
            lhsPaymentCondition = this.getPaymentCondition();
            PaymentCondition rhsPaymentCondition;
            rhsPaymentCondition = that.getPaymentCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentCondition", lhsPaymentCondition), LocatorUtils.property(thatLocator, "paymentCondition", rhsPaymentCondition), lhsPaymentCondition, rhsPaymentCondition, (this.paymentCondition!= null), (that.paymentCondition!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPercentDue;
            lhsPercentDue = this.getPercentDue();
            BigDecimal rhsPercentDue;
            rhsPercentDue = that.getPercentDue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentDue", lhsPercentDue), LocatorUtils.property(thatLocator, "percentDue", rhsPercentDue), lhsPercentDue, rhsPercentDue, (this.percentDue!= null), (that.percentDue!= null))) {
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
            List<Discounts> theDiscounts;
            theDiscounts = (((this.discounts!= null)&&(!this.discounts.isEmpty()))?this.getDiscounts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discounts", theDiscounts), currentHashCode, theDiscounts, ((this.discounts!= null)&&(!this.discounts.isEmpty())));
        }
        {
            NetTerms theNetTerms;
            theNetTerms = this.getNetTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "netTerms", theNetTerms), currentHashCode, theNetTerms, (this.netTerms!= null));
        }
        {
            PaymentCondition thePaymentCondition;
            thePaymentCondition = this.getPaymentCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentCondition", thePaymentCondition), currentHashCode, thePaymentCondition, (this.paymentCondition!= null));
        }
        {
            BigDecimal thePercentDue;
            thePercentDue = this.getPercentDue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentDue", thePercentDue), currentHashCode, thePercentDue, (this.percentDue!= null));
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
            List<Discounts> theDiscounts;
            theDiscounts = (((this.discounts!= null)&&(!this.discounts.isEmpty()))?this.getDiscounts():null);
            strategy.appendField(locator, this, "discounts", buffer, theDiscounts, ((this.discounts!= null)&&(!this.discounts.isEmpty())));
        }
        {
            NetTerms theNetTerms;
            theNetTerms = this.getNetTerms();
            strategy.appendField(locator, this, "netTerms", buffer, theNetTerms, (this.netTerms!= null));
        }
        {
            PaymentCondition thePaymentCondition;
            thePaymentCondition = this.getPaymentCondition();
            strategy.appendField(locator, this, "paymentCondition", buffer, thePaymentCondition, (this.paymentCondition!= null));
        }
        {
            BigDecimal thePercentDue;
            thePercentDue = this.getPercentDue();
            strategy.appendField(locator, this, "percentDue", buffer, thePercentDue, (this.percentDue!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
