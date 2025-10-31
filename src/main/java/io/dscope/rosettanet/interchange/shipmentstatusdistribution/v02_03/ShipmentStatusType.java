
package io.dscope.rosettanet.interchange.shipmentstatusdistribution.v02_03;

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
 * <p>Java class for ShipmentStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestingDocumentReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.11}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentInformation" type="{urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:02.03}ShipmentInformationType"/&gt;
 *         &lt;element name="ShipmentLineItem" type="{urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:02.03}ShipmentLineItemType" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentStatusType", propOrder = {
    "requestingDocumentReference",
    "shipmentInformation",
    "shipmentLineItem"
})
public class ShipmentStatusType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "RequestingDocumentReference")
    protected List<BusinessDocumentReferenceType> requestingDocumentReference;
    @XmlElement(name = "ShipmentInformation", required = true)
    protected ShipmentInformationType shipmentInformation;
    @XmlElement(name = "ShipmentLineItem")
    protected ShipmentLineItemType shipmentLineItem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the requestingDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestingDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestingDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getRequestingDocumentReference() {
        if (requestingDocumentReference == null) {
            requestingDocumentReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.requestingDocumentReference;
    }

    /**
     * Gets the value of the shipmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentInformationType }
     *     
     */
    public ShipmentInformationType getShipmentInformation() {
        return shipmentInformation;
    }

    /**
     * Sets the value of the shipmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentInformationType }
     *     
     */
    public void setShipmentInformation(ShipmentInformationType value) {
        this.shipmentInformation = value;
    }

    /**
     * Gets the value of the shipmentLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentLineItemType }
     *     
     */
    public ShipmentLineItemType getShipmentLineItem() {
        return shipmentLineItem;
    }

    /**
     * Sets the value of the shipmentLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentLineItemType }
     *     
     */
    public void setShipmentLineItem(ShipmentLineItemType value) {
        this.shipmentLineItem = value;
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
        final ShipmentStatusType that = ((ShipmentStatusType) object);
        {
            List<BusinessDocumentReferenceType> lhsRequestingDocumentReference;
            lhsRequestingDocumentReference = (((this.requestingDocumentReference!= null)&&(!this.requestingDocumentReference.isEmpty()))?this.getRequestingDocumentReference():null);
            List<BusinessDocumentReferenceType> rhsRequestingDocumentReference;
            rhsRequestingDocumentReference = (((that.requestingDocumentReference!= null)&&(!that.requestingDocumentReference.isEmpty()))?that.getRequestingDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestingDocumentReference", lhsRequestingDocumentReference), LocatorUtils.property(thatLocator, "requestingDocumentReference", rhsRequestingDocumentReference), lhsRequestingDocumentReference, rhsRequestingDocumentReference, ((this.requestingDocumentReference!= null)&&(!this.requestingDocumentReference.isEmpty())), ((that.requestingDocumentReference!= null)&&(!that.requestingDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            ShipmentInformationType lhsShipmentInformation;
            lhsShipmentInformation = this.getShipmentInformation();
            ShipmentInformationType rhsShipmentInformation;
            rhsShipmentInformation = that.getShipmentInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentInformation", lhsShipmentInformation), LocatorUtils.property(thatLocator, "shipmentInformation", rhsShipmentInformation), lhsShipmentInformation, rhsShipmentInformation, (this.shipmentInformation!= null), (that.shipmentInformation!= null))) {
                return false;
            }
        }
        {
            ShipmentLineItemType lhsShipmentLineItem;
            lhsShipmentLineItem = this.getShipmentLineItem();
            ShipmentLineItemType rhsShipmentLineItem;
            rhsShipmentLineItem = that.getShipmentLineItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentLineItem", lhsShipmentLineItem), LocatorUtils.property(thatLocator, "shipmentLineItem", rhsShipmentLineItem), lhsShipmentLineItem, rhsShipmentLineItem, (this.shipmentLineItem!= null), (that.shipmentLineItem!= null))) {
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
            List<BusinessDocumentReferenceType> theRequestingDocumentReference;
            theRequestingDocumentReference = (((this.requestingDocumentReference!= null)&&(!this.requestingDocumentReference.isEmpty()))?this.getRequestingDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestingDocumentReference", theRequestingDocumentReference), currentHashCode, theRequestingDocumentReference, ((this.requestingDocumentReference!= null)&&(!this.requestingDocumentReference.isEmpty())));
        }
        {
            ShipmentInformationType theShipmentInformation;
            theShipmentInformation = this.getShipmentInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentInformation", theShipmentInformation), currentHashCode, theShipmentInformation, (this.shipmentInformation!= null));
        }
        {
            ShipmentLineItemType theShipmentLineItem;
            theShipmentLineItem = this.getShipmentLineItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentLineItem", theShipmentLineItem), currentHashCode, theShipmentLineItem, (this.shipmentLineItem!= null));
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
            List<BusinessDocumentReferenceType> theRequestingDocumentReference;
            theRequestingDocumentReference = (((this.requestingDocumentReference!= null)&&(!this.requestingDocumentReference.isEmpty()))?this.getRequestingDocumentReference():null);
            strategy.appendField(locator, this, "requestingDocumentReference", buffer, theRequestingDocumentReference, ((this.requestingDocumentReference!= null)&&(!this.requestingDocumentReference.isEmpty())));
        }
        {
            ShipmentInformationType theShipmentInformation;
            theShipmentInformation = this.getShipmentInformation();
            strategy.appendField(locator, this, "shipmentInformation", buffer, theShipmentInformation, (this.shipmentInformation!= null));
        }
        {
            ShipmentLineItemType theShipmentLineItem;
            theShipmentLineItem = this.getShipmentLineItem();
            strategy.appendField(locator, this, "shipmentLineItem", buffer, theShipmentLineItem, (this.shipmentLineItem!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
