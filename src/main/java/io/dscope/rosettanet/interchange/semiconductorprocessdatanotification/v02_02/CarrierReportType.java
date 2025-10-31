
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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.Lot;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.Wafer;
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
 * <p>Java class for CarrierReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CarrierPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}Lot"/&gt;
 *         &lt;element name="Orientation" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}OrientationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}Wafer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CarrierReportType", propOrder = {
    "carrierID",
    "carrierPosition",
    "carrierType",
    "lot",
    "orientation",
    "wafer",
    "waferShortID"
})
public class CarrierReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CarrierID")
    protected List<String> carrierID;
    @XmlElement(name = "CarrierPosition")
    protected String carrierPosition;
    @XmlElement(name = "CarrierType")
    protected String carrierType;
    @XmlElementRef(name = "Lot", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = Lot.class)
    protected Lot lot;
    @XmlElement(name = "Orientation")
    protected OrientationType orientation;
    @XmlElementRef(name = "Wafer", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = Wafer.class, required = false)
    protected List<Wafer> wafer;
    @XmlElement(name = "WaferShortID")
    protected String waferShortID;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the carrierID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarrierID() {
        if (carrierID == null) {
            carrierID = new ArrayList<String>();
        }
        return this.carrierID;
    }

    /**
     * Gets the value of the carrierPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierPosition() {
        return carrierPosition;
    }

    /**
     * Sets the value of the carrierPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierPosition(String value) {
        this.carrierPosition = value;
    }

    /**
     * Gets the value of the carrierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierType() {
        return carrierType;
    }

    /**
     * Sets the value of the carrierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierType(String value) {
        this.carrierType = value;
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
        final CarrierReportType that = ((CarrierReportType) object);
        {
            List<String> lhsCarrierID;
            lhsCarrierID = (((this.carrierID!= null)&&(!this.carrierID.isEmpty()))?this.getCarrierID():null);
            List<String> rhsCarrierID;
            rhsCarrierID = (((that.carrierID!= null)&&(!that.carrierID.isEmpty()))?that.getCarrierID():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carrierID", lhsCarrierID), LocatorUtils.property(thatLocator, "carrierID", rhsCarrierID), lhsCarrierID, rhsCarrierID, ((this.carrierID!= null)&&(!this.carrierID.isEmpty())), ((that.carrierID!= null)&&(!that.carrierID.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsCarrierPosition;
            lhsCarrierPosition = this.getCarrierPosition();
            String rhsCarrierPosition;
            rhsCarrierPosition = that.getCarrierPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carrierPosition", lhsCarrierPosition), LocatorUtils.property(thatLocator, "carrierPosition", rhsCarrierPosition), lhsCarrierPosition, rhsCarrierPosition, (this.carrierPosition!= null), (that.carrierPosition!= null))) {
                return false;
            }
        }
        {
            String lhsCarrierType;
            lhsCarrierType = this.getCarrierType();
            String rhsCarrierType;
            rhsCarrierType = that.getCarrierType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carrierType", lhsCarrierType), LocatorUtils.property(thatLocator, "carrierType", rhsCarrierType), lhsCarrierType, rhsCarrierType, (this.carrierType!= null), (that.carrierType!= null))) {
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
            OrientationType lhsOrientation;
            lhsOrientation = this.getOrientation();
            OrientationType rhsOrientation;
            rhsOrientation = that.getOrientation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orientation", lhsOrientation), LocatorUtils.property(thatLocator, "orientation", rhsOrientation), lhsOrientation, rhsOrientation, (this.orientation!= null), (that.orientation!= null))) {
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
            List<String> theCarrierID;
            theCarrierID = (((this.carrierID!= null)&&(!this.carrierID.isEmpty()))?this.getCarrierID():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierID", theCarrierID), currentHashCode, theCarrierID, ((this.carrierID!= null)&&(!this.carrierID.isEmpty())));
        }
        {
            String theCarrierPosition;
            theCarrierPosition = this.getCarrierPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierPosition", theCarrierPosition), currentHashCode, theCarrierPosition, (this.carrierPosition!= null));
        }
        {
            String theCarrierType;
            theCarrierType = this.getCarrierType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierType", theCarrierType), currentHashCode, theCarrierType, (this.carrierType!= null));
        }
        {
            Lot theLot;
            theLot = this.getLot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lot", theLot), currentHashCode, theLot, (this.lot!= null));
        }
        {
            OrientationType theOrientation;
            theOrientation = this.getOrientation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orientation", theOrientation), currentHashCode, theOrientation, (this.orientation!= null));
        }
        {
            List<Wafer> theWafer;
            theWafer = (((this.wafer!= null)&&(!this.wafer.isEmpty()))?this.getWafer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wafer", theWafer), currentHashCode, theWafer, ((this.wafer!= null)&&(!this.wafer.isEmpty())));
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
            List<String> theCarrierID;
            theCarrierID = (((this.carrierID!= null)&&(!this.carrierID.isEmpty()))?this.getCarrierID():null);
            strategy.appendField(locator, this, "carrierID", buffer, theCarrierID, ((this.carrierID!= null)&&(!this.carrierID.isEmpty())));
        }
        {
            String theCarrierPosition;
            theCarrierPosition = this.getCarrierPosition();
            strategy.appendField(locator, this, "carrierPosition", buffer, theCarrierPosition, (this.carrierPosition!= null));
        }
        {
            String theCarrierType;
            theCarrierType = this.getCarrierType();
            strategy.appendField(locator, this, "carrierType", buffer, theCarrierType, (this.carrierType!= null));
        }
        {
            Lot theLot;
            theLot = this.getLot();
            strategy.appendField(locator, this, "lot", buffer, theLot, (this.lot!= null));
        }
        {
            OrientationType theOrientation;
            theOrientation = this.getOrientation();
            strategy.appendField(locator, this, "orientation", buffer, theOrientation, (this.orientation!= null));
        }
        {
            List<Wafer> theWafer;
            theWafer = (((this.wafer!= null)&&(!this.wafer.isEmpty()))?this.getWafer():null);
            strategy.appendField(locator, this, "wafer", buffer, theWafer, ((this.wafer!= null)&&(!this.wafer.isEmpty())));
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
