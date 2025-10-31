
package io.dscope.rosettanet.system.standarddocumentheader.v01_18;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.contactinformation.v01_03.ContactInformation;
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerIdentification;
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
 * <p>Java class for SenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.18}BusinessServiceInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03}ContactInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerIdentification"/&gt;
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
@XmlType(name = "SenderType", propOrder = {
    "businessServiceInformation",
    "contactInformation",
    "partnerIdentification"
})
public class SenderType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessServiceInformation", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.18", type = BusinessServiceInformation.class, required = false)
    protected BusinessServiceInformation businessServiceInformation;
    @XmlElementRef(name = "ContactInformation", namespace = "urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03", type = ContactInformation.class, required = false)
    protected List<ContactInformation> contactInformation;
    @XmlElementRef(name = "PartnerIdentification", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerIdentification.class)
    protected PartnerIdentification partnerIdentification;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessServiceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessServiceInformation }
     *     
     */
    public BusinessServiceInformation getBusinessServiceInformation() {
        return businessServiceInformation;
    }

    /**
     * Sets the value of the businessServiceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessServiceInformation }
     *     
     */
    public void setBusinessServiceInformation(BusinessServiceInformation value) {
        this.businessServiceInformation = value;
    }

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
     * Gets the value of the partnerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerIdentification }
     *     
     */
    public PartnerIdentification getPartnerIdentification() {
        return partnerIdentification;
    }

    /**
     * Sets the value of the partnerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerIdentification }
     *     
     */
    public void setPartnerIdentification(PartnerIdentification value) {
        this.partnerIdentification = value;
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
        final SenderType that = ((SenderType) object);
        {
            BusinessServiceInformation lhsBusinessServiceInformation;
            lhsBusinessServiceInformation = this.getBusinessServiceInformation();
            BusinessServiceInformation rhsBusinessServiceInformation;
            rhsBusinessServiceInformation = that.getBusinessServiceInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessServiceInformation", lhsBusinessServiceInformation), LocatorUtils.property(thatLocator, "businessServiceInformation", rhsBusinessServiceInformation), lhsBusinessServiceInformation, rhsBusinessServiceInformation, (this.businessServiceInformation!= null), (that.businessServiceInformation!= null))) {
                return false;
            }
        }
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
            PartnerIdentification lhsPartnerIdentification;
            lhsPartnerIdentification = this.getPartnerIdentification();
            PartnerIdentification rhsPartnerIdentification;
            rhsPartnerIdentification = that.getPartnerIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerIdentification", lhsPartnerIdentification), LocatorUtils.property(thatLocator, "partnerIdentification", rhsPartnerIdentification), lhsPartnerIdentification, rhsPartnerIdentification, (this.partnerIdentification!= null), (that.partnerIdentification!= null))) {
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
            BusinessServiceInformation theBusinessServiceInformation;
            theBusinessServiceInformation = this.getBusinessServiceInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessServiceInformation", theBusinessServiceInformation), currentHashCode, theBusinessServiceInformation, (this.businessServiceInformation!= null));
        }
        {
            List<ContactInformation> theContactInformation;
            theContactInformation = (((this.contactInformation!= null)&&(!this.contactInformation.isEmpty()))?this.getContactInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactInformation", theContactInformation), currentHashCode, theContactInformation, ((this.contactInformation!= null)&&(!this.contactInformation.isEmpty())));
        }
        {
            PartnerIdentification thePartnerIdentification;
            thePartnerIdentification = this.getPartnerIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerIdentification", thePartnerIdentification), currentHashCode, thePartnerIdentification, (this.partnerIdentification!= null));
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
            BusinessServiceInformation theBusinessServiceInformation;
            theBusinessServiceInformation = this.getBusinessServiceInformation();
            strategy.appendField(locator, this, "businessServiceInformation", buffer, theBusinessServiceInformation, (this.businessServiceInformation!= null));
        }
        {
            List<ContactInformation> theContactInformation;
            theContactInformation = (((this.contactInformation!= null)&&(!this.contactInformation.isEmpty()))?this.getContactInformation():null);
            strategy.appendField(locator, this, "contactInformation", buffer, theContactInformation, ((this.contactInformation!= null)&&(!this.contactInformation.isEmpty())));
        }
        {
            PartnerIdentification thePartnerIdentification;
            thePartnerIdentification = this.getPartnerIdentification();
            strategy.appendField(locator, this, "partnerIdentification", buffer, thePartnerIdentification, (this.partnerIdentification!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
