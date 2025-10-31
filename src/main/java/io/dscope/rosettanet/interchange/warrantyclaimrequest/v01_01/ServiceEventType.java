
package io.dscope.rosettanet.interchange.warrantyclaimrequest.v01_01;

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
import io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02.ServiceDeliveryMethodType;
import io.dscope.rosettanet.domain.service.service.v02_20.FailureInformation;
import io.dscope.rosettanet.domain.service.service.v02_20.ServiceStartDate;
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
 * <p>Java class for ServiceEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompletionDate" type="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}ServiceCompletionDateType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}FailureInformation" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDeliveryMethod" type="{urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02}ServiceDeliveryMethodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}ServiceStartDate" minOccurs="0"/&gt;
 *         &lt;element name="Technician" type="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.04}ContactInformationType" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceEventType", propOrder = {
    "completionDate",
    "failureInformation",
    "notes",
    "requestedDeliveryMethod",
    "serviceStartDate",
    "technician"
})
public class ServiceEventType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CompletionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionDate;
    @XmlElementRef(name = "FailureInformation", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = FailureInformation.class, required = false)
    protected FailureInformation failureInformation;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "RequestedDeliveryMethod")
    protected ServiceDeliveryMethodType requestedDeliveryMethod;
    @XmlElementRef(name = "ServiceStartDate", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = ServiceStartDate.class, required = false)
    protected ServiceStartDate serviceStartDate;
    @XmlElement(name = "Technician")
    protected ContactInformationType technician;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the completionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionDate(XMLGregorianCalendar value) {
        this.completionDate = value;
    }

    /**
     * Gets the value of the failureInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FailureInformation }
     *     
     */
    public FailureInformation getFailureInformation() {
        return failureInformation;
    }

    /**
     * Sets the value of the failureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureInformation }
     *     
     */
    public void setFailureInformation(FailureInformation value) {
        this.failureInformation = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the requestedDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public ServiceDeliveryMethodType getRequestedDeliveryMethod() {
        return requestedDeliveryMethod;
    }

    /**
     * Sets the value of the requestedDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public void setRequestedDeliveryMethod(ServiceDeliveryMethodType value) {
        this.requestedDeliveryMethod = value;
    }

    /**
     * Gets the value of the serviceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStartDate }
     *     
     */
    public ServiceStartDate getServiceStartDate() {
        return serviceStartDate;
    }

    /**
     * Sets the value of the serviceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStartDate }
     *     
     */
    public void setServiceStartDate(ServiceStartDate value) {
        this.serviceStartDate = value;
    }

    /**
     * Gets the value of the technician property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getTechnician() {
        return technician;
    }

    /**
     * Sets the value of the technician property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setTechnician(ContactInformationType value) {
        this.technician = value;
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
        final ServiceEventType that = ((ServiceEventType) object);
        {
            XMLGregorianCalendar lhsCompletionDate;
            lhsCompletionDate = this.getCompletionDate();
            XMLGregorianCalendar rhsCompletionDate;
            rhsCompletionDate = that.getCompletionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "completionDate", lhsCompletionDate), LocatorUtils.property(thatLocator, "completionDate", rhsCompletionDate), lhsCompletionDate, rhsCompletionDate, (this.completionDate!= null), (that.completionDate!= null))) {
                return false;
            }
        }
        {
            FailureInformation lhsFailureInformation;
            lhsFailureInformation = this.getFailureInformation();
            FailureInformation rhsFailureInformation;
            rhsFailureInformation = that.getFailureInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failureInformation", lhsFailureInformation), LocatorUtils.property(thatLocator, "failureInformation", rhsFailureInformation), lhsFailureInformation, rhsFailureInformation, (this.failureInformation!= null), (that.failureInformation!= null))) {
                return false;
            }
        }
        {
            String lhsNotes;
            lhsNotes = this.getNotes();
            String rhsNotes;
            rhsNotes = that.getNotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notes", lhsNotes), LocatorUtils.property(thatLocator, "notes", rhsNotes), lhsNotes, rhsNotes, (this.notes!= null), (that.notes!= null))) {
                return false;
            }
        }
        {
            ServiceDeliveryMethodType lhsRequestedDeliveryMethod;
            lhsRequestedDeliveryMethod = this.getRequestedDeliveryMethod();
            ServiceDeliveryMethodType rhsRequestedDeliveryMethod;
            rhsRequestedDeliveryMethod = that.getRequestedDeliveryMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedDeliveryMethod", lhsRequestedDeliveryMethod), LocatorUtils.property(thatLocator, "requestedDeliveryMethod", rhsRequestedDeliveryMethod), lhsRequestedDeliveryMethod, rhsRequestedDeliveryMethod, (this.requestedDeliveryMethod!= null), (that.requestedDeliveryMethod!= null))) {
                return false;
            }
        }
        {
            ServiceStartDate lhsServiceStartDate;
            lhsServiceStartDate = this.getServiceStartDate();
            ServiceStartDate rhsServiceStartDate;
            rhsServiceStartDate = that.getServiceStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceStartDate", lhsServiceStartDate), LocatorUtils.property(thatLocator, "serviceStartDate", rhsServiceStartDate), lhsServiceStartDate, rhsServiceStartDate, (this.serviceStartDate!= null), (that.serviceStartDate!= null))) {
                return false;
            }
        }
        {
            ContactInformationType lhsTechnician;
            lhsTechnician = this.getTechnician();
            ContactInformationType rhsTechnician;
            rhsTechnician = that.getTechnician();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "technician", lhsTechnician), LocatorUtils.property(thatLocator, "technician", rhsTechnician), lhsTechnician, rhsTechnician, (this.technician!= null), (that.technician!= null))) {
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
            XMLGregorianCalendar theCompletionDate;
            theCompletionDate = this.getCompletionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "completionDate", theCompletionDate), currentHashCode, theCompletionDate, (this.completionDate!= null));
        }
        {
            FailureInformation theFailureInformation;
            theFailureInformation = this.getFailureInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failureInformation", theFailureInformation), currentHashCode, theFailureInformation, (this.failureInformation!= null));
        }
        {
            String theNotes;
            theNotes = this.getNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes, (this.notes!= null));
        }
        {
            ServiceDeliveryMethodType theRequestedDeliveryMethod;
            theRequestedDeliveryMethod = this.getRequestedDeliveryMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedDeliveryMethod", theRequestedDeliveryMethod), currentHashCode, theRequestedDeliveryMethod, (this.requestedDeliveryMethod!= null));
        }
        {
            ServiceStartDate theServiceStartDate;
            theServiceStartDate = this.getServiceStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceStartDate", theServiceStartDate), currentHashCode, theServiceStartDate, (this.serviceStartDate!= null));
        }
        {
            ContactInformationType theTechnician;
            theTechnician = this.getTechnician();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "technician", theTechnician), currentHashCode, theTechnician, (this.technician!= null));
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
            XMLGregorianCalendar theCompletionDate;
            theCompletionDate = this.getCompletionDate();
            strategy.appendField(locator, this, "completionDate", buffer, theCompletionDate, (this.completionDate!= null));
        }
        {
            FailureInformation theFailureInformation;
            theFailureInformation = this.getFailureInformation();
            strategy.appendField(locator, this, "failureInformation", buffer, theFailureInformation, (this.failureInformation!= null));
        }
        {
            String theNotes;
            theNotes = this.getNotes();
            strategy.appendField(locator, this, "notes", buffer, theNotes, (this.notes!= null));
        }
        {
            ServiceDeliveryMethodType theRequestedDeliveryMethod;
            theRequestedDeliveryMethod = this.getRequestedDeliveryMethod();
            strategy.appendField(locator, this, "requestedDeliveryMethod", buffer, theRequestedDeliveryMethod, (this.requestedDeliveryMethod!= null));
        }
        {
            ServiceStartDate theServiceStartDate;
            theServiceStartDate = this.getServiceStartDate();
            strategy.appendField(locator, this, "serviceStartDate", buffer, theServiceStartDate, (this.serviceStartDate!= null));
        }
        {
            ContactInformationType theTechnician;
            theTechnician = this.getTechnician();
            strategy.appendField(locator, this, "technician", buffer, theTechnician, (this.technician!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
