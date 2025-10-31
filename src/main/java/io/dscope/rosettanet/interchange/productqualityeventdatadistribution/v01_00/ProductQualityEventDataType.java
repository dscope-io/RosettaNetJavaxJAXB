
package io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.GeographicRegionType;
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
 * <p>Java class for ProductQualityEventDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductQualityEventDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RepairAndFailureData" type="{urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00}RepairAndFailureDataType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RepairDataSupplier" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}GeographicRegionType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductQualityEventDataType", propOrder = {
    "repairAndFailureData",
    "repairDataSupplier"
})
public class ProductQualityEventDataType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "RepairAndFailureData", required = true)
    protected List<RepairAndFailureDataType> repairAndFailureData;
    @XmlElement(name = "RepairDataSupplier")
    protected GeographicRegionType repairDataSupplier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the repairAndFailureData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repairAndFailureData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepairAndFailureData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepairAndFailureDataType }
     * 
     * 
     */
    public List<RepairAndFailureDataType> getRepairAndFailureData() {
        if (repairAndFailureData == null) {
            repairAndFailureData = new ArrayList<RepairAndFailureDataType>();
        }
        return this.repairAndFailureData;
    }

    /**
     * Gets the value of the repairDataSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicRegionType }
     *     
     */
    public GeographicRegionType getRepairDataSupplier() {
        return repairDataSupplier;
    }

    /**
     * Sets the value of the repairDataSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicRegionType }
     *     
     */
    public void setRepairDataSupplier(GeographicRegionType value) {
        this.repairDataSupplier = value;
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
        final ProductQualityEventDataType that = ((ProductQualityEventDataType) object);
        {
            List<RepairAndFailureDataType> lhsRepairAndFailureData;
            lhsRepairAndFailureData = (((this.repairAndFailureData!= null)&&(!this.repairAndFailureData.isEmpty()))?this.getRepairAndFailureData():null);
            List<RepairAndFailureDataType> rhsRepairAndFailureData;
            rhsRepairAndFailureData = (((that.repairAndFailureData!= null)&&(!that.repairAndFailureData.isEmpty()))?that.getRepairAndFailureData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "repairAndFailureData", lhsRepairAndFailureData), LocatorUtils.property(thatLocator, "repairAndFailureData", rhsRepairAndFailureData), lhsRepairAndFailureData, rhsRepairAndFailureData, ((this.repairAndFailureData!= null)&&(!this.repairAndFailureData.isEmpty())), ((that.repairAndFailureData!= null)&&(!that.repairAndFailureData.isEmpty())))) {
                return false;
            }
        }
        {
            GeographicRegionType lhsRepairDataSupplier;
            lhsRepairDataSupplier = this.getRepairDataSupplier();
            GeographicRegionType rhsRepairDataSupplier;
            rhsRepairDataSupplier = that.getRepairDataSupplier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "repairDataSupplier", lhsRepairDataSupplier), LocatorUtils.property(thatLocator, "repairDataSupplier", rhsRepairDataSupplier), lhsRepairDataSupplier, rhsRepairDataSupplier, (this.repairDataSupplier!= null), (that.repairDataSupplier!= null))) {
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
            List<RepairAndFailureDataType> theRepairAndFailureData;
            theRepairAndFailureData = (((this.repairAndFailureData!= null)&&(!this.repairAndFailureData.isEmpty()))?this.getRepairAndFailureData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "repairAndFailureData", theRepairAndFailureData), currentHashCode, theRepairAndFailureData, ((this.repairAndFailureData!= null)&&(!this.repairAndFailureData.isEmpty())));
        }
        {
            GeographicRegionType theRepairDataSupplier;
            theRepairDataSupplier = this.getRepairDataSupplier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "repairDataSupplier", theRepairDataSupplier), currentHashCode, theRepairDataSupplier, (this.repairDataSupplier!= null));
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
            List<RepairAndFailureDataType> theRepairAndFailureData;
            theRepairAndFailureData = (((this.repairAndFailureData!= null)&&(!this.repairAndFailureData.isEmpty()))?this.getRepairAndFailureData():null);
            strategy.appendField(locator, this, "repairAndFailureData", buffer, theRepairAndFailureData, ((this.repairAndFailureData!= null)&&(!this.repairAndFailureData.isEmpty())));
        }
        {
            GeographicRegionType theRepairDataSupplier;
            theRepairDataSupplier = this.getRepairDataSupplier();
            strategy.appendField(locator, this, "repairDataSupplier", buffer, theRepairDataSupplier, (this.repairDataSupplier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
