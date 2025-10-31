
package io.dscope.rosettanet.interchange.shippingorderconfirmationnotification.v02_00;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.IsPartialShipment;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.ReturnLabel;
import io.dscope.rosettanet.domain.shared.shared.v01_10.QuantityInformation;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_04.TextualDescriptionType;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}IsPartialShipment"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductDescription" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}QuantityInformation"/&gt;
 *         &lt;element name="RequestingOrderLineItemReference" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:02.00}RequestingOrderLineItemReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}ReturnLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainer" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:02.00}ShippingContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
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
    "isPartialShipment",
    "lineNumber",
    "productDescription",
    "productIdentification",
    "quantityInformation",
    "requestingOrderLineItemReference",
    "returnLabel",
    "shippingContainer",
    "unitOfMeasure"
})
public class ShipmentLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "IsPartialShipment", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = IsPartialShipment.class)
    protected IsPartialShipment isPartialShipment;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "ProductDescription")
    protected TextualDescriptionType productDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "QuantityInformation", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = QuantityInformation.class)
    protected QuantityInformation quantityInformation;
    @XmlElement(name = "RequestingOrderLineItemReference")
    protected List<RequestingOrderLineItemReferenceType> requestingOrderLineItemReference;
    @XmlElementRef(name = "ReturnLabel", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = ReturnLabel.class, required = false)
    protected List<ReturnLabel> returnLabel;
    @XmlElement(name = "ShippingContainer")
    protected List<ShippingContainerType> shippingContainer;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isPartialShipment property.
     * 
     * @return
     *     possible object is
     *     {@link IsPartialShipment }
     *     
     */
    public IsPartialShipment getIsPartialShipment() {
        return isPartialShipment;
    }

    /**
     * Sets the value of the isPartialShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsPartialShipment }
     *     
     */
    public void setIsPartialShipment(IsPartialShipment value) {
        this.isPartialShipment = value;
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
     *     {@link QuantityInformation }
     *     
     */
    public QuantityInformation getQuantityInformation() {
        return quantityInformation;
    }

    /**
     * Sets the value of the quantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityInformation }
     *     
     */
    public void setQuantityInformation(QuantityInformation value) {
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
            IsPartialShipment lhsIsPartialShipment;
            lhsIsPartialShipment = this.getIsPartialShipment();
            IsPartialShipment rhsIsPartialShipment;
            rhsIsPartialShipment = that.getIsPartialShipment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isPartialShipment", lhsIsPartialShipment), LocatorUtils.property(thatLocator, "isPartialShipment", rhsIsPartialShipment), lhsIsPartialShipment, rhsIsPartialShipment, (this.isPartialShipment!= null), (that.isPartialShipment!= null))) {
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
            QuantityInformation lhsQuantityInformation;
            lhsQuantityInformation = this.getQuantityInformation();
            QuantityInformation rhsQuantityInformation;
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
            UnitOfMeasure lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            UnitOfMeasure rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, (this.unitOfMeasure!= null), (that.unitOfMeasure!= null))) {
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
            IsPartialShipment theIsPartialShipment;
            theIsPartialShipment = this.getIsPartialShipment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isPartialShipment", theIsPartialShipment), currentHashCode, theIsPartialShipment, (this.isPartialShipment!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
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
            QuantityInformation theQuantityInformation;
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
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
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
            IsPartialShipment theIsPartialShipment;
            theIsPartialShipment = this.getIsPartialShipment();
            strategy.appendField(locator, this, "isPartialShipment", buffer, theIsPartialShipment, (this.isPartialShipment!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
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
            QuantityInformation theQuantityInformation;
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
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
