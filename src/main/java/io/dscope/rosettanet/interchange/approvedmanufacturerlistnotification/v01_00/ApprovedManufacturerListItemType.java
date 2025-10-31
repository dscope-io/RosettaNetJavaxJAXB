
package io.dscope.rosettanet.interchange.approvedmanufacturerlistnotification.v01_00;

import java.math.BigDecimal;
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
import io.dscope.rosettanet.domain.logistics.codelist.preferredstatus.v01_00.PreferredStatus;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.Attachment;
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
 * <p>Java class for ApprovedManufacturerListItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovedManufacturerListItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovedSupplierListItem" type="{urn:rosettanet:specification:interchange:ApprovedManufacturerListNotification:xsd:schema:01.00}ApprovedSupplierListItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}Attachment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType"/&gt;
 *         &lt;element name="ItemCompliance" type="{urn:rosettanet:specification:interchange:ApprovedManufacturerListNotification:xsd:schema:01.00}ItemComplianceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescriptionType"/&gt;
 *         &lt;element name="ManufacturerItem" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType"/&gt;
 *         &lt;element name="ManufacturerSplit" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:PreferredStatus:xsd:codelist:01.00}PreferredStatus"/&gt;
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
@XmlType(name = "ApprovedManufacturerListItemType", propOrder = {
    "additionalInformation",
    "approvedSupplierListItem",
    "attachment",
    "description",
    "effectiveDatePeriod",
    "itemCompliance",
    "manufacturedBy",
    "manufacturerItem",
    "manufacturerSplit",
    "preferredStatus"
})
public class ApprovedManufacturerListItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AdditionalInformation")
    protected String additionalInformation;
    @XmlElement(name = "ApprovedSupplierListItem")
    protected List<ApprovedSupplierListItemType> approvedSupplierListItem;
    @XmlElementRef(name = "Attachment", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = Attachment.class, required = false)
    protected List<Attachment> attachment;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "EffectiveDatePeriod", required = true)
    protected DatePeriodType effectiveDatePeriod;
    @XmlElement(name = "ItemCompliance")
    protected List<ItemComplianceType> itemCompliance;
    @XmlElement(name = "ManufacturedBy", required = true)
    protected PartnerDescriptionType manufacturedBy;
    @XmlElement(name = "ManufacturerItem", required = true)
    protected ProductIdentificationType manufacturerItem;
    @XmlElement(name = "ManufacturerSplit")
    protected BigDecimal manufacturerSplit;
    @XmlElementRef(name = "PreferredStatus", namespace = "urn:rosettanet:specification:domain:Logistics:PreferredStatus:xsd:codelist:01.00", type = PreferredStatus.class)
    protected PreferredStatus preferredStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the approvedSupplierListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvedSupplierListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovedSupplierListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApprovedSupplierListItemType }
     * 
     * 
     */
    public List<ApprovedSupplierListItemType> getApprovedSupplierListItem() {
        if (approvedSupplierListItem == null) {
            approvedSupplierListItem = new ArrayList<ApprovedSupplierListItemType>();
        }
        return this.approvedSupplierListItem;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<Attachment>();
        }
        return this.attachment;
    }

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
     * Gets the value of the itemCompliance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemCompliance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemCompliance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemComplianceType }
     * 
     * 
     */
    public List<ItemComplianceType> getItemCompliance() {
        if (itemCompliance == null) {
            itemCompliance = new ArrayList<ItemComplianceType>();
        }
        return this.itemCompliance;
    }

    /**
     * Gets the value of the manufacturedBy property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public PartnerDescriptionType getManufacturedBy() {
        return manufacturedBy;
    }

    /**
     * Sets the value of the manufacturedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public void setManufacturedBy(PartnerDescriptionType value) {
        this.manufacturedBy = value;
    }

    /**
     * Gets the value of the manufacturerItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getManufacturerItem() {
        return manufacturerItem;
    }

    /**
     * Sets the value of the manufacturerItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setManufacturerItem(ProductIdentificationType value) {
        this.manufacturerItem = value;
    }

    /**
     * Gets the value of the manufacturerSplit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getManufacturerSplit() {
        return manufacturerSplit;
    }

    /**
     * Sets the value of the manufacturerSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setManufacturerSplit(BigDecimal value) {
        this.manufacturerSplit = value;
    }

    /**
     * Gets the value of the preferredStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredStatus }
     *     
     */
    public PreferredStatus getPreferredStatus() {
        return preferredStatus;
    }

    /**
     * Sets the value of the preferredStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredStatus }
     *     
     */
    public void setPreferredStatus(PreferredStatus value) {
        this.preferredStatus = value;
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
        final ApprovedManufacturerListItemType that = ((ApprovedManufacturerListItemType) object);
        {
            String lhsAdditionalInformation;
            lhsAdditionalInformation = this.getAdditionalInformation();
            String rhsAdditionalInformation;
            rhsAdditionalInformation = that.getAdditionalInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalInformation", lhsAdditionalInformation), LocatorUtils.property(thatLocator, "additionalInformation", rhsAdditionalInformation), lhsAdditionalInformation, rhsAdditionalInformation, (this.additionalInformation!= null), (that.additionalInformation!= null))) {
                return false;
            }
        }
        {
            List<ApprovedSupplierListItemType> lhsApprovedSupplierListItem;
            lhsApprovedSupplierListItem = (((this.approvedSupplierListItem!= null)&&(!this.approvedSupplierListItem.isEmpty()))?this.getApprovedSupplierListItem():null);
            List<ApprovedSupplierListItemType> rhsApprovedSupplierListItem;
            rhsApprovedSupplierListItem = (((that.approvedSupplierListItem!= null)&&(!that.approvedSupplierListItem.isEmpty()))?that.getApprovedSupplierListItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approvedSupplierListItem", lhsApprovedSupplierListItem), LocatorUtils.property(thatLocator, "approvedSupplierListItem", rhsApprovedSupplierListItem), lhsApprovedSupplierListItem, rhsApprovedSupplierListItem, ((this.approvedSupplierListItem!= null)&&(!this.approvedSupplierListItem.isEmpty())), ((that.approvedSupplierListItem!= null)&&(!that.approvedSupplierListItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<Attachment> lhsAttachment;
            lhsAttachment = (((this.attachment!= null)&&(!this.attachment.isEmpty()))?this.getAttachment():null);
            List<Attachment> rhsAttachment;
            rhsAttachment = (((that.attachment!= null)&&(!that.attachment.isEmpty()))?that.getAttachment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachment", lhsAttachment), LocatorUtils.property(thatLocator, "attachment", rhsAttachment), lhsAttachment, rhsAttachment, ((this.attachment!= null)&&(!this.attachment.isEmpty())), ((that.attachment!= null)&&(!that.attachment.isEmpty())))) {
                return false;
            }
        }
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
            List<ItemComplianceType> lhsItemCompliance;
            lhsItemCompliance = (((this.itemCompliance!= null)&&(!this.itemCompliance.isEmpty()))?this.getItemCompliance():null);
            List<ItemComplianceType> rhsItemCompliance;
            rhsItemCompliance = (((that.itemCompliance!= null)&&(!that.itemCompliance.isEmpty()))?that.getItemCompliance():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemCompliance", lhsItemCompliance), LocatorUtils.property(thatLocator, "itemCompliance", rhsItemCompliance), lhsItemCompliance, rhsItemCompliance, ((this.itemCompliance!= null)&&(!this.itemCompliance.isEmpty())), ((that.itemCompliance!= null)&&(!that.itemCompliance.isEmpty())))) {
                return false;
            }
        }
        {
            PartnerDescriptionType lhsManufacturedBy;
            lhsManufacturedBy = this.getManufacturedBy();
            PartnerDescriptionType rhsManufacturedBy;
            rhsManufacturedBy = that.getManufacturedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturedBy", lhsManufacturedBy), LocatorUtils.property(thatLocator, "manufacturedBy", rhsManufacturedBy), lhsManufacturedBy, rhsManufacturedBy, (this.manufacturedBy!= null), (that.manufacturedBy!= null))) {
                return false;
            }
        }
        {
            ProductIdentificationType lhsManufacturerItem;
            lhsManufacturerItem = this.getManufacturerItem();
            ProductIdentificationType rhsManufacturerItem;
            rhsManufacturerItem = that.getManufacturerItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturerItem", lhsManufacturerItem), LocatorUtils.property(thatLocator, "manufacturerItem", rhsManufacturerItem), lhsManufacturerItem, rhsManufacturerItem, (this.manufacturerItem!= null), (that.manufacturerItem!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsManufacturerSplit;
            lhsManufacturerSplit = this.getManufacturerSplit();
            BigDecimal rhsManufacturerSplit;
            rhsManufacturerSplit = that.getManufacturerSplit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturerSplit", lhsManufacturerSplit), LocatorUtils.property(thatLocator, "manufacturerSplit", rhsManufacturerSplit), lhsManufacturerSplit, rhsManufacturerSplit, (this.manufacturerSplit!= null), (that.manufacturerSplit!= null))) {
                return false;
            }
        }
        {
            PreferredStatus lhsPreferredStatus;
            lhsPreferredStatus = this.getPreferredStatus();
            PreferredStatus rhsPreferredStatus;
            rhsPreferredStatus = that.getPreferredStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preferredStatus", lhsPreferredStatus), LocatorUtils.property(thatLocator, "preferredStatus", rhsPreferredStatus), lhsPreferredStatus, rhsPreferredStatus, (this.preferredStatus!= null), (that.preferredStatus!= null))) {
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
            String theAdditionalInformation;
            theAdditionalInformation = this.getAdditionalInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalInformation", theAdditionalInformation), currentHashCode, theAdditionalInformation, (this.additionalInformation!= null));
        }
        {
            List<ApprovedSupplierListItemType> theApprovedSupplierListItem;
            theApprovedSupplierListItem = (((this.approvedSupplierListItem!= null)&&(!this.approvedSupplierListItem.isEmpty()))?this.getApprovedSupplierListItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approvedSupplierListItem", theApprovedSupplierListItem), currentHashCode, theApprovedSupplierListItem, ((this.approvedSupplierListItem!= null)&&(!this.approvedSupplierListItem.isEmpty())));
        }
        {
            List<Attachment> theAttachment;
            theAttachment = (((this.attachment!= null)&&(!this.attachment.isEmpty()))?this.getAttachment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachment", theAttachment), currentHashCode, theAttachment, ((this.attachment!= null)&&(!this.attachment.isEmpty())));
        }
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
            List<ItemComplianceType> theItemCompliance;
            theItemCompliance = (((this.itemCompliance!= null)&&(!this.itemCompliance.isEmpty()))?this.getItemCompliance():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemCompliance", theItemCompliance), currentHashCode, theItemCompliance, ((this.itemCompliance!= null)&&(!this.itemCompliance.isEmpty())));
        }
        {
            PartnerDescriptionType theManufacturedBy;
            theManufacturedBy = this.getManufacturedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturedBy", theManufacturedBy), currentHashCode, theManufacturedBy, (this.manufacturedBy!= null));
        }
        {
            ProductIdentificationType theManufacturerItem;
            theManufacturerItem = this.getManufacturerItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturerItem", theManufacturerItem), currentHashCode, theManufacturerItem, (this.manufacturerItem!= null));
        }
        {
            BigDecimal theManufacturerSplit;
            theManufacturerSplit = this.getManufacturerSplit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturerSplit", theManufacturerSplit), currentHashCode, theManufacturerSplit, (this.manufacturerSplit!= null));
        }
        {
            PreferredStatus thePreferredStatus;
            thePreferredStatus = this.getPreferredStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preferredStatus", thePreferredStatus), currentHashCode, thePreferredStatus, (this.preferredStatus!= null));
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
            String theAdditionalInformation;
            theAdditionalInformation = this.getAdditionalInformation();
            strategy.appendField(locator, this, "additionalInformation", buffer, theAdditionalInformation, (this.additionalInformation!= null));
        }
        {
            List<ApprovedSupplierListItemType> theApprovedSupplierListItem;
            theApprovedSupplierListItem = (((this.approvedSupplierListItem!= null)&&(!this.approvedSupplierListItem.isEmpty()))?this.getApprovedSupplierListItem():null);
            strategy.appendField(locator, this, "approvedSupplierListItem", buffer, theApprovedSupplierListItem, ((this.approvedSupplierListItem!= null)&&(!this.approvedSupplierListItem.isEmpty())));
        }
        {
            List<Attachment> theAttachment;
            theAttachment = (((this.attachment!= null)&&(!this.attachment.isEmpty()))?this.getAttachment():null);
            strategy.appendField(locator, this, "attachment", buffer, theAttachment, ((this.attachment!= null)&&(!this.attachment.isEmpty())));
        }
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
            List<ItemComplianceType> theItemCompliance;
            theItemCompliance = (((this.itemCompliance!= null)&&(!this.itemCompliance.isEmpty()))?this.getItemCompliance():null);
            strategy.appendField(locator, this, "itemCompliance", buffer, theItemCompliance, ((this.itemCompliance!= null)&&(!this.itemCompliance.isEmpty())));
        }
        {
            PartnerDescriptionType theManufacturedBy;
            theManufacturedBy = this.getManufacturedBy();
            strategy.appendField(locator, this, "manufacturedBy", buffer, theManufacturedBy, (this.manufacturedBy!= null));
        }
        {
            ProductIdentificationType theManufacturerItem;
            theManufacturerItem = this.getManufacturerItem();
            strategy.appendField(locator, this, "manufacturerItem", buffer, theManufacturerItem, (this.manufacturerItem!= null));
        }
        {
            BigDecimal theManufacturerSplit;
            theManufacturerSplit = this.getManufacturerSplit();
            strategy.appendField(locator, this, "manufacturerSplit", buffer, theManufacturerSplit, (this.manufacturerSplit!= null));
        }
        {
            PreferredStatus thePreferredStatus;
            thePreferredStatus = this.getPreferredStatus();
            strategy.appendField(locator, this, "preferredStatus", buffer, thePreferredStatus, (this.preferredStatus!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
