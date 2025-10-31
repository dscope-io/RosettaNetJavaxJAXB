
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for VmiProductForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmiProductForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}ProductForecastType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}ForecastProductInventory" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}ProductReceiptReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmiProductForecastType", propOrder = {
    "forecastProductInventory",
    "productReceiptReference"
})
public class VmiProductForecastType
    extends ProductForecastType
    implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ForecastProductInventory", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = ForecastProductInventory.class)
    protected List<ForecastProductInventory> forecastProductInventory;
    @XmlElementRef(name = "ProductReceiptReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = ProductReceiptReference.class, required = false)
    protected List<ProductReceiptReference> productReceiptReference;

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
     * Gets the value of the productReceiptReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productReceiptReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductReceiptReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductReceiptReference }
     * 
     * 
     */
    public List<ProductReceiptReference> getProductReceiptReference() {
        if (productReceiptReference == null) {
            productReceiptReference = new ArrayList<ProductReceiptReference>();
        }
        return this.productReceiptReference;
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
        final VmiProductForecastType that = ((VmiProductForecastType) object);
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
            List<ProductReceiptReference> lhsProductReceiptReference;
            lhsProductReceiptReference = (((this.productReceiptReference!= null)&&(!this.productReceiptReference.isEmpty()))?this.getProductReceiptReference():null);
            List<ProductReceiptReference> rhsProductReceiptReference;
            rhsProductReceiptReference = (((that.productReceiptReference!= null)&&(!that.productReceiptReference.isEmpty()))?that.getProductReceiptReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productReceiptReference", lhsProductReceiptReference), LocatorUtils.property(thatLocator, "productReceiptReference", rhsProductReceiptReference), lhsProductReceiptReference, rhsProductReceiptReference, ((this.productReceiptReference!= null)&&(!this.productReceiptReference.isEmpty())), ((that.productReceiptReference!= null)&&(!that.productReceiptReference.isEmpty())))) {
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
            List<ProductReceiptReference> theProductReceiptReference;
            theProductReceiptReference = (((this.productReceiptReference!= null)&&(!this.productReceiptReference.isEmpty()))?this.getProductReceiptReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productReceiptReference", theProductReceiptReference), currentHashCode, theProductReceiptReference, ((this.productReceiptReference!= null)&&(!this.productReceiptReference.isEmpty())));
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
            List<ProductReceiptReference> theProductReceiptReference;
            theProductReceiptReference = (((this.productReceiptReference!= null)&&(!this.productReceiptReference.isEmpty()))?this.getProductReceiptReference():null);
            strategy.appendField(locator, this, "productReceiptReference", buffer, theProductReceiptReference, ((this.productReceiptReference!= null)&&(!this.productReceiptReference.isEmpty())));
        }
        return buffer;
    }

}
