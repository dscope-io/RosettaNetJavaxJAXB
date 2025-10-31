
package io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_00;

import java.util.ArrayList;
import java.util.List;
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
import io.dscope.rosettanet.domain.service.codelist.claimtype.v01_02.ClaimType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for WarrantyClaimConfirmDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarrantyClaimConfirmDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ClaimData" type="{urn:rosettanet:specification:interchange:WarrantyClaimConfirmationNotification:xsd:schema:01.00}ClaimDataType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02}ClaimType"/&gt;
 *         &lt;element name="ServiceDelivery" type="{urn:rosettanet:specification:interchange:WarrantyClaimConfirmationNotification:xsd:schema:01.00}ServiceDeliveryType" minOccurs="0"/&gt;
 *         &lt;element name="ServicedUnit" type="{urn:rosettanet:specification:interchange:WarrantyClaimConfirmationNotification:xsd:schema:01.00}ServicedUnitType"/&gt;
 *         &lt;element name="ServiceLocation" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="StatusInformation" type="{urn:rosettanet:specification:interchange:WarrantyClaimConfirmationNotification:xsd:schema:01.00}StatusInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubmissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
@XmlType(name = "WarrantyClaimConfirmDataType", propOrder = {
    "businessDocumentReference",
    "claimData",
    "claimType",
    "serviceDelivery",
    "servicedUnit",
    "serviceLocation",
    "statusInformation",
    "submissionDate"
})
public class WarrantyClaimConfirmDataType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "ClaimData", required = true)
    protected ClaimDataType claimData;
    @XmlElementRef(name = "ClaimType", namespace = "urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02", type = ClaimType.class)
    protected ClaimType claimType;
    @XmlElement(name = "ServiceDelivery")
    protected ServiceDeliveryType serviceDelivery;
    @XmlElement(name = "ServicedUnit", required = true)
    protected ServicedUnitType servicedUnit;
    @XmlElement(name = "ServiceLocation")
    protected SpecifiedPartnerDescriptionType serviceLocation;
    @XmlElement(name = "StatusInformation")
    protected List<StatusInformationType> statusInformation;
    @XmlElement(name = "SubmissionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
    }

    /**
     * Gets the value of the claimData property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDataType }
     *     
     */
    public ClaimDataType getClaimData() {
        return claimData;
    }

    /**
     * Sets the value of the claimData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDataType }
     *     
     */
    public void setClaimData(ClaimDataType value) {
        this.claimData = value;
    }

    /**
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimType }
     *     
     */
    public ClaimType getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimType }
     *     
     */
    public void setClaimType(ClaimType value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the serviceDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryType }
     *     
     */
    public ServiceDeliveryType getServiceDelivery() {
        return serviceDelivery;
    }

    /**
     * Sets the value of the serviceDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryType }
     *     
     */
    public void setServiceDelivery(ServiceDeliveryType value) {
        this.serviceDelivery = value;
    }

    /**
     * Gets the value of the servicedUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ServicedUnitType }
     *     
     */
    public ServicedUnitType getServicedUnit() {
        return servicedUnit;
    }

    /**
     * Sets the value of the servicedUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicedUnitType }
     *     
     */
    public void setServicedUnit(ServicedUnitType value) {
        this.servicedUnit = value;
    }

    /**
     * Gets the value of the serviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getServiceLocation() {
        return serviceLocation;
    }

    /**
     * Sets the value of the serviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setServiceLocation(SpecifiedPartnerDescriptionType value) {
        this.serviceLocation = value;
    }

    /**
     * Gets the value of the statusInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusInformationType }
     * 
     * 
     */
    public List<StatusInformationType> getStatusInformation() {
        if (statusInformation == null) {
            statusInformation = new ArrayList<StatusInformationType>();
        }
        return this.statusInformation;
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
        final WarrantyClaimConfirmDataType that = ((WarrantyClaimConfirmDataType) object);
        {
            List<BusinessDocumentReference> lhsBusinessDocumentReference;
            lhsBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            List<BusinessDocumentReference> rhsBusinessDocumentReference;
            rhsBusinessDocumentReference = (((that.businessDocumentReference!= null)&&(!that.businessDocumentReference.isEmpty()))?that.getBusinessDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentReference", lhsBusinessDocumentReference), LocatorUtils.property(thatLocator, "businessDocumentReference", rhsBusinessDocumentReference), lhsBusinessDocumentReference, rhsBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())), ((that.businessDocumentReference!= null)&&(!that.businessDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            ClaimDataType lhsClaimData;
            lhsClaimData = this.getClaimData();
            ClaimDataType rhsClaimData;
            rhsClaimData = that.getClaimData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "claimData", lhsClaimData), LocatorUtils.property(thatLocator, "claimData", rhsClaimData), lhsClaimData, rhsClaimData, (this.claimData!= null), (that.claimData!= null))) {
                return false;
            }
        }
        {
            ClaimType lhsClaimType;
            lhsClaimType = this.getClaimType();
            ClaimType rhsClaimType;
            rhsClaimType = that.getClaimType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "claimType", lhsClaimType), LocatorUtils.property(thatLocator, "claimType", rhsClaimType), lhsClaimType, rhsClaimType, (this.claimType!= null), (that.claimType!= null))) {
                return false;
            }
        }
        {
            ServiceDeliveryType lhsServiceDelivery;
            lhsServiceDelivery = this.getServiceDelivery();
            ServiceDeliveryType rhsServiceDelivery;
            rhsServiceDelivery = that.getServiceDelivery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceDelivery", lhsServiceDelivery), LocatorUtils.property(thatLocator, "serviceDelivery", rhsServiceDelivery), lhsServiceDelivery, rhsServiceDelivery, (this.serviceDelivery!= null), (that.serviceDelivery!= null))) {
                return false;
            }
        }
        {
            ServicedUnitType lhsServicedUnit;
            lhsServicedUnit = this.getServicedUnit();
            ServicedUnitType rhsServicedUnit;
            rhsServicedUnit = that.getServicedUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "servicedUnit", lhsServicedUnit), LocatorUtils.property(thatLocator, "servicedUnit", rhsServicedUnit), lhsServicedUnit, rhsServicedUnit, (this.servicedUnit!= null), (that.servicedUnit!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsServiceLocation;
            lhsServiceLocation = this.getServiceLocation();
            SpecifiedPartnerDescriptionType rhsServiceLocation;
            rhsServiceLocation = that.getServiceLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceLocation", lhsServiceLocation), LocatorUtils.property(thatLocator, "serviceLocation", rhsServiceLocation), lhsServiceLocation, rhsServiceLocation, (this.serviceLocation!= null), (that.serviceLocation!= null))) {
                return false;
            }
        }
        {
            List<StatusInformationType> lhsStatusInformation;
            lhsStatusInformation = (((this.statusInformation!= null)&&(!this.statusInformation.isEmpty()))?this.getStatusInformation():null);
            List<StatusInformationType> rhsStatusInformation;
            rhsStatusInformation = (((that.statusInformation!= null)&&(!that.statusInformation.isEmpty()))?that.getStatusInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusInformation", lhsStatusInformation), LocatorUtils.property(thatLocator, "statusInformation", rhsStatusInformation), lhsStatusInformation, rhsStatusInformation, ((this.statusInformation!= null)&&(!this.statusInformation.isEmpty())), ((that.statusInformation!= null)&&(!that.statusInformation.isEmpty())))) {
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
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            ClaimDataType theClaimData;
            theClaimData = this.getClaimData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "claimData", theClaimData), currentHashCode, theClaimData, (this.claimData!= null));
        }
        {
            ClaimType theClaimType;
            theClaimType = this.getClaimType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "claimType", theClaimType), currentHashCode, theClaimType, (this.claimType!= null));
        }
        {
            ServiceDeliveryType theServiceDelivery;
            theServiceDelivery = this.getServiceDelivery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceDelivery", theServiceDelivery), currentHashCode, theServiceDelivery, (this.serviceDelivery!= null));
        }
        {
            ServicedUnitType theServicedUnit;
            theServicedUnit = this.getServicedUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "servicedUnit", theServicedUnit), currentHashCode, theServicedUnit, (this.servicedUnit!= null));
        }
        {
            SpecifiedPartnerDescriptionType theServiceLocation;
            theServiceLocation = this.getServiceLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceLocation", theServiceLocation), currentHashCode, theServiceLocation, (this.serviceLocation!= null));
        }
        {
            List<StatusInformationType> theStatusInformation;
            theStatusInformation = (((this.statusInformation!= null)&&(!this.statusInformation.isEmpty()))?this.getStatusInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusInformation", theStatusInformation), currentHashCode, theStatusInformation, ((this.statusInformation!= null)&&(!this.statusInformation.isEmpty())));
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
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            ClaimDataType theClaimData;
            theClaimData = this.getClaimData();
            strategy.appendField(locator, this, "claimData", buffer, theClaimData, (this.claimData!= null));
        }
        {
            ClaimType theClaimType;
            theClaimType = this.getClaimType();
            strategy.appendField(locator, this, "claimType", buffer, theClaimType, (this.claimType!= null));
        }
        {
            ServiceDeliveryType theServiceDelivery;
            theServiceDelivery = this.getServiceDelivery();
            strategy.appendField(locator, this, "serviceDelivery", buffer, theServiceDelivery, (this.serviceDelivery!= null));
        }
        {
            ServicedUnitType theServicedUnit;
            theServicedUnit = this.getServicedUnit();
            strategy.appendField(locator, this, "servicedUnit", buffer, theServicedUnit, (this.servicedUnit!= null));
        }
        {
            SpecifiedPartnerDescriptionType theServiceLocation;
            theServiceLocation = this.getServiceLocation();
            strategy.appendField(locator, this, "serviceLocation", buffer, theServiceLocation, (this.serviceLocation!= null));
        }
        {
            List<StatusInformationType> theStatusInformation;
            theStatusInformation = (((this.statusInformation!= null)&&(!this.statusInformation.isEmpty()))?this.getStatusInformation():null);
            strategy.appendField(locator, this, "statusInformation", buffer, theStatusInformation, ((this.statusInformation!= null)&&(!this.statusInformation.isEmpty())));
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
