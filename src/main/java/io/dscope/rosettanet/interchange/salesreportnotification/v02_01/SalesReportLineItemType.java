
package io.dscope.rosettanet.interchange.salesreportnotification.v02_01;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.SalesOutAndTransaction;
import io.dscope.rosettanet.domain.shared.shared.v01_12.ProductQuantity;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_14.SpecifiedNewPartnerType;
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
 * <p>Java class for SalesReportLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesReportLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallLocation" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}SpecifiedNewPartnerType" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="OpportunityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationalCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductInformation" type="{urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:02.01}ProductInformationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}ProductQuantity"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}SalesOutAndTransaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPriceClaim" type="{urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:02.01}SpecialPriceClaimType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ValueAddedEnhancement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SalesReportLineItemType", propOrder = {
    "businessDocumentReference",
    "comment",
    "installLocation",
    "lineNumber",
    "opportunityNumber",
    "orderType",
    "organizationalCoverage",
    "productInformation",
    "productQuantity",
    "salesOutAndTransaction",
    "specialPriceClaim",
    "valueAddedEnhancement"
})
public class SalesReportLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "InstallLocation")
    protected SpecifiedNewPartnerType installLocation;
    @XmlElement(name = "LineNumber", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger lineNumber;
    @XmlElement(name = "OpportunityNumber")
    protected String opportunityNumber;
    @XmlElement(name = "OrderType")
    protected String orderType;
    @XmlElement(name = "OrganizationalCoverage")
    protected String organizationalCoverage;
    @XmlElement(name = "ProductInformation", required = true)
    protected ProductInformationType productInformation;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.12", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlElementRef(name = "SalesOutAndTransaction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = SalesOutAndTransaction.class, required = false)
    protected List<SalesOutAndTransaction> salesOutAndTransaction;
    @XmlElement(name = "SpecialPriceClaim")
    protected List<SpecialPriceClaimType> specialPriceClaim;
    @XmlElement(name = "ValueAddedEnhancement")
    protected String valueAddedEnhancement;
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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the installLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedNewPartnerType }
     *     
     */
    public SpecifiedNewPartnerType getInstallLocation() {
        return installLocation;
    }

    /**
     * Sets the value of the installLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedNewPartnerType }
     *     
     */
    public void setInstallLocation(SpecifiedNewPartnerType value) {
        this.installLocation = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the opportunityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityNumber() {
        return opportunityNumber;
    }

    /**
     * Sets the value of the opportunityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityNumber(String value) {
        this.opportunityNumber = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the organizationalCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationalCoverage() {
        return organizationalCoverage;
    }

    /**
     * Sets the value of the organizationalCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationalCoverage(String value) {
        this.organizationalCoverage = value;
    }

    /**
     * Gets the value of the productInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationType }
     *     
     */
    public ProductInformationType getProductInformation() {
        return productInformation;
    }

    /**
     * Sets the value of the productInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationType }
     *     
     */
    public void setProductInformation(ProductInformationType value) {
        this.productInformation = value;
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
     * Gets the value of the salesOutAndTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOutAndTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOutAndTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOutAndTransaction }
     * 
     * 
     */
    public List<SalesOutAndTransaction> getSalesOutAndTransaction() {
        if (salesOutAndTransaction == null) {
            salesOutAndTransaction = new ArrayList<SalesOutAndTransaction>();
        }
        return this.salesOutAndTransaction;
    }

    /**
     * Gets the value of the specialPriceClaim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialPriceClaim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialPriceClaim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialPriceClaimType }
     * 
     * 
     */
    public List<SpecialPriceClaimType> getSpecialPriceClaim() {
        if (specialPriceClaim == null) {
            specialPriceClaim = new ArrayList<SpecialPriceClaimType>();
        }
        return this.specialPriceClaim;
    }

    /**
     * Gets the value of the valueAddedEnhancement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAddedEnhancement() {
        return valueAddedEnhancement;
    }

    /**
     * Sets the value of the valueAddedEnhancement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAddedEnhancement(String value) {
        this.valueAddedEnhancement = value;
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
        final SalesReportLineItemType that = ((SalesReportLineItemType) object);
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
            String lhsComment;
            lhsComment = this.getComment();
            String rhsComment;
            rhsComment = that.getComment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comment", lhsComment), LocatorUtils.property(thatLocator, "comment", rhsComment), lhsComment, rhsComment, (this.comment!= null), (that.comment!= null))) {
                return false;
            }
        }
        {
            SpecifiedNewPartnerType lhsInstallLocation;
            lhsInstallLocation = this.getInstallLocation();
            SpecifiedNewPartnerType rhsInstallLocation;
            rhsInstallLocation = that.getInstallLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "installLocation", lhsInstallLocation), LocatorUtils.property(thatLocator, "installLocation", rhsInstallLocation), lhsInstallLocation, rhsInstallLocation, (this.installLocation!= null), (that.installLocation!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsLineNumber;
            lhsLineNumber = this.getLineNumber();
            BigInteger rhsLineNumber;
            rhsLineNumber = that.getLineNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineNumber", lhsLineNumber), LocatorUtils.property(thatLocator, "lineNumber", rhsLineNumber), lhsLineNumber, rhsLineNumber, (this.lineNumber!= null), (that.lineNumber!= null))) {
                return false;
            }
        }
        {
            String lhsOpportunityNumber;
            lhsOpportunityNumber = this.getOpportunityNumber();
            String rhsOpportunityNumber;
            rhsOpportunityNumber = that.getOpportunityNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "opportunityNumber", lhsOpportunityNumber), LocatorUtils.property(thatLocator, "opportunityNumber", rhsOpportunityNumber), lhsOpportunityNumber, rhsOpportunityNumber, (this.opportunityNumber!= null), (that.opportunityNumber!= null))) {
                return false;
            }
        }
        {
            String lhsOrderType;
            lhsOrderType = this.getOrderType();
            String rhsOrderType;
            rhsOrderType = that.getOrderType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderType", lhsOrderType), LocatorUtils.property(thatLocator, "orderType", rhsOrderType), lhsOrderType, rhsOrderType, (this.orderType!= null), (that.orderType!= null))) {
                return false;
            }
        }
        {
            String lhsOrganizationalCoverage;
            lhsOrganizationalCoverage = this.getOrganizationalCoverage();
            String rhsOrganizationalCoverage;
            rhsOrganizationalCoverage = that.getOrganizationalCoverage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organizationalCoverage", lhsOrganizationalCoverage), LocatorUtils.property(thatLocator, "organizationalCoverage", rhsOrganizationalCoverage), lhsOrganizationalCoverage, rhsOrganizationalCoverage, (this.organizationalCoverage!= null), (that.organizationalCoverage!= null))) {
                return false;
            }
        }
        {
            ProductInformationType lhsProductInformation;
            lhsProductInformation = this.getProductInformation();
            ProductInformationType rhsProductInformation;
            rhsProductInformation = that.getProductInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productInformation", lhsProductInformation), LocatorUtils.property(thatLocator, "productInformation", rhsProductInformation), lhsProductInformation, rhsProductInformation, (this.productInformation!= null), (that.productInformation!= null))) {
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
            List<SalesOutAndTransaction> lhsSalesOutAndTransaction;
            lhsSalesOutAndTransaction = (((this.salesOutAndTransaction!= null)&&(!this.salesOutAndTransaction.isEmpty()))?this.getSalesOutAndTransaction():null);
            List<SalesOutAndTransaction> rhsSalesOutAndTransaction;
            rhsSalesOutAndTransaction = (((that.salesOutAndTransaction!= null)&&(!that.salesOutAndTransaction.isEmpty()))?that.getSalesOutAndTransaction():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesOutAndTransaction", lhsSalesOutAndTransaction), LocatorUtils.property(thatLocator, "salesOutAndTransaction", rhsSalesOutAndTransaction), lhsSalesOutAndTransaction, rhsSalesOutAndTransaction, ((this.salesOutAndTransaction!= null)&&(!this.salesOutAndTransaction.isEmpty())), ((that.salesOutAndTransaction!= null)&&(!that.salesOutAndTransaction.isEmpty())))) {
                return false;
            }
        }
        {
            List<SpecialPriceClaimType> lhsSpecialPriceClaim;
            lhsSpecialPriceClaim = (((this.specialPriceClaim!= null)&&(!this.specialPriceClaim.isEmpty()))?this.getSpecialPriceClaim():null);
            List<SpecialPriceClaimType> rhsSpecialPriceClaim;
            rhsSpecialPriceClaim = (((that.specialPriceClaim!= null)&&(!that.specialPriceClaim.isEmpty()))?that.getSpecialPriceClaim():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialPriceClaim", lhsSpecialPriceClaim), LocatorUtils.property(thatLocator, "specialPriceClaim", rhsSpecialPriceClaim), lhsSpecialPriceClaim, rhsSpecialPriceClaim, ((this.specialPriceClaim!= null)&&(!this.specialPriceClaim.isEmpty())), ((that.specialPriceClaim!= null)&&(!that.specialPriceClaim.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsValueAddedEnhancement;
            lhsValueAddedEnhancement = this.getValueAddedEnhancement();
            String rhsValueAddedEnhancement;
            rhsValueAddedEnhancement = that.getValueAddedEnhancement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueAddedEnhancement", lhsValueAddedEnhancement), LocatorUtils.property(thatLocator, "valueAddedEnhancement", rhsValueAddedEnhancement), lhsValueAddedEnhancement, rhsValueAddedEnhancement, (this.valueAddedEnhancement!= null), (that.valueAddedEnhancement!= null))) {
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
            String theComment;
            theComment = this.getComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comment", theComment), currentHashCode, theComment, (this.comment!= null));
        }
        {
            SpecifiedNewPartnerType theInstallLocation;
            theInstallLocation = this.getInstallLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "installLocation", theInstallLocation), currentHashCode, theInstallLocation, (this.installLocation!= null));
        }
        {
            BigInteger theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            String theOpportunityNumber;
            theOpportunityNumber = this.getOpportunityNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "opportunityNumber", theOpportunityNumber), currentHashCode, theOpportunityNumber, (this.opportunityNumber!= null));
        }
        {
            String theOrderType;
            theOrderType = this.getOrderType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderType", theOrderType), currentHashCode, theOrderType, (this.orderType!= null));
        }
        {
            String theOrganizationalCoverage;
            theOrganizationalCoverage = this.getOrganizationalCoverage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organizationalCoverage", theOrganizationalCoverage), currentHashCode, theOrganizationalCoverage, (this.organizationalCoverage!= null));
        }
        {
            ProductInformationType theProductInformation;
            theProductInformation = this.getProductInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productInformation", theProductInformation), currentHashCode, theProductInformation, (this.productInformation!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantity", theProductQuantity), currentHashCode, theProductQuantity, (this.productQuantity!= null));
        }
        {
            List<SalesOutAndTransaction> theSalesOutAndTransaction;
            theSalesOutAndTransaction = (((this.salesOutAndTransaction!= null)&&(!this.salesOutAndTransaction.isEmpty()))?this.getSalesOutAndTransaction():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesOutAndTransaction", theSalesOutAndTransaction), currentHashCode, theSalesOutAndTransaction, ((this.salesOutAndTransaction!= null)&&(!this.salesOutAndTransaction.isEmpty())));
        }
        {
            List<SpecialPriceClaimType> theSpecialPriceClaim;
            theSpecialPriceClaim = (((this.specialPriceClaim!= null)&&(!this.specialPriceClaim.isEmpty()))?this.getSpecialPriceClaim():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialPriceClaim", theSpecialPriceClaim), currentHashCode, theSpecialPriceClaim, ((this.specialPriceClaim!= null)&&(!this.specialPriceClaim.isEmpty())));
        }
        {
            String theValueAddedEnhancement;
            theValueAddedEnhancement = this.getValueAddedEnhancement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueAddedEnhancement", theValueAddedEnhancement), currentHashCode, theValueAddedEnhancement, (this.valueAddedEnhancement!= null));
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
            String theComment;
            theComment = this.getComment();
            strategy.appendField(locator, this, "comment", buffer, theComment, (this.comment!= null));
        }
        {
            SpecifiedNewPartnerType theInstallLocation;
            theInstallLocation = this.getInstallLocation();
            strategy.appendField(locator, this, "installLocation", buffer, theInstallLocation, (this.installLocation!= null));
        }
        {
            BigInteger theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            String theOpportunityNumber;
            theOpportunityNumber = this.getOpportunityNumber();
            strategy.appendField(locator, this, "opportunityNumber", buffer, theOpportunityNumber, (this.opportunityNumber!= null));
        }
        {
            String theOrderType;
            theOrderType = this.getOrderType();
            strategy.appendField(locator, this, "orderType", buffer, theOrderType, (this.orderType!= null));
        }
        {
            String theOrganizationalCoverage;
            theOrganizationalCoverage = this.getOrganizationalCoverage();
            strategy.appendField(locator, this, "organizationalCoverage", buffer, theOrganizationalCoverage, (this.organizationalCoverage!= null));
        }
        {
            ProductInformationType theProductInformation;
            theProductInformation = this.getProductInformation();
            strategy.appendField(locator, this, "productInformation", buffer, theProductInformation, (this.productInformation!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            strategy.appendField(locator, this, "productQuantity", buffer, theProductQuantity, (this.productQuantity!= null));
        }
        {
            List<SalesOutAndTransaction> theSalesOutAndTransaction;
            theSalesOutAndTransaction = (((this.salesOutAndTransaction!= null)&&(!this.salesOutAndTransaction.isEmpty()))?this.getSalesOutAndTransaction():null);
            strategy.appendField(locator, this, "salesOutAndTransaction", buffer, theSalesOutAndTransaction, ((this.salesOutAndTransaction!= null)&&(!this.salesOutAndTransaction.isEmpty())));
        }
        {
            List<SpecialPriceClaimType> theSpecialPriceClaim;
            theSpecialPriceClaim = (((this.specialPriceClaim!= null)&&(!this.specialPriceClaim.isEmpty()))?this.getSpecialPriceClaim():null);
            strategy.appendField(locator, this, "specialPriceClaim", buffer, theSpecialPriceClaim, ((this.specialPriceClaim!= null)&&(!this.specialPriceClaim.isEmpty())));
        }
        {
            String theValueAddedEnhancement;
            theValueAddedEnhancement = this.getValueAddedEnhancement();
            strategy.appendField(locator, this, "valueAddedEnhancement", buffer, theValueAddedEnhancement, (this.valueAddedEnhancement!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
