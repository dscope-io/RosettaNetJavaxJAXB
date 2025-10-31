
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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.BuildInfoReport;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.ECIDReport;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.FinalPackageReport;
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
 * <p>Java class for PackageReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssemblyMeasurementReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}AssemblyMeasurementReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}BuildInfoReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}ECIDReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}FinalPackageReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PackageDefectCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PackageDefectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PackageText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "PackageReportType", propOrder = {
    "assemblyMeasurementReport",
    "buildInfoReport",
    "ecidReport",
    "finalPackageReport",
    "packageDefectCount",
    "packageDefectID",
    "packageID",
    "packageText",
    "primaryIdentifier"
})
public class PackageReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AssemblyMeasurementReport")
    protected List<AssemblyMeasurementReportType> assemblyMeasurementReport;
    @XmlElementRef(name = "BuildInfoReport", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = BuildInfoReport.class, required = false)
    protected List<BuildInfoReport> buildInfoReport;
    @XmlElementRef(name = "ECIDReport", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = ECIDReport.class, required = false)
    protected List<ECIDReport> ecidReport;
    @XmlElementRef(name = "FinalPackageReport", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = FinalPackageReport.class, required = false)
    protected List<FinalPackageReport> finalPackageReport;
    @XmlElement(name = "PackageDefectCount")
    protected BigInteger packageDefectCount;
    @XmlElement(name = "PackageDefectID")
    protected String packageDefectID;
    @XmlElement(name = "PackageID")
    protected List<String> packageID;
    @XmlElement(name = "PackageText")
    protected List<String> packageText;
    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the assemblyMeasurementReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyMeasurementReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyMeasurementReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssemblyMeasurementReportType }
     * 
     * 
     */
    public List<AssemblyMeasurementReportType> getAssemblyMeasurementReport() {
        if (assemblyMeasurementReport == null) {
            assemblyMeasurementReport = new ArrayList<AssemblyMeasurementReportType>();
        }
        return this.assemblyMeasurementReport;
    }

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
     * Gets the value of the finalPackageReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finalPackageReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinalPackageReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinalPackageReport }
     * 
     * 
     */
    public List<FinalPackageReport> getFinalPackageReport() {
        if (finalPackageReport == null) {
            finalPackageReport = new ArrayList<FinalPackageReport>();
        }
        return this.finalPackageReport;
    }

    /**
     * Gets the value of the packageDefectCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageDefectCount() {
        return packageDefectCount;
    }

    /**
     * Sets the value of the packageDefectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageDefectCount(BigInteger value) {
        this.packageDefectCount = value;
    }

    /**
     * Gets the value of the packageDefectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDefectID() {
        return packageDefectID;
    }

    /**
     * Sets the value of the packageDefectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDefectID(String value) {
        this.packageDefectID = value;
    }

    /**
     * Gets the value of the packageID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackageID() {
        if (packageID == null) {
            packageID = new ArrayList<String>();
        }
        return this.packageID;
    }

    /**
     * Gets the value of the packageText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackageText() {
        if (packageText == null) {
            packageText = new ArrayList<String>();
        }
        return this.packageText;
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
        final PackageReportType that = ((PackageReportType) object);
        {
            List<AssemblyMeasurementReportType> lhsAssemblyMeasurementReport;
            lhsAssemblyMeasurementReport = (((this.assemblyMeasurementReport!= null)&&(!this.assemblyMeasurementReport.isEmpty()))?this.getAssemblyMeasurementReport():null);
            List<AssemblyMeasurementReportType> rhsAssemblyMeasurementReport;
            rhsAssemblyMeasurementReport = (((that.assemblyMeasurementReport!= null)&&(!that.assemblyMeasurementReport.isEmpty()))?that.getAssemblyMeasurementReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assemblyMeasurementReport", lhsAssemblyMeasurementReport), LocatorUtils.property(thatLocator, "assemblyMeasurementReport", rhsAssemblyMeasurementReport), lhsAssemblyMeasurementReport, rhsAssemblyMeasurementReport, ((this.assemblyMeasurementReport!= null)&&(!this.assemblyMeasurementReport.isEmpty())), ((that.assemblyMeasurementReport!= null)&&(!that.assemblyMeasurementReport.isEmpty())))) {
                return false;
            }
        }
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
            List<ECIDReport> lhsECIDReport;
            lhsECIDReport = (((this.ecidReport!= null)&&(!this.ecidReport.isEmpty()))?this.getECIDReport():null);
            List<ECIDReport> rhsECIDReport;
            rhsECIDReport = (((that.ecidReport!= null)&&(!that.ecidReport.isEmpty()))?that.getECIDReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ecidReport", lhsECIDReport), LocatorUtils.property(thatLocator, "ecidReport", rhsECIDReport), lhsECIDReport, rhsECIDReport, ((this.ecidReport!= null)&&(!this.ecidReport.isEmpty())), ((that.ecidReport!= null)&&(!that.ecidReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<FinalPackageReport> lhsFinalPackageReport;
            lhsFinalPackageReport = (((this.finalPackageReport!= null)&&(!this.finalPackageReport.isEmpty()))?this.getFinalPackageReport():null);
            List<FinalPackageReport> rhsFinalPackageReport;
            rhsFinalPackageReport = (((that.finalPackageReport!= null)&&(!that.finalPackageReport.isEmpty()))?that.getFinalPackageReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finalPackageReport", lhsFinalPackageReport), LocatorUtils.property(thatLocator, "finalPackageReport", rhsFinalPackageReport), lhsFinalPackageReport, rhsFinalPackageReport, ((this.finalPackageReport!= null)&&(!this.finalPackageReport.isEmpty())), ((that.finalPackageReport!= null)&&(!that.finalPackageReport.isEmpty())))) {
                return false;
            }
        }
        {
            BigInteger lhsPackageDefectCount;
            lhsPackageDefectCount = this.getPackageDefectCount();
            BigInteger rhsPackageDefectCount;
            rhsPackageDefectCount = that.getPackageDefectCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageDefectCount", lhsPackageDefectCount), LocatorUtils.property(thatLocator, "packageDefectCount", rhsPackageDefectCount), lhsPackageDefectCount, rhsPackageDefectCount, (this.packageDefectCount!= null), (that.packageDefectCount!= null))) {
                return false;
            }
        }
        {
            String lhsPackageDefectID;
            lhsPackageDefectID = this.getPackageDefectID();
            String rhsPackageDefectID;
            rhsPackageDefectID = that.getPackageDefectID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageDefectID", lhsPackageDefectID), LocatorUtils.property(thatLocator, "packageDefectID", rhsPackageDefectID), lhsPackageDefectID, rhsPackageDefectID, (this.packageDefectID!= null), (that.packageDefectID!= null))) {
                return false;
            }
        }
        {
            List<String> lhsPackageID;
            lhsPackageID = (((this.packageID!= null)&&(!this.packageID.isEmpty()))?this.getPackageID():null);
            List<String> rhsPackageID;
            rhsPackageID = (((that.packageID!= null)&&(!that.packageID.isEmpty()))?that.getPackageID():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageID", lhsPackageID), LocatorUtils.property(thatLocator, "packageID", rhsPackageID), lhsPackageID, rhsPackageID, ((this.packageID!= null)&&(!this.packageID.isEmpty())), ((that.packageID!= null)&&(!that.packageID.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsPackageText;
            lhsPackageText = (((this.packageText!= null)&&(!this.packageText.isEmpty()))?this.getPackageText():null);
            List<String> rhsPackageText;
            rhsPackageText = (((that.packageText!= null)&&(!that.packageText.isEmpty()))?that.getPackageText():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageText", lhsPackageText), LocatorUtils.property(thatLocator, "packageText", rhsPackageText), lhsPackageText, rhsPackageText, ((this.packageText!= null)&&(!this.packageText.isEmpty())), ((that.packageText!= null)&&(!that.packageText.isEmpty())))) {
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
            List<AssemblyMeasurementReportType> theAssemblyMeasurementReport;
            theAssemblyMeasurementReport = (((this.assemblyMeasurementReport!= null)&&(!this.assemblyMeasurementReport.isEmpty()))?this.getAssemblyMeasurementReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assemblyMeasurementReport", theAssemblyMeasurementReport), currentHashCode, theAssemblyMeasurementReport, ((this.assemblyMeasurementReport!= null)&&(!this.assemblyMeasurementReport.isEmpty())));
        }
        {
            List<BuildInfoReport> theBuildInfoReport;
            theBuildInfoReport = (((this.buildInfoReport!= null)&&(!this.buildInfoReport.isEmpty()))?this.getBuildInfoReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buildInfoReport", theBuildInfoReport), currentHashCode, theBuildInfoReport, ((this.buildInfoReport!= null)&&(!this.buildInfoReport.isEmpty())));
        }
        {
            List<ECIDReport> theECIDReport;
            theECIDReport = (((this.ecidReport!= null)&&(!this.ecidReport.isEmpty()))?this.getECIDReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ecidReport", theECIDReport), currentHashCode, theECIDReport, ((this.ecidReport!= null)&&(!this.ecidReport.isEmpty())));
        }
        {
            List<FinalPackageReport> theFinalPackageReport;
            theFinalPackageReport = (((this.finalPackageReport!= null)&&(!this.finalPackageReport.isEmpty()))?this.getFinalPackageReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finalPackageReport", theFinalPackageReport), currentHashCode, theFinalPackageReport, ((this.finalPackageReport!= null)&&(!this.finalPackageReport.isEmpty())));
        }
        {
            BigInteger thePackageDefectCount;
            thePackageDefectCount = this.getPackageDefectCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageDefectCount", thePackageDefectCount), currentHashCode, thePackageDefectCount, (this.packageDefectCount!= null));
        }
        {
            String thePackageDefectID;
            thePackageDefectID = this.getPackageDefectID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageDefectID", thePackageDefectID), currentHashCode, thePackageDefectID, (this.packageDefectID!= null));
        }
        {
            List<String> thePackageID;
            thePackageID = (((this.packageID!= null)&&(!this.packageID.isEmpty()))?this.getPackageID():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageID", thePackageID), currentHashCode, thePackageID, ((this.packageID!= null)&&(!this.packageID.isEmpty())));
        }
        {
            List<String> thePackageText;
            thePackageText = (((this.packageText!= null)&&(!this.packageText.isEmpty()))?this.getPackageText():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageText", thePackageText), currentHashCode, thePackageText, ((this.packageText!= null)&&(!this.packageText.isEmpty())));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryIdentifier", thePrimaryIdentifier), currentHashCode, thePrimaryIdentifier, (this.primaryIdentifier!= null));
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
            List<AssemblyMeasurementReportType> theAssemblyMeasurementReport;
            theAssemblyMeasurementReport = (((this.assemblyMeasurementReport!= null)&&(!this.assemblyMeasurementReport.isEmpty()))?this.getAssemblyMeasurementReport():null);
            strategy.appendField(locator, this, "assemblyMeasurementReport", buffer, theAssemblyMeasurementReport, ((this.assemblyMeasurementReport!= null)&&(!this.assemblyMeasurementReport.isEmpty())));
        }
        {
            List<BuildInfoReport> theBuildInfoReport;
            theBuildInfoReport = (((this.buildInfoReport!= null)&&(!this.buildInfoReport.isEmpty()))?this.getBuildInfoReport():null);
            strategy.appendField(locator, this, "buildInfoReport", buffer, theBuildInfoReport, ((this.buildInfoReport!= null)&&(!this.buildInfoReport.isEmpty())));
        }
        {
            List<ECIDReport> theECIDReport;
            theECIDReport = (((this.ecidReport!= null)&&(!this.ecidReport.isEmpty()))?this.getECIDReport():null);
            strategy.appendField(locator, this, "ecidReport", buffer, theECIDReport, ((this.ecidReport!= null)&&(!this.ecidReport.isEmpty())));
        }
        {
            List<FinalPackageReport> theFinalPackageReport;
            theFinalPackageReport = (((this.finalPackageReport!= null)&&(!this.finalPackageReport.isEmpty()))?this.getFinalPackageReport():null);
            strategy.appendField(locator, this, "finalPackageReport", buffer, theFinalPackageReport, ((this.finalPackageReport!= null)&&(!this.finalPackageReport.isEmpty())));
        }
        {
            BigInteger thePackageDefectCount;
            thePackageDefectCount = this.getPackageDefectCount();
            strategy.appendField(locator, this, "packageDefectCount", buffer, thePackageDefectCount, (this.packageDefectCount!= null));
        }
        {
            String thePackageDefectID;
            thePackageDefectID = this.getPackageDefectID();
            strategy.appendField(locator, this, "packageDefectID", buffer, thePackageDefectID, (this.packageDefectID!= null));
        }
        {
            List<String> thePackageID;
            thePackageID = (((this.packageID!= null)&&(!this.packageID.isEmpty()))?this.getPackageID():null);
            strategy.appendField(locator, this, "packageID", buffer, thePackageID, ((this.packageID!= null)&&(!this.packageID.isEmpty())));
        }
        {
            List<String> thePackageText;
            thePackageText = (((this.packageText!= null)&&(!this.packageText.isEmpty()))?this.getPackageText():null);
            strategy.appendField(locator, this, "packageText", buffer, thePackageText, ((this.packageText!= null)&&(!this.packageText.isEmpty())));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            strategy.appendField(locator, this, "primaryIdentifier", buffer, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
