
package io.dscope.rosettanet.domain.procurement.procurement.v01_13;

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
 * <p>Java class for ProductIdentificationReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ManufacturingDateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProprietarySerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ProductIdentificationReferenceType", propOrder = {
    "manufacturingDateCode",
    "proprietarySerialIdentifier"
})
public class ProductIdentificationReferenceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ManufacturingDateCode")
    protected String manufacturingDateCode;
    @XmlElement(name = "ProprietarySerialIdentifier")
    protected String proprietarySerialIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the manufacturingDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingDateCode() {
        return manufacturingDateCode;
    }

    /**
     * Sets the value of the manufacturingDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingDateCode(String value) {
        this.manufacturingDateCode = value;
    }

    /**
     * Gets the value of the proprietarySerialIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietarySerialIdentifier() {
        return proprietarySerialIdentifier;
    }

    /**
     * Sets the value of the proprietarySerialIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietarySerialIdentifier(String value) {
        this.proprietarySerialIdentifier = value;
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
        final ProductIdentificationReferenceType that = ((ProductIdentificationReferenceType) object);
        {
            String lhsManufacturingDateCode;
            lhsManufacturingDateCode = this.getManufacturingDateCode();
            String rhsManufacturingDateCode;
            rhsManufacturingDateCode = that.getManufacturingDateCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturingDateCode", lhsManufacturingDateCode), LocatorUtils.property(thatLocator, "manufacturingDateCode", rhsManufacturingDateCode), lhsManufacturingDateCode, rhsManufacturingDateCode, (this.manufacturingDateCode!= null), (that.manufacturingDateCode!= null))) {
                return false;
            }
        }
        {
            String lhsProprietarySerialIdentifier;
            lhsProprietarySerialIdentifier = this.getProprietarySerialIdentifier();
            String rhsProprietarySerialIdentifier;
            rhsProprietarySerialIdentifier = that.getProprietarySerialIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "proprietarySerialIdentifier", lhsProprietarySerialIdentifier), LocatorUtils.property(thatLocator, "proprietarySerialIdentifier", rhsProprietarySerialIdentifier), lhsProprietarySerialIdentifier, rhsProprietarySerialIdentifier, (this.proprietarySerialIdentifier!= null), (that.proprietarySerialIdentifier!= null))) {
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
            String theManufacturingDateCode;
            theManufacturingDateCode = this.getManufacturingDateCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturingDateCode", theManufacturingDateCode), currentHashCode, theManufacturingDateCode, (this.manufacturingDateCode!= null));
        }
        {
            String theProprietarySerialIdentifier;
            theProprietarySerialIdentifier = this.getProprietarySerialIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "proprietarySerialIdentifier", theProprietarySerialIdentifier), currentHashCode, theProprietarySerialIdentifier, (this.proprietarySerialIdentifier!= null));
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
            String theManufacturingDateCode;
            theManufacturingDateCode = this.getManufacturingDateCode();
            strategy.appendField(locator, this, "manufacturingDateCode", buffer, theManufacturingDateCode, (this.manufacturingDateCode!= null));
        }
        {
            String theProprietarySerialIdentifier;
            theProprietarySerialIdentifier = this.getProprietarySerialIdentifier();
            strategy.appendField(locator, this, "proprietarySerialIdentifier", buffer, theProprietarySerialIdentifier, (this.proprietarySerialIdentifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
