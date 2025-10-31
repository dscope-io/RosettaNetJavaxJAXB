
package io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_01;

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
import io.dscope.rosettanet.domain.design.design.v02_22.LifeCycleStatus;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.ManufacturerProfile;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.SubstituteProductReference;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
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
 * <p>Java class for ProductLifeCycleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLifeCycleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.22}LifeCycleStatus" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}ManufacturerProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderAvailability" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}SubstituteProductReference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductLifeCycleType", propOrder = {
    "businessDocumentReference",
    "lifeCycleStatus",
    "manufacturerProfile",
    "orderAvailability",
    "shipDate",
    "substituteProductReference"
})
public class ProductLifeCycleType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "LifeCycleStatus", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.22", type = LifeCycleStatus.class)
    protected List<LifeCycleStatus> lifeCycleStatus;
    @XmlElementRef(name = "ManufacturerProfile", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = ManufacturerProfile.class, required = false)
    protected List<ManufacturerProfile> manufacturerProfile;
    @XmlElement(name = "OrderAvailability")
    protected DatePeriodType orderAvailability;
    @XmlElement(name = "ShipDate")
    protected DatePeriodType shipDate;
    @XmlElementRef(name = "SubstituteProductReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = SubstituteProductReference.class, required = false)
    protected List<SubstituteProductReference> substituteProductReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
    }

    /**
     * Gets the value of the lifeCycleStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lifeCycleStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLifeCycleStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LifeCycleStatus }
     * 
     * 
     */
    public List<LifeCycleStatus> getLifeCycleStatus() {
        if (lifeCycleStatus == null) {
            lifeCycleStatus = new ArrayList<LifeCycleStatus>();
        }
        return this.lifeCycleStatus;
    }

    /**
     * Gets the value of the manufacturerProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManufacturerProfile }
     * 
     * 
     */
    public List<ManufacturerProfile> getManufacturerProfile() {
        if (manufacturerProfile == null) {
            manufacturerProfile = new ArrayList<ManufacturerProfile>();
        }
        return this.manufacturerProfile;
    }

    /**
     * Gets the value of the orderAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getOrderAvailability() {
        return orderAvailability;
    }

    /**
     * Sets the value of the orderAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setOrderAvailability(DatePeriodType value) {
        this.orderAvailability = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setShipDate(DatePeriodType value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the substituteProductReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substituteProductReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstituteProductReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstituteProductReference }
     * 
     * 
     */
    public List<SubstituteProductReference> getSubstituteProductReference() {
        if (substituteProductReference == null) {
            substituteProductReference = new ArrayList<SubstituteProductReference>();
        }
        return this.substituteProductReference;
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
        final ProductLifeCycleType that = ((ProductLifeCycleType) object);
        {
            List<BusinessDocumentReference> lhsBusinessDocumentReference;
            lhsBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            List<BusinessDocumentReference> rhsBusinessDocumentReference;
            rhsBusinessDocumentReference = (((that.businessDocumentReference!= null)&&(!that.businessDocumentReference.isEmpty()))?that.getBusinessDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentReference", lhsBusinessDocumentReference), LocatorUtils.property(thatLocator, "businessDocumentReference", rhsBusinessDocumentReference), lhsBusinessDocumentReference, rhsBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())), ((that.businessDocumentReference!= null)&&(!that.businessDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<LifeCycleStatus> lhsLifeCycleStatus;
            lhsLifeCycleStatus = (((this.lifeCycleStatus!= null)&&(!this.lifeCycleStatus.isEmpty()))?this.getLifeCycleStatus():null);
            List<LifeCycleStatus> rhsLifeCycleStatus;
            rhsLifeCycleStatus = (((that.lifeCycleStatus!= null)&&(!that.lifeCycleStatus.isEmpty()))?that.getLifeCycleStatus():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lifeCycleStatus", lhsLifeCycleStatus), LocatorUtils.property(thatLocator, "lifeCycleStatus", rhsLifeCycleStatus), lhsLifeCycleStatus, rhsLifeCycleStatus, ((this.lifeCycleStatus!= null)&&(!this.lifeCycleStatus.isEmpty())), ((that.lifeCycleStatus!= null)&&(!that.lifeCycleStatus.isEmpty())))) {
                return false;
            }
        }
        {
            List<ManufacturerProfile> lhsManufacturerProfile;
            lhsManufacturerProfile = (((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty()))?this.getManufacturerProfile():null);
            List<ManufacturerProfile> rhsManufacturerProfile;
            rhsManufacturerProfile = (((that.manufacturerProfile!= null)&&(!that.manufacturerProfile.isEmpty()))?that.getManufacturerProfile():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturerProfile", lhsManufacturerProfile), LocatorUtils.property(thatLocator, "manufacturerProfile", rhsManufacturerProfile), lhsManufacturerProfile, rhsManufacturerProfile, ((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty())), ((that.manufacturerProfile!= null)&&(!that.manufacturerProfile.isEmpty())))) {
                return false;
            }
        }
        {
            DatePeriodType lhsOrderAvailability;
            lhsOrderAvailability = this.getOrderAvailability();
            DatePeriodType rhsOrderAvailability;
            rhsOrderAvailability = that.getOrderAvailability();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderAvailability", lhsOrderAvailability), LocatorUtils.property(thatLocator, "orderAvailability", rhsOrderAvailability), lhsOrderAvailability, rhsOrderAvailability, (this.orderAvailability!= null), (that.orderAvailability!= null))) {
                return false;
            }
        }
        {
            DatePeriodType lhsShipDate;
            lhsShipDate = this.getShipDate();
            DatePeriodType rhsShipDate;
            rhsShipDate = that.getShipDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipDate", lhsShipDate), LocatorUtils.property(thatLocator, "shipDate", rhsShipDate), lhsShipDate, rhsShipDate, (this.shipDate!= null), (that.shipDate!= null))) {
                return false;
            }
        }
        {
            List<SubstituteProductReference> lhsSubstituteProductReference;
            lhsSubstituteProductReference = (((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty()))?this.getSubstituteProductReference():null);
            List<SubstituteProductReference> rhsSubstituteProductReference;
            rhsSubstituteProductReference = (((that.substituteProductReference!= null)&&(!that.substituteProductReference.isEmpty()))?that.getSubstituteProductReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substituteProductReference", lhsSubstituteProductReference), LocatorUtils.property(thatLocator, "substituteProductReference", rhsSubstituteProductReference), lhsSubstituteProductReference, rhsSubstituteProductReference, ((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty())), ((that.substituteProductReference!= null)&&(!that.substituteProductReference.isEmpty())))) {
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
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            List<LifeCycleStatus> theLifeCycleStatus;
            theLifeCycleStatus = (((this.lifeCycleStatus!= null)&&(!this.lifeCycleStatus.isEmpty()))?this.getLifeCycleStatus():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lifeCycleStatus", theLifeCycleStatus), currentHashCode, theLifeCycleStatus, ((this.lifeCycleStatus!= null)&&(!this.lifeCycleStatus.isEmpty())));
        }
        {
            List<ManufacturerProfile> theManufacturerProfile;
            theManufacturerProfile = (((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty()))?this.getManufacturerProfile():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturerProfile", theManufacturerProfile), currentHashCode, theManufacturerProfile, ((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty())));
        }
        {
            DatePeriodType theOrderAvailability;
            theOrderAvailability = this.getOrderAvailability();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderAvailability", theOrderAvailability), currentHashCode, theOrderAvailability, (this.orderAvailability!= null));
        }
        {
            DatePeriodType theShipDate;
            theShipDate = this.getShipDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipDate", theShipDate), currentHashCode, theShipDate, (this.shipDate!= null));
        }
        {
            List<SubstituteProductReference> theSubstituteProductReference;
            theSubstituteProductReference = (((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty()))?this.getSubstituteProductReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substituteProductReference", theSubstituteProductReference), currentHashCode, theSubstituteProductReference, ((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty())));
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
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            List<LifeCycleStatus> theLifeCycleStatus;
            theLifeCycleStatus = (((this.lifeCycleStatus!= null)&&(!this.lifeCycleStatus.isEmpty()))?this.getLifeCycleStatus():null);
            strategy.appendField(locator, this, "lifeCycleStatus", buffer, theLifeCycleStatus, ((this.lifeCycleStatus!= null)&&(!this.lifeCycleStatus.isEmpty())));
        }
        {
            List<ManufacturerProfile> theManufacturerProfile;
            theManufacturerProfile = (((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty()))?this.getManufacturerProfile():null);
            strategy.appendField(locator, this, "manufacturerProfile", buffer, theManufacturerProfile, ((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty())));
        }
        {
            DatePeriodType theOrderAvailability;
            theOrderAvailability = this.getOrderAvailability();
            strategy.appendField(locator, this, "orderAvailability", buffer, theOrderAvailability, (this.orderAvailability!= null));
        }
        {
            DatePeriodType theShipDate;
            theShipDate = this.getShipDate();
            strategy.appendField(locator, this, "shipDate", buffer, theShipDate, (this.shipDate!= null));
        }
        {
            List<SubstituteProductReference> theSubstituteProductReference;
            theSubstituteProductReference = (((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty()))?this.getSubstituteProductReference():null);
            strategy.appendField(locator, this, "substituteProductReference", buffer, theSubstituteProductReference, ((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
