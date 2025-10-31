
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

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
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.locations.v01_04.LocationType;
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
 * <p>Java class for LotShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualCompletionQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ActualShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualShipQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" minOccurs="0"/&gt;
 *         &lt;element name="CurrentScheduledCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CurrentScheduledCompletionQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CurrentScheduledShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CurrentScheduledShipQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledCompletionQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledShipQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ShipToLocation" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}LocationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
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
@XmlType(name = "LotShipmentType", propOrder = {
    "actualCompletionDate",
    "actualCompletionQuantity",
    "actualShipDate",
    "actualShipQuantity",
    "businessDocumentReference",
    "currentScheduledCompletionDate",
    "currentScheduledCompletionQuantity",
    "currentScheduledShipDate",
    "currentScheduledShipQuantity",
    "originalScheduledCompletionDate",
    "originalScheduledCompletionQuantity",
    "originalScheduledShipDate",
    "originalScheduledShipQuantity",
    "shipToLocation",
    "unitOfMeasure"
})
public class LotShipmentType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ActualCompletionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualCompletionDate;
    @XmlElement(name = "ActualCompletionQuantity")
    protected Float actualCompletionQuantity;
    @XmlElement(name = "ActualShipDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualShipDate;
    @XmlElement(name = "ActualShipQuantity")
    protected Float actualShipQuantity;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElement(name = "CurrentScheduledCompletionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentScheduledCompletionDate;
    @XmlElement(name = "CurrentScheduledCompletionQuantity")
    protected Float currentScheduledCompletionQuantity;
    @XmlElement(name = "CurrentScheduledShipDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentScheduledShipDate;
    @XmlElement(name = "CurrentScheduledShipQuantity")
    protected Float currentScheduledShipQuantity;
    @XmlElement(name = "OriginalScheduledCompletionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalScheduledCompletionDate;
    @XmlElement(name = "OriginalScheduledCompletionQuantity")
    protected Float originalScheduledCompletionQuantity;
    @XmlElement(name = "OriginalScheduledShipDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalScheduledShipDate;
    @XmlElement(name = "OriginalScheduledShipQuantity")
    protected Float originalScheduledShipQuantity;
    @XmlElement(name = "ShipToLocation")
    protected LocationType shipToLocation;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actualCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualCompletionDate() {
        return actualCompletionDate;
    }

    /**
     * Sets the value of the actualCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualCompletionDate(XMLGregorianCalendar value) {
        this.actualCompletionDate = value;
    }

    /**
     * Gets the value of the actualCompletionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getActualCompletionQuantity() {
        return actualCompletionQuantity;
    }

    /**
     * Sets the value of the actualCompletionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setActualCompletionQuantity(Float value) {
        this.actualCompletionQuantity = value;
    }

    /**
     * Gets the value of the actualShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualShipDate() {
        return actualShipDate;
    }

    /**
     * Sets the value of the actualShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualShipDate(XMLGregorianCalendar value) {
        this.actualShipDate = value;
    }

    /**
     * Gets the value of the actualShipQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getActualShipQuantity() {
        return actualShipQuantity;
    }

    /**
     * Sets the value of the actualShipQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setActualShipQuantity(Float value) {
        this.actualShipQuantity = value;
    }

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public BusinessDocumentReference getBusinessDocumentReference() {
        return businessDocumentReference;
    }

    /**
     * Sets the value of the businessDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public void setBusinessDocumentReference(BusinessDocumentReference value) {
        this.businessDocumentReference = value;
    }

    /**
     * Gets the value of the currentScheduledCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentScheduledCompletionDate() {
        return currentScheduledCompletionDate;
    }

    /**
     * Sets the value of the currentScheduledCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentScheduledCompletionDate(XMLGregorianCalendar value) {
        this.currentScheduledCompletionDate = value;
    }

    /**
     * Gets the value of the currentScheduledCompletionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCurrentScheduledCompletionQuantity() {
        return currentScheduledCompletionQuantity;
    }

    /**
     * Sets the value of the currentScheduledCompletionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCurrentScheduledCompletionQuantity(Float value) {
        this.currentScheduledCompletionQuantity = value;
    }

    /**
     * Gets the value of the currentScheduledShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentScheduledShipDate() {
        return currentScheduledShipDate;
    }

    /**
     * Sets the value of the currentScheduledShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentScheduledShipDate(XMLGregorianCalendar value) {
        this.currentScheduledShipDate = value;
    }

    /**
     * Gets the value of the currentScheduledShipQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCurrentScheduledShipQuantity() {
        return currentScheduledShipQuantity;
    }

    /**
     * Sets the value of the currentScheduledShipQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCurrentScheduledShipQuantity(Float value) {
        this.currentScheduledShipQuantity = value;
    }

    /**
     * Gets the value of the originalScheduledCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalScheduledCompletionDate() {
        return originalScheduledCompletionDate;
    }

    /**
     * Sets the value of the originalScheduledCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalScheduledCompletionDate(XMLGregorianCalendar value) {
        this.originalScheduledCompletionDate = value;
    }

    /**
     * Gets the value of the originalScheduledCompletionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOriginalScheduledCompletionQuantity() {
        return originalScheduledCompletionQuantity;
    }

    /**
     * Sets the value of the originalScheduledCompletionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOriginalScheduledCompletionQuantity(Float value) {
        this.originalScheduledCompletionQuantity = value;
    }

    /**
     * Gets the value of the originalScheduledShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalScheduledShipDate() {
        return originalScheduledShipDate;
    }

    /**
     * Sets the value of the originalScheduledShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalScheduledShipDate(XMLGregorianCalendar value) {
        this.originalScheduledShipDate = value;
    }

    /**
     * Gets the value of the originalScheduledShipQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOriginalScheduledShipQuantity() {
        return originalScheduledShipQuantity;
    }

    /**
     * Sets the value of the originalScheduledShipQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOriginalScheduledShipQuantity(Float value) {
        this.originalScheduledShipQuantity = value;
    }

    /**
     * Gets the value of the shipToLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getShipToLocation() {
        return shipToLocation;
    }

    /**
     * Sets the value of the shipToLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setShipToLocation(LocationType value) {
        this.shipToLocation = value;
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
        final LotShipmentType that = ((LotShipmentType) object);
        {
            XMLGregorianCalendar lhsActualCompletionDate;
            lhsActualCompletionDate = this.getActualCompletionDate();
            XMLGregorianCalendar rhsActualCompletionDate;
            rhsActualCompletionDate = that.getActualCompletionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualCompletionDate", lhsActualCompletionDate), LocatorUtils.property(thatLocator, "actualCompletionDate", rhsActualCompletionDate), lhsActualCompletionDate, rhsActualCompletionDate, (this.actualCompletionDate!= null), (that.actualCompletionDate!= null))) {
                return false;
            }
        }
        {
            Float lhsActualCompletionQuantity;
            lhsActualCompletionQuantity = this.getActualCompletionQuantity();
            Float rhsActualCompletionQuantity;
            rhsActualCompletionQuantity = that.getActualCompletionQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualCompletionQuantity", lhsActualCompletionQuantity), LocatorUtils.property(thatLocator, "actualCompletionQuantity", rhsActualCompletionQuantity), lhsActualCompletionQuantity, rhsActualCompletionQuantity, (this.actualCompletionQuantity!= null), (that.actualCompletionQuantity!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsActualShipDate;
            lhsActualShipDate = this.getActualShipDate();
            XMLGregorianCalendar rhsActualShipDate;
            rhsActualShipDate = that.getActualShipDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualShipDate", lhsActualShipDate), LocatorUtils.property(thatLocator, "actualShipDate", rhsActualShipDate), lhsActualShipDate, rhsActualShipDate, (this.actualShipDate!= null), (that.actualShipDate!= null))) {
                return false;
            }
        }
        {
            Float lhsActualShipQuantity;
            lhsActualShipQuantity = this.getActualShipQuantity();
            Float rhsActualShipQuantity;
            rhsActualShipQuantity = that.getActualShipQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualShipQuantity", lhsActualShipQuantity), LocatorUtils.property(thatLocator, "actualShipQuantity", rhsActualShipQuantity), lhsActualShipQuantity, rhsActualShipQuantity, (this.actualShipQuantity!= null), (that.actualShipQuantity!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReference lhsBusinessDocumentReference;
            lhsBusinessDocumentReference = this.getBusinessDocumentReference();
            BusinessDocumentReference rhsBusinessDocumentReference;
            rhsBusinessDocumentReference = that.getBusinessDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentReference", lhsBusinessDocumentReference), LocatorUtils.property(thatLocator, "businessDocumentReference", rhsBusinessDocumentReference), lhsBusinessDocumentReference, rhsBusinessDocumentReference, (this.businessDocumentReference!= null), (that.businessDocumentReference!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsCurrentScheduledCompletionDate;
            lhsCurrentScheduledCompletionDate = this.getCurrentScheduledCompletionDate();
            XMLGregorianCalendar rhsCurrentScheduledCompletionDate;
            rhsCurrentScheduledCompletionDate = that.getCurrentScheduledCompletionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentScheduledCompletionDate", lhsCurrentScheduledCompletionDate), LocatorUtils.property(thatLocator, "currentScheduledCompletionDate", rhsCurrentScheduledCompletionDate), lhsCurrentScheduledCompletionDate, rhsCurrentScheduledCompletionDate, (this.currentScheduledCompletionDate!= null), (that.currentScheduledCompletionDate!= null))) {
                return false;
            }
        }
        {
            Float lhsCurrentScheduledCompletionQuantity;
            lhsCurrentScheduledCompletionQuantity = this.getCurrentScheduledCompletionQuantity();
            Float rhsCurrentScheduledCompletionQuantity;
            rhsCurrentScheduledCompletionQuantity = that.getCurrentScheduledCompletionQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentScheduledCompletionQuantity", lhsCurrentScheduledCompletionQuantity), LocatorUtils.property(thatLocator, "currentScheduledCompletionQuantity", rhsCurrentScheduledCompletionQuantity), lhsCurrentScheduledCompletionQuantity, rhsCurrentScheduledCompletionQuantity, (this.currentScheduledCompletionQuantity!= null), (that.currentScheduledCompletionQuantity!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsCurrentScheduledShipDate;
            lhsCurrentScheduledShipDate = this.getCurrentScheduledShipDate();
            XMLGregorianCalendar rhsCurrentScheduledShipDate;
            rhsCurrentScheduledShipDate = that.getCurrentScheduledShipDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentScheduledShipDate", lhsCurrentScheduledShipDate), LocatorUtils.property(thatLocator, "currentScheduledShipDate", rhsCurrentScheduledShipDate), lhsCurrentScheduledShipDate, rhsCurrentScheduledShipDate, (this.currentScheduledShipDate!= null), (that.currentScheduledShipDate!= null))) {
                return false;
            }
        }
        {
            Float lhsCurrentScheduledShipQuantity;
            lhsCurrentScheduledShipQuantity = this.getCurrentScheduledShipQuantity();
            Float rhsCurrentScheduledShipQuantity;
            rhsCurrentScheduledShipQuantity = that.getCurrentScheduledShipQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentScheduledShipQuantity", lhsCurrentScheduledShipQuantity), LocatorUtils.property(thatLocator, "currentScheduledShipQuantity", rhsCurrentScheduledShipQuantity), lhsCurrentScheduledShipQuantity, rhsCurrentScheduledShipQuantity, (this.currentScheduledShipQuantity!= null), (that.currentScheduledShipQuantity!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsOriginalScheduledCompletionDate;
            lhsOriginalScheduledCompletionDate = this.getOriginalScheduledCompletionDate();
            XMLGregorianCalendar rhsOriginalScheduledCompletionDate;
            rhsOriginalScheduledCompletionDate = that.getOriginalScheduledCompletionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalScheduledCompletionDate", lhsOriginalScheduledCompletionDate), LocatorUtils.property(thatLocator, "originalScheduledCompletionDate", rhsOriginalScheduledCompletionDate), lhsOriginalScheduledCompletionDate, rhsOriginalScheduledCompletionDate, (this.originalScheduledCompletionDate!= null), (that.originalScheduledCompletionDate!= null))) {
                return false;
            }
        }
        {
            Float lhsOriginalScheduledCompletionQuantity;
            lhsOriginalScheduledCompletionQuantity = this.getOriginalScheduledCompletionQuantity();
            Float rhsOriginalScheduledCompletionQuantity;
            rhsOriginalScheduledCompletionQuantity = that.getOriginalScheduledCompletionQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalScheduledCompletionQuantity", lhsOriginalScheduledCompletionQuantity), LocatorUtils.property(thatLocator, "originalScheduledCompletionQuantity", rhsOriginalScheduledCompletionQuantity), lhsOriginalScheduledCompletionQuantity, rhsOriginalScheduledCompletionQuantity, (this.originalScheduledCompletionQuantity!= null), (that.originalScheduledCompletionQuantity!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsOriginalScheduledShipDate;
            lhsOriginalScheduledShipDate = this.getOriginalScheduledShipDate();
            XMLGregorianCalendar rhsOriginalScheduledShipDate;
            rhsOriginalScheduledShipDate = that.getOriginalScheduledShipDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalScheduledShipDate", lhsOriginalScheduledShipDate), LocatorUtils.property(thatLocator, "originalScheduledShipDate", rhsOriginalScheduledShipDate), lhsOriginalScheduledShipDate, rhsOriginalScheduledShipDate, (this.originalScheduledShipDate!= null), (that.originalScheduledShipDate!= null))) {
                return false;
            }
        }
        {
            Float lhsOriginalScheduledShipQuantity;
            lhsOriginalScheduledShipQuantity = this.getOriginalScheduledShipQuantity();
            Float rhsOriginalScheduledShipQuantity;
            rhsOriginalScheduledShipQuantity = that.getOriginalScheduledShipQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalScheduledShipQuantity", lhsOriginalScheduledShipQuantity), LocatorUtils.property(thatLocator, "originalScheduledShipQuantity", rhsOriginalScheduledShipQuantity), lhsOriginalScheduledShipQuantity, rhsOriginalScheduledShipQuantity, (this.originalScheduledShipQuantity!= null), (that.originalScheduledShipQuantity!= null))) {
                return false;
            }
        }
        {
            LocationType lhsShipToLocation;
            lhsShipToLocation = this.getShipToLocation();
            LocationType rhsShipToLocation;
            rhsShipToLocation = that.getShipToLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipToLocation", lhsShipToLocation), LocatorUtils.property(thatLocator, "shipToLocation", rhsShipToLocation), lhsShipToLocation, rhsShipToLocation, (this.shipToLocation!= null), (that.shipToLocation!= null))) {
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
            XMLGregorianCalendar theActualCompletionDate;
            theActualCompletionDate = this.getActualCompletionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualCompletionDate", theActualCompletionDate), currentHashCode, theActualCompletionDate, (this.actualCompletionDate!= null));
        }
        {
            Float theActualCompletionQuantity;
            theActualCompletionQuantity = this.getActualCompletionQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualCompletionQuantity", theActualCompletionQuantity), currentHashCode, theActualCompletionQuantity, (this.actualCompletionQuantity!= null));
        }
        {
            XMLGregorianCalendar theActualShipDate;
            theActualShipDate = this.getActualShipDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualShipDate", theActualShipDate), currentHashCode, theActualShipDate, (this.actualShipDate!= null));
        }
        {
            Float theActualShipQuantity;
            theActualShipQuantity = this.getActualShipQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualShipQuantity", theActualShipQuantity), currentHashCode, theActualShipQuantity, (this.actualShipQuantity!= null));
        }
        {
            BusinessDocumentReference theBusinessDocumentReference;
            theBusinessDocumentReference = this.getBusinessDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, (this.businessDocumentReference!= null));
        }
        {
            XMLGregorianCalendar theCurrentScheduledCompletionDate;
            theCurrentScheduledCompletionDate = this.getCurrentScheduledCompletionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentScheduledCompletionDate", theCurrentScheduledCompletionDate), currentHashCode, theCurrentScheduledCompletionDate, (this.currentScheduledCompletionDate!= null));
        }
        {
            Float theCurrentScheduledCompletionQuantity;
            theCurrentScheduledCompletionQuantity = this.getCurrentScheduledCompletionQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentScheduledCompletionQuantity", theCurrentScheduledCompletionQuantity), currentHashCode, theCurrentScheduledCompletionQuantity, (this.currentScheduledCompletionQuantity!= null));
        }
        {
            XMLGregorianCalendar theCurrentScheduledShipDate;
            theCurrentScheduledShipDate = this.getCurrentScheduledShipDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentScheduledShipDate", theCurrentScheduledShipDate), currentHashCode, theCurrentScheduledShipDate, (this.currentScheduledShipDate!= null));
        }
        {
            Float theCurrentScheduledShipQuantity;
            theCurrentScheduledShipQuantity = this.getCurrentScheduledShipQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentScheduledShipQuantity", theCurrentScheduledShipQuantity), currentHashCode, theCurrentScheduledShipQuantity, (this.currentScheduledShipQuantity!= null));
        }
        {
            XMLGregorianCalendar theOriginalScheduledCompletionDate;
            theOriginalScheduledCompletionDate = this.getOriginalScheduledCompletionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalScheduledCompletionDate", theOriginalScheduledCompletionDate), currentHashCode, theOriginalScheduledCompletionDate, (this.originalScheduledCompletionDate!= null));
        }
        {
            Float theOriginalScheduledCompletionQuantity;
            theOriginalScheduledCompletionQuantity = this.getOriginalScheduledCompletionQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalScheduledCompletionQuantity", theOriginalScheduledCompletionQuantity), currentHashCode, theOriginalScheduledCompletionQuantity, (this.originalScheduledCompletionQuantity!= null));
        }
        {
            XMLGregorianCalendar theOriginalScheduledShipDate;
            theOriginalScheduledShipDate = this.getOriginalScheduledShipDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalScheduledShipDate", theOriginalScheduledShipDate), currentHashCode, theOriginalScheduledShipDate, (this.originalScheduledShipDate!= null));
        }
        {
            Float theOriginalScheduledShipQuantity;
            theOriginalScheduledShipQuantity = this.getOriginalScheduledShipQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalScheduledShipQuantity", theOriginalScheduledShipQuantity), currentHashCode, theOriginalScheduledShipQuantity, (this.originalScheduledShipQuantity!= null));
        }
        {
            LocationType theShipToLocation;
            theShipToLocation = this.getShipToLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipToLocation", theShipToLocation), currentHashCode, theShipToLocation, (this.shipToLocation!= null));
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
            XMLGregorianCalendar theActualCompletionDate;
            theActualCompletionDate = this.getActualCompletionDate();
            strategy.appendField(locator, this, "actualCompletionDate", buffer, theActualCompletionDate, (this.actualCompletionDate!= null));
        }
        {
            Float theActualCompletionQuantity;
            theActualCompletionQuantity = this.getActualCompletionQuantity();
            strategy.appendField(locator, this, "actualCompletionQuantity", buffer, theActualCompletionQuantity, (this.actualCompletionQuantity!= null));
        }
        {
            XMLGregorianCalendar theActualShipDate;
            theActualShipDate = this.getActualShipDate();
            strategy.appendField(locator, this, "actualShipDate", buffer, theActualShipDate, (this.actualShipDate!= null));
        }
        {
            Float theActualShipQuantity;
            theActualShipQuantity = this.getActualShipQuantity();
            strategy.appendField(locator, this, "actualShipQuantity", buffer, theActualShipQuantity, (this.actualShipQuantity!= null));
        }
        {
            BusinessDocumentReference theBusinessDocumentReference;
            theBusinessDocumentReference = this.getBusinessDocumentReference();
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, (this.businessDocumentReference!= null));
        }
        {
            XMLGregorianCalendar theCurrentScheduledCompletionDate;
            theCurrentScheduledCompletionDate = this.getCurrentScheduledCompletionDate();
            strategy.appendField(locator, this, "currentScheduledCompletionDate", buffer, theCurrentScheduledCompletionDate, (this.currentScheduledCompletionDate!= null));
        }
        {
            Float theCurrentScheduledCompletionQuantity;
            theCurrentScheduledCompletionQuantity = this.getCurrentScheduledCompletionQuantity();
            strategy.appendField(locator, this, "currentScheduledCompletionQuantity", buffer, theCurrentScheduledCompletionQuantity, (this.currentScheduledCompletionQuantity!= null));
        }
        {
            XMLGregorianCalendar theCurrentScheduledShipDate;
            theCurrentScheduledShipDate = this.getCurrentScheduledShipDate();
            strategy.appendField(locator, this, "currentScheduledShipDate", buffer, theCurrentScheduledShipDate, (this.currentScheduledShipDate!= null));
        }
        {
            Float theCurrentScheduledShipQuantity;
            theCurrentScheduledShipQuantity = this.getCurrentScheduledShipQuantity();
            strategy.appendField(locator, this, "currentScheduledShipQuantity", buffer, theCurrentScheduledShipQuantity, (this.currentScheduledShipQuantity!= null));
        }
        {
            XMLGregorianCalendar theOriginalScheduledCompletionDate;
            theOriginalScheduledCompletionDate = this.getOriginalScheduledCompletionDate();
            strategy.appendField(locator, this, "originalScheduledCompletionDate", buffer, theOriginalScheduledCompletionDate, (this.originalScheduledCompletionDate!= null));
        }
        {
            Float theOriginalScheduledCompletionQuantity;
            theOriginalScheduledCompletionQuantity = this.getOriginalScheduledCompletionQuantity();
            strategy.appendField(locator, this, "originalScheduledCompletionQuantity", buffer, theOriginalScheduledCompletionQuantity, (this.originalScheduledCompletionQuantity!= null));
        }
        {
            XMLGregorianCalendar theOriginalScheduledShipDate;
            theOriginalScheduledShipDate = this.getOriginalScheduledShipDate();
            strategy.appendField(locator, this, "originalScheduledShipDate", buffer, theOriginalScheduledShipDate, (this.originalScheduledShipDate!= null));
        }
        {
            Float theOriginalScheduledShipQuantity;
            theOriginalScheduledShipQuantity = this.getOriginalScheduledShipQuantity();
            strategy.appendField(locator, this, "originalScheduledShipQuantity", buffer, theOriginalScheduledShipQuantity, (this.originalScheduledShipQuantity!= null));
        }
        {
            LocationType theShipToLocation;
            theShipToLocation = this.getShipToLocation();
            strategy.appendField(locator, this, "shipToLocation", buffer, theShipToLocation, (this.shipToLocation!= null));
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
