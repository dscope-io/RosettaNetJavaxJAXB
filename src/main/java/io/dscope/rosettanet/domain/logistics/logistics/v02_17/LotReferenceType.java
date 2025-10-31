
package io.dscope.rosettanet.domain.logistics.logistics.v02_17;

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
import io.dscope.rosettanet.domain.logistics.codelist.lotdiscrepancyreason.v01_03.LotDiscrepancyReason;
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
 * <p>Java class for LotReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:LotDiscrepancyReason:xsd:codelist:01.03}LotDiscrepancyReason" minOccurs="0"/&gt;
 *         &lt;element name="RequestedLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedLotQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ShippedLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippedLotQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
@XmlType(name = "LotReferenceType", propOrder = {
    "expiryDate",
    "lotDiscrepancyReason",
    "requestedLot",
    "requestedLotQuantity",
    "shippedLot",
    "shippedLotQuantity"
})
public class LotReferenceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElementRef(name = "LotDiscrepancyReason", namespace = "urn:rosettanet:specification:domain:Logistics:LotDiscrepancyReason:xsd:codelist:01.03", type = LotDiscrepancyReason.class, required = false)
    protected LotDiscrepancyReason lotDiscrepancyReason;
    @XmlElement(name = "RequestedLot")
    protected String requestedLot;
    @XmlElement(name = "RequestedLotQuantity")
    protected Float requestedLotQuantity;
    @XmlElement(name = "ShippedLot")
    protected String shippedLot;
    @XmlElement(name = "ShippedLotQuantity")
    protected Float shippedLotQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the lotDiscrepancyReason property.
     * 
     * @return
     *     possible object is
     *     {@link LotDiscrepancyReason }
     *     
     */
    public LotDiscrepancyReason getLotDiscrepancyReason() {
        return lotDiscrepancyReason;
    }

    /**
     * Sets the value of the lotDiscrepancyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotDiscrepancyReason }
     *     
     */
    public void setLotDiscrepancyReason(LotDiscrepancyReason value) {
        this.lotDiscrepancyReason = value;
    }

    /**
     * Gets the value of the requestedLot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedLot() {
        return requestedLot;
    }

    /**
     * Sets the value of the requestedLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedLot(String value) {
        this.requestedLot = value;
    }

    /**
     * Gets the value of the requestedLotQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRequestedLotQuantity() {
        return requestedLotQuantity;
    }

    /**
     * Sets the value of the requestedLotQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRequestedLotQuantity(Float value) {
        this.requestedLotQuantity = value;
    }

    /**
     * Gets the value of the shippedLot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippedLot() {
        return shippedLot;
    }

    /**
     * Sets the value of the shippedLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippedLot(String value) {
        this.shippedLot = value;
    }

    /**
     * Gets the value of the shippedLotQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getShippedLotQuantity() {
        return shippedLotQuantity;
    }

    /**
     * Sets the value of the shippedLotQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setShippedLotQuantity(Float value) {
        this.shippedLotQuantity = value;
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
        final LotReferenceType that = ((LotReferenceType) object);
        {
            XMLGregorianCalendar lhsExpiryDate;
            lhsExpiryDate = this.getExpiryDate();
            XMLGregorianCalendar rhsExpiryDate;
            rhsExpiryDate = that.getExpiryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expiryDate", lhsExpiryDate), LocatorUtils.property(thatLocator, "expiryDate", rhsExpiryDate), lhsExpiryDate, rhsExpiryDate, (this.expiryDate!= null), (that.expiryDate!= null))) {
                return false;
            }
        }
        {
            LotDiscrepancyReason lhsLotDiscrepancyReason;
            lhsLotDiscrepancyReason = this.getLotDiscrepancyReason();
            LotDiscrepancyReason rhsLotDiscrepancyReason;
            rhsLotDiscrepancyReason = that.getLotDiscrepancyReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotDiscrepancyReason", lhsLotDiscrepancyReason), LocatorUtils.property(thatLocator, "lotDiscrepancyReason", rhsLotDiscrepancyReason), lhsLotDiscrepancyReason, rhsLotDiscrepancyReason, (this.lotDiscrepancyReason!= null), (that.lotDiscrepancyReason!= null))) {
                return false;
            }
        }
        {
            String lhsRequestedLot;
            lhsRequestedLot = this.getRequestedLot();
            String rhsRequestedLot;
            rhsRequestedLot = that.getRequestedLot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedLot", lhsRequestedLot), LocatorUtils.property(thatLocator, "requestedLot", rhsRequestedLot), lhsRequestedLot, rhsRequestedLot, (this.requestedLot!= null), (that.requestedLot!= null))) {
                return false;
            }
        }
        {
            Float lhsRequestedLotQuantity;
            lhsRequestedLotQuantity = this.getRequestedLotQuantity();
            Float rhsRequestedLotQuantity;
            rhsRequestedLotQuantity = that.getRequestedLotQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedLotQuantity", lhsRequestedLotQuantity), LocatorUtils.property(thatLocator, "requestedLotQuantity", rhsRequestedLotQuantity), lhsRequestedLotQuantity, rhsRequestedLotQuantity, (this.requestedLotQuantity!= null), (that.requestedLotQuantity!= null))) {
                return false;
            }
        }
        {
            String lhsShippedLot;
            lhsShippedLot = this.getShippedLot();
            String rhsShippedLot;
            rhsShippedLot = that.getShippedLot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippedLot", lhsShippedLot), LocatorUtils.property(thatLocator, "shippedLot", rhsShippedLot), lhsShippedLot, rhsShippedLot, (this.shippedLot!= null), (that.shippedLot!= null))) {
                return false;
            }
        }
        {
            Float lhsShippedLotQuantity;
            lhsShippedLotQuantity = this.getShippedLotQuantity();
            Float rhsShippedLotQuantity;
            rhsShippedLotQuantity = that.getShippedLotQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippedLotQuantity", lhsShippedLotQuantity), LocatorUtils.property(thatLocator, "shippedLotQuantity", rhsShippedLotQuantity), lhsShippedLotQuantity, rhsShippedLotQuantity, (this.shippedLotQuantity!= null), (that.shippedLotQuantity!= null))) {
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
            XMLGregorianCalendar theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expiryDate", theExpiryDate), currentHashCode, theExpiryDate, (this.expiryDate!= null));
        }
        {
            LotDiscrepancyReason theLotDiscrepancyReason;
            theLotDiscrepancyReason = this.getLotDiscrepancyReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotDiscrepancyReason", theLotDiscrepancyReason), currentHashCode, theLotDiscrepancyReason, (this.lotDiscrepancyReason!= null));
        }
        {
            String theRequestedLot;
            theRequestedLot = this.getRequestedLot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedLot", theRequestedLot), currentHashCode, theRequestedLot, (this.requestedLot!= null));
        }
        {
            Float theRequestedLotQuantity;
            theRequestedLotQuantity = this.getRequestedLotQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedLotQuantity", theRequestedLotQuantity), currentHashCode, theRequestedLotQuantity, (this.requestedLotQuantity!= null));
        }
        {
            String theShippedLot;
            theShippedLot = this.getShippedLot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippedLot", theShippedLot), currentHashCode, theShippedLot, (this.shippedLot!= null));
        }
        {
            Float theShippedLotQuantity;
            theShippedLotQuantity = this.getShippedLotQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippedLotQuantity", theShippedLotQuantity), currentHashCode, theShippedLotQuantity, (this.shippedLotQuantity!= null));
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
            XMLGregorianCalendar theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            strategy.appendField(locator, this, "expiryDate", buffer, theExpiryDate, (this.expiryDate!= null));
        }
        {
            LotDiscrepancyReason theLotDiscrepancyReason;
            theLotDiscrepancyReason = this.getLotDiscrepancyReason();
            strategy.appendField(locator, this, "lotDiscrepancyReason", buffer, theLotDiscrepancyReason, (this.lotDiscrepancyReason!= null));
        }
        {
            String theRequestedLot;
            theRequestedLot = this.getRequestedLot();
            strategy.appendField(locator, this, "requestedLot", buffer, theRequestedLot, (this.requestedLot!= null));
        }
        {
            Float theRequestedLotQuantity;
            theRequestedLotQuantity = this.getRequestedLotQuantity();
            strategy.appendField(locator, this, "requestedLotQuantity", buffer, theRequestedLotQuantity, (this.requestedLotQuantity!= null));
        }
        {
            String theShippedLot;
            theShippedLot = this.getShippedLot();
            strategy.appendField(locator, this, "shippedLot", buffer, theShippedLot, (this.shippedLot!= null));
        }
        {
            Float theShippedLotQuantity;
            theShippedLotQuantity = this.getShippedLotQuantity();
            strategy.appendField(locator, this, "shippedLotQuantity", buffer, theShippedLotQuantity, (this.shippedLotQuantity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
