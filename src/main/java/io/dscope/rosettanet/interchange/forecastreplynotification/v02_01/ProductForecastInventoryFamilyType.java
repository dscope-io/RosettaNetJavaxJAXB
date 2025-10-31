
package io.dscope.rosettanet.interchange.forecastreplynotification.v02_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ForecastProductInventory;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ProductForecastType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
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
 * <p>Java class for ProductForecastInventoryFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductForecastInventoryFamilyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ProductForecastType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ForecastProductInventory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductFamilyIdentification" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductSchedule" type="{urn:rosettanet:specification:interchange:ForecastReplyNotification:xsd:schema:02.01}ProductScheduleType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductForecastInventoryFamilyType", propOrder = {
    "forecastProductInventory",
    "productFamilyIdentification",
    "productIdentification",
    "productSchedule"
})
public class ProductForecastInventoryFamilyType
    extends ProductForecastType
    implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ForecastProductInventory", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = ForecastProductInventory.class, required = false)
    protected List<ForecastProductInventory> forecastProductInventory;
    @XmlElement(name = "ProductFamilyIdentification")
    protected List<ProductIdentificationType> productFamilyIdentification;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class, required = false)
    protected List<ProductIdentification> productIdentification;
    @XmlElement(name = "ProductSchedule", required = true)
    protected List<ProductScheduleType> productSchedule;

    /**
     * Gets the value of the forecastProductInventory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastProductInventory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastProductInventory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastProductInventory }
     * 
     * 
     */
    public List<ForecastProductInventory> getForecastProductInventory() {
        if (forecastProductInventory == null) {
            forecastProductInventory = new ArrayList<ForecastProductInventory>();
        }
        return this.forecastProductInventory;
    }

    /**
     * Gets the value of the productFamilyIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFamilyIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFamilyIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getProductFamilyIdentification() {
        if (productFamilyIdentification == null) {
            productFamilyIdentification = new ArrayList<ProductIdentificationType>();
        }
        return this.productFamilyIdentification;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentification }
     * 
     * 
     */
    public List<ProductIdentification> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<ProductIdentification>();
        }
        return this.productIdentification;
    }

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
        final ProductForecastInventoryFamilyType that = ((ProductForecastInventoryFamilyType) object);
        {
            List<ForecastProductInventory> lhsForecastProductInventory;
            lhsForecastProductInventory = (((this.forecastProductInventory!= null)&&(!this.forecastProductInventory.isEmpty()))?this.getForecastProductInventory():null);
            List<ForecastProductInventory> rhsForecastProductInventory;
            rhsForecastProductInventory = (((that.forecastProductInventory!= null)&&(!that.forecastProductInventory.isEmpty()))?that.getForecastProductInventory():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastProductInventory", lhsForecastProductInventory), LocatorUtils.property(thatLocator, "forecastProductInventory", rhsForecastProductInventory), lhsForecastProductInventory, rhsForecastProductInventory, ((this.forecastProductInventory!= null)&&(!this.forecastProductInventory.isEmpty())), ((that.forecastProductInventory!= null)&&(!that.forecastProductInventory.isEmpty())))) {
                return false;
            }
        }
        {
            List<ProductIdentificationType> lhsProductFamilyIdentification;
            lhsProductFamilyIdentification = (((this.productFamilyIdentification!= null)&&(!this.productFamilyIdentification.isEmpty()))?this.getProductFamilyIdentification():null);
            List<ProductIdentificationType> rhsProductFamilyIdentification;
            rhsProductFamilyIdentification = (((that.productFamilyIdentification!= null)&&(!that.productFamilyIdentification.isEmpty()))?that.getProductFamilyIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productFamilyIdentification", lhsProductFamilyIdentification), LocatorUtils.property(thatLocator, "productFamilyIdentification", rhsProductFamilyIdentification), lhsProductFamilyIdentification, rhsProductFamilyIdentification, ((this.productFamilyIdentification!= null)&&(!this.productFamilyIdentification.isEmpty())), ((that.productFamilyIdentification!= null)&&(!that.productFamilyIdentification.isEmpty())))) {
                return false;
            }
        }
        {
            List<ProductIdentification> lhsProductIdentification;
            lhsProductIdentification = (((this.productIdentification!= null)&&(!this.productIdentification.isEmpty()))?this.getProductIdentification():null);
            List<ProductIdentification> rhsProductIdentification;
            rhsProductIdentification = (((that.productIdentification!= null)&&(!that.productIdentification.isEmpty()))?that.getProductIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentification", lhsProductIdentification), LocatorUtils.property(thatLocator, "productIdentification", rhsProductIdentification), lhsProductIdentification, rhsProductIdentification, ((this.productIdentification!= null)&&(!this.productIdentification.isEmpty())), ((that.productIdentification!= null)&&(!that.productIdentification.isEmpty())))) {
                return false;
            }
        }
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
            List<ForecastProductInventory> theForecastProductInventory;
            theForecastProductInventory = (((this.forecastProductInventory!= null)&&(!this.forecastProductInventory.isEmpty()))?this.getForecastProductInventory():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastProductInventory", theForecastProductInventory), currentHashCode, theForecastProductInventory, ((this.forecastProductInventory!= null)&&(!this.forecastProductInventory.isEmpty())));
        }
        {
            List<ProductIdentificationType> theProductFamilyIdentification;
            theProductFamilyIdentification = (((this.productFamilyIdentification!= null)&&(!this.productFamilyIdentification.isEmpty()))?this.getProductFamilyIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productFamilyIdentification", theProductFamilyIdentification), currentHashCode, theProductFamilyIdentification, ((this.productFamilyIdentification!= null)&&(!this.productFamilyIdentification.isEmpty())));
        }
        {
            List<ProductIdentification> theProductIdentification;
            theProductIdentification = (((this.productIdentification!= null)&&(!this.productIdentification.isEmpty()))?this.getProductIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, ((this.productIdentification!= null)&&(!this.productIdentification.isEmpty())));
        }
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
            List<ForecastProductInventory> theForecastProductInventory;
            theForecastProductInventory = (((this.forecastProductInventory!= null)&&(!this.forecastProductInventory.isEmpty()))?this.getForecastProductInventory():null);
            strategy.appendField(locator, this, "forecastProductInventory", buffer, theForecastProductInventory, ((this.forecastProductInventory!= null)&&(!this.forecastProductInventory.isEmpty())));
        }
        {
            List<ProductIdentificationType> theProductFamilyIdentification;
            theProductFamilyIdentification = (((this.productFamilyIdentification!= null)&&(!this.productFamilyIdentification.isEmpty()))?this.getProductFamilyIdentification():null);
            strategy.appendField(locator, this, "productFamilyIdentification", buffer, theProductFamilyIdentification, ((this.productFamilyIdentification!= null)&&(!this.productFamilyIdentification.isEmpty())));
        }
        {
            List<ProductIdentification> theProductIdentification;
            theProductIdentification = (((this.productIdentification!= null)&&(!this.productIdentification.isEmpty()))?this.getProductIdentification():null);
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, ((this.productIdentification!= null)&&(!this.productIdentification.isEmpty())));
        }
        {
            List<ProductScheduleType> theProductSchedule;
            theProductSchedule = (((this.productSchedule!= null)&&(!this.productSchedule.isEmpty()))?this.getProductSchedule():null);
            strategy.appendField(locator, this, "productSchedule", buffer, theProductSchedule, ((this.productSchedule!= null)&&(!this.productSchedule.isEmpty())));
        }
        return buffer;
    }

}
