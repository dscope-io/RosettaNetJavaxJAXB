
package io.dscope.rosettanet.interchange.approvedmanufacturerlistconfirmationnotification.v01_00;

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
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
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
 * <p>Java class for ApprovedManufacturerListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovedManufacturerListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApprovedManufacturerListItem" type="{urn:rosettanet:specification:interchange:ApprovedManufacturerListConfirmationNotification:xsd:schema:01.00}ApprovedManufacturerListItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="EffectiveDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType"/&gt;
 *         &lt;element name="PreviousNotification" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
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
@XmlType(name = "ApprovedManufacturerListType", propOrder = {
    "approvedManufacturerListItem",
    "effectiveDatePeriod",
    "previousNotification",
    "productIdentification"
})
public class ApprovedManufacturerListType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ApprovedManufacturerListItem", required = true)
    protected List<ApprovedManufacturerListItemType> approvedManufacturerListItem;
    @XmlElement(name = "EffectiveDatePeriod", required = true)
    protected DatePeriodType effectiveDatePeriod;
    @XmlElement(name = "PreviousNotification")
    protected BusinessDocumentReferenceType previousNotification;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the approvedManufacturerListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvedManufacturerListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovedManufacturerListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApprovedManufacturerListItemType }
     * 
     * 
     */
    public List<ApprovedManufacturerListItemType> getApprovedManufacturerListItem() {
        if (approvedManufacturerListItem == null) {
            approvedManufacturerListItem = new ArrayList<ApprovedManufacturerListItemType>();
        }
        return this.approvedManufacturerListItem;
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
     * Gets the value of the previousNotification property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPreviousNotification() {
        return previousNotification;
    }

    /**
     * Sets the value of the previousNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPreviousNotification(BusinessDocumentReferenceType value) {
        this.previousNotification = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
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
        final ApprovedManufacturerListType that = ((ApprovedManufacturerListType) object);
        {
            List<ApprovedManufacturerListItemType> lhsApprovedManufacturerListItem;
            lhsApprovedManufacturerListItem = (((this.approvedManufacturerListItem!= null)&&(!this.approvedManufacturerListItem.isEmpty()))?this.getApprovedManufacturerListItem():null);
            List<ApprovedManufacturerListItemType> rhsApprovedManufacturerListItem;
            rhsApprovedManufacturerListItem = (((that.approvedManufacturerListItem!= null)&&(!that.approvedManufacturerListItem.isEmpty()))?that.getApprovedManufacturerListItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "approvedManufacturerListItem", lhsApprovedManufacturerListItem), LocatorUtils.property(thatLocator, "approvedManufacturerListItem", rhsApprovedManufacturerListItem), lhsApprovedManufacturerListItem, rhsApprovedManufacturerListItem, ((this.approvedManufacturerListItem!= null)&&(!this.approvedManufacturerListItem.isEmpty())), ((that.approvedManufacturerListItem!= null)&&(!that.approvedManufacturerListItem.isEmpty())))) {
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
            BusinessDocumentReferenceType lhsPreviousNotification;
            lhsPreviousNotification = this.getPreviousNotification();
            BusinessDocumentReferenceType rhsPreviousNotification;
            rhsPreviousNotification = that.getPreviousNotification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousNotification", lhsPreviousNotification), LocatorUtils.property(thatLocator, "previousNotification", rhsPreviousNotification), lhsPreviousNotification, rhsPreviousNotification, (this.previousNotification!= null), (that.previousNotification!= null))) {
                return false;
            }
        }
        {
            ProductIdentification lhsProductIdentification;
            lhsProductIdentification = this.getProductIdentification();
            ProductIdentification rhsProductIdentification;
            rhsProductIdentification = that.getProductIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentification", lhsProductIdentification), LocatorUtils.property(thatLocator, "productIdentification", rhsProductIdentification), lhsProductIdentification, rhsProductIdentification, (this.productIdentification!= null), (that.productIdentification!= null))) {
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
            List<ApprovedManufacturerListItemType> theApprovedManufacturerListItem;
            theApprovedManufacturerListItem = (((this.approvedManufacturerListItem!= null)&&(!this.approvedManufacturerListItem.isEmpty()))?this.getApprovedManufacturerListItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "approvedManufacturerListItem", theApprovedManufacturerListItem), currentHashCode, theApprovedManufacturerListItem, ((this.approvedManufacturerListItem!= null)&&(!this.approvedManufacturerListItem.isEmpty())));
        }
        {
            DatePeriodType theEffectiveDatePeriod;
            theEffectiveDatePeriod = this.getEffectiveDatePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveDatePeriod", theEffectiveDatePeriod), currentHashCode, theEffectiveDatePeriod, (this.effectiveDatePeriod!= null));
        }
        {
            BusinessDocumentReferenceType thePreviousNotification;
            thePreviousNotification = this.getPreviousNotification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousNotification", thePreviousNotification), currentHashCode, thePreviousNotification, (this.previousNotification!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
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
            List<ApprovedManufacturerListItemType> theApprovedManufacturerListItem;
            theApprovedManufacturerListItem = (((this.approvedManufacturerListItem!= null)&&(!this.approvedManufacturerListItem.isEmpty()))?this.getApprovedManufacturerListItem():null);
            strategy.appendField(locator, this, "approvedManufacturerListItem", buffer, theApprovedManufacturerListItem, ((this.approvedManufacturerListItem!= null)&&(!this.approvedManufacturerListItem.isEmpty())));
        }
        {
            DatePeriodType theEffectiveDatePeriod;
            theEffectiveDatePeriod = this.getEffectiveDatePeriod();
            strategy.appendField(locator, this, "effectiveDatePeriod", buffer, theEffectiveDatePeriod, (this.effectiveDatePeriod!= null));
        }
        {
            BusinessDocumentReferenceType thePreviousNotification;
            thePreviousNotification = this.getPreviousNotification();
            strategy.appendField(locator, this, "previousNotification", buffer, thePreviousNotification, (this.previousNotification!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
