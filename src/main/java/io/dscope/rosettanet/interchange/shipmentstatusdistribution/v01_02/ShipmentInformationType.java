
package io.dscope.rosettanet.interchange.shipmentstatusdistribution.v01_02;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.ShipmentChangeReason;
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.ShipmentServiceLevel;
import io.dscope.rosettanet.universal.dates.v01_01.DateTimePeriodType;
import io.dscope.rosettanet.universal.partneridentification.v01_03.SpecifiedPartnerDescriptionType;
import io.dscope.rosettanet.universal.physicaldimension.v01_01.WeightType;
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
 * <p>Java class for ShipmentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PickupPeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.01}DateTimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="RoutingInformation" type="{urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:01.02}RoutingInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ShipFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.03}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}ShipmentChangeReason" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}ShipmentServiceLevel" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.03}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="TotalContainer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="TotalWeight" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.01}WeightType"/&gt;
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
@XmlType(name = "ShipmentInformationType", propOrder = {
    "dateTime",
    "description",
    "identifier",
    "pickupPeriod",
    "routingInformation",
    "shipFrom",
    "shipmentChangeReason",
    "shipmentServiceLevel",
    "shipTo",
    "totalContainer",
    "totalWeight"
})
public class ShipmentInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "PickupPeriod")
    protected DateTimePeriodType pickupPeriod;
    @XmlElement(name = "RoutingInformation", required = true)
    protected List<RoutingInformationType> routingInformation;
    @XmlElement(name = "ShipFrom")
    protected SpecifiedPartnerDescriptionType shipFrom;
    @XmlElementRef(name = "ShipmentChangeReason", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = ShipmentChangeReason.class, required = false)
    protected ShipmentChangeReason shipmentChangeReason;
    @XmlElementRef(name = "ShipmentServiceLevel", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = ShipmentServiceLevel.class, required = false)
    protected ShipmentServiceLevel shipmentServiceLevel;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElement(name = "TotalContainer")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalContainer;
    @XmlElement(name = "TotalWeight", required = true)
    protected WeightType totalWeight;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the pickupPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    public DateTimePeriodType getPickupPeriod() {
        return pickupPeriod;
    }

    /**
     * Sets the value of the pickupPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    public void setPickupPeriod(DateTimePeriodType value) {
        this.pickupPeriod = value;
    }

    /**
     * Gets the value of the routingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingInformationType }
     * 
     * 
     */
    public List<RoutingInformationType> getRoutingInformation() {
        if (routingInformation == null) {
            routingInformation = new ArrayList<RoutingInformationType>();
        }
        return this.routingInformation;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipFrom(SpecifiedPartnerDescriptionType value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the shipmentChangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentChangeReason }
     *     
     */
    public ShipmentChangeReason getShipmentChangeReason() {
        return shipmentChangeReason;
    }

    /**
     * Sets the value of the shipmentChangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentChangeReason }
     *     
     */
    public void setShipmentChangeReason(ShipmentChangeReason value) {
        this.shipmentChangeReason = value;
    }

    /**
     * Gets the value of the shipmentServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentServiceLevel }
     *     
     */
    public ShipmentServiceLevel getShipmentServiceLevel() {
        return shipmentServiceLevel;
    }

    /**
     * Sets the value of the shipmentServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceLevel }
     *     
     */
    public void setShipmentServiceLevel(ShipmentServiceLevel value) {
        this.shipmentServiceLevel = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipTo(SpecifiedPartnerDescriptionType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the totalContainer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalContainer() {
        return totalContainer;
    }

    /**
     * Sets the value of the totalContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalContainer(BigInteger value) {
        this.totalContainer = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setTotalWeight(WeightType value) {
        this.totalWeight = value;
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
        final ShipmentInformationType that = ((ShipmentInformationType) object);
        {
            XMLGregorianCalendar lhsDateTime;
            lhsDateTime = this.getDateTime();
            XMLGregorianCalendar rhsDateTime;
            rhsDateTime = that.getDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTime", lhsDateTime), LocatorUtils.property(thatLocator, "dateTime", rhsDateTime), lhsDateTime, rhsDateTime, (this.dateTime!= null), (that.dateTime!= null))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            DateTimePeriodType lhsPickupPeriod;
            lhsPickupPeriod = this.getPickupPeriod();
            DateTimePeriodType rhsPickupPeriod;
            rhsPickupPeriod = that.getPickupPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pickupPeriod", lhsPickupPeriod), LocatorUtils.property(thatLocator, "pickupPeriod", rhsPickupPeriod), lhsPickupPeriod, rhsPickupPeriod, (this.pickupPeriod!= null), (that.pickupPeriod!= null))) {
                return false;
            }
        }
        {
            List<RoutingInformationType> lhsRoutingInformation;
            lhsRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            List<RoutingInformationType> rhsRoutingInformation;
            rhsRoutingInformation = (((that.routingInformation!= null)&&(!that.routingInformation.isEmpty()))?that.getRoutingInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "routingInformation", lhsRoutingInformation), LocatorUtils.property(thatLocator, "routingInformation", rhsRoutingInformation), lhsRoutingInformation, rhsRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())), ((that.routingInformation!= null)&&(!that.routingInformation.isEmpty())))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsShipFrom;
            lhsShipFrom = this.getShipFrom();
            SpecifiedPartnerDescriptionType rhsShipFrom;
            rhsShipFrom = that.getShipFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipFrom", lhsShipFrom), LocatorUtils.property(thatLocator, "shipFrom", rhsShipFrom), lhsShipFrom, rhsShipFrom, (this.shipFrom!= null), (that.shipFrom!= null))) {
                return false;
            }
        }
        {
            ShipmentChangeReason lhsShipmentChangeReason;
            lhsShipmentChangeReason = this.getShipmentChangeReason();
            ShipmentChangeReason rhsShipmentChangeReason;
            rhsShipmentChangeReason = that.getShipmentChangeReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentChangeReason", lhsShipmentChangeReason), LocatorUtils.property(thatLocator, "shipmentChangeReason", rhsShipmentChangeReason), lhsShipmentChangeReason, rhsShipmentChangeReason, (this.shipmentChangeReason!= null), (that.shipmentChangeReason!= null))) {
                return false;
            }
        }
        {
            ShipmentServiceLevel lhsShipmentServiceLevel;
            lhsShipmentServiceLevel = this.getShipmentServiceLevel();
            ShipmentServiceLevel rhsShipmentServiceLevel;
            rhsShipmentServiceLevel = that.getShipmentServiceLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentServiceLevel", lhsShipmentServiceLevel), LocatorUtils.property(thatLocator, "shipmentServiceLevel", rhsShipmentServiceLevel), lhsShipmentServiceLevel, rhsShipmentServiceLevel, (this.shipmentServiceLevel!= null), (that.shipmentServiceLevel!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsShipTo;
            lhsShipTo = this.getShipTo();
            SpecifiedPartnerDescriptionType rhsShipTo;
            rhsShipTo = that.getShipTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipTo", lhsShipTo), LocatorUtils.property(thatLocator, "shipTo", rhsShipTo), lhsShipTo, rhsShipTo, (this.shipTo!= null), (that.shipTo!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsTotalContainer;
            lhsTotalContainer = this.getTotalContainer();
            BigInteger rhsTotalContainer;
            rhsTotalContainer = that.getTotalContainer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalContainer", lhsTotalContainer), LocatorUtils.property(thatLocator, "totalContainer", rhsTotalContainer), lhsTotalContainer, rhsTotalContainer, (this.totalContainer!= null), (that.totalContainer!= null))) {
                return false;
            }
        }
        {
            WeightType lhsTotalWeight;
            lhsTotalWeight = this.getTotalWeight();
            WeightType rhsTotalWeight;
            rhsTotalWeight = that.getTotalWeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalWeight", lhsTotalWeight), LocatorUtils.property(thatLocator, "totalWeight", rhsTotalWeight), lhsTotalWeight, rhsTotalWeight, (this.totalWeight!= null), (that.totalWeight!= null))) {
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
            XMLGregorianCalendar theDateTime;
            theDateTime = this.getDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateTime", theDateTime), currentHashCode, theDateTime, (this.dateTime!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            DateTimePeriodType thePickupPeriod;
            thePickupPeriod = this.getPickupPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pickupPeriod", thePickupPeriod), currentHashCode, thePickupPeriod, (this.pickupPeriod!= null));
        }
        {
            List<RoutingInformationType> theRoutingInformation;
            theRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "routingInformation", theRoutingInformation), currentHashCode, theRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theShipFrom;
            theShipFrom = this.getShipFrom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipFrom", theShipFrom), currentHashCode, theShipFrom, (this.shipFrom!= null));
        }
        {
            ShipmentChangeReason theShipmentChangeReason;
            theShipmentChangeReason = this.getShipmentChangeReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentChangeReason", theShipmentChangeReason), currentHashCode, theShipmentChangeReason, (this.shipmentChangeReason!= null));
        }
        {
            ShipmentServiceLevel theShipmentServiceLevel;
            theShipmentServiceLevel = this.getShipmentServiceLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentServiceLevel", theShipmentServiceLevel), currentHashCode, theShipmentServiceLevel, (this.shipmentServiceLevel!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipTo", theShipTo), currentHashCode, theShipTo, (this.shipTo!= null));
        }
        {
            BigInteger theTotalContainer;
            theTotalContainer = this.getTotalContainer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalContainer", theTotalContainer), currentHashCode, theTotalContainer, (this.totalContainer!= null));
        }
        {
            WeightType theTotalWeight;
            theTotalWeight = this.getTotalWeight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalWeight", theTotalWeight), currentHashCode, theTotalWeight, (this.totalWeight!= null));
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
            XMLGregorianCalendar theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime, (this.dateTime!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            DateTimePeriodType thePickupPeriod;
            thePickupPeriod = this.getPickupPeriod();
            strategy.appendField(locator, this, "pickupPeriod", buffer, thePickupPeriod, (this.pickupPeriod!= null));
        }
        {
            List<RoutingInformationType> theRoutingInformation;
            theRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            strategy.appendField(locator, this, "routingInformation", buffer, theRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theShipFrom;
            theShipFrom = this.getShipFrom();
            strategy.appendField(locator, this, "shipFrom", buffer, theShipFrom, (this.shipFrom!= null));
        }
        {
            ShipmentChangeReason theShipmentChangeReason;
            theShipmentChangeReason = this.getShipmentChangeReason();
            strategy.appendField(locator, this, "shipmentChangeReason", buffer, theShipmentChangeReason, (this.shipmentChangeReason!= null));
        }
        {
            ShipmentServiceLevel theShipmentServiceLevel;
            theShipmentServiceLevel = this.getShipmentServiceLevel();
            strategy.appendField(locator, this, "shipmentServiceLevel", buffer, theShipmentServiceLevel, (this.shipmentServiceLevel!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            strategy.appendField(locator, this, "shipTo", buffer, theShipTo, (this.shipTo!= null));
        }
        {
            BigInteger theTotalContainer;
            theTotalContainer = this.getTotalContainer();
            strategy.appendField(locator, this, "totalContainer", buffer, theTotalContainer, (this.totalContainer!= null));
        }
        {
            WeightType theTotalWeight;
            theTotalWeight = this.getTotalWeight();
            strategy.appendField(locator, this, "totalWeight", buffer, theTotalWeight, (this.totalWeight!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
