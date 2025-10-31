
package io.dscope.rosettanet.domain.procurement.procurement.v01_21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.dates.v01_01.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_01.BusinessDocumentReferenceType;
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
 * <p>Java class for PriceConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceConditionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="GeneralServiceAdministrationNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPriceCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPricingDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.01}DatePeriodType" minOccurs="0"/&gt;
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
@XmlType(name = "PriceConditionType", propOrder = {
    "contractIdentifier",
    "generalServiceAdministrationNumber",
    "specialPriceCondition",
    "specialPricingDatePeriod"
})
public class PriceConditionType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ContractIdentifier")
    protected BusinessDocumentReferenceType contractIdentifier;
    @XmlElement(name = "GeneralServiceAdministrationNumber")
    protected BusinessDocumentReferenceType generalServiceAdministrationNumber;
    @XmlElement(name = "SpecialPriceCondition")
    protected String specialPriceCondition;
    @XmlElement(name = "SpecialPricingDatePeriod")
    protected DatePeriodType specialPricingDatePeriod;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getContractIdentifier() {
        return contractIdentifier;
    }

    /**
     * Sets the value of the contractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setContractIdentifier(BusinessDocumentReferenceType value) {
        this.contractIdentifier = value;
    }

    /**
     * Gets the value of the generalServiceAdministrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getGeneralServiceAdministrationNumber() {
        return generalServiceAdministrationNumber;
    }

    /**
     * Sets the value of the generalServiceAdministrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setGeneralServiceAdministrationNumber(BusinessDocumentReferenceType value) {
        this.generalServiceAdministrationNumber = value;
    }

    /**
     * Gets the value of the specialPriceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialPriceCondition() {
        return specialPriceCondition;
    }

    /**
     * Sets the value of the specialPriceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialPriceCondition(String value) {
        this.specialPriceCondition = value;
    }

    /**
     * Gets the value of the specialPricingDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getSpecialPricingDatePeriod() {
        return specialPricingDatePeriod;
    }

    /**
     * Sets the value of the specialPricingDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setSpecialPricingDatePeriod(DatePeriodType value) {
        this.specialPricingDatePeriod = value;
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
        final PriceConditionType that = ((PriceConditionType) object);
        {
            BusinessDocumentReferenceType lhsContractIdentifier;
            lhsContractIdentifier = this.getContractIdentifier();
            BusinessDocumentReferenceType rhsContractIdentifier;
            rhsContractIdentifier = that.getContractIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractIdentifier", lhsContractIdentifier), LocatorUtils.property(thatLocator, "contractIdentifier", rhsContractIdentifier), lhsContractIdentifier, rhsContractIdentifier, (this.contractIdentifier!= null), (that.contractIdentifier!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsGeneralServiceAdministrationNumber;
            lhsGeneralServiceAdministrationNumber = this.getGeneralServiceAdministrationNumber();
            BusinessDocumentReferenceType rhsGeneralServiceAdministrationNumber;
            rhsGeneralServiceAdministrationNumber = that.getGeneralServiceAdministrationNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "generalServiceAdministrationNumber", lhsGeneralServiceAdministrationNumber), LocatorUtils.property(thatLocator, "generalServiceAdministrationNumber", rhsGeneralServiceAdministrationNumber), lhsGeneralServiceAdministrationNumber, rhsGeneralServiceAdministrationNumber, (this.generalServiceAdministrationNumber!= null), (that.generalServiceAdministrationNumber!= null))) {
                return false;
            }
        }
        {
            String lhsSpecialPriceCondition;
            lhsSpecialPriceCondition = this.getSpecialPriceCondition();
            String rhsSpecialPriceCondition;
            rhsSpecialPriceCondition = that.getSpecialPriceCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialPriceCondition", lhsSpecialPriceCondition), LocatorUtils.property(thatLocator, "specialPriceCondition", rhsSpecialPriceCondition), lhsSpecialPriceCondition, rhsSpecialPriceCondition, (this.specialPriceCondition!= null), (that.specialPriceCondition!= null))) {
                return false;
            }
        }
        {
            DatePeriodType lhsSpecialPricingDatePeriod;
            lhsSpecialPricingDatePeriod = this.getSpecialPricingDatePeriod();
            DatePeriodType rhsSpecialPricingDatePeriod;
            rhsSpecialPricingDatePeriod = that.getSpecialPricingDatePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialPricingDatePeriod", lhsSpecialPricingDatePeriod), LocatorUtils.property(thatLocator, "specialPricingDatePeriod", rhsSpecialPricingDatePeriod), lhsSpecialPricingDatePeriod, rhsSpecialPricingDatePeriod, (this.specialPricingDatePeriod!= null), (that.specialPricingDatePeriod!= null))) {
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
            BusinessDocumentReferenceType theContractIdentifier;
            theContractIdentifier = this.getContractIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractIdentifier", theContractIdentifier), currentHashCode, theContractIdentifier, (this.contractIdentifier!= null));
        }
        {
            BusinessDocumentReferenceType theGeneralServiceAdministrationNumber;
            theGeneralServiceAdministrationNumber = this.getGeneralServiceAdministrationNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "generalServiceAdministrationNumber", theGeneralServiceAdministrationNumber), currentHashCode, theGeneralServiceAdministrationNumber, (this.generalServiceAdministrationNumber!= null));
        }
        {
            String theSpecialPriceCondition;
            theSpecialPriceCondition = this.getSpecialPriceCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialPriceCondition", theSpecialPriceCondition), currentHashCode, theSpecialPriceCondition, (this.specialPriceCondition!= null));
        }
        {
            DatePeriodType theSpecialPricingDatePeriod;
            theSpecialPricingDatePeriod = this.getSpecialPricingDatePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialPricingDatePeriod", theSpecialPricingDatePeriod), currentHashCode, theSpecialPricingDatePeriod, (this.specialPricingDatePeriod!= null));
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
            BusinessDocumentReferenceType theContractIdentifier;
            theContractIdentifier = this.getContractIdentifier();
            strategy.appendField(locator, this, "contractIdentifier", buffer, theContractIdentifier, (this.contractIdentifier!= null));
        }
        {
            BusinessDocumentReferenceType theGeneralServiceAdministrationNumber;
            theGeneralServiceAdministrationNumber = this.getGeneralServiceAdministrationNumber();
            strategy.appendField(locator, this, "generalServiceAdministrationNumber", buffer, theGeneralServiceAdministrationNumber, (this.generalServiceAdministrationNumber!= null));
        }
        {
            String theSpecialPriceCondition;
            theSpecialPriceCondition = this.getSpecialPriceCondition();
            strategy.appendField(locator, this, "specialPriceCondition", buffer, theSpecialPriceCondition, (this.specialPriceCondition!= null));
        }
        {
            DatePeriodType theSpecialPricingDatePeriod;
            theSpecialPricingDatePeriod = this.getSpecialPricingDatePeriod();
            strategy.appendField(locator, this, "specialPricingDatePeriod", buffer, theSpecialPricingDatePeriod, (this.specialPricingDatePeriod!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
