
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v02_02;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.BuildInfoReport;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.ECIDReport;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.FinalPackageReportType;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.TestMap;
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
 * <p>Java class for TestReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}BuildInfoReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CalcFailReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}CalcFailReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DieReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}DieReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}ECIDReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FPReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}FPReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FunctionalPinReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}FunctionalPinReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PPReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}PPReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PRReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}PRReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StringReport" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}FinalPackageReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}TestMap" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TestReportType", propOrder = {
    "buildInfoReport",
    "calcFailReport",
    "dieReport",
    "ecidReport",
    "fpReport",
    "functionalPinReport",
    "ppReport",
    "prReport",
    "stringReport",
    "testMap"
})
public class TestReportType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BuildInfoReport", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = BuildInfoReport.class, required = false)
    protected List<BuildInfoReport> buildInfoReport;
    @XmlElement(name = "CalcFailReport")
    protected List<CalcFailReportType> calcFailReport;
    @XmlElement(name = "DieReport")
    protected List<DieReportType> dieReport;
    @XmlElementRef(name = "ECIDReport", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = ECIDReport.class, required = false)
    protected List<ECIDReport> ecidReport;
    @XmlElement(name = "FPReport")
    protected List<FPReportType> fpReport;
    @XmlElement(name = "FunctionalPinReport")
    protected List<FunctionalPinReportType> functionalPinReport;
    @XmlElement(name = "PPReport")
    protected List<PPReportType> ppReport;
    @XmlElement(name = "PRReport")
    protected List<PRReportType> prReport;
    @XmlElement(name = "StringReport")
    protected List<FinalPackageReportType> stringReport;
    @XmlElementRef(name = "TestMap", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = TestMap.class, required = false)
    protected List<TestMap> testMap;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the buildInfoReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buildInfoReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuildInfoReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuildInfoReport }
     * 
     * 
     */
    public List<BuildInfoReport> getBuildInfoReport() {
        if (buildInfoReport == null) {
            buildInfoReport = new ArrayList<BuildInfoReport>();
        }
        return this.buildInfoReport;
    }

    /**
     * Gets the value of the calcFailReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calcFailReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalcFailReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalcFailReportType }
     * 
     * 
     */
    public List<CalcFailReportType> getCalcFailReport() {
        if (calcFailReport == null) {
            calcFailReport = new ArrayList<CalcFailReportType>();
        }
        return this.calcFailReport;
    }

    /**
     * Gets the value of the dieReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dieReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDieReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DieReportType }
     * 
     * 
     */
    public List<DieReportType> getDieReport() {
        if (dieReport == null) {
            dieReport = new ArrayList<DieReportType>();
        }
        return this.dieReport;
    }

    /**
     * Gets the value of the ecidReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ecidReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getECIDReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECIDReport }
     * 
     * 
     */
    public List<ECIDReport> getECIDReport() {
        if (ecidReport == null) {
            ecidReport = new ArrayList<ECIDReport>();
        }
        return this.ecidReport;
    }

    /**
     * Gets the value of the fpReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fpReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFPReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FPReportType }
     * 
     * 
     */
    public List<FPReportType> getFPReport() {
        if (fpReport == null) {
            fpReport = new ArrayList<FPReportType>();
        }
        return this.fpReport;
    }

    /**
     * Gets the value of the functionalPinReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionalPinReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionalPinReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionalPinReportType }
     * 
     * 
     */
    public List<FunctionalPinReportType> getFunctionalPinReport() {
        if (functionalPinReport == null) {
            functionalPinReport = new ArrayList<FunctionalPinReportType>();
        }
        return this.functionalPinReport;
    }

    /**
     * Gets the value of the ppReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ppReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPPReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PPReportType }
     * 
     * 
     */
    public List<PPReportType> getPPReport() {
        if (ppReport == null) {
            ppReport = new ArrayList<PPReportType>();
        }
        return this.ppReport;
    }

    /**
     * Gets the value of the prReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRReportType }
     * 
     * 
     */
    public List<PRReportType> getPRReport() {
        if (prReport == null) {
            prReport = new ArrayList<PRReportType>();
        }
        return this.prReport;
    }

    /**
     * Gets the value of the stringReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinalPackageReportType }
     * 
     * 
     */
    public List<FinalPackageReportType> getStringReport() {
        if (stringReport == null) {
            stringReport = new ArrayList<FinalPackageReportType>();
        }
        return this.stringReport;
    }

    /**
     * Gets the value of the testMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestMap }
     * 
     * 
     */
    public List<TestMap> getTestMap() {
        if (testMap == null) {
            testMap = new ArrayList<TestMap>();
        }
        return this.testMap;
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
        final TestReportType that = ((TestReportType) object);
        {
            List<BuildInfoReport> lhsBuildInfoReport;
            lhsBuildInfoReport = (((this.buildInfoReport!= null)&&(!this.buildInfoReport.isEmpty()))?this.getBuildInfoReport():null);
            List<BuildInfoReport> rhsBuildInfoReport;
            rhsBuildInfoReport = (((that.buildInfoReport!= null)&&(!that.buildInfoReport.isEmpty()))?that.getBuildInfoReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildInfoReport", lhsBuildInfoReport), LocatorUtils.property(thatLocator, "buildInfoReport", rhsBuildInfoReport), lhsBuildInfoReport, rhsBuildInfoReport, ((this.buildInfoReport!= null)&&(!this.buildInfoReport.isEmpty())), ((that.buildInfoReport!= null)&&(!that.buildInfoReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<CalcFailReportType> lhsCalcFailReport;
            lhsCalcFailReport = (((this.calcFailReport!= null)&&(!this.calcFailReport.isEmpty()))?this.getCalcFailReport():null);
            List<CalcFailReportType> rhsCalcFailReport;
            rhsCalcFailReport = (((that.calcFailReport!= null)&&(!that.calcFailReport.isEmpty()))?that.getCalcFailReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calcFailReport", lhsCalcFailReport), LocatorUtils.property(thatLocator, "calcFailReport", rhsCalcFailReport), lhsCalcFailReport, rhsCalcFailReport, ((this.calcFailReport!= null)&&(!this.calcFailReport.isEmpty())), ((that.calcFailReport!= null)&&(!that.calcFailReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<DieReportType> lhsDieReport;
            lhsDieReport = (((this.dieReport!= null)&&(!this.dieReport.isEmpty()))?this.getDieReport():null);
            List<DieReportType> rhsDieReport;
            rhsDieReport = (((that.dieReport!= null)&&(!that.dieReport.isEmpty()))?that.getDieReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dieReport", lhsDieReport), LocatorUtils.property(thatLocator, "dieReport", rhsDieReport), lhsDieReport, rhsDieReport, ((this.dieReport!= null)&&(!this.dieReport.isEmpty())), ((that.dieReport!= null)&&(!that.dieReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<ECIDReport> lhsECIDReport;
            lhsECIDReport = (((this.ecidReport!= null)&&(!this.ecidReport.isEmpty()))?this.getECIDReport():null);
            List<ECIDReport> rhsECIDReport;
            rhsECIDReport = (((that.ecidReport!= null)&&(!that.ecidReport.isEmpty()))?that.getECIDReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ecidReport", lhsECIDReport), LocatorUtils.property(thatLocator, "ecidReport", rhsECIDReport), lhsECIDReport, rhsECIDReport, ((this.ecidReport!= null)&&(!this.ecidReport.isEmpty())), ((that.ecidReport!= null)&&(!that.ecidReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<FPReportType> lhsFPReport;
            lhsFPReport = (((this.fpReport!= null)&&(!this.fpReport.isEmpty()))?this.getFPReport():null);
            List<FPReportType> rhsFPReport;
            rhsFPReport = (((that.fpReport!= null)&&(!that.fpReport.isEmpty()))?that.getFPReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fpReport", lhsFPReport), LocatorUtils.property(thatLocator, "fpReport", rhsFPReport), lhsFPReport, rhsFPReport, ((this.fpReport!= null)&&(!this.fpReport.isEmpty())), ((that.fpReport!= null)&&(!that.fpReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<FunctionalPinReportType> lhsFunctionalPinReport;
            lhsFunctionalPinReport = (((this.functionalPinReport!= null)&&(!this.functionalPinReport.isEmpty()))?this.getFunctionalPinReport():null);
            List<FunctionalPinReportType> rhsFunctionalPinReport;
            rhsFunctionalPinReport = (((that.functionalPinReport!= null)&&(!that.functionalPinReport.isEmpty()))?that.getFunctionalPinReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "functionalPinReport", lhsFunctionalPinReport), LocatorUtils.property(thatLocator, "functionalPinReport", rhsFunctionalPinReport), lhsFunctionalPinReport, rhsFunctionalPinReport, ((this.functionalPinReport!= null)&&(!this.functionalPinReport.isEmpty())), ((that.functionalPinReport!= null)&&(!that.functionalPinReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<PPReportType> lhsPPReport;
            lhsPPReport = (((this.ppReport!= null)&&(!this.ppReport.isEmpty()))?this.getPPReport():null);
            List<PPReportType> rhsPPReport;
            rhsPPReport = (((that.ppReport!= null)&&(!that.ppReport.isEmpty()))?that.getPPReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ppReport", lhsPPReport), LocatorUtils.property(thatLocator, "ppReport", rhsPPReport), lhsPPReport, rhsPPReport, ((this.ppReport!= null)&&(!this.ppReport.isEmpty())), ((that.ppReport!= null)&&(!that.ppReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<PRReportType> lhsPRReport;
            lhsPRReport = (((this.prReport!= null)&&(!this.prReport.isEmpty()))?this.getPRReport():null);
            List<PRReportType> rhsPRReport;
            rhsPRReport = (((that.prReport!= null)&&(!that.prReport.isEmpty()))?that.getPRReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prReport", lhsPRReport), LocatorUtils.property(thatLocator, "prReport", rhsPRReport), lhsPRReport, rhsPRReport, ((this.prReport!= null)&&(!this.prReport.isEmpty())), ((that.prReport!= null)&&(!that.prReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<FinalPackageReportType> lhsStringReport;
            lhsStringReport = (((this.stringReport!= null)&&(!this.stringReport.isEmpty()))?this.getStringReport():null);
            List<FinalPackageReportType> rhsStringReport;
            rhsStringReport = (((that.stringReport!= null)&&(!that.stringReport.isEmpty()))?that.getStringReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stringReport", lhsStringReport), LocatorUtils.property(thatLocator, "stringReport", rhsStringReport), lhsStringReport, rhsStringReport, ((this.stringReport!= null)&&(!this.stringReport.isEmpty())), ((that.stringReport!= null)&&(!that.stringReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<TestMap> lhsTestMap;
            lhsTestMap = (((this.testMap!= null)&&(!this.testMap.isEmpty()))?this.getTestMap():null);
            List<TestMap> rhsTestMap;
            rhsTestMap = (((that.testMap!= null)&&(!that.testMap.isEmpty()))?that.getTestMap():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testMap", lhsTestMap), LocatorUtils.property(thatLocator, "testMap", rhsTestMap), lhsTestMap, rhsTestMap, ((this.testMap!= null)&&(!this.testMap.isEmpty())), ((that.testMap!= null)&&(!that.testMap.isEmpty())))) {
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
            List<BuildInfoReport> theBuildInfoReport;
            theBuildInfoReport = (((this.buildInfoReport!= null)&&(!this.buildInfoReport.isEmpty()))?this.getBuildInfoReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buildInfoReport", theBuildInfoReport), currentHashCode, theBuildInfoReport, ((this.buildInfoReport!= null)&&(!this.buildInfoReport.isEmpty())));
        }
        {
            List<CalcFailReportType> theCalcFailReport;
            theCalcFailReport = (((this.calcFailReport!= null)&&(!this.calcFailReport.isEmpty()))?this.getCalcFailReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calcFailReport", theCalcFailReport), currentHashCode, theCalcFailReport, ((this.calcFailReport!= null)&&(!this.calcFailReport.isEmpty())));
        }
        {
            List<DieReportType> theDieReport;
            theDieReport = (((this.dieReport!= null)&&(!this.dieReport.isEmpty()))?this.getDieReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dieReport", theDieReport), currentHashCode, theDieReport, ((this.dieReport!= null)&&(!this.dieReport.isEmpty())));
        }
        {
            List<ECIDReport> theECIDReport;
            theECIDReport = (((this.ecidReport!= null)&&(!this.ecidReport.isEmpty()))?this.getECIDReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ecidReport", theECIDReport), currentHashCode, theECIDReport, ((this.ecidReport!= null)&&(!this.ecidReport.isEmpty())));
        }
        {
            List<FPReportType> theFPReport;
            theFPReport = (((this.fpReport!= null)&&(!this.fpReport.isEmpty()))?this.getFPReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fpReport", theFPReport), currentHashCode, theFPReport, ((this.fpReport!= null)&&(!this.fpReport.isEmpty())));
        }
        {
            List<FunctionalPinReportType> theFunctionalPinReport;
            theFunctionalPinReport = (((this.functionalPinReport!= null)&&(!this.functionalPinReport.isEmpty()))?this.getFunctionalPinReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "functionalPinReport", theFunctionalPinReport), currentHashCode, theFunctionalPinReport, ((this.functionalPinReport!= null)&&(!this.functionalPinReport.isEmpty())));
        }
        {
            List<PPReportType> thePPReport;
            thePPReport = (((this.ppReport!= null)&&(!this.ppReport.isEmpty()))?this.getPPReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ppReport", thePPReport), currentHashCode, thePPReport, ((this.ppReport!= null)&&(!this.ppReport.isEmpty())));
        }
        {
            List<PRReportType> thePRReport;
            thePRReport = (((this.prReport!= null)&&(!this.prReport.isEmpty()))?this.getPRReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prReport", thePRReport), currentHashCode, thePRReport, ((this.prReport!= null)&&(!this.prReport.isEmpty())));
        }
        {
            List<FinalPackageReportType> theStringReport;
            theStringReport = (((this.stringReport!= null)&&(!this.stringReport.isEmpty()))?this.getStringReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stringReport", theStringReport), currentHashCode, theStringReport, ((this.stringReport!= null)&&(!this.stringReport.isEmpty())));
        }
        {
            List<TestMap> theTestMap;
            theTestMap = (((this.testMap!= null)&&(!this.testMap.isEmpty()))?this.getTestMap():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testMap", theTestMap), currentHashCode, theTestMap, ((this.testMap!= null)&&(!this.testMap.isEmpty())));
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
            List<BuildInfoReport> theBuildInfoReport;
            theBuildInfoReport = (((this.buildInfoReport!= null)&&(!this.buildInfoReport.isEmpty()))?this.getBuildInfoReport():null);
            strategy.appendField(locator, this, "buildInfoReport", buffer, theBuildInfoReport, ((this.buildInfoReport!= null)&&(!this.buildInfoReport.isEmpty())));
        }
        {
            List<CalcFailReportType> theCalcFailReport;
            theCalcFailReport = (((this.calcFailReport!= null)&&(!this.calcFailReport.isEmpty()))?this.getCalcFailReport():null);
            strategy.appendField(locator, this, "calcFailReport", buffer, theCalcFailReport, ((this.calcFailReport!= null)&&(!this.calcFailReport.isEmpty())));
        }
        {
            List<DieReportType> theDieReport;
            theDieReport = (((this.dieReport!= null)&&(!this.dieReport.isEmpty()))?this.getDieReport():null);
            strategy.appendField(locator, this, "dieReport", buffer, theDieReport, ((this.dieReport!= null)&&(!this.dieReport.isEmpty())));
        }
        {
            List<ECIDReport> theECIDReport;
            theECIDReport = (((this.ecidReport!= null)&&(!this.ecidReport.isEmpty()))?this.getECIDReport():null);
            strategy.appendField(locator, this, "ecidReport", buffer, theECIDReport, ((this.ecidReport!= null)&&(!this.ecidReport.isEmpty())));
        }
        {
            List<FPReportType> theFPReport;
            theFPReport = (((this.fpReport!= null)&&(!this.fpReport.isEmpty()))?this.getFPReport():null);
            strategy.appendField(locator, this, "fpReport", buffer, theFPReport, ((this.fpReport!= null)&&(!this.fpReport.isEmpty())));
        }
        {
            List<FunctionalPinReportType> theFunctionalPinReport;
            theFunctionalPinReport = (((this.functionalPinReport!= null)&&(!this.functionalPinReport.isEmpty()))?this.getFunctionalPinReport():null);
            strategy.appendField(locator, this, "functionalPinReport", buffer, theFunctionalPinReport, ((this.functionalPinReport!= null)&&(!this.functionalPinReport.isEmpty())));
        }
        {
            List<PPReportType> thePPReport;
            thePPReport = (((this.ppReport!= null)&&(!this.ppReport.isEmpty()))?this.getPPReport():null);
            strategy.appendField(locator, this, "ppReport", buffer, thePPReport, ((this.ppReport!= null)&&(!this.ppReport.isEmpty())));
        }
        {
            List<PRReportType> thePRReport;
            thePRReport = (((this.prReport!= null)&&(!this.prReport.isEmpty()))?this.getPRReport():null);
            strategy.appendField(locator, this, "prReport", buffer, thePRReport, ((this.prReport!= null)&&(!this.prReport.isEmpty())));
        }
        {
            List<FinalPackageReportType> theStringReport;
            theStringReport = (((this.stringReport!= null)&&(!this.stringReport.isEmpty()))?this.getStringReport():null);
            strategy.appendField(locator, this, "stringReport", buffer, theStringReport, ((this.stringReport!= null)&&(!this.stringReport.isEmpty())));
        }
        {
            List<TestMap> theTestMap;
            theTestMap = (((this.testMap!= null)&&(!this.testMap.isEmpty()))?this.getTestMap():null);
            strategy.appendField(locator, this, "testMap", buffer, theTestMap, ((this.testMap!= null)&&(!this.testMap.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
