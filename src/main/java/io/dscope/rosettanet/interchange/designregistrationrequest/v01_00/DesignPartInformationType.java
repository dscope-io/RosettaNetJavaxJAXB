
package io.dscope.rosettanet.interchange.designregistrationrequest.v01_00;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.CoreProductRegistration;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DemandCreatorTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DesignRegistrationIdentification;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DeviceProductRegistration;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.GeographicRegion;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductQuantity;
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
 * <p>Java class for DesignPartInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignPartInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attachment" type="{urn:rosettanet:specification:interchange:DesignRegistrationRequestNotification:xsd:schema:01.00}AttachmentType" minOccurs="0"/&gt;
 *         &lt;element name="DemandCreatorFieldApplicationEngineer" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="DemandCreatorSalesRepresentative" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DemandCreatorTrackingIdentifier"/&gt;
 *         &lt;element name="DesignCustomerInformation" type="{urn:rosettanet:specification:interchange:DesignRegistrationRequestNotification:xsd:schema:01.00}DesignCustomerInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DesignRegistrationIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}GeographicRegion" minOccurs="0"/&gt;
 *         &lt;element name="ImplementorComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IndependentFieldApplicationEngineer" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="IndependentSalesRepresentative" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="PartConfidencePercent" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element name="ProductProviderSalesRepresentative" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantity"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}CoreProductRegistration"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DeviceProductRegistration"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "DesignPartInformationType", propOrder = {
    "attachment",
    "demandCreatorFieldApplicationEngineer",
    "demandCreatorSalesRepresentative",
    "demandCreatorTrackingIdentifier",
    "designCustomerInformation",
    "designRegistrationIdentification",
    "geographicRegion",
    "implementorComments",
    "independentFieldApplicationEngineer",
    "independentSalesRepresentative",
    "partConfidencePercent",
    "partnerDescription",
    "productProviderSalesRepresentative",
    "productQuantity",
    "coreProductRegistrationOrDeviceProductRegistration"
})
public class DesignPartInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Attachment")
    protected AttachmentType attachment;
    @XmlElement(name = "DemandCreatorFieldApplicationEngineer", required = true)
    protected SpecifiedPartnerDescriptionType demandCreatorFieldApplicationEngineer;
    @XmlElement(name = "DemandCreatorSalesRepresentative", required = true)
    protected SpecifiedPartnerDescriptionType demandCreatorSalesRepresentative;
    @XmlElementRef(name = "DemandCreatorTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DemandCreatorTrackingIdentifier.class)
    protected DemandCreatorTrackingIdentifier demandCreatorTrackingIdentifier;
    @XmlElement(name = "DesignCustomerInformation")
    protected DesignCustomerInformationType designCustomerInformation;
    @XmlElementRef(name = "DesignRegistrationIdentification", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DesignRegistrationIdentification.class, required = false)
    protected DesignRegistrationIdentification designRegistrationIdentification;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = GeographicRegion.class, required = false)
    protected GeographicRegion geographicRegion;
    @XmlElement(name = "ImplementorComments")
    protected String implementorComments;
    @XmlElement(name = "IndependentFieldApplicationEngineer", required = true)
    protected SpecifiedPartnerDescriptionType independentFieldApplicationEngineer;
    @XmlElement(name = "IndependentSalesRepresentative", required = true)
    protected SpecifiedPartnerDescriptionType independentSalesRepresentative;
    @XmlElement(name = "PartConfidencePercent")
    protected BigDecimal partConfidencePercent;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElement(name = "ProductProviderSalesRepresentative", required = true)
    protected SpecifiedPartnerDescriptionType productProviderSalesRepresentative;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.17", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlElementRefs({
        @XmlElementRef(name = "CoreProductRegistration", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = CoreProductRegistration.class, required = false),
        @XmlElementRef(name = "DeviceProductRegistration", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DeviceProductRegistration.class, required = false)
    })
    protected List<JAXBElement<?>> coreProductRegistrationOrDeviceProductRegistration;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setAttachment(AttachmentType value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the demandCreatorFieldApplicationEngineer property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getDemandCreatorFieldApplicationEngineer() {
        return demandCreatorFieldApplicationEngineer;
    }

    /**
     * Sets the value of the demandCreatorFieldApplicationEngineer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setDemandCreatorFieldApplicationEngineer(SpecifiedPartnerDescriptionType value) {
        this.demandCreatorFieldApplicationEngineer = value;
    }

    /**
     * Gets the value of the demandCreatorSalesRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getDemandCreatorSalesRepresentative() {
        return demandCreatorSalesRepresentative;
    }

    /**
     * Sets the value of the demandCreatorSalesRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setDemandCreatorSalesRepresentative(SpecifiedPartnerDescriptionType value) {
        this.demandCreatorSalesRepresentative = value;
    }

    /**
     * Gets the value of the demandCreatorTrackingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link DemandCreatorTrackingIdentifier }
     *     
     */
    public DemandCreatorTrackingIdentifier getDemandCreatorTrackingIdentifier() {
        return demandCreatorTrackingIdentifier;
    }

    /**
     * Sets the value of the demandCreatorTrackingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandCreatorTrackingIdentifier }
     *     
     */
    public void setDemandCreatorTrackingIdentifier(DemandCreatorTrackingIdentifier value) {
        this.demandCreatorTrackingIdentifier = value;
    }

    /**
     * Gets the value of the designCustomerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DesignCustomerInformationType }
     *     
     */
    public DesignCustomerInformationType getDesignCustomerInformation() {
        return designCustomerInformation;
    }

    /**
     * Sets the value of the designCustomerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignCustomerInformationType }
     *     
     */
    public void setDesignCustomerInformation(DesignCustomerInformationType value) {
        this.designCustomerInformation = value;
    }

    /**
     * Gets the value of the designRegistrationIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link DesignRegistrationIdentification }
     *     
     */
    public DesignRegistrationIdentification getDesignRegistrationIdentification() {
        return designRegistrationIdentification;
    }

    /**
     * Sets the value of the designRegistrationIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignRegistrationIdentification }
     *     
     */
    public void setDesignRegistrationIdentification(DesignRegistrationIdentification value) {
        this.designRegistrationIdentification = value;
    }

    /**
     * Gets the value of the geographicRegion property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicRegion }
     *     
     */
    public GeographicRegion getGeographicRegion() {
        return geographicRegion;
    }

    /**
     * Sets the value of the geographicRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicRegion }
     *     
     */
    public void setGeographicRegion(GeographicRegion value) {
        this.geographicRegion = value;
    }

    /**
     * Gets the value of the implementorComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementorComments() {
        return implementorComments;
    }

    /**
     * Sets the value of the implementorComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementorComments(String value) {
        this.implementorComments = value;
    }

    /**
     * Gets the value of the independentFieldApplicationEngineer property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getIndependentFieldApplicationEngineer() {
        return independentFieldApplicationEngineer;
    }

    /**
     * Sets the value of the independentFieldApplicationEngineer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setIndependentFieldApplicationEngineer(SpecifiedPartnerDescriptionType value) {
        this.independentFieldApplicationEngineer = value;
    }

    /**
     * Gets the value of the independentSalesRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getIndependentSalesRepresentative() {
        return independentSalesRepresentative;
    }

    /**
     * Sets the value of the independentSalesRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setIndependentSalesRepresentative(SpecifiedPartnerDescriptionType value) {
        this.independentSalesRepresentative = value;
    }

    /**
     * Gets the value of the partConfidencePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartConfidencePercent() {
        return partConfidencePercent;
    }

    /**
     * Sets the value of the partConfidencePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartConfidencePercent(BigDecimal value) {
        this.partConfidencePercent = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
    }

    /**
     * Gets the value of the productProviderSalesRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getProductProviderSalesRepresentative() {
        return productProviderSalesRepresentative;
    }

    /**
     * Sets the value of the productProviderSalesRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setProductProviderSalesRepresentative(SpecifiedPartnerDescriptionType value) {
        this.productProviderSalesRepresentative = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the coreProductRegistrationOrDeviceProductRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coreProductRegistrationOrDeviceProductRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoreProductRegistrationOrDeviceProductRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoreProductRegistration }
     * {@link DeviceProductRegistration }
     * 
     * 
     */
    public List<JAXBElement<?>> getCoreProductRegistrationOrDeviceProductRegistration() {
        if (coreProductRegistrationOrDeviceProductRegistration == null) {
            coreProductRegistrationOrDeviceProductRegistration = new ArrayList<JAXBElement<?>>();
        }
        return this.coreProductRegistrationOrDeviceProductRegistration;
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
        final DesignPartInformationType that = ((DesignPartInformationType) object);
        {
            AttachmentType lhsAttachment;
            lhsAttachment = this.getAttachment();
            AttachmentType rhsAttachment;
            rhsAttachment = that.getAttachment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachment", lhsAttachment), LocatorUtils.property(thatLocator, "attachment", rhsAttachment), lhsAttachment, rhsAttachment, (this.attachment!= null), (that.attachment!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsDemandCreatorFieldApplicationEngineer;
            lhsDemandCreatorFieldApplicationEngineer = this.getDemandCreatorFieldApplicationEngineer();
            SpecifiedPartnerDescriptionType rhsDemandCreatorFieldApplicationEngineer;
            rhsDemandCreatorFieldApplicationEngineer = that.getDemandCreatorFieldApplicationEngineer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "demandCreatorFieldApplicationEngineer", lhsDemandCreatorFieldApplicationEngineer), LocatorUtils.property(thatLocator, "demandCreatorFieldApplicationEngineer", rhsDemandCreatorFieldApplicationEngineer), lhsDemandCreatorFieldApplicationEngineer, rhsDemandCreatorFieldApplicationEngineer, (this.demandCreatorFieldApplicationEngineer!= null), (that.demandCreatorFieldApplicationEngineer!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsDemandCreatorSalesRepresentative;
            lhsDemandCreatorSalesRepresentative = this.getDemandCreatorSalesRepresentative();
            SpecifiedPartnerDescriptionType rhsDemandCreatorSalesRepresentative;
            rhsDemandCreatorSalesRepresentative = that.getDemandCreatorSalesRepresentative();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "demandCreatorSalesRepresentative", lhsDemandCreatorSalesRepresentative), LocatorUtils.property(thatLocator, "demandCreatorSalesRepresentative", rhsDemandCreatorSalesRepresentative), lhsDemandCreatorSalesRepresentative, rhsDemandCreatorSalesRepresentative, (this.demandCreatorSalesRepresentative!= null), (that.demandCreatorSalesRepresentative!= null))) {
                return false;
            }
        }
        {
            DemandCreatorTrackingIdentifier lhsDemandCreatorTrackingIdentifier;
            lhsDemandCreatorTrackingIdentifier = this.getDemandCreatorTrackingIdentifier();
            DemandCreatorTrackingIdentifier rhsDemandCreatorTrackingIdentifier;
            rhsDemandCreatorTrackingIdentifier = that.getDemandCreatorTrackingIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "demandCreatorTrackingIdentifier", lhsDemandCreatorTrackingIdentifier), LocatorUtils.property(thatLocator, "demandCreatorTrackingIdentifier", rhsDemandCreatorTrackingIdentifier), lhsDemandCreatorTrackingIdentifier, rhsDemandCreatorTrackingIdentifier, (this.demandCreatorTrackingIdentifier!= null), (that.demandCreatorTrackingIdentifier!= null))) {
                return false;
            }
        }
        {
            DesignCustomerInformationType lhsDesignCustomerInformation;
            lhsDesignCustomerInformation = this.getDesignCustomerInformation();
            DesignCustomerInformationType rhsDesignCustomerInformation;
            rhsDesignCustomerInformation = that.getDesignCustomerInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designCustomerInformation", lhsDesignCustomerInformation), LocatorUtils.property(thatLocator, "designCustomerInformation", rhsDesignCustomerInformation), lhsDesignCustomerInformation, rhsDesignCustomerInformation, (this.designCustomerInformation!= null), (that.designCustomerInformation!= null))) {
                return false;
            }
        }
        {
            DesignRegistrationIdentification lhsDesignRegistrationIdentification;
            lhsDesignRegistrationIdentification = this.getDesignRegistrationIdentification();
            DesignRegistrationIdentification rhsDesignRegistrationIdentification;
            rhsDesignRegistrationIdentification = that.getDesignRegistrationIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designRegistrationIdentification", lhsDesignRegistrationIdentification), LocatorUtils.property(thatLocator, "designRegistrationIdentification", rhsDesignRegistrationIdentification), lhsDesignRegistrationIdentification, rhsDesignRegistrationIdentification, (this.designRegistrationIdentification!= null), (that.designRegistrationIdentification!= null))) {
                return false;
            }
        }
        {
            GeographicRegion lhsGeographicRegion;
            lhsGeographicRegion = this.getGeographicRegion();
            GeographicRegion rhsGeographicRegion;
            rhsGeographicRegion = that.getGeographicRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geographicRegion", lhsGeographicRegion), LocatorUtils.property(thatLocator, "geographicRegion", rhsGeographicRegion), lhsGeographicRegion, rhsGeographicRegion, (this.geographicRegion!= null), (that.geographicRegion!= null))) {
                return false;
            }
        }
        {
            String lhsImplementorComments;
            lhsImplementorComments = this.getImplementorComments();
            String rhsImplementorComments;
            rhsImplementorComments = that.getImplementorComments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "implementorComments", lhsImplementorComments), LocatorUtils.property(thatLocator, "implementorComments", rhsImplementorComments), lhsImplementorComments, rhsImplementorComments, (this.implementorComments!= null), (that.implementorComments!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsIndependentFieldApplicationEngineer;
            lhsIndependentFieldApplicationEngineer = this.getIndependentFieldApplicationEngineer();
            SpecifiedPartnerDescriptionType rhsIndependentFieldApplicationEngineer;
            rhsIndependentFieldApplicationEngineer = that.getIndependentFieldApplicationEngineer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "independentFieldApplicationEngineer", lhsIndependentFieldApplicationEngineer), LocatorUtils.property(thatLocator, "independentFieldApplicationEngineer", rhsIndependentFieldApplicationEngineer), lhsIndependentFieldApplicationEngineer, rhsIndependentFieldApplicationEngineer, (this.independentFieldApplicationEngineer!= null), (that.independentFieldApplicationEngineer!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsIndependentSalesRepresentative;
            lhsIndependentSalesRepresentative = this.getIndependentSalesRepresentative();
            SpecifiedPartnerDescriptionType rhsIndependentSalesRepresentative;
            rhsIndependentSalesRepresentative = that.getIndependentSalesRepresentative();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "independentSalesRepresentative", lhsIndependentSalesRepresentative), LocatorUtils.property(thatLocator, "independentSalesRepresentative", rhsIndependentSalesRepresentative), lhsIndependentSalesRepresentative, rhsIndependentSalesRepresentative, (this.independentSalesRepresentative!= null), (that.independentSalesRepresentative!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPartConfidencePercent;
            lhsPartConfidencePercent = this.getPartConfidencePercent();
            BigDecimal rhsPartConfidencePercent;
            rhsPartConfidencePercent = that.getPartConfidencePercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partConfidencePercent", lhsPartConfidencePercent), LocatorUtils.property(thatLocator, "partConfidencePercent", rhsPartConfidencePercent), lhsPartConfidencePercent, rhsPartConfidencePercent, (this.partConfidencePercent!= null), (that.partConfidencePercent!= null))) {
                return false;
            }
        }
        {
            PartnerDescription lhsPartnerDescription;
            lhsPartnerDescription = this.getPartnerDescription();
            PartnerDescription rhsPartnerDescription;
            rhsPartnerDescription = that.getPartnerDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, (this.partnerDescription!= null), (that.partnerDescription!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsProductProviderSalesRepresentative;
            lhsProductProviderSalesRepresentative = this.getProductProviderSalesRepresentative();
            SpecifiedPartnerDescriptionType rhsProductProviderSalesRepresentative;
            rhsProductProviderSalesRepresentative = that.getProductProviderSalesRepresentative();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productProviderSalesRepresentative", lhsProductProviderSalesRepresentative), LocatorUtils.property(thatLocator, "productProviderSalesRepresentative", rhsProductProviderSalesRepresentative), lhsProductProviderSalesRepresentative, rhsProductProviderSalesRepresentative, (this.productProviderSalesRepresentative!= null), (that.productProviderSalesRepresentative!= null))) {
                return false;
            }
        }
        {
            ProductQuantity lhsProductQuantity;
            lhsProductQuantity = this.getProductQuantity();
            ProductQuantity rhsProductQuantity;
            rhsProductQuantity = that.getProductQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productQuantity", lhsProductQuantity), LocatorUtils.property(thatLocator, "productQuantity", rhsProductQuantity), lhsProductQuantity, rhsProductQuantity, (this.productQuantity!= null), (that.productQuantity!= null))) {
                return false;
            }
        }
        {
            List<JAXBElement<?>> lhsCoreProductRegistrationOrDeviceProductRegistration;
            lhsCoreProductRegistrationOrDeviceProductRegistration = (((this.coreProductRegistrationOrDeviceProductRegistration!= null)&&(!this.coreProductRegistrationOrDeviceProductRegistration.isEmpty()))?this.getCoreProductRegistrationOrDeviceProductRegistration():null);
            List<JAXBElement<?>> rhsCoreProductRegistrationOrDeviceProductRegistration;
            rhsCoreProductRegistrationOrDeviceProductRegistration = (((that.coreProductRegistrationOrDeviceProductRegistration!= null)&&(!that.coreProductRegistrationOrDeviceProductRegistration.isEmpty()))?that.getCoreProductRegistrationOrDeviceProductRegistration():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coreProductRegistrationOrDeviceProductRegistration", lhsCoreProductRegistrationOrDeviceProductRegistration), LocatorUtils.property(thatLocator, "coreProductRegistrationOrDeviceProductRegistration", rhsCoreProductRegistrationOrDeviceProductRegistration), lhsCoreProductRegistrationOrDeviceProductRegistration, rhsCoreProductRegistrationOrDeviceProductRegistration, ((this.coreProductRegistrationOrDeviceProductRegistration!= null)&&(!this.coreProductRegistrationOrDeviceProductRegistration.isEmpty())), ((that.coreProductRegistrationOrDeviceProductRegistration!= null)&&(!that.coreProductRegistrationOrDeviceProductRegistration.isEmpty())))) {
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
            AttachmentType theAttachment;
            theAttachment = this.getAttachment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachment", theAttachment), currentHashCode, theAttachment, (this.attachment!= null));
        }
        {
            SpecifiedPartnerDescriptionType theDemandCreatorFieldApplicationEngineer;
            theDemandCreatorFieldApplicationEngineer = this.getDemandCreatorFieldApplicationEngineer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "demandCreatorFieldApplicationEngineer", theDemandCreatorFieldApplicationEngineer), currentHashCode, theDemandCreatorFieldApplicationEngineer, (this.demandCreatorFieldApplicationEngineer!= null));
        }
        {
            SpecifiedPartnerDescriptionType theDemandCreatorSalesRepresentative;
            theDemandCreatorSalesRepresentative = this.getDemandCreatorSalesRepresentative();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "demandCreatorSalesRepresentative", theDemandCreatorSalesRepresentative), currentHashCode, theDemandCreatorSalesRepresentative, (this.demandCreatorSalesRepresentative!= null));
        }
        {
            DemandCreatorTrackingIdentifier theDemandCreatorTrackingIdentifier;
            theDemandCreatorTrackingIdentifier = this.getDemandCreatorTrackingIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "demandCreatorTrackingIdentifier", theDemandCreatorTrackingIdentifier), currentHashCode, theDemandCreatorTrackingIdentifier, (this.demandCreatorTrackingIdentifier!= null));
        }
        {
            DesignCustomerInformationType theDesignCustomerInformation;
            theDesignCustomerInformation = this.getDesignCustomerInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designCustomerInformation", theDesignCustomerInformation), currentHashCode, theDesignCustomerInformation, (this.designCustomerInformation!= null));
        }
        {
            DesignRegistrationIdentification theDesignRegistrationIdentification;
            theDesignRegistrationIdentification = this.getDesignRegistrationIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designRegistrationIdentification", theDesignRegistrationIdentification), currentHashCode, theDesignRegistrationIdentification, (this.designRegistrationIdentification!= null));
        }
        {
            GeographicRegion theGeographicRegion;
            theGeographicRegion = this.getGeographicRegion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geographicRegion", theGeographicRegion), currentHashCode, theGeographicRegion, (this.geographicRegion!= null));
        }
        {
            String theImplementorComments;
            theImplementorComments = this.getImplementorComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "implementorComments", theImplementorComments), currentHashCode, theImplementorComments, (this.implementorComments!= null));
        }
        {
            SpecifiedPartnerDescriptionType theIndependentFieldApplicationEngineer;
            theIndependentFieldApplicationEngineer = this.getIndependentFieldApplicationEngineer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "independentFieldApplicationEngineer", theIndependentFieldApplicationEngineer), currentHashCode, theIndependentFieldApplicationEngineer, (this.independentFieldApplicationEngineer!= null));
        }
        {
            SpecifiedPartnerDescriptionType theIndependentSalesRepresentative;
            theIndependentSalesRepresentative = this.getIndependentSalesRepresentative();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "independentSalesRepresentative", theIndependentSalesRepresentative), currentHashCode, theIndependentSalesRepresentative, (this.independentSalesRepresentative!= null));
        }
        {
            BigDecimal thePartConfidencePercent;
            thePartConfidencePercent = this.getPartConfidencePercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partConfidencePercent", thePartConfidencePercent), currentHashCode, thePartConfidencePercent, (this.partConfidencePercent!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            SpecifiedPartnerDescriptionType theProductProviderSalesRepresentative;
            theProductProviderSalesRepresentative = this.getProductProviderSalesRepresentative();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productProviderSalesRepresentative", theProductProviderSalesRepresentative), currentHashCode, theProductProviderSalesRepresentative, (this.productProviderSalesRepresentative!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantity", theProductQuantity), currentHashCode, theProductQuantity, (this.productQuantity!= null));
        }
        {
            List<JAXBElement<?>> theCoreProductRegistrationOrDeviceProductRegistration;
            theCoreProductRegistrationOrDeviceProductRegistration = (((this.coreProductRegistrationOrDeviceProductRegistration!= null)&&(!this.coreProductRegistrationOrDeviceProductRegistration.isEmpty()))?this.getCoreProductRegistrationOrDeviceProductRegistration():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coreProductRegistrationOrDeviceProductRegistration", theCoreProductRegistrationOrDeviceProductRegistration), currentHashCode, theCoreProductRegistrationOrDeviceProductRegistration, ((this.coreProductRegistrationOrDeviceProductRegistration!= null)&&(!this.coreProductRegistrationOrDeviceProductRegistration.isEmpty())));
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
            AttachmentType theAttachment;
            theAttachment = this.getAttachment();
            strategy.appendField(locator, this, "attachment", buffer, theAttachment, (this.attachment!= null));
        }
        {
            SpecifiedPartnerDescriptionType theDemandCreatorFieldApplicationEngineer;
            theDemandCreatorFieldApplicationEngineer = this.getDemandCreatorFieldApplicationEngineer();
            strategy.appendField(locator, this, "demandCreatorFieldApplicationEngineer", buffer, theDemandCreatorFieldApplicationEngineer, (this.demandCreatorFieldApplicationEngineer!= null));
        }
        {
            SpecifiedPartnerDescriptionType theDemandCreatorSalesRepresentative;
            theDemandCreatorSalesRepresentative = this.getDemandCreatorSalesRepresentative();
            strategy.appendField(locator, this, "demandCreatorSalesRepresentative", buffer, theDemandCreatorSalesRepresentative, (this.demandCreatorSalesRepresentative!= null));
        }
        {
            DemandCreatorTrackingIdentifier theDemandCreatorTrackingIdentifier;
            theDemandCreatorTrackingIdentifier = this.getDemandCreatorTrackingIdentifier();
            strategy.appendField(locator, this, "demandCreatorTrackingIdentifier", buffer, theDemandCreatorTrackingIdentifier, (this.demandCreatorTrackingIdentifier!= null));
        }
        {
            DesignCustomerInformationType theDesignCustomerInformation;
            theDesignCustomerInformation = this.getDesignCustomerInformation();
            strategy.appendField(locator, this, "designCustomerInformation", buffer, theDesignCustomerInformation, (this.designCustomerInformation!= null));
        }
        {
            DesignRegistrationIdentification theDesignRegistrationIdentification;
            theDesignRegistrationIdentification = this.getDesignRegistrationIdentification();
            strategy.appendField(locator, this, "designRegistrationIdentification", buffer, theDesignRegistrationIdentification, (this.designRegistrationIdentification!= null));
        }
        {
            GeographicRegion theGeographicRegion;
            theGeographicRegion = this.getGeographicRegion();
            strategy.appendField(locator, this, "geographicRegion", buffer, theGeographicRegion, (this.geographicRegion!= null));
        }
        {
            String theImplementorComments;
            theImplementorComments = this.getImplementorComments();
            strategy.appendField(locator, this, "implementorComments", buffer, theImplementorComments, (this.implementorComments!= null));
        }
        {
            SpecifiedPartnerDescriptionType theIndependentFieldApplicationEngineer;
            theIndependentFieldApplicationEngineer = this.getIndependentFieldApplicationEngineer();
            strategy.appendField(locator, this, "independentFieldApplicationEngineer", buffer, theIndependentFieldApplicationEngineer, (this.independentFieldApplicationEngineer!= null));
        }
        {
            SpecifiedPartnerDescriptionType theIndependentSalesRepresentative;
            theIndependentSalesRepresentative = this.getIndependentSalesRepresentative();
            strategy.appendField(locator, this, "independentSalesRepresentative", buffer, theIndependentSalesRepresentative, (this.independentSalesRepresentative!= null));
        }
        {
            BigDecimal thePartConfidencePercent;
            thePartConfidencePercent = this.getPartConfidencePercent();
            strategy.appendField(locator, this, "partConfidencePercent", buffer, thePartConfidencePercent, (this.partConfidencePercent!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            SpecifiedPartnerDescriptionType theProductProviderSalesRepresentative;
            theProductProviderSalesRepresentative = this.getProductProviderSalesRepresentative();
            strategy.appendField(locator, this, "productProviderSalesRepresentative", buffer, theProductProviderSalesRepresentative, (this.productProviderSalesRepresentative!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            strategy.appendField(locator, this, "productQuantity", buffer, theProductQuantity, (this.productQuantity!= null));
        }
        {
            List<JAXBElement<?>> theCoreProductRegistrationOrDeviceProductRegistration;
            theCoreProductRegistrationOrDeviceProductRegistration = (((this.coreProductRegistrationOrDeviceProductRegistration!= null)&&(!this.coreProductRegistrationOrDeviceProductRegistration.isEmpty()))?this.getCoreProductRegistrationOrDeviceProductRegistration():null);
            strategy.appendField(locator, this, "coreProductRegistrationOrDeviceProductRegistration", buffer, theCoreProductRegistrationOrDeviceProductRegistration, ((this.coreProductRegistrationOrDeviceProductRegistration!= null)&&(!this.coreProductRegistrationOrDeviceProductRegistration.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
