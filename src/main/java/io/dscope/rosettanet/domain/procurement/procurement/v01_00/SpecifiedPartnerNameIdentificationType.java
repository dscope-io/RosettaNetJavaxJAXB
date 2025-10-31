
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_00.SpecifiedKnownPartner;
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
 * <p>Java class for SpecifiedPartnerNameIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedPartnerNameIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}PartnerName"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}SpecifiedKnownPartner"/&gt;
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
@XmlType(name = "SpecifiedPartnerNameIdentificationType", propOrder = {
    "partnerName",
    "specifiedKnownPartner"
})
@XmlSeeAlso({
    InstallAtSubLineType.class
})
public class SpecifiedPartnerNameIdentificationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "PartnerName", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = PartnerName.class, required = false)
    protected PartnerName partnerName;
    @XmlElementRef(name = "SpecifiedKnownPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", type = SpecifiedKnownPartner.class, required = false)
    protected SpecifiedKnownPartner specifiedKnownPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the partnerName property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerName }
     *     
     */
    public PartnerName getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the value of the partnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerName }
     *     
     */
    public void setPartnerName(PartnerName value) {
        this.partnerName = value;
    }

    /**
     * Gets the value of the specifiedKnownPartner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedKnownPartner }
     *     
     */
    public SpecifiedKnownPartner getSpecifiedKnownPartner() {
        return specifiedKnownPartner;
    }

    /**
     * Sets the value of the specifiedKnownPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedKnownPartner }
     *     
     */
    public void setSpecifiedKnownPartner(SpecifiedKnownPartner value) {
        this.specifiedKnownPartner = value;
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
        final SpecifiedPartnerNameIdentificationType that = ((SpecifiedPartnerNameIdentificationType) object);
        {
            PartnerName lhsPartnerName;
            lhsPartnerName = this.getPartnerName();
            PartnerName rhsPartnerName;
            rhsPartnerName = that.getPartnerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerName", lhsPartnerName), LocatorUtils.property(thatLocator, "partnerName", rhsPartnerName), lhsPartnerName, rhsPartnerName, (this.partnerName!= null), (that.partnerName!= null))) {
                return false;
            }
        }
        {
            SpecifiedKnownPartner lhsSpecifiedKnownPartner;
            lhsSpecifiedKnownPartner = this.getSpecifiedKnownPartner();
            SpecifiedKnownPartner rhsSpecifiedKnownPartner;
            rhsSpecifiedKnownPartner = that.getSpecifiedKnownPartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specifiedKnownPartner", lhsSpecifiedKnownPartner), LocatorUtils.property(thatLocator, "specifiedKnownPartner", rhsSpecifiedKnownPartner), lhsSpecifiedKnownPartner, rhsSpecifiedKnownPartner, (this.specifiedKnownPartner!= null), (that.specifiedKnownPartner!= null))) {
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
            PartnerName thePartnerName;
            thePartnerName = this.getPartnerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerName", thePartnerName), currentHashCode, thePartnerName, (this.partnerName!= null));
        }
        {
            SpecifiedKnownPartner theSpecifiedKnownPartner;
            theSpecifiedKnownPartner = this.getSpecifiedKnownPartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specifiedKnownPartner", theSpecifiedKnownPartner), currentHashCode, theSpecifiedKnownPartner, (this.specifiedKnownPartner!= null));
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
            PartnerName thePartnerName;
            thePartnerName = this.getPartnerName();
            strategy.appendField(locator, this, "partnerName", buffer, thePartnerName, (this.partnerName!= null));
        }
        {
            SpecifiedKnownPartner theSpecifiedKnownPartner;
            theSpecifiedKnownPartner = this.getSpecifiedKnownPartner();
            strategy.appendField(locator, this, "specifiedKnownPartner", buffer, theSpecifiedKnownPartner, (this.specifiedKnownPartner!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
