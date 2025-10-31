
package io.dscope.rosettanet.interchange.shipmentreceiptnotification.v02_02;

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
 *         &lt;element name="AcceptedQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType"/&gt;
 *         &lt;element name="ReceivedQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType"/&gt;
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
    "acceptedQuantity",
    "receivedQuantity"
})
public class QuantityInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AcceptedQuantity")
    protected float acceptedQuantity;
    @XmlElement(name = "ReceivedQuantity")
    protected float receivedQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the acceptedQuantity property.
     * 
     */
    public float getAcceptedQuantity() {
        return acceptedQuantity;
    }

    /**
     * Sets the value of the acceptedQuantity property.
     * 
     */
    public void setAcceptedQuantity(float value) {
        this.acceptedQuantity = value;
    }

    /**
     * Gets the value of the receivedQuantity property.
     * 
     */
    public float getReceivedQuantity() {
        return receivedQuantity;
    }

    /**
     * Sets the value of the receivedQuantity property.
     * 
     */
    public void setReceivedQuantity(float value) {
        this.receivedQuantity = value;
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
            float lhsAcceptedQuantity;
            lhsAcceptedQuantity = this.getAcceptedQuantity();
            float rhsAcceptedQuantity;
            rhsAcceptedQuantity = that.getAcceptedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptedQuantity", lhsAcceptedQuantity), LocatorUtils.property(thatLocator, "acceptedQuantity", rhsAcceptedQuantity), lhsAcceptedQuantity, rhsAcceptedQuantity, true, true)) {
                return false;
            }
        }
        {
            float lhsReceivedQuantity;
            lhsReceivedQuantity = this.getReceivedQuantity();
            float rhsReceivedQuantity;
            rhsReceivedQuantity = that.getReceivedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivedQuantity", lhsReceivedQuantity), LocatorUtils.property(thatLocator, "receivedQuantity", rhsReceivedQuantity), lhsReceivedQuantity, rhsReceivedQuantity, true, true)) {
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
            float theAcceptedQuantity;
            theAcceptedQuantity = this.getAcceptedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceptedQuantity", theAcceptedQuantity), currentHashCode, theAcceptedQuantity, true);
        }
        {
            float theReceivedQuantity;
            theReceivedQuantity = this.getReceivedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivedQuantity", theReceivedQuantity), currentHashCode, theReceivedQuantity, true);
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
            float theAcceptedQuantity;
            theAcceptedQuantity = this.getAcceptedQuantity();
            strategy.appendField(locator, this, "acceptedQuantity", buffer, theAcceptedQuantity, true);
        }
        {
            float theReceivedQuantity;
            theReceivedQuantity = this.getReceivedQuantity();
            strategy.appendField(locator, this, "receivedQuantity", buffer, theReceivedQuantity, true);
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
