
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for WaferLotQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaferLotQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GoodDieQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="GoodDieQuantityUOM" type="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="WaferQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="WaferQuantityUOM" type="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasureType"/&gt;
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
@XmlType(name = "WaferLotQuantityType", propOrder = {
    "goodDieQuantity",
    "goodDieQuantityUOM",
    "waferQuantity",
    "waferQuantityUOM"
})
public class WaferLotQuantityType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "GoodDieQuantity")
    protected Float goodDieQuantity;
    @XmlElement(name = "GoodDieQuantityUOM")
    protected UnitOfMeasureType goodDieQuantityUOM;
    @XmlElement(name = "WaferQuantity")
    protected float waferQuantity;
    @XmlElement(name = "WaferQuantityUOM", required = true)
    protected UnitOfMeasureType waferQuantityUOM;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the goodDieQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGoodDieQuantity() {
        return goodDieQuantity;
    }

    /**
     * Sets the value of the goodDieQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGoodDieQuantity(Float value) {
        this.goodDieQuantity = value;
    }

    /**
     * Gets the value of the goodDieQuantityUOM property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getGoodDieQuantityUOM() {
        return goodDieQuantityUOM;
    }

    /**
     * Sets the value of the goodDieQuantityUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setGoodDieQuantityUOM(UnitOfMeasureType value) {
        this.goodDieQuantityUOM = value;
    }

    /**
     * Gets the value of the waferQuantity property.
     * 
     */
    public float getWaferQuantity() {
        return waferQuantity;
    }

    /**
     * Sets the value of the waferQuantity property.
     * 
     */
    public void setWaferQuantity(float value) {
        this.waferQuantity = value;
    }

    /**
     * Gets the value of the waferQuantityUOM property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getWaferQuantityUOM() {
        return waferQuantityUOM;
    }

    /**
     * Sets the value of the waferQuantityUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setWaferQuantityUOM(UnitOfMeasureType value) {
        this.waferQuantityUOM = value;
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
        final WaferLotQuantityType that = ((WaferLotQuantityType) object);
        {
            Float lhsGoodDieQuantity;
            lhsGoodDieQuantity = this.getGoodDieQuantity();
            Float rhsGoodDieQuantity;
            rhsGoodDieQuantity = that.getGoodDieQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goodDieQuantity", lhsGoodDieQuantity), LocatorUtils.property(thatLocator, "goodDieQuantity", rhsGoodDieQuantity), lhsGoodDieQuantity, rhsGoodDieQuantity, (this.goodDieQuantity!= null), (that.goodDieQuantity!= null))) {
                return false;
            }
        }
        {
            UnitOfMeasureType lhsGoodDieQuantityUOM;
            lhsGoodDieQuantityUOM = this.getGoodDieQuantityUOM();
            UnitOfMeasureType rhsGoodDieQuantityUOM;
            rhsGoodDieQuantityUOM = that.getGoodDieQuantityUOM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goodDieQuantityUOM", lhsGoodDieQuantityUOM), LocatorUtils.property(thatLocator, "goodDieQuantityUOM", rhsGoodDieQuantityUOM), lhsGoodDieQuantityUOM, rhsGoodDieQuantityUOM, (this.goodDieQuantityUOM!= null), (that.goodDieQuantityUOM!= null))) {
                return false;
            }
        }
        {
            float lhsWaferQuantity;
            lhsWaferQuantity = this.getWaferQuantity();
            float rhsWaferQuantity;
            rhsWaferQuantity = that.getWaferQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferQuantity", lhsWaferQuantity), LocatorUtils.property(thatLocator, "waferQuantity", rhsWaferQuantity), lhsWaferQuantity, rhsWaferQuantity, true, true)) {
                return false;
            }
        }
        {
            UnitOfMeasureType lhsWaferQuantityUOM;
            lhsWaferQuantityUOM = this.getWaferQuantityUOM();
            UnitOfMeasureType rhsWaferQuantityUOM;
            rhsWaferQuantityUOM = that.getWaferQuantityUOM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferQuantityUOM", lhsWaferQuantityUOM), LocatorUtils.property(thatLocator, "waferQuantityUOM", rhsWaferQuantityUOM), lhsWaferQuantityUOM, rhsWaferQuantityUOM, (this.waferQuantityUOM!= null), (that.waferQuantityUOM!= null))) {
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
            Float theGoodDieQuantity;
            theGoodDieQuantity = this.getGoodDieQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "goodDieQuantity", theGoodDieQuantity), currentHashCode, theGoodDieQuantity, (this.goodDieQuantity!= null));
        }
        {
            UnitOfMeasureType theGoodDieQuantityUOM;
            theGoodDieQuantityUOM = this.getGoodDieQuantityUOM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "goodDieQuantityUOM", theGoodDieQuantityUOM), currentHashCode, theGoodDieQuantityUOM, (this.goodDieQuantityUOM!= null));
        }
        {
            float theWaferQuantity;
            theWaferQuantity = this.getWaferQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferQuantity", theWaferQuantity), currentHashCode, theWaferQuantity, true);
        }
        {
            UnitOfMeasureType theWaferQuantityUOM;
            theWaferQuantityUOM = this.getWaferQuantityUOM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferQuantityUOM", theWaferQuantityUOM), currentHashCode, theWaferQuantityUOM, (this.waferQuantityUOM!= null));
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
            Float theGoodDieQuantity;
            theGoodDieQuantity = this.getGoodDieQuantity();
            strategy.appendField(locator, this, "goodDieQuantity", buffer, theGoodDieQuantity, (this.goodDieQuantity!= null));
        }
        {
            UnitOfMeasureType theGoodDieQuantityUOM;
            theGoodDieQuantityUOM = this.getGoodDieQuantityUOM();
            strategy.appendField(locator, this, "goodDieQuantityUOM", buffer, theGoodDieQuantityUOM, (this.goodDieQuantityUOM!= null));
        }
        {
            float theWaferQuantity;
            theWaferQuantity = this.getWaferQuantity();
            strategy.appendField(locator, this, "waferQuantity", buffer, theWaferQuantity, true);
        }
        {
            UnitOfMeasureType theWaferQuantityUOM;
            theWaferQuantityUOM = this.getWaferQuantityUOM();
            strategy.appendField(locator, this, "waferQuantityUOM", buffer, theWaferQuantityUOM, (this.waferQuantityUOM!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
