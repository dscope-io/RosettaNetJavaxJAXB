
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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.FacilityLocationType;
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
 * <p>Java class for IncomingWaferLotReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncomingWaferLotReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}CarrierReportType" minOccurs="0"/&gt;
 *         &lt;element name="Chip" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}ChipType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FabLocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}FacilityLocationType" minOccurs="0"/&gt;
 *         &lt;element name="OtherLocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}FacilityLocationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}QuantityDetail" minOccurs="0"/&gt;
 *         &lt;element name="WaferLotID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaferSortLocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}FacilityLocationType" minOccurs="0"/&gt;
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
@XmlType(name = "IncomingWaferLotReportType", propOrder = {
    "carrierReport",
    "chip",
    "fabLocation",
    "otherLocation",
    "quantityDetail",
    "waferLotID",
    "waferSortLocation"
})
public class IncomingWaferLotReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CarrierReport")
    protected CarrierReportType carrierReport;
    @XmlElement(name = "Chip")
    protected List<ChipType> chip;
    @XmlElement(name = "FabLocation")
    protected FacilityLocationType fabLocation;
    @XmlElement(name = "OtherLocation")
    protected FacilityLocationType otherLocation;
    @XmlElementRef(name = "QuantityDetail", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = QuantityDetail.class, required = false)
    protected QuantityDetail quantityDetail;
    @XmlElement(name = "WaferLotID")
    protected String waferLotID;
    @XmlElement(name = "WaferSortLocation")
    protected FacilityLocationType waferSortLocation;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChipType }
     * 
     * 
     */
    public List<ChipType> getChip() {
        if (chip == null) {
            chip = new ArrayList<ChipType>();
        }
        return this.chip;
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
     * Gets the value of the otherLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLocationType }
     *     
     */
    public FacilityLocationType getOtherLocation() {
        return otherLocation;
    }

    /**
     * Sets the value of the otherLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocationType }
     *     
     */
    public void setOtherLocation(FacilityLocationType value) {
        this.otherLocation = value;
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
     * Gets the value of the waferLotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaferLotID() {
        return waferLotID;
    }

    /**
     * Sets the value of the waferLotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaferLotID(String value) {
        this.waferLotID = value;
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
        final IncomingWaferLotReportType that = ((IncomingWaferLotReportType) object);
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
            List<ChipType> lhsChip;
            lhsChip = (((this.chip!= null)&&(!this.chip.isEmpty()))?this.getChip():null);
            List<ChipType> rhsChip;
            rhsChip = (((that.chip!= null)&&(!that.chip.isEmpty()))?that.getChip():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chip", lhsChip), LocatorUtils.property(thatLocator, "chip", rhsChip), lhsChip, rhsChip, ((this.chip!= null)&&(!this.chip.isEmpty())), ((that.chip!= null)&&(!that.chip.isEmpty())))) {
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
            FacilityLocationType lhsOtherLocation;
            lhsOtherLocation = this.getOtherLocation();
            FacilityLocationType rhsOtherLocation;
            rhsOtherLocation = that.getOtherLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherLocation", lhsOtherLocation), LocatorUtils.property(thatLocator, "otherLocation", rhsOtherLocation), lhsOtherLocation, rhsOtherLocation, (this.otherLocation!= null), (that.otherLocation!= null))) {
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
            String lhsWaferLotID;
            lhsWaferLotID = this.getWaferLotID();
            String rhsWaferLotID;
            rhsWaferLotID = that.getWaferLotID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferLotID", lhsWaferLotID), LocatorUtils.property(thatLocator, "waferLotID", rhsWaferLotID), lhsWaferLotID, rhsWaferLotID, (this.waferLotID!= null), (that.waferLotID!= null))) {
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
            List<ChipType> theChip;
            theChip = (((this.chip!= null)&&(!this.chip.isEmpty()))?this.getChip():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chip", theChip), currentHashCode, theChip, ((this.chip!= null)&&(!this.chip.isEmpty())));
        }
        {
            FacilityLocationType theFabLocation;
            theFabLocation = this.getFabLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fabLocation", theFabLocation), currentHashCode, theFabLocation, (this.fabLocation!= null));
        }
        {
            FacilityLocationType theOtherLocation;
            theOtherLocation = this.getOtherLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherLocation", theOtherLocation), currentHashCode, theOtherLocation, (this.otherLocation!= null));
        }
        {
            QuantityDetail theQuantityDetail;
            theQuantityDetail = this.getQuantityDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityDetail", theQuantityDetail), currentHashCode, theQuantityDetail, (this.quantityDetail!= null));
        }
        {
            String theWaferLotID;
            theWaferLotID = this.getWaferLotID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferLotID", theWaferLotID), currentHashCode, theWaferLotID, (this.waferLotID!= null));
        }
        {
            FacilityLocationType theWaferSortLocation;
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
            CarrierReportType theCarrierReport;
            theCarrierReport = this.getCarrierReport();
            strategy.appendField(locator, this, "carrierReport", buffer, theCarrierReport, (this.carrierReport!= null));
        }
        {
            List<ChipType> theChip;
            theChip = (((this.chip!= null)&&(!this.chip.isEmpty()))?this.getChip():null);
            strategy.appendField(locator, this, "chip", buffer, theChip, ((this.chip!= null)&&(!this.chip.isEmpty())));
        }
        {
            FacilityLocationType theFabLocation;
            theFabLocation = this.getFabLocation();
            strategy.appendField(locator, this, "fabLocation", buffer, theFabLocation, (this.fabLocation!= null));
        }
        {
            FacilityLocationType theOtherLocation;
            theOtherLocation = this.getOtherLocation();
            strategy.appendField(locator, this, "otherLocation", buffer, theOtherLocation, (this.otherLocation!= null));
        }
        {
            QuantityDetail theQuantityDetail;
            theQuantityDetail = this.getQuantityDetail();
            strategy.appendField(locator, this, "quantityDetail", buffer, theQuantityDetail, (this.quantityDetail!= null));
        }
        {
            String theWaferLotID;
            theWaferLotID = this.getWaferLotID();
            strategy.appendField(locator, this, "waferLotID", buffer, theWaferLotID, (this.waferLotID!= null));
        }
        {
            FacilityLocationType theWaferSortLocation;
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
