
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.waferbacksidefinish.v01_04.WaferBackSideFinish;
import io.dscope.rosettanet.domain.manufacturing.codelist.waferpassivation.v01_04.WaferPassivation;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasureType;
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
 * <p>Java class for WaferBacksideInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaferBacksideInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsWaferBackGrind" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WaferBackGrindFinalThickness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="WaferBackGrindFinalThicknessUOM" type="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasureType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:WaferBackSideFinish:xsd:codelist:01.04}WaferBackSideFinish" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:WaferPassivation:xsd:codelist:01.04}WaferPassivation" minOccurs="0"/&gt;
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
@XmlType(name = "WaferBacksideInformationType", propOrder = {
    "isWaferBackGrind",
    "waferBackGrindFinalThickness",
    "waferBackGrindFinalThicknessUOM",
    "waferBackSideFinish",
    "waferPassivation"
})
public class WaferBacksideInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "IsWaferBackGrind")
    protected Boolean isWaferBackGrind;
    @XmlElement(name = "WaferBackGrindFinalThickness")
    protected Float waferBackGrindFinalThickness;
    @XmlElement(name = "WaferBackGrindFinalThicknessUOM")
    protected UnitOfMeasureType waferBackGrindFinalThicknessUOM;
    @XmlElementRef(name = "WaferBackSideFinish", namespace = "urn:rosettanet:specification:domain:Manufacturing:WaferBackSideFinish:xsd:codelist:01.04", type = WaferBackSideFinish.class, required = false)
    protected WaferBackSideFinish waferBackSideFinish;
    @XmlElementRef(name = "WaferPassivation", namespace = "urn:rosettanet:specification:domain:Manufacturing:WaferPassivation:xsd:codelist:01.04", type = WaferPassivation.class, required = false)
    protected WaferPassivation waferPassivation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isWaferBackGrind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWaferBackGrind() {
        return isWaferBackGrind;
    }

    /**
     * Sets the value of the isWaferBackGrind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWaferBackGrind(Boolean value) {
        this.isWaferBackGrind = value;
    }

    /**
     * Gets the value of the waferBackGrindFinalThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWaferBackGrindFinalThickness() {
        return waferBackGrindFinalThickness;
    }

    /**
     * Sets the value of the waferBackGrindFinalThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWaferBackGrindFinalThickness(Float value) {
        this.waferBackGrindFinalThickness = value;
    }

    /**
     * Gets the value of the waferBackGrindFinalThicknessUOM property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getWaferBackGrindFinalThicknessUOM() {
        return waferBackGrindFinalThicknessUOM;
    }

    /**
     * Sets the value of the waferBackGrindFinalThicknessUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setWaferBackGrindFinalThicknessUOM(UnitOfMeasureType value) {
        this.waferBackGrindFinalThicknessUOM = value;
    }

    /**
     * Gets the value of the waferBackSideFinish property.
     * 
     * @return
     *     possible object is
     *     {@link WaferBackSideFinish }
     *     
     */
    public WaferBackSideFinish getWaferBackSideFinish() {
        return waferBackSideFinish;
    }

    /**
     * Sets the value of the waferBackSideFinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferBackSideFinish }
     *     
     */
    public void setWaferBackSideFinish(WaferBackSideFinish value) {
        this.waferBackSideFinish = value;
    }

    /**
     * Gets the value of the waferPassivation property.
     * 
     * @return
     *     possible object is
     *     {@link WaferPassivation }
     *     
     */
    public WaferPassivation getWaferPassivation() {
        return waferPassivation;
    }

    /**
     * Sets the value of the waferPassivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferPassivation }
     *     
     */
    public void setWaferPassivation(WaferPassivation value) {
        this.waferPassivation = value;
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
        final WaferBacksideInformationType that = ((WaferBacksideInformationType) object);
        {
            Boolean lhsIsWaferBackGrind;
            lhsIsWaferBackGrind = this.isIsWaferBackGrind();
            Boolean rhsIsWaferBackGrind;
            rhsIsWaferBackGrind = that.isIsWaferBackGrind();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isWaferBackGrind", lhsIsWaferBackGrind), LocatorUtils.property(thatLocator, "isWaferBackGrind", rhsIsWaferBackGrind), lhsIsWaferBackGrind, rhsIsWaferBackGrind, (this.isWaferBackGrind!= null), (that.isWaferBackGrind!= null))) {
                return false;
            }
        }
        {
            Float lhsWaferBackGrindFinalThickness;
            lhsWaferBackGrindFinalThickness = this.getWaferBackGrindFinalThickness();
            Float rhsWaferBackGrindFinalThickness;
            rhsWaferBackGrindFinalThickness = that.getWaferBackGrindFinalThickness();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferBackGrindFinalThickness", lhsWaferBackGrindFinalThickness), LocatorUtils.property(thatLocator, "waferBackGrindFinalThickness", rhsWaferBackGrindFinalThickness), lhsWaferBackGrindFinalThickness, rhsWaferBackGrindFinalThickness, (this.waferBackGrindFinalThickness!= null), (that.waferBackGrindFinalThickness!= null))) {
                return false;
            }
        }
        {
            UnitOfMeasureType lhsWaferBackGrindFinalThicknessUOM;
            lhsWaferBackGrindFinalThicknessUOM = this.getWaferBackGrindFinalThicknessUOM();
            UnitOfMeasureType rhsWaferBackGrindFinalThicknessUOM;
            rhsWaferBackGrindFinalThicknessUOM = that.getWaferBackGrindFinalThicknessUOM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferBackGrindFinalThicknessUOM", lhsWaferBackGrindFinalThicknessUOM), LocatorUtils.property(thatLocator, "waferBackGrindFinalThicknessUOM", rhsWaferBackGrindFinalThicknessUOM), lhsWaferBackGrindFinalThicknessUOM, rhsWaferBackGrindFinalThicknessUOM, (this.waferBackGrindFinalThicknessUOM!= null), (that.waferBackGrindFinalThicknessUOM!= null))) {
                return false;
            }
        }
        {
            WaferBackSideFinish lhsWaferBackSideFinish;
            lhsWaferBackSideFinish = this.getWaferBackSideFinish();
            WaferBackSideFinish rhsWaferBackSideFinish;
            rhsWaferBackSideFinish = that.getWaferBackSideFinish();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferBackSideFinish", lhsWaferBackSideFinish), LocatorUtils.property(thatLocator, "waferBackSideFinish", rhsWaferBackSideFinish), lhsWaferBackSideFinish, rhsWaferBackSideFinish, (this.waferBackSideFinish!= null), (that.waferBackSideFinish!= null))) {
                return false;
            }
        }
        {
            WaferPassivation lhsWaferPassivation;
            lhsWaferPassivation = this.getWaferPassivation();
            WaferPassivation rhsWaferPassivation;
            rhsWaferPassivation = that.getWaferPassivation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferPassivation", lhsWaferPassivation), LocatorUtils.property(thatLocator, "waferPassivation", rhsWaferPassivation), lhsWaferPassivation, rhsWaferPassivation, (this.waferPassivation!= null), (that.waferPassivation!= null))) {
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
            Boolean theIsWaferBackGrind;
            theIsWaferBackGrind = this.isIsWaferBackGrind();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isWaferBackGrind", theIsWaferBackGrind), currentHashCode, theIsWaferBackGrind, (this.isWaferBackGrind!= null));
        }
        {
            Float theWaferBackGrindFinalThickness;
            theWaferBackGrindFinalThickness = this.getWaferBackGrindFinalThickness();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferBackGrindFinalThickness", theWaferBackGrindFinalThickness), currentHashCode, theWaferBackGrindFinalThickness, (this.waferBackGrindFinalThickness!= null));
        }
        {
            UnitOfMeasureType theWaferBackGrindFinalThicknessUOM;
            theWaferBackGrindFinalThicknessUOM = this.getWaferBackGrindFinalThicknessUOM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferBackGrindFinalThicknessUOM", theWaferBackGrindFinalThicknessUOM), currentHashCode, theWaferBackGrindFinalThicknessUOM, (this.waferBackGrindFinalThicknessUOM!= null));
        }
        {
            WaferBackSideFinish theWaferBackSideFinish;
            theWaferBackSideFinish = this.getWaferBackSideFinish();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferBackSideFinish", theWaferBackSideFinish), currentHashCode, theWaferBackSideFinish, (this.waferBackSideFinish!= null));
        }
        {
            WaferPassivation theWaferPassivation;
            theWaferPassivation = this.getWaferPassivation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferPassivation", theWaferPassivation), currentHashCode, theWaferPassivation, (this.waferPassivation!= null));
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
            Boolean theIsWaferBackGrind;
            theIsWaferBackGrind = this.isIsWaferBackGrind();
            strategy.appendField(locator, this, "isWaferBackGrind", buffer, theIsWaferBackGrind, (this.isWaferBackGrind!= null));
        }
        {
            Float theWaferBackGrindFinalThickness;
            theWaferBackGrindFinalThickness = this.getWaferBackGrindFinalThickness();
            strategy.appendField(locator, this, "waferBackGrindFinalThickness", buffer, theWaferBackGrindFinalThickness, (this.waferBackGrindFinalThickness!= null));
        }
        {
            UnitOfMeasureType theWaferBackGrindFinalThicknessUOM;
            theWaferBackGrindFinalThicknessUOM = this.getWaferBackGrindFinalThicknessUOM();
            strategy.appendField(locator, this, "waferBackGrindFinalThicknessUOM", buffer, theWaferBackGrindFinalThicknessUOM, (this.waferBackGrindFinalThicknessUOM!= null));
        }
        {
            WaferBackSideFinish theWaferBackSideFinish;
            theWaferBackSideFinish = this.getWaferBackSideFinish();
            strategy.appendField(locator, this, "waferBackSideFinish", buffer, theWaferBackSideFinish, (this.waferBackSideFinish!= null));
        }
        {
            WaferPassivation theWaferPassivation;
            theWaferPassivation = this.getWaferPassivation();
            strategy.appendField(locator, this, "waferPassivation", buffer, theWaferPassivation, (this.waferPassivation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
