
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.interchange.codelist.measurementtype.v01_02.MeasurementType;
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
 * <p>Java class for MeasurementFeatureReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementFeatureReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AreaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChipPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DieReticlePN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FeatureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LayerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="Orientation" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}OrientationType" minOccurs="0"/&gt;
 *         &lt;element name="Pitch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ProcessRecipe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestStructureLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "MeasurementFeatureReportType", propOrder = {
    "areaType",
    "channelType",
    "chipPN",
    "dieReticlePN",
    "featureType",
    "layerDescription",
    "measurementType",
    "orientation",
    "pitch",
    "primaryIdentifier",
    "processRecipe",
    "testStructureLocation"
})
public class MeasurementFeatureReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AreaType")
    protected String areaType;
    @XmlElement(name = "ChannelType")
    protected String channelType;
    @XmlElement(name = "ChipPN")
    protected String chipPN;
    @XmlElement(name = "DieReticlePN")
    protected String dieReticlePN;
    @XmlElement(name = "FeatureType")
    protected String featureType;
    @XmlElement(name = "LayerDescription")
    protected String layerDescription;
    @XmlElementRef(name = "MeasurementType", namespace = "urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02", type = MeasurementType.class, required = false)
    protected MeasurementType measurementType;
    @XmlElement(name = "Orientation")
    protected OrientationType orientation;
    @XmlElement(name = "Pitch")
    protected String pitch;
    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "ProcessRecipe")
    protected String processRecipe;
    @XmlElement(name = "TestStructureLocation")
    protected String testStructureLocation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the areaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaType() {
        return areaType;
    }

    /**
     * Sets the value of the areaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaType(String value) {
        this.areaType = value;
    }

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelType(String value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the chipPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipPN() {
        return chipPN;
    }

    /**
     * Sets the value of the chipPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipPN(String value) {
        this.chipPN = value;
    }

    /**
     * Gets the value of the dieReticlePN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDieReticlePN() {
        return dieReticlePN;
    }

    /**
     * Sets the value of the dieReticlePN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDieReticlePN(String value) {
        this.dieReticlePN = value;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    /**
     * Gets the value of the layerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayerDescription() {
        return layerDescription;
    }

    /**
     * Sets the value of the layerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayerDescription(String value) {
        this.layerDescription = value;
    }

    /**
     * Gets the value of the measurementType property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMeasurementType() {
        return measurementType;
    }

    /**
     * Sets the value of the measurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMeasurementType(MeasurementType value) {
        this.measurementType = value;
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
     * Gets the value of the pitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPitch() {
        return pitch;
    }

    /**
     * Sets the value of the pitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPitch(String value) {
        this.pitch = value;
    }

    /**
     * Gets the value of the primaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    /**
     * Sets the value of the primaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrimaryIdentifier(BigInteger value) {
        this.primaryIdentifier = value;
    }

    /**
     * Gets the value of the processRecipe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessRecipe() {
        return processRecipe;
    }

    /**
     * Sets the value of the processRecipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessRecipe(String value) {
        this.processRecipe = value;
    }

    /**
     * Gets the value of the testStructureLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestStructureLocation() {
        return testStructureLocation;
    }

    /**
     * Sets the value of the testStructureLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestStructureLocation(String value) {
        this.testStructureLocation = value;
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
        final MeasurementFeatureReportType that = ((MeasurementFeatureReportType) object);
        {
            String lhsAreaType;
            lhsAreaType = this.getAreaType();
            String rhsAreaType;
            rhsAreaType = that.getAreaType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "areaType", lhsAreaType), LocatorUtils.property(thatLocator, "areaType", rhsAreaType), lhsAreaType, rhsAreaType, (this.areaType!= null), (that.areaType!= null))) {
                return false;
            }
        }
        {
            String lhsChannelType;
            lhsChannelType = this.getChannelType();
            String rhsChannelType;
            rhsChannelType = that.getChannelType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "channelType", lhsChannelType), LocatorUtils.property(thatLocator, "channelType", rhsChannelType), lhsChannelType, rhsChannelType, (this.channelType!= null), (that.channelType!= null))) {
                return false;
            }
        }
        {
            String lhsChipPN;
            lhsChipPN = this.getChipPN();
            String rhsChipPN;
            rhsChipPN = that.getChipPN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chipPN", lhsChipPN), LocatorUtils.property(thatLocator, "chipPN", rhsChipPN), lhsChipPN, rhsChipPN, (this.chipPN!= null), (that.chipPN!= null))) {
                return false;
            }
        }
        {
            String lhsDieReticlePN;
            lhsDieReticlePN = this.getDieReticlePN();
            String rhsDieReticlePN;
            rhsDieReticlePN = that.getDieReticlePN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dieReticlePN", lhsDieReticlePN), LocatorUtils.property(thatLocator, "dieReticlePN", rhsDieReticlePN), lhsDieReticlePN, rhsDieReticlePN, (this.dieReticlePN!= null), (that.dieReticlePN!= null))) {
                return false;
            }
        }
        {
            String lhsFeatureType;
            lhsFeatureType = this.getFeatureType();
            String rhsFeatureType;
            rhsFeatureType = that.getFeatureType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureType", lhsFeatureType), LocatorUtils.property(thatLocator, "featureType", rhsFeatureType), lhsFeatureType, rhsFeatureType, (this.featureType!= null), (that.featureType!= null))) {
                return false;
            }
        }
        {
            String lhsLayerDescription;
            lhsLayerDescription = this.getLayerDescription();
            String rhsLayerDescription;
            rhsLayerDescription = that.getLayerDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layerDescription", lhsLayerDescription), LocatorUtils.property(thatLocator, "layerDescription", rhsLayerDescription), lhsLayerDescription, rhsLayerDescription, (this.layerDescription!= null), (that.layerDescription!= null))) {
                return false;
            }
        }
        {
            MeasurementType lhsMeasurementType;
            lhsMeasurementType = this.getMeasurementType();
            MeasurementType rhsMeasurementType;
            rhsMeasurementType = that.getMeasurementType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementType", lhsMeasurementType), LocatorUtils.property(thatLocator, "measurementType", rhsMeasurementType), lhsMeasurementType, rhsMeasurementType, (this.measurementType!= null), (that.measurementType!= null))) {
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
            String lhsPitch;
            lhsPitch = this.getPitch();
            String rhsPitch;
            rhsPitch = that.getPitch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pitch", lhsPitch), LocatorUtils.property(thatLocator, "pitch", rhsPitch), lhsPitch, rhsPitch, (this.pitch!= null), (that.pitch!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsPrimaryIdentifier;
            lhsPrimaryIdentifier = this.getPrimaryIdentifier();
            BigInteger rhsPrimaryIdentifier;
            rhsPrimaryIdentifier = that.getPrimaryIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryIdentifier", lhsPrimaryIdentifier), LocatorUtils.property(thatLocator, "primaryIdentifier", rhsPrimaryIdentifier), lhsPrimaryIdentifier, rhsPrimaryIdentifier, (this.primaryIdentifier!= null), (that.primaryIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsProcessRecipe;
            lhsProcessRecipe = this.getProcessRecipe();
            String rhsProcessRecipe;
            rhsProcessRecipe = that.getProcessRecipe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processRecipe", lhsProcessRecipe), LocatorUtils.property(thatLocator, "processRecipe", rhsProcessRecipe), lhsProcessRecipe, rhsProcessRecipe, (this.processRecipe!= null), (that.processRecipe!= null))) {
                return false;
            }
        }
        {
            String lhsTestStructureLocation;
            lhsTestStructureLocation = this.getTestStructureLocation();
            String rhsTestStructureLocation;
            rhsTestStructureLocation = that.getTestStructureLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testStructureLocation", lhsTestStructureLocation), LocatorUtils.property(thatLocator, "testStructureLocation", rhsTestStructureLocation), lhsTestStructureLocation, rhsTestStructureLocation, (this.testStructureLocation!= null), (that.testStructureLocation!= null))) {
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
            String theAreaType;
            theAreaType = this.getAreaType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "areaType", theAreaType), currentHashCode, theAreaType, (this.areaType!= null));
        }
        {
            String theChannelType;
            theChannelType = this.getChannelType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "channelType", theChannelType), currentHashCode, theChannelType, (this.channelType!= null));
        }
        {
            String theChipPN;
            theChipPN = this.getChipPN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chipPN", theChipPN), currentHashCode, theChipPN, (this.chipPN!= null));
        }
        {
            String theDieReticlePN;
            theDieReticlePN = this.getDieReticlePN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dieReticlePN", theDieReticlePN), currentHashCode, theDieReticlePN, (this.dieReticlePN!= null));
        }
        {
            String theFeatureType;
            theFeatureType = this.getFeatureType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureType", theFeatureType), currentHashCode, theFeatureType, (this.featureType!= null));
        }
        {
            String theLayerDescription;
            theLayerDescription = this.getLayerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "layerDescription", theLayerDescription), currentHashCode, theLayerDescription, (this.layerDescription!= null));
        }
        {
            MeasurementType theMeasurementType;
            theMeasurementType = this.getMeasurementType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementType", theMeasurementType), currentHashCode, theMeasurementType, (this.measurementType!= null));
        }
        {
            OrientationType theOrientation;
            theOrientation = this.getOrientation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orientation", theOrientation), currentHashCode, theOrientation, (this.orientation!= null));
        }
        {
            String thePitch;
            thePitch = this.getPitch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pitch", thePitch), currentHashCode, thePitch, (this.pitch!= null));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryIdentifier", thePrimaryIdentifier), currentHashCode, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            String theProcessRecipe;
            theProcessRecipe = this.getProcessRecipe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processRecipe", theProcessRecipe), currentHashCode, theProcessRecipe, (this.processRecipe!= null));
        }
        {
            String theTestStructureLocation;
            theTestStructureLocation = this.getTestStructureLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testStructureLocation", theTestStructureLocation), currentHashCode, theTestStructureLocation, (this.testStructureLocation!= null));
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
            String theAreaType;
            theAreaType = this.getAreaType();
            strategy.appendField(locator, this, "areaType", buffer, theAreaType, (this.areaType!= null));
        }
        {
            String theChannelType;
            theChannelType = this.getChannelType();
            strategy.appendField(locator, this, "channelType", buffer, theChannelType, (this.channelType!= null));
        }
        {
            String theChipPN;
            theChipPN = this.getChipPN();
            strategy.appendField(locator, this, "chipPN", buffer, theChipPN, (this.chipPN!= null));
        }
        {
            String theDieReticlePN;
            theDieReticlePN = this.getDieReticlePN();
            strategy.appendField(locator, this, "dieReticlePN", buffer, theDieReticlePN, (this.dieReticlePN!= null));
        }
        {
            String theFeatureType;
            theFeatureType = this.getFeatureType();
            strategy.appendField(locator, this, "featureType", buffer, theFeatureType, (this.featureType!= null));
        }
        {
            String theLayerDescription;
            theLayerDescription = this.getLayerDescription();
            strategy.appendField(locator, this, "layerDescription", buffer, theLayerDescription, (this.layerDescription!= null));
        }
        {
            MeasurementType theMeasurementType;
            theMeasurementType = this.getMeasurementType();
            strategy.appendField(locator, this, "measurementType", buffer, theMeasurementType, (this.measurementType!= null));
        }
        {
            OrientationType theOrientation;
            theOrientation = this.getOrientation();
            strategy.appendField(locator, this, "orientation", buffer, theOrientation, (this.orientation!= null));
        }
        {
            String thePitch;
            thePitch = this.getPitch();
            strategy.appendField(locator, this, "pitch", buffer, thePitch, (this.pitch!= null));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            strategy.appendField(locator, this, "primaryIdentifier", buffer, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            String theProcessRecipe;
            theProcessRecipe = this.getProcessRecipe();
            strategy.appendField(locator, this, "processRecipe", buffer, theProcessRecipe, (this.processRecipe!= null));
        }
        {
            String theTestStructureLocation;
            theTestStructureLocation = this.getTestStructureLocation();
            strategy.appendField(locator, this, "testStructureLocation", buffer, theTestStructureLocation, (this.testStructureLocation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
