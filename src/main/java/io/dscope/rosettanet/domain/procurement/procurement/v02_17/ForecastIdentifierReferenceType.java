
package io.dscope.rosettanet.domain.procurement.procurement.v02_17;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.codelist.forecastreferencetype.v01_03.ForecastReferenceType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
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
 * <p>Java class for ForecastIdentifierReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastIdentifierReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.03}ForecastReferenceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastIdentifierReferenceType", propOrder = {
    "forecastReferenceType"
})
public class ForecastIdentifierReferenceType
    extends BusinessDocumentReferenceType
    implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ForecastReferenceType", namespace = "urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.03", type = ForecastReferenceType.class)
    protected ForecastReferenceType forecastReferenceType;

    /**
     * Gets the value of the forecastReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastReferenceType }
     *     
     */
    public ForecastReferenceType getForecastReferenceType() {
        return forecastReferenceType;
    }

    /**
     * Sets the value of the forecastReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastReferenceType }
     *     
     */
    public void setForecastReferenceType(ForecastReferenceType value) {
        this.forecastReferenceType = value;
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
        final ForecastIdentifierReferenceType that = ((ForecastIdentifierReferenceType) object);
        {
            ForecastReferenceType lhsForecastReferenceType;
            lhsForecastReferenceType = this.getForecastReferenceType();
            ForecastReferenceType rhsForecastReferenceType;
            rhsForecastReferenceType = that.getForecastReferenceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastReferenceType", lhsForecastReferenceType), LocatorUtils.property(thatLocator, "forecastReferenceType", rhsForecastReferenceType), lhsForecastReferenceType, rhsForecastReferenceType, (this.forecastReferenceType!= null), (that.forecastReferenceType!= null))) {
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
            ForecastReferenceType theForecastReferenceType;
            theForecastReferenceType = this.getForecastReferenceType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastReferenceType", theForecastReferenceType), currentHashCode, theForecastReferenceType, (this.forecastReferenceType!= null));
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
            ForecastReferenceType theForecastReferenceType;
            theForecastReferenceType = this.getForecastReferenceType();
            strategy.appendField(locator, this, "forecastReferenceType", buffer, theForecastReferenceType, (this.forecastReferenceType!= null));
        }
        return buffer;
    }

}
