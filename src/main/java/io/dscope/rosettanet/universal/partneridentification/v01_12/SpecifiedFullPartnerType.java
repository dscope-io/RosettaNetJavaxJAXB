
package io.dscope.rosettanet.universal.partneridentification.v01_12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.contactinformation.v01_03.ContactInformation;
import io.dscope.rosettanet.universal.locations.v01_04.Location;
import io.dscope.rosettanet.universal.locations.v01_04.PhysicalAddress;
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
 * <p>Java class for SpecifiedFullPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedFullPartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03}ContactInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}Location" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}PartnerIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}PhysicalAddress" minOccurs="0"/&gt;
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
@XmlType(name = "SpecifiedFullPartnerType", propOrder = {
    "contactInformation",
    "location",
    "partnerIdentification",
    "physicalAddress"
})
@XmlSeeAlso({
    FullPartnerType.class
})
public class SpecifiedFullPartnerType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ContactInformation", namespace = "urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03", type = ContactInformation.class, required = false)
    protected List<ContactInformation> contactInformation;
    @XmlElementRef(name = "Location", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = Location.class, required = false)
    protected Location location;
    @XmlElementRef(name = "PartnerIdentification", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", type = PartnerIdentification.class, required = false)
    protected List<PartnerIdentification> partnerIdentification;
    @XmlElementRef(name = "PhysicalAddress", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = PhysicalAddress.class, required = false)
    protected PhysicalAddress physicalAddress;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformation }
     * 
     * 
     */
    public List<ContactInformation> getContactInformation() {
        if (contactInformation == null) {
            contactInformation = new ArrayList<ContactInformation>();
        }
        return this.contactInformation;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the partnerIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerIdentification }
     * 
     * 
     */
    public List<PartnerIdentification> getPartnerIdentification() {
        if (partnerIdentification == null) {
            partnerIdentification = new ArrayList<PartnerIdentification>();
        }
        return this.partnerIdentification;
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
        final SpecifiedFullPartnerType that = ((SpecifiedFullPartnerType) object);
        {
            List<ContactInformation> lhsContactInformation;
            lhsContactInformation = (((this.contactInformation!= null)&&(!this.contactInformation.isEmpty()))?this.getContactInformation():null);
            List<ContactInformation> rhsContactInformation;
            rhsContactInformation = (((that.contactInformation!= null)&&(!that.contactInformation.isEmpty()))?that.getContactInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactInformation", lhsContactInformation), LocatorUtils.property(thatLocator, "contactInformation", rhsContactInformation), lhsContactInformation, rhsContactInformation, ((this.contactInformation!= null)&&(!this.contactInformation.isEmpty())), ((that.contactInformation!= null)&&(!that.contactInformation.isEmpty())))) {
                return false;
            }
        }
        {
            Location lhsLocation;
            lhsLocation = this.getLocation();
            Location rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation, (this.location!= null), (that.location!= null))) {
                return false;
            }
        }
        {
            List<PartnerIdentification> lhsPartnerIdentification;
            lhsPartnerIdentification = (((this.partnerIdentification!= null)&&(!this.partnerIdentification.isEmpty()))?this.getPartnerIdentification():null);
            List<PartnerIdentification> rhsPartnerIdentification;
            rhsPartnerIdentification = (((that.partnerIdentification!= null)&&(!that.partnerIdentification.isEmpty()))?that.getPartnerIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerIdentification", lhsPartnerIdentification), LocatorUtils.property(thatLocator, "partnerIdentification", rhsPartnerIdentification), lhsPartnerIdentification, rhsPartnerIdentification, ((this.partnerIdentification!= null)&&(!this.partnerIdentification.isEmpty())), ((that.partnerIdentification!= null)&&(!that.partnerIdentification.isEmpty())))) {
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
            List<ContactInformation> theContactInformation;
            theContactInformation = (((this.contactInformation!= null)&&(!this.contactInformation.isEmpty()))?this.getContactInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactInformation", theContactInformation), currentHashCode, theContactInformation, ((this.contactInformation!= null)&&(!this.contactInformation.isEmpty())));
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation, (this.location!= null));
        }
        {
            List<PartnerIdentification> thePartnerIdentification;
            thePartnerIdentification = (((this.partnerIdentification!= null)&&(!this.partnerIdentification.isEmpty()))?this.getPartnerIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerIdentification", thePartnerIdentification), currentHashCode, thePartnerIdentification, ((this.partnerIdentification!= null)&&(!this.partnerIdentification.isEmpty())));
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
            List<ContactInformation> theContactInformation;
            theContactInformation = (((this.contactInformation!= null)&&(!this.contactInformation.isEmpty()))?this.getContactInformation():null);
            strategy.appendField(locator, this, "contactInformation", buffer, theContactInformation, ((this.contactInformation!= null)&&(!this.contactInformation.isEmpty())));
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation, (this.location!= null));
        }
        {
            List<PartnerIdentification> thePartnerIdentification;
            thePartnerIdentification = (((this.partnerIdentification!= null)&&(!this.partnerIdentification.isEmpty()))?this.getPartnerIdentification():null);
            strategy.appendField(locator, this, "partnerIdentification", buffer, thePartnerIdentification, ((this.partnerIdentification!= null)&&(!this.partnerIdentification.isEmpty())));
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
