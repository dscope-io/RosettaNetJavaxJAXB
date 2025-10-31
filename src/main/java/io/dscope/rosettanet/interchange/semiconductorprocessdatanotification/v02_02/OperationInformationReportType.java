
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.ChipPeriodicity;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.Dimension;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.TestMap;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.TestSetup;
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
 * <p>Java class for OperationInformationReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationInformationReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}CarrierReportType" minOccurs="0"/&gt;
 *         &lt;element name="Chip" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}ChipType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}ChipPeriodicity" minOccurs="0"/&gt;
 *         &lt;element name="ConsumableLotNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsumableType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}Dimension" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InlineProcessMeasurementReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}InlineProcessMeasurementReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InlineSetupReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}InlineSetupReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LotTimeStamp" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}LotTimeStampType"/&gt;
 *         &lt;element name="OperationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Orientation" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}OrientationType" minOccurs="0"/&gt;
 *         &lt;element name="ProcessRecipe" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}SoftwareReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}TestMap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}TestSetup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WaferShortID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "OperationInformationReportType", propOrder = {
    "carrierReport",
    "chip",
    "chipPeriodicity",
    "consumableLotNumber",
    "consumableType",
    "dimension",
    "equipmentID",
    "equipmentType",
    "inlineProcessMeasurementReport",
    "inlineSetupReport",
    "lotTimeStamp",
    "operationID",
    "operatorID",
    "orientation",
    "processRecipe",
    "softwareReport",
    "testMap",
    "testSetup",
    "waferShortID"
})
public class OperationInformationReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CarrierReport")
    protected CarrierReportType carrierReport;
    @XmlElement(name = "Chip")
    protected ChipType chip;
    @XmlElementRef(name = "ChipPeriodicity", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = ChipPeriodicity.class, required = false)
    protected ChipPeriodicity chipPeriodicity;
    @XmlElement(name = "ConsumableLotNumber")
    protected String consumableLotNumber;
    @XmlElement(name = "ConsumableType")
    protected String consumableType;
    @XmlElementRef(name = "Dimension", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = Dimension.class, required = false)
    protected Dimension dimension;
    @XmlElement(name = "EquipmentID")
    protected String equipmentID;
    @XmlElement(name = "EquipmentType")
    protected String equipmentType;
    @XmlElement(name = "InlineProcessMeasurementReport")
    protected List<InlineProcessMeasurementReportType> inlineProcessMeasurementReport;
    @XmlElement(name = "InlineSetupReport")
    protected List<InlineSetupReportType> inlineSetupReport;
    @XmlElement(name = "LotTimeStamp", required = true)
    protected LotTimeStampType lotTimeStamp;
    @XmlElement(name = "OperationID")
    protected String operationID;
    @XmlElement(name = "OperatorID")
    protected String operatorID;
    @XmlElement(name = "Orientation")
    protected OrientationType orientation;
    @XmlElement(name = "ProcessRecipe")
    protected List<String> processRecipe;
    @XmlElement(name = "SoftwareReport")
    protected List<SoftwareReportType> softwareReport;
    @XmlElementRef(name = "TestMap", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = TestMap.class, required = false)
    protected List<TestMap> testMap;
    @XmlElementRef(name = "TestSetup", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = TestSetup.class, required = false)
    protected List<TestSetup> testSetup;
    @XmlElement(name = "WaferShortID")
    protected String waferShortID;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the carrierReport property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierReportType }
     *     
     */
    public CarrierReportType getCarrierReport() {
        return carrierReport;
    }

    /**
     * Sets the value of the carrierReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierReportType }
     *     
     */
    public void setCarrierReport(CarrierReportType value) {
        this.carrierReport = value;
    }

    /**
     * Gets the value of the chip property.
     * 
     * @return
     *     possible object is
     *     {@link ChipType }
     *     
     */
    public ChipType getChip() {
        return chip;
    }

    /**
     * Sets the value of the chip property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChipType }
     *     
     */
    public void setChip(ChipType value) {
        this.chip = value;
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
     * Gets the value of the consumableLotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumableLotNumber() {
        return consumableLotNumber;
    }

    /**
     * Sets the value of the consumableLotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumableLotNumber(String value) {
        this.consumableLotNumber = value;
    }

    /**
     * Gets the value of the consumableType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumableType() {
        return consumableType;
    }

    /**
     * Sets the value of the consumableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumableType(String value) {
        this.consumableType = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link Dimension }
     *     
     */
    public Dimension getDimension() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimension }
     *     
     */
    public void setDimension(Dimension value) {
        this.dimension = value;
    }

    /**
     * Gets the value of the equipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentID() {
        return equipmentID;
    }

    /**
     * Sets the value of the equipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentID(String value) {
        this.equipmentID = value;
    }

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentType(String value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the inlineProcessMeasurementReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inlineProcessMeasurementReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInlineProcessMeasurementReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InlineProcessMeasurementReportType }
     * 
     * 
     */
    public List<InlineProcessMeasurementReportType> getInlineProcessMeasurementReport() {
        if (inlineProcessMeasurementReport == null) {
            inlineProcessMeasurementReport = new ArrayList<InlineProcessMeasurementReportType>();
        }
        return this.inlineProcessMeasurementReport;
    }

    /**
     * Gets the value of the inlineSetupReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inlineSetupReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInlineSetupReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InlineSetupReportType }
     * 
     * 
     */
    public List<InlineSetupReportType> getInlineSetupReport() {
        if (inlineSetupReport == null) {
            inlineSetupReport = new ArrayList<InlineSetupReportType>();
        }
        return this.inlineSetupReport;
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
     * Gets the value of the operationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationID() {
        return operationID;
    }

    /**
     * Sets the value of the operationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationID(String value) {
        this.operationID = value;
    }

    /**
     * Gets the value of the operatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorID() {
        return operatorID;
    }

    /**
     * Sets the value of the operatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorID(String value) {
        this.operatorID = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link OrientationType }
     *     
     */
    public OrientationType getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrientationType }
     *     
     */
    public void setOrientation(OrientationType value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the processRecipe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processRecipe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessRecipe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProcessRecipe() {
        if (processRecipe == null) {
            processRecipe = new ArrayList<String>();
        }
        return this.processRecipe;
    }

    /**
     * Gets the value of the softwareReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareReportType }
     * 
     * 
     */
    public List<SoftwareReportType> getSoftwareReport() {
        if (softwareReport == null) {
            softwareReport = new ArrayList<SoftwareReportType>();
        }
        return this.softwareReport;
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
     * Gets the value of the testSetup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSetup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSetup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSetup }
     * 
     * 
     */
    public List<TestSetup> getTestSetup() {
        if (testSetup == null) {
            testSetup = new ArrayList<TestSetup>();
        }
        return this.testSetup;
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
        final OperationInformationReportType that = ((OperationInformationReportType) object);
        {
            CarrierReportType lhsCarrierReport;
            lhsCarrierReport = this.getCarrierReport();
            CarrierReportType rhsCarrierReport;
            rhsCarrierReport = that.getCarrierReport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carrierReport", lhsCarrierReport), LocatorUtils.property(thatLocator, "carrierReport", rhsCarrierReport), lhsCarrierReport, rhsCarrierReport, (this.carrierReport!= null), (that.carrierReport!= null))) {
                return false;
            }
        }
        {
            ChipType lhsChip;
            lhsChip = this.getChip();
            ChipType rhsChip;
            rhsChip = that.getChip();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chip", lhsChip), LocatorUtils.property(thatLocator, "chip", rhsChip), lhsChip, rhsChip, (this.chip!= null), (that.chip!= null))) {
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
            String lhsConsumableLotNumber;
            lhsConsumableLotNumber = this.getConsumableLotNumber();
            String rhsConsumableLotNumber;
            rhsConsumableLotNumber = that.getConsumableLotNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumableLotNumber", lhsConsumableLotNumber), LocatorUtils.property(thatLocator, "consumableLotNumber", rhsConsumableLotNumber), lhsConsumableLotNumber, rhsConsumableLotNumber, (this.consumableLotNumber!= null), (that.consumableLotNumber!= null))) {
                return false;
            }
        }
        {
            String lhsConsumableType;
            lhsConsumableType = this.getConsumableType();
            String rhsConsumableType;
            rhsConsumableType = that.getConsumableType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumableType", lhsConsumableType), LocatorUtils.property(thatLocator, "consumableType", rhsConsumableType), lhsConsumableType, rhsConsumableType, (this.consumableType!= null), (that.consumableType!= null))) {
                return false;
            }
        }
        {
            Dimension lhsDimension;
            lhsDimension = this.getDimension();
            Dimension rhsDimension;
            rhsDimension = that.getDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dimension", lhsDimension), LocatorUtils.property(thatLocator, "dimension", rhsDimension), lhsDimension, rhsDimension, (this.dimension!= null), (that.dimension!= null))) {
                return false;
            }
        }
        {
            String lhsEquipmentID;
            lhsEquipmentID = this.getEquipmentID();
            String rhsEquipmentID;
            rhsEquipmentID = that.getEquipmentID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "equipmentID", lhsEquipmentID), LocatorUtils.property(thatLocator, "equipmentID", rhsEquipmentID), lhsEquipmentID, rhsEquipmentID, (this.equipmentID!= null), (that.equipmentID!= null))) {
                return false;
            }
        }
        {
            String lhsEquipmentType;
            lhsEquipmentType = this.getEquipmentType();
            String rhsEquipmentType;
            rhsEquipmentType = that.getEquipmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "equipmentType", lhsEquipmentType), LocatorUtils.property(thatLocator, "equipmentType", rhsEquipmentType), lhsEquipmentType, rhsEquipmentType, (this.equipmentType!= null), (that.equipmentType!= null))) {
                return false;
            }
        }
        {
            List<InlineProcessMeasurementReportType> lhsInlineProcessMeasurementReport;
            lhsInlineProcessMeasurementReport = (((this.inlineProcessMeasurementReport!= null)&&(!this.inlineProcessMeasurementReport.isEmpty()))?this.getInlineProcessMeasurementReport():null);
            List<InlineProcessMeasurementReportType> rhsInlineProcessMeasurementReport;
            rhsInlineProcessMeasurementReport = (((that.inlineProcessMeasurementReport!= null)&&(!that.inlineProcessMeasurementReport.isEmpty()))?that.getInlineProcessMeasurementReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inlineProcessMeasurementReport", lhsInlineProcessMeasurementReport), LocatorUtils.property(thatLocator, "inlineProcessMeasurementReport", rhsInlineProcessMeasurementReport), lhsInlineProcessMeasurementReport, rhsInlineProcessMeasurementReport, ((this.inlineProcessMeasurementReport!= null)&&(!this.inlineProcessMeasurementReport.isEmpty())), ((that.inlineProcessMeasurementReport!= null)&&(!that.inlineProcessMeasurementReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<InlineSetupReportType> lhsInlineSetupReport;
            lhsInlineSetupReport = (((this.inlineSetupReport!= null)&&(!this.inlineSetupReport.isEmpty()))?this.getInlineSetupReport():null);
            List<InlineSetupReportType> rhsInlineSetupReport;
            rhsInlineSetupReport = (((that.inlineSetupReport!= null)&&(!that.inlineSetupReport.isEmpty()))?that.getInlineSetupReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inlineSetupReport", lhsInlineSetupReport), LocatorUtils.property(thatLocator, "inlineSetupReport", rhsInlineSetupReport), lhsInlineSetupReport, rhsInlineSetupReport, ((this.inlineSetupReport!= null)&&(!this.inlineSetupReport.isEmpty())), ((that.inlineSetupReport!= null)&&(!that.inlineSetupReport.isEmpty())))) {
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
            String lhsOperationID;
            lhsOperationID = this.getOperationID();
            String rhsOperationID;
            rhsOperationID = that.getOperationID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operationID", lhsOperationID), LocatorUtils.property(thatLocator, "operationID", rhsOperationID), lhsOperationID, rhsOperationID, (this.operationID!= null), (that.operationID!= null))) {
                return false;
            }
        }
        {
            String lhsOperatorID;
            lhsOperatorID = this.getOperatorID();
            String rhsOperatorID;
            rhsOperatorID = that.getOperatorID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operatorID", lhsOperatorID), LocatorUtils.property(thatLocator, "operatorID", rhsOperatorID), lhsOperatorID, rhsOperatorID, (this.operatorID!= null), (that.operatorID!= null))) {
                return false;
            }
        }
        {
            OrientationType lhsOrientation;
            lhsOrientation = this.getOrientation();
            OrientationType rhsOrientation;
            rhsOrientation = that.getOrientation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orientation", lhsOrientation), LocatorUtils.property(thatLocator, "orientation", rhsOrientation), lhsOrientation, rhsOrientation, (this.orientation!= null), (that.orientation!= null))) {
                return false;
            }
        }
        {
            List<String> lhsProcessRecipe;
            lhsProcessRecipe = (((this.processRecipe!= null)&&(!this.processRecipe.isEmpty()))?this.getProcessRecipe():null);
            List<String> rhsProcessRecipe;
            rhsProcessRecipe = (((that.processRecipe!= null)&&(!that.processRecipe.isEmpty()))?that.getProcessRecipe():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processRecipe", lhsProcessRecipe), LocatorUtils.property(thatLocator, "processRecipe", rhsProcessRecipe), lhsProcessRecipe, rhsProcessRecipe, ((this.processRecipe!= null)&&(!this.processRecipe.isEmpty())), ((that.processRecipe!= null)&&(!that.processRecipe.isEmpty())))) {
                return false;
            }
        }
        {
            List<SoftwareReportType> lhsSoftwareReport;
            lhsSoftwareReport = (((this.softwareReport!= null)&&(!this.softwareReport.isEmpty()))?this.getSoftwareReport():null);
            List<SoftwareReportType> rhsSoftwareReport;
            rhsSoftwareReport = (((that.softwareReport!= null)&&(!that.softwareReport.isEmpty()))?that.getSoftwareReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "softwareReport", lhsSoftwareReport), LocatorUtils.property(thatLocator, "softwareReport", rhsSoftwareReport), lhsSoftwareReport, rhsSoftwareReport, ((this.softwareReport!= null)&&(!this.softwareReport.isEmpty())), ((that.softwareReport!= null)&&(!that.softwareReport.isEmpty())))) {
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
            List<TestSetup> lhsTestSetup;
            lhsTestSetup = (((this.testSetup!= null)&&(!this.testSetup.isEmpty()))?this.getTestSetup():null);
            List<TestSetup> rhsTestSetup;
            rhsTestSetup = (((that.testSetup!= null)&&(!that.testSetup.isEmpty()))?that.getTestSetup():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testSetup", lhsTestSetup), LocatorUtils.property(thatLocator, "testSetup", rhsTestSetup), lhsTestSetup, rhsTestSetup, ((this.testSetup!= null)&&(!this.testSetup.isEmpty())), ((that.testSetup!= null)&&(!that.testSetup.isEmpty())))) {
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
            CarrierReportType theCarrierReport;
            theCarrierReport = this.getCarrierReport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierReport", theCarrierReport), currentHashCode, theCarrierReport, (this.carrierReport!= null));
        }
        {
            ChipType theChip;
            theChip = this.getChip();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chip", theChip), currentHashCode, theChip, (this.chip!= null));
        }
        {
            ChipPeriodicity theChipPeriodicity;
            theChipPeriodicity = this.getChipPeriodicity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chipPeriodicity", theChipPeriodicity), currentHashCode, theChipPeriodicity, (this.chipPeriodicity!= null));
        }
        {
            String theConsumableLotNumber;
            theConsumableLotNumber = this.getConsumableLotNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumableLotNumber", theConsumableLotNumber), currentHashCode, theConsumableLotNumber, (this.consumableLotNumber!= null));
        }
        {
            String theConsumableType;
            theConsumableType = this.getConsumableType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumableType", theConsumableType), currentHashCode, theConsumableType, (this.consumableType!= null));
        }
        {
            Dimension theDimension;
            theDimension = this.getDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dimension", theDimension), currentHashCode, theDimension, (this.dimension!= null));
        }
        {
            String theEquipmentID;
            theEquipmentID = this.getEquipmentID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "equipmentID", theEquipmentID), currentHashCode, theEquipmentID, (this.equipmentID!= null));
        }
        {
            String theEquipmentType;
            theEquipmentType = this.getEquipmentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "equipmentType", theEquipmentType), currentHashCode, theEquipmentType, (this.equipmentType!= null));
        }
        {
            List<InlineProcessMeasurementReportType> theInlineProcessMeasurementReport;
            theInlineProcessMeasurementReport = (((this.inlineProcessMeasurementReport!= null)&&(!this.inlineProcessMeasurementReport.isEmpty()))?this.getInlineProcessMeasurementReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inlineProcessMeasurementReport", theInlineProcessMeasurementReport), currentHashCode, theInlineProcessMeasurementReport, ((this.inlineProcessMeasurementReport!= null)&&(!this.inlineProcessMeasurementReport.isEmpty())));
        }
        {
            List<InlineSetupReportType> theInlineSetupReport;
            theInlineSetupReport = (((this.inlineSetupReport!= null)&&(!this.inlineSetupReport.isEmpty()))?this.getInlineSetupReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inlineSetupReport", theInlineSetupReport), currentHashCode, theInlineSetupReport, ((this.inlineSetupReport!= null)&&(!this.inlineSetupReport.isEmpty())));
        }
        {
            LotTimeStampType theLotTimeStamp;
            theLotTimeStamp = this.getLotTimeStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotTimeStamp", theLotTimeStamp), currentHashCode, theLotTimeStamp, (this.lotTimeStamp!= null));
        }
        {
            String theOperationID;
            theOperationID = this.getOperationID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operationID", theOperationID), currentHashCode, theOperationID, (this.operationID!= null));
        }
        {
            String theOperatorID;
            theOperatorID = this.getOperatorID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operatorID", theOperatorID), currentHashCode, theOperatorID, (this.operatorID!= null));
        }
        {
            OrientationType theOrientation;
            theOrientation = this.getOrientation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orientation", theOrientation), currentHashCode, theOrientation, (this.orientation!= null));
        }
        {
            List<String> theProcessRecipe;
            theProcessRecipe = (((this.processRecipe!= null)&&(!this.processRecipe.isEmpty()))?this.getProcessRecipe():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processRecipe", theProcessRecipe), currentHashCode, theProcessRecipe, ((this.processRecipe!= null)&&(!this.processRecipe.isEmpty())));
        }
        {
            List<SoftwareReportType> theSoftwareReport;
            theSoftwareReport = (((this.softwareReport!= null)&&(!this.softwareReport.isEmpty()))?this.getSoftwareReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "softwareReport", theSoftwareReport), currentHashCode, theSoftwareReport, ((this.softwareReport!= null)&&(!this.softwareReport.isEmpty())));
        }
        {
            List<TestMap> theTestMap;
            theTestMap = (((this.testMap!= null)&&(!this.testMap.isEmpty()))?this.getTestMap():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testMap", theTestMap), currentHashCode, theTestMap, ((this.testMap!= null)&&(!this.testMap.isEmpty())));
        }
        {
            List<TestSetup> theTestSetup;
            theTestSetup = (((this.testSetup!= null)&&(!this.testSetup.isEmpty()))?this.getTestSetup():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testSetup", theTestSetup), currentHashCode, theTestSetup, ((this.testSetup!= null)&&(!this.testSetup.isEmpty())));
        }
        {
            String theWaferShortID;
            theWaferShortID = this.getWaferShortID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferShortID", theWaferShortID), currentHashCode, theWaferShortID, (this.waferShortID!= null));
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
            CarrierReportType theCarrierReport;
            theCarrierReport = this.getCarrierReport();
            strategy.appendField(locator, this, "carrierReport", buffer, theCarrierReport, (this.carrierReport!= null));
        }
        {
            ChipType theChip;
            theChip = this.getChip();
            strategy.appendField(locator, this, "chip", buffer, theChip, (this.chip!= null));
        }
        {
            ChipPeriodicity theChipPeriodicity;
            theChipPeriodicity = this.getChipPeriodicity();
            strategy.appendField(locator, this, "chipPeriodicity", buffer, theChipPeriodicity, (this.chipPeriodicity!= null));
        }
        {
            String theConsumableLotNumber;
            theConsumableLotNumber = this.getConsumableLotNumber();
            strategy.appendField(locator, this, "consumableLotNumber", buffer, theConsumableLotNumber, (this.consumableLotNumber!= null));
        }
        {
            String theConsumableType;
            theConsumableType = this.getConsumableType();
            strategy.appendField(locator, this, "consumableType", buffer, theConsumableType, (this.consumableType!= null));
        }
        {
            Dimension theDimension;
            theDimension = this.getDimension();
            strategy.appendField(locator, this, "dimension", buffer, theDimension, (this.dimension!= null));
        }
        {
            String theEquipmentID;
            theEquipmentID = this.getEquipmentID();
            strategy.appendField(locator, this, "equipmentID", buffer, theEquipmentID, (this.equipmentID!= null));
        }
        {
            String theEquipmentType;
            theEquipmentType = this.getEquipmentType();
            strategy.appendField(locator, this, "equipmentType", buffer, theEquipmentType, (this.equipmentType!= null));
        }
        {
            List<InlineProcessMeasurementReportType> theInlineProcessMeasurementReport;
            theInlineProcessMeasurementReport = (((this.inlineProcessMeasurementReport!= null)&&(!this.inlineProcessMeasurementReport.isEmpty()))?this.getInlineProcessMeasurementReport():null);
            strategy.appendField(locator, this, "inlineProcessMeasurementReport", buffer, theInlineProcessMeasurementReport, ((this.inlineProcessMeasurementReport!= null)&&(!this.inlineProcessMeasurementReport.isEmpty())));
        }
        {
            List<InlineSetupReportType> theInlineSetupReport;
            theInlineSetupReport = (((this.inlineSetupReport!= null)&&(!this.inlineSetupReport.isEmpty()))?this.getInlineSetupReport():null);
            strategy.appendField(locator, this, "inlineSetupReport", buffer, theInlineSetupReport, ((this.inlineSetupReport!= null)&&(!this.inlineSetupReport.isEmpty())));
        }
        {
            LotTimeStampType theLotTimeStamp;
            theLotTimeStamp = this.getLotTimeStamp();
            strategy.appendField(locator, this, "lotTimeStamp", buffer, theLotTimeStamp, (this.lotTimeStamp!= null));
        }
        {
            String theOperationID;
            theOperationID = this.getOperationID();
            strategy.appendField(locator, this, "operationID", buffer, theOperationID, (this.operationID!= null));
        }
        {
            String theOperatorID;
            theOperatorID = this.getOperatorID();
            strategy.appendField(locator, this, "operatorID", buffer, theOperatorID, (this.operatorID!= null));
        }
        {
            OrientationType theOrientation;
            theOrientation = this.getOrientation();
            strategy.appendField(locator, this, "orientation", buffer, theOrientation, (this.orientation!= null));
        }
        {
            List<String> theProcessRecipe;
            theProcessRecipe = (((this.processRecipe!= null)&&(!this.processRecipe.isEmpty()))?this.getProcessRecipe():null);
            strategy.appendField(locator, this, "processRecipe", buffer, theProcessRecipe, ((this.processRecipe!= null)&&(!this.processRecipe.isEmpty())));
        }
        {
            List<SoftwareReportType> theSoftwareReport;
            theSoftwareReport = (((this.softwareReport!= null)&&(!this.softwareReport.isEmpty()))?this.getSoftwareReport():null);
            strategy.appendField(locator, this, "softwareReport", buffer, theSoftwareReport, ((this.softwareReport!= null)&&(!this.softwareReport.isEmpty())));
        }
        {
            List<TestMap> theTestMap;
            theTestMap = (((this.testMap!= null)&&(!this.testMap.isEmpty()))?this.getTestMap():null);
            strategy.appendField(locator, this, "testMap", buffer, theTestMap, ((this.testMap!= null)&&(!this.testMap.isEmpty())));
        }
        {
            List<TestSetup> theTestSetup;
            theTestSetup = (((this.testSetup!= null)&&(!this.testSetup.isEmpty()))?this.getTestSetup():null);
            strategy.appendField(locator, this, "testSetup", buffer, theTestSetup, ((this.testSetup!= null)&&(!this.testSetup.isEmpty())));
        }
        {
            String theWaferShortID;
            theWaferShortID = this.getWaferShortID();
            strategy.appendField(locator, this, "waferShortID", buffer, theWaferShortID, (this.waferShortID!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
