
package io.dscope.rosettanet.interchange.manufacturingworkordernotification.v02_01;

import java.math.BigInteger;
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
import io.dscope.rosettanet.domain.manufacturing.codelist.changereason.v01_04.ChangeReason;
import io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_20.EngineeringInformation;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_20.MarkInformation;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_20.ProcessInformation;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_20.SourceDevice;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_20.SpecialProcessingInformation;
import io.dscope.rosettanet.domain.procurement.codelist.lineitemstatus.v01_04.LineItemStatus;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
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
 * <p>Java class for WorkOrderLineItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkOrderLineItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04}ChangeReason" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerProfile" type="{urn:rosettanet:specification:interchange:ManufacturingWorkOrderNotification:xsd:schema:02.01}CustomerProfileType"/&gt;
 *         &lt;element name="DateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20}EngineeringInformation" minOccurs="0"/&gt;
 *         &lt;element name="LeadCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.04}LineItemStatus" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04}LotType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20}MarkInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20}ProcessInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PurposeOfMultipleSourceDevices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20}SourceDevice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20}SpecialProcessingInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SublineItems" type="{urn:rosettanet:specification:interchange:ManufacturingWorkOrderNotification:xsd:schema:02.01}SublineItemsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TargetDevice" type="{urn:rosettanet:specification:interchange:ManufacturingWorkOrderNotification:xsd:schema:02.01}TargetDeviceType"/&gt;
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
@XmlType(name = "WorkOrderLineItemsType", propOrder = {
    "businessDocumentReference",
    "changeReason",
    "comment",
    "customerProfile",
    "dateCode",
    "engineeringInformation",
    "leadCount",
    "lineItemStatus",
    "lineNumber",
    "lotType",
    "markInformation",
    "partnerDescription",
    "processInformation",
    "purposeOfMultipleSourceDevices",
    "sourceDevice",
    "specialProcessingInformation",
    "sublineItems",
    "targetDevice"
})
public class WorkOrderLineItemsType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "ChangeReason", namespace = "urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04", type = ChangeReason.class, required = false)
    protected ChangeReason changeReason;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "CustomerProfile", required = true)
    protected CustomerProfileType customerProfile;
    @XmlElement(name = "DateCode")
    protected String dateCode;
    @XmlElementRef(name = "EngineeringInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20", type = EngineeringInformation.class, required = false)
    protected EngineeringInformation engineeringInformation;
    @XmlElement(name = "LeadCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger leadCount;
    @XmlElementRef(name = "LineItemStatus", namespace = "urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.04", type = LineItemStatus.class, required = false)
    protected LineItemStatus lineItemStatus;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "LotType", namespace = "urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04", type = LotType.class)
    protected LotType lotType;
    @XmlElementRef(name = "MarkInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20", type = MarkInformation.class, required = false)
    protected List<MarkInformation> markInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "ProcessInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20", type = ProcessInformation.class, required = false)
    protected List<ProcessInformation> processInformation;
    @XmlElement(name = "PurposeOfMultipleSourceDevices")
    protected String purposeOfMultipleSourceDevices;
    @XmlElementRef(name = "SourceDevice", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20", type = SourceDevice.class, required = false)
    protected List<SourceDevice> sourceDevice;
    @XmlElementRef(name = "SpecialProcessingInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20", type = SpecialProcessingInformation.class, required = false)
    protected List<SpecialProcessingInformation> specialProcessingInformation;
    @XmlElement(name = "SublineItems")
    protected List<SublineItemsType> sublineItems;
    @XmlElement(name = "TargetDevice", required = true)
    protected TargetDeviceType targetDevice;
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
     * Gets the value of the changeReason property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeReason }
     *     
     */
    public ChangeReason getChangeReason() {
        return changeReason;
    }

    /**
     * Sets the value of the changeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeReason }
     *     
     */
    public void setChangeReason(ChangeReason value) {
        this.changeReason = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

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
     * Gets the value of the dateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCode() {
        return dateCode;
    }

    /**
     * Sets the value of the dateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCode(String value) {
        this.dateCode = value;
    }

    /**
     * Gets the value of the engineeringInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EngineeringInformation }
     *     
     */
    public EngineeringInformation getEngineeringInformation() {
        return engineeringInformation;
    }

    /**
     * Sets the value of the engineeringInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineeringInformation }
     *     
     */
    public void setEngineeringInformation(EngineeringInformation value) {
        this.engineeringInformation = value;
    }

    /**
     * Gets the value of the leadCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeadCount() {
        return leadCount;
    }

    /**
     * Sets the value of the leadCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeadCount(BigInteger value) {
        this.leadCount = value;
    }

    /**
     * Gets the value of the lineItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemStatus }
     *     
     */
    public LineItemStatus getLineItemStatus() {
        return lineItemStatus;
    }

    /**
     * Sets the value of the lineItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemStatus }
     *     
     */
    public void setLineItemStatus(LineItemStatus value) {
        this.lineItemStatus = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the lotType property.
     * 
     * @return
     *     possible object is
     *     {@link LotType }
     *     
     */
    public LotType getLotType() {
        return lotType;
    }

    /**
     * Sets the value of the lotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotType }
     *     
     */
    public void setLotType(LotType value) {
        this.lotType = value;
    }

    /**
     * Gets the value of the markInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkInformation }
     * 
     * 
     */
    public List<MarkInformation> getMarkInformation() {
        if (markInformation == null) {
            markInformation = new ArrayList<MarkInformation>();
        }
        return this.markInformation;
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
     * Gets the value of the processInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessInformation }
     * 
     * 
     */
    public List<ProcessInformation> getProcessInformation() {
        if (processInformation == null) {
            processInformation = new ArrayList<ProcessInformation>();
        }
        return this.processInformation;
    }

    /**
     * Gets the value of the purposeOfMultipleSourceDevices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeOfMultipleSourceDevices() {
        return purposeOfMultipleSourceDevices;
    }

    /**
     * Sets the value of the purposeOfMultipleSourceDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeOfMultipleSourceDevices(String value) {
        this.purposeOfMultipleSourceDevices = value;
    }

    /**
     * Gets the value of the sourceDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceDevice }
     * 
     * 
     */
    public List<SourceDevice> getSourceDevice() {
        if (sourceDevice == null) {
            sourceDevice = new ArrayList<SourceDevice>();
        }
        return this.sourceDevice;
    }

    /**
     * Gets the value of the specialProcessingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialProcessingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialProcessingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialProcessingInformation }
     * 
     * 
     */
    public List<SpecialProcessingInformation> getSpecialProcessingInformation() {
        if (specialProcessingInformation == null) {
            specialProcessingInformation = new ArrayList<SpecialProcessingInformation>();
        }
        return this.specialProcessingInformation;
    }

    /**
     * Gets the value of the sublineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sublineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSublineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SublineItemsType }
     * 
     * 
     */
    public List<SublineItemsType> getSublineItems() {
        if (sublineItems == null) {
            sublineItems = new ArrayList<SublineItemsType>();
        }
        return this.sublineItems;
    }

    /**
     * Gets the value of the targetDevice property.
     * 
     * @return
     *     possible object is
     *     {@link TargetDeviceType }
     *     
     */
    public TargetDeviceType getTargetDevice() {
        return targetDevice;
    }

    /**
     * Sets the value of the targetDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetDeviceType }
     *     
     */
    public void setTargetDevice(TargetDeviceType value) {
        this.targetDevice = value;
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
        final WorkOrderLineItemsType that = ((WorkOrderLineItemsType) object);
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
            ChangeReason lhsChangeReason;
            lhsChangeReason = this.getChangeReason();
            ChangeReason rhsChangeReason;
            rhsChangeReason = that.getChangeReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeReason", lhsChangeReason), LocatorUtils.property(thatLocator, "changeReason", rhsChangeReason), lhsChangeReason, rhsChangeReason, (this.changeReason!= null), (that.changeReason!= null))) {
                return false;
            }
        }
        {
            String lhsComment;
            lhsComment = this.getComment();
            String rhsComment;
            rhsComment = that.getComment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comment", lhsComment), LocatorUtils.property(thatLocator, "comment", rhsComment), lhsComment, rhsComment, (this.comment!= null), (that.comment!= null))) {
                return false;
            }
        }
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
            String lhsDateCode;
            lhsDateCode = this.getDateCode();
            String rhsDateCode;
            rhsDateCode = that.getDateCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateCode", lhsDateCode), LocatorUtils.property(thatLocator, "dateCode", rhsDateCode), lhsDateCode, rhsDateCode, (this.dateCode!= null), (that.dateCode!= null))) {
                return false;
            }
        }
        {
            EngineeringInformation lhsEngineeringInformation;
            lhsEngineeringInformation = this.getEngineeringInformation();
            EngineeringInformation rhsEngineeringInformation;
            rhsEngineeringInformation = that.getEngineeringInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "engineeringInformation", lhsEngineeringInformation), LocatorUtils.property(thatLocator, "engineeringInformation", rhsEngineeringInformation), lhsEngineeringInformation, rhsEngineeringInformation, (this.engineeringInformation!= null), (that.engineeringInformation!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsLeadCount;
            lhsLeadCount = this.getLeadCount();
            BigInteger rhsLeadCount;
            rhsLeadCount = that.getLeadCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leadCount", lhsLeadCount), LocatorUtils.property(thatLocator, "leadCount", rhsLeadCount), lhsLeadCount, rhsLeadCount, (this.leadCount!= null), (that.leadCount!= null))) {
                return false;
            }
        }
        {
            LineItemStatus lhsLineItemStatus;
            lhsLineItemStatus = this.getLineItemStatus();
            LineItemStatus rhsLineItemStatus;
            rhsLineItemStatus = that.getLineItemStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineItemStatus", lhsLineItemStatus), LocatorUtils.property(thatLocator, "lineItemStatus", rhsLineItemStatus), lhsLineItemStatus, rhsLineItemStatus, (this.lineItemStatus!= null), (that.lineItemStatus!= null))) {
                return false;
            }
        }
        {
            String lhsLineNumber;
            lhsLineNumber = this.getLineNumber();
            String rhsLineNumber;
            rhsLineNumber = that.getLineNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineNumber", lhsLineNumber), LocatorUtils.property(thatLocator, "lineNumber", rhsLineNumber), lhsLineNumber, rhsLineNumber, (this.lineNumber!= null), (that.lineNumber!= null))) {
                return false;
            }
        }
        {
            LotType lhsLotType;
            lhsLotType = this.getLotType();
            LotType rhsLotType;
            rhsLotType = that.getLotType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotType", lhsLotType), LocatorUtils.property(thatLocator, "lotType", rhsLotType), lhsLotType, rhsLotType, (this.lotType!= null), (that.lotType!= null))) {
                return false;
            }
        }
        {
            List<MarkInformation> lhsMarkInformation;
            lhsMarkInformation = (((this.markInformation!= null)&&(!this.markInformation.isEmpty()))?this.getMarkInformation():null);
            List<MarkInformation> rhsMarkInformation;
            rhsMarkInformation = (((that.markInformation!= null)&&(!that.markInformation.isEmpty()))?that.getMarkInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markInformation", lhsMarkInformation), LocatorUtils.property(thatLocator, "markInformation", rhsMarkInformation), lhsMarkInformation, rhsMarkInformation, ((this.markInformation!= null)&&(!this.markInformation.isEmpty())), ((that.markInformation!= null)&&(!that.markInformation.isEmpty())))) {
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
            List<ProcessInformation> lhsProcessInformation;
            lhsProcessInformation = (((this.processInformation!= null)&&(!this.processInformation.isEmpty()))?this.getProcessInformation():null);
            List<ProcessInformation> rhsProcessInformation;
            rhsProcessInformation = (((that.processInformation!= null)&&(!that.processInformation.isEmpty()))?that.getProcessInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processInformation", lhsProcessInformation), LocatorUtils.property(thatLocator, "processInformation", rhsProcessInformation), lhsProcessInformation, rhsProcessInformation, ((this.processInformation!= null)&&(!this.processInformation.isEmpty())), ((that.processInformation!= null)&&(!that.processInformation.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsPurposeOfMultipleSourceDevices;
            lhsPurposeOfMultipleSourceDevices = this.getPurposeOfMultipleSourceDevices();
            String rhsPurposeOfMultipleSourceDevices;
            rhsPurposeOfMultipleSourceDevices = that.getPurposeOfMultipleSourceDevices();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purposeOfMultipleSourceDevices", lhsPurposeOfMultipleSourceDevices), LocatorUtils.property(thatLocator, "purposeOfMultipleSourceDevices", rhsPurposeOfMultipleSourceDevices), lhsPurposeOfMultipleSourceDevices, rhsPurposeOfMultipleSourceDevices, (this.purposeOfMultipleSourceDevices!= null), (that.purposeOfMultipleSourceDevices!= null))) {
                return false;
            }
        }
        {
            List<SourceDevice> lhsSourceDevice;
            lhsSourceDevice = (((this.sourceDevice!= null)&&(!this.sourceDevice.isEmpty()))?this.getSourceDevice():null);
            List<SourceDevice> rhsSourceDevice;
            rhsSourceDevice = (((that.sourceDevice!= null)&&(!that.sourceDevice.isEmpty()))?that.getSourceDevice():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceDevice", lhsSourceDevice), LocatorUtils.property(thatLocator, "sourceDevice", rhsSourceDevice), lhsSourceDevice, rhsSourceDevice, ((this.sourceDevice!= null)&&(!this.sourceDevice.isEmpty())), ((that.sourceDevice!= null)&&(!that.sourceDevice.isEmpty())))) {
                return false;
            }
        }
        {
            List<SpecialProcessingInformation> lhsSpecialProcessingInformation;
            lhsSpecialProcessingInformation = (((this.specialProcessingInformation!= null)&&(!this.specialProcessingInformation.isEmpty()))?this.getSpecialProcessingInformation():null);
            List<SpecialProcessingInformation> rhsSpecialProcessingInformation;
            rhsSpecialProcessingInformation = (((that.specialProcessingInformation!= null)&&(!that.specialProcessingInformation.isEmpty()))?that.getSpecialProcessingInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialProcessingInformation", lhsSpecialProcessingInformation), LocatorUtils.property(thatLocator, "specialProcessingInformation", rhsSpecialProcessingInformation), lhsSpecialProcessingInformation, rhsSpecialProcessingInformation, ((this.specialProcessingInformation!= null)&&(!this.specialProcessingInformation.isEmpty())), ((that.specialProcessingInformation!= null)&&(!that.specialProcessingInformation.isEmpty())))) {
                return false;
            }
        }
        {
            List<SublineItemsType> lhsSublineItems;
            lhsSublineItems = (((this.sublineItems!= null)&&(!this.sublineItems.isEmpty()))?this.getSublineItems():null);
            List<SublineItemsType> rhsSublineItems;
            rhsSublineItems = (((that.sublineItems!= null)&&(!that.sublineItems.isEmpty()))?that.getSublineItems():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sublineItems", lhsSublineItems), LocatorUtils.property(thatLocator, "sublineItems", rhsSublineItems), lhsSublineItems, rhsSublineItems, ((this.sublineItems!= null)&&(!this.sublineItems.isEmpty())), ((that.sublineItems!= null)&&(!that.sublineItems.isEmpty())))) {
                return false;
            }
        }
        {
            TargetDeviceType lhsTargetDevice;
            lhsTargetDevice = this.getTargetDevice();
            TargetDeviceType rhsTargetDevice;
            rhsTargetDevice = that.getTargetDevice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetDevice", lhsTargetDevice), LocatorUtils.property(thatLocator, "targetDevice", rhsTargetDevice), lhsTargetDevice, rhsTargetDevice, (this.targetDevice!= null), (that.targetDevice!= null))) {
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
            ChangeReason theChangeReason;
            theChangeReason = this.getChangeReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeReason", theChangeReason), currentHashCode, theChangeReason, (this.changeReason!= null));
        }
        {
            String theComment;
            theComment = this.getComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comment", theComment), currentHashCode, theComment, (this.comment!= null));
        }
        {
            CustomerProfileType theCustomerProfile;
            theCustomerProfile = this.getCustomerProfile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerProfile", theCustomerProfile), currentHashCode, theCustomerProfile, (this.customerProfile!= null));
        }
        {
            String theDateCode;
            theDateCode = this.getDateCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateCode", theDateCode), currentHashCode, theDateCode, (this.dateCode!= null));
        }
        {
            EngineeringInformation theEngineeringInformation;
            theEngineeringInformation = this.getEngineeringInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "engineeringInformation", theEngineeringInformation), currentHashCode, theEngineeringInformation, (this.engineeringInformation!= null));
        }
        {
            BigInteger theLeadCount;
            theLeadCount = this.getLeadCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leadCount", theLeadCount), currentHashCode, theLeadCount, (this.leadCount!= null));
        }
        {
            LineItemStatus theLineItemStatus;
            theLineItemStatus = this.getLineItemStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineItemStatus", theLineItemStatus), currentHashCode, theLineItemStatus, (this.lineItemStatus!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            LotType theLotType;
            theLotType = this.getLotType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotType", theLotType), currentHashCode, theLotType, (this.lotType!= null));
        }
        {
            List<MarkInformation> theMarkInformation;
            theMarkInformation = (((this.markInformation!= null)&&(!this.markInformation.isEmpty()))?this.getMarkInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markInformation", theMarkInformation), currentHashCode, theMarkInformation, ((this.markInformation!= null)&&(!this.markInformation.isEmpty())));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            List<ProcessInformation> theProcessInformation;
            theProcessInformation = (((this.processInformation!= null)&&(!this.processInformation.isEmpty()))?this.getProcessInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processInformation", theProcessInformation), currentHashCode, theProcessInformation, ((this.processInformation!= null)&&(!this.processInformation.isEmpty())));
        }
        {
            String thePurposeOfMultipleSourceDevices;
            thePurposeOfMultipleSourceDevices = this.getPurposeOfMultipleSourceDevices();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purposeOfMultipleSourceDevices", thePurposeOfMultipleSourceDevices), currentHashCode, thePurposeOfMultipleSourceDevices, (this.purposeOfMultipleSourceDevices!= null));
        }
        {
            List<SourceDevice> theSourceDevice;
            theSourceDevice = (((this.sourceDevice!= null)&&(!this.sourceDevice.isEmpty()))?this.getSourceDevice():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceDevice", theSourceDevice), currentHashCode, theSourceDevice, ((this.sourceDevice!= null)&&(!this.sourceDevice.isEmpty())));
        }
        {
            List<SpecialProcessingInformation> theSpecialProcessingInformation;
            theSpecialProcessingInformation = (((this.specialProcessingInformation!= null)&&(!this.specialProcessingInformation.isEmpty()))?this.getSpecialProcessingInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialProcessingInformation", theSpecialProcessingInformation), currentHashCode, theSpecialProcessingInformation, ((this.specialProcessingInformation!= null)&&(!this.specialProcessingInformation.isEmpty())));
        }
        {
            List<SublineItemsType> theSublineItems;
            theSublineItems = (((this.sublineItems!= null)&&(!this.sublineItems.isEmpty()))?this.getSublineItems():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sublineItems", theSublineItems), currentHashCode, theSublineItems, ((this.sublineItems!= null)&&(!this.sublineItems.isEmpty())));
        }
        {
            TargetDeviceType theTargetDevice;
            theTargetDevice = this.getTargetDevice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetDevice", theTargetDevice), currentHashCode, theTargetDevice, (this.targetDevice!= null));
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
            ChangeReason theChangeReason;
            theChangeReason = this.getChangeReason();
            strategy.appendField(locator, this, "changeReason", buffer, theChangeReason, (this.changeReason!= null));
        }
        {
            String theComment;
            theComment = this.getComment();
            strategy.appendField(locator, this, "comment", buffer, theComment, (this.comment!= null));
        }
        {
            CustomerProfileType theCustomerProfile;
            theCustomerProfile = this.getCustomerProfile();
            strategy.appendField(locator, this, "customerProfile", buffer, theCustomerProfile, (this.customerProfile!= null));
        }
        {
            String theDateCode;
            theDateCode = this.getDateCode();
            strategy.appendField(locator, this, "dateCode", buffer, theDateCode, (this.dateCode!= null));
        }
        {
            EngineeringInformation theEngineeringInformation;
            theEngineeringInformation = this.getEngineeringInformation();
            strategy.appendField(locator, this, "engineeringInformation", buffer, theEngineeringInformation, (this.engineeringInformation!= null));
        }
        {
            BigInteger theLeadCount;
            theLeadCount = this.getLeadCount();
            strategy.appendField(locator, this, "leadCount", buffer, theLeadCount, (this.leadCount!= null));
        }
        {
            LineItemStatus theLineItemStatus;
            theLineItemStatus = this.getLineItemStatus();
            strategy.appendField(locator, this, "lineItemStatus", buffer, theLineItemStatus, (this.lineItemStatus!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            LotType theLotType;
            theLotType = this.getLotType();
            strategy.appendField(locator, this, "lotType", buffer, theLotType, (this.lotType!= null));
        }
        {
            List<MarkInformation> theMarkInformation;
            theMarkInformation = (((this.markInformation!= null)&&(!this.markInformation.isEmpty()))?this.getMarkInformation():null);
            strategy.appendField(locator, this, "markInformation", buffer, theMarkInformation, ((this.markInformation!= null)&&(!this.markInformation.isEmpty())));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            List<ProcessInformation> theProcessInformation;
            theProcessInformation = (((this.processInformation!= null)&&(!this.processInformation.isEmpty()))?this.getProcessInformation():null);
            strategy.appendField(locator, this, "processInformation", buffer, theProcessInformation, ((this.processInformation!= null)&&(!this.processInformation.isEmpty())));
        }
        {
            String thePurposeOfMultipleSourceDevices;
            thePurposeOfMultipleSourceDevices = this.getPurposeOfMultipleSourceDevices();
            strategy.appendField(locator, this, "purposeOfMultipleSourceDevices", buffer, thePurposeOfMultipleSourceDevices, (this.purposeOfMultipleSourceDevices!= null));
        }
        {
            List<SourceDevice> theSourceDevice;
            theSourceDevice = (((this.sourceDevice!= null)&&(!this.sourceDevice.isEmpty()))?this.getSourceDevice():null);
            strategy.appendField(locator, this, "sourceDevice", buffer, theSourceDevice, ((this.sourceDevice!= null)&&(!this.sourceDevice.isEmpty())));
        }
        {
            List<SpecialProcessingInformation> theSpecialProcessingInformation;
            theSpecialProcessingInformation = (((this.specialProcessingInformation!= null)&&(!this.specialProcessingInformation.isEmpty()))?this.getSpecialProcessingInformation():null);
            strategy.appendField(locator, this, "specialProcessingInformation", buffer, theSpecialProcessingInformation, ((this.specialProcessingInformation!= null)&&(!this.specialProcessingInformation.isEmpty())));
        }
        {
            List<SublineItemsType> theSublineItems;
            theSublineItems = (((this.sublineItems!= null)&&(!this.sublineItems.isEmpty()))?this.getSublineItems():null);
            strategy.appendField(locator, this, "sublineItems", buffer, theSublineItems, ((this.sublineItems!= null)&&(!this.sublineItems.isEmpty())));
        }
        {
            TargetDeviceType theTargetDevice;
            theTargetDevice = this.getTargetDevice();
            strategy.appendField(locator, this, "targetDevice", buffer, theTargetDevice, (this.targetDevice!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
