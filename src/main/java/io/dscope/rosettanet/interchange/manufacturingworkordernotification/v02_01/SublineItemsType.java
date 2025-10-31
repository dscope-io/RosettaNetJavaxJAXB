
package io.dscope.rosettanet.interchange.manufacturingworkordernotification.v02_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerDescription;
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
 * <p>Java class for SublineItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SublineItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerProfile" type="{urn:rosettanet:specification:interchange:ManufacturingWorkOrderNotification:xsd:schema:02.01}CustomerProfileType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element name="SubLineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "SublineItemsType", propOrder = {
    "customerProfile",
    "partnerDescription",
    "subLineNumber"
})
public class SublineItemsType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CustomerProfile", required = true)
    protected CustomerProfileType customerProfile;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElement(name = "SubLineNumber", required = true)
    protected String subLineNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileType }
     *     
     */
    public CustomerProfileType getCustomerProfile() {
        return customerProfile;
    }

    /**
     * Sets the value of the customerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileType }
     *     
     */
    public void setCustomerProfile(CustomerProfileType value) {
        this.customerProfile = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
    }

    /**
     * Gets the value of the subLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLineNumber() {
        return subLineNumber;
    }

    /**
     * Sets the value of the subLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLineNumber(String value) {
        this.subLineNumber = value;
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
        final SublineItemsType that = ((SublineItemsType) object);
        {
            CustomerProfileType lhsCustomerProfile;
            lhsCustomerProfile = this.getCustomerProfile();
            CustomerProfileType rhsCustomerProfile;
            rhsCustomerProfile = that.getCustomerProfile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerProfile", lhsCustomerProfile), LocatorUtils.property(thatLocator, "customerProfile", rhsCustomerProfile), lhsCustomerProfile, rhsCustomerProfile, (this.customerProfile!= null), (that.customerProfile!= null))) {
                return false;
            }
        }
        {
            PartnerDescription lhsPartnerDescription;
            lhsPartnerDescription = this.getPartnerDescription();
            PartnerDescription rhsPartnerDescription;
            rhsPartnerDescription = that.getPartnerDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, (this.partnerDescription!= null), (that.partnerDescription!= null))) {
                return false;
            }
        }
        {
            String lhsSubLineNumber;
            lhsSubLineNumber = this.getSubLineNumber();
            String rhsSubLineNumber;
            rhsSubLineNumber = that.getSubLineNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subLineNumber", lhsSubLineNumber), LocatorUtils.property(thatLocator, "subLineNumber", rhsSubLineNumber), lhsSubLineNumber, rhsSubLineNumber, (this.subLineNumber!= null), (that.subLineNumber!= null))) {
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
            CustomerProfileType theCustomerProfile;
            theCustomerProfile = this.getCustomerProfile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerProfile", theCustomerProfile), currentHashCode, theCustomerProfile, (this.customerProfile!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            String theSubLineNumber;
            theSubLineNumber = this.getSubLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subLineNumber", theSubLineNumber), currentHashCode, theSubLineNumber, (this.subLineNumber!= null));
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
            CustomerProfileType theCustomerProfile;
            theCustomerProfile = this.getCustomerProfile();
            strategy.appendField(locator, this, "customerProfile", buffer, theCustomerProfile, (this.customerProfile!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            String theSubLineNumber;
            theSubLineNumber = this.getSubLineNumber();
            strategy.appendField(locator, this, "subLineNumber", buffer, theSubLineNumber, (this.subLineNumber!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
