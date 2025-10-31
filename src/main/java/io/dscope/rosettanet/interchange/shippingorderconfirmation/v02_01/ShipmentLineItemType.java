
package io.dscope.rosettanet.interchange.shippingorderconfirmation.v02_01;

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
import io.dscope.rosettanet.domain.logistics.codelist.inventoryownership.v01_01.InventoryOwnership;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.HazardousMaterialDescription;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.IsDeliveryRequired;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.IsHazardousMaterial;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.ReturnLabel;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.TrackingReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_08.SpecialHandlingInstruction;
import io.dscope.rosettanet.domain.procurement.procurement.v02_08.WarehouseLocation;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.productidentification.v01_03.ProductIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_03.TextualDescriptionType;
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
 * <p>Java class for ShipmentLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}HazardousMaterialDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:InventoryOwnership:xsd:codelist:01.01}InventoryOwnership" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}IsDeliveryRequired" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}IsHazardousMaterial"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LineReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderConfirmation" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmation:xsd:schema:02.01}OrderConfirmationType"/&gt;
 *         &lt;element name="ProductDescription" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03}TextualDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03}ProductIdentification"/&gt;
 *         &lt;element name="QuantityInformation" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmation:xsd:schema:02.01}QuantityInformationType"/&gt;
 *         &lt;element name="RequestingOrderLineItemReference" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmation:xsd:schema:02.01}RequestingOrderLineItemReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}ReturnLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainer" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmation:xsd:schema:02.01}ShippingContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.08}SpecialHandlingInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}TrackingReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.08}WarehouseLocation" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentLineItemType", propOrder = {
    "businessDocumentReference",
    "hazardousMaterialDescription",
    "inventoryOwnership",
    "isDeliveryRequired",
    "isHazardousMaterial",
    "lineNumber",
    "lineReference",
    "orderConfirmation",
    "productDescription",
    "productIdentification",
    "quantityInformation",
    "requestingOrderLineItemReference",
    "returnLabel",
    "shippingContainer",
    "specialHandlingInstruction",
    "trackingReference",
    "unitOfMeasure",
    "warehouseLocation"
})
public class ShipmentLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.04", type = BusinessDocumentReference.class, required = false)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElementRef(name = "HazardousMaterialDescription", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = HazardousMaterialDescription.class, required = false)
    protected List<HazardousMaterialDescription> hazardousMaterialDescription;
    @XmlElementRef(name = "InventoryOwnership", namespace = "urn:rosettanet:specification:domain:Logistics:InventoryOwnership:xsd:codelist:01.01", type = InventoryOwnership.class, required = false)
    protected InventoryOwnership inventoryOwnership;
    @XmlElementRef(name = "IsDeliveryRequired", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = IsDeliveryRequired.class, required = false)
    protected IsDeliveryRequired isDeliveryRequired;
    @XmlElementRef(name = "IsHazardousMaterial", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = IsHazardousMaterial.class)
    protected IsHazardousMaterial isHazardousMaterial;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "LineReference")
    protected List<BusinessDocumentReferenceType> lineReference;
    @XmlElement(name = "OrderConfirmation", required = true)
    protected OrderConfirmationType orderConfirmation;
    @XmlElement(name = "ProductDescription")
    protected TextualDescriptionType productDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "QuantityInformation", required = true)
    protected QuantityInformationType quantityInformation;
    @XmlElement(name = "RequestingOrderLineItemReference")
    protected List<RequestingOrderLineItemReferenceType> requestingOrderLineItemReference;
    @XmlElementRef(name = "ReturnLabel", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = ReturnLabel.class, required = false)
    protected List<ReturnLabel> returnLabel;
    @XmlElement(name = "ShippingContainer")
    protected List<ShippingContainerType> shippingContainer;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.08", type = SpecialHandlingInstruction.class, required = false)
    protected SpecialHandlingInstruction specialHandlingInstruction;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = TrackingReference.class, required = false)
    protected TrackingReference trackingReference;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElementRef(name = "WarehouseLocation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.08", type = WarehouseLocation.class, required = false)
    protected WarehouseLocation warehouseLocation;
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
     * Gets the value of the hazardousMaterialDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousMaterialDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousMaterialDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousMaterialDescription }
     * 
     * 
     */
    public List<HazardousMaterialDescription> getHazardousMaterialDescription() {
        if (hazardousMaterialDescription == null) {
            hazardousMaterialDescription = new ArrayList<HazardousMaterialDescription>();
        }
        return this.hazardousMaterialDescription;
    }

    /**
     * Gets the value of the inventoryOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryOwnership }
     *     
     */
    public InventoryOwnership getInventoryOwnership() {
        return inventoryOwnership;
    }

    /**
     * Sets the value of the inventoryOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryOwnership }
     *     
     */
    public void setInventoryOwnership(InventoryOwnership value) {
        this.inventoryOwnership = value;
    }

    /**
     * Gets the value of the isDeliveryRequired property.
     * 
     * @return
     *     possible object is
     *     {@link IsDeliveryRequired }
     *     
     */
    public IsDeliveryRequired getIsDeliveryRequired() {
        return isDeliveryRequired;
    }

    /**
     * Sets the value of the isDeliveryRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsDeliveryRequired }
     *     
     */
    public void setIsDeliveryRequired(IsDeliveryRequired value) {
        this.isDeliveryRequired = value;
    }

    /**
     * Gets the value of the isHazardousMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link IsHazardousMaterial }
     *     
     */
    public IsHazardousMaterial getIsHazardousMaterial() {
        return isHazardousMaterial;
    }

    /**
     * Sets the value of the isHazardousMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsHazardousMaterial }
     *     
     */
    public void setIsHazardousMaterial(IsHazardousMaterial value) {
        this.isHazardousMaterial = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the lineReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getLineReference() {
        if (lineReference == null) {
            lineReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.lineReference;
    }

    /**
     * Gets the value of the orderConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link OrderConfirmationType }
     *     
     */
    public OrderConfirmationType getOrderConfirmation() {
        return orderConfirmation;
    }

    /**
     * Sets the value of the orderConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderConfirmationType }
     *     
     */
    public void setOrderConfirmation(OrderConfirmationType value) {
        this.orderConfirmation = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescriptionType }
     *     
     */
    public TextualDescriptionType getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescriptionType }
     *     
     */
    public void setProductDescription(TextualDescriptionType value) {
        this.productDescription = value;
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
     * Gets the value of the requestingOrderLineItemReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestingOrderLineItemReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestingOrderLineItemReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestingOrderLineItemReferenceType }
     * 
     * 
     */
    public List<RequestingOrderLineItemReferenceType> getRequestingOrderLineItemReference() {
        if (requestingOrderLineItemReference == null) {
            requestingOrderLineItemReference = new ArrayList<RequestingOrderLineItemReferenceType>();
        }
        return this.requestingOrderLineItemReference;
    }

    /**
     * Gets the value of the returnLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnLabel }
     * 
     * 
     */
    public List<ReturnLabel> getReturnLabel() {
        if (returnLabel == null) {
            returnLabel = new ArrayList<ReturnLabel>();
        }
        return this.returnLabel;
    }

    /**
     * Gets the value of the shippingContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingContainerType }
     * 
     * 
     */
    public List<ShippingContainerType> getShippingContainer() {
        if (shippingContainer == null) {
            shippingContainer = new ArrayList<ShippingContainerType>();
        }
        return this.shippingContainer;
    }

    /**
     * Gets the value of the specialHandlingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialHandlingInstruction }
     *     
     */
    public SpecialHandlingInstruction getSpecialHandlingInstruction() {
        return specialHandlingInstruction;
    }

    /**
     * Sets the value of the specialHandlingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialHandlingInstruction }
     *     
     */
    public void setSpecialHandlingInstruction(SpecialHandlingInstruction value) {
        this.specialHandlingInstruction = value;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingReference }
     *     
     */
    public TrackingReference getTrackingReference() {
        return trackingReference;
    }

    /**
     * Sets the value of the trackingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingReference }
     *     
     */
    public void setTrackingReference(TrackingReference value) {
        this.trackingReference = value;
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
     * Gets the value of the warehouseLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WarehouseLocation }
     *     
     */
    public WarehouseLocation getWarehouseLocation() {
        return warehouseLocation;
    }

    /**
     * Sets the value of the warehouseLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarehouseLocation }
     *     
     */
    public void setWarehouseLocation(WarehouseLocation value) {
        this.warehouseLocation = value;
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
        final ShipmentLineItemType that = ((ShipmentLineItemType) object);
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
            List<HazardousMaterialDescription> lhsHazardousMaterialDescription;
            lhsHazardousMaterialDescription = (((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty()))?this.getHazardousMaterialDescription():null);
            List<HazardousMaterialDescription> rhsHazardousMaterialDescription;
            rhsHazardousMaterialDescription = (((that.hazardousMaterialDescription!= null)&&(!that.hazardousMaterialDescription.isEmpty()))?that.getHazardousMaterialDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousMaterialDescription", lhsHazardousMaterialDescription), LocatorUtils.property(thatLocator, "hazardousMaterialDescription", rhsHazardousMaterialDescription), lhsHazardousMaterialDescription, rhsHazardousMaterialDescription, ((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty())), ((that.hazardousMaterialDescription!= null)&&(!that.hazardousMaterialDescription.isEmpty())))) {
                return false;
            }
        }
        {
            InventoryOwnership lhsInventoryOwnership;
            lhsInventoryOwnership = this.getInventoryOwnership();
            InventoryOwnership rhsInventoryOwnership;
            rhsInventoryOwnership = that.getInventoryOwnership();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inventoryOwnership", lhsInventoryOwnership), LocatorUtils.property(thatLocator, "inventoryOwnership", rhsInventoryOwnership), lhsInventoryOwnership, rhsInventoryOwnership, (this.inventoryOwnership!= null), (that.inventoryOwnership!= null))) {
                return false;
            }
        }
        {
            IsDeliveryRequired lhsIsDeliveryRequired;
            lhsIsDeliveryRequired = this.getIsDeliveryRequired();
            IsDeliveryRequired rhsIsDeliveryRequired;
            rhsIsDeliveryRequired = that.getIsDeliveryRequired();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isDeliveryRequired", lhsIsDeliveryRequired), LocatorUtils.property(thatLocator, "isDeliveryRequired", rhsIsDeliveryRequired), lhsIsDeliveryRequired, rhsIsDeliveryRequired, (this.isDeliveryRequired!= null), (that.isDeliveryRequired!= null))) {
                return false;
            }
        }
        {
            IsHazardousMaterial lhsIsHazardousMaterial;
            lhsIsHazardousMaterial = this.getIsHazardousMaterial();
            IsHazardousMaterial rhsIsHazardousMaterial;
            rhsIsHazardousMaterial = that.getIsHazardousMaterial();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isHazardousMaterial", lhsIsHazardousMaterial), LocatorUtils.property(thatLocator, "isHazardousMaterial", rhsIsHazardousMaterial), lhsIsHazardousMaterial, rhsIsHazardousMaterial, (this.isHazardousMaterial!= null), (that.isHazardousMaterial!= null))) {
                return false;
            }
        }
        {
            String lhsLineNumber;
            lhsLineNumber = this.getLineNumber();
            String rhsLineNumber;
            rhsLineNumber = that.getLineNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineNumber", lhsLineNumber), LocatorUtils.property(thatLocator, "lineNumber", rhsLineNumber), lhsLineNumber, rhsLineNumber, (this.lineNumber!= null), (that.lineNumber!= null))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsLineReference;
            lhsLineReference = (((this.lineReference!= null)&&(!this.lineReference.isEmpty()))?this.getLineReference():null);
            List<BusinessDocumentReferenceType> rhsLineReference;
            rhsLineReference = (((that.lineReference!= null)&&(!that.lineReference.isEmpty()))?that.getLineReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineReference", lhsLineReference), LocatorUtils.property(thatLocator, "lineReference", rhsLineReference), lhsLineReference, rhsLineReference, ((this.lineReference!= null)&&(!this.lineReference.isEmpty())), ((that.lineReference!= null)&&(!that.lineReference.isEmpty())))) {
                return false;
            }
        }
        {
            OrderConfirmationType lhsOrderConfirmation;
            lhsOrderConfirmation = this.getOrderConfirmation();
            OrderConfirmationType rhsOrderConfirmation;
            rhsOrderConfirmation = that.getOrderConfirmation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderConfirmation", lhsOrderConfirmation), LocatorUtils.property(thatLocator, "orderConfirmation", rhsOrderConfirmation), lhsOrderConfirmation, rhsOrderConfirmation, (this.orderConfirmation!= null), (that.orderConfirmation!= null))) {
                return false;
            }
        }
        {
            TextualDescriptionType lhsProductDescription;
            lhsProductDescription = this.getProductDescription();
            TextualDescriptionType rhsProductDescription;
            rhsProductDescription = that.getProductDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productDescription", lhsProductDescription), LocatorUtils.property(thatLocator, "productDescription", rhsProductDescription), lhsProductDescription, rhsProductDescription, (this.productDescription!= null), (that.productDescription!= null))) {
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
            List<RequestingOrderLineItemReferenceType> lhsRequestingOrderLineItemReference;
            lhsRequestingOrderLineItemReference = (((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty()))?this.getRequestingOrderLineItemReference():null);
            List<RequestingOrderLineItemReferenceType> rhsRequestingOrderLineItemReference;
            rhsRequestingOrderLineItemReference = (((that.requestingOrderLineItemReference!= null)&&(!that.requestingOrderLineItemReference.isEmpty()))?that.getRequestingOrderLineItemReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestingOrderLineItemReference", lhsRequestingOrderLineItemReference), LocatorUtils.property(thatLocator, "requestingOrderLineItemReference", rhsRequestingOrderLineItemReference), lhsRequestingOrderLineItemReference, rhsRequestingOrderLineItemReference, ((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty())), ((that.requestingOrderLineItemReference!= null)&&(!that.requestingOrderLineItemReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<ReturnLabel> lhsReturnLabel;
            lhsReturnLabel = (((this.returnLabel!= null)&&(!this.returnLabel.isEmpty()))?this.getReturnLabel():null);
            List<ReturnLabel> rhsReturnLabel;
            rhsReturnLabel = (((that.returnLabel!= null)&&(!that.returnLabel.isEmpty()))?that.getReturnLabel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "returnLabel", lhsReturnLabel), LocatorUtils.property(thatLocator, "returnLabel", rhsReturnLabel), lhsReturnLabel, rhsReturnLabel, ((this.returnLabel!= null)&&(!this.returnLabel.isEmpty())), ((that.returnLabel!= null)&&(!that.returnLabel.isEmpty())))) {
                return false;
            }
        }
        {
            List<ShippingContainerType> lhsShippingContainer;
            lhsShippingContainer = (((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty()))?this.getShippingContainer():null);
            List<ShippingContainerType> rhsShippingContainer;
            rhsShippingContainer = (((that.shippingContainer!= null)&&(!that.shippingContainer.isEmpty()))?that.getShippingContainer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingContainer", lhsShippingContainer), LocatorUtils.property(thatLocator, "shippingContainer", rhsShippingContainer), lhsShippingContainer, rhsShippingContainer, ((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty())), ((that.shippingContainer!= null)&&(!that.shippingContainer.isEmpty())))) {
                return false;
            }
        }
        {
            SpecialHandlingInstruction lhsSpecialHandlingInstruction;
            lhsSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            SpecialHandlingInstruction rhsSpecialHandlingInstruction;
            rhsSpecialHandlingInstruction = that.getSpecialHandlingInstruction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialHandlingInstruction", lhsSpecialHandlingInstruction), LocatorUtils.property(thatLocator, "specialHandlingInstruction", rhsSpecialHandlingInstruction), lhsSpecialHandlingInstruction, rhsSpecialHandlingInstruction, (this.specialHandlingInstruction!= null), (that.specialHandlingInstruction!= null))) {
                return false;
            }
        }
        {
            TrackingReference lhsTrackingReference;
            lhsTrackingReference = this.getTrackingReference();
            TrackingReference rhsTrackingReference;
            rhsTrackingReference = that.getTrackingReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingReference", lhsTrackingReference), LocatorUtils.property(thatLocator, "trackingReference", rhsTrackingReference), lhsTrackingReference, rhsTrackingReference, (this.trackingReference!= null), (that.trackingReference!= null))) {
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
            WarehouseLocation lhsWarehouseLocation;
            lhsWarehouseLocation = this.getWarehouseLocation();
            WarehouseLocation rhsWarehouseLocation;
            rhsWarehouseLocation = that.getWarehouseLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warehouseLocation", lhsWarehouseLocation), LocatorUtils.property(thatLocator, "warehouseLocation", rhsWarehouseLocation), lhsWarehouseLocation, rhsWarehouseLocation, (this.warehouseLocation!= null), (that.warehouseLocation!= null))) {
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
            List<HazardousMaterialDescription> theHazardousMaterialDescription;
            theHazardousMaterialDescription = (((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty()))?this.getHazardousMaterialDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousMaterialDescription", theHazardousMaterialDescription), currentHashCode, theHazardousMaterialDescription, ((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty())));
        }
        {
            InventoryOwnership theInventoryOwnership;
            theInventoryOwnership = this.getInventoryOwnership();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inventoryOwnership", theInventoryOwnership), currentHashCode, theInventoryOwnership, (this.inventoryOwnership!= null));
        }
        {
            IsDeliveryRequired theIsDeliveryRequired;
            theIsDeliveryRequired = this.getIsDeliveryRequired();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isDeliveryRequired", theIsDeliveryRequired), currentHashCode, theIsDeliveryRequired, (this.isDeliveryRequired!= null));
        }
        {
            IsHazardousMaterial theIsHazardousMaterial;
            theIsHazardousMaterial = this.getIsHazardousMaterial();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isHazardousMaterial", theIsHazardousMaterial), currentHashCode, theIsHazardousMaterial, (this.isHazardousMaterial!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            List<BusinessDocumentReferenceType> theLineReference;
            theLineReference = (((this.lineReference!= null)&&(!this.lineReference.isEmpty()))?this.getLineReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineReference", theLineReference), currentHashCode, theLineReference, ((this.lineReference!= null)&&(!this.lineReference.isEmpty())));
        }
        {
            OrderConfirmationType theOrderConfirmation;
            theOrderConfirmation = this.getOrderConfirmation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderConfirmation", theOrderConfirmation), currentHashCode, theOrderConfirmation, (this.orderConfirmation!= null));
        }
        {
            TextualDescriptionType theProductDescription;
            theProductDescription = this.getProductDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productDescription", theProductDescription), currentHashCode, theProductDescription, (this.productDescription!= null));
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
            List<RequestingOrderLineItemReferenceType> theRequestingOrderLineItemReference;
            theRequestingOrderLineItemReference = (((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty()))?this.getRequestingOrderLineItemReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestingOrderLineItemReference", theRequestingOrderLineItemReference), currentHashCode, theRequestingOrderLineItemReference, ((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty())));
        }
        {
            List<ReturnLabel> theReturnLabel;
            theReturnLabel = (((this.returnLabel!= null)&&(!this.returnLabel.isEmpty()))?this.getReturnLabel():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnLabel", theReturnLabel), currentHashCode, theReturnLabel, ((this.returnLabel!= null)&&(!this.returnLabel.isEmpty())));
        }
        {
            List<ShippingContainerType> theShippingContainer;
            theShippingContainer = (((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty()))?this.getShippingContainer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingContainer", theShippingContainer), currentHashCode, theShippingContainer, ((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty())));
        }
        {
            SpecialHandlingInstruction theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialHandlingInstruction", theSpecialHandlingInstruction), currentHashCode, theSpecialHandlingInstruction, (this.specialHandlingInstruction!= null));
        }
        {
            TrackingReference theTrackingReference;
            theTrackingReference = this.getTrackingReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingReference", theTrackingReference), currentHashCode, theTrackingReference, (this.trackingReference!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            WarehouseLocation theWarehouseLocation;
            theWarehouseLocation = this.getWarehouseLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warehouseLocation", theWarehouseLocation), currentHashCode, theWarehouseLocation, (this.warehouseLocation!= null));
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
            List<HazardousMaterialDescription> theHazardousMaterialDescription;
            theHazardousMaterialDescription = (((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty()))?this.getHazardousMaterialDescription():null);
            strategy.appendField(locator, this, "hazardousMaterialDescription", buffer, theHazardousMaterialDescription, ((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty())));
        }
        {
            InventoryOwnership theInventoryOwnership;
            theInventoryOwnership = this.getInventoryOwnership();
            strategy.appendField(locator, this, "inventoryOwnership", buffer, theInventoryOwnership, (this.inventoryOwnership!= null));
        }
        {
            IsDeliveryRequired theIsDeliveryRequired;
            theIsDeliveryRequired = this.getIsDeliveryRequired();
            strategy.appendField(locator, this, "isDeliveryRequired", buffer, theIsDeliveryRequired, (this.isDeliveryRequired!= null));
        }
        {
            IsHazardousMaterial theIsHazardousMaterial;
            theIsHazardousMaterial = this.getIsHazardousMaterial();
            strategy.appendField(locator, this, "isHazardousMaterial", buffer, theIsHazardousMaterial, (this.isHazardousMaterial!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            List<BusinessDocumentReferenceType> theLineReference;
            theLineReference = (((this.lineReference!= null)&&(!this.lineReference.isEmpty()))?this.getLineReference():null);
            strategy.appendField(locator, this, "lineReference", buffer, theLineReference, ((this.lineReference!= null)&&(!this.lineReference.isEmpty())));
        }
        {
            OrderConfirmationType theOrderConfirmation;
            theOrderConfirmation = this.getOrderConfirmation();
            strategy.appendField(locator, this, "orderConfirmation", buffer, theOrderConfirmation, (this.orderConfirmation!= null));
        }
        {
            TextualDescriptionType theProductDescription;
            theProductDescription = this.getProductDescription();
            strategy.appendField(locator, this, "productDescription", buffer, theProductDescription, (this.productDescription!= null));
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
            List<RequestingOrderLineItemReferenceType> theRequestingOrderLineItemReference;
            theRequestingOrderLineItemReference = (((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty()))?this.getRequestingOrderLineItemReference():null);
            strategy.appendField(locator, this, "requestingOrderLineItemReference", buffer, theRequestingOrderLineItemReference, ((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty())));
        }
        {
            List<ReturnLabel> theReturnLabel;
            theReturnLabel = (((this.returnLabel!= null)&&(!this.returnLabel.isEmpty()))?this.getReturnLabel():null);
            strategy.appendField(locator, this, "returnLabel", buffer, theReturnLabel, ((this.returnLabel!= null)&&(!this.returnLabel.isEmpty())));
        }
        {
            List<ShippingContainerType> theShippingContainer;
            theShippingContainer = (((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty()))?this.getShippingContainer():null);
            strategy.appendField(locator, this, "shippingContainer", buffer, theShippingContainer, ((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty())));
        }
        {
            SpecialHandlingInstruction theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            strategy.appendField(locator, this, "specialHandlingInstruction", buffer, theSpecialHandlingInstruction, (this.specialHandlingInstruction!= null));
        }
        {
            TrackingReference theTrackingReference;
            theTrackingReference = this.getTrackingReference();
            strategy.appendField(locator, this, "trackingReference", buffer, theTrackingReference, (this.trackingReference!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            WarehouseLocation theWarehouseLocation;
            theWarehouseLocation = this.getWarehouseLocation();
            strategy.appendField(locator, this, "warehouseLocation", buffer, theWarehouseLocation, (this.warehouseLocation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
