
package io.dscope.rosettanet.interchange.approvedmanufacturerlistconfirmationnotification.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.supplierpartstatus.v01_00.SupplierPartStatus;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescriptionType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;
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
 * <p>Java class for ApprovedSupplierListItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovedSupplierListItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType"/&gt;
 *         &lt;element name="SuppliedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescriptionType"/&gt;
 *         &lt;element name="SupplierItem" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:SupplierPartStatus:xsd:codelist:1.0}SupplierPartStatus"/&gt;
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
@XmlType(name = "ApprovedSupplierListItemType", propOrder = {
    "description",
    "effectiveDatePeriod",
    "suppliedBy",
    "supplierItem",
    "supplierPartStatus"
})
public class ApprovedSupplierListItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "EffectiveDatePeriod", required = true)
    protected DatePeriodType effectiveDatePeriod;
    @XmlElement(name = "SuppliedBy", required = true)
    protected PartnerDescriptionType suppliedBy;
    @XmlElement(name = "SupplierItem", required = true)
    protected ProductIdentificationType supplierItem;
    @XmlElementRef(name = "SupplierPartStatus", namespace = "urn:rosettanet:specification:domain:Logistics:SupplierPartStatus:xsd:codelist:1.0", type = SupplierPartStatus.class)
    protected SupplierPartStatus supplierPartStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the effectiveDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveDatePeriod() {
        return effectiveDatePeriod;
    }

    /**
     * Sets the value of the effectiveDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveDatePeriod(DatePeriodType value) {
        this.effectiveDatePeriod = value;
    }

    /**
     * Gets the value of the suppliedBy property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public PartnerDescriptionType getSuppliedBy() {
        return suppliedBy;
    }

    /**
     * Sets the value of the suppliedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public void setSuppliedBy(PartnerDescriptionType value) {
        this.suppliedBy = value;
    }

    /**
     * Gets the value of the supplierItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getSupplierItem() {
        return supplierItem;
    }

    /**
     * Sets the value of the supplierItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setSupplierItem(ProductIdentificationType value) {
        this.supplierItem = value;
    }

    /**
     * Gets the value of the supplierPartStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartStatus }
     *     
     */
    public SupplierPartStatus getSupplierPartStatus() {
        return supplierPartStatus;
    }

    /**
     * Sets the value of the supplierPartStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartStatus }
     *     
     */
    public void setSupplierPartStatus(SupplierPartStatus value) {
        this.supplierPartStatus = value;
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
        final ApprovedSupplierListItemType that = ((ApprovedSupplierListItemType) object);
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            DatePeriodType lhsEffectiveDatePeriod;
            lhsEffectiveDatePeriod = this.getEffectiveDatePeriod();
            DatePeriodType rhsEffectiveDatePeriod;
            rhsEffectiveDatePeriod = that.getEffectiveDatePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveDatePeriod", lhsEffectiveDatePeriod), LocatorUtils.property(thatLocator, "effectiveDatePeriod", rhsEffectiveDatePeriod), lhsEffectiveDatePeriod, rhsEffectiveDatePeriod, (this.effectiveDatePeriod!= null), (that.effectiveDatePeriod!= null))) {
                return false;
            }
        }
        {
            PartnerDescriptionType lhsSuppliedBy;
            lhsSuppliedBy = this.getSuppliedBy();
            PartnerDescriptionType rhsSuppliedBy;
            rhsSuppliedBy = that.getSuppliedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suppliedBy", lhsSuppliedBy), LocatorUtils.property(thatLocator, "suppliedBy", rhsSuppliedBy), lhsSuppliedBy, rhsSuppliedBy, (this.suppliedBy!= null), (that.suppliedBy!= null))) {
                return false;
            }
        }
        {
            ProductIdentificationType lhsSupplierItem;
            lhsSupplierItem = this.getSupplierItem();
            ProductIdentificationType rhsSupplierItem;
            rhsSupplierItem = that.getSupplierItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplierItem", lhsSupplierItem), LocatorUtils.property(thatLocator, "supplierItem", rhsSupplierItem), lhsSupplierItem, rhsSupplierItem, (this.supplierItem!= null), (that.supplierItem!= null))) {
                return false;
            }
        }
        {
            SupplierPartStatus lhsSupplierPartStatus;
            lhsSupplierPartStatus = this.getSupplierPartStatus();
            SupplierPartStatus rhsSupplierPartStatus;
            rhsSupplierPartStatus = that.getSupplierPartStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplierPartStatus", lhsSupplierPartStatus), LocatorUtils.property(thatLocator, "supplierPartStatus", rhsSupplierPartStatus), lhsSupplierPartStatus, rhsSupplierPartStatus, (this.supplierPartStatus!= null), (that.supplierPartStatus!= null))) {
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
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            DatePeriodType theEffectiveDatePeriod;
            theEffectiveDatePeriod = this.getEffectiveDatePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveDatePeriod", theEffectiveDatePeriod), currentHashCode, theEffectiveDatePeriod, (this.effectiveDatePeriod!= null));
        }
        {
            PartnerDescriptionType theSuppliedBy;
            theSuppliedBy = this.getSuppliedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suppliedBy", theSuppliedBy), currentHashCode, theSuppliedBy, (this.suppliedBy!= null));
        }
        {
            ProductIdentificationType theSupplierItem;
            theSupplierItem = this.getSupplierItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplierItem", theSupplierItem), currentHashCode, theSupplierItem, (this.supplierItem!= null));
        }
        {
            SupplierPartStatus theSupplierPartStatus;
            theSupplierPartStatus = this.getSupplierPartStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplierPartStatus", theSupplierPartStatus), currentHashCode, theSupplierPartStatus, (this.supplierPartStatus!= null));
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
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            DatePeriodType theEffectiveDatePeriod;
            theEffectiveDatePeriod = this.getEffectiveDatePeriod();
            strategy.appendField(locator, this, "effectiveDatePeriod", buffer, theEffectiveDatePeriod, (this.effectiveDatePeriod!= null));
        }
        {
            PartnerDescriptionType theSuppliedBy;
            theSuppliedBy = this.getSuppliedBy();
            strategy.appendField(locator, this, "suppliedBy", buffer, theSuppliedBy, (this.suppliedBy!= null));
        }
        {
            ProductIdentificationType theSupplierItem;
            theSupplierItem = this.getSupplierItem();
            strategy.appendField(locator, this, "supplierItem", buffer, theSupplierItem, (this.supplierItem!= null));
        }
        {
            SupplierPartStatus theSupplierPartStatus;
            theSupplierPartStatus = this.getSupplierPartStatus();
            strategy.appendField(locator, this, "supplierPartStatus", buffer, theSupplierPartStatus, (this.supplierPartStatus!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
