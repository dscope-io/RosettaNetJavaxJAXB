
package io.dscope.rosettanet.universal.partneridentification.v01_06;

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
 * <p>Java class for PartnerDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06}FullPartner"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06}IntermittentPartner"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06}KnownPartnerContact"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06}NewPartner"/&gt;
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
@XmlType(name = "PartnerDescriptionType", propOrder = {
    "fullPartner",
    "intermittentPartner",
    "knownPartnerContact",
    "newPartner"
})
public class PartnerDescriptionType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "FullPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06", type = FullPartner.class, required = false)
    protected FullPartner fullPartner;
    @XmlElementRef(name = "IntermittentPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06", type = IntermittentPartner.class, required = false)
    protected IntermittentPartner intermittentPartner;
    @XmlElementRef(name = "KnownPartnerContact", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06", type = KnownPartnerContact.class, required = false)
    protected KnownPartnerContact knownPartnerContact;
    @XmlElementRef(name = "NewPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06", type = NewPartner.class, required = false)
    protected NewPartner newPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the fullPartner property.
     * 
     * @return
     *     possible object is
     *     {@link FullPartner }
     *     
     */
    public FullPartner getFullPartner() {
        return fullPartner;
    }

    /**
     * Sets the value of the fullPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullPartner }
     *     
     */
    public void setFullPartner(FullPartner value) {
        this.fullPartner = value;
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
     * Gets the value of the knownPartnerContact property.
     * 
     * @return
     *     possible object is
     *     {@link KnownPartnerContact }
     *     
     */
    public KnownPartnerContact getKnownPartnerContact() {
        return knownPartnerContact;
    }

    /**
     * Sets the value of the knownPartnerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnownPartnerContact }
     *     
     */
    public void setKnownPartnerContact(KnownPartnerContact value) {
        this.knownPartnerContact = value;
    }

    /**
     * Gets the value of the newPartner property.
     * 
     * @return
     *     possible object is
     *     {@link NewPartner }
     *     
     */
    public NewPartner getNewPartner() {
        return newPartner;
    }

    /**
     * Sets the value of the newPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewPartner }
     *     
     */
    public void setNewPartner(NewPartner value) {
        this.newPartner = value;
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
        final PartnerDescriptionType that = ((PartnerDescriptionType) object);
        {
            FullPartner lhsFullPartner;
            lhsFullPartner = this.getFullPartner();
            FullPartner rhsFullPartner;
            rhsFullPartner = that.getFullPartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fullPartner", lhsFullPartner), LocatorUtils.property(thatLocator, "fullPartner", rhsFullPartner), lhsFullPartner, rhsFullPartner, (this.fullPartner!= null), (that.fullPartner!= null))) {
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
            KnownPartnerContact lhsKnownPartnerContact;
            lhsKnownPartnerContact = this.getKnownPartnerContact();
            KnownPartnerContact rhsKnownPartnerContact;
            rhsKnownPartnerContact = that.getKnownPartnerContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "knownPartnerContact", lhsKnownPartnerContact), LocatorUtils.property(thatLocator, "knownPartnerContact", rhsKnownPartnerContact), lhsKnownPartnerContact, rhsKnownPartnerContact, (this.knownPartnerContact!= null), (that.knownPartnerContact!= null))) {
                return false;
            }
        }
        {
            NewPartner lhsNewPartner;
            lhsNewPartner = this.getNewPartner();
            NewPartner rhsNewPartner;
            rhsNewPartner = that.getNewPartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "newPartner", lhsNewPartner), LocatorUtils.property(thatLocator, "newPartner", rhsNewPartner), lhsNewPartner, rhsNewPartner, (this.newPartner!= null), (that.newPartner!= null))) {
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
            FullPartner theFullPartner;
            theFullPartner = this.getFullPartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fullPartner", theFullPartner), currentHashCode, theFullPartner, (this.fullPartner!= null));
        }
        {
            IntermittentPartner theIntermittentPartner;
            theIntermittentPartner = this.getIntermittentPartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intermittentPartner", theIntermittentPartner), currentHashCode, theIntermittentPartner, (this.intermittentPartner!= null));
        }
        {
            KnownPartnerContact theKnownPartnerContact;
            theKnownPartnerContact = this.getKnownPartnerContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "knownPartnerContact", theKnownPartnerContact), currentHashCode, theKnownPartnerContact, (this.knownPartnerContact!= null));
        }
        {
            NewPartner theNewPartner;
            theNewPartner = this.getNewPartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "newPartner", theNewPartner), currentHashCode, theNewPartner, (this.newPartner!= null));
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
            FullPartner theFullPartner;
            theFullPartner = this.getFullPartner();
            strategy.appendField(locator, this, "fullPartner", buffer, theFullPartner, (this.fullPartner!= null));
        }
        {
            IntermittentPartner theIntermittentPartner;
            theIntermittentPartner = this.getIntermittentPartner();
            strategy.appendField(locator, this, "intermittentPartner", buffer, theIntermittentPartner, (this.intermittentPartner!= null));
        }
        {
            KnownPartnerContact theKnownPartnerContact;
            theKnownPartnerContact = this.getKnownPartnerContact();
            strategy.appendField(locator, this, "knownPartnerContact", buffer, theKnownPartnerContact, (this.knownPartnerContact!= null));
        }
        {
            NewPartner theNewPartner;
            theNewPartner = this.getNewPartner();
            strategy.appendField(locator, this, "newPartner", buffer, theNewPartner, (this.newPartner!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
