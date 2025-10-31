
package io.dscope.rosettanet.interchange.inventoryreportdistribution.v02_01;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedKnownPartnerType;
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
 * <p>Java class for InventoryReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternalBusinessEntity" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedKnownPartnerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InventoryReportLineItem" type="{urn:rosettanet:specification:interchange:InventoryReportDistribution:xsd:schema:02.01}InventoryReportLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReportingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
@XmlType(name = "InventoryReportType", propOrder = {
    "internalBusinessEntity",
    "inventoryReportLineItem",
    "partnerDescription",
    "reportingDateTime"
})
public class InventoryReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "InternalBusinessEntity")
    protected List<SpecifiedKnownPartnerType> internalBusinessEntity;
    @XmlElement(name = "InventoryReportLineItem", required = true)
    protected List<InventoryReportLineItemType> inventoryReportLineItem;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "ReportingDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportingDateTime;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the internalBusinessEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalBusinessEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalBusinessEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedKnownPartnerType }
     * 
     * 
     */
    public List<SpecifiedKnownPartnerType> getInternalBusinessEntity() {
        if (internalBusinessEntity == null) {
            internalBusinessEntity = new ArrayList<SpecifiedKnownPartnerType>();
        }
        return this.internalBusinessEntity;
    }

    /**
     * Gets the value of the inventoryReportLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryReportLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryReportLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryReportLineItemType }
     * 
     * 
     */
    public List<InventoryReportLineItemType> getInventoryReportLineItem() {
        if (inventoryReportLineItem == null) {
            inventoryReportLineItem = new ArrayList<InventoryReportLineItemType>();
        }
        return this.inventoryReportLineItem;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
    }

    /**
     * Gets the value of the reportingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportingDateTime() {
        return reportingDateTime;
    }

    /**
     * Sets the value of the reportingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportingDateTime(XMLGregorianCalendar value) {
        this.reportingDateTime = value;
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
        final InventoryReportType that = ((InventoryReportType) object);
        {
            List<SpecifiedKnownPartnerType> lhsInternalBusinessEntity;
            lhsInternalBusinessEntity = (((this.internalBusinessEntity!= null)&&(!this.internalBusinessEntity.isEmpty()))?this.getInternalBusinessEntity():null);
            List<SpecifiedKnownPartnerType> rhsInternalBusinessEntity;
            rhsInternalBusinessEntity = (((that.internalBusinessEntity!= null)&&(!that.internalBusinessEntity.isEmpty()))?that.getInternalBusinessEntity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "internalBusinessEntity", lhsInternalBusinessEntity), LocatorUtils.property(thatLocator, "internalBusinessEntity", rhsInternalBusinessEntity), lhsInternalBusinessEntity, rhsInternalBusinessEntity, ((this.internalBusinessEntity!= null)&&(!this.internalBusinessEntity.isEmpty())), ((that.internalBusinessEntity!= null)&&(!that.internalBusinessEntity.isEmpty())))) {
                return false;
            }
        }
        {
            List<InventoryReportLineItemType> lhsInventoryReportLineItem;
            lhsInventoryReportLineItem = (((this.inventoryReportLineItem!= null)&&(!this.inventoryReportLineItem.isEmpty()))?this.getInventoryReportLineItem():null);
            List<InventoryReportLineItemType> rhsInventoryReportLineItem;
            rhsInventoryReportLineItem = (((that.inventoryReportLineItem!= null)&&(!that.inventoryReportLineItem.isEmpty()))?that.getInventoryReportLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inventoryReportLineItem", lhsInventoryReportLineItem), LocatorUtils.property(thatLocator, "inventoryReportLineItem", rhsInventoryReportLineItem), lhsInventoryReportLineItem, rhsInventoryReportLineItem, ((this.inventoryReportLineItem!= null)&&(!this.inventoryReportLineItem.isEmpty())), ((that.inventoryReportLineItem!= null)&&(!that.inventoryReportLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<PartnerDescription> lhsPartnerDescription;
            lhsPartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            List<PartnerDescription> rhsPartnerDescription;
            rhsPartnerDescription = (((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty()))?that.getPartnerDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())), ((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty())))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsReportingDateTime;
            lhsReportingDateTime = this.getReportingDateTime();
            XMLGregorianCalendar rhsReportingDateTime;
            rhsReportingDateTime = that.getReportingDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportingDateTime", lhsReportingDateTime), LocatorUtils.property(thatLocator, "reportingDateTime", rhsReportingDateTime), lhsReportingDateTime, rhsReportingDateTime, (this.reportingDateTime!= null), (that.reportingDateTime!= null))) {
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
            List<SpecifiedKnownPartnerType> theInternalBusinessEntity;
            theInternalBusinessEntity = (((this.internalBusinessEntity!= null)&&(!this.internalBusinessEntity.isEmpty()))?this.getInternalBusinessEntity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "internalBusinessEntity", theInternalBusinessEntity), currentHashCode, theInternalBusinessEntity, ((this.internalBusinessEntity!= null)&&(!this.internalBusinessEntity.isEmpty())));
        }
        {
            List<InventoryReportLineItemType> theInventoryReportLineItem;
            theInventoryReportLineItem = (((this.inventoryReportLineItem!= null)&&(!this.inventoryReportLineItem.isEmpty()))?this.getInventoryReportLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inventoryReportLineItem", theInventoryReportLineItem), currentHashCode, theInventoryReportLineItem, ((this.inventoryReportLineItem!= null)&&(!this.inventoryReportLineItem.isEmpty())));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            XMLGregorianCalendar theReportingDateTime;
            theReportingDateTime = this.getReportingDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportingDateTime", theReportingDateTime), currentHashCode, theReportingDateTime, (this.reportingDateTime!= null));
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
            List<SpecifiedKnownPartnerType> theInternalBusinessEntity;
            theInternalBusinessEntity = (((this.internalBusinessEntity!= null)&&(!this.internalBusinessEntity.isEmpty()))?this.getInternalBusinessEntity():null);
            strategy.appendField(locator, this, "internalBusinessEntity", buffer, theInternalBusinessEntity, ((this.internalBusinessEntity!= null)&&(!this.internalBusinessEntity.isEmpty())));
        }
        {
            List<InventoryReportLineItemType> theInventoryReportLineItem;
            theInventoryReportLineItem = (((this.inventoryReportLineItem!= null)&&(!this.inventoryReportLineItem.isEmpty()))?this.getInventoryReportLineItem():null);
            strategy.appendField(locator, this, "inventoryReportLineItem", buffer, theInventoryReportLineItem, ((this.inventoryReportLineItem!= null)&&(!this.inventoryReportLineItem.isEmpty())));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            XMLGregorianCalendar theReportingDateTime;
            theReportingDateTime = this.getReportingDateTime();
            strategy.appendField(locator, this, "reportingDateTime", buffer, theReportingDateTime, (this.reportingDateTime!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
