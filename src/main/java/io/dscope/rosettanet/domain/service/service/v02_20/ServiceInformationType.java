
package io.dscope.rosettanet.domain.service.service.v02_20;

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
 * <p>Java class for ServiceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CaseReview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Complexity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerImpact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerSymptom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimateResponse" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FutureActionEvent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}Notes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProblemDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseSP" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RootCauseAnalysis" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceInformationSecurity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SpecialInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestResult" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WorkAroundSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceInformationType", propOrder = {
    "caseAction",
    "caseReview",
    "complexity",
    "customerImpact",
    "customerSymptom",
    "estimateResponse",
    "futureActionEvent",
    "notes",
    "problemDetailDescription",
    "resolutionSummary",
    "responseSP",
    "rootCauseAnalysis",
    "serviceInformationSecurity",
    "specialInstruction",
    "testResult",
    "workAroundSummary"
})
public class ServiceInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CaseAction")
    protected String caseAction;
    @XmlElement(name = "CaseReview")
    protected String caseReview;
    @XmlElement(name = "Complexity")
    protected String complexity;
    @XmlElement(name = "CustomerImpact")
    protected String customerImpact;
    @XmlElement(name = "CustomerSymptom")
    protected String customerSymptom;
    @XmlElement(name = "EstimateResponse")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimateResponse;
    @XmlElement(name = "FutureActionEvent")
    protected List<String> futureActionEvent;
    @XmlElementRef(name = "Notes", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = Notes.class, required = false)
    protected List<Notes> notes;
    @XmlElement(name = "ProblemDetailDescription")
    protected String problemDetailDescription;
    @XmlElement(name = "ResolutionSummary")
    protected String resolutionSummary;
    @XmlElement(name = "ResponseSP")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseSP;
    @XmlElement(name = "RootCauseAnalysis")
    protected List<String> rootCauseAnalysis;
    @XmlElement(name = "ServiceInformationSecurity", required = true)
    protected String serviceInformationSecurity;
    @XmlElement(name = "SpecialInstruction")
    protected String specialInstruction;
    @XmlElement(name = "TestResult")
    protected List<String> testResult;
    @XmlElement(name = "WorkAroundSummary")
    protected String workAroundSummary;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the caseAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseAction() {
        return caseAction;
    }

    /**
     * Sets the value of the caseAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseAction(String value) {
        this.caseAction = value;
    }

    /**
     * Gets the value of the caseReview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseReview() {
        return caseReview;
    }

    /**
     * Sets the value of the caseReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseReview(String value) {
        this.caseReview = value;
    }

    /**
     * Gets the value of the complexity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexity() {
        return complexity;
    }

    /**
     * Sets the value of the complexity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexity(String value) {
        this.complexity = value;
    }

    /**
     * Gets the value of the customerImpact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerImpact() {
        return customerImpact;
    }

    /**
     * Sets the value of the customerImpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerImpact(String value) {
        this.customerImpact = value;
    }

    /**
     * Gets the value of the customerSymptom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSymptom() {
        return customerSymptom;
    }

    /**
     * Sets the value of the customerSymptom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSymptom(String value) {
        this.customerSymptom = value;
    }

    /**
     * Gets the value of the estimateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimateResponse() {
        return estimateResponse;
    }

    /**
     * Sets the value of the estimateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimateResponse(XMLGregorianCalendar value) {
        this.estimateResponse = value;
    }

    /**
     * Gets the value of the futureActionEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the futureActionEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFutureActionEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFutureActionEvent() {
        if (futureActionEvent == null) {
            futureActionEvent = new ArrayList<String>();
        }
        return this.futureActionEvent;
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
     * {@link Notes }
     * 
     * 
     */
    public List<Notes> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Notes>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the problemDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemDetailDescription() {
        return problemDetailDescription;
    }

    /**
     * Sets the value of the problemDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemDetailDescription(String value) {
        this.problemDetailDescription = value;
    }

    /**
     * Gets the value of the resolutionSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionSummary() {
        return resolutionSummary;
    }

    /**
     * Sets the value of the resolutionSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionSummary(String value) {
        this.resolutionSummary = value;
    }

    /**
     * Gets the value of the responseSP property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseSP() {
        return responseSP;
    }

    /**
     * Sets the value of the responseSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseSP(XMLGregorianCalendar value) {
        this.responseSP = value;
    }

    /**
     * Gets the value of the rootCauseAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rootCauseAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRootCauseAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRootCauseAnalysis() {
        if (rootCauseAnalysis == null) {
            rootCauseAnalysis = new ArrayList<String>();
        }
        return this.rootCauseAnalysis;
    }

    /**
     * Gets the value of the serviceInformationSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInformationSecurity() {
        return serviceInformationSecurity;
    }

    /**
     * Sets the value of the serviceInformationSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInformationSecurity(String value) {
        this.serviceInformationSecurity = value;
    }

    /**
     * Gets the value of the specialInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstruction() {
        return specialInstruction;
    }

    /**
     * Sets the value of the specialInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstruction(String value) {
        this.specialInstruction = value;
    }

    /**
     * Gets the value of the testResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTestResult() {
        if (testResult == null) {
            testResult = new ArrayList<String>();
        }
        return this.testResult;
    }

    /**
     * Gets the value of the workAroundSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkAroundSummary() {
        return workAroundSummary;
    }

    /**
     * Sets the value of the workAroundSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkAroundSummary(String value) {
        this.workAroundSummary = value;
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
        final ServiceInformationType that = ((ServiceInformationType) object);
        {
            String lhsCaseAction;
            lhsCaseAction = this.getCaseAction();
            String rhsCaseAction;
            rhsCaseAction = that.getCaseAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "caseAction", lhsCaseAction), LocatorUtils.property(thatLocator, "caseAction", rhsCaseAction), lhsCaseAction, rhsCaseAction, (this.caseAction!= null), (that.caseAction!= null))) {
                return false;
            }
        }
        {
            String lhsCaseReview;
            lhsCaseReview = this.getCaseReview();
            String rhsCaseReview;
            rhsCaseReview = that.getCaseReview();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "caseReview", lhsCaseReview), LocatorUtils.property(thatLocator, "caseReview", rhsCaseReview), lhsCaseReview, rhsCaseReview, (this.caseReview!= null), (that.caseReview!= null))) {
                return false;
            }
        }
        {
            String lhsComplexity;
            lhsComplexity = this.getComplexity();
            String rhsComplexity;
            rhsComplexity = that.getComplexity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "complexity", lhsComplexity), LocatorUtils.property(thatLocator, "complexity", rhsComplexity), lhsComplexity, rhsComplexity, (this.complexity!= null), (that.complexity!= null))) {
                return false;
            }
        }
        {
            String lhsCustomerImpact;
            lhsCustomerImpact = this.getCustomerImpact();
            String rhsCustomerImpact;
            rhsCustomerImpact = that.getCustomerImpact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerImpact", lhsCustomerImpact), LocatorUtils.property(thatLocator, "customerImpact", rhsCustomerImpact), lhsCustomerImpact, rhsCustomerImpact, (this.customerImpact!= null), (that.customerImpact!= null))) {
                return false;
            }
        }
        {
            String lhsCustomerSymptom;
            lhsCustomerSymptom = this.getCustomerSymptom();
            String rhsCustomerSymptom;
            rhsCustomerSymptom = that.getCustomerSymptom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerSymptom", lhsCustomerSymptom), LocatorUtils.property(thatLocator, "customerSymptom", rhsCustomerSymptom), lhsCustomerSymptom, rhsCustomerSymptom, (this.customerSymptom!= null), (that.customerSymptom!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEstimateResponse;
            lhsEstimateResponse = this.getEstimateResponse();
            XMLGregorianCalendar rhsEstimateResponse;
            rhsEstimateResponse = that.getEstimateResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimateResponse", lhsEstimateResponse), LocatorUtils.property(thatLocator, "estimateResponse", rhsEstimateResponse), lhsEstimateResponse, rhsEstimateResponse, (this.estimateResponse!= null), (that.estimateResponse!= null))) {
                return false;
            }
        }
        {
            List<String> lhsFutureActionEvent;
            lhsFutureActionEvent = (((this.futureActionEvent!= null)&&(!this.futureActionEvent.isEmpty()))?this.getFutureActionEvent():null);
            List<String> rhsFutureActionEvent;
            rhsFutureActionEvent = (((that.futureActionEvent!= null)&&(!that.futureActionEvent.isEmpty()))?that.getFutureActionEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "futureActionEvent", lhsFutureActionEvent), LocatorUtils.property(thatLocator, "futureActionEvent", rhsFutureActionEvent), lhsFutureActionEvent, rhsFutureActionEvent, ((this.futureActionEvent!= null)&&(!this.futureActionEvent.isEmpty())), ((that.futureActionEvent!= null)&&(!that.futureActionEvent.isEmpty())))) {
                return false;
            }
        }
        {
            List<Notes> lhsNotes;
            lhsNotes = (((this.notes!= null)&&(!this.notes.isEmpty()))?this.getNotes():null);
            List<Notes> rhsNotes;
            rhsNotes = (((that.notes!= null)&&(!that.notes.isEmpty()))?that.getNotes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notes", lhsNotes), LocatorUtils.property(thatLocator, "notes", rhsNotes), lhsNotes, rhsNotes, ((this.notes!= null)&&(!this.notes.isEmpty())), ((that.notes!= null)&&(!that.notes.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsProblemDetailDescription;
            lhsProblemDetailDescription = this.getProblemDetailDescription();
            String rhsProblemDetailDescription;
            rhsProblemDetailDescription = that.getProblemDetailDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "problemDetailDescription", lhsProblemDetailDescription), LocatorUtils.property(thatLocator, "problemDetailDescription", rhsProblemDetailDescription), lhsProblemDetailDescription, rhsProblemDetailDescription, (this.problemDetailDescription!= null), (that.problemDetailDescription!= null))) {
                return false;
            }
        }
        {
            String lhsResolutionSummary;
            lhsResolutionSummary = this.getResolutionSummary();
            String rhsResolutionSummary;
            rhsResolutionSummary = that.getResolutionSummary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resolutionSummary", lhsResolutionSummary), LocatorUtils.property(thatLocator, "resolutionSummary", rhsResolutionSummary), lhsResolutionSummary, rhsResolutionSummary, (this.resolutionSummary!= null), (that.resolutionSummary!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsResponseSP;
            lhsResponseSP = this.getResponseSP();
            XMLGregorianCalendar rhsResponseSP;
            rhsResponseSP = that.getResponseSP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseSP", lhsResponseSP), LocatorUtils.property(thatLocator, "responseSP", rhsResponseSP), lhsResponseSP, rhsResponseSP, (this.responseSP!= null), (that.responseSP!= null))) {
                return false;
            }
        }
        {
            List<String> lhsRootCauseAnalysis;
            lhsRootCauseAnalysis = (((this.rootCauseAnalysis!= null)&&(!this.rootCauseAnalysis.isEmpty()))?this.getRootCauseAnalysis():null);
            List<String> rhsRootCauseAnalysis;
            rhsRootCauseAnalysis = (((that.rootCauseAnalysis!= null)&&(!that.rootCauseAnalysis.isEmpty()))?that.getRootCauseAnalysis():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rootCauseAnalysis", lhsRootCauseAnalysis), LocatorUtils.property(thatLocator, "rootCauseAnalysis", rhsRootCauseAnalysis), lhsRootCauseAnalysis, rhsRootCauseAnalysis, ((this.rootCauseAnalysis!= null)&&(!this.rootCauseAnalysis.isEmpty())), ((that.rootCauseAnalysis!= null)&&(!that.rootCauseAnalysis.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsServiceInformationSecurity;
            lhsServiceInformationSecurity = this.getServiceInformationSecurity();
            String rhsServiceInformationSecurity;
            rhsServiceInformationSecurity = that.getServiceInformationSecurity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceInformationSecurity", lhsServiceInformationSecurity), LocatorUtils.property(thatLocator, "serviceInformationSecurity", rhsServiceInformationSecurity), lhsServiceInformationSecurity, rhsServiceInformationSecurity, (this.serviceInformationSecurity!= null), (that.serviceInformationSecurity!= null))) {
                return false;
            }
        }
        {
            String lhsSpecialInstruction;
            lhsSpecialInstruction = this.getSpecialInstruction();
            String rhsSpecialInstruction;
            rhsSpecialInstruction = that.getSpecialInstruction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialInstruction", lhsSpecialInstruction), LocatorUtils.property(thatLocator, "specialInstruction", rhsSpecialInstruction), lhsSpecialInstruction, rhsSpecialInstruction, (this.specialInstruction!= null), (that.specialInstruction!= null))) {
                return false;
            }
        }
        {
            List<String> lhsTestResult;
            lhsTestResult = (((this.testResult!= null)&&(!this.testResult.isEmpty()))?this.getTestResult():null);
            List<String> rhsTestResult;
            rhsTestResult = (((that.testResult!= null)&&(!that.testResult.isEmpty()))?that.getTestResult():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testResult", lhsTestResult), LocatorUtils.property(thatLocator, "testResult", rhsTestResult), lhsTestResult, rhsTestResult, ((this.testResult!= null)&&(!this.testResult.isEmpty())), ((that.testResult!= null)&&(!that.testResult.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsWorkAroundSummary;
            lhsWorkAroundSummary = this.getWorkAroundSummary();
            String rhsWorkAroundSummary;
            rhsWorkAroundSummary = that.getWorkAroundSummary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workAroundSummary", lhsWorkAroundSummary), LocatorUtils.property(thatLocator, "workAroundSummary", rhsWorkAroundSummary), lhsWorkAroundSummary, rhsWorkAroundSummary, (this.workAroundSummary!= null), (that.workAroundSummary!= null))) {
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
            String theCaseAction;
            theCaseAction = this.getCaseAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "caseAction", theCaseAction), currentHashCode, theCaseAction, (this.caseAction!= null));
        }
        {
            String theCaseReview;
            theCaseReview = this.getCaseReview();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "caseReview", theCaseReview), currentHashCode, theCaseReview, (this.caseReview!= null));
        }
        {
            String theComplexity;
            theComplexity = this.getComplexity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "complexity", theComplexity), currentHashCode, theComplexity, (this.complexity!= null));
        }
        {
            String theCustomerImpact;
            theCustomerImpact = this.getCustomerImpact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerImpact", theCustomerImpact), currentHashCode, theCustomerImpact, (this.customerImpact!= null));
        }
        {
            String theCustomerSymptom;
            theCustomerSymptom = this.getCustomerSymptom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerSymptom", theCustomerSymptom), currentHashCode, theCustomerSymptom, (this.customerSymptom!= null));
        }
        {
            XMLGregorianCalendar theEstimateResponse;
            theEstimateResponse = this.getEstimateResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimateResponse", theEstimateResponse), currentHashCode, theEstimateResponse, (this.estimateResponse!= null));
        }
        {
            List<String> theFutureActionEvent;
            theFutureActionEvent = (((this.futureActionEvent!= null)&&(!this.futureActionEvent.isEmpty()))?this.getFutureActionEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "futureActionEvent", theFutureActionEvent), currentHashCode, theFutureActionEvent, ((this.futureActionEvent!= null)&&(!this.futureActionEvent.isEmpty())));
        }
        {
            List<Notes> theNotes;
            theNotes = (((this.notes!= null)&&(!this.notes.isEmpty()))?this.getNotes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes, ((this.notes!= null)&&(!this.notes.isEmpty())));
        }
        {
            String theProblemDetailDescription;
            theProblemDetailDescription = this.getProblemDetailDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "problemDetailDescription", theProblemDetailDescription), currentHashCode, theProblemDetailDescription, (this.problemDetailDescription!= null));
        }
        {
            String theResolutionSummary;
            theResolutionSummary = this.getResolutionSummary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resolutionSummary", theResolutionSummary), currentHashCode, theResolutionSummary, (this.resolutionSummary!= null));
        }
        {
            XMLGregorianCalendar theResponseSP;
            theResponseSP = this.getResponseSP();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseSP", theResponseSP), currentHashCode, theResponseSP, (this.responseSP!= null));
        }
        {
            List<String> theRootCauseAnalysis;
            theRootCauseAnalysis = (((this.rootCauseAnalysis!= null)&&(!this.rootCauseAnalysis.isEmpty()))?this.getRootCauseAnalysis():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rootCauseAnalysis", theRootCauseAnalysis), currentHashCode, theRootCauseAnalysis, ((this.rootCauseAnalysis!= null)&&(!this.rootCauseAnalysis.isEmpty())));
        }
        {
            String theServiceInformationSecurity;
            theServiceInformationSecurity = this.getServiceInformationSecurity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceInformationSecurity", theServiceInformationSecurity), currentHashCode, theServiceInformationSecurity, (this.serviceInformationSecurity!= null));
        }
        {
            String theSpecialInstruction;
            theSpecialInstruction = this.getSpecialInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialInstruction", theSpecialInstruction), currentHashCode, theSpecialInstruction, (this.specialInstruction!= null));
        }
        {
            List<String> theTestResult;
            theTestResult = (((this.testResult!= null)&&(!this.testResult.isEmpty()))?this.getTestResult():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testResult", theTestResult), currentHashCode, theTestResult, ((this.testResult!= null)&&(!this.testResult.isEmpty())));
        }
        {
            String theWorkAroundSummary;
            theWorkAroundSummary = this.getWorkAroundSummary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workAroundSummary", theWorkAroundSummary), currentHashCode, theWorkAroundSummary, (this.workAroundSummary!= null));
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
            String theCaseAction;
            theCaseAction = this.getCaseAction();
            strategy.appendField(locator, this, "caseAction", buffer, theCaseAction, (this.caseAction!= null));
        }
        {
            String theCaseReview;
            theCaseReview = this.getCaseReview();
            strategy.appendField(locator, this, "caseReview", buffer, theCaseReview, (this.caseReview!= null));
        }
        {
            String theComplexity;
            theComplexity = this.getComplexity();
            strategy.appendField(locator, this, "complexity", buffer, theComplexity, (this.complexity!= null));
        }
        {
            String theCustomerImpact;
            theCustomerImpact = this.getCustomerImpact();
            strategy.appendField(locator, this, "customerImpact", buffer, theCustomerImpact, (this.customerImpact!= null));
        }
        {
            String theCustomerSymptom;
            theCustomerSymptom = this.getCustomerSymptom();
            strategy.appendField(locator, this, "customerSymptom", buffer, theCustomerSymptom, (this.customerSymptom!= null));
        }
        {
            XMLGregorianCalendar theEstimateResponse;
            theEstimateResponse = this.getEstimateResponse();
            strategy.appendField(locator, this, "estimateResponse", buffer, theEstimateResponse, (this.estimateResponse!= null));
        }
        {
            List<String> theFutureActionEvent;
            theFutureActionEvent = (((this.futureActionEvent!= null)&&(!this.futureActionEvent.isEmpty()))?this.getFutureActionEvent():null);
            strategy.appendField(locator, this, "futureActionEvent", buffer, theFutureActionEvent, ((this.futureActionEvent!= null)&&(!this.futureActionEvent.isEmpty())));
        }
        {
            List<Notes> theNotes;
            theNotes = (((this.notes!= null)&&(!this.notes.isEmpty()))?this.getNotes():null);
            strategy.appendField(locator, this, "notes", buffer, theNotes, ((this.notes!= null)&&(!this.notes.isEmpty())));
        }
        {
            String theProblemDetailDescription;
            theProblemDetailDescription = this.getProblemDetailDescription();
            strategy.appendField(locator, this, "problemDetailDescription", buffer, theProblemDetailDescription, (this.problemDetailDescription!= null));
        }
        {
            String theResolutionSummary;
            theResolutionSummary = this.getResolutionSummary();
            strategy.appendField(locator, this, "resolutionSummary", buffer, theResolutionSummary, (this.resolutionSummary!= null));
        }
        {
            XMLGregorianCalendar theResponseSP;
            theResponseSP = this.getResponseSP();
            strategy.appendField(locator, this, "responseSP", buffer, theResponseSP, (this.responseSP!= null));
        }
        {
            List<String> theRootCauseAnalysis;
            theRootCauseAnalysis = (((this.rootCauseAnalysis!= null)&&(!this.rootCauseAnalysis.isEmpty()))?this.getRootCauseAnalysis():null);
            strategy.appendField(locator, this, "rootCauseAnalysis", buffer, theRootCauseAnalysis, ((this.rootCauseAnalysis!= null)&&(!this.rootCauseAnalysis.isEmpty())));
        }
        {
            String theServiceInformationSecurity;
            theServiceInformationSecurity = this.getServiceInformationSecurity();
            strategy.appendField(locator, this, "serviceInformationSecurity", buffer, theServiceInformationSecurity, (this.serviceInformationSecurity!= null));
        }
        {
            String theSpecialInstruction;
            theSpecialInstruction = this.getSpecialInstruction();
            strategy.appendField(locator, this, "specialInstruction", buffer, theSpecialInstruction, (this.specialInstruction!= null));
        }
        {
            List<String> theTestResult;
            theTestResult = (((this.testResult!= null)&&(!this.testResult.isEmpty()))?this.getTestResult():null);
            strategy.appendField(locator, this, "testResult", buffer, theTestResult, ((this.testResult!= null)&&(!this.testResult.isEmpty())));
        }
        {
            String theWorkAroundSummary;
            theWorkAroundSummary = this.getWorkAroundSummary();
            strategy.appendField(locator, this, "workAroundSummary", buffer, theWorkAroundSummary, (this.workAroundSummary!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
