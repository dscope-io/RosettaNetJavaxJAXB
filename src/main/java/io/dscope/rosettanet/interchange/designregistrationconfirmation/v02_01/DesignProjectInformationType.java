
package io.dscope.rosettanet.interchange.designregistrationconfirmation.v02_01;

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
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DesignProjectDescription;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.ProductProviderLeadDescription;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.ProductProviderLeadTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.ProjectIdentifier;
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
 * <p>Java class for DesignProjectInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignProjectInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesignAssemblyInformation" type="{urn:rosettanet:specification:interchange:DesignRegistrationConfirmation:xsd:schema:02.01}DesignAssemblyInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DesignProjectDescription"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}ProductProviderLeadDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}ProductProviderLeadTrackingIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}ProjectIdentifier" minOccurs="0"/&gt;
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
@XmlType(name = "DesignProjectInformationType", propOrder = {
    "designAssemblyInformation",
    "designProjectDescription",
    "productProviderLeadDescription",
    "productProviderLeadTrackingIdentifier",
    "projectIdentifier",
    "projectStatus"
})
public class DesignProjectInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DesignAssemblyInformation", required = true)
    protected List<DesignAssemblyInformationType> designAssemblyInformation;
    @XmlElementRef(name = "DesignProjectDescription", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DesignProjectDescription.class)
    protected DesignProjectDescription designProjectDescription;
    @XmlElementRef(name = "ProductProviderLeadDescription", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = ProductProviderLeadDescription.class, required = false)
    protected ProductProviderLeadDescription productProviderLeadDescription;
    @XmlElementRef(name = "ProductProviderLeadTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = ProductProviderLeadTrackingIdentifier.class, required = false)
    protected ProductProviderLeadTrackingIdentifier productProviderLeadTrackingIdentifier;
    @XmlElementRef(name = "ProjectIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = ProjectIdentifier.class, required = false)
    protected ProjectIdentifier projectIdentifier;
    @XmlElementRef(name = "ProjectStatus", namespace = "urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02", type = ProjectStatus.class, required = false)
    protected ProjectStatus projectStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designAssemblyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designAssemblyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignAssemblyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignAssemblyInformationType }
     * 
     * 
     */
    public List<DesignAssemblyInformationType> getDesignAssemblyInformation() {
        if (designAssemblyInformation == null) {
            designAssemblyInformation = new ArrayList<DesignAssemblyInformationType>();
        }
        return this.designAssemblyInformation;
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
        final DesignProjectInformationType that = ((DesignProjectInformationType) object);
        {
            List<DesignAssemblyInformationType> lhsDesignAssemblyInformation;
            lhsDesignAssemblyInformation = (((this.designAssemblyInformation!= null)&&(!this.designAssemblyInformation.isEmpty()))?this.getDesignAssemblyInformation():null);
            List<DesignAssemblyInformationType> rhsDesignAssemblyInformation;
            rhsDesignAssemblyInformation = (((that.designAssemblyInformation!= null)&&(!that.designAssemblyInformation.isEmpty()))?that.getDesignAssemblyInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designAssemblyInformation", lhsDesignAssemblyInformation), LocatorUtils.property(thatLocator, "designAssemblyInformation", rhsDesignAssemblyInformation), lhsDesignAssemblyInformation, rhsDesignAssemblyInformation, ((this.designAssemblyInformation!= null)&&(!this.designAssemblyInformation.isEmpty())), ((that.designAssemblyInformation!= null)&&(!that.designAssemblyInformation.isEmpty())))) {
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
            List<DesignAssemblyInformationType> theDesignAssemblyInformation;
            theDesignAssemblyInformation = (((this.designAssemblyInformation!= null)&&(!this.designAssemblyInformation.isEmpty()))?this.getDesignAssemblyInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designAssemblyInformation", theDesignAssemblyInformation), currentHashCode, theDesignAssemblyInformation, ((this.designAssemblyInformation!= null)&&(!this.designAssemblyInformation.isEmpty())));
        }
        {
            DesignProjectDescription theDesignProjectDescription;
            theDesignProjectDescription = this.getDesignProjectDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designProjectDescription", theDesignProjectDescription), currentHashCode, theDesignProjectDescription, (this.designProjectDescription!= null));
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
            List<DesignAssemblyInformationType> theDesignAssemblyInformation;
            theDesignAssemblyInformation = (((this.designAssemblyInformation!= null)&&(!this.designAssemblyInformation.isEmpty()))?this.getDesignAssemblyInformation():null);
            strategy.appendField(locator, this, "designAssemblyInformation", buffer, theDesignAssemblyInformation, ((this.designAssemblyInformation!= null)&&(!this.designAssemblyInformation.isEmpty())));
        }
        {
            DesignProjectDescription theDesignProjectDescription;
            theDesignProjectDescription = this.getDesignProjectDescription();
            strategy.appendField(locator, this, "designProjectDescription", buffer, theDesignProjectDescription, (this.designProjectDescription!= null));
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
