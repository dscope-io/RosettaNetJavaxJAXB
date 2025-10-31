
package io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_01;

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
import io.dscope.rosettanet.domain.logistics.codelist.nationalexportcontrolclassification.v01_03.NationalExportControlClassification;
import io.dscope.rosettanet.domain.logistics.logistics.v02_08.HazardousMaterialDescription;
import io.dscope.rosettanet.domain.logistics.logistics.v02_08.ManufacturerProfile;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.SpecialHandlingInstruction;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.monetaryexpression.v01_03.FinancialAmountType;
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
 * <p>Java class for ShippingContainerItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingContainerItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceActivationInformation" type="{urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.01}DeviceActivationInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DocumentSubLineLotShipReference" type="{urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.01}DocumentSubLineLotShipReferenceType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FreightAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.03}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="HazardousMaterial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08}HazardousMaterialDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08}ManufacturerProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03}NationalExportControlClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NationalHarmonizedTariffSchedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageCount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03}ProductIdentification"/&gt;
 *         &lt;element name="ShippedQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}SpecialHandlingInstruction" minOccurs="0"/&gt;
 *         &lt;element name="TraceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ShippingContainerItemType", propOrder = {
    "deviceActivationInformation",
    "documentSubLineLotShipReference",
    "freightAmount",
    "hazardousMaterial",
    "hazardousMaterialDescription",
    "identifier",
    "manufacturerProfile",
    "nationalExportControlClassification",
    "nationalHarmonizedTariffSchedule",
    "packageCount",
    "productIdentification",
    "shippedQuantity",
    "specialHandlingInstruction",
    "traceIdentifier",
    "unitOfMeasure"
})
public class ShippingContainerItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DeviceActivationInformation")
    protected List<DeviceActivationInformationType> deviceActivationInformation;
    @XmlElement(name = "DocumentSubLineLotShipReference", required = true)
    protected List<DocumentSubLineLotShipReferenceType> documentSubLineLotShipReference;
    @XmlElement(name = "FreightAmount")
    protected FinancialAmountType freightAmount;
    @XmlElement(name = "HazardousMaterial")
    protected boolean hazardousMaterial;
    @XmlElementRef(name = "HazardousMaterialDescription", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08", type = HazardousMaterialDescription.class, required = false)
    protected List<HazardousMaterialDescription> hazardousMaterialDescription;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElementRef(name = "ManufacturerProfile", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08", type = ManufacturerProfile.class, required = false)
    protected List<ManufacturerProfile> manufacturerProfile;
    @XmlElementRef(name = "NationalExportControlClassification", namespace = "urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03", type = NationalExportControlClassification.class, required = false)
    protected List<NationalExportControlClassification> nationalExportControlClassification;
    @XmlElement(name = "NationalHarmonizedTariffSchedule")
    protected String nationalHarmonizedTariffSchedule;
    @XmlElement(name = "PackageCount")
    protected Float packageCount;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ShippedQuantity")
    protected float shippedQuantity;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = SpecialHandlingInstruction.class, required = false)
    protected SpecialHandlingInstruction specialHandlingInstruction;
    @XmlElement(name = "TraceIdentifier")
    protected List<String> traceIdentifier;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the deviceActivationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceActivationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceActivationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceActivationInformationType }
     * 
     * 
     */
    public List<DeviceActivationInformationType> getDeviceActivationInformation() {
        if (deviceActivationInformation == null) {
            deviceActivationInformation = new ArrayList<DeviceActivationInformationType>();
        }
        return this.deviceActivationInformation;
    }

    /**
     * Gets the value of the documentSubLineLotShipReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentSubLineLotShipReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentSubLineLotShipReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentSubLineLotShipReferenceType }
     * 
     * 
     */
    public List<DocumentSubLineLotShipReferenceType> getDocumentSubLineLotShipReference() {
        if (documentSubLineLotShipReference == null) {
            documentSubLineLotShipReference = new ArrayList<DocumentSubLineLotShipReferenceType>();
        }
        return this.documentSubLineLotShipReference;
    }

    /**
     * Gets the value of the freightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getFreightAmount() {
        return freightAmount;
    }

    /**
     * Sets the value of the freightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setFreightAmount(FinancialAmountType value) {
        this.freightAmount = value;
    }

    /**
     * Gets the value of the hazardousMaterial property.
     * 
     */
    public boolean isHazardousMaterial() {
        return hazardousMaterial;
    }

    /**
     * Sets the value of the hazardousMaterial property.
     * 
     */
    public void setHazardousMaterial(boolean value) {
        this.hazardousMaterial = value;
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
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the manufacturerProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManufacturerProfile }
     * 
     * 
     */
    public List<ManufacturerProfile> getManufacturerProfile() {
        if (manufacturerProfile == null) {
            manufacturerProfile = new ArrayList<ManufacturerProfile>();
        }
        return this.manufacturerProfile;
    }

    /**
     * Gets the value of the nationalExportControlClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalExportControlClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalExportControlClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalExportControlClassification }
     * 
     * 
     */
    public List<NationalExportControlClassification> getNationalExportControlClassification() {
        if (nationalExportControlClassification == null) {
            nationalExportControlClassification = new ArrayList<NationalExportControlClassification>();
        }
        return this.nationalExportControlClassification;
    }

    /**
     * Gets the value of the nationalHarmonizedTariffSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalHarmonizedTariffSchedule() {
        return nationalHarmonizedTariffSchedule;
    }

    /**
     * Sets the value of the nationalHarmonizedTariffSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalHarmonizedTariffSchedule(String value) {
        this.nationalHarmonizedTariffSchedule = value;
    }

    /**
     * Gets the value of the packageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackageCount() {
        return packageCount;
    }

    /**
     * Sets the value of the packageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackageCount(Float value) {
        this.packageCount = value;
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
     * Gets the value of the shippedQuantity property.
     * 
     */
    public float getShippedQuantity() {
        return shippedQuantity;
    }

    /**
     * Sets the value of the shippedQuantity property.
     * 
     */
    public void setShippedQuantity(float value) {
        this.shippedQuantity = value;
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
     * Gets the value of the traceIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traceIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraceIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTraceIdentifier() {
        if (traceIdentifier == null) {
            traceIdentifier = new ArrayList<String>();
        }
        return this.traceIdentifier;
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
        final ShippingContainerItemType that = ((ShippingContainerItemType) object);
        {
            List<DeviceActivationInformationType> lhsDeviceActivationInformation;
            lhsDeviceActivationInformation = (((this.deviceActivationInformation!= null)&&(!this.deviceActivationInformation.isEmpty()))?this.getDeviceActivationInformation():null);
            List<DeviceActivationInformationType> rhsDeviceActivationInformation;
            rhsDeviceActivationInformation = (((that.deviceActivationInformation!= null)&&(!that.deviceActivationInformation.isEmpty()))?that.getDeviceActivationInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deviceActivationInformation", lhsDeviceActivationInformation), LocatorUtils.property(thatLocator, "deviceActivationInformation", rhsDeviceActivationInformation), lhsDeviceActivationInformation, rhsDeviceActivationInformation, ((this.deviceActivationInformation!= null)&&(!this.deviceActivationInformation.isEmpty())), ((that.deviceActivationInformation!= null)&&(!that.deviceActivationInformation.isEmpty())))) {
                return false;
            }
        }
        {
            List<DocumentSubLineLotShipReferenceType> lhsDocumentSubLineLotShipReference;
            lhsDocumentSubLineLotShipReference = (((this.documentSubLineLotShipReference!= null)&&(!this.documentSubLineLotShipReference.isEmpty()))?this.getDocumentSubLineLotShipReference():null);
            List<DocumentSubLineLotShipReferenceType> rhsDocumentSubLineLotShipReference;
            rhsDocumentSubLineLotShipReference = (((that.documentSubLineLotShipReference!= null)&&(!that.documentSubLineLotShipReference.isEmpty()))?that.getDocumentSubLineLotShipReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentSubLineLotShipReference", lhsDocumentSubLineLotShipReference), LocatorUtils.property(thatLocator, "documentSubLineLotShipReference", rhsDocumentSubLineLotShipReference), lhsDocumentSubLineLotShipReference, rhsDocumentSubLineLotShipReference, ((this.documentSubLineLotShipReference!= null)&&(!this.documentSubLineLotShipReference.isEmpty())), ((that.documentSubLineLotShipReference!= null)&&(!that.documentSubLineLotShipReference.isEmpty())))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsFreightAmount;
            lhsFreightAmount = this.getFreightAmount();
            FinancialAmountType rhsFreightAmount;
            rhsFreightAmount = that.getFreightAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightAmount", lhsFreightAmount), LocatorUtils.property(thatLocator, "freightAmount", rhsFreightAmount), lhsFreightAmount, rhsFreightAmount, (this.freightAmount!= null), (that.freightAmount!= null))) {
                return false;
            }
        }
        {
            boolean lhsHazardousMaterial;
            lhsHazardousMaterial = this.isHazardousMaterial();
            boolean rhsHazardousMaterial;
            rhsHazardousMaterial = that.isHazardousMaterial();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousMaterial", lhsHazardousMaterial), LocatorUtils.property(thatLocator, "hazardousMaterial", rhsHazardousMaterial), lhsHazardousMaterial, rhsHazardousMaterial, true, true)) {
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
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            List<ManufacturerProfile> lhsManufacturerProfile;
            lhsManufacturerProfile = (((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty()))?this.getManufacturerProfile():null);
            List<ManufacturerProfile> rhsManufacturerProfile;
            rhsManufacturerProfile = (((that.manufacturerProfile!= null)&&(!that.manufacturerProfile.isEmpty()))?that.getManufacturerProfile():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturerProfile", lhsManufacturerProfile), LocatorUtils.property(thatLocator, "manufacturerProfile", rhsManufacturerProfile), lhsManufacturerProfile, rhsManufacturerProfile, ((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty())), ((that.manufacturerProfile!= null)&&(!that.manufacturerProfile.isEmpty())))) {
                return false;
            }
        }
        {
            List<NationalExportControlClassification> lhsNationalExportControlClassification;
            lhsNationalExportControlClassification = (((this.nationalExportControlClassification!= null)&&(!this.nationalExportControlClassification.isEmpty()))?this.getNationalExportControlClassification():null);
            List<NationalExportControlClassification> rhsNationalExportControlClassification;
            rhsNationalExportControlClassification = (((that.nationalExportControlClassification!= null)&&(!that.nationalExportControlClassification.isEmpty()))?that.getNationalExportControlClassification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nationalExportControlClassification", lhsNationalExportControlClassification), LocatorUtils.property(thatLocator, "nationalExportControlClassification", rhsNationalExportControlClassification), lhsNationalExportControlClassification, rhsNationalExportControlClassification, ((this.nationalExportControlClassification!= null)&&(!this.nationalExportControlClassification.isEmpty())), ((that.nationalExportControlClassification!= null)&&(!that.nationalExportControlClassification.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsNationalHarmonizedTariffSchedule;
            lhsNationalHarmonizedTariffSchedule = this.getNationalHarmonizedTariffSchedule();
            String rhsNationalHarmonizedTariffSchedule;
            rhsNationalHarmonizedTariffSchedule = that.getNationalHarmonizedTariffSchedule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nationalHarmonizedTariffSchedule", lhsNationalHarmonizedTariffSchedule), LocatorUtils.property(thatLocator, "nationalHarmonizedTariffSchedule", rhsNationalHarmonizedTariffSchedule), lhsNationalHarmonizedTariffSchedule, rhsNationalHarmonizedTariffSchedule, (this.nationalHarmonizedTariffSchedule!= null), (that.nationalHarmonizedTariffSchedule!= null))) {
                return false;
            }
        }
        {
            Float lhsPackageCount;
            lhsPackageCount = this.getPackageCount();
            Float rhsPackageCount;
            rhsPackageCount = that.getPackageCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageCount", lhsPackageCount), LocatorUtils.property(thatLocator, "packageCount", rhsPackageCount), lhsPackageCount, rhsPackageCount, (this.packageCount!= null), (that.packageCount!= null))) {
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
            float lhsShippedQuantity;
            lhsShippedQuantity = this.getShippedQuantity();
            float rhsShippedQuantity;
            rhsShippedQuantity = that.getShippedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippedQuantity", lhsShippedQuantity), LocatorUtils.property(thatLocator, "shippedQuantity", rhsShippedQuantity), lhsShippedQuantity, rhsShippedQuantity, true, true)) {
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
            List<String> lhsTraceIdentifier;
            lhsTraceIdentifier = (((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty()))?this.getTraceIdentifier():null);
            List<String> rhsTraceIdentifier;
            rhsTraceIdentifier = (((that.traceIdentifier!= null)&&(!that.traceIdentifier.isEmpty()))?that.getTraceIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "traceIdentifier", lhsTraceIdentifier), LocatorUtils.property(thatLocator, "traceIdentifier", rhsTraceIdentifier), lhsTraceIdentifier, rhsTraceIdentifier, ((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty())), ((that.traceIdentifier!= null)&&(!that.traceIdentifier.isEmpty())))) {
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
            List<DeviceActivationInformationType> theDeviceActivationInformation;
            theDeviceActivationInformation = (((this.deviceActivationInformation!= null)&&(!this.deviceActivationInformation.isEmpty()))?this.getDeviceActivationInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deviceActivationInformation", theDeviceActivationInformation), currentHashCode, theDeviceActivationInformation, ((this.deviceActivationInformation!= null)&&(!this.deviceActivationInformation.isEmpty())));
        }
        {
            List<DocumentSubLineLotShipReferenceType> theDocumentSubLineLotShipReference;
            theDocumentSubLineLotShipReference = (((this.documentSubLineLotShipReference!= null)&&(!this.documentSubLineLotShipReference.isEmpty()))?this.getDocumentSubLineLotShipReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentSubLineLotShipReference", theDocumentSubLineLotShipReference), currentHashCode, theDocumentSubLineLotShipReference, ((this.documentSubLineLotShipReference!= null)&&(!this.documentSubLineLotShipReference.isEmpty())));
        }
        {
            FinancialAmountType theFreightAmount;
            theFreightAmount = this.getFreightAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightAmount", theFreightAmount), currentHashCode, theFreightAmount, (this.freightAmount!= null));
        }
        {
            boolean theHazardousMaterial;
            theHazardousMaterial = this.isHazardousMaterial();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousMaterial", theHazardousMaterial), currentHashCode, theHazardousMaterial, true);
        }
        {
            List<HazardousMaterialDescription> theHazardousMaterialDescription;
            theHazardousMaterialDescription = (((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty()))?this.getHazardousMaterialDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousMaterialDescription", theHazardousMaterialDescription), currentHashCode, theHazardousMaterialDescription, ((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty())));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            List<ManufacturerProfile> theManufacturerProfile;
            theManufacturerProfile = (((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty()))?this.getManufacturerProfile():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturerProfile", theManufacturerProfile), currentHashCode, theManufacturerProfile, ((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty())));
        }
        {
            List<NationalExportControlClassification> theNationalExportControlClassification;
            theNationalExportControlClassification = (((this.nationalExportControlClassification!= null)&&(!this.nationalExportControlClassification.isEmpty()))?this.getNationalExportControlClassification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nationalExportControlClassification", theNationalExportControlClassification), currentHashCode, theNationalExportControlClassification, ((this.nationalExportControlClassification!= null)&&(!this.nationalExportControlClassification.isEmpty())));
        }
        {
            String theNationalHarmonizedTariffSchedule;
            theNationalHarmonizedTariffSchedule = this.getNationalHarmonizedTariffSchedule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nationalHarmonizedTariffSchedule", theNationalHarmonizedTariffSchedule), currentHashCode, theNationalHarmonizedTariffSchedule, (this.nationalHarmonizedTariffSchedule!= null));
        }
        {
            Float thePackageCount;
            thePackageCount = this.getPackageCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageCount", thePackageCount), currentHashCode, thePackageCount, (this.packageCount!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            float theShippedQuantity;
            theShippedQuantity = this.getShippedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippedQuantity", theShippedQuantity), currentHashCode, theShippedQuantity, true);
        }
        {
            SpecialHandlingInstruction theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialHandlingInstruction", theSpecialHandlingInstruction), currentHashCode, theSpecialHandlingInstruction, (this.specialHandlingInstruction!= null));
        }
        {
            List<String> theTraceIdentifier;
            theTraceIdentifier = (((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty()))?this.getTraceIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traceIdentifier", theTraceIdentifier), currentHashCode, theTraceIdentifier, ((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty())));
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
            List<DeviceActivationInformationType> theDeviceActivationInformation;
            theDeviceActivationInformation = (((this.deviceActivationInformation!= null)&&(!this.deviceActivationInformation.isEmpty()))?this.getDeviceActivationInformation():null);
            strategy.appendField(locator, this, "deviceActivationInformation", buffer, theDeviceActivationInformation, ((this.deviceActivationInformation!= null)&&(!this.deviceActivationInformation.isEmpty())));
        }
        {
            List<DocumentSubLineLotShipReferenceType> theDocumentSubLineLotShipReference;
            theDocumentSubLineLotShipReference = (((this.documentSubLineLotShipReference!= null)&&(!this.documentSubLineLotShipReference.isEmpty()))?this.getDocumentSubLineLotShipReference():null);
            strategy.appendField(locator, this, "documentSubLineLotShipReference", buffer, theDocumentSubLineLotShipReference, ((this.documentSubLineLotShipReference!= null)&&(!this.documentSubLineLotShipReference.isEmpty())));
        }
        {
            FinancialAmountType theFreightAmount;
            theFreightAmount = this.getFreightAmount();
            strategy.appendField(locator, this, "freightAmount", buffer, theFreightAmount, (this.freightAmount!= null));
        }
        {
            boolean theHazardousMaterial;
            theHazardousMaterial = this.isHazardousMaterial();
            strategy.appendField(locator, this, "hazardousMaterial", buffer, theHazardousMaterial, true);
        }
        {
            List<HazardousMaterialDescription> theHazardousMaterialDescription;
            theHazardousMaterialDescription = (((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty()))?this.getHazardousMaterialDescription():null);
            strategy.appendField(locator, this, "hazardousMaterialDescription", buffer, theHazardousMaterialDescription, ((this.hazardousMaterialDescription!= null)&&(!this.hazardousMaterialDescription.isEmpty())));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            List<ManufacturerProfile> theManufacturerProfile;
            theManufacturerProfile = (((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty()))?this.getManufacturerProfile():null);
            strategy.appendField(locator, this, "manufacturerProfile", buffer, theManufacturerProfile, ((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty())));
        }
        {
            List<NationalExportControlClassification> theNationalExportControlClassification;
            theNationalExportControlClassification = (((this.nationalExportControlClassification!= null)&&(!this.nationalExportControlClassification.isEmpty()))?this.getNationalExportControlClassification():null);
            strategy.appendField(locator, this, "nationalExportControlClassification", buffer, theNationalExportControlClassification, ((this.nationalExportControlClassification!= null)&&(!this.nationalExportControlClassification.isEmpty())));
        }
        {
            String theNationalHarmonizedTariffSchedule;
            theNationalHarmonizedTariffSchedule = this.getNationalHarmonizedTariffSchedule();
            strategy.appendField(locator, this, "nationalHarmonizedTariffSchedule", buffer, theNationalHarmonizedTariffSchedule, (this.nationalHarmonizedTariffSchedule!= null));
        }
        {
            Float thePackageCount;
            thePackageCount = this.getPackageCount();
            strategy.appendField(locator, this, "packageCount", buffer, thePackageCount, (this.packageCount!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            float theShippedQuantity;
            theShippedQuantity = this.getShippedQuantity();
            strategy.appendField(locator, this, "shippedQuantity", buffer, theShippedQuantity, true);
        }
        {
            SpecialHandlingInstruction theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = this.getSpecialHandlingInstruction();
            strategy.appendField(locator, this, "specialHandlingInstruction", buffer, theSpecialHandlingInstruction, (this.specialHandlingInstruction!= null));
        }
        {
            List<String> theTraceIdentifier;
            theTraceIdentifier = (((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty()))?this.getTraceIdentifier():null);
            strategy.appendField(locator, this, "traceIdentifier", buffer, theTraceIdentifier, ((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty())));
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
