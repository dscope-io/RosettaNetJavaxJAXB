
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_00;

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
 * <p>Java class for LotIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturingID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "LotIdentifierType", propOrder = {
    "idSuffix",
    "manufacturingID"
})
public class LotIdentifierType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "IdSuffix")
    protected String idSuffix;
    @XmlElement(name = "ManufacturingID", required = true)
    protected String manufacturingID;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the idSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSuffix() {
        return idSuffix;
    }

    /**
     * Sets the value of the idSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSuffix(String value) {
        this.idSuffix = value;
    }

    /**
     * Gets the value of the manufacturingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingID() {
        return manufacturingID;
    }

    /**
     * Sets the value of the manufacturingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingID(String value) {
        this.manufacturingID = value;
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
        final LotIdentifierType that = ((LotIdentifierType) object);
        {
            String lhsIdSuffix;
            lhsIdSuffix = this.getIdSuffix();
            String rhsIdSuffix;
            rhsIdSuffix = that.getIdSuffix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "idSuffix", lhsIdSuffix), LocatorUtils.property(thatLocator, "idSuffix", rhsIdSuffix), lhsIdSuffix, rhsIdSuffix, (this.idSuffix!= null), (that.idSuffix!= null))) {
                return false;
            }
        }
        {
            String lhsManufacturingID;
            lhsManufacturingID = this.getManufacturingID();
            String rhsManufacturingID;
            rhsManufacturingID = that.getManufacturingID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturingID", lhsManufacturingID), LocatorUtils.property(thatLocator, "manufacturingID", rhsManufacturingID), lhsManufacturingID, rhsManufacturingID, (this.manufacturingID!= null), (that.manufacturingID!= null))) {
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
            String theIdSuffix;
            theIdSuffix = this.getIdSuffix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "idSuffix", theIdSuffix), currentHashCode, theIdSuffix, (this.idSuffix!= null));
        }
        {
            String theManufacturingID;
            theManufacturingID = this.getManufacturingID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturingID", theManufacturingID), currentHashCode, theManufacturingID, (this.manufacturingID!= null));
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
            String theIdSuffix;
            theIdSuffix = this.getIdSuffix();
            strategy.appendField(locator, this, "idSuffix", buffer, theIdSuffix, (this.idSuffix!= null));
        }
        {
            String theManufacturingID;
            theManufacturingID = this.getManufacturingID();
            strategy.appendField(locator, this, "manufacturingID", buffer, theManufacturingID, (this.manufacturingID!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
