
package io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02.ServiceDeliveryMethodType;
import io.dscope.rosettanet.domain.service.codelist.warrantymethod.v01_02.WarrantyMethod;
import io.dscope.rosettanet.domain.service.codelist.warrantyprogram.v01_02.WarrantyProgram;
import io.dscope.rosettanet.domain.service.service.v02_20.ReimbursementInformation;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;
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
 * <p>Java class for EventInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsRequestedDeliveryMethodAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecommendedDeliveryMethod" type="{urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02}ServiceDeliveryMethodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}ReimbursementInformation" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDeliveryMethod" type="{urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02}ServiceDeliveryMethodType" minOccurs="0"/&gt;
 *         &lt;element name="TotalReimbursement" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:WarrantyMethod:xsd:codelist:01.02}WarrantyMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:WarrantyProgram:xsd:codelist:01.02}WarrantyProgram" minOccurs="0"/&gt;
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
@XmlType(name = "EventInformationType", propOrder = {
    "isRequestedDeliveryMethodAllowed",
    "recommendedDeliveryMethod",
    "reimbursementInformation",
    "requestedDeliveryMethod",
    "totalReimbursement",
    "warrantyMethod",
    "warrantyProgram"
})
public class EventInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "IsRequestedDeliveryMethodAllowed")
    protected Boolean isRequestedDeliveryMethodAllowed;
    @XmlElement(name = "RecommendedDeliveryMethod")
    protected ServiceDeliveryMethodType recommendedDeliveryMethod;
    @XmlElementRef(name = "ReimbursementInformation", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = ReimbursementInformation.class, required = false)
    protected ReimbursementInformation reimbursementInformation;
    @XmlElement(name = "RequestedDeliveryMethod")
    protected ServiceDeliveryMethodType requestedDeliveryMethod;
    @XmlElement(name = "TotalReimbursement")
    protected FinancialAmountType totalReimbursement;
    @XmlElementRef(name = "WarrantyMethod", namespace = "urn:rosettanet:specification:domain:Service:WarrantyMethod:xsd:codelist:01.02", type = WarrantyMethod.class, required = false)
    protected WarrantyMethod warrantyMethod;
    @XmlElementRef(name = "WarrantyProgram", namespace = "urn:rosettanet:specification:domain:Service:WarrantyProgram:xsd:codelist:01.02", type = WarrantyProgram.class, required = false)
    protected WarrantyProgram warrantyProgram;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isRequestedDeliveryMethodAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequestedDeliveryMethodAllowed() {
        return isRequestedDeliveryMethodAllowed;
    }

    /**
     * Sets the value of the isRequestedDeliveryMethodAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequestedDeliveryMethodAllowed(Boolean value) {
        this.isRequestedDeliveryMethodAllowed = value;
    }

    /**
     * Gets the value of the recommendedDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public ServiceDeliveryMethodType getRecommendedDeliveryMethod() {
        return recommendedDeliveryMethod;
    }

    /**
     * Sets the value of the recommendedDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public void setRecommendedDeliveryMethod(ServiceDeliveryMethodType value) {
        this.recommendedDeliveryMethod = value;
    }

    /**
     * Gets the value of the reimbursementInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReimbursementInformation }
     *     
     */
    public ReimbursementInformation getReimbursementInformation() {
        return reimbursementInformation;
    }

    /**
     * Sets the value of the reimbursementInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReimbursementInformation }
     *     
     */
    public void setReimbursementInformation(ReimbursementInformation value) {
        this.reimbursementInformation = value;
    }

    /**
     * Gets the value of the requestedDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public ServiceDeliveryMethodType getRequestedDeliveryMethod() {
        return requestedDeliveryMethod;
    }

    /**
     * Sets the value of the requestedDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public void setRequestedDeliveryMethod(ServiceDeliveryMethodType value) {
        this.requestedDeliveryMethod = value;
    }

    /**
     * Gets the value of the totalReimbursement property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalReimbursement() {
        return totalReimbursement;
    }

    /**
     * Sets the value of the totalReimbursement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalReimbursement(FinancialAmountType value) {
        this.totalReimbursement = value;
    }

    /**
     * Gets the value of the warrantyMethod property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyMethod }
     *     
     */
    public WarrantyMethod getWarrantyMethod() {
        return warrantyMethod;
    }

    /**
     * Sets the value of the warrantyMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyMethod }
     *     
     */
    public void setWarrantyMethod(WarrantyMethod value) {
        this.warrantyMethod = value;
    }

    /**
     * Gets the value of the warrantyProgram property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyProgram }
     *     
     */
    public WarrantyProgram getWarrantyProgram() {
        return warrantyProgram;
    }

    /**
     * Sets the value of the warrantyProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyProgram }
     *     
     */
    public void setWarrantyProgram(WarrantyProgram value) {
        this.warrantyProgram = value;
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
        final EventInformationType that = ((EventInformationType) object);
        {
            Boolean lhsIsRequestedDeliveryMethodAllowed;
            lhsIsRequestedDeliveryMethodAllowed = this.isIsRequestedDeliveryMethodAllowed();
            Boolean rhsIsRequestedDeliveryMethodAllowed;
            rhsIsRequestedDeliveryMethodAllowed = that.isIsRequestedDeliveryMethodAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRequestedDeliveryMethodAllowed", lhsIsRequestedDeliveryMethodAllowed), LocatorUtils.property(thatLocator, "isRequestedDeliveryMethodAllowed", rhsIsRequestedDeliveryMethodAllowed), lhsIsRequestedDeliveryMethodAllowed, rhsIsRequestedDeliveryMethodAllowed, (this.isRequestedDeliveryMethodAllowed!= null), (that.isRequestedDeliveryMethodAllowed!= null))) {
                return false;
            }
        }
        {
            ServiceDeliveryMethodType lhsRecommendedDeliveryMethod;
            lhsRecommendedDeliveryMethod = this.getRecommendedDeliveryMethod();
            ServiceDeliveryMethodType rhsRecommendedDeliveryMethod;
            rhsRecommendedDeliveryMethod = that.getRecommendedDeliveryMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recommendedDeliveryMethod", lhsRecommendedDeliveryMethod), LocatorUtils.property(thatLocator, "recommendedDeliveryMethod", rhsRecommendedDeliveryMethod), lhsRecommendedDeliveryMethod, rhsRecommendedDeliveryMethod, (this.recommendedDeliveryMethod!= null), (that.recommendedDeliveryMethod!= null))) {
                return false;
            }
        }
        {
            ReimbursementInformation lhsReimbursementInformation;
            lhsReimbursementInformation = this.getReimbursementInformation();
            ReimbursementInformation rhsReimbursementInformation;
            rhsReimbursementInformation = that.getReimbursementInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reimbursementInformation", lhsReimbursementInformation), LocatorUtils.property(thatLocator, "reimbursementInformation", rhsReimbursementInformation), lhsReimbursementInformation, rhsReimbursementInformation, (this.reimbursementInformation!= null), (that.reimbursementInformation!= null))) {
                return false;
            }
        }
        {
            ServiceDeliveryMethodType lhsRequestedDeliveryMethod;
            lhsRequestedDeliveryMethod = this.getRequestedDeliveryMethod();
            ServiceDeliveryMethodType rhsRequestedDeliveryMethod;
            rhsRequestedDeliveryMethod = that.getRequestedDeliveryMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedDeliveryMethod", lhsRequestedDeliveryMethod), LocatorUtils.property(thatLocator, "requestedDeliveryMethod", rhsRequestedDeliveryMethod), lhsRequestedDeliveryMethod, rhsRequestedDeliveryMethod, (this.requestedDeliveryMethod!= null), (that.requestedDeliveryMethod!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsTotalReimbursement;
            lhsTotalReimbursement = this.getTotalReimbursement();
            FinancialAmountType rhsTotalReimbursement;
            rhsTotalReimbursement = that.getTotalReimbursement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalReimbursement", lhsTotalReimbursement), LocatorUtils.property(thatLocator, "totalReimbursement", rhsTotalReimbursement), lhsTotalReimbursement, rhsTotalReimbursement, (this.totalReimbursement!= null), (that.totalReimbursement!= null))) {
                return false;
            }
        }
        {
            WarrantyMethod lhsWarrantyMethod;
            lhsWarrantyMethod = this.getWarrantyMethod();
            WarrantyMethod rhsWarrantyMethod;
            rhsWarrantyMethod = that.getWarrantyMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyMethod", lhsWarrantyMethod), LocatorUtils.property(thatLocator, "warrantyMethod", rhsWarrantyMethod), lhsWarrantyMethod, rhsWarrantyMethod, (this.warrantyMethod!= null), (that.warrantyMethod!= null))) {
                return false;
            }
        }
        {
            WarrantyProgram lhsWarrantyProgram;
            lhsWarrantyProgram = this.getWarrantyProgram();
            WarrantyProgram rhsWarrantyProgram;
            rhsWarrantyProgram = that.getWarrantyProgram();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyProgram", lhsWarrantyProgram), LocatorUtils.property(thatLocator, "warrantyProgram", rhsWarrantyProgram), lhsWarrantyProgram, rhsWarrantyProgram, (this.warrantyProgram!= null), (that.warrantyProgram!= null))) {
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
            Boolean theIsRequestedDeliveryMethodAllowed;
            theIsRequestedDeliveryMethodAllowed = this.isIsRequestedDeliveryMethodAllowed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRequestedDeliveryMethodAllowed", theIsRequestedDeliveryMethodAllowed), currentHashCode, theIsRequestedDeliveryMethodAllowed, (this.isRequestedDeliveryMethodAllowed!= null));
        }
        {
            ServiceDeliveryMethodType theRecommendedDeliveryMethod;
            theRecommendedDeliveryMethod = this.getRecommendedDeliveryMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recommendedDeliveryMethod", theRecommendedDeliveryMethod), currentHashCode, theRecommendedDeliveryMethod, (this.recommendedDeliveryMethod!= null));
        }
        {
            ReimbursementInformation theReimbursementInformation;
            theReimbursementInformation = this.getReimbursementInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reimbursementInformation", theReimbursementInformation), currentHashCode, theReimbursementInformation, (this.reimbursementInformation!= null));
        }
        {
            ServiceDeliveryMethodType theRequestedDeliveryMethod;
            theRequestedDeliveryMethod = this.getRequestedDeliveryMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedDeliveryMethod", theRequestedDeliveryMethod), currentHashCode, theRequestedDeliveryMethod, (this.requestedDeliveryMethod!= null));
        }
        {
            FinancialAmountType theTotalReimbursement;
            theTotalReimbursement = this.getTotalReimbursement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalReimbursement", theTotalReimbursement), currentHashCode, theTotalReimbursement, (this.totalReimbursement!= null));
        }
        {
            WarrantyMethod theWarrantyMethod;
            theWarrantyMethod = this.getWarrantyMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyMethod", theWarrantyMethod), currentHashCode, theWarrantyMethod, (this.warrantyMethod!= null));
        }
        {
            WarrantyProgram theWarrantyProgram;
            theWarrantyProgram = this.getWarrantyProgram();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyProgram", theWarrantyProgram), currentHashCode, theWarrantyProgram, (this.warrantyProgram!= null));
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
            Boolean theIsRequestedDeliveryMethodAllowed;
            theIsRequestedDeliveryMethodAllowed = this.isIsRequestedDeliveryMethodAllowed();
            strategy.appendField(locator, this, "isRequestedDeliveryMethodAllowed", buffer, theIsRequestedDeliveryMethodAllowed, (this.isRequestedDeliveryMethodAllowed!= null));
        }
        {
            ServiceDeliveryMethodType theRecommendedDeliveryMethod;
            theRecommendedDeliveryMethod = this.getRecommendedDeliveryMethod();
            strategy.appendField(locator, this, "recommendedDeliveryMethod", buffer, theRecommendedDeliveryMethod, (this.recommendedDeliveryMethod!= null));
        }
        {
            ReimbursementInformation theReimbursementInformation;
            theReimbursementInformation = this.getReimbursementInformation();
            strategy.appendField(locator, this, "reimbursementInformation", buffer, theReimbursementInformation, (this.reimbursementInformation!= null));
        }
        {
            ServiceDeliveryMethodType theRequestedDeliveryMethod;
            theRequestedDeliveryMethod = this.getRequestedDeliveryMethod();
            strategy.appendField(locator, this, "requestedDeliveryMethod", buffer, theRequestedDeliveryMethod, (this.requestedDeliveryMethod!= null));
        }
        {
            FinancialAmountType theTotalReimbursement;
            theTotalReimbursement = this.getTotalReimbursement();
            strategy.appendField(locator, this, "totalReimbursement", buffer, theTotalReimbursement, (this.totalReimbursement!= null));
        }
        {
            WarrantyMethod theWarrantyMethod;
            theWarrantyMethod = this.getWarrantyMethod();
            strategy.appendField(locator, this, "warrantyMethod", buffer, theWarrantyMethod, (this.warrantyMethod!= null));
        }
        {
            WarrantyProgram theWarrantyProgram;
            theWarrantyProgram = this.getWarrantyProgram();
            strategy.appendField(locator, this, "warrantyProgram", buffer, theWarrantyProgram, (this.warrantyProgram!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
