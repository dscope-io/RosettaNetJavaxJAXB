
package io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00;

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
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.CoreProductRegistration;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.DemandCreatorTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.DesignRegistrationIdentification;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.DeviceProductRegistration;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.GeographicRegion;
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
 * <p>Java class for PartInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DemandCreatorTrackingIdentifier"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DesignRegistrationIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}GeographicRegion" minOccurs="0"/&gt;
 *         &lt;element name="ProductProviderInformation" type="{urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00}ProductProviderInformationType" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}CoreProductRegistration"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DeviceProductRegistration"/&gt;
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
@XmlType(name = "PartInformationType", propOrder = {
    "demandCreatorTrackingIdentifier",
    "designRegistrationIdentification",
    "geographicRegion",
    "productProviderInformation",
    "coreProductRegistrationOrDeviceProductRegistration"
})
public class PartInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DemandCreatorTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DemandCreatorTrackingIdentifier.class)
    protected DemandCreatorTrackingIdentifier demandCreatorTrackingIdentifier;
    @XmlElementRef(name = "DesignRegistrationIdentification", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DesignRegistrationIdentification.class, required = false)
    protected DesignRegistrationIdentification designRegistrationIdentification;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = GeographicRegion.class, required = false)
    protected GeographicRegion geographicRegion;
    @XmlElement(name = "ProductProviderInformation")
    protected ProductProviderInformationType productProviderInformation;
    @XmlElementRefs({
        @XmlElementRef(name = "CoreProductRegistration", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = CoreProductRegistration.class, required = false),
        @XmlElementRef(name = "DeviceProductRegistration", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DeviceProductRegistration.class, required = false)
    })
    protected List<JAXBElement<?>> coreProductRegistrationOrDeviceProductRegistration;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the productProviderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductProviderInformationType }
     *     
     */
    public ProductProviderInformationType getProductProviderInformation() {
        return productProviderInformation;
    }

    /**
     * Sets the value of the productProviderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductProviderInformationType }
     *     
     */
    public void setProductProviderInformation(ProductProviderInformationType value) {
        this.productProviderInformation = value;
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
        final PartInformationType that = ((PartInformationType) object);
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
            ProductProviderInformationType lhsProductProviderInformation;
            lhsProductProviderInformation = this.getProductProviderInformation();
            ProductProviderInformationType rhsProductProviderInformation;
            rhsProductProviderInformation = that.getProductProviderInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productProviderInformation", lhsProductProviderInformation), LocatorUtils.property(thatLocator, "productProviderInformation", rhsProductProviderInformation), lhsProductProviderInformation, rhsProductProviderInformation, (this.productProviderInformation!= null), (that.productProviderInformation!= null))) {
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
            ProductProviderInformationType theProductProviderInformation;
            theProductProviderInformation = this.getProductProviderInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productProviderInformation", theProductProviderInformation), currentHashCode, theProductProviderInformation, (this.productProviderInformation!= null));
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
            ProductProviderInformationType theProductProviderInformation;
            theProductProviderInformation = this.getProductProviderInformation();
            strategy.appendField(locator, this, "productProviderInformation", buffer, theProductProviderInformation, (this.productProviderInformation!= null));
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
