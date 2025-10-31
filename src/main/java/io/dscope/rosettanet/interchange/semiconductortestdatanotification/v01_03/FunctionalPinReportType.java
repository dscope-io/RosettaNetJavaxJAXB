
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
import io.dscope.rosettanet.domain.manufacturing.codelist.bits.v01_02.Bits;
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
 * <p>Java class for FunctionalPinReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionalPinReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:Bits:xsd:codelist:01.02}Bits" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:01.02}TestResult" minOccurs="0"/&gt;
 *         &lt;element name="UserSite" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "FunctionalPinReportType", propOrder = {
    "bits",
    "primaryIdentifier",
    "testResult",
    "userSite"
})
public class FunctionalPinReportType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "Bits", namespace = "urn:rosettanet:specification:domain:Manufacturing:Bits:xsd:codelist:01.02", type = Bits.class, required = false)
    protected Bits bits;
    @XmlElement(name = "PrimaryIdentifier", required = true)
    protected BigInteger primaryIdentifier;
    @XmlElementRef(name = "TestResult", namespace = "urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:01.02", type = TestResult.class, required = false)
    protected TestResult testResult;
    @XmlElement(name = "UserSite")
    protected BigInteger userSite;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the bits property.
     * 
     * @return
     *     possible object is
     *     {@link Bits }
     *     
     */
    public Bits getBits() {
        return bits;
    }

    /**
     * Sets the value of the bits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bits }
     *     
     */
    public void setBits(Bits value) {
        this.bits = value;
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
     * Gets the value of the userSite property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserSite() {
        return userSite;
    }

    /**
     * Sets the value of the userSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserSite(BigInteger value) {
        this.userSite = value;
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
        final FunctionalPinReportType that = ((FunctionalPinReportType) object);
        {
            Bits lhsBits;
            lhsBits = this.getBits();
            Bits rhsBits;
            rhsBits = that.getBits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bits", lhsBits), LocatorUtils.property(thatLocator, "bits", rhsBits), lhsBits, rhsBits, (this.bits!= null), (that.bits!= null))) {
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
            TestResult lhsTestResult;
            lhsTestResult = this.getTestResult();
            TestResult rhsTestResult;
            rhsTestResult = that.getTestResult();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testResult", lhsTestResult), LocatorUtils.property(thatLocator, "testResult", rhsTestResult), lhsTestResult, rhsTestResult, (this.testResult!= null), (that.testResult!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsUserSite;
            lhsUserSite = this.getUserSite();
            BigInteger rhsUserSite;
            rhsUserSite = that.getUserSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userSite", lhsUserSite), LocatorUtils.property(thatLocator, "userSite", rhsUserSite), lhsUserSite, rhsUserSite, (this.userSite!= null), (that.userSite!= null))) {
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
            Bits theBits;
            theBits = this.getBits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bits", theBits), currentHashCode, theBits, (this.bits!= null));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryIdentifier", thePrimaryIdentifier), currentHashCode, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            TestResult theTestResult;
            theTestResult = this.getTestResult();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testResult", theTestResult), currentHashCode, theTestResult, (this.testResult!= null));
        }
        {
            BigInteger theUserSite;
            theUserSite = this.getUserSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userSite", theUserSite), currentHashCode, theUserSite, (this.userSite!= null));
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
            Bits theBits;
            theBits = this.getBits();
            strategy.appendField(locator, this, "bits", buffer, theBits, (this.bits!= null));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            strategy.appendField(locator, this, "primaryIdentifier", buffer, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            TestResult theTestResult;
            theTestResult = this.getTestResult();
            strategy.appendField(locator, this, "testResult", buffer, theTestResult, (this.testResult!= null));
        }
        {
            BigInteger theUserSite;
            theUserSite = this.getUserSite();
            strategy.appendField(locator, this, "userSite", buffer, theUserSite, (this.userSite!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
