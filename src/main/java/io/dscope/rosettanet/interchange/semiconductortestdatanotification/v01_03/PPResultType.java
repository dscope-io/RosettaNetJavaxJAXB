
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.testresult.v01_02.TestResult;
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
 * <p>Java class for PPResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PPResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Measurement" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:01.02}TestResult" minOccurs="0"/&gt;
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
@XmlType(name = "PPResultType", propOrder = {
    "measurement",
    "pin",
    "testResult"
})
public class PPResultType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Measurement")
    protected float measurement;
    @XmlElement(name = "Pin", required = true)
    protected BigInteger pin;
    @XmlElementRef(name = "TestResult", namespace = "urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:01.02", type = TestResult.class, required = false)
    protected TestResult testResult;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the measurement property.
     * 
     */
    public float getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     * 
     */
    public void setMeasurement(float value) {
        this.measurement = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPin(BigInteger value) {
        this.pin = value;
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
        final PPResultType that = ((PPResultType) object);
        {
            float lhsMeasurement;
            lhsMeasurement = this.getMeasurement();
            float rhsMeasurement;
            rhsMeasurement = that.getMeasurement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurement", lhsMeasurement), LocatorUtils.property(thatLocator, "measurement", rhsMeasurement), lhsMeasurement, rhsMeasurement, true, true)) {
                return false;
            }
        }
        {
            BigInteger lhsPin;
            lhsPin = this.getPin();
            BigInteger rhsPin;
            rhsPin = that.getPin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pin", lhsPin), LocatorUtils.property(thatLocator, "pin", rhsPin), lhsPin, rhsPin, (this.pin!= null), (that.pin!= null))) {
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
            float theMeasurement;
            theMeasurement = this.getMeasurement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurement", theMeasurement), currentHashCode, theMeasurement, true);
        }
        {
            BigInteger thePin;
            thePin = this.getPin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pin", thePin), currentHashCode, thePin, (this.pin!= null));
        }
        {
            TestResult theTestResult;
            theTestResult = this.getTestResult();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testResult", theTestResult), currentHashCode, theTestResult, (this.testResult!= null));
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
            float theMeasurement;
            theMeasurement = this.getMeasurement();
            strategy.appendField(locator, this, "measurement", buffer, theMeasurement, true);
        }
        {
            BigInteger thePin;
            thePin = this.getPin();
            strategy.appendField(locator, this, "pin", buffer, thePin, (this.pin!= null));
        }
        {
            TestResult theTestResult;
            theTestResult = this.getTestResult();
            strategy.appendField(locator, this, "testResult", buffer, theTestResult, (this.testResult!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
