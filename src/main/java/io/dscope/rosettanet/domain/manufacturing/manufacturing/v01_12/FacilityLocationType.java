
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03.BALocationType;
import io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03.FabLocationType;
import io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03.FinalTestLocationType;
import io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03.OtherLocationType;
import io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03.WaferSortLocationType;
import io.dscope.rosettanet.universal.locations.v01_02.Location;
import io.dscope.rosettanet.universal.locations.v01_02.PhysicalAddress;
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
 * <p>Java class for FacilityLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalWorkInProcessLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.02}Location" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.02}PhysicalAddress" minOccurs="0"/&gt;
 *         &lt;element name="ProprietaryLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FacilityLocationType", propOrder = {
    "globalWorkInProcessLocationCode",
    "location",
    "physicalAddress",
    "proprietaryLabel"
})
@XmlSeeAlso({
    BALocationType.class,
    FabLocationType.class,
    FinalTestLocationType.class,
    OtherLocationType.class,
    WaferSortLocationType.class
})
public class FacilityLocationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "GlobalWorkInProcessLocationCode")
    protected String globalWorkInProcessLocationCode;
    @XmlElementRef(name = "Location", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.02", type = Location.class, required = false)
    protected Location location;
    @XmlElementRef(name = "PhysicalAddress", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.02", type = PhysicalAddress.class, required = false)
    protected PhysicalAddress physicalAddress;
    @XmlElement(name = "ProprietaryLabel")
    protected String proprietaryLabel;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the globalWorkInProcessLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalWorkInProcessLocationCode() {
        return globalWorkInProcessLocationCode;
    }

    /**
     * Sets the value of the globalWorkInProcessLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalWorkInProcessLocationCode(String value) {
        this.globalWorkInProcessLocationCode = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setPhysicalAddress(PhysicalAddress value) {
        this.physicalAddress = value;
    }

    /**
     * Gets the value of the proprietaryLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryLabel() {
        return proprietaryLabel;
    }

    /**
     * Sets the value of the proprietaryLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryLabel(String value) {
        this.proprietaryLabel = value;
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
        final FacilityLocationType that = ((FacilityLocationType) object);
        {
            String lhsGlobalWorkInProcessLocationCode;
            lhsGlobalWorkInProcessLocationCode = this.getGlobalWorkInProcessLocationCode();
            String rhsGlobalWorkInProcessLocationCode;
            rhsGlobalWorkInProcessLocationCode = that.getGlobalWorkInProcessLocationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "globalWorkInProcessLocationCode", lhsGlobalWorkInProcessLocationCode), LocatorUtils.property(thatLocator, "globalWorkInProcessLocationCode", rhsGlobalWorkInProcessLocationCode), lhsGlobalWorkInProcessLocationCode, rhsGlobalWorkInProcessLocationCode, (this.globalWorkInProcessLocationCode!= null), (that.globalWorkInProcessLocationCode!= null))) {
                return false;
            }
        }
        {
            Location lhsLocation;
            lhsLocation = this.getLocation();
            Location rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation, (this.location!= null), (that.location!= null))) {
                return false;
            }
        }
        {
            PhysicalAddress lhsPhysicalAddress;
            lhsPhysicalAddress = this.getPhysicalAddress();
            PhysicalAddress rhsPhysicalAddress;
            rhsPhysicalAddress = that.getPhysicalAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "physicalAddress", lhsPhysicalAddress), LocatorUtils.property(thatLocator, "physicalAddress", rhsPhysicalAddress), lhsPhysicalAddress, rhsPhysicalAddress, (this.physicalAddress!= null), (that.physicalAddress!= null))) {
                return false;
            }
        }
        {
            String lhsProprietaryLabel;
            lhsProprietaryLabel = this.getProprietaryLabel();
            String rhsProprietaryLabel;
            rhsProprietaryLabel = that.getProprietaryLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "proprietaryLabel", lhsProprietaryLabel), LocatorUtils.property(thatLocator, "proprietaryLabel", rhsProprietaryLabel), lhsProprietaryLabel, rhsProprietaryLabel, (this.proprietaryLabel!= null), (that.proprietaryLabel!= null))) {
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
            String theGlobalWorkInProcessLocationCode;
            theGlobalWorkInProcessLocationCode = this.getGlobalWorkInProcessLocationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "globalWorkInProcessLocationCode", theGlobalWorkInProcessLocationCode), currentHashCode, theGlobalWorkInProcessLocationCode, (this.globalWorkInProcessLocationCode!= null));
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation, (this.location!= null));
        }
        {
            PhysicalAddress thePhysicalAddress;
            thePhysicalAddress = this.getPhysicalAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "physicalAddress", thePhysicalAddress), currentHashCode, thePhysicalAddress, (this.physicalAddress!= null));
        }
        {
            String theProprietaryLabel;
            theProprietaryLabel = this.getProprietaryLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "proprietaryLabel", theProprietaryLabel), currentHashCode, theProprietaryLabel, (this.proprietaryLabel!= null));
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
            String theGlobalWorkInProcessLocationCode;
            theGlobalWorkInProcessLocationCode = this.getGlobalWorkInProcessLocationCode();
            strategy.appendField(locator, this, "globalWorkInProcessLocationCode", buffer, theGlobalWorkInProcessLocationCode, (this.globalWorkInProcessLocationCode!= null));
        }
        {
            Location theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation, (this.location!= null));
        }
        {
            PhysicalAddress thePhysicalAddress;
            thePhysicalAddress = this.getPhysicalAddress();
            strategy.appendField(locator, this, "physicalAddress", buffer, thePhysicalAddress, (this.physicalAddress!= null));
        }
        {
            String theProprietaryLabel;
            theProprietaryLabel = this.getProprietaryLabel();
            strategy.appendField(locator, this, "proprietaryLabel", buffer, theProprietaryLabel, (this.proprietaryLabel!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
