
package io.dscope.rosettanet.interchange.quoteconfirmation.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.codelist.quotestatus.v01_03.QuoteStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.CustomerInformationType;
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
 * <p>Java class for QuoteCustomerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteCustomerInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}CustomerInformationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.03}QuoteStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteCustomerInformationType", propOrder = {
    "quoteStatus"
})
public class QuoteCustomerInformationType
    extends CustomerInformationType
    implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "QuoteStatus", namespace = "urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.03", type = QuoteStatus.class)
    protected QuoteStatus quoteStatus;

    /**
     * Gets the value of the quoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteStatus }
     *     
     */
    public QuoteStatus getQuoteStatus() {
        return quoteStatus;
    }

    /**
     * Sets the value of the quoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteStatus }
     *     
     */
    public void setQuoteStatus(QuoteStatus value) {
        this.quoteStatus = value;
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
        final QuoteCustomerInformationType that = ((QuoteCustomerInformationType) object);
        {
            QuoteStatus lhsQuoteStatus;
            lhsQuoteStatus = this.getQuoteStatus();
            QuoteStatus rhsQuoteStatus;
            rhsQuoteStatus = that.getQuoteStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quoteStatus", lhsQuoteStatus), LocatorUtils.property(thatLocator, "quoteStatus", rhsQuoteStatus), lhsQuoteStatus, rhsQuoteStatus, (this.quoteStatus!= null), (that.quoteStatus!= null))) {
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
            QuoteStatus theQuoteStatus;
            theQuoteStatus = this.getQuoteStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quoteStatus", theQuoteStatus), currentHashCode, theQuoteStatus, (this.quoteStatus!= null));
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
            QuoteStatus theQuoteStatus;
            theQuoteStatus = this.getQuoteStatus();
            strategy.appendField(locator, this, "quoteStatus", buffer, theQuoteStatus, (this.quoteStatus!= null));
        }
        return buffer;
    }

}
