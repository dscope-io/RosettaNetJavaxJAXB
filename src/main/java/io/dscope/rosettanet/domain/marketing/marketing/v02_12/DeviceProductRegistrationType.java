
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import java.math.BigDecimal;
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
import io.dscope.rosettanet.domain.shared.shared.v01_10.ProductPricingType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.locations.v01_04.AlternativeIdentifier;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_04.TextualDescription;
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
 * <p>Java class for DeviceProductRegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceProductRegistrationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}AlternativeIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DebitAuthorizationNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DesignCompetitorInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}IsDeveloperToolKit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}IsPartSelected"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}IsRegisterable"/&gt;
 *         &lt;element name="MinimumOrderQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}ProductProviderLeadDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}ProductProviderLeadTrackingIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationBonusPercent" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationStatus" minOccurs="0"/&gt;
 *         &lt;element name="SuggestedResalePrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescription" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductPricingType" minOccurs="0"/&gt;
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
@XmlType(name = "DeviceProductRegistrationType", propOrder = {
    "alternativeIdentifier",
    "businessDocumentReference",
    "debitAuthorizationNumber",
    "designCompetitorInformation",
    "isDeveloperToolKit",
    "isPartSelected",
    "isRegisterable",
    "minimumOrderQuantity",
    "productIdentification",
    "productProviderLeadDescription",
    "productProviderLeadTrackingIdentifier",
    "registrationBonusPercent",
    "registrationStatus",
    "suggestedResalePrice",
    "textualDescription",
    "unitPrice"
})
public class DeviceProductRegistrationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = AlternativeIdentifier.class, required = false)
    protected AlternativeIdentifier alternativeIdentifier;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "DebitAuthorizationNumber", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DebitAuthorizationNumber.class, required = false)
    protected DebitAuthorizationNumber debitAuthorizationNumber;
    @XmlElementRef(name = "DesignCompetitorInformation", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DesignCompetitorInformation.class, required = false)
    protected List<DesignCompetitorInformation> designCompetitorInformation;
    @XmlElementRef(name = "IsDeveloperToolKit", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = IsDeveloperToolKit.class, required = false)
    protected IsDeveloperToolKit isDeveloperToolKit;
    @XmlElementRef(name = "IsPartSelected", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = IsPartSelected.class)
    protected IsPartSelected isPartSelected;
    @XmlElementRef(name = "IsRegisterable", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = IsRegisterable.class)
    protected IsRegisterable isRegisterable;
    @XmlElement(name = "MinimumOrderQuantity")
    protected Float minimumOrderQuantity;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "ProductProviderLeadDescription", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = ProductProviderLeadDescription.class, required = false)
    protected ProductProviderLeadDescription productProviderLeadDescription;
    @XmlElementRef(name = "ProductProviderLeadTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = ProductProviderLeadTrackingIdentifier.class, required = false)
    protected ProductProviderLeadTrackingIdentifier productProviderLeadTrackingIdentifier;
    @XmlElement(name = "RegistrationBonusPercent")
    protected BigDecimal registrationBonusPercent;
    @XmlElementRef(name = "RegistrationStatus", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = RegistrationStatus.class, required = false)
    protected RegistrationStatus registrationStatus;
    @XmlElement(name = "SuggestedResalePrice")
    protected ProductPricingType suggestedResalePrice;
    @XmlElementRef(name = "TextualDescription", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = TextualDescription.class, required = false)
    protected TextualDescription textualDescription;
    @XmlElement(name = "UnitPrice")
    protected ProductPricingType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternativeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeIdentifier }
     *     
     */
    public AlternativeIdentifier getAlternativeIdentifier() {
        return alternativeIdentifier;
    }

    /**
     * Sets the value of the alternativeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeIdentifier }
     *     
     */
    public void setAlternativeIdentifier(AlternativeIdentifier value) {
        this.alternativeIdentifier = value;
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
     * Gets the value of the debitAuthorizationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorizationNumber }
     *     
     */
    public DebitAuthorizationNumber getDebitAuthorizationNumber() {
        return debitAuthorizationNumber;
    }

    /**
     * Sets the value of the debitAuthorizationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorizationNumber }
     *     
     */
    public void setDebitAuthorizationNumber(DebitAuthorizationNumber value) {
        this.debitAuthorizationNumber = value;
    }

    /**
     * Gets the value of the designCompetitorInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designCompetitorInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignCompetitorInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignCompetitorInformation }
     * 
     * 
     */
    public List<DesignCompetitorInformation> getDesignCompetitorInformation() {
        if (designCompetitorInformation == null) {
            designCompetitorInformation = new ArrayList<DesignCompetitorInformation>();
        }
        return this.designCompetitorInformation;
    }

    /**
     * Gets the value of the isDeveloperToolKit property.
     * 
     * @return
     *     possible object is
     *     {@link IsDeveloperToolKit }
     *     
     */
    public IsDeveloperToolKit getIsDeveloperToolKit() {
        return isDeveloperToolKit;
    }

    /**
     * Sets the value of the isDeveloperToolKit property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsDeveloperToolKit }
     *     
     */
    public void setIsDeveloperToolKit(IsDeveloperToolKit value) {
        this.isDeveloperToolKit = value;
    }

    /**
     * Gets the value of the isPartSelected property.
     * 
     * @return
     *     possible object is
     *     {@link IsPartSelected }
     *     
     */
    public IsPartSelected getIsPartSelected() {
        return isPartSelected;
    }

    /**
     * Sets the value of the isPartSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsPartSelected }
     *     
     */
    public void setIsPartSelected(IsPartSelected value) {
        this.isPartSelected = value;
    }

    /**
     * Gets the value of the isRegisterable property.
     * 
     * @return
     *     possible object is
     *     {@link IsRegisterable }
     *     
     */
    public IsRegisterable getIsRegisterable() {
        return isRegisterable;
    }

    /**
     * Sets the value of the isRegisterable property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsRegisterable }
     *     
     */
    public void setIsRegisterable(IsRegisterable value) {
        this.isRegisterable = value;
    }

    /**
     * Gets the value of the minimumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the value of the minimumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumOrderQuantity(Float value) {
        this.minimumOrderQuantity = value;
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
     * Gets the value of the productProviderLeadDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ProductProviderLeadDescription }
     *     
     */
    public ProductProviderLeadDescription getProductProviderLeadDescription() {
        return productProviderLeadDescription;
    }

    /**
     * Sets the value of the productProviderLeadDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductProviderLeadDescription }
     *     
     */
    public void setProductProviderLeadDescription(ProductProviderLeadDescription value) {
        this.productProviderLeadDescription = value;
    }

    /**
     * Gets the value of the productProviderLeadTrackingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProductProviderLeadTrackingIdentifier }
     *     
     */
    public ProductProviderLeadTrackingIdentifier getProductProviderLeadTrackingIdentifier() {
        return productProviderLeadTrackingIdentifier;
    }

    /**
     * Sets the value of the productProviderLeadTrackingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductProviderLeadTrackingIdentifier }
     *     
     */
    public void setProductProviderLeadTrackingIdentifier(ProductProviderLeadTrackingIdentifier value) {
        this.productProviderLeadTrackingIdentifier = value;
    }

    /**
     * Gets the value of the registrationBonusPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegistrationBonusPercent() {
        return registrationBonusPercent;
    }

    /**
     * Sets the value of the registrationBonusPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegistrationBonusPercent(BigDecimal value) {
        this.registrationBonusPercent = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationStatus }
     *     
     */
    public RegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationStatus }
     *     
     */
    public void setRegistrationStatus(RegistrationStatus value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the suggestedResalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getSuggestedResalePrice() {
        return suggestedResalePrice;
    }

    /**
     * Sets the value of the suggestedResalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setSuggestedResalePrice(ProductPricingType value) {
        this.suggestedResalePrice = value;
    }

    /**
     * Gets the value of the textualDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescription }
     *     
     */
    public TextualDescription getTextualDescription() {
        return textualDescription;
    }

    /**
     * Sets the value of the textualDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescription }
     *     
     */
    public void setTextualDescription(TextualDescription value) {
        this.textualDescription = value;
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
        final DeviceProductRegistrationType that = ((DeviceProductRegistrationType) object);
        {
            AlternativeIdentifier lhsAlternativeIdentifier;
            lhsAlternativeIdentifier = this.getAlternativeIdentifier();
            AlternativeIdentifier rhsAlternativeIdentifier;
            rhsAlternativeIdentifier = that.getAlternativeIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativeIdentifier", lhsAlternativeIdentifier), LocatorUtils.property(thatLocator, "alternativeIdentifier", rhsAlternativeIdentifier), lhsAlternativeIdentifier, rhsAlternativeIdentifier, (this.alternativeIdentifier!= null), (that.alternativeIdentifier!= null))) {
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
            DebitAuthorizationNumber lhsDebitAuthorizationNumber;
            lhsDebitAuthorizationNumber = this.getDebitAuthorizationNumber();
            DebitAuthorizationNumber rhsDebitAuthorizationNumber;
            rhsDebitAuthorizationNumber = that.getDebitAuthorizationNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debitAuthorizationNumber", lhsDebitAuthorizationNumber), LocatorUtils.property(thatLocator, "debitAuthorizationNumber", rhsDebitAuthorizationNumber), lhsDebitAuthorizationNumber, rhsDebitAuthorizationNumber, (this.debitAuthorizationNumber!= null), (that.debitAuthorizationNumber!= null))) {
                return false;
            }
        }
        {
            List<DesignCompetitorInformation> lhsDesignCompetitorInformation;
            lhsDesignCompetitorInformation = (((this.designCompetitorInformation!= null)&&(!this.designCompetitorInformation.isEmpty()))?this.getDesignCompetitorInformation():null);
            List<DesignCompetitorInformation> rhsDesignCompetitorInformation;
            rhsDesignCompetitorInformation = (((that.designCompetitorInformation!= null)&&(!that.designCompetitorInformation.isEmpty()))?that.getDesignCompetitorInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designCompetitorInformation", lhsDesignCompetitorInformation), LocatorUtils.property(thatLocator, "designCompetitorInformation", rhsDesignCompetitorInformation), lhsDesignCompetitorInformation, rhsDesignCompetitorInformation, ((this.designCompetitorInformation!= null)&&(!this.designCompetitorInformation.isEmpty())), ((that.designCompetitorInformation!= null)&&(!that.designCompetitorInformation.isEmpty())))) {
                return false;
            }
        }
        {
            IsDeveloperToolKit lhsIsDeveloperToolKit;
            lhsIsDeveloperToolKit = this.getIsDeveloperToolKit();
            IsDeveloperToolKit rhsIsDeveloperToolKit;
            rhsIsDeveloperToolKit = that.getIsDeveloperToolKit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isDeveloperToolKit", lhsIsDeveloperToolKit), LocatorUtils.property(thatLocator, "isDeveloperToolKit", rhsIsDeveloperToolKit), lhsIsDeveloperToolKit, rhsIsDeveloperToolKit, (this.isDeveloperToolKit!= null), (that.isDeveloperToolKit!= null))) {
                return false;
            }
        }
        {
            IsPartSelected lhsIsPartSelected;
            lhsIsPartSelected = this.getIsPartSelected();
            IsPartSelected rhsIsPartSelected;
            rhsIsPartSelected = that.getIsPartSelected();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isPartSelected", lhsIsPartSelected), LocatorUtils.property(thatLocator, "isPartSelected", rhsIsPartSelected), lhsIsPartSelected, rhsIsPartSelected, (this.isPartSelected!= null), (that.isPartSelected!= null))) {
                return false;
            }
        }
        {
            IsRegisterable lhsIsRegisterable;
            lhsIsRegisterable = this.getIsRegisterable();
            IsRegisterable rhsIsRegisterable;
            rhsIsRegisterable = that.getIsRegisterable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRegisterable", lhsIsRegisterable), LocatorUtils.property(thatLocator, "isRegisterable", rhsIsRegisterable), lhsIsRegisterable, rhsIsRegisterable, (this.isRegisterable!= null), (that.isRegisterable!= null))) {
                return false;
            }
        }
        {
            Float lhsMinimumOrderQuantity;
            lhsMinimumOrderQuantity = this.getMinimumOrderQuantity();
            Float rhsMinimumOrderQuantity;
            rhsMinimumOrderQuantity = that.getMinimumOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumOrderQuantity", lhsMinimumOrderQuantity), LocatorUtils.property(thatLocator, "minimumOrderQuantity", rhsMinimumOrderQuantity), lhsMinimumOrderQuantity, rhsMinimumOrderQuantity, (this.minimumOrderQuantity!= null), (that.minimumOrderQuantity!= null))) {
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
            ProductProviderLeadDescription lhsProductProviderLeadDescription;
            lhsProductProviderLeadDescription = this.getProductProviderLeadDescription();
            ProductProviderLeadDescription rhsProductProviderLeadDescription;
            rhsProductProviderLeadDescription = that.getProductProviderLeadDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productProviderLeadDescription", lhsProductProviderLeadDescription), LocatorUtils.property(thatLocator, "productProviderLeadDescription", rhsProductProviderLeadDescription), lhsProductProviderLeadDescription, rhsProductProviderLeadDescription, (this.productProviderLeadDescription!= null), (that.productProviderLeadDescription!= null))) {
                return false;
            }
        }
        {
            ProductProviderLeadTrackingIdentifier lhsProductProviderLeadTrackingIdentifier;
            lhsProductProviderLeadTrackingIdentifier = this.getProductProviderLeadTrackingIdentifier();
            ProductProviderLeadTrackingIdentifier rhsProductProviderLeadTrackingIdentifier;
            rhsProductProviderLeadTrackingIdentifier = that.getProductProviderLeadTrackingIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productProviderLeadTrackingIdentifier", lhsProductProviderLeadTrackingIdentifier), LocatorUtils.property(thatLocator, "productProviderLeadTrackingIdentifier", rhsProductProviderLeadTrackingIdentifier), lhsProductProviderLeadTrackingIdentifier, rhsProductProviderLeadTrackingIdentifier, (this.productProviderLeadTrackingIdentifier!= null), (that.productProviderLeadTrackingIdentifier!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsRegistrationBonusPercent;
            lhsRegistrationBonusPercent = this.getRegistrationBonusPercent();
            BigDecimal rhsRegistrationBonusPercent;
            rhsRegistrationBonusPercent = that.getRegistrationBonusPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationBonusPercent", lhsRegistrationBonusPercent), LocatorUtils.property(thatLocator, "registrationBonusPercent", rhsRegistrationBonusPercent), lhsRegistrationBonusPercent, rhsRegistrationBonusPercent, (this.registrationBonusPercent!= null), (that.registrationBonusPercent!= null))) {
                return false;
            }
        }
        {
            RegistrationStatus lhsRegistrationStatus;
            lhsRegistrationStatus = this.getRegistrationStatus();
            RegistrationStatus rhsRegistrationStatus;
            rhsRegistrationStatus = that.getRegistrationStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationStatus", lhsRegistrationStatus), LocatorUtils.property(thatLocator, "registrationStatus", rhsRegistrationStatus), lhsRegistrationStatus, rhsRegistrationStatus, (this.registrationStatus!= null), (that.registrationStatus!= null))) {
                return false;
            }
        }
        {
            ProductPricingType lhsSuggestedResalePrice;
            lhsSuggestedResalePrice = this.getSuggestedResalePrice();
            ProductPricingType rhsSuggestedResalePrice;
            rhsSuggestedResalePrice = that.getSuggestedResalePrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suggestedResalePrice", lhsSuggestedResalePrice), LocatorUtils.property(thatLocator, "suggestedResalePrice", rhsSuggestedResalePrice), lhsSuggestedResalePrice, rhsSuggestedResalePrice, (this.suggestedResalePrice!= null), (that.suggestedResalePrice!= null))) {
                return false;
            }
        }
        {
            TextualDescription lhsTextualDescription;
            lhsTextualDescription = this.getTextualDescription();
            TextualDescription rhsTextualDescription;
            rhsTextualDescription = that.getTextualDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "textualDescription", lhsTextualDescription), LocatorUtils.property(thatLocator, "textualDescription", rhsTextualDescription), lhsTextualDescription, rhsTextualDescription, (this.textualDescription!= null), (that.textualDescription!= null))) {
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
            AlternativeIdentifier theAlternativeIdentifier;
            theAlternativeIdentifier = this.getAlternativeIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativeIdentifier", theAlternativeIdentifier), currentHashCode, theAlternativeIdentifier, (this.alternativeIdentifier!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            DebitAuthorizationNumber theDebitAuthorizationNumber;
            theDebitAuthorizationNumber = this.getDebitAuthorizationNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debitAuthorizationNumber", theDebitAuthorizationNumber), currentHashCode, theDebitAuthorizationNumber, (this.debitAuthorizationNumber!= null));
        }
        {
            List<DesignCompetitorInformation> theDesignCompetitorInformation;
            theDesignCompetitorInformation = (((this.designCompetitorInformation!= null)&&(!this.designCompetitorInformation.isEmpty()))?this.getDesignCompetitorInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designCompetitorInformation", theDesignCompetitorInformation), currentHashCode, theDesignCompetitorInformation, ((this.designCompetitorInformation!= null)&&(!this.designCompetitorInformation.isEmpty())));
        }
        {
            IsDeveloperToolKit theIsDeveloperToolKit;
            theIsDeveloperToolKit = this.getIsDeveloperToolKit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isDeveloperToolKit", theIsDeveloperToolKit), currentHashCode, theIsDeveloperToolKit, (this.isDeveloperToolKit!= null));
        }
        {
            IsPartSelected theIsPartSelected;
            theIsPartSelected = this.getIsPartSelected();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isPartSelected", theIsPartSelected), currentHashCode, theIsPartSelected, (this.isPartSelected!= null));
        }
        {
            IsRegisterable theIsRegisterable;
            theIsRegisterable = this.getIsRegisterable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRegisterable", theIsRegisterable), currentHashCode, theIsRegisterable, (this.isRegisterable!= null));
        }
        {
            Float theMinimumOrderQuantity;
            theMinimumOrderQuantity = this.getMinimumOrderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumOrderQuantity", theMinimumOrderQuantity), currentHashCode, theMinimumOrderQuantity, (this.minimumOrderQuantity!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            ProductProviderLeadDescription theProductProviderLeadDescription;
            theProductProviderLeadDescription = this.getProductProviderLeadDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productProviderLeadDescription", theProductProviderLeadDescription), currentHashCode, theProductProviderLeadDescription, (this.productProviderLeadDescription!= null));
        }
        {
            ProductProviderLeadTrackingIdentifier theProductProviderLeadTrackingIdentifier;
            theProductProviderLeadTrackingIdentifier = this.getProductProviderLeadTrackingIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productProviderLeadTrackingIdentifier", theProductProviderLeadTrackingIdentifier), currentHashCode, theProductProviderLeadTrackingIdentifier, (this.productProviderLeadTrackingIdentifier!= null));
        }
        {
            BigDecimal theRegistrationBonusPercent;
            theRegistrationBonusPercent = this.getRegistrationBonusPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationBonusPercent", theRegistrationBonusPercent), currentHashCode, theRegistrationBonusPercent, (this.registrationBonusPercent!= null));
        }
        {
            RegistrationStatus theRegistrationStatus;
            theRegistrationStatus = this.getRegistrationStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationStatus", theRegistrationStatus), currentHashCode, theRegistrationStatus, (this.registrationStatus!= null));
        }
        {
            ProductPricingType theSuggestedResalePrice;
            theSuggestedResalePrice = this.getSuggestedResalePrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suggestedResalePrice", theSuggestedResalePrice), currentHashCode, theSuggestedResalePrice, (this.suggestedResalePrice!= null));
        }
        {
            TextualDescription theTextualDescription;
            theTextualDescription = this.getTextualDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "textualDescription", theTextualDescription), currentHashCode, theTextualDescription, (this.textualDescription!= null));
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
            AlternativeIdentifier theAlternativeIdentifier;
            theAlternativeIdentifier = this.getAlternativeIdentifier();
            strategy.appendField(locator, this, "alternativeIdentifier", buffer, theAlternativeIdentifier, (this.alternativeIdentifier!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            DebitAuthorizationNumber theDebitAuthorizationNumber;
            theDebitAuthorizationNumber = this.getDebitAuthorizationNumber();
            strategy.appendField(locator, this, "debitAuthorizationNumber", buffer, theDebitAuthorizationNumber, (this.debitAuthorizationNumber!= null));
        }
        {
            List<DesignCompetitorInformation> theDesignCompetitorInformation;
            theDesignCompetitorInformation = (((this.designCompetitorInformation!= null)&&(!this.designCompetitorInformation.isEmpty()))?this.getDesignCompetitorInformation():null);
            strategy.appendField(locator, this, "designCompetitorInformation", buffer, theDesignCompetitorInformation, ((this.designCompetitorInformation!= null)&&(!this.designCompetitorInformation.isEmpty())));
        }
        {
            IsDeveloperToolKit theIsDeveloperToolKit;
            theIsDeveloperToolKit = this.getIsDeveloperToolKit();
            strategy.appendField(locator, this, "isDeveloperToolKit", buffer, theIsDeveloperToolKit, (this.isDeveloperToolKit!= null));
        }
        {
            IsPartSelected theIsPartSelected;
            theIsPartSelected = this.getIsPartSelected();
            strategy.appendField(locator, this, "isPartSelected", buffer, theIsPartSelected, (this.isPartSelected!= null));
        }
        {
            IsRegisterable theIsRegisterable;
            theIsRegisterable = this.getIsRegisterable();
            strategy.appendField(locator, this, "isRegisterable", buffer, theIsRegisterable, (this.isRegisterable!= null));
        }
        {
            Float theMinimumOrderQuantity;
            theMinimumOrderQuantity = this.getMinimumOrderQuantity();
            strategy.appendField(locator, this, "minimumOrderQuantity", buffer, theMinimumOrderQuantity, (this.minimumOrderQuantity!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            ProductProviderLeadDescription theProductProviderLeadDescription;
            theProductProviderLeadDescription = this.getProductProviderLeadDescription();
            strategy.appendField(locator, this, "productProviderLeadDescription", buffer, theProductProviderLeadDescription, (this.productProviderLeadDescription!= null));
        }
        {
            ProductProviderLeadTrackingIdentifier theProductProviderLeadTrackingIdentifier;
            theProductProviderLeadTrackingIdentifier = this.getProductProviderLeadTrackingIdentifier();
            strategy.appendField(locator, this, "productProviderLeadTrackingIdentifier", buffer, theProductProviderLeadTrackingIdentifier, (this.productProviderLeadTrackingIdentifier!= null));
        }
        {
            BigDecimal theRegistrationBonusPercent;
            theRegistrationBonusPercent = this.getRegistrationBonusPercent();
            strategy.appendField(locator, this, "registrationBonusPercent", buffer, theRegistrationBonusPercent, (this.registrationBonusPercent!= null));
        }
        {
            RegistrationStatus theRegistrationStatus;
            theRegistrationStatus = this.getRegistrationStatus();
            strategy.appendField(locator, this, "registrationStatus", buffer, theRegistrationStatus, (this.registrationStatus!= null));
        }
        {
            ProductPricingType theSuggestedResalePrice;
            theSuggestedResalePrice = this.getSuggestedResalePrice();
            strategy.appendField(locator, this, "suggestedResalePrice", buffer, theSuggestedResalePrice, (this.suggestedResalePrice!= null));
        }
        {
            TextualDescription theTextualDescription;
            theTextualDescription = this.getTextualDescription();
            strategy.appendField(locator, this, "textualDescription", buffer, theTextualDescription, (this.textualDescription!= null));
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
