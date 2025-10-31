
package io.dscope.rosettanet.interchange.shipmentstatusdistribution.v01_02;

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
import io.dscope.rosettanet.domain.logistics.codelist.containertype.v01_00.ContainerType;
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.PhysicalDimension;
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.TrackingReference;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ContainerType:xsd:codelist:01.00}ContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}PhysicalDimension" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainerItem" type="{urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:01.02}ShippingContainerItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubContainer" type="{urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:01.02}SubContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}TrackingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "containerType",
    "identifier",
    "physicalDimension",
    "shippingContainerItem",
    "subContainer",
    "trackingReference"
})
public class ShippingContainerType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ContainerType", namespace = "urn:rosettanet:specification:domain:Logistics:ContainerType:xsd:codelist:01.00", type = ContainerType.class, required = false)
    protected List<ContainerType> containerType;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElementRef(name = "PhysicalDimension", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = PhysicalDimension.class, required = false)
    protected PhysicalDimension physicalDimension;
    @XmlElement(name = "ShippingContainerItem")
    protected List<ShippingContainerItemType> shippingContainerItem;
    @XmlElement(name = "SubContainer")
    protected List<SubContainerType> subContainer;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = TrackingReference.class, required = false)
    protected List<TrackingReference> trackingReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the containerType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerType }
     * 
     * 
     */
    public List<ContainerType> getContainerType() {
        if (containerType == null) {
            containerType = new ArrayList<ContainerType>();
        }
        return this.containerType;
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
     * Gets the value of the physicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDimension }
     *     
     */
    public PhysicalDimension getPhysicalDimension() {
        return physicalDimension;
    }

    /**
     * Sets the value of the physicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDimension }
     *     
     */
    public void setPhysicalDimension(PhysicalDimension value) {
        this.physicalDimension = value;
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
            List<ContainerType> lhsContainerType;
            lhsContainerType = (((this.containerType!= null)&&(!this.containerType.isEmpty()))?this.getContainerType():null);
            List<ContainerType> rhsContainerType;
            rhsContainerType = (((that.containerType!= null)&&(!that.containerType.isEmpty()))?that.getContainerType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containerType", lhsContainerType), LocatorUtils.property(thatLocator, "containerType", rhsContainerType), lhsContainerType, rhsContainerType, ((this.containerType!= null)&&(!this.containerType.isEmpty())), ((that.containerType!= null)&&(!that.containerType.isEmpty())))) {
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
            PhysicalDimension lhsPhysicalDimension;
            lhsPhysicalDimension = this.getPhysicalDimension();
            PhysicalDimension rhsPhysicalDimension;
            rhsPhysicalDimension = that.getPhysicalDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "physicalDimension", lhsPhysicalDimension), LocatorUtils.property(thatLocator, "physicalDimension", rhsPhysicalDimension), lhsPhysicalDimension, rhsPhysicalDimension, (this.physicalDimension!= null), (that.physicalDimension!= null))) {
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
            List<ContainerType> theContainerType;
            theContainerType = (((this.containerType!= null)&&(!this.containerType.isEmpty()))?this.getContainerType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerType", theContainerType), currentHashCode, theContainerType, ((this.containerType!= null)&&(!this.containerType.isEmpty())));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            PhysicalDimension thePhysicalDimension;
            thePhysicalDimension = this.getPhysicalDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "physicalDimension", thePhysicalDimension), currentHashCode, thePhysicalDimension, (this.physicalDimension!= null));
        }
        {
            List<ShippingContainerItemType> theShippingContainerItem;
            theShippingContainerItem = (((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty()))?this.getShippingContainerItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingContainerItem", theShippingContainerItem), currentHashCode, theShippingContainerItem, ((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty())));
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
            List<ContainerType> theContainerType;
            theContainerType = (((this.containerType!= null)&&(!this.containerType.isEmpty()))?this.getContainerType():null);
            strategy.appendField(locator, this, "containerType", buffer, theContainerType, ((this.containerType!= null)&&(!this.containerType.isEmpty())));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            PhysicalDimension thePhysicalDimension;
            thePhysicalDimension = this.getPhysicalDimension();
            strategy.appendField(locator, this, "physicalDimension", buffer, thePhysicalDimension, (this.physicalDimension!= null));
        }
        {
            List<ShippingContainerItemType> theShippingContainerItem;
            theShippingContainerItem = (((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty()))?this.getShippingContainerItem():null);
            strategy.appendField(locator, this, "shippingContainerItem", buffer, theShippingContainerItem, ((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty())));
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
