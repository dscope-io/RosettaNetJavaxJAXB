
package io.dscope.rosettanet.domain.design.design.v02_19;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for RadioactivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadioactivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsotopeNameCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaxActivityLevel" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RadioactivityNote" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.19}NoteType" minOccurs="0"/&gt;
 *         &lt;element name="TypicalActivityLevel" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
@XmlType(name = "RadioactivityType", propOrder = {
    "isotopeNameCode",
    "maxActivityLevel",
    "radioactivityNote",
    "typicalActivityLevel"
})
public class RadioactivityType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "IsotopeNameCode", required = true)
    protected String isotopeNameCode;
    @XmlElement(name = "MaxActivityLevel", required = true)
    protected BigDecimal maxActivityLevel;
    @XmlElement(name = "RadioactivityNote")
    protected String radioactivityNote;
    @XmlElement(name = "TypicalActivityLevel", required = true)
    protected BigDecimal typicalActivityLevel;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isotopeNameCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsotopeNameCode() {
        return isotopeNameCode;
    }

    /**
     * Sets the value of the isotopeNameCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsotopeNameCode(String value) {
        this.isotopeNameCode = value;
    }

    /**
     * Gets the value of the maxActivityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxActivityLevel() {
        return maxActivityLevel;
    }

    /**
     * Sets the value of the maxActivityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxActivityLevel(BigDecimal value) {
        this.maxActivityLevel = value;
    }

    /**
     * Gets the value of the radioactivityNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioactivityNote() {
        return radioactivityNote;
    }

    /**
     * Sets the value of the radioactivityNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioactivityNote(String value) {
        this.radioactivityNote = value;
    }

    /**
     * Gets the value of the typicalActivityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTypicalActivityLevel() {
        return typicalActivityLevel;
    }

    /**
     * Sets the value of the typicalActivityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTypicalActivityLevel(BigDecimal value) {
        this.typicalActivityLevel = value;
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
        final RadioactivityType that = ((RadioactivityType) object);
        {
            String lhsIsotopeNameCode;
            lhsIsotopeNameCode = this.getIsotopeNameCode();
            String rhsIsotopeNameCode;
            rhsIsotopeNameCode = that.getIsotopeNameCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isotopeNameCode", lhsIsotopeNameCode), LocatorUtils.property(thatLocator, "isotopeNameCode", rhsIsotopeNameCode), lhsIsotopeNameCode, rhsIsotopeNameCode, (this.isotopeNameCode!= null), (that.isotopeNameCode!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMaxActivityLevel;
            lhsMaxActivityLevel = this.getMaxActivityLevel();
            BigDecimal rhsMaxActivityLevel;
            rhsMaxActivityLevel = that.getMaxActivityLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxActivityLevel", lhsMaxActivityLevel), LocatorUtils.property(thatLocator, "maxActivityLevel", rhsMaxActivityLevel), lhsMaxActivityLevel, rhsMaxActivityLevel, (this.maxActivityLevel!= null), (that.maxActivityLevel!= null))) {
                return false;
            }
        }
        {
            String lhsRadioactivityNote;
            lhsRadioactivityNote = this.getRadioactivityNote();
            String rhsRadioactivityNote;
            rhsRadioactivityNote = that.getRadioactivityNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "radioactivityNote", lhsRadioactivityNote), LocatorUtils.property(thatLocator, "radioactivityNote", rhsRadioactivityNote), lhsRadioactivityNote, rhsRadioactivityNote, (this.radioactivityNote!= null), (that.radioactivityNote!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTypicalActivityLevel;
            lhsTypicalActivityLevel = this.getTypicalActivityLevel();
            BigDecimal rhsTypicalActivityLevel;
            rhsTypicalActivityLevel = that.getTypicalActivityLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typicalActivityLevel", lhsTypicalActivityLevel), LocatorUtils.property(thatLocator, "typicalActivityLevel", rhsTypicalActivityLevel), lhsTypicalActivityLevel, rhsTypicalActivityLevel, (this.typicalActivityLevel!= null), (that.typicalActivityLevel!= null))) {
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
            String theIsotopeNameCode;
            theIsotopeNameCode = this.getIsotopeNameCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isotopeNameCode", theIsotopeNameCode), currentHashCode, theIsotopeNameCode, (this.isotopeNameCode!= null));
        }
        {
            BigDecimal theMaxActivityLevel;
            theMaxActivityLevel = this.getMaxActivityLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxActivityLevel", theMaxActivityLevel), currentHashCode, theMaxActivityLevel, (this.maxActivityLevel!= null));
        }
        {
            String theRadioactivityNote;
            theRadioactivityNote = this.getRadioactivityNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "radioactivityNote", theRadioactivityNote), currentHashCode, theRadioactivityNote, (this.radioactivityNote!= null));
        }
        {
            BigDecimal theTypicalActivityLevel;
            theTypicalActivityLevel = this.getTypicalActivityLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typicalActivityLevel", theTypicalActivityLevel), currentHashCode, theTypicalActivityLevel, (this.typicalActivityLevel!= null));
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
            String theIsotopeNameCode;
            theIsotopeNameCode = this.getIsotopeNameCode();
            strategy.appendField(locator, this, "isotopeNameCode", buffer, theIsotopeNameCode, (this.isotopeNameCode!= null));
        }
        {
            BigDecimal theMaxActivityLevel;
            theMaxActivityLevel = this.getMaxActivityLevel();
            strategy.appendField(locator, this, "maxActivityLevel", buffer, theMaxActivityLevel, (this.maxActivityLevel!= null));
        }
        {
            String theRadioactivityNote;
            theRadioactivityNote = this.getRadioactivityNote();
            strategy.appendField(locator, this, "radioactivityNote", buffer, theRadioactivityNote, (this.radioactivityNote!= null));
        }
        {
            BigDecimal theTypicalActivityLevel;
            theTypicalActivityLevel = this.getTypicalActivityLevel();
            strategy.appendField(locator, this, "typicalActivityLevel", buffer, theTypicalActivityLevel, (this.typicalActivityLevel!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
