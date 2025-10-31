
package io.dscope.rosettanet.interchange.shipmentreceiptnotification.v02_01;

import java.math.BigInteger;
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
import io.dscope.rosettanet.domain.logistics.logistics.v02_18.TrackingReference;
import io.dscope.rosettanet.universal.document.v01_09.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerDescription;
import io.dscope.rosettanet.universal.partneridentification.v01_14.SpecifiedKnownPartnerType;
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
 * <p>Java class for ShipmentReceiptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentReceiptType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContainerTotalCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="FreightReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.09}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReportDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ShipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentReceiptLineItem" type="{urn:rosettanet:specification:interchange:ShipmentReceiptNotification:xsd:schema:02.01}ShipmentReceiptLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18}TrackingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransportedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}SpecifiedKnownPartnerType" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentReceiptType", propOrder = {
    "containerTotalCount",
    "freightReference",
    "partnerDescription",
    "receiptDate",
    "reportDateTime",
    "shipmentIdentifier",
    "shipmentReceiptLineItem",
    "trackingReference",
    "transportedBy"
})
public class ShipmentReceiptType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ContainerTotalCount", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger containerTotalCount;
    @XmlElement(name = "FreightReference")
    protected BusinessDocumentReferenceType freightReference;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "ReceiptDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;
    @XmlElement(name = "ReportDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportDateTime;
    @XmlElement(name = "ShipmentIdentifier")
    protected String shipmentIdentifier;
    @XmlElement(name = "ShipmentReceiptLineItem", required = true)
    protected List<ShipmentReceiptLineItemType> shipmentReceiptLineItem;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", type = TrackingReference.class, required = false)
    protected List<TrackingReference> trackingReference;
    @XmlElement(name = "TransportedBy")
    protected SpecifiedKnownPartnerType transportedBy;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the containerTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContainerTotalCount() {
        return containerTotalCount;
    }

    /**
     * Sets the value of the containerTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContainerTotalCount(BigInteger value) {
        this.containerTotalCount = value;
    }

    /**
     * Gets the value of the freightReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getFreightReference() {
        return freightReference;
    }

    /**
     * Sets the value of the freightReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setFreightReference(BusinessDocumentReferenceType value) {
        this.freightReference = value;
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
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the reportDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDateTime() {
        return reportDateTime;
    }

    /**
     * Sets the value of the reportDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDateTime(XMLGregorianCalendar value) {
        this.reportDateTime = value;
    }

    /**
     * Gets the value of the shipmentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentIdentifier() {
        return shipmentIdentifier;
    }

    /**
     * Sets the value of the shipmentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentIdentifier(String value) {
        this.shipmentIdentifier = value;
    }

    /**
     * Gets the value of the shipmentReceiptLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentReceiptLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentReceiptLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentReceiptLineItemType }
     * 
     * 
     */
    public List<ShipmentReceiptLineItemType> getShipmentReceiptLineItem() {
        if (shipmentReceiptLineItem == null) {
            shipmentReceiptLineItem = new ArrayList<ShipmentReceiptLineItemType>();
        }
        return this.shipmentReceiptLineItem;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingReference }
     * 
     * 
     */
    public List<TrackingReference> getTrackingReference() {
        if (trackingReference == null) {
            trackingReference = new ArrayList<TrackingReference>();
        }
        return this.trackingReference;
    }

    /**
     * Gets the value of the transportedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedKnownPartnerType }
     *     
     */
    public SpecifiedKnownPartnerType getTransportedBy() {
        return transportedBy;
    }

    /**
     * Sets the value of the transportedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedKnownPartnerType }
     *     
     */
    public void setTransportedBy(SpecifiedKnownPartnerType value) {
        this.transportedBy = value;
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
        final ShipmentReceiptType that = ((ShipmentReceiptType) object);
        {
            BigInteger lhsContainerTotalCount;
            lhsContainerTotalCount = this.getContainerTotalCount();
            BigInteger rhsContainerTotalCount;
            rhsContainerTotalCount = that.getContainerTotalCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containerTotalCount", lhsContainerTotalCount), LocatorUtils.property(thatLocator, "containerTotalCount", rhsContainerTotalCount), lhsContainerTotalCount, rhsContainerTotalCount, (this.containerTotalCount!= null), (that.containerTotalCount!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsFreightReference;
            lhsFreightReference = this.getFreightReference();
            BusinessDocumentReferenceType rhsFreightReference;
            rhsFreightReference = that.getFreightReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightReference", lhsFreightReference), LocatorUtils.property(thatLocator, "freightReference", rhsFreightReference), lhsFreightReference, rhsFreightReference, (this.freightReference!= null), (that.freightReference!= null))) {
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
            XMLGregorianCalendar lhsReceiptDate;
            lhsReceiptDate = this.getReceiptDate();
            XMLGregorianCalendar rhsReceiptDate;
            rhsReceiptDate = that.getReceiptDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receiptDate", lhsReceiptDate), LocatorUtils.property(thatLocator, "receiptDate", rhsReceiptDate), lhsReceiptDate, rhsReceiptDate, (this.receiptDate!= null), (that.receiptDate!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsReportDateTime;
            lhsReportDateTime = this.getReportDateTime();
            XMLGregorianCalendar rhsReportDateTime;
            rhsReportDateTime = that.getReportDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportDateTime", lhsReportDateTime), LocatorUtils.property(thatLocator, "reportDateTime", rhsReportDateTime), lhsReportDateTime, rhsReportDateTime, (this.reportDateTime!= null), (that.reportDateTime!= null))) {
                return false;
            }
        }
        {
            String lhsShipmentIdentifier;
            lhsShipmentIdentifier = this.getShipmentIdentifier();
            String rhsShipmentIdentifier;
            rhsShipmentIdentifier = that.getShipmentIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentIdentifier", lhsShipmentIdentifier), LocatorUtils.property(thatLocator, "shipmentIdentifier", rhsShipmentIdentifier), lhsShipmentIdentifier, rhsShipmentIdentifier, (this.shipmentIdentifier!= null), (that.shipmentIdentifier!= null))) {
                return false;
            }
        }
        {
            List<ShipmentReceiptLineItemType> lhsShipmentReceiptLineItem;
            lhsShipmentReceiptLineItem = (((this.shipmentReceiptLineItem!= null)&&(!this.shipmentReceiptLineItem.isEmpty()))?this.getShipmentReceiptLineItem():null);
            List<ShipmentReceiptLineItemType> rhsShipmentReceiptLineItem;
            rhsShipmentReceiptLineItem = (((that.shipmentReceiptLineItem!= null)&&(!that.shipmentReceiptLineItem.isEmpty()))?that.getShipmentReceiptLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentReceiptLineItem", lhsShipmentReceiptLineItem), LocatorUtils.property(thatLocator, "shipmentReceiptLineItem", rhsShipmentReceiptLineItem), lhsShipmentReceiptLineItem, rhsShipmentReceiptLineItem, ((this.shipmentReceiptLineItem!= null)&&(!this.shipmentReceiptLineItem.isEmpty())), ((that.shipmentReceiptLineItem!= null)&&(!that.shipmentReceiptLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<TrackingReference> lhsTrackingReference;
            lhsTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            List<TrackingReference> rhsTrackingReference;
            rhsTrackingReference = (((that.trackingReference!= null)&&(!that.trackingReference.isEmpty()))?that.getTrackingReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingReference", lhsTrackingReference), LocatorUtils.property(thatLocator, "trackingReference", rhsTrackingReference), lhsTrackingReference, rhsTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())), ((that.trackingReference!= null)&&(!that.trackingReference.isEmpty())))) {
                return false;
            }
        }
        {
            SpecifiedKnownPartnerType lhsTransportedBy;
            lhsTransportedBy = this.getTransportedBy();
            SpecifiedKnownPartnerType rhsTransportedBy;
            rhsTransportedBy = that.getTransportedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportedBy", lhsTransportedBy), LocatorUtils.property(thatLocator, "transportedBy", rhsTransportedBy), lhsTransportedBy, rhsTransportedBy, (this.transportedBy!= null), (that.transportedBy!= null))) {
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
            BigInteger theContainerTotalCount;
            theContainerTotalCount = this.getContainerTotalCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerTotalCount", theContainerTotalCount), currentHashCode, theContainerTotalCount, (this.containerTotalCount!= null));
        }
        {
            BusinessDocumentReferenceType theFreightReference;
            theFreightReference = this.getFreightReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightReference", theFreightReference), currentHashCode, theFreightReference, (this.freightReference!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            XMLGregorianCalendar theReceiptDate;
            theReceiptDate = this.getReceiptDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receiptDate", theReceiptDate), currentHashCode, theReceiptDate, (this.receiptDate!= null));
        }
        {
            XMLGregorianCalendar theReportDateTime;
            theReportDateTime = this.getReportDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportDateTime", theReportDateTime), currentHashCode, theReportDateTime, (this.reportDateTime!= null));
        }
        {
            String theShipmentIdentifier;
            theShipmentIdentifier = this.getShipmentIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentIdentifier", theShipmentIdentifier), currentHashCode, theShipmentIdentifier, (this.shipmentIdentifier!= null));
        }
        {
            List<ShipmentReceiptLineItemType> theShipmentReceiptLineItem;
            theShipmentReceiptLineItem = (((this.shipmentReceiptLineItem!= null)&&(!this.shipmentReceiptLineItem.isEmpty()))?this.getShipmentReceiptLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentReceiptLineItem", theShipmentReceiptLineItem), currentHashCode, theShipmentReceiptLineItem, ((this.shipmentReceiptLineItem!= null)&&(!this.shipmentReceiptLineItem.isEmpty())));
        }
        {
            List<TrackingReference> theTrackingReference;
            theTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingReference", theTrackingReference), currentHashCode, theTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())));
        }
        {
            SpecifiedKnownPartnerType theTransportedBy;
            theTransportedBy = this.getTransportedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportedBy", theTransportedBy), currentHashCode, theTransportedBy, (this.transportedBy!= null));
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
            BigInteger theContainerTotalCount;
            theContainerTotalCount = this.getContainerTotalCount();
            strategy.appendField(locator, this, "containerTotalCount", buffer, theContainerTotalCount, (this.containerTotalCount!= null));
        }
        {
            BusinessDocumentReferenceType theFreightReference;
            theFreightReference = this.getFreightReference();
            strategy.appendField(locator, this, "freightReference", buffer, theFreightReference, (this.freightReference!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            XMLGregorianCalendar theReceiptDate;
            theReceiptDate = this.getReceiptDate();
            strategy.appendField(locator, this, "receiptDate", buffer, theReceiptDate, (this.receiptDate!= null));
        }
        {
            XMLGregorianCalendar theReportDateTime;
            theReportDateTime = this.getReportDateTime();
            strategy.appendField(locator, this, "reportDateTime", buffer, theReportDateTime, (this.reportDateTime!= null));
        }
        {
            String theShipmentIdentifier;
            theShipmentIdentifier = this.getShipmentIdentifier();
            strategy.appendField(locator, this, "shipmentIdentifier", buffer, theShipmentIdentifier, (this.shipmentIdentifier!= null));
        }
        {
            List<ShipmentReceiptLineItemType> theShipmentReceiptLineItem;
            theShipmentReceiptLineItem = (((this.shipmentReceiptLineItem!= null)&&(!this.shipmentReceiptLineItem.isEmpty()))?this.getShipmentReceiptLineItem():null);
            strategy.appendField(locator, this, "shipmentReceiptLineItem", buffer, theShipmentReceiptLineItem, ((this.shipmentReceiptLineItem!= null)&&(!this.shipmentReceiptLineItem.isEmpty())));
        }
        {
            List<TrackingReference> theTrackingReference;
            theTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            strategy.appendField(locator, this, "trackingReference", buffer, theTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())));
        }
        {
            SpecifiedKnownPartnerType theTransportedBy;
            theTransportedBy = this.getTransportedBy();
            strategy.appendField(locator, this, "transportedBy", buffer, theTransportedBy, (this.transportedBy!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
