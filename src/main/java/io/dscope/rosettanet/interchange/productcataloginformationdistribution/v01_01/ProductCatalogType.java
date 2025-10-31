
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
import io.dscope.rosettanet.domain.design.codelist.actioncode.v01_03.ActionCode;
import io.dscope.rosettanet.domain.design.codelist.catalogtype.v01_01.CatalogType;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.GeographicRegion;
import io.dscope.rosettanet.universal.contactinformation.v01_04.ContactInformation;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerIdentification;
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
 * <p>Java class for ProductCatalogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCatalogType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03}ActionCode"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CatalogDisclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:CatalogType:xsd:codelist:01.01}CatalogType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.04}ContactInformation" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}GeographicRegion" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationCoverageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerIdentification"/&gt;
 *         &lt;element name="ProductLineItem" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.01}ProductLineItemType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ProductCatalogType", propOrder = {
    "actionCode",
    "businessDocumentReference",
    "catalogDisclaimer",
    "catalogType",
    "contactInformation",
    "description",
    "effectiveDate",
    "geographicRegion",
    "organizationCoverageIdentifier",
    "partnerIdentification",
    "productLineItem"
})
public class ProductCatalogType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ActionCode", namespace = "urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03", type = ActionCode.class)
    protected ActionCode actionCode;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "CatalogDisclaimer")
    protected String catalogDisclaimer;
    @XmlElementRef(name = "CatalogType", namespace = "urn:rosettanet:specification:domain:Design:CatalogType:xsd:codelist:01.01", type = CatalogType.class)
    protected CatalogType catalogType;
    @XmlElementRef(name = "ContactInformation", namespace = "urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.04", type = ContactInformation.class, required = false)
    protected ContactInformation contactInformation;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "EffectiveDate")
    protected DatePeriodType effectiveDate;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = GeographicRegion.class, required = false)
    protected GeographicRegion geographicRegion;
    @XmlElement(name = "OrganizationCoverageIdentifier")
    protected String organizationCoverageIdentifier;
    @XmlElementRef(name = "PartnerIdentification", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerIdentification.class)
    protected PartnerIdentification partnerIdentification;
    @XmlElement(name = "ProductLineItem", required = true)
    protected List<ProductLineItemType> productLineItem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setActionCode(ActionCode value) {
        this.actionCode = value;
    }

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
     * Gets the value of the catalogDisclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogDisclaimer() {
        return catalogDisclaimer;
    }

    /**
     * Sets the value of the catalogDisclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogDisclaimer(String value) {
        this.catalogDisclaimer = value;
    }

    /**
     * Gets the value of the catalogType property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogType }
     *     
     */
    public CatalogType getCatalogType() {
        return catalogType;
    }

    /**
     * Sets the value of the catalogType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogType }
     *     
     */
    public void setCatalogType(CatalogType value) {
        this.catalogType = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation }
     *     
     */
    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation }
     *     
     */
    public void setContactInformation(ContactInformation value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveDate(DatePeriodType value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the geographicRegion property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicRegion }
     *     
     */
    public GeographicRegion getGeographicRegion() {
        return geographicRegion;
    }

    /**
     * Sets the value of the geographicRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicRegion }
     *     
     */
    public void setGeographicRegion(GeographicRegion value) {
        this.geographicRegion = value;
    }

    /**
     * Gets the value of the organizationCoverageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCoverageIdentifier() {
        return organizationCoverageIdentifier;
    }

    /**
     * Sets the value of the organizationCoverageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCoverageIdentifier(String value) {
        this.organizationCoverageIdentifier = value;
    }

    /**
     * Gets the value of the partnerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerIdentification }
     *     
     */
    public PartnerIdentification getPartnerIdentification() {
        return partnerIdentification;
    }

    /**
     * Sets the value of the partnerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerIdentification }
     *     
     */
    public void setPartnerIdentification(PartnerIdentification value) {
        this.partnerIdentification = value;
    }

    /**
     * Gets the value of the productLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLineItemType }
     * 
     * 
     */
    public List<ProductLineItemType> getProductLineItem() {
        if (productLineItem == null) {
            productLineItem = new ArrayList<ProductLineItemType>();
        }
        return this.productLineItem;
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
        final ProductCatalogType that = ((ProductCatalogType) object);
        {
            ActionCode lhsActionCode;
            lhsActionCode = this.getActionCode();
            ActionCode rhsActionCode;
            rhsActionCode = that.getActionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionCode", lhsActionCode), LocatorUtils.property(thatLocator, "actionCode", rhsActionCode), lhsActionCode, rhsActionCode, (this.actionCode!= null), (that.actionCode!= null))) {
                return false;
            }
        }
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
            String lhsCatalogDisclaimer;
            lhsCatalogDisclaimer = this.getCatalogDisclaimer();
            String rhsCatalogDisclaimer;
            rhsCatalogDisclaimer = that.getCatalogDisclaimer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "catalogDisclaimer", lhsCatalogDisclaimer), LocatorUtils.property(thatLocator, "catalogDisclaimer", rhsCatalogDisclaimer), lhsCatalogDisclaimer, rhsCatalogDisclaimer, (this.catalogDisclaimer!= null), (that.catalogDisclaimer!= null))) {
                return false;
            }
        }
        {
            CatalogType lhsCatalogType;
            lhsCatalogType = this.getCatalogType();
            CatalogType rhsCatalogType;
            rhsCatalogType = that.getCatalogType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "catalogType", lhsCatalogType), LocatorUtils.property(thatLocator, "catalogType", rhsCatalogType), lhsCatalogType, rhsCatalogType, (this.catalogType!= null), (that.catalogType!= null))) {
                return false;
            }
        }
        {
            ContactInformation lhsContactInformation;
            lhsContactInformation = this.getContactInformation();
            ContactInformation rhsContactInformation;
            rhsContactInformation = that.getContactInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactInformation", lhsContactInformation), LocatorUtils.property(thatLocator, "contactInformation", rhsContactInformation), lhsContactInformation, rhsContactInformation, (this.contactInformation!= null), (that.contactInformation!= null))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            DatePeriodType lhsEffectiveDate;
            lhsEffectiveDate = this.getEffectiveDate();
            DatePeriodType rhsEffectiveDate;
            rhsEffectiveDate = that.getEffectiveDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveDate", lhsEffectiveDate), LocatorUtils.property(thatLocator, "effectiveDate", rhsEffectiveDate), lhsEffectiveDate, rhsEffectiveDate, (this.effectiveDate!= null), (that.effectiveDate!= null))) {
                return false;
            }
        }
        {
            GeographicRegion lhsGeographicRegion;
            lhsGeographicRegion = this.getGeographicRegion();
            GeographicRegion rhsGeographicRegion;
            rhsGeographicRegion = that.getGeographicRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geographicRegion", lhsGeographicRegion), LocatorUtils.property(thatLocator, "geographicRegion", rhsGeographicRegion), lhsGeographicRegion, rhsGeographicRegion, (this.geographicRegion!= null), (that.geographicRegion!= null))) {
                return false;
            }
        }
        {
            String lhsOrganizationCoverageIdentifier;
            lhsOrganizationCoverageIdentifier = this.getOrganizationCoverageIdentifier();
            String rhsOrganizationCoverageIdentifier;
            rhsOrganizationCoverageIdentifier = that.getOrganizationCoverageIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organizationCoverageIdentifier", lhsOrganizationCoverageIdentifier), LocatorUtils.property(thatLocator, "organizationCoverageIdentifier", rhsOrganizationCoverageIdentifier), lhsOrganizationCoverageIdentifier, rhsOrganizationCoverageIdentifier, (this.organizationCoverageIdentifier!= null), (that.organizationCoverageIdentifier!= null))) {
                return false;
            }
        }
        {
            PartnerIdentification lhsPartnerIdentification;
            lhsPartnerIdentification = this.getPartnerIdentification();
            PartnerIdentification rhsPartnerIdentification;
            rhsPartnerIdentification = that.getPartnerIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerIdentification", lhsPartnerIdentification), LocatorUtils.property(thatLocator, "partnerIdentification", rhsPartnerIdentification), lhsPartnerIdentification, rhsPartnerIdentification, (this.partnerIdentification!= null), (that.partnerIdentification!= null))) {
                return false;
            }
        }
        {
            List<ProductLineItemType> lhsProductLineItem;
            lhsProductLineItem = (((this.productLineItem!= null)&&(!this.productLineItem.isEmpty()))?this.getProductLineItem():null);
            List<ProductLineItemType> rhsProductLineItem;
            rhsProductLineItem = (((that.productLineItem!= null)&&(!that.productLineItem.isEmpty()))?that.getProductLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productLineItem", lhsProductLineItem), LocatorUtils.property(thatLocator, "productLineItem", rhsProductLineItem), lhsProductLineItem, rhsProductLineItem, ((this.productLineItem!= null)&&(!this.productLineItem.isEmpty())), ((that.productLineItem!= null)&&(!that.productLineItem.isEmpty())))) {
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
            ActionCode theActionCode;
            theActionCode = this.getActionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionCode", theActionCode), currentHashCode, theActionCode, (this.actionCode!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            String theCatalogDisclaimer;
            theCatalogDisclaimer = this.getCatalogDisclaimer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "catalogDisclaimer", theCatalogDisclaimer), currentHashCode, theCatalogDisclaimer, (this.catalogDisclaimer!= null));
        }
        {
            CatalogType theCatalogType;
            theCatalogType = this.getCatalogType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "catalogType", theCatalogType), currentHashCode, theCatalogType, (this.catalogType!= null));
        }
        {
            ContactInformation theContactInformation;
            theContactInformation = this.getContactInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactInformation", theContactInformation), currentHashCode, theContactInformation, (this.contactInformation!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            DatePeriodType theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveDate", theEffectiveDate), currentHashCode, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            GeographicRegion theGeographicRegion;
            theGeographicRegion = this.getGeographicRegion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geographicRegion", theGeographicRegion), currentHashCode, theGeographicRegion, (this.geographicRegion!= null));
        }
        {
            String theOrganizationCoverageIdentifier;
            theOrganizationCoverageIdentifier = this.getOrganizationCoverageIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organizationCoverageIdentifier", theOrganizationCoverageIdentifier), currentHashCode, theOrganizationCoverageIdentifier, (this.organizationCoverageIdentifier!= null));
        }
        {
            PartnerIdentification thePartnerIdentification;
            thePartnerIdentification = this.getPartnerIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerIdentification", thePartnerIdentification), currentHashCode, thePartnerIdentification, (this.partnerIdentification!= null));
        }
        {
            List<ProductLineItemType> theProductLineItem;
            theProductLineItem = (((this.productLineItem!= null)&&(!this.productLineItem.isEmpty()))?this.getProductLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLineItem", theProductLineItem), currentHashCode, theProductLineItem, ((this.productLineItem!= null)&&(!this.productLineItem.isEmpty())));
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
            ActionCode theActionCode;
            theActionCode = this.getActionCode();
            strategy.appendField(locator, this, "actionCode", buffer, theActionCode, (this.actionCode!= null));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            String theCatalogDisclaimer;
            theCatalogDisclaimer = this.getCatalogDisclaimer();
            strategy.appendField(locator, this, "catalogDisclaimer", buffer, theCatalogDisclaimer, (this.catalogDisclaimer!= null));
        }
        {
            CatalogType theCatalogType;
            theCatalogType = this.getCatalogType();
            strategy.appendField(locator, this, "catalogType", buffer, theCatalogType, (this.catalogType!= null));
        }
        {
            ContactInformation theContactInformation;
            theContactInformation = this.getContactInformation();
            strategy.appendField(locator, this, "contactInformation", buffer, theContactInformation, (this.contactInformation!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            DatePeriodType theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            strategy.appendField(locator, this, "effectiveDate", buffer, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            GeographicRegion theGeographicRegion;
            theGeographicRegion = this.getGeographicRegion();
            strategy.appendField(locator, this, "geographicRegion", buffer, theGeographicRegion, (this.geographicRegion!= null));
        }
        {
            String theOrganizationCoverageIdentifier;
            theOrganizationCoverageIdentifier = this.getOrganizationCoverageIdentifier();
            strategy.appendField(locator, this, "organizationCoverageIdentifier", buffer, theOrganizationCoverageIdentifier, (this.organizationCoverageIdentifier!= null));
        }
        {
            PartnerIdentification thePartnerIdentification;
            thePartnerIdentification = this.getPartnerIdentification();
            strategy.appendField(locator, this, "partnerIdentification", buffer, thePartnerIdentification, (this.partnerIdentification!= null));
        }
        {
            List<ProductLineItemType> theProductLineItem;
            theProductLineItem = (((this.productLineItem!= null)&&(!this.productLineItem.isEmpty()))?this.getProductLineItem():null);
            strategy.appendField(locator, this, "productLineItem", buffer, theProductLineItem, ((this.productLineItem!= null)&&(!this.productLineItem.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
