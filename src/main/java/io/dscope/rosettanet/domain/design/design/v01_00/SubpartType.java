
package io.dscope.rosettanet.domain.design.design.v01_00;

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
import io.dscope.rosettanet.universal.productidentification.v01_00.ProductDescriptionType;
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
 * <p>Java class for SubpartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubpartType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}DependentCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}ManufacturingProcessInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}Material" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}Subpart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubPartIdentifier" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02}ProductDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}Substance" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SubpartType", propOrder = {
    "dependentCondition",
    "manufacturingProcessInfo",
    "material",
    "subpart",
    "subPartIdentifier",
    "substance"
})
public class SubpartType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DependentCondition", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = DependentCondition.class, required = false)
    protected List<DependentCondition> dependentCondition;
    @XmlElementRef(name = "ManufacturingProcessInfo", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = ManufacturingProcessInfo.class, required = false)
    protected List<ManufacturingProcessInfo> manufacturingProcessInfo;
    @XmlElementRef(name = "Material", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Material.class, required = false)
    protected List<Material> material;
    @XmlElementRef(name = "Subpart", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Subpart.class, required = false)
    protected List<Subpart> subpart;
    @XmlElement(name = "SubPartIdentifier", required = true)
    protected ProductDescriptionType subPartIdentifier;
    @XmlElementRef(name = "Substance", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Substance.class, required = false)
    protected List<Substance> substance;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the dependentCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependentCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependentCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DependentCondition }
     * 
     * 
     */
    public List<DependentCondition> getDependentCondition() {
        if (dependentCondition == null) {
            dependentCondition = new ArrayList<DependentCondition>();
        }
        return this.dependentCondition;
    }

    /**
     * Gets the value of the manufacturingProcessInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturingProcessInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturingProcessInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManufacturingProcessInfo }
     * 
     * 
     */
    public List<ManufacturingProcessInfo> getManufacturingProcessInfo() {
        if (manufacturingProcessInfo == null) {
            manufacturingProcessInfo = new ArrayList<ManufacturingProcessInfo>();
        }
        return this.manufacturingProcessInfo;
    }

    /**
     * Gets the value of the material property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the material property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Material }
     * 
     * 
     */
    public List<Material> getMaterial() {
        if (material == null) {
            material = new ArrayList<Material>();
        }
        return this.material;
    }

    /**
     * Gets the value of the subpart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subpart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubpart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subpart }
     * 
     * 
     */
    public List<Subpart> getSubpart() {
        if (subpart == null) {
            subpart = new ArrayList<Subpart>();
        }
        return this.subpart;
    }

    /**
     * Gets the value of the subPartIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDescriptionType }
     *     
     */
    public ProductDescriptionType getSubPartIdentifier() {
        return subPartIdentifier;
    }

    /**
     * Sets the value of the subPartIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDescriptionType }
     *     
     */
    public void setSubPartIdentifier(ProductDescriptionType value) {
        this.subPartIdentifier = value;
    }

    /**
     * Gets the value of the substance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Substance }
     * 
     * 
     */
    public List<Substance> getSubstance() {
        if (substance == null) {
            substance = new ArrayList<Substance>();
        }
        return this.substance;
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
        final SubpartType that = ((SubpartType) object);
        {
            List<DependentCondition> lhsDependentCondition;
            lhsDependentCondition = (((this.dependentCondition!= null)&&(!this.dependentCondition.isEmpty()))?this.getDependentCondition():null);
            List<DependentCondition> rhsDependentCondition;
            rhsDependentCondition = (((that.dependentCondition!= null)&&(!that.dependentCondition.isEmpty()))?that.getDependentCondition():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dependentCondition", lhsDependentCondition), LocatorUtils.property(thatLocator, "dependentCondition", rhsDependentCondition), lhsDependentCondition, rhsDependentCondition, ((this.dependentCondition!= null)&&(!this.dependentCondition.isEmpty())), ((that.dependentCondition!= null)&&(!that.dependentCondition.isEmpty())))) {
                return false;
            }
        }
        {
            List<ManufacturingProcessInfo> lhsManufacturingProcessInfo;
            lhsManufacturingProcessInfo = (((this.manufacturingProcessInfo!= null)&&(!this.manufacturingProcessInfo.isEmpty()))?this.getManufacturingProcessInfo():null);
            List<ManufacturingProcessInfo> rhsManufacturingProcessInfo;
            rhsManufacturingProcessInfo = (((that.manufacturingProcessInfo!= null)&&(!that.manufacturingProcessInfo.isEmpty()))?that.getManufacturingProcessInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturingProcessInfo", lhsManufacturingProcessInfo), LocatorUtils.property(thatLocator, "manufacturingProcessInfo", rhsManufacturingProcessInfo), lhsManufacturingProcessInfo, rhsManufacturingProcessInfo, ((this.manufacturingProcessInfo!= null)&&(!this.manufacturingProcessInfo.isEmpty())), ((that.manufacturingProcessInfo!= null)&&(!that.manufacturingProcessInfo.isEmpty())))) {
                return false;
            }
        }
        {
            List<Material> lhsMaterial;
            lhsMaterial = (((this.material!= null)&&(!this.material.isEmpty()))?this.getMaterial():null);
            List<Material> rhsMaterial;
            rhsMaterial = (((that.material!= null)&&(!that.material.isEmpty()))?that.getMaterial():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "material", lhsMaterial), LocatorUtils.property(thatLocator, "material", rhsMaterial), lhsMaterial, rhsMaterial, ((this.material!= null)&&(!this.material.isEmpty())), ((that.material!= null)&&(!that.material.isEmpty())))) {
                return false;
            }
        }
        {
            List<Subpart> lhsSubpart;
            lhsSubpart = (((this.subpart!= null)&&(!this.subpart.isEmpty()))?this.getSubpart():null);
            List<Subpart> rhsSubpart;
            rhsSubpart = (((that.subpart!= null)&&(!that.subpart.isEmpty()))?that.getSubpart():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subpart", lhsSubpart), LocatorUtils.property(thatLocator, "subpart", rhsSubpart), lhsSubpart, rhsSubpart, ((this.subpart!= null)&&(!this.subpart.isEmpty())), ((that.subpart!= null)&&(!that.subpart.isEmpty())))) {
                return false;
            }
        }
        {
            ProductDescriptionType lhsSubPartIdentifier;
            lhsSubPartIdentifier = this.getSubPartIdentifier();
            ProductDescriptionType rhsSubPartIdentifier;
            rhsSubPartIdentifier = that.getSubPartIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subPartIdentifier", lhsSubPartIdentifier), LocatorUtils.property(thatLocator, "subPartIdentifier", rhsSubPartIdentifier), lhsSubPartIdentifier, rhsSubPartIdentifier, (this.subPartIdentifier!= null), (that.subPartIdentifier!= null))) {
                return false;
            }
        }
        {
            List<Substance> lhsSubstance;
            lhsSubstance = (((this.substance!= null)&&(!this.substance.isEmpty()))?this.getSubstance():null);
            List<Substance> rhsSubstance;
            rhsSubstance = (((that.substance!= null)&&(!that.substance.isEmpty()))?that.getSubstance():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substance", lhsSubstance), LocatorUtils.property(thatLocator, "substance", rhsSubstance), lhsSubstance, rhsSubstance, ((this.substance!= null)&&(!this.substance.isEmpty())), ((that.substance!= null)&&(!that.substance.isEmpty())))) {
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
            List<DependentCondition> theDependentCondition;
            theDependentCondition = (((this.dependentCondition!= null)&&(!this.dependentCondition.isEmpty()))?this.getDependentCondition():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dependentCondition", theDependentCondition), currentHashCode, theDependentCondition, ((this.dependentCondition!= null)&&(!this.dependentCondition.isEmpty())));
        }
        {
            List<ManufacturingProcessInfo> theManufacturingProcessInfo;
            theManufacturingProcessInfo = (((this.manufacturingProcessInfo!= null)&&(!this.manufacturingProcessInfo.isEmpty()))?this.getManufacturingProcessInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturingProcessInfo", theManufacturingProcessInfo), currentHashCode, theManufacturingProcessInfo, ((this.manufacturingProcessInfo!= null)&&(!this.manufacturingProcessInfo.isEmpty())));
        }
        {
            List<Material> theMaterial;
            theMaterial = (((this.material!= null)&&(!this.material.isEmpty()))?this.getMaterial():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "material", theMaterial), currentHashCode, theMaterial, ((this.material!= null)&&(!this.material.isEmpty())));
        }
        {
            List<Subpart> theSubpart;
            theSubpart = (((this.subpart!= null)&&(!this.subpart.isEmpty()))?this.getSubpart():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subpart", theSubpart), currentHashCode, theSubpart, ((this.subpart!= null)&&(!this.subpart.isEmpty())));
        }
        {
            ProductDescriptionType theSubPartIdentifier;
            theSubPartIdentifier = this.getSubPartIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subPartIdentifier", theSubPartIdentifier), currentHashCode, theSubPartIdentifier, (this.subPartIdentifier!= null));
        }
        {
            List<Substance> theSubstance;
            theSubstance = (((this.substance!= null)&&(!this.substance.isEmpty()))?this.getSubstance():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substance", theSubstance), currentHashCode, theSubstance, ((this.substance!= null)&&(!this.substance.isEmpty())));
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
            List<DependentCondition> theDependentCondition;
            theDependentCondition = (((this.dependentCondition!= null)&&(!this.dependentCondition.isEmpty()))?this.getDependentCondition():null);
            strategy.appendField(locator, this, "dependentCondition", buffer, theDependentCondition, ((this.dependentCondition!= null)&&(!this.dependentCondition.isEmpty())));
        }
        {
            List<ManufacturingProcessInfo> theManufacturingProcessInfo;
            theManufacturingProcessInfo = (((this.manufacturingProcessInfo!= null)&&(!this.manufacturingProcessInfo.isEmpty()))?this.getManufacturingProcessInfo():null);
            strategy.appendField(locator, this, "manufacturingProcessInfo", buffer, theManufacturingProcessInfo, ((this.manufacturingProcessInfo!= null)&&(!this.manufacturingProcessInfo.isEmpty())));
        }
        {
            List<Material> theMaterial;
            theMaterial = (((this.material!= null)&&(!this.material.isEmpty()))?this.getMaterial():null);
            strategy.appendField(locator, this, "material", buffer, theMaterial, ((this.material!= null)&&(!this.material.isEmpty())));
        }
        {
            List<Subpart> theSubpart;
            theSubpart = (((this.subpart!= null)&&(!this.subpart.isEmpty()))?this.getSubpart():null);
            strategy.appendField(locator, this, "subpart", buffer, theSubpart, ((this.subpart!= null)&&(!this.subpart.isEmpty())));
        }
        {
            ProductDescriptionType theSubPartIdentifier;
            theSubPartIdentifier = this.getSubPartIdentifier();
            strategy.appendField(locator, this, "subPartIdentifier", buffer, theSubPartIdentifier, (this.subPartIdentifier!= null));
        }
        {
            List<Substance> theSubstance;
            theSubstance = (((this.substance!= null)&&(!this.substance.isEmpty()))?this.getSubstance():null);
            strategy.appendField(locator, this, "substance", buffer, theSubstance, ((this.substance!= null)&&(!this.substance.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
