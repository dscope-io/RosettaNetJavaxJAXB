
package io.dscope.rosettanet.interchange.shipmentreceiptnotification.v02_01;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_18.LotReference;
import io.dscope.rosettanet.domain.logistics.logistics.v02_18.ManufacturerProfile;
import io.dscope.rosettanet.domain.procurement.procurement.v02_20.PartPayment;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_09.BusinessDocumentReference;
import io.dscope.rosettanet.universal.monetaryexpression.v01_05.FinancialAmountType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
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
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20" xmlns:drd="urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancy:xsd:codelist:01.03" xmlns:drdr="urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancyReason:xsd:codelist:01.03" xmlns:p511924_="http://annox.dev.java.net" xmlns:p990529_="http://java.sun.com/xml/ns/jaxb" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.13" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.19" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:ShipmentReceiptNotification:xsd:schema:02.01" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.09" xmlns:ume="urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.05" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ShipmentReceiptLineItem, at least one occurrence of ManufacturerProfile/CountryOfOrigin, ManufacturerProfile/ManufactureDate or ManufacturerProfile/ProductSerialIdentifier.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ShipmentReceiptLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentReceiptLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.09}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DiscrepancyInformation" type="{urn:rosettanet:specification:interchange:ShipmentReceiptNotification:xsd:schema:02.01}DiscrepancyInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18}LotReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18}ManufacturerProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20}PartPayment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="QuantityInformation" type="{urn:rosettanet:specification:interchange:ShipmentReceiptNotification:xsd:schema:02.01}QuantityInformationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.05}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentReceiptLineItemType", propOrder = {
    "businessDocumentReference",
    "discrepancyInformation",
    "lotReference",
    "manufacturerProfile",
    "partPayment",
    "productIdentification",
    "quantityInformation",
    "unitOfMeasure",
    "unitPrice"
})
public class ShipmentReceiptLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.09", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "DiscrepancyInformation")
    protected DiscrepancyInformationType discrepancyInformation;
    @XmlElementRef(name = "LotReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", type = LotReference.class, required = false)
    protected List<LotReference> lotReference;
    @XmlElementRef(name = "ManufacturerProfile", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", type = ManufacturerProfile.class, required = false)
    protected List<ManufacturerProfile> manufacturerProfile;
    @XmlElementRef(name = "PartPayment", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20", type = PartPayment.class, required = false)
    protected PartPayment partPayment;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "QuantityInformation", required = true)
    protected QuantityInformationType quantityInformation;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "UnitPrice")
    protected FinancialAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
    }

    /**
     * Gets the value of the discrepancyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DiscrepancyInformationType }
     *     
     */
    public DiscrepancyInformationType getDiscrepancyInformation() {
        return discrepancyInformation;
    }

    /**
     * Sets the value of the discrepancyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscrepancyInformationType }
     *     
     */
    public void setDiscrepancyInformation(DiscrepancyInformationType value) {
        this.discrepancyInformation = value;
    }

    /**
     * Gets the value of the lotReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotReference }
     * 
     * 
     */
    public List<LotReference> getLotReference() {
        if (lotReference == null) {
            lotReference = new ArrayList<LotReference>();
        }
        return this.lotReference;
    }

    /**
     * Gets the value of the manufacturerProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManufacturerProfile }
     * 
     * 
     */
    public List<ManufacturerProfile> getManufacturerProfile() {
        if (manufacturerProfile == null) {
            manufacturerProfile = new ArrayList<ManufacturerProfile>();
        }
        return this.manufacturerProfile;
    }

    /**
     * Gets the value of the partPayment property.
     * 
     * @return
     *     possible object is
     *     {@link PartPayment }
     *     
     */
    public PartPayment getPartPayment() {
        return partPayment;
    }

    /**
     * Sets the value of the partPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartPayment }
     *     
     */
    public void setPartPayment(PartPayment value) {
        this.partPayment = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the quantityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityInformationType }
     *     
     */
    public QuantityInformationType getQuantityInformation() {
        return quantityInformation;
    }

    /**
     * Sets the value of the quantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityInformationType }
     *     
     */
    public void setQuantityInformation(QuantityInformationType value) {
        this.quantityInformation = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setUnitPrice(FinancialAmountType value) {
        this.unitPrice = value;
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
        final ShipmentReceiptLineItemType that = ((ShipmentReceiptLineItemType) object);
        {
            List<BusinessDocumentReference> lhsBusinessDocumentReference;
            lhsBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            List<BusinessDocumentReference> rhsBusinessDocumentReference;
            rhsBusinessDocumentReference = (((that.businessDocumentReference!= null)&&(!that.businessDocumentReference.isEmpty()))?that.getBusinessDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentReference", lhsBusinessDocumentReference), LocatorUtils.property(thatLocator, "businessDocumentReference", rhsBusinessDocumentReference), lhsBusinessDocumentReference, rhsBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())), ((that.businessDocumentReference!= null)&&(!that.businessDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            DiscrepancyInformationType lhsDiscrepancyInformation;
            lhsDiscrepancyInformation = this.getDiscrepancyInformation();
            DiscrepancyInformationType rhsDiscrepancyInformation;
            rhsDiscrepancyInformation = that.getDiscrepancyInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discrepancyInformation", lhsDiscrepancyInformation), LocatorUtils.property(thatLocator, "discrepancyInformation", rhsDiscrepancyInformation), lhsDiscrepancyInformation, rhsDiscrepancyInformation, (this.discrepancyInformation!= null), (that.discrepancyInformation!= null))) {
                return false;
            }
        }
        {
            List<LotReference> lhsLotReference;
            lhsLotReference = (((this.lotReference!= null)&&(!this.lotReference.isEmpty()))?this.getLotReference():null);
            List<LotReference> rhsLotReference;
            rhsLotReference = (((that.lotReference!= null)&&(!that.lotReference.isEmpty()))?that.getLotReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotReference", lhsLotReference), LocatorUtils.property(thatLocator, "lotReference", rhsLotReference), lhsLotReference, rhsLotReference, ((this.lotReference!= null)&&(!this.lotReference.isEmpty())), ((that.lotReference!= null)&&(!that.lotReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<ManufacturerProfile> lhsManufacturerProfile;
            lhsManufacturerProfile = (((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty()))?this.getManufacturerProfile():null);
            List<ManufacturerProfile> rhsManufacturerProfile;
            rhsManufacturerProfile = (((that.manufacturerProfile!= null)&&(!that.manufacturerProfile.isEmpty()))?that.getManufacturerProfile():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturerProfile", lhsManufacturerProfile), LocatorUtils.property(thatLocator, "manufacturerProfile", rhsManufacturerProfile), lhsManufacturerProfile, rhsManufacturerProfile, ((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty())), ((that.manufacturerProfile!= null)&&(!that.manufacturerProfile.isEmpty())))) {
                return false;
            }
        }
        {
            PartPayment lhsPartPayment;
            lhsPartPayment = this.getPartPayment();
            PartPayment rhsPartPayment;
            rhsPartPayment = that.getPartPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partPayment", lhsPartPayment), LocatorUtils.property(thatLocator, "partPayment", rhsPartPayment), lhsPartPayment, rhsPartPayment, (this.partPayment!= null), (that.partPayment!= null))) {
                return false;
            }
        }
        {
            ProductIdentification lhsProductIdentification;
            lhsProductIdentification = this.getProductIdentification();
            ProductIdentification rhsProductIdentification;
            rhsProductIdentification = that.getProductIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentification", lhsProductIdentification), LocatorUtils.property(thatLocator, "productIdentification", rhsProductIdentification), lhsProductIdentification, rhsProductIdentification, (this.productIdentification!= null), (that.productIdentification!= null))) {
                return false;
            }
        }
        {
            QuantityInformationType lhsQuantityInformation;
            lhsQuantityInformation = this.getQuantityInformation();
            QuantityInformationType rhsQuantityInformation;
            rhsQuantityInformation = that.getQuantityInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityInformation", lhsQuantityInformation), LocatorUtils.property(thatLocator, "quantityInformation", rhsQuantityInformation), lhsQuantityInformation, rhsQuantityInformation, (this.quantityInformation!= null), (that.quantityInformation!= null))) {
                return false;
            }
        }
        {
            UnitOfMeasure lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            UnitOfMeasure rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, (this.unitOfMeasure!= null), (that.unitOfMeasure!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsUnitPrice;
            lhsUnitPrice = this.getUnitPrice();
            FinancialAmountType rhsUnitPrice;
            rhsUnitPrice = that.getUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitPrice", lhsUnitPrice), LocatorUtils.property(thatLocator, "unitPrice", rhsUnitPrice), lhsUnitPrice, rhsUnitPrice, (this.unitPrice!= null), (that.unitPrice!= null))) {
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
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            DiscrepancyInformationType theDiscrepancyInformation;
            theDiscrepancyInformation = this.getDiscrepancyInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discrepancyInformation", theDiscrepancyInformation), currentHashCode, theDiscrepancyInformation, (this.discrepancyInformation!= null));
        }
        {
            List<LotReference> theLotReference;
            theLotReference = (((this.lotReference!= null)&&(!this.lotReference.isEmpty()))?this.getLotReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotReference", theLotReference), currentHashCode, theLotReference, ((this.lotReference!= null)&&(!this.lotReference.isEmpty())));
        }
        {
            List<ManufacturerProfile> theManufacturerProfile;
            theManufacturerProfile = (((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty()))?this.getManufacturerProfile():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturerProfile", theManufacturerProfile), currentHashCode, theManufacturerProfile, ((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty())));
        }
        {
            PartPayment thePartPayment;
            thePartPayment = this.getPartPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partPayment", thePartPayment), currentHashCode, thePartPayment, (this.partPayment!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            QuantityInformationType theQuantityInformation;
            theQuantityInformation = this.getQuantityInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityInformation", theQuantityInformation), currentHashCode, theQuantityInformation, (this.quantityInformation!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            FinancialAmountType theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitPrice", theUnitPrice), currentHashCode, theUnitPrice, (this.unitPrice!= null));
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
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            DiscrepancyInformationType theDiscrepancyInformation;
            theDiscrepancyInformation = this.getDiscrepancyInformation();
            strategy.appendField(locator, this, "discrepancyInformation", buffer, theDiscrepancyInformation, (this.discrepancyInformation!= null));
        }
        {
            List<LotReference> theLotReference;
            theLotReference = (((this.lotReference!= null)&&(!this.lotReference.isEmpty()))?this.getLotReference():null);
            strategy.appendField(locator, this, "lotReference", buffer, theLotReference, ((this.lotReference!= null)&&(!this.lotReference.isEmpty())));
        }
        {
            List<ManufacturerProfile> theManufacturerProfile;
            theManufacturerProfile = (((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty()))?this.getManufacturerProfile():null);
            strategy.appendField(locator, this, "manufacturerProfile", buffer, theManufacturerProfile, ((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty())));
        }
        {
            PartPayment thePartPayment;
            thePartPayment = this.getPartPayment();
            strategy.appendField(locator, this, "partPayment", buffer, thePartPayment, (this.partPayment!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            QuantityInformationType theQuantityInformation;
            theQuantityInformation = this.getQuantityInformation();
            strategy.appendField(locator, this, "quantityInformation", buffer, theQuantityInformation, (this.quantityInformation!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            FinancialAmountType theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            strategy.appendField(locator, this, "unitPrice", buffer, theUnitPrice, (this.unitPrice!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
