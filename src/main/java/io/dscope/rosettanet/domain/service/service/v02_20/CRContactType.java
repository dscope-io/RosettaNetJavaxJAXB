
package io.dscope.rosettanet.domain.service.service.v02_20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.service.codelist.contactpreference.v01_01.ContactPreference;
import io.dscope.rosettanet.universal.contactinformation.v01_04.ContactInformationType;
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
 * <p>Java class for CRContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.04}ContactInformationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AltPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CaseOwner" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ContactPreference:xsd:codelist:01.01}ContactPreference" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRContactType", propOrder = {
    "address",
    "altPhone",
    "caseOwner",
    "contactPreference",
    "id"
})
public class CRContactType
    extends ContactInformationType
    implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "AltPhone")
    protected String altPhone;
    @XmlElement(name = "CaseOwner", required = true)
    protected String caseOwner;
    @XmlElementRef(name = "ContactPreference", namespace = "urn:rosettanet:specification:domain:Service:ContactPreference:xsd:codelist:01.01", type = ContactPreference.class, required = false)
    protected ContactPreference contactPreference;
    @XmlElement(name = "Id")
    protected String id;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the altPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhone() {
        return altPhone;
    }

    /**
     * Sets the value of the altPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhone(String value) {
        this.altPhone = value;
    }

    /**
     * Gets the value of the caseOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseOwner() {
        return caseOwner;
    }

    /**
     * Sets the value of the caseOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseOwner(String value) {
        this.caseOwner = value;
    }

    /**
     * Gets the value of the contactPreference property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPreference }
     *     
     */
    public ContactPreference getContactPreference() {
        return contactPreference;
    }

    /**
     * Sets the value of the contactPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPreference }
     *     
     */
    public void setContactPreference(ContactPreference value) {
        this.contactPreference = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CRContactType that = ((CRContactType) object);
        {
            String lhsAddress;
            lhsAddress = this.getAddress();
            String rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, (this.address!= null), (that.address!= null))) {
                return false;
            }
        }
        {
            String lhsAltPhone;
            lhsAltPhone = this.getAltPhone();
            String rhsAltPhone;
            rhsAltPhone = that.getAltPhone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "altPhone", lhsAltPhone), LocatorUtils.property(thatLocator, "altPhone", rhsAltPhone), lhsAltPhone, rhsAltPhone, (this.altPhone!= null), (that.altPhone!= null))) {
                return false;
            }
        }
        {
            String lhsCaseOwner;
            lhsCaseOwner = this.getCaseOwner();
            String rhsCaseOwner;
            rhsCaseOwner = that.getCaseOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "caseOwner", lhsCaseOwner), LocatorUtils.property(thatLocator, "caseOwner", rhsCaseOwner), lhsCaseOwner, rhsCaseOwner, (this.caseOwner!= null), (that.caseOwner!= null))) {
                return false;
            }
        }
        {
            ContactPreference lhsContactPreference;
            lhsContactPreference = this.getContactPreference();
            ContactPreference rhsContactPreference;
            rhsContactPreference = that.getContactPreference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactPreference", lhsContactPreference), LocatorUtils.property(thatLocator, "contactPreference", rhsContactPreference), lhsContactPreference, rhsContactPreference, (this.contactPreference!= null), (that.contactPreference!= null))) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theAddress;
            theAddress = this.getAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress, (this.address!= null));
        }
        {
            String theAltPhone;
            theAltPhone = this.getAltPhone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "altPhone", theAltPhone), currentHashCode, theAltPhone, (this.altPhone!= null));
        }
        {
            String theCaseOwner;
            theCaseOwner = this.getCaseOwner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "caseOwner", theCaseOwner), currentHashCode, theCaseOwner, (this.caseOwner!= null));
        }
        {
            ContactPreference theContactPreference;
            theContactPreference = this.getContactPreference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactPreference", theContactPreference), currentHashCode, theContactPreference, (this.contactPreference!= null));
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
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
        super.appendFields(locator, buffer, strategy);
        {
            String theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            String theAltPhone;
            theAltPhone = this.getAltPhone();
            strategy.appendField(locator, this, "altPhone", buffer, theAltPhone, (this.altPhone!= null));
        }
        {
            String theCaseOwner;
            theCaseOwner = this.getCaseOwner();
            strategy.appendField(locator, this, "caseOwner", buffer, theCaseOwner, (this.caseOwner!= null));
        }
        {
            ContactPreference theContactPreference;
            theContactPreference = this.getContactPreference();
            strategy.appendField(locator, this, "contactPreference", buffer, theContactPreference, (this.contactPreference!= null));
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
        }
        return buffer;
    }

}
