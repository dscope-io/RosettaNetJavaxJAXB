
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_05;

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
import io.dscope.rosettanet.domain.logistics.codelist.containerspecification.v01_01.ContainerSpecification;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.PhysicalDimensionType;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.TrackingReference;
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
 *         &lt;element name="ContainerPhysicalDimension" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}PhysicalDimensionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ContainerSpecification:xsd:codelist:01.01}ContainerSpecification" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01}PackageType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingCartonIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainerItem" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}ShippingContainerItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubContainer" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}SubContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}TrackingReference" minOccurs="0"/&gt;
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
    "containerPhysicalDimension",
    "containerSpecification",
    "identifier",
    "packageType",
    "shippingCartonIdentifier",
    "shippingContainerItem",
    "subContainer",
    "trackingReference"
})
public class ShippingContainerType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ContainerPhysicalDimension")
    protected PhysicalDimensionType containerPhysicalDimension;
    @XmlElementRef(name = "ContainerSpecification", namespace = "urn:rosettanet:specification:domain:Logistics:ContainerSpecification:xsd:codelist:01.01", type = ContainerSpecification.class, required = false)
    protected ContainerSpecification containerSpecification;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElementRef(name = "PackageType", namespace = "urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01", type = PackageType.class, required = false)
    protected PackageType packageType;
    @XmlElement(name = "ShippingCartonIdentifier")
    protected String shippingCartonIdentifier;
    @XmlElement(name = "ShippingContainerItem")
    protected List<ShippingContainerItemType> shippingContainerItem;
    @XmlElement(name = "SubContainer")
    protected List<SubContainerType> subContainer;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = TrackingReference.class, required = false)
    protected TrackingReference trackingReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the containerPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDimensionType }
     *     
     */
    public PhysicalDimensionType getContainerPhysicalDimension() {
        return containerPhysicalDimension;
    }

    /**
     * Sets the value of the containerPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDimensionType }
     *     
     */
    public void setContainerPhysicalDimension(PhysicalDimensionType value) {
        this.containerPhysicalDimension = value;
    }

    /**
     * Gets the value of the containerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerSpecification }
     *     
     */
    public ContainerSpecification getContainerSpecification() {
        return containerSpecification;
    }

    /**
     * Sets the value of the containerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerSpecification }
     *     
     */
    public void setContainerSpecification(ContainerSpecification value) {
        this.containerSpecification = value;
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
     * Gets the value of the shippingCartonIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCartonIdentifier() {
        return shippingCartonIdentifier;
    }

    /**
     * Sets the value of the shippingCartonIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCartonIdentifier(String value) {
        this.shippingCartonIdentifier = value;
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
            PhysicalDimensionType lhsContainerPhysicalDimension;
            lhsContainerPhysicalDimension = this.getContainerPhysicalDimension();
            PhysicalDimensionType rhsContainerPhysicalDimension;
            rhsContainerPhysicalDimension = that.getContainerPhysicalDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containerPhysicalDimension", lhsContainerPhysicalDimension), LocatorUtils.property(thatLocator, "containerPhysicalDimension", rhsContainerPhysicalDimension), lhsContainerPhysicalDimension, rhsContainerPhysicalDimension, (this.containerPhysicalDimension!= null), (that.containerPhysicalDimension!= null))) {
                return false;
            }
        }
        {
            ContainerSpecification lhsContainerSpecification;
            lhsContainerSpecification = this.getContainerSpecification();
            ContainerSpecification rhsContainerSpecification;
            rhsContainerSpecification = that.getContainerSpecification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containerSpecification", lhsContainerSpecification), LocatorUtils.property(thatLocator, "containerSpecification", rhsContainerSpecification), lhsContainerSpecification, rhsContainerSpecification, (this.containerSpecification!= null), (that.containerSpecification!= null))) {
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
            PackageType lhsPackageType;
            lhsPackageType = this.getPackageType();
            PackageType rhsPackageType;
            rhsPackageType = that.getPackageType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageType", lhsPackageType), LocatorUtils.property(thatLocator, "packageType", rhsPackageType), lhsPackageType, rhsPackageType, (this.packageType!= null), (that.packageType!= null))) {
                return false;
            }
        }
        {
            String lhsShippingCartonIdentifier;
            lhsShippingCartonIdentifier = this.getShippingCartonIdentifier();
            String rhsShippingCartonIdentifier;
            rhsShippingCartonIdentifier = that.getShippingCartonIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingCartonIdentifier", lhsShippingCartonIdentifier), LocatorUtils.property(thatLocator, "shippingCartonIdentifier", rhsShippingCartonIdentifier), lhsShippingCartonIdentifier, rhsShippingCartonIdentifier, (this.shippingCartonIdentifier!= null), (that.shippingCartonIdentifier!= null))) {
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
            PhysicalDimensionType theContainerPhysicalDimension;
            theContainerPhysicalDimension = this.getContainerPhysicalDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerPhysicalDimension", theContainerPhysicalDimension), currentHashCode, theContainerPhysicalDimension, (this.containerPhysicalDimension!= null));
        }
        {
            ContainerSpecification theContainerSpecification;
            theContainerSpecification = this.getContainerSpecification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerSpecification", theContainerSpecification), currentHashCode, theContainerSpecification, (this.containerSpecification!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            PackageType thePackageType;
            thePackageType = this.getPackageType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageType", thePackageType), currentHashCode, thePackageType, (this.packageType!= null));
        }
        {
            String theShippingCartonIdentifier;
            theShippingCartonIdentifier = this.getShippingCartonIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingCartonIdentifier", theShippingCartonIdentifier), currentHashCode, theShippingCartonIdentifier, (this.shippingCartonIdentifier!= null));
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
            PhysicalDimensionType theContainerPhysicalDimension;
            theContainerPhysicalDimension = this.getContainerPhysicalDimension();
            strategy.appendField(locator, this, "containerPhysicalDimension", buffer, theContainerPhysicalDimension, (this.containerPhysicalDimension!= null));
        }
        {
            ContainerSpecification theContainerSpecification;
            theContainerSpecification = this.getContainerSpecification();
            strategy.appendField(locator, this, "containerSpecification", buffer, theContainerSpecification, (this.containerSpecification!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            PackageType thePackageType;
            thePackageType = this.getPackageType();
            strategy.appendField(locator, this, "packageType", buffer, thePackageType, (this.packageType!= null));
        }
        {
            String theShippingCartonIdentifier;
            theShippingCartonIdentifier = this.getShippingCartonIdentifier();
            strategy.appendField(locator, this, "shippingCartonIdentifier", buffer, theShippingCartonIdentifier, (this.shippingCartonIdentifier!= null));
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
