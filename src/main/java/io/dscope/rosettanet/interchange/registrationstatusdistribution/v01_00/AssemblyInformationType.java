
package io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00;

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
import io.dscope.rosettanet.domain.marketing.codelist.registrationcomplexitylevel.v01_02.RegistrationComplexityLevel;
import io.dscope.rosettanet.domain.marketing.codelist.registrationinvolvementlevel.v01_02.RegistrationInvolvementLevel;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.DemandCreatorTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.DesignRegistrationIdentification;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.GeographicRegion;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.RegistrationStatus;
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
 * <p>Java class for AssemblyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssemblyInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DemandCreatorTrackingIdentifier"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DesignRegistrationIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}GeographicRegion" minOccurs="0"/&gt;
 *         &lt;element name="PartInformation" type="{urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00}PartInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductProviderLead" type="{urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00}ProductProviderLeadType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02}RegistrationComplexityLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02}RegistrationInvolvementLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationStatus" minOccurs="0"/&gt;
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
@XmlType(name = "AssemblyInformationType", propOrder = {
    "comments",
    "demandCreatorTrackingIdentifier",
    "designRegistrationIdentification",
    "geographicRegion",
    "partInformation",
    "productProviderLead",
    "registrationComplexityLevel",
    "registrationInvolvementLevel",
    "registrationStatus"
})
public class AssemblyInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "DemandCreatorTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DemandCreatorTrackingIdentifier.class)
    protected DemandCreatorTrackingIdentifier demandCreatorTrackingIdentifier;
    @XmlElementRef(name = "DesignRegistrationIdentification", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DesignRegistrationIdentification.class, required = false)
    protected DesignRegistrationIdentification designRegistrationIdentification;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = GeographicRegion.class, required = false)
    protected GeographicRegion geographicRegion;
    @XmlElement(name = "PartInformation")
    protected List<PartInformationType> partInformation;
    @XmlElement(name = "ProductProviderLead")
    protected ProductProviderLeadType productProviderLead;
    @XmlElementRef(name = "RegistrationComplexityLevel", namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02", type = RegistrationComplexityLevel.class, required = false)
    protected RegistrationComplexityLevel registrationComplexityLevel;
    @XmlElementRef(name = "RegistrationInvolvementLevel", namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02", type = RegistrationInvolvementLevel.class, required = false)
    protected RegistrationInvolvementLevel registrationInvolvementLevel;
    @XmlElementRef(name = "RegistrationStatus", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = RegistrationStatus.class, required = false)
    protected RegistrationStatus registrationStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
     * Gets the value of the partInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartInformationType }
     * 
     * 
     */
    public List<PartInformationType> getPartInformation() {
        if (partInformation == null) {
            partInformation = new ArrayList<PartInformationType>();
        }
        return this.partInformation;
    }

    /**
     * Gets the value of the productProviderLead property.
     * 
     * @return
     *     possible object is
     *     {@link ProductProviderLeadType }
     *     
     */
    public ProductProviderLeadType getProductProviderLead() {
        return productProviderLead;
    }

    /**
     * Sets the value of the productProviderLead property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductProviderLeadType }
     *     
     */
    public void setProductProviderLead(ProductProviderLeadType value) {
        this.productProviderLead = value;
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
        final AssemblyInformationType that = ((AssemblyInformationType) object);
        {
            String lhsComments;
            lhsComments = this.getComments();
            String rhsComments;
            rhsComments = that.getComments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comments", lhsComments), LocatorUtils.property(thatLocator, "comments", rhsComments), lhsComments, rhsComments, (this.comments!= null), (that.comments!= null))) {
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
            List<PartInformationType> lhsPartInformation;
            lhsPartInformation = (((this.partInformation!= null)&&(!this.partInformation.isEmpty()))?this.getPartInformation():null);
            List<PartInformationType> rhsPartInformation;
            rhsPartInformation = (((that.partInformation!= null)&&(!that.partInformation.isEmpty()))?that.getPartInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partInformation", lhsPartInformation), LocatorUtils.property(thatLocator, "partInformation", rhsPartInformation), lhsPartInformation, rhsPartInformation, ((this.partInformation!= null)&&(!this.partInformation.isEmpty())), ((that.partInformation!= null)&&(!that.partInformation.isEmpty())))) {
                return false;
            }
        }
        {
            ProductProviderLeadType lhsProductProviderLead;
            lhsProductProviderLead = this.getProductProviderLead();
            ProductProviderLeadType rhsProductProviderLead;
            rhsProductProviderLead = that.getProductProviderLead();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productProviderLead", lhsProductProviderLead), LocatorUtils.property(thatLocator, "productProviderLead", rhsProductProviderLead), lhsProductProviderLead, rhsProductProviderLead, (this.productProviderLead!= null), (that.productProviderLead!= null))) {
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
            String theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments, (this.comments!= null));
        }
        {
            DemandCreatorTrackingIdentifier theDemandCreatorTrackingIdentifier;
            theDemandCreatorTrackingIdentifier = this.getDemandCreatorTrackingIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "demandCreatorTrackingIdentifier", theDemandCreatorTrackingIdentifier), currentHashCode, theDemandCreatorTrackingIdentifier, (this.demandCreatorTrackingIdentifier!= null));
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
            List<PartInformationType> thePartInformation;
            thePartInformation = (((this.partInformation!= null)&&(!this.partInformation.isEmpty()))?this.getPartInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partInformation", thePartInformation), currentHashCode, thePartInformation, ((this.partInformation!= null)&&(!this.partInformation.isEmpty())));
        }
        {
            ProductProviderLeadType theProductProviderLead;
            theProductProviderLead = this.getProductProviderLead();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productProviderLead", theProductProviderLead), currentHashCode, theProductProviderLead, (this.productProviderLead!= null));
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
            String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments, (this.comments!= null));
        }
        {
            DemandCreatorTrackingIdentifier theDemandCreatorTrackingIdentifier;
            theDemandCreatorTrackingIdentifier = this.getDemandCreatorTrackingIdentifier();
            strategy.appendField(locator, this, "demandCreatorTrackingIdentifier", buffer, theDemandCreatorTrackingIdentifier, (this.demandCreatorTrackingIdentifier!= null));
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
            List<PartInformationType> thePartInformation;
            thePartInformation = (((this.partInformation!= null)&&(!this.partInformation.isEmpty()))?this.getPartInformation():null);
            strategy.appendField(locator, this, "partInformation", buffer, thePartInformation, ((this.partInformation!= null)&&(!this.partInformation.isEmpty())));
        }
        {
            ProductProviderLeadType theProductProviderLead;
            theProductProviderLead = this.getProductProviderLead();
            strategy.appendField(locator, this, "productProviderLead", buffer, theProductProviderLead, (this.productProviderLead!= null));
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
