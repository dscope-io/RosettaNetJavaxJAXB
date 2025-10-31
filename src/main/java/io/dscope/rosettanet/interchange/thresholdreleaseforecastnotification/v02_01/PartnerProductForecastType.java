
package io.dscope.rosettanet.interchange.thresholdreleaseforecastnotification.v02_01;

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
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerIdentificationType;
import io.dscope.rosettanet.universal.partneridentification.v01_14.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for PartnerProductForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerProductForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForecastPartner" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}SpecifiedPartnerDescriptionType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ProductForecastInformation" type="{urn:rosettanet:specification:interchange:ThresholdReleaseForecastNotification:xsd:schema:02.01}ProductForecastInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SoldToPartner" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerIdentificationType"/&gt;
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
@XmlType(name = "PartnerProductForecastType", propOrder = {
    "forecastPartner",
    "productForecastInformation",
    "soldToPartner"
})
public class PartnerProductForecastType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ForecastPartner", required = true)
    protected List<SpecifiedPartnerDescriptionType> forecastPartner;
    @XmlElement(name = "ProductForecastInformation", required = true)
    protected List<ProductForecastInformationType> productForecastInformation;
    @XmlElement(name = "SoldToPartner", required = true)
    protected PartnerIdentificationType soldToPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the forecastPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedPartnerDescriptionType }
     * 
     * 
     */
    public List<SpecifiedPartnerDescriptionType> getForecastPartner() {
        if (forecastPartner == null) {
            forecastPartner = new ArrayList<SpecifiedPartnerDescriptionType>();
        }
        return this.forecastPartner;
    }

    /**
     * Gets the value of the productForecastInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productForecastInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductForecastInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductForecastInformationType }
     * 
     * 
     */
    public List<ProductForecastInformationType> getProductForecastInformation() {
        if (productForecastInformation == null) {
            productForecastInformation = new ArrayList<ProductForecastInformationType>();
        }
        return this.productForecastInformation;
    }

    /**
     * Gets the value of the soldToPartner property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerIdentificationType }
     *     
     */
    public PartnerIdentificationType getSoldToPartner() {
        return soldToPartner;
    }

    /**
     * Sets the value of the soldToPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerIdentificationType }
     *     
     */
    public void setSoldToPartner(PartnerIdentificationType value) {
        this.soldToPartner = value;
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
        final PartnerProductForecastType that = ((PartnerProductForecastType) object);
        {
            List<SpecifiedPartnerDescriptionType> lhsForecastPartner;
            lhsForecastPartner = (((this.forecastPartner!= null)&&(!this.forecastPartner.isEmpty()))?this.getForecastPartner():null);
            List<SpecifiedPartnerDescriptionType> rhsForecastPartner;
            rhsForecastPartner = (((that.forecastPartner!= null)&&(!that.forecastPartner.isEmpty()))?that.getForecastPartner():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastPartner", lhsForecastPartner), LocatorUtils.property(thatLocator, "forecastPartner", rhsForecastPartner), lhsForecastPartner, rhsForecastPartner, ((this.forecastPartner!= null)&&(!this.forecastPartner.isEmpty())), ((that.forecastPartner!= null)&&(!that.forecastPartner.isEmpty())))) {
                return false;
            }
        }
        {
            List<ProductForecastInformationType> lhsProductForecastInformation;
            lhsProductForecastInformation = (((this.productForecastInformation!= null)&&(!this.productForecastInformation.isEmpty()))?this.getProductForecastInformation():null);
            List<ProductForecastInformationType> rhsProductForecastInformation;
            rhsProductForecastInformation = (((that.productForecastInformation!= null)&&(!that.productForecastInformation.isEmpty()))?that.getProductForecastInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productForecastInformation", lhsProductForecastInformation), LocatorUtils.property(thatLocator, "productForecastInformation", rhsProductForecastInformation), lhsProductForecastInformation, rhsProductForecastInformation, ((this.productForecastInformation!= null)&&(!this.productForecastInformation.isEmpty())), ((that.productForecastInformation!= null)&&(!that.productForecastInformation.isEmpty())))) {
                return false;
            }
        }
        {
            PartnerIdentificationType lhsSoldToPartner;
            lhsSoldToPartner = this.getSoldToPartner();
            PartnerIdentificationType rhsSoldToPartner;
            rhsSoldToPartner = that.getSoldToPartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "soldToPartner", lhsSoldToPartner), LocatorUtils.property(thatLocator, "soldToPartner", rhsSoldToPartner), lhsSoldToPartner, rhsSoldToPartner, (this.soldToPartner!= null), (that.soldToPartner!= null))) {
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
            List<SpecifiedPartnerDescriptionType> theForecastPartner;
            theForecastPartner = (((this.forecastPartner!= null)&&(!this.forecastPartner.isEmpty()))?this.getForecastPartner():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastPartner", theForecastPartner), currentHashCode, theForecastPartner, ((this.forecastPartner!= null)&&(!this.forecastPartner.isEmpty())));
        }
        {
            List<ProductForecastInformationType> theProductForecastInformation;
            theProductForecastInformation = (((this.productForecastInformation!= null)&&(!this.productForecastInformation.isEmpty()))?this.getProductForecastInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productForecastInformation", theProductForecastInformation), currentHashCode, theProductForecastInformation, ((this.productForecastInformation!= null)&&(!this.productForecastInformation.isEmpty())));
        }
        {
            PartnerIdentificationType theSoldToPartner;
            theSoldToPartner = this.getSoldToPartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "soldToPartner", theSoldToPartner), currentHashCode, theSoldToPartner, (this.soldToPartner!= null));
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
            List<SpecifiedPartnerDescriptionType> theForecastPartner;
            theForecastPartner = (((this.forecastPartner!= null)&&(!this.forecastPartner.isEmpty()))?this.getForecastPartner():null);
            strategy.appendField(locator, this, "forecastPartner", buffer, theForecastPartner, ((this.forecastPartner!= null)&&(!this.forecastPartner.isEmpty())));
        }
        {
            List<ProductForecastInformationType> theProductForecastInformation;
            theProductForecastInformation = (((this.productForecastInformation!= null)&&(!this.productForecastInformation.isEmpty()))?this.getProductForecastInformation():null);
            strategy.appendField(locator, this, "productForecastInformation", buffer, theProductForecastInformation, ((this.productForecastInformation!= null)&&(!this.productForecastInformation.isEmpty())));
        }
        {
            PartnerIdentificationType theSoldToPartner;
            theSoldToPartner = this.getSoldToPartner();
            strategy.appendField(locator, this, "soldToPartner", buffer, theSoldToPartner, (this.soldToPartner!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
