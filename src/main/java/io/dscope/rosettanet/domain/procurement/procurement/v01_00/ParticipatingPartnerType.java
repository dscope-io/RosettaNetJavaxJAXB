
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.monetaryexpression.v01_00.TaxJurisdiction;
import io.dscope.rosettanet.universal.partneridentification.v01_00.IntermittentPartner;
import io.dscope.rosettanet.universal.partneridentification.v01_00.KnownPartner;
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
 * <p>Java class for ParticipatingPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipatingPartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0}TaxJurisdiction" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}IntermittentPartner"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}KnownPartner"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "ParticipatingPartnerType", propOrder = {
    "taxJurisdiction",
    "intermittentPartner",
    "knownPartner"
})
public class ParticipatingPartnerType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "TaxJurisdiction", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0", type = TaxJurisdiction.class, required = false)
    protected TaxJurisdiction taxJurisdiction;
    @XmlElementRef(name = "IntermittentPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", type = IntermittentPartner.class, required = false)
    protected IntermittentPartner intermittentPartner;
    @XmlElementRef(name = "KnownPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", type = KnownPartner.class, required = false)
    protected KnownPartner knownPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the taxJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link TaxJurisdiction }
     *     
     */
    public TaxJurisdiction getTaxJurisdiction() {
        return taxJurisdiction;
    }

    /**
     * Sets the value of the taxJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdiction }
     *     
     */
    public void setTaxJurisdiction(TaxJurisdiction value) {
        this.taxJurisdiction = value;
    }

    /**
     * Gets the value of the intermittentPartner property.
     * 
     * @return
     *     possible object is
     *     {@link IntermittentPartner }
     *     
     */
    public IntermittentPartner getIntermittentPartner() {
        return intermittentPartner;
    }

    /**
     * Sets the value of the intermittentPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermittentPartner }
     *     
     */
    public void setIntermittentPartner(IntermittentPartner value) {
        this.intermittentPartner = value;
    }

    /**
     * Gets the value of the knownPartner property.
     * 
     * @return
     *     possible object is
     *     {@link KnownPartner }
     *     
     */
    public KnownPartner getKnownPartner() {
        return knownPartner;
    }

    /**
     * Sets the value of the knownPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnownPartner }
     *     
     */
    public void setKnownPartner(KnownPartner value) {
        this.knownPartner = value;
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
        final ParticipatingPartnerType that = ((ParticipatingPartnerType) object);
        {
            TaxJurisdiction lhsTaxJurisdiction;
            lhsTaxJurisdiction = this.getTaxJurisdiction();
            TaxJurisdiction rhsTaxJurisdiction;
            rhsTaxJurisdiction = that.getTaxJurisdiction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxJurisdiction", lhsTaxJurisdiction), LocatorUtils.property(thatLocator, "taxJurisdiction", rhsTaxJurisdiction), lhsTaxJurisdiction, rhsTaxJurisdiction, (this.taxJurisdiction!= null), (that.taxJurisdiction!= null))) {
                return false;
            }
        }
        {
            IntermittentPartner lhsIntermittentPartner;
            lhsIntermittentPartner = this.getIntermittentPartner();
            IntermittentPartner rhsIntermittentPartner;
            rhsIntermittentPartner = that.getIntermittentPartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intermittentPartner", lhsIntermittentPartner), LocatorUtils.property(thatLocator, "intermittentPartner", rhsIntermittentPartner), lhsIntermittentPartner, rhsIntermittentPartner, (this.intermittentPartner!= null), (that.intermittentPartner!= null))) {
                return false;
            }
        }
        {
            KnownPartner lhsKnownPartner;
            lhsKnownPartner = this.getKnownPartner();
            KnownPartner rhsKnownPartner;
            rhsKnownPartner = that.getKnownPartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "knownPartner", lhsKnownPartner), LocatorUtils.property(thatLocator, "knownPartner", rhsKnownPartner), lhsKnownPartner, rhsKnownPartner, (this.knownPartner!= null), (that.knownPartner!= null))) {
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
            TaxJurisdiction theTaxJurisdiction;
            theTaxJurisdiction = this.getTaxJurisdiction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxJurisdiction", theTaxJurisdiction), currentHashCode, theTaxJurisdiction, (this.taxJurisdiction!= null));
        }
        {
            IntermittentPartner theIntermittentPartner;
            theIntermittentPartner = this.getIntermittentPartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intermittentPartner", theIntermittentPartner), currentHashCode, theIntermittentPartner, (this.intermittentPartner!= null));
        }
        {
            KnownPartner theKnownPartner;
            theKnownPartner = this.getKnownPartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "knownPartner", theKnownPartner), currentHashCode, theKnownPartner, (this.knownPartner!= null));
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
            TaxJurisdiction theTaxJurisdiction;
            theTaxJurisdiction = this.getTaxJurisdiction();
            strategy.appendField(locator, this, "taxJurisdiction", buffer, theTaxJurisdiction, (this.taxJurisdiction!= null));
        }
        {
            IntermittentPartner theIntermittentPartner;
            theIntermittentPartner = this.getIntermittentPartner();
            strategy.appendField(locator, this, "intermittentPartner", buffer, theIntermittentPartner, (this.intermittentPartner!= null));
        }
        {
            KnownPartner theKnownPartner;
            theKnownPartner = this.getKnownPartner();
            strategy.appendField(locator, this, "knownPartner", buffer, theKnownPartner, (this.knownPartner!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
