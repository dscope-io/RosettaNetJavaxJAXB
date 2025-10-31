
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07.HexCoordinate;
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
 * <p>Java class for ECIDReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECIDReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DecodedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Decoder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07}HexCoordinate"/&gt;
 *         &lt;element name="RawBits" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.02}HexadecimalType"/&gt;
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
@XmlType(name = "ECIDReportType", propOrder = {
    "decodedID",
    "decoder",
    "hexCoordinate",
    "rawBits"
})
public class ECIDReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DecodedID")
    protected String decodedID;
    @XmlElement(name = "Decoder")
    protected String decoder;
    @XmlElementRef(name = "HexCoordinate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", type = HexCoordinate.class)
    protected HexCoordinate hexCoordinate;
    @XmlElement(name = "RawBits", required = true)
    protected String rawBits;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the decodedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecodedID() {
        return decodedID;
    }

    /**
     * Sets the value of the decodedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecodedID(String value) {
        this.decodedID = value;
    }

    /**
     * Gets the value of the decoder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecoder() {
        return decoder;
    }

    /**
     * Sets the value of the decoder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecoder(String value) {
        this.decoder = value;
    }

    /**
     * Gets the value of the hexCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link HexCoordinate }
     *     
     */
    public HexCoordinate getHexCoordinate() {
        return hexCoordinate;
    }

    /**
     * Sets the value of the hexCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexCoordinate }
     *     
     */
    public void setHexCoordinate(HexCoordinate value) {
        this.hexCoordinate = value;
    }

    /**
     * Gets the value of the rawBits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawBits() {
        return rawBits;
    }

    /**
     * Sets the value of the rawBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawBits(String value) {
        this.rawBits = value;
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
        final ECIDReportType that = ((ECIDReportType) object);
        {
            String lhsDecodedID;
            lhsDecodedID = this.getDecodedID();
            String rhsDecodedID;
            rhsDecodedID = that.getDecodedID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "decodedID", lhsDecodedID), LocatorUtils.property(thatLocator, "decodedID", rhsDecodedID), lhsDecodedID, rhsDecodedID, (this.decodedID!= null), (that.decodedID!= null))) {
                return false;
            }
        }
        {
            String lhsDecoder;
            lhsDecoder = this.getDecoder();
            String rhsDecoder;
            rhsDecoder = that.getDecoder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "decoder", lhsDecoder), LocatorUtils.property(thatLocator, "decoder", rhsDecoder), lhsDecoder, rhsDecoder, (this.decoder!= null), (that.decoder!= null))) {
                return false;
            }
        }
        {
            HexCoordinate lhsHexCoordinate;
            lhsHexCoordinate = this.getHexCoordinate();
            HexCoordinate rhsHexCoordinate;
            rhsHexCoordinate = that.getHexCoordinate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hexCoordinate", lhsHexCoordinate), LocatorUtils.property(thatLocator, "hexCoordinate", rhsHexCoordinate), lhsHexCoordinate, rhsHexCoordinate, (this.hexCoordinate!= null), (that.hexCoordinate!= null))) {
                return false;
            }
        }
        {
            String lhsRawBits;
            lhsRawBits = this.getRawBits();
            String rhsRawBits;
            rhsRawBits = that.getRawBits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rawBits", lhsRawBits), LocatorUtils.property(thatLocator, "rawBits", rhsRawBits), lhsRawBits, rhsRawBits, (this.rawBits!= null), (that.rawBits!= null))) {
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
            String theDecodedID;
            theDecodedID = this.getDecodedID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "decodedID", theDecodedID), currentHashCode, theDecodedID, (this.decodedID!= null));
        }
        {
            String theDecoder;
            theDecoder = this.getDecoder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "decoder", theDecoder), currentHashCode, theDecoder, (this.decoder!= null));
        }
        {
            HexCoordinate theHexCoordinate;
            theHexCoordinate = this.getHexCoordinate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hexCoordinate", theHexCoordinate), currentHashCode, theHexCoordinate, (this.hexCoordinate!= null));
        }
        {
            String theRawBits;
            theRawBits = this.getRawBits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rawBits", theRawBits), currentHashCode, theRawBits, (this.rawBits!= null));
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
            String theDecodedID;
            theDecodedID = this.getDecodedID();
            strategy.appendField(locator, this, "decodedID", buffer, theDecodedID, (this.decodedID!= null));
        }
        {
            String theDecoder;
            theDecoder = this.getDecoder();
            strategy.appendField(locator, this, "decoder", buffer, theDecoder, (this.decoder!= null));
        }
        {
            HexCoordinate theHexCoordinate;
            theHexCoordinate = this.getHexCoordinate();
            strategy.appendField(locator, this, "hexCoordinate", buffer, theHexCoordinate, (this.hexCoordinate!= null));
        }
        {
            String theRawBits;
            theRawBits = this.getRawBits();
            strategy.appendField(locator, this, "rawBits", buffer, theRawBits, (this.rawBits!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
