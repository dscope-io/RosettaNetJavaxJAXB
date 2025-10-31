
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

import java.math.BigDecimal;
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
import javax.xml.datatype.Duration;
import io.dscope.rosettanet.domain.design.codelist.abccode.v01_02.ABCCode;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductLeadTime;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
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
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dabcc="urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02" xmlns:dalc="urn:rosettanet:specification:domain:Design:AssemblyLevelCode:xsd:codelist:01.01" xmlns:dds="urn:rosettanet:specification:domain:Design:xsd:schema:02.15" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17" xmlns:dppt="urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03" xmlns:p841174_="http://annox.dev.java.net" xmlns:p861132_="http://java.sun.com/xml/ns/jaxb" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.10" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16" xmlns:tns="urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.03" xmlns:udt="urn:rosettanet:specification:universal:DataType:xsd:schema:01.04" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductProcurement, if the value of IsOnAllocation is equal to false then the occurence of ProductLeadTime MUST be between 1 and unbounded.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductProcurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductProcurementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02}ABCCode" minOccurs="0"/&gt;
 *         &lt;element name="ChangeOrderWindow" type="{urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00}ChangeOrderWindowType" minOccurs="0"/&gt;
 *         &lt;element name="IsAvailableToOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsOnAllocation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsWaiverRequiredToOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OrderingAvailabilityDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="OrderPolicy" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="OrderProvision" type="{urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00}OrderProvisionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductLeadTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03}ProductProcurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ScrapPercentage" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductProcurementType", propOrder = {
    "abcCode",
    "changeOrderWindow",
    "isAvailableToOrder",
    "isOnAllocation",
    "isWaiverRequiredToOrder",
    "orderingAvailabilityDate",
    "orderPolicy",
    "orderProvision",
    "productLeadTime",
    "productProcurementType",
    "scrapPercentage"
})
public class ProductProcurementType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ABCCode", namespace = "urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02", type = ABCCode.class, required = false)
    protected ABCCode abcCode;
    @XmlElement(name = "ChangeOrderWindow")
    protected ChangeOrderWindowType changeOrderWindow;
    @XmlElement(name = "IsAvailableToOrder")
    protected boolean isAvailableToOrder;
    @XmlElement(name = "IsOnAllocation")
    protected boolean isOnAllocation;
    @XmlElement(name = "IsWaiverRequiredToOrder")
    protected boolean isWaiverRequiredToOrder;
    @XmlElement(name = "OrderingAvailabilityDate")
    protected DatePeriodType orderingAvailabilityDate;
    @XmlElement(name = "OrderPolicy")
    protected Duration orderPolicy;
    @XmlElement(name = "OrderProvision")
    protected OrderProvisionType orderProvision;
    @XmlElementRef(name = "ProductLeadTime", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ProductLeadTime.class, required = false)
    protected List<ProductLeadTime> productLeadTime;
    @XmlElementRef(name = "ProductProcurementType", namespace = "urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03", type = io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType.class, required = false)
    protected List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> productProcurementType;
    @XmlElement(name = "ScrapPercentage")
    protected BigDecimal scrapPercentage;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the abcCode property.
     * 
     * @return
     *     possible object is
     *     {@link ABCCode }
     *     
     */
    public ABCCode getABCCode() {
        return abcCode;
    }

    /**
     * Sets the value of the abcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ABCCode }
     *     
     */
    public void setABCCode(ABCCode value) {
        this.abcCode = value;
    }

    /**
     * Gets the value of the changeOrderWindow property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeOrderWindowType }
     *     
     */
    public ChangeOrderWindowType getChangeOrderWindow() {
        return changeOrderWindow;
    }

    /**
     * Sets the value of the changeOrderWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeOrderWindowType }
     *     
     */
    public void setChangeOrderWindow(ChangeOrderWindowType value) {
        this.changeOrderWindow = value;
    }

    /**
     * Gets the value of the isAvailableToOrder property.
     * 
     */
    public boolean isIsAvailableToOrder() {
        return isAvailableToOrder;
    }

    /**
     * Sets the value of the isAvailableToOrder property.
     * 
     */
    public void setIsAvailableToOrder(boolean value) {
        this.isAvailableToOrder = value;
    }

    /**
     * Gets the value of the isOnAllocation property.
     * 
     */
    public boolean isIsOnAllocation() {
        return isOnAllocation;
    }

    /**
     * Sets the value of the isOnAllocation property.
     * 
     */
    public void setIsOnAllocation(boolean value) {
        this.isOnAllocation = value;
    }

    /**
     * Gets the value of the isWaiverRequiredToOrder property.
     * 
     */
    public boolean isIsWaiverRequiredToOrder() {
        return isWaiverRequiredToOrder;
    }

    /**
     * Sets the value of the isWaiverRequiredToOrder property.
     * 
     */
    public void setIsWaiverRequiredToOrder(boolean value) {
        this.isWaiverRequiredToOrder = value;
    }

    /**
     * Gets the value of the orderingAvailabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getOrderingAvailabilityDate() {
        return orderingAvailabilityDate;
    }

    /**
     * Sets the value of the orderingAvailabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setOrderingAvailabilityDate(DatePeriodType value) {
        this.orderingAvailabilityDate = value;
    }

    /**
     * Gets the value of the orderPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOrderPolicy() {
        return orderPolicy;
    }

    /**
     * Sets the value of the orderPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOrderPolicy(Duration value) {
        this.orderPolicy = value;
    }

    /**
     * Gets the value of the orderProvision property.
     * 
     * @return
     *     possible object is
     *     {@link OrderProvisionType }
     *     
     */
    public OrderProvisionType getOrderProvision() {
        return orderProvision;
    }

    /**
     * Sets the value of the orderProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderProvisionType }
     *     
     */
    public void setOrderProvision(OrderProvisionType value) {
        this.orderProvision = value;
    }

    /**
     * Gets the value of the productLeadTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLeadTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLeadTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLeadTime }
     * 
     * 
     */
    public List<ProductLeadTime> getProductLeadTime() {
        if (productLeadTime == null) {
            productLeadTime = new ArrayList<ProductLeadTime>();
        }
        return this.productLeadTime;
    }

    /**
     * Gets the value of the productProcurementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productProcurementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductProcurementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType }
     * 
     * 
     */
    public List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> getProductProcurementType() {
        if (productProcurementType == null) {
            productProcurementType = new ArrayList<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType>();
        }
        return this.productProcurementType;
    }

    /**
     * Gets the value of the scrapPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScrapPercentage() {
        return scrapPercentage;
    }

    /**
     * Sets the value of the scrapPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScrapPercentage(BigDecimal value) {
        this.scrapPercentage = value;
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
        final ProductProcurementType that = ((ProductProcurementType) object);
        {
            ABCCode lhsABCCode;
            lhsABCCode = this.getABCCode();
            ABCCode rhsABCCode;
            rhsABCCode = that.getABCCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abcCode", lhsABCCode), LocatorUtils.property(thatLocator, "abcCode", rhsABCCode), lhsABCCode, rhsABCCode, (this.abcCode!= null), (that.abcCode!= null))) {
                return false;
            }
        }
        {
            ChangeOrderWindowType lhsChangeOrderWindow;
            lhsChangeOrderWindow = this.getChangeOrderWindow();
            ChangeOrderWindowType rhsChangeOrderWindow;
            rhsChangeOrderWindow = that.getChangeOrderWindow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeOrderWindow", lhsChangeOrderWindow), LocatorUtils.property(thatLocator, "changeOrderWindow", rhsChangeOrderWindow), lhsChangeOrderWindow, rhsChangeOrderWindow, (this.changeOrderWindow!= null), (that.changeOrderWindow!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsAvailableToOrder;
            lhsIsAvailableToOrder = this.isIsAvailableToOrder();
            boolean rhsIsAvailableToOrder;
            rhsIsAvailableToOrder = that.isIsAvailableToOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isAvailableToOrder", lhsIsAvailableToOrder), LocatorUtils.property(thatLocator, "isAvailableToOrder", rhsIsAvailableToOrder), lhsIsAvailableToOrder, rhsIsAvailableToOrder, true, true)) {
                return false;
            }
        }
        {
            boolean lhsIsOnAllocation;
            lhsIsOnAllocation = this.isIsOnAllocation();
            boolean rhsIsOnAllocation;
            rhsIsOnAllocation = that.isIsOnAllocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isOnAllocation", lhsIsOnAllocation), LocatorUtils.property(thatLocator, "isOnAllocation", rhsIsOnAllocation), lhsIsOnAllocation, rhsIsOnAllocation, true, true)) {
                return false;
            }
        }
        {
            boolean lhsIsWaiverRequiredToOrder;
            lhsIsWaiverRequiredToOrder = this.isIsWaiverRequiredToOrder();
            boolean rhsIsWaiverRequiredToOrder;
            rhsIsWaiverRequiredToOrder = that.isIsWaiverRequiredToOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isWaiverRequiredToOrder", lhsIsWaiverRequiredToOrder), LocatorUtils.property(thatLocator, "isWaiverRequiredToOrder", rhsIsWaiverRequiredToOrder), lhsIsWaiverRequiredToOrder, rhsIsWaiverRequiredToOrder, true, true)) {
                return false;
            }
        }
        {
            DatePeriodType lhsOrderingAvailabilityDate;
            lhsOrderingAvailabilityDate = this.getOrderingAvailabilityDate();
            DatePeriodType rhsOrderingAvailabilityDate;
            rhsOrderingAvailabilityDate = that.getOrderingAvailabilityDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderingAvailabilityDate", lhsOrderingAvailabilityDate), LocatorUtils.property(thatLocator, "orderingAvailabilityDate", rhsOrderingAvailabilityDate), lhsOrderingAvailabilityDate, rhsOrderingAvailabilityDate, (this.orderingAvailabilityDate!= null), (that.orderingAvailabilityDate!= null))) {
                return false;
            }
        }
        {
            Duration lhsOrderPolicy;
            lhsOrderPolicy = this.getOrderPolicy();
            Duration rhsOrderPolicy;
            rhsOrderPolicy = that.getOrderPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderPolicy", lhsOrderPolicy), LocatorUtils.property(thatLocator, "orderPolicy", rhsOrderPolicy), lhsOrderPolicy, rhsOrderPolicy, (this.orderPolicy!= null), (that.orderPolicy!= null))) {
                return false;
            }
        }
        {
            OrderProvisionType lhsOrderProvision;
            lhsOrderProvision = this.getOrderProvision();
            OrderProvisionType rhsOrderProvision;
            rhsOrderProvision = that.getOrderProvision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderProvision", lhsOrderProvision), LocatorUtils.property(thatLocator, "orderProvision", rhsOrderProvision), lhsOrderProvision, rhsOrderProvision, (this.orderProvision!= null), (that.orderProvision!= null))) {
                return false;
            }
        }
        {
            List<ProductLeadTime> lhsProductLeadTime;
            lhsProductLeadTime = (((this.productLeadTime!= null)&&(!this.productLeadTime.isEmpty()))?this.getProductLeadTime():null);
            List<ProductLeadTime> rhsProductLeadTime;
            rhsProductLeadTime = (((that.productLeadTime!= null)&&(!that.productLeadTime.isEmpty()))?that.getProductLeadTime():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productLeadTime", lhsProductLeadTime), LocatorUtils.property(thatLocator, "productLeadTime", rhsProductLeadTime), lhsProductLeadTime, rhsProductLeadTime, ((this.productLeadTime!= null)&&(!this.productLeadTime.isEmpty())), ((that.productLeadTime!= null)&&(!that.productLeadTime.isEmpty())))) {
                return false;
            }
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> lhsProductProcurementType;
            lhsProductProcurementType = (((this.productProcurementType!= null)&&(!this.productProcurementType.isEmpty()))?this.getProductProcurementType():null);
            List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> rhsProductProcurementType;
            rhsProductProcurementType = (((that.productProcurementType!= null)&&(!that.productProcurementType.isEmpty()))?that.getProductProcurementType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productProcurementType", lhsProductProcurementType), LocatorUtils.property(thatLocator, "productProcurementType", rhsProductProcurementType), lhsProductProcurementType, rhsProductProcurementType, ((this.productProcurementType!= null)&&(!this.productProcurementType.isEmpty())), ((that.productProcurementType!= null)&&(!that.productProcurementType.isEmpty())))) {
                return false;
            }
        }
        {
            BigDecimal lhsScrapPercentage;
            lhsScrapPercentage = this.getScrapPercentage();
            BigDecimal rhsScrapPercentage;
            rhsScrapPercentage = that.getScrapPercentage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scrapPercentage", lhsScrapPercentage), LocatorUtils.property(thatLocator, "scrapPercentage", rhsScrapPercentage), lhsScrapPercentage, rhsScrapPercentage, (this.scrapPercentage!= null), (that.scrapPercentage!= null))) {
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
            ABCCode theABCCode;
            theABCCode = this.getABCCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abcCode", theABCCode), currentHashCode, theABCCode, (this.abcCode!= null));
        }
        {
            ChangeOrderWindowType theChangeOrderWindow;
            theChangeOrderWindow = this.getChangeOrderWindow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeOrderWindow", theChangeOrderWindow), currentHashCode, theChangeOrderWindow, (this.changeOrderWindow!= null));
        }
        {
            boolean theIsAvailableToOrder;
            theIsAvailableToOrder = this.isIsAvailableToOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isAvailableToOrder", theIsAvailableToOrder), currentHashCode, theIsAvailableToOrder, true);
        }
        {
            boolean theIsOnAllocation;
            theIsOnAllocation = this.isIsOnAllocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isOnAllocation", theIsOnAllocation), currentHashCode, theIsOnAllocation, true);
        }
        {
            boolean theIsWaiverRequiredToOrder;
            theIsWaiverRequiredToOrder = this.isIsWaiverRequiredToOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isWaiverRequiredToOrder", theIsWaiverRequiredToOrder), currentHashCode, theIsWaiverRequiredToOrder, true);
        }
        {
            DatePeriodType theOrderingAvailabilityDate;
            theOrderingAvailabilityDate = this.getOrderingAvailabilityDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderingAvailabilityDate", theOrderingAvailabilityDate), currentHashCode, theOrderingAvailabilityDate, (this.orderingAvailabilityDate!= null));
        }
        {
            Duration theOrderPolicy;
            theOrderPolicy = this.getOrderPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderPolicy", theOrderPolicy), currentHashCode, theOrderPolicy, (this.orderPolicy!= null));
        }
        {
            OrderProvisionType theOrderProvision;
            theOrderProvision = this.getOrderProvision();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderProvision", theOrderProvision), currentHashCode, theOrderProvision, (this.orderProvision!= null));
        }
        {
            List<ProductLeadTime> theProductLeadTime;
            theProductLeadTime = (((this.productLeadTime!= null)&&(!this.productLeadTime.isEmpty()))?this.getProductLeadTime():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLeadTime", theProductLeadTime), currentHashCode, theProductLeadTime, ((this.productLeadTime!= null)&&(!this.productLeadTime.isEmpty())));
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> theProductProcurementType;
            theProductProcurementType = (((this.productProcurementType!= null)&&(!this.productProcurementType.isEmpty()))?this.getProductProcurementType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productProcurementType", theProductProcurementType), currentHashCode, theProductProcurementType, ((this.productProcurementType!= null)&&(!this.productProcurementType.isEmpty())));
        }
        {
            BigDecimal theScrapPercentage;
            theScrapPercentage = this.getScrapPercentage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scrapPercentage", theScrapPercentage), currentHashCode, theScrapPercentage, (this.scrapPercentage!= null));
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
            ABCCode theABCCode;
            theABCCode = this.getABCCode();
            strategy.appendField(locator, this, "abcCode", buffer, theABCCode, (this.abcCode!= null));
        }
        {
            ChangeOrderWindowType theChangeOrderWindow;
            theChangeOrderWindow = this.getChangeOrderWindow();
            strategy.appendField(locator, this, "changeOrderWindow", buffer, theChangeOrderWindow, (this.changeOrderWindow!= null));
        }
        {
            boolean theIsAvailableToOrder;
            theIsAvailableToOrder = this.isIsAvailableToOrder();
            strategy.appendField(locator, this, "isAvailableToOrder", buffer, theIsAvailableToOrder, true);
        }
        {
            boolean theIsOnAllocation;
            theIsOnAllocation = this.isIsOnAllocation();
            strategy.appendField(locator, this, "isOnAllocation", buffer, theIsOnAllocation, true);
        }
        {
            boolean theIsWaiverRequiredToOrder;
            theIsWaiverRequiredToOrder = this.isIsWaiverRequiredToOrder();
            strategy.appendField(locator, this, "isWaiverRequiredToOrder", buffer, theIsWaiverRequiredToOrder, true);
        }
        {
            DatePeriodType theOrderingAvailabilityDate;
            theOrderingAvailabilityDate = this.getOrderingAvailabilityDate();
            strategy.appendField(locator, this, "orderingAvailabilityDate", buffer, theOrderingAvailabilityDate, (this.orderingAvailabilityDate!= null));
        }
        {
            Duration theOrderPolicy;
            theOrderPolicy = this.getOrderPolicy();
            strategy.appendField(locator, this, "orderPolicy", buffer, theOrderPolicy, (this.orderPolicy!= null));
        }
        {
            OrderProvisionType theOrderProvision;
            theOrderProvision = this.getOrderProvision();
            strategy.appendField(locator, this, "orderProvision", buffer, theOrderProvision, (this.orderProvision!= null));
        }
        {
            List<ProductLeadTime> theProductLeadTime;
            theProductLeadTime = (((this.productLeadTime!= null)&&(!this.productLeadTime.isEmpty()))?this.getProductLeadTime():null);
            strategy.appendField(locator, this, "productLeadTime", buffer, theProductLeadTime, ((this.productLeadTime!= null)&&(!this.productLeadTime.isEmpty())));
        }
        {
            List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> theProductProcurementType;
            theProductProcurementType = (((this.productProcurementType!= null)&&(!this.productProcurementType.isEmpty()))?this.getProductProcurementType():null);
            strategy.appendField(locator, this, "productProcurementType", buffer, theProductProcurementType, ((this.productProcurementType!= null)&&(!this.productProcurementType.isEmpty())));
        }
        {
            BigDecimal theScrapPercentage;
            theScrapPercentage = this.getScrapPercentage();
            strategy.appendField(locator, this, "scrapPercentage", buffer, theScrapPercentage, (this.scrapPercentage!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
