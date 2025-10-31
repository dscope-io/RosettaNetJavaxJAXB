
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_06;

import java.math.BigInteger;
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
import io.dscope.rosettanet.domain.logistics.codelist.incoterms.v01_03.Incoterms;
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.CustomsInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.DateInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.FreeOnBoardTerms;
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.FreightValuation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.Instructions;
import io.dscope.rosettanet.domain.logistics.logistics.v02_20.PhysicalDimensionType;
import io.dscope.rosettanet.domain.procurement.codelist.paymentterms.v01_03.PaymentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_22.TaxExemptStatus;
import io.dscope.rosettanet.domain.shared.codelist.packagetype.v01_01.PackageType;
import io.dscope.rosettanet.universal.partneridentification.v01_15.PartnerDescription;
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
 * <p>Java class for ShipmentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContainerTotalCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}CustomsInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}DateInformation" minOccurs="0"/&gt;
 *         &lt;element name="DeclarationInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.06}DeclarationInformationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}FreeOnBoardTerms" minOccurs="0"/&gt;
 *         &lt;element name="FreightTotalPhysicalDimension" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}PhysicalDimensionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}FreightValuation" minOccurs="0"/&gt;
 *         &lt;element name="HandbookIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03}Incoterms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20}Instructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsInsuranceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsIntraCompanyTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01}PackageType" minOccurs="0"/&gt;
 *         &lt;element name="PackageTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.15}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PaymentTerms:xsd:codelist:01.03}PaymentTerms" minOccurs="0"/&gt;
 *         &lt;element name="PricingPaymentInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.06}PricingPaymentInformationType" minOccurs="0"/&gt;
 *         &lt;element name="RoutingInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.06}RoutingInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SaleTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentReturnInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.06}ShipmentReturnInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.22}TaxExemptStatus" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentInformationType", propOrder = {
    "containerTotalCount",
    "customsInformation",
    "dateInformation",
    "declarationInformation",
    "freeOnBoardTerms",
    "freightTotalPhysicalDimension",
    "freightValuation",
    "handbookIdentifier",
    "incoterms",
    "instructions",
    "isInsuranceRequired",
    "isIntraCompanyTransfer",
    "packageType",
    "packageTypeDescription",
    "partnerDescription",
    "paymentTerms",
    "pricingPaymentInformation",
    "routingInformation",
    "saleTerms",
    "shipmentReturnInformation",
    "taxExemptStatus"
})
public class ShipmentInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ContainerTotalCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger containerTotalCount;
    @XmlElementRef(name = "CustomsInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", type = CustomsInformation.class, required = false)
    protected CustomsInformation customsInformation;
    @XmlElementRef(name = "DateInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", type = DateInformation.class, required = false)
    protected DateInformation dateInformation;
    @XmlElement(name = "DeclarationInformation", required = true)
    protected DeclarationInformationType declarationInformation;
    @XmlElementRef(name = "FreeOnBoardTerms", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", type = FreeOnBoardTerms.class, required = false)
    protected FreeOnBoardTerms freeOnBoardTerms;
    @XmlElement(name = "FreightTotalPhysicalDimension")
    protected PhysicalDimensionType freightTotalPhysicalDimension;
    @XmlElementRef(name = "FreightValuation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", type = FreightValuation.class, required = false)
    protected FreightValuation freightValuation;
    @XmlElement(name = "HandbookIdentifier")
    protected String handbookIdentifier;
    @XmlElementRef(name = "Incoterms", namespace = "urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03", type = Incoterms.class, required = false)
    protected Incoterms incoterms;
    @XmlElementRef(name = "Instructions", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", type = Instructions.class, required = false)
    protected List<Instructions> instructions;
    @XmlElement(name = "IsInsuranceRequired")
    protected boolean isInsuranceRequired;
    @XmlElement(name = "IsIntraCompanyTransfer")
    protected boolean isIntraCompanyTransfer;
    @XmlElementRef(name = "PackageType", namespace = "urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01", type = PackageType.class, required = false)
    protected PackageType packageType;
    @XmlElement(name = "PackageTypeDescription")
    protected String packageTypeDescription;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.15", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "PaymentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:PaymentTerms:xsd:codelist:01.03", type = PaymentTerms.class, required = false)
    protected PaymentTerms paymentTerms;
    @XmlElement(name = "PricingPaymentInformation")
    protected PricingPaymentInformationType pricingPaymentInformation;
    @XmlElement(name = "RoutingInformation", required = true)
    protected List<RoutingInformationType> routingInformation;
    @XmlElement(name = "SaleTerms")
    protected String saleTerms;
    @XmlElement(name = "ShipmentReturnInformation")
    protected ShipmentReturnInformationType shipmentReturnInformation;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.22", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the containerTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContainerTotalCount() {
        return containerTotalCount;
    }

    /**
     * Sets the value of the containerTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContainerTotalCount(BigInteger value) {
        this.containerTotalCount = value;
    }

    /**
     * Gets the value of the customsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsInformation }
     *     
     */
    public CustomsInformation getCustomsInformation() {
        return customsInformation;
    }

    /**
     * Sets the value of the customsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsInformation }
     *     
     */
    public void setCustomsInformation(CustomsInformation value) {
        this.customsInformation = value;
    }

    /**
     * Gets the value of the dateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DateInformation }
     *     
     */
    public DateInformation getDateInformation() {
        return dateInformation;
    }

    /**
     * Sets the value of the dateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInformation }
     *     
     */
    public void setDateInformation(DateInformation value) {
        this.dateInformation = value;
    }

    /**
     * Gets the value of the declarationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationInformationType }
     *     
     */
    public DeclarationInformationType getDeclarationInformation() {
        return declarationInformation;
    }

    /**
     * Sets the value of the declarationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationInformationType }
     *     
     */
    public void setDeclarationInformation(DeclarationInformationType value) {
        this.declarationInformation = value;
    }

    /**
     * Gets the value of the freeOnBoardTerms property.
     * 
     * @return
     *     possible object is
     *     {@link FreeOnBoardTerms }
     *     
     */
    public FreeOnBoardTerms getFreeOnBoardTerms() {
        return freeOnBoardTerms;
    }

    /**
     * Sets the value of the freeOnBoardTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeOnBoardTerms }
     *     
     */
    public void setFreeOnBoardTerms(FreeOnBoardTerms value) {
        this.freeOnBoardTerms = value;
    }

    /**
     * Gets the value of the freightTotalPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDimensionType }
     *     
     */
    public PhysicalDimensionType getFreightTotalPhysicalDimension() {
        return freightTotalPhysicalDimension;
    }

    /**
     * Sets the value of the freightTotalPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDimensionType }
     *     
     */
    public void setFreightTotalPhysicalDimension(PhysicalDimensionType value) {
        this.freightTotalPhysicalDimension = value;
    }

    /**
     * Gets the value of the freightValuation property.
     * 
     * @return
     *     possible object is
     *     {@link FreightValuation }
     *     
     */
    public FreightValuation getFreightValuation() {
        return freightValuation;
    }

    /**
     * Sets the value of the freightValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightValuation }
     *     
     */
    public void setFreightValuation(FreightValuation value) {
        this.freightValuation = value;
    }

    /**
     * Gets the value of the handbookIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandbookIdentifier() {
        return handbookIdentifier;
    }

    /**
     * Sets the value of the handbookIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandbookIdentifier(String value) {
        this.handbookIdentifier = value;
    }

    /**
     * Gets the value of the incoterms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms }
     *     
     */
    public Incoterms getIncoterms() {
        return incoterms;
    }

    /**
     * Sets the value of the incoterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms }
     *     
     */
    public void setIncoterms(Incoterms value) {
        this.incoterms = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instructions }
     * 
     * 
     */
    public List<Instructions> getInstructions() {
        if (instructions == null) {
            instructions = new ArrayList<Instructions>();
        }
        return this.instructions;
    }

    /**
     * Gets the value of the isInsuranceRequired property.
     * 
     */
    public boolean isIsInsuranceRequired() {
        return isInsuranceRequired;
    }

    /**
     * Sets the value of the isInsuranceRequired property.
     * 
     */
    public void setIsInsuranceRequired(boolean value) {
        this.isInsuranceRequired = value;
    }

    /**
     * Gets the value of the isIntraCompanyTransfer property.
     * 
     */
    public boolean isIsIntraCompanyTransfer() {
        return isIntraCompanyTransfer;
    }

    /**
     * Sets the value of the isIntraCompanyTransfer property.
     * 
     */
    public void setIsIntraCompanyTransfer(boolean value) {
        this.isIntraCompanyTransfer = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackageType(PackageType value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the packageTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTypeDescription() {
        return packageTypeDescription;
    }

    /**
     * Sets the value of the packageTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTypeDescription(String value) {
        this.packageTypeDescription = value;
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
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTerms }
     *     
     */
    public PaymentTerms getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTerms }
     *     
     */
    public void setPaymentTerms(PaymentTerms value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the pricingPaymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PricingPaymentInformationType }
     *     
     */
    public PricingPaymentInformationType getPricingPaymentInformation() {
        return pricingPaymentInformation;
    }

    /**
     * Sets the value of the pricingPaymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingPaymentInformationType }
     *     
     */
    public void setPricingPaymentInformation(PricingPaymentInformationType value) {
        this.pricingPaymentInformation = value;
    }

    /**
     * Gets the value of the routingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingInformationType }
     * 
     * 
     */
    public List<RoutingInformationType> getRoutingInformation() {
        if (routingInformation == null) {
            routingInformation = new ArrayList<RoutingInformationType>();
        }
        return this.routingInformation;
    }

    /**
     * Gets the value of the saleTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleTerms() {
        return saleTerms;
    }

    /**
     * Sets the value of the saleTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleTerms(String value) {
        this.saleTerms = value;
    }

    /**
     * Gets the value of the shipmentReturnInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentReturnInformationType }
     *     
     */
    public ShipmentReturnInformationType getShipmentReturnInformation() {
        return shipmentReturnInformation;
    }

    /**
     * Sets the value of the shipmentReturnInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentReturnInformationType }
     *     
     */
    public void setShipmentReturnInformation(ShipmentReturnInformationType value) {
        this.shipmentReturnInformation = value;
    }

    /**
     * Gets the value of the taxExemptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptStatus }
     *     
     */
    public TaxExemptStatus getTaxExemptStatus() {
        return taxExemptStatus;
    }

    /**
     * Sets the value of the taxExemptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptStatus }
     *     
     */
    public void setTaxExemptStatus(TaxExemptStatus value) {
        this.taxExemptStatus = value;
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
        final ShipmentInformationType that = ((ShipmentInformationType) object);
        {
            BigInteger lhsContainerTotalCount;
            lhsContainerTotalCount = this.getContainerTotalCount();
            BigInteger rhsContainerTotalCount;
            rhsContainerTotalCount = that.getContainerTotalCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containerTotalCount", lhsContainerTotalCount), LocatorUtils.property(thatLocator, "containerTotalCount", rhsContainerTotalCount), lhsContainerTotalCount, rhsContainerTotalCount, (this.containerTotalCount!= null), (that.containerTotalCount!= null))) {
                return false;
            }
        }
        {
            CustomsInformation lhsCustomsInformation;
            lhsCustomsInformation = this.getCustomsInformation();
            CustomsInformation rhsCustomsInformation;
            rhsCustomsInformation = that.getCustomsInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customsInformation", lhsCustomsInformation), LocatorUtils.property(thatLocator, "customsInformation", rhsCustomsInformation), lhsCustomsInformation, rhsCustomsInformation, (this.customsInformation!= null), (that.customsInformation!= null))) {
                return false;
            }
        }
        {
            DateInformation lhsDateInformation;
            lhsDateInformation = this.getDateInformation();
            DateInformation rhsDateInformation;
            rhsDateInformation = that.getDateInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateInformation", lhsDateInformation), LocatorUtils.property(thatLocator, "dateInformation", rhsDateInformation), lhsDateInformation, rhsDateInformation, (this.dateInformation!= null), (that.dateInformation!= null))) {
                return false;
            }
        }
        {
            DeclarationInformationType lhsDeclarationInformation;
            lhsDeclarationInformation = this.getDeclarationInformation();
            DeclarationInformationType rhsDeclarationInformation;
            rhsDeclarationInformation = that.getDeclarationInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "declarationInformation", lhsDeclarationInformation), LocatorUtils.property(thatLocator, "declarationInformation", rhsDeclarationInformation), lhsDeclarationInformation, rhsDeclarationInformation, (this.declarationInformation!= null), (that.declarationInformation!= null))) {
                return false;
            }
        }
        {
            FreeOnBoardTerms lhsFreeOnBoardTerms;
            lhsFreeOnBoardTerms = this.getFreeOnBoardTerms();
            FreeOnBoardTerms rhsFreeOnBoardTerms;
            rhsFreeOnBoardTerms = that.getFreeOnBoardTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeOnBoardTerms", lhsFreeOnBoardTerms), LocatorUtils.property(thatLocator, "freeOnBoardTerms", rhsFreeOnBoardTerms), lhsFreeOnBoardTerms, rhsFreeOnBoardTerms, (this.freeOnBoardTerms!= null), (that.freeOnBoardTerms!= null))) {
                return false;
            }
        }
        {
            PhysicalDimensionType lhsFreightTotalPhysicalDimension;
            lhsFreightTotalPhysicalDimension = this.getFreightTotalPhysicalDimension();
            PhysicalDimensionType rhsFreightTotalPhysicalDimension;
            rhsFreightTotalPhysicalDimension = that.getFreightTotalPhysicalDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightTotalPhysicalDimension", lhsFreightTotalPhysicalDimension), LocatorUtils.property(thatLocator, "freightTotalPhysicalDimension", rhsFreightTotalPhysicalDimension), lhsFreightTotalPhysicalDimension, rhsFreightTotalPhysicalDimension, (this.freightTotalPhysicalDimension!= null), (that.freightTotalPhysicalDimension!= null))) {
                return false;
            }
        }
        {
            FreightValuation lhsFreightValuation;
            lhsFreightValuation = this.getFreightValuation();
            FreightValuation rhsFreightValuation;
            rhsFreightValuation = that.getFreightValuation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightValuation", lhsFreightValuation), LocatorUtils.property(thatLocator, "freightValuation", rhsFreightValuation), lhsFreightValuation, rhsFreightValuation, (this.freightValuation!= null), (that.freightValuation!= null))) {
                return false;
            }
        }
        {
            String lhsHandbookIdentifier;
            lhsHandbookIdentifier = this.getHandbookIdentifier();
            String rhsHandbookIdentifier;
            rhsHandbookIdentifier = that.getHandbookIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handbookIdentifier", lhsHandbookIdentifier), LocatorUtils.property(thatLocator, "handbookIdentifier", rhsHandbookIdentifier), lhsHandbookIdentifier, rhsHandbookIdentifier, (this.handbookIdentifier!= null), (that.handbookIdentifier!= null))) {
                return false;
            }
        }
        {
            Incoterms lhsIncoterms;
            lhsIncoterms = this.getIncoterms();
            Incoterms rhsIncoterms;
            rhsIncoterms = that.getIncoterms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "incoterms", lhsIncoterms), LocatorUtils.property(thatLocator, "incoterms", rhsIncoterms), lhsIncoterms, rhsIncoterms, (this.incoterms!= null), (that.incoterms!= null))) {
                return false;
            }
        }
        {
            List<Instructions> lhsInstructions;
            lhsInstructions = (((this.instructions!= null)&&(!this.instructions.isEmpty()))?this.getInstructions():null);
            List<Instructions> rhsInstructions;
            rhsInstructions = (((that.instructions!= null)&&(!that.instructions.isEmpty()))?that.getInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instructions", lhsInstructions), LocatorUtils.property(thatLocator, "instructions", rhsInstructions), lhsInstructions, rhsInstructions, ((this.instructions!= null)&&(!this.instructions.isEmpty())), ((that.instructions!= null)&&(!that.instructions.isEmpty())))) {
                return false;
            }
        }
        {
            boolean lhsIsInsuranceRequired;
            lhsIsInsuranceRequired = this.isIsInsuranceRequired();
            boolean rhsIsInsuranceRequired;
            rhsIsInsuranceRequired = that.isIsInsuranceRequired();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isInsuranceRequired", lhsIsInsuranceRequired), LocatorUtils.property(thatLocator, "isInsuranceRequired", rhsIsInsuranceRequired), lhsIsInsuranceRequired, rhsIsInsuranceRequired, true, true)) {
                return false;
            }
        }
        {
            boolean lhsIsIntraCompanyTransfer;
            lhsIsIntraCompanyTransfer = this.isIsIntraCompanyTransfer();
            boolean rhsIsIntraCompanyTransfer;
            rhsIsIntraCompanyTransfer = that.isIsIntraCompanyTransfer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isIntraCompanyTransfer", lhsIsIntraCompanyTransfer), LocatorUtils.property(thatLocator, "isIntraCompanyTransfer", rhsIsIntraCompanyTransfer), lhsIsIntraCompanyTransfer, rhsIsIntraCompanyTransfer, true, true)) {
                return false;
            }
        }
        {
            PackageType lhsPackageType;
            lhsPackageType = this.getPackageType();
            PackageType rhsPackageType;
            rhsPackageType = that.getPackageType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageType", lhsPackageType), LocatorUtils.property(thatLocator, "packageType", rhsPackageType), lhsPackageType, rhsPackageType, (this.packageType!= null), (that.packageType!= null))) {
                return false;
            }
        }
        {
            String lhsPackageTypeDescription;
            lhsPackageTypeDescription = this.getPackageTypeDescription();
            String rhsPackageTypeDescription;
            rhsPackageTypeDescription = that.getPackageTypeDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageTypeDescription", lhsPackageTypeDescription), LocatorUtils.property(thatLocator, "packageTypeDescription", rhsPackageTypeDescription), lhsPackageTypeDescription, rhsPackageTypeDescription, (this.packageTypeDescription!= null), (that.packageTypeDescription!= null))) {
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
            PaymentTerms lhsPaymentTerms;
            lhsPaymentTerms = this.getPaymentTerms();
            PaymentTerms rhsPaymentTerms;
            rhsPaymentTerms = that.getPaymentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentTerms", lhsPaymentTerms), LocatorUtils.property(thatLocator, "paymentTerms", rhsPaymentTerms), lhsPaymentTerms, rhsPaymentTerms, (this.paymentTerms!= null), (that.paymentTerms!= null))) {
                return false;
            }
        }
        {
            PricingPaymentInformationType lhsPricingPaymentInformation;
            lhsPricingPaymentInformation = this.getPricingPaymentInformation();
            PricingPaymentInformationType rhsPricingPaymentInformation;
            rhsPricingPaymentInformation = that.getPricingPaymentInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pricingPaymentInformation", lhsPricingPaymentInformation), LocatorUtils.property(thatLocator, "pricingPaymentInformation", rhsPricingPaymentInformation), lhsPricingPaymentInformation, rhsPricingPaymentInformation, (this.pricingPaymentInformation!= null), (that.pricingPaymentInformation!= null))) {
                return false;
            }
        }
        {
            List<RoutingInformationType> lhsRoutingInformation;
            lhsRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            List<RoutingInformationType> rhsRoutingInformation;
            rhsRoutingInformation = (((that.routingInformation!= null)&&(!that.routingInformation.isEmpty()))?that.getRoutingInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "routingInformation", lhsRoutingInformation), LocatorUtils.property(thatLocator, "routingInformation", rhsRoutingInformation), lhsRoutingInformation, rhsRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())), ((that.routingInformation!= null)&&(!that.routingInformation.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsSaleTerms;
            lhsSaleTerms = this.getSaleTerms();
            String rhsSaleTerms;
            rhsSaleTerms = that.getSaleTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "saleTerms", lhsSaleTerms), LocatorUtils.property(thatLocator, "saleTerms", rhsSaleTerms), lhsSaleTerms, rhsSaleTerms, (this.saleTerms!= null), (that.saleTerms!= null))) {
                return false;
            }
        }
        {
            ShipmentReturnInformationType lhsShipmentReturnInformation;
            lhsShipmentReturnInformation = this.getShipmentReturnInformation();
            ShipmentReturnInformationType rhsShipmentReturnInformation;
            rhsShipmentReturnInformation = that.getShipmentReturnInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentReturnInformation", lhsShipmentReturnInformation), LocatorUtils.property(thatLocator, "shipmentReturnInformation", rhsShipmentReturnInformation), lhsShipmentReturnInformation, rhsShipmentReturnInformation, (this.shipmentReturnInformation!= null), (that.shipmentReturnInformation!= null))) {
                return false;
            }
        }
        {
            TaxExemptStatus lhsTaxExemptStatus;
            lhsTaxExemptStatus = this.getTaxExemptStatus();
            TaxExemptStatus rhsTaxExemptStatus;
            rhsTaxExemptStatus = that.getTaxExemptStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxExemptStatus", lhsTaxExemptStatus), LocatorUtils.property(thatLocator, "taxExemptStatus", rhsTaxExemptStatus), lhsTaxExemptStatus, rhsTaxExemptStatus, (this.taxExemptStatus!= null), (that.taxExemptStatus!= null))) {
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
            BigInteger theContainerTotalCount;
            theContainerTotalCount = this.getContainerTotalCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerTotalCount", theContainerTotalCount), currentHashCode, theContainerTotalCount, (this.containerTotalCount!= null));
        }
        {
            CustomsInformation theCustomsInformation;
            theCustomsInformation = this.getCustomsInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customsInformation", theCustomsInformation), currentHashCode, theCustomsInformation, (this.customsInformation!= null));
        }
        {
            DateInformation theDateInformation;
            theDateInformation = this.getDateInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateInformation", theDateInformation), currentHashCode, theDateInformation, (this.dateInformation!= null));
        }
        {
            DeclarationInformationType theDeclarationInformation;
            theDeclarationInformation = this.getDeclarationInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "declarationInformation", theDeclarationInformation), currentHashCode, theDeclarationInformation, (this.declarationInformation!= null));
        }
        {
            FreeOnBoardTerms theFreeOnBoardTerms;
            theFreeOnBoardTerms = this.getFreeOnBoardTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freeOnBoardTerms", theFreeOnBoardTerms), currentHashCode, theFreeOnBoardTerms, (this.freeOnBoardTerms!= null));
        }
        {
            PhysicalDimensionType theFreightTotalPhysicalDimension;
            theFreightTotalPhysicalDimension = this.getFreightTotalPhysicalDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightTotalPhysicalDimension", theFreightTotalPhysicalDimension), currentHashCode, theFreightTotalPhysicalDimension, (this.freightTotalPhysicalDimension!= null));
        }
        {
            FreightValuation theFreightValuation;
            theFreightValuation = this.getFreightValuation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightValuation", theFreightValuation), currentHashCode, theFreightValuation, (this.freightValuation!= null));
        }
        {
            String theHandbookIdentifier;
            theHandbookIdentifier = this.getHandbookIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handbookIdentifier", theHandbookIdentifier), currentHashCode, theHandbookIdentifier, (this.handbookIdentifier!= null));
        }
        {
            Incoterms theIncoterms;
            theIncoterms = this.getIncoterms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "incoterms", theIncoterms), currentHashCode, theIncoterms, (this.incoterms!= null));
        }
        {
            List<Instructions> theInstructions;
            theInstructions = (((this.instructions!= null)&&(!this.instructions.isEmpty()))?this.getInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instructions", theInstructions), currentHashCode, theInstructions, ((this.instructions!= null)&&(!this.instructions.isEmpty())));
        }
        {
            boolean theIsInsuranceRequired;
            theIsInsuranceRequired = this.isIsInsuranceRequired();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isInsuranceRequired", theIsInsuranceRequired), currentHashCode, theIsInsuranceRequired, true);
        }
        {
            boolean theIsIntraCompanyTransfer;
            theIsIntraCompanyTransfer = this.isIsIntraCompanyTransfer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isIntraCompanyTransfer", theIsIntraCompanyTransfer), currentHashCode, theIsIntraCompanyTransfer, true);
        }
        {
            PackageType thePackageType;
            thePackageType = this.getPackageType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageType", thePackageType), currentHashCode, thePackageType, (this.packageType!= null));
        }
        {
            String thePackageTypeDescription;
            thePackageTypeDescription = this.getPackageTypeDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageTypeDescription", thePackageTypeDescription), currentHashCode, thePackageTypeDescription, (this.packageTypeDescription!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            PaymentTerms thePaymentTerms;
            thePaymentTerms = this.getPaymentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentTerms", thePaymentTerms), currentHashCode, thePaymentTerms, (this.paymentTerms!= null));
        }
        {
            PricingPaymentInformationType thePricingPaymentInformation;
            thePricingPaymentInformation = this.getPricingPaymentInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pricingPaymentInformation", thePricingPaymentInformation), currentHashCode, thePricingPaymentInformation, (this.pricingPaymentInformation!= null));
        }
        {
            List<RoutingInformationType> theRoutingInformation;
            theRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "routingInformation", theRoutingInformation), currentHashCode, theRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())));
        }
        {
            String theSaleTerms;
            theSaleTerms = this.getSaleTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "saleTerms", theSaleTerms), currentHashCode, theSaleTerms, (this.saleTerms!= null));
        }
        {
            ShipmentReturnInformationType theShipmentReturnInformation;
            theShipmentReturnInformation = this.getShipmentReturnInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentReturnInformation", theShipmentReturnInformation), currentHashCode, theShipmentReturnInformation, (this.shipmentReturnInformation!= null));
        }
        {
            TaxExemptStatus theTaxExemptStatus;
            theTaxExemptStatus = this.getTaxExemptStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxExemptStatus", theTaxExemptStatus), currentHashCode, theTaxExemptStatus, (this.taxExemptStatus!= null));
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
            BigInteger theContainerTotalCount;
            theContainerTotalCount = this.getContainerTotalCount();
            strategy.appendField(locator, this, "containerTotalCount", buffer, theContainerTotalCount, (this.containerTotalCount!= null));
        }
        {
            CustomsInformation theCustomsInformation;
            theCustomsInformation = this.getCustomsInformation();
            strategy.appendField(locator, this, "customsInformation", buffer, theCustomsInformation, (this.customsInformation!= null));
        }
        {
            DateInformation theDateInformation;
            theDateInformation = this.getDateInformation();
            strategy.appendField(locator, this, "dateInformation", buffer, theDateInformation, (this.dateInformation!= null));
        }
        {
            DeclarationInformationType theDeclarationInformation;
            theDeclarationInformation = this.getDeclarationInformation();
            strategy.appendField(locator, this, "declarationInformation", buffer, theDeclarationInformation, (this.declarationInformation!= null));
        }
        {
            FreeOnBoardTerms theFreeOnBoardTerms;
            theFreeOnBoardTerms = this.getFreeOnBoardTerms();
            strategy.appendField(locator, this, "freeOnBoardTerms", buffer, theFreeOnBoardTerms, (this.freeOnBoardTerms!= null));
        }
        {
            PhysicalDimensionType theFreightTotalPhysicalDimension;
            theFreightTotalPhysicalDimension = this.getFreightTotalPhysicalDimension();
            strategy.appendField(locator, this, "freightTotalPhysicalDimension", buffer, theFreightTotalPhysicalDimension, (this.freightTotalPhysicalDimension!= null));
        }
        {
            FreightValuation theFreightValuation;
            theFreightValuation = this.getFreightValuation();
            strategy.appendField(locator, this, "freightValuation", buffer, theFreightValuation, (this.freightValuation!= null));
        }
        {
            String theHandbookIdentifier;
            theHandbookIdentifier = this.getHandbookIdentifier();
            strategy.appendField(locator, this, "handbookIdentifier", buffer, theHandbookIdentifier, (this.handbookIdentifier!= null));
        }
        {
            Incoterms theIncoterms;
            theIncoterms = this.getIncoterms();
            strategy.appendField(locator, this, "incoterms", buffer, theIncoterms, (this.incoterms!= null));
        }
        {
            List<Instructions> theInstructions;
            theInstructions = (((this.instructions!= null)&&(!this.instructions.isEmpty()))?this.getInstructions():null);
            strategy.appendField(locator, this, "instructions", buffer, theInstructions, ((this.instructions!= null)&&(!this.instructions.isEmpty())));
        }
        {
            boolean theIsInsuranceRequired;
            theIsInsuranceRequired = this.isIsInsuranceRequired();
            strategy.appendField(locator, this, "isInsuranceRequired", buffer, theIsInsuranceRequired, true);
        }
        {
            boolean theIsIntraCompanyTransfer;
            theIsIntraCompanyTransfer = this.isIsIntraCompanyTransfer();
            strategy.appendField(locator, this, "isIntraCompanyTransfer", buffer, theIsIntraCompanyTransfer, true);
        }
        {
            PackageType thePackageType;
            thePackageType = this.getPackageType();
            strategy.appendField(locator, this, "packageType", buffer, thePackageType, (this.packageType!= null));
        }
        {
            String thePackageTypeDescription;
            thePackageTypeDescription = this.getPackageTypeDescription();
            strategy.appendField(locator, this, "packageTypeDescription", buffer, thePackageTypeDescription, (this.packageTypeDescription!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            PaymentTerms thePaymentTerms;
            thePaymentTerms = this.getPaymentTerms();
            strategy.appendField(locator, this, "paymentTerms", buffer, thePaymentTerms, (this.paymentTerms!= null));
        }
        {
            PricingPaymentInformationType thePricingPaymentInformation;
            thePricingPaymentInformation = this.getPricingPaymentInformation();
            strategy.appendField(locator, this, "pricingPaymentInformation", buffer, thePricingPaymentInformation, (this.pricingPaymentInformation!= null));
        }
        {
            List<RoutingInformationType> theRoutingInformation;
            theRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            strategy.appendField(locator, this, "routingInformation", buffer, theRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())));
        }
        {
            String theSaleTerms;
            theSaleTerms = this.getSaleTerms();
            strategy.appendField(locator, this, "saleTerms", buffer, theSaleTerms, (this.saleTerms!= null));
        }
        {
            ShipmentReturnInformationType theShipmentReturnInformation;
            theShipmentReturnInformation = this.getShipmentReturnInformation();
            strategy.appendField(locator, this, "shipmentReturnInformation", buffer, theShipmentReturnInformation, (this.shipmentReturnInformation!= null));
        }
        {
            TaxExemptStatus theTaxExemptStatus;
            theTaxExemptStatus = this.getTaxExemptStatus();
            strategy.appendField(locator, this, "taxExemptStatus", buffer, theTaxExemptStatus, (this.taxExemptStatus!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
