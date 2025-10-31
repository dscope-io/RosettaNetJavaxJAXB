
package io.dscope.rosettanet.interchange.shippingorderrequest.v02_01;

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
import io.dscope.rosettanet.domain.logistics.codelist.shipmenttype.v01_01.ShipmentType;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.ExportDeclarationType;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.ExportLicense;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.FreeOnBoardTerms;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.IsPartialShipment;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.PhysicalDimension;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.ShipmentInstructions;
import io.dscope.rosettanet.domain.procurement.procurement.v02_08.CurrencyConversion;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReferenceType;
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
 * <p>Java class for ShipmentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsolidationNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ContainerTotalCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.08}CurrencyConversion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateInformation" type="{urn:rosettanet:specification:interchange:ShippingOrderRequest:xsd:schema:02.01}DateInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}ExportLicense" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}FreeOnBoardTerms" minOccurs="0"/&gt;
 *         &lt;element name="FreightReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ImportBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03}Incoterms" minOccurs="0"/&gt;
 *         &lt;element name="IsDutyPaidByShipper" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsInvoiceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}IsPartialShipment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}PhysicalDimension" minOccurs="0"/&gt;
 *         &lt;element name="RoutingInformation" type="{urn:rosettanet:specification:interchange:ShippingOrderRequest:xsd:schema:02.01}RoutingInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SED" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}ExportDeclarationType" minOccurs="0"/&gt;
 *         &lt;element name="ShipFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}ShipmentInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentServiceAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipmentType:xsd:codelist:01.01}ShipmentType" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
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
    "consolidationNumber",
    "containerTotalCount",
    "currencyConversion",
    "customValue",
    "dateInformation",
    "exportLicense",
    "freeOnBoardTerms",
    "freightReference",
    "importBy",
    "incoterms",
    "isDutyPaidByShipper",
    "isInvoiceRequired",
    "isPartialShipment",
    "physicalDimension",
    "routingInformation",
    "sed",
    "shipFrom",
    "shipmentInstructions",
    "shipmentServiceAccountNumber",
    "shipmentType",
    "shipTo"
})
public class ShipmentInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ConsolidationNumber")
    protected BusinessDocumentReferenceType consolidationNumber;
    @XmlElement(name = "ContainerTotalCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger containerTotalCount;
    @XmlElementRef(name = "CurrencyConversion", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.08", type = CurrencyConversion.class, required = false)
    protected List<CurrencyConversion> currencyConversion;
    @XmlElement(name = "CustomValue")
    protected String customValue;
    @XmlElement(name = "DateInformation")
    protected DateInformationType dateInformation;
    @XmlElementRef(name = "ExportLicense", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = ExportLicense.class, required = false)
    protected ExportLicense exportLicense;
    @XmlElementRef(name = "FreeOnBoardTerms", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = FreeOnBoardTerms.class, required = false)
    protected FreeOnBoardTerms freeOnBoardTerms;
    @XmlElement(name = "FreightReference")
    protected BusinessDocumentReferenceType freightReference;
    @XmlElement(name = "ImportBy")
    protected SpecifiedPartnerDescriptionType importBy;
    @XmlElementRef(name = "Incoterms", namespace = "urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03", type = Incoterms.class, required = false)
    protected Incoterms incoterms;
    @XmlElement(name = "IsDutyPaidByShipper")
    protected boolean isDutyPaidByShipper;
    @XmlElement(name = "IsInvoiceRequired")
    protected boolean isInvoiceRequired;
    @XmlElementRef(name = "IsPartialShipment", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = IsPartialShipment.class, required = false)
    protected IsPartialShipment isPartialShipment;
    @XmlElementRef(name = "PhysicalDimension", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = PhysicalDimension.class, required = false)
    protected PhysicalDimension physicalDimension;
    @XmlElement(name = "RoutingInformation", required = true)
    protected List<RoutingInformationType> routingInformation;
    @XmlElement(name = "SED")
    protected ExportDeclarationType sed;
    @XmlElement(name = "ShipFrom")
    protected SpecifiedPartnerDescriptionType shipFrom;
    @XmlElementRef(name = "ShipmentInstructions", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = ShipmentInstructions.class, required = false)
    protected List<ShipmentInstructions> shipmentInstructions;
    @XmlElement(name = "ShipmentServiceAccountNumber")
    protected String shipmentServiceAccountNumber;
    @XmlElementRef(name = "ShipmentType", namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentType:xsd:codelist:01.01", type = ShipmentType.class, required = false)
    protected ShipmentType shipmentType;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the consolidationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getConsolidationNumber() {
        return consolidationNumber;
    }

    /**
     * Sets the value of the consolidationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setConsolidationNumber(BusinessDocumentReferenceType value) {
        this.consolidationNumber = value;
    }

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
     * Gets the value of the currencyConversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyConversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyConversion }
     * 
     * 
     */
    public List<CurrencyConversion> getCurrencyConversion() {
        if (currencyConversion == null) {
            currencyConversion = new ArrayList<CurrencyConversion>();
        }
        return this.currencyConversion;
    }

    /**
     * Gets the value of the customValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomValue() {
        return customValue;
    }

    /**
     * Sets the value of the customValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomValue(String value) {
        this.customValue = value;
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
     * Gets the value of the exportLicense property.
     * 
     * @return
     *     possible object is
     *     {@link ExportLicense }
     *     
     */
    public ExportLicense getExportLicense() {
        return exportLicense;
    }

    /**
     * Sets the value of the exportLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportLicense }
     *     
     */
    public void setExportLicense(ExportLicense value) {
        this.exportLicense = value;
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
     * Gets the value of the freightReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getFreightReference() {
        return freightReference;
    }

    /**
     * Sets the value of the freightReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setFreightReference(BusinessDocumentReferenceType value) {
        this.freightReference = value;
    }

    /**
     * Gets the value of the importBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getImportBy() {
        return importBy;
    }

    /**
     * Sets the value of the importBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setImportBy(SpecifiedPartnerDescriptionType value) {
        this.importBy = value;
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
     * Gets the value of the isDutyPaidByShipper property.
     * 
     */
    public boolean isIsDutyPaidByShipper() {
        return isDutyPaidByShipper;
    }

    /**
     * Sets the value of the isDutyPaidByShipper property.
     * 
     */
    public void setIsDutyPaidByShipper(boolean value) {
        this.isDutyPaidByShipper = value;
    }

    /**
     * Gets the value of the isInvoiceRequired property.
     * 
     */
    public boolean isIsInvoiceRequired() {
        return isInvoiceRequired;
    }

    /**
     * Sets the value of the isInvoiceRequired property.
     * 
     */
    public void setIsInvoiceRequired(boolean value) {
        this.isInvoiceRequired = value;
    }

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
     * Gets the value of the physicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDimension }
     *     
     */
    public PhysicalDimension getPhysicalDimension() {
        return physicalDimension;
    }

    /**
     * Sets the value of the physicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDimension }
     *     
     */
    public void setPhysicalDimension(PhysicalDimension value) {
        this.physicalDimension = value;
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
     * Gets the value of the sed property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDeclarationType }
     *     
     */
    public ExportDeclarationType getSED() {
        return sed;
    }

    /**
     * Sets the value of the sed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDeclarationType }
     *     
     */
    public void setSED(ExportDeclarationType value) {
        this.sed = value;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipFrom(SpecifiedPartnerDescriptionType value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the shipmentInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentInstructions }
     * 
     * 
     */
    public List<ShipmentInstructions> getShipmentInstructions() {
        if (shipmentInstructions == null) {
            shipmentInstructions = new ArrayList<ShipmentInstructions>();
        }
        return this.shipmentInstructions;
    }

    /**
     * Gets the value of the shipmentServiceAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentServiceAccountNumber() {
        return shipmentServiceAccountNumber;
    }

    /**
     * Sets the value of the shipmentServiceAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentServiceAccountNumber(String value) {
        this.shipmentServiceAccountNumber = value;
    }

    /**
     * Gets the value of the shipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentType }
     *     
     */
    public ShipmentType getShipmentType() {
        return shipmentType;
    }

    /**
     * Sets the value of the shipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentType }
     *     
     */
    public void setShipmentType(ShipmentType value) {
        this.shipmentType = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipTo(SpecifiedPartnerDescriptionType value) {
        this.shipTo = value;
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
            BusinessDocumentReferenceType lhsConsolidationNumber;
            lhsConsolidationNumber = this.getConsolidationNumber();
            BusinessDocumentReferenceType rhsConsolidationNumber;
            rhsConsolidationNumber = that.getConsolidationNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consolidationNumber", lhsConsolidationNumber), LocatorUtils.property(thatLocator, "consolidationNumber", rhsConsolidationNumber), lhsConsolidationNumber, rhsConsolidationNumber, (this.consolidationNumber!= null), (that.consolidationNumber!= null))) {
                return false;
            }
        }
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
            List<CurrencyConversion> lhsCurrencyConversion;
            lhsCurrencyConversion = (((this.currencyConversion!= null)&&(!this.currencyConversion.isEmpty()))?this.getCurrencyConversion():null);
            List<CurrencyConversion> rhsCurrencyConversion;
            rhsCurrencyConversion = (((that.currencyConversion!= null)&&(!that.currencyConversion.isEmpty()))?that.getCurrencyConversion():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currencyConversion", lhsCurrencyConversion), LocatorUtils.property(thatLocator, "currencyConversion", rhsCurrencyConversion), lhsCurrencyConversion, rhsCurrencyConversion, ((this.currencyConversion!= null)&&(!this.currencyConversion.isEmpty())), ((that.currencyConversion!= null)&&(!that.currencyConversion.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsCustomValue;
            lhsCustomValue = this.getCustomValue();
            String rhsCustomValue;
            rhsCustomValue = that.getCustomValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customValue", lhsCustomValue), LocatorUtils.property(thatLocator, "customValue", rhsCustomValue), lhsCustomValue, rhsCustomValue, (this.customValue!= null), (that.customValue!= null))) {
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
            ExportLicense lhsExportLicense;
            lhsExportLicense = this.getExportLicense();
            ExportLicense rhsExportLicense;
            rhsExportLicense = that.getExportLicense();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exportLicense", lhsExportLicense), LocatorUtils.property(thatLocator, "exportLicense", rhsExportLicense), lhsExportLicense, rhsExportLicense, (this.exportLicense!= null), (that.exportLicense!= null))) {
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
            BusinessDocumentReferenceType lhsFreightReference;
            lhsFreightReference = this.getFreightReference();
            BusinessDocumentReferenceType rhsFreightReference;
            rhsFreightReference = that.getFreightReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightReference", lhsFreightReference), LocatorUtils.property(thatLocator, "freightReference", rhsFreightReference), lhsFreightReference, rhsFreightReference, (this.freightReference!= null), (that.freightReference!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsImportBy;
            lhsImportBy = this.getImportBy();
            SpecifiedPartnerDescriptionType rhsImportBy;
            rhsImportBy = that.getImportBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "importBy", lhsImportBy), LocatorUtils.property(thatLocator, "importBy", rhsImportBy), lhsImportBy, rhsImportBy, (this.importBy!= null), (that.importBy!= null))) {
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
            boolean lhsIsDutyPaidByShipper;
            lhsIsDutyPaidByShipper = this.isIsDutyPaidByShipper();
            boolean rhsIsDutyPaidByShipper;
            rhsIsDutyPaidByShipper = that.isIsDutyPaidByShipper();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isDutyPaidByShipper", lhsIsDutyPaidByShipper), LocatorUtils.property(thatLocator, "isDutyPaidByShipper", rhsIsDutyPaidByShipper), lhsIsDutyPaidByShipper, rhsIsDutyPaidByShipper, true, true)) {
                return false;
            }
        }
        {
            boolean lhsIsInvoiceRequired;
            lhsIsInvoiceRequired = this.isIsInvoiceRequired();
            boolean rhsIsInvoiceRequired;
            rhsIsInvoiceRequired = that.isIsInvoiceRequired();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isInvoiceRequired", lhsIsInvoiceRequired), LocatorUtils.property(thatLocator, "isInvoiceRequired", rhsIsInvoiceRequired), lhsIsInvoiceRequired, rhsIsInvoiceRequired, true, true)) {
                return false;
            }
        }
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
            PhysicalDimension lhsPhysicalDimension;
            lhsPhysicalDimension = this.getPhysicalDimension();
            PhysicalDimension rhsPhysicalDimension;
            rhsPhysicalDimension = that.getPhysicalDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "physicalDimension", lhsPhysicalDimension), LocatorUtils.property(thatLocator, "physicalDimension", rhsPhysicalDimension), lhsPhysicalDimension, rhsPhysicalDimension, (this.physicalDimension!= null), (that.physicalDimension!= null))) {
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
            ExportDeclarationType lhsSED;
            lhsSED = this.getSED();
            ExportDeclarationType rhsSED;
            rhsSED = that.getSED();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sed", lhsSED), LocatorUtils.property(thatLocator, "sed", rhsSED), lhsSED, rhsSED, (this.sed!= null), (that.sed!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsShipFrom;
            lhsShipFrom = this.getShipFrom();
            SpecifiedPartnerDescriptionType rhsShipFrom;
            rhsShipFrom = that.getShipFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipFrom", lhsShipFrom), LocatorUtils.property(thatLocator, "shipFrom", rhsShipFrom), lhsShipFrom, rhsShipFrom, (this.shipFrom!= null), (that.shipFrom!= null))) {
                return false;
            }
        }
        {
            List<ShipmentInstructions> lhsShipmentInstructions;
            lhsShipmentInstructions = (((this.shipmentInstructions!= null)&&(!this.shipmentInstructions.isEmpty()))?this.getShipmentInstructions():null);
            List<ShipmentInstructions> rhsShipmentInstructions;
            rhsShipmentInstructions = (((that.shipmentInstructions!= null)&&(!that.shipmentInstructions.isEmpty()))?that.getShipmentInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentInstructions", lhsShipmentInstructions), LocatorUtils.property(thatLocator, "shipmentInstructions", rhsShipmentInstructions), lhsShipmentInstructions, rhsShipmentInstructions, ((this.shipmentInstructions!= null)&&(!this.shipmentInstructions.isEmpty())), ((that.shipmentInstructions!= null)&&(!that.shipmentInstructions.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsShipmentServiceAccountNumber;
            lhsShipmentServiceAccountNumber = this.getShipmentServiceAccountNumber();
            String rhsShipmentServiceAccountNumber;
            rhsShipmentServiceAccountNumber = that.getShipmentServiceAccountNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentServiceAccountNumber", lhsShipmentServiceAccountNumber), LocatorUtils.property(thatLocator, "shipmentServiceAccountNumber", rhsShipmentServiceAccountNumber), lhsShipmentServiceAccountNumber, rhsShipmentServiceAccountNumber, (this.shipmentServiceAccountNumber!= null), (that.shipmentServiceAccountNumber!= null))) {
                return false;
            }
        }
        {
            ShipmentType lhsShipmentType;
            lhsShipmentType = this.getShipmentType();
            ShipmentType rhsShipmentType;
            rhsShipmentType = that.getShipmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentType", lhsShipmentType), LocatorUtils.property(thatLocator, "shipmentType", rhsShipmentType), lhsShipmentType, rhsShipmentType, (this.shipmentType!= null), (that.shipmentType!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsShipTo;
            lhsShipTo = this.getShipTo();
            SpecifiedPartnerDescriptionType rhsShipTo;
            rhsShipTo = that.getShipTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipTo", lhsShipTo), LocatorUtils.property(thatLocator, "shipTo", rhsShipTo), lhsShipTo, rhsShipTo, (this.shipTo!= null), (that.shipTo!= null))) {
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
            BusinessDocumentReferenceType theConsolidationNumber;
            theConsolidationNumber = this.getConsolidationNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consolidationNumber", theConsolidationNumber), currentHashCode, theConsolidationNumber, (this.consolidationNumber!= null));
        }
        {
            BigInteger theContainerTotalCount;
            theContainerTotalCount = this.getContainerTotalCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerTotalCount", theContainerTotalCount), currentHashCode, theContainerTotalCount, (this.containerTotalCount!= null));
        }
        {
            List<CurrencyConversion> theCurrencyConversion;
            theCurrencyConversion = (((this.currencyConversion!= null)&&(!this.currencyConversion.isEmpty()))?this.getCurrencyConversion():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currencyConversion", theCurrencyConversion), currentHashCode, theCurrencyConversion, ((this.currencyConversion!= null)&&(!this.currencyConversion.isEmpty())));
        }
        {
            String theCustomValue;
            theCustomValue = this.getCustomValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customValue", theCustomValue), currentHashCode, theCustomValue, (this.customValue!= null));
        }
        {
            DateInformationType theDateInformation;
            theDateInformation = this.getDateInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateInformation", theDateInformation), currentHashCode, theDateInformation, (this.dateInformation!= null));
        }
        {
            ExportLicense theExportLicense;
            theExportLicense = this.getExportLicense();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exportLicense", theExportLicense), currentHashCode, theExportLicense, (this.exportLicense!= null));
        }
        {
            FreeOnBoardTerms theFreeOnBoardTerms;
            theFreeOnBoardTerms = this.getFreeOnBoardTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freeOnBoardTerms", theFreeOnBoardTerms), currentHashCode, theFreeOnBoardTerms, (this.freeOnBoardTerms!= null));
        }
        {
            BusinessDocumentReferenceType theFreightReference;
            theFreightReference = this.getFreightReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightReference", theFreightReference), currentHashCode, theFreightReference, (this.freightReference!= null));
        }
        {
            SpecifiedPartnerDescriptionType theImportBy;
            theImportBy = this.getImportBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "importBy", theImportBy), currentHashCode, theImportBy, (this.importBy!= null));
        }
        {
            Incoterms theIncoterms;
            theIncoterms = this.getIncoterms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "incoterms", theIncoterms), currentHashCode, theIncoterms, (this.incoterms!= null));
        }
        {
            boolean theIsDutyPaidByShipper;
            theIsDutyPaidByShipper = this.isIsDutyPaidByShipper();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isDutyPaidByShipper", theIsDutyPaidByShipper), currentHashCode, theIsDutyPaidByShipper, true);
        }
        {
            boolean theIsInvoiceRequired;
            theIsInvoiceRequired = this.isIsInvoiceRequired();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isInvoiceRequired", theIsInvoiceRequired), currentHashCode, theIsInvoiceRequired, true);
        }
        {
            IsPartialShipment theIsPartialShipment;
            theIsPartialShipment = this.getIsPartialShipment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isPartialShipment", theIsPartialShipment), currentHashCode, theIsPartialShipment, (this.isPartialShipment!= null));
        }
        {
            PhysicalDimension thePhysicalDimension;
            thePhysicalDimension = this.getPhysicalDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "physicalDimension", thePhysicalDimension), currentHashCode, thePhysicalDimension, (this.physicalDimension!= null));
        }
        {
            List<RoutingInformationType> theRoutingInformation;
            theRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "routingInformation", theRoutingInformation), currentHashCode, theRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())));
        }
        {
            ExportDeclarationType theSED;
            theSED = this.getSED();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sed", theSED), currentHashCode, theSED, (this.sed!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipFrom;
            theShipFrom = this.getShipFrom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipFrom", theShipFrom), currentHashCode, theShipFrom, (this.shipFrom!= null));
        }
        {
            List<ShipmentInstructions> theShipmentInstructions;
            theShipmentInstructions = (((this.shipmentInstructions!= null)&&(!this.shipmentInstructions.isEmpty()))?this.getShipmentInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentInstructions", theShipmentInstructions), currentHashCode, theShipmentInstructions, ((this.shipmentInstructions!= null)&&(!this.shipmentInstructions.isEmpty())));
        }
        {
            String theShipmentServiceAccountNumber;
            theShipmentServiceAccountNumber = this.getShipmentServiceAccountNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentServiceAccountNumber", theShipmentServiceAccountNumber), currentHashCode, theShipmentServiceAccountNumber, (this.shipmentServiceAccountNumber!= null));
        }
        {
            ShipmentType theShipmentType;
            theShipmentType = this.getShipmentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentType", theShipmentType), currentHashCode, theShipmentType, (this.shipmentType!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipTo", theShipTo), currentHashCode, theShipTo, (this.shipTo!= null));
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
            BusinessDocumentReferenceType theConsolidationNumber;
            theConsolidationNumber = this.getConsolidationNumber();
            strategy.appendField(locator, this, "consolidationNumber", buffer, theConsolidationNumber, (this.consolidationNumber!= null));
        }
        {
            BigInteger theContainerTotalCount;
            theContainerTotalCount = this.getContainerTotalCount();
            strategy.appendField(locator, this, "containerTotalCount", buffer, theContainerTotalCount, (this.containerTotalCount!= null));
        }
        {
            List<CurrencyConversion> theCurrencyConversion;
            theCurrencyConversion = (((this.currencyConversion!= null)&&(!this.currencyConversion.isEmpty()))?this.getCurrencyConversion():null);
            strategy.appendField(locator, this, "currencyConversion", buffer, theCurrencyConversion, ((this.currencyConversion!= null)&&(!this.currencyConversion.isEmpty())));
        }
        {
            String theCustomValue;
            theCustomValue = this.getCustomValue();
            strategy.appendField(locator, this, "customValue", buffer, theCustomValue, (this.customValue!= null));
        }
        {
            DateInformationType theDateInformation;
            theDateInformation = this.getDateInformation();
            strategy.appendField(locator, this, "dateInformation", buffer, theDateInformation, (this.dateInformation!= null));
        }
        {
            ExportLicense theExportLicense;
            theExportLicense = this.getExportLicense();
            strategy.appendField(locator, this, "exportLicense", buffer, theExportLicense, (this.exportLicense!= null));
        }
        {
            FreeOnBoardTerms theFreeOnBoardTerms;
            theFreeOnBoardTerms = this.getFreeOnBoardTerms();
            strategy.appendField(locator, this, "freeOnBoardTerms", buffer, theFreeOnBoardTerms, (this.freeOnBoardTerms!= null));
        }
        {
            BusinessDocumentReferenceType theFreightReference;
            theFreightReference = this.getFreightReference();
            strategy.appendField(locator, this, "freightReference", buffer, theFreightReference, (this.freightReference!= null));
        }
        {
            SpecifiedPartnerDescriptionType theImportBy;
            theImportBy = this.getImportBy();
            strategy.appendField(locator, this, "importBy", buffer, theImportBy, (this.importBy!= null));
        }
        {
            Incoterms theIncoterms;
            theIncoterms = this.getIncoterms();
            strategy.appendField(locator, this, "incoterms", buffer, theIncoterms, (this.incoterms!= null));
        }
        {
            boolean theIsDutyPaidByShipper;
            theIsDutyPaidByShipper = this.isIsDutyPaidByShipper();
            strategy.appendField(locator, this, "isDutyPaidByShipper", buffer, theIsDutyPaidByShipper, true);
        }
        {
            boolean theIsInvoiceRequired;
            theIsInvoiceRequired = this.isIsInvoiceRequired();
            strategy.appendField(locator, this, "isInvoiceRequired", buffer, theIsInvoiceRequired, true);
        }
        {
            IsPartialShipment theIsPartialShipment;
            theIsPartialShipment = this.getIsPartialShipment();
            strategy.appendField(locator, this, "isPartialShipment", buffer, theIsPartialShipment, (this.isPartialShipment!= null));
        }
        {
            PhysicalDimension thePhysicalDimension;
            thePhysicalDimension = this.getPhysicalDimension();
            strategy.appendField(locator, this, "physicalDimension", buffer, thePhysicalDimension, (this.physicalDimension!= null));
        }
        {
            List<RoutingInformationType> theRoutingInformation;
            theRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            strategy.appendField(locator, this, "routingInformation", buffer, theRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())));
        }
        {
            ExportDeclarationType theSED;
            theSED = this.getSED();
            strategy.appendField(locator, this, "sed", buffer, theSED, (this.sed!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipFrom;
            theShipFrom = this.getShipFrom();
            strategy.appendField(locator, this, "shipFrom", buffer, theShipFrom, (this.shipFrom!= null));
        }
        {
            List<ShipmentInstructions> theShipmentInstructions;
            theShipmentInstructions = (((this.shipmentInstructions!= null)&&(!this.shipmentInstructions.isEmpty()))?this.getShipmentInstructions():null);
            strategy.appendField(locator, this, "shipmentInstructions", buffer, theShipmentInstructions, ((this.shipmentInstructions!= null)&&(!this.shipmentInstructions.isEmpty())));
        }
        {
            String theShipmentServiceAccountNumber;
            theShipmentServiceAccountNumber = this.getShipmentServiceAccountNumber();
            strategy.appendField(locator, this, "shipmentServiceAccountNumber", buffer, theShipmentServiceAccountNumber, (this.shipmentServiceAccountNumber!= null));
        }
        {
            ShipmentType theShipmentType;
            theShipmentType = this.getShipmentType();
            strategy.appendField(locator, this, "shipmentType", buffer, theShipmentType, (this.shipmentType!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            strategy.appendField(locator, this, "shipTo", buffer, theShipTo, (this.shipTo!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
