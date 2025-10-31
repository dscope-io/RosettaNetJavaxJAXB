
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
import io.dscope.rosettanet.domain.manufacturing.codelist.confidentiality.v01_03.Confidentiality;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.FacilityLocationType;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.Lot;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.Wafer;
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
 *         &lt;element name="BALocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}FacilityLocationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:Confidentiality:xsd:codelist:01.03}Confidentiality" minOccurs="0"/&gt;
 *         &lt;element name="FabLocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}FacilityLocationType" minOccurs="0"/&gt;
 *         &lt;element name="FileDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GlobalLotStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}Lot"/&gt;
 *         &lt;element name="LotTimeStamp" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}LotTimeStampType" minOccurs="0"/&gt;
 *         &lt;element name="OtherLocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}FacilityLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QualityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}Wafer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WaferQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="WaferSortLocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}FacilityLocationType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AssemblyProcess" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}AssemblyProcessType" maxOccurs="unbounded"/&gt;
 *           &lt;element name="InlineProcess" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}InlineProcessType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "LotReportType", propOrder = {
    "baLocation",
    "confidentiality",
    "fabLocation",
    "fileDataVersion",
    "globalLotStatusCode",
    "lot",
    "lotTimeStamp",
    "otherLocation",
    "qualityCode",
    "wafer",
    "waferQuantity",
    "waferSortLocation",
    "assemblyProcess",
    "inlineProcess"
})
public class LotReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BALocation")
    protected FacilityLocationType baLocation;
    @XmlElementRef(name = "Confidentiality", namespace = "urn:rosettanet:specification:domain:Manufacturing:Confidentiality:xsd:codelist:01.03", type = Confidentiality.class, required = false)
    protected Confidentiality confidentiality;
    @XmlElement(name = "FabLocation")
    protected FacilityLocationType fabLocation;
    @XmlElement(name = "FileDataVersion")
    protected String fileDataVersion;
    @XmlElement(name = "GlobalLotStatusCode")
    protected String globalLotStatusCode;
    @XmlElementRef(name = "Lot", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = Lot.class)
    protected Lot lot;
    @XmlElement(name = "LotTimeStamp")
    protected LotTimeStampType lotTimeStamp;
    @XmlElement(name = "OtherLocation")
    protected List<FacilityLocationType> otherLocation;
    @XmlElement(name = "QualityCode")
    protected String qualityCode;
    @XmlElementRef(name = "Wafer", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = Wafer.class, required = false)
    protected List<Wafer> wafer;
    @XmlElement(name = "WaferQuantity")
    protected BigInteger waferQuantity;
    @XmlElement(name = "WaferSortLocation")
    protected FacilityLocationType waferSortLocation;
    @XmlElement(name = "AssemblyProcess")
    protected List<AssemblyProcessType> assemblyProcess;
    @XmlElement(name = "InlineProcess")
    protected List<InlineProcessType> inlineProcess;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the baLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLocationType }
     *     
     */
    public FacilityLocationType getBALocation() {
        return baLocation;
    }

    /**
     * Sets the value of the baLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocationType }
     *     
     */
    public void setBALocation(FacilityLocationType value) {
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
     *     {@link FacilityLocationType }
     *     
     */
    public FacilityLocationType getFabLocation() {
        return fabLocation;
    }

    /**
     * Sets the value of the fabLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocationType }
     *     
     */
    public void setFabLocation(FacilityLocationType value) {
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
     * {@link FacilityLocationType }
     * 
     * 
     */
    public List<FacilityLocationType> getOtherLocation() {
        if (otherLocation == null) {
            otherLocation = new ArrayList<FacilityLocationType>();
        }
        return this.otherLocation;
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
     * Gets the value of the wafer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wafer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWafer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Wafer }
     * 
     * 
     */
    public List<Wafer> getWafer() {
        if (wafer == null) {
            wafer = new ArrayList<Wafer>();
        }
        return this.wafer;
    }

    /**
     * Gets the value of the waferQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaferQuantity() {
        return waferQuantity;
    }

    /**
     * Sets the value of the waferQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaferQuantity(BigInteger value) {
        this.waferQuantity = value;
    }

    /**
     * Gets the value of the waferSortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLocationType }
     *     
     */
    public FacilityLocationType getWaferSortLocation() {
        return waferSortLocation;
    }

    /**
     * Sets the value of the waferSortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocationType }
     *     
     */
    public void setWaferSortLocation(FacilityLocationType value) {
        this.waferSortLocation = value;
    }

    /**
     * Gets the value of the assemblyProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssemblyProcessType }
     * 
     * 
     */
    public List<AssemblyProcessType> getAssemblyProcess() {
        if (assemblyProcess == null) {
            assemblyProcess = new ArrayList<AssemblyProcessType>();
        }
        return this.assemblyProcess;
    }

    /**
     * Gets the value of the inlineProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inlineProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInlineProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InlineProcessType }
     * 
     * 
     */
    public List<InlineProcessType> getInlineProcess() {
        if (inlineProcess == null) {
            inlineProcess = new ArrayList<InlineProcessType>();
        }
        return this.inlineProcess;
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
            FacilityLocationType lhsBALocation;
            lhsBALocation = this.getBALocation();
            FacilityLocationType rhsBALocation;
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
            FacilityLocationType lhsFabLocation;
            lhsFabLocation = this.getFabLocation();
            FacilityLocationType rhsFabLocation;
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
            LotTimeStampType lhsLotTimeStamp;
            lhsLotTimeStamp = this.getLotTimeStamp();
            LotTimeStampType rhsLotTimeStamp;
            rhsLotTimeStamp = that.getLotTimeStamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotTimeStamp", lhsLotTimeStamp), LocatorUtils.property(thatLocator, "lotTimeStamp", rhsLotTimeStamp), lhsLotTimeStamp, rhsLotTimeStamp, (this.lotTimeStamp!= null), (that.lotTimeStamp!= null))) {
                return false;
            }
        }
        {
            List<FacilityLocationType> lhsOtherLocation;
            lhsOtherLocation = (((this.otherLocation!= null)&&(!this.otherLocation.isEmpty()))?this.getOtherLocation():null);
            List<FacilityLocationType> rhsOtherLocation;
            rhsOtherLocation = (((that.otherLocation!= null)&&(!that.otherLocation.isEmpty()))?that.getOtherLocation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherLocation", lhsOtherLocation), LocatorUtils.property(thatLocator, "otherLocation", rhsOtherLocation), lhsOtherLocation, rhsOtherLocation, ((this.otherLocation!= null)&&(!this.otherLocation.isEmpty())), ((that.otherLocation!= null)&&(!that.otherLocation.isEmpty())))) {
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
            List<Wafer> lhsWafer;
            lhsWafer = (((this.wafer!= null)&&(!this.wafer.isEmpty()))?this.getWafer():null);
            List<Wafer> rhsWafer;
            rhsWafer = (((that.wafer!= null)&&(!that.wafer.isEmpty()))?that.getWafer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wafer", lhsWafer), LocatorUtils.property(thatLocator, "wafer", rhsWafer), lhsWafer, rhsWafer, ((this.wafer!= null)&&(!this.wafer.isEmpty())), ((that.wafer!= null)&&(!that.wafer.isEmpty())))) {
                return false;
            }
        }
        {
            BigInteger lhsWaferQuantity;
            lhsWaferQuantity = this.getWaferQuantity();
            BigInteger rhsWaferQuantity;
            rhsWaferQuantity = that.getWaferQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferQuantity", lhsWaferQuantity), LocatorUtils.property(thatLocator, "waferQuantity", rhsWaferQuantity), lhsWaferQuantity, rhsWaferQuantity, (this.waferQuantity!= null), (that.waferQuantity!= null))) {
                return false;
            }
        }
        {
            FacilityLocationType lhsWaferSortLocation;
            lhsWaferSortLocation = this.getWaferSortLocation();
            FacilityLocationType rhsWaferSortLocation;
            rhsWaferSortLocation = that.getWaferSortLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferSortLocation", lhsWaferSortLocation), LocatorUtils.property(thatLocator, "waferSortLocation", rhsWaferSortLocation), lhsWaferSortLocation, rhsWaferSortLocation, (this.waferSortLocation!= null), (that.waferSortLocation!= null))) {
                return false;
            }
        }
        {
            List<AssemblyProcessType> lhsAssemblyProcess;
            lhsAssemblyProcess = (((this.assemblyProcess!= null)&&(!this.assemblyProcess.isEmpty()))?this.getAssemblyProcess():null);
            List<AssemblyProcessType> rhsAssemblyProcess;
            rhsAssemblyProcess = (((that.assemblyProcess!= null)&&(!that.assemblyProcess.isEmpty()))?that.getAssemblyProcess():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assemblyProcess", lhsAssemblyProcess), LocatorUtils.property(thatLocator, "assemblyProcess", rhsAssemblyProcess), lhsAssemblyProcess, rhsAssemblyProcess, ((this.assemblyProcess!= null)&&(!this.assemblyProcess.isEmpty())), ((that.assemblyProcess!= null)&&(!that.assemblyProcess.isEmpty())))) {
                return false;
            }
        }
        {
            List<InlineProcessType> lhsInlineProcess;
            lhsInlineProcess = (((this.inlineProcess!= null)&&(!this.inlineProcess.isEmpty()))?this.getInlineProcess():null);
            List<InlineProcessType> rhsInlineProcess;
            rhsInlineProcess = (((that.inlineProcess!= null)&&(!that.inlineProcess.isEmpty()))?that.getInlineProcess():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inlineProcess", lhsInlineProcess), LocatorUtils.property(thatLocator, "inlineProcess", rhsInlineProcess), lhsInlineProcess, rhsInlineProcess, ((this.inlineProcess!= null)&&(!this.inlineProcess.isEmpty())), ((that.inlineProcess!= null)&&(!that.inlineProcess.isEmpty())))) {
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
            FacilityLocationType theBALocation;
            theBALocation = this.getBALocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baLocation", theBALocation), currentHashCode, theBALocation, (this.baLocation!= null));
        }
        {
            Confidentiality theConfidentiality;
            theConfidentiality = this.getConfidentiality();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confidentiality", theConfidentiality), currentHashCode, theConfidentiality, (this.confidentiality!= null));
        }
        {
            FacilityLocationType theFabLocation;
            theFabLocation = this.getFabLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fabLocation", theFabLocation), currentHashCode, theFabLocation, (this.fabLocation!= null));
        }
        {
            String theFileDataVersion;
            theFileDataVersion = this.getFileDataVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileDataVersion", theFileDataVersion), currentHashCode, theFileDataVersion, (this.fileDataVersion!= null));
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
            LotTimeStampType theLotTimeStamp;
            theLotTimeStamp = this.getLotTimeStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotTimeStamp", theLotTimeStamp), currentHashCode, theLotTimeStamp, (this.lotTimeStamp!= null));
        }
        {
            List<FacilityLocationType> theOtherLocation;
            theOtherLocation = (((this.otherLocation!= null)&&(!this.otherLocation.isEmpty()))?this.getOtherLocation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherLocation", theOtherLocation), currentHashCode, theOtherLocation, ((this.otherLocation!= null)&&(!this.otherLocation.isEmpty())));
        }
        {
            String theQualityCode;
            theQualityCode = this.getQualityCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualityCode", theQualityCode), currentHashCode, theQualityCode, (this.qualityCode!= null));
        }
        {
            List<Wafer> theWafer;
            theWafer = (((this.wafer!= null)&&(!this.wafer.isEmpty()))?this.getWafer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wafer", theWafer), currentHashCode, theWafer, ((this.wafer!= null)&&(!this.wafer.isEmpty())));
        }
        {
            BigInteger theWaferQuantity;
            theWaferQuantity = this.getWaferQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferQuantity", theWaferQuantity), currentHashCode, theWaferQuantity, (this.waferQuantity!= null));
        }
        {
            FacilityLocationType theWaferSortLocation;
            theWaferSortLocation = this.getWaferSortLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferSortLocation", theWaferSortLocation), currentHashCode, theWaferSortLocation, (this.waferSortLocation!= null));
        }
        {
            List<AssemblyProcessType> theAssemblyProcess;
            theAssemblyProcess = (((this.assemblyProcess!= null)&&(!this.assemblyProcess.isEmpty()))?this.getAssemblyProcess():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assemblyProcess", theAssemblyProcess), currentHashCode, theAssemblyProcess, ((this.assemblyProcess!= null)&&(!this.assemblyProcess.isEmpty())));
        }
        {
            List<InlineProcessType> theInlineProcess;
            theInlineProcess = (((this.inlineProcess!= null)&&(!this.inlineProcess.isEmpty()))?this.getInlineProcess():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inlineProcess", theInlineProcess), currentHashCode, theInlineProcess, ((this.inlineProcess!= null)&&(!this.inlineProcess.isEmpty())));
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
            FacilityLocationType theBALocation;
            theBALocation = this.getBALocation();
            strategy.appendField(locator, this, "baLocation", buffer, theBALocation, (this.baLocation!= null));
        }
        {
            Confidentiality theConfidentiality;
            theConfidentiality = this.getConfidentiality();
            strategy.appendField(locator, this, "confidentiality", buffer, theConfidentiality, (this.confidentiality!= null));
        }
        {
            FacilityLocationType theFabLocation;
            theFabLocation = this.getFabLocation();
            strategy.appendField(locator, this, "fabLocation", buffer, theFabLocation, (this.fabLocation!= null));
        }
        {
            String theFileDataVersion;
            theFileDataVersion = this.getFileDataVersion();
            strategy.appendField(locator, this, "fileDataVersion", buffer, theFileDataVersion, (this.fileDataVersion!= null));
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
            LotTimeStampType theLotTimeStamp;
            theLotTimeStamp = this.getLotTimeStamp();
            strategy.appendField(locator, this, "lotTimeStamp", buffer, theLotTimeStamp, (this.lotTimeStamp!= null));
        }
        {
            List<FacilityLocationType> theOtherLocation;
            theOtherLocation = (((this.otherLocation!= null)&&(!this.otherLocation.isEmpty()))?this.getOtherLocation():null);
            strategy.appendField(locator, this, "otherLocation", buffer, theOtherLocation, ((this.otherLocation!= null)&&(!this.otherLocation.isEmpty())));
        }
        {
            String theQualityCode;
            theQualityCode = this.getQualityCode();
            strategy.appendField(locator, this, "qualityCode", buffer, theQualityCode, (this.qualityCode!= null));
        }
        {
            List<Wafer> theWafer;
            theWafer = (((this.wafer!= null)&&(!this.wafer.isEmpty()))?this.getWafer():null);
            strategy.appendField(locator, this, "wafer", buffer, theWafer, ((this.wafer!= null)&&(!this.wafer.isEmpty())));
        }
        {
            BigInteger theWaferQuantity;
            theWaferQuantity = this.getWaferQuantity();
            strategy.appendField(locator, this, "waferQuantity", buffer, theWaferQuantity, (this.waferQuantity!= null));
        }
        {
            FacilityLocationType theWaferSortLocation;
            theWaferSortLocation = this.getWaferSortLocation();
            strategy.appendField(locator, this, "waferSortLocation", buffer, theWaferSortLocation, (this.waferSortLocation!= null));
        }
        {
            List<AssemblyProcessType> theAssemblyProcess;
            theAssemblyProcess = (((this.assemblyProcess!= null)&&(!this.assemblyProcess.isEmpty()))?this.getAssemblyProcess():null);
            strategy.appendField(locator, this, "assemblyProcess", buffer, theAssemblyProcess, ((this.assemblyProcess!= null)&&(!this.assemblyProcess.isEmpty())));
        }
        {
            List<InlineProcessType> theInlineProcess;
            theInlineProcess = (((this.inlineProcess!= null)&&(!this.inlineProcess.isEmpty()))?this.getInlineProcess():null);
            strategy.appendField(locator, this, "inlineProcess", buffer, theInlineProcess, ((this.inlineProcess!= null)&&(!this.inlineProcess.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
