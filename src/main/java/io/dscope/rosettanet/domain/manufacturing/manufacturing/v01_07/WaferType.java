
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07;

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
 * <p>Java class for WaferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessRevision" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="WaferUniqueID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "WaferType", propOrder = {
    "processRevision",
    "waferUniqueID"
})
public class WaferType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ProcessRevision")
    protected Float processRevision;
    @XmlElement(name = "WaferUniqueID", required = true)
    protected String waferUniqueID;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the processRevision property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProcessRevision() {
        return processRevision;
    }

    /**
     * Sets the value of the processRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProcessRevision(Float value) {
        this.processRevision = value;
    }

    /**
     * Gets the value of the waferUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaferUniqueID() {
        return waferUniqueID;
    }

    /**
     * Sets the value of the waferUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaferUniqueID(String value) {
        this.waferUniqueID = value;
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
        final WaferType that = ((WaferType) object);
        {
            Float lhsProcessRevision;
            lhsProcessRevision = this.getProcessRevision();
            Float rhsProcessRevision;
            rhsProcessRevision = that.getProcessRevision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processRevision", lhsProcessRevision), LocatorUtils.property(thatLocator, "processRevision", rhsProcessRevision), lhsProcessRevision, rhsProcessRevision, (this.processRevision!= null), (that.processRevision!= null))) {
                return false;
            }
        }
        {
            String lhsWaferUniqueID;
            lhsWaferUniqueID = this.getWaferUniqueID();
            String rhsWaferUniqueID;
            rhsWaferUniqueID = that.getWaferUniqueID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferUniqueID", lhsWaferUniqueID), LocatorUtils.property(thatLocator, "waferUniqueID", rhsWaferUniqueID), lhsWaferUniqueID, rhsWaferUniqueID, (this.waferUniqueID!= null), (that.waferUniqueID!= null))) {
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
            Float theProcessRevision;
            theProcessRevision = this.getProcessRevision();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processRevision", theProcessRevision), currentHashCode, theProcessRevision, (this.processRevision!= null));
        }
        {
            String theWaferUniqueID;
            theWaferUniqueID = this.getWaferUniqueID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferUniqueID", theWaferUniqueID), currentHashCode, theWaferUniqueID, (this.waferUniqueID!= null));
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
            Float theProcessRevision;
            theProcessRevision = this.getProcessRevision();
            strategy.appendField(locator, this, "processRevision", buffer, theProcessRevision, (this.processRevision!= null));
        }
        {
            String theWaferUniqueID;
            theWaferUniqueID = this.getWaferUniqueID();
            strategy.appendField(locator, this, "waferUniqueID", buffer, theWaferUniqueID, (this.waferUniqueID!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
