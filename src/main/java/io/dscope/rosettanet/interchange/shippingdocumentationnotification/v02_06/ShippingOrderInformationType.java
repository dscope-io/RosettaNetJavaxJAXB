
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_06;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.OrderInformation;
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
 * <p>Java class for ShippingOrderInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingOrderInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}OrderInformation"/&gt;
 *         &lt;element name="RequestingOrderInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.06}RequestingOrderInformationType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ShippingOrderInformationType", propOrder = {
    "orderInformation",
    "requestingOrderInformation"
})
public class ShippingOrderInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "OrderInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", type = OrderInformation.class)
    protected OrderInformation orderInformation;
    @XmlElement(name = "RequestingOrderInformation", required = true)
    protected List<RequestingOrderInformationType> requestingOrderInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the orderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInformation }
     *     
     */
    public OrderInformation getOrderInformation() {
        return orderInformation;
    }

    /**
     * Sets the value of the orderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInformation }
     *     
     */
    public void setOrderInformation(OrderInformation value) {
        this.orderInformation = value;
    }

    /**
     * Gets the value of the requestingOrderInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestingOrderInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestingOrderInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestingOrderInformationType }
     * 
     * 
     */
    public List<RequestingOrderInformationType> getRequestingOrderInformation() {
        if (requestingOrderInformation == null) {
            requestingOrderInformation = new ArrayList<RequestingOrderInformationType>();
        }
        return this.requestingOrderInformation;
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
        final ShippingOrderInformationType that = ((ShippingOrderInformationType) object);
        {
            OrderInformation lhsOrderInformation;
            lhsOrderInformation = this.getOrderInformation();
            OrderInformation rhsOrderInformation;
            rhsOrderInformation = that.getOrderInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderInformation", lhsOrderInformation), LocatorUtils.property(thatLocator, "orderInformation", rhsOrderInformation), lhsOrderInformation, rhsOrderInformation, (this.orderInformation!= null), (that.orderInformation!= null))) {
                return false;
            }
        }
        {
            List<RequestingOrderInformationType> lhsRequestingOrderInformation;
            lhsRequestingOrderInformation = (((this.requestingOrderInformation!= null)&&(!this.requestingOrderInformation.isEmpty()))?this.getRequestingOrderInformation():null);
            List<RequestingOrderInformationType> rhsRequestingOrderInformation;
            rhsRequestingOrderInformation = (((that.requestingOrderInformation!= null)&&(!that.requestingOrderInformation.isEmpty()))?that.getRequestingOrderInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestingOrderInformation", lhsRequestingOrderInformation), LocatorUtils.property(thatLocator, "requestingOrderInformation", rhsRequestingOrderInformation), lhsRequestingOrderInformation, rhsRequestingOrderInformation, ((this.requestingOrderInformation!= null)&&(!this.requestingOrderInformation.isEmpty())), ((that.requestingOrderInformation!= null)&&(!that.requestingOrderInformation.isEmpty())))) {
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
            OrderInformation theOrderInformation;
            theOrderInformation = this.getOrderInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderInformation", theOrderInformation), currentHashCode, theOrderInformation, (this.orderInformation!= null));
        }
        {
            List<RequestingOrderInformationType> theRequestingOrderInformation;
            theRequestingOrderInformation = (((this.requestingOrderInformation!= null)&&(!this.requestingOrderInformation.isEmpty()))?this.getRequestingOrderInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestingOrderInformation", theRequestingOrderInformation), currentHashCode, theRequestingOrderInformation, ((this.requestingOrderInformation!= null)&&(!this.requestingOrderInformation.isEmpty())));
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
            OrderInformation theOrderInformation;
            theOrderInformation = this.getOrderInformation();
            strategy.appendField(locator, this, "orderInformation", buffer, theOrderInformation, (this.orderInformation!= null));
        }
        {
            List<RequestingOrderInformationType> theRequestingOrderInformation;
            theRequestingOrderInformation = (((this.requestingOrderInformation!= null)&&(!this.requestingOrderInformation.isEmpty()))?this.getRequestingOrderInformation():null);
            strategy.appendField(locator, this, "requestingOrderInformation", buffer, theRequestingOrderInformation, ((this.requestingOrderInformation!= null)&&(!this.requestingOrderInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
