
package io.dscope.rosettanet.domain.procurement.procurement.v01_21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for TaxExemptStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxExemptStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.21}TaxExemption" minOccurs="0"/&gt;
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
@XmlType(name = "TaxExemptStatusType", propOrder = {
    "isTaxExempt",
    "taxExemption"
})
public class TaxExemptStatusType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "IsTaxExempt")
    protected boolean isTaxExempt;
    @XmlElementRef(name = "TaxExemption", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.21", type = TaxExemption.class, required = false)
    protected TaxExemption taxExemption;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isTaxExempt property.
     * 
     */
    public boolean isIsTaxExempt() {
        return isTaxExempt;
    }

    /**
     * Sets the value of the isTaxExempt property.
     * 
     */
    public void setIsTaxExempt(boolean value) {
        this.isTaxExempt = value;
    }

    /**
     * Gets the value of the taxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemption }
     *     
     */
    public TaxExemption getTaxExemption() {
        return taxExemption;
    }

    /**
     * Sets the value of the taxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemption }
     *     
     */
    public void setTaxExemption(TaxExemption value) {
        this.taxExemption = value;
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
        final TaxExemptStatusType that = ((TaxExemptStatusType) object);
        {
            boolean lhsIsTaxExempt;
            lhsIsTaxExempt = this.isIsTaxExempt();
            boolean rhsIsTaxExempt;
            rhsIsTaxExempt = that.isIsTaxExempt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isTaxExempt", lhsIsTaxExempt), LocatorUtils.property(thatLocator, "isTaxExempt", rhsIsTaxExempt), lhsIsTaxExempt, rhsIsTaxExempt, true, true)) {
                return false;
            }
        }
        {
            TaxExemption lhsTaxExemption;
            lhsTaxExemption = this.getTaxExemption();
            TaxExemption rhsTaxExemption;
            rhsTaxExemption = that.getTaxExemption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxExemption", lhsTaxExemption), LocatorUtils.property(thatLocator, "taxExemption", rhsTaxExemption), lhsTaxExemption, rhsTaxExemption, (this.taxExemption!= null), (that.taxExemption!= null))) {
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
            boolean theIsTaxExempt;
            theIsTaxExempt = this.isIsTaxExempt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isTaxExempt", theIsTaxExempt), currentHashCode, theIsTaxExempt, true);
        }
        {
            TaxExemption theTaxExemption;
            theTaxExemption = this.getTaxExemption();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxExemption", theTaxExemption), currentHashCode, theTaxExemption, (this.taxExemption!= null));
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
            boolean theIsTaxExempt;
            theIsTaxExempt = this.isIsTaxExempt();
            strategy.appendField(locator, this, "isTaxExempt", buffer, theIsTaxExempt, true);
        }
        {
            TaxExemption theTaxExemption;
            theTaxExemption = this.getTaxExemption();
            strategy.appendField(locator, this, "taxExemption", buffer, theTaxExemption, (this.taxExemption!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
