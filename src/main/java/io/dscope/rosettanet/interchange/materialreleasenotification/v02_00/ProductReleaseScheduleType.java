
package io.dscope.rosettanet.interchange.materialreleasenotification.v02_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.transportevent.v01_03.TransportEvent;
import io.dscope.rosettanet.domain.shared.shared.v01_10.ProductQuantity;
import io.dscope.rosettanet.universal.monetaryexpression.v01_04.FinancialAmountType;
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
 * <p>Java class for ProductReleaseScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductReleaseScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JustInTimeSchedule" type="{urn:rosettanet:specification:interchange:MaterialReleaseNotification:xsd:schema:02.00}JustInTimeScheduleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaterialReleaseDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantity"/&gt;
 *         &lt;element name="ReleaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03}TransportEvent"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.04}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductReleaseScheduleType", propOrder = {
    "justInTimeSchedule",
    "materialReleaseDate",
    "productQuantity",
    "releaseNumber",
    "transportEvent",
    "unitPrice"
})
public class ProductReleaseScheduleType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "JustInTimeSchedule")
    protected List<JustInTimeScheduleType> justInTimeSchedule;
    @XmlElement(name = "MaterialReleaseDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar materialReleaseDate;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlElement(name = "ReleaseNumber")
    protected String releaseNumber;
    @XmlElementRef(name = "TransportEvent", namespace = "urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03", type = TransportEvent.class)
    protected TransportEvent transportEvent;
    @XmlElement(name = "UnitPrice")
    protected FinancialAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the justInTimeSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the justInTimeSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJustInTimeSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JustInTimeScheduleType }
     * 
     * 
     */
    public List<JustInTimeScheduleType> getJustInTimeSchedule() {
        if (justInTimeSchedule == null) {
            justInTimeSchedule = new ArrayList<JustInTimeScheduleType>();
        }
        return this.justInTimeSchedule;
    }

    /**
     * Gets the value of the materialReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaterialReleaseDate() {
        return materialReleaseDate;
    }

    /**
     * Sets the value of the materialReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaterialReleaseDate(XMLGregorianCalendar value) {
        this.materialReleaseDate = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the releaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseNumber() {
        return releaseNumber;
    }

    /**
     * Sets the value of the releaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseNumber(String value) {
        this.releaseNumber = value;
    }

    /**
     * Gets the value of the transportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEvent }
     *     
     */
    public TransportEvent getTransportEvent() {
        return transportEvent;
    }

    /**
     * Sets the value of the transportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEvent }
     *     
     */
    public void setTransportEvent(TransportEvent value) {
        this.transportEvent = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setUnitPrice(FinancialAmountType value) {
        this.unitPrice = value;
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
        final ProductReleaseScheduleType that = ((ProductReleaseScheduleType) object);
        {
            List<JustInTimeScheduleType> lhsJustInTimeSchedule;
            lhsJustInTimeSchedule = (((this.justInTimeSchedule!= null)&&(!this.justInTimeSchedule.isEmpty()))?this.getJustInTimeSchedule():null);
            List<JustInTimeScheduleType> rhsJustInTimeSchedule;
            rhsJustInTimeSchedule = (((that.justInTimeSchedule!= null)&&(!that.justInTimeSchedule.isEmpty()))?that.getJustInTimeSchedule():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "justInTimeSchedule", lhsJustInTimeSchedule), LocatorUtils.property(thatLocator, "justInTimeSchedule", rhsJustInTimeSchedule), lhsJustInTimeSchedule, rhsJustInTimeSchedule, ((this.justInTimeSchedule!= null)&&(!this.justInTimeSchedule.isEmpty())), ((that.justInTimeSchedule!= null)&&(!that.justInTimeSchedule.isEmpty())))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsMaterialReleaseDate;
            lhsMaterialReleaseDate = this.getMaterialReleaseDate();
            XMLGregorianCalendar rhsMaterialReleaseDate;
            rhsMaterialReleaseDate = that.getMaterialReleaseDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "materialReleaseDate", lhsMaterialReleaseDate), LocatorUtils.property(thatLocator, "materialReleaseDate", rhsMaterialReleaseDate), lhsMaterialReleaseDate, rhsMaterialReleaseDate, (this.materialReleaseDate!= null), (that.materialReleaseDate!= null))) {
                return false;
            }
        }
        {
            ProductQuantity lhsProductQuantity;
            lhsProductQuantity = this.getProductQuantity();
            ProductQuantity rhsProductQuantity;
            rhsProductQuantity = that.getProductQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productQuantity", lhsProductQuantity), LocatorUtils.property(thatLocator, "productQuantity", rhsProductQuantity), lhsProductQuantity, rhsProductQuantity, (this.productQuantity!= null), (that.productQuantity!= null))) {
                return false;
            }
        }
        {
            String lhsReleaseNumber;
            lhsReleaseNumber = this.getReleaseNumber();
            String rhsReleaseNumber;
            rhsReleaseNumber = that.getReleaseNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "releaseNumber", lhsReleaseNumber), LocatorUtils.property(thatLocator, "releaseNumber", rhsReleaseNumber), lhsReleaseNumber, rhsReleaseNumber, (this.releaseNumber!= null), (that.releaseNumber!= null))) {
                return false;
            }
        }
        {
            TransportEvent lhsTransportEvent;
            lhsTransportEvent = this.getTransportEvent();
            TransportEvent rhsTransportEvent;
            rhsTransportEvent = that.getTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportEvent", lhsTransportEvent), LocatorUtils.property(thatLocator, "transportEvent", rhsTransportEvent), lhsTransportEvent, rhsTransportEvent, (this.transportEvent!= null), (that.transportEvent!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsUnitPrice;
            lhsUnitPrice = this.getUnitPrice();
            FinancialAmountType rhsUnitPrice;
            rhsUnitPrice = that.getUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitPrice", lhsUnitPrice), LocatorUtils.property(thatLocator, "unitPrice", rhsUnitPrice), lhsUnitPrice, rhsUnitPrice, (this.unitPrice!= null), (that.unitPrice!= null))) {
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
            List<JustInTimeScheduleType> theJustInTimeSchedule;
            theJustInTimeSchedule = (((this.justInTimeSchedule!= null)&&(!this.justInTimeSchedule.isEmpty()))?this.getJustInTimeSchedule():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "justInTimeSchedule", theJustInTimeSchedule), currentHashCode, theJustInTimeSchedule, ((this.justInTimeSchedule!= null)&&(!this.justInTimeSchedule.isEmpty())));
        }
        {
            XMLGregorianCalendar theMaterialReleaseDate;
            theMaterialReleaseDate = this.getMaterialReleaseDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "materialReleaseDate", theMaterialReleaseDate), currentHashCode, theMaterialReleaseDate, (this.materialReleaseDate!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantity", theProductQuantity), currentHashCode, theProductQuantity, (this.productQuantity!= null));
        }
        {
            String theReleaseNumber;
            theReleaseNumber = this.getReleaseNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "releaseNumber", theReleaseNumber), currentHashCode, theReleaseNumber, (this.releaseNumber!= null));
        }
        {
            TransportEvent theTransportEvent;
            theTransportEvent = this.getTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportEvent", theTransportEvent), currentHashCode, theTransportEvent, (this.transportEvent!= null));
        }
        {
            FinancialAmountType theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitPrice", theUnitPrice), currentHashCode, theUnitPrice, (this.unitPrice!= null));
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
            List<JustInTimeScheduleType> theJustInTimeSchedule;
            theJustInTimeSchedule = (((this.justInTimeSchedule!= null)&&(!this.justInTimeSchedule.isEmpty()))?this.getJustInTimeSchedule():null);
            strategy.appendField(locator, this, "justInTimeSchedule", buffer, theJustInTimeSchedule, ((this.justInTimeSchedule!= null)&&(!this.justInTimeSchedule.isEmpty())));
        }
        {
            XMLGregorianCalendar theMaterialReleaseDate;
            theMaterialReleaseDate = this.getMaterialReleaseDate();
            strategy.appendField(locator, this, "materialReleaseDate", buffer, theMaterialReleaseDate, (this.materialReleaseDate!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            strategy.appendField(locator, this, "productQuantity", buffer, theProductQuantity, (this.productQuantity!= null));
        }
        {
            String theReleaseNumber;
            theReleaseNumber = this.getReleaseNumber();
            strategy.appendField(locator, this, "releaseNumber", buffer, theReleaseNumber, (this.releaseNumber!= null));
        }
        {
            TransportEvent theTransportEvent;
            theTransportEvent = this.getTransportEvent();
            strategy.appendField(locator, this, "transportEvent", buffer, theTransportEvent, (this.transportEvent!= null));
        }
        {
            FinancialAmountType theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            strategy.appendField(locator, this, "unitPrice", buffer, theUnitPrice, (this.unitPrice!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
