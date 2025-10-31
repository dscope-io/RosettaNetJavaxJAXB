
package io.dscope.rosettanet.domain.logistics.logistics.v02_05;

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
import io.dscope.rosettanet.domain.shared.codelist.packagetypecode.v01_01.PackageTypeCode;
import io.dscope.rosettanet.domain.shared.shared.v01_03.DatePeriodAndDuration;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_02.UnitOfMeasure;
import io.dscope.rosettanet.universal.physicaldimension.v01_03.Linear;
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
 * <p>Java class for ProductPackagingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPackagingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.03}DatePeriodAndDuration" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.03}Linear" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.05}MassPhysicalDimension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01}PackageTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.02}UnitOfMeasure"/&gt;
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
@XmlType(name = "ProductPackagingType", propOrder = {
    "datePeriodAndDuration",
    "linear",
    "massPhysicalDimension",
    "packageTypeCode",
    "unitOfMeasure"
})
public class ProductPackagingType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DatePeriodAndDuration", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.03", type = DatePeriodAndDuration.class, required = false)
    protected DatePeriodAndDuration datePeriodAndDuration;
    @XmlElementRef(name = "Linear", namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.03", type = Linear.class, required = false)
    protected Linear linear;
    @XmlElementRef(name = "MassPhysicalDimension", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.05", type = MassPhysicalDimension.class, required = false)
    protected MassPhysicalDimension massPhysicalDimension;
    @XmlElementRef(name = "PackageTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01", type = PackageTypeCode.class, required = false)
    protected List<PackageTypeCode> packageTypeCode;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.02", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the datePeriodAndDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDuration }
     *     
     */
    public DatePeriodAndDuration getDatePeriodAndDuration() {
        return datePeriodAndDuration;
    }

    /**
     * Sets the value of the datePeriodAndDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDuration }
     *     
     */
    public void setDatePeriodAndDuration(DatePeriodAndDuration value) {
        this.datePeriodAndDuration = value;
    }

    /**
     * Gets the value of the linear property.
     * 
     * @return
     *     possible object is
     *     {@link Linear }
     *     
     */
    public Linear getLinear() {
        return linear;
    }

    /**
     * Sets the value of the linear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linear }
     *     
     */
    public void setLinear(Linear value) {
        this.linear = value;
    }

    /**
     * Gets the value of the massPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link MassPhysicalDimension }
     *     
     */
    public MassPhysicalDimension getMassPhysicalDimension() {
        return massPhysicalDimension;
    }

    /**
     * Sets the value of the massPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassPhysicalDimension }
     *     
     */
    public void setMassPhysicalDimension(MassPhysicalDimension value) {
        this.massPhysicalDimension = value;
    }

    /**
     * Gets the value of the packageTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageTypeCode }
     * 
     * 
     */
    public List<PackageTypeCode> getPackageTypeCode() {
        if (packageTypeCode == null) {
            packageTypeCode = new ArrayList<PackageTypeCode>();
        }
        return this.packageTypeCode;
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
        final ProductPackagingType that = ((ProductPackagingType) object);
        {
            DatePeriodAndDuration lhsDatePeriodAndDuration;
            lhsDatePeriodAndDuration = this.getDatePeriodAndDuration();
            DatePeriodAndDuration rhsDatePeriodAndDuration;
            rhsDatePeriodAndDuration = that.getDatePeriodAndDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "datePeriodAndDuration", lhsDatePeriodAndDuration), LocatorUtils.property(thatLocator, "datePeriodAndDuration", rhsDatePeriodAndDuration), lhsDatePeriodAndDuration, rhsDatePeriodAndDuration, (this.datePeriodAndDuration!= null), (that.datePeriodAndDuration!= null))) {
                return false;
            }
        }
        {
            Linear lhsLinear;
            lhsLinear = this.getLinear();
            Linear rhsLinear;
            rhsLinear = that.getLinear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "linear", lhsLinear), LocatorUtils.property(thatLocator, "linear", rhsLinear), lhsLinear, rhsLinear, (this.linear!= null), (that.linear!= null))) {
                return false;
            }
        }
        {
            MassPhysicalDimension lhsMassPhysicalDimension;
            lhsMassPhysicalDimension = this.getMassPhysicalDimension();
            MassPhysicalDimension rhsMassPhysicalDimension;
            rhsMassPhysicalDimension = that.getMassPhysicalDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "massPhysicalDimension", lhsMassPhysicalDimension), LocatorUtils.property(thatLocator, "massPhysicalDimension", rhsMassPhysicalDimension), lhsMassPhysicalDimension, rhsMassPhysicalDimension, (this.massPhysicalDimension!= null), (that.massPhysicalDimension!= null))) {
                return false;
            }
        }
        {
            List<PackageTypeCode> lhsPackageTypeCode;
            lhsPackageTypeCode = (((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty()))?this.getPackageTypeCode():null);
            List<PackageTypeCode> rhsPackageTypeCode;
            rhsPackageTypeCode = (((that.packageTypeCode!= null)&&(!that.packageTypeCode.isEmpty()))?that.getPackageTypeCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageTypeCode", lhsPackageTypeCode), LocatorUtils.property(thatLocator, "packageTypeCode", rhsPackageTypeCode), lhsPackageTypeCode, rhsPackageTypeCode, ((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty())), ((that.packageTypeCode!= null)&&(!that.packageTypeCode.isEmpty())))) {
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
            DatePeriodAndDuration theDatePeriodAndDuration;
            theDatePeriodAndDuration = this.getDatePeriodAndDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "datePeriodAndDuration", theDatePeriodAndDuration), currentHashCode, theDatePeriodAndDuration, (this.datePeriodAndDuration!= null));
        }
        {
            Linear theLinear;
            theLinear = this.getLinear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "linear", theLinear), currentHashCode, theLinear, (this.linear!= null));
        }
        {
            MassPhysicalDimension theMassPhysicalDimension;
            theMassPhysicalDimension = this.getMassPhysicalDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "massPhysicalDimension", theMassPhysicalDimension), currentHashCode, theMassPhysicalDimension, (this.massPhysicalDimension!= null));
        }
        {
            List<PackageTypeCode> thePackageTypeCode;
            thePackageTypeCode = (((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty()))?this.getPackageTypeCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageTypeCode", thePackageTypeCode), currentHashCode, thePackageTypeCode, ((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty())));
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
            DatePeriodAndDuration theDatePeriodAndDuration;
            theDatePeriodAndDuration = this.getDatePeriodAndDuration();
            strategy.appendField(locator, this, "datePeriodAndDuration", buffer, theDatePeriodAndDuration, (this.datePeriodAndDuration!= null));
        }
        {
            Linear theLinear;
            theLinear = this.getLinear();
            strategy.appendField(locator, this, "linear", buffer, theLinear, (this.linear!= null));
        }
        {
            MassPhysicalDimension theMassPhysicalDimension;
            theMassPhysicalDimension = this.getMassPhysicalDimension();
            strategy.appendField(locator, this, "massPhysicalDimension", buffer, theMassPhysicalDimension, (this.massPhysicalDimension!= null));
        }
        {
            List<PackageTypeCode> thePackageTypeCode;
            thePackageTypeCode = (((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty()))?this.getPackageTypeCode():null);
            strategy.appendField(locator, this, "packageTypeCode", buffer, thePackageTypeCode, ((this.packageTypeCode!= null)&&(!this.packageTypeCode.isEmpty())));
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
