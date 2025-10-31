
package io.dscope.rosettanet.interchange.designregistrationrequest.v01_00;

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
import io.dscope.rosettanet.domain.marketing.codelist.registrationcomplexitylevel.v01_02.RegistrationComplexityLevel;
import io.dscope.rosettanet.domain.marketing.codelist.registrationinvolvementlevel.v01_02.RegistrationInvolvementLevel;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DemandCreatorTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DesignRegistrationIdentification;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.GeographicRegion;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.ProductProviderLeadDescription;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.ProductProviderLeadTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.RegistrationStatus;
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
 * <p>Java class for DesignAssemblyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignAssemblyInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssemblyDescription" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DemandCreatorTrackingIdentifier"/&gt;
 *         &lt;element name="DesignAssemblyInformation" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType"/&gt;
 *         &lt;element name="DesignCustomerInformation" type="{urn:rosettanet:specification:interchange:DesignRegistrationRequestNotification:xsd:schema:01.00}DesignCustomerInformationType"/&gt;
 *         &lt;element name="DesignPartInformation" type="{urn:rosettanet:specification:interchange:DesignRegistrationRequestNotification:xsd:schema:01.00}DesignPartInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DesignRegistrationIdentification" minOccurs="0"/&gt;
 *         &lt;element name="Estimated2ndYearAssemblyQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="Estimated3rdYearAssemblyQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedLifetimeQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}GeographicRegion" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductionDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}ProductProviderLeadDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}ProductProviderLeadTrackingIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="PrototypeDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02}RegistrationComplexityLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02}RegistrationInvolvementLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}RegistrationStatus" minOccurs="0"/&gt;
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
@XmlType(name = "DesignAssemblyInformationType", propOrder = {
    "assemblyDescription",
    "demandCreatorTrackingIdentifier",
    "designAssemblyInformation",
    "designCustomerInformation",
    "designPartInformation",
    "designRegistrationIdentification",
    "estimated2NdYearAssemblyQuantity",
    "estimated3RdYearAssemblyQuantity",
    "estimatedLifetimeQuantity",
    "geographicRegion",
    "name",
    "productionDate",
    "productProviderLeadDescription",
    "productProviderLeadTrackingIdentifier",
    "prototypeDate",
    "registrationComplexityLevel",
    "registrationInvolvementLevel",
    "registrationStatus"
})
public class DesignAssemblyInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AssemblyDescription", required = true)
    protected TextualDescriptionType assemblyDescription;
    @XmlElementRef(name = "DemandCreatorTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DemandCreatorTrackingIdentifier.class)
    protected DemandCreatorTrackingIdentifier demandCreatorTrackingIdentifier;
    @XmlElement(name = "DesignAssemblyInformation")
    protected float designAssemblyInformation;
    @XmlElement(name = "DesignCustomerInformation", required = true)
    protected DesignCustomerInformationType designCustomerInformation;
    @XmlElement(name = "DesignPartInformation", required = true)
    protected List<DesignPartInformationType> designPartInformation;
    @XmlElementRef(name = "DesignRegistrationIdentification", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DesignRegistrationIdentification.class, required = false)
    protected DesignRegistrationIdentification designRegistrationIdentification;
    @XmlElement(name = "Estimated2ndYearAssemblyQuantity")
    protected Float estimated2NdYearAssemblyQuantity;
    @XmlElement(name = "Estimated3rdYearAssemblyQuantity")
    protected Float estimated3RdYearAssemblyQuantity;
    @XmlElement(name = "EstimatedLifetimeQuantity")
    protected Float estimatedLifetimeQuantity;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = GeographicRegion.class, required = false)
    protected GeographicRegion geographicRegion;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ProductionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar productionDate;
    @XmlElementRef(name = "ProductProviderLeadDescription", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = ProductProviderLeadDescription.class, required = false)
    protected ProductProviderLeadDescription productProviderLeadDescription;
    @XmlElementRef(name = "ProductProviderLeadTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = ProductProviderLeadTrackingIdentifier.class, required = false)
    protected ProductProviderLeadTrackingIdentifier productProviderLeadTrackingIdentifier;
    @XmlElement(name = "PrototypeDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prototypeDate;
    @XmlElementRef(name = "RegistrationComplexityLevel", namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02", type = RegistrationComplexityLevel.class, required = false)
    protected RegistrationComplexityLevel registrationComplexityLevel;
    @XmlElementRef(name = "RegistrationInvolvementLevel", namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02", type = RegistrationInvolvementLevel.class, required = false)
    protected RegistrationInvolvementLevel registrationInvolvementLevel;
    @XmlElementRef(name = "RegistrationStatus", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = RegistrationStatus.class, required = false)
    protected RegistrationStatus registrationStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the assemblyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescriptionType }
     *     
     */
    public TextualDescriptionType getAssemblyDescription() {
        return assemblyDescription;
    }

    /**
     * Sets the value of the assemblyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescriptionType }
     *     
     */
    public void setAssemblyDescription(TextualDescriptionType value) {
        this.assemblyDescription = value;
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
     * Gets the value of the designAssemblyInformation property.
     * 
     */
    public float getDesignAssemblyInformation() {
        return designAssemblyInformation;
    }

    /**
     * Sets the value of the designAssemblyInformation property.
     * 
     */
    public void setDesignAssemblyInformation(float value) {
        this.designAssemblyInformation = value;
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
     * Gets the value of the designPartInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designPartInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignPartInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignPartInformationType }
     * 
     * 
     */
    public List<DesignPartInformationType> getDesignPartInformation() {
        if (designPartInformation == null) {
            designPartInformation = new ArrayList<DesignPartInformationType>();
        }
        return this.designPartInformation;
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
     * Gets the value of the estimated2NdYearAssemblyQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEstimated2NdYearAssemblyQuantity() {
        return estimated2NdYearAssemblyQuantity;
    }

    /**
     * Sets the value of the estimated2NdYearAssemblyQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEstimated2NdYearAssemblyQuantity(Float value) {
        this.estimated2NdYearAssemblyQuantity = value;
    }

    /**
     * Gets the value of the estimated3RdYearAssemblyQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEstimated3RdYearAssemblyQuantity() {
        return estimated3RdYearAssemblyQuantity;
    }

    /**
     * Sets the value of the estimated3RdYearAssemblyQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEstimated3RdYearAssemblyQuantity(Float value) {
        this.estimated3RdYearAssemblyQuantity = value;
    }

    /**
     * Gets the value of the estimatedLifetimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEstimatedLifetimeQuantity() {
        return estimatedLifetimeQuantity;
    }

    /**
     * Sets the value of the estimatedLifetimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEstimatedLifetimeQuantity(Float value) {
        this.estimatedLifetimeQuantity = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductionDate(XMLGregorianCalendar value) {
        this.productionDate = value;
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
     * Gets the value of the prototypeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrototypeDate() {
        return prototypeDate;
    }

    /**
     * Sets the value of the prototypeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrototypeDate(XMLGregorianCalendar value) {
        this.prototypeDate = value;
    }

    /**
     * Gets the value of the registrationComplexityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationComplexityLevel }
     *     
     */
    public RegistrationComplexityLevel getRegistrationComplexityLevel() {
        return registrationComplexityLevel;
    }

    /**
     * Sets the value of the registrationComplexityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationComplexityLevel }
     *     
     */
    public void setRegistrationComplexityLevel(RegistrationComplexityLevel value) {
        this.registrationComplexityLevel = value;
    }

    /**
     * Gets the value of the registrationInvolvementLevel property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationInvolvementLevel }
     *     
     */
    public RegistrationInvolvementLevel getRegistrationInvolvementLevel() {
        return registrationInvolvementLevel;
    }

    /**
     * Sets the value of the registrationInvolvementLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationInvolvementLevel }
     *     
     */
    public void setRegistrationInvolvementLevel(RegistrationInvolvementLevel value) {
        this.registrationInvolvementLevel = value;
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
        final DesignAssemblyInformationType that = ((DesignAssemblyInformationType) object);
        {
            TextualDescriptionType lhsAssemblyDescription;
            lhsAssemblyDescription = this.getAssemblyDescription();
            TextualDescriptionType rhsAssemblyDescription;
            rhsAssemblyDescription = that.getAssemblyDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assemblyDescription", lhsAssemblyDescription), LocatorUtils.property(thatLocator, "assemblyDescription", rhsAssemblyDescription), lhsAssemblyDescription, rhsAssemblyDescription, (this.assemblyDescription!= null), (that.assemblyDescription!= null))) {
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
            float lhsDesignAssemblyInformation;
            lhsDesignAssemblyInformation = this.getDesignAssemblyInformation();
            float rhsDesignAssemblyInformation;
            rhsDesignAssemblyInformation = that.getDesignAssemblyInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designAssemblyInformation", lhsDesignAssemblyInformation), LocatorUtils.property(thatLocator, "designAssemblyInformation", rhsDesignAssemblyInformation), lhsDesignAssemblyInformation, rhsDesignAssemblyInformation, true, true)) {
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
            List<DesignPartInformationType> lhsDesignPartInformation;
            lhsDesignPartInformation = (((this.designPartInformation!= null)&&(!this.designPartInformation.isEmpty()))?this.getDesignPartInformation():null);
            List<DesignPartInformationType> rhsDesignPartInformation;
            rhsDesignPartInformation = (((that.designPartInformation!= null)&&(!that.designPartInformation.isEmpty()))?that.getDesignPartInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designPartInformation", lhsDesignPartInformation), LocatorUtils.property(thatLocator, "designPartInformation", rhsDesignPartInformation), lhsDesignPartInformation, rhsDesignPartInformation, ((this.designPartInformation!= null)&&(!this.designPartInformation.isEmpty())), ((that.designPartInformation!= null)&&(!that.designPartInformation.isEmpty())))) {
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
            Float lhsEstimated2NdYearAssemblyQuantity;
            lhsEstimated2NdYearAssemblyQuantity = this.getEstimated2NdYearAssemblyQuantity();
            Float rhsEstimated2NdYearAssemblyQuantity;
            rhsEstimated2NdYearAssemblyQuantity = that.getEstimated2NdYearAssemblyQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimated2NdYearAssemblyQuantity", lhsEstimated2NdYearAssemblyQuantity), LocatorUtils.property(thatLocator, "estimated2NdYearAssemblyQuantity", rhsEstimated2NdYearAssemblyQuantity), lhsEstimated2NdYearAssemblyQuantity, rhsEstimated2NdYearAssemblyQuantity, (this.estimated2NdYearAssemblyQuantity!= null), (that.estimated2NdYearAssemblyQuantity!= null))) {
                return false;
            }
        }
        {
            Float lhsEstimated3RdYearAssemblyQuantity;
            lhsEstimated3RdYearAssemblyQuantity = this.getEstimated3RdYearAssemblyQuantity();
            Float rhsEstimated3RdYearAssemblyQuantity;
            rhsEstimated3RdYearAssemblyQuantity = that.getEstimated3RdYearAssemblyQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimated3RdYearAssemblyQuantity", lhsEstimated3RdYearAssemblyQuantity), LocatorUtils.property(thatLocator, "estimated3RdYearAssemblyQuantity", rhsEstimated3RdYearAssemblyQuantity), lhsEstimated3RdYearAssemblyQuantity, rhsEstimated3RdYearAssemblyQuantity, (this.estimated3RdYearAssemblyQuantity!= null), (that.estimated3RdYearAssemblyQuantity!= null))) {
                return false;
            }
        }
        {
            Float lhsEstimatedLifetimeQuantity;
            lhsEstimatedLifetimeQuantity = this.getEstimatedLifetimeQuantity();
            Float rhsEstimatedLifetimeQuantity;
            rhsEstimatedLifetimeQuantity = that.getEstimatedLifetimeQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedLifetimeQuantity", lhsEstimatedLifetimeQuantity), LocatorUtils.property(thatLocator, "estimatedLifetimeQuantity", rhsEstimatedLifetimeQuantity), lhsEstimatedLifetimeQuantity, rhsEstimatedLifetimeQuantity, (this.estimatedLifetimeQuantity!= null), (that.estimatedLifetimeQuantity!= null))) {
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
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsProductionDate;
            lhsProductionDate = this.getProductionDate();
            XMLGregorianCalendar rhsProductionDate;
            rhsProductionDate = that.getProductionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productionDate", lhsProductionDate), LocatorUtils.property(thatLocator, "productionDate", rhsProductionDate), lhsProductionDate, rhsProductionDate, (this.productionDate!= null), (that.productionDate!= null))) {
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
            XMLGregorianCalendar lhsPrototypeDate;
            lhsPrototypeDate = this.getPrototypeDate();
            XMLGregorianCalendar rhsPrototypeDate;
            rhsPrototypeDate = that.getPrototypeDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prototypeDate", lhsPrototypeDate), LocatorUtils.property(thatLocator, "prototypeDate", rhsPrototypeDate), lhsPrototypeDate, rhsPrototypeDate, (this.prototypeDate!= null), (that.prototypeDate!= null))) {
                return false;
            }
        }
        {
            RegistrationComplexityLevel lhsRegistrationComplexityLevel;
            lhsRegistrationComplexityLevel = this.getRegistrationComplexityLevel();
            RegistrationComplexityLevel rhsRegistrationComplexityLevel;
            rhsRegistrationComplexityLevel = that.getRegistrationComplexityLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationComplexityLevel", lhsRegistrationComplexityLevel), LocatorUtils.property(thatLocator, "registrationComplexityLevel", rhsRegistrationComplexityLevel), lhsRegistrationComplexityLevel, rhsRegistrationComplexityLevel, (this.registrationComplexityLevel!= null), (that.registrationComplexityLevel!= null))) {
                return false;
            }
        }
        {
            RegistrationInvolvementLevel lhsRegistrationInvolvementLevel;
            lhsRegistrationInvolvementLevel = this.getRegistrationInvolvementLevel();
            RegistrationInvolvementLevel rhsRegistrationInvolvementLevel;
            rhsRegistrationInvolvementLevel = that.getRegistrationInvolvementLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationInvolvementLevel", lhsRegistrationInvolvementLevel), LocatorUtils.property(thatLocator, "registrationInvolvementLevel", rhsRegistrationInvolvementLevel), lhsRegistrationInvolvementLevel, rhsRegistrationInvolvementLevel, (this.registrationInvolvementLevel!= null), (that.registrationInvolvementLevel!= null))) {
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
            TextualDescriptionType theAssemblyDescription;
            theAssemblyDescription = this.getAssemblyDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assemblyDescription", theAssemblyDescription), currentHashCode, theAssemblyDescription, (this.assemblyDescription!= null));
        }
        {
            DemandCreatorTrackingIdentifier theDemandCreatorTrackingIdentifier;
            theDemandCreatorTrackingIdentifier = this.getDemandCreatorTrackingIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "demandCreatorTrackingIdentifier", theDemandCreatorTrackingIdentifier), currentHashCode, theDemandCreatorTrackingIdentifier, (this.demandCreatorTrackingIdentifier!= null));
        }
        {
            float theDesignAssemblyInformation;
            theDesignAssemblyInformation = this.getDesignAssemblyInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designAssemblyInformation", theDesignAssemblyInformation), currentHashCode, theDesignAssemblyInformation, true);
        }
        {
            DesignCustomerInformationType theDesignCustomerInformation;
            theDesignCustomerInformation = this.getDesignCustomerInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designCustomerInformation", theDesignCustomerInformation), currentHashCode, theDesignCustomerInformation, (this.designCustomerInformation!= null));
        }
        {
            List<DesignPartInformationType> theDesignPartInformation;
            theDesignPartInformation = (((this.designPartInformation!= null)&&(!this.designPartInformation.isEmpty()))?this.getDesignPartInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designPartInformation", theDesignPartInformation), currentHashCode, theDesignPartInformation, ((this.designPartInformation!= null)&&(!this.designPartInformation.isEmpty())));
        }
        {
            DesignRegistrationIdentification theDesignRegistrationIdentification;
            theDesignRegistrationIdentification = this.getDesignRegistrationIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designRegistrationIdentification", theDesignRegistrationIdentification), currentHashCode, theDesignRegistrationIdentification, (this.designRegistrationIdentification!= null));
        }
        {
            Float theEstimated2NdYearAssemblyQuantity;
            theEstimated2NdYearAssemblyQuantity = this.getEstimated2NdYearAssemblyQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimated2NdYearAssemblyQuantity", theEstimated2NdYearAssemblyQuantity), currentHashCode, theEstimated2NdYearAssemblyQuantity, (this.estimated2NdYearAssemblyQuantity!= null));
        }
        {
            Float theEstimated3RdYearAssemblyQuantity;
            theEstimated3RdYearAssemblyQuantity = this.getEstimated3RdYearAssemblyQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimated3RdYearAssemblyQuantity", theEstimated3RdYearAssemblyQuantity), currentHashCode, theEstimated3RdYearAssemblyQuantity, (this.estimated3RdYearAssemblyQuantity!= null));
        }
        {
            Float theEstimatedLifetimeQuantity;
            theEstimatedLifetimeQuantity = this.getEstimatedLifetimeQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedLifetimeQuantity", theEstimatedLifetimeQuantity), currentHashCode, theEstimatedLifetimeQuantity, (this.estimatedLifetimeQuantity!= null));
        }
        {
            GeographicRegion theGeographicRegion;
            theGeographicRegion = this.getGeographicRegion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geographicRegion", theGeographicRegion), currentHashCode, theGeographicRegion, (this.geographicRegion!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            XMLGregorianCalendar theProductionDate;
            theProductionDate = this.getProductionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productionDate", theProductionDate), currentHashCode, theProductionDate, (this.productionDate!= null));
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
            XMLGregorianCalendar thePrototypeDate;
            thePrototypeDate = this.getPrototypeDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prototypeDate", thePrototypeDate), currentHashCode, thePrototypeDate, (this.prototypeDate!= null));
        }
        {
            RegistrationComplexityLevel theRegistrationComplexityLevel;
            theRegistrationComplexityLevel = this.getRegistrationComplexityLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationComplexityLevel", theRegistrationComplexityLevel), currentHashCode, theRegistrationComplexityLevel, (this.registrationComplexityLevel!= null));
        }
        {
            RegistrationInvolvementLevel theRegistrationInvolvementLevel;
            theRegistrationInvolvementLevel = this.getRegistrationInvolvementLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationInvolvementLevel", theRegistrationInvolvementLevel), currentHashCode, theRegistrationInvolvementLevel, (this.registrationInvolvementLevel!= null));
        }
        {
            RegistrationStatus theRegistrationStatus;
            theRegistrationStatus = this.getRegistrationStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationStatus", theRegistrationStatus), currentHashCode, theRegistrationStatus, (this.registrationStatus!= null));
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
            TextualDescriptionType theAssemblyDescription;
            theAssemblyDescription = this.getAssemblyDescription();
            strategy.appendField(locator, this, "assemblyDescription", buffer, theAssemblyDescription, (this.assemblyDescription!= null));
        }
        {
            DemandCreatorTrackingIdentifier theDemandCreatorTrackingIdentifier;
            theDemandCreatorTrackingIdentifier = this.getDemandCreatorTrackingIdentifier();
            strategy.appendField(locator, this, "demandCreatorTrackingIdentifier", buffer, theDemandCreatorTrackingIdentifier, (this.demandCreatorTrackingIdentifier!= null));
        }
        {
            float theDesignAssemblyInformation;
            theDesignAssemblyInformation = this.getDesignAssemblyInformation();
            strategy.appendField(locator, this, "designAssemblyInformation", buffer, theDesignAssemblyInformation, true);
        }
        {
            DesignCustomerInformationType theDesignCustomerInformation;
            theDesignCustomerInformation = this.getDesignCustomerInformation();
            strategy.appendField(locator, this, "designCustomerInformation", buffer, theDesignCustomerInformation, (this.designCustomerInformation!= null));
        }
        {
            List<DesignPartInformationType> theDesignPartInformation;
            theDesignPartInformation = (((this.designPartInformation!= null)&&(!this.designPartInformation.isEmpty()))?this.getDesignPartInformation():null);
            strategy.appendField(locator, this, "designPartInformation", buffer, theDesignPartInformation, ((this.designPartInformation!= null)&&(!this.designPartInformation.isEmpty())));
        }
        {
            DesignRegistrationIdentification theDesignRegistrationIdentification;
            theDesignRegistrationIdentification = this.getDesignRegistrationIdentification();
            strategy.appendField(locator, this, "designRegistrationIdentification", buffer, theDesignRegistrationIdentification, (this.designRegistrationIdentification!= null));
        }
        {
            Float theEstimated2NdYearAssemblyQuantity;
            theEstimated2NdYearAssemblyQuantity = this.getEstimated2NdYearAssemblyQuantity();
            strategy.appendField(locator, this, "estimated2NdYearAssemblyQuantity", buffer, theEstimated2NdYearAssemblyQuantity, (this.estimated2NdYearAssemblyQuantity!= null));
        }
        {
            Float theEstimated3RdYearAssemblyQuantity;
            theEstimated3RdYearAssemblyQuantity = this.getEstimated3RdYearAssemblyQuantity();
            strategy.appendField(locator, this, "estimated3RdYearAssemblyQuantity", buffer, theEstimated3RdYearAssemblyQuantity, (this.estimated3RdYearAssemblyQuantity!= null));
        }
        {
            Float theEstimatedLifetimeQuantity;
            theEstimatedLifetimeQuantity = this.getEstimatedLifetimeQuantity();
            strategy.appendField(locator, this, "estimatedLifetimeQuantity", buffer, theEstimatedLifetimeQuantity, (this.estimatedLifetimeQuantity!= null));
        }
        {
            GeographicRegion theGeographicRegion;
            theGeographicRegion = this.getGeographicRegion();
            strategy.appendField(locator, this, "geographicRegion", buffer, theGeographicRegion, (this.geographicRegion!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            XMLGregorianCalendar theProductionDate;
            theProductionDate = this.getProductionDate();
            strategy.appendField(locator, this, "productionDate", buffer, theProductionDate, (this.productionDate!= null));
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
            XMLGregorianCalendar thePrototypeDate;
            thePrototypeDate = this.getPrototypeDate();
            strategy.appendField(locator, this, "prototypeDate", buffer, thePrototypeDate, (this.prototypeDate!= null));
        }
        {
            RegistrationComplexityLevel theRegistrationComplexityLevel;
            theRegistrationComplexityLevel = this.getRegistrationComplexityLevel();
            strategy.appendField(locator, this, "registrationComplexityLevel", buffer, theRegistrationComplexityLevel, (this.registrationComplexityLevel!= null));
        }
        {
            RegistrationInvolvementLevel theRegistrationInvolvementLevel;
            theRegistrationInvolvementLevel = this.getRegistrationInvolvementLevel();
            strategy.appendField(locator, this, "registrationInvolvementLevel", buffer, theRegistrationInvolvementLevel, (this.registrationInvolvementLevel!= null));
        }
        {
            RegistrationStatus theRegistrationStatus;
            theRegistrationStatus = this.getRegistrationStatus();
            strategy.appendField(locator, this, "registrationStatus", buffer, theRegistrationStatus, (this.registrationStatus!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
