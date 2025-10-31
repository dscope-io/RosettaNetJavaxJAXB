
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.design.design.v02_15.LifeCycleStatus;
import io.dscope.rosettanet.domain.shared.shared.v01_10.ManufacturedDate;
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
 * <p>Java class for ProductLifeCycleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLifeCycleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.15}LifeCycleStatus"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ManufacturedDate" minOccurs="0"/&gt;
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
@XmlType(name = "ProductLifeCycleType", propOrder = {
    "lifeCycleStatus",
    "manufacturedDate"
})
public class ProductLifeCycleType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "LifeCycleStatus", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.15", type = LifeCycleStatus.class)
    protected LifeCycleStatus lifeCycleStatus;
    @XmlElementRef(name = "ManufacturedDate", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = ManufacturedDate.class, required = false)
    protected ManufacturedDate manufacturedDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lifeCycleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleStatus }
     *     
     */
    public LifeCycleStatus getLifeCycleStatus() {
        return lifeCycleStatus;
    }

    /**
     * Sets the value of the lifeCycleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleStatus }
     *     
     */
    public void setLifeCycleStatus(LifeCycleStatus value) {
        this.lifeCycleStatus = value;
    }

    /**
     * Gets the value of the manufacturedDate property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturedDate }
     *     
     */
    public ManufacturedDate getManufacturedDate() {
        return manufacturedDate;
    }

    /**
     * Sets the value of the manufacturedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturedDate }
     *     
     */
    public void setManufacturedDate(ManufacturedDate value) {
        this.manufacturedDate = value;
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
        final ProductLifeCycleType that = ((ProductLifeCycleType) object);
        {
            LifeCycleStatus lhsLifeCycleStatus;
            lhsLifeCycleStatus = this.getLifeCycleStatus();
            LifeCycleStatus rhsLifeCycleStatus;
            rhsLifeCycleStatus = that.getLifeCycleStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lifeCycleStatus", lhsLifeCycleStatus), LocatorUtils.property(thatLocator, "lifeCycleStatus", rhsLifeCycleStatus), lhsLifeCycleStatus, rhsLifeCycleStatus, (this.lifeCycleStatus!= null), (that.lifeCycleStatus!= null))) {
                return false;
            }
        }
        {
            ManufacturedDate lhsManufacturedDate;
            lhsManufacturedDate = this.getManufacturedDate();
            ManufacturedDate rhsManufacturedDate;
            rhsManufacturedDate = that.getManufacturedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturedDate", lhsManufacturedDate), LocatorUtils.property(thatLocator, "manufacturedDate", rhsManufacturedDate), lhsManufacturedDate, rhsManufacturedDate, (this.manufacturedDate!= null), (that.manufacturedDate!= null))) {
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
            LifeCycleStatus theLifeCycleStatus;
            theLifeCycleStatus = this.getLifeCycleStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lifeCycleStatus", theLifeCycleStatus), currentHashCode, theLifeCycleStatus, (this.lifeCycleStatus!= null));
        }
        {
            ManufacturedDate theManufacturedDate;
            theManufacturedDate = this.getManufacturedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturedDate", theManufacturedDate), currentHashCode, theManufacturedDate, (this.manufacturedDate!= null));
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
            LifeCycleStatus theLifeCycleStatus;
            theLifeCycleStatus = this.getLifeCycleStatus();
            strategy.appendField(locator, this, "lifeCycleStatus", buffer, theLifeCycleStatus, (this.lifeCycleStatus!= null));
        }
        {
            ManufacturedDate theManufacturedDate;
            theManufacturedDate = this.getManufacturedDate();
            strategy.appendField(locator, this, "manufacturedDate", buffer, theManufacturedDate, (this.manufacturedDate!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
