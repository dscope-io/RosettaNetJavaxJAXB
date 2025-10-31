
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_00;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_00.IntCoordinate;
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
 * <p>Java class for GangTestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GangTestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0}IntCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="StripTestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StripTestOrientation" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
@XmlType(name = "GangTestType", propOrder = {
    "intCoordinate",
    "stripTestID",
    "stripTestOrientation"
})
public class GangTestType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "IntCoordinate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0", type = IntCoordinate.class, required = false)
    protected IntCoordinate intCoordinate;
    @XmlElement(name = "StripTestID", required = true)
    protected String stripTestID;
    @XmlElement(name = "StripTestOrientation", required = true)
    protected BigInteger stripTestOrientation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the intCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link IntCoordinate }
     *     
     */
    public IntCoordinate getIntCoordinate() {
        return intCoordinate;
    }

    /**
     * Sets the value of the intCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntCoordinate }
     *     
     */
    public void setIntCoordinate(IntCoordinate value) {
        this.intCoordinate = value;
    }

    /**
     * Gets the value of the stripTestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripTestID() {
        return stripTestID;
    }

    /**
     * Sets the value of the stripTestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripTestID(String value) {
        this.stripTestID = value;
    }

    /**
     * Gets the value of the stripTestOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStripTestOrientation() {
        return stripTestOrientation;
    }

    /**
     * Sets the value of the stripTestOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStripTestOrientation(BigInteger value) {
        this.stripTestOrientation = value;
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
        final GangTestType that = ((GangTestType) object);
        {
            IntCoordinate lhsIntCoordinate;
            lhsIntCoordinate = this.getIntCoordinate();
            IntCoordinate rhsIntCoordinate;
            rhsIntCoordinate = that.getIntCoordinate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intCoordinate", lhsIntCoordinate), LocatorUtils.property(thatLocator, "intCoordinate", rhsIntCoordinate), lhsIntCoordinate, rhsIntCoordinate, (this.intCoordinate!= null), (that.intCoordinate!= null))) {
                return false;
            }
        }
        {
            String lhsStripTestID;
            lhsStripTestID = this.getStripTestID();
            String rhsStripTestID;
            rhsStripTestID = that.getStripTestID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stripTestID", lhsStripTestID), LocatorUtils.property(thatLocator, "stripTestID", rhsStripTestID), lhsStripTestID, rhsStripTestID, (this.stripTestID!= null), (that.stripTestID!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsStripTestOrientation;
            lhsStripTestOrientation = this.getStripTestOrientation();
            BigInteger rhsStripTestOrientation;
            rhsStripTestOrientation = that.getStripTestOrientation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stripTestOrientation", lhsStripTestOrientation), LocatorUtils.property(thatLocator, "stripTestOrientation", rhsStripTestOrientation), lhsStripTestOrientation, rhsStripTestOrientation, (this.stripTestOrientation!= null), (that.stripTestOrientation!= null))) {
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
            IntCoordinate theIntCoordinate;
            theIntCoordinate = this.getIntCoordinate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intCoordinate", theIntCoordinate), currentHashCode, theIntCoordinate, (this.intCoordinate!= null));
        }
        {
            String theStripTestID;
            theStripTestID = this.getStripTestID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stripTestID", theStripTestID), currentHashCode, theStripTestID, (this.stripTestID!= null));
        }
        {
            BigInteger theStripTestOrientation;
            theStripTestOrientation = this.getStripTestOrientation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stripTestOrientation", theStripTestOrientation), currentHashCode, theStripTestOrientation, (this.stripTestOrientation!= null));
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
            IntCoordinate theIntCoordinate;
            theIntCoordinate = this.getIntCoordinate();
            strategy.appendField(locator, this, "intCoordinate", buffer, theIntCoordinate, (this.intCoordinate!= null));
        }
        {
            String theStripTestID;
            theStripTestID = this.getStripTestID();
            strategy.appendField(locator, this, "stripTestID", buffer, theStripTestID, (this.stripTestID!= null));
        }
        {
            BigInteger theStripTestOrientation;
            theStripTestOrientation = this.getStripTestOrientation();
            strategy.appendField(locator, this, "stripTestOrientation", buffer, theStripTestOrientation, (this.stripTestOrientation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
