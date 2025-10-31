
package io.dscope.rosettanet.interchange.warrantyclaimrequest.v01_00;

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
import io.dscope.rosettanet.domain.service.codelist.claimstatus.v01_02.ClaimStatus;
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
 * <p>Java class for WarrantyClaimRequestDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarrantyClaimRequestDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ClaimStatus:xsd:codelist:01.02}ClaimStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02}ClaimType"/&gt;
 *         &lt;element name="EndUser" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="ServicedUnit" type="{urn:rosettanet:specification:interchange:WarrantyClaimRequestNotification:xsd:schema:01.00}ServicedUnitType"/&gt;
 *         &lt;element name="ServiceEvent" type="{urn:rosettanet:specification:interchange:WarrantyClaimRequestNotification:xsd:schema:01.00}ServiceEventType"/&gt;
 *         &lt;element name="ServiceLocation" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
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
@XmlType(name = "WarrantyClaimRequestDataType", propOrder = {
    "businessDocumentReference",
    "claimStatus",
    "claimType",
    "endUser",
    "servicedUnit",
    "serviceEvent",
    "serviceLocation"
})
public class WarrantyClaimRequestDataType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "ClaimStatus", namespace = "urn:rosettanet:specification:domain:Service:ClaimStatus:xsd:codelist:01.02", type = ClaimStatus.class, required = false)
    protected ClaimStatus claimStatus;
    @XmlElementRef(name = "ClaimType", namespace = "urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02", type = ClaimType.class)
    protected ClaimType claimType;
    @XmlElement(name = "EndUser", required = true)
    protected SpecifiedPartnerDescriptionType endUser;
    @XmlElement(name = "ServicedUnit", required = true)
    protected ServicedUnitType servicedUnit;
    @XmlElement(name = "ServiceEvent", required = true)
    protected ServiceEventType serviceEvent;
    @XmlElement(name = "ServiceLocation", required = true)
    protected SpecifiedPartnerDescriptionType serviceLocation;
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
     * Gets the value of the claimStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimStatus }
     *     
     */
    public ClaimStatus getClaimStatus() {
        return claimStatus;
    }

    /**
     * Sets the value of the claimStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimStatus }
     *     
     */
    public void setClaimStatus(ClaimStatus value) {
        this.claimStatus = value;
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
     * Gets the value of the endUser property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getEndUser() {
        return endUser;
    }

    /**
     * Sets the value of the endUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setEndUser(SpecifiedPartnerDescriptionType value) {
        this.endUser = value;
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
     * Gets the value of the serviceEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEventType }
     *     
     */
    public ServiceEventType getServiceEvent() {
        return serviceEvent;
    }

    /**
     * Sets the value of the serviceEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEventType }
     *     
     */
    public void setServiceEvent(ServiceEventType value) {
        this.serviceEvent = value;
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
        final WarrantyClaimRequestDataType that = ((WarrantyClaimRequestDataType) object);
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
            ClaimStatus lhsClaimStatus;
            lhsClaimStatus = this.getClaimStatus();
            ClaimStatus rhsClaimStatus;
            rhsClaimStatus = that.getClaimStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "claimStatus", lhsClaimStatus), LocatorUtils.property(thatLocator, "claimStatus", rhsClaimStatus), lhsClaimStatus, rhsClaimStatus, (this.claimStatus!= null), (that.claimStatus!= null))) {
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
            SpecifiedPartnerDescriptionType lhsEndUser;
            lhsEndUser = this.getEndUser();
            SpecifiedPartnerDescriptionType rhsEndUser;
            rhsEndUser = that.getEndUser();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endUser", lhsEndUser), LocatorUtils.property(thatLocator, "endUser", rhsEndUser), lhsEndUser, rhsEndUser, (this.endUser!= null), (that.endUser!= null))) {
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
            ServiceEventType lhsServiceEvent;
            lhsServiceEvent = this.getServiceEvent();
            ServiceEventType rhsServiceEvent;
            rhsServiceEvent = that.getServiceEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceEvent", lhsServiceEvent), LocatorUtils.property(thatLocator, "serviceEvent", rhsServiceEvent), lhsServiceEvent, rhsServiceEvent, (this.serviceEvent!= null), (that.serviceEvent!= null))) {
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
            ClaimStatus theClaimStatus;
            theClaimStatus = this.getClaimStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "claimStatus", theClaimStatus), currentHashCode, theClaimStatus, (this.claimStatus!= null));
        }
        {
            ClaimType theClaimType;
            theClaimType = this.getClaimType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "claimType", theClaimType), currentHashCode, theClaimType, (this.claimType!= null));
        }
        {
            SpecifiedPartnerDescriptionType theEndUser;
            theEndUser = this.getEndUser();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endUser", theEndUser), currentHashCode, theEndUser, (this.endUser!= null));
        }
        {
            ServicedUnitType theServicedUnit;
            theServicedUnit = this.getServicedUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "servicedUnit", theServicedUnit), currentHashCode, theServicedUnit, (this.servicedUnit!= null));
        }
        {
            ServiceEventType theServiceEvent;
            theServiceEvent = this.getServiceEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceEvent", theServiceEvent), currentHashCode, theServiceEvent, (this.serviceEvent!= null));
        }
        {
            SpecifiedPartnerDescriptionType theServiceLocation;
            theServiceLocation = this.getServiceLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceLocation", theServiceLocation), currentHashCode, theServiceLocation, (this.serviceLocation!= null));
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
            ClaimStatus theClaimStatus;
            theClaimStatus = this.getClaimStatus();
            strategy.appendField(locator, this, "claimStatus", buffer, theClaimStatus, (this.claimStatus!= null));
        }
        {
            ClaimType theClaimType;
            theClaimType = this.getClaimType();
            strategy.appendField(locator, this, "claimType", buffer, theClaimType, (this.claimType!= null));
        }
        {
            SpecifiedPartnerDescriptionType theEndUser;
            theEndUser = this.getEndUser();
            strategy.appendField(locator, this, "endUser", buffer, theEndUser, (this.endUser!= null));
        }
        {
            ServicedUnitType theServicedUnit;
            theServicedUnit = this.getServicedUnit();
            strategy.appendField(locator, this, "servicedUnit", buffer, theServicedUnit, (this.servicedUnit!= null));
        }
        {
            ServiceEventType theServiceEvent;
            theServiceEvent = this.getServiceEvent();
            strategy.appendField(locator, this, "serviceEvent", buffer, theServiceEvent, (this.serviceEvent!= null));
        }
        {
            SpecifiedPartnerDescriptionType theServiceLocation;
            theServiceLocation = this.getServiceLocation();
            strategy.appendField(locator, this, "serviceLocation", buffer, theServiceLocation, (this.serviceLocation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
