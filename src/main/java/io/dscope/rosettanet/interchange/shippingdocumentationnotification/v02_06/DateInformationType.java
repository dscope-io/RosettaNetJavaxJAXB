
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.dates.v01_03.StartAndEndDateType;
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
 * <p>Java class for DateInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualCargoUnloadingDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateType" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedCargoUnloadingPeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateType" minOccurs="0"/&gt;
 *         &lt;element name="PermitValidityDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateType" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryImportDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateType" minOccurs="0"/&gt;
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
@XmlType(name = "DateInformationType", propOrder = {
    "actualCargoUnloadingDatePeriod",
    "expectedCargoUnloadingPeriod",
    "permitValidityDatePeriod",
    "temporaryImportDatePeriod"
})
public class DateInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ActualCargoUnloadingDatePeriod")
    protected StartAndEndDateType actualCargoUnloadingDatePeriod;
    @XmlElement(name = "ExpectedCargoUnloadingPeriod")
    protected StartAndEndDateType expectedCargoUnloadingPeriod;
    @XmlElement(name = "PermitValidityDatePeriod")
    protected StartAndEndDateType permitValidityDatePeriod;
    @XmlElement(name = "TemporaryImportDatePeriod")
    protected StartAndEndDateType temporaryImportDatePeriod;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actualCargoUnloadingDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateType }
     *     
     */
    public StartAndEndDateType getActualCargoUnloadingDatePeriod() {
        return actualCargoUnloadingDatePeriod;
    }

    /**
     * Sets the value of the actualCargoUnloadingDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateType }
     *     
     */
    public void setActualCargoUnloadingDatePeriod(StartAndEndDateType value) {
        this.actualCargoUnloadingDatePeriod = value;
    }

    /**
     * Gets the value of the expectedCargoUnloadingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateType }
     *     
     */
    public StartAndEndDateType getExpectedCargoUnloadingPeriod() {
        return expectedCargoUnloadingPeriod;
    }

    /**
     * Sets the value of the expectedCargoUnloadingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateType }
     *     
     */
    public void setExpectedCargoUnloadingPeriod(StartAndEndDateType value) {
        this.expectedCargoUnloadingPeriod = value;
    }

    /**
     * Gets the value of the permitValidityDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateType }
     *     
     */
    public StartAndEndDateType getPermitValidityDatePeriod() {
        return permitValidityDatePeriod;
    }

    /**
     * Sets the value of the permitValidityDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateType }
     *     
     */
    public void setPermitValidityDatePeriod(StartAndEndDateType value) {
        this.permitValidityDatePeriod = value;
    }

    /**
     * Gets the value of the temporaryImportDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateType }
     *     
     */
    public StartAndEndDateType getTemporaryImportDatePeriod() {
        return temporaryImportDatePeriod;
    }

    /**
     * Sets the value of the temporaryImportDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateType }
     *     
     */
    public void setTemporaryImportDatePeriod(StartAndEndDateType value) {
        this.temporaryImportDatePeriod = value;
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
        final DateInformationType that = ((DateInformationType) object);
        {
            StartAndEndDateType lhsActualCargoUnloadingDatePeriod;
            lhsActualCargoUnloadingDatePeriod = this.getActualCargoUnloadingDatePeriod();
            StartAndEndDateType rhsActualCargoUnloadingDatePeriod;
            rhsActualCargoUnloadingDatePeriod = that.getActualCargoUnloadingDatePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualCargoUnloadingDatePeriod", lhsActualCargoUnloadingDatePeriod), LocatorUtils.property(thatLocator, "actualCargoUnloadingDatePeriod", rhsActualCargoUnloadingDatePeriod), lhsActualCargoUnloadingDatePeriod, rhsActualCargoUnloadingDatePeriod, (this.actualCargoUnloadingDatePeriod!= null), (that.actualCargoUnloadingDatePeriod!= null))) {
                return false;
            }
        }
        {
            StartAndEndDateType lhsExpectedCargoUnloadingPeriod;
            lhsExpectedCargoUnloadingPeriod = this.getExpectedCargoUnloadingPeriod();
            StartAndEndDateType rhsExpectedCargoUnloadingPeriod;
            rhsExpectedCargoUnloadingPeriod = that.getExpectedCargoUnloadingPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedCargoUnloadingPeriod", lhsExpectedCargoUnloadingPeriod), LocatorUtils.property(thatLocator, "expectedCargoUnloadingPeriod", rhsExpectedCargoUnloadingPeriod), lhsExpectedCargoUnloadingPeriod, rhsExpectedCargoUnloadingPeriod, (this.expectedCargoUnloadingPeriod!= null), (that.expectedCargoUnloadingPeriod!= null))) {
                return false;
            }
        }
        {
            StartAndEndDateType lhsPermitValidityDatePeriod;
            lhsPermitValidityDatePeriod = this.getPermitValidityDatePeriod();
            StartAndEndDateType rhsPermitValidityDatePeriod;
            rhsPermitValidityDatePeriod = that.getPermitValidityDatePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "permitValidityDatePeriod", lhsPermitValidityDatePeriod), LocatorUtils.property(thatLocator, "permitValidityDatePeriod", rhsPermitValidityDatePeriod), lhsPermitValidityDatePeriod, rhsPermitValidityDatePeriod, (this.permitValidityDatePeriod!= null), (that.permitValidityDatePeriod!= null))) {
                return false;
            }
        }
        {
            StartAndEndDateType lhsTemporaryImportDatePeriod;
            lhsTemporaryImportDatePeriod = this.getTemporaryImportDatePeriod();
            StartAndEndDateType rhsTemporaryImportDatePeriod;
            rhsTemporaryImportDatePeriod = that.getTemporaryImportDatePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "temporaryImportDatePeriod", lhsTemporaryImportDatePeriod), LocatorUtils.property(thatLocator, "temporaryImportDatePeriod", rhsTemporaryImportDatePeriod), lhsTemporaryImportDatePeriod, rhsTemporaryImportDatePeriod, (this.temporaryImportDatePeriod!= null), (that.temporaryImportDatePeriod!= null))) {
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
            StartAndEndDateType theActualCargoUnloadingDatePeriod;
            theActualCargoUnloadingDatePeriod = this.getActualCargoUnloadingDatePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualCargoUnloadingDatePeriod", theActualCargoUnloadingDatePeriod), currentHashCode, theActualCargoUnloadingDatePeriod, (this.actualCargoUnloadingDatePeriod!= null));
        }
        {
            StartAndEndDateType theExpectedCargoUnloadingPeriod;
            theExpectedCargoUnloadingPeriod = this.getExpectedCargoUnloadingPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedCargoUnloadingPeriod", theExpectedCargoUnloadingPeriod), currentHashCode, theExpectedCargoUnloadingPeriod, (this.expectedCargoUnloadingPeriod!= null));
        }
        {
            StartAndEndDateType thePermitValidityDatePeriod;
            thePermitValidityDatePeriod = this.getPermitValidityDatePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "permitValidityDatePeriod", thePermitValidityDatePeriod), currentHashCode, thePermitValidityDatePeriod, (this.permitValidityDatePeriod!= null));
        }
        {
            StartAndEndDateType theTemporaryImportDatePeriod;
            theTemporaryImportDatePeriod = this.getTemporaryImportDatePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "temporaryImportDatePeriod", theTemporaryImportDatePeriod), currentHashCode, theTemporaryImportDatePeriod, (this.temporaryImportDatePeriod!= null));
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
            StartAndEndDateType theActualCargoUnloadingDatePeriod;
            theActualCargoUnloadingDatePeriod = this.getActualCargoUnloadingDatePeriod();
            strategy.appendField(locator, this, "actualCargoUnloadingDatePeriod", buffer, theActualCargoUnloadingDatePeriod, (this.actualCargoUnloadingDatePeriod!= null));
        }
        {
            StartAndEndDateType theExpectedCargoUnloadingPeriod;
            theExpectedCargoUnloadingPeriod = this.getExpectedCargoUnloadingPeriod();
            strategy.appendField(locator, this, "expectedCargoUnloadingPeriod", buffer, theExpectedCargoUnloadingPeriod, (this.expectedCargoUnloadingPeriod!= null));
        }
        {
            StartAndEndDateType thePermitValidityDatePeriod;
            thePermitValidityDatePeriod = this.getPermitValidityDatePeriod();
            strategy.appendField(locator, this, "permitValidityDatePeriod", buffer, thePermitValidityDatePeriod, (this.permitValidityDatePeriod!= null));
        }
        {
            StartAndEndDateType theTemporaryImportDatePeriod;
            theTemporaryImportDatePeriod = this.getTemporaryImportDatePeriod();
            strategy.appendField(locator, this, "temporaryImportDatePeriod", buffer, theTemporaryImportDatePeriod, (this.temporaryImportDatePeriod!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
