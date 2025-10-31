
package io.dscope.rosettanet.interchange.servicecontractrequestnotification.v02_00;

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
import io.dscope.rosettanet.domain.shared.shared.v01_05.DatePeriodAndDurationType;
import io.dscope.rosettanet.interchange.codelist.requesttype.v01_01.RequestType;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.locations.v01_03.AlternativeIdentifierType;
import io.dscope.rosettanet.universal.partneridentification.v01_08.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for ServiceContractType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceContractType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ContractOwner" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FromContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsRequiredToResponseAtDetailLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Label" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.03}AlternativeIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.01}RequestType"/&gt;
 *         &lt;element name="ServiceContractLineItem" type="{urn:rosettanet:specification:interchange:ServiceContractRequestNotification:xsd:schema:02.00}ServiceContractLineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServicePeriod" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element name="ToContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceContractType", propOrder = {
    "billTo",
    "businessDocumentReference",
    "cancellationDate",
    "contractOwner",
    "contractReference",
    "fromContractReference",
    "isRequiredToResponseAtDetailLevel",
    "label",
    "notes",
    "requestType",
    "serviceContractLineItem",
    "servicePeriod",
    "toContractReference"
})
public class ServiceContractType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BillTo")
    protected SpecifiedPartnerDescriptionType billTo;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.04", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "CancellationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(name = "ContractOwner")
    protected SpecifiedPartnerDescriptionType contractOwner;
    @XmlElement(name = "ContractReference")
    protected List<BusinessDocumentReferenceType> contractReference;
    @XmlElement(name = "FromContractReference")
    protected List<BusinessDocumentReferenceType> fromContractReference;
    @XmlElement(name = "IsRequiredToResponseAtDetailLevel")
    protected String isRequiredToResponseAtDetailLevel;
    @XmlElement(name = "Label")
    protected AlternativeIdentifierType label;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElementRef(name = "RequestType", namespace = "urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.01", type = RequestType.class)
    protected RequestType requestType;
    @XmlElement(name = "ServiceContractLineItem")
    protected List<ServiceContractLineItemType> serviceContractLineItem;
    @XmlElement(name = "ServicePeriod")
    protected DatePeriodAndDurationType servicePeriod;
    @XmlElement(name = "ToContractReference")
    protected BusinessDocumentReferenceType toContractReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setBillTo(SpecifiedPartnerDescriptionType value) {
        this.billTo = value;
    }

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
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the contractOwner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getContractOwner() {
        return contractOwner;
    }

    /**
     * Sets the value of the contractOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setContractOwner(SpecifiedPartnerDescriptionType value) {
        this.contractOwner = value;
    }

    /**
     * Gets the value of the contractReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getContractReference() {
        if (contractReference == null) {
            contractReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.contractReference;
    }

    /**
     * Gets the value of the fromContractReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromContractReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromContractReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getFromContractReference() {
        if (fromContractReference == null) {
            fromContractReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.fromContractReference;
    }

    /**
     * Gets the value of the isRequiredToResponseAtDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRequiredToResponseAtDetailLevel() {
        return isRequiredToResponseAtDetailLevel;
    }

    /**
     * Sets the value of the isRequiredToResponseAtDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRequiredToResponseAtDetailLevel(String value) {
        this.isRequiredToResponseAtDetailLevel = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeIdentifierType }
     *     
     */
    public AlternativeIdentifierType getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeIdentifierType }
     *     
     */
    public void setLabel(AlternativeIdentifierType value) {
        this.label = value;
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
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the serviceContractLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceContractLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceContractLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceContractLineItemType }
     * 
     * 
     */
    public List<ServiceContractLineItemType> getServiceContractLineItem() {
        if (serviceContractLineItem == null) {
            serviceContractLineItem = new ArrayList<ServiceContractLineItemType>();
        }
        return this.serviceContractLineItem;
    }

    /**
     * Gets the value of the servicePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public DatePeriodAndDurationType getServicePeriod() {
        return servicePeriod;
    }

    /**
     * Sets the value of the servicePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public void setServicePeriod(DatePeriodAndDurationType value) {
        this.servicePeriod = value;
    }

    /**
     * Gets the value of the toContractReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getToContractReference() {
        return toContractReference;
    }

    /**
     * Sets the value of the toContractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setToContractReference(BusinessDocumentReferenceType value) {
        this.toContractReference = value;
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
        final ServiceContractType that = ((ServiceContractType) object);
        {
            SpecifiedPartnerDescriptionType lhsBillTo;
            lhsBillTo = this.getBillTo();
            SpecifiedPartnerDescriptionType rhsBillTo;
            rhsBillTo = that.getBillTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billTo", lhsBillTo), LocatorUtils.property(thatLocator, "billTo", rhsBillTo), lhsBillTo, rhsBillTo, (this.billTo!= null), (that.billTo!= null))) {
                return false;
            }
        }
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
            XMLGregorianCalendar lhsCancellationDate;
            lhsCancellationDate = this.getCancellationDate();
            XMLGregorianCalendar rhsCancellationDate;
            rhsCancellationDate = that.getCancellationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cancellationDate", lhsCancellationDate), LocatorUtils.property(thatLocator, "cancellationDate", rhsCancellationDate), lhsCancellationDate, rhsCancellationDate, (this.cancellationDate!= null), (that.cancellationDate!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsContractOwner;
            lhsContractOwner = this.getContractOwner();
            SpecifiedPartnerDescriptionType rhsContractOwner;
            rhsContractOwner = that.getContractOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractOwner", lhsContractOwner), LocatorUtils.property(thatLocator, "contractOwner", rhsContractOwner), lhsContractOwner, rhsContractOwner, (this.contractOwner!= null), (that.contractOwner!= null))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsContractReference;
            lhsContractReference = (((this.contractReference!= null)&&(!this.contractReference.isEmpty()))?this.getContractReference():null);
            List<BusinessDocumentReferenceType> rhsContractReference;
            rhsContractReference = (((that.contractReference!= null)&&(!that.contractReference.isEmpty()))?that.getContractReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractReference", lhsContractReference), LocatorUtils.property(thatLocator, "contractReference", rhsContractReference), lhsContractReference, rhsContractReference, ((this.contractReference!= null)&&(!this.contractReference.isEmpty())), ((that.contractReference!= null)&&(!that.contractReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsFromContractReference;
            lhsFromContractReference = (((this.fromContractReference!= null)&&(!this.fromContractReference.isEmpty()))?this.getFromContractReference():null);
            List<BusinessDocumentReferenceType> rhsFromContractReference;
            rhsFromContractReference = (((that.fromContractReference!= null)&&(!that.fromContractReference.isEmpty()))?that.getFromContractReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromContractReference", lhsFromContractReference), LocatorUtils.property(thatLocator, "fromContractReference", rhsFromContractReference), lhsFromContractReference, rhsFromContractReference, ((this.fromContractReference!= null)&&(!this.fromContractReference.isEmpty())), ((that.fromContractReference!= null)&&(!that.fromContractReference.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsIsRequiredToResponseAtDetailLevel;
            lhsIsRequiredToResponseAtDetailLevel = this.getIsRequiredToResponseAtDetailLevel();
            String rhsIsRequiredToResponseAtDetailLevel;
            rhsIsRequiredToResponseAtDetailLevel = that.getIsRequiredToResponseAtDetailLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRequiredToResponseAtDetailLevel", lhsIsRequiredToResponseAtDetailLevel), LocatorUtils.property(thatLocator, "isRequiredToResponseAtDetailLevel", rhsIsRequiredToResponseAtDetailLevel), lhsIsRequiredToResponseAtDetailLevel, rhsIsRequiredToResponseAtDetailLevel, (this.isRequiredToResponseAtDetailLevel!= null), (that.isRequiredToResponseAtDetailLevel!= null))) {
                return false;
            }
        }
        {
            AlternativeIdentifierType lhsLabel;
            lhsLabel = this.getLabel();
            AlternativeIdentifierType rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel, (this.label!= null), (that.label!= null))) {
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
            RequestType lhsRequestType;
            lhsRequestType = this.getRequestType();
            RequestType rhsRequestType;
            rhsRequestType = that.getRequestType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestType", lhsRequestType), LocatorUtils.property(thatLocator, "requestType", rhsRequestType), lhsRequestType, rhsRequestType, (this.requestType!= null), (that.requestType!= null))) {
                return false;
            }
        }
        {
            List<ServiceContractLineItemType> lhsServiceContractLineItem;
            lhsServiceContractLineItem = (((this.serviceContractLineItem!= null)&&(!this.serviceContractLineItem.isEmpty()))?this.getServiceContractLineItem():null);
            List<ServiceContractLineItemType> rhsServiceContractLineItem;
            rhsServiceContractLineItem = (((that.serviceContractLineItem!= null)&&(!that.serviceContractLineItem.isEmpty()))?that.getServiceContractLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceContractLineItem", lhsServiceContractLineItem), LocatorUtils.property(thatLocator, "serviceContractLineItem", rhsServiceContractLineItem), lhsServiceContractLineItem, rhsServiceContractLineItem, ((this.serviceContractLineItem!= null)&&(!this.serviceContractLineItem.isEmpty())), ((that.serviceContractLineItem!= null)&&(!that.serviceContractLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            DatePeriodAndDurationType lhsServicePeriod;
            lhsServicePeriod = this.getServicePeriod();
            DatePeriodAndDurationType rhsServicePeriod;
            rhsServicePeriod = that.getServicePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "servicePeriod", lhsServicePeriod), LocatorUtils.property(thatLocator, "servicePeriod", rhsServicePeriod), lhsServicePeriod, rhsServicePeriod, (this.servicePeriod!= null), (that.servicePeriod!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsToContractReference;
            lhsToContractReference = this.getToContractReference();
            BusinessDocumentReferenceType rhsToContractReference;
            rhsToContractReference = that.getToContractReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toContractReference", lhsToContractReference), LocatorUtils.property(thatLocator, "toContractReference", rhsToContractReference), lhsToContractReference, rhsToContractReference, (this.toContractReference!= null), (that.toContractReference!= null))) {
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
            SpecifiedPartnerDescriptionType theBillTo;
            theBillTo = this.getBillTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billTo", theBillTo), currentHashCode, theBillTo, (this.billTo!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            XMLGregorianCalendar theCancellationDate;
            theCancellationDate = this.getCancellationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cancellationDate", theCancellationDate), currentHashCode, theCancellationDate, (this.cancellationDate!= null));
        }
        {
            SpecifiedPartnerDescriptionType theContractOwner;
            theContractOwner = this.getContractOwner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractOwner", theContractOwner), currentHashCode, theContractOwner, (this.contractOwner!= null));
        }
        {
            List<BusinessDocumentReferenceType> theContractReference;
            theContractReference = (((this.contractReference!= null)&&(!this.contractReference.isEmpty()))?this.getContractReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractReference", theContractReference), currentHashCode, theContractReference, ((this.contractReference!= null)&&(!this.contractReference.isEmpty())));
        }
        {
            List<BusinessDocumentReferenceType> theFromContractReference;
            theFromContractReference = (((this.fromContractReference!= null)&&(!this.fromContractReference.isEmpty()))?this.getFromContractReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromContractReference", theFromContractReference), currentHashCode, theFromContractReference, ((this.fromContractReference!= null)&&(!this.fromContractReference.isEmpty())));
        }
        {
            String theIsRequiredToResponseAtDetailLevel;
            theIsRequiredToResponseAtDetailLevel = this.getIsRequiredToResponseAtDetailLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRequiredToResponseAtDetailLevel", theIsRequiredToResponseAtDetailLevel), currentHashCode, theIsRequiredToResponseAtDetailLevel, (this.isRequiredToResponseAtDetailLevel!= null));
        }
        {
            AlternativeIdentifierType theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel, (this.label!= null));
        }
        {
            String theNotes;
            theNotes = this.getNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes, (this.notes!= null));
        }
        {
            RequestType theRequestType;
            theRequestType = this.getRequestType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestType", theRequestType), currentHashCode, theRequestType, (this.requestType!= null));
        }
        {
            List<ServiceContractLineItemType> theServiceContractLineItem;
            theServiceContractLineItem = (((this.serviceContractLineItem!= null)&&(!this.serviceContractLineItem.isEmpty()))?this.getServiceContractLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceContractLineItem", theServiceContractLineItem), currentHashCode, theServiceContractLineItem, ((this.serviceContractLineItem!= null)&&(!this.serviceContractLineItem.isEmpty())));
        }
        {
            DatePeriodAndDurationType theServicePeriod;
            theServicePeriod = this.getServicePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "servicePeriod", theServicePeriod), currentHashCode, theServicePeriod, (this.servicePeriod!= null));
        }
        {
            BusinessDocumentReferenceType theToContractReference;
            theToContractReference = this.getToContractReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toContractReference", theToContractReference), currentHashCode, theToContractReference, (this.toContractReference!= null));
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
            SpecifiedPartnerDescriptionType theBillTo;
            theBillTo = this.getBillTo();
            strategy.appendField(locator, this, "billTo", buffer, theBillTo, (this.billTo!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            XMLGregorianCalendar theCancellationDate;
            theCancellationDate = this.getCancellationDate();
            strategy.appendField(locator, this, "cancellationDate", buffer, theCancellationDate, (this.cancellationDate!= null));
        }
        {
            SpecifiedPartnerDescriptionType theContractOwner;
            theContractOwner = this.getContractOwner();
            strategy.appendField(locator, this, "contractOwner", buffer, theContractOwner, (this.contractOwner!= null));
        }
        {
            List<BusinessDocumentReferenceType> theContractReference;
            theContractReference = (((this.contractReference!= null)&&(!this.contractReference.isEmpty()))?this.getContractReference():null);
            strategy.appendField(locator, this, "contractReference", buffer, theContractReference, ((this.contractReference!= null)&&(!this.contractReference.isEmpty())));
        }
        {
            List<BusinessDocumentReferenceType> theFromContractReference;
            theFromContractReference = (((this.fromContractReference!= null)&&(!this.fromContractReference.isEmpty()))?this.getFromContractReference():null);
            strategy.appendField(locator, this, "fromContractReference", buffer, theFromContractReference, ((this.fromContractReference!= null)&&(!this.fromContractReference.isEmpty())));
        }
        {
            String theIsRequiredToResponseAtDetailLevel;
            theIsRequiredToResponseAtDetailLevel = this.getIsRequiredToResponseAtDetailLevel();
            strategy.appendField(locator, this, "isRequiredToResponseAtDetailLevel", buffer, theIsRequiredToResponseAtDetailLevel, (this.isRequiredToResponseAtDetailLevel!= null));
        }
        {
            AlternativeIdentifierType theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            String theNotes;
            theNotes = this.getNotes();
            strategy.appendField(locator, this, "notes", buffer, theNotes, (this.notes!= null));
        }
        {
            RequestType theRequestType;
            theRequestType = this.getRequestType();
            strategy.appendField(locator, this, "requestType", buffer, theRequestType, (this.requestType!= null));
        }
        {
            List<ServiceContractLineItemType> theServiceContractLineItem;
            theServiceContractLineItem = (((this.serviceContractLineItem!= null)&&(!this.serviceContractLineItem.isEmpty()))?this.getServiceContractLineItem():null);
            strategy.appendField(locator, this, "serviceContractLineItem", buffer, theServiceContractLineItem, ((this.serviceContractLineItem!= null)&&(!this.serviceContractLineItem.isEmpty())));
        }
        {
            DatePeriodAndDurationType theServicePeriod;
            theServicePeriod = this.getServicePeriod();
            strategy.appendField(locator, this, "servicePeriod", buffer, theServicePeriod, (this.servicePeriod!= null));
        }
        {
            BusinessDocumentReferenceType theToContractReference;
            theToContractReference = this.getToContractReference();
            strategy.appendField(locator, this, "toContractReference", buffer, theToContractReference, (this.toContractReference!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
