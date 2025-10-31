
package io.dscope.rosettanet.domain.design.design.v02_22;

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
import io.dscope.rosettanet.domain.design.codelist.compliant.v01_03.Compliant;
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
 * <p>Java class for DirectiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectiveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:Compliant:xsd:codelist:01.03}Compliant"/&gt;
 *         &lt;element name="Exemption" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LegalDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SupplierAcceptance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "DirectiveType", propOrder = {
    "compliant",
    "exemption",
    "legalDefinition",
    "legalType",
    "name",
    "supplierAcceptance",
    "version"
})
public class DirectiveType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "Compliant", namespace = "urn:rosettanet:specification:domain:Design:Compliant:xsd:codelist:01.03", type = Compliant.class)
    protected Compliant compliant;
    @XmlElement(name = "Exemption")
    protected List<String> exemption;
    @XmlElement(name = "LegalDefinition")
    protected String legalDefinition;
    @XmlElement(name = "LegalType")
    protected String legalType;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "SupplierAcceptance")
    protected Boolean supplierAcceptance;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the compliant property.
     * 
     * @return
     *     possible object is
     *     {@link Compliant }
     *     
     */
    public Compliant getCompliant() {
        return compliant;
    }

    /**
     * Sets the value of the compliant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Compliant }
     *     
     */
    public void setCompliant(Compliant value) {
        this.compliant = value;
    }

    /**
     * Gets the value of the exemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExemption() {
        if (exemption == null) {
            exemption = new ArrayList<String>();
        }
        return this.exemption;
    }

    /**
     * Gets the value of the legalDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalDefinition() {
        return legalDefinition;
    }

    /**
     * Sets the value of the legalDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalDefinition(String value) {
        this.legalDefinition = value;
    }

    /**
     * Gets the value of the legalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalType() {
        return legalType;
    }

    /**
     * Sets the value of the legalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalType(String value) {
        this.legalType = value;
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
     * Gets the value of the supplierAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupplierAcceptance() {
        return supplierAcceptance;
    }

    /**
     * Sets the value of the supplierAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupplierAcceptance(Boolean value) {
        this.supplierAcceptance = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
        final DirectiveType that = ((DirectiveType) object);
        {
            Compliant lhsCompliant;
            lhsCompliant = this.getCompliant();
            Compliant rhsCompliant;
            rhsCompliant = that.getCompliant();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compliant", lhsCompliant), LocatorUtils.property(thatLocator, "compliant", rhsCompliant), lhsCompliant, rhsCompliant, (this.compliant!= null), (that.compliant!= null))) {
                return false;
            }
        }
        {
            List<String> lhsExemption;
            lhsExemption = (((this.exemption!= null)&&(!this.exemption.isEmpty()))?this.getExemption():null);
            List<String> rhsExemption;
            rhsExemption = (((that.exemption!= null)&&(!that.exemption.isEmpty()))?that.getExemption():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exemption", lhsExemption), LocatorUtils.property(thatLocator, "exemption", rhsExemption), lhsExemption, rhsExemption, ((this.exemption!= null)&&(!this.exemption.isEmpty())), ((that.exemption!= null)&&(!that.exemption.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsLegalDefinition;
            lhsLegalDefinition = this.getLegalDefinition();
            String rhsLegalDefinition;
            rhsLegalDefinition = that.getLegalDefinition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legalDefinition", lhsLegalDefinition), LocatorUtils.property(thatLocator, "legalDefinition", rhsLegalDefinition), lhsLegalDefinition, rhsLegalDefinition, (this.legalDefinition!= null), (that.legalDefinition!= null))) {
                return false;
            }
        }
        {
            String lhsLegalType;
            lhsLegalType = this.getLegalType();
            String rhsLegalType;
            rhsLegalType = that.getLegalType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legalType", lhsLegalType), LocatorUtils.property(thatLocator, "legalType", rhsLegalType), lhsLegalType, rhsLegalType, (this.legalType!= null), (that.legalType!= null))) {
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
            Boolean lhsSupplierAcceptance;
            lhsSupplierAcceptance = this.isSupplierAcceptance();
            Boolean rhsSupplierAcceptance;
            rhsSupplierAcceptance = that.isSupplierAcceptance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplierAcceptance", lhsSupplierAcceptance), LocatorUtils.property(thatLocator, "supplierAcceptance", rhsSupplierAcceptance), lhsSupplierAcceptance, rhsSupplierAcceptance, (this.supplierAcceptance!= null), (that.supplierAcceptance!= null))) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion, (this.version!= null), (that.version!= null))) {
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
            Compliant theCompliant;
            theCompliant = this.getCompliant();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compliant", theCompliant), currentHashCode, theCompliant, (this.compliant!= null));
        }
        {
            List<String> theExemption;
            theExemption = (((this.exemption!= null)&&(!this.exemption.isEmpty()))?this.getExemption():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exemption", theExemption), currentHashCode, theExemption, ((this.exemption!= null)&&(!this.exemption.isEmpty())));
        }
        {
            String theLegalDefinition;
            theLegalDefinition = this.getLegalDefinition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legalDefinition", theLegalDefinition), currentHashCode, theLegalDefinition, (this.legalDefinition!= null));
        }
        {
            String theLegalType;
            theLegalType = this.getLegalType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legalType", theLegalType), currentHashCode, theLegalType, (this.legalType!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            Boolean theSupplierAcceptance;
            theSupplierAcceptance = this.isSupplierAcceptance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplierAcceptance", theSupplierAcceptance), currentHashCode, theSupplierAcceptance, (this.supplierAcceptance!= null));
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion, (this.version!= null));
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
            Compliant theCompliant;
            theCompliant = this.getCompliant();
            strategy.appendField(locator, this, "compliant", buffer, theCompliant, (this.compliant!= null));
        }
        {
            List<String> theExemption;
            theExemption = (((this.exemption!= null)&&(!this.exemption.isEmpty()))?this.getExemption():null);
            strategy.appendField(locator, this, "exemption", buffer, theExemption, ((this.exemption!= null)&&(!this.exemption.isEmpty())));
        }
        {
            String theLegalDefinition;
            theLegalDefinition = this.getLegalDefinition();
            strategy.appendField(locator, this, "legalDefinition", buffer, theLegalDefinition, (this.legalDefinition!= null));
        }
        {
            String theLegalType;
            theLegalType = this.getLegalType();
            strategy.appendField(locator, this, "legalType", buffer, theLegalType, (this.legalType!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            Boolean theSupplierAcceptance;
            theSupplierAcceptance = this.isSupplierAcceptance();
            strategy.appendField(locator, this, "supplierAcceptance", buffer, theSupplierAcceptance, (this.supplierAcceptance!= null));
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion, (this.version!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
