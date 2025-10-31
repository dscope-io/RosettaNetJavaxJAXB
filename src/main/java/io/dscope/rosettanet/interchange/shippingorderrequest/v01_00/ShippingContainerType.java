
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
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.LabelInstructionType;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.PhysicalDimension;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.ShippingLabel;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.TrackingReference;
import io.dscope.rosettanet.domain.shared.codelist.packagetype.v01_01.PackageType;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01}PackageType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}PhysicalDimension" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainerItem" type="{urn:rosettanet:specification:interchange:ShippingOrderRequestNotification:xsd:schema:01.00}ShippingContainerItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}ShippingLabel" minOccurs="0"/&gt;
 *         &lt;element name="SubContainer" type="{urn:rosettanet:specification:interchange:ShippingOrderRequestNotification:xsd:schema:01.00}SubContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TrackingIdentifier" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}LabelInstructionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}TrackingReference" minOccurs="0"/&gt;
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
    "packageType",
    "physicalDimension",
    "shippingContainerIdentifier",
    "shippingContainerItem",
    "shippingLabel",
    "subContainer",
    "trackingIdentifier",
    "trackingReference"
})
public class ShippingContainerType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "PackageType", namespace = "urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01", type = PackageType.class, required = false)
    protected PackageType packageType;
    @XmlElementRef(name = "PhysicalDimension", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = PhysicalDimension.class, required = false)
    protected PhysicalDimension physicalDimension;
    @XmlElement(name = "ShippingContainerIdentifier")
    protected String shippingContainerIdentifier;
    @XmlElement(name = "ShippingContainerItem")
    protected List<ShippingContainerItemType> shippingContainerItem;
    @XmlElementRef(name = "ShippingLabel", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = ShippingLabel.class, required = false)
    protected ShippingLabel shippingLabel;
    @XmlElement(name = "SubContainer")
    protected List<SubContainerType> subContainer;
    @XmlElement(name = "TrackingIdentifier")
    protected List<LabelInstructionType> trackingIdentifier;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = TrackingReference.class, required = false)
    protected TrackingReference trackingReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the shippingContainerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingContainerIdentifier() {
        return shippingContainerIdentifier;
    }

    /**
     * Sets the value of the shippingContainerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingContainerIdentifier(String value) {
        this.shippingContainerIdentifier = value;
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
     * Gets the value of the trackingIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelInstructionType }
     * 
     * 
     */
    public List<LabelInstructionType> getTrackingIdentifier() {
        if (trackingIdentifier == null) {
            trackingIdentifier = new ArrayList<LabelInstructionType>();
        }
        return this.trackingIdentifier;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingReference }
     *     
     */
    public TrackingReference getTrackingReference() {
        return trackingReference;
    }

    /**
     * Sets the value of the trackingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingReference }
     *     
     */
    public void setTrackingReference(TrackingReference value) {
        this.trackingReference = value;
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
            PackageType lhsPackageType;
            lhsPackageType = this.getPackageType();
            PackageType rhsPackageType;
            rhsPackageType = that.getPackageType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageType", lhsPackageType), LocatorUtils.property(thatLocator, "packageType", rhsPackageType), lhsPackageType, rhsPackageType, (this.packageType!= null), (that.packageType!= null))) {
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
            String lhsShippingContainerIdentifier;
            lhsShippingContainerIdentifier = this.getShippingContainerIdentifier();
            String rhsShippingContainerIdentifier;
            rhsShippingContainerIdentifier = that.getShippingContainerIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingContainerIdentifier", lhsShippingContainerIdentifier), LocatorUtils.property(thatLocator, "shippingContainerIdentifier", rhsShippingContainerIdentifier), lhsShippingContainerIdentifier, rhsShippingContainerIdentifier, (this.shippingContainerIdentifier!= null), (that.shippingContainerIdentifier!= null))) {
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
            ShippingLabel lhsShippingLabel;
            lhsShippingLabel = this.getShippingLabel();
            ShippingLabel rhsShippingLabel;
            rhsShippingLabel = that.getShippingLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingLabel", lhsShippingLabel), LocatorUtils.property(thatLocator, "shippingLabel", rhsShippingLabel), lhsShippingLabel, rhsShippingLabel, (this.shippingLabel!= null), (that.shippingLabel!= null))) {
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
            List<LabelInstructionType> lhsTrackingIdentifier;
            lhsTrackingIdentifier = (((this.trackingIdentifier!= null)&&(!this.trackingIdentifier.isEmpty()))?this.getTrackingIdentifier():null);
            List<LabelInstructionType> rhsTrackingIdentifier;
            rhsTrackingIdentifier = (((that.trackingIdentifier!= null)&&(!that.trackingIdentifier.isEmpty()))?that.getTrackingIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingIdentifier", lhsTrackingIdentifier), LocatorUtils.property(thatLocator, "trackingIdentifier", rhsTrackingIdentifier), lhsTrackingIdentifier, rhsTrackingIdentifier, ((this.trackingIdentifier!= null)&&(!this.trackingIdentifier.isEmpty())), ((that.trackingIdentifier!= null)&&(!that.trackingIdentifier.isEmpty())))) {
                return false;
            }
        }
        {
            TrackingReference lhsTrackingReference;
            lhsTrackingReference = this.getTrackingReference();
            TrackingReference rhsTrackingReference;
            rhsTrackingReference = that.getTrackingReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingReference", lhsTrackingReference), LocatorUtils.property(thatLocator, "trackingReference", rhsTrackingReference), lhsTrackingReference, rhsTrackingReference, (this.trackingReference!= null), (that.trackingReference!= null))) {
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
            PackageType thePackageType;
            thePackageType = this.getPackageType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageType", thePackageType), currentHashCode, thePackageType, (this.packageType!= null));
        }
        {
            PhysicalDimension thePhysicalDimension;
            thePhysicalDimension = this.getPhysicalDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "physicalDimension", thePhysicalDimension), currentHashCode, thePhysicalDimension, (this.physicalDimension!= null));
        }
        {
            String theShippingContainerIdentifier;
            theShippingContainerIdentifier = this.getShippingContainerIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingContainerIdentifier", theShippingContainerIdentifier), currentHashCode, theShippingContainerIdentifier, (this.shippingContainerIdentifier!= null));
        }
        {
            List<ShippingContainerItemType> theShippingContainerItem;
            theShippingContainerItem = (((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty()))?this.getShippingContainerItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingContainerItem", theShippingContainerItem), currentHashCode, theShippingContainerItem, ((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty())));
        }
        {
            ShippingLabel theShippingLabel;
            theShippingLabel = this.getShippingLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingLabel", theShippingLabel), currentHashCode, theShippingLabel, (this.shippingLabel!= null));
        }
        {
            List<SubContainerType> theSubContainer;
            theSubContainer = (((this.subContainer!= null)&&(!this.subContainer.isEmpty()))?this.getSubContainer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subContainer", theSubContainer), currentHashCode, theSubContainer, ((this.subContainer!= null)&&(!this.subContainer.isEmpty())));
        }
        {
            List<LabelInstructionType> theTrackingIdentifier;
            theTrackingIdentifier = (((this.trackingIdentifier!= null)&&(!this.trackingIdentifier.isEmpty()))?this.getTrackingIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingIdentifier", theTrackingIdentifier), currentHashCode, theTrackingIdentifier, ((this.trackingIdentifier!= null)&&(!this.trackingIdentifier.isEmpty())));
        }
        {
            TrackingReference theTrackingReference;
            theTrackingReference = this.getTrackingReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingReference", theTrackingReference), currentHashCode, theTrackingReference, (this.trackingReference!= null));
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
            PackageType thePackageType;
            thePackageType = this.getPackageType();
            strategy.appendField(locator, this, "packageType", buffer, thePackageType, (this.packageType!= null));
        }
        {
            PhysicalDimension thePhysicalDimension;
            thePhysicalDimension = this.getPhysicalDimension();
            strategy.appendField(locator, this, "physicalDimension", buffer, thePhysicalDimension, (this.physicalDimension!= null));
        }
        {
            String theShippingContainerIdentifier;
            theShippingContainerIdentifier = this.getShippingContainerIdentifier();
            strategy.appendField(locator, this, "shippingContainerIdentifier", buffer, theShippingContainerIdentifier, (this.shippingContainerIdentifier!= null));
        }
        {
            List<ShippingContainerItemType> theShippingContainerItem;
            theShippingContainerItem = (((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty()))?this.getShippingContainerItem():null);
            strategy.appendField(locator, this, "shippingContainerItem", buffer, theShippingContainerItem, ((this.shippingContainerItem!= null)&&(!this.shippingContainerItem.isEmpty())));
        }
        {
            ShippingLabel theShippingLabel;
            theShippingLabel = this.getShippingLabel();
            strategy.appendField(locator, this, "shippingLabel", buffer, theShippingLabel, (this.shippingLabel!= null));
        }
        {
            List<SubContainerType> theSubContainer;
            theSubContainer = (((this.subContainer!= null)&&(!this.subContainer.isEmpty()))?this.getSubContainer():null);
            strategy.appendField(locator, this, "subContainer", buffer, theSubContainer, ((this.subContainer!= null)&&(!this.subContainer.isEmpty())));
        }
        {
            List<LabelInstructionType> theTrackingIdentifier;
            theTrackingIdentifier = (((this.trackingIdentifier!= null)&&(!this.trackingIdentifier.isEmpty()))?this.getTrackingIdentifier():null);
            strategy.appendField(locator, this, "trackingIdentifier", buffer, theTrackingIdentifier, ((this.trackingIdentifier!= null)&&(!this.trackingIdentifier.isEmpty())));
        }
        {
            TrackingReference theTrackingReference;
            theTrackingReference = this.getTrackingReference();
            strategy.appendField(locator, this, "trackingReference", buffer, theTrackingReference, (this.trackingReference!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
