
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_05;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.confidentiality.v01_02.Confidentiality;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14.Lot;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14.Pin;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14.TestSpecificationReport;
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
 * <p>Java class for LotReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BALocation" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}BALocationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:Confidentiality:xsd:codelist:01.02}Confidentiality" minOccurs="0"/&gt;
 *         &lt;element name="FabLocation" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}FabLocationType" minOccurs="0"/&gt;
 *         &lt;element name="FileDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinalTestLocation" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}FinalTestLocationType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalLotStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14}Lot"/&gt;
 *         &lt;element name="OtherLocation" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}OtherLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14}Pin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QualityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetestSorts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sort" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}SortType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TestOperationDescription" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}TestOperationDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14}TestSpecificationReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WaferSortLocation" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}WaferSortLocationType" minOccurs="0"/&gt;
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
@XmlType(name = "LotReportType", propOrder = {
    "baLocation",
    "confidentiality",
    "fabLocation",
    "fileDataVersion",
    "finalTestLocation",
    "globalLotStatusCode",
    "lot",
    "otherLocation",
    "pin",
    "qualityCode",
    "retestSorts",
    "retestType",
    "sort",
    "testOperationDescription",
    "testSpecificationReport",
    "waferSortLocation"
})
public class LotReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BALocation")
    protected BALocationType baLocation;
    @XmlElementRef(name = "Confidentiality", namespace = "urn:rosettanet:specification:domain:Manufacturing:Confidentiality:xsd:codelist:01.02", type = Confidentiality.class, required = false)
    protected Confidentiality confidentiality;
    @XmlElement(name = "FabLocation")
    protected FabLocationType fabLocation;
    @XmlElement(name = "FileDataVersion")
    protected String fileDataVersion;
    @XmlElement(name = "FinalTestLocation")
    protected FinalTestLocationType finalTestLocation;
    @XmlElement(name = "GlobalLotStatusCode")
    protected String globalLotStatusCode;
    @XmlElementRef(name = "Lot", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", type = Lot.class)
    protected Lot lot;
    @XmlElement(name = "OtherLocation")
    protected List<OtherLocationType> otherLocation;
    @XmlElementRef(name = "Pin", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", type = Pin.class, required = false)
    protected List<Pin> pin;
    @XmlElement(name = "QualityCode")
    protected String qualityCode;
    @XmlElement(name = "RetestSorts")
    protected String retestSorts;
    @XmlElement(name = "RetestType")
    protected String retestType;
    @XmlElement(name = "Sort")
    protected List<SortType> sort;
    @XmlElement(name = "TestOperationDescription", required = true)
    protected TestOperationDescriptionType testOperationDescription;
    @XmlElementRef(name = "TestSpecificationReport", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", type = TestSpecificationReport.class, required = false)
    protected List<TestSpecificationReport> testSpecificationReport;
    @XmlElement(name = "WaferSortLocation")
    protected WaferSortLocationType waferSortLocation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the baLocation property.
     * 
     * @return
     *     possible object is
     *     {@link BALocationType }
     *     
     */
    public BALocationType getBALocation() {
        return baLocation;
    }

    /**
     * Sets the value of the baLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BALocationType }
     *     
     */
    public void setBALocation(BALocationType value) {
        this.baLocation = value;
    }

    /**
     * Gets the value of the confidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link Confidentiality }
     *     
     */
    public Confidentiality getConfidentiality() {
        return confidentiality;
    }

    /**
     * Sets the value of the confidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Confidentiality }
     *     
     */
    public void setConfidentiality(Confidentiality value) {
        this.confidentiality = value;
    }

    /**
     * Gets the value of the fabLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FabLocationType }
     *     
     */
    public FabLocationType getFabLocation() {
        return fabLocation;
    }

    /**
     * Sets the value of the fabLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FabLocationType }
     *     
     */
    public void setFabLocation(FabLocationType value) {
        this.fabLocation = value;
    }

    /**
     * Gets the value of the fileDataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDataVersion() {
        return fileDataVersion;
    }

    /**
     * Sets the value of the fileDataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileDataVersion(String value) {
        this.fileDataVersion = value;
    }

    /**
     * Gets the value of the finalTestLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FinalTestLocationType }
     *     
     */
    public FinalTestLocationType getFinalTestLocation() {
        return finalTestLocation;
    }

    /**
     * Sets the value of the finalTestLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalTestLocationType }
     *     
     */
    public void setFinalTestLocation(FinalTestLocationType value) {
        this.finalTestLocation = value;
    }

    /**
     * Gets the value of the globalLotStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalLotStatusCode() {
        return globalLotStatusCode;
    }

    /**
     * Sets the value of the globalLotStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalLotStatusCode(String value) {
        this.globalLotStatusCode = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link Lot }
     *     
     */
    public Lot getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lot }
     *     
     */
    public void setLot(Lot value) {
        this.lot = value;
    }

    /**
     * Gets the value of the otherLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherLocationType }
     * 
     * 
     */
    public List<OtherLocationType> getOtherLocation() {
        if (otherLocation == null) {
            otherLocation = new ArrayList<OtherLocationType>();
        }
        return this.otherLocation;
    }

    /**
     * Gets the value of the pin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pin }
     * 
     * 
     */
    public List<Pin> getPin() {
        if (pin == null) {
            pin = new ArrayList<Pin>();
        }
        return this.pin;
    }

    /**
     * Gets the value of the qualityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityCode() {
        return qualityCode;
    }

    /**
     * Sets the value of the qualityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityCode(String value) {
        this.qualityCode = value;
    }

    /**
     * Gets the value of the retestSorts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetestSorts() {
        return retestSorts;
    }

    /**
     * Sets the value of the retestSorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetestSorts(String value) {
        this.retestSorts = value;
    }

    /**
     * Gets the value of the retestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetestType() {
        return retestType;
    }

    /**
     * Sets the value of the retestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetestType(String value) {
        this.retestType = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortType }
     * 
     * 
     */
    public List<SortType> getSort() {
        if (sort == null) {
            sort = new ArrayList<SortType>();
        }
        return this.sort;
    }

    /**
     * Gets the value of the testOperationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TestOperationDescriptionType }
     *     
     */
    public TestOperationDescriptionType getTestOperationDescription() {
        return testOperationDescription;
    }

    /**
     * Sets the value of the testOperationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestOperationDescriptionType }
     *     
     */
    public void setTestOperationDescription(TestOperationDescriptionType value) {
        this.testOperationDescription = value;
    }

    /**
     * Gets the value of the testSpecificationReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSpecificationReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSpecificationReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationReport }
     * 
     * 
     */
    public List<TestSpecificationReport> getTestSpecificationReport() {
        if (testSpecificationReport == null) {
            testSpecificationReport = new ArrayList<TestSpecificationReport>();
        }
        return this.testSpecificationReport;
    }

    /**
     * Gets the value of the waferSortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WaferSortLocationType }
     *     
     */
    public WaferSortLocationType getWaferSortLocation() {
        return waferSortLocation;
    }

    /**
     * Sets the value of the waferSortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferSortLocationType }
     *     
     */
    public void setWaferSortLocation(WaferSortLocationType value) {
        this.waferSortLocation = value;
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
        final LotReportType that = ((LotReportType) object);
        {
            BALocationType lhsBALocation;
            lhsBALocation = this.getBALocation();
            BALocationType rhsBALocation;
            rhsBALocation = that.getBALocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baLocation", lhsBALocation), LocatorUtils.property(thatLocator, "baLocation", rhsBALocation), lhsBALocation, rhsBALocation, (this.baLocation!= null), (that.baLocation!= null))) {
                return false;
            }
        }
        {
            Confidentiality lhsConfidentiality;
            lhsConfidentiality = this.getConfidentiality();
            Confidentiality rhsConfidentiality;
            rhsConfidentiality = that.getConfidentiality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confidentiality", lhsConfidentiality), LocatorUtils.property(thatLocator, "confidentiality", rhsConfidentiality), lhsConfidentiality, rhsConfidentiality, (this.confidentiality!= null), (that.confidentiality!= null))) {
                return false;
            }
        }
        {
            FabLocationType lhsFabLocation;
            lhsFabLocation = this.getFabLocation();
            FabLocationType rhsFabLocation;
            rhsFabLocation = that.getFabLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fabLocation", lhsFabLocation), LocatorUtils.property(thatLocator, "fabLocation", rhsFabLocation), lhsFabLocation, rhsFabLocation, (this.fabLocation!= null), (that.fabLocation!= null))) {
                return false;
            }
        }
        {
            String lhsFileDataVersion;
            lhsFileDataVersion = this.getFileDataVersion();
            String rhsFileDataVersion;
            rhsFileDataVersion = that.getFileDataVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileDataVersion", lhsFileDataVersion), LocatorUtils.property(thatLocator, "fileDataVersion", rhsFileDataVersion), lhsFileDataVersion, rhsFileDataVersion, (this.fileDataVersion!= null), (that.fileDataVersion!= null))) {
                return false;
            }
        }
        {
            FinalTestLocationType lhsFinalTestLocation;
            lhsFinalTestLocation = this.getFinalTestLocation();
            FinalTestLocationType rhsFinalTestLocation;
            rhsFinalTestLocation = that.getFinalTestLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finalTestLocation", lhsFinalTestLocation), LocatorUtils.property(thatLocator, "finalTestLocation", rhsFinalTestLocation), lhsFinalTestLocation, rhsFinalTestLocation, (this.finalTestLocation!= null), (that.finalTestLocation!= null))) {
                return false;
            }
        }
        {
            String lhsGlobalLotStatusCode;
            lhsGlobalLotStatusCode = this.getGlobalLotStatusCode();
            String rhsGlobalLotStatusCode;
            rhsGlobalLotStatusCode = that.getGlobalLotStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "globalLotStatusCode", lhsGlobalLotStatusCode), LocatorUtils.property(thatLocator, "globalLotStatusCode", rhsGlobalLotStatusCode), lhsGlobalLotStatusCode, rhsGlobalLotStatusCode, (this.globalLotStatusCode!= null), (that.globalLotStatusCode!= null))) {
                return false;
            }
        }
        {
            Lot lhsLot;
            lhsLot = this.getLot();
            Lot rhsLot;
            rhsLot = that.getLot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lot", lhsLot), LocatorUtils.property(thatLocator, "lot", rhsLot), lhsLot, rhsLot, (this.lot!= null), (that.lot!= null))) {
                return false;
            }
        }
        {
            List<OtherLocationType> lhsOtherLocation;
            lhsOtherLocation = (((this.otherLocation!= null)&&(!this.otherLocation.isEmpty()))?this.getOtherLocation():null);
            List<OtherLocationType> rhsOtherLocation;
            rhsOtherLocation = (((that.otherLocation!= null)&&(!that.otherLocation.isEmpty()))?that.getOtherLocation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherLocation", lhsOtherLocation), LocatorUtils.property(thatLocator, "otherLocation", rhsOtherLocation), lhsOtherLocation, rhsOtherLocation, ((this.otherLocation!= null)&&(!this.otherLocation.isEmpty())), ((that.otherLocation!= null)&&(!that.otherLocation.isEmpty())))) {
                return false;
            }
        }
        {
            List<Pin> lhsPin;
            lhsPin = (((this.pin!= null)&&(!this.pin.isEmpty()))?this.getPin():null);
            List<Pin> rhsPin;
            rhsPin = (((that.pin!= null)&&(!that.pin.isEmpty()))?that.getPin():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pin", lhsPin), LocatorUtils.property(thatLocator, "pin", rhsPin), lhsPin, rhsPin, ((this.pin!= null)&&(!this.pin.isEmpty())), ((that.pin!= null)&&(!that.pin.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsQualityCode;
            lhsQualityCode = this.getQualityCode();
            String rhsQualityCode;
            rhsQualityCode = that.getQualityCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qualityCode", lhsQualityCode), LocatorUtils.property(thatLocator, "qualityCode", rhsQualityCode), lhsQualityCode, rhsQualityCode, (this.qualityCode!= null), (that.qualityCode!= null))) {
                return false;
            }
        }
        {
            String lhsRetestSorts;
            lhsRetestSorts = this.getRetestSorts();
            String rhsRetestSorts;
            rhsRetestSorts = that.getRetestSorts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retestSorts", lhsRetestSorts), LocatorUtils.property(thatLocator, "retestSorts", rhsRetestSorts), lhsRetestSorts, rhsRetestSorts, (this.retestSorts!= null), (that.retestSorts!= null))) {
                return false;
            }
        }
        {
            String lhsRetestType;
            lhsRetestType = this.getRetestType();
            String rhsRetestType;
            rhsRetestType = that.getRetestType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retestType", lhsRetestType), LocatorUtils.property(thatLocator, "retestType", rhsRetestType), lhsRetestType, rhsRetestType, (this.retestType!= null), (that.retestType!= null))) {
                return false;
            }
        }
        {
            List<SortType> lhsSort;
            lhsSort = (((this.sort!= null)&&(!this.sort.isEmpty()))?this.getSort():null);
            List<SortType> rhsSort;
            rhsSort = (((that.sort!= null)&&(!that.sort.isEmpty()))?that.getSort():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sort", lhsSort), LocatorUtils.property(thatLocator, "sort", rhsSort), lhsSort, rhsSort, ((this.sort!= null)&&(!this.sort.isEmpty())), ((that.sort!= null)&&(!that.sort.isEmpty())))) {
                return false;
            }
        }
        {
            TestOperationDescriptionType lhsTestOperationDescription;
            lhsTestOperationDescription = this.getTestOperationDescription();
            TestOperationDescriptionType rhsTestOperationDescription;
            rhsTestOperationDescription = that.getTestOperationDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testOperationDescription", lhsTestOperationDescription), LocatorUtils.property(thatLocator, "testOperationDescription", rhsTestOperationDescription), lhsTestOperationDescription, rhsTestOperationDescription, (this.testOperationDescription!= null), (that.testOperationDescription!= null))) {
                return false;
            }
        }
        {
            List<TestSpecificationReport> lhsTestSpecificationReport;
            lhsTestSpecificationReport = (((this.testSpecificationReport!= null)&&(!this.testSpecificationReport.isEmpty()))?this.getTestSpecificationReport():null);
            List<TestSpecificationReport> rhsTestSpecificationReport;
            rhsTestSpecificationReport = (((that.testSpecificationReport!= null)&&(!that.testSpecificationReport.isEmpty()))?that.getTestSpecificationReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testSpecificationReport", lhsTestSpecificationReport), LocatorUtils.property(thatLocator, "testSpecificationReport", rhsTestSpecificationReport), lhsTestSpecificationReport, rhsTestSpecificationReport, ((this.testSpecificationReport!= null)&&(!this.testSpecificationReport.isEmpty())), ((that.testSpecificationReport!= null)&&(!that.testSpecificationReport.isEmpty())))) {
                return false;
            }
        }
        {
            WaferSortLocationType lhsWaferSortLocation;
            lhsWaferSortLocation = this.getWaferSortLocation();
            WaferSortLocationType rhsWaferSortLocation;
            rhsWaferSortLocation = that.getWaferSortLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferSortLocation", lhsWaferSortLocation), LocatorUtils.property(thatLocator, "waferSortLocation", rhsWaferSortLocation), lhsWaferSortLocation, rhsWaferSortLocation, (this.waferSortLocation!= null), (that.waferSortLocation!= null))) {
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
            BALocationType theBALocation;
            theBALocation = this.getBALocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baLocation", theBALocation), currentHashCode, theBALocation, (this.baLocation!= null));
        }
        {
            Confidentiality theConfidentiality;
            theConfidentiality = this.getConfidentiality();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confidentiality", theConfidentiality), currentHashCode, theConfidentiality, (this.confidentiality!= null));
        }
        {
            FabLocationType theFabLocation;
            theFabLocation = this.getFabLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fabLocation", theFabLocation), currentHashCode, theFabLocation, (this.fabLocation!= null));
        }
        {
            String theFileDataVersion;
            theFileDataVersion = this.getFileDataVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileDataVersion", theFileDataVersion), currentHashCode, theFileDataVersion, (this.fileDataVersion!= null));
        }
        {
            FinalTestLocationType theFinalTestLocation;
            theFinalTestLocation = this.getFinalTestLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finalTestLocation", theFinalTestLocation), currentHashCode, theFinalTestLocation, (this.finalTestLocation!= null));
        }
        {
            String theGlobalLotStatusCode;
            theGlobalLotStatusCode = this.getGlobalLotStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "globalLotStatusCode", theGlobalLotStatusCode), currentHashCode, theGlobalLotStatusCode, (this.globalLotStatusCode!= null));
        }
        {
            Lot theLot;
            theLot = this.getLot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lot", theLot), currentHashCode, theLot, (this.lot!= null));
        }
        {
            List<OtherLocationType> theOtherLocation;
            theOtherLocation = (((this.otherLocation!= null)&&(!this.otherLocation.isEmpty()))?this.getOtherLocation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherLocation", theOtherLocation), currentHashCode, theOtherLocation, ((this.otherLocation!= null)&&(!this.otherLocation.isEmpty())));
        }
        {
            List<Pin> thePin;
            thePin = (((this.pin!= null)&&(!this.pin.isEmpty()))?this.getPin():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pin", thePin), currentHashCode, thePin, ((this.pin!= null)&&(!this.pin.isEmpty())));
        }
        {
            String theQualityCode;
            theQualityCode = this.getQualityCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualityCode", theQualityCode), currentHashCode, theQualityCode, (this.qualityCode!= null));
        }
        {
            String theRetestSorts;
            theRetestSorts = this.getRetestSorts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retestSorts", theRetestSorts), currentHashCode, theRetestSorts, (this.retestSorts!= null));
        }
        {
            String theRetestType;
            theRetestType = this.getRetestType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retestType", theRetestType), currentHashCode, theRetestType, (this.retestType!= null));
        }
        {
            List<SortType> theSort;
            theSort = (((this.sort!= null)&&(!this.sort.isEmpty()))?this.getSort():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sort", theSort), currentHashCode, theSort, ((this.sort!= null)&&(!this.sort.isEmpty())));
        }
        {
            TestOperationDescriptionType theTestOperationDescription;
            theTestOperationDescription = this.getTestOperationDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testOperationDescription", theTestOperationDescription), currentHashCode, theTestOperationDescription, (this.testOperationDescription!= null));
        }
        {
            List<TestSpecificationReport> theTestSpecificationReport;
            theTestSpecificationReport = (((this.testSpecificationReport!= null)&&(!this.testSpecificationReport.isEmpty()))?this.getTestSpecificationReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testSpecificationReport", theTestSpecificationReport), currentHashCode, theTestSpecificationReport, ((this.testSpecificationReport!= null)&&(!this.testSpecificationReport.isEmpty())));
        }
        {
            WaferSortLocationType theWaferSortLocation;
            theWaferSortLocation = this.getWaferSortLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferSortLocation", theWaferSortLocation), currentHashCode, theWaferSortLocation, (this.waferSortLocation!= null));
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
            BALocationType theBALocation;
            theBALocation = this.getBALocation();
            strategy.appendField(locator, this, "baLocation", buffer, theBALocation, (this.baLocation!= null));
        }
        {
            Confidentiality theConfidentiality;
            theConfidentiality = this.getConfidentiality();
            strategy.appendField(locator, this, "confidentiality", buffer, theConfidentiality, (this.confidentiality!= null));
        }
        {
            FabLocationType theFabLocation;
            theFabLocation = this.getFabLocation();
            strategy.appendField(locator, this, "fabLocation", buffer, theFabLocation, (this.fabLocation!= null));
        }
        {
            String theFileDataVersion;
            theFileDataVersion = this.getFileDataVersion();
            strategy.appendField(locator, this, "fileDataVersion", buffer, theFileDataVersion, (this.fileDataVersion!= null));
        }
        {
            FinalTestLocationType theFinalTestLocation;
            theFinalTestLocation = this.getFinalTestLocation();
            strategy.appendField(locator, this, "finalTestLocation", buffer, theFinalTestLocation, (this.finalTestLocation!= null));
        }
        {
            String theGlobalLotStatusCode;
            theGlobalLotStatusCode = this.getGlobalLotStatusCode();
            strategy.appendField(locator, this, "globalLotStatusCode", buffer, theGlobalLotStatusCode, (this.globalLotStatusCode!= null));
        }
        {
            Lot theLot;
            theLot = this.getLot();
            strategy.appendField(locator, this, "lot", buffer, theLot, (this.lot!= null));
        }
        {
            List<OtherLocationType> theOtherLocation;
            theOtherLocation = (((this.otherLocation!= null)&&(!this.otherLocation.isEmpty()))?this.getOtherLocation():null);
            strategy.appendField(locator, this, "otherLocation", buffer, theOtherLocation, ((this.otherLocation!= null)&&(!this.otherLocation.isEmpty())));
        }
        {
            List<Pin> thePin;
            thePin = (((this.pin!= null)&&(!this.pin.isEmpty()))?this.getPin():null);
            strategy.appendField(locator, this, "pin", buffer, thePin, ((this.pin!= null)&&(!this.pin.isEmpty())));
        }
        {
            String theQualityCode;
            theQualityCode = this.getQualityCode();
            strategy.appendField(locator, this, "qualityCode", buffer, theQualityCode, (this.qualityCode!= null));
        }
        {
            String theRetestSorts;
            theRetestSorts = this.getRetestSorts();
            strategy.appendField(locator, this, "retestSorts", buffer, theRetestSorts, (this.retestSorts!= null));
        }
        {
            String theRetestType;
            theRetestType = this.getRetestType();
            strategy.appendField(locator, this, "retestType", buffer, theRetestType, (this.retestType!= null));
        }
        {
            List<SortType> theSort;
            theSort = (((this.sort!= null)&&(!this.sort.isEmpty()))?this.getSort():null);
            strategy.appendField(locator, this, "sort", buffer, theSort, ((this.sort!= null)&&(!this.sort.isEmpty())));
        }
        {
            TestOperationDescriptionType theTestOperationDescription;
            theTestOperationDescription = this.getTestOperationDescription();
            strategy.appendField(locator, this, "testOperationDescription", buffer, theTestOperationDescription, (this.testOperationDescription!= null));
        }
        {
            List<TestSpecificationReport> theTestSpecificationReport;
            theTestSpecificationReport = (((this.testSpecificationReport!= null)&&(!this.testSpecificationReport.isEmpty()))?this.getTestSpecificationReport():null);
            strategy.appendField(locator, this, "testSpecificationReport", buffer, theTestSpecificationReport, ((this.testSpecificationReport!= null)&&(!this.testSpecificationReport.isEmpty())));
        }
        {
            WaferSortLocationType theWaferSortLocation;
            theWaferSortLocation = this.getWaferSortLocation();
            strategy.appendField(locator, this, "waferSortLocation", buffer, theWaferSortLocation, (this.waferSortLocation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
