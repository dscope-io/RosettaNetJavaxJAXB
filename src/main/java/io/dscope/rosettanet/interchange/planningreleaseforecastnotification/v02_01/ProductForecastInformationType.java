
package io.dscope.rosettanet.interchange.planningreleaseforecastnotification.v02_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ProductForecastType;
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
 * <p>Java class for ProductForecastInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductForecastInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ProductForecastType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductSchedule" type="{urn:rosettanet:specification:interchange:PlanningReleaseForecastNotification:xsd:schema:02.01}ProductScheduleType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductForecastInformationType", propOrder = {
    "productSchedule"
})
public class ProductForecastInformationType
    extends ProductForecastType
    implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ProductSchedule", required = true)
    protected List<ProductScheduleType> productSchedule;

    /**
     * Gets the value of the productSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductScheduleType }
     * 
     * 
     */
    public List<ProductScheduleType> getProductSchedule() {
        if (productSchedule == null) {
            productSchedule = new ArrayList<ProductScheduleType>();
        }
        return this.productSchedule;
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
        final ProductForecastInformationType that = ((ProductForecastInformationType) object);
        {
            List<ProductScheduleType> lhsProductSchedule;
            lhsProductSchedule = (((this.productSchedule!= null)&&(!this.productSchedule.isEmpty()))?this.getProductSchedule():null);
            List<ProductScheduleType> rhsProductSchedule;
            rhsProductSchedule = (((that.productSchedule!= null)&&(!that.productSchedule.isEmpty()))?that.getProductSchedule():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productSchedule", lhsProductSchedule), LocatorUtils.property(thatLocator, "productSchedule", rhsProductSchedule), lhsProductSchedule, rhsProductSchedule, ((this.productSchedule!= null)&&(!this.productSchedule.isEmpty())), ((that.productSchedule!= null)&&(!that.productSchedule.isEmpty())))) {
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
            List<ProductScheduleType> theProductSchedule;
            theProductSchedule = (((this.productSchedule!= null)&&(!this.productSchedule.isEmpty()))?this.getProductSchedule():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productSchedule", theProductSchedule), currentHashCode, theProductSchedule, ((this.productSchedule!= null)&&(!this.productSchedule.isEmpty())));
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
            List<ProductScheduleType> theProductSchedule;
            theProductSchedule = (((this.productSchedule!= null)&&(!this.productSchedule.isEmpty()))?this.getProductSchedule():null);
            strategy.appendField(locator, this, "productSchedule", buffer, theProductSchedule, ((this.productSchedule!= null)&&(!this.productSchedule.isEmpty())));
        }
        return buffer;
    }

}
