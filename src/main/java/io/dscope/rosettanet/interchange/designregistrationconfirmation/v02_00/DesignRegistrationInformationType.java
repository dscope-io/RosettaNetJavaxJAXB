
package io.dscope.rosettanet.interchange.designregistrationconfirmation.v02_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.RegistrationDisposition;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.RegistrationRenewableStatus;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.RegistrationSubmissionDate;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
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
 * <p>Java class for DesignRegistrationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignRegistrationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesignEngagementDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="DesignProjectInformation" type="{urn:rosettanet:specification:interchange:DesignRegistrationConfirmation:xsd:schema:02.00}DesignProjectInformationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationDisposition"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationRenewableStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationSubmissionDate" minOccurs="0"/&gt;
 *         &lt;element name="RenewalRequiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
@XmlType(name = "DesignRegistrationInformationType", propOrder = {
    "designEngagementDate",
    "designProjectInformation",
    "registrationDisposition",
    "registrationRenewableStatus",
    "registrationSubmissionDate",
    "renewalRequiredDate"
})
public class DesignRegistrationInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DesignEngagementDate")
    protected DatePeriodType designEngagementDate;
    @XmlElement(name = "DesignProjectInformation", required = true)
    protected DesignProjectInformationType designProjectInformation;
    @XmlElementRef(name = "RegistrationDisposition", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = RegistrationDisposition.class)
    protected RegistrationDisposition registrationDisposition;
    @XmlElementRef(name = "RegistrationRenewableStatus", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = RegistrationRenewableStatus.class, required = false)
    protected RegistrationRenewableStatus registrationRenewableStatus;
    @XmlElementRef(name = "RegistrationSubmissionDate", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = RegistrationSubmissionDate.class, required = false)
    protected RegistrationSubmissionDate registrationSubmissionDate;
    @XmlElement(name = "RenewalRequiredDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar renewalRequiredDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designEngagementDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getDesignEngagementDate() {
        return designEngagementDate;
    }

    /**
     * Sets the value of the designEngagementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setDesignEngagementDate(DatePeriodType value) {
        this.designEngagementDate = value;
    }

    /**
     * Gets the value of the designProjectInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DesignProjectInformationType }
     *     
     */
    public DesignProjectInformationType getDesignProjectInformation() {
        return designProjectInformation;
    }

    /**
     * Sets the value of the designProjectInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignProjectInformationType }
     *     
     */
    public void setDesignProjectInformation(DesignProjectInformationType value) {
        this.designProjectInformation = value;
    }

    /**
     * Gets the value of the registrationDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationDisposition }
     *     
     */
    public RegistrationDisposition getRegistrationDisposition() {
        return registrationDisposition;
    }

    /**
     * Sets the value of the registrationDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationDisposition }
     *     
     */
    public void setRegistrationDisposition(RegistrationDisposition value) {
        this.registrationDisposition = value;
    }

    /**
     * Gets the value of the registrationRenewableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationRenewableStatus }
     *     
     */
    public RegistrationRenewableStatus getRegistrationRenewableStatus() {
        return registrationRenewableStatus;
    }

    /**
     * Sets the value of the registrationRenewableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationRenewableStatus }
     *     
     */
    public void setRegistrationRenewableStatus(RegistrationRenewableStatus value) {
        this.registrationRenewableStatus = value;
    }

    /**
     * Gets the value of the registrationSubmissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationSubmissionDate }
     *     
     */
    public RegistrationSubmissionDate getRegistrationSubmissionDate() {
        return registrationSubmissionDate;
    }

    /**
     * Sets the value of the registrationSubmissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationSubmissionDate }
     *     
     */
    public void setRegistrationSubmissionDate(RegistrationSubmissionDate value) {
        this.registrationSubmissionDate = value;
    }

    /**
     * Gets the value of the renewalRequiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRenewalRequiredDate() {
        return renewalRequiredDate;
    }

    /**
     * Sets the value of the renewalRequiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRenewalRequiredDate(XMLGregorianCalendar value) {
        this.renewalRequiredDate = value;
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
        final DesignRegistrationInformationType that = ((DesignRegistrationInformationType) object);
        {
            DatePeriodType lhsDesignEngagementDate;
            lhsDesignEngagementDate = this.getDesignEngagementDate();
            DatePeriodType rhsDesignEngagementDate;
            rhsDesignEngagementDate = that.getDesignEngagementDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designEngagementDate", lhsDesignEngagementDate), LocatorUtils.property(thatLocator, "designEngagementDate", rhsDesignEngagementDate), lhsDesignEngagementDate, rhsDesignEngagementDate, (this.designEngagementDate!= null), (that.designEngagementDate!= null))) {
                return false;
            }
        }
        {
            DesignProjectInformationType lhsDesignProjectInformation;
            lhsDesignProjectInformation = this.getDesignProjectInformation();
            DesignProjectInformationType rhsDesignProjectInformation;
            rhsDesignProjectInformation = that.getDesignProjectInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designProjectInformation", lhsDesignProjectInformation), LocatorUtils.property(thatLocator, "designProjectInformation", rhsDesignProjectInformation), lhsDesignProjectInformation, rhsDesignProjectInformation, (this.designProjectInformation!= null), (that.designProjectInformation!= null))) {
                return false;
            }
        }
        {
            RegistrationDisposition lhsRegistrationDisposition;
            lhsRegistrationDisposition = this.getRegistrationDisposition();
            RegistrationDisposition rhsRegistrationDisposition;
            rhsRegistrationDisposition = that.getRegistrationDisposition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationDisposition", lhsRegistrationDisposition), LocatorUtils.property(thatLocator, "registrationDisposition", rhsRegistrationDisposition), lhsRegistrationDisposition, rhsRegistrationDisposition, (this.registrationDisposition!= null), (that.registrationDisposition!= null))) {
                return false;
            }
        }
        {
            RegistrationRenewableStatus lhsRegistrationRenewableStatus;
            lhsRegistrationRenewableStatus = this.getRegistrationRenewableStatus();
            RegistrationRenewableStatus rhsRegistrationRenewableStatus;
            rhsRegistrationRenewableStatus = that.getRegistrationRenewableStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationRenewableStatus", lhsRegistrationRenewableStatus), LocatorUtils.property(thatLocator, "registrationRenewableStatus", rhsRegistrationRenewableStatus), lhsRegistrationRenewableStatus, rhsRegistrationRenewableStatus, (this.registrationRenewableStatus!= null), (that.registrationRenewableStatus!= null))) {
                return false;
            }
        }
        {
            RegistrationSubmissionDate lhsRegistrationSubmissionDate;
            lhsRegistrationSubmissionDate = this.getRegistrationSubmissionDate();
            RegistrationSubmissionDate rhsRegistrationSubmissionDate;
            rhsRegistrationSubmissionDate = that.getRegistrationSubmissionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationSubmissionDate", lhsRegistrationSubmissionDate), LocatorUtils.property(thatLocator, "registrationSubmissionDate", rhsRegistrationSubmissionDate), lhsRegistrationSubmissionDate, rhsRegistrationSubmissionDate, (this.registrationSubmissionDate!= null), (that.registrationSubmissionDate!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsRenewalRequiredDate;
            lhsRenewalRequiredDate = this.getRenewalRequiredDate();
            XMLGregorianCalendar rhsRenewalRequiredDate;
            rhsRenewalRequiredDate = that.getRenewalRequiredDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "renewalRequiredDate", lhsRenewalRequiredDate), LocatorUtils.property(thatLocator, "renewalRequiredDate", rhsRenewalRequiredDate), lhsRenewalRequiredDate, rhsRenewalRequiredDate, (this.renewalRequiredDate!= null), (that.renewalRequiredDate!= null))) {
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
            DatePeriodType theDesignEngagementDate;
            theDesignEngagementDate = this.getDesignEngagementDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designEngagementDate", theDesignEngagementDate), currentHashCode, theDesignEngagementDate, (this.designEngagementDate!= null));
        }
        {
            DesignProjectInformationType theDesignProjectInformation;
            theDesignProjectInformation = this.getDesignProjectInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designProjectInformation", theDesignProjectInformation), currentHashCode, theDesignProjectInformation, (this.designProjectInformation!= null));
        }
        {
            RegistrationDisposition theRegistrationDisposition;
            theRegistrationDisposition = this.getRegistrationDisposition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationDisposition", theRegistrationDisposition), currentHashCode, theRegistrationDisposition, (this.registrationDisposition!= null));
        }
        {
            RegistrationRenewableStatus theRegistrationRenewableStatus;
            theRegistrationRenewableStatus = this.getRegistrationRenewableStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationRenewableStatus", theRegistrationRenewableStatus), currentHashCode, theRegistrationRenewableStatus, (this.registrationRenewableStatus!= null));
        }
        {
            RegistrationSubmissionDate theRegistrationSubmissionDate;
            theRegistrationSubmissionDate = this.getRegistrationSubmissionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationSubmissionDate", theRegistrationSubmissionDate), currentHashCode, theRegistrationSubmissionDate, (this.registrationSubmissionDate!= null));
        }
        {
            XMLGregorianCalendar theRenewalRequiredDate;
            theRenewalRequiredDate = this.getRenewalRequiredDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "renewalRequiredDate", theRenewalRequiredDate), currentHashCode, theRenewalRequiredDate, (this.renewalRequiredDate!= null));
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
            DatePeriodType theDesignEngagementDate;
            theDesignEngagementDate = this.getDesignEngagementDate();
            strategy.appendField(locator, this, "designEngagementDate", buffer, theDesignEngagementDate, (this.designEngagementDate!= null));
        }
        {
            DesignProjectInformationType theDesignProjectInformation;
            theDesignProjectInformation = this.getDesignProjectInformation();
            strategy.appendField(locator, this, "designProjectInformation", buffer, theDesignProjectInformation, (this.designProjectInformation!= null));
        }
        {
            RegistrationDisposition theRegistrationDisposition;
            theRegistrationDisposition = this.getRegistrationDisposition();
            strategy.appendField(locator, this, "registrationDisposition", buffer, theRegistrationDisposition, (this.registrationDisposition!= null));
        }
        {
            RegistrationRenewableStatus theRegistrationRenewableStatus;
            theRegistrationRenewableStatus = this.getRegistrationRenewableStatus();
            strategy.appendField(locator, this, "registrationRenewableStatus", buffer, theRegistrationRenewableStatus, (this.registrationRenewableStatus!= null));
        }
        {
            RegistrationSubmissionDate theRegistrationSubmissionDate;
            theRegistrationSubmissionDate = this.getRegistrationSubmissionDate();
            strategy.appendField(locator, this, "registrationSubmissionDate", buffer, theRegistrationSubmissionDate, (this.registrationSubmissionDate!= null));
        }
        {
            XMLGregorianCalendar theRenewalRequiredDate;
            theRenewalRequiredDate = this.getRenewalRequiredDate();
            strategy.appendField(locator, this, "renewalRequiredDate", buffer, theRenewalRequiredDate, (this.renewalRequiredDate!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
