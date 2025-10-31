
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_07;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.ForeignCurrencyControl;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.ShippingDocumentReference;
import io.dscope.rosettanet.interchange.codelist.deliverytype.v01_00.DeliveryType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for DeclarationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeclarationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmendmentInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.07}AmendmentInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DateInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.07}DateInformationType" minOccurs="0"/&gt;
 *         &lt;element name="Declarant" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="DeclarationFormReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:DeliveryType:xsd:codelist:01.00}DeliveryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}ForeignCurrencyControl" minOccurs="0"/&gt;
 *         &lt;element name="FundTransferFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsGoodsStoredInFreeTradeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsInformationComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSupplierOfGoods" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreDeclarationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}ShippingDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TradeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DeclarationInformationType", propOrder = {
    "amendmentInformation",
    "businessDocumentReference",
    "dateInformation",
    "declarant",
    "declarationFormReference",
    "deliveryType",
    "foreignCurrencyControl",
    "fundTransferFrom",
    "isGoodsStoredInFreeTradeZone",
    "isInformationComplete",
    "isSupplierOfGoods",
    "messageType",
    "partnerDescription",
    "paymentDescription",
    "preDeclarationIdentifier",
    "purpose",
    "shippingDocumentReference",
    "tradeType"
})
public class DeclarationInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AmendmentInformation")
    protected AmendmentInformationType amendmentInformation;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "DateInformation")
    protected DateInformationType dateInformation;
    @XmlElement(name = "Declarant", required = true)
    protected SpecifiedPartnerDescriptionType declarant;
    @XmlElement(name = "DeclarationFormReference")
    protected List<BusinessDocumentReferenceType> declarationFormReference;
    @XmlElementRef(name = "DeliveryType", namespace = "urn:rosettanet:specification:interchange:DeliveryType:xsd:codelist:01.00", type = DeliveryType.class, required = false)
    protected DeliveryType deliveryType;
    @XmlElementRef(name = "ForeignCurrencyControl", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = ForeignCurrencyControl.class, required = false)
    protected ForeignCurrencyControl foreignCurrencyControl;
    @XmlElement(name = "FundTransferFrom")
    protected String fundTransferFrom;
    @XmlElement(name = "IsGoodsStoredInFreeTradeZone")
    protected Boolean isGoodsStoredInFreeTradeZone;
    @XmlElement(name = "IsInformationComplete")
    protected Boolean isInformationComplete;
    @XmlElement(name = "IsSupplierOfGoods")
    protected Boolean isSupplierOfGoods;
    @XmlElement(name = "MessageType")
    protected String messageType;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "PaymentDescription")
    protected String paymentDescription;
    @XmlElement(name = "PreDeclarationIdentifier")
    protected String preDeclarationIdentifier;
    @XmlElement(name = "Purpose")
    protected List<String> purpose;
    @XmlElementRef(name = "ShippingDocumentReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = ShippingDocumentReference.class, required = false)
    protected List<ShippingDocumentReference> shippingDocumentReference;
    @XmlElement(name = "TradeType")
    protected String tradeType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the amendmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentInformationType }
     *     
     */
    public AmendmentInformationType getAmendmentInformation() {
        return amendmentInformation;
    }

    /**
     * Sets the value of the amendmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentInformationType }
     *     
     */
    public void setAmendmentInformation(AmendmentInformationType value) {
        this.amendmentInformation = value;
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
     * Gets the value of the dateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DateInformationType }
     *     
     */
    public DateInformationType getDateInformation() {
        return dateInformation;
    }

    /**
     * Sets the value of the dateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInformationType }
     *     
     */
    public void setDateInformation(DateInformationType value) {
        this.dateInformation = value;
    }

    /**
     * Gets the value of the declarant property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getDeclarant() {
        return declarant;
    }

    /**
     * Sets the value of the declarant property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setDeclarant(SpecifiedPartnerDescriptionType value) {
        this.declarant = value;
    }

    /**
     * Gets the value of the declarationFormReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declarationFormReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclarationFormReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getDeclarationFormReference() {
        if (declarationFormReference == null) {
            declarationFormReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.declarationFormReference;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType }
     *     
     */
    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType }
     *     
     */
    public void setDeliveryType(DeliveryType value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the foreignCurrencyControl property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignCurrencyControl }
     *     
     */
    public ForeignCurrencyControl getForeignCurrencyControl() {
        return foreignCurrencyControl;
    }

    /**
     * Sets the value of the foreignCurrencyControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignCurrencyControl }
     *     
     */
    public void setForeignCurrencyControl(ForeignCurrencyControl value) {
        this.foreignCurrencyControl = value;
    }

    /**
     * Gets the value of the fundTransferFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferFrom() {
        return fundTransferFrom;
    }

    /**
     * Sets the value of the fundTransferFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferFrom(String value) {
        this.fundTransferFrom = value;
    }

    /**
     * Gets the value of the isGoodsStoredInFreeTradeZone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGoodsStoredInFreeTradeZone() {
        return isGoodsStoredInFreeTradeZone;
    }

    /**
     * Sets the value of the isGoodsStoredInFreeTradeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGoodsStoredInFreeTradeZone(Boolean value) {
        this.isGoodsStoredInFreeTradeZone = value;
    }

    /**
     * Gets the value of the isInformationComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInformationComplete() {
        return isInformationComplete;
    }

    /**
     * Sets the value of the isInformationComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInformationComplete(Boolean value) {
        this.isInformationComplete = value;
    }

    /**
     * Gets the value of the isSupplierOfGoods property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupplierOfGoods() {
        return isSupplierOfGoods;
    }

    /**
     * Sets the value of the isSupplierOfGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupplierOfGoods(Boolean value) {
        this.isSupplierOfGoods = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
    }

    /**
     * Gets the value of the paymentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDescription() {
        return paymentDescription;
    }

    /**
     * Sets the value of the paymentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDescription(String value) {
        this.paymentDescription = value;
    }

    /**
     * Gets the value of the preDeclarationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreDeclarationIdentifier() {
        return preDeclarationIdentifier;
    }

    /**
     * Sets the value of the preDeclarationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreDeclarationIdentifier(String value) {
        this.preDeclarationIdentifier = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPurpose() {
        if (purpose == null) {
            purpose = new ArrayList<String>();
        }
        return this.purpose;
    }

    /**
     * Gets the value of the shippingDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDocumentReference }
     * 
     * 
     */
    public List<ShippingDocumentReference> getShippingDocumentReference() {
        if (shippingDocumentReference == null) {
            shippingDocumentReference = new ArrayList<ShippingDocumentReference>();
        }
        return this.shippingDocumentReference;
    }

    /**
     * Gets the value of the tradeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * Sets the value of the tradeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeType(String value) {
        this.tradeType = value;
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
        final DeclarationInformationType that = ((DeclarationInformationType) object);
        {
            AmendmentInformationType lhsAmendmentInformation;
            lhsAmendmentInformation = this.getAmendmentInformation();
            AmendmentInformationType rhsAmendmentInformation;
            rhsAmendmentInformation = that.getAmendmentInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amendmentInformation", lhsAmendmentInformation), LocatorUtils.property(thatLocator, "amendmentInformation", rhsAmendmentInformation), lhsAmendmentInformation, rhsAmendmentInformation, (this.amendmentInformation!= null), (that.amendmentInformation!= null))) {
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
            DateInformationType lhsDateInformation;
            lhsDateInformation = this.getDateInformation();
            DateInformationType rhsDateInformation;
            rhsDateInformation = that.getDateInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateInformation", lhsDateInformation), LocatorUtils.property(thatLocator, "dateInformation", rhsDateInformation), lhsDateInformation, rhsDateInformation, (this.dateInformation!= null), (that.dateInformation!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsDeclarant;
            lhsDeclarant = this.getDeclarant();
            SpecifiedPartnerDescriptionType rhsDeclarant;
            rhsDeclarant = that.getDeclarant();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "declarant", lhsDeclarant), LocatorUtils.property(thatLocator, "declarant", rhsDeclarant), lhsDeclarant, rhsDeclarant, (this.declarant!= null), (that.declarant!= null))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsDeclarationFormReference;
            lhsDeclarationFormReference = (((this.declarationFormReference!= null)&&(!this.declarationFormReference.isEmpty()))?this.getDeclarationFormReference():null);
            List<BusinessDocumentReferenceType> rhsDeclarationFormReference;
            rhsDeclarationFormReference = (((that.declarationFormReference!= null)&&(!that.declarationFormReference.isEmpty()))?that.getDeclarationFormReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "declarationFormReference", lhsDeclarationFormReference), LocatorUtils.property(thatLocator, "declarationFormReference", rhsDeclarationFormReference), lhsDeclarationFormReference, rhsDeclarationFormReference, ((this.declarationFormReference!= null)&&(!this.declarationFormReference.isEmpty())), ((that.declarationFormReference!= null)&&(!that.declarationFormReference.isEmpty())))) {
                return false;
            }
        }
        {
            DeliveryType lhsDeliveryType;
            lhsDeliveryType = this.getDeliveryType();
            DeliveryType rhsDeliveryType;
            rhsDeliveryType = that.getDeliveryType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryType", lhsDeliveryType), LocatorUtils.property(thatLocator, "deliveryType", rhsDeliveryType), lhsDeliveryType, rhsDeliveryType, (this.deliveryType!= null), (that.deliveryType!= null))) {
                return false;
            }
        }
        {
            ForeignCurrencyControl lhsForeignCurrencyControl;
            lhsForeignCurrencyControl = this.getForeignCurrencyControl();
            ForeignCurrencyControl rhsForeignCurrencyControl;
            rhsForeignCurrencyControl = that.getForeignCurrencyControl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "foreignCurrencyControl", lhsForeignCurrencyControl), LocatorUtils.property(thatLocator, "foreignCurrencyControl", rhsForeignCurrencyControl), lhsForeignCurrencyControl, rhsForeignCurrencyControl, (this.foreignCurrencyControl!= null), (that.foreignCurrencyControl!= null))) {
                return false;
            }
        }
        {
            String lhsFundTransferFrom;
            lhsFundTransferFrom = this.getFundTransferFrom();
            String rhsFundTransferFrom;
            rhsFundTransferFrom = that.getFundTransferFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fundTransferFrom", lhsFundTransferFrom), LocatorUtils.property(thatLocator, "fundTransferFrom", rhsFundTransferFrom), lhsFundTransferFrom, rhsFundTransferFrom, (this.fundTransferFrom!= null), (that.fundTransferFrom!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsGoodsStoredInFreeTradeZone;
            lhsIsGoodsStoredInFreeTradeZone = this.isIsGoodsStoredInFreeTradeZone();
            Boolean rhsIsGoodsStoredInFreeTradeZone;
            rhsIsGoodsStoredInFreeTradeZone = that.isIsGoodsStoredInFreeTradeZone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isGoodsStoredInFreeTradeZone", lhsIsGoodsStoredInFreeTradeZone), LocatorUtils.property(thatLocator, "isGoodsStoredInFreeTradeZone", rhsIsGoodsStoredInFreeTradeZone), lhsIsGoodsStoredInFreeTradeZone, rhsIsGoodsStoredInFreeTradeZone, (this.isGoodsStoredInFreeTradeZone!= null), (that.isGoodsStoredInFreeTradeZone!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsInformationComplete;
            lhsIsInformationComplete = this.isIsInformationComplete();
            Boolean rhsIsInformationComplete;
            rhsIsInformationComplete = that.isIsInformationComplete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isInformationComplete", lhsIsInformationComplete), LocatorUtils.property(thatLocator, "isInformationComplete", rhsIsInformationComplete), lhsIsInformationComplete, rhsIsInformationComplete, (this.isInformationComplete!= null), (that.isInformationComplete!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsSupplierOfGoods;
            lhsIsSupplierOfGoods = this.isIsSupplierOfGoods();
            Boolean rhsIsSupplierOfGoods;
            rhsIsSupplierOfGoods = that.isIsSupplierOfGoods();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isSupplierOfGoods", lhsIsSupplierOfGoods), LocatorUtils.property(thatLocator, "isSupplierOfGoods", rhsIsSupplierOfGoods), lhsIsSupplierOfGoods, rhsIsSupplierOfGoods, (this.isSupplierOfGoods!= null), (that.isSupplierOfGoods!= null))) {
                return false;
            }
        }
        {
            String lhsMessageType;
            lhsMessageType = this.getMessageType();
            String rhsMessageType;
            rhsMessageType = that.getMessageType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageType", lhsMessageType), LocatorUtils.property(thatLocator, "messageType", rhsMessageType), lhsMessageType, rhsMessageType, (this.messageType!= null), (that.messageType!= null))) {
                return false;
            }
        }
        {
            List<PartnerDescription> lhsPartnerDescription;
            lhsPartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            List<PartnerDescription> rhsPartnerDescription;
            rhsPartnerDescription = (((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty()))?that.getPartnerDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())), ((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsPaymentDescription;
            lhsPaymentDescription = this.getPaymentDescription();
            String rhsPaymentDescription;
            rhsPaymentDescription = that.getPaymentDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentDescription", lhsPaymentDescription), LocatorUtils.property(thatLocator, "paymentDescription", rhsPaymentDescription), lhsPaymentDescription, rhsPaymentDescription, (this.paymentDescription!= null), (that.paymentDescription!= null))) {
                return false;
            }
        }
        {
            String lhsPreDeclarationIdentifier;
            lhsPreDeclarationIdentifier = this.getPreDeclarationIdentifier();
            String rhsPreDeclarationIdentifier;
            rhsPreDeclarationIdentifier = that.getPreDeclarationIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preDeclarationIdentifier", lhsPreDeclarationIdentifier), LocatorUtils.property(thatLocator, "preDeclarationIdentifier", rhsPreDeclarationIdentifier), lhsPreDeclarationIdentifier, rhsPreDeclarationIdentifier, (this.preDeclarationIdentifier!= null), (that.preDeclarationIdentifier!= null))) {
                return false;
            }
        }
        {
            List<String> lhsPurpose;
            lhsPurpose = (((this.purpose!= null)&&(!this.purpose.isEmpty()))?this.getPurpose():null);
            List<String> rhsPurpose;
            rhsPurpose = (((that.purpose!= null)&&(!that.purpose.isEmpty()))?that.getPurpose():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purpose", lhsPurpose), LocatorUtils.property(thatLocator, "purpose", rhsPurpose), lhsPurpose, rhsPurpose, ((this.purpose!= null)&&(!this.purpose.isEmpty())), ((that.purpose!= null)&&(!that.purpose.isEmpty())))) {
                return false;
            }
        }
        {
            List<ShippingDocumentReference> lhsShippingDocumentReference;
            lhsShippingDocumentReference = (((this.shippingDocumentReference!= null)&&(!this.shippingDocumentReference.isEmpty()))?this.getShippingDocumentReference():null);
            List<ShippingDocumentReference> rhsShippingDocumentReference;
            rhsShippingDocumentReference = (((that.shippingDocumentReference!= null)&&(!that.shippingDocumentReference.isEmpty()))?that.getShippingDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingDocumentReference", lhsShippingDocumentReference), LocatorUtils.property(thatLocator, "shippingDocumentReference", rhsShippingDocumentReference), lhsShippingDocumentReference, rhsShippingDocumentReference, ((this.shippingDocumentReference!= null)&&(!this.shippingDocumentReference.isEmpty())), ((that.shippingDocumentReference!= null)&&(!that.shippingDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsTradeType;
            lhsTradeType = this.getTradeType();
            String rhsTradeType;
            rhsTradeType = that.getTradeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tradeType", lhsTradeType), LocatorUtils.property(thatLocator, "tradeType", rhsTradeType), lhsTradeType, rhsTradeType, (this.tradeType!= null), (that.tradeType!= null))) {
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
            AmendmentInformationType theAmendmentInformation;
            theAmendmentInformation = this.getAmendmentInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amendmentInformation", theAmendmentInformation), currentHashCode, theAmendmentInformation, (this.amendmentInformation!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            DateInformationType theDateInformation;
            theDateInformation = this.getDateInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateInformation", theDateInformation), currentHashCode, theDateInformation, (this.dateInformation!= null));
        }
        {
            SpecifiedPartnerDescriptionType theDeclarant;
            theDeclarant = this.getDeclarant();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "declarant", theDeclarant), currentHashCode, theDeclarant, (this.declarant!= null));
        }
        {
            List<BusinessDocumentReferenceType> theDeclarationFormReference;
            theDeclarationFormReference = (((this.declarationFormReference!= null)&&(!this.declarationFormReference.isEmpty()))?this.getDeclarationFormReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "declarationFormReference", theDeclarationFormReference), currentHashCode, theDeclarationFormReference, ((this.declarationFormReference!= null)&&(!this.declarationFormReference.isEmpty())));
        }
        {
            DeliveryType theDeliveryType;
            theDeliveryType = this.getDeliveryType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryType", theDeliveryType), currentHashCode, theDeliveryType, (this.deliveryType!= null));
        }
        {
            ForeignCurrencyControl theForeignCurrencyControl;
            theForeignCurrencyControl = this.getForeignCurrencyControl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "foreignCurrencyControl", theForeignCurrencyControl), currentHashCode, theForeignCurrencyControl, (this.foreignCurrencyControl!= null));
        }
        {
            String theFundTransferFrom;
            theFundTransferFrom = this.getFundTransferFrom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fundTransferFrom", theFundTransferFrom), currentHashCode, theFundTransferFrom, (this.fundTransferFrom!= null));
        }
        {
            Boolean theIsGoodsStoredInFreeTradeZone;
            theIsGoodsStoredInFreeTradeZone = this.isIsGoodsStoredInFreeTradeZone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isGoodsStoredInFreeTradeZone", theIsGoodsStoredInFreeTradeZone), currentHashCode, theIsGoodsStoredInFreeTradeZone, (this.isGoodsStoredInFreeTradeZone!= null));
        }
        {
            Boolean theIsInformationComplete;
            theIsInformationComplete = this.isIsInformationComplete();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isInformationComplete", theIsInformationComplete), currentHashCode, theIsInformationComplete, (this.isInformationComplete!= null));
        }
        {
            Boolean theIsSupplierOfGoods;
            theIsSupplierOfGoods = this.isIsSupplierOfGoods();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isSupplierOfGoods", theIsSupplierOfGoods), currentHashCode, theIsSupplierOfGoods, (this.isSupplierOfGoods!= null));
        }
        {
            String theMessageType;
            theMessageType = this.getMessageType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageType", theMessageType), currentHashCode, theMessageType, (this.messageType!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            String thePaymentDescription;
            thePaymentDescription = this.getPaymentDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentDescription", thePaymentDescription), currentHashCode, thePaymentDescription, (this.paymentDescription!= null));
        }
        {
            String thePreDeclarationIdentifier;
            thePreDeclarationIdentifier = this.getPreDeclarationIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preDeclarationIdentifier", thePreDeclarationIdentifier), currentHashCode, thePreDeclarationIdentifier, (this.preDeclarationIdentifier!= null));
        }
        {
            List<String> thePurpose;
            thePurpose = (((this.purpose!= null)&&(!this.purpose.isEmpty()))?this.getPurpose():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purpose", thePurpose), currentHashCode, thePurpose, ((this.purpose!= null)&&(!this.purpose.isEmpty())));
        }
        {
            List<ShippingDocumentReference> theShippingDocumentReference;
            theShippingDocumentReference = (((this.shippingDocumentReference!= null)&&(!this.shippingDocumentReference.isEmpty()))?this.getShippingDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingDocumentReference", theShippingDocumentReference), currentHashCode, theShippingDocumentReference, ((this.shippingDocumentReference!= null)&&(!this.shippingDocumentReference.isEmpty())));
        }
        {
            String theTradeType;
            theTradeType = this.getTradeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tradeType", theTradeType), currentHashCode, theTradeType, (this.tradeType!= null));
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
            AmendmentInformationType theAmendmentInformation;
            theAmendmentInformation = this.getAmendmentInformation();
            strategy.appendField(locator, this, "amendmentInformation", buffer, theAmendmentInformation, (this.amendmentInformation!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            DateInformationType theDateInformation;
            theDateInformation = this.getDateInformation();
            strategy.appendField(locator, this, "dateInformation", buffer, theDateInformation, (this.dateInformation!= null));
        }
        {
            SpecifiedPartnerDescriptionType theDeclarant;
            theDeclarant = this.getDeclarant();
            strategy.appendField(locator, this, "declarant", buffer, theDeclarant, (this.declarant!= null));
        }
        {
            List<BusinessDocumentReferenceType> theDeclarationFormReference;
            theDeclarationFormReference = (((this.declarationFormReference!= null)&&(!this.declarationFormReference.isEmpty()))?this.getDeclarationFormReference():null);
            strategy.appendField(locator, this, "declarationFormReference", buffer, theDeclarationFormReference, ((this.declarationFormReference!= null)&&(!this.declarationFormReference.isEmpty())));
        }
        {
            DeliveryType theDeliveryType;
            theDeliveryType = this.getDeliveryType();
            strategy.appendField(locator, this, "deliveryType", buffer, theDeliveryType, (this.deliveryType!= null));
        }
        {
            ForeignCurrencyControl theForeignCurrencyControl;
            theForeignCurrencyControl = this.getForeignCurrencyControl();
            strategy.appendField(locator, this, "foreignCurrencyControl", buffer, theForeignCurrencyControl, (this.foreignCurrencyControl!= null));
        }
        {
            String theFundTransferFrom;
            theFundTransferFrom = this.getFundTransferFrom();
            strategy.appendField(locator, this, "fundTransferFrom", buffer, theFundTransferFrom, (this.fundTransferFrom!= null));
        }
        {
            Boolean theIsGoodsStoredInFreeTradeZone;
            theIsGoodsStoredInFreeTradeZone = this.isIsGoodsStoredInFreeTradeZone();
            strategy.appendField(locator, this, "isGoodsStoredInFreeTradeZone", buffer, theIsGoodsStoredInFreeTradeZone, (this.isGoodsStoredInFreeTradeZone!= null));
        }
        {
            Boolean theIsInformationComplete;
            theIsInformationComplete = this.isIsInformationComplete();
            strategy.appendField(locator, this, "isInformationComplete", buffer, theIsInformationComplete, (this.isInformationComplete!= null));
        }
        {
            Boolean theIsSupplierOfGoods;
            theIsSupplierOfGoods = this.isIsSupplierOfGoods();
            strategy.appendField(locator, this, "isSupplierOfGoods", buffer, theIsSupplierOfGoods, (this.isSupplierOfGoods!= null));
        }
        {
            String theMessageType;
            theMessageType = this.getMessageType();
            strategy.appendField(locator, this, "messageType", buffer, theMessageType, (this.messageType!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            String thePaymentDescription;
            thePaymentDescription = this.getPaymentDescription();
            strategy.appendField(locator, this, "paymentDescription", buffer, thePaymentDescription, (this.paymentDescription!= null));
        }
        {
            String thePreDeclarationIdentifier;
            thePreDeclarationIdentifier = this.getPreDeclarationIdentifier();
            strategy.appendField(locator, this, "preDeclarationIdentifier", buffer, thePreDeclarationIdentifier, (this.preDeclarationIdentifier!= null));
        }
        {
            List<String> thePurpose;
            thePurpose = (((this.purpose!= null)&&(!this.purpose.isEmpty()))?this.getPurpose():null);
            strategy.appendField(locator, this, "purpose", buffer, thePurpose, ((this.purpose!= null)&&(!this.purpose.isEmpty())));
        }
        {
            List<ShippingDocumentReference> theShippingDocumentReference;
            theShippingDocumentReference = (((this.shippingDocumentReference!= null)&&(!this.shippingDocumentReference.isEmpty()))?this.getShippingDocumentReference():null);
            strategy.appendField(locator, this, "shippingDocumentReference", buffer, theShippingDocumentReference, ((this.shippingDocumentReference!= null)&&(!this.shippingDocumentReference.isEmpty())));
        }
        {
            String theTradeType;
            theTradeType = this.getTradeType();
            strategy.appendField(locator, this, "tradeType", buffer, theTradeType, (this.tradeType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
