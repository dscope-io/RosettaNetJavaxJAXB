
package io.dscope.rosettanet.domain.procurement.procurement.v02_01;

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
 * <p>Java class for QuantityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestedQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.01}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="ShippedQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.01}ProductQuantityType"/&gt;
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
@XmlType(name = "QuantityInformationType", propOrder = {
    "requestedQuantity",
    "shippedQuantity"
})
public class QuantityInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "RequestedQuantity")
    protected Float requestedQuantity;
    @XmlElement(name = "ShippedQuantity")
    protected float shippedQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the requestedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Sets the value of the requestedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRequestedQuantity(Float value) {
        this.requestedQuantity = value;
    }

    /**
     * Gets the value of the shippedQuantity property.
     * 
     */
    public float getShippedQuantity() {
        return shippedQuantity;
    }

    /**
     * Sets the value of the shippedQuantity property.
     * 
     */
    public void setShippedQuantity(float value) {
        this.shippedQuantity = value;
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
        final QuantityInformationType that = ((QuantityInformationType) object);
        {
            Float lhsRequestedQuantity;
            lhsRequestedQuantity = this.getRequestedQuantity();
            Float rhsRequestedQuantity;
            rhsRequestedQuantity = that.getRequestedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedQuantity", lhsRequestedQuantity), LocatorUtils.property(thatLocator, "requestedQuantity", rhsRequestedQuantity), lhsRequestedQuantity, rhsRequestedQuantity, (this.requestedQuantity!= null), (that.requestedQuantity!= null))) {
                return false;
            }
        }
        {
            float lhsShippedQuantity;
            lhsShippedQuantity = this.getShippedQuantity();
            float rhsShippedQuantity;
            rhsShippedQuantity = that.getShippedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippedQuantity", lhsShippedQuantity), LocatorUtils.property(thatLocator, "shippedQuantity", rhsShippedQuantity), lhsShippedQuantity, rhsShippedQuantity, true, true)) {
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
            Float theRequestedQuantity;
            theRequestedQuantity = this.getRequestedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedQuantity", theRequestedQuantity), currentHashCode, theRequestedQuantity, (this.requestedQuantity!= null));
        }
        {
            float theShippedQuantity;
            theShippedQuantity = this.getShippedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippedQuantity", theShippedQuantity), currentHashCode, theShippedQuantity, true);
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
            Float theRequestedQuantity;
            theRequestedQuantity = this.getRequestedQuantity();
            strategy.appendField(locator, this, "requestedQuantity", buffer, theRequestedQuantity, (this.requestedQuantity!= null));
        }
        {
            float theShippedQuantity;
            theShippedQuantity = this.getShippedQuantity();
            strategy.appendField(locator, this, "shippedQuantity", buffer, theShippedQuantity, true);
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
