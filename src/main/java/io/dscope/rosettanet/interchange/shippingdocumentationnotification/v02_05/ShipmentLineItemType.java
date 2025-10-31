
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_05;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.CustomsPermittedInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.ExportLicense;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.FreightValuation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.Handbook;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.HarmonizedTariffScheduleInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.HazardousMaterialDescription;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.IsHazardousMaterial;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.RequestingOrderLineItemReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.TaxExemptStatus;
import io.dscope.rosettanet.domain.shared.shared.v01_12.QuantityInformation;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}CustomsPermittedInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}ExportLicense" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}FreightValuation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}Handbook" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}HarmonizedTariffScheduleInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}HazardousMaterialDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}IsHazardousMaterial" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PricingInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}PricingInformationType" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ProductIdentificationInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}ProductIdentificationInformationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}QuantityInformation"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}RequestingOrderLineItemReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainer" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}ShippingContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}TaxExemptStatus" minOccurs="0"/&gt;
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
    "customsPermittedInformation",
    "exportLicense",
    "freightValuation",
    "handbook",
    "harmonizedTariffScheduleInformation",
    "hazardousMaterialDescription",
    "isHazardousMaterial",
    "lineNumber",
    "pricingInformation",
    "productDescription",
    "productIdentificationInformation",
    "quantityInformation",
    "requestingOrderLineItemReference",
    "shippingContainer",
    "taxExemptStatus",
    "unitOfMeasure"
})
public class ShipmentLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "CustomsPermittedInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = CustomsPermittedInformation.class, required = false)
    protected List<CustomsPermittedInformation> customsPermittedInformation;
    @XmlElementRef(name = "ExportLicense", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = ExportLicense.class, required = false)
    protected ExportLicense exportLicense;
    @XmlElementRef(name = "FreightValuation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = FreightValuation.class, required = false)
    protected FreightValuation freightValuation;
    @XmlElementRef(name = "Handbook", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = Handbook.class, required = false)
    protected List<Handbook> handbook;
    @XmlElementRef(name = "HarmonizedTariffScheduleInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = HarmonizedTariffScheduleInformation.class, required = false)
    protected List<HarmonizedTariffScheduleInformation> harmonizedTariffScheduleInformation;
    @XmlElementRef(name = "HazardousMaterialDescription", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = HazardousMaterialDescription.class, required = false)
    protected List<HazardousMaterialDescription> hazardousMaterialDescription;
    @XmlElementRef(name = "IsHazardousMaterial", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = IsHazardousMaterial.class, required = false)
    protected IsHazardousMaterial isHazardousMaterial;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "PricingInformation")
    protected PricingInformationType pricingInformation;
    @XmlElement(name = "ProductDescription")
    protected TextualDescriptionType productDescription;
    @XmlElement(name = "ProductIdentificationInformation", required = true)
    protected ProductIdentificationInformationType productIdentificationInformation;
    @XmlElementRef(name = "QuantityInformation", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.12", type = QuantityInformation.class)
    protected QuantityInformation quantityInformation;
    @XmlElementRef(name = "RequestingOrderLineItemReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = RequestingOrderLineItemReference.class, required = false)
    protected List<RequestingOrderLineItemReference> requestingOrderLineItemReference;
    @XmlElement(name = "ShippingContainer")
    protected List<ShippingContainerType> shippingContainer;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customsPermittedInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsPermittedInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsPermittedInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsPermittedInformation }
     * 
     * 
     */
    public List<CustomsPermittedInformation> getCustomsPermittedInformation() {
        if (customsPermittedInformation == null) {
            customsPermittedInformation = new ArrayList<CustomsPermittedInformation>();
        }
        return this.customsPermittedInformation;
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
     * Gets the value of the handbook property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handbook property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandbook().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Handbook }
     * 
     * 
     */
    public List<Handbook> getHandbook() {
        if (handbook == null) {
            handbook = new ArrayList<Handbook>();
        }
        return this.handbook;
    }

    /**
     * Gets the value of the harmonizedTariffScheduleInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the harmonizedTariffScheduleInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHarmonizedTariffScheduleInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HarmonizedTariffScheduleInformation }
     * 
     * 
     */
    public List<HarmonizedTariffScheduleInformation> getHarmonizedTariffScheduleInformation() {
        if (harmonizedTariffScheduleInformation == null) {
            harmonizedTariffScheduleInformation = new ArrayList<HarmonizedTariffScheduleInformation>();
        }
        return this.harmonizedTariffScheduleInformation;
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
     * Gets the value of the pricingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PricingInformationType }
     *     
     */
    public PricingInformationType getPricingInformation() {
        return pricingInformation;
    }

    /**
     * Sets the value of the pricingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingInformationType }
     *     
     */
    public void setPricingInformation(PricingInformationType value) {
        this.pricingInformation = value;
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
     * Gets the value of the productIdentificationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationInformationType }
     *     
     */
    public ProductIdentificationInformationType getProductIdentificationInformation() {
        return productIdentificationInformation;
    }

    /**
     * Sets the value of the productIdentificationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationInformationType }
     *     
     */
    public void setProductIdentificationInformation(ProductIdentificationInformationType value) {
        this.productIdentificationInformation = value;
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
     * {@link RequestingOrderLineItemReference }
     * 
     * 
     */
    public List<RequestingOrderLineItemReference> getRequestingOrderLineItemReference() {
        if (requestingOrderLineItemReference == null) {
            requestingOrderLineItemReference = new ArrayList<RequestingOrderLineItemReference>();
        }
        return this.requestingOrderLineItemReference;
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
            List<CustomsPermittedInformation> lhsCustomsPermittedInformation;
            lhsCustomsPermittedInformation = (((this.customsPermittedInformation!= null)&&(!this.customsPermittedInformation.isEmpty()))?this.getCustomsPermittedInformation():null);
            List<CustomsPermittedInformation> rhsCustomsPermittedInformation;
            rhsCustomsPermittedInformation = (((that.customsPermittedInformation!= null)&&(!that.customsPermittedInformation.isEmpty()))?that.getCustomsPermittedInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customsPermittedInformation", lhsCustomsPermittedInformation), LocatorUtils.property(thatLocator, "customsPermittedInformation", rhsCustomsPermittedInformation), lhsCustomsPermittedInformation, rhsCustomsPermittedInformation, ((this.customsPermittedInformation!= null)&&(!this.customsPermittedInformation.isEmpty())), ((that.customsPermittedInformation!= null)&&(!that.customsPermittedInformation.isEmpty())))) {
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
            FreightValuation lhsFreightValuation;
            lhsFreightValuation = this.getFreightValuation();
            FreightValuation rhsFreightValuation;
            rhsFreightValuation = that.getFreightValuation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightValuation", lhsFreightValuation), LocatorUtils.property(thatLocator, "freightValuation", rhsFreightValuation), lhsFreightValuation, rhsFreightValuation, (this.freightValuation!= null), (that.freightValuation!= null))) {
                return false;
            }
        }
        {
            List<Handbook> lhsHandbook;
            lhsHandbook = (((this.handbook!= null)&&(!this.handbook.isEmpty()))?this.getHandbook():null);
            List<Handbook> rhsHandbook;
            rhsHandbook = (((that.handbook!= null)&&(!that.handbook.isEmpty()))?that.getHandbook():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handbook", lhsHandbook), LocatorUtils.property(thatLocator, "handbook", rhsHandbook), lhsHandbook, rhsHandbook, ((this.handbook!= null)&&(!this.handbook.isEmpty())), ((that.handbook!= null)&&(!that.handbook.isEmpty())))) {
                return false;
            }
        }
        {
            List<HarmonizedTariffScheduleInformation> lhsHarmonizedTariffScheduleInformation;
            lhsHarmonizedTariffScheduleInformation = (((this.harmonizedTariffScheduleInformation!= null)&&(!this.harmonizedTariffScheduleInformation.isEmpty()))?this.getHarmonizedTariffScheduleInformation():null);
            List<HarmonizedTariffScheduleInformation> rhsHarmonizedTariffScheduleInformation;
            rhsHarmonizedTariffScheduleInformation = (((that.harmonizedTariffScheduleInformation!= null)&&(!that.harmonizedTariffScheduleInformation.isEmpty()))?that.getHarmonizedTariffScheduleInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "harmonizedTariffScheduleInformation", lhsHarmonizedTariffScheduleInformation), LocatorUtils.property(thatLocator, "harmonizedTariffScheduleInformation", rhsHarmonizedTariffScheduleInformation), lhsHarmonizedTariffScheduleInformation, rhsHarmonizedTariffScheduleInformation, ((this.harmonizedTariffScheduleInformation!= null)&&(!this.harmonizedTariffScheduleInformation.isEmpty())), ((that.harmonizedTariffScheduleInformation!= null)&&(!that.harmonizedTariffScheduleInformation.isEmpty())))) {
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
            PricingInformationType lhsPricingInformation;
            lhsPricingInformation = this.getPricingInformation();
            PricingInformationType rhsPricingInformation;
            rhsPricingInformation = that.getPricingInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pricingInformation", lhsPricingInformation), LocatorUtils.property(thatLocator, "pricingInformation", rhsPricingInformation), lhsPricingInformation, rhsPricingInformation, (this.pricingInformation!= null), (that.pricingInformation!= null))) {
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
            ProductIdentificationInformationType lhsProductIdentificationInformation;
            lhsProductIdentificationInformation = this.getProductIdentificationInformation();
            ProductIdentificationInformationType rhsProductIdentificationInformation;
            rhsProductIdentificationInformation = that.getProductIdentificationInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentificationInformation", lhsProductIdentificationInformation), LocatorUtils.property(thatLocator, "productIdentificationInformation", rhsProductIdentificationInformation), lhsProductIdentificationInformation, rhsProductIdentificationInformation, (this.productIdentificationInformation!= null), (that.productIdentificationInformation!= null))) {
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
            List<RequestingOrderLineItemReference> lhsRequestingOrderLineItemReference;
            lhsRequestingOrderLineItemReference = (((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty()))?this.getRequestingOrderLineItemReference():null);
            List<RequestingOrderLineItemReference> rhsRequestingOrderLineItemReference;
            rhsRequestingOrderLineItemReference = (((that.requestingOrderLineItemReference!= null)&&(!that.requestingOrderLineItemReference.isEmpty()))?that.getRequestingOrderLineItemReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestingOrderLineItemReference", lhsRequestingOrderLineItemReference), LocatorUtils.property(thatLocator, "requestingOrderLineItemReference", rhsRequestingOrderLineItemReference), lhsRequestingOrderLineItemReference, rhsRequestingOrderLineItemReference, ((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty())), ((that.requestingOrderLineItemReference!= null)&&(!that.requestingOrderLineItemReference.isEmpty())))) {
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
            TaxExemptStatus lhsTaxExemptStatus;
            lhsTaxExemptStatus = this.getTaxExemptStatus();
            TaxExemptStatus rhsTaxExemptStatus;
            rhsTaxExemptStatus = that.getTaxExemptStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxExemptStatus", lhsTaxExemptStatus), LocatorUtils.property(thatLocator, "taxExemptStatus", rhsTaxExemptStatus), lhsTaxExemptStatus, rhsTaxExemptStatus, (this.taxExemptStatus!= null), (that.taxExemptStatus!= null))) {
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
            List<CustomsPermittedInformation> theCustomsPermittedInformation;
            theCustomsPermittedInformation = (((this.customsPermittedInformation!= null)&&(!this.customsPermittedInformation.isEmpty()))?this.getCustomsPermittedInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customsPermittedInformation", theCustomsPermittedInformation), currentHashCode, theCustomsPermittedInformation, ((this.customsPermittedInformation!= null)&&(!this.customsPermittedInformation.isEmpty())));
        }
        {
            ExportLicense theExportLicense;
            theExportLicense = this.getExportLicense();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exportLicense", theExportLicense), currentHashCode, theExportLicense, (this.exportLicense!= null));
        }
        {
            FreightValuation theFreightValuation;
            theFreightValuation = this.getFreightValuation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightValuation", theFreightValuation), currentHashCode, theFreightValuation, (this.freightValuation!= null));
        }
        {
            List<Handbook> theHandbook;
            theHandbook = (((this.handbook!= null)&&(!this.handbook.isEmpty()))?this.getHandbook():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handbook", theHandbook), currentHashCode, theHandbook, ((this.handbook!= null)&&(!this.handbook.isEmpty())));
        }
        {
            List<HarmonizedTariffScheduleInformation> theHarmonizedTariffScheduleInformation;
            theHarmonizedTariffScheduleInformation = (((this.harmonizedTariffScheduleInformation!= null)&&(!this.harmonizedTariffScheduleInformation.isEmpty()))?this.getHarmonizedTariffScheduleInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "harmonizedTariffScheduleInformation", theHarmonizedTariffScheduleInformation), currentHashCode, theHarmonizedTariffScheduleInformation, ((this.harmonizedTariffScheduleInformation!= null)&&(!this.harmonizedTariffScheduleInformation.isEmpty())));
        }
        {
            List<HazardousMaterialDescription> theHazardousMaterialDescription;
            theHazardousMaterialDescription = (((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty()))?this.getHazardousMaterialDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousMaterialDescription", theHazardousMaterialDescription), currentHashCode, theHazardousMaterialDescription, ((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty())));
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
            PricingInformationType thePricingInformation;
            thePricingInformation = this.getPricingInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pricingInformation", thePricingInformation), currentHashCode, thePricingInformation, (this.pricingInformation!= null));
        }
        {
            TextualDescriptionType theProductDescription;
            theProductDescription = this.getProductDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productDescription", theProductDescription), currentHashCode, theProductDescription, (this.productDescription!= null));
        }
        {
            ProductIdentificationInformationType theProductIdentificationInformation;
            theProductIdentificationInformation = this.getProductIdentificationInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentificationInformation", theProductIdentificationInformation), currentHashCode, theProductIdentificationInformation, (this.productIdentificationInformation!= null));
        }
        {
            QuantityInformation theQuantityInformation;
            theQuantityInformation = this.getQuantityInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityInformation", theQuantityInformation), currentHashCode, theQuantityInformation, (this.quantityInformation!= null));
        }
        {
            List<RequestingOrderLineItemReference> theRequestingOrderLineItemReference;
            theRequestingOrderLineItemReference = (((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty()))?this.getRequestingOrderLineItemReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestingOrderLineItemReference", theRequestingOrderLineItemReference), currentHashCode, theRequestingOrderLineItemReference, ((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty())));
        }
        {
            List<ShippingContainerType> theShippingContainer;
            theShippingContainer = (((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty()))?this.getShippingContainer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingContainer", theShippingContainer), currentHashCode, theShippingContainer, ((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty())));
        }
        {
            TaxExemptStatus theTaxExemptStatus;
            theTaxExemptStatus = this.getTaxExemptStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxExemptStatus", theTaxExemptStatus), currentHashCode, theTaxExemptStatus, (this.taxExemptStatus!= null));
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
            List<CustomsPermittedInformation> theCustomsPermittedInformation;
            theCustomsPermittedInformation = (((this.customsPermittedInformation!= null)&&(!this.customsPermittedInformation.isEmpty()))?this.getCustomsPermittedInformation():null);
            strategy.appendField(locator, this, "customsPermittedInformation", buffer, theCustomsPermittedInformation, ((this.customsPermittedInformation!= null)&&(!this.customsPermittedInformation.isEmpty())));
        }
        {
            ExportLicense theExportLicense;
            theExportLicense = this.getExportLicense();
            strategy.appendField(locator, this, "exportLicense", buffer, theExportLicense, (this.exportLicense!= null));
        }
        {
            FreightValuation theFreightValuation;
            theFreightValuation = this.getFreightValuation();
            strategy.appendField(locator, this, "freightValuation", buffer, theFreightValuation, (this.freightValuation!= null));
        }
        {
            List<Handbook> theHandbook;
            theHandbook = (((this.handbook!= null)&&(!this.handbook.isEmpty()))?this.getHandbook():null);
            strategy.appendField(locator, this, "handbook", buffer, theHandbook, ((this.handbook!= null)&&(!this.handbook.isEmpty())));
        }
        {
            List<HarmonizedTariffScheduleInformation> theHarmonizedTariffScheduleInformation;
            theHarmonizedTariffScheduleInformation = (((this.harmonizedTariffScheduleInformation!= null)&&(!this.harmonizedTariffScheduleInformation.isEmpty()))?this.getHarmonizedTariffScheduleInformation():null);
            strategy.appendField(locator, this, "harmonizedTariffScheduleInformation", buffer, theHarmonizedTariffScheduleInformation, ((this.harmonizedTariffScheduleInformation!= null)&&(!this.harmonizedTariffScheduleInformation.isEmpty())));
        }
        {
            List<HazardousMaterialDescription> theHazardousMaterialDescription;
            theHazardousMaterialDescription = (((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty()))?this.getHazardousMaterialDescription():null);
            strategy.appendField(locator, this, "hazardousMaterialDescription", buffer, theHazardousMaterialDescription, ((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty())));
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
            PricingInformationType thePricingInformation;
            thePricingInformation = this.getPricingInformation();
            strategy.appendField(locator, this, "pricingInformation", buffer, thePricingInformation, (this.pricingInformation!= null));
        }
        {
            TextualDescriptionType theProductDescription;
            theProductDescription = this.getProductDescription();
            strategy.appendField(locator, this, "productDescription", buffer, theProductDescription, (this.productDescription!= null));
        }
        {
            ProductIdentificationInformationType theProductIdentificationInformation;
            theProductIdentificationInformation = this.getProductIdentificationInformation();
            strategy.appendField(locator, this, "productIdentificationInformation", buffer, theProductIdentificationInformation, (this.productIdentificationInformation!= null));
        }
        {
            QuantityInformation theQuantityInformation;
            theQuantityInformation = this.getQuantityInformation();
            strategy.appendField(locator, this, "quantityInformation", buffer, theQuantityInformation, (this.quantityInformation!= null));
        }
        {
            List<RequestingOrderLineItemReference> theRequestingOrderLineItemReference;
            theRequestingOrderLineItemReference = (((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty()))?this.getRequestingOrderLineItemReference():null);
            strategy.appendField(locator, this, "requestingOrderLineItemReference", buffer, theRequestingOrderLineItemReference, ((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty())));
        }
        {
            List<ShippingContainerType> theShippingContainer;
            theShippingContainer = (((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty()))?this.getShippingContainer():null);
            strategy.appendField(locator, this, "shippingContainer", buffer, theShippingContainer, ((this.shippingContainer!= null)&&(!this.shippingContainer.isEmpty())));
        }
        {
            TaxExemptStatus theTaxExemptStatus;
            theTaxExemptStatus = this.getTaxExemptStatus();
            strategy.appendField(locator, this, "taxExemptStatus", buffer, theTaxExemptStatus, (this.taxExemptStatus!= null));
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
