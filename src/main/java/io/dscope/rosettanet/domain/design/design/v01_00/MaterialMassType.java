
package io.dscope.rosettanet.domain.design.design.v01_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_00.UnitOfMeasure;
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
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:drdfl="urn:rosettanet:specification:domain:Design:ProductLifeCycleStatusCode:xsd:codelist:01.01" xmlns:drnct="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01" xmlns:drnlv="urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.01" xmlns:tns="urn:rosettanet:specification:domain:Design:xsd:schema:01.01" xmlns:udts="urn:rosettanet:specification:universal:Dates:xsd:schema:01.01" xmlns:udtyp="urn:rosettanet:specification:universal:DataType:xsd:schema:01.01" xmlns:ulctn="urn:rosettanet:specification:universal:Locations:xsd:schema:01.01" xmlns:updtn="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:urntf="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;If the occurence of MaterialMass/Mass is between 1 and unbounded then the value of MaterialMass/UnitOfMeasure MUST be 'KIG'.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:drdfl="urn:rosettanet:specification:domain:Design:ProductLifeCycleStatusCode:xsd:codelist:01.01" xmlns:drnct="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01" xmlns:drnlv="urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.01" xmlns:tns="urn:rosettanet:specification:domain:Design:xsd:schema:01.01" xmlns:udts="urn:rosettanet:specification:universal:Dates:xsd:schema:01.01" xmlns:udtyp="urn:rosettanet:specification:universal:DataType:xsd:schema:01.01" xmlns:ulctn="urn:rosettanet:specification:universal:Locations:xsd:schema:01.01" xmlns:updtn="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:urntf="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;If the occurence of MaterialMass/MassPercentage is between 1 and unbounded then the value of MaterialMass/UnitOfMeasure MUST be 'KIG'.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for MaterialMassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialMassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}Mass" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}MassPercentage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01}UnitOfMeasure"/&gt;
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
@XmlType(name = "MaterialMassType", propOrder = {
    "mass",
    "massPercentage",
    "unitOfMeasure"
})
public class MaterialMassType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "Mass", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Mass.class, required = false)
    protected List<Mass> mass;
    @XmlElementRef(name = "MassPercentage", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = MassPercentage.class, required = false)
    protected List<MassPercentage> massPercentage;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the mass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mass }
     * 
     * 
     */
    public List<Mass> getMass() {
        if (mass == null) {
            mass = new ArrayList<Mass>();
        }
        return this.mass;
    }

    /**
     * Gets the value of the massPercentage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the massPercentage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMassPercentage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MassPercentage }
     * 
     * 
     */
    public List<MassPercentage> getMassPercentage() {
        if (massPercentage == null) {
            massPercentage = new ArrayList<MassPercentage>();
        }
        return this.massPercentage;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
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
        final MaterialMassType that = ((MaterialMassType) object);
        {
            List<Mass> lhsMass;
            lhsMass = (((this.mass!= null)&&(!this.mass.isEmpty()))?this.getMass():null);
            List<Mass> rhsMass;
            rhsMass = (((that.mass!= null)&&(!that.mass.isEmpty()))?that.getMass():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mass", lhsMass), LocatorUtils.property(thatLocator, "mass", rhsMass), lhsMass, rhsMass, ((this.mass!= null)&&(!this.mass.isEmpty())), ((that.mass!= null)&&(!that.mass.isEmpty())))) {
                return false;
            }
        }
        {
            List<MassPercentage> lhsMassPercentage;
            lhsMassPercentage = (((this.massPercentage!= null)&&(!this.massPercentage.isEmpty()))?this.getMassPercentage():null);
            List<MassPercentage> rhsMassPercentage;
            rhsMassPercentage = (((that.massPercentage!= null)&&(!that.massPercentage.isEmpty()))?that.getMassPercentage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "massPercentage", lhsMassPercentage), LocatorUtils.property(thatLocator, "massPercentage", rhsMassPercentage), lhsMassPercentage, rhsMassPercentage, ((this.massPercentage!= null)&&(!this.massPercentage.isEmpty())), ((that.massPercentage!= null)&&(!that.massPercentage.isEmpty())))) {
                return false;
            }
        }
        {
            UnitOfMeasure lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            UnitOfMeasure rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, (this.unitOfMeasure!= null), (that.unitOfMeasure!= null))) {
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
            List<Mass> theMass;
            theMass = (((this.mass!= null)&&(!this.mass.isEmpty()))?this.getMass():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mass", theMass), currentHashCode, theMass, ((this.mass!= null)&&(!this.mass.isEmpty())));
        }
        {
            List<MassPercentage> theMassPercentage;
            theMassPercentage = (((this.massPercentage!= null)&&(!this.massPercentage.isEmpty()))?this.getMassPercentage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "massPercentage", theMassPercentage), currentHashCode, theMassPercentage, ((this.massPercentage!= null)&&(!this.massPercentage.isEmpty())));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
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
            List<Mass> theMass;
            theMass = (((this.mass!= null)&&(!this.mass.isEmpty()))?this.getMass():null);
            strategy.appendField(locator, this, "mass", buffer, theMass, ((this.mass!= null)&&(!this.mass.isEmpty())));
        }
        {
            List<MassPercentage> theMassPercentage;
            theMassPercentage = (((this.massPercentage!= null)&&(!this.massPercentage.isEmpty()))?this.getMassPercentage():null);
            strategy.appendField(locator, this, "massPercentage", buffer, theMassPercentage, ((this.massPercentage!= null)&&(!this.massPercentage.isEmpty())));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
