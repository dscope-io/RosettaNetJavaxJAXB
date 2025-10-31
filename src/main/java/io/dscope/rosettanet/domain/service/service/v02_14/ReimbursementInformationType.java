
package io.dscope.rosettanet.domain.service.service.v02_14;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.shared.v01_12.PaymentInformation;
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
 * <p>Java class for ReimbursementInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReimbursementInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsEntitledToReimbursement" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}PaymentInformation"/&gt;
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
@XmlType(name = "ReimbursementInformationType", propOrder = {
    "isEntitledToReimbursement",
    "paymentInformation"
})
public class ReimbursementInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "IsEntitledToReimbursement")
    protected boolean isEntitledToReimbursement;
    @XmlElementRef(name = "PaymentInformation", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.12", type = PaymentInformation.class)
    protected PaymentInformation paymentInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isEntitledToReimbursement property.
     * 
     */
    public boolean isIsEntitledToReimbursement() {
        return isEntitledToReimbursement;
    }

    /**
     * Sets the value of the isEntitledToReimbursement property.
     * 
     */
    public void setIsEntitledToReimbursement(boolean value) {
        this.isEntitledToReimbursement = value;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInformation }
     *     
     */
    public PaymentInformation getPaymentInformation() {
        return paymentInformation;
    }

    /**
     * Sets the value of the paymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInformation }
     *     
     */
    public void setPaymentInformation(PaymentInformation value) {
        this.paymentInformation = value;
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
        final ReimbursementInformationType that = ((ReimbursementInformationType) object);
        {
            boolean lhsIsEntitledToReimbursement;
            lhsIsEntitledToReimbursement = this.isIsEntitledToReimbursement();
            boolean rhsIsEntitledToReimbursement;
            rhsIsEntitledToReimbursement = that.isIsEntitledToReimbursement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isEntitledToReimbursement", lhsIsEntitledToReimbursement), LocatorUtils.property(thatLocator, "isEntitledToReimbursement", rhsIsEntitledToReimbursement), lhsIsEntitledToReimbursement, rhsIsEntitledToReimbursement, true, true)) {
                return false;
            }
        }
        {
            PaymentInformation lhsPaymentInformation;
            lhsPaymentInformation = this.getPaymentInformation();
            PaymentInformation rhsPaymentInformation;
            rhsPaymentInformation = that.getPaymentInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentInformation", lhsPaymentInformation), LocatorUtils.property(thatLocator, "paymentInformation", rhsPaymentInformation), lhsPaymentInformation, rhsPaymentInformation, (this.paymentInformation!= null), (that.paymentInformation!= null))) {
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
            boolean theIsEntitledToReimbursement;
            theIsEntitledToReimbursement = this.isIsEntitledToReimbursement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isEntitledToReimbursement", theIsEntitledToReimbursement), currentHashCode, theIsEntitledToReimbursement, true);
        }
        {
            PaymentInformation thePaymentInformation;
            thePaymentInformation = this.getPaymentInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentInformation", thePaymentInformation), currentHashCode, thePaymentInformation, (this.paymentInformation!= null));
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
            boolean theIsEntitledToReimbursement;
            theIsEntitledToReimbursement = this.isIsEntitledToReimbursement();
            strategy.appendField(locator, this, "isEntitledToReimbursement", buffer, theIsEntitledToReimbursement, true);
        }
        {
            PaymentInformation thePaymentInformation;
            thePaymentInformation = this.getPaymentInformation();
            strategy.appendField(locator, this, "paymentInformation", buffer, thePaymentInformation, (this.paymentInformation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
