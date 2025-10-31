
package io.dscope.rosettanet.domain.procurement.procurement.v02_23;

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
import io.dscope.rosettanet.domain.procurement.codelist.forecastevent.v01_03.ForecastEvent;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_11.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_05.FinancialAmountType;
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
 * <p>Java class for ProductForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03}ForecastEvent" minOccurs="0"/&gt;
 *         &lt;element name="FrozenZone" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23}ProductFamilyReporting"/&gt;
 *         &lt;element name="ProductForecastIdentifier" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23}ForecastIdentifierReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductForecastRevision" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.11}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23}ProductReceiptReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TradeOffZone" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.05}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductForecastType", propOrder = {
    "forecastEvent",
    "frozenZone",
    "productFamilyReporting",
    "productForecastIdentifier",
    "productForecastRevision",
    "productReceiptReference",
    "tradeOffZone",
    "unitOfMeasure",
    "unitPrice"
})
public class ProductForecastType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ForecastEvent", namespace = "urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03", type = ForecastEvent.class, required = false)
    protected ForecastEvent forecastEvent;
    @XmlElement(name = "FrozenZone")
    protected DatePeriodType frozenZone;
    @XmlElementRef(name = "ProductFamilyReporting", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23", type = ProductFamilyReporting.class)
    protected ProductFamilyReporting productFamilyReporting;
    @XmlElement(name = "ProductForecastIdentifier")
    protected List<ForecastIdentifierReferenceType> productForecastIdentifier;
    @XmlElement(name = "ProductForecastRevision")
    protected BusinessDocumentReferenceType productForecastRevision;
    @XmlElementRef(name = "ProductReceiptReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23", type = ProductReceiptReference.class, required = false)
    protected List<ProductReceiptReference> productReceiptReference;
    @XmlElement(name = "TradeOffZone")
    protected DatePeriodType tradeOffZone;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "UnitPrice")
    protected FinancialAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the forecastEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastEvent }
     *     
     */
    public ForecastEvent getForecastEvent() {
        return forecastEvent;
    }

    /**
     * Sets the value of the forecastEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastEvent }
     *     
     */
    public void setForecastEvent(ForecastEvent value) {
        this.forecastEvent = value;
    }

    /**
     * Gets the value of the frozenZone property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getFrozenZone() {
        return frozenZone;
    }

    /**
     * Sets the value of the frozenZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setFrozenZone(DatePeriodType value) {
        this.frozenZone = value;
    }

    /**
     * Gets the value of the productFamilyReporting property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFamilyReporting }
     *     
     */
    public ProductFamilyReporting getProductFamilyReporting() {
        return productFamilyReporting;
    }

    /**
     * Sets the value of the productFamilyReporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFamilyReporting }
     *     
     */
    public void setProductFamilyReporting(ProductFamilyReporting value) {
        this.productFamilyReporting = value;
    }

    /**
     * Gets the value of the productForecastIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productForecastIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductForecastIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastIdentifierReferenceType }
     * 
     * 
     */
    public List<ForecastIdentifierReferenceType> getProductForecastIdentifier() {
        if (productForecastIdentifier == null) {
            productForecastIdentifier = new ArrayList<ForecastIdentifierReferenceType>();
        }
        return this.productForecastIdentifier;
    }

    /**
     * Gets the value of the productForecastRevision property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getProductForecastRevision() {
        return productForecastRevision;
    }

    /**
     * Sets the value of the productForecastRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setProductForecastRevision(BusinessDocumentReferenceType value) {
        this.productForecastRevision = value;
    }

    /**
     * Gets the value of the productReceiptReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productReceiptReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductReceiptReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductReceiptReference }
     * 
     * 
     */
    public List<ProductReceiptReference> getProductReceiptReference() {
        if (productReceiptReference == null) {
            productReceiptReference = new ArrayList<ProductReceiptReference>();
        }
        return this.productReceiptReference;
    }

    /**
     * Gets the value of the tradeOffZone property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getTradeOffZone() {
        return tradeOffZone;
    }

    /**
     * Sets the value of the tradeOffZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setTradeOffZone(DatePeriodType value) {
        this.tradeOffZone = value;
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
        final ProductForecastType that = ((ProductForecastType) object);
        {
            ForecastEvent lhsForecastEvent;
            lhsForecastEvent = this.getForecastEvent();
            ForecastEvent rhsForecastEvent;
            rhsForecastEvent = that.getForecastEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastEvent", lhsForecastEvent), LocatorUtils.property(thatLocator, "forecastEvent", rhsForecastEvent), lhsForecastEvent, rhsForecastEvent, (this.forecastEvent!= null), (that.forecastEvent!= null))) {
                return false;
            }
        }
        {
            DatePeriodType lhsFrozenZone;
            lhsFrozenZone = this.getFrozenZone();
            DatePeriodType rhsFrozenZone;
            rhsFrozenZone = that.getFrozenZone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frozenZone", lhsFrozenZone), LocatorUtils.property(thatLocator, "frozenZone", rhsFrozenZone), lhsFrozenZone, rhsFrozenZone, (this.frozenZone!= null), (that.frozenZone!= null))) {
                return false;
            }
        }
        {
            ProductFamilyReporting lhsProductFamilyReporting;
            lhsProductFamilyReporting = this.getProductFamilyReporting();
            ProductFamilyReporting rhsProductFamilyReporting;
            rhsProductFamilyReporting = that.getProductFamilyReporting();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productFamilyReporting", lhsProductFamilyReporting), LocatorUtils.property(thatLocator, "productFamilyReporting", rhsProductFamilyReporting), lhsProductFamilyReporting, rhsProductFamilyReporting, (this.productFamilyReporting!= null), (that.productFamilyReporting!= null))) {
                return false;
            }
        }
        {
            List<ForecastIdentifierReferenceType> lhsProductForecastIdentifier;
            lhsProductForecastIdentifier = (((this.productForecastIdentifier!= null)&&(!this.productForecastIdentifier.isEmpty()))?this.getProductForecastIdentifier():null);
            List<ForecastIdentifierReferenceType> rhsProductForecastIdentifier;
            rhsProductForecastIdentifier = (((that.productForecastIdentifier!= null)&&(!that.productForecastIdentifier.isEmpty()))?that.getProductForecastIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productForecastIdentifier", lhsProductForecastIdentifier), LocatorUtils.property(thatLocator, "productForecastIdentifier", rhsProductForecastIdentifier), lhsProductForecastIdentifier, rhsProductForecastIdentifier, ((this.productForecastIdentifier!= null)&&(!this.productForecastIdentifier.isEmpty())), ((that.productForecastIdentifier!= null)&&(!that.productForecastIdentifier.isEmpty())))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsProductForecastRevision;
            lhsProductForecastRevision = this.getProductForecastRevision();
            BusinessDocumentReferenceType rhsProductForecastRevision;
            rhsProductForecastRevision = that.getProductForecastRevision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productForecastRevision", lhsProductForecastRevision), LocatorUtils.property(thatLocator, "productForecastRevision", rhsProductForecastRevision), lhsProductForecastRevision, rhsProductForecastRevision, (this.productForecastRevision!= null), (that.productForecastRevision!= null))) {
                return false;
            }
        }
        {
            List<ProductReceiptReference> lhsProductReceiptReference;
            lhsProductReceiptReference = (((this.productReceiptReference!= null)&&(!this.productReceiptReference.isEmpty()))?this.getProductReceiptReference():null);
            List<ProductReceiptReference> rhsProductReceiptReference;
            rhsProductReceiptReference = (((that.productReceiptReference!= null)&&(!that.productReceiptReference.isEmpty()))?that.getProductReceiptReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productReceiptReference", lhsProductReceiptReference), LocatorUtils.property(thatLocator, "productReceiptReference", rhsProductReceiptReference), lhsProductReceiptReference, rhsProductReceiptReference, ((this.productReceiptReference!= null)&&(!this.productReceiptReference.isEmpty())), ((that.productReceiptReference!= null)&&(!that.productReceiptReference.isEmpty())))) {
                return false;
            }
        }
        {
            DatePeriodType lhsTradeOffZone;
            lhsTradeOffZone = this.getTradeOffZone();
            DatePeriodType rhsTradeOffZone;
            rhsTradeOffZone = that.getTradeOffZone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tradeOffZone", lhsTradeOffZone), LocatorUtils.property(thatLocator, "tradeOffZone", rhsTradeOffZone), lhsTradeOffZone, rhsTradeOffZone, (this.tradeOffZone!= null), (that.tradeOffZone!= null))) {
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
            ForecastEvent theForecastEvent;
            theForecastEvent = this.getForecastEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastEvent", theForecastEvent), currentHashCode, theForecastEvent, (this.forecastEvent!= null));
        }
        {
            DatePeriodType theFrozenZone;
            theFrozenZone = this.getFrozenZone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frozenZone", theFrozenZone), currentHashCode, theFrozenZone, (this.frozenZone!= null));
        }
        {
            ProductFamilyReporting theProductFamilyReporting;
            theProductFamilyReporting = this.getProductFamilyReporting();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productFamilyReporting", theProductFamilyReporting), currentHashCode, theProductFamilyReporting, (this.productFamilyReporting!= null));
        }
        {
            List<ForecastIdentifierReferenceType> theProductForecastIdentifier;
            theProductForecastIdentifier = (((this.productForecastIdentifier!= null)&&(!this.productForecastIdentifier.isEmpty()))?this.getProductForecastIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productForecastIdentifier", theProductForecastIdentifier), currentHashCode, theProductForecastIdentifier, ((this.productForecastIdentifier!= null)&&(!this.productForecastIdentifier.isEmpty())));
        }
        {
            BusinessDocumentReferenceType theProductForecastRevision;
            theProductForecastRevision = this.getProductForecastRevision();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productForecastRevision", theProductForecastRevision), currentHashCode, theProductForecastRevision, (this.productForecastRevision!= null));
        }
        {
            List<ProductReceiptReference> theProductReceiptReference;
            theProductReceiptReference = (((this.productReceiptReference!= null)&&(!this.productReceiptReference.isEmpty()))?this.getProductReceiptReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productReceiptReference", theProductReceiptReference), currentHashCode, theProductReceiptReference, ((this.productReceiptReference!= null)&&(!this.productReceiptReference.isEmpty())));
        }
        {
            DatePeriodType theTradeOffZone;
            theTradeOffZone = this.getTradeOffZone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tradeOffZone", theTradeOffZone), currentHashCode, theTradeOffZone, (this.tradeOffZone!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
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
            ForecastEvent theForecastEvent;
            theForecastEvent = this.getForecastEvent();
            strategy.appendField(locator, this, "forecastEvent", buffer, theForecastEvent, (this.forecastEvent!= null));
        }
        {
            DatePeriodType theFrozenZone;
            theFrozenZone = this.getFrozenZone();
            strategy.appendField(locator, this, "frozenZone", buffer, theFrozenZone, (this.frozenZone!= null));
        }
        {
            ProductFamilyReporting theProductFamilyReporting;
            theProductFamilyReporting = this.getProductFamilyReporting();
            strategy.appendField(locator, this, "productFamilyReporting", buffer, theProductFamilyReporting, (this.productFamilyReporting!= null));
        }
        {
            List<ForecastIdentifierReferenceType> theProductForecastIdentifier;
            theProductForecastIdentifier = (((this.productForecastIdentifier!= null)&&(!this.productForecastIdentifier.isEmpty()))?this.getProductForecastIdentifier():null);
            strategy.appendField(locator, this, "productForecastIdentifier", buffer, theProductForecastIdentifier, ((this.productForecastIdentifier!= null)&&(!this.productForecastIdentifier.isEmpty())));
        }
        {
            BusinessDocumentReferenceType theProductForecastRevision;
            theProductForecastRevision = this.getProductForecastRevision();
            strategy.appendField(locator, this, "productForecastRevision", buffer, theProductForecastRevision, (this.productForecastRevision!= null));
        }
        {
            List<ProductReceiptReference> theProductReceiptReference;
            theProductReceiptReference = (((this.productReceiptReference!= null)&&(!this.productReceiptReference.isEmpty()))?this.getProductReceiptReference():null);
            strategy.appendField(locator, this, "productReceiptReference", buffer, theProductReceiptReference, ((this.productReceiptReference!= null)&&(!this.productReceiptReference.isEmpty())));
        }
        {
            DatePeriodType theTradeOffZone;
            theTradeOffZone = this.getTradeOffZone();
            strategy.appendField(locator, this, "tradeOffZone", buffer, theTradeOffZone, (this.tradeOffZone!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
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
