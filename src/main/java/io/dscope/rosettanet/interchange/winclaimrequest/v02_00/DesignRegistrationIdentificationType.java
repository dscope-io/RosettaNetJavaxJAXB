
package io.dscope.rosettanet.interchange.winclaimrequest.v02_00;

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
import io.dscope.rosettanet.domain.marketing.codelist.designwinclassification.v01_00.DesignWinClassification;
import io.dscope.rosettanet.domain.marketing.codelist.projectstatus.v01_02.ProjectStatus;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DemandCreatorTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.GeographicRegion;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.IsDeveloperToolKit;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.RegistrationStatus;
import io.dscope.rosettanet.domain.shared.shared.v01_17.MonetaryAmount;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
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
 * <p>Java class for DesignRegistrationIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignRegistrationIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DemandCreatorTrackingIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:DesignWinClassification:xsd:codelist:01.00}DesignWinClassification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}GeographicRegion" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Invoice" type="{urn:rosettanet:specification:interchange:WinClaimRequest:xsd:schema:02.00}InvoiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}IsDeveloperToolKit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02}ProjectStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}RegistrationStatus" minOccurs="0"/&gt;
 *         &lt;element name="ShippedQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
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
@XmlType(name = "DesignRegistrationIdentificationType", propOrder = {
    "businessDocumentReference",
    "demandCreatorTrackingIdentifier",
    "designWinClassification",
    "geographicRegion",
    "identifier",
    "invoice",
    "isDeveloperToolKit",
    "monetaryAmount",
    "partnerDescription",
    "projectStatus",
    "registrationStatus",
    "shippedQuantity"
})
public class DesignRegistrationIdentificationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "DemandCreatorTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DemandCreatorTrackingIdentifier.class, required = false)
    protected DemandCreatorTrackingIdentifier demandCreatorTrackingIdentifier;
    @XmlElementRef(name = "DesignWinClassification", namespace = "urn:rosettanet:specification:domain:Marketing:DesignWinClassification:xsd:codelist:01.00", type = DesignWinClassification.class)
    protected DesignWinClassification designWinClassification;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = GeographicRegion.class, required = false)
    protected GeographicRegion geographicRegion;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "Invoice")
    protected List<InvoiceType> invoice;
    @XmlElementRef(name = "IsDeveloperToolKit", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = IsDeveloperToolKit.class, required = false)
    protected IsDeveloperToolKit isDeveloperToolKit;
    @XmlElementRef(name = "MonetaryAmount", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.17", type = MonetaryAmount.class, required = false)
    protected MonetaryAmount monetaryAmount;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "ProjectStatus", namespace = "urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02", type = ProjectStatus.class, required = false)
    protected ProjectStatus projectStatus;
    @XmlElementRef(name = "RegistrationStatus", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = RegistrationStatus.class, required = false)
    protected RegistrationStatus registrationStatus;
    @XmlElement(name = "ShippedQuantity")
    protected Float shippedQuantity;
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
     * Gets the value of the designWinClassification property.
     * 
     * @return
     *     possible object is
     *     {@link DesignWinClassification }
     *     
     */
    public DesignWinClassification getDesignWinClassification() {
        return designWinClassification;
    }

    /**
     * Sets the value of the designWinClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignWinClassification }
     *     
     */
    public void setDesignWinClassification(DesignWinClassification value) {
        this.designWinClassification = value;
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
     * Gets the value of the invoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceType }
     * 
     * 
     */
    public List<InvoiceType> getInvoice() {
        if (invoice == null) {
            invoice = new ArrayList<InvoiceType>();
        }
        return this.invoice;
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
     * Gets the value of the monetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getMonetaryAmount() {
        return monetaryAmount;
    }

    /**
     * Sets the value of the monetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setMonetaryAmount(MonetaryAmount value) {
        this.monetaryAmount = value;
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
     * Gets the value of the projectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectStatus }
     *     
     */
    public ProjectStatus getProjectStatus() {
        return projectStatus;
    }

    /**
     * Sets the value of the projectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectStatus }
     *     
     */
    public void setProjectStatus(ProjectStatus value) {
        this.projectStatus = value;
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
     * Gets the value of the shippedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getShippedQuantity() {
        return shippedQuantity;
    }

    /**
     * Sets the value of the shippedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setShippedQuantity(Float value) {
        this.shippedQuantity = value;
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
        final DesignRegistrationIdentificationType that = ((DesignRegistrationIdentificationType) object);
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
            DemandCreatorTrackingIdentifier lhsDemandCreatorTrackingIdentifier;
            lhsDemandCreatorTrackingIdentifier = this.getDemandCreatorTrackingIdentifier();
            DemandCreatorTrackingIdentifier rhsDemandCreatorTrackingIdentifier;
            rhsDemandCreatorTrackingIdentifier = that.getDemandCreatorTrackingIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "demandCreatorTrackingIdentifier", lhsDemandCreatorTrackingIdentifier), LocatorUtils.property(thatLocator, "demandCreatorTrackingIdentifier", rhsDemandCreatorTrackingIdentifier), lhsDemandCreatorTrackingIdentifier, rhsDemandCreatorTrackingIdentifier, (this.demandCreatorTrackingIdentifier!= null), (that.demandCreatorTrackingIdentifier!= null))) {
                return false;
            }
        }
        {
            DesignWinClassification lhsDesignWinClassification;
            lhsDesignWinClassification = this.getDesignWinClassification();
            DesignWinClassification rhsDesignWinClassification;
            rhsDesignWinClassification = that.getDesignWinClassification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designWinClassification", lhsDesignWinClassification), LocatorUtils.property(thatLocator, "designWinClassification", rhsDesignWinClassification), lhsDesignWinClassification, rhsDesignWinClassification, (this.designWinClassification!= null), (that.designWinClassification!= null))) {
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
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            List<InvoiceType> lhsInvoice;
            lhsInvoice = (((this.invoice!= null)&&(!this.invoice.isEmpty()))?this.getInvoice():null);
            List<InvoiceType> rhsInvoice;
            rhsInvoice = (((that.invoice!= null)&&(!that.invoice.isEmpty()))?that.getInvoice():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoice", lhsInvoice), LocatorUtils.property(thatLocator, "invoice", rhsInvoice), lhsInvoice, rhsInvoice, ((this.invoice!= null)&&(!this.invoice.isEmpty())), ((that.invoice!= null)&&(!that.invoice.isEmpty())))) {
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
            MonetaryAmount lhsMonetaryAmount;
            lhsMonetaryAmount = this.getMonetaryAmount();
            MonetaryAmount rhsMonetaryAmount;
            rhsMonetaryAmount = that.getMonetaryAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monetaryAmount", lhsMonetaryAmount), LocatorUtils.property(thatLocator, "monetaryAmount", rhsMonetaryAmount), lhsMonetaryAmount, rhsMonetaryAmount, (this.monetaryAmount!= null), (that.monetaryAmount!= null))) {
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
            ProjectStatus lhsProjectStatus;
            lhsProjectStatus = this.getProjectStatus();
            ProjectStatus rhsProjectStatus;
            rhsProjectStatus = that.getProjectStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projectStatus", lhsProjectStatus), LocatorUtils.property(thatLocator, "projectStatus", rhsProjectStatus), lhsProjectStatus, rhsProjectStatus, (this.projectStatus!= null), (that.projectStatus!= null))) {
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
            Float lhsShippedQuantity;
            lhsShippedQuantity = this.getShippedQuantity();
            Float rhsShippedQuantity;
            rhsShippedQuantity = that.getShippedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippedQuantity", lhsShippedQuantity), LocatorUtils.property(thatLocator, "shippedQuantity", rhsShippedQuantity), lhsShippedQuantity, rhsShippedQuantity, (this.shippedQuantity!= null), (that.shippedQuantity!= null))) {
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
            DemandCreatorTrackingIdentifier theDemandCreatorTrackingIdentifier;
            theDemandCreatorTrackingIdentifier = this.getDemandCreatorTrackingIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "demandCreatorTrackingIdentifier", theDemandCreatorTrackingIdentifier), currentHashCode, theDemandCreatorTrackingIdentifier, (this.demandCreatorTrackingIdentifier!= null));
        }
        {
            DesignWinClassification theDesignWinClassification;
            theDesignWinClassification = this.getDesignWinClassification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designWinClassification", theDesignWinClassification), currentHashCode, theDesignWinClassification, (this.designWinClassification!= null));
        }
        {
            GeographicRegion theGeographicRegion;
            theGeographicRegion = this.getGeographicRegion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geographicRegion", theGeographicRegion), currentHashCode, theGeographicRegion, (this.geographicRegion!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            List<InvoiceType> theInvoice;
            theInvoice = (((this.invoice!= null)&&(!this.invoice.isEmpty()))?this.getInvoice():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoice", theInvoice), currentHashCode, theInvoice, ((this.invoice!= null)&&(!this.invoice.isEmpty())));
        }
        {
            IsDeveloperToolKit theIsDeveloperToolKit;
            theIsDeveloperToolKit = this.getIsDeveloperToolKit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isDeveloperToolKit", theIsDeveloperToolKit), currentHashCode, theIsDeveloperToolKit, (this.isDeveloperToolKit!= null));
        }
        {
            MonetaryAmount theMonetaryAmount;
            theMonetaryAmount = this.getMonetaryAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monetaryAmount", theMonetaryAmount), currentHashCode, theMonetaryAmount, (this.monetaryAmount!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            ProjectStatus theProjectStatus;
            theProjectStatus = this.getProjectStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "projectStatus", theProjectStatus), currentHashCode, theProjectStatus, (this.projectStatus!= null));
        }
        {
            RegistrationStatus theRegistrationStatus;
            theRegistrationStatus = this.getRegistrationStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationStatus", theRegistrationStatus), currentHashCode, theRegistrationStatus, (this.registrationStatus!= null));
        }
        {
            Float theShippedQuantity;
            theShippedQuantity = this.getShippedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippedQuantity", theShippedQuantity), currentHashCode, theShippedQuantity, (this.shippedQuantity!= null));
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
            DemandCreatorTrackingIdentifier theDemandCreatorTrackingIdentifier;
            theDemandCreatorTrackingIdentifier = this.getDemandCreatorTrackingIdentifier();
            strategy.appendField(locator, this, "demandCreatorTrackingIdentifier", buffer, theDemandCreatorTrackingIdentifier, (this.demandCreatorTrackingIdentifier!= null));
        }
        {
            DesignWinClassification theDesignWinClassification;
            theDesignWinClassification = this.getDesignWinClassification();
            strategy.appendField(locator, this, "designWinClassification", buffer, theDesignWinClassification, (this.designWinClassification!= null));
        }
        {
            GeographicRegion theGeographicRegion;
            theGeographicRegion = this.getGeographicRegion();
            strategy.appendField(locator, this, "geographicRegion", buffer, theGeographicRegion, (this.geographicRegion!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            List<InvoiceType> theInvoice;
            theInvoice = (((this.invoice!= null)&&(!this.invoice.isEmpty()))?this.getInvoice():null);
            strategy.appendField(locator, this, "invoice", buffer, theInvoice, ((this.invoice!= null)&&(!this.invoice.isEmpty())));
        }
        {
            IsDeveloperToolKit theIsDeveloperToolKit;
            theIsDeveloperToolKit = this.getIsDeveloperToolKit();
            strategy.appendField(locator, this, "isDeveloperToolKit", buffer, theIsDeveloperToolKit, (this.isDeveloperToolKit!= null));
        }
        {
            MonetaryAmount theMonetaryAmount;
            theMonetaryAmount = this.getMonetaryAmount();
            strategy.appendField(locator, this, "monetaryAmount", buffer, theMonetaryAmount, (this.monetaryAmount!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            ProjectStatus theProjectStatus;
            theProjectStatus = this.getProjectStatus();
            strategy.appendField(locator, this, "projectStatus", buffer, theProjectStatus, (this.projectStatus!= null));
        }
        {
            RegistrationStatus theRegistrationStatus;
            theRegistrationStatus = this.getRegistrationStatus();
            strategy.appendField(locator, this, "registrationStatus", buffer, theRegistrationStatus, (this.registrationStatus!= null));
        }
        {
            Float theShippedQuantity;
            theShippedQuantity = this.getShippedQuantity();
            strategy.appendField(locator, this, "shippedQuantity", buffer, theShippedQuantity, (this.shippedQuantity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
