
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
import io.dscope.rosettanet.domain.procurement.codelist.orderadmin.v01_03.OrderAdmin;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.document.v01_11.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_11.BusinessDocumentReferenceType;
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
 * <p>Java class for RequestingOrderInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestingOrderInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.11}BusinessDocumentReference"/&gt;
 *         &lt;element name="IsOrderToBeMerged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:OrderAdmin:xsd:codelist:01.03}OrderAdmin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderCountry" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" minOccurs="0"/&gt;
 *         &lt;element name="OrderReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.11}BusinessDocumentReferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "RequestingOrderInformationType", propOrder = {
    "businessDocumentReference",
    "isOrderToBeMerged",
    "orderAdmin",
    "orderCountry",
    "orderReference"
})
public class RequestingOrderInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.11", type = BusinessDocumentReference.class)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElement(name = "IsOrderToBeMerged")
    protected boolean isOrderToBeMerged;
    @XmlElementRef(name = "OrderAdmin", namespace = "urn:rosettanet:specification:domain:Procurement:OrderAdmin:xsd:codelist:01.03", type = OrderAdmin.class, required = false)
    protected List<OrderAdmin> orderAdmin;
    @XmlElement(name = "OrderCountry")
    protected CountryType orderCountry;
    @XmlElement(name = "OrderReference")
    protected BusinessDocumentReferenceType orderReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public BusinessDocumentReference getBusinessDocumentReference() {
        return businessDocumentReference;
    }

    /**
     * Sets the value of the businessDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public void setBusinessDocumentReference(BusinessDocumentReference value) {
        this.businessDocumentReference = value;
    }

    /**
     * Gets the value of the isOrderToBeMerged property.
     * 
     */
    public boolean isIsOrderToBeMerged() {
        return isOrderToBeMerged;
    }

    /**
     * Sets the value of the isOrderToBeMerged property.
     * 
     */
    public void setIsOrderToBeMerged(boolean value) {
        this.isOrderToBeMerged = value;
    }

    /**
     * Gets the value of the orderAdmin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderAdmin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderAdmin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderAdmin }
     * 
     * 
     */
    public List<OrderAdmin> getOrderAdmin() {
        if (orderAdmin == null) {
            orderAdmin = new ArrayList<OrderAdmin>();
        }
        return this.orderAdmin;
    }

    /**
     * Gets the value of the orderCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getOrderCountry() {
        return orderCountry;
    }

    /**
     * Sets the value of the orderCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setOrderCountry(CountryType value) {
        this.orderCountry = value;
    }

    /**
     * Gets the value of the orderReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setOrderReference(BusinessDocumentReferenceType value) {
        this.orderReference = value;
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
        final RequestingOrderInformationType that = ((RequestingOrderInformationType) object);
        {
            BusinessDocumentReference lhsBusinessDocumentReference;
            lhsBusinessDocumentReference = this.getBusinessDocumentReference();
            BusinessDocumentReference rhsBusinessDocumentReference;
            rhsBusinessDocumentReference = that.getBusinessDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentReference", lhsBusinessDocumentReference), LocatorUtils.property(thatLocator, "businessDocumentReference", rhsBusinessDocumentReference), lhsBusinessDocumentReference, rhsBusinessDocumentReference, (this.businessDocumentReference!= null), (that.businessDocumentReference!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsOrderToBeMerged;
            lhsIsOrderToBeMerged = this.isIsOrderToBeMerged();
            boolean rhsIsOrderToBeMerged;
            rhsIsOrderToBeMerged = that.isIsOrderToBeMerged();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isOrderToBeMerged", lhsIsOrderToBeMerged), LocatorUtils.property(thatLocator, "isOrderToBeMerged", rhsIsOrderToBeMerged), lhsIsOrderToBeMerged, rhsIsOrderToBeMerged, true, true)) {
                return false;
            }
        }
        {
            List<OrderAdmin> lhsOrderAdmin;
            lhsOrderAdmin = (((this.orderAdmin!= null)&&(!this.orderAdmin.isEmpty()))?this.getOrderAdmin():null);
            List<OrderAdmin> rhsOrderAdmin;
            rhsOrderAdmin = (((that.orderAdmin!= null)&&(!that.orderAdmin.isEmpty()))?that.getOrderAdmin():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderAdmin", lhsOrderAdmin), LocatorUtils.property(thatLocator, "orderAdmin", rhsOrderAdmin), lhsOrderAdmin, rhsOrderAdmin, ((this.orderAdmin!= null)&&(!this.orderAdmin.isEmpty())), ((that.orderAdmin!= null)&&(!that.orderAdmin.isEmpty())))) {
                return false;
            }
        }
        {
            CountryType lhsOrderCountry;
            lhsOrderCountry = this.getOrderCountry();
            CountryType rhsOrderCountry;
            rhsOrderCountry = that.getOrderCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderCountry", lhsOrderCountry), LocatorUtils.property(thatLocator, "orderCountry", rhsOrderCountry), lhsOrderCountry, rhsOrderCountry, (this.orderCountry!= null), (that.orderCountry!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsOrderReference;
            lhsOrderReference = this.getOrderReference();
            BusinessDocumentReferenceType rhsOrderReference;
            rhsOrderReference = that.getOrderReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderReference", lhsOrderReference), LocatorUtils.property(thatLocator, "orderReference", rhsOrderReference), lhsOrderReference, rhsOrderReference, (this.orderReference!= null), (that.orderReference!= null))) {
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
            BusinessDocumentReference theBusinessDocumentReference;
            theBusinessDocumentReference = this.getBusinessDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, (this.businessDocumentReference!= null));
        }
        {
            boolean theIsOrderToBeMerged;
            theIsOrderToBeMerged = this.isIsOrderToBeMerged();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isOrderToBeMerged", theIsOrderToBeMerged), currentHashCode, theIsOrderToBeMerged, true);
        }
        {
            List<OrderAdmin> theOrderAdmin;
            theOrderAdmin = (((this.orderAdmin!= null)&&(!this.orderAdmin.isEmpty()))?this.getOrderAdmin():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderAdmin", theOrderAdmin), currentHashCode, theOrderAdmin, ((this.orderAdmin!= null)&&(!this.orderAdmin.isEmpty())));
        }
        {
            CountryType theOrderCountry;
            theOrderCountry = this.getOrderCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderCountry", theOrderCountry), currentHashCode, theOrderCountry, (this.orderCountry!= null));
        }
        {
            BusinessDocumentReferenceType theOrderReference;
            theOrderReference = this.getOrderReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderReference", theOrderReference), currentHashCode, theOrderReference, (this.orderReference!= null));
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
            BusinessDocumentReference theBusinessDocumentReference;
            theBusinessDocumentReference = this.getBusinessDocumentReference();
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, (this.businessDocumentReference!= null));
        }
        {
            boolean theIsOrderToBeMerged;
            theIsOrderToBeMerged = this.isIsOrderToBeMerged();
            strategy.appendField(locator, this, "isOrderToBeMerged", buffer, theIsOrderToBeMerged, true);
        }
        {
            List<OrderAdmin> theOrderAdmin;
            theOrderAdmin = (((this.orderAdmin!= null)&&(!this.orderAdmin.isEmpty()))?this.getOrderAdmin():null);
            strategy.appendField(locator, this, "orderAdmin", buffer, theOrderAdmin, ((this.orderAdmin!= null)&&(!this.orderAdmin.isEmpty())));
        }
        {
            CountryType theOrderCountry;
            theOrderCountry = this.getOrderCountry();
            strategy.appendField(locator, this, "orderCountry", buffer, theOrderCountry, (this.orderCountry!= null));
        }
        {
            BusinessDocumentReferenceType theOrderReference;
            theOrderReference = this.getOrderReference();
            strategy.appendField(locator, this, "orderReference", buffer, theOrderReference, (this.orderReference!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
