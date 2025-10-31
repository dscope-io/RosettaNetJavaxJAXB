
package io.dscope.rosettanet.domain.procurement.procurement.v02_27;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;
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
 * <p>Java class for FeeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DutyNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "FeeInformationType", propOrder = {
    "dutyNote",
    "extendedPrice",
    "feeType",
    "name",
    "unitPrice"
})
public class FeeInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DutyNote")
    protected String dutyNote;
    @XmlElement(name = "ExtendedPrice")
    protected FinancialAmountType extendedPrice;
    @XmlElement(name = "FeeType")
    protected String feeType;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "UnitPrice")
    protected FinancialAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the dutyNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyNote() {
        return dutyNote;
    }

    /**
     * Sets the value of the dutyNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyNote(String value) {
        this.dutyNote = value;
    }

    /**
     * Gets the value of the extendedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getExtendedPrice() {
        return extendedPrice;
    }

    /**
     * Sets the value of the extendedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setExtendedPrice(FinancialAmountType value) {
        this.extendedPrice = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeType(String value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setUnitPrice(FinancialAmountType value) {
        this.unitPrice = value;
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
        final FeeInformationType that = ((FeeInformationType) object);
        {
            String lhsDutyNote;
            lhsDutyNote = this.getDutyNote();
            String rhsDutyNote;
            rhsDutyNote = that.getDutyNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dutyNote", lhsDutyNote), LocatorUtils.property(thatLocator, "dutyNote", rhsDutyNote), lhsDutyNote, rhsDutyNote, (this.dutyNote!= null), (that.dutyNote!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsExtendedPrice;
            lhsExtendedPrice = this.getExtendedPrice();
            FinancialAmountType rhsExtendedPrice;
            rhsExtendedPrice = that.getExtendedPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extendedPrice", lhsExtendedPrice), LocatorUtils.property(thatLocator, "extendedPrice", rhsExtendedPrice), lhsExtendedPrice, rhsExtendedPrice, (this.extendedPrice!= null), (that.extendedPrice!= null))) {
                return false;
            }
        }
        {
            String lhsFeeType;
            lhsFeeType = this.getFeeType();
            String rhsFeeType;
            rhsFeeType = that.getFeeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feeType", lhsFeeType), LocatorUtils.property(thatLocator, "feeType", rhsFeeType), lhsFeeType, rhsFeeType, (this.feeType!= null), (that.feeType!= null))) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsUnitPrice;
            lhsUnitPrice = this.getUnitPrice();
            FinancialAmountType rhsUnitPrice;
            rhsUnitPrice = that.getUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitPrice", lhsUnitPrice), LocatorUtils.property(thatLocator, "unitPrice", rhsUnitPrice), lhsUnitPrice, rhsUnitPrice, (this.unitPrice!= null), (that.unitPrice!= null))) {
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
            String theDutyNote;
            theDutyNote = this.getDutyNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dutyNote", theDutyNote), currentHashCode, theDutyNote, (this.dutyNote!= null));
        }
        {
            FinancialAmountType theExtendedPrice;
            theExtendedPrice = this.getExtendedPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extendedPrice", theExtendedPrice), currentHashCode, theExtendedPrice, (this.extendedPrice!= null));
        }
        {
            String theFeeType;
            theFeeType = this.getFeeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feeType", theFeeType), currentHashCode, theFeeType, (this.feeType!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            FinancialAmountType theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitPrice", theUnitPrice), currentHashCode, theUnitPrice, (this.unitPrice!= null));
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
            String theDutyNote;
            theDutyNote = this.getDutyNote();
            strategy.appendField(locator, this, "dutyNote", buffer, theDutyNote, (this.dutyNote!= null));
        }
        {
            FinancialAmountType theExtendedPrice;
            theExtendedPrice = this.getExtendedPrice();
            strategy.appendField(locator, this, "extendedPrice", buffer, theExtendedPrice, (this.extendedPrice!= null));
        }
        {
            String theFeeType;
            theFeeType = this.getFeeType();
            strategy.appendField(locator, this, "feeType", buffer, theFeeType, (this.feeType!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            FinancialAmountType theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            strategy.appendField(locator, this, "unitPrice", buffer, theUnitPrice, (this.unitPrice!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
