
package io.dscope.rosettanet.universal.partneridentification.v01_15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for SpecifiedPartnerDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedPartnerDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.15}SpecifiedFullPartner"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.15}SpecifiedIntermittentPartner"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.15}SpecifiedKnownPartnerContact"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.15}SpecifiedNewPartner"/&gt;
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
@XmlType(name = "SpecifiedPartnerDescriptionType", propOrder = {
    "specifiedFullPartner",
    "specifiedIntermittentPartner",
    "specifiedKnownPartnerContact",
    "specifiedNewPartner"
})
public class SpecifiedPartnerDescriptionType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "SpecifiedFullPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.15", type = SpecifiedFullPartner.class, required = false)
    protected SpecifiedFullPartner specifiedFullPartner;
    @XmlElementRef(name = "SpecifiedIntermittentPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.15", type = SpecifiedIntermittentPartner.class, required = false)
    protected SpecifiedIntermittentPartner specifiedIntermittentPartner;
    @XmlElementRef(name = "SpecifiedKnownPartnerContact", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.15", type = SpecifiedKnownPartnerContact.class, required = false)
    protected SpecifiedKnownPartnerContact specifiedKnownPartnerContact;
    @XmlElementRef(name = "SpecifiedNewPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.15", type = SpecifiedNewPartner.class, required = false)
    protected SpecifiedNewPartner specifiedNewPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the specifiedFullPartner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedFullPartner }
     *     
     */
    public SpecifiedFullPartner getSpecifiedFullPartner() {
        return specifiedFullPartner;
    }

    /**
     * Sets the value of the specifiedFullPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedFullPartner }
     *     
     */
    public void setSpecifiedFullPartner(SpecifiedFullPartner value) {
        this.specifiedFullPartner = value;
    }

    /**
     * Gets the value of the specifiedIntermittentPartner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedIntermittentPartner }
     *     
     */
    public SpecifiedIntermittentPartner getSpecifiedIntermittentPartner() {
        return specifiedIntermittentPartner;
    }

    /**
     * Sets the value of the specifiedIntermittentPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedIntermittentPartner }
     *     
     */
    public void setSpecifiedIntermittentPartner(SpecifiedIntermittentPartner value) {
        this.specifiedIntermittentPartner = value;
    }

    /**
     * Gets the value of the specifiedKnownPartnerContact property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedKnownPartnerContact }
     *     
     */
    public SpecifiedKnownPartnerContact getSpecifiedKnownPartnerContact() {
        return specifiedKnownPartnerContact;
    }

    /**
     * Sets the value of the specifiedKnownPartnerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedKnownPartnerContact }
     *     
     */
    public void setSpecifiedKnownPartnerContact(SpecifiedKnownPartnerContact value) {
        this.specifiedKnownPartnerContact = value;
    }

    /**
     * Gets the value of the specifiedNewPartner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedNewPartner }
     *     
     */
    public SpecifiedNewPartner getSpecifiedNewPartner() {
        return specifiedNewPartner;
    }

    /**
     * Sets the value of the specifiedNewPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedNewPartner }
     *     
     */
    public void setSpecifiedNewPartner(SpecifiedNewPartner value) {
        this.specifiedNewPartner = value;
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
        final SpecifiedPartnerDescriptionType that = ((SpecifiedPartnerDescriptionType) object);
        {
            SpecifiedFullPartner lhsSpecifiedFullPartner;
            lhsSpecifiedFullPartner = this.getSpecifiedFullPartner();
            SpecifiedFullPartner rhsSpecifiedFullPartner;
            rhsSpecifiedFullPartner = that.getSpecifiedFullPartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specifiedFullPartner", lhsSpecifiedFullPartner), LocatorUtils.property(thatLocator, "specifiedFullPartner", rhsSpecifiedFullPartner), lhsSpecifiedFullPartner, rhsSpecifiedFullPartner, (this.specifiedFullPartner!= null), (that.specifiedFullPartner!= null))) {
                return false;
            }
        }
        {
            SpecifiedIntermittentPartner lhsSpecifiedIntermittentPartner;
            lhsSpecifiedIntermittentPartner = this.getSpecifiedIntermittentPartner();
            SpecifiedIntermittentPartner rhsSpecifiedIntermittentPartner;
            rhsSpecifiedIntermittentPartner = that.getSpecifiedIntermittentPartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specifiedIntermittentPartner", lhsSpecifiedIntermittentPartner), LocatorUtils.property(thatLocator, "specifiedIntermittentPartner", rhsSpecifiedIntermittentPartner), lhsSpecifiedIntermittentPartner, rhsSpecifiedIntermittentPartner, (this.specifiedIntermittentPartner!= null), (that.specifiedIntermittentPartner!= null))) {
                return false;
            }
        }
        {
            SpecifiedKnownPartnerContact lhsSpecifiedKnownPartnerContact;
            lhsSpecifiedKnownPartnerContact = this.getSpecifiedKnownPartnerContact();
            SpecifiedKnownPartnerContact rhsSpecifiedKnownPartnerContact;
            rhsSpecifiedKnownPartnerContact = that.getSpecifiedKnownPartnerContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specifiedKnownPartnerContact", lhsSpecifiedKnownPartnerContact), LocatorUtils.property(thatLocator, "specifiedKnownPartnerContact", rhsSpecifiedKnownPartnerContact), lhsSpecifiedKnownPartnerContact, rhsSpecifiedKnownPartnerContact, (this.specifiedKnownPartnerContact!= null), (that.specifiedKnownPartnerContact!= null))) {
                return false;
            }
        }
        {
            SpecifiedNewPartner lhsSpecifiedNewPartner;
            lhsSpecifiedNewPartner = this.getSpecifiedNewPartner();
            SpecifiedNewPartner rhsSpecifiedNewPartner;
            rhsSpecifiedNewPartner = that.getSpecifiedNewPartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specifiedNewPartner", lhsSpecifiedNewPartner), LocatorUtils.property(thatLocator, "specifiedNewPartner", rhsSpecifiedNewPartner), lhsSpecifiedNewPartner, rhsSpecifiedNewPartner, (this.specifiedNewPartner!= null), (that.specifiedNewPartner!= null))) {
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
            SpecifiedFullPartner theSpecifiedFullPartner;
            theSpecifiedFullPartner = this.getSpecifiedFullPartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specifiedFullPartner", theSpecifiedFullPartner), currentHashCode, theSpecifiedFullPartner, (this.specifiedFullPartner!= null));
        }
        {
            SpecifiedIntermittentPartner theSpecifiedIntermittentPartner;
            theSpecifiedIntermittentPartner = this.getSpecifiedIntermittentPartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specifiedIntermittentPartner", theSpecifiedIntermittentPartner), currentHashCode, theSpecifiedIntermittentPartner, (this.specifiedIntermittentPartner!= null));
        }
        {
            SpecifiedKnownPartnerContact theSpecifiedKnownPartnerContact;
            theSpecifiedKnownPartnerContact = this.getSpecifiedKnownPartnerContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specifiedKnownPartnerContact", theSpecifiedKnownPartnerContact), currentHashCode, theSpecifiedKnownPartnerContact, (this.specifiedKnownPartnerContact!= null));
        }
        {
            SpecifiedNewPartner theSpecifiedNewPartner;
            theSpecifiedNewPartner = this.getSpecifiedNewPartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specifiedNewPartner", theSpecifiedNewPartner), currentHashCode, theSpecifiedNewPartner, (this.specifiedNewPartner!= null));
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
            SpecifiedFullPartner theSpecifiedFullPartner;
            theSpecifiedFullPartner = this.getSpecifiedFullPartner();
            strategy.appendField(locator, this, "specifiedFullPartner", buffer, theSpecifiedFullPartner, (this.specifiedFullPartner!= null));
        }
        {
            SpecifiedIntermittentPartner theSpecifiedIntermittentPartner;
            theSpecifiedIntermittentPartner = this.getSpecifiedIntermittentPartner();
            strategy.appendField(locator, this, "specifiedIntermittentPartner", buffer, theSpecifiedIntermittentPartner, (this.specifiedIntermittentPartner!= null));
        }
        {
            SpecifiedKnownPartnerContact theSpecifiedKnownPartnerContact;
            theSpecifiedKnownPartnerContact = this.getSpecifiedKnownPartnerContact();
            strategy.appendField(locator, this, "specifiedKnownPartnerContact", buffer, theSpecifiedKnownPartnerContact, (this.specifiedKnownPartnerContact!= null));
        }
        {
            SpecifiedNewPartner theSpecifiedNewPartner;
            theSpecifiedNewPartner = this.getSpecifiedNewPartner();
            strategy.appendField(locator, this, "specifiedNewPartner", buffer, theSpecifiedNewPartner, (this.specifiedNewPartner!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
