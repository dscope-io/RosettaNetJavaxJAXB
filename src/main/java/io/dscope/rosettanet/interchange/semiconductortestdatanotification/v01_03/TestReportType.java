
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03;

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
 *         &lt;element name="CalcFailReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}CalcFailReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DieReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}DieReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FPReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}FPReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FunctionalPinReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}FunctionalPinReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PPReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}PPReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PRReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}PRReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TestMap" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}TestMapType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "calcFailReport",
    "dieReport",
    "fpReport",
    "functionalPinReport",
    "ppReport",
    "prReport",
    "testMap"
})
public class TestReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CalcFailReport")
    protected List<CalcFailReportType> calcFailReport;
    @XmlElement(name = "DieReport")
    protected List<DieReportType> dieReport;
    @XmlElement(name = "FPReport")
    protected List<FPReportType> fpReport;
    @XmlElement(name = "FunctionalPinReport")
    protected List<FunctionalPinReportType> functionalPinReport;
    @XmlElement(name = "PPReport")
    protected List<PPReportType> ppReport;
    @XmlElement(name = "PRReport")
    protected List<PRReportType> prReport;
    @XmlElement(name = "TestMap")
    protected List<TestMapType> testMap;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * {@link TestMapType }
     * 
     * 
     */
    public List<TestMapType> getTestMap() {
        if (testMap == null) {
            testMap = new ArrayList<TestMapType>();
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
            List<TestMapType> lhsTestMap;
            lhsTestMap = (((this.testMap!= null)&&(!this.testMap.isEmpty()))?this.getTestMap():null);
            List<TestMapType> rhsTestMap;
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
            List<TestMapType> theTestMap;
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
            List<TestMapType> theTestMap;
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
