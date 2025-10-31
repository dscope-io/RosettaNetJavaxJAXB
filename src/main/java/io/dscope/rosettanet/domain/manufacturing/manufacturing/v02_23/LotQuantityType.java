
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.lotquantityclassification.v01_04.LotQuantityClassification;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
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
 * <p>Java class for LotQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BinNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:LotQuantityClassification:xsd:codelist:01.04}LotQuantityClassification"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure"/&gt;
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
@XmlType(name = "LotQuantityType", propOrder = {
    "binNumber",
    "lotQuantityClassification",
    "quantity",
    "unitOfMeasure"
})
public class LotQuantityType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BinNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger binNumber;
    @XmlElementRef(name = "LotQuantityClassification", namespace = "urn:rosettanet:specification:domain:Manufacturing:LotQuantityClassification:xsd:codelist:01.04", type = LotQuantityClassification.class)
    protected LotQuantityClassification lotQuantityClassification;
    @XmlElement(name = "Quantity")
    protected float quantity;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the binNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBinNumber() {
        return binNumber;
    }

    /**
     * Sets the value of the binNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBinNumber(BigInteger value) {
        this.binNumber = value;
    }

    /**
     * Gets the value of the lotQuantityClassification property.
     * 
     * @return
     *     possible object is
     *     {@link LotQuantityClassification }
     *     
     */
    public LotQuantityClassification getLotQuantityClassification() {
        return lotQuantityClassification;
    }

    /**
     * Sets the value of the lotQuantityClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotQuantityClassification }
     *     
     */
    public void setLotQuantityClassification(LotQuantityClassification value) {
        this.lotQuantityClassification = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
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
        final LotQuantityType that = ((LotQuantityType) object);
        {
            BigInteger lhsBinNumber;
            lhsBinNumber = this.getBinNumber();
            BigInteger rhsBinNumber;
            rhsBinNumber = that.getBinNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "binNumber", lhsBinNumber), LocatorUtils.property(thatLocator, "binNumber", rhsBinNumber), lhsBinNumber, rhsBinNumber, (this.binNumber!= null), (that.binNumber!= null))) {
                return false;
            }
        }
        {
            LotQuantityClassification lhsLotQuantityClassification;
            lhsLotQuantityClassification = this.getLotQuantityClassification();
            LotQuantityClassification rhsLotQuantityClassification;
            rhsLotQuantityClassification = that.getLotQuantityClassification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotQuantityClassification", lhsLotQuantityClassification), LocatorUtils.property(thatLocator, "lotQuantityClassification", rhsLotQuantityClassification), lhsLotQuantityClassification, rhsLotQuantityClassification, (this.lotQuantityClassification!= null), (that.lotQuantityClassification!= null))) {
                return false;
            }
        }
        {
            float lhsQuantity;
            lhsQuantity = this.getQuantity();
            float rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, true, true)) {
                return false;
            }
        }
        {
            UnitOfMeasure lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            UnitOfMeasure rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, (this.unitOfMeasure!= null), (that.unitOfMeasure!= null))) {
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
            BigInteger theBinNumber;
            theBinNumber = this.getBinNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "binNumber", theBinNumber), currentHashCode, theBinNumber, (this.binNumber!= null));
        }
        {
            LotQuantityClassification theLotQuantityClassification;
            theLotQuantityClassification = this.getLotQuantityClassification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotQuantityClassification", theLotQuantityClassification), currentHashCode, theLotQuantityClassification, (this.lotQuantityClassification!= null));
        }
        {
            float theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, true);
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
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
            BigInteger theBinNumber;
            theBinNumber = this.getBinNumber();
            strategy.appendField(locator, this, "binNumber", buffer, theBinNumber, (this.binNumber!= null));
        }
        {
            LotQuantityClassification theLotQuantityClassification;
            theLotQuantityClassification = this.getLotQuantityClassification();
            strategy.appendField(locator, this, "lotQuantityClassification", buffer, theLotQuantityClassification, (this.lotQuantityClassification!= null));
        }
        {
            float theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, true);
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
