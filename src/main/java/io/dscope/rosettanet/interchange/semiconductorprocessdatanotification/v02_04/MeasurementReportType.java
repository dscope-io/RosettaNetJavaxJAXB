
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.ChipPeriodicity;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.Dimension;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.FloatCoordinate;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.IntCoordinate;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.MeasurementUnit;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.TestMap;
import io.dscope.rosettanet.interchange.codelist.measurementtype.v01_02.MeasurementType;
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
 * <p>Java class for MeasurementReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CensorFailCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}ChipPeriodicity" minOccurs="0"/&gt;
 *         &lt;element name="ChipX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ChipY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CpK" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}Dimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExecutionCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FailCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}FloatCoordinate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}IntCoordinate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaxMeasurement" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Mean" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Measurement" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementFeatureReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}MeasurementFeatureReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}MeasurementUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MinMeasurement" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Parameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Range" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="SampleCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="StdDev" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="SumOfSquares" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}TestMap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TestParameterInformation" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}TestParameterInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MeasurementReportType", propOrder = {
    "censorFailCount",
    "chipPeriodicity",
    "chipX",
    "chipY",
    "cpK",
    "dimension",
    "executionCount",
    "failCount",
    "floatCoordinate",
    "intCoordinate",
    "maxMeasurement",
    "mean",
    "measurement",
    "measurementFeatureReport",
    "measurementType",
    "measurementUnit",
    "minMeasurement",
    "parameter",
    "primaryIdentifier",
    "range",
    "sampleCount",
    "stdDev",
    "sum",
    "sumOfSquares",
    "testMap",
    "testParameterInformation"
})
public class MeasurementReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CensorFailCount")
    protected BigInteger censorFailCount;
    @XmlElementRef(name = "ChipPeriodicity", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = ChipPeriodicity.class, required = false)
    protected ChipPeriodicity chipPeriodicity;
    @XmlElement(name = "ChipX")
    protected BigInteger chipX;
    @XmlElement(name = "ChipY")
    protected BigInteger chipY;
    @XmlElement(name = "CpK")
    protected Float cpK;
    @XmlElementRef(name = "Dimension", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = Dimension.class, required = false)
    protected List<Dimension> dimension;
    @XmlElement(name = "ExecutionCount")
    protected BigInteger executionCount;
    @XmlElement(name = "FailCount")
    protected BigInteger failCount;
    @XmlElementRef(name = "FloatCoordinate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = FloatCoordinate.class, required = false)
    protected List<FloatCoordinate> floatCoordinate;
    @XmlElementRef(name = "IntCoordinate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = IntCoordinate.class, required = false)
    protected List<IntCoordinate> intCoordinate;
    @XmlElement(name = "MaxMeasurement")
    protected Float maxMeasurement;
    @XmlElement(name = "Mean")
    protected Float mean;
    @XmlElement(name = "Measurement")
    protected Float measurement;
    @XmlElement(name = "MeasurementFeatureReport")
    protected List<MeasurementFeatureReportType> measurementFeatureReport;
    @XmlElementRef(name = "MeasurementType", namespace = "urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02", type = MeasurementType.class, required = false)
    protected List<MeasurementType> measurementType;
    @XmlElementRef(name = "MeasurementUnit", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = MeasurementUnit.class, required = false)
    protected List<MeasurementUnit> measurementUnit;
    @XmlElement(name = "MinMeasurement")
    protected Float minMeasurement;
    @XmlElement(name = "Parameter")
    protected String parameter;
    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "Range")
    protected Float range;
    @XmlElement(name = "SampleCount")
    protected BigInteger sampleCount;
    @XmlElement(name = "StdDev")
    protected Float stdDev;
    @XmlElement(name = "Sum")
    protected Float sum;
    @XmlElement(name = "SumOfSquares")
    protected Float sumOfSquares;
    @XmlElementRef(name = "TestMap", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = TestMap.class, required = false)
    protected List<TestMap> testMap;
    @XmlElement(name = "TestParameterInformation")
    protected List<TestParameterInformationType> testParameterInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the censorFailCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCensorFailCount() {
        return censorFailCount;
    }

    /**
     * Sets the value of the censorFailCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCensorFailCount(BigInteger value) {
        this.censorFailCount = value;
    }

    /**
     * Gets the value of the chipPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link ChipPeriodicity }
     *     
     */
    public ChipPeriodicity getChipPeriodicity() {
        return chipPeriodicity;
    }

    /**
     * Sets the value of the chipPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChipPeriodicity }
     *     
     */
    public void setChipPeriodicity(ChipPeriodicity value) {
        this.chipPeriodicity = value;
    }

    /**
     * Gets the value of the chipX property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChipX() {
        return chipX;
    }

    /**
     * Sets the value of the chipX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChipX(BigInteger value) {
        this.chipX = value;
    }

    /**
     * Gets the value of the chipY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChipY() {
        return chipY;
    }

    /**
     * Sets the value of the chipY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChipY(BigInteger value) {
        this.chipY = value;
    }

    /**
     * Gets the value of the cpK property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCpK() {
        return cpK;
    }

    /**
     * Sets the value of the cpK property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCpK(Float value) {
        this.cpK = value;
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
     * Gets the value of the executionCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExecutionCount() {
        return executionCount;
    }

    /**
     * Sets the value of the executionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExecutionCount(BigInteger value) {
        this.executionCount = value;
    }

    /**
     * Gets the value of the failCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFailCount() {
        return failCount;
    }

    /**
     * Sets the value of the failCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFailCount(BigInteger value) {
        this.failCount = value;
    }

    /**
     * Gets the value of the floatCoordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floatCoordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloatCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FloatCoordinate }
     * 
     * 
     */
    public List<FloatCoordinate> getFloatCoordinate() {
        if (floatCoordinate == null) {
            floatCoordinate = new ArrayList<FloatCoordinate>();
        }
        return this.floatCoordinate;
    }

    /**
     * Gets the value of the intCoordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intCoordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntCoordinate }
     * 
     * 
     */
    public List<IntCoordinate> getIntCoordinate() {
        if (intCoordinate == null) {
            intCoordinate = new ArrayList<IntCoordinate>();
        }
        return this.intCoordinate;
    }

    /**
     * Gets the value of the maxMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxMeasurement() {
        return maxMeasurement;
    }

    /**
     * Sets the value of the maxMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxMeasurement(Float value) {
        this.maxMeasurement = value;
    }

    /**
     * Gets the value of the mean property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMean() {
        return mean;
    }

    /**
     * Sets the value of the mean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMean(Float value) {
        this.mean = value;
    }

    /**
     * Gets the value of the measurement property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMeasurement(Float value) {
        this.measurement = value;
    }

    /**
     * Gets the value of the measurementFeatureReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementFeatureReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementFeatureReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementFeatureReportType }
     * 
     * 
     */
    public List<MeasurementFeatureReportType> getMeasurementFeatureReport() {
        if (measurementFeatureReport == null) {
            measurementFeatureReport = new ArrayList<MeasurementFeatureReportType>();
        }
        return this.measurementFeatureReport;
    }

    /**
     * Gets the value of the measurementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMeasurementType() {
        if (measurementType == null) {
            measurementType = new ArrayList<MeasurementType>();
        }
        return this.measurementType;
    }

    /**
     * Gets the value of the measurementUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementUnit }
     * 
     * 
     */
    public List<MeasurementUnit> getMeasurementUnit() {
        if (measurementUnit == null) {
            measurementUnit = new ArrayList<MeasurementUnit>();
        }
        return this.measurementUnit;
    }

    /**
     * Gets the value of the minMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinMeasurement() {
        return minMeasurement;
    }

    /**
     * Sets the value of the minMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinMeasurement(Float value) {
        this.minMeasurement = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter(String value) {
        this.parameter = value;
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
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRange(Float value) {
        this.range = value;
    }

    /**
     * Gets the value of the sampleCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSampleCount() {
        return sampleCount;
    }

    /**
     * Sets the value of the sampleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSampleCount(BigInteger value) {
        this.sampleCount = value;
    }

    /**
     * Gets the value of the stdDev property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStdDev() {
        return stdDev;
    }

    /**
     * Sets the value of the stdDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStdDev(Float value) {
        this.stdDev = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSum(Float value) {
        this.sum = value;
    }

    /**
     * Gets the value of the sumOfSquares property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSumOfSquares() {
        return sumOfSquares;
    }

    /**
     * Sets the value of the sumOfSquares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSumOfSquares(Float value) {
        this.sumOfSquares = value;
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
     * Gets the value of the testParameterInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testParameterInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestParameterInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestParameterInformationType }
     * 
     * 
     */
    public List<TestParameterInformationType> getTestParameterInformation() {
        if (testParameterInformation == null) {
            testParameterInformation = new ArrayList<TestParameterInformationType>();
        }
        return this.testParameterInformation;
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
        final MeasurementReportType that = ((MeasurementReportType) object);
        {
            BigInteger lhsCensorFailCount;
            lhsCensorFailCount = this.getCensorFailCount();
            BigInteger rhsCensorFailCount;
            rhsCensorFailCount = that.getCensorFailCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "censorFailCount", lhsCensorFailCount), LocatorUtils.property(thatLocator, "censorFailCount", rhsCensorFailCount), lhsCensorFailCount, rhsCensorFailCount, (this.censorFailCount!= null), (that.censorFailCount!= null))) {
                return false;
            }
        }
        {
            ChipPeriodicity lhsChipPeriodicity;
            lhsChipPeriodicity = this.getChipPeriodicity();
            ChipPeriodicity rhsChipPeriodicity;
            rhsChipPeriodicity = that.getChipPeriodicity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chipPeriodicity", lhsChipPeriodicity), LocatorUtils.property(thatLocator, "chipPeriodicity", rhsChipPeriodicity), lhsChipPeriodicity, rhsChipPeriodicity, (this.chipPeriodicity!= null), (that.chipPeriodicity!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsChipX;
            lhsChipX = this.getChipX();
            BigInteger rhsChipX;
            rhsChipX = that.getChipX();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chipX", lhsChipX), LocatorUtils.property(thatLocator, "chipX", rhsChipX), lhsChipX, rhsChipX, (this.chipX!= null), (that.chipX!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsChipY;
            lhsChipY = this.getChipY();
            BigInteger rhsChipY;
            rhsChipY = that.getChipY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chipY", lhsChipY), LocatorUtils.property(thatLocator, "chipY", rhsChipY), lhsChipY, rhsChipY, (this.chipY!= null), (that.chipY!= null))) {
                return false;
            }
        }
        {
            Float lhsCpK;
            lhsCpK = this.getCpK();
            Float rhsCpK;
            rhsCpK = that.getCpK();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cpK", lhsCpK), LocatorUtils.property(thatLocator, "cpK", rhsCpK), lhsCpK, rhsCpK, (this.cpK!= null), (that.cpK!= null))) {
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
            BigInteger lhsExecutionCount;
            lhsExecutionCount = this.getExecutionCount();
            BigInteger rhsExecutionCount;
            rhsExecutionCount = that.getExecutionCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "executionCount", lhsExecutionCount), LocatorUtils.property(thatLocator, "executionCount", rhsExecutionCount), lhsExecutionCount, rhsExecutionCount, (this.executionCount!= null), (that.executionCount!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsFailCount;
            lhsFailCount = this.getFailCount();
            BigInteger rhsFailCount;
            rhsFailCount = that.getFailCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failCount", lhsFailCount), LocatorUtils.property(thatLocator, "failCount", rhsFailCount), lhsFailCount, rhsFailCount, (this.failCount!= null), (that.failCount!= null))) {
                return false;
            }
        }
        {
            List<FloatCoordinate> lhsFloatCoordinate;
            lhsFloatCoordinate = (((this.floatCoordinate!= null)&&(!this.floatCoordinate.isEmpty()))?this.getFloatCoordinate():null);
            List<FloatCoordinate> rhsFloatCoordinate;
            rhsFloatCoordinate = (((that.floatCoordinate!= null)&&(!that.floatCoordinate.isEmpty()))?that.getFloatCoordinate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floatCoordinate", lhsFloatCoordinate), LocatorUtils.property(thatLocator, "floatCoordinate", rhsFloatCoordinate), lhsFloatCoordinate, rhsFloatCoordinate, ((this.floatCoordinate!= null)&&(!this.floatCoordinate.isEmpty())), ((that.floatCoordinate!= null)&&(!that.floatCoordinate.isEmpty())))) {
                return false;
            }
        }
        {
            List<IntCoordinate> lhsIntCoordinate;
            lhsIntCoordinate = (((this.intCoordinate!= null)&&(!this.intCoordinate.isEmpty()))?this.getIntCoordinate():null);
            List<IntCoordinate> rhsIntCoordinate;
            rhsIntCoordinate = (((that.intCoordinate!= null)&&(!that.intCoordinate.isEmpty()))?that.getIntCoordinate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intCoordinate", lhsIntCoordinate), LocatorUtils.property(thatLocator, "intCoordinate", rhsIntCoordinate), lhsIntCoordinate, rhsIntCoordinate, ((this.intCoordinate!= null)&&(!this.intCoordinate.isEmpty())), ((that.intCoordinate!= null)&&(!that.intCoordinate.isEmpty())))) {
                return false;
            }
        }
        {
            Float lhsMaxMeasurement;
            lhsMaxMeasurement = this.getMaxMeasurement();
            Float rhsMaxMeasurement;
            rhsMaxMeasurement = that.getMaxMeasurement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxMeasurement", lhsMaxMeasurement), LocatorUtils.property(thatLocator, "maxMeasurement", rhsMaxMeasurement), lhsMaxMeasurement, rhsMaxMeasurement, (this.maxMeasurement!= null), (that.maxMeasurement!= null))) {
                return false;
            }
        }
        {
            Float lhsMean;
            lhsMean = this.getMean();
            Float rhsMean;
            rhsMean = that.getMean();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mean", lhsMean), LocatorUtils.property(thatLocator, "mean", rhsMean), lhsMean, rhsMean, (this.mean!= null), (that.mean!= null))) {
                return false;
            }
        }
        {
            Float lhsMeasurement;
            lhsMeasurement = this.getMeasurement();
            Float rhsMeasurement;
            rhsMeasurement = that.getMeasurement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurement", lhsMeasurement), LocatorUtils.property(thatLocator, "measurement", rhsMeasurement), lhsMeasurement, rhsMeasurement, (this.measurement!= null), (that.measurement!= null))) {
                return false;
            }
        }
        {
            List<MeasurementFeatureReportType> lhsMeasurementFeatureReport;
            lhsMeasurementFeatureReport = (((this.measurementFeatureReport!= null)&&(!this.measurementFeatureReport.isEmpty()))?this.getMeasurementFeatureReport():null);
            List<MeasurementFeatureReportType> rhsMeasurementFeatureReport;
            rhsMeasurementFeatureReport = (((that.measurementFeatureReport!= null)&&(!that.measurementFeatureReport.isEmpty()))?that.getMeasurementFeatureReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementFeatureReport", lhsMeasurementFeatureReport), LocatorUtils.property(thatLocator, "measurementFeatureReport", rhsMeasurementFeatureReport), lhsMeasurementFeatureReport, rhsMeasurementFeatureReport, ((this.measurementFeatureReport!= null)&&(!this.measurementFeatureReport.isEmpty())), ((that.measurementFeatureReport!= null)&&(!that.measurementFeatureReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<MeasurementType> lhsMeasurementType;
            lhsMeasurementType = (((this.measurementType!= null)&&(!this.measurementType.isEmpty()))?this.getMeasurementType():null);
            List<MeasurementType> rhsMeasurementType;
            rhsMeasurementType = (((that.measurementType!= null)&&(!that.measurementType.isEmpty()))?that.getMeasurementType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementType", lhsMeasurementType), LocatorUtils.property(thatLocator, "measurementType", rhsMeasurementType), lhsMeasurementType, rhsMeasurementType, ((this.measurementType!= null)&&(!this.measurementType.isEmpty())), ((that.measurementType!= null)&&(!that.measurementType.isEmpty())))) {
                return false;
            }
        }
        {
            List<MeasurementUnit> lhsMeasurementUnit;
            lhsMeasurementUnit = (((this.measurementUnit!= null)&&(!this.measurementUnit.isEmpty()))?this.getMeasurementUnit():null);
            List<MeasurementUnit> rhsMeasurementUnit;
            rhsMeasurementUnit = (((that.measurementUnit!= null)&&(!that.measurementUnit.isEmpty()))?that.getMeasurementUnit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementUnit", lhsMeasurementUnit), LocatorUtils.property(thatLocator, "measurementUnit", rhsMeasurementUnit), lhsMeasurementUnit, rhsMeasurementUnit, ((this.measurementUnit!= null)&&(!this.measurementUnit.isEmpty())), ((that.measurementUnit!= null)&&(!that.measurementUnit.isEmpty())))) {
                return false;
            }
        }
        {
            Float lhsMinMeasurement;
            lhsMinMeasurement = this.getMinMeasurement();
            Float rhsMinMeasurement;
            rhsMinMeasurement = that.getMinMeasurement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minMeasurement", lhsMinMeasurement), LocatorUtils.property(thatLocator, "minMeasurement", rhsMinMeasurement), lhsMinMeasurement, rhsMinMeasurement, (this.minMeasurement!= null), (that.minMeasurement!= null))) {
                return false;
            }
        }
        {
            String lhsParameter;
            lhsParameter = this.getParameter();
            String rhsParameter;
            rhsParameter = that.getParameter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parameter", lhsParameter), LocatorUtils.property(thatLocator, "parameter", rhsParameter), lhsParameter, rhsParameter, (this.parameter!= null), (that.parameter!= null))) {
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
            Float lhsRange;
            lhsRange = this.getRange();
            Float rhsRange;
            rhsRange = that.getRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "range", lhsRange), LocatorUtils.property(thatLocator, "range", rhsRange), lhsRange, rhsRange, (this.range!= null), (that.range!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsSampleCount;
            lhsSampleCount = this.getSampleCount();
            BigInteger rhsSampleCount;
            rhsSampleCount = that.getSampleCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sampleCount", lhsSampleCount), LocatorUtils.property(thatLocator, "sampleCount", rhsSampleCount), lhsSampleCount, rhsSampleCount, (this.sampleCount!= null), (that.sampleCount!= null))) {
                return false;
            }
        }
        {
            Float lhsStdDev;
            lhsStdDev = this.getStdDev();
            Float rhsStdDev;
            rhsStdDev = that.getStdDev();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stdDev", lhsStdDev), LocatorUtils.property(thatLocator, "stdDev", rhsStdDev), lhsStdDev, rhsStdDev, (this.stdDev!= null), (that.stdDev!= null))) {
                return false;
            }
        }
        {
            Float lhsSum;
            lhsSum = this.getSum();
            Float rhsSum;
            rhsSum = that.getSum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sum", lhsSum), LocatorUtils.property(thatLocator, "sum", rhsSum), lhsSum, rhsSum, (this.sum!= null), (that.sum!= null))) {
                return false;
            }
        }
        {
            Float lhsSumOfSquares;
            lhsSumOfSquares = this.getSumOfSquares();
            Float rhsSumOfSquares;
            rhsSumOfSquares = that.getSumOfSquares();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sumOfSquares", lhsSumOfSquares), LocatorUtils.property(thatLocator, "sumOfSquares", rhsSumOfSquares), lhsSumOfSquares, rhsSumOfSquares, (this.sumOfSquares!= null), (that.sumOfSquares!= null))) {
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
            List<TestParameterInformationType> lhsTestParameterInformation;
            lhsTestParameterInformation = (((this.testParameterInformation!= null)&&(!this.testParameterInformation.isEmpty()))?this.getTestParameterInformation():null);
            List<TestParameterInformationType> rhsTestParameterInformation;
            rhsTestParameterInformation = (((that.testParameterInformation!= null)&&(!that.testParameterInformation.isEmpty()))?that.getTestParameterInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testParameterInformation", lhsTestParameterInformation), LocatorUtils.property(thatLocator, "testParameterInformation", rhsTestParameterInformation), lhsTestParameterInformation, rhsTestParameterInformation, ((this.testParameterInformation!= null)&&(!this.testParameterInformation.isEmpty())), ((that.testParameterInformation!= null)&&(!that.testParameterInformation.isEmpty())))) {
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
            BigInteger theCensorFailCount;
            theCensorFailCount = this.getCensorFailCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "censorFailCount", theCensorFailCount), currentHashCode, theCensorFailCount, (this.censorFailCount!= null));
        }
        {
            ChipPeriodicity theChipPeriodicity;
            theChipPeriodicity = this.getChipPeriodicity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chipPeriodicity", theChipPeriodicity), currentHashCode, theChipPeriodicity, (this.chipPeriodicity!= null));
        }
        {
            BigInteger theChipX;
            theChipX = this.getChipX();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chipX", theChipX), currentHashCode, theChipX, (this.chipX!= null));
        }
        {
            BigInteger theChipY;
            theChipY = this.getChipY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chipY", theChipY), currentHashCode, theChipY, (this.chipY!= null));
        }
        {
            Float theCpK;
            theCpK = this.getCpK();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cpK", theCpK), currentHashCode, theCpK, (this.cpK!= null));
        }
        {
            List<Dimension> theDimension;
            theDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dimension", theDimension), currentHashCode, theDimension, ((this.dimension!= null)&&(!this.dimension.isEmpty())));
        }
        {
            BigInteger theExecutionCount;
            theExecutionCount = this.getExecutionCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "executionCount", theExecutionCount), currentHashCode, theExecutionCount, (this.executionCount!= null));
        }
        {
            BigInteger theFailCount;
            theFailCount = this.getFailCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failCount", theFailCount), currentHashCode, theFailCount, (this.failCount!= null));
        }
        {
            List<FloatCoordinate> theFloatCoordinate;
            theFloatCoordinate = (((this.floatCoordinate!= null)&&(!this.floatCoordinate.isEmpty()))?this.getFloatCoordinate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "floatCoordinate", theFloatCoordinate), currentHashCode, theFloatCoordinate, ((this.floatCoordinate!= null)&&(!this.floatCoordinate.isEmpty())));
        }
        {
            List<IntCoordinate> theIntCoordinate;
            theIntCoordinate = (((this.intCoordinate!= null)&&(!this.intCoordinate.isEmpty()))?this.getIntCoordinate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intCoordinate", theIntCoordinate), currentHashCode, theIntCoordinate, ((this.intCoordinate!= null)&&(!this.intCoordinate.isEmpty())));
        }
        {
            Float theMaxMeasurement;
            theMaxMeasurement = this.getMaxMeasurement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxMeasurement", theMaxMeasurement), currentHashCode, theMaxMeasurement, (this.maxMeasurement!= null));
        }
        {
            Float theMean;
            theMean = this.getMean();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mean", theMean), currentHashCode, theMean, (this.mean!= null));
        }
        {
            Float theMeasurement;
            theMeasurement = this.getMeasurement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurement", theMeasurement), currentHashCode, theMeasurement, (this.measurement!= null));
        }
        {
            List<MeasurementFeatureReportType> theMeasurementFeatureReport;
            theMeasurementFeatureReport = (((this.measurementFeatureReport!= null)&&(!this.measurementFeatureReport.isEmpty()))?this.getMeasurementFeatureReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementFeatureReport", theMeasurementFeatureReport), currentHashCode, theMeasurementFeatureReport, ((this.measurementFeatureReport!= null)&&(!this.measurementFeatureReport.isEmpty())));
        }
        {
            List<MeasurementType> theMeasurementType;
            theMeasurementType = (((this.measurementType!= null)&&(!this.measurementType.isEmpty()))?this.getMeasurementType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementType", theMeasurementType), currentHashCode, theMeasurementType, ((this.measurementType!= null)&&(!this.measurementType.isEmpty())));
        }
        {
            List<MeasurementUnit> theMeasurementUnit;
            theMeasurementUnit = (((this.measurementUnit!= null)&&(!this.measurementUnit.isEmpty()))?this.getMeasurementUnit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementUnit", theMeasurementUnit), currentHashCode, theMeasurementUnit, ((this.measurementUnit!= null)&&(!this.measurementUnit.isEmpty())));
        }
        {
            Float theMinMeasurement;
            theMinMeasurement = this.getMinMeasurement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minMeasurement", theMinMeasurement), currentHashCode, theMinMeasurement, (this.minMeasurement!= null));
        }
        {
            String theParameter;
            theParameter = this.getParameter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameter", theParameter), currentHashCode, theParameter, (this.parameter!= null));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryIdentifier", thePrimaryIdentifier), currentHashCode, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            Float theRange;
            theRange = this.getRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "range", theRange), currentHashCode, theRange, (this.range!= null));
        }
        {
            BigInteger theSampleCount;
            theSampleCount = this.getSampleCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sampleCount", theSampleCount), currentHashCode, theSampleCount, (this.sampleCount!= null));
        }
        {
            Float theStdDev;
            theStdDev = this.getStdDev();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stdDev", theStdDev), currentHashCode, theStdDev, (this.stdDev!= null));
        }
        {
            Float theSum;
            theSum = this.getSum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sum", theSum), currentHashCode, theSum, (this.sum!= null));
        }
        {
            Float theSumOfSquares;
            theSumOfSquares = this.getSumOfSquares();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sumOfSquares", theSumOfSquares), currentHashCode, theSumOfSquares, (this.sumOfSquares!= null));
        }
        {
            List<TestMap> theTestMap;
            theTestMap = (((this.testMap!= null)&&(!this.testMap.isEmpty()))?this.getTestMap():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testMap", theTestMap), currentHashCode, theTestMap, ((this.testMap!= null)&&(!this.testMap.isEmpty())));
        }
        {
            List<TestParameterInformationType> theTestParameterInformation;
            theTestParameterInformation = (((this.testParameterInformation!= null)&&(!this.testParameterInformation.isEmpty()))?this.getTestParameterInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testParameterInformation", theTestParameterInformation), currentHashCode, theTestParameterInformation, ((this.testParameterInformation!= null)&&(!this.testParameterInformation.isEmpty())));
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
            BigInteger theCensorFailCount;
            theCensorFailCount = this.getCensorFailCount();
            strategy.appendField(locator, this, "censorFailCount", buffer, theCensorFailCount, (this.censorFailCount!= null));
        }
        {
            ChipPeriodicity theChipPeriodicity;
            theChipPeriodicity = this.getChipPeriodicity();
            strategy.appendField(locator, this, "chipPeriodicity", buffer, theChipPeriodicity, (this.chipPeriodicity!= null));
        }
        {
            BigInteger theChipX;
            theChipX = this.getChipX();
            strategy.appendField(locator, this, "chipX", buffer, theChipX, (this.chipX!= null));
        }
        {
            BigInteger theChipY;
            theChipY = this.getChipY();
            strategy.appendField(locator, this, "chipY", buffer, theChipY, (this.chipY!= null));
        }
        {
            Float theCpK;
            theCpK = this.getCpK();
            strategy.appendField(locator, this, "cpK", buffer, theCpK, (this.cpK!= null));
        }
        {
            List<Dimension> theDimension;
            theDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
            strategy.appendField(locator, this, "dimension", buffer, theDimension, ((this.dimension!= null)&&(!this.dimension.isEmpty())));
        }
        {
            BigInteger theExecutionCount;
            theExecutionCount = this.getExecutionCount();
            strategy.appendField(locator, this, "executionCount", buffer, theExecutionCount, (this.executionCount!= null));
        }
        {
            BigInteger theFailCount;
            theFailCount = this.getFailCount();
            strategy.appendField(locator, this, "failCount", buffer, theFailCount, (this.failCount!= null));
        }
        {
            List<FloatCoordinate> theFloatCoordinate;
            theFloatCoordinate = (((this.floatCoordinate!= null)&&(!this.floatCoordinate.isEmpty()))?this.getFloatCoordinate():null);
            strategy.appendField(locator, this, "floatCoordinate", buffer, theFloatCoordinate, ((this.floatCoordinate!= null)&&(!this.floatCoordinate.isEmpty())));
        }
        {
            List<IntCoordinate> theIntCoordinate;
            theIntCoordinate = (((this.intCoordinate!= null)&&(!this.intCoordinate.isEmpty()))?this.getIntCoordinate():null);
            strategy.appendField(locator, this, "intCoordinate", buffer, theIntCoordinate, ((this.intCoordinate!= null)&&(!this.intCoordinate.isEmpty())));
        }
        {
            Float theMaxMeasurement;
            theMaxMeasurement = this.getMaxMeasurement();
            strategy.appendField(locator, this, "maxMeasurement", buffer, theMaxMeasurement, (this.maxMeasurement!= null));
        }
        {
            Float theMean;
            theMean = this.getMean();
            strategy.appendField(locator, this, "mean", buffer, theMean, (this.mean!= null));
        }
        {
            Float theMeasurement;
            theMeasurement = this.getMeasurement();
            strategy.appendField(locator, this, "measurement", buffer, theMeasurement, (this.measurement!= null));
        }
        {
            List<MeasurementFeatureReportType> theMeasurementFeatureReport;
            theMeasurementFeatureReport = (((this.measurementFeatureReport!= null)&&(!this.measurementFeatureReport.isEmpty()))?this.getMeasurementFeatureReport():null);
            strategy.appendField(locator, this, "measurementFeatureReport", buffer, theMeasurementFeatureReport, ((this.measurementFeatureReport!= null)&&(!this.measurementFeatureReport.isEmpty())));
        }
        {
            List<MeasurementType> theMeasurementType;
            theMeasurementType = (((this.measurementType!= null)&&(!this.measurementType.isEmpty()))?this.getMeasurementType():null);
            strategy.appendField(locator, this, "measurementType", buffer, theMeasurementType, ((this.measurementType!= null)&&(!this.measurementType.isEmpty())));
        }
        {
            List<MeasurementUnit> theMeasurementUnit;
            theMeasurementUnit = (((this.measurementUnit!= null)&&(!this.measurementUnit.isEmpty()))?this.getMeasurementUnit():null);
            strategy.appendField(locator, this, "measurementUnit", buffer, theMeasurementUnit, ((this.measurementUnit!= null)&&(!this.measurementUnit.isEmpty())));
        }
        {
            Float theMinMeasurement;
            theMinMeasurement = this.getMinMeasurement();
            strategy.appendField(locator, this, "minMeasurement", buffer, theMinMeasurement, (this.minMeasurement!= null));
        }
        {
            String theParameter;
            theParameter = this.getParameter();
            strategy.appendField(locator, this, "parameter", buffer, theParameter, (this.parameter!= null));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            strategy.appendField(locator, this, "primaryIdentifier", buffer, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            Float theRange;
            theRange = this.getRange();
            strategy.appendField(locator, this, "range", buffer, theRange, (this.range!= null));
        }
        {
            BigInteger theSampleCount;
            theSampleCount = this.getSampleCount();
            strategy.appendField(locator, this, "sampleCount", buffer, theSampleCount, (this.sampleCount!= null));
        }
        {
            Float theStdDev;
            theStdDev = this.getStdDev();
            strategy.appendField(locator, this, "stdDev", buffer, theStdDev, (this.stdDev!= null));
        }
        {
            Float theSum;
            theSum = this.getSum();
            strategy.appendField(locator, this, "sum", buffer, theSum, (this.sum!= null));
        }
        {
            Float theSumOfSquares;
            theSumOfSquares = this.getSumOfSquares();
            strategy.appendField(locator, this, "sumOfSquares", buffer, theSumOfSquares, (this.sumOfSquares!= null));
        }
        {
            List<TestMap> theTestMap;
            theTestMap = (((this.testMap!= null)&&(!this.testMap.isEmpty()))?this.getTestMap():null);
            strategy.appendField(locator, this, "testMap", buffer, theTestMap, ((this.testMap!= null)&&(!this.testMap.isEmpty())));
        }
        {
            List<TestParameterInformationType> theTestParameterInformation;
            theTestParameterInformation = (((this.testParameterInformation!= null)&&(!this.testParameterInformation.isEmpty()))?this.getTestParameterInformation():null);
            strategy.appendField(locator, this, "testParameterInformation", buffer, theTestParameterInformation, ((this.testParameterInformation!= null)&&(!this.testParameterInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
