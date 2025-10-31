
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ManufacturingLotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingLotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LotTraceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryLot" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}LotType"/&gt;
 *         &lt;element name="WaferInformation" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}WaferInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ManufacturingLotType", propOrder = {
    "lotTraceCode",
    "primaryLot",
    "waferInformation"
})
public class ManufacturingLotType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "LotTraceCode")
    protected String lotTraceCode;
    @XmlElement(name = "PrimaryLot", required = true)
    protected LotType primaryLot;
    @XmlElement(name = "WaferInformation")
    protected List<WaferInformationType> waferInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lotTraceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotTraceCode() {
        return lotTraceCode;
    }

    /**
     * Sets the value of the lotTraceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotTraceCode(String value) {
        this.lotTraceCode = value;
    }

    /**
     * Gets the value of the primaryLot property.
     * 
     * @return
     *     possible object is
     *     {@link LotType }
     *     
     */
    public LotType getPrimaryLot() {
        return primaryLot;
    }

    /**
     * Sets the value of the primaryLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotType }
     *     
     */
    public void setPrimaryLot(LotType value) {
        this.primaryLot = value;
    }

    /**
     * Gets the value of the waferInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waferInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaferInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaferInformationType }
     * 
     * 
     */
    public List<WaferInformationType> getWaferInformation() {
        if (waferInformation == null) {
            waferInformation = new ArrayList<WaferInformationType>();
        }
        return this.waferInformation;
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
        final ManufacturingLotType that = ((ManufacturingLotType) object);
        {
            String lhsLotTraceCode;
            lhsLotTraceCode = this.getLotTraceCode();
            String rhsLotTraceCode;
            rhsLotTraceCode = that.getLotTraceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotTraceCode", lhsLotTraceCode), LocatorUtils.property(thatLocator, "lotTraceCode", rhsLotTraceCode), lhsLotTraceCode, rhsLotTraceCode, (this.lotTraceCode!= null), (that.lotTraceCode!= null))) {
                return false;
            }
        }
        {
            LotType lhsPrimaryLot;
            lhsPrimaryLot = this.getPrimaryLot();
            LotType rhsPrimaryLot;
            rhsPrimaryLot = that.getPrimaryLot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryLot", lhsPrimaryLot), LocatorUtils.property(thatLocator, "primaryLot", rhsPrimaryLot), lhsPrimaryLot, rhsPrimaryLot, (this.primaryLot!= null), (that.primaryLot!= null))) {
                return false;
            }
        }
        {
            List<WaferInformationType> lhsWaferInformation;
            lhsWaferInformation = (((this.waferInformation!= null)&&(!this.waferInformation.isEmpty()))?this.getWaferInformation():null);
            List<WaferInformationType> rhsWaferInformation;
            rhsWaferInformation = (((that.waferInformation!= null)&&(!that.waferInformation.isEmpty()))?that.getWaferInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferInformation", lhsWaferInformation), LocatorUtils.property(thatLocator, "waferInformation", rhsWaferInformation), lhsWaferInformation, rhsWaferInformation, ((this.waferInformation!= null)&&(!this.waferInformation.isEmpty())), ((that.waferInformation!= null)&&(!that.waferInformation.isEmpty())))) {
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
            String theLotTraceCode;
            theLotTraceCode = this.getLotTraceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotTraceCode", theLotTraceCode), currentHashCode, theLotTraceCode, (this.lotTraceCode!= null));
        }
        {
            LotType thePrimaryLot;
            thePrimaryLot = this.getPrimaryLot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryLot", thePrimaryLot), currentHashCode, thePrimaryLot, (this.primaryLot!= null));
        }
        {
            List<WaferInformationType> theWaferInformation;
            theWaferInformation = (((this.waferInformation!= null)&&(!this.waferInformation.isEmpty()))?this.getWaferInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferInformation", theWaferInformation), currentHashCode, theWaferInformation, ((this.waferInformation!= null)&&(!this.waferInformation.isEmpty())));
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
            String theLotTraceCode;
            theLotTraceCode = this.getLotTraceCode();
            strategy.appendField(locator, this, "lotTraceCode", buffer, theLotTraceCode, (this.lotTraceCode!= null));
        }
        {
            LotType thePrimaryLot;
            thePrimaryLot = this.getPrimaryLot();
            strategy.appendField(locator, this, "primaryLot", buffer, thePrimaryLot, (this.primaryLot!= null));
        }
        {
            List<WaferInformationType> theWaferInformation;
            theWaferInformation = (((this.waferInformation!= null)&&(!this.waferInformation.isEmpty()))?this.getWaferInformation():null);
            strategy.appendField(locator, this, "waferInformation", buffer, theWaferInformation, ((this.waferInformation!= null)&&(!this.waferInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
