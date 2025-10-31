
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_02;

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
import io.dscope.rosettanet.universal.physicaldimension.v01_07.MeasureType;
import io.dscope.rosettanet.universal.physicaldimension.v01_07.Volume;
import io.dscope.rosettanet.universal.physicaldimension.v01_07.Weight;
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
 * <p>Java class for PackagingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BackFillGas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChemicalFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Container" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.02}ContainerType" minOccurs="0"/&gt;
 *         &lt;element name="Pressure" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="Valve" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.02}ValveType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07}Volume" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07}Weight" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PackagingType", propOrder = {
    "backFillGas",
    "chemicalFormula",
    "container",
    "pressure",
    "valve",
    "volume",
    "weight"
})
public class PackagingType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BackFillGas")
    protected String backFillGas;
    @XmlElement(name = "ChemicalFormula")
    protected String chemicalFormula;
    @XmlElement(name = "Container")
    protected ContainerType container;
    @XmlElement(name = "Pressure")
    protected MeasureType pressure;
    @XmlElement(name = "Valve")
    protected ValveType valve;
    @XmlElementRef(name = "Volume", namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07", type = Volume.class, required = false)
    protected Volume volume;
    @XmlElementRef(name = "Weight", namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07", type = Weight.class, required = false)
    protected List<Weight> weight;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the backFillGas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackFillGas() {
        return backFillGas;
    }

    /**
     * Sets the value of the backFillGas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackFillGas(String value) {
        this.backFillGas = value;
    }

    /**
     * Gets the value of the chemicalFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalFormula() {
        return chemicalFormula;
    }

    /**
     * Sets the value of the chemicalFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalFormula(String value) {
        this.chemicalFormula = value;
    }

    /**
     * Gets the value of the container property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerType }
     *     
     */
    public ContainerType getContainer() {
        return container;
    }

    /**
     * Sets the value of the container property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerType }
     *     
     */
    public void setContainer(ContainerType value) {
        this.container = value;
    }

    /**
     * Gets the value of the pressure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPressure(MeasureType value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the valve property.
     * 
     * @return
     *     possible object is
     *     {@link ValveType }
     *     
     */
    public ValveType getValve() {
        return valve;
    }

    /**
     * Sets the value of the valve property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValveType }
     *     
     */
    public void setValve(ValveType value) {
        this.valve = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Volume }
     *     
     */
    public Volume getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Volume }
     *     
     */
    public void setVolume(Volume value) {
        this.volume = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Weight }
     * 
     * 
     */
    public List<Weight> getWeight() {
        if (weight == null) {
            weight = new ArrayList<Weight>();
        }
        return this.weight;
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
        final PackagingType that = ((PackagingType) object);
        {
            String lhsBackFillGas;
            lhsBackFillGas = this.getBackFillGas();
            String rhsBackFillGas;
            rhsBackFillGas = that.getBackFillGas();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "backFillGas", lhsBackFillGas), LocatorUtils.property(thatLocator, "backFillGas", rhsBackFillGas), lhsBackFillGas, rhsBackFillGas, (this.backFillGas!= null), (that.backFillGas!= null))) {
                return false;
            }
        }
        {
            String lhsChemicalFormula;
            lhsChemicalFormula = this.getChemicalFormula();
            String rhsChemicalFormula;
            rhsChemicalFormula = that.getChemicalFormula();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chemicalFormula", lhsChemicalFormula), LocatorUtils.property(thatLocator, "chemicalFormula", rhsChemicalFormula), lhsChemicalFormula, rhsChemicalFormula, (this.chemicalFormula!= null), (that.chemicalFormula!= null))) {
                return false;
            }
        }
        {
            ContainerType lhsContainer;
            lhsContainer = this.getContainer();
            ContainerType rhsContainer;
            rhsContainer = that.getContainer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "container", lhsContainer), LocatorUtils.property(thatLocator, "container", rhsContainer), lhsContainer, rhsContainer, (this.container!= null), (that.container!= null))) {
                return false;
            }
        }
        {
            MeasureType lhsPressure;
            lhsPressure = this.getPressure();
            MeasureType rhsPressure;
            rhsPressure = that.getPressure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pressure", lhsPressure), LocatorUtils.property(thatLocator, "pressure", rhsPressure), lhsPressure, rhsPressure, (this.pressure!= null), (that.pressure!= null))) {
                return false;
            }
        }
        {
            ValveType lhsValve;
            lhsValve = this.getValve();
            ValveType rhsValve;
            rhsValve = that.getValve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valve", lhsValve), LocatorUtils.property(thatLocator, "valve", rhsValve), lhsValve, rhsValve, (this.valve!= null), (that.valve!= null))) {
                return false;
            }
        }
        {
            Volume lhsVolume;
            lhsVolume = this.getVolume();
            Volume rhsVolume;
            rhsVolume = that.getVolume();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "volume", lhsVolume), LocatorUtils.property(thatLocator, "volume", rhsVolume), lhsVolume, rhsVolume, (this.volume!= null), (that.volume!= null))) {
                return false;
            }
        }
        {
            List<Weight> lhsWeight;
            lhsWeight = (((this.weight!= null)&&(!this.weight.isEmpty()))?this.getWeight():null);
            List<Weight> rhsWeight;
            rhsWeight = (((that.weight!= null)&&(!that.weight.isEmpty()))?that.getWeight():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weight", lhsWeight), LocatorUtils.property(thatLocator, "weight", rhsWeight), lhsWeight, rhsWeight, ((this.weight!= null)&&(!this.weight.isEmpty())), ((that.weight!= null)&&(!that.weight.isEmpty())))) {
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
            String theBackFillGas;
            theBackFillGas = this.getBackFillGas();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "backFillGas", theBackFillGas), currentHashCode, theBackFillGas, (this.backFillGas!= null));
        }
        {
            String theChemicalFormula;
            theChemicalFormula = this.getChemicalFormula();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chemicalFormula", theChemicalFormula), currentHashCode, theChemicalFormula, (this.chemicalFormula!= null));
        }
        {
            ContainerType theContainer;
            theContainer = this.getContainer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "container", theContainer), currentHashCode, theContainer, (this.container!= null));
        }
        {
            MeasureType thePressure;
            thePressure = this.getPressure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pressure", thePressure), currentHashCode, thePressure, (this.pressure!= null));
        }
        {
            ValveType theValve;
            theValve = this.getValve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valve", theValve), currentHashCode, theValve, (this.valve!= null));
        }
        {
            Volume theVolume;
            theVolume = this.getVolume();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "volume", theVolume), currentHashCode, theVolume, (this.volume!= null));
        }
        {
            List<Weight> theWeight;
            theWeight = (((this.weight!= null)&&(!this.weight.isEmpty()))?this.getWeight():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weight", theWeight), currentHashCode, theWeight, ((this.weight!= null)&&(!this.weight.isEmpty())));
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
            String theBackFillGas;
            theBackFillGas = this.getBackFillGas();
            strategy.appendField(locator, this, "backFillGas", buffer, theBackFillGas, (this.backFillGas!= null));
        }
        {
            String theChemicalFormula;
            theChemicalFormula = this.getChemicalFormula();
            strategy.appendField(locator, this, "chemicalFormula", buffer, theChemicalFormula, (this.chemicalFormula!= null));
        }
        {
            ContainerType theContainer;
            theContainer = this.getContainer();
            strategy.appendField(locator, this, "container", buffer, theContainer, (this.container!= null));
        }
        {
            MeasureType thePressure;
            thePressure = this.getPressure();
            strategy.appendField(locator, this, "pressure", buffer, thePressure, (this.pressure!= null));
        }
        {
            ValveType theValve;
            theValve = this.getValve();
            strategy.appendField(locator, this, "valve", buffer, theValve, (this.valve!= null));
        }
        {
            Volume theVolume;
            theVolume = this.getVolume();
            strategy.appendField(locator, this, "volume", buffer, theVolume, (this.volume!= null));
        }
        {
            List<Weight> theWeight;
            theWeight = (((this.weight!= null)&&(!this.weight.isEmpty()))?this.getWeight():null);
            strategy.appendField(locator, this, "weight", buffer, theWeight, ((this.weight!= null)&&(!this.weight.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
