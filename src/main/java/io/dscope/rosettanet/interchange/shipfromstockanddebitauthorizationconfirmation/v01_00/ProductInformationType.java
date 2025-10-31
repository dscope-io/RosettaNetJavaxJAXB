
package io.dscope.rosettanet.interchange.shipfromstockanddebitauthorizationconfirmation.v01_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.rejection.v01_01.RejectionType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductPricingType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
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
 * <p>Java class for ProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorizedQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DesignRegistrationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistributorPricingInformation" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="Rejection" type="{urn:rosettanet:specification:domain:Procurement:Rejection:xsd:codelist:01.01}RejectionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="SupplierPricing" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure"/&gt;
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
@XmlType(name = "ProductInformationType", propOrder = {
    "authorizedQuantity",
    "businessDocumentReference",
    "designRegistrationIdentifier",
    "distributorPricingInformation",
    "lineNumber",
    "productIdentification",
    "rejection",
    "requestedQuantity",
    "supplierPricing",
    "unitOfMeasure"
})
public class ProductInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AuthorizedQuantity")
    protected Float authorizedQuantity;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "DesignRegistrationIdentifier")
    protected String designRegistrationIdentifier;
    @XmlElement(name = "DistributorPricingInformation")
    protected List<ProductPricingType> distributorPricingInformation;
    @XmlElement(name = "LineNumber")
    protected String lineNumber;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "Rejection")
    protected List<RejectionType> rejection;
    @XmlElement(name = "RequestedQuantity")
    protected Float requestedQuantity;
    @XmlElement(name = "SupplierPricing")
    protected List<ProductPricingType> supplierPricing;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the authorizedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAuthorizedQuantity() {
        return authorizedQuantity;
    }

    /**
     * Sets the value of the authorizedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAuthorizedQuantity(Float value) {
        this.authorizedQuantity = value;
    }

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
     * Gets the value of the designRegistrationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignRegistrationIdentifier() {
        return designRegistrationIdentifier;
    }

    /**
     * Sets the value of the designRegistrationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignRegistrationIdentifier(String value) {
        this.designRegistrationIdentifier = value;
    }

    /**
     * Gets the value of the distributorPricingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributorPricingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributorPricingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPricingType }
     * 
     * 
     */
    public List<ProductPricingType> getDistributorPricingInformation() {
        if (distributorPricingInformation == null) {
            distributorPricingInformation = new ArrayList<ProductPricingType>();
        }
        return this.distributorPricingInformation;
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
     * Gets the value of the rejection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectionType }
     * 
     * 
     */
    public List<RejectionType> getRejection() {
        if (rejection == null) {
            rejection = new ArrayList<RejectionType>();
        }
        return this.rejection;
    }

    /**
     * Gets the value of the requestedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Sets the value of the requestedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRequestedQuantity(Float value) {
        this.requestedQuantity = value;
    }

    /**
     * Gets the value of the supplierPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPricingType }
     * 
     * 
     */
    public List<ProductPricingType> getSupplierPricing() {
        if (supplierPricing == null) {
            supplierPricing = new ArrayList<ProductPricingType>();
        }
        return this.supplierPricing;
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
        final ProductInformationType that = ((ProductInformationType) object);
        {
            Float lhsAuthorizedQuantity;
            lhsAuthorizedQuantity = this.getAuthorizedQuantity();
            Float rhsAuthorizedQuantity;
            rhsAuthorizedQuantity = that.getAuthorizedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authorizedQuantity", lhsAuthorizedQuantity), LocatorUtils.property(thatLocator, "authorizedQuantity", rhsAuthorizedQuantity), lhsAuthorizedQuantity, rhsAuthorizedQuantity, (this.authorizedQuantity!= null), (that.authorizedQuantity!= null))) {
                return false;
            }
        }
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
            String lhsDesignRegistrationIdentifier;
            lhsDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            String rhsDesignRegistrationIdentifier;
            rhsDesignRegistrationIdentifier = that.getDesignRegistrationIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designRegistrationIdentifier", lhsDesignRegistrationIdentifier), LocatorUtils.property(thatLocator, "designRegistrationIdentifier", rhsDesignRegistrationIdentifier), lhsDesignRegistrationIdentifier, rhsDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null), (that.designRegistrationIdentifier!= null))) {
                return false;
            }
        }
        {
            List<ProductPricingType> lhsDistributorPricingInformation;
            lhsDistributorPricingInformation = (((this.distributorPricingInformation!= null)&&(!this.distributorPricingInformation.isEmpty()))?this.getDistributorPricingInformation():null);
            List<ProductPricingType> rhsDistributorPricingInformation;
            rhsDistributorPricingInformation = (((that.distributorPricingInformation!= null)&&(!that.distributorPricingInformation.isEmpty()))?that.getDistributorPricingInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distributorPricingInformation", lhsDistributorPricingInformation), LocatorUtils.property(thatLocator, "distributorPricingInformation", rhsDistributorPricingInformation), lhsDistributorPricingInformation, rhsDistributorPricingInformation, ((this.distributorPricingInformation!= null)&&(!this.distributorPricingInformation.isEmpty())), ((that.distributorPricingInformation!= null)&&(!that.distributorPricingInformation.isEmpty())))) {
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
            ProductIdentification lhsProductIdentification;
            lhsProductIdentification = this.getProductIdentification();
            ProductIdentification rhsProductIdentification;
            rhsProductIdentification = that.getProductIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentification", lhsProductIdentification), LocatorUtils.property(thatLocator, "productIdentification", rhsProductIdentification), lhsProductIdentification, rhsProductIdentification, (this.productIdentification!= null), (that.productIdentification!= null))) {
                return false;
            }
        }
        {
            List<RejectionType> lhsRejection;
            lhsRejection = (((this.rejection!= null)&&(!this.rejection.isEmpty()))?this.getRejection():null);
            List<RejectionType> rhsRejection;
            rhsRejection = (((that.rejection!= null)&&(!that.rejection.isEmpty()))?that.getRejection():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rejection", lhsRejection), LocatorUtils.property(thatLocator, "rejection", rhsRejection), lhsRejection, rhsRejection, ((this.rejection!= null)&&(!this.rejection.isEmpty())), ((that.rejection!= null)&&(!that.rejection.isEmpty())))) {
                return false;
            }
        }
        {
            Float lhsRequestedQuantity;
            lhsRequestedQuantity = this.getRequestedQuantity();
            Float rhsRequestedQuantity;
            rhsRequestedQuantity = that.getRequestedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedQuantity", lhsRequestedQuantity), LocatorUtils.property(thatLocator, "requestedQuantity", rhsRequestedQuantity), lhsRequestedQuantity, rhsRequestedQuantity, (this.requestedQuantity!= null), (that.requestedQuantity!= null))) {
                return false;
            }
        }
        {
            List<ProductPricingType> lhsSupplierPricing;
            lhsSupplierPricing = (((this.supplierPricing!= null)&&(!this.supplierPricing.isEmpty()))?this.getSupplierPricing():null);
            List<ProductPricingType> rhsSupplierPricing;
            rhsSupplierPricing = (((that.supplierPricing!= null)&&(!that.supplierPricing.isEmpty()))?that.getSupplierPricing():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplierPricing", lhsSupplierPricing), LocatorUtils.property(thatLocator, "supplierPricing", rhsSupplierPricing), lhsSupplierPricing, rhsSupplierPricing, ((this.supplierPricing!= null)&&(!this.supplierPricing.isEmpty())), ((that.supplierPricing!= null)&&(!that.supplierPricing.isEmpty())))) {
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
            Float theAuthorizedQuantity;
            theAuthorizedQuantity = this.getAuthorizedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authorizedQuantity", theAuthorizedQuantity), currentHashCode, theAuthorizedQuantity, (this.authorizedQuantity!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            String theDesignRegistrationIdentifier;
            theDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designRegistrationIdentifier", theDesignRegistrationIdentifier), currentHashCode, theDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null));
        }
        {
            List<ProductPricingType> theDistributorPricingInformation;
            theDistributorPricingInformation = (((this.distributorPricingInformation!= null)&&(!this.distributorPricingInformation.isEmpty()))?this.getDistributorPricingInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distributorPricingInformation", theDistributorPricingInformation), currentHashCode, theDistributorPricingInformation, ((this.distributorPricingInformation!= null)&&(!this.distributorPricingInformation.isEmpty())));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            List<RejectionType> theRejection;
            theRejection = (((this.rejection!= null)&&(!this.rejection.isEmpty()))?this.getRejection():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rejection", theRejection), currentHashCode, theRejection, ((this.rejection!= null)&&(!this.rejection.isEmpty())));
        }
        {
            Float theRequestedQuantity;
            theRequestedQuantity = this.getRequestedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedQuantity", theRequestedQuantity), currentHashCode, theRequestedQuantity, (this.requestedQuantity!= null));
        }
        {
            List<ProductPricingType> theSupplierPricing;
            theSupplierPricing = (((this.supplierPricing!= null)&&(!this.supplierPricing.isEmpty()))?this.getSupplierPricing():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplierPricing", theSupplierPricing), currentHashCode, theSupplierPricing, ((this.supplierPricing!= null)&&(!this.supplierPricing.isEmpty())));
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
            Float theAuthorizedQuantity;
            theAuthorizedQuantity = this.getAuthorizedQuantity();
            strategy.appendField(locator, this, "authorizedQuantity", buffer, theAuthorizedQuantity, (this.authorizedQuantity!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            String theDesignRegistrationIdentifier;
            theDesignRegistrationIdentifier = this.getDesignRegistrationIdentifier();
            strategy.appendField(locator, this, "designRegistrationIdentifier", buffer, theDesignRegistrationIdentifier, (this.designRegistrationIdentifier!= null));
        }
        {
            List<ProductPricingType> theDistributorPricingInformation;
            theDistributorPricingInformation = (((this.distributorPricingInformation!= null)&&(!this.distributorPricingInformation.isEmpty()))?this.getDistributorPricingInformation():null);
            strategy.appendField(locator, this, "distributorPricingInformation", buffer, theDistributorPricingInformation, ((this.distributorPricingInformation!= null)&&(!this.distributorPricingInformation.isEmpty())));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            List<RejectionType> theRejection;
            theRejection = (((this.rejection!= null)&&(!this.rejection.isEmpty()))?this.getRejection():null);
            strategy.appendField(locator, this, "rejection", buffer, theRejection, ((this.rejection!= null)&&(!this.rejection.isEmpty())));
        }
        {
            Float theRequestedQuantity;
            theRequestedQuantity = this.getRequestedQuantity();
            strategy.appendField(locator, this, "requestedQuantity", buffer, theRequestedQuantity, (this.requestedQuantity!= null));
        }
        {
            List<ProductPricingType> theSupplierPricing;
            theSupplierPricing = (((this.supplierPricing!= null)&&(!this.supplierPricing.isEmpty()))?this.getSupplierPricing():null);
            strategy.appendField(locator, this, "supplierPricing", buffer, theSupplierPricing, ((this.supplierPricing!= null)&&(!this.supplierPricing.isEmpty())));
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
