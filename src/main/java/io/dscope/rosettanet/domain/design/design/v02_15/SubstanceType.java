
package io.dscope.rosettanet.domain.design.design.v02_15;

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
 * <p>Java class for SubstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.15}DependentCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Exempt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExemptListVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.15}Radioactivity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.15}SubstanceIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.15}SubstanceMass" minOccurs="0"/&gt;
 *         &lt;element name="SubstanceNote" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.15}NoteType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.15}Threshold" minOccurs="0"/&gt;
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
@XmlType(name = "SubstanceType", propOrder = {
    "classification",
    "dependentCondition",
    "exempt",
    "exemptListVersion",
    "name",
    "radioactivity",
    "substanceIdentification",
    "substanceMass",
    "substanceNote",
    "threshold"
})
public class SubstanceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Classification")
    protected String classification;
    @XmlElementRef(name = "DependentCondition", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.15", type = DependentCondition.class, required = false)
    protected List<DependentCondition> dependentCondition;
    @XmlElement(name = "Exempt")
    protected String exempt;
    @XmlElement(name = "ExemptListVersion")
    protected String exemptListVersion;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElementRef(name = "Radioactivity", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.15", type = Radioactivity.class, required = false)
    protected List<Radioactivity> radioactivity;
    @XmlElementRef(name = "SubstanceIdentification", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.15", type = SubstanceIdentification.class)
    protected SubstanceIdentification substanceIdentification;
    @XmlElementRef(name = "SubstanceMass", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.15", type = SubstanceMass.class, required = false)
    protected SubstanceMass substanceMass;
    @XmlElement(name = "SubstanceNote")
    protected String substanceNote;
    @XmlElementRef(name = "Threshold", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.15", type = Threshold.class, required = false)
    protected Threshold threshold;
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
     * Gets the value of the exempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExempt() {
        return exempt;
    }

    /**
     * Sets the value of the exempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExempt(String value) {
        this.exempt = value;
    }

    /**
     * Gets the value of the exemptListVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptListVersion() {
        return exemptListVersion;
    }

    /**
     * Sets the value of the exemptListVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptListVersion(String value) {
        this.exemptListVersion = value;
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
     * Gets the value of the radioactivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radioactivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadioactivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Radioactivity }
     * 
     * 
     */
    public List<Radioactivity> getRadioactivity() {
        if (radioactivity == null) {
            radioactivity = new ArrayList<Radioactivity>();
        }
        return this.radioactivity;
    }

    /**
     * Gets the value of the substanceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceIdentification }
     *     
     */
    public SubstanceIdentification getSubstanceIdentification() {
        return substanceIdentification;
    }

    /**
     * Sets the value of the substanceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceIdentification }
     *     
     */
    public void setSubstanceIdentification(SubstanceIdentification value) {
        this.substanceIdentification = value;
    }

    /**
     * Gets the value of the substanceMass property.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceMass }
     *     
     */
    public SubstanceMass getSubstanceMass() {
        return substanceMass;
    }

    /**
     * Sets the value of the substanceMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceMass }
     *     
     */
    public void setSubstanceMass(SubstanceMass value) {
        this.substanceMass = value;
    }

    /**
     * Gets the value of the substanceNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstanceNote() {
        return substanceNote;
    }

    /**
     * Sets the value of the substanceNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstanceNote(String value) {
        this.substanceNote = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link Threshold }
     *     
     */
    public Threshold getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Threshold }
     *     
     */
    public void setThreshold(Threshold value) {
        this.threshold = value;
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
        final SubstanceType that = ((SubstanceType) object);
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
            String lhsExempt;
            lhsExempt = this.getExempt();
            String rhsExempt;
            rhsExempt = that.getExempt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exempt", lhsExempt), LocatorUtils.property(thatLocator, "exempt", rhsExempt), lhsExempt, rhsExempt, (this.exempt!= null), (that.exempt!= null))) {
                return false;
            }
        }
        {
            String lhsExemptListVersion;
            lhsExemptListVersion = this.getExemptListVersion();
            String rhsExemptListVersion;
            rhsExemptListVersion = that.getExemptListVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exemptListVersion", lhsExemptListVersion), LocatorUtils.property(thatLocator, "exemptListVersion", rhsExemptListVersion), lhsExemptListVersion, rhsExemptListVersion, (this.exemptListVersion!= null), (that.exemptListVersion!= null))) {
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
            List<Radioactivity> lhsRadioactivity;
            lhsRadioactivity = (((this.radioactivity!= null)&&(!this.radioactivity.isEmpty()))?this.getRadioactivity():null);
            List<Radioactivity> rhsRadioactivity;
            rhsRadioactivity = (((that.radioactivity!= null)&&(!that.radioactivity.isEmpty()))?that.getRadioactivity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "radioactivity", lhsRadioactivity), LocatorUtils.property(thatLocator, "radioactivity", rhsRadioactivity), lhsRadioactivity, rhsRadioactivity, ((this.radioactivity!= null)&&(!this.radioactivity.isEmpty())), ((that.radioactivity!= null)&&(!that.radioactivity.isEmpty())))) {
                return false;
            }
        }
        {
            SubstanceIdentification lhsSubstanceIdentification;
            lhsSubstanceIdentification = this.getSubstanceIdentification();
            SubstanceIdentification rhsSubstanceIdentification;
            rhsSubstanceIdentification = that.getSubstanceIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substanceIdentification", lhsSubstanceIdentification), LocatorUtils.property(thatLocator, "substanceIdentification", rhsSubstanceIdentification), lhsSubstanceIdentification, rhsSubstanceIdentification, (this.substanceIdentification!= null), (that.substanceIdentification!= null))) {
                return false;
            }
        }
        {
            SubstanceMass lhsSubstanceMass;
            lhsSubstanceMass = this.getSubstanceMass();
            SubstanceMass rhsSubstanceMass;
            rhsSubstanceMass = that.getSubstanceMass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substanceMass", lhsSubstanceMass), LocatorUtils.property(thatLocator, "substanceMass", rhsSubstanceMass), lhsSubstanceMass, rhsSubstanceMass, (this.substanceMass!= null), (that.substanceMass!= null))) {
                return false;
            }
        }
        {
            String lhsSubstanceNote;
            lhsSubstanceNote = this.getSubstanceNote();
            String rhsSubstanceNote;
            rhsSubstanceNote = that.getSubstanceNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substanceNote", lhsSubstanceNote), LocatorUtils.property(thatLocator, "substanceNote", rhsSubstanceNote), lhsSubstanceNote, rhsSubstanceNote, (this.substanceNote!= null), (that.substanceNote!= null))) {
                return false;
            }
        }
        {
            Threshold lhsThreshold;
            lhsThreshold = this.getThreshold();
            Threshold rhsThreshold;
            rhsThreshold = that.getThreshold();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "threshold", lhsThreshold), LocatorUtils.property(thatLocator, "threshold", rhsThreshold), lhsThreshold, rhsThreshold, (this.threshold!= null), (that.threshold!= null))) {
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
            String theExempt;
            theExempt = this.getExempt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exempt", theExempt), currentHashCode, theExempt, (this.exempt!= null));
        }
        {
            String theExemptListVersion;
            theExemptListVersion = this.getExemptListVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exemptListVersion", theExemptListVersion), currentHashCode, theExemptListVersion, (this.exemptListVersion!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            List<Radioactivity> theRadioactivity;
            theRadioactivity = (((this.radioactivity!= null)&&(!this.radioactivity.isEmpty()))?this.getRadioactivity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "radioactivity", theRadioactivity), currentHashCode, theRadioactivity, ((this.radioactivity!= null)&&(!this.radioactivity.isEmpty())));
        }
        {
            SubstanceIdentification theSubstanceIdentification;
            theSubstanceIdentification = this.getSubstanceIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substanceIdentification", theSubstanceIdentification), currentHashCode, theSubstanceIdentification, (this.substanceIdentification!= null));
        }
        {
            SubstanceMass theSubstanceMass;
            theSubstanceMass = this.getSubstanceMass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substanceMass", theSubstanceMass), currentHashCode, theSubstanceMass, (this.substanceMass!= null));
        }
        {
            String theSubstanceNote;
            theSubstanceNote = this.getSubstanceNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substanceNote", theSubstanceNote), currentHashCode, theSubstanceNote, (this.substanceNote!= null));
        }
        {
            Threshold theThreshold;
            theThreshold = this.getThreshold();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "threshold", theThreshold), currentHashCode, theThreshold, (this.threshold!= null));
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
            String theExempt;
            theExempt = this.getExempt();
            strategy.appendField(locator, this, "exempt", buffer, theExempt, (this.exempt!= null));
        }
        {
            String theExemptListVersion;
            theExemptListVersion = this.getExemptListVersion();
            strategy.appendField(locator, this, "exemptListVersion", buffer, theExemptListVersion, (this.exemptListVersion!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            List<Radioactivity> theRadioactivity;
            theRadioactivity = (((this.radioactivity!= null)&&(!this.radioactivity.isEmpty()))?this.getRadioactivity():null);
            strategy.appendField(locator, this, "radioactivity", buffer, theRadioactivity, ((this.radioactivity!= null)&&(!this.radioactivity.isEmpty())));
        }
        {
            SubstanceIdentification theSubstanceIdentification;
            theSubstanceIdentification = this.getSubstanceIdentification();
            strategy.appendField(locator, this, "substanceIdentification", buffer, theSubstanceIdentification, (this.substanceIdentification!= null));
        }
        {
            SubstanceMass theSubstanceMass;
            theSubstanceMass = this.getSubstanceMass();
            strategy.appendField(locator, this, "substanceMass", buffer, theSubstanceMass, (this.substanceMass!= null));
        }
        {
            String theSubstanceNote;
            theSubstanceNote = this.getSubstanceNote();
            strategy.appendField(locator, this, "substanceNote", buffer, theSubstanceNote, (this.substanceNote!= null));
        }
        {
            Threshold theThreshold;
            theThreshold = this.getThreshold();
            strategy.appendField(locator, this, "threshold", buffer, theThreshold, (this.threshold!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
