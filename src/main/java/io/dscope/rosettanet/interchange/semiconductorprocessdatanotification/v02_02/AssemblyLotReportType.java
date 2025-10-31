
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

import java.math.BigDecimal;
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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.QuantityDetail;
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
 * <p>Java class for AssemblyLotReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssemblyLotReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternateYield" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssemblyLotID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Calculation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerChipPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncomingWaferLotReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}IncomingWaferLotReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LotTimeStamp" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}LotTimeStampType"/&gt;
 *         &lt;element name="MfgWorkWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationInformationReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}OperationInformationReportType" minOccurs="0"/&gt;
 *         &lt;element name="OpticalInspectionReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}OpticalInspectionReportType" minOccurs="0"/&gt;
 *         &lt;element name="OverallYield" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Package" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}PackageType"/&gt;
 *         &lt;element name="PackageReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}PackageReportType" minOccurs="0"/&gt;
 *         &lt;element name="ProductCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}QuantityDetail" minOccurs="0"/&gt;
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
@XmlType(name = "AssemblyLotReportType", propOrder = {
    "alternateYield",
    "assemblyLotID",
    "calculation",
    "customerChipPN",
    "incomingWaferLotReport",
    "lotTimeStamp",
    "mfgWorkWeek",
    "operationInformationReport",
    "opticalInspectionReport",
    "overallYield",
    "_package",
    "packageReport",
    "productCategory",
    "quantityDetail"
})
public class AssemblyLotReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AlternateYield")
    protected List<BigDecimal> alternateYield;
    @XmlElement(name = "AssemblyLotID")
    protected String assemblyLotID;
    @XmlElement(name = "Calculation")
    protected List<String> calculation;
    @XmlElement(name = "CustomerChipPN")
    protected String customerChipPN;
    @XmlElement(name = "IncomingWaferLotReport")
    protected List<IncomingWaferLotReportType> incomingWaferLotReport;
    @XmlElement(name = "LotTimeStamp", required = true)
    protected LotTimeStampType lotTimeStamp;
    @XmlElement(name = "MfgWorkWeek")
    protected String mfgWorkWeek;
    @XmlElement(name = "OperationInformationReport")
    protected OperationInformationReportType operationInformationReport;
    @XmlElement(name = "OpticalInspectionReport")
    protected OpticalInspectionReportType opticalInspectionReport;
    @XmlElement(name = "OverallYield")
    protected BigDecimal overallYield;
    @XmlElement(name = "Package", required = true)
    protected PackageType _package;
    @XmlElement(name = "PackageReport")
    protected PackageReportType packageReport;
    @XmlElement(name = "ProductCategory")
    protected String productCategory;
    @XmlElementRef(name = "QuantityDetail", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = QuantityDetail.class, required = false)
    protected QuantityDetail quantityDetail;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternateYield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateYield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateYield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getAlternateYield() {
        if (alternateYield == null) {
            alternateYield = new ArrayList<BigDecimal>();
        }
        return this.alternateYield;
    }

    /**
     * Gets the value of the assemblyLotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyLotID() {
        return assemblyLotID;
    }

    /**
     * Sets the value of the assemblyLotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyLotID(String value) {
        this.assemblyLotID = value;
    }

    /**
     * Gets the value of the calculation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCalculation() {
        if (calculation == null) {
            calculation = new ArrayList<String>();
        }
        return this.calculation;
    }

    /**
     * Gets the value of the customerChipPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerChipPN() {
        return customerChipPN;
    }

    /**
     * Sets the value of the customerChipPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerChipPN(String value) {
        this.customerChipPN = value;
    }

    /**
     * Gets the value of the incomingWaferLotReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomingWaferLotReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomingWaferLotReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncomingWaferLotReportType }
     * 
     * 
     */
    public List<IncomingWaferLotReportType> getIncomingWaferLotReport() {
        if (incomingWaferLotReport == null) {
            incomingWaferLotReport = new ArrayList<IncomingWaferLotReportType>();
        }
        return this.incomingWaferLotReport;
    }

    /**
     * Gets the value of the lotTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link LotTimeStampType }
     *     
     */
    public LotTimeStampType getLotTimeStamp() {
        return lotTimeStamp;
    }

    /**
     * Sets the value of the lotTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotTimeStampType }
     *     
     */
    public void setLotTimeStamp(LotTimeStampType value) {
        this.lotTimeStamp = value;
    }

    /**
     * Gets the value of the mfgWorkWeek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfgWorkWeek() {
        return mfgWorkWeek;
    }

    /**
     * Sets the value of the mfgWorkWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfgWorkWeek(String value) {
        this.mfgWorkWeek = value;
    }

    /**
     * Gets the value of the operationInformationReport property.
     * 
     * @return
     *     possible object is
     *     {@link OperationInformationReportType }
     *     
     */
    public OperationInformationReportType getOperationInformationReport() {
        return operationInformationReport;
    }

    /**
     * Sets the value of the operationInformationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationInformationReportType }
     *     
     */
    public void setOperationInformationReport(OperationInformationReportType value) {
        this.operationInformationReport = value;
    }

    /**
     * Gets the value of the opticalInspectionReport property.
     * 
     * @return
     *     possible object is
     *     {@link OpticalInspectionReportType }
     *     
     */
    public OpticalInspectionReportType getOpticalInspectionReport() {
        return opticalInspectionReport;
    }

    /**
     * Sets the value of the opticalInspectionReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpticalInspectionReportType }
     *     
     */
    public void setOpticalInspectionReport(OpticalInspectionReportType value) {
        this.opticalInspectionReport = value;
    }

    /**
     * Gets the value of the overallYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverallYield() {
        return overallYield;
    }

    /**
     * Sets the value of the overallYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverallYield(BigDecimal value) {
        this.overallYield = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackage(PackageType value) {
        this._package = value;
    }

    /**
     * Gets the value of the packageReport property.
     * 
     * @return
     *     possible object is
     *     {@link PackageReportType }
     *     
     */
    public PackageReportType getPackageReport() {
        return packageReport;
    }

    /**
     * Sets the value of the packageReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageReportType }
     *     
     */
    public void setPackageReport(PackageReportType value) {
        this.packageReport = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategory(String value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the quantityDetail property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityDetail }
     *     
     */
    public QuantityDetail getQuantityDetail() {
        return quantityDetail;
    }

    /**
     * Sets the value of the quantityDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityDetail }
     *     
     */
    public void setQuantityDetail(QuantityDetail value) {
        this.quantityDetail = value;
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
        final AssemblyLotReportType that = ((AssemblyLotReportType) object);
        {
            List<BigDecimal> lhsAlternateYield;
            lhsAlternateYield = (((this.alternateYield!= null)&&(!this.alternateYield.isEmpty()))?this.getAlternateYield():null);
            List<BigDecimal> rhsAlternateYield;
            rhsAlternateYield = (((that.alternateYield!= null)&&(!that.alternateYield.isEmpty()))?that.getAlternateYield():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternateYield", lhsAlternateYield), LocatorUtils.property(thatLocator, "alternateYield", rhsAlternateYield), lhsAlternateYield, rhsAlternateYield, ((this.alternateYield!= null)&&(!this.alternateYield.isEmpty())), ((that.alternateYield!= null)&&(!that.alternateYield.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsAssemblyLotID;
            lhsAssemblyLotID = this.getAssemblyLotID();
            String rhsAssemblyLotID;
            rhsAssemblyLotID = that.getAssemblyLotID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assemblyLotID", lhsAssemblyLotID), LocatorUtils.property(thatLocator, "assemblyLotID", rhsAssemblyLotID), lhsAssemblyLotID, rhsAssemblyLotID, (this.assemblyLotID!= null), (that.assemblyLotID!= null))) {
                return false;
            }
        }
        {
            List<String> lhsCalculation;
            lhsCalculation = (((this.calculation!= null)&&(!this.calculation.isEmpty()))?this.getCalculation():null);
            List<String> rhsCalculation;
            rhsCalculation = (((that.calculation!= null)&&(!that.calculation.isEmpty()))?that.getCalculation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculation", lhsCalculation), LocatorUtils.property(thatLocator, "calculation", rhsCalculation), lhsCalculation, rhsCalculation, ((this.calculation!= null)&&(!this.calculation.isEmpty())), ((that.calculation!= null)&&(!that.calculation.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsCustomerChipPN;
            lhsCustomerChipPN = this.getCustomerChipPN();
            String rhsCustomerChipPN;
            rhsCustomerChipPN = that.getCustomerChipPN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerChipPN", lhsCustomerChipPN), LocatorUtils.property(thatLocator, "customerChipPN", rhsCustomerChipPN), lhsCustomerChipPN, rhsCustomerChipPN, (this.customerChipPN!= null), (that.customerChipPN!= null))) {
                return false;
            }
        }
        {
            List<IncomingWaferLotReportType> lhsIncomingWaferLotReport;
            lhsIncomingWaferLotReport = (((this.incomingWaferLotReport!= null)&&(!this.incomingWaferLotReport.isEmpty()))?this.getIncomingWaferLotReport():null);
            List<IncomingWaferLotReportType> rhsIncomingWaferLotReport;
            rhsIncomingWaferLotReport = (((that.incomingWaferLotReport!= null)&&(!that.incomingWaferLotReport.isEmpty()))?that.getIncomingWaferLotReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "incomingWaferLotReport", lhsIncomingWaferLotReport), LocatorUtils.property(thatLocator, "incomingWaferLotReport", rhsIncomingWaferLotReport), lhsIncomingWaferLotReport, rhsIncomingWaferLotReport, ((this.incomingWaferLotReport!= null)&&(!this.incomingWaferLotReport.isEmpty())), ((that.incomingWaferLotReport!= null)&&(!that.incomingWaferLotReport.isEmpty())))) {
                return false;
            }
        }
        {
            LotTimeStampType lhsLotTimeStamp;
            lhsLotTimeStamp = this.getLotTimeStamp();
            LotTimeStampType rhsLotTimeStamp;
            rhsLotTimeStamp = that.getLotTimeStamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotTimeStamp", lhsLotTimeStamp), LocatorUtils.property(thatLocator, "lotTimeStamp", rhsLotTimeStamp), lhsLotTimeStamp, rhsLotTimeStamp, (this.lotTimeStamp!= null), (that.lotTimeStamp!= null))) {
                return false;
            }
        }
        {
            String lhsMfgWorkWeek;
            lhsMfgWorkWeek = this.getMfgWorkWeek();
            String rhsMfgWorkWeek;
            rhsMfgWorkWeek = that.getMfgWorkWeek();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mfgWorkWeek", lhsMfgWorkWeek), LocatorUtils.property(thatLocator, "mfgWorkWeek", rhsMfgWorkWeek), lhsMfgWorkWeek, rhsMfgWorkWeek, (this.mfgWorkWeek!= null), (that.mfgWorkWeek!= null))) {
                return false;
            }
        }
        {
            OperationInformationReportType lhsOperationInformationReport;
            lhsOperationInformationReport = this.getOperationInformationReport();
            OperationInformationReportType rhsOperationInformationReport;
            rhsOperationInformationReport = that.getOperationInformationReport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operationInformationReport", lhsOperationInformationReport), LocatorUtils.property(thatLocator, "operationInformationReport", rhsOperationInformationReport), lhsOperationInformationReport, rhsOperationInformationReport, (this.operationInformationReport!= null), (that.operationInformationReport!= null))) {
                return false;
            }
        }
        {
            OpticalInspectionReportType lhsOpticalInspectionReport;
            lhsOpticalInspectionReport = this.getOpticalInspectionReport();
            OpticalInspectionReportType rhsOpticalInspectionReport;
            rhsOpticalInspectionReport = that.getOpticalInspectionReport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "opticalInspectionReport", lhsOpticalInspectionReport), LocatorUtils.property(thatLocator, "opticalInspectionReport", rhsOpticalInspectionReport), lhsOpticalInspectionReport, rhsOpticalInspectionReport, (this.opticalInspectionReport!= null), (that.opticalInspectionReport!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsOverallYield;
            lhsOverallYield = this.getOverallYield();
            BigDecimal rhsOverallYield;
            rhsOverallYield = that.getOverallYield();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "overallYield", lhsOverallYield), LocatorUtils.property(thatLocator, "overallYield", rhsOverallYield), lhsOverallYield, rhsOverallYield, (this.overallYield!= null), (that.overallYield!= null))) {
                return false;
            }
        }
        {
            PackageType lhsPackage;
            lhsPackage = this.getPackage();
            PackageType rhsPackage;
            rhsPackage = that.getPackage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_package", lhsPackage), LocatorUtils.property(thatLocator, "_package", rhsPackage), lhsPackage, rhsPackage, (this._package!= null), (that._package!= null))) {
                return false;
            }
        }
        {
            PackageReportType lhsPackageReport;
            lhsPackageReport = this.getPackageReport();
            PackageReportType rhsPackageReport;
            rhsPackageReport = that.getPackageReport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageReport", lhsPackageReport), LocatorUtils.property(thatLocator, "packageReport", rhsPackageReport), lhsPackageReport, rhsPackageReport, (this.packageReport!= null), (that.packageReport!= null))) {
                return false;
            }
        }
        {
            String lhsProductCategory;
            lhsProductCategory = this.getProductCategory();
            String rhsProductCategory;
            rhsProductCategory = that.getProductCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productCategory", lhsProductCategory), LocatorUtils.property(thatLocator, "productCategory", rhsProductCategory), lhsProductCategory, rhsProductCategory, (this.productCategory!= null), (that.productCategory!= null))) {
                return false;
            }
        }
        {
            QuantityDetail lhsQuantityDetail;
            lhsQuantityDetail = this.getQuantityDetail();
            QuantityDetail rhsQuantityDetail;
            rhsQuantityDetail = that.getQuantityDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityDetail", lhsQuantityDetail), LocatorUtils.property(thatLocator, "quantityDetail", rhsQuantityDetail), lhsQuantityDetail, rhsQuantityDetail, (this.quantityDetail!= null), (that.quantityDetail!= null))) {
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
            List<BigDecimal> theAlternateYield;
            theAlternateYield = (((this.alternateYield!= null)&&(!this.alternateYield.isEmpty()))?this.getAlternateYield():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternateYield", theAlternateYield), currentHashCode, theAlternateYield, ((this.alternateYield!= null)&&(!this.alternateYield.isEmpty())));
        }
        {
            String theAssemblyLotID;
            theAssemblyLotID = this.getAssemblyLotID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assemblyLotID", theAssemblyLotID), currentHashCode, theAssemblyLotID, (this.assemblyLotID!= null));
        }
        {
            List<String> theCalculation;
            theCalculation = (((this.calculation!= null)&&(!this.calculation.isEmpty()))?this.getCalculation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calculation", theCalculation), currentHashCode, theCalculation, ((this.calculation!= null)&&(!this.calculation.isEmpty())));
        }
        {
            String theCustomerChipPN;
            theCustomerChipPN = this.getCustomerChipPN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerChipPN", theCustomerChipPN), currentHashCode, theCustomerChipPN, (this.customerChipPN!= null));
        }
        {
            List<IncomingWaferLotReportType> theIncomingWaferLotReport;
            theIncomingWaferLotReport = (((this.incomingWaferLotReport!= null)&&(!this.incomingWaferLotReport.isEmpty()))?this.getIncomingWaferLotReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "incomingWaferLotReport", theIncomingWaferLotReport), currentHashCode, theIncomingWaferLotReport, ((this.incomingWaferLotReport!= null)&&(!this.incomingWaferLotReport.isEmpty())));
        }
        {
            LotTimeStampType theLotTimeStamp;
            theLotTimeStamp = this.getLotTimeStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotTimeStamp", theLotTimeStamp), currentHashCode, theLotTimeStamp, (this.lotTimeStamp!= null));
        }
        {
            String theMfgWorkWeek;
            theMfgWorkWeek = this.getMfgWorkWeek();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mfgWorkWeek", theMfgWorkWeek), currentHashCode, theMfgWorkWeek, (this.mfgWorkWeek!= null));
        }
        {
            OperationInformationReportType theOperationInformationReport;
            theOperationInformationReport = this.getOperationInformationReport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operationInformationReport", theOperationInformationReport), currentHashCode, theOperationInformationReport, (this.operationInformationReport!= null));
        }
        {
            OpticalInspectionReportType theOpticalInspectionReport;
            theOpticalInspectionReport = this.getOpticalInspectionReport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "opticalInspectionReport", theOpticalInspectionReport), currentHashCode, theOpticalInspectionReport, (this.opticalInspectionReport!= null));
        }
        {
            BigDecimal theOverallYield;
            theOverallYield = this.getOverallYield();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "overallYield", theOverallYield), currentHashCode, theOverallYield, (this.overallYield!= null));
        }
        {
            PackageType thePackage;
            thePackage = this.getPackage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_package", thePackage), currentHashCode, thePackage, (this._package!= null));
        }
        {
            PackageReportType thePackageReport;
            thePackageReport = this.getPackageReport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageReport", thePackageReport), currentHashCode, thePackageReport, (this.packageReport!= null));
        }
        {
            String theProductCategory;
            theProductCategory = this.getProductCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productCategory", theProductCategory), currentHashCode, theProductCategory, (this.productCategory!= null));
        }
        {
            QuantityDetail theQuantityDetail;
            theQuantityDetail = this.getQuantityDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityDetail", theQuantityDetail), currentHashCode, theQuantityDetail, (this.quantityDetail!= null));
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
            List<BigDecimal> theAlternateYield;
            theAlternateYield = (((this.alternateYield!= null)&&(!this.alternateYield.isEmpty()))?this.getAlternateYield():null);
            strategy.appendField(locator, this, "alternateYield", buffer, theAlternateYield, ((this.alternateYield!= null)&&(!this.alternateYield.isEmpty())));
        }
        {
            String theAssemblyLotID;
            theAssemblyLotID = this.getAssemblyLotID();
            strategy.appendField(locator, this, "assemblyLotID", buffer, theAssemblyLotID, (this.assemblyLotID!= null));
        }
        {
            List<String> theCalculation;
            theCalculation = (((this.calculation!= null)&&(!this.calculation.isEmpty()))?this.getCalculation():null);
            strategy.appendField(locator, this, "calculation", buffer, theCalculation, ((this.calculation!= null)&&(!this.calculation.isEmpty())));
        }
        {
            String theCustomerChipPN;
            theCustomerChipPN = this.getCustomerChipPN();
            strategy.appendField(locator, this, "customerChipPN", buffer, theCustomerChipPN, (this.customerChipPN!= null));
        }
        {
            List<IncomingWaferLotReportType> theIncomingWaferLotReport;
            theIncomingWaferLotReport = (((this.incomingWaferLotReport!= null)&&(!this.incomingWaferLotReport.isEmpty()))?this.getIncomingWaferLotReport():null);
            strategy.appendField(locator, this, "incomingWaferLotReport", buffer, theIncomingWaferLotReport, ((this.incomingWaferLotReport!= null)&&(!this.incomingWaferLotReport.isEmpty())));
        }
        {
            LotTimeStampType theLotTimeStamp;
            theLotTimeStamp = this.getLotTimeStamp();
            strategy.appendField(locator, this, "lotTimeStamp", buffer, theLotTimeStamp, (this.lotTimeStamp!= null));
        }
        {
            String theMfgWorkWeek;
            theMfgWorkWeek = this.getMfgWorkWeek();
            strategy.appendField(locator, this, "mfgWorkWeek", buffer, theMfgWorkWeek, (this.mfgWorkWeek!= null));
        }
        {
            OperationInformationReportType theOperationInformationReport;
            theOperationInformationReport = this.getOperationInformationReport();
            strategy.appendField(locator, this, "operationInformationReport", buffer, theOperationInformationReport, (this.operationInformationReport!= null));
        }
        {
            OpticalInspectionReportType theOpticalInspectionReport;
            theOpticalInspectionReport = this.getOpticalInspectionReport();
            strategy.appendField(locator, this, "opticalInspectionReport", buffer, theOpticalInspectionReport, (this.opticalInspectionReport!= null));
        }
        {
            BigDecimal theOverallYield;
            theOverallYield = this.getOverallYield();
            strategy.appendField(locator, this, "overallYield", buffer, theOverallYield, (this.overallYield!= null));
        }
        {
            PackageType thePackage;
            thePackage = this.getPackage();
            strategy.appendField(locator, this, "_package", buffer, thePackage, (this._package!= null));
        }
        {
            PackageReportType thePackageReport;
            thePackageReport = this.getPackageReport();
            strategy.appendField(locator, this, "packageReport", buffer, thePackageReport, (this.packageReport!= null));
        }
        {
            String theProductCategory;
            theProductCategory = this.getProductCategory();
            strategy.appendField(locator, this, "productCategory", buffer, theProductCategory, (this.productCategory!= null));
        }
        {
            QuantityDetail theQuantityDetail;
            theQuantityDetail = this.getQuantityDetail();
            strategy.appendField(locator, this, "quantityDetail", buffer, theQuantityDetail, (this.quantityDetail!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
