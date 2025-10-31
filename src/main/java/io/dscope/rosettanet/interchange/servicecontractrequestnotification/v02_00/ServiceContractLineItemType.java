
package io.dscope.rosettanet.interchange.servicecontractrequestnotification.v02_00;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.shared.shared.v01_05.DatePeriodAndDurationType;
import io.dscope.rosettanet.domain.shared.shared.v01_05.ProductPricingType;
import io.dscope.rosettanet.interchange.codelist.requesttype.v01_01.RequestType;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.locations.v01_03.AlternativeIdentifierType;
import io.dscope.rosettanet.universal.partneridentification.v01_08.SpecifiedPartnerDescriptionType;
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
 *         &lt;element name="BillTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ContractOwner" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="FromContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="HandlingInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsRequiredToResponseAtDetailLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Label" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.03}AlternativeIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{urn:rosettanet:specification:interchange:ServiceContractRequestNotification:xsd:schema:02.00}ProductType" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.01}RequestType"/&gt;
 *         &lt;element name="ServiceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServicePeriod" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element name="ToContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}ProductPricingType" minOccurs="0"/&gt;
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
    "billTo",
    "businessDocumentReference",
    "cancellationDate",
    "contractOwner",
    "contractReference",
    "fromContractReference",
    "handlingInstruction",
    "isRequiredToResponseAtDetailLevel",
    "label",
    "lineNumber",
    "notes",
    "product",
    "quantity",
    "requestType",
    "serviceIdentification",
    "serviceLevel",
    "servicePeriod",
    "toContractReference",
    "unitPrice"
})
public class ServiceContractLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BillTo")
    protected SpecifiedPartnerDescriptionType billTo;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.04", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "CancellationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(name = "ContractOwner")
    protected SpecifiedPartnerDescriptionType contractOwner;
    @XmlElement(name = "ContractReference")
    protected BusinessDocumentReferenceType contractReference;
    @XmlElement(name = "FromContractReference")
    protected BusinessDocumentReferenceType fromContractReference;
    @XmlElement(name = "HandlingInstruction")
    protected String handlingInstruction;
    @XmlElement(name = "IsRequiredToResponseAtDetailLevel")
    protected String isRequiredToResponseAtDetailLevel;
    @XmlElement(name = "Label")
    protected AlternativeIdentifierType label;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Product")
    protected ProductType product;
    @XmlElement(name = "Quantity")
    protected Float quantity;
    @XmlElementRef(name = "RequestType", namespace = "urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.01", type = RequestType.class)
    protected RequestType requestType;
    @XmlElement(name = "ServiceIdentification")
    protected List<String> serviceIdentification;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "ServicePeriod")
    protected DatePeriodAndDurationType servicePeriod;
    @XmlElement(name = "ToContractReference")
    protected List<BusinessDocumentReferenceType> toContractReference;
    @XmlElement(name = "UnitPrice")
    protected ProductPricingType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setBillTo(SpecifiedPartnerDescriptionType value) {
        this.billTo = value;
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
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the contractOwner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getContractOwner() {
        return contractOwner;
    }

    /**
     * Sets the value of the contractOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setContractOwner(SpecifiedPartnerDescriptionType value) {
        this.contractOwner = value;
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
     * Gets the value of the fromContractReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getFromContractReference() {
        return fromContractReference;
    }

    /**
     * Sets the value of the fromContractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setFromContractReference(BusinessDocumentReferenceType value) {
        this.fromContractReference = value;
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
     * Gets the value of the isRequiredToResponseAtDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRequiredToResponseAtDetailLevel() {
        return isRequiredToResponseAtDetailLevel;
    }

    /**
     * Sets the value of the isRequiredToResponseAtDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRequiredToResponseAtDetailLevel(String value) {
        this.isRequiredToResponseAtDetailLevel = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeIdentifierType }
     *     
     */
    public AlternativeIdentifierType getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeIdentifierType }
     *     
     */
    public void setLabel(AlternativeIdentifierType value) {
        this.label = value;
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
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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
            SpecifiedPartnerDescriptionType lhsBillTo;
            lhsBillTo = this.getBillTo();
            SpecifiedPartnerDescriptionType rhsBillTo;
            rhsBillTo = that.getBillTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billTo", lhsBillTo), LocatorUtils.property(thatLocator, "billTo", rhsBillTo), lhsBillTo, rhsBillTo, (this.billTo!= null), (that.billTo!= null))) {
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
            XMLGregorianCalendar lhsCancellationDate;
            lhsCancellationDate = this.getCancellationDate();
            XMLGregorianCalendar rhsCancellationDate;
            rhsCancellationDate = that.getCancellationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cancellationDate", lhsCancellationDate), LocatorUtils.property(thatLocator, "cancellationDate", rhsCancellationDate), lhsCancellationDate, rhsCancellationDate, (this.cancellationDate!= null), (that.cancellationDate!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsContractOwner;
            lhsContractOwner = this.getContractOwner();
            SpecifiedPartnerDescriptionType rhsContractOwner;
            rhsContractOwner = that.getContractOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractOwner", lhsContractOwner), LocatorUtils.property(thatLocator, "contractOwner", rhsContractOwner), lhsContractOwner, rhsContractOwner, (this.contractOwner!= null), (that.contractOwner!= null))) {
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
            BusinessDocumentReferenceType lhsFromContractReference;
            lhsFromContractReference = this.getFromContractReference();
            BusinessDocumentReferenceType rhsFromContractReference;
            rhsFromContractReference = that.getFromContractReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromContractReference", lhsFromContractReference), LocatorUtils.property(thatLocator, "fromContractReference", rhsFromContractReference), lhsFromContractReference, rhsFromContractReference, (this.fromContractReference!= null), (that.fromContractReference!= null))) {
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
            String lhsIsRequiredToResponseAtDetailLevel;
            lhsIsRequiredToResponseAtDetailLevel = this.getIsRequiredToResponseAtDetailLevel();
            String rhsIsRequiredToResponseAtDetailLevel;
            rhsIsRequiredToResponseAtDetailLevel = that.getIsRequiredToResponseAtDetailLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRequiredToResponseAtDetailLevel", lhsIsRequiredToResponseAtDetailLevel), LocatorUtils.property(thatLocator, "isRequiredToResponseAtDetailLevel", rhsIsRequiredToResponseAtDetailLevel), lhsIsRequiredToResponseAtDetailLevel, rhsIsRequiredToResponseAtDetailLevel, (this.isRequiredToResponseAtDetailLevel!= null), (that.isRequiredToResponseAtDetailLevel!= null))) {
                return false;
            }
        }
        {
            AlternativeIdentifierType lhsLabel;
            lhsLabel = this.getLabel();
            AlternativeIdentifierType rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel, (this.label!= null), (that.label!= null))) {
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
            String lhsNotes;
            lhsNotes = this.getNotes();
            String rhsNotes;
            rhsNotes = that.getNotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notes", lhsNotes), LocatorUtils.property(thatLocator, "notes", rhsNotes), lhsNotes, rhsNotes, (this.notes!= null), (that.notes!= null))) {
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
            RequestType lhsRequestType;
            lhsRequestType = this.getRequestType();
            RequestType rhsRequestType;
            rhsRequestType = that.getRequestType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestType", lhsRequestType), LocatorUtils.property(thatLocator, "requestType", rhsRequestType), lhsRequestType, rhsRequestType, (this.requestType!= null), (that.requestType!= null))) {
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
            SpecifiedPartnerDescriptionType theBillTo;
            theBillTo = this.getBillTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billTo", theBillTo), currentHashCode, theBillTo, (this.billTo!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            XMLGregorianCalendar theCancellationDate;
            theCancellationDate = this.getCancellationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cancellationDate", theCancellationDate), currentHashCode, theCancellationDate, (this.cancellationDate!= null));
        }
        {
            SpecifiedPartnerDescriptionType theContractOwner;
            theContractOwner = this.getContractOwner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractOwner", theContractOwner), currentHashCode, theContractOwner, (this.contractOwner!= null));
        }
        {
            BusinessDocumentReferenceType theContractReference;
            theContractReference = this.getContractReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractReference", theContractReference), currentHashCode, theContractReference, (this.contractReference!= null));
        }
        {
            BusinessDocumentReferenceType theFromContractReference;
            theFromContractReference = this.getFromContractReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromContractReference", theFromContractReference), currentHashCode, theFromContractReference, (this.fromContractReference!= null));
        }
        {
            String theHandlingInstruction;
            theHandlingInstruction = this.getHandlingInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handlingInstruction", theHandlingInstruction), currentHashCode, theHandlingInstruction, (this.handlingInstruction!= null));
        }
        {
            String theIsRequiredToResponseAtDetailLevel;
            theIsRequiredToResponseAtDetailLevel = this.getIsRequiredToResponseAtDetailLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRequiredToResponseAtDetailLevel", theIsRequiredToResponseAtDetailLevel), currentHashCode, theIsRequiredToResponseAtDetailLevel, (this.isRequiredToResponseAtDetailLevel!= null));
        }
        {
            AlternativeIdentifierType theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel, (this.label!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            String theNotes;
            theNotes = this.getNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes, (this.notes!= null));
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
            RequestType theRequestType;
            theRequestType = this.getRequestType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestType", theRequestType), currentHashCode, theRequestType, (this.requestType!= null));
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
            SpecifiedPartnerDescriptionType theBillTo;
            theBillTo = this.getBillTo();
            strategy.appendField(locator, this, "billTo", buffer, theBillTo, (this.billTo!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            XMLGregorianCalendar theCancellationDate;
            theCancellationDate = this.getCancellationDate();
            strategy.appendField(locator, this, "cancellationDate", buffer, theCancellationDate, (this.cancellationDate!= null));
        }
        {
            SpecifiedPartnerDescriptionType theContractOwner;
            theContractOwner = this.getContractOwner();
            strategy.appendField(locator, this, "contractOwner", buffer, theContractOwner, (this.contractOwner!= null));
        }
        {
            BusinessDocumentReferenceType theContractReference;
            theContractReference = this.getContractReference();
            strategy.appendField(locator, this, "contractReference", buffer, theContractReference, (this.contractReference!= null));
        }
        {
            BusinessDocumentReferenceType theFromContractReference;
            theFromContractReference = this.getFromContractReference();
            strategy.appendField(locator, this, "fromContractReference", buffer, theFromContractReference, (this.fromContractReference!= null));
        }
        {
            String theHandlingInstruction;
            theHandlingInstruction = this.getHandlingInstruction();
            strategy.appendField(locator, this, "handlingInstruction", buffer, theHandlingInstruction, (this.handlingInstruction!= null));
        }
        {
            String theIsRequiredToResponseAtDetailLevel;
            theIsRequiredToResponseAtDetailLevel = this.getIsRequiredToResponseAtDetailLevel();
            strategy.appendField(locator, this, "isRequiredToResponseAtDetailLevel", buffer, theIsRequiredToResponseAtDetailLevel, (this.isRequiredToResponseAtDetailLevel!= null));
        }
        {
            AlternativeIdentifierType theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            String theNotes;
            theNotes = this.getNotes();
            strategy.appendField(locator, this, "notes", buffer, theNotes, (this.notes!= null));
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
            RequestType theRequestType;
            theRequestType = this.getRequestType();
            strategy.appendField(locator, this, "requestType", buffer, theRequestType, (this.requestType!= null));
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
