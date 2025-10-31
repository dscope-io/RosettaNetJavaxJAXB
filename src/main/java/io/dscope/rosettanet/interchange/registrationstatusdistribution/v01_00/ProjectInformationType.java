
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
import io.dscope.rosettanet.domain.marketing.codelist.projectstatus.v01_02.ProjectStatus;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.DesignProjectDescription;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.ProjectIdentifier;
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
 * <p>Java class for ProjectInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssemblyInformation" type="{urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00}AssemblyInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DesignProjectDescription" minOccurs="0"/&gt;
 *         &lt;element name="ProductProviderLead" type="{urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00}ProductProviderLeadType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}ProjectIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02}ProjectStatus" minOccurs="0"/&gt;
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
@XmlType(name = "ProjectInformationType", propOrder = {
    "assemblyInformation",
    "designProjectDescription",
    "productProviderLead",
    "projectIdentifier",
    "projectStatus"
})
public class ProjectInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AssemblyInformation", required = true)
    protected List<AssemblyInformationType> assemblyInformation;
    @XmlElementRef(name = "DesignProjectDescription", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DesignProjectDescription.class, required = false)
    protected DesignProjectDescription designProjectDescription;
    @XmlElement(name = "ProductProviderLead")
    protected ProductProviderLeadType productProviderLead;
    @XmlElementRef(name = "ProjectIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = ProjectIdentifier.class, required = false)
    protected ProjectIdentifier projectIdentifier;
    @XmlElementRef(name = "ProjectStatus", namespace = "urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02", type = ProjectStatus.class, required = false)
    protected ProjectStatus projectStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the assemblyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssemblyInformationType }
     * 
     * 
     */
    public List<AssemblyInformationType> getAssemblyInformation() {
        if (assemblyInformation == null) {
            assemblyInformation = new ArrayList<AssemblyInformationType>();
        }
        return this.assemblyInformation;
    }

    /**
     * Gets the value of the designProjectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DesignProjectDescription }
     *     
     */
    public DesignProjectDescription getDesignProjectDescription() {
        return designProjectDescription;
    }

    /**
     * Sets the value of the designProjectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignProjectDescription }
     *     
     */
    public void setDesignProjectDescription(DesignProjectDescription value) {
        this.designProjectDescription = value;
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
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier }
     *     
     */
    public ProjectIdentifier getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectIdentifier(ProjectIdentifier value) {
        this.projectIdentifier = value;
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
        final ProjectInformationType that = ((ProjectInformationType) object);
        {
            List<AssemblyInformationType> lhsAssemblyInformation;
            lhsAssemblyInformation = (((this.assemblyInformation!= null)&&(!this.assemblyInformation.isEmpty()))?this.getAssemblyInformation():null);
            List<AssemblyInformationType> rhsAssemblyInformation;
            rhsAssemblyInformation = (((that.assemblyInformation!= null)&&(!that.assemblyInformation.isEmpty()))?that.getAssemblyInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assemblyInformation", lhsAssemblyInformation), LocatorUtils.property(thatLocator, "assemblyInformation", rhsAssemblyInformation), lhsAssemblyInformation, rhsAssemblyInformation, ((this.assemblyInformation!= null)&&(!this.assemblyInformation.isEmpty())), ((that.assemblyInformation!= null)&&(!that.assemblyInformation.isEmpty())))) {
                return false;
            }
        }
        {
            DesignProjectDescription lhsDesignProjectDescription;
            lhsDesignProjectDescription = this.getDesignProjectDescription();
            DesignProjectDescription rhsDesignProjectDescription;
            rhsDesignProjectDescription = that.getDesignProjectDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designProjectDescription", lhsDesignProjectDescription), LocatorUtils.property(thatLocator, "designProjectDescription", rhsDesignProjectDescription), lhsDesignProjectDescription, rhsDesignProjectDescription, (this.designProjectDescription!= null), (that.designProjectDescription!= null))) {
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
            ProjectIdentifier lhsProjectIdentifier;
            lhsProjectIdentifier = this.getProjectIdentifier();
            ProjectIdentifier rhsProjectIdentifier;
            rhsProjectIdentifier = that.getProjectIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projectIdentifier", lhsProjectIdentifier), LocatorUtils.property(thatLocator, "projectIdentifier", rhsProjectIdentifier), lhsProjectIdentifier, rhsProjectIdentifier, (this.projectIdentifier!= null), (that.projectIdentifier!= null))) {
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
            List<AssemblyInformationType> theAssemblyInformation;
            theAssemblyInformation = (((this.assemblyInformation!= null)&&(!this.assemblyInformation.isEmpty()))?this.getAssemblyInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assemblyInformation", theAssemblyInformation), currentHashCode, theAssemblyInformation, ((this.assemblyInformation!= null)&&(!this.assemblyInformation.isEmpty())));
        }
        {
            DesignProjectDescription theDesignProjectDescription;
            theDesignProjectDescription = this.getDesignProjectDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designProjectDescription", theDesignProjectDescription), currentHashCode, theDesignProjectDescription, (this.designProjectDescription!= null));
        }
        {
            ProductProviderLeadType theProductProviderLead;
            theProductProviderLead = this.getProductProviderLead();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productProviderLead", theProductProviderLead), currentHashCode, theProductProviderLead, (this.productProviderLead!= null));
        }
        {
            ProjectIdentifier theProjectIdentifier;
            theProjectIdentifier = this.getProjectIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "projectIdentifier", theProjectIdentifier), currentHashCode, theProjectIdentifier, (this.projectIdentifier!= null));
        }
        {
            ProjectStatus theProjectStatus;
            theProjectStatus = this.getProjectStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "projectStatus", theProjectStatus), currentHashCode, theProjectStatus, (this.projectStatus!= null));
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
            List<AssemblyInformationType> theAssemblyInformation;
            theAssemblyInformation = (((this.assemblyInformation!= null)&&(!this.assemblyInformation.isEmpty()))?this.getAssemblyInformation():null);
            strategy.appendField(locator, this, "assemblyInformation", buffer, theAssemblyInformation, ((this.assemblyInformation!= null)&&(!this.assemblyInformation.isEmpty())));
        }
        {
            DesignProjectDescription theDesignProjectDescription;
            theDesignProjectDescription = this.getDesignProjectDescription();
            strategy.appendField(locator, this, "designProjectDescription", buffer, theDesignProjectDescription, (this.designProjectDescription!= null));
        }
        {
            ProductProviderLeadType theProductProviderLead;
            theProductProviderLead = this.getProductProviderLead();
            strategy.appendField(locator, this, "productProviderLead", buffer, theProductProviderLead, (this.productProviderLead!= null));
        }
        {
            ProjectIdentifier theProjectIdentifier;
            theProjectIdentifier = this.getProjectIdentifier();
            strategy.appendField(locator, this, "projectIdentifier", buffer, theProjectIdentifier, (this.projectIdentifier!= null));
        }
        {
            ProjectStatus theProjectStatus;
            theProjectStatus = this.getProjectStatus();
            strategy.appendField(locator, this, "projectStatus", buffer, theProjectStatus, (this.projectStatus!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
