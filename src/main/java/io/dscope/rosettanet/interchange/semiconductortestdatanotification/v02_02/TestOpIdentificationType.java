
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v02_02;

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
import io.dscope.rosettanet.universal.dates.v01_03.StartAndEndDateTimeType;
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
 * <p>Java class for TestOpIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestOpIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SetupReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}SetupReportType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SlotID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WaferShortID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaferTestingPeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="WaferUniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="FinalTest" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}FinalTestType"/&gt;
 *           &lt;element name="PCM" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}PCMType"/&gt;
 *           &lt;element name="WaferSort" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}WaferSortType"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "TestOpIdentificationType", propOrder = {
    "setupReport",
    "slotID",
    "testLevel",
    "testMode",
    "waferShortID",
    "waferTestingPeriod",
    "waferUniqueID",
    "finalTest",
    "pcm",
    "waferSort"
})
public class TestOpIdentificationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "SetupReport", required = true)
    protected List<SetupReportType> setupReport;
    @XmlElement(name = "SlotID")
    protected String slotID;
    @XmlElement(name = "TestLevel")
    protected String testLevel;
    @XmlElement(name = "TestMode", required = true)
    protected String testMode;
    @XmlElement(name = "WaferShortID")
    protected String waferShortID;
    @XmlElement(name = "WaferTestingPeriod")
    protected StartAndEndDateTimeType waferTestingPeriod;
    @XmlElement(name = "WaferUniqueID")
    protected String waferUniqueID;
    @XmlElement(name = "FinalTest")
    protected FinalTestType finalTest;
    @XmlElement(name = "PCM")
    protected PCMType pcm;
    @XmlElement(name = "WaferSort")
    protected WaferSortType waferSort;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the setupReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setupReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetupReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetupReportType }
     * 
     * 
     */
    public List<SetupReportType> getSetupReport() {
        if (setupReport == null) {
            setupReport = new ArrayList<SetupReportType>();
        }
        return this.setupReport;
    }

    /**
     * Gets the value of the slotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotID() {
        return slotID;
    }

    /**
     * Sets the value of the slotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotID(String value) {
        this.slotID = value;
    }

    /**
     * Gets the value of the testLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestLevel() {
        return testLevel;
    }

    /**
     * Sets the value of the testLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestLevel(String value) {
        this.testLevel = value;
    }

    /**
     * Gets the value of the testMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestMode() {
        return testMode;
    }

    /**
     * Sets the value of the testMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestMode(String value) {
        this.testMode = value;
    }

    /**
     * Gets the value of the waferShortID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaferShortID() {
        return waferShortID;
    }

    /**
     * Sets the value of the waferShortID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaferShortID(String value) {
        this.waferShortID = value;
    }

    /**
     * Gets the value of the waferTestingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateTimeType }
     *     
     */
    public StartAndEndDateTimeType getWaferTestingPeriod() {
        return waferTestingPeriod;
    }

    /**
     * Sets the value of the waferTestingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateTimeType }
     *     
     */
    public void setWaferTestingPeriod(StartAndEndDateTimeType value) {
        this.waferTestingPeriod = value;
    }

    /**
     * Gets the value of the waferUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaferUniqueID() {
        return waferUniqueID;
    }

    /**
     * Sets the value of the waferUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaferUniqueID(String value) {
        this.waferUniqueID = value;
    }

    /**
     * Gets the value of the finalTest property.
     * 
     * @return
     *     possible object is
     *     {@link FinalTestType }
     *     
     */
    public FinalTestType getFinalTest() {
        return finalTest;
    }

    /**
     * Sets the value of the finalTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalTestType }
     *     
     */
    public void setFinalTest(FinalTestType value) {
        this.finalTest = value;
    }

    /**
     * Gets the value of the pcm property.
     * 
     * @return
     *     possible object is
     *     {@link PCMType }
     *     
     */
    public PCMType getPCM() {
        return pcm;
    }

    /**
     * Sets the value of the pcm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCMType }
     *     
     */
    public void setPCM(PCMType value) {
        this.pcm = value;
    }

    /**
     * Gets the value of the waferSort property.
     * 
     * @return
     *     possible object is
     *     {@link WaferSortType }
     *     
     */
    public WaferSortType getWaferSort() {
        return waferSort;
    }

    /**
     * Sets the value of the waferSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferSortType }
     *     
     */
    public void setWaferSort(WaferSortType value) {
        this.waferSort = value;
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
        final TestOpIdentificationType that = ((TestOpIdentificationType) object);
        {
            List<SetupReportType> lhsSetupReport;
            lhsSetupReport = (((this.setupReport!= null)&&(!this.setupReport.isEmpty()))?this.getSetupReport():null);
            List<SetupReportType> rhsSetupReport;
            rhsSetupReport = (((that.setupReport!= null)&&(!that.setupReport.isEmpty()))?that.getSetupReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "setupReport", lhsSetupReport), LocatorUtils.property(thatLocator, "setupReport", rhsSetupReport), lhsSetupReport, rhsSetupReport, ((this.setupReport!= null)&&(!this.setupReport.isEmpty())), ((that.setupReport!= null)&&(!that.setupReport.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsSlotID;
            lhsSlotID = this.getSlotID();
            String rhsSlotID;
            rhsSlotID = that.getSlotID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "slotID", lhsSlotID), LocatorUtils.property(thatLocator, "slotID", rhsSlotID), lhsSlotID, rhsSlotID, (this.slotID!= null), (that.slotID!= null))) {
                return false;
            }
        }
        {
            String lhsTestLevel;
            lhsTestLevel = this.getTestLevel();
            String rhsTestLevel;
            rhsTestLevel = that.getTestLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testLevel", lhsTestLevel), LocatorUtils.property(thatLocator, "testLevel", rhsTestLevel), lhsTestLevel, rhsTestLevel, (this.testLevel!= null), (that.testLevel!= null))) {
                return false;
            }
        }
        {
            String lhsTestMode;
            lhsTestMode = this.getTestMode();
            String rhsTestMode;
            rhsTestMode = that.getTestMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testMode", lhsTestMode), LocatorUtils.property(thatLocator, "testMode", rhsTestMode), lhsTestMode, rhsTestMode, (this.testMode!= null), (that.testMode!= null))) {
                return false;
            }
        }
        {
            String lhsWaferShortID;
            lhsWaferShortID = this.getWaferShortID();
            String rhsWaferShortID;
            rhsWaferShortID = that.getWaferShortID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferShortID", lhsWaferShortID), LocatorUtils.property(thatLocator, "waferShortID", rhsWaferShortID), lhsWaferShortID, rhsWaferShortID, (this.waferShortID!= null), (that.waferShortID!= null))) {
                return false;
            }
        }
        {
            StartAndEndDateTimeType lhsWaferTestingPeriod;
            lhsWaferTestingPeriod = this.getWaferTestingPeriod();
            StartAndEndDateTimeType rhsWaferTestingPeriod;
            rhsWaferTestingPeriod = that.getWaferTestingPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferTestingPeriod", lhsWaferTestingPeriod), LocatorUtils.property(thatLocator, "waferTestingPeriod", rhsWaferTestingPeriod), lhsWaferTestingPeriod, rhsWaferTestingPeriod, (this.waferTestingPeriod!= null), (that.waferTestingPeriod!= null))) {
                return false;
            }
        }
        {
            String lhsWaferUniqueID;
            lhsWaferUniqueID = this.getWaferUniqueID();
            String rhsWaferUniqueID;
            rhsWaferUniqueID = that.getWaferUniqueID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferUniqueID", lhsWaferUniqueID), LocatorUtils.property(thatLocator, "waferUniqueID", rhsWaferUniqueID), lhsWaferUniqueID, rhsWaferUniqueID, (this.waferUniqueID!= null), (that.waferUniqueID!= null))) {
                return false;
            }
        }
        {
            FinalTestType lhsFinalTest;
            lhsFinalTest = this.getFinalTest();
            FinalTestType rhsFinalTest;
            rhsFinalTest = that.getFinalTest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finalTest", lhsFinalTest), LocatorUtils.property(thatLocator, "finalTest", rhsFinalTest), lhsFinalTest, rhsFinalTest, (this.finalTest!= null), (that.finalTest!= null))) {
                return false;
            }
        }
        {
            PCMType lhsPCM;
            lhsPCM = this.getPCM();
            PCMType rhsPCM;
            rhsPCM = that.getPCM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pcm", lhsPCM), LocatorUtils.property(thatLocator, "pcm", rhsPCM), lhsPCM, rhsPCM, (this.pcm!= null), (that.pcm!= null))) {
                return false;
            }
        }
        {
            WaferSortType lhsWaferSort;
            lhsWaferSort = this.getWaferSort();
            WaferSortType rhsWaferSort;
            rhsWaferSort = that.getWaferSort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferSort", lhsWaferSort), LocatorUtils.property(thatLocator, "waferSort", rhsWaferSort), lhsWaferSort, rhsWaferSort, (this.waferSort!= null), (that.waferSort!= null))) {
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
            List<SetupReportType> theSetupReport;
            theSetupReport = (((this.setupReport!= null)&&(!this.setupReport.isEmpty()))?this.getSetupReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "setupReport", theSetupReport), currentHashCode, theSetupReport, ((this.setupReport!= null)&&(!this.setupReport.isEmpty())));
        }
        {
            String theSlotID;
            theSlotID = this.getSlotID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "slotID", theSlotID), currentHashCode, theSlotID, (this.slotID!= null));
        }
        {
            String theTestLevel;
            theTestLevel = this.getTestLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testLevel", theTestLevel), currentHashCode, theTestLevel, (this.testLevel!= null));
        }
        {
            String theTestMode;
            theTestMode = this.getTestMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testMode", theTestMode), currentHashCode, theTestMode, (this.testMode!= null));
        }
        {
            String theWaferShortID;
            theWaferShortID = this.getWaferShortID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferShortID", theWaferShortID), currentHashCode, theWaferShortID, (this.waferShortID!= null));
        }
        {
            StartAndEndDateTimeType theWaferTestingPeriod;
            theWaferTestingPeriod = this.getWaferTestingPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferTestingPeriod", theWaferTestingPeriod), currentHashCode, theWaferTestingPeriod, (this.waferTestingPeriod!= null));
        }
        {
            String theWaferUniqueID;
            theWaferUniqueID = this.getWaferUniqueID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferUniqueID", theWaferUniqueID), currentHashCode, theWaferUniqueID, (this.waferUniqueID!= null));
        }
        {
            FinalTestType theFinalTest;
            theFinalTest = this.getFinalTest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finalTest", theFinalTest), currentHashCode, theFinalTest, (this.finalTest!= null));
        }
        {
            PCMType thePCM;
            thePCM = this.getPCM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pcm", thePCM), currentHashCode, thePCM, (this.pcm!= null));
        }
        {
            WaferSortType theWaferSort;
            theWaferSort = this.getWaferSort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferSort", theWaferSort), currentHashCode, theWaferSort, (this.waferSort!= null));
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
            List<SetupReportType> theSetupReport;
            theSetupReport = (((this.setupReport!= null)&&(!this.setupReport.isEmpty()))?this.getSetupReport():null);
            strategy.appendField(locator, this, "setupReport", buffer, theSetupReport, ((this.setupReport!= null)&&(!this.setupReport.isEmpty())));
        }
        {
            String theSlotID;
            theSlotID = this.getSlotID();
            strategy.appendField(locator, this, "slotID", buffer, theSlotID, (this.slotID!= null));
        }
        {
            String theTestLevel;
            theTestLevel = this.getTestLevel();
            strategy.appendField(locator, this, "testLevel", buffer, theTestLevel, (this.testLevel!= null));
        }
        {
            String theTestMode;
            theTestMode = this.getTestMode();
            strategy.appendField(locator, this, "testMode", buffer, theTestMode, (this.testMode!= null));
        }
        {
            String theWaferShortID;
            theWaferShortID = this.getWaferShortID();
            strategy.appendField(locator, this, "waferShortID", buffer, theWaferShortID, (this.waferShortID!= null));
        }
        {
            StartAndEndDateTimeType theWaferTestingPeriod;
            theWaferTestingPeriod = this.getWaferTestingPeriod();
            strategy.appendField(locator, this, "waferTestingPeriod", buffer, theWaferTestingPeriod, (this.waferTestingPeriod!= null));
        }
        {
            String theWaferUniqueID;
            theWaferUniqueID = this.getWaferUniqueID();
            strategy.appendField(locator, this, "waferUniqueID", buffer, theWaferUniqueID, (this.waferUniqueID!= null));
        }
        {
            FinalTestType theFinalTest;
            theFinalTest = this.getFinalTest();
            strategy.appendField(locator, this, "finalTest", buffer, theFinalTest, (this.finalTest!= null));
        }
        {
            PCMType thePCM;
            thePCM = this.getPCM();
            strategy.appendField(locator, this, "pcm", buffer, thePCM, (this.pcm!= null));
        }
        {
            WaferSortType theWaferSort;
            theWaferSort = this.getWaferSort();
            strategy.appendField(locator, this, "waferSort", buffer, theWaferSort, (this.waferSort!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
