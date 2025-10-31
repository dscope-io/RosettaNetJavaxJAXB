
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_01;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.status.v01_02.Status;
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
 * <p>Java class for VectorReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VectorReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CycleCnt" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Pins" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:Status:xsd:codelist:01.02}Status"/&gt;
 *         &lt;element name="VectorLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "VectorReportType", propOrder = {
    "address1",
    "address2",
    "cycleCnt",
    "pins",
    "status",
    "vectorLabel"
})
public class VectorReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Address1")
    protected BigInteger address1;
    @XmlElement(name = "Address2")
    protected BigInteger address2;
    @XmlElement(name = "CycleCnt")
    protected BigInteger cycleCnt;
    @XmlElement(name = "Pins", required = true)
    protected String pins;
    @XmlElementRef(name = "Status", namespace = "urn:rosettanet:specification:domain:Manufacturing:Status:xsd:codelist:01.02", type = Status.class)
    protected Status status;
    @XmlElement(name = "VectorLabel")
    protected String vectorLabel;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddress1(BigInteger value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddress2(BigInteger value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the cycleCnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCycleCnt() {
        return cycleCnt;
    }

    /**
     * Sets the value of the cycleCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCycleCnt(BigInteger value) {
        this.cycleCnt = value;
    }

    /**
     * Gets the value of the pins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPins() {
        return pins;
    }

    /**
     * Sets the value of the pins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPins(String value) {
        this.pins = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the vectorLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectorLabel() {
        return vectorLabel;
    }

    /**
     * Sets the value of the vectorLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectorLabel(String value) {
        this.vectorLabel = value;
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
        final VectorReportType that = ((VectorReportType) object);
        {
            BigInteger lhsAddress1;
            lhsAddress1 = this.getAddress1();
            BigInteger rhsAddress1;
            rhsAddress1 = that.getAddress1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address1", lhsAddress1), LocatorUtils.property(thatLocator, "address1", rhsAddress1), lhsAddress1, rhsAddress1, (this.address1 != null), (that.address1 != null))) {
                return false;
            }
        }
        {
            BigInteger lhsAddress2;
            lhsAddress2 = this.getAddress2();
            BigInteger rhsAddress2;
            rhsAddress2 = that.getAddress2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address2", lhsAddress2), LocatorUtils.property(thatLocator, "address2", rhsAddress2), lhsAddress2, rhsAddress2, (this.address2 != null), (that.address2 != null))) {
                return false;
            }
        }
        {
            BigInteger lhsCycleCnt;
            lhsCycleCnt = this.getCycleCnt();
            BigInteger rhsCycleCnt;
            rhsCycleCnt = that.getCycleCnt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cycleCnt", lhsCycleCnt), LocatorUtils.property(thatLocator, "cycleCnt", rhsCycleCnt), lhsCycleCnt, rhsCycleCnt, (this.cycleCnt!= null), (that.cycleCnt!= null))) {
                return false;
            }
        }
        {
            String lhsPins;
            lhsPins = this.getPins();
            String rhsPins;
            rhsPins = that.getPins();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pins", lhsPins), LocatorUtils.property(thatLocator, "pins", rhsPins), lhsPins, rhsPins, (this.pins!= null), (that.pins!= null))) {
                return false;
            }
        }
        {
            Status lhsStatus;
            lhsStatus = this.getStatus();
            Status rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        {
            String lhsVectorLabel;
            lhsVectorLabel = this.getVectorLabel();
            String rhsVectorLabel;
            rhsVectorLabel = that.getVectorLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vectorLabel", lhsVectorLabel), LocatorUtils.property(thatLocator, "vectorLabel", rhsVectorLabel), lhsVectorLabel, rhsVectorLabel, (this.vectorLabel!= null), (that.vectorLabel!= null))) {
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
            BigInteger theAddress1;
            theAddress1 = this.getAddress1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address1", theAddress1), currentHashCode, theAddress1, (this.address1 != null));
        }
        {
            BigInteger theAddress2;
            theAddress2 = this.getAddress2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address2", theAddress2), currentHashCode, theAddress2, (this.address2 != null));
        }
        {
            BigInteger theCycleCnt;
            theCycleCnt = this.getCycleCnt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cycleCnt", theCycleCnt), currentHashCode, theCycleCnt, (this.cycleCnt!= null));
        }
        {
            String thePins;
            thePins = this.getPins();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pins", thePins), currentHashCode, thePins, (this.pins!= null));
        }
        {
            Status theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
        }
        {
            String theVectorLabel;
            theVectorLabel = this.getVectorLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vectorLabel", theVectorLabel), currentHashCode, theVectorLabel, (this.vectorLabel!= null));
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
            BigInteger theAddress1;
            theAddress1 = this.getAddress1();
            strategy.appendField(locator, this, "address1", buffer, theAddress1, (this.address1 != null));
        }
        {
            BigInteger theAddress2;
            theAddress2 = this.getAddress2();
            strategy.appendField(locator, this, "address2", buffer, theAddress2, (this.address2 != null));
        }
        {
            BigInteger theCycleCnt;
            theCycleCnt = this.getCycleCnt();
            strategy.appendField(locator, this, "cycleCnt", buffer, theCycleCnt, (this.cycleCnt!= null));
        }
        {
            String thePins;
            thePins = this.getPins();
            strategy.appendField(locator, this, "pins", buffer, thePins, (this.pins!= null));
        }
        {
            Status theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus, (this.status!= null));
        }
        {
            String theVectorLabel;
            theVectorLabel = this.getVectorLabel();
            strategy.appendField(locator, this, "vectorLabel", buffer, theVectorLabel, (this.vectorLabel!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
