
package io.dscope.rosettanet.domain.procurement.procurement.v02_18;

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
import io.dscope.rosettanet.domain.shared.shared.v01_11.ProductQuantity;
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
 * <p>Java class for ForecastProductScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastProductScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18}ForecastPeriod"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.11}ProductQuantity"/&gt;
 *         &lt;element name="ScheduleProductForecastIdentifier" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18}ForecastIdentifierReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ForecastProductScheduleType", propOrder = {
    "forecastPeriod",
    "productQuantity",
    "scheduleProductForecastIdentifier"
})
public class ForecastProductScheduleType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ForecastPeriod", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18", type = ForecastPeriod.class)
    protected ForecastPeriod forecastPeriod;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.11", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlElement(name = "ScheduleProductForecastIdentifier")
    protected List<ForecastIdentifierReferenceType> scheduleProductForecastIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the forecastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastPeriod }
     *     
     */
    public ForecastPeriod getForecastPeriod() {
        return forecastPeriod;
    }

    /**
     * Sets the value of the forecastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastPeriod }
     *     
     */
    public void setForecastPeriod(ForecastPeriod value) {
        this.forecastPeriod = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the scheduleProductForecastIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleProductForecastIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleProductForecastIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastIdentifierReferenceType }
     * 
     * 
     */
    public List<ForecastIdentifierReferenceType> getScheduleProductForecastIdentifier() {
        if (scheduleProductForecastIdentifier == null) {
            scheduleProductForecastIdentifier = new ArrayList<ForecastIdentifierReferenceType>();
        }
        return this.scheduleProductForecastIdentifier;
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
        final ForecastProductScheduleType that = ((ForecastProductScheduleType) object);
        {
            ForecastPeriod lhsForecastPeriod;
            lhsForecastPeriod = this.getForecastPeriod();
            ForecastPeriod rhsForecastPeriod;
            rhsForecastPeriod = that.getForecastPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastPeriod", lhsForecastPeriod), LocatorUtils.property(thatLocator, "forecastPeriod", rhsForecastPeriod), lhsForecastPeriod, rhsForecastPeriod, (this.forecastPeriod!= null), (that.forecastPeriod!= null))) {
                return false;
            }
        }
        {
            ProductQuantity lhsProductQuantity;
            lhsProductQuantity = this.getProductQuantity();
            ProductQuantity rhsProductQuantity;
            rhsProductQuantity = that.getProductQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productQuantity", lhsProductQuantity), LocatorUtils.property(thatLocator, "productQuantity", rhsProductQuantity), lhsProductQuantity, rhsProductQuantity, (this.productQuantity!= null), (that.productQuantity!= null))) {
                return false;
            }
        }
        {
            List<ForecastIdentifierReferenceType> lhsScheduleProductForecastIdentifier;
            lhsScheduleProductForecastIdentifier = (((this.scheduleProductForecastIdentifier!= null)&&(!this.scheduleProductForecastIdentifier.isEmpty()))?this.getScheduleProductForecastIdentifier():null);
            List<ForecastIdentifierReferenceType> rhsScheduleProductForecastIdentifier;
            rhsScheduleProductForecastIdentifier = (((that.scheduleProductForecastIdentifier!= null)&&(!that.scheduleProductForecastIdentifier.isEmpty()))?that.getScheduleProductForecastIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduleProductForecastIdentifier", lhsScheduleProductForecastIdentifier), LocatorUtils.property(thatLocator, "scheduleProductForecastIdentifier", rhsScheduleProductForecastIdentifier), lhsScheduleProductForecastIdentifier, rhsScheduleProductForecastIdentifier, ((this.scheduleProductForecastIdentifier!= null)&&(!this.scheduleProductForecastIdentifier.isEmpty())), ((that.scheduleProductForecastIdentifier!= null)&&(!that.scheduleProductForecastIdentifier.isEmpty())))) {
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
            ForecastPeriod theForecastPeriod;
            theForecastPeriod = this.getForecastPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastPeriod", theForecastPeriod), currentHashCode, theForecastPeriod, (this.forecastPeriod!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantity", theProductQuantity), currentHashCode, theProductQuantity, (this.productQuantity!= null));
        }
        {
            List<ForecastIdentifierReferenceType> theScheduleProductForecastIdentifier;
            theScheduleProductForecastIdentifier = (((this.scheduleProductForecastIdentifier!= null)&&(!this.scheduleProductForecastIdentifier.isEmpty()))?this.getScheduleProductForecastIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduleProductForecastIdentifier", theScheduleProductForecastIdentifier), currentHashCode, theScheduleProductForecastIdentifier, ((this.scheduleProductForecastIdentifier!= null)&&(!this.scheduleProductForecastIdentifier.isEmpty())));
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
            ForecastPeriod theForecastPeriod;
            theForecastPeriod = this.getForecastPeriod();
            strategy.appendField(locator, this, "forecastPeriod", buffer, theForecastPeriod, (this.forecastPeriod!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            strategy.appendField(locator, this, "productQuantity", buffer, theProductQuantity, (this.productQuantity!= null));
        }
        {
            List<ForecastIdentifierReferenceType> theScheduleProductForecastIdentifier;
            theScheduleProductForecastIdentifier = (((this.scheduleProductForecastIdentifier!= null)&&(!this.scheduleProductForecastIdentifier.isEmpty()))?this.getScheduleProductForecastIdentifier():null);
            strategy.appendField(locator, this, "scheduleProductForecastIdentifier", buffer, theScheduleProductForecastIdentifier, ((this.scheduleProductForecastIdentifier!= null)&&(!this.scheduleProductForecastIdentifier.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
