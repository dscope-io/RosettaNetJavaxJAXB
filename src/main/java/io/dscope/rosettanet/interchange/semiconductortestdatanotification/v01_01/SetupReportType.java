
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_01;

import java.math.BigDecimal;
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
import io.dscope.rosettanet.domain.manufacturing.codelist.coordinateflag.v01_02.CoordinateFlag;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07.Dimension;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07.TestSetup;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07.Tester;
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
 * <p>Java class for SetupReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetupReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChipPeriodicity" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.01}ChipPeriodicityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:CoordinateFlag:xsd:codelist:01.02}CoordinateFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07}Dimension" maxOccurs="unbounded"/&gt;
 *         &lt;element name="HeadID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParallelTest" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ProbeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quadrant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SampleRate" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.02}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07}Tester"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07}TestSetup"/&gt;
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
@XmlType(name = "SetupReportType", propOrder = {
    "chipPeriodicity",
    "coordinateFlag",
    "dimension",
    "headID",
    "notch",
    "parallelTest",
    "probeName",
    "quadrant",
    "sampleRate",
    "tester",
    "testSetup"
})
public class SetupReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ChipPeriodicity")
    protected ChipPeriodicityType chipPeriodicity;
    @XmlElementRef(name = "CoordinateFlag", namespace = "urn:rosettanet:specification:domain:Manufacturing:CoordinateFlag:xsd:codelist:01.02", type = CoordinateFlag.class, required = false)
    protected CoordinateFlag coordinateFlag;
    @XmlElementRef(name = "Dimension", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", type = Dimension.class)
    protected List<Dimension> dimension;
    @XmlElement(name = "HeadID")
    protected String headID;
    @XmlElement(name = "Notch")
    protected String notch;
    @XmlElement(name = "ParallelTest")
    protected BigInteger parallelTest;
    @XmlElement(name = "ProbeName")
    protected String probeName;
    @XmlElement(name = "Quadrant")
    protected String quadrant;
    @XmlElement(name = "SampleRate")
    protected BigDecimal sampleRate;
    @XmlElementRef(name = "Tester", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", type = Tester.class)
    protected Tester tester;
    @XmlElementRef(name = "TestSetup", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", type = TestSetup.class)
    protected TestSetup testSetup;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the chipPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link ChipPeriodicityType }
     *     
     */
    public ChipPeriodicityType getChipPeriodicity() {
        return chipPeriodicity;
    }

    /**
     * Sets the value of the chipPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChipPeriodicityType }
     *     
     */
    public void setChipPeriodicity(ChipPeriodicityType value) {
        this.chipPeriodicity = value;
    }

    /**
     * Gets the value of the coordinateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateFlag }
     *     
     */
    public CoordinateFlag getCoordinateFlag() {
        return coordinateFlag;
    }

    /**
     * Sets the value of the coordinateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateFlag }
     *     
     */
    public void setCoordinateFlag(CoordinateFlag value) {
        this.coordinateFlag = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dimension }
     * 
     * 
     */
    public List<Dimension> getDimension() {
        if (dimension == null) {
            dimension = new ArrayList<Dimension>();
        }
        return this.dimension;
    }

    /**
     * Gets the value of the headID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadID() {
        return headID;
    }

    /**
     * Sets the value of the headID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadID(String value) {
        this.headID = value;
    }

    /**
     * Gets the value of the notch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotch() {
        return notch;
    }

    /**
     * Sets the value of the notch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotch(String value) {
        this.notch = value;
    }

    /**
     * Gets the value of the parallelTest property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParallelTest() {
        return parallelTest;
    }

    /**
     * Sets the value of the parallelTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParallelTest(BigInteger value) {
        this.parallelTest = value;
    }

    /**
     * Gets the value of the probeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbeName() {
        return probeName;
    }

    /**
     * Sets the value of the probeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbeName(String value) {
        this.probeName = value;
    }

    /**
     * Gets the value of the quadrant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuadrant() {
        return quadrant;
    }

    /**
     * Sets the value of the quadrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuadrant(String value) {
        this.quadrant = value;
    }

    /**
     * Gets the value of the sampleRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSampleRate() {
        return sampleRate;
    }

    /**
     * Sets the value of the sampleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSampleRate(BigDecimal value) {
        this.sampleRate = value;
    }

    /**
     * Gets the value of the tester property.
     * 
     * @return
     *     possible object is
     *     {@link Tester }
     *     
     */
    public Tester getTester() {
        return tester;
    }

    /**
     * Sets the value of the tester property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tester }
     *     
     */
    public void setTester(Tester value) {
        this.tester = value;
    }

    /**
     * Gets the value of the testSetup property.
     * 
     * @return
     *     possible object is
     *     {@link TestSetup }
     *     
     */
    public TestSetup getTestSetup() {
        return testSetup;
    }

    /**
     * Sets the value of the testSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestSetup }
     *     
     */
    public void setTestSetup(TestSetup value) {
        this.testSetup = value;
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
        final SetupReportType that = ((SetupReportType) object);
        {
            ChipPeriodicityType lhsChipPeriodicity;
            lhsChipPeriodicity = this.getChipPeriodicity();
            ChipPeriodicityType rhsChipPeriodicity;
            rhsChipPeriodicity = that.getChipPeriodicity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chipPeriodicity", lhsChipPeriodicity), LocatorUtils.property(thatLocator, "chipPeriodicity", rhsChipPeriodicity), lhsChipPeriodicity, rhsChipPeriodicity, (this.chipPeriodicity!= null), (that.chipPeriodicity!= null))) {
                return false;
            }
        }
        {
            CoordinateFlag lhsCoordinateFlag;
            lhsCoordinateFlag = this.getCoordinateFlag();
            CoordinateFlag rhsCoordinateFlag;
            rhsCoordinateFlag = that.getCoordinateFlag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coordinateFlag", lhsCoordinateFlag), LocatorUtils.property(thatLocator, "coordinateFlag", rhsCoordinateFlag), lhsCoordinateFlag, rhsCoordinateFlag, (this.coordinateFlag!= null), (that.coordinateFlag!= null))) {
                return false;
            }
        }
        {
            List<Dimension> lhsDimension;
            lhsDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
            List<Dimension> rhsDimension;
            rhsDimension = (((that.dimension!= null)&&(!that.dimension.isEmpty()))?that.getDimension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dimension", lhsDimension), LocatorUtils.property(thatLocator, "dimension", rhsDimension), lhsDimension, rhsDimension, ((this.dimension!= null)&&(!this.dimension.isEmpty())), ((that.dimension!= null)&&(!that.dimension.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsHeadID;
            lhsHeadID = this.getHeadID();
            String rhsHeadID;
            rhsHeadID = that.getHeadID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "headID", lhsHeadID), LocatorUtils.property(thatLocator, "headID", rhsHeadID), lhsHeadID, rhsHeadID, (this.headID!= null), (that.headID!= null))) {
                return false;
            }
        }
        {
            String lhsNotch;
            lhsNotch = this.getNotch();
            String rhsNotch;
            rhsNotch = that.getNotch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notch", lhsNotch), LocatorUtils.property(thatLocator, "notch", rhsNotch), lhsNotch, rhsNotch, (this.notch!= null), (that.notch!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsParallelTest;
            lhsParallelTest = this.getParallelTest();
            BigInteger rhsParallelTest;
            rhsParallelTest = that.getParallelTest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parallelTest", lhsParallelTest), LocatorUtils.property(thatLocator, "parallelTest", rhsParallelTest), lhsParallelTest, rhsParallelTest, (this.parallelTest!= null), (that.parallelTest!= null))) {
                return false;
            }
        }
        {
            String lhsProbeName;
            lhsProbeName = this.getProbeName();
            String rhsProbeName;
            rhsProbeName = that.getProbeName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "probeName", lhsProbeName), LocatorUtils.property(thatLocator, "probeName", rhsProbeName), lhsProbeName, rhsProbeName, (this.probeName!= null), (that.probeName!= null))) {
                return false;
            }
        }
        {
            String lhsQuadrant;
            lhsQuadrant = this.getQuadrant();
            String rhsQuadrant;
            rhsQuadrant = that.getQuadrant();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quadrant", lhsQuadrant), LocatorUtils.property(thatLocator, "quadrant", rhsQuadrant), lhsQuadrant, rhsQuadrant, (this.quadrant!= null), (that.quadrant!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsSampleRate;
            lhsSampleRate = this.getSampleRate();
            BigDecimal rhsSampleRate;
            rhsSampleRate = that.getSampleRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sampleRate", lhsSampleRate), LocatorUtils.property(thatLocator, "sampleRate", rhsSampleRate), lhsSampleRate, rhsSampleRate, (this.sampleRate!= null), (that.sampleRate!= null))) {
                return false;
            }
        }
        {
            Tester lhsTester;
            lhsTester = this.getTester();
            Tester rhsTester;
            rhsTester = that.getTester();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tester", lhsTester), LocatorUtils.property(thatLocator, "tester", rhsTester), lhsTester, rhsTester, (this.tester!= null), (that.tester!= null))) {
                return false;
            }
        }
        {
            TestSetup lhsTestSetup;
            lhsTestSetup = this.getTestSetup();
            TestSetup rhsTestSetup;
            rhsTestSetup = that.getTestSetup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testSetup", lhsTestSetup), LocatorUtils.property(thatLocator, "testSetup", rhsTestSetup), lhsTestSetup, rhsTestSetup, (this.testSetup!= null), (that.testSetup!= null))) {
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
            ChipPeriodicityType theChipPeriodicity;
            theChipPeriodicity = this.getChipPeriodicity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chipPeriodicity", theChipPeriodicity), currentHashCode, theChipPeriodicity, (this.chipPeriodicity!= null));
        }
        {
            CoordinateFlag theCoordinateFlag;
            theCoordinateFlag = this.getCoordinateFlag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coordinateFlag", theCoordinateFlag), currentHashCode, theCoordinateFlag, (this.coordinateFlag!= null));
        }
        {
            List<Dimension> theDimension;
            theDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dimension", theDimension), currentHashCode, theDimension, ((this.dimension!= null)&&(!this.dimension.isEmpty())));
        }
        {
            String theHeadID;
            theHeadID = this.getHeadID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "headID", theHeadID), currentHashCode, theHeadID, (this.headID!= null));
        }
        {
            String theNotch;
            theNotch = this.getNotch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notch", theNotch), currentHashCode, theNotch, (this.notch!= null));
        }
        {
            BigInteger theParallelTest;
            theParallelTest = this.getParallelTest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parallelTest", theParallelTest), currentHashCode, theParallelTest, (this.parallelTest!= null));
        }
        {
            String theProbeName;
            theProbeName = this.getProbeName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "probeName", theProbeName), currentHashCode, theProbeName, (this.probeName!= null));
        }
        {
            String theQuadrant;
            theQuadrant = this.getQuadrant();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quadrant", theQuadrant), currentHashCode, theQuadrant, (this.quadrant!= null));
        }
        {
            BigDecimal theSampleRate;
            theSampleRate = this.getSampleRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sampleRate", theSampleRate), currentHashCode, theSampleRate, (this.sampleRate!= null));
        }
        {
            Tester theTester;
            theTester = this.getTester();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tester", theTester), currentHashCode, theTester, (this.tester!= null));
        }
        {
            TestSetup theTestSetup;
            theTestSetup = this.getTestSetup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testSetup", theTestSetup), currentHashCode, theTestSetup, (this.testSetup!= null));
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
            ChipPeriodicityType theChipPeriodicity;
            theChipPeriodicity = this.getChipPeriodicity();
            strategy.appendField(locator, this, "chipPeriodicity", buffer, theChipPeriodicity, (this.chipPeriodicity!= null));
        }
        {
            CoordinateFlag theCoordinateFlag;
            theCoordinateFlag = this.getCoordinateFlag();
            strategy.appendField(locator, this, "coordinateFlag", buffer, theCoordinateFlag, (this.coordinateFlag!= null));
        }
        {
            List<Dimension> theDimension;
            theDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
            strategy.appendField(locator, this, "dimension", buffer, theDimension, ((this.dimension!= null)&&(!this.dimension.isEmpty())));
        }
        {
            String theHeadID;
            theHeadID = this.getHeadID();
            strategy.appendField(locator, this, "headID", buffer, theHeadID, (this.headID!= null));
        }
        {
            String theNotch;
            theNotch = this.getNotch();
            strategy.appendField(locator, this, "notch", buffer, theNotch, (this.notch!= null));
        }
        {
            BigInteger theParallelTest;
            theParallelTest = this.getParallelTest();
            strategy.appendField(locator, this, "parallelTest", buffer, theParallelTest, (this.parallelTest!= null));
        }
        {
            String theProbeName;
            theProbeName = this.getProbeName();
            strategy.appendField(locator, this, "probeName", buffer, theProbeName, (this.probeName!= null));
        }
        {
            String theQuadrant;
            theQuadrant = this.getQuadrant();
            strategy.appendField(locator, this, "quadrant", buffer, theQuadrant, (this.quadrant!= null));
        }
        {
            BigDecimal theSampleRate;
            theSampleRate = this.getSampleRate();
            strategy.appendField(locator, this, "sampleRate", buffer, theSampleRate, (this.sampleRate!= null));
        }
        {
            Tester theTester;
            theTester = this.getTester();
            strategy.appendField(locator, this, "tester", buffer, theTester, (this.tester!= null));
        }
        {
            TestSetup theTestSetup;
            theTestSetup = this.getTestSetup();
            strategy.appendField(locator, this, "testSetup", buffer, theTestSetup, (this.testSetup!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
