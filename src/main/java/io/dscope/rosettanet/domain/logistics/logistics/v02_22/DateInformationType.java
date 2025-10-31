
package io.dscope.rosettanet.domain.logistics.logistics.v02_22;

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
 * <p>Java class for DateInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GoodsIssuedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestedShipDate" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}ShipmentDateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
@XmlType(name = "DateInformationType", propOrder = {
    "actualShipDate",
    "goodsIssuedDate",
    "requestedShipDate",
    "scheduledDeliveryDate"
})
public class DateInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ActualShipDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualShipDate;
    @XmlElement(name = "GoodsIssuedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar goodsIssuedDate;
    @XmlElement(name = "RequestedShipDate")
    protected List<ShipmentDateType> requestedShipDate;
    @XmlElement(name = "ScheduledDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduledDeliveryDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actualShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualShipDate() {
        return actualShipDate;
    }

    /**
     * Sets the value of the actualShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualShipDate(XMLGregorianCalendar value) {
        this.actualShipDate = value;
    }

    /**
     * Gets the value of the goodsIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGoodsIssuedDate() {
        return goodsIssuedDate;
    }

    /**
     * Sets the value of the goodsIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGoodsIssuedDate(XMLGregorianCalendar value) {
        this.goodsIssuedDate = value;
    }

    /**
     * Gets the value of the requestedShipDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedShipDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedShipDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentDateType }
     * 
     * 
     */
    public List<ShipmentDateType> getRequestedShipDate() {
        if (requestedShipDate == null) {
            requestedShipDate = new ArrayList<ShipmentDateType>();
        }
        return this.requestedShipDate;
    }

    /**
     * Gets the value of the scheduledDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDeliveryDate() {
        return scheduledDeliveryDate;
    }

    /**
     * Sets the value of the scheduledDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDeliveryDate(XMLGregorianCalendar value) {
        this.scheduledDeliveryDate = value;
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
        final DateInformationType that = ((DateInformationType) object);
        {
            XMLGregorianCalendar lhsActualShipDate;
            lhsActualShipDate = this.getActualShipDate();
            XMLGregorianCalendar rhsActualShipDate;
            rhsActualShipDate = that.getActualShipDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualShipDate", lhsActualShipDate), LocatorUtils.property(thatLocator, "actualShipDate", rhsActualShipDate), lhsActualShipDate, rhsActualShipDate, (this.actualShipDate!= null), (that.actualShipDate!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsGoodsIssuedDate;
            lhsGoodsIssuedDate = this.getGoodsIssuedDate();
            XMLGregorianCalendar rhsGoodsIssuedDate;
            rhsGoodsIssuedDate = that.getGoodsIssuedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goodsIssuedDate", lhsGoodsIssuedDate), LocatorUtils.property(thatLocator, "goodsIssuedDate", rhsGoodsIssuedDate), lhsGoodsIssuedDate, rhsGoodsIssuedDate, (this.goodsIssuedDate!= null), (that.goodsIssuedDate!= null))) {
                return false;
            }
        }
        {
            List<ShipmentDateType> lhsRequestedShipDate;
            lhsRequestedShipDate = (((this.requestedShipDate!= null)&&(!this.requestedShipDate.isEmpty()))?this.getRequestedShipDate():null);
            List<ShipmentDateType> rhsRequestedShipDate;
            rhsRequestedShipDate = (((that.requestedShipDate!= null)&&(!that.requestedShipDate.isEmpty()))?that.getRequestedShipDate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedShipDate", lhsRequestedShipDate), LocatorUtils.property(thatLocator, "requestedShipDate", rhsRequestedShipDate), lhsRequestedShipDate, rhsRequestedShipDate, ((this.requestedShipDate!= null)&&(!this.requestedShipDate.isEmpty())), ((that.requestedShipDate!= null)&&(!that.requestedShipDate.isEmpty())))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsScheduledDeliveryDate;
            lhsScheduledDeliveryDate = this.getScheduledDeliveryDate();
            XMLGregorianCalendar rhsScheduledDeliveryDate;
            rhsScheduledDeliveryDate = that.getScheduledDeliveryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledDeliveryDate", lhsScheduledDeliveryDate), LocatorUtils.property(thatLocator, "scheduledDeliveryDate", rhsScheduledDeliveryDate), lhsScheduledDeliveryDate, rhsScheduledDeliveryDate, (this.scheduledDeliveryDate!= null), (that.scheduledDeliveryDate!= null))) {
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
            XMLGregorianCalendar theActualShipDate;
            theActualShipDate = this.getActualShipDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualShipDate", theActualShipDate), currentHashCode, theActualShipDate, (this.actualShipDate!= null));
        }
        {
            XMLGregorianCalendar theGoodsIssuedDate;
            theGoodsIssuedDate = this.getGoodsIssuedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "goodsIssuedDate", theGoodsIssuedDate), currentHashCode, theGoodsIssuedDate, (this.goodsIssuedDate!= null));
        }
        {
            List<ShipmentDateType> theRequestedShipDate;
            theRequestedShipDate = (((this.requestedShipDate!= null)&&(!this.requestedShipDate.isEmpty()))?this.getRequestedShipDate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedShipDate", theRequestedShipDate), currentHashCode, theRequestedShipDate, ((this.requestedShipDate!= null)&&(!this.requestedShipDate.isEmpty())));
        }
        {
            XMLGregorianCalendar theScheduledDeliveryDate;
            theScheduledDeliveryDate = this.getScheduledDeliveryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledDeliveryDate", theScheduledDeliveryDate), currentHashCode, theScheduledDeliveryDate, (this.scheduledDeliveryDate!= null));
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
            XMLGregorianCalendar theActualShipDate;
            theActualShipDate = this.getActualShipDate();
            strategy.appendField(locator, this, "actualShipDate", buffer, theActualShipDate, (this.actualShipDate!= null));
        }
        {
            XMLGregorianCalendar theGoodsIssuedDate;
            theGoodsIssuedDate = this.getGoodsIssuedDate();
            strategy.appendField(locator, this, "goodsIssuedDate", buffer, theGoodsIssuedDate, (this.goodsIssuedDate!= null));
        }
        {
            List<ShipmentDateType> theRequestedShipDate;
            theRequestedShipDate = (((this.requestedShipDate!= null)&&(!this.requestedShipDate.isEmpty()))?this.getRequestedShipDate():null);
            strategy.appendField(locator, this, "requestedShipDate", buffer, theRequestedShipDate, ((this.requestedShipDate!= null)&&(!this.requestedShipDate.isEmpty())));
        }
        {
            XMLGregorianCalendar theScheduledDeliveryDate;
            theScheduledDeliveryDate = this.getScheduledDeliveryDate();
            strategy.appendField(locator, this, "scheduledDeliveryDate", buffer, theScheduledDeliveryDate, (this.scheduledDeliveryDate!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
