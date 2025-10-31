
package io.dscope.rosettanet.interchange.invoicenotification.v01_07;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_02.TrackingReferenceType;
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
 * <p>Java class for OrderStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryIdentifier" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.02}TrackingReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrder" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.07}PurchaseOrderType"/&gt;
 *         &lt;element name="SecondaryIdentifier" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.02}TrackingReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "OrderStatusType", propOrder = {
    "primaryIdentifier",
    "purchaseOrder",
    "secondaryIdentifier"
})
public class OrderStatusType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "PrimaryIdentifier")
    protected List<TrackingReferenceType> primaryIdentifier;
    @XmlElement(name = "PurchaseOrder", required = true)
    protected PurchaseOrderType purchaseOrder;
    @XmlElement(name = "SecondaryIdentifier")
    protected List<TrackingReferenceType> secondaryIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the primaryIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingReferenceType }
     * 
     * 
     */
    public List<TrackingReferenceType> getPrimaryIdentifier() {
        if (primaryIdentifier == null) {
            primaryIdentifier = new ArrayList<TrackingReferenceType>();
        }
        return this.primaryIdentifier;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderType }
     *     
     */
    public PurchaseOrderType getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Sets the value of the purchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderType }
     *     
     */
    public void setPurchaseOrder(PurchaseOrderType value) {
        this.purchaseOrder = value;
    }

    /**
     * Gets the value of the secondaryIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingReferenceType }
     * 
     * 
     */
    public List<TrackingReferenceType> getSecondaryIdentifier() {
        if (secondaryIdentifier == null) {
            secondaryIdentifier = new ArrayList<TrackingReferenceType>();
        }
        return this.secondaryIdentifier;
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
        final OrderStatusType that = ((OrderStatusType) object);
        {
            List<TrackingReferenceType> lhsPrimaryIdentifier;
            lhsPrimaryIdentifier = (((this.primaryIdentifier!= null)&&(!this.primaryIdentifier.isEmpty()))?this.getPrimaryIdentifier():null);
            List<TrackingReferenceType> rhsPrimaryIdentifier;
            rhsPrimaryIdentifier = (((that.primaryIdentifier!= null)&&(!that.primaryIdentifier.isEmpty()))?that.getPrimaryIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryIdentifier", lhsPrimaryIdentifier), LocatorUtils.property(thatLocator, "primaryIdentifier", rhsPrimaryIdentifier), lhsPrimaryIdentifier, rhsPrimaryIdentifier, ((this.primaryIdentifier!= null)&&(!this.primaryIdentifier.isEmpty())), ((that.primaryIdentifier!= null)&&(!that.primaryIdentifier.isEmpty())))) {
                return false;
            }
        }
        {
            PurchaseOrderType lhsPurchaseOrder;
            lhsPurchaseOrder = this.getPurchaseOrder();
            PurchaseOrderType rhsPurchaseOrder;
            rhsPurchaseOrder = that.getPurchaseOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrder", lhsPurchaseOrder), LocatorUtils.property(thatLocator, "purchaseOrder", rhsPurchaseOrder), lhsPurchaseOrder, rhsPurchaseOrder, (this.purchaseOrder!= null), (that.purchaseOrder!= null))) {
                return false;
            }
        }
        {
            List<TrackingReferenceType> lhsSecondaryIdentifier;
            lhsSecondaryIdentifier = (((this.secondaryIdentifier!= null)&&(!this.secondaryIdentifier.isEmpty()))?this.getSecondaryIdentifier():null);
            List<TrackingReferenceType> rhsSecondaryIdentifier;
            rhsSecondaryIdentifier = (((that.secondaryIdentifier!= null)&&(!that.secondaryIdentifier.isEmpty()))?that.getSecondaryIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secondaryIdentifier", lhsSecondaryIdentifier), LocatorUtils.property(thatLocator, "secondaryIdentifier", rhsSecondaryIdentifier), lhsSecondaryIdentifier, rhsSecondaryIdentifier, ((this.secondaryIdentifier!= null)&&(!this.secondaryIdentifier.isEmpty())), ((that.secondaryIdentifier!= null)&&(!that.secondaryIdentifier.isEmpty())))) {
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
            List<TrackingReferenceType> thePrimaryIdentifier;
            thePrimaryIdentifier = (((this.primaryIdentifier!= null)&&(!this.primaryIdentifier.isEmpty()))?this.getPrimaryIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryIdentifier", thePrimaryIdentifier), currentHashCode, thePrimaryIdentifier, ((this.primaryIdentifier!= null)&&(!this.primaryIdentifier.isEmpty())));
        }
        {
            PurchaseOrderType thePurchaseOrder;
            thePurchaseOrder = this.getPurchaseOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrder", thePurchaseOrder), currentHashCode, thePurchaseOrder, (this.purchaseOrder!= null));
        }
        {
            List<TrackingReferenceType> theSecondaryIdentifier;
            theSecondaryIdentifier = (((this.secondaryIdentifier!= null)&&(!this.secondaryIdentifier.isEmpty()))?this.getSecondaryIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondaryIdentifier", theSecondaryIdentifier), currentHashCode, theSecondaryIdentifier, ((this.secondaryIdentifier!= null)&&(!this.secondaryIdentifier.isEmpty())));
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
            List<TrackingReferenceType> thePrimaryIdentifier;
            thePrimaryIdentifier = (((this.primaryIdentifier!= null)&&(!this.primaryIdentifier.isEmpty()))?this.getPrimaryIdentifier():null);
            strategy.appendField(locator, this, "primaryIdentifier", buffer, thePrimaryIdentifier, ((this.primaryIdentifier!= null)&&(!this.primaryIdentifier.isEmpty())));
        }
        {
            PurchaseOrderType thePurchaseOrder;
            thePurchaseOrder = this.getPurchaseOrder();
            strategy.appendField(locator, this, "purchaseOrder", buffer, thePurchaseOrder, (this.purchaseOrder!= null));
        }
        {
            List<TrackingReferenceType> theSecondaryIdentifier;
            theSecondaryIdentifier = (((this.secondaryIdentifier!= null)&&(!this.secondaryIdentifier.isEmpty()))?this.getSecondaryIdentifier():null);
            strategy.appendField(locator, this, "secondaryIdentifier", buffer, theSecondaryIdentifier, ((this.secondaryIdentifier!= null)&&(!this.secondaryIdentifier.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
