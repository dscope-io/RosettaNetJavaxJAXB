
package io.dscope.rosettanet.domain.procurement.procurement.v01_15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for ProductReceiptReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductReceiptReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ShipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShippingCointainerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductReceiptReferenceType", propOrder = {
    "date",
    "quantity",
    "shipmentIdentifier",
    "shippingCointainerIdentifier"
})
public class ProductReceiptReferenceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Quantity")
    protected float quantity;
    @XmlElement(name = "ShipmentIdentifier", required = true)
    protected String shipmentIdentifier;
    @XmlElement(name = "ShippingCointainerIdentifier")
    protected List<String> shippingCointainerIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the shipmentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentIdentifier() {
        return shipmentIdentifier;
    }

    /**
     * Sets the value of the shipmentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentIdentifier(String value) {
        this.shipmentIdentifier = value;
    }

    /**
     * Gets the value of the shippingCointainerIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingCointainerIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingCointainerIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getShippingCointainerIdentifier() {
        if (shippingCointainerIdentifier == null) {
            shippingCointainerIdentifier = new ArrayList<String>();
        }
        return this.shippingCointainerIdentifier;
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
        final ProductReceiptReferenceType that = ((ProductReceiptReferenceType) object);
        {
            XMLGregorianCalendar lhsDate;
            lhsDate = this.getDate();
            XMLGregorianCalendar rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate, (this.date!= null), (that.date!= null))) {
                return false;
            }
        }
        {
            float lhsQuantity;
            lhsQuantity = this.getQuantity();
            float rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, true, true)) {
                return false;
            }
        }
        {
            String lhsShipmentIdentifier;
            lhsShipmentIdentifier = this.getShipmentIdentifier();
            String rhsShipmentIdentifier;
            rhsShipmentIdentifier = that.getShipmentIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentIdentifier", lhsShipmentIdentifier), LocatorUtils.property(thatLocator, "shipmentIdentifier", rhsShipmentIdentifier), lhsShipmentIdentifier, rhsShipmentIdentifier, (this.shipmentIdentifier!= null), (that.shipmentIdentifier!= null))) {
                return false;
            }
        }
        {
            List<String> lhsShippingCointainerIdentifier;
            lhsShippingCointainerIdentifier = (((this.shippingCointainerIdentifier!= null)&&(!this.shippingCointainerIdentifier.isEmpty()))?this.getShippingCointainerIdentifier():null);
            List<String> rhsShippingCointainerIdentifier;
            rhsShippingCointainerIdentifier = (((that.shippingCointainerIdentifier!= null)&&(!that.shippingCointainerIdentifier.isEmpty()))?that.getShippingCointainerIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingCointainerIdentifier", lhsShippingCointainerIdentifier), LocatorUtils.property(thatLocator, "shippingCointainerIdentifier", rhsShippingCointainerIdentifier), lhsShippingCointainerIdentifier, rhsShippingCointainerIdentifier, ((this.shippingCointainerIdentifier!= null)&&(!this.shippingCointainerIdentifier.isEmpty())), ((that.shippingCointainerIdentifier!= null)&&(!that.shippingCointainerIdentifier.isEmpty())))) {
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
            XMLGregorianCalendar theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate, (this.date!= null));
        }
        {
            float theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, true);
        }
        {
            String theShipmentIdentifier;
            theShipmentIdentifier = this.getShipmentIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentIdentifier", theShipmentIdentifier), currentHashCode, theShipmentIdentifier, (this.shipmentIdentifier!= null));
        }
        {
            List<String> theShippingCointainerIdentifier;
            theShippingCointainerIdentifier = (((this.shippingCointainerIdentifier!= null)&&(!this.shippingCointainerIdentifier.isEmpty()))?this.getShippingCointainerIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingCointainerIdentifier", theShippingCointainerIdentifier), currentHashCode, theShippingCointainerIdentifier, ((this.shippingCointainerIdentifier!= null)&&(!this.shippingCointainerIdentifier.isEmpty())));
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
            XMLGregorianCalendar theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate, (this.date!= null));
        }
        {
            float theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, true);
        }
        {
            String theShipmentIdentifier;
            theShipmentIdentifier = this.getShipmentIdentifier();
            strategy.appendField(locator, this, "shipmentIdentifier", buffer, theShipmentIdentifier, (this.shipmentIdentifier!= null));
        }
        {
            List<String> theShippingCointainerIdentifier;
            theShippingCointainerIdentifier = (((this.shippingCointainerIdentifier!= null)&&(!this.shippingCointainerIdentifier.isEmpty()))?this.getShippingCointainerIdentifier():null);
            strategy.appendField(locator, this, "shippingCointainerIdentifier", buffer, theShippingCointainerIdentifier, ((this.shippingCointainerIdentifier!= null)&&(!this.shippingCointainerIdentifier.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
