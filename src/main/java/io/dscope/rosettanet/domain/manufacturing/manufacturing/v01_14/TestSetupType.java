
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

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
 * <p>Java class for TestSetupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestSetupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SetupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SetupVersion" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="TesterControlSoftware" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TesterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestProgEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestProgramName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14}TestTemperature" minOccurs="0"/&gt;
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
@XmlType(name = "TestSetupType", propOrder = {
    "primaryIdentifier",
    "setupName",
    "setupVersion",
    "testerControlSoftware",
    "testerType",
    "testProgEC",
    "testProgramName",
    "testTemperature"
})
public class TestSetupType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "SetupName")
    protected String setupName;
    @XmlElement(name = "SetupVersion")
    protected Float setupVersion;
    @XmlElement(name = "TesterControlSoftware")
    protected String testerControlSoftware;
    @XmlElement(name = "TesterType")
    protected String testerType;
    @XmlElement(name = "TestProgEC")
    protected String testProgEC;
    @XmlElement(name = "TestProgramName", required = true)
    protected String testProgramName;
    @XmlElementRef(name = "TestTemperature", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", type = TestTemperature.class, required = false)
    protected TestTemperature testTemperature;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the setupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetupName() {
        return setupName;
    }

    /**
     * Sets the value of the setupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupName(String value) {
        this.setupName = value;
    }

    /**
     * Gets the value of the setupVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSetupVersion() {
        return setupVersion;
    }

    /**
     * Sets the value of the setupVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSetupVersion(Float value) {
        this.setupVersion = value;
    }

    /**
     * Gets the value of the testerControlSoftware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTesterControlSoftware() {
        return testerControlSoftware;
    }

    /**
     * Sets the value of the testerControlSoftware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTesterControlSoftware(String value) {
        this.testerControlSoftware = value;
    }

    /**
     * Gets the value of the testerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTesterType() {
        return testerType;
    }

    /**
     * Sets the value of the testerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTesterType(String value) {
        this.testerType = value;
    }

    /**
     * Gets the value of the testProgEC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestProgEC() {
        return testProgEC;
    }

    /**
     * Sets the value of the testProgEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestProgEC(String value) {
        this.testProgEC = value;
    }

    /**
     * Gets the value of the testProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestProgramName() {
        return testProgramName;
    }

    /**
     * Sets the value of the testProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestProgramName(String value) {
        this.testProgramName = value;
    }

    /**
     * Gets the value of the testTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TestTemperature }
     *     
     */
    public TestTemperature getTestTemperature() {
        return testTemperature;
    }

    /**
     * Sets the value of the testTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestTemperature }
     *     
     */
    public void setTestTemperature(TestTemperature value) {
        this.testTemperature = value;
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
        final TestSetupType that = ((TestSetupType) object);
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
            String lhsSetupName;
            lhsSetupName = this.getSetupName();
            String rhsSetupName;
            rhsSetupName = that.getSetupName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "setupName", lhsSetupName), LocatorUtils.property(thatLocator, "setupName", rhsSetupName), lhsSetupName, rhsSetupName, (this.setupName!= null), (that.setupName!= null))) {
                return false;
            }
        }
        {
            Float lhsSetupVersion;
            lhsSetupVersion = this.getSetupVersion();
            Float rhsSetupVersion;
            rhsSetupVersion = that.getSetupVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "setupVersion", lhsSetupVersion), LocatorUtils.property(thatLocator, "setupVersion", rhsSetupVersion), lhsSetupVersion, rhsSetupVersion, (this.setupVersion!= null), (that.setupVersion!= null))) {
                return false;
            }
        }
        {
            String lhsTesterControlSoftware;
            lhsTesterControlSoftware = this.getTesterControlSoftware();
            String rhsTesterControlSoftware;
            rhsTesterControlSoftware = that.getTesterControlSoftware();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testerControlSoftware", lhsTesterControlSoftware), LocatorUtils.property(thatLocator, "testerControlSoftware", rhsTesterControlSoftware), lhsTesterControlSoftware, rhsTesterControlSoftware, (this.testerControlSoftware!= null), (that.testerControlSoftware!= null))) {
                return false;
            }
        }
        {
            String lhsTesterType;
            lhsTesterType = this.getTesterType();
            String rhsTesterType;
            rhsTesterType = that.getTesterType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testerType", lhsTesterType), LocatorUtils.property(thatLocator, "testerType", rhsTesterType), lhsTesterType, rhsTesterType, (this.testerType!= null), (that.testerType!= null))) {
                return false;
            }
        }
        {
            String lhsTestProgEC;
            lhsTestProgEC = this.getTestProgEC();
            String rhsTestProgEC;
            rhsTestProgEC = that.getTestProgEC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testProgEC", lhsTestProgEC), LocatorUtils.property(thatLocator, "testProgEC", rhsTestProgEC), lhsTestProgEC, rhsTestProgEC, (this.testProgEC!= null), (that.testProgEC!= null))) {
                return false;
            }
        }
        {
            String lhsTestProgramName;
            lhsTestProgramName = this.getTestProgramName();
            String rhsTestProgramName;
            rhsTestProgramName = that.getTestProgramName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testProgramName", lhsTestProgramName), LocatorUtils.property(thatLocator, "testProgramName", rhsTestProgramName), lhsTestProgramName, rhsTestProgramName, (this.testProgramName!= null), (that.testProgramName!= null))) {
                return false;
            }
        }
        {
            TestTemperature lhsTestTemperature;
            lhsTestTemperature = this.getTestTemperature();
            TestTemperature rhsTestTemperature;
            rhsTestTemperature = that.getTestTemperature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testTemperature", lhsTestTemperature), LocatorUtils.property(thatLocator, "testTemperature", rhsTestTemperature), lhsTestTemperature, rhsTestTemperature, (this.testTemperature!= null), (that.testTemperature!= null))) {
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
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryIdentifier", thePrimaryIdentifier), currentHashCode, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            String theSetupName;
            theSetupName = this.getSetupName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "setupName", theSetupName), currentHashCode, theSetupName, (this.setupName!= null));
        }
        {
            Float theSetupVersion;
            theSetupVersion = this.getSetupVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "setupVersion", theSetupVersion), currentHashCode, theSetupVersion, (this.setupVersion!= null));
        }
        {
            String theTesterControlSoftware;
            theTesterControlSoftware = this.getTesterControlSoftware();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testerControlSoftware", theTesterControlSoftware), currentHashCode, theTesterControlSoftware, (this.testerControlSoftware!= null));
        }
        {
            String theTesterType;
            theTesterType = this.getTesterType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testerType", theTesterType), currentHashCode, theTesterType, (this.testerType!= null));
        }
        {
            String theTestProgEC;
            theTestProgEC = this.getTestProgEC();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testProgEC", theTestProgEC), currentHashCode, theTestProgEC, (this.testProgEC!= null));
        }
        {
            String theTestProgramName;
            theTestProgramName = this.getTestProgramName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testProgramName", theTestProgramName), currentHashCode, theTestProgramName, (this.testProgramName!= null));
        }
        {
            TestTemperature theTestTemperature;
            theTestTemperature = this.getTestTemperature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testTemperature", theTestTemperature), currentHashCode, theTestTemperature, (this.testTemperature!= null));
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
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            strategy.appendField(locator, this, "primaryIdentifier", buffer, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            String theSetupName;
            theSetupName = this.getSetupName();
            strategy.appendField(locator, this, "setupName", buffer, theSetupName, (this.setupName!= null));
        }
        {
            Float theSetupVersion;
            theSetupVersion = this.getSetupVersion();
            strategy.appendField(locator, this, "setupVersion", buffer, theSetupVersion, (this.setupVersion!= null));
        }
        {
            String theTesterControlSoftware;
            theTesterControlSoftware = this.getTesterControlSoftware();
            strategy.appendField(locator, this, "testerControlSoftware", buffer, theTesterControlSoftware, (this.testerControlSoftware!= null));
        }
        {
            String theTesterType;
            theTesterType = this.getTesterType();
            strategy.appendField(locator, this, "testerType", buffer, theTesterType, (this.testerType!= null));
        }
        {
            String theTestProgEC;
            theTestProgEC = this.getTestProgEC();
            strategy.appendField(locator, this, "testProgEC", buffer, theTestProgEC, (this.testProgEC!= null));
        }
        {
            String theTestProgramName;
            theTestProgramName = this.getTestProgramName();
            strategy.appendField(locator, this, "testProgramName", buffer, theTestProgramName, (this.testProgramName!= null));
        }
        {
            TestTemperature theTestTemperature;
            theTestTemperature = this.getTestTemperature();
            strategy.appendField(locator, this, "testTemperature", buffer, theTestTemperature, (this.testTemperature!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
