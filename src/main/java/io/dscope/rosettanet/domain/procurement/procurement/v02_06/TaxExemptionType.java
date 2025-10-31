
package io.dscope.rosettanet.domain.procurement.procurement.v02_06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.taxexemptioncode.v01_03.TaxExemptionCode;
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
 * <p>Java class for TaxExemptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxExemptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:01.03}TaxExemptionCode"/&gt;
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
@XmlType(name = "TaxExemptionType", propOrder = {
    "certificationIdentifier",
    "mode",
    "taxExemptionCode"
})
public class TaxExemptionType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CertificationIdentifier")
    protected String certificationIdentifier;
    @XmlElement(name = "Mode")
    protected String mode;
    @XmlElementRef(name = "TaxExemptionCode", namespace = "urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:01.03", type = TaxExemptionCode.class)
    protected TaxExemptionCode taxExemptionCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the certificationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationIdentifier() {
        return certificationIdentifier;
    }

    /**
     * Sets the value of the certificationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationIdentifier(String value) {
        this.certificationIdentifier = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the taxExemptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionCode }
     *     
     */
    public TaxExemptionCode getTaxExemptionCode() {
        return taxExemptionCode;
    }

    /**
     * Sets the value of the taxExemptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionCode }
     *     
     */
    public void setTaxExemptionCode(TaxExemptionCode value) {
        this.taxExemptionCode = value;
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
        final TaxExemptionType that = ((TaxExemptionType) object);
        {
            String lhsCertificationIdentifier;
            lhsCertificationIdentifier = this.getCertificationIdentifier();
            String rhsCertificationIdentifier;
            rhsCertificationIdentifier = that.getCertificationIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certificationIdentifier", lhsCertificationIdentifier), LocatorUtils.property(thatLocator, "certificationIdentifier", rhsCertificationIdentifier), lhsCertificationIdentifier, rhsCertificationIdentifier, (this.certificationIdentifier!= null), (that.certificationIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsMode;
            lhsMode = this.getMode();
            String rhsMode;
            rhsMode = that.getMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mode", lhsMode), LocatorUtils.property(thatLocator, "mode", rhsMode), lhsMode, rhsMode, (this.mode!= null), (that.mode!= null))) {
                return false;
            }
        }
        {
            TaxExemptionCode lhsTaxExemptionCode;
            lhsTaxExemptionCode = this.getTaxExemptionCode();
            TaxExemptionCode rhsTaxExemptionCode;
            rhsTaxExemptionCode = that.getTaxExemptionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxExemptionCode", lhsTaxExemptionCode), LocatorUtils.property(thatLocator, "taxExemptionCode", rhsTaxExemptionCode), lhsTaxExemptionCode, rhsTaxExemptionCode, (this.taxExemptionCode!= null), (that.taxExemptionCode!= null))) {
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
            String theCertificationIdentifier;
            theCertificationIdentifier = this.getCertificationIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certificationIdentifier", theCertificationIdentifier), currentHashCode, theCertificationIdentifier, (this.certificationIdentifier!= null));
        }
        {
            String theMode;
            theMode = this.getMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mode", theMode), currentHashCode, theMode, (this.mode!= null));
        }
        {
            TaxExemptionCode theTaxExemptionCode;
            theTaxExemptionCode = this.getTaxExemptionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxExemptionCode", theTaxExemptionCode), currentHashCode, theTaxExemptionCode, (this.taxExemptionCode!= null));
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
            String theCertificationIdentifier;
            theCertificationIdentifier = this.getCertificationIdentifier();
            strategy.appendField(locator, this, "certificationIdentifier", buffer, theCertificationIdentifier, (this.certificationIdentifier!= null));
        }
        {
            String theMode;
            theMode = this.getMode();
            strategy.appendField(locator, this, "mode", buffer, theMode, (this.mode!= null));
        }
        {
            TaxExemptionCode theTaxExemptionCode;
            theTaxExemptionCode = this.getTaxExemptionCode();
            strategy.appendField(locator, this, "taxExemptionCode", buffer, theTaxExemptionCode, (this.taxExemptionCode!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
