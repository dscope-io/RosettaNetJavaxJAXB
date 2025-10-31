
package io.dscope.rosettanet.interchange.invoicenotification.v01_08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.nationalexportcontrolclassification.v01_03.NationalExportControlClassification;
import io.dscope.rosettanet.domain.procurement.procurement.v02_04.LotIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_03.ProductIdentification;
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
 * <p>Java class for ProductDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HarmonizedTariffScheduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04}LotIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03}NationalExportControlClassification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03}ProductIdentification"/&gt;
 *         &lt;element name="SerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ProductDescriptionType", propOrder = {
    "harmonizedTariffScheduleCode",
    "lotIdentification",
    "nationalExportControlClassification",
    "productIdentification",
    "serialIdentifier"
})
public class ProductDescriptionType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "HarmonizedTariffScheduleCode")
    protected String harmonizedTariffScheduleCode;
    @XmlElementRef(name = "LotIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04", type = LotIdentification.class, required = false)
    protected LotIdentification lotIdentification;
    @XmlElementRef(name = "NationalExportControlClassification", namespace = "urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03", type = NationalExportControlClassification.class, required = false)
    protected NationalExportControlClassification nationalExportControlClassification;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "SerialIdentifier")
    protected String serialIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the harmonizedTariffScheduleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarmonizedTariffScheduleCode() {
        return harmonizedTariffScheduleCode;
    }

    /**
     * Sets the value of the harmonizedTariffScheduleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarmonizedTariffScheduleCode(String value) {
        this.harmonizedTariffScheduleCode = value;
    }

    /**
     * Gets the value of the lotIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentification }
     *     
     */
    public LotIdentification getLotIdentification() {
        return lotIdentification;
    }

    /**
     * Sets the value of the lotIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentification }
     *     
     */
    public void setLotIdentification(LotIdentification value) {
        this.lotIdentification = value;
    }

    /**
     * Gets the value of the nationalExportControlClassification property.
     * 
     * @return
     *     possible object is
     *     {@link NationalExportControlClassification }
     *     
     */
    public NationalExportControlClassification getNationalExportControlClassification() {
        return nationalExportControlClassification;
    }

    /**
     * Sets the value of the nationalExportControlClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalExportControlClassification }
     *     
     */
    public void setNationalExportControlClassification(NationalExportControlClassification value) {
        this.nationalExportControlClassification = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the serialIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialIdentifier() {
        return serialIdentifier;
    }

    /**
     * Sets the value of the serialIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialIdentifier(String value) {
        this.serialIdentifier = value;
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
        final ProductDescriptionType that = ((ProductDescriptionType) object);
        {
            String lhsHarmonizedTariffScheduleCode;
            lhsHarmonizedTariffScheduleCode = this.getHarmonizedTariffScheduleCode();
            String rhsHarmonizedTariffScheduleCode;
            rhsHarmonizedTariffScheduleCode = that.getHarmonizedTariffScheduleCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "harmonizedTariffScheduleCode", lhsHarmonizedTariffScheduleCode), LocatorUtils.property(thatLocator, "harmonizedTariffScheduleCode", rhsHarmonizedTariffScheduleCode), lhsHarmonizedTariffScheduleCode, rhsHarmonizedTariffScheduleCode, (this.harmonizedTariffScheduleCode!= null), (that.harmonizedTariffScheduleCode!= null))) {
                return false;
            }
        }
        {
            LotIdentification lhsLotIdentification;
            lhsLotIdentification = this.getLotIdentification();
            LotIdentification rhsLotIdentification;
            rhsLotIdentification = that.getLotIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotIdentification", lhsLotIdentification), LocatorUtils.property(thatLocator, "lotIdentification", rhsLotIdentification), lhsLotIdentification, rhsLotIdentification, (this.lotIdentification!= null), (that.lotIdentification!= null))) {
                return false;
            }
        }
        {
            NationalExportControlClassification lhsNationalExportControlClassification;
            lhsNationalExportControlClassification = this.getNationalExportControlClassification();
            NationalExportControlClassification rhsNationalExportControlClassification;
            rhsNationalExportControlClassification = that.getNationalExportControlClassification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nationalExportControlClassification", lhsNationalExportControlClassification), LocatorUtils.property(thatLocator, "nationalExportControlClassification", rhsNationalExportControlClassification), lhsNationalExportControlClassification, rhsNationalExportControlClassification, (this.nationalExportControlClassification!= null), (that.nationalExportControlClassification!= null))) {
                return false;
            }
        }
        {
            ProductIdentification lhsProductIdentification;
            lhsProductIdentification = this.getProductIdentification();
            ProductIdentification rhsProductIdentification;
            rhsProductIdentification = that.getProductIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentification", lhsProductIdentification), LocatorUtils.property(thatLocator, "productIdentification", rhsProductIdentification), lhsProductIdentification, rhsProductIdentification, (this.productIdentification!= null), (that.productIdentification!= null))) {
                return false;
            }
        }
        {
            String lhsSerialIdentifier;
            lhsSerialIdentifier = this.getSerialIdentifier();
            String rhsSerialIdentifier;
            rhsSerialIdentifier = that.getSerialIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serialIdentifier", lhsSerialIdentifier), LocatorUtils.property(thatLocator, "serialIdentifier", rhsSerialIdentifier), lhsSerialIdentifier, rhsSerialIdentifier, (this.serialIdentifier!= null), (that.serialIdentifier!= null))) {
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
            String theHarmonizedTariffScheduleCode;
            theHarmonizedTariffScheduleCode = this.getHarmonizedTariffScheduleCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "harmonizedTariffScheduleCode", theHarmonizedTariffScheduleCode), currentHashCode, theHarmonizedTariffScheduleCode, (this.harmonizedTariffScheduleCode!= null));
        }
        {
            LotIdentification theLotIdentification;
            theLotIdentification = this.getLotIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotIdentification", theLotIdentification), currentHashCode, theLotIdentification, (this.lotIdentification!= null));
        }
        {
            NationalExportControlClassification theNationalExportControlClassification;
            theNationalExportControlClassification = this.getNationalExportControlClassification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nationalExportControlClassification", theNationalExportControlClassification), currentHashCode, theNationalExportControlClassification, (this.nationalExportControlClassification!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theSerialIdentifier;
            theSerialIdentifier = this.getSerialIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialIdentifier", theSerialIdentifier), currentHashCode, theSerialIdentifier, (this.serialIdentifier!= null));
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
            String theHarmonizedTariffScheduleCode;
            theHarmonizedTariffScheduleCode = this.getHarmonizedTariffScheduleCode();
            strategy.appendField(locator, this, "harmonizedTariffScheduleCode", buffer, theHarmonizedTariffScheduleCode, (this.harmonizedTariffScheduleCode!= null));
        }
        {
            LotIdentification theLotIdentification;
            theLotIdentification = this.getLotIdentification();
            strategy.appendField(locator, this, "lotIdentification", buffer, theLotIdentification, (this.lotIdentification!= null));
        }
        {
            NationalExportControlClassification theNationalExportControlClassification;
            theNationalExportControlClassification = this.getNationalExportControlClassification();
            strategy.appendField(locator, this, "nationalExportControlClassification", buffer, theNationalExportControlClassification, (this.nationalExportControlClassification!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theSerialIdentifier;
            theSerialIdentifier = this.getSerialIdentifier();
            strategy.appendField(locator, this, "serialIdentifier", buffer, theSerialIdentifier, (this.serialIdentifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
