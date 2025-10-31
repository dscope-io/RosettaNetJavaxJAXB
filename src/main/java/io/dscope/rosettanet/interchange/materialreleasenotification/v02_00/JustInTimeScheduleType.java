
package io.dscope.rosettanet.interchange.materialreleasenotification.v02_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.shared.shared.v01_10.ProductQuantity;
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
 * <p>Java class for JustInTimeScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JustInTimeScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaterialDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantity"/&gt;
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
@XmlType(name = "JustInTimeScheduleType", propOrder = {
    "materialDeliveryTime",
    "productQuantity"
})
public class JustInTimeScheduleType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "MaterialDeliveryTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar materialDeliveryTime;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the materialDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaterialDeliveryTime() {
        return materialDeliveryTime;
    }

    /**
     * Sets the value of the materialDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaterialDeliveryTime(XMLGregorianCalendar value) {
        this.materialDeliveryTime = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
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
        final JustInTimeScheduleType that = ((JustInTimeScheduleType) object);
        {
            XMLGregorianCalendar lhsMaterialDeliveryTime;
            lhsMaterialDeliveryTime = this.getMaterialDeliveryTime();
            XMLGregorianCalendar rhsMaterialDeliveryTime;
            rhsMaterialDeliveryTime = that.getMaterialDeliveryTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "materialDeliveryTime", lhsMaterialDeliveryTime), LocatorUtils.property(thatLocator, "materialDeliveryTime", rhsMaterialDeliveryTime), lhsMaterialDeliveryTime, rhsMaterialDeliveryTime, (this.materialDeliveryTime!= null), (that.materialDeliveryTime!= null))) {
                return false;
            }
        }
        {
            ProductQuantity lhsProductQuantity;
            lhsProductQuantity = this.getProductQuantity();
            ProductQuantity rhsProductQuantity;
            rhsProductQuantity = that.getProductQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productQuantity", lhsProductQuantity), LocatorUtils.property(thatLocator, "productQuantity", rhsProductQuantity), lhsProductQuantity, rhsProductQuantity, (this.productQuantity!= null), (that.productQuantity!= null))) {
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
            XMLGregorianCalendar theMaterialDeliveryTime;
            theMaterialDeliveryTime = this.getMaterialDeliveryTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "materialDeliveryTime", theMaterialDeliveryTime), currentHashCode, theMaterialDeliveryTime, (this.materialDeliveryTime!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantity", theProductQuantity), currentHashCode, theProductQuantity, (this.productQuantity!= null));
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
            XMLGregorianCalendar theMaterialDeliveryTime;
            theMaterialDeliveryTime = this.getMaterialDeliveryTime();
            strategy.appendField(locator, this, "materialDeliveryTime", buffer, theMaterialDeliveryTime, (this.materialDeliveryTime!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            strategy.appendField(locator, this, "productQuantity", buffer, theProductQuantity, (this.productQuantity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
