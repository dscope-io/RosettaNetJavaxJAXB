
package io.dscope.rosettanet.interchange.purchaseorderrequest.v02_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType;
import io.dscope.rosettanet.domain.procurement.codelist.requestoption.v01_01.RequestOption;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.OrderQuantityType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.SpecialDiscount;
import io.dscope.rosettanet.domain.shared.shared.v01_05.DatePeriodAndDurationType;
import io.dscope.rosettanet.domain.shared.shared.v01_05.ProductPricingType;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_08.SpecifiedPartnerDescriptionType;
import io.dscope.rosettanet.universal.productidentification.v01_03.ProductIdentification;
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
 * <p>Java class for ServiceLineItemByOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLineItemByOptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}ContractInformation" minOccurs="0"/&gt;
 *         &lt;element name="ExpiringBy" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element name="HandlingInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallAt" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="IsRequiredToRespondAtDetailLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element name="OrderPricing" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}ProductPricingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03}ProductIdentification" minOccurs="0"/&gt;
 *         &lt;element name="ProductLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductOrderQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}OrderQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="ProductSerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04}PurchaseOrderType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01}RequestOption"/&gt;
 *         &lt;element name="ServiceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOrderQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}OrderQuantityType"/&gt;
 *         &lt;element name="ServicePeriod" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}SpecialDiscount" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceLineItemByOptionType", propOrder = {
    "businessDocumentReference",
    "contractInformation",
    "expiringBy",
    "handlingInstruction",
    "installAt",
    "isRequiredToRespondAtDetailLevel",
    "lineNumber",
    "listPrice",
    "orderPricing",
    "productIdentification",
    "productLineNumber",
    "productOrderQuantity",
    "productSerialIdentifier",
    "purchaseOrderType",
    "requestOption",
    "serviceIdentification",
    "serviceLevel",
    "serviceOrderQuantity",
    "servicePeriod",
    "specialDiscount"
})
public class ServiceLineItemByOptionType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.04", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = ContractInformation.class, required = false)
    protected ContractInformation contractInformation;
    @XmlElement(name = "ExpiringBy")
    protected DatePeriodAndDurationType expiringBy;
    @XmlElement(name = "HandlingInstruction")
    protected String handlingInstruction;
    @XmlElement(name = "InstallAt")
    protected SpecifiedPartnerDescriptionType installAt;
    @XmlElement(name = "IsRequiredToRespondAtDetailLevel")
    protected Boolean isRequiredToRespondAtDetailLevel;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElement(name = "OrderPricing")
    protected List<ProductPricingType> orderPricing;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03", type = ProductIdentification.class, required = false)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProductLineNumber")
    protected String productLineNumber;
    @XmlElement(name = "ProductOrderQuantity")
    protected OrderQuantityType productOrderQuantity;
    @XmlElement(name = "ProductSerialIdentifier")
    protected List<String> productSerialIdentifier;
    @XmlElementRef(name = "PurchaseOrderType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04", type = PurchaseOrderType.class)
    protected PurchaseOrderType purchaseOrderType;
    @XmlElementRef(name = "RequestOption", namespace = "urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01", type = RequestOption.class)
    protected RequestOption requestOption;
    @XmlElement(name = "ServiceIdentification")
    protected List<String> serviceIdentification;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "ServiceOrderQuantity", required = true)
    protected OrderQuantityType serviceOrderQuantity;
    @XmlElement(name = "ServicePeriod")
    protected DatePeriodAndDurationType servicePeriod;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = SpecialDiscount.class, required = false)
    protected SpecialDiscount specialDiscount;
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
     * Gets the value of the contractInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContractInformation }
     *     
     */
    public ContractInformation getContractInformation() {
        return contractInformation;
    }

    /**
     * Sets the value of the contractInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractInformation }
     *     
     */
    public void setContractInformation(ContractInformation value) {
        this.contractInformation = value;
    }

    /**
     * Gets the value of the expiringBy property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public DatePeriodAndDurationType getExpiringBy() {
        return expiringBy;
    }

    /**
     * Sets the value of the expiringBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public void setExpiringBy(DatePeriodAndDurationType value) {
        this.expiringBy = value;
    }

    /**
     * Gets the value of the handlingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingInstruction() {
        return handlingInstruction;
    }

    /**
     * Sets the value of the handlingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingInstruction(String value) {
        this.handlingInstruction = value;
    }

    /**
     * Gets the value of the installAt property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getInstallAt() {
        return installAt;
    }

    /**
     * Sets the value of the installAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setInstallAt(SpecifiedPartnerDescriptionType value) {
        this.installAt = value;
    }

    /**
     * Gets the value of the isRequiredToRespondAtDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequiredToRespondAtDetailLevel() {
        return isRequiredToRespondAtDetailLevel;
    }

    /**
     * Sets the value of the isRequiredToRespondAtDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequiredToRespondAtDetailLevel(Boolean value) {
        this.isRequiredToRespondAtDetailLevel = value;
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
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setListPrice(ProductPricingType value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the orderPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPricingType }
     * 
     * 
     */
    public List<ProductPricingType> getOrderPricing() {
        if (orderPricing == null) {
            orderPricing = new ArrayList<ProductPricingType>();
        }
        return this.orderPricing;
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
     * Gets the value of the productLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLineNumber() {
        return productLineNumber;
    }

    /**
     * Sets the value of the productLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLineNumber(String value) {
        this.productLineNumber = value;
    }

    /**
     * Gets the value of the productOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantityType }
     *     
     */
    public OrderQuantityType getProductOrderQuantity() {
        return productOrderQuantity;
    }

    /**
     * Sets the value of the productOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantityType }
     *     
     */
    public void setProductOrderQuantity(OrderQuantityType value) {
        this.productOrderQuantity = value;
    }

    /**
     * Gets the value of the productSerialIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSerialIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSerialIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductSerialIdentifier() {
        if (productSerialIdentifier == null) {
            productSerialIdentifier = new ArrayList<String>();
        }
        return this.productSerialIdentifier;
    }

    /**
     * Gets the value of the purchaseOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderType }
     *     
     */
    public PurchaseOrderType getPurchaseOrderType() {
        return purchaseOrderType;
    }

    /**
     * Sets the value of the purchaseOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderType }
     *     
     */
    public void setPurchaseOrderType(PurchaseOrderType value) {
        this.purchaseOrderType = value;
    }

    /**
     * Gets the value of the requestOption property.
     * 
     * @return
     *     possible object is
     *     {@link RequestOption }
     *     
     */
    public RequestOption getRequestOption() {
        return requestOption;
    }

    /**
     * Sets the value of the requestOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestOption }
     *     
     */
    public void setRequestOption(RequestOption value) {
        this.requestOption = value;
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
     * Gets the value of the serviceOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantityType }
     *     
     */
    public OrderQuantityType getServiceOrderQuantity() {
        return serviceOrderQuantity;
    }

    /**
     * Sets the value of the serviceOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantityType }
     *     
     */
    public void setServiceOrderQuantity(OrderQuantityType value) {
        this.serviceOrderQuantity = value;
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
     * Gets the value of the specialDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialDiscount }
     *     
     */
    public SpecialDiscount getSpecialDiscount() {
        return specialDiscount;
    }

    /**
     * Sets the value of the specialDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialDiscount }
     *     
     */
    public void setSpecialDiscount(SpecialDiscount value) {
        this.specialDiscount = value;
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
        final ServiceLineItemByOptionType that = ((ServiceLineItemByOptionType) object);
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
            ContractInformation lhsContractInformation;
            lhsContractInformation = this.getContractInformation();
            ContractInformation rhsContractInformation;
            rhsContractInformation = that.getContractInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractInformation", lhsContractInformation), LocatorUtils.property(thatLocator, "contractInformation", rhsContractInformation), lhsContractInformation, rhsContractInformation, (this.contractInformation!= null), (that.contractInformation!= null))) {
                return false;
            }
        }
        {
            DatePeriodAndDurationType lhsExpiringBy;
            lhsExpiringBy = this.getExpiringBy();
            DatePeriodAndDurationType rhsExpiringBy;
            rhsExpiringBy = that.getExpiringBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expiringBy", lhsExpiringBy), LocatorUtils.property(thatLocator, "expiringBy", rhsExpiringBy), lhsExpiringBy, rhsExpiringBy, (this.expiringBy!= null), (that.expiringBy!= null))) {
                return false;
            }
        }
        {
            String lhsHandlingInstruction;
            lhsHandlingInstruction = this.getHandlingInstruction();
            String rhsHandlingInstruction;
            rhsHandlingInstruction = that.getHandlingInstruction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handlingInstruction", lhsHandlingInstruction), LocatorUtils.property(thatLocator, "handlingInstruction", rhsHandlingInstruction), lhsHandlingInstruction, rhsHandlingInstruction, (this.handlingInstruction!= null), (that.handlingInstruction!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsInstallAt;
            lhsInstallAt = this.getInstallAt();
            SpecifiedPartnerDescriptionType rhsInstallAt;
            rhsInstallAt = that.getInstallAt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "installAt", lhsInstallAt), LocatorUtils.property(thatLocator, "installAt", rhsInstallAt), lhsInstallAt, rhsInstallAt, (this.installAt!= null), (that.installAt!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsRequiredToRespondAtDetailLevel;
            lhsIsRequiredToRespondAtDetailLevel = this.isIsRequiredToRespondAtDetailLevel();
            Boolean rhsIsRequiredToRespondAtDetailLevel;
            rhsIsRequiredToRespondAtDetailLevel = that.isIsRequiredToRespondAtDetailLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRequiredToRespondAtDetailLevel", lhsIsRequiredToRespondAtDetailLevel), LocatorUtils.property(thatLocator, "isRequiredToRespondAtDetailLevel", rhsIsRequiredToRespondAtDetailLevel), lhsIsRequiredToRespondAtDetailLevel, rhsIsRequiredToRespondAtDetailLevel, (this.isRequiredToRespondAtDetailLevel!= null), (that.isRequiredToRespondAtDetailLevel!= null))) {
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
            ProductPricingType lhsListPrice;
            lhsListPrice = this.getListPrice();
            ProductPricingType rhsListPrice;
            rhsListPrice = that.getListPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listPrice", lhsListPrice), LocatorUtils.property(thatLocator, "listPrice", rhsListPrice), lhsListPrice, rhsListPrice, (this.listPrice!= null), (that.listPrice!= null))) {
                return false;
            }
        }
        {
            List<ProductPricingType> lhsOrderPricing;
            lhsOrderPricing = (((this.orderPricing!= null)&&(!this.orderPricing.isEmpty()))?this.getOrderPricing():null);
            List<ProductPricingType> rhsOrderPricing;
            rhsOrderPricing = (((that.orderPricing!= null)&&(!that.orderPricing.isEmpty()))?that.getOrderPricing():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderPricing", lhsOrderPricing), LocatorUtils.property(thatLocator, "orderPricing", rhsOrderPricing), lhsOrderPricing, rhsOrderPricing, ((this.orderPricing!= null)&&(!this.orderPricing.isEmpty())), ((that.orderPricing!= null)&&(!that.orderPricing.isEmpty())))) {
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
            String lhsProductLineNumber;
            lhsProductLineNumber = this.getProductLineNumber();
            String rhsProductLineNumber;
            rhsProductLineNumber = that.getProductLineNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productLineNumber", lhsProductLineNumber), LocatorUtils.property(thatLocator, "productLineNumber", rhsProductLineNumber), lhsProductLineNumber, rhsProductLineNumber, (this.productLineNumber!= null), (that.productLineNumber!= null))) {
                return false;
            }
        }
        {
            OrderQuantityType lhsProductOrderQuantity;
            lhsProductOrderQuantity = this.getProductOrderQuantity();
            OrderQuantityType rhsProductOrderQuantity;
            rhsProductOrderQuantity = that.getProductOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productOrderQuantity", lhsProductOrderQuantity), LocatorUtils.property(thatLocator, "productOrderQuantity", rhsProductOrderQuantity), lhsProductOrderQuantity, rhsProductOrderQuantity, (this.productOrderQuantity!= null), (that.productOrderQuantity!= null))) {
                return false;
            }
        }
        {
            List<String> lhsProductSerialIdentifier;
            lhsProductSerialIdentifier = (((this.productSerialIdentifier!= null)&&(!this.productSerialIdentifier.isEmpty()))?this.getProductSerialIdentifier():null);
            List<String> rhsProductSerialIdentifier;
            rhsProductSerialIdentifier = (((that.productSerialIdentifier!= null)&&(!that.productSerialIdentifier.isEmpty()))?that.getProductSerialIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productSerialIdentifier", lhsProductSerialIdentifier), LocatorUtils.property(thatLocator, "productSerialIdentifier", rhsProductSerialIdentifier), lhsProductSerialIdentifier, rhsProductSerialIdentifier, ((this.productSerialIdentifier!= null)&&(!this.productSerialIdentifier.isEmpty())), ((that.productSerialIdentifier!= null)&&(!that.productSerialIdentifier.isEmpty())))) {
                return false;
            }
        }
        {
            PurchaseOrderType lhsPurchaseOrderType;
            lhsPurchaseOrderType = this.getPurchaseOrderType();
            PurchaseOrderType rhsPurchaseOrderType;
            rhsPurchaseOrderType = that.getPurchaseOrderType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderType", lhsPurchaseOrderType), LocatorUtils.property(thatLocator, "purchaseOrderType", rhsPurchaseOrderType), lhsPurchaseOrderType, rhsPurchaseOrderType, (this.purchaseOrderType!= null), (that.purchaseOrderType!= null))) {
                return false;
            }
        }
        {
            RequestOption lhsRequestOption;
            lhsRequestOption = this.getRequestOption();
            RequestOption rhsRequestOption;
            rhsRequestOption = that.getRequestOption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestOption", lhsRequestOption), LocatorUtils.property(thatLocator, "requestOption", rhsRequestOption), lhsRequestOption, rhsRequestOption, (this.requestOption!= null), (that.requestOption!= null))) {
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
            OrderQuantityType lhsServiceOrderQuantity;
            lhsServiceOrderQuantity = this.getServiceOrderQuantity();
            OrderQuantityType rhsServiceOrderQuantity;
            rhsServiceOrderQuantity = that.getServiceOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceOrderQuantity", lhsServiceOrderQuantity), LocatorUtils.property(thatLocator, "serviceOrderQuantity", rhsServiceOrderQuantity), lhsServiceOrderQuantity, rhsServiceOrderQuantity, (this.serviceOrderQuantity!= null), (that.serviceOrderQuantity!= null))) {
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
            SpecialDiscount lhsSpecialDiscount;
            lhsSpecialDiscount = this.getSpecialDiscount();
            SpecialDiscount rhsSpecialDiscount;
            rhsSpecialDiscount = that.getSpecialDiscount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialDiscount", lhsSpecialDiscount), LocatorUtils.property(thatLocator, "specialDiscount", rhsSpecialDiscount), lhsSpecialDiscount, rhsSpecialDiscount, (this.specialDiscount!= null), (that.specialDiscount!= null))) {
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
            ContractInformation theContractInformation;
            theContractInformation = this.getContractInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractInformation", theContractInformation), currentHashCode, theContractInformation, (this.contractInformation!= null));
        }
        {
            DatePeriodAndDurationType theExpiringBy;
            theExpiringBy = this.getExpiringBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expiringBy", theExpiringBy), currentHashCode, theExpiringBy, (this.expiringBy!= null));
        }
        {
            String theHandlingInstruction;
            theHandlingInstruction = this.getHandlingInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handlingInstruction", theHandlingInstruction), currentHashCode, theHandlingInstruction, (this.handlingInstruction!= null));
        }
        {
            SpecifiedPartnerDescriptionType theInstallAt;
            theInstallAt = this.getInstallAt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "installAt", theInstallAt), currentHashCode, theInstallAt, (this.installAt!= null));
        }
        {
            Boolean theIsRequiredToRespondAtDetailLevel;
            theIsRequiredToRespondAtDetailLevel = this.isIsRequiredToRespondAtDetailLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRequiredToRespondAtDetailLevel", theIsRequiredToRespondAtDetailLevel), currentHashCode, theIsRequiredToRespondAtDetailLevel, (this.isRequiredToRespondAtDetailLevel!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            ProductPricingType theListPrice;
            theListPrice = this.getListPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listPrice", theListPrice), currentHashCode, theListPrice, (this.listPrice!= null));
        }
        {
            List<ProductPricingType> theOrderPricing;
            theOrderPricing = (((this.orderPricing!= null)&&(!this.orderPricing.isEmpty()))?this.getOrderPricing():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderPricing", theOrderPricing), currentHashCode, theOrderPricing, ((this.orderPricing!= null)&&(!this.orderPricing.isEmpty())));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theProductLineNumber;
            theProductLineNumber = this.getProductLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLineNumber", theProductLineNumber), currentHashCode, theProductLineNumber, (this.productLineNumber!= null));
        }
        {
            OrderQuantityType theProductOrderQuantity;
            theProductOrderQuantity = this.getProductOrderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productOrderQuantity", theProductOrderQuantity), currentHashCode, theProductOrderQuantity, (this.productOrderQuantity!= null));
        }
        {
            List<String> theProductSerialIdentifier;
            theProductSerialIdentifier = (((this.productSerialIdentifier!= null)&&(!this.productSerialIdentifier.isEmpty()))?this.getProductSerialIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productSerialIdentifier", theProductSerialIdentifier), currentHashCode, theProductSerialIdentifier, ((this.productSerialIdentifier!= null)&&(!this.productSerialIdentifier.isEmpty())));
        }
        {
            PurchaseOrderType thePurchaseOrderType;
            thePurchaseOrderType = this.getPurchaseOrderType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderType", thePurchaseOrderType), currentHashCode, thePurchaseOrderType, (this.purchaseOrderType!= null));
        }
        {
            RequestOption theRequestOption;
            theRequestOption = this.getRequestOption();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestOption", theRequestOption), currentHashCode, theRequestOption, (this.requestOption!= null));
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
            OrderQuantityType theServiceOrderQuantity;
            theServiceOrderQuantity = this.getServiceOrderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceOrderQuantity", theServiceOrderQuantity), currentHashCode, theServiceOrderQuantity, (this.serviceOrderQuantity!= null));
        }
        {
            DatePeriodAndDurationType theServicePeriod;
            theServicePeriod = this.getServicePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "servicePeriod", theServicePeriod), currentHashCode, theServicePeriod, (this.servicePeriod!= null));
        }
        {
            SpecialDiscount theSpecialDiscount;
            theSpecialDiscount = this.getSpecialDiscount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialDiscount", theSpecialDiscount), currentHashCode, theSpecialDiscount, (this.specialDiscount!= null));
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
            ContractInformation theContractInformation;
            theContractInformation = this.getContractInformation();
            strategy.appendField(locator, this, "contractInformation", buffer, theContractInformation, (this.contractInformation!= null));
        }
        {
            DatePeriodAndDurationType theExpiringBy;
            theExpiringBy = this.getExpiringBy();
            strategy.appendField(locator, this, "expiringBy", buffer, theExpiringBy, (this.expiringBy!= null));
        }
        {
            String theHandlingInstruction;
            theHandlingInstruction = this.getHandlingInstruction();
            strategy.appendField(locator, this, "handlingInstruction", buffer, theHandlingInstruction, (this.handlingInstruction!= null));
        }
        {
            SpecifiedPartnerDescriptionType theInstallAt;
            theInstallAt = this.getInstallAt();
            strategy.appendField(locator, this, "installAt", buffer, theInstallAt, (this.installAt!= null));
        }
        {
            Boolean theIsRequiredToRespondAtDetailLevel;
            theIsRequiredToRespondAtDetailLevel = this.isIsRequiredToRespondAtDetailLevel();
            strategy.appendField(locator, this, "isRequiredToRespondAtDetailLevel", buffer, theIsRequiredToRespondAtDetailLevel, (this.isRequiredToRespondAtDetailLevel!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            ProductPricingType theListPrice;
            theListPrice = this.getListPrice();
            strategy.appendField(locator, this, "listPrice", buffer, theListPrice, (this.listPrice!= null));
        }
        {
            List<ProductPricingType> theOrderPricing;
            theOrderPricing = (((this.orderPricing!= null)&&(!this.orderPricing.isEmpty()))?this.getOrderPricing():null);
            strategy.appendField(locator, this, "orderPricing", buffer, theOrderPricing, ((this.orderPricing!= null)&&(!this.orderPricing.isEmpty())));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theProductLineNumber;
            theProductLineNumber = this.getProductLineNumber();
            strategy.appendField(locator, this, "productLineNumber", buffer, theProductLineNumber, (this.productLineNumber!= null));
        }
        {
            OrderQuantityType theProductOrderQuantity;
            theProductOrderQuantity = this.getProductOrderQuantity();
            strategy.appendField(locator, this, "productOrderQuantity", buffer, theProductOrderQuantity, (this.productOrderQuantity!= null));
        }
        {
            List<String> theProductSerialIdentifier;
            theProductSerialIdentifier = (((this.productSerialIdentifier!= null)&&(!this.productSerialIdentifier.isEmpty()))?this.getProductSerialIdentifier():null);
            strategy.appendField(locator, this, "productSerialIdentifier", buffer, theProductSerialIdentifier, ((this.productSerialIdentifier!= null)&&(!this.productSerialIdentifier.isEmpty())));
        }
        {
            PurchaseOrderType thePurchaseOrderType;
            thePurchaseOrderType = this.getPurchaseOrderType();
            strategy.appendField(locator, this, "purchaseOrderType", buffer, thePurchaseOrderType, (this.purchaseOrderType!= null));
        }
        {
            RequestOption theRequestOption;
            theRequestOption = this.getRequestOption();
            strategy.appendField(locator, this, "requestOption", buffer, theRequestOption, (this.requestOption!= null));
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
            OrderQuantityType theServiceOrderQuantity;
            theServiceOrderQuantity = this.getServiceOrderQuantity();
            strategy.appendField(locator, this, "serviceOrderQuantity", buffer, theServiceOrderQuantity, (this.serviceOrderQuantity!= null));
        }
        {
            DatePeriodAndDurationType theServicePeriod;
            theServicePeriod = this.getServicePeriod();
            strategy.appendField(locator, this, "servicePeriod", buffer, theServicePeriod, (this.servicePeriod!= null));
        }
        {
            SpecialDiscount theSpecialDiscount;
            theSpecialDiscount = this.getSpecialDiscount();
            strategy.appendField(locator, this, "specialDiscount", buffer, theSpecialDiscount, (this.specialDiscount!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
