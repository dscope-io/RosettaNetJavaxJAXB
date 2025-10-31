
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13;

import java.math.BigInteger;
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
 * <p>Java class for OperationGateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationGateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationGateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityIn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="QuantityOut" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="QuantityRejected" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "OperationGateType", propOrder = {
    "operationGateDescription",
    "quantityIn",
    "quantityOut",
    "quantityRejected"
})
public class OperationGateType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "OperationGateDescription")
    protected String operationGateDescription;
    @XmlElement(name = "QuantityIn")
    protected BigInteger quantityIn;
    @XmlElement(name = "QuantityOut")
    protected BigInteger quantityOut;
    @XmlElement(name = "QuantityRejected")
    protected BigInteger quantityRejected;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the operationGateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationGateDescription() {
        return operationGateDescription;
    }

    /**
     * Sets the value of the operationGateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationGateDescription(String value) {
        this.operationGateDescription = value;
    }

    /**
     * Gets the value of the quantityIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityIn() {
        return quantityIn;
    }

    /**
     * Sets the value of the quantityIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityIn(BigInteger value) {
        this.quantityIn = value;
    }

    /**
     * Gets the value of the quantityOut property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOut() {
        return quantityOut;
    }

    /**
     * Sets the value of the quantityOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOut(BigInteger value) {
        this.quantityOut = value;
    }

    /**
     * Gets the value of the quantityRejected property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityRejected() {
        return quantityRejected;
    }

    /**
     * Sets the value of the quantityRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityRejected(BigInteger value) {
        this.quantityRejected = value;
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
        final OperationGateType that = ((OperationGateType) object);
        {
            String lhsOperationGateDescription;
            lhsOperationGateDescription = this.getOperationGateDescription();
            String rhsOperationGateDescription;
            rhsOperationGateDescription = that.getOperationGateDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operationGateDescription", lhsOperationGateDescription), LocatorUtils.property(thatLocator, "operationGateDescription", rhsOperationGateDescription), lhsOperationGateDescription, rhsOperationGateDescription, (this.operationGateDescription!= null), (that.operationGateDescription!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsQuantityIn;
            lhsQuantityIn = this.getQuantityIn();
            BigInteger rhsQuantityIn;
            rhsQuantityIn = that.getQuantityIn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityIn", lhsQuantityIn), LocatorUtils.property(thatLocator, "quantityIn", rhsQuantityIn), lhsQuantityIn, rhsQuantityIn, (this.quantityIn!= null), (that.quantityIn!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsQuantityOut;
            lhsQuantityOut = this.getQuantityOut();
            BigInteger rhsQuantityOut;
            rhsQuantityOut = that.getQuantityOut();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityOut", lhsQuantityOut), LocatorUtils.property(thatLocator, "quantityOut", rhsQuantityOut), lhsQuantityOut, rhsQuantityOut, (this.quantityOut!= null), (that.quantityOut!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsQuantityRejected;
            lhsQuantityRejected = this.getQuantityRejected();
            BigInteger rhsQuantityRejected;
            rhsQuantityRejected = that.getQuantityRejected();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityRejected", lhsQuantityRejected), LocatorUtils.property(thatLocator, "quantityRejected", rhsQuantityRejected), lhsQuantityRejected, rhsQuantityRejected, (this.quantityRejected!= null), (that.quantityRejected!= null))) {
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
            String theOperationGateDescription;
            theOperationGateDescription = this.getOperationGateDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operationGateDescription", theOperationGateDescription), currentHashCode, theOperationGateDescription, (this.operationGateDescription!= null));
        }
        {
            BigInteger theQuantityIn;
            theQuantityIn = this.getQuantityIn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityIn", theQuantityIn), currentHashCode, theQuantityIn, (this.quantityIn!= null));
        }
        {
            BigInteger theQuantityOut;
            theQuantityOut = this.getQuantityOut();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityOut", theQuantityOut), currentHashCode, theQuantityOut, (this.quantityOut!= null));
        }
        {
            BigInteger theQuantityRejected;
            theQuantityRejected = this.getQuantityRejected();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityRejected", theQuantityRejected), currentHashCode, theQuantityRejected, (this.quantityRejected!= null));
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
            String theOperationGateDescription;
            theOperationGateDescription = this.getOperationGateDescription();
            strategy.appendField(locator, this, "operationGateDescription", buffer, theOperationGateDescription, (this.operationGateDescription!= null));
        }
        {
            BigInteger theQuantityIn;
            theQuantityIn = this.getQuantityIn();
            strategy.appendField(locator, this, "quantityIn", buffer, theQuantityIn, (this.quantityIn!= null));
        }
        {
            BigInteger theQuantityOut;
            theQuantityOut = this.getQuantityOut();
            strategy.appendField(locator, this, "quantityOut", buffer, theQuantityOut, (this.quantityOut!= null));
        }
        {
            BigInteger theQuantityRejected;
            theQuantityRejected = this.getQuantityRejected();
            strategy.appendField(locator, this, "quantityRejected", buffer, theQuantityRejected, (this.quantityRejected!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
