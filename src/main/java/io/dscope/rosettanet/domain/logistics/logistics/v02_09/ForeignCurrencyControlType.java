
package io.dscope.rosettanet.domain.logistics.logistics.v02_09;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.codelist.paymentmethod.v01_02.PaymentMethodType;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReferenceType;
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
 * <p>Java class for ForeignCurrencyControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeignCurrencyControlType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApprovalReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType"/&gt;
 *         &lt;element name="PaymentMethod" type="{urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.02}PaymentMethodType"/&gt;
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
@XmlType(name = "ForeignCurrencyControlType", propOrder = {
    "approvalReference",
    "paymentMethod"
})
public class ForeignCurrencyControlType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ApprovalReference", required = true)
    protected BusinessDocumentReferenceType approvalReference;
    @XmlElement(name = "PaymentMethod", required = true)
    protected PaymentMethodType paymentMethod;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the approvalReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getApprovalReference() {
        return approvalReference;
    }

    /**
     * Sets the value of the approvalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setApprovalReference(BusinessDocumentReferenceType value) {
        this.approvalReference = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentMethod(PaymentMethodType value) {
        this.paymentMethod = value;
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
        final ForeignCurrencyControlType that = ((ForeignCurrencyControlType) object);
        {
            BusinessDocumentReferenceType lhsApprovalReference;
            lhsApprovalReference = this.getApprovalReference();
            BusinessDocumentReferenceType rhsApprovalReference;
            rhsApprovalReference = that.getApprovalReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approvalReference", lhsApprovalReference), LocatorUtils.property(thatLocator, "approvalReference", rhsApprovalReference), lhsApprovalReference, rhsApprovalReference, (this.approvalReference!= null), (that.approvalReference!= null))) {
                return false;
            }
        }
        {
            PaymentMethodType lhsPaymentMethod;
            lhsPaymentMethod = this.getPaymentMethod();
            PaymentMethodType rhsPaymentMethod;
            rhsPaymentMethod = that.getPaymentMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentMethod", lhsPaymentMethod), LocatorUtils.property(thatLocator, "paymentMethod", rhsPaymentMethod), lhsPaymentMethod, rhsPaymentMethod, (this.paymentMethod!= null), (that.paymentMethod!= null))) {
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
            BusinessDocumentReferenceType theApprovalReference;
            theApprovalReference = this.getApprovalReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approvalReference", theApprovalReference), currentHashCode, theApprovalReference, (this.approvalReference!= null));
        }
        {
            PaymentMethodType thePaymentMethod;
            thePaymentMethod = this.getPaymentMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentMethod", thePaymentMethod), currentHashCode, thePaymentMethod, (this.paymentMethod!= null));
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
            BusinessDocumentReferenceType theApprovalReference;
            theApprovalReference = this.getApprovalReference();
            strategy.appendField(locator, this, "approvalReference", buffer, theApprovalReference, (this.approvalReference!= null));
        }
        {
            PaymentMethodType thePaymentMethod;
            thePaymentMethod = this.getPaymentMethod();
            strategy.appendField(locator, this, "paymentMethod", buffer, thePaymentMethod, (this.paymentMethod!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
