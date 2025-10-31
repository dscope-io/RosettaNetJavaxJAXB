
package io.dscope.rosettanet.domain.service.service.v02_14;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="EstimateResponse" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FutureActionEvent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseSP" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RootCauseAnalysis" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TestResult" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "estimateResponse",
    "futureActionEvent",
    "responseSP",
    "rootCauseAnalysis",
    "testResult"
})
public class ServiceInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CaseAction")
    protected String caseAction;
    @XmlElement(name = "EstimateResponse")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimateResponse;
    @XmlElement(name = "FutureActionEvent")
    protected List<String> futureActionEvent;
    @XmlElement(name = "ResponseSP")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseSP;
    @XmlElement(name = "RootCauseAnalysis")
    protected List<String> rootCauseAnalysis;
    @XmlElement(name = "TestResult")
    protected List<String> testResult;
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
            List<String> lhsTestResult;
            lhsTestResult = (((this.testResult!= null)&&(!this.testResult.isEmpty()))?this.getTestResult():null);
            List<String> rhsTestResult;
            rhsTestResult = (((that.testResult!= null)&&(!that.testResult.isEmpty()))?that.getTestResult():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testResult", lhsTestResult), LocatorUtils.property(thatLocator, "testResult", rhsTestResult), lhsTestResult, rhsTestResult, ((this.testResult!= null)&&(!this.testResult.isEmpty())), ((that.testResult!= null)&&(!that.testResult.isEmpty())))) {
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
            List<String> theTestResult;
            theTestResult = (((this.testResult!= null)&&(!this.testResult.isEmpty()))?this.getTestResult():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testResult", theTestResult), currentHashCode, theTestResult, ((this.testResult!= null)&&(!this.testResult.isEmpty())));
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
            List<String> theTestResult;
            theTestResult = (((this.testResult!= null)&&(!this.testResult.isEmpty()))?this.getTestResult():null);
            strategy.appendField(locator, this, "testResult", buffer, theTestResult, ((this.testResult!= null)&&(!this.testResult.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
