
package io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.RegistrationRenewableStatusType;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
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
 *         &lt;element name="EngagementDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="PreviousSubmission" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectInformation" type="{urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00}ProjectInformationType"/&gt;
 *         &lt;element name="RenewableStatus" type="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationRenewableStatusType" minOccurs="0"/&gt;
 *         &lt;element name="SubmissionDate" type="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationSubmissionDateType" minOccurs="0"/&gt;
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
    "engagementDate",
    "previousSubmission",
    "projectInformation",
    "renewableStatus",
    "submissionDate"
})
public class DesignRegistrationInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "EngagementDate")
    protected DatePeriodType engagementDate;
    @XmlElement(name = "PreviousSubmission")
    protected BusinessDocumentReferenceType previousSubmission;
    @XmlElement(name = "ProjectInformation", required = true)
    protected ProjectInformationType projectInformation;
    @XmlElement(name = "RenewableStatus")
    protected RegistrationRenewableStatusType renewableStatus;
    @XmlElement(name = "SubmissionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar submissionDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the engagementDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEngagementDate() {
        return engagementDate;
    }

    /**
     * Sets the value of the engagementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEngagementDate(DatePeriodType value) {
        this.engagementDate = value;
    }

    /**
     * Gets the value of the previousSubmission property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPreviousSubmission() {
        return previousSubmission;
    }

    /**
     * Sets the value of the previousSubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPreviousSubmission(BusinessDocumentReferenceType value) {
        this.previousSubmission = value;
    }

    /**
     * Gets the value of the projectInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectInformationType }
     *     
     */
    public ProjectInformationType getProjectInformation() {
        return projectInformation;
    }

    /**
     * Sets the value of the projectInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectInformationType }
     *     
     */
    public void setProjectInformation(ProjectInformationType value) {
        this.projectInformation = value;
    }

    /**
     * Gets the value of the renewableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationRenewableStatusType }
     *     
     */
    public RegistrationRenewableStatusType getRenewableStatus() {
        return renewableStatus;
    }

    /**
     * Sets the value of the renewableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationRenewableStatusType }
     *     
     */
    public void setRenewableStatus(RegistrationRenewableStatusType value) {
        this.renewableStatus = value;
    }

    /**
     * Gets the value of the submissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Sets the value of the submissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionDate(XMLGregorianCalendar value) {
        this.submissionDate = value;
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
            DatePeriodType lhsEngagementDate;
            lhsEngagementDate = this.getEngagementDate();
            DatePeriodType rhsEngagementDate;
            rhsEngagementDate = that.getEngagementDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "engagementDate", lhsEngagementDate), LocatorUtils.property(thatLocator, "engagementDate", rhsEngagementDate), lhsEngagementDate, rhsEngagementDate, (this.engagementDate!= null), (that.engagementDate!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsPreviousSubmission;
            lhsPreviousSubmission = this.getPreviousSubmission();
            BusinessDocumentReferenceType rhsPreviousSubmission;
            rhsPreviousSubmission = that.getPreviousSubmission();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousSubmission", lhsPreviousSubmission), LocatorUtils.property(thatLocator, "previousSubmission", rhsPreviousSubmission), lhsPreviousSubmission, rhsPreviousSubmission, (this.previousSubmission!= null), (that.previousSubmission!= null))) {
                return false;
            }
        }
        {
            ProjectInformationType lhsProjectInformation;
            lhsProjectInformation = this.getProjectInformation();
            ProjectInformationType rhsProjectInformation;
            rhsProjectInformation = that.getProjectInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projectInformation", lhsProjectInformation), LocatorUtils.property(thatLocator, "projectInformation", rhsProjectInformation), lhsProjectInformation, rhsProjectInformation, (this.projectInformation!= null), (that.projectInformation!= null))) {
                return false;
            }
        }
        {
            RegistrationRenewableStatusType lhsRenewableStatus;
            lhsRenewableStatus = this.getRenewableStatus();
            RegistrationRenewableStatusType rhsRenewableStatus;
            rhsRenewableStatus = that.getRenewableStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "renewableStatus", lhsRenewableStatus), LocatorUtils.property(thatLocator, "renewableStatus", rhsRenewableStatus), lhsRenewableStatus, rhsRenewableStatus, (this.renewableStatus!= null), (that.renewableStatus!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsSubmissionDate;
            lhsSubmissionDate = this.getSubmissionDate();
            XMLGregorianCalendar rhsSubmissionDate;
            rhsSubmissionDate = that.getSubmissionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "submissionDate", lhsSubmissionDate), LocatorUtils.property(thatLocator, "submissionDate", rhsSubmissionDate), lhsSubmissionDate, rhsSubmissionDate, (this.submissionDate!= null), (that.submissionDate!= null))) {
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
            DatePeriodType theEngagementDate;
            theEngagementDate = this.getEngagementDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "engagementDate", theEngagementDate), currentHashCode, theEngagementDate, (this.engagementDate!= null));
        }
        {
            BusinessDocumentReferenceType thePreviousSubmission;
            thePreviousSubmission = this.getPreviousSubmission();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousSubmission", thePreviousSubmission), currentHashCode, thePreviousSubmission, (this.previousSubmission!= null));
        }
        {
            ProjectInformationType theProjectInformation;
            theProjectInformation = this.getProjectInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "projectInformation", theProjectInformation), currentHashCode, theProjectInformation, (this.projectInformation!= null));
        }
        {
            RegistrationRenewableStatusType theRenewableStatus;
            theRenewableStatus = this.getRenewableStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "renewableStatus", theRenewableStatus), currentHashCode, theRenewableStatus, (this.renewableStatus!= null));
        }
        {
            XMLGregorianCalendar theSubmissionDate;
            theSubmissionDate = this.getSubmissionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "submissionDate", theSubmissionDate), currentHashCode, theSubmissionDate, (this.submissionDate!= null));
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
            DatePeriodType theEngagementDate;
            theEngagementDate = this.getEngagementDate();
            strategy.appendField(locator, this, "engagementDate", buffer, theEngagementDate, (this.engagementDate!= null));
        }
        {
            BusinessDocumentReferenceType thePreviousSubmission;
            thePreviousSubmission = this.getPreviousSubmission();
            strategy.appendField(locator, this, "previousSubmission", buffer, thePreviousSubmission, (this.previousSubmission!= null));
        }
        {
            ProjectInformationType theProjectInformation;
            theProjectInformation = this.getProjectInformation();
            strategy.appendField(locator, this, "projectInformation", buffer, theProjectInformation, (this.projectInformation!= null));
        }
        {
            RegistrationRenewableStatusType theRenewableStatus;
            theRenewableStatus = this.getRenewableStatus();
            strategy.appendField(locator, this, "renewableStatus", buffer, theRenewableStatus, (this.renewableStatus!= null));
        }
        {
            XMLGregorianCalendar theSubmissionDate;
            theSubmissionDate = this.getSubmissionDate();
            strategy.appendField(locator, this, "submissionDate", buffer, theSubmissionDate, (this.submissionDate!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
