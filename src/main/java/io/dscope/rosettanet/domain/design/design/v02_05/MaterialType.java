
package io.dscope.rosettanet.domain.design.design.v02_05;

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
 * <p>Java class for MaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.05}DependentCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.05}MaterialMass" minOccurs="0"/&gt;
 *         &lt;element name="StandardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.05}Substance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TradeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "MaterialType", propOrder = {
    "classification",
    "dependentCondition",
    "identifier",
    "materialMass",
    "standardNumber",
    "substance",
    "tradeName",
    "type"
})
public class MaterialType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Classification")
    protected String classification;
    @XmlElementRef(name = "DependentCondition", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.05", type = DependentCondition.class, required = false)
    protected List<DependentCondition> dependentCondition;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElementRef(name = "MaterialMass", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.05", type = MaterialMass.class, required = false)
    protected MaterialMass materialMass;
    @XmlElement(name = "StandardNumber")
    protected String standardNumber;
    @XmlElementRef(name = "Substance", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.05", type = Substance.class, required = false)
    protected List<Substance> substance;
    @XmlElement(name = "TradeName")
    protected String tradeName;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

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
     * Gets the value of the materialMass property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialMass }
     *     
     */
    public MaterialMass getMaterialMass() {
        return materialMass;
    }

    /**
     * Sets the value of the materialMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialMass }
     *     
     */
    public void setMaterialMass(MaterialMass value) {
        this.materialMass = value;
    }

    /**
     * Gets the value of the standardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardNumber() {
        return standardNumber;
    }

    /**
     * Sets the value of the standardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardNumber(String value) {
        this.standardNumber = value;
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
     * Gets the value of the tradeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * Sets the value of the tradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeName(String value) {
        this.tradeName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
        final MaterialType that = ((MaterialType) object);
        {
            String lhsClassification;
            lhsClassification = this.getClassification();
            String rhsClassification;
            rhsClassification = that.getClassification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classification", lhsClassification), LocatorUtils.property(thatLocator, "classification", rhsClassification), lhsClassification, rhsClassification, (this.classification!= null), (that.classification!= null))) {
                return false;
            }
        }
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
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            MaterialMass lhsMaterialMass;
            lhsMaterialMass = this.getMaterialMass();
            MaterialMass rhsMaterialMass;
            rhsMaterialMass = that.getMaterialMass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "materialMass", lhsMaterialMass), LocatorUtils.property(thatLocator, "materialMass", rhsMaterialMass), lhsMaterialMass, rhsMaterialMass, (this.materialMass!= null), (that.materialMass!= null))) {
                return false;
            }
        }
        {
            String lhsStandardNumber;
            lhsStandardNumber = this.getStandardNumber();
            String rhsStandardNumber;
            rhsStandardNumber = that.getStandardNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standardNumber", lhsStandardNumber), LocatorUtils.property(thatLocator, "standardNumber", rhsStandardNumber), lhsStandardNumber, rhsStandardNumber, (this.standardNumber!= null), (that.standardNumber!= null))) {
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
            String lhsTradeName;
            lhsTradeName = this.getTradeName();
            String rhsTradeName;
            rhsTradeName = that.getTradeName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tradeName", lhsTradeName), LocatorUtils.property(thatLocator, "tradeName", rhsTradeName), lhsTradeName, rhsTradeName, (this.tradeName!= null), (that.tradeName!= null))) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
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
            String theClassification;
            theClassification = this.getClassification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classification", theClassification), currentHashCode, theClassification, (this.classification!= null));
        }
        {
            List<DependentCondition> theDependentCondition;
            theDependentCondition = (((this.dependentCondition!= null)&&(!this.dependentCondition.isEmpty()))?this.getDependentCondition():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dependentCondition", theDependentCondition), currentHashCode, theDependentCondition, ((this.dependentCondition!= null)&&(!this.dependentCondition.isEmpty())));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            MaterialMass theMaterialMass;
            theMaterialMass = this.getMaterialMass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "materialMass", theMaterialMass), currentHashCode, theMaterialMass, (this.materialMass!= null));
        }
        {
            String theStandardNumber;
            theStandardNumber = this.getStandardNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standardNumber", theStandardNumber), currentHashCode, theStandardNumber, (this.standardNumber!= null));
        }
        {
            List<Substance> theSubstance;
            theSubstance = (((this.substance!= null)&&(!this.substance.isEmpty()))?this.getSubstance():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substance", theSubstance), currentHashCode, theSubstance, ((this.substance!= null)&&(!this.substance.isEmpty())));
        }
        {
            String theTradeName;
            theTradeName = this.getTradeName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tradeName", theTradeName), currentHashCode, theTradeName, (this.tradeName!= null));
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType, (this.type!= null));
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
            String theClassification;
            theClassification = this.getClassification();
            strategy.appendField(locator, this, "classification", buffer, theClassification, (this.classification!= null));
        }
        {
            List<DependentCondition> theDependentCondition;
            theDependentCondition = (((this.dependentCondition!= null)&&(!this.dependentCondition.isEmpty()))?this.getDependentCondition():null);
            strategy.appendField(locator, this, "dependentCondition", buffer, theDependentCondition, ((this.dependentCondition!= null)&&(!this.dependentCondition.isEmpty())));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            MaterialMass theMaterialMass;
            theMaterialMass = this.getMaterialMass();
            strategy.appendField(locator, this, "materialMass", buffer, theMaterialMass, (this.materialMass!= null));
        }
        {
            String theStandardNumber;
            theStandardNumber = this.getStandardNumber();
            strategy.appendField(locator, this, "standardNumber", buffer, theStandardNumber, (this.standardNumber!= null));
        }
        {
            List<Substance> theSubstance;
            theSubstance = (((this.substance!= null)&&(!this.substance.isEmpty()))?this.getSubstance():null);
            strategy.appendField(locator, this, "substance", buffer, theSubstance, ((this.substance!= null)&&(!this.substance.isEmpty())));
        }
        {
            String theTradeName;
            theTradeName = this.getTradeName();
            strategy.appendField(locator, this, "tradeName", buffer, theTradeName, (this.tradeName!= null));
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType, (this.type!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
