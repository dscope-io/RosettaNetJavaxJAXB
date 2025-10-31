
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
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.BillOfLading;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
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
 * <p>Java class for HeaderInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}BillOfLading" minOccurs="0"/&gt;
 *         &lt;element name="CommercialInvoice" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="PackingList" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingDocument" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShippingOrderInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}ShippingOrderInformationType"/&gt;
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
@XmlType(name = "HeaderInformationType", propOrder = {
    "billOfLading",
    "commercialInvoice",
    "packingList",
    "shippingDocument",
    "shippingOrderInformation"
})
public class HeaderInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BillOfLading", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = BillOfLading.class, required = false)
    protected BillOfLading billOfLading;
    @XmlElement(name = "CommercialInvoice")
    protected BusinessDocumentReferenceType commercialInvoice;
    @XmlElement(name = "PackingList")
    protected BusinessDocumentReferenceType packingList;
    @XmlElement(name = "ShippingDocument")
    protected List<BusinessDocumentReferenceType> shippingDocument;
    @XmlElement(name = "ShippingOrderInformation", required = true)
    protected ShippingOrderInformationType shippingOrderInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the billOfLading property.
     * 
     * @return
     *     possible object is
     *     {@link BillOfLading }
     *     
     */
    public BillOfLading getBillOfLading() {
        return billOfLading;
    }

    /**
     * Sets the value of the billOfLading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillOfLading }
     *     
     */
    public void setBillOfLading(BillOfLading value) {
        this.billOfLading = value;
    }

    /**
     * Gets the value of the commercialInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getCommercialInvoice() {
        return commercialInvoice;
    }

    /**
     * Sets the value of the commercialInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setCommercialInvoice(BusinessDocumentReferenceType value) {
        this.commercialInvoice = value;
    }

    /**
     * Gets the value of the packingList property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPackingList() {
        return packingList;
    }

    /**
     * Sets the value of the packingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPackingList(BusinessDocumentReferenceType value) {
        this.packingList = value;
    }

    /**
     * Gets the value of the shippingDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getShippingDocument() {
        if (shippingDocument == null) {
            shippingDocument = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.shippingDocument;
    }

    /**
     * Gets the value of the shippingOrderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOrderInformationType }
     *     
     */
    public ShippingOrderInformationType getShippingOrderInformation() {
        return shippingOrderInformation;
    }

    /**
     * Sets the value of the shippingOrderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOrderInformationType }
     *     
     */
    public void setShippingOrderInformation(ShippingOrderInformationType value) {
        this.shippingOrderInformation = value;
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
        final HeaderInformationType that = ((HeaderInformationType) object);
        {
            BillOfLading lhsBillOfLading;
            lhsBillOfLading = this.getBillOfLading();
            BillOfLading rhsBillOfLading;
            rhsBillOfLading = that.getBillOfLading();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billOfLading", lhsBillOfLading), LocatorUtils.property(thatLocator, "billOfLading", rhsBillOfLading), lhsBillOfLading, rhsBillOfLading, (this.billOfLading!= null), (that.billOfLading!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsCommercialInvoice;
            lhsCommercialInvoice = this.getCommercialInvoice();
            BusinessDocumentReferenceType rhsCommercialInvoice;
            rhsCommercialInvoice = that.getCommercialInvoice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercialInvoice", lhsCommercialInvoice), LocatorUtils.property(thatLocator, "commercialInvoice", rhsCommercialInvoice), lhsCommercialInvoice, rhsCommercialInvoice, (this.commercialInvoice!= null), (that.commercialInvoice!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsPackingList;
            lhsPackingList = this.getPackingList();
            BusinessDocumentReferenceType rhsPackingList;
            rhsPackingList = that.getPackingList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packingList", lhsPackingList), LocatorUtils.property(thatLocator, "packingList", rhsPackingList), lhsPackingList, rhsPackingList, (this.packingList!= null), (that.packingList!= null))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsShippingDocument;
            lhsShippingDocument = (((this.shippingDocument!= null)&&(!this.shippingDocument.isEmpty()))?this.getShippingDocument():null);
            List<BusinessDocumentReferenceType> rhsShippingDocument;
            rhsShippingDocument = (((that.shippingDocument!= null)&&(!that.shippingDocument.isEmpty()))?that.getShippingDocument():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingDocument", lhsShippingDocument), LocatorUtils.property(thatLocator, "shippingDocument", rhsShippingDocument), lhsShippingDocument, rhsShippingDocument, ((this.shippingDocument!= null)&&(!this.shippingDocument.isEmpty())), ((that.shippingDocument!= null)&&(!that.shippingDocument.isEmpty())))) {
                return false;
            }
        }
        {
            ShippingOrderInformationType lhsShippingOrderInformation;
            lhsShippingOrderInformation = this.getShippingOrderInformation();
            ShippingOrderInformationType rhsShippingOrderInformation;
            rhsShippingOrderInformation = that.getShippingOrderInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingOrderInformation", lhsShippingOrderInformation), LocatorUtils.property(thatLocator, "shippingOrderInformation", rhsShippingOrderInformation), lhsShippingOrderInformation, rhsShippingOrderInformation, (this.shippingOrderInformation!= null), (that.shippingOrderInformation!= null))) {
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
            BillOfLading theBillOfLading;
            theBillOfLading = this.getBillOfLading();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billOfLading", theBillOfLading), currentHashCode, theBillOfLading, (this.billOfLading!= null));
        }
        {
            BusinessDocumentReferenceType theCommercialInvoice;
            theCommercialInvoice = this.getCommercialInvoice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commercialInvoice", theCommercialInvoice), currentHashCode, theCommercialInvoice, (this.commercialInvoice!= null));
        }
        {
            BusinessDocumentReferenceType thePackingList;
            thePackingList = this.getPackingList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packingList", thePackingList), currentHashCode, thePackingList, (this.packingList!= null));
        }
        {
            List<BusinessDocumentReferenceType> theShippingDocument;
            theShippingDocument = (((this.shippingDocument!= null)&&(!this.shippingDocument.isEmpty()))?this.getShippingDocument():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingDocument", theShippingDocument), currentHashCode, theShippingDocument, ((this.shippingDocument!= null)&&(!this.shippingDocument.isEmpty())));
        }
        {
            ShippingOrderInformationType theShippingOrderInformation;
            theShippingOrderInformation = this.getShippingOrderInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingOrderInformation", theShippingOrderInformation), currentHashCode, theShippingOrderInformation, (this.shippingOrderInformation!= null));
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
            BillOfLading theBillOfLading;
            theBillOfLading = this.getBillOfLading();
            strategy.appendField(locator, this, "billOfLading", buffer, theBillOfLading, (this.billOfLading!= null));
        }
        {
            BusinessDocumentReferenceType theCommercialInvoice;
            theCommercialInvoice = this.getCommercialInvoice();
            strategy.appendField(locator, this, "commercialInvoice", buffer, theCommercialInvoice, (this.commercialInvoice!= null));
        }
        {
            BusinessDocumentReferenceType thePackingList;
            thePackingList = this.getPackingList();
            strategy.appendField(locator, this, "packingList", buffer, thePackingList, (this.packingList!= null));
        }
        {
            List<BusinessDocumentReferenceType> theShippingDocument;
            theShippingDocument = (((this.shippingDocument!= null)&&(!this.shippingDocument.isEmpty()))?this.getShippingDocument():null);
            strategy.appendField(locator, this, "shippingDocument", buffer, theShippingDocument, ((this.shippingDocument!= null)&&(!this.shippingDocument.isEmpty())));
        }
        {
            ShippingOrderInformationType theShippingOrderInformation;
            theShippingOrderInformation = this.getShippingOrderInformation();
            strategy.appendField(locator, this, "shippingOrderInformation", buffer, theShippingOrderInformation, (this.shippingOrderInformation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
