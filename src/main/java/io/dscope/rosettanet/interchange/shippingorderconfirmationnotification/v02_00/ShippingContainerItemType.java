
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
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.LotReference;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.ManufacturerProfile;
import io.dscope.rosettanet.domain.shared.shared.v01_10.QuantityInformation;
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
 * <p>Java class for ShippingContainerItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingContainerItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}LotReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}ManufacturerProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfItemPackages" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}QuantityInformation"/&gt;
 *         &lt;element name="RequestingOrderLineItemReference" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:02.00}RequestingOrderLineItemReferenceType"/&gt;
 *         &lt;element name="TraceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ShippingContainerItemType", propOrder = {
    "lotReference",
    "manufacturerProfile",
    "numberOfItemPackages",
    "quantityInformation",
    "requestingOrderLineItemReference",
    "traceIdentifier"
})
public class ShippingContainerItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "LotReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = LotReference.class, required = false)
    protected List<LotReference> lotReference;
    @XmlElementRef(name = "ManufacturerProfile", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = ManufacturerProfile.class, required = false)
    protected List<ManufacturerProfile> manufacturerProfile;
    @XmlElement(name = "NumberOfItemPackages")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfItemPackages;
    @XmlElementRef(name = "QuantityInformation", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = QuantityInformation.class)
    protected QuantityInformation quantityInformation;
    @XmlElement(name = "RequestingOrderLineItemReference", required = true)
    protected RequestingOrderLineItemReferenceType requestingOrderLineItemReference;
    @XmlElement(name = "TraceIdentifier")
    protected List<String> traceIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lotReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotReference }
     * 
     * 
     */
    public List<LotReference> getLotReference() {
        if (lotReference == null) {
            lotReference = new ArrayList<LotReference>();
        }
        return this.lotReference;
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
     * Gets the value of the numberOfItemPackages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItemPackages() {
        return numberOfItemPackages;
    }

    /**
     * Sets the value of the numberOfItemPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItemPackages(BigInteger value) {
        this.numberOfItemPackages = value;
    }

    /**
     * Gets the value of the quantityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityInformation }
     *     
     */
    public QuantityInformation getQuantityInformation() {
        return quantityInformation;
    }

    /**
     * Sets the value of the quantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityInformation }
     *     
     */
    public void setQuantityInformation(QuantityInformation value) {
        this.quantityInformation = value;
    }

    /**
     * Gets the value of the requestingOrderLineItemReference property.
     * 
     * @return
     *     possible object is
     *     {@link RequestingOrderLineItemReferenceType }
     *     
     */
    public RequestingOrderLineItemReferenceType getRequestingOrderLineItemReference() {
        return requestingOrderLineItemReference;
    }

    /**
     * Sets the value of the requestingOrderLineItemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestingOrderLineItemReferenceType }
     *     
     */
    public void setRequestingOrderLineItemReference(RequestingOrderLineItemReferenceType value) {
        this.requestingOrderLineItemReference = value;
    }

    /**
     * Gets the value of the traceIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traceIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraceIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTraceIdentifier() {
        if (traceIdentifier == null) {
            traceIdentifier = new ArrayList<String>();
        }
        return this.traceIdentifier;
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
        final ShippingContainerItemType that = ((ShippingContainerItemType) object);
        {
            List<LotReference> lhsLotReference;
            lhsLotReference = (((this.lotReference!= null)&&(!this.lotReference.isEmpty()))?this.getLotReference():null);
            List<LotReference> rhsLotReference;
            rhsLotReference = (((that.lotReference!= null)&&(!that.lotReference.isEmpty()))?that.getLotReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotReference", lhsLotReference), LocatorUtils.property(thatLocator, "lotReference", rhsLotReference), lhsLotReference, rhsLotReference, ((this.lotReference!= null)&&(!this.lotReference.isEmpty())), ((that.lotReference!= null)&&(!that.lotReference.isEmpty())))) {
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
            BigInteger lhsNumberOfItemPackages;
            lhsNumberOfItemPackages = this.getNumberOfItemPackages();
            BigInteger rhsNumberOfItemPackages;
            rhsNumberOfItemPackages = that.getNumberOfItemPackages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfItemPackages", lhsNumberOfItemPackages), LocatorUtils.property(thatLocator, "numberOfItemPackages", rhsNumberOfItemPackages), lhsNumberOfItemPackages, rhsNumberOfItemPackages, (this.numberOfItemPackages!= null), (that.numberOfItemPackages!= null))) {
                return false;
            }
        }
        {
            QuantityInformation lhsQuantityInformation;
            lhsQuantityInformation = this.getQuantityInformation();
            QuantityInformation rhsQuantityInformation;
            rhsQuantityInformation = that.getQuantityInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityInformation", lhsQuantityInformation), LocatorUtils.property(thatLocator, "quantityInformation", rhsQuantityInformation), lhsQuantityInformation, rhsQuantityInformation, (this.quantityInformation!= null), (that.quantityInformation!= null))) {
                return false;
            }
        }
        {
            RequestingOrderLineItemReferenceType lhsRequestingOrderLineItemReference;
            lhsRequestingOrderLineItemReference = this.getRequestingOrderLineItemReference();
            RequestingOrderLineItemReferenceType rhsRequestingOrderLineItemReference;
            rhsRequestingOrderLineItemReference = that.getRequestingOrderLineItemReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestingOrderLineItemReference", lhsRequestingOrderLineItemReference), LocatorUtils.property(thatLocator, "requestingOrderLineItemReference", rhsRequestingOrderLineItemReference), lhsRequestingOrderLineItemReference, rhsRequestingOrderLineItemReference, (this.requestingOrderLineItemReference!= null), (that.requestingOrderLineItemReference!= null))) {
                return false;
            }
        }
        {
            List<String> lhsTraceIdentifier;
            lhsTraceIdentifier = (((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty()))?this.getTraceIdentifier():null);
            List<String> rhsTraceIdentifier;
            rhsTraceIdentifier = (((that.traceIdentifier!= null)&&(!that.traceIdentifier.isEmpty()))?that.getTraceIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "traceIdentifier", lhsTraceIdentifier), LocatorUtils.property(thatLocator, "traceIdentifier", rhsTraceIdentifier), lhsTraceIdentifier, rhsTraceIdentifier, ((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty())), ((that.traceIdentifier!= null)&&(!that.traceIdentifier.isEmpty())))) {
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
            List<LotReference> theLotReference;
            theLotReference = (((this.lotReference!= null)&&(!this.lotReference.isEmpty()))?this.getLotReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotReference", theLotReference), currentHashCode, theLotReference, ((this.lotReference!= null)&&(!this.lotReference.isEmpty())));
        }
        {
            List<ManufacturerProfile> theManufacturerProfile;
            theManufacturerProfile = (((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty()))?this.getManufacturerProfile():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturerProfile", theManufacturerProfile), currentHashCode, theManufacturerProfile, ((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty())));
        }
        {
            BigInteger theNumberOfItemPackages;
            theNumberOfItemPackages = this.getNumberOfItemPackages();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberOfItemPackages", theNumberOfItemPackages), currentHashCode, theNumberOfItemPackages, (this.numberOfItemPackages!= null));
        }
        {
            QuantityInformation theQuantityInformation;
            theQuantityInformation = this.getQuantityInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityInformation", theQuantityInformation), currentHashCode, theQuantityInformation, (this.quantityInformation!= null));
        }
        {
            RequestingOrderLineItemReferenceType theRequestingOrderLineItemReference;
            theRequestingOrderLineItemReference = this.getRequestingOrderLineItemReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestingOrderLineItemReference", theRequestingOrderLineItemReference), currentHashCode, theRequestingOrderLineItemReference, (this.requestingOrderLineItemReference!= null));
        }
        {
            List<String> theTraceIdentifier;
            theTraceIdentifier = (((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty()))?this.getTraceIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traceIdentifier", theTraceIdentifier), currentHashCode, theTraceIdentifier, ((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty())));
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
            List<LotReference> theLotReference;
            theLotReference = (((this.lotReference!= null)&&(!this.lotReference.isEmpty()))?this.getLotReference():null);
            strategy.appendField(locator, this, "lotReference", buffer, theLotReference, ((this.lotReference!= null)&&(!this.lotReference.isEmpty())));
        }
        {
            List<ManufacturerProfile> theManufacturerProfile;
            theManufacturerProfile = (((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty()))?this.getManufacturerProfile():null);
            strategy.appendField(locator, this, "manufacturerProfile", buffer, theManufacturerProfile, ((this.manufacturerProfile!= null)&&(!this.manufacturerProfile.isEmpty())));
        }
        {
            BigInteger theNumberOfItemPackages;
            theNumberOfItemPackages = this.getNumberOfItemPackages();
            strategy.appendField(locator, this, "numberOfItemPackages", buffer, theNumberOfItemPackages, (this.numberOfItemPackages!= null));
        }
        {
            QuantityInformation theQuantityInformation;
            theQuantityInformation = this.getQuantityInformation();
            strategy.appendField(locator, this, "quantityInformation", buffer, theQuantityInformation, (this.quantityInformation!= null));
        }
        {
            RequestingOrderLineItemReferenceType theRequestingOrderLineItemReference;
            theRequestingOrderLineItemReference = this.getRequestingOrderLineItemReference();
            strategy.appendField(locator, this, "requestingOrderLineItemReference", buffer, theRequestingOrderLineItemReference, (this.requestingOrderLineItemReference!= null));
        }
        {
            List<String> theTraceIdentifier;
            theTraceIdentifier = (((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty()))?this.getTraceIdentifier():null);
            strategy.appendField(locator, this, "traceIdentifier", buffer, theTraceIdentifier, ((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
