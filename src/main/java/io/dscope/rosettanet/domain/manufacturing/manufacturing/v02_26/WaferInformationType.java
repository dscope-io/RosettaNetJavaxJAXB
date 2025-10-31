
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.rawwafertype.v01_03.RawWaferType;
import io.dscope.rosettanet.domain.manufacturing.codelist.waferqualityrating.v01_03.WaferQualityRatingType;
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
 * <p>Java class for WaferInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaferInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Grade" type="{urn:rosettanet:specification:domain:Manufacturing:WaferQualityRating:xsd:codelist:01.03}WaferQualityRatingType"/&gt;
 *         &lt;element name="MappingFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryWaferIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:RawWaferType:xsd:codelist:01.03}RawWaferType" minOccurs="0"/&gt;
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
@XmlType(name = "WaferInformationType", propOrder = {
    "grade",
    "mappingFileName",
    "primaryWaferIdentifier",
    "rawWaferType"
})
public class WaferInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Grade", required = true)
    protected WaferQualityRatingType grade;
    @XmlElement(name = "MappingFileName")
    protected String mappingFileName;
    @XmlElement(name = "PrimaryWaferIdentifier", required = true)
    protected String primaryWaferIdentifier;
    @XmlElementRef(name = "RawWaferType", namespace = "urn:rosettanet:specification:domain:Manufacturing:RawWaferType:xsd:codelist:01.03", type = RawWaferType.class, required = false)
    protected RawWaferType rawWaferType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link WaferQualityRatingType }
     *     
     */
    public WaferQualityRatingType getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferQualityRatingType }
     *     
     */
    public void setGrade(WaferQualityRatingType value) {
        this.grade = value;
    }

    /**
     * Gets the value of the mappingFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingFileName() {
        return mappingFileName;
    }

    /**
     * Sets the value of the mappingFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingFileName(String value) {
        this.mappingFileName = value;
    }

    /**
     * Gets the value of the primaryWaferIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryWaferIdentifier() {
        return primaryWaferIdentifier;
    }

    /**
     * Sets the value of the primaryWaferIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryWaferIdentifier(String value) {
        this.primaryWaferIdentifier = value;
    }

    /**
     * Gets the value of the rawWaferType property.
     * 
     * @return
     *     possible object is
     *     {@link RawWaferType }
     *     
     */
    public RawWaferType getRawWaferType() {
        return rawWaferType;
    }

    /**
     * Sets the value of the rawWaferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RawWaferType }
     *     
     */
    public void setRawWaferType(RawWaferType value) {
        this.rawWaferType = value;
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
        final WaferInformationType that = ((WaferInformationType) object);
        {
            WaferQualityRatingType lhsGrade;
            lhsGrade = this.getGrade();
            WaferQualityRatingType rhsGrade;
            rhsGrade = that.getGrade();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grade", lhsGrade), LocatorUtils.property(thatLocator, "grade", rhsGrade), lhsGrade, rhsGrade, (this.grade!= null), (that.grade!= null))) {
                return false;
            }
        }
        {
            String lhsMappingFileName;
            lhsMappingFileName = this.getMappingFileName();
            String rhsMappingFileName;
            rhsMappingFileName = that.getMappingFileName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mappingFileName", lhsMappingFileName), LocatorUtils.property(thatLocator, "mappingFileName", rhsMappingFileName), lhsMappingFileName, rhsMappingFileName, (this.mappingFileName!= null), (that.mappingFileName!= null))) {
                return false;
            }
        }
        {
            String lhsPrimaryWaferIdentifier;
            lhsPrimaryWaferIdentifier = this.getPrimaryWaferIdentifier();
            String rhsPrimaryWaferIdentifier;
            rhsPrimaryWaferIdentifier = that.getPrimaryWaferIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryWaferIdentifier", lhsPrimaryWaferIdentifier), LocatorUtils.property(thatLocator, "primaryWaferIdentifier", rhsPrimaryWaferIdentifier), lhsPrimaryWaferIdentifier, rhsPrimaryWaferIdentifier, (this.primaryWaferIdentifier!= null), (that.primaryWaferIdentifier!= null))) {
                return false;
            }
        }
        {
            RawWaferType lhsRawWaferType;
            lhsRawWaferType = this.getRawWaferType();
            RawWaferType rhsRawWaferType;
            rhsRawWaferType = that.getRawWaferType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rawWaferType", lhsRawWaferType), LocatorUtils.property(thatLocator, "rawWaferType", rhsRawWaferType), lhsRawWaferType, rhsRawWaferType, (this.rawWaferType!= null), (that.rawWaferType!= null))) {
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
            WaferQualityRatingType theGrade;
            theGrade = this.getGrade();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grade", theGrade), currentHashCode, theGrade, (this.grade!= null));
        }
        {
            String theMappingFileName;
            theMappingFileName = this.getMappingFileName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mappingFileName", theMappingFileName), currentHashCode, theMappingFileName, (this.mappingFileName!= null));
        }
        {
            String thePrimaryWaferIdentifier;
            thePrimaryWaferIdentifier = this.getPrimaryWaferIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryWaferIdentifier", thePrimaryWaferIdentifier), currentHashCode, thePrimaryWaferIdentifier, (this.primaryWaferIdentifier!= null));
        }
        {
            RawWaferType theRawWaferType;
            theRawWaferType = this.getRawWaferType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rawWaferType", theRawWaferType), currentHashCode, theRawWaferType, (this.rawWaferType!= null));
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
            WaferQualityRatingType theGrade;
            theGrade = this.getGrade();
            strategy.appendField(locator, this, "grade", buffer, theGrade, (this.grade!= null));
        }
        {
            String theMappingFileName;
            theMappingFileName = this.getMappingFileName();
            strategy.appendField(locator, this, "mappingFileName", buffer, theMappingFileName, (this.mappingFileName!= null));
        }
        {
            String thePrimaryWaferIdentifier;
            thePrimaryWaferIdentifier = this.getPrimaryWaferIdentifier();
            strategy.appendField(locator, this, "primaryWaferIdentifier", buffer, thePrimaryWaferIdentifier, (this.primaryWaferIdentifier!= null));
        }
        {
            RawWaferType theRawWaferType;
            theRawWaferType = this.getRawWaferType();
            strategy.appendField(locator, this, "rawWaferType", buffer, theRawWaferType, (this.rawWaferType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
