
package io.dscope.rosettanet.interchange.servicecontractreplynotification.v01_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_02.PurchaseOrderStatusType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_16.DatePeriodAndDurationType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_16.MonetaryAmountType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_16.ProductPricingType;
import io.dscope.rosettanet.interchange.codelist.acknowledgmentreason.v01_00.AcknowledgmentReason;
import io.dscope.rosettanet.interchange.codelist.requesttype.v01_00.RequestType;
import io.dscope.rosettanet.universal.document.v01_01.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_01.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_01.FinancialAmountType;
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
 * <p>Java class for ServiceContractLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceContractLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:AcknowledgmentReason:xsd:codelist:01.00}AcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChangeRequestStatus" type="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.02}PurchaseOrderStatusType"/&gt;
 *         &lt;element name="ContractAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.01}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="FromContractReferece" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PriceChange" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{urn:rosettanet:specification:interchange:ServiceContractReplyNotification:xsd:schema:01.01}ProductType" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="RequestingDocumentReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.00}RequestType"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServicePeriod" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16}ProductPricingType" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceContractLineItemType", propOrder = {
    "acknowledgmentReason",
    "businessDocumentReference",
    "changeRequestStatus",
    "contractAmount",
    "contractReference",
    "fromContractReferece",
    "lineNumber",
    "priceChange",
    "product",
    "quantity",
    "requestingDocumentReference",
    "requestType",
    "responseDescription",
    "serviceIdentification",
    "serviceLevel",
    "servicePeriod",
    "serviceStatus",
    "toContractReference",
    "unitPrice"
})
public class ServiceContractLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AcknowledgmentReason", namespace = "urn:rosettanet:specification:interchange:AcknowledgmentReason:xsd:codelist:01.00", type = AcknowledgmentReason.class, required = false)
    protected List<AcknowledgmentReason> acknowledgmentReason;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.01", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "ChangeRequestStatus", required = true)
    protected PurchaseOrderStatusType changeRequestStatus;
    @XmlElement(name = "ContractAmount")
    protected FinancialAmountType contractAmount;
    @XmlElement(name = "ContractReference")
    protected BusinessDocumentReferenceType contractReference;
    @XmlElement(name = "FromContractReferece")
    protected BusinessDocumentReferenceType fromContractReferece;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "PriceChange")
    protected MonetaryAmountType priceChange;
    @XmlElement(name = "Product")
    protected ProductType product;
    @XmlElement(name = "Quantity")
    protected Float quantity;
    @XmlElement(name = "RequestingDocumentReference")
    protected BusinessDocumentReferenceType requestingDocumentReference;
    @XmlElementRef(name = "RequestType", namespace = "urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.00", type = RequestType.class)
    protected RequestType requestType;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElement(name = "ServiceIdentification")
    protected List<String> serviceIdentification;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "ServicePeriod")
    protected DatePeriodAndDurationType servicePeriod;
    @XmlElement(name = "ServiceStatus")
    protected String serviceStatus;
    @XmlElement(name = "ToContractReference")
    protected List<BusinessDocumentReferenceType> toContractReference;
    @XmlElement(name = "UnitPrice")
    protected ProductPricingType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the acknowledgmentReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acknowledgmentReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcknowledgmentReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcknowledgmentReason }
     * 
     * 
     */
    public List<AcknowledgmentReason> getAcknowledgmentReason() {
        if (acknowledgmentReason == null) {
            acknowledgmentReason = new ArrayList<AcknowledgmentReason>();
        }
        return this.acknowledgmentReason;
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
     * Gets the value of the changeRequestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public PurchaseOrderStatusType getChangeRequestStatus() {
        return changeRequestStatus;
    }

    /**
     * Sets the value of the changeRequestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public void setChangeRequestStatus(PurchaseOrderStatusType value) {
        this.changeRequestStatus = value;
    }

    /**
     * Gets the value of the contractAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getContractAmount() {
        return contractAmount;
    }

    /**
     * Sets the value of the contractAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setContractAmount(FinancialAmountType value) {
        this.contractAmount = value;
    }

    /**
     * Gets the value of the contractReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getContractReference() {
        return contractReference;
    }

    /**
     * Sets the value of the contractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setContractReference(BusinessDocumentReferenceType value) {
        this.contractReference = value;
    }

    /**
     * Gets the value of the fromContractReferece property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getFromContractReferece() {
        return fromContractReferece;
    }

    /**
     * Sets the value of the fromContractReferece property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setFromContractReferece(BusinessDocumentReferenceType value) {
        this.fromContractReferece = value;
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
     * Gets the value of the priceChange property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getPriceChange() {
        return priceChange;
    }

    /**
     * Sets the value of the priceChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setPriceChange(MonetaryAmountType value) {
        this.priceChange = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProduct(ProductType value) {
        this.product = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuantity(Float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the requestingDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getRequestingDocumentReference() {
        return requestingDocumentReference;
    }

    /**
     * Sets the value of the requestingDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setRequestingDocumentReference(BusinessDocumentReferenceType value) {
        this.requestingDocumentReference = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the responseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDescription() {
        return responseDescription;
    }

    /**
     * Sets the value of the responseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDescription(String value) {
        this.responseDescription = value;
    }

    /**
     * Gets the value of the serviceIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceIdentification() {
        if (serviceIdentification == null) {
            serviceIdentification = new ArrayList<String>();
        }
        return this.serviceIdentification;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the servicePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public DatePeriodAndDurationType getServicePeriod() {
        return servicePeriod;
    }

    /**
     * Sets the value of the servicePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public void setServicePeriod(DatePeriodAndDurationType value) {
        this.servicePeriod = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the toContractReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toContractReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToContractReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getToContractReference() {
        if (toContractReference == null) {
            toContractReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.toContractReference;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setUnitPrice(ProductPricingType value) {
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
        final ServiceContractLineItemType that = ((ServiceContractLineItemType) object);
        {
            List<AcknowledgmentReason> lhsAcknowledgmentReason;
            lhsAcknowledgmentReason = (((this.acknowledgmentReason!= null)&&(!this.acknowledgmentReason.isEmpty()))?this.getAcknowledgmentReason():null);
            List<AcknowledgmentReason> rhsAcknowledgmentReason;
            rhsAcknowledgmentReason = (((that.acknowledgmentReason!= null)&&(!that.acknowledgmentReason.isEmpty()))?that.getAcknowledgmentReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acknowledgmentReason", lhsAcknowledgmentReason), LocatorUtils.property(thatLocator, "acknowledgmentReason", rhsAcknowledgmentReason), lhsAcknowledgmentReason, rhsAcknowledgmentReason, ((this.acknowledgmentReason!= null)&&(!this.acknowledgmentReason.isEmpty())), ((that.acknowledgmentReason!= null)&&(!that.acknowledgmentReason.isEmpty())))) {
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
            PurchaseOrderStatusType lhsChangeRequestStatus;
            lhsChangeRequestStatus = this.getChangeRequestStatus();
            PurchaseOrderStatusType rhsChangeRequestStatus;
            rhsChangeRequestStatus = that.getChangeRequestStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeRequestStatus", lhsChangeRequestStatus), LocatorUtils.property(thatLocator, "changeRequestStatus", rhsChangeRequestStatus), lhsChangeRequestStatus, rhsChangeRequestStatus, (this.changeRequestStatus!= null), (that.changeRequestStatus!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsContractAmount;
            lhsContractAmount = this.getContractAmount();
            FinancialAmountType rhsContractAmount;
            rhsContractAmount = that.getContractAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractAmount", lhsContractAmount), LocatorUtils.property(thatLocator, "contractAmount", rhsContractAmount), lhsContractAmount, rhsContractAmount, (this.contractAmount!= null), (that.contractAmount!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsContractReference;
            lhsContractReference = this.getContractReference();
            BusinessDocumentReferenceType rhsContractReference;
            rhsContractReference = that.getContractReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractReference", lhsContractReference), LocatorUtils.property(thatLocator, "contractReference", rhsContractReference), lhsContractReference, rhsContractReference, (this.contractReference!= null), (that.contractReference!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsFromContractReferece;
            lhsFromContractReferece = this.getFromContractReferece();
            BusinessDocumentReferenceType rhsFromContractReferece;
            rhsFromContractReferece = that.getFromContractReferece();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromContractReferece", lhsFromContractReferece), LocatorUtils.property(thatLocator, "fromContractReferece", rhsFromContractReferece), lhsFromContractReferece, rhsFromContractReferece, (this.fromContractReferece!= null), (that.fromContractReferece!= null))) {
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
            MonetaryAmountType lhsPriceChange;
            lhsPriceChange = this.getPriceChange();
            MonetaryAmountType rhsPriceChange;
            rhsPriceChange = that.getPriceChange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceChange", lhsPriceChange), LocatorUtils.property(thatLocator, "priceChange", rhsPriceChange), lhsPriceChange, rhsPriceChange, (this.priceChange!= null), (that.priceChange!= null))) {
                return false;
            }
        }
        {
            ProductType lhsProduct;
            lhsProduct = this.getProduct();
            ProductType rhsProduct;
            rhsProduct = that.getProduct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "product", lhsProduct), LocatorUtils.property(thatLocator, "product", rhsProduct), lhsProduct, rhsProduct, (this.product!= null), (that.product!= null))) {
                return false;
            }
        }
        {
            Float lhsQuantity;
            lhsQuantity = this.getQuantity();
            Float rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, (this.quantity!= null), (that.quantity!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsRequestingDocumentReference;
            lhsRequestingDocumentReference = this.getRequestingDocumentReference();
            BusinessDocumentReferenceType rhsRequestingDocumentReference;
            rhsRequestingDocumentReference = that.getRequestingDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestingDocumentReference", lhsRequestingDocumentReference), LocatorUtils.property(thatLocator, "requestingDocumentReference", rhsRequestingDocumentReference), lhsRequestingDocumentReference, rhsRequestingDocumentReference, (this.requestingDocumentReference!= null), (that.requestingDocumentReference!= null))) {
                return false;
            }
        }
        {
            RequestType lhsRequestType;
            lhsRequestType = this.getRequestType();
            RequestType rhsRequestType;
            rhsRequestType = that.getRequestType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestType", lhsRequestType), LocatorUtils.property(thatLocator, "requestType", rhsRequestType), lhsRequestType, rhsRequestType, (this.requestType!= null), (that.requestType!= null))) {
                return false;
            }
        }
        {
            String lhsResponseDescription;
            lhsResponseDescription = this.getResponseDescription();
            String rhsResponseDescription;
            rhsResponseDescription = that.getResponseDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseDescription", lhsResponseDescription), LocatorUtils.property(thatLocator, "responseDescription", rhsResponseDescription), lhsResponseDescription, rhsResponseDescription, (this.responseDescription!= null), (that.responseDescription!= null))) {
                return false;
            }
        }
        {
            List<String> lhsServiceIdentification;
            lhsServiceIdentification = (((this.serviceIdentification!= null)&&(!this.serviceIdentification.isEmpty()))?this.getServiceIdentification():null);
            List<String> rhsServiceIdentification;
            rhsServiceIdentification = (((that.serviceIdentification!= null)&&(!that.serviceIdentification.isEmpty()))?that.getServiceIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceIdentification", lhsServiceIdentification), LocatorUtils.property(thatLocator, "serviceIdentification", rhsServiceIdentification), lhsServiceIdentification, rhsServiceIdentification, ((this.serviceIdentification!= null)&&(!this.serviceIdentification.isEmpty())), ((that.serviceIdentification!= null)&&(!that.serviceIdentification.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsServiceLevel;
            lhsServiceLevel = this.getServiceLevel();
            String rhsServiceLevel;
            rhsServiceLevel = that.getServiceLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceLevel", lhsServiceLevel), LocatorUtils.property(thatLocator, "serviceLevel", rhsServiceLevel), lhsServiceLevel, rhsServiceLevel, (this.serviceLevel!= null), (that.serviceLevel!= null))) {
                return false;
            }
        }
        {
            DatePeriodAndDurationType lhsServicePeriod;
            lhsServicePeriod = this.getServicePeriod();
            DatePeriodAndDurationType rhsServicePeriod;
            rhsServicePeriod = that.getServicePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "servicePeriod", lhsServicePeriod), LocatorUtils.property(thatLocator, "servicePeriod", rhsServicePeriod), lhsServicePeriod, rhsServicePeriod, (this.servicePeriod!= null), (that.servicePeriod!= null))) {
                return false;
            }
        }
        {
            String lhsServiceStatus;
            lhsServiceStatus = this.getServiceStatus();
            String rhsServiceStatus;
            rhsServiceStatus = that.getServiceStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceStatus", lhsServiceStatus), LocatorUtils.property(thatLocator, "serviceStatus", rhsServiceStatus), lhsServiceStatus, rhsServiceStatus, (this.serviceStatus!= null), (that.serviceStatus!= null))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsToContractReference;
            lhsToContractReference = (((this.toContractReference!= null)&&(!this.toContractReference.isEmpty()))?this.getToContractReference():null);
            List<BusinessDocumentReferenceType> rhsToContractReference;
            rhsToContractReference = (((that.toContractReference!= null)&&(!that.toContractReference.isEmpty()))?that.getToContractReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toContractReference", lhsToContractReference), LocatorUtils.property(thatLocator, "toContractReference", rhsToContractReference), lhsToContractReference, rhsToContractReference, ((this.toContractReference!= null)&&(!this.toContractReference.isEmpty())), ((that.toContractReference!= null)&&(!that.toContractReference.isEmpty())))) {
                return false;
            }
        }
        {
            ProductPricingType lhsUnitPrice;
            lhsUnitPrice = this.getUnitPrice();
            ProductPricingType rhsUnitPrice;
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
            List<AcknowledgmentReason> theAcknowledgmentReason;
            theAcknowledgmentReason = (((this.acknowledgmentReason!= null)&&(!this.acknowledgmentReason.isEmpty()))?this.getAcknowledgmentReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acknowledgmentReason", theAcknowledgmentReason), currentHashCode, theAcknowledgmentReason, ((this.acknowledgmentReason!= null)&&(!this.acknowledgmentReason.isEmpty())));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            PurchaseOrderStatusType theChangeRequestStatus;
            theChangeRequestStatus = this.getChangeRequestStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeRequestStatus", theChangeRequestStatus), currentHashCode, theChangeRequestStatus, (this.changeRequestStatus!= null));
        }
        {
            FinancialAmountType theContractAmount;
            theContractAmount = this.getContractAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractAmount", theContractAmount), currentHashCode, theContractAmount, (this.contractAmount!= null));
        }
        {
            BusinessDocumentReferenceType theContractReference;
            theContractReference = this.getContractReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractReference", theContractReference), currentHashCode, theContractReference, (this.contractReference!= null));
        }
        {
            BusinessDocumentReferenceType theFromContractReferece;
            theFromContractReferece = this.getFromContractReferece();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromContractReferece", theFromContractReferece), currentHashCode, theFromContractReferece, (this.fromContractReferece!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            MonetaryAmountType thePriceChange;
            thePriceChange = this.getPriceChange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceChange", thePriceChange), currentHashCode, thePriceChange, (this.priceChange!= null));
        }
        {
            ProductType theProduct;
            theProduct = this.getProduct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "product", theProduct), currentHashCode, theProduct, (this.product!= null));
        }
        {
            Float theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, (this.quantity!= null));
        }
        {
            BusinessDocumentReferenceType theRequestingDocumentReference;
            theRequestingDocumentReference = this.getRequestingDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestingDocumentReference", theRequestingDocumentReference), currentHashCode, theRequestingDocumentReference, (this.requestingDocumentReference!= null));
        }
        {
            RequestType theRequestType;
            theRequestType = this.getRequestType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestType", theRequestType), currentHashCode, theRequestType, (this.requestType!= null));
        }
        {
            String theResponseDescription;
            theResponseDescription = this.getResponseDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseDescription", theResponseDescription), currentHashCode, theResponseDescription, (this.responseDescription!= null));
        }
        {
            List<String> theServiceIdentification;
            theServiceIdentification = (((this.serviceIdentification!= null)&&(!this.serviceIdentification.isEmpty()))?this.getServiceIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceIdentification", theServiceIdentification), currentHashCode, theServiceIdentification, ((this.serviceIdentification!= null)&&(!this.serviceIdentification.isEmpty())));
        }
        {
            String theServiceLevel;
            theServiceLevel = this.getServiceLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceLevel", theServiceLevel), currentHashCode, theServiceLevel, (this.serviceLevel!= null));
        }
        {
            DatePeriodAndDurationType theServicePeriod;
            theServicePeriod = this.getServicePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "servicePeriod", theServicePeriod), currentHashCode, theServicePeriod, (this.servicePeriod!= null));
        }
        {
            String theServiceStatus;
            theServiceStatus = this.getServiceStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceStatus", theServiceStatus), currentHashCode, theServiceStatus, (this.serviceStatus!= null));
        }
        {
            List<BusinessDocumentReferenceType> theToContractReference;
            theToContractReference = (((this.toContractReference!= null)&&(!this.toContractReference.isEmpty()))?this.getToContractReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toContractReference", theToContractReference), currentHashCode, theToContractReference, ((this.toContractReference!= null)&&(!this.toContractReference.isEmpty())));
        }
        {
            ProductPricingType theUnitPrice;
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
            List<AcknowledgmentReason> theAcknowledgmentReason;
            theAcknowledgmentReason = (((this.acknowledgmentReason!= null)&&(!this.acknowledgmentReason.isEmpty()))?this.getAcknowledgmentReason():null);
            strategy.appendField(locator, this, "acknowledgmentReason", buffer, theAcknowledgmentReason, ((this.acknowledgmentReason!= null)&&(!this.acknowledgmentReason.isEmpty())));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            PurchaseOrderStatusType theChangeRequestStatus;
            theChangeRequestStatus = this.getChangeRequestStatus();
            strategy.appendField(locator, this, "changeRequestStatus", buffer, theChangeRequestStatus, (this.changeRequestStatus!= null));
        }
        {
            FinancialAmountType theContractAmount;
            theContractAmount = this.getContractAmount();
            strategy.appendField(locator, this, "contractAmount", buffer, theContractAmount, (this.contractAmount!= null));
        }
        {
            BusinessDocumentReferenceType theContractReference;
            theContractReference = this.getContractReference();
            strategy.appendField(locator, this, "contractReference", buffer, theContractReference, (this.contractReference!= null));
        }
        {
            BusinessDocumentReferenceType theFromContractReferece;
            theFromContractReferece = this.getFromContractReferece();
            strategy.appendField(locator, this, "fromContractReferece", buffer, theFromContractReferece, (this.fromContractReferece!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            MonetaryAmountType thePriceChange;
            thePriceChange = this.getPriceChange();
            strategy.appendField(locator, this, "priceChange", buffer, thePriceChange, (this.priceChange!= null));
        }
        {
            ProductType theProduct;
            theProduct = this.getProduct();
            strategy.appendField(locator, this, "product", buffer, theProduct, (this.product!= null));
        }
        {
            Float theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, (this.quantity!= null));
        }
        {
            BusinessDocumentReferenceType theRequestingDocumentReference;
            theRequestingDocumentReference = this.getRequestingDocumentReference();
            strategy.appendField(locator, this, "requestingDocumentReference", buffer, theRequestingDocumentReference, (this.requestingDocumentReference!= null));
        }
        {
            RequestType theRequestType;
            theRequestType = this.getRequestType();
            strategy.appendField(locator, this, "requestType", buffer, theRequestType, (this.requestType!= null));
        }
        {
            String theResponseDescription;
            theResponseDescription = this.getResponseDescription();
            strategy.appendField(locator, this, "responseDescription", buffer, theResponseDescription, (this.responseDescription!= null));
        }
        {
            List<String> theServiceIdentification;
            theServiceIdentification = (((this.serviceIdentification!= null)&&(!this.serviceIdentification.isEmpty()))?this.getServiceIdentification():null);
            strategy.appendField(locator, this, "serviceIdentification", buffer, theServiceIdentification, ((this.serviceIdentification!= null)&&(!this.serviceIdentification.isEmpty())));
        }
        {
            String theServiceLevel;
            theServiceLevel = this.getServiceLevel();
            strategy.appendField(locator, this, "serviceLevel", buffer, theServiceLevel, (this.serviceLevel!= null));
        }
        {
            DatePeriodAndDurationType theServicePeriod;
            theServicePeriod = this.getServicePeriod();
            strategy.appendField(locator, this, "servicePeriod", buffer, theServicePeriod, (this.servicePeriod!= null));
        }
        {
            String theServiceStatus;
            theServiceStatus = this.getServiceStatus();
            strategy.appendField(locator, this, "serviceStatus", buffer, theServiceStatus, (this.serviceStatus!= null));
        }
        {
            List<BusinessDocumentReferenceType> theToContractReference;
            theToContractReference = (((this.toContractReference!= null)&&(!this.toContractReference.isEmpty()))?this.getToContractReference():null);
            strategy.appendField(locator, this, "toContractReference", buffer, theToContractReference, ((this.toContractReference!= null)&&(!this.toContractReference.isEmpty())));
        }
        {
            ProductPricingType theUnitPrice;
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
