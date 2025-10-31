
package io.dscope.rosettanet.domain.procurement.procurement.v02_17;

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
import io.dscope.rosettanet.domain.procurement.codelist.shipmentterms.v01_03.ShipmentTerms;
import io.dscope.rosettanet.domain.procurement.codelist.specialfulfillmentrequest.v01_03.SpecialFulfillmentRequest;
import io.dscope.rosettanet.domain.shared.codelist.freeonboard.v01_01.FreeOnBoard;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.domain.shared.shared.v01_10.CarrierInformation;
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
 * <p>Java class for OrderShippingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderShippingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}CarrierInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:FreeOnBoard:xsd:codelist:01.01}FreeOnBoard" minOccurs="0"/&gt;
 *         &lt;element name="PackList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03}ShipmentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:SpecialFulfillmentRequest:xsd:codelist:01.03}SpecialFulfillmentRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}SpecialHandlingInstruction" minOccurs="0"/&gt;
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
@XmlType(name = "OrderShippingInformationType", propOrder = {
    "carrierInformation",
    "freeOnBoard",
    "packList",
    "shipmentTerms",
    "shippingServiceLevel",
    "specialFulfillmentRequest",
    "specialHandlingInstruction"
})
public class OrderShippingInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "CarrierInformation", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = CarrierInformation.class, required = false)
    protected CarrierInformation carrierInformation;
    @XmlElementRef(name = "FreeOnBoard", namespace = "urn:rosettanet:specification:domain:Shared:FreeOnBoard:xsd:codelist:01.01", type = FreeOnBoard.class, required = false)
    protected FreeOnBoard freeOnBoard;
    @XmlElement(name = "PackList")
    protected String packList;
    @XmlElementRef(name = "ShipmentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03", type = ShipmentTerms.class, required = false)
    protected ShipmentTerms shipmentTerms;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class, required = false)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElementRef(name = "SpecialFulfillmentRequest", namespace = "urn:rosettanet:specification:domain:Procurement:SpecialFulfillmentRequest:xsd:codelist:01.03", type = SpecialFulfillmentRequest.class, required = false)
    protected List<SpecialFulfillmentRequest> specialFulfillmentRequest;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = SpecialHandlingInstruction.class, required = false)
    protected SpecialHandlingInstruction specialHandlingInstruction;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the carrierInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierInformation }
     *     
     */
    public CarrierInformation getCarrierInformation() {
        return carrierInformation;
    }

    /**
     * Sets the value of the carrierInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierInformation }
     *     
     */
    public void setCarrierInformation(CarrierInformation value) {
        this.carrierInformation = value;
    }

    /**
     * Gets the value of the freeOnBoard property.
     * 
     * @return
     *     possible object is
     *     {@link FreeOnBoard }
     *     
     */
    public FreeOnBoard getFreeOnBoard() {
        return freeOnBoard;
    }

    /**
     * Sets the value of the freeOnBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeOnBoard }
     *     
     */
    public void setFreeOnBoard(FreeOnBoard value) {
        this.freeOnBoard = value;
    }

    /**
     * Gets the value of the packList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackList() {
        return packList;
    }

    /**
     * Sets the value of the packList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackList(String value) {
        this.packList = value;
    }

    /**
     * Gets the value of the shipmentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentTerms }
     *     
     */
    public ShipmentTerms getShipmentTerms() {
        return shipmentTerms;
    }

    /**
     * Sets the value of the shipmentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTerms }
     *     
     */
    public void setShipmentTerms(ShipmentTerms value) {
        this.shipmentTerms = value;
    }

    /**
     * Gets the value of the shippingServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public ShippingServiceLevel getShippingServiceLevel() {
        return shippingServiceLevel;
    }

    /**
     * Sets the value of the shippingServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public void setShippingServiceLevel(ShippingServiceLevel value) {
        this.shippingServiceLevel = value;
    }

    /**
     * Gets the value of the specialFulfillmentRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialFulfillmentRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialFulfillmentRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialFulfillmentRequest }
     * 
     * 
     */
    public List<SpecialFulfillmentRequest> getSpecialFulfillmentRequest() {
        if (specialFulfillmentRequest == null) {
            specialFulfillmentRequest = new ArrayList<SpecialFulfillmentRequest>();
        }
        return this.specialFulfillmentRequest;
    }

    /**
     * Gets the value of the specialHandlingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialHandlingInstruction }
     *     
     */
    public SpecialHandlingInstruction getSpecialHandlingInstruction() {
        return specialHandlingInstruction;
    }

    /**
     * Sets the value of the specialHandlingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialHandlingInstruction }
     *     
     */
    public void setSpecialHandlingInstruction(SpecialHandlingInstruction value) {
        this.specialHandlingInstruction = value;
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
        final OrderShippingInformationType that = ((OrderShippingInformationType) object);
        {
            CarrierInformation lhsCarrierInformation;
            lhsCarrierInformation = this.getCarrierInformation();
            CarrierInformation rhsCarrierInformation;
            rhsCarrierInformation = that.getCarrierInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carrierInformation", lhsCarrierInformation), LocatorUtils.property(thatLocator, "carrierInformation", rhsCarrierInformation), lhsCarrierInformation, rhsCarrierInformation, (this.carrierInformation!= null), (that.carrierInformation!= null))) {
                return false;
            }
        }
        {
            FreeOnBoard lhsFreeOnBoard;
            lhsFreeOnBoard = this.getFreeOnBoard();
            FreeOnBoard rhsFreeOnBoard;
            rhsFreeOnBoard = that.getFreeOnBoard();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeOnBoard", lhsFreeOnBoard), LocatorUtils.property(thatLocator, "freeOnBoard", rhsFreeOnBoard), lhsFreeOnBoard, rhsFreeOnBoard, (this.freeOnBoard!= null), (that.freeOnBoard!= null))) {
                return false;
            }
        }
        {
            String lhsPackList;
            lhsPackList = this.getPackList();
            String rhsPackList;
            rhsPackList = that.getPackList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packList", lhsPackList), LocatorUtils.property(thatLocator, "packList", rhsPackList), lhsPackList, rhsPackList, (this.packList!= null), (that.packList!= null))) {
                return false;
            }
        }
        {
            ShipmentTerms lhsShipmentTerms;
            lhsShipmentTerms = this.getShipmentTerms();
            ShipmentTerms rhsShipmentTerms;
            rhsShipmentTerms = that.getShipmentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentTerms", lhsShipmentTerms), LocatorUtils.property(thatLocator, "shipmentTerms", rhsShipmentTerms), lhsShipmentTerms, rhsShipmentTerms, (this.shipmentTerms!= null), (that.shipmentTerms!= null))) {
                return false;
            }
        }
        {
            ShippingServiceLevel lhsShippingServiceLevel;
            lhsShippingServiceLevel = this.getShippingServiceLevel();
            ShippingServiceLevel rhsShippingServiceLevel;
            rhsShippingServiceLevel = that.getShippingServiceLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingServiceLevel", lhsShippingServiceLevel), LocatorUtils.property(thatLocator, "shippingServiceLevel", rhsShippingServiceLevel), lhsShippingServiceLevel, rhsShippingServiceLevel, (this.shippingServiceLevel!= null), (that.shippingServiceLevel!= null))) {
                return false;
            }
        }
        {
            List<SpecialFulfillmentRequest> lhsSpecialFulfillmentRequest;
            lhsSpecialFulfillmentRequest = (((this.specialFulfillmentRequest!= null)&&(!this.specialFulfillmentRequest.isEmpty()))?this.getSpecialFulfillmentRequest():null);
            List<SpecialFulfillmentRequest> rhsSpecialFulfillmentRequest;
            rhsSpecialFulfillmentRequest = (((that.specialFulfillmentRequest!= null)&&(!that.specialFulfillmentRequest.isEmpty()))?that.getSpecialFulfillmentRequest():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialFulfillmentRequest", lhsSpecialFulfillmentRequest), LocatorUtils.property(thatLocator, "specialFulfillmentRequest", rhsSpecialFulfillmentRequest), lhsSpecialFulfillmentRequest, rhsSpecialFulfillmentRequest, ((this.specialFulfillmentRequest!= null)&&(!this.specialFulfillmentRequest.isEmpty())), ((that.specialFulfillmentRequest!= null)&&(!that.specialFulfillmentRequest.isEmpty())))) {
                return false;
            }
        }
        {
            SpecialHandlingInstruction lhsSpecialHandlingInstruction;
            lhsSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            SpecialHandlingInstruction rhsSpecialHandlingInstruction;
            rhsSpecialHandlingInstruction = that.getSpecialHandlingInstruction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialHandlingInstruction", lhsSpecialHandlingInstruction), LocatorUtils.property(thatLocator, "specialHandlingInstruction", rhsSpecialHandlingInstruction), lhsSpecialHandlingInstruction, rhsSpecialHandlingInstruction, (this.specialHandlingInstruction!= null), (that.specialHandlingInstruction!= null))) {
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
            CarrierInformation theCarrierInformation;
            theCarrierInformation = this.getCarrierInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierInformation", theCarrierInformation), currentHashCode, theCarrierInformation, (this.carrierInformation!= null));
        }
        {
            FreeOnBoard theFreeOnBoard;
            theFreeOnBoard = this.getFreeOnBoard();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freeOnBoard", theFreeOnBoard), currentHashCode, theFreeOnBoard, (this.freeOnBoard!= null));
        }
        {
            String thePackList;
            thePackList = this.getPackList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packList", thePackList), currentHashCode, thePackList, (this.packList!= null));
        }
        {
            ShipmentTerms theShipmentTerms;
            theShipmentTerms = this.getShipmentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentTerms", theShipmentTerms), currentHashCode, theShipmentTerms, (this.shipmentTerms!= null));
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingServiceLevel", theShippingServiceLevel), currentHashCode, theShippingServiceLevel, (this.shippingServiceLevel!= null));
        }
        {
            List<SpecialFulfillmentRequest> theSpecialFulfillmentRequest;
            theSpecialFulfillmentRequest = (((this.specialFulfillmentRequest!= null)&&(!this.specialFulfillmentRequest.isEmpty()))?this.getSpecialFulfillmentRequest():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialFulfillmentRequest", theSpecialFulfillmentRequest), currentHashCode, theSpecialFulfillmentRequest, ((this.specialFulfillmentRequest!= null)&&(!this.specialFulfillmentRequest.isEmpty())));
        }
        {
            SpecialHandlingInstruction theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialHandlingInstruction", theSpecialHandlingInstruction), currentHashCode, theSpecialHandlingInstruction, (this.specialHandlingInstruction!= null));
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
            CarrierInformation theCarrierInformation;
            theCarrierInformation = this.getCarrierInformation();
            strategy.appendField(locator, this, "carrierInformation", buffer, theCarrierInformation, (this.carrierInformation!= null));
        }
        {
            FreeOnBoard theFreeOnBoard;
            theFreeOnBoard = this.getFreeOnBoard();
            strategy.appendField(locator, this, "freeOnBoard", buffer, theFreeOnBoard, (this.freeOnBoard!= null));
        }
        {
            String thePackList;
            thePackList = this.getPackList();
            strategy.appendField(locator, this, "packList", buffer, thePackList, (this.packList!= null));
        }
        {
            ShipmentTerms theShipmentTerms;
            theShipmentTerms = this.getShipmentTerms();
            strategy.appendField(locator, this, "shipmentTerms", buffer, theShipmentTerms, (this.shipmentTerms!= null));
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            strategy.appendField(locator, this, "shippingServiceLevel", buffer, theShippingServiceLevel, (this.shippingServiceLevel!= null));
        }
        {
            List<SpecialFulfillmentRequest> theSpecialFulfillmentRequest;
            theSpecialFulfillmentRequest = (((this.specialFulfillmentRequest!= null)&&(!this.specialFulfillmentRequest.isEmpty()))?this.getSpecialFulfillmentRequest():null);
            strategy.appendField(locator, this, "specialFulfillmentRequest", buffer, theSpecialFulfillmentRequest, ((this.specialFulfillmentRequest!= null)&&(!this.specialFulfillmentRequest.isEmpty())));
        }
        {
            SpecialHandlingInstruction theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            strategy.appendField(locator, this, "specialHandlingInstruction", buffer, theSpecialHandlingInstruction, (this.specialHandlingInstruction!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
