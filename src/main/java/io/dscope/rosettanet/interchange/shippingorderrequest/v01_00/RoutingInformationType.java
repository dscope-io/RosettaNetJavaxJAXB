
package io.dscope.rosettanet.interchange.shippingorderrequest.v01_00;

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
import io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_05.ShipmentMode;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.FreightPaymentInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.ShippingLabel;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.SpecialHandlingInstruction;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
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
 * <p>Java class for RoutingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryPriorityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}FreightPaymentInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05}ShipmentMode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}ShippingLabel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}SpecialHandlingInstruction" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "RoutingInformationType", propOrder = {
    "deliveryPriorityIdentifier",
    "freightPaymentInformation",
    "partnerDescription",
    "sequenceNumber",
    "shipmentMode",
    "shippingLabel",
    "shippingServiceLevel",
    "specialHandlingInstruction"
})
public class RoutingInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DeliveryPriorityIdentifier")
    protected String deliveryPriorityIdentifier;
    @XmlElementRef(name = "FreightPaymentInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = FreightPaymentInformation.class, required = false)
    protected FreightPaymentInformation freightPaymentInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElementRef(name = "ShipmentMode", namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05", type = ShipmentMode.class, required = false)
    protected ShipmentMode shipmentMode;
    @XmlElementRef(name = "ShippingLabel", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = ShippingLabel.class, required = false)
    protected ShippingLabel shippingLabel;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class, required = false)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = SpecialHandlingInstruction.class, required = false)
    protected List<SpecialHandlingInstruction> specialHandlingInstruction;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the deliveryPriorityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPriorityIdentifier() {
        return deliveryPriorityIdentifier;
    }

    /**
     * Sets the value of the deliveryPriorityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPriorityIdentifier(String value) {
        this.deliveryPriorityIdentifier = value;
    }

    /**
     * Gets the value of the freightPaymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FreightPaymentInformation }
     *     
     */
    public FreightPaymentInformation getFreightPaymentInformation() {
        return freightPaymentInformation;
    }

    /**
     * Sets the value of the freightPaymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightPaymentInformation }
     *     
     */
    public void setFreightPaymentInformation(FreightPaymentInformation value) {
        this.freightPaymentInformation = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the shipmentMode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentMode }
     *     
     */
    public ShipmentMode getShipmentMode() {
        return shipmentMode;
    }

    /**
     * Sets the value of the shipmentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentMode }
     *     
     */
    public void setShipmentMode(ShipmentMode value) {
        this.shipmentMode = value;
    }

    /**
     * Gets the value of the shippingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingLabel }
     *     
     */
    public ShippingLabel getShippingLabel() {
        return shippingLabel;
    }

    /**
     * Sets the value of the shippingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingLabel }
     *     
     */
    public void setShippingLabel(ShippingLabel value) {
        this.shippingLabel = value;
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
     * Gets the value of the specialHandlingInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandlingInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandlingInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialHandlingInstruction }
     * 
     * 
     */
    public List<SpecialHandlingInstruction> getSpecialHandlingInstruction() {
        if (specialHandlingInstruction == null) {
            specialHandlingInstruction = new ArrayList<SpecialHandlingInstruction>();
        }
        return this.specialHandlingInstruction;
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
        final RoutingInformationType that = ((RoutingInformationType) object);
        {
            String lhsDeliveryPriorityIdentifier;
            lhsDeliveryPriorityIdentifier = this.getDeliveryPriorityIdentifier();
            String rhsDeliveryPriorityIdentifier;
            rhsDeliveryPriorityIdentifier = that.getDeliveryPriorityIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryPriorityIdentifier", lhsDeliveryPriorityIdentifier), LocatorUtils.property(thatLocator, "deliveryPriorityIdentifier", rhsDeliveryPriorityIdentifier), lhsDeliveryPriorityIdentifier, rhsDeliveryPriorityIdentifier, (this.deliveryPriorityIdentifier!= null), (that.deliveryPriorityIdentifier!= null))) {
                return false;
            }
        }
        {
            FreightPaymentInformation lhsFreightPaymentInformation;
            lhsFreightPaymentInformation = this.getFreightPaymentInformation();
            FreightPaymentInformation rhsFreightPaymentInformation;
            rhsFreightPaymentInformation = that.getFreightPaymentInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightPaymentInformation", lhsFreightPaymentInformation), LocatorUtils.property(thatLocator, "freightPaymentInformation", rhsFreightPaymentInformation), lhsFreightPaymentInformation, rhsFreightPaymentInformation, (this.freightPaymentInformation!= null), (that.freightPaymentInformation!= null))) {
                return false;
            }
        }
        {
            List<PartnerDescription> lhsPartnerDescription;
            lhsPartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            List<PartnerDescription> rhsPartnerDescription;
            rhsPartnerDescription = (((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty()))?that.getPartnerDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())), ((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsSequenceNumber;
            lhsSequenceNumber = this.getSequenceNumber();
            String rhsSequenceNumber;
            rhsSequenceNumber = that.getSequenceNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNumber", lhsSequenceNumber), LocatorUtils.property(thatLocator, "sequenceNumber", rhsSequenceNumber), lhsSequenceNumber, rhsSequenceNumber, (this.sequenceNumber!= null), (that.sequenceNumber!= null))) {
                return false;
            }
        }
        {
            ShipmentMode lhsShipmentMode;
            lhsShipmentMode = this.getShipmentMode();
            ShipmentMode rhsShipmentMode;
            rhsShipmentMode = that.getShipmentMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentMode", lhsShipmentMode), LocatorUtils.property(thatLocator, "shipmentMode", rhsShipmentMode), lhsShipmentMode, rhsShipmentMode, (this.shipmentMode!= null), (that.shipmentMode!= null))) {
                return false;
            }
        }
        {
            ShippingLabel lhsShippingLabel;
            lhsShippingLabel = this.getShippingLabel();
            ShippingLabel rhsShippingLabel;
            rhsShippingLabel = that.getShippingLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingLabel", lhsShippingLabel), LocatorUtils.property(thatLocator, "shippingLabel", rhsShippingLabel), lhsShippingLabel, rhsShippingLabel, (this.shippingLabel!= null), (that.shippingLabel!= null))) {
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
            List<SpecialHandlingInstruction> lhsSpecialHandlingInstruction;
            lhsSpecialHandlingInstruction = (((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty()))?this.getSpecialHandlingInstruction():null);
            List<SpecialHandlingInstruction> rhsSpecialHandlingInstruction;
            rhsSpecialHandlingInstruction = (((that.specialHandlingInstruction!= null)&&(!that.specialHandlingInstruction.isEmpty()))?that.getSpecialHandlingInstruction():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialHandlingInstruction", lhsSpecialHandlingInstruction), LocatorUtils.property(thatLocator, "specialHandlingInstruction", rhsSpecialHandlingInstruction), lhsSpecialHandlingInstruction, rhsSpecialHandlingInstruction, ((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty())), ((that.specialHandlingInstruction!= null)&&(!that.specialHandlingInstruction.isEmpty())))) {
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
            String theDeliveryPriorityIdentifier;
            theDeliveryPriorityIdentifier = this.getDeliveryPriorityIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryPriorityIdentifier", theDeliveryPriorityIdentifier), currentHashCode, theDeliveryPriorityIdentifier, (this.deliveryPriorityIdentifier!= null));
        }
        {
            FreightPaymentInformation theFreightPaymentInformation;
            theFreightPaymentInformation = this.getFreightPaymentInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightPaymentInformation", theFreightPaymentInformation), currentHashCode, theFreightPaymentInformation, (this.freightPaymentInformation!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            String theSequenceNumber;
            theSequenceNumber = this.getSequenceNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumber", theSequenceNumber), currentHashCode, theSequenceNumber, (this.sequenceNumber!= null));
        }
        {
            ShipmentMode theShipmentMode;
            theShipmentMode = this.getShipmentMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentMode", theShipmentMode), currentHashCode, theShipmentMode, (this.shipmentMode!= null));
        }
        {
            ShippingLabel theShippingLabel;
            theShippingLabel = this.getShippingLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingLabel", theShippingLabel), currentHashCode, theShippingLabel, (this.shippingLabel!= null));
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingServiceLevel", theShippingServiceLevel), currentHashCode, theShippingServiceLevel, (this.shippingServiceLevel!= null));
        }
        {
            List<SpecialHandlingInstruction> theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = (((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty()))?this.getSpecialHandlingInstruction():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialHandlingInstruction", theSpecialHandlingInstruction), currentHashCode, theSpecialHandlingInstruction, ((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty())));
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
            String theDeliveryPriorityIdentifier;
            theDeliveryPriorityIdentifier = this.getDeliveryPriorityIdentifier();
            strategy.appendField(locator, this, "deliveryPriorityIdentifier", buffer, theDeliveryPriorityIdentifier, (this.deliveryPriorityIdentifier!= null));
        }
        {
            FreightPaymentInformation theFreightPaymentInformation;
            theFreightPaymentInformation = this.getFreightPaymentInformation();
            strategy.appendField(locator, this, "freightPaymentInformation", buffer, theFreightPaymentInformation, (this.freightPaymentInformation!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            String theSequenceNumber;
            theSequenceNumber = this.getSequenceNumber();
            strategy.appendField(locator, this, "sequenceNumber", buffer, theSequenceNumber, (this.sequenceNumber!= null));
        }
        {
            ShipmentMode theShipmentMode;
            theShipmentMode = this.getShipmentMode();
            strategy.appendField(locator, this, "shipmentMode", buffer, theShipmentMode, (this.shipmentMode!= null));
        }
        {
            ShippingLabel theShippingLabel;
            theShippingLabel = this.getShippingLabel();
            strategy.appendField(locator, this, "shippingLabel", buffer, theShippingLabel, (this.shippingLabel!= null));
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            strategy.appendField(locator, this, "shippingServiceLevel", buffer, theShippingServiceLevel, (this.shippingServiceLevel!= null));
        }
        {
            List<SpecialHandlingInstruction> theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = (((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty()))?this.getSpecialHandlingInstruction():null);
            strategy.appendField(locator, this, "specialHandlingInstruction", buffer, theSpecialHandlingInstruction, ((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
