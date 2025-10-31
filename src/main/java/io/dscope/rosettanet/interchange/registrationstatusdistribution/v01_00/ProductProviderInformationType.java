
package io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.contactinformation.v01_03.ContactInformationType;
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
 * <p>Java class for ProductProviderInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductProviderInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comments" type="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}ProductProviderCommentsType" minOccurs="0"/&gt;
 *         &lt;element name="FieldApplicationEngineer" type="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03}ContactInformationType" minOccurs="0"/&gt;
 *         &lt;element name="SalesRepresentative" type="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03}ContactInformationType" minOccurs="0"/&gt;
 *         &lt;element name="TrackingIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ProductProviderInformationType", propOrder = {
    "comments",
    "fieldApplicationEngineer",
    "salesRepresentative",
    "trackingIdentifier"
})
public class ProductProviderInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "FieldApplicationEngineer")
    protected ContactInformationType fieldApplicationEngineer;
    @XmlElement(name = "SalesRepresentative")
    protected ContactInformationType salesRepresentative;
    @XmlElement(name = "TrackingIdentifier", required = true)
    protected String trackingIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the fieldApplicationEngineer property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getFieldApplicationEngineer() {
        return fieldApplicationEngineer;
    }

    /**
     * Sets the value of the fieldApplicationEngineer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setFieldApplicationEngineer(ContactInformationType value) {
        this.fieldApplicationEngineer = value;
    }

    /**
     * Gets the value of the salesRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getSalesRepresentative() {
        return salesRepresentative;
    }

    /**
     * Sets the value of the salesRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setSalesRepresentative(ContactInformationType value) {
        this.salesRepresentative = value;
    }

    /**
     * Gets the value of the trackingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingIdentifier() {
        return trackingIdentifier;
    }

    /**
     * Sets the value of the trackingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingIdentifier(String value) {
        this.trackingIdentifier = value;
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
        final ProductProviderInformationType that = ((ProductProviderInformationType) object);
        {
            String lhsComments;
            lhsComments = this.getComments();
            String rhsComments;
            rhsComments = that.getComments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comments", lhsComments), LocatorUtils.property(thatLocator, "comments", rhsComments), lhsComments, rhsComments, (this.comments!= null), (that.comments!= null))) {
                return false;
            }
        }
        {
            ContactInformationType lhsFieldApplicationEngineer;
            lhsFieldApplicationEngineer = this.getFieldApplicationEngineer();
            ContactInformationType rhsFieldApplicationEngineer;
            rhsFieldApplicationEngineer = that.getFieldApplicationEngineer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fieldApplicationEngineer", lhsFieldApplicationEngineer), LocatorUtils.property(thatLocator, "fieldApplicationEngineer", rhsFieldApplicationEngineer), lhsFieldApplicationEngineer, rhsFieldApplicationEngineer, (this.fieldApplicationEngineer!= null), (that.fieldApplicationEngineer!= null))) {
                return false;
            }
        }
        {
            ContactInformationType lhsSalesRepresentative;
            lhsSalesRepresentative = this.getSalesRepresentative();
            ContactInformationType rhsSalesRepresentative;
            rhsSalesRepresentative = that.getSalesRepresentative();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesRepresentative", lhsSalesRepresentative), LocatorUtils.property(thatLocator, "salesRepresentative", rhsSalesRepresentative), lhsSalesRepresentative, rhsSalesRepresentative, (this.salesRepresentative!= null), (that.salesRepresentative!= null))) {
                return false;
            }
        }
        {
            String lhsTrackingIdentifier;
            lhsTrackingIdentifier = this.getTrackingIdentifier();
            String rhsTrackingIdentifier;
            rhsTrackingIdentifier = that.getTrackingIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingIdentifier", lhsTrackingIdentifier), LocatorUtils.property(thatLocator, "trackingIdentifier", rhsTrackingIdentifier), lhsTrackingIdentifier, rhsTrackingIdentifier, (this.trackingIdentifier!= null), (that.trackingIdentifier!= null))) {
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
            String theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments, (this.comments!= null));
        }
        {
            ContactInformationType theFieldApplicationEngineer;
            theFieldApplicationEngineer = this.getFieldApplicationEngineer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fieldApplicationEngineer", theFieldApplicationEngineer), currentHashCode, theFieldApplicationEngineer, (this.fieldApplicationEngineer!= null));
        }
        {
            ContactInformationType theSalesRepresentative;
            theSalesRepresentative = this.getSalesRepresentative();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesRepresentative", theSalesRepresentative), currentHashCode, theSalesRepresentative, (this.salesRepresentative!= null));
        }
        {
            String theTrackingIdentifier;
            theTrackingIdentifier = this.getTrackingIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingIdentifier", theTrackingIdentifier), currentHashCode, theTrackingIdentifier, (this.trackingIdentifier!= null));
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
            String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments, (this.comments!= null));
        }
        {
            ContactInformationType theFieldApplicationEngineer;
            theFieldApplicationEngineer = this.getFieldApplicationEngineer();
            strategy.appendField(locator, this, "fieldApplicationEngineer", buffer, theFieldApplicationEngineer, (this.fieldApplicationEngineer!= null));
        }
        {
            ContactInformationType theSalesRepresentative;
            theSalesRepresentative = this.getSalesRepresentative();
            strategy.appendField(locator, this, "salesRepresentative", buffer, theSalesRepresentative, (this.salesRepresentative!= null));
        }
        {
            String theTrackingIdentifier;
            theTrackingIdentifier = this.getTrackingIdentifier();
            strategy.appendField(locator, this, "trackingIdentifier", buffer, theTrackingIdentifier, (this.trackingIdentifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
