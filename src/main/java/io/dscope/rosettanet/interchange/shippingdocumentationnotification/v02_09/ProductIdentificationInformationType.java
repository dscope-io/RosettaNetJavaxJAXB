
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_09;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;
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
 * <p>Java class for ProductIdentificationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartnerProductIdentification" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.09}PartnerProductIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentificationInformationType", propOrder = {
    "partnerProductIdentification"
})
public class ProductIdentificationInformationType
    extends ProductIdentificationType
    implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "PartnerProductIdentification")
    protected List<PartnerProductIdentificationType> partnerProductIdentification;

    /**
     * Gets the value of the partnerProductIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerProductIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerProductIdentificationType }
     * 
     * 
     */
    public List<PartnerProductIdentificationType> getPartnerProductIdentification() {
        if (partnerProductIdentification == null) {
            partnerProductIdentification = new ArrayList<PartnerProductIdentificationType>();
        }
        return this.partnerProductIdentification;
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
        final ProductIdentificationInformationType that = ((ProductIdentificationInformationType) object);
        {
            List<PartnerProductIdentificationType> lhsPartnerProductIdentification;
            lhsPartnerProductIdentification = (((this.partnerProductIdentification!= null)&&(!this.partnerProductIdentification.isEmpty()))?this.getPartnerProductIdentification():null);
            List<PartnerProductIdentificationType> rhsPartnerProductIdentification;
            rhsPartnerProductIdentification = (((that.partnerProductIdentification!= null)&&(!that.partnerProductIdentification.isEmpty()))?that.getPartnerProductIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerProductIdentification", lhsPartnerProductIdentification), LocatorUtils.property(thatLocator, "partnerProductIdentification", rhsPartnerProductIdentification), lhsPartnerProductIdentification, rhsPartnerProductIdentification, ((this.partnerProductIdentification!= null)&&(!this.partnerProductIdentification.isEmpty())), ((that.partnerProductIdentification!= null)&&(!that.partnerProductIdentification.isEmpty())))) {
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
            List<PartnerProductIdentificationType> thePartnerProductIdentification;
            thePartnerProductIdentification = (((this.partnerProductIdentification!= null)&&(!this.partnerProductIdentification.isEmpty()))?this.getPartnerProductIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerProductIdentification", thePartnerProductIdentification), currentHashCode, thePartnerProductIdentification, ((this.partnerProductIdentification!= null)&&(!this.partnerProductIdentification.isEmpty())));
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
            List<PartnerProductIdentificationType> thePartnerProductIdentification;
            thePartnerProductIdentification = (((this.partnerProductIdentification!= null)&&(!this.partnerProductIdentification.isEmpty()))?this.getPartnerProductIdentification():null);
            strategy.appendField(locator, this, "partnerProductIdentification", buffer, thePartnerProductIdentification, ((this.partnerProductIdentification!= null)&&(!this.partnerProductIdentification.isEmpty())));
        }
        return buffer;
    }

}
