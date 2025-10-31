
package io.dscope.rosettanet.universal.partneridentification.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.contactinformation.v01_00.ContactInformation;
import io.dscope.rosettanet.universal.locations.v01_00.PhysicalAddress;
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
 * <p>Java class for SpecifiedIntermittentPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedIntermittentPartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:1.0}ContactInformation"/&gt;
 *         &lt;element name="PartnerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:1.0}PhysicalAddress"/&gt;
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
@XmlType(name = "SpecifiedIntermittentPartnerType", propOrder = {
    "contactInformation",
    "partnerName",
    "physicalAddress"
})
@XmlSeeAlso({
    IntermittentPartnerType.class
})
public class SpecifiedIntermittentPartnerType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ContactInformation", namespace = "urn:rosettanet:specification:universal:ContactInformation:xsd:schema:1.0", type = ContactInformation.class)
    protected ContactInformation contactInformation;
    @XmlElement(name = "PartnerName", required = true)
    protected String partnerName;
    @XmlElementRef(name = "PhysicalAddress", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:1.0", type = PhysicalAddress.class)
    protected PhysicalAddress physicalAddress;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation }
     *     
     */
    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation }
     *     
     */
    public void setContactInformation(ContactInformation value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the partnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the value of the partnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerName(String value) {
        this.partnerName = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setPhysicalAddress(PhysicalAddress value) {
        this.physicalAddress = value;
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
        final SpecifiedIntermittentPartnerType that = ((SpecifiedIntermittentPartnerType) object);
        {
            ContactInformation lhsContactInformation;
            lhsContactInformation = this.getContactInformation();
            ContactInformation rhsContactInformation;
            rhsContactInformation = that.getContactInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactInformation", lhsContactInformation), LocatorUtils.property(thatLocator, "contactInformation", rhsContactInformation), lhsContactInformation, rhsContactInformation, (this.contactInformation!= null), (that.contactInformation!= null))) {
                return false;
            }
        }
        {
            String lhsPartnerName;
            lhsPartnerName = this.getPartnerName();
            String rhsPartnerName;
            rhsPartnerName = that.getPartnerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerName", lhsPartnerName), LocatorUtils.property(thatLocator, "partnerName", rhsPartnerName), lhsPartnerName, rhsPartnerName, (this.partnerName!= null), (that.partnerName!= null))) {
                return false;
            }
        }
        {
            PhysicalAddress lhsPhysicalAddress;
            lhsPhysicalAddress = this.getPhysicalAddress();
            PhysicalAddress rhsPhysicalAddress;
            rhsPhysicalAddress = that.getPhysicalAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "physicalAddress", lhsPhysicalAddress), LocatorUtils.property(thatLocator, "physicalAddress", rhsPhysicalAddress), lhsPhysicalAddress, rhsPhysicalAddress, (this.physicalAddress!= null), (that.physicalAddress!= null))) {
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
            ContactInformation theContactInformation;
            theContactInformation = this.getContactInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactInformation", theContactInformation), currentHashCode, theContactInformation, (this.contactInformation!= null));
        }
        {
            String thePartnerName;
            thePartnerName = this.getPartnerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerName", thePartnerName), currentHashCode, thePartnerName, (this.partnerName!= null));
        }
        {
            PhysicalAddress thePhysicalAddress;
            thePhysicalAddress = this.getPhysicalAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "physicalAddress", thePhysicalAddress), currentHashCode, thePhysicalAddress, (this.physicalAddress!= null));
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
            ContactInformation theContactInformation;
            theContactInformation = this.getContactInformation();
            strategy.appendField(locator, this, "contactInformation", buffer, theContactInformation, (this.contactInformation!= null));
        }
        {
            String thePartnerName;
            thePartnerName = this.getPartnerName();
            strategy.appendField(locator, this, "partnerName", buffer, thePartnerName, (this.partnerName!= null));
        }
        {
            PhysicalAddress thePhysicalAddress;
            thePhysicalAddress = this.getPhysicalAddress();
            strategy.appendField(locator, this, "physicalAddress", buffer, thePhysicalAddress, (this.physicalAddress!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
