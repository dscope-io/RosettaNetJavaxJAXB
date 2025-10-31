
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.testresult.v01_03.TestResult;
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
 * <p>Java class for AssemblyMeasurementReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssemblyMeasurementReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FailureMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Measurement" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PinInformation" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}PinInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TesterAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:01.03}TestResult" minOccurs="0"/&gt;
 *         &lt;element name="TestType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AssemblyMeasurementReportType", propOrder = {
    "failureMode",
    "measurement",
    "pinInformation",
    "primaryIdentifier",
    "testerAlarm",
    "testResult",
    "testType"
})
public class AssemblyMeasurementReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "FailureMode")
    protected String failureMode;
    @XmlElement(name = "Measurement", type = Float.class)
    protected List<Float> measurement;
    @XmlElement(name = "PinInformation")
    protected List<PinInformationType> pinInformation;
    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "TesterAlarm")
    protected Boolean testerAlarm;
    @XmlElementRef(name = "TestResult", namespace = "urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:01.03", type = TestResult.class, required = false)
    protected TestResult testResult;
    @XmlElement(name = "TestType")
    protected List<String> testType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the failureMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureMode() {
        return failureMode;
    }

    /**
     * Sets the value of the failureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureMode(String value) {
        this.failureMode = value;
    }

    /**
     * Gets the value of the measurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getMeasurement() {
        if (measurement == null) {
            measurement = new ArrayList<Float>();
        }
        return this.measurement;
    }

    /**
     * Gets the value of the pinInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pinInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPinInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PinInformationType }
     * 
     * 
     */
    public List<PinInformationType> getPinInformation() {
        if (pinInformation == null) {
            pinInformation = new ArrayList<PinInformationType>();
        }
        return this.pinInformation;
    }

    /**
     * Gets the value of the primaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    /**
     * Sets the value of the primaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrimaryIdentifier(BigInteger value) {
        this.primaryIdentifier = value;
    }

    /**
     * Gets the value of the testerAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTesterAlarm() {
        return testerAlarm;
    }

    /**
     * Sets the value of the testerAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTesterAlarm(Boolean value) {
        this.testerAlarm = value;
    }

    /**
     * Gets the value of the testResult property.
     * 
     * @return
     *     possible object is
     *     {@link TestResult }
     *     
     */
    public TestResult getTestResult() {
        return testResult;
    }

    /**
     * Sets the value of the testResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestResult }
     *     
     */
    public void setTestResult(TestResult value) {
        this.testResult = value;
    }

    /**
     * Gets the value of the testType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTestType() {
        if (testType == null) {
            testType = new ArrayList<String>();
        }
        return this.testType;
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
        final AssemblyMeasurementReportType that = ((AssemblyMeasurementReportType) object);
        {
            String lhsFailureMode;
            lhsFailureMode = this.getFailureMode();
            String rhsFailureMode;
            rhsFailureMode = that.getFailureMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failureMode", lhsFailureMode), LocatorUtils.property(thatLocator, "failureMode", rhsFailureMode), lhsFailureMode, rhsFailureMode, (this.failureMode!= null), (that.failureMode!= null))) {
                return false;
            }
        }
        {
            List<Float> lhsMeasurement;
            lhsMeasurement = (((this.measurement!= null)&&(!this.measurement.isEmpty()))?this.getMeasurement():null);
            List<Float> rhsMeasurement;
            rhsMeasurement = (((that.measurement!= null)&&(!that.measurement.isEmpty()))?that.getMeasurement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurement", lhsMeasurement), LocatorUtils.property(thatLocator, "measurement", rhsMeasurement), lhsMeasurement, rhsMeasurement, ((this.measurement!= null)&&(!this.measurement.isEmpty())), ((that.measurement!= null)&&(!that.measurement.isEmpty())))) {
                return false;
            }
        }
        {
            List<PinInformationType> lhsPinInformation;
            lhsPinInformation = (((this.pinInformation!= null)&&(!this.pinInformation.isEmpty()))?this.getPinInformation():null);
            List<PinInformationType> rhsPinInformation;
            rhsPinInformation = (((that.pinInformation!= null)&&(!that.pinInformation.isEmpty()))?that.getPinInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pinInformation", lhsPinInformation), LocatorUtils.property(thatLocator, "pinInformation", rhsPinInformation), lhsPinInformation, rhsPinInformation, ((this.pinInformation!= null)&&(!this.pinInformation.isEmpty())), ((that.pinInformation!= null)&&(!that.pinInformation.isEmpty())))) {
                return false;
            }
        }
        {
            BigInteger lhsPrimaryIdentifier;
            lhsPrimaryIdentifier = this.getPrimaryIdentifier();
            BigInteger rhsPrimaryIdentifier;
            rhsPrimaryIdentifier = that.getPrimaryIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryIdentifier", lhsPrimaryIdentifier), LocatorUtils.property(thatLocator, "primaryIdentifier", rhsPrimaryIdentifier), lhsPrimaryIdentifier, rhsPrimaryIdentifier, (this.primaryIdentifier!= null), (that.primaryIdentifier!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTesterAlarm;
            lhsTesterAlarm = this.isTesterAlarm();
            Boolean rhsTesterAlarm;
            rhsTesterAlarm = that.isTesterAlarm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testerAlarm", lhsTesterAlarm), LocatorUtils.property(thatLocator, "testerAlarm", rhsTesterAlarm), lhsTesterAlarm, rhsTesterAlarm, (this.testerAlarm!= null), (that.testerAlarm!= null))) {
                return false;
            }
        }
        {
            TestResult lhsTestResult;
            lhsTestResult = this.getTestResult();
            TestResult rhsTestResult;
            rhsTestResult = that.getTestResult();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testResult", lhsTestResult), LocatorUtils.property(thatLocator, "testResult", rhsTestResult), lhsTestResult, rhsTestResult, (this.testResult!= null), (that.testResult!= null))) {
                return false;
            }
        }
        {
            List<String> lhsTestType;
            lhsTestType = (((this.testType!= null)&&(!this.testType.isEmpty()))?this.getTestType():null);
            List<String> rhsTestType;
            rhsTestType = (((that.testType!= null)&&(!that.testType.isEmpty()))?that.getTestType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testType", lhsTestType), LocatorUtils.property(thatLocator, "testType", rhsTestType), lhsTestType, rhsTestType, ((this.testType!= null)&&(!this.testType.isEmpty())), ((that.testType!= null)&&(!that.testType.isEmpty())))) {
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
            String theFailureMode;
            theFailureMode = this.getFailureMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failureMode", theFailureMode), currentHashCode, theFailureMode, (this.failureMode!= null));
        }
        {
            List<Float> theMeasurement;
            theMeasurement = (((this.measurement!= null)&&(!this.measurement.isEmpty()))?this.getMeasurement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurement", theMeasurement), currentHashCode, theMeasurement, ((this.measurement!= null)&&(!this.measurement.isEmpty())));
        }
        {
            List<PinInformationType> thePinInformation;
            thePinInformation = (((this.pinInformation!= null)&&(!this.pinInformation.isEmpty()))?this.getPinInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pinInformation", thePinInformation), currentHashCode, thePinInformation, ((this.pinInformation!= null)&&(!this.pinInformation.isEmpty())));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryIdentifier", thePrimaryIdentifier), currentHashCode, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            Boolean theTesterAlarm;
            theTesterAlarm = this.isTesterAlarm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testerAlarm", theTesterAlarm), currentHashCode, theTesterAlarm, (this.testerAlarm!= null));
        }
        {
            TestResult theTestResult;
            theTestResult = this.getTestResult();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testResult", theTestResult), currentHashCode, theTestResult, (this.testResult!= null));
        }
        {
            List<String> theTestType;
            theTestType = (((this.testType!= null)&&(!this.testType.isEmpty()))?this.getTestType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testType", theTestType), currentHashCode, theTestType, ((this.testType!= null)&&(!this.testType.isEmpty())));
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
            String theFailureMode;
            theFailureMode = this.getFailureMode();
            strategy.appendField(locator, this, "failureMode", buffer, theFailureMode, (this.failureMode!= null));
        }
        {
            List<Float> theMeasurement;
            theMeasurement = (((this.measurement!= null)&&(!this.measurement.isEmpty()))?this.getMeasurement():null);
            strategy.appendField(locator, this, "measurement", buffer, theMeasurement, ((this.measurement!= null)&&(!this.measurement.isEmpty())));
        }
        {
            List<PinInformationType> thePinInformation;
            thePinInformation = (((this.pinInformation!= null)&&(!this.pinInformation.isEmpty()))?this.getPinInformation():null);
            strategy.appendField(locator, this, "pinInformation", buffer, thePinInformation, ((this.pinInformation!= null)&&(!this.pinInformation.isEmpty())));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            strategy.appendField(locator, this, "primaryIdentifier", buffer, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            Boolean theTesterAlarm;
            theTesterAlarm = this.isTesterAlarm();
            strategy.appendField(locator, this, "testerAlarm", buffer, theTesterAlarm, (this.testerAlarm!= null));
        }
        {
            TestResult theTestResult;
            theTestResult = this.getTestResult();
            strategy.appendField(locator, this, "testResult", buffer, theTestResult, (this.testResult!= null));
        }
        {
            List<String> theTestType;
            theTestType = (((this.testType!= null)&&(!this.testType.isEmpty()))?this.getTestType():null);
            strategy.appendField(locator, this, "testType", buffer, theTestType, ((this.testType!= null)&&(!this.testType.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
