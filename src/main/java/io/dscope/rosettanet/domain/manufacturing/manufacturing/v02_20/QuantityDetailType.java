
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_20;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for QuantityDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20}OperationGate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OverallQuantityIn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="OverallQuantityOut" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedPackagedYield" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="WaferQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "QuantityDetailType", propOrder = {
    "operationGate",
    "overallQuantityIn",
    "overallQuantityOut",
    "projectedPackagedYield",
    "waferQuantity"
})
public class QuantityDetailType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "OperationGate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20", type = OperationGate.class, required = false)
    protected List<OperationGate> operationGate;
    @XmlElement(name = "OverallQuantityIn")
    protected BigInteger overallQuantityIn;
    @XmlElement(name = "OverallQuantityOut")
    protected BigInteger overallQuantityOut;
    @XmlElement(name = "ProjectedPackagedYield")
    protected BigInteger projectedPackagedYield;
    @XmlElement(name = "WaferQuantity")
    protected BigInteger waferQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the operationGate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationGate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationGate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationGate }
     * 
     * 
     */
    public List<OperationGate> getOperationGate() {
        if (operationGate == null) {
            operationGate = new ArrayList<OperationGate>();
        }
        return this.operationGate;
    }

    /**
     * Gets the value of the overallQuantityIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverallQuantityIn() {
        return overallQuantityIn;
    }

    /**
     * Sets the value of the overallQuantityIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverallQuantityIn(BigInteger value) {
        this.overallQuantityIn = value;
    }

    /**
     * Gets the value of the overallQuantityOut property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverallQuantityOut() {
        return overallQuantityOut;
    }

    /**
     * Sets the value of the overallQuantityOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverallQuantityOut(BigInteger value) {
        this.overallQuantityOut = value;
    }

    /**
     * Gets the value of the projectedPackagedYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectedPackagedYield() {
        return projectedPackagedYield;
    }

    /**
     * Sets the value of the projectedPackagedYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectedPackagedYield(BigInteger value) {
        this.projectedPackagedYield = value;
    }

    /**
     * Gets the value of the waferQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaferQuantity() {
        return waferQuantity;
    }

    /**
     * Sets the value of the waferQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaferQuantity(BigInteger value) {
        this.waferQuantity = value;
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
        final QuantityDetailType that = ((QuantityDetailType) object);
        {
            List<OperationGate> lhsOperationGate;
            lhsOperationGate = (((this.operationGate!= null)&&(!this.operationGate.isEmpty()))?this.getOperationGate():null);
            List<OperationGate> rhsOperationGate;
            rhsOperationGate = (((that.operationGate!= null)&&(!that.operationGate.isEmpty()))?that.getOperationGate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operationGate", lhsOperationGate), LocatorUtils.property(thatLocator, "operationGate", rhsOperationGate), lhsOperationGate, rhsOperationGate, ((this.operationGate!= null)&&(!this.operationGate.isEmpty())), ((that.operationGate!= null)&&(!that.operationGate.isEmpty())))) {
                return false;
            }
        }
        {
            BigInteger lhsOverallQuantityIn;
            lhsOverallQuantityIn = this.getOverallQuantityIn();
            BigInteger rhsOverallQuantityIn;
            rhsOverallQuantityIn = that.getOverallQuantityIn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "overallQuantityIn", lhsOverallQuantityIn), LocatorUtils.property(thatLocator, "overallQuantityIn", rhsOverallQuantityIn), lhsOverallQuantityIn, rhsOverallQuantityIn, (this.overallQuantityIn!= null), (that.overallQuantityIn!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsOverallQuantityOut;
            lhsOverallQuantityOut = this.getOverallQuantityOut();
            BigInteger rhsOverallQuantityOut;
            rhsOverallQuantityOut = that.getOverallQuantityOut();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "overallQuantityOut", lhsOverallQuantityOut), LocatorUtils.property(thatLocator, "overallQuantityOut", rhsOverallQuantityOut), lhsOverallQuantityOut, rhsOverallQuantityOut, (this.overallQuantityOut!= null), (that.overallQuantityOut!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsProjectedPackagedYield;
            lhsProjectedPackagedYield = this.getProjectedPackagedYield();
            BigInteger rhsProjectedPackagedYield;
            rhsProjectedPackagedYield = that.getProjectedPackagedYield();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projectedPackagedYield", lhsProjectedPackagedYield), LocatorUtils.property(thatLocator, "projectedPackagedYield", rhsProjectedPackagedYield), lhsProjectedPackagedYield, rhsProjectedPackagedYield, (this.projectedPackagedYield!= null), (that.projectedPackagedYield!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsWaferQuantity;
            lhsWaferQuantity = this.getWaferQuantity();
            BigInteger rhsWaferQuantity;
            rhsWaferQuantity = that.getWaferQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferQuantity", lhsWaferQuantity), LocatorUtils.property(thatLocator, "waferQuantity", rhsWaferQuantity), lhsWaferQuantity, rhsWaferQuantity, (this.waferQuantity!= null), (that.waferQuantity!= null))) {
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
            List<OperationGate> theOperationGate;
            theOperationGate = (((this.operationGate!= null)&&(!this.operationGate.isEmpty()))?this.getOperationGate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operationGate", theOperationGate), currentHashCode, theOperationGate, ((this.operationGate!= null)&&(!this.operationGate.isEmpty())));
        }
        {
            BigInteger theOverallQuantityIn;
            theOverallQuantityIn = this.getOverallQuantityIn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "overallQuantityIn", theOverallQuantityIn), currentHashCode, theOverallQuantityIn, (this.overallQuantityIn!= null));
        }
        {
            BigInteger theOverallQuantityOut;
            theOverallQuantityOut = this.getOverallQuantityOut();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "overallQuantityOut", theOverallQuantityOut), currentHashCode, theOverallQuantityOut, (this.overallQuantityOut!= null));
        }
        {
            BigInteger theProjectedPackagedYield;
            theProjectedPackagedYield = this.getProjectedPackagedYield();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "projectedPackagedYield", theProjectedPackagedYield), currentHashCode, theProjectedPackagedYield, (this.projectedPackagedYield!= null));
        }
        {
            BigInteger theWaferQuantity;
            theWaferQuantity = this.getWaferQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferQuantity", theWaferQuantity), currentHashCode, theWaferQuantity, (this.waferQuantity!= null));
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
            List<OperationGate> theOperationGate;
            theOperationGate = (((this.operationGate!= null)&&(!this.operationGate.isEmpty()))?this.getOperationGate():null);
            strategy.appendField(locator, this, "operationGate", buffer, theOperationGate, ((this.operationGate!= null)&&(!this.operationGate.isEmpty())));
        }
        {
            BigInteger theOverallQuantityIn;
            theOverallQuantityIn = this.getOverallQuantityIn();
            strategy.appendField(locator, this, "overallQuantityIn", buffer, theOverallQuantityIn, (this.overallQuantityIn!= null));
        }
        {
            BigInteger theOverallQuantityOut;
            theOverallQuantityOut = this.getOverallQuantityOut();
            strategy.appendField(locator, this, "overallQuantityOut", buffer, theOverallQuantityOut, (this.overallQuantityOut!= null));
        }
        {
            BigInteger theProjectedPackagedYield;
            theProjectedPackagedYield = this.getProjectedPackagedYield();
            strategy.appendField(locator, this, "projectedPackagedYield", buffer, theProjectedPackagedYield, (this.projectedPackagedYield!= null));
        }
        {
            BigInteger theWaferQuantity;
            theWaferQuantity = this.getWaferQuantity();
            strategy.appendField(locator, this, "waferQuantity", buffer, theWaferQuantity, (this.waferQuantity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
