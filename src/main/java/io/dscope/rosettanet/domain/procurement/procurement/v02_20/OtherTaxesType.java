
package io.dscope.rosettanet.domain.procurement.procurement.v02_20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for OtherTaxesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherTaxesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20}TaxInformationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherTaxesType", propOrder = {
    "taxDescription"
})
public class OtherTaxesType
    extends TaxInformationType
    implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "TaxDescription", required = true)
    protected String taxDescription;

    /**
     * Gets the value of the taxDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDescription() {
        return taxDescription;
    }

    /**
     * Sets the value of the taxDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDescription(String value) {
        this.taxDescription = value;
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
        final OtherTaxesType that = ((OtherTaxesType) object);
        {
            String lhsTaxDescription;
            lhsTaxDescription = this.getTaxDescription();
            String rhsTaxDescription;
            rhsTaxDescription = that.getTaxDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxDescription", lhsTaxDescription), LocatorUtils.property(thatLocator, "taxDescription", rhsTaxDescription), lhsTaxDescription, rhsTaxDescription, (this.taxDescription!= null), (that.taxDescription!= null))) {
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
            String theTaxDescription;
            theTaxDescription = this.getTaxDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxDescription", theTaxDescription), currentHashCode, theTaxDescription, (this.taxDescription!= null));
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
            String theTaxDescription;
            theTaxDescription = this.getTaxDescription();
            strategy.appendField(locator, this, "taxDescription", buffer, theTaxDescription, (this.taxDescription!= null));
        }
        return buffer;
    }

}
