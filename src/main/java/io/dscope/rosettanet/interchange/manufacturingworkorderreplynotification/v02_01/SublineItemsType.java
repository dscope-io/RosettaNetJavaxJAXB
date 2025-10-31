
package io.dscope.rosettanet.interchange.manufacturingworkorderreplynotification.v02_01;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.manufacturing.codelist.changereason.v01_04.ChangeReason;
import io.dscope.rosettanet.domain.procurement.codelist.lineitemstatus.v01_04.LineItemStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.ItemQuantityType;
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
 * <p>Java class for SublineItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SublineItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04}ChangeReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerProfile" type="{urn:rosettanet:specification:interchange:ManufacturingWorkOrderReplyNotification:xsd:schema:02.01}CustomerProfileType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.04}LineItemStatus"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ResponseStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SublineResponseQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}ItemQuantityType" minOccurs="0"/&gt;
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
@XmlType(name = "SublineItemsType", propOrder = {
    "changeReason",
    "customerProfile",
    "lineItemStatus",
    "number",
    "responseShipDate",
    "responseStartDate",
    "sublineResponseQuantity"
})
public class SublineItemsType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ChangeReason", namespace = "urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04", type = ChangeReason.class, required = false)
    protected List<ChangeReason> changeReason;
    @XmlElement(name = "CustomerProfile", required = true)
    protected CustomerProfileType customerProfile;
    @XmlElementRef(name = "LineItemStatus", namespace = "urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.04", type = LineItemStatus.class)
    protected LineItemStatus lineItemStatus;
    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "ResponseShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseShipDate;
    @XmlElement(name = "ResponseStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseStartDate;
    @XmlElement(name = "SublineResponseQuantity")
    protected ItemQuantityType sublineResponseQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the changeReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeReason }
     * 
     * 
     */
    public List<ChangeReason> getChangeReason() {
        if (changeReason == null) {
            changeReason = new ArrayList<ChangeReason>();
        }
        return this.changeReason;
    }

    /**
     * Gets the value of the customerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileType }
     *     
     */
    public CustomerProfileType getCustomerProfile() {
        return customerProfile;
    }

    /**
     * Sets the value of the customerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileType }
     *     
     */
    public void setCustomerProfile(CustomerProfileType value) {
        this.customerProfile = value;
    }

    /**
     * Gets the value of the lineItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemStatus }
     *     
     */
    public LineItemStatus getLineItemStatus() {
        return lineItemStatus;
    }

    /**
     * Sets the value of the lineItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemStatus }
     *     
     */
    public void setLineItemStatus(LineItemStatus value) {
        this.lineItemStatus = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the responseShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseShipDate() {
        return responseShipDate;
    }

    /**
     * Sets the value of the responseShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseShipDate(XMLGregorianCalendar value) {
        this.responseShipDate = value;
    }

    /**
     * Gets the value of the responseStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseStartDate() {
        return responseStartDate;
    }

    /**
     * Sets the value of the responseStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseStartDate(XMLGregorianCalendar value) {
        this.responseStartDate = value;
    }

    /**
     * Gets the value of the sublineResponseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ItemQuantityType }
     *     
     */
    public ItemQuantityType getSublineResponseQuantity() {
        return sublineResponseQuantity;
    }

    /**
     * Sets the value of the sublineResponseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemQuantityType }
     *     
     */
    public void setSublineResponseQuantity(ItemQuantityType value) {
        this.sublineResponseQuantity = value;
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
        final SublineItemsType that = ((SublineItemsType) object);
        {
            List<ChangeReason> lhsChangeReason;
            lhsChangeReason = (((this.changeReason!= null)&&(!this.changeReason.isEmpty()))?this.getChangeReason():null);
            List<ChangeReason> rhsChangeReason;
            rhsChangeReason = (((that.changeReason!= null)&&(!that.changeReason.isEmpty()))?that.getChangeReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeReason", lhsChangeReason), LocatorUtils.property(thatLocator, "changeReason", rhsChangeReason), lhsChangeReason, rhsChangeReason, ((this.changeReason!= null)&&(!this.changeReason.isEmpty())), ((that.changeReason!= null)&&(!that.changeReason.isEmpty())))) {
                return false;
            }
        }
        {
            CustomerProfileType lhsCustomerProfile;
            lhsCustomerProfile = this.getCustomerProfile();
            CustomerProfileType rhsCustomerProfile;
            rhsCustomerProfile = that.getCustomerProfile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerProfile", lhsCustomerProfile), LocatorUtils.property(thatLocator, "customerProfile", rhsCustomerProfile), lhsCustomerProfile, rhsCustomerProfile, (this.customerProfile!= null), (that.customerProfile!= null))) {
                return false;
            }
        }
        {
            LineItemStatus lhsLineItemStatus;
            lhsLineItemStatus = this.getLineItemStatus();
            LineItemStatus rhsLineItemStatus;
            rhsLineItemStatus = that.getLineItemStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineItemStatus", lhsLineItemStatus), LocatorUtils.property(thatLocator, "lineItemStatus", rhsLineItemStatus), lhsLineItemStatus, rhsLineItemStatus, (this.lineItemStatus!= null), (that.lineItemStatus!= null))) {
                return false;
            }
        }
        {
            String lhsNumber;
            lhsNumber = this.getNumber();
            String rhsNumber;
            rhsNumber = that.getNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "number", lhsNumber), LocatorUtils.property(thatLocator, "number", rhsNumber), lhsNumber, rhsNumber, (this.number!= null), (that.number!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsResponseShipDate;
            lhsResponseShipDate = this.getResponseShipDate();
            XMLGregorianCalendar rhsResponseShipDate;
            rhsResponseShipDate = that.getResponseShipDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseShipDate", lhsResponseShipDate), LocatorUtils.property(thatLocator, "responseShipDate", rhsResponseShipDate), lhsResponseShipDate, rhsResponseShipDate, (this.responseShipDate!= null), (that.responseShipDate!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsResponseStartDate;
            lhsResponseStartDate = this.getResponseStartDate();
            XMLGregorianCalendar rhsResponseStartDate;
            rhsResponseStartDate = that.getResponseStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseStartDate", lhsResponseStartDate), LocatorUtils.property(thatLocator, "responseStartDate", rhsResponseStartDate), lhsResponseStartDate, rhsResponseStartDate, (this.responseStartDate!= null), (that.responseStartDate!= null))) {
                return false;
            }
        }
        {
            ItemQuantityType lhsSublineResponseQuantity;
            lhsSublineResponseQuantity = this.getSublineResponseQuantity();
            ItemQuantityType rhsSublineResponseQuantity;
            rhsSublineResponseQuantity = that.getSublineResponseQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sublineResponseQuantity", lhsSublineResponseQuantity), LocatorUtils.property(thatLocator, "sublineResponseQuantity", rhsSublineResponseQuantity), lhsSublineResponseQuantity, rhsSublineResponseQuantity, (this.sublineResponseQuantity!= null), (that.sublineResponseQuantity!= null))) {
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
            List<ChangeReason> theChangeReason;
            theChangeReason = (((this.changeReason!= null)&&(!this.changeReason.isEmpty()))?this.getChangeReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeReason", theChangeReason), currentHashCode, theChangeReason, ((this.changeReason!= null)&&(!this.changeReason.isEmpty())));
        }
        {
            CustomerProfileType theCustomerProfile;
            theCustomerProfile = this.getCustomerProfile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerProfile", theCustomerProfile), currentHashCode, theCustomerProfile, (this.customerProfile!= null));
        }
        {
            LineItemStatus theLineItemStatus;
            theLineItemStatus = this.getLineItemStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineItemStatus", theLineItemStatus), currentHashCode, theLineItemStatus, (this.lineItemStatus!= null));
        }
        {
            String theNumber;
            theNumber = this.getNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "number", theNumber), currentHashCode, theNumber, (this.number!= null));
        }
        {
            XMLGregorianCalendar theResponseShipDate;
            theResponseShipDate = this.getResponseShipDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseShipDate", theResponseShipDate), currentHashCode, theResponseShipDate, (this.responseShipDate!= null));
        }
        {
            XMLGregorianCalendar theResponseStartDate;
            theResponseStartDate = this.getResponseStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseStartDate", theResponseStartDate), currentHashCode, theResponseStartDate, (this.responseStartDate!= null));
        }
        {
            ItemQuantityType theSublineResponseQuantity;
            theSublineResponseQuantity = this.getSublineResponseQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sublineResponseQuantity", theSublineResponseQuantity), currentHashCode, theSublineResponseQuantity, (this.sublineResponseQuantity!= null));
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
            List<ChangeReason> theChangeReason;
            theChangeReason = (((this.changeReason!= null)&&(!this.changeReason.isEmpty()))?this.getChangeReason():null);
            strategy.appendField(locator, this, "changeReason", buffer, theChangeReason, ((this.changeReason!= null)&&(!this.changeReason.isEmpty())));
        }
        {
            CustomerProfileType theCustomerProfile;
            theCustomerProfile = this.getCustomerProfile();
            strategy.appendField(locator, this, "customerProfile", buffer, theCustomerProfile, (this.customerProfile!= null));
        }
        {
            LineItemStatus theLineItemStatus;
            theLineItemStatus = this.getLineItemStatus();
            strategy.appendField(locator, this, "lineItemStatus", buffer, theLineItemStatus, (this.lineItemStatus!= null));
        }
        {
            String theNumber;
            theNumber = this.getNumber();
            strategy.appendField(locator, this, "number", buffer, theNumber, (this.number!= null));
        }
        {
            XMLGregorianCalendar theResponseShipDate;
            theResponseShipDate = this.getResponseShipDate();
            strategy.appendField(locator, this, "responseShipDate", buffer, theResponseShipDate, (this.responseShipDate!= null));
        }
        {
            XMLGregorianCalendar theResponseStartDate;
            theResponseStartDate = this.getResponseStartDate();
            strategy.appendField(locator, this, "responseStartDate", buffer, theResponseStartDate, (this.responseStartDate!= null));
        }
        {
            ItemQuantityType theSublineResponseQuantity;
            theSublineResponseQuantity = this.getSublineResponseQuantity();
            strategy.appendField(locator, this, "sublineResponseQuantity", buffer, theSublineResponseQuantity, (this.sublineResponseQuantity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
