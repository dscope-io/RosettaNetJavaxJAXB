
package io.dscope.rosettanet.interchange.embeddedreleaseforecastnotification.v01_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.forecastquantitytype.v01_04.ForecastQuantityTypeType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ForecastProductSchedule;
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
 * <p>Java class for ProductScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ForecastProductSchedule" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OrderForecastQuantityType" type="{urn:rosettanet:specification:domain:Procurement:ForecastQuantityType:xsd:codelist:01.04}ForecastQuantityTypeType"/&gt;
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
@XmlType(name = "ProductScheduleType", propOrder = {
    "forecastProductSchedule",
    "orderForecastQuantityType"
})
public class ProductScheduleType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ForecastProductSchedule", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ForecastProductSchedule.class)
    protected List<ForecastProductSchedule> forecastProductSchedule;
    @XmlElement(name = "OrderForecastQuantityType", required = true)
    protected ForecastQuantityTypeType orderForecastQuantityType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the forecastProductSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastProductSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastProductSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastProductSchedule }
     * 
     * 
     */
    public List<ForecastProductSchedule> getForecastProductSchedule() {
        if (forecastProductSchedule == null) {
            forecastProductSchedule = new ArrayList<ForecastProductSchedule>();
        }
        return this.forecastProductSchedule;
    }

    /**
     * Gets the value of the orderForecastQuantityType property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastQuantityTypeType }
     *     
     */
    public ForecastQuantityTypeType getOrderForecastQuantityType() {
        return orderForecastQuantityType;
    }

    /**
     * Sets the value of the orderForecastQuantityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastQuantityTypeType }
     *     
     */
    public void setOrderForecastQuantityType(ForecastQuantityTypeType value) {
        this.orderForecastQuantityType = value;
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
        final ProductScheduleType that = ((ProductScheduleType) object);
        {
            List<ForecastProductSchedule> lhsForecastProductSchedule;
            lhsForecastProductSchedule = (((this.forecastProductSchedule!= null)&&(!this.forecastProductSchedule.isEmpty()))?this.getForecastProductSchedule():null);
            List<ForecastProductSchedule> rhsForecastProductSchedule;
            rhsForecastProductSchedule = (((that.forecastProductSchedule!= null)&&(!that.forecastProductSchedule.isEmpty()))?that.getForecastProductSchedule():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastProductSchedule", lhsForecastProductSchedule), LocatorUtils.property(thatLocator, "forecastProductSchedule", rhsForecastProductSchedule), lhsForecastProductSchedule, rhsForecastProductSchedule, ((this.forecastProductSchedule!= null)&&(!this.forecastProductSchedule.isEmpty())), ((that.forecastProductSchedule!= null)&&(!that.forecastProductSchedule.isEmpty())))) {
                return false;
            }
        }
        {
            ForecastQuantityTypeType lhsOrderForecastQuantityType;
            lhsOrderForecastQuantityType = this.getOrderForecastQuantityType();
            ForecastQuantityTypeType rhsOrderForecastQuantityType;
            rhsOrderForecastQuantityType = that.getOrderForecastQuantityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderForecastQuantityType", lhsOrderForecastQuantityType), LocatorUtils.property(thatLocator, "orderForecastQuantityType", rhsOrderForecastQuantityType), lhsOrderForecastQuantityType, rhsOrderForecastQuantityType, (this.orderForecastQuantityType!= null), (that.orderForecastQuantityType!= null))) {
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
            List<ForecastProductSchedule> theForecastProductSchedule;
            theForecastProductSchedule = (((this.forecastProductSchedule!= null)&&(!this.forecastProductSchedule.isEmpty()))?this.getForecastProductSchedule():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastProductSchedule", theForecastProductSchedule), currentHashCode, theForecastProductSchedule, ((this.forecastProductSchedule!= null)&&(!this.forecastProductSchedule.isEmpty())));
        }
        {
            ForecastQuantityTypeType theOrderForecastQuantityType;
            theOrderForecastQuantityType = this.getOrderForecastQuantityType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderForecastQuantityType", theOrderForecastQuantityType), currentHashCode, theOrderForecastQuantityType, (this.orderForecastQuantityType!= null));
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
            List<ForecastProductSchedule> theForecastProductSchedule;
            theForecastProductSchedule = (((this.forecastProductSchedule!= null)&&(!this.forecastProductSchedule.isEmpty()))?this.getForecastProductSchedule():null);
            strategy.appendField(locator, this, "forecastProductSchedule", buffer, theForecastProductSchedule, ((this.forecastProductSchedule!= null)&&(!this.forecastProductSchedule.isEmpty())));
        }
        {
            ForecastQuantityTypeType theOrderForecastQuantityType;
            theOrderForecastQuantityType = this.getOrderForecastQuantityType();
            strategy.appendField(locator, this, "orderForecastQuantityType", buffer, theOrderForecastQuantityType, (this.orderForecastQuantityType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
