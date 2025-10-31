
package io.dscope.rosettanet.interchange.shippingorderconfirmationnotification.v02_00;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.DateInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.IsPartialShipment;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.PhysicalDimensionType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_12.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for ShipmentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsolidationNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ContainerTotalCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}DateInformation"/&gt;
 *         &lt;element name="FreightReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="FreightTotalPhysicalDimension" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}PhysicalDimensionType" minOccurs="0"/&gt;
 *         &lt;element name="ImportBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="IsOrderConsolidated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsOrderMerged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}IsPartialShipment"/&gt;
 *         &lt;element name="ManifestNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="RoutingInformation" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:02.00}RoutingInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ShipFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentInformationType", propOrder = {
    "consolidationNumber",
    "containerTotalCount",
    "dateInformation",
    "freightReference",
    "freightTotalPhysicalDimension",
    "importBy",
    "isOrderConsolidated",
    "isOrderMerged",
    "isPartialShipment",
    "manifestNumber",
    "routingInformation",
    "shipFrom",
    "shipTo"
})
public class ShipmentInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ConsolidationNumber")
    protected BusinessDocumentReferenceType consolidationNumber;
    @XmlElement(name = "ContainerTotalCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger containerTotalCount;
    @XmlElementRef(name = "DateInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = DateInformation.class)
    protected DateInformation dateInformation;
    @XmlElement(name = "FreightReference")
    protected BusinessDocumentReferenceType freightReference;
    @XmlElement(name = "FreightTotalPhysicalDimension")
    protected PhysicalDimensionType freightTotalPhysicalDimension;
    @XmlElement(name = "ImportBy")
    protected SpecifiedPartnerDescriptionType importBy;
    @XmlElement(name = "IsOrderConsolidated")
    protected boolean isOrderConsolidated;
    @XmlElement(name = "IsOrderMerged")
    protected boolean isOrderMerged;
    @XmlElementRef(name = "IsPartialShipment", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = IsPartialShipment.class)
    protected IsPartialShipment isPartialShipment;
    @XmlElement(name = "ManifestNumber")
    protected BusinessDocumentReferenceType manifestNumber;
    @XmlElement(name = "RoutingInformation", required = true)
    protected List<RoutingInformationType> routingInformation;
    @XmlElement(name = "ShipFrom")
    protected SpecifiedPartnerDescriptionType shipFrom;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the consolidationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getConsolidationNumber() {
        return consolidationNumber;
    }

    /**
     * Sets the value of the consolidationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setConsolidationNumber(BusinessDocumentReferenceType value) {
        this.consolidationNumber = value;
    }

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
     * Gets the value of the dateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DateInformation }
     *     
     */
    public DateInformation getDateInformation() {
        return dateInformation;
    }

    /**
     * Sets the value of the dateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInformation }
     *     
     */
    public void setDateInformation(DateInformation value) {
        this.dateInformation = value;
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
     * Gets the value of the freightTotalPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDimensionType }
     *     
     */
    public PhysicalDimensionType getFreightTotalPhysicalDimension() {
        return freightTotalPhysicalDimension;
    }

    /**
     * Sets the value of the freightTotalPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDimensionType }
     *     
     */
    public void setFreightTotalPhysicalDimension(PhysicalDimensionType value) {
        this.freightTotalPhysicalDimension = value;
    }

    /**
     * Gets the value of the importBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getImportBy() {
        return importBy;
    }

    /**
     * Sets the value of the importBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setImportBy(SpecifiedPartnerDescriptionType value) {
        this.importBy = value;
    }

    /**
     * Gets the value of the isOrderConsolidated property.
     * 
     */
    public boolean isIsOrderConsolidated() {
        return isOrderConsolidated;
    }

    /**
     * Sets the value of the isOrderConsolidated property.
     * 
     */
    public void setIsOrderConsolidated(boolean value) {
        this.isOrderConsolidated = value;
    }

    /**
     * Gets the value of the isOrderMerged property.
     * 
     */
    public boolean isIsOrderMerged() {
        return isOrderMerged;
    }

    /**
     * Sets the value of the isOrderMerged property.
     * 
     */
    public void setIsOrderMerged(boolean value) {
        this.isOrderMerged = value;
    }

    /**
     * Gets the value of the isPartialShipment property.
     * 
     * @return
     *     possible object is
     *     {@link IsPartialShipment }
     *     
     */
    public IsPartialShipment getIsPartialShipment() {
        return isPartialShipment;
    }

    /**
     * Sets the value of the isPartialShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsPartialShipment }
     *     
     */
    public void setIsPartialShipment(IsPartialShipment value) {
        this.isPartialShipment = value;
    }

    /**
     * Gets the value of the manifestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getManifestNumber() {
        return manifestNumber;
    }

    /**
     * Sets the value of the manifestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setManifestNumber(BusinessDocumentReferenceType value) {
        this.manifestNumber = value;
    }

    /**
     * Gets the value of the routingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingInformationType }
     * 
     * 
     */
    public List<RoutingInformationType> getRoutingInformation() {
        if (routingInformation == null) {
            routingInformation = new ArrayList<RoutingInformationType>();
        }
        return this.routingInformation;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipFrom(SpecifiedPartnerDescriptionType value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipTo(SpecifiedPartnerDescriptionType value) {
        this.shipTo = value;
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
        final ShipmentInformationType that = ((ShipmentInformationType) object);
        {
            BusinessDocumentReferenceType lhsConsolidationNumber;
            lhsConsolidationNumber = this.getConsolidationNumber();
            BusinessDocumentReferenceType rhsConsolidationNumber;
            rhsConsolidationNumber = that.getConsolidationNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consolidationNumber", lhsConsolidationNumber), LocatorUtils.property(thatLocator, "consolidationNumber", rhsConsolidationNumber), lhsConsolidationNumber, rhsConsolidationNumber, (this.consolidationNumber!= null), (that.consolidationNumber!= null))) {
                return false;
            }
        }
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
            DateInformation lhsDateInformation;
            lhsDateInformation = this.getDateInformation();
            DateInformation rhsDateInformation;
            rhsDateInformation = that.getDateInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateInformation", lhsDateInformation), LocatorUtils.property(thatLocator, "dateInformation", rhsDateInformation), lhsDateInformation, rhsDateInformation, (this.dateInformation!= null), (that.dateInformation!= null))) {
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
            PhysicalDimensionType lhsFreightTotalPhysicalDimension;
            lhsFreightTotalPhysicalDimension = this.getFreightTotalPhysicalDimension();
            PhysicalDimensionType rhsFreightTotalPhysicalDimension;
            rhsFreightTotalPhysicalDimension = that.getFreightTotalPhysicalDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightTotalPhysicalDimension", lhsFreightTotalPhysicalDimension), LocatorUtils.property(thatLocator, "freightTotalPhysicalDimension", rhsFreightTotalPhysicalDimension), lhsFreightTotalPhysicalDimension, rhsFreightTotalPhysicalDimension, (this.freightTotalPhysicalDimension!= null), (that.freightTotalPhysicalDimension!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsImportBy;
            lhsImportBy = this.getImportBy();
            SpecifiedPartnerDescriptionType rhsImportBy;
            rhsImportBy = that.getImportBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "importBy", lhsImportBy), LocatorUtils.property(thatLocator, "importBy", rhsImportBy), lhsImportBy, rhsImportBy, (this.importBy!= null), (that.importBy!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsOrderConsolidated;
            lhsIsOrderConsolidated = this.isIsOrderConsolidated();
            boolean rhsIsOrderConsolidated;
            rhsIsOrderConsolidated = that.isIsOrderConsolidated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isOrderConsolidated", lhsIsOrderConsolidated), LocatorUtils.property(thatLocator, "isOrderConsolidated", rhsIsOrderConsolidated), lhsIsOrderConsolidated, rhsIsOrderConsolidated, true, true)) {
                return false;
            }
        }
        {
            boolean lhsIsOrderMerged;
            lhsIsOrderMerged = this.isIsOrderMerged();
            boolean rhsIsOrderMerged;
            rhsIsOrderMerged = that.isIsOrderMerged();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isOrderMerged", lhsIsOrderMerged), LocatorUtils.property(thatLocator, "isOrderMerged", rhsIsOrderMerged), lhsIsOrderMerged, rhsIsOrderMerged, true, true)) {
                return false;
            }
        }
        {
            IsPartialShipment lhsIsPartialShipment;
            lhsIsPartialShipment = this.getIsPartialShipment();
            IsPartialShipment rhsIsPartialShipment;
            rhsIsPartialShipment = that.getIsPartialShipment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isPartialShipment", lhsIsPartialShipment), LocatorUtils.property(thatLocator, "isPartialShipment", rhsIsPartialShipment), lhsIsPartialShipment, rhsIsPartialShipment, (this.isPartialShipment!= null), (that.isPartialShipment!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsManifestNumber;
            lhsManifestNumber = this.getManifestNumber();
            BusinessDocumentReferenceType rhsManifestNumber;
            rhsManifestNumber = that.getManifestNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manifestNumber", lhsManifestNumber), LocatorUtils.property(thatLocator, "manifestNumber", rhsManifestNumber), lhsManifestNumber, rhsManifestNumber, (this.manifestNumber!= null), (that.manifestNumber!= null))) {
                return false;
            }
        }
        {
            List<RoutingInformationType> lhsRoutingInformation;
            lhsRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            List<RoutingInformationType> rhsRoutingInformation;
            rhsRoutingInformation = (((that.routingInformation!= null)&&(!that.routingInformation.isEmpty()))?that.getRoutingInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "routingInformation", lhsRoutingInformation), LocatorUtils.property(thatLocator, "routingInformation", rhsRoutingInformation), lhsRoutingInformation, rhsRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())), ((that.routingInformation!= null)&&(!that.routingInformation.isEmpty())))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsShipFrom;
            lhsShipFrom = this.getShipFrom();
            SpecifiedPartnerDescriptionType rhsShipFrom;
            rhsShipFrom = that.getShipFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipFrom", lhsShipFrom), LocatorUtils.property(thatLocator, "shipFrom", rhsShipFrom), lhsShipFrom, rhsShipFrom, (this.shipFrom!= null), (that.shipFrom!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsShipTo;
            lhsShipTo = this.getShipTo();
            SpecifiedPartnerDescriptionType rhsShipTo;
            rhsShipTo = that.getShipTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipTo", lhsShipTo), LocatorUtils.property(thatLocator, "shipTo", rhsShipTo), lhsShipTo, rhsShipTo, (this.shipTo!= null), (that.shipTo!= null))) {
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
            BusinessDocumentReferenceType theConsolidationNumber;
            theConsolidationNumber = this.getConsolidationNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consolidationNumber", theConsolidationNumber), currentHashCode, theConsolidationNumber, (this.consolidationNumber!= null));
        }
        {
            BigInteger theContainerTotalCount;
            theContainerTotalCount = this.getContainerTotalCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerTotalCount", theContainerTotalCount), currentHashCode, theContainerTotalCount, (this.containerTotalCount!= null));
        }
        {
            DateInformation theDateInformation;
            theDateInformation = this.getDateInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateInformation", theDateInformation), currentHashCode, theDateInformation, (this.dateInformation!= null));
        }
        {
            BusinessDocumentReferenceType theFreightReference;
            theFreightReference = this.getFreightReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightReference", theFreightReference), currentHashCode, theFreightReference, (this.freightReference!= null));
        }
        {
            PhysicalDimensionType theFreightTotalPhysicalDimension;
            theFreightTotalPhysicalDimension = this.getFreightTotalPhysicalDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightTotalPhysicalDimension", theFreightTotalPhysicalDimension), currentHashCode, theFreightTotalPhysicalDimension, (this.freightTotalPhysicalDimension!= null));
        }
        {
            SpecifiedPartnerDescriptionType theImportBy;
            theImportBy = this.getImportBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "importBy", theImportBy), currentHashCode, theImportBy, (this.importBy!= null));
        }
        {
            boolean theIsOrderConsolidated;
            theIsOrderConsolidated = this.isIsOrderConsolidated();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isOrderConsolidated", theIsOrderConsolidated), currentHashCode, theIsOrderConsolidated, true);
        }
        {
            boolean theIsOrderMerged;
            theIsOrderMerged = this.isIsOrderMerged();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isOrderMerged", theIsOrderMerged), currentHashCode, theIsOrderMerged, true);
        }
        {
            IsPartialShipment theIsPartialShipment;
            theIsPartialShipment = this.getIsPartialShipment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isPartialShipment", theIsPartialShipment), currentHashCode, theIsPartialShipment, (this.isPartialShipment!= null));
        }
        {
            BusinessDocumentReferenceType theManifestNumber;
            theManifestNumber = this.getManifestNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manifestNumber", theManifestNumber), currentHashCode, theManifestNumber, (this.manifestNumber!= null));
        }
        {
            List<RoutingInformationType> theRoutingInformation;
            theRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "routingInformation", theRoutingInformation), currentHashCode, theRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theShipFrom;
            theShipFrom = this.getShipFrom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipFrom", theShipFrom), currentHashCode, theShipFrom, (this.shipFrom!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipTo", theShipTo), currentHashCode, theShipTo, (this.shipTo!= null));
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
            BusinessDocumentReferenceType theConsolidationNumber;
            theConsolidationNumber = this.getConsolidationNumber();
            strategy.appendField(locator, this, "consolidationNumber", buffer, theConsolidationNumber, (this.consolidationNumber!= null));
        }
        {
            BigInteger theContainerTotalCount;
            theContainerTotalCount = this.getContainerTotalCount();
            strategy.appendField(locator, this, "containerTotalCount", buffer, theContainerTotalCount, (this.containerTotalCount!= null));
        }
        {
            DateInformation theDateInformation;
            theDateInformation = this.getDateInformation();
            strategy.appendField(locator, this, "dateInformation", buffer, theDateInformation, (this.dateInformation!= null));
        }
        {
            BusinessDocumentReferenceType theFreightReference;
            theFreightReference = this.getFreightReference();
            strategy.appendField(locator, this, "freightReference", buffer, theFreightReference, (this.freightReference!= null));
        }
        {
            PhysicalDimensionType theFreightTotalPhysicalDimension;
            theFreightTotalPhysicalDimension = this.getFreightTotalPhysicalDimension();
            strategy.appendField(locator, this, "freightTotalPhysicalDimension", buffer, theFreightTotalPhysicalDimension, (this.freightTotalPhysicalDimension!= null));
        }
        {
            SpecifiedPartnerDescriptionType theImportBy;
            theImportBy = this.getImportBy();
            strategy.appendField(locator, this, "importBy", buffer, theImportBy, (this.importBy!= null));
        }
        {
            boolean theIsOrderConsolidated;
            theIsOrderConsolidated = this.isIsOrderConsolidated();
            strategy.appendField(locator, this, "isOrderConsolidated", buffer, theIsOrderConsolidated, true);
        }
        {
            boolean theIsOrderMerged;
            theIsOrderMerged = this.isIsOrderMerged();
            strategy.appendField(locator, this, "isOrderMerged", buffer, theIsOrderMerged, true);
        }
        {
            IsPartialShipment theIsPartialShipment;
            theIsPartialShipment = this.getIsPartialShipment();
            strategy.appendField(locator, this, "isPartialShipment", buffer, theIsPartialShipment, (this.isPartialShipment!= null));
        }
        {
            BusinessDocumentReferenceType theManifestNumber;
            theManifestNumber = this.getManifestNumber();
            strategy.appendField(locator, this, "manifestNumber", buffer, theManifestNumber, (this.manifestNumber!= null));
        }
        {
            List<RoutingInformationType> theRoutingInformation;
            theRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            strategy.appendField(locator, this, "routingInformation", buffer, theRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theShipFrom;
            theShipFrom = this.getShipFrom();
            strategy.appendField(locator, this, "shipFrom", buffer, theShipFrom, (this.shipFrom!= null));
        }
        {
            SpecifiedPartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            strategy.appendField(locator, this, "shipTo", buffer, theShipTo, (this.shipTo!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
