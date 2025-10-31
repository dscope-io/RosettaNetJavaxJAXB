
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_05;

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
import io.dscope.rosettanet.domain.logistics.codelist.shippingdocument.v01_02.ShippingDocument;
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
 * <p>Java class for ShippingBusinessDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingBusinessDocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeclarationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HeaderInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}HeaderInformationType"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}ShipmentInformationType"/&gt;
 *         &lt;element name="ShipmentLineItem" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}ShipmentLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShippingDocument:xsd:codelist:01.02}ShippingDocument"/&gt;
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
@XmlType(name = "ShippingBusinessDocumentType", propOrder = {
    "declarationMode",
    "headerInformation",
    "remarks",
    "shipmentInformation",
    "shipmentLineItem",
    "shippingDocument"
})
public class ShippingBusinessDocumentType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DeclarationMode")
    protected String declarationMode;
    @XmlElement(name = "HeaderInformation", required = true)
    protected HeaderInformationType headerInformation;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "ShipmentInformation", required = true)
    protected ShipmentInformationType shipmentInformation;
    @XmlElement(name = "ShipmentLineItem", required = true)
    protected List<ShipmentLineItemType> shipmentLineItem;
    @XmlElementRef(name = "ShippingDocument", namespace = "urn:rosettanet:specification:domain:Logistics:ShippingDocument:xsd:codelist:01.02", type = ShippingDocument.class)
    protected ShippingDocument shippingDocument;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the declarationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarationMode() {
        return declarationMode;
    }

    /**
     * Sets the value of the declarationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarationMode(String value) {
        this.declarationMode = value;
    }

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformationType }
     *     
     */
    public HeaderInformationType getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformationType }
     *     
     */
    public void setHeaderInformation(HeaderInformationType value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentLineItemType }
     * 
     * 
     */
    public List<ShipmentLineItemType> getShipmentLineItem() {
        if (shipmentLineItem == null) {
            shipmentLineItem = new ArrayList<ShipmentLineItemType>();
        }
        return this.shipmentLineItem;
    }

    /**
     * Gets the value of the shippingDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocument }
     *     
     */
    public ShippingDocument getShippingDocument() {
        return shippingDocument;
    }

    /**
     * Sets the value of the shippingDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocument }
     *     
     */
    public void setShippingDocument(ShippingDocument value) {
        this.shippingDocument = value;
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
        final ShippingBusinessDocumentType that = ((ShippingBusinessDocumentType) object);
        {
            String lhsDeclarationMode;
            lhsDeclarationMode = this.getDeclarationMode();
            String rhsDeclarationMode;
            rhsDeclarationMode = that.getDeclarationMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "declarationMode", lhsDeclarationMode), LocatorUtils.property(thatLocator, "declarationMode", rhsDeclarationMode), lhsDeclarationMode, rhsDeclarationMode, (this.declarationMode!= null), (that.declarationMode!= null))) {
                return false;
            }
        }
        {
            HeaderInformationType lhsHeaderInformation;
            lhsHeaderInformation = this.getHeaderInformation();
            HeaderInformationType rhsHeaderInformation;
            rhsHeaderInformation = that.getHeaderInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "headerInformation", lhsHeaderInformation), LocatorUtils.property(thatLocator, "headerInformation", rhsHeaderInformation), lhsHeaderInformation, rhsHeaderInformation, (this.headerInformation!= null), (that.headerInformation!= null))) {
                return false;
            }
        }
        {
            String lhsRemarks;
            lhsRemarks = this.getRemarks();
            String rhsRemarks;
            rhsRemarks = that.getRemarks();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remarks", lhsRemarks), LocatorUtils.property(thatLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks, (this.remarks!= null), (that.remarks!= null))) {
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
            List<ShipmentLineItemType> lhsShipmentLineItem;
            lhsShipmentLineItem = (((this.shipmentLineItem!= null)&&(!this.shipmentLineItem.isEmpty()))?this.getShipmentLineItem():null);
            List<ShipmentLineItemType> rhsShipmentLineItem;
            rhsShipmentLineItem = (((that.shipmentLineItem!= null)&&(!that.shipmentLineItem.isEmpty()))?that.getShipmentLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentLineItem", lhsShipmentLineItem), LocatorUtils.property(thatLocator, "shipmentLineItem", rhsShipmentLineItem), lhsShipmentLineItem, rhsShipmentLineItem, ((this.shipmentLineItem!= null)&&(!this.shipmentLineItem.isEmpty())), ((that.shipmentLineItem!= null)&&(!that.shipmentLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            ShippingDocument lhsShippingDocument;
            lhsShippingDocument = this.getShippingDocument();
            ShippingDocument rhsShippingDocument;
            rhsShippingDocument = that.getShippingDocument();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingDocument", lhsShippingDocument), LocatorUtils.property(thatLocator, "shippingDocument", rhsShippingDocument), lhsShippingDocument, rhsShippingDocument, (this.shippingDocument!= null), (that.shippingDocument!= null))) {
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
            String theDeclarationMode;
            theDeclarationMode = this.getDeclarationMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "declarationMode", theDeclarationMode), currentHashCode, theDeclarationMode, (this.declarationMode!= null));
        }
        {
            HeaderInformationType theHeaderInformation;
            theHeaderInformation = this.getHeaderInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "headerInformation", theHeaderInformation), currentHashCode, theHeaderInformation, (this.headerInformation!= null));
        }
        {
            String theRemarks;
            theRemarks = this.getRemarks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks, (this.remarks!= null));
        }
        {
            ShipmentInformationType theShipmentInformation;
            theShipmentInformation = this.getShipmentInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentInformation", theShipmentInformation), currentHashCode, theShipmentInformation, (this.shipmentInformation!= null));
        }
        {
            List<ShipmentLineItemType> theShipmentLineItem;
            theShipmentLineItem = (((this.shipmentLineItem!= null)&&(!this.shipmentLineItem.isEmpty()))?this.getShipmentLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentLineItem", theShipmentLineItem), currentHashCode, theShipmentLineItem, ((this.shipmentLineItem!= null)&&(!this.shipmentLineItem.isEmpty())));
        }
        {
            ShippingDocument theShippingDocument;
            theShippingDocument = this.getShippingDocument();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingDocument", theShippingDocument), currentHashCode, theShippingDocument, (this.shippingDocument!= null));
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
            String theDeclarationMode;
            theDeclarationMode = this.getDeclarationMode();
            strategy.appendField(locator, this, "declarationMode", buffer, theDeclarationMode, (this.declarationMode!= null));
        }
        {
            HeaderInformationType theHeaderInformation;
            theHeaderInformation = this.getHeaderInformation();
            strategy.appendField(locator, this, "headerInformation", buffer, theHeaderInformation, (this.headerInformation!= null));
        }
        {
            String theRemarks;
            theRemarks = this.getRemarks();
            strategy.appendField(locator, this, "remarks", buffer, theRemarks, (this.remarks!= null));
        }
        {
            ShipmentInformationType theShipmentInformation;
            theShipmentInformation = this.getShipmentInformation();
            strategy.appendField(locator, this, "shipmentInformation", buffer, theShipmentInformation, (this.shipmentInformation!= null));
        }
        {
            List<ShipmentLineItemType> theShipmentLineItem;
            theShipmentLineItem = (((this.shipmentLineItem!= null)&&(!this.shipmentLineItem.isEmpty()))?this.getShipmentLineItem():null);
            strategy.appendField(locator, this, "shipmentLineItem", buffer, theShipmentLineItem, ((this.shipmentLineItem!= null)&&(!this.shipmentLineItem.isEmpty())));
        }
        {
            ShippingDocument theShippingDocument;
            theShippingDocument = this.getShippingDocument();
            strategy.appendField(locator, this, "shippingDocument", buffer, theShippingDocument, (this.shippingDocument!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
