
package io.dscope.rosettanet.interchange.forecastreplynotification.v02_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="ForecastProductScheduleResponse" type="{urn:rosettanet:specification:interchange:ForecastReplyNotification:xsd:schema:02.01}ForecastProductScheduleResponseType" maxOccurs="unbounded"/&gt;
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
    "forecastProductScheduleResponse"
})
public class ProductScheduleType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ForecastProductScheduleResponse", required = true)
    protected List<ForecastProductScheduleResponseType> forecastProductScheduleResponse;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the forecastProductScheduleResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastProductScheduleResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastProductScheduleResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastProductScheduleResponseType }
     * 
     * 
     */
    public List<ForecastProductScheduleResponseType> getForecastProductScheduleResponse() {
        if (forecastProductScheduleResponse == null) {
            forecastProductScheduleResponse = new ArrayList<ForecastProductScheduleResponseType>();
        }
        return this.forecastProductScheduleResponse;
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
            List<ForecastProductScheduleResponseType> lhsForecastProductScheduleResponse;
            lhsForecastProductScheduleResponse = (((this.forecastProductScheduleResponse!= null)&&(!this.forecastProductScheduleResponse.isEmpty()))?this.getForecastProductScheduleResponse():null);
            List<ForecastProductScheduleResponseType> rhsForecastProductScheduleResponse;
            rhsForecastProductScheduleResponse = (((that.forecastProductScheduleResponse!= null)&&(!that.forecastProductScheduleResponse.isEmpty()))?that.getForecastProductScheduleResponse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastProductScheduleResponse", lhsForecastProductScheduleResponse), LocatorUtils.property(thatLocator, "forecastProductScheduleResponse", rhsForecastProductScheduleResponse), lhsForecastProductScheduleResponse, rhsForecastProductScheduleResponse, ((this.forecastProductScheduleResponse!= null)&&(!this.forecastProductScheduleResponse.isEmpty())), ((that.forecastProductScheduleResponse!= null)&&(!that.forecastProductScheduleResponse.isEmpty())))) {
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
            List<ForecastProductScheduleResponseType> theForecastProductScheduleResponse;
            theForecastProductScheduleResponse = (((this.forecastProductScheduleResponse!= null)&&(!this.forecastProductScheduleResponse.isEmpty()))?this.getForecastProductScheduleResponse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastProductScheduleResponse", theForecastProductScheduleResponse), currentHashCode, theForecastProductScheduleResponse, ((this.forecastProductScheduleResponse!= null)&&(!this.forecastProductScheduleResponse.isEmpty())));
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
            List<ForecastProductScheduleResponseType> theForecastProductScheduleResponse;
            theForecastProductScheduleResponse = (((this.forecastProductScheduleResponse!= null)&&(!this.forecastProductScheduleResponse.isEmpty()))?this.getForecastProductScheduleResponse():null);
            strategy.appendField(locator, this, "forecastProductScheduleResponse", buffer, theForecastProductScheduleResponse, ((this.forecastProductScheduleResponse!= null)&&(!this.forecastProductScheduleResponse.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
