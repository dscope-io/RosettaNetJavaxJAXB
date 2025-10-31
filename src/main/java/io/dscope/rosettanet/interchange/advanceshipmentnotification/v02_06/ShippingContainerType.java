
package io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_06;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.MassPhysicalDimension;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.TrackingReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_30.SpecialHandlingInstruction;
import io.dscope.rosettanet.domain.shared.codelist.packagetype.v01_01.PackageType;
import io.dscope.rosettanet.universal.physicaldimension.v01_07.Linear;
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
 * <p>Java class for ShippingContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingContainerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07}Linear" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}MassPhysicalDimension" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfShippingContainers" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01}PackageType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainerItem" type="{urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.06}ShippingContainerItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.30}SpecialHandlingInstruction" minOccurs="0"/&gt;
 *         &lt;element name="SubContainer" type="{urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.06}SubContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}TrackingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ShippingContainerType", propOrder = {
    "identifier",
    "linear",
    "massPhysicalDimension",
    "numberOfShippingContainers",
    "packageType",
    "shippingContainerItem",
    "specialHandlingInstruction",
    "subContainer",
    "trackingReference"
})
public class ShippingContainerType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElementRef(name = "Linear", namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07", type = Linear.class, required = false)
    protected Linear linear;
    @XmlElementRef(name = "MassPhysicalDimension", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = MassPhysicalDimension.class, required = false)
    protected MassPhysicalDimension massPhysicalDimension;
    @XmlElement(name = "NumberOfShippingContainers")
    protected Float numberOfShippingContainers;
    @XmlElementRef(name = "PackageType", namespace = "urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01", type = PackageType.class, required = false)
    protected PackageType packageType;
    @XmlElement(name = "ShippingContainerItem")
    protected List<ShippingContainerItemType> shippingContainerItem;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.30", type = SpecialHandlingInstruction.class, required = false)
    protected SpecialHandlingInstruction specialHandlingInstruction;
    @XmlElement(name = "SubContainer")
    protected List<SubContainerType> subContainer;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = TrackingReference.class, required = false)
    protected List<TrackingReference> trackingReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the linear property.
     * 
     * @return
     *     possible object is
     *     {@link Linear }
     *     
     */
    public Linear getLinear() {
        return linear;
    }

    /**
     * Sets the value of the linear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linear }
     *     
     */
    public void setLinear(Linear value) {
        this.linear = value;
    }

    /**
     * Gets the value of the massPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link MassPhysicalDimension }
     *     
     */
    public MassPhysicalDimension getMassPhysicalDimension() {
        return massPhysicalDimension;
    }

    /**
     * Sets the value of the massPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassPhysicalDimension }
     *     
     */
    public void setMassPhysicalDimension(MassPhysicalDimension value) {
        this.massPhysicalDimension = value;
    }

    /**
     * Gets the value of the numberOfShippingContainers property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNumberOfShippingContainers() {
        return numberOfShippingContainers;
    }

    /**
     * Sets the value of the numberOfShippingContainers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNumberOfShippingContainers(Float value) {
        this.numberOfShippingContainers = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackageType(PackageType value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the shippingContainerItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingContainerItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingContainerItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingContainerItemType }
     * 
     * 
     */
    public List<ShippingContainerItemType> getShippingContainerItem() {
        if (shippingContainerItem == null) {
            shippingContainerItem = new ArrayList<ShippingContainerItemType>();
        }
        return this.shippingContainerItem;
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
     * Gets the value of the subContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubContainerType }
     * 
     * 
     */
    public List<SubContainerType> getSubContainer() {
        if (subContainer == null) {
            subContainer = new ArrayList<SubContainerType>();
        }
        return this.subContainer;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingReference }
     * 
     * 
     */
    public List<TrackingReference> getTrackingReference() {
        if (trackingReference == null) {
            trackingReference = new ArrayList<TrackingReference>();
        }
        return this.trackingReference;
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
        final ShippingContainerType that = ((ShippingContainerType) object);
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
            Linear lhsLinear;
            lhsLinear = this.getLinear();
            Linear rhsLinear;
            rhsLinear = that.getLinear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "linear", lhsLinear), LocatorUtils.property(thatLocator, "linear", rhsLinear), lhsLinear, rhsLinear, (this.linear!= null), (that.linear!= null))) {
                return false;
            }
        }
        {
            MassPhysicalDimension lhsMassPhysicalDimension;
            lhsMassPhysicalDimension = this.getMassPhysicalDimension();
            MassPhysicalDimension rhsMassPhysicalDimension;
            rhsMassPhysicalDimension = that.getMassPhysicalDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "massPhysicalDimension", lhsMassPhysicalDimension), LocatorUtils.property(thatLocator, "massPhysicalDimension", rhsMassPhysicalDimension), lhsMassPhysicalDimension, rhsMassPhysicalDimension, (this.massPhysicalDimension!= null), (that.massPhysicalDimension!= null))) {
                return false;
            }
        }
        {
            Float lhsNumberOfShippingContainers;
            lhsNumberOfShippingContainers = this.getNumberOfShippingContainers();
            Float rhsNumberOfShippingContainers;
            rhsNumberOfShippingContainers = that.getNumberOfShippingContainers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfShippingContainers", lhsNumberOfShippingContainers), LocatorUtils.property(thatLocator, "numberOfShippingContainers", rhsNumberOfShippingContainers), lhsNumberOfShippingContainers, rhsNumberOfShippingContainers, (this.numberOfShippingContainers!= null), (that.numberOfShippingContainers!= null))) {
                return false;
            }
        }
        {
            PackageType lhsPackageType;
            lhsPackageType = this.getPackageType();
            PackageType rhsPackageType;
            rhsPackageType = that.getPackageType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageType", lhsPackageType), LocatorUtils.property(thatLocator, "packageType", rhsPackageType), lhsPackageType, rhsPackageType, (this.packageType!= null), (that.packageType!= null))) {
                return false;
            }
        }
        {
            List<ShippingContainerItemType> lhsShippingContainerItem;
            lhsShippingContainerItem = (((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty()))?this.getShippingContainerItem():null);
            List<ShippingContainerItemType> rhsShippingContainerItem;
            rhsShippingContainerItem = (((that.shippingContainerItem!= null)&&(!that.shippingContainerItem.isEmpty()))?that.getShippingContainerItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingContainerItem", lhsShippingContainerItem), LocatorUtils.property(thatLocator, "shippingContainerItem", rhsShippingContainerItem), lhsShippingContainerItem, rhsShippingContainerItem, ((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty())), ((that.shippingContainerItem!= null)&&(!that.shippingContainerItem.isEmpty())))) {
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
            List<SubContainerType> lhsSubContainer;
            lhsSubContainer = (((this.subContainer!= null)&&(!this.subContainer.isEmpty()))?this.getSubContainer():null);
            List<SubContainerType> rhsSubContainer;
            rhsSubContainer = (((that.subContainer!= null)&&(!that.subContainer.isEmpty()))?that.getSubContainer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subContainer", lhsSubContainer), LocatorUtils.property(thatLocator, "subContainer", rhsSubContainer), lhsSubContainer, rhsSubContainer, ((this.subContainer!= null)&&(!this.subContainer.isEmpty())), ((that.subContainer!= null)&&(!that.subContainer.isEmpty())))) {
                return false;
            }
        }
        {
            List<TrackingReference> lhsTrackingReference;
            lhsTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            List<TrackingReference> rhsTrackingReference;
            rhsTrackingReference = (((that.trackingReference!= null)&&(!that.trackingReference.isEmpty()))?that.getTrackingReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingReference", lhsTrackingReference), LocatorUtils.property(thatLocator, "trackingReference", rhsTrackingReference), lhsTrackingReference, rhsTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())), ((that.trackingReference!= null)&&(!that.trackingReference.isEmpty())))) {
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
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            Linear theLinear;
            theLinear = this.getLinear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "linear", theLinear), currentHashCode, theLinear, (this.linear!= null));
        }
        {
            MassPhysicalDimension theMassPhysicalDimension;
            theMassPhysicalDimension = this.getMassPhysicalDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "massPhysicalDimension", theMassPhysicalDimension), currentHashCode, theMassPhysicalDimension, (this.massPhysicalDimension!= null));
        }
        {
            Float theNumberOfShippingContainers;
            theNumberOfShippingContainers = this.getNumberOfShippingContainers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberOfShippingContainers", theNumberOfShippingContainers), currentHashCode, theNumberOfShippingContainers, (this.numberOfShippingContainers!= null));
        }
        {
            PackageType thePackageType;
            thePackageType = this.getPackageType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageType", thePackageType), currentHashCode, thePackageType, (this.packageType!= null));
        }
        {
            List<ShippingContainerItemType> theShippingContainerItem;
            theShippingContainerItem = (((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty()))?this.getShippingContainerItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingContainerItem", theShippingContainerItem), currentHashCode, theShippingContainerItem, ((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty())));
        }
        {
            SpecialHandlingInstruction theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialHandlingInstruction", theSpecialHandlingInstruction), currentHashCode, theSpecialHandlingInstruction, (this.specialHandlingInstruction!= null));
        }
        {
            List<SubContainerType> theSubContainer;
            theSubContainer = (((this.subContainer!= null)&&(!this.subContainer.isEmpty()))?this.getSubContainer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subContainer", theSubContainer), currentHashCode, theSubContainer, ((this.subContainer!= null)&&(!this.subContainer.isEmpty())));
        }
        {
            List<TrackingReference> theTrackingReference;
            theTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingReference", theTrackingReference), currentHashCode, theTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())));
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
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            Linear theLinear;
            theLinear = this.getLinear();
            strategy.appendField(locator, this, "linear", buffer, theLinear, (this.linear!= null));
        }
        {
            MassPhysicalDimension theMassPhysicalDimension;
            theMassPhysicalDimension = this.getMassPhysicalDimension();
            strategy.appendField(locator, this, "massPhysicalDimension", buffer, theMassPhysicalDimension, (this.massPhysicalDimension!= null));
        }
        {
            Float theNumberOfShippingContainers;
            theNumberOfShippingContainers = this.getNumberOfShippingContainers();
            strategy.appendField(locator, this, "numberOfShippingContainers", buffer, theNumberOfShippingContainers, (this.numberOfShippingContainers!= null));
        }
        {
            PackageType thePackageType;
            thePackageType = this.getPackageType();
            strategy.appendField(locator, this, "packageType", buffer, thePackageType, (this.packageType!= null));
        }
        {
            List<ShippingContainerItemType> theShippingContainerItem;
            theShippingContainerItem = (((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty()))?this.getShippingContainerItem():null);
            strategy.appendField(locator, this, "shippingContainerItem", buffer, theShippingContainerItem, ((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty())));
        }
        {
            SpecialHandlingInstruction theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            strategy.appendField(locator, this, "specialHandlingInstruction", buffer, theSpecialHandlingInstruction, (this.specialHandlingInstruction!= null));
        }
        {
            List<SubContainerType> theSubContainer;
            theSubContainer = (((this.subContainer!= null)&&(!this.subContainer.isEmpty()))?this.getSubContainer():null);
            strategy.appendField(locator, this, "subContainer", buffer, theSubContainer, ((this.subContainer!= null)&&(!this.subContainer.isEmpty())));
        }
        {
            List<TrackingReference> theTrackingReference;
            theTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            strategy.appendField(locator, this, "trackingReference", buffer, theTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
