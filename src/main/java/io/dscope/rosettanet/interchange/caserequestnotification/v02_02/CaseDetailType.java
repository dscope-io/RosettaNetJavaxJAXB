
package io.dscope.rosettanet.interchange.caserequestnotification.v02_02;

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
import io.dscope.rosettanet.domain.service.codelist.requesttype.v01_01.RequestType;
import io.dscope.rosettanet.domain.service.service.v02_20.CRContact;
import io.dscope.rosettanet.domain.service.service.v02_20.CaseID;
import io.dscope.rosettanet.domain.service.service.v02_20.Fault;
import io.dscope.rosettanet.domain.service.service.v02_20.Hardware;
import io.dscope.rosettanet.domain.service.service.v02_20.RejectCase;
import io.dscope.rosettanet.domain.service.service.v02_20.Software;
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
 * <p>Java class for CaseDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}CaseID"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}CRContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}Fault" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}Hardware" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MasterCaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProblemType" type="{urn:rosettanet:specification:interchange:CaseRequestNotification:xsd:schema:02.02}ProblemTypeType" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}RejectCase" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:RequestType:xsd:codelist:01.01}RequestType"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}Software" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CaseDetailType", propOrder = {
    "caseID",
    "crContact",
    "fault",
    "hardware",
    "masterCaseNumber",
    "notes",
    "problemType",
    "reason",
    "rejectCase",
    "requestType",
    "serialNumber",
    "software",
    "status",
    "title"
})
public class CaseDetailType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "CaseID", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = CaseID.class)
    protected CaseID caseID;
    @XmlElementRef(name = "CRContact", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = CRContact.class, required = false)
    protected List<CRContact> crContact;
    @XmlElementRef(name = "Fault", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = Fault.class, required = false)
    protected List<Fault> fault;
    @XmlElementRef(name = "Hardware", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = Hardware.class, required = false)
    protected List<Hardware> hardware;
    @XmlElement(name = "MasterCaseNumber")
    protected String masterCaseNumber;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "ProblemType")
    protected ProblemTypeType problemType;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElementRef(name = "RejectCase", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = RejectCase.class, required = false)
    protected RejectCase rejectCase;
    @XmlElementRef(name = "RequestType", namespace = "urn:rosettanet:specification:domain:Service:RequestType:xsd:codelist:01.01", type = RequestType.class)
    protected RequestType requestType;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElementRef(name = "Software", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = Software.class, required = false)
    protected List<Software> software;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Title")
    protected String title;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the caseID property.
     * 
     * @return
     *     possible object is
     *     {@link CaseID }
     *     
     */
    public CaseID getCaseID() {
        return caseID;
    }

    /**
     * Sets the value of the caseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseID }
     *     
     */
    public void setCaseID(CaseID value) {
        this.caseID = value;
    }

    /**
     * Gets the value of the crContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRContact }
     * 
     * 
     */
    public List<CRContact> getCRContact() {
        if (crContact == null) {
            crContact = new ArrayList<CRContact>();
        }
        return this.crContact;
    }

    /**
     * Gets the value of the fault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fault }
     * 
     * 
     */
    public List<Fault> getFault() {
        if (fault == null) {
            fault = new ArrayList<Fault>();
        }
        return this.fault;
    }

    /**
     * Gets the value of the hardware property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardware property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hardware }
     * 
     * 
     */
    public List<Hardware> getHardware() {
        if (hardware == null) {
            hardware = new ArrayList<Hardware>();
        }
        return this.hardware;
    }

    /**
     * Gets the value of the masterCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterCaseNumber() {
        return masterCaseNumber;
    }

    /**
     * Sets the value of the masterCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterCaseNumber(String value) {
        this.masterCaseNumber = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotes() {
        if (notes == null) {
            notes = new ArrayList<String>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the problemType property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemTypeType }
     *     
     */
    public ProblemTypeType getProblemType() {
        return problemType;
    }

    /**
     * Sets the value of the problemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemTypeType }
     *     
     */
    public void setProblemType(ProblemTypeType value) {
        this.problemType = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the rejectCase property.
     * 
     * @return
     *     possible object is
     *     {@link RejectCase }
     *     
     */
    public RejectCase getRejectCase() {
        return rejectCase;
    }

    /**
     * Sets the value of the rejectCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectCase }
     *     
     */
    public void setRejectCase(RejectCase value) {
        this.rejectCase = value;
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
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the software property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the software property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Software }
     * 
     * 
     */
    public List<Software> getSoftware() {
        if (software == null) {
            software = new ArrayList<Software>();
        }
        return this.software;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
        final CaseDetailType that = ((CaseDetailType) object);
        {
            CaseID lhsCaseID;
            lhsCaseID = this.getCaseID();
            CaseID rhsCaseID;
            rhsCaseID = that.getCaseID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "caseID", lhsCaseID), LocatorUtils.property(thatLocator, "caseID", rhsCaseID), lhsCaseID, rhsCaseID, (this.caseID!= null), (that.caseID!= null))) {
                return false;
            }
        }
        {
            List<CRContact> lhsCRContact;
            lhsCRContact = (((this.crContact!= null)&&(!this.crContact.isEmpty()))?this.getCRContact():null);
            List<CRContact> rhsCRContact;
            rhsCRContact = (((that.crContact!= null)&&(!that.crContact.isEmpty()))?that.getCRContact():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "crContact", lhsCRContact), LocatorUtils.property(thatLocator, "crContact", rhsCRContact), lhsCRContact, rhsCRContact, ((this.crContact!= null)&&(!this.crContact.isEmpty())), ((that.crContact!= null)&&(!that.crContact.isEmpty())))) {
                return false;
            }
        }
        {
            List<Fault> lhsFault;
            lhsFault = (((this.fault!= null)&&(!this.fault.isEmpty()))?this.getFault():null);
            List<Fault> rhsFault;
            rhsFault = (((that.fault!= null)&&(!that.fault.isEmpty()))?that.getFault():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fault", lhsFault), LocatorUtils.property(thatLocator, "fault", rhsFault), lhsFault, rhsFault, ((this.fault!= null)&&(!this.fault.isEmpty())), ((that.fault!= null)&&(!that.fault.isEmpty())))) {
                return false;
            }
        }
        {
            List<Hardware> lhsHardware;
            lhsHardware = (((this.hardware!= null)&&(!this.hardware.isEmpty()))?this.getHardware():null);
            List<Hardware> rhsHardware;
            rhsHardware = (((that.hardware!= null)&&(!that.hardware.isEmpty()))?that.getHardware():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hardware", lhsHardware), LocatorUtils.property(thatLocator, "hardware", rhsHardware), lhsHardware, rhsHardware, ((this.hardware!= null)&&(!this.hardware.isEmpty())), ((that.hardware!= null)&&(!that.hardware.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsMasterCaseNumber;
            lhsMasterCaseNumber = this.getMasterCaseNumber();
            String rhsMasterCaseNumber;
            rhsMasterCaseNumber = that.getMasterCaseNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "masterCaseNumber", lhsMasterCaseNumber), LocatorUtils.property(thatLocator, "masterCaseNumber", rhsMasterCaseNumber), lhsMasterCaseNumber, rhsMasterCaseNumber, (this.masterCaseNumber!= null), (that.masterCaseNumber!= null))) {
                return false;
            }
        }
        {
            List<String> lhsNotes;
            lhsNotes = (((this.notes!= null)&&(!this.notes.isEmpty()))?this.getNotes():null);
            List<String> rhsNotes;
            rhsNotes = (((that.notes!= null)&&(!that.notes.isEmpty()))?that.getNotes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notes", lhsNotes), LocatorUtils.property(thatLocator, "notes", rhsNotes), lhsNotes, rhsNotes, ((this.notes!= null)&&(!this.notes.isEmpty())), ((that.notes!= null)&&(!that.notes.isEmpty())))) {
                return false;
            }
        }
        {
            ProblemTypeType lhsProblemType;
            lhsProblemType = this.getProblemType();
            ProblemTypeType rhsProblemType;
            rhsProblemType = that.getProblemType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "problemType", lhsProblemType), LocatorUtils.property(thatLocator, "problemType", rhsProblemType), lhsProblemType, rhsProblemType, (this.problemType!= null), (that.problemType!= null))) {
                return false;
            }
        }
        {
            String lhsReason;
            lhsReason = this.getReason();
            String rhsReason;
            rhsReason = that.getReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reason", lhsReason), LocatorUtils.property(thatLocator, "reason", rhsReason), lhsReason, rhsReason, (this.reason!= null), (that.reason!= null))) {
                return false;
            }
        }
        {
            RejectCase lhsRejectCase;
            lhsRejectCase = this.getRejectCase();
            RejectCase rhsRejectCase;
            rhsRejectCase = that.getRejectCase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rejectCase", lhsRejectCase), LocatorUtils.property(thatLocator, "rejectCase", rhsRejectCase), lhsRejectCase, rhsRejectCase, (this.rejectCase!= null), (that.rejectCase!= null))) {
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
            String lhsSerialNumber;
            lhsSerialNumber = this.getSerialNumber();
            String rhsSerialNumber;
            rhsSerialNumber = that.getSerialNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serialNumber", lhsSerialNumber), LocatorUtils.property(thatLocator, "serialNumber", rhsSerialNumber), lhsSerialNumber, rhsSerialNumber, (this.serialNumber!= null), (that.serialNumber!= null))) {
                return false;
            }
        }
        {
            List<Software> lhsSoftware;
            lhsSoftware = (((this.software!= null)&&(!this.software.isEmpty()))?this.getSoftware():null);
            List<Software> rhsSoftware;
            rhsSoftware = (((that.software!= null)&&(!that.software.isEmpty()))?that.getSoftware():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "software", lhsSoftware), LocatorUtils.property(thatLocator, "software", rhsSoftware), lhsSoftware, rhsSoftware, ((this.software!= null)&&(!this.software.isEmpty())), ((that.software!= null)&&(!that.software.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsStatus;
            lhsStatus = this.getStatus();
            String rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle, (this.title!= null), (that.title!= null))) {
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
            CaseID theCaseID;
            theCaseID = this.getCaseID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "caseID", theCaseID), currentHashCode, theCaseID, (this.caseID!= null));
        }
        {
            List<CRContact> theCRContact;
            theCRContact = (((this.crContact!= null)&&(!this.crContact.isEmpty()))?this.getCRContact():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "crContact", theCRContact), currentHashCode, theCRContact, ((this.crContact!= null)&&(!this.crContact.isEmpty())));
        }
        {
            List<Fault> theFault;
            theFault = (((this.fault!= null)&&(!this.fault.isEmpty()))?this.getFault():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fault", theFault), currentHashCode, theFault, ((this.fault!= null)&&(!this.fault.isEmpty())));
        }
        {
            List<Hardware> theHardware;
            theHardware = (((this.hardware!= null)&&(!this.hardware.isEmpty()))?this.getHardware():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hardware", theHardware), currentHashCode, theHardware, ((this.hardware!= null)&&(!this.hardware.isEmpty())));
        }
        {
            String theMasterCaseNumber;
            theMasterCaseNumber = this.getMasterCaseNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "masterCaseNumber", theMasterCaseNumber), currentHashCode, theMasterCaseNumber, (this.masterCaseNumber!= null));
        }
        {
            List<String> theNotes;
            theNotes = (((this.notes!= null)&&(!this.notes.isEmpty()))?this.getNotes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes, ((this.notes!= null)&&(!this.notes.isEmpty())));
        }
        {
            ProblemTypeType theProblemType;
            theProblemType = this.getProblemType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "problemType", theProblemType), currentHashCode, theProblemType, (this.problemType!= null));
        }
        {
            String theReason;
            theReason = this.getReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reason", theReason), currentHashCode, theReason, (this.reason!= null));
        }
        {
            RejectCase theRejectCase;
            theRejectCase = this.getRejectCase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rejectCase", theRejectCase), currentHashCode, theRejectCase, (this.rejectCase!= null));
        }
        {
            RequestType theRequestType;
            theRequestType = this.getRequestType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestType", theRequestType), currentHashCode, theRequestType, (this.requestType!= null));
        }
        {
            String theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialNumber", theSerialNumber), currentHashCode, theSerialNumber, (this.serialNumber!= null));
        }
        {
            List<Software> theSoftware;
            theSoftware = (((this.software!= null)&&(!this.software.isEmpty()))?this.getSoftware():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "software", theSoftware), currentHashCode, theSoftware, ((this.software!= null)&&(!this.software.isEmpty())));
        }
        {
            String theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle, (this.title!= null));
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
            CaseID theCaseID;
            theCaseID = this.getCaseID();
            strategy.appendField(locator, this, "caseID", buffer, theCaseID, (this.caseID!= null));
        }
        {
            List<CRContact> theCRContact;
            theCRContact = (((this.crContact!= null)&&(!this.crContact.isEmpty()))?this.getCRContact():null);
            strategy.appendField(locator, this, "crContact", buffer, theCRContact, ((this.crContact!= null)&&(!this.crContact.isEmpty())));
        }
        {
            List<Fault> theFault;
            theFault = (((this.fault!= null)&&(!this.fault.isEmpty()))?this.getFault():null);
            strategy.appendField(locator, this, "fault", buffer, theFault, ((this.fault!= null)&&(!this.fault.isEmpty())));
        }
        {
            List<Hardware> theHardware;
            theHardware = (((this.hardware!= null)&&(!this.hardware.isEmpty()))?this.getHardware():null);
            strategy.appendField(locator, this, "hardware", buffer, theHardware, ((this.hardware!= null)&&(!this.hardware.isEmpty())));
        }
        {
            String theMasterCaseNumber;
            theMasterCaseNumber = this.getMasterCaseNumber();
            strategy.appendField(locator, this, "masterCaseNumber", buffer, theMasterCaseNumber, (this.masterCaseNumber!= null));
        }
        {
            List<String> theNotes;
            theNotes = (((this.notes!= null)&&(!this.notes.isEmpty()))?this.getNotes():null);
            strategy.appendField(locator, this, "notes", buffer, theNotes, ((this.notes!= null)&&(!this.notes.isEmpty())));
        }
        {
            ProblemTypeType theProblemType;
            theProblemType = this.getProblemType();
            strategy.appendField(locator, this, "problemType", buffer, theProblemType, (this.problemType!= null));
        }
        {
            String theReason;
            theReason = this.getReason();
            strategy.appendField(locator, this, "reason", buffer, theReason, (this.reason!= null));
        }
        {
            RejectCase theRejectCase;
            theRejectCase = this.getRejectCase();
            strategy.appendField(locator, this, "rejectCase", buffer, theRejectCase, (this.rejectCase!= null));
        }
        {
            RequestType theRequestType;
            theRequestType = this.getRequestType();
            strategy.appendField(locator, this, "requestType", buffer, theRequestType, (this.requestType!= null));
        }
        {
            String theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            strategy.appendField(locator, this, "serialNumber", buffer, theSerialNumber, (this.serialNumber!= null));
        }
        {
            List<Software> theSoftware;
            theSoftware = (((this.software!= null)&&(!this.software.isEmpty()))?this.getSoftware():null);
            strategy.appendField(locator, this, "software", buffer, theSoftware, ((this.software!= null)&&(!this.software.isEmpty())));
        }
        {
            String theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus, (this.status!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
