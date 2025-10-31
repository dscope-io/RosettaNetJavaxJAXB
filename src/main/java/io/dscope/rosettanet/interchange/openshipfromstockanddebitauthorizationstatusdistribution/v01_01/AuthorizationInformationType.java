
package io.dscope.rosettanet.interchange.openshipfromstockanddebitauthorizationstatusdistribution.v01_01;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_24.BranchInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_24.PricingInformationType;
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
 * <p>Java class for AuthorizationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorizationPeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.24}BranchInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductFamilyInformation" type="{urn:rosettanet:specification:interchange:OpenShipFromStockAndDebitAuthorizationStatusDistribution:xsd:schema:01.01}ProductFamilyInformationType" minOccurs="0"/&gt;
 *         &lt;element name="ProductInformation" type="{urn:rosettanet:specification:interchange:OpenShipFromStockAndDebitAuthorizationStatusDistribution:xsd:schema:01.01}ProductInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RevisionInformation" type="{urn:rosettanet:specification:interchange:OpenShipFromStockAndDebitAuthorizationStatusDistribution:xsd:schema:01.01}RevisionInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SupplierPricing" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.24}PricingInformationType" minOccurs="0"/&gt;
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
@XmlType(name = "AuthorizationInformationType", propOrder = {
    "authorizationPeriod",
    "branchInformation",
    "businessDocumentReference",
    "identifier",
    "productFamilyInformation",
    "productInformation",
    "revisionInformation",
    "supplierPricing"
})
public class AuthorizationInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AuthorizationPeriod", required = true)
    protected DatePeriodType authorizationPeriod;
    @XmlElementRef(name = "BranchInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.24", type = BranchInformation.class, required = false)
    protected List<BranchInformation> branchInformation;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "ProductFamilyInformation")
    protected ProductFamilyInformationType productFamilyInformation;
    @XmlElement(name = "ProductInformation", required = true)
    protected List<ProductInformationType> productInformation;
    @XmlElement(name = "RevisionInformation")
    protected List<RevisionInformationType> revisionInformation;
    @XmlElement(name = "SupplierPricing")
    protected PricingInformationType supplierPricing;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the authorizationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getAuthorizationPeriod() {
        return authorizationPeriod;
    }

    /**
     * Sets the value of the authorizationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setAuthorizationPeriod(DatePeriodType value) {
        this.authorizationPeriod = value;
    }

    /**
     * Gets the value of the branchInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchInformation }
     * 
     * 
     */
    public List<BranchInformation> getBranchInformation() {
        if (branchInformation == null) {
            branchInformation = new ArrayList<BranchInformation>();
        }
        return this.branchInformation;
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
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the productFamilyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFamilyInformationType }
     *     
     */
    public ProductFamilyInformationType getProductFamilyInformation() {
        return productFamilyInformation;
    }

    /**
     * Sets the value of the productFamilyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFamilyInformationType }
     *     
     */
    public void setProductFamilyInformation(ProductFamilyInformationType value) {
        this.productFamilyInformation = value;
    }

    /**
     * Gets the value of the productInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductInformationType }
     * 
     * 
     */
    public List<ProductInformationType> getProductInformation() {
        if (productInformation == null) {
            productInformation = new ArrayList<ProductInformationType>();
        }
        return this.productInformation;
    }

    /**
     * Gets the value of the revisionInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revisionInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevisionInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevisionInformationType }
     * 
     * 
     */
    public List<RevisionInformationType> getRevisionInformation() {
        if (revisionInformation == null) {
            revisionInformation = new ArrayList<RevisionInformationType>();
        }
        return this.revisionInformation;
    }

    /**
     * Gets the value of the supplierPricing property.
     * 
     * @return
     *     possible object is
     *     {@link PricingInformationType }
     *     
     */
    public PricingInformationType getSupplierPricing() {
        return supplierPricing;
    }

    /**
     * Sets the value of the supplierPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingInformationType }
     *     
     */
    public void setSupplierPricing(PricingInformationType value) {
        this.supplierPricing = value;
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
        final AuthorizationInformationType that = ((AuthorizationInformationType) object);
        {
            DatePeriodType lhsAuthorizationPeriod;
            lhsAuthorizationPeriod = this.getAuthorizationPeriod();
            DatePeriodType rhsAuthorizationPeriod;
            rhsAuthorizationPeriod = that.getAuthorizationPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authorizationPeriod", lhsAuthorizationPeriod), LocatorUtils.property(thatLocator, "authorizationPeriod", rhsAuthorizationPeriod), lhsAuthorizationPeriod, rhsAuthorizationPeriod, (this.authorizationPeriod!= null), (that.authorizationPeriod!= null))) {
                return false;
            }
        }
        {
            List<BranchInformation> lhsBranchInformation;
            lhsBranchInformation = (((this.branchInformation!= null)&&(!this.branchInformation.isEmpty()))?this.getBranchInformation():null);
            List<BranchInformation> rhsBranchInformation;
            rhsBranchInformation = (((that.branchInformation!= null)&&(!that.branchInformation.isEmpty()))?that.getBranchInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branchInformation", lhsBranchInformation), LocatorUtils.property(thatLocator, "branchInformation", rhsBranchInformation), lhsBranchInformation, rhsBranchInformation, ((this.branchInformation!= null)&&(!this.branchInformation.isEmpty())), ((that.branchInformation!= null)&&(!that.branchInformation.isEmpty())))) {
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
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            ProductFamilyInformationType lhsProductFamilyInformation;
            lhsProductFamilyInformation = this.getProductFamilyInformation();
            ProductFamilyInformationType rhsProductFamilyInformation;
            rhsProductFamilyInformation = that.getProductFamilyInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productFamilyInformation", lhsProductFamilyInformation), LocatorUtils.property(thatLocator, "productFamilyInformation", rhsProductFamilyInformation), lhsProductFamilyInformation, rhsProductFamilyInformation, (this.productFamilyInformation!= null), (that.productFamilyInformation!= null))) {
                return false;
            }
        }
        {
            List<ProductInformationType> lhsProductInformation;
            lhsProductInformation = (((this.productInformation!= null)&&(!this.productInformation.isEmpty()))?this.getProductInformation():null);
            List<ProductInformationType> rhsProductInformation;
            rhsProductInformation = (((that.productInformation!= null)&&(!that.productInformation.isEmpty()))?that.getProductInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productInformation", lhsProductInformation), LocatorUtils.property(thatLocator, "productInformation", rhsProductInformation), lhsProductInformation, rhsProductInformation, ((this.productInformation!= null)&&(!this.productInformation.isEmpty())), ((that.productInformation!= null)&&(!that.productInformation.isEmpty())))) {
                return false;
            }
        }
        {
            List<RevisionInformationType> lhsRevisionInformation;
            lhsRevisionInformation = (((this.revisionInformation!= null)&&(!this.revisionInformation.isEmpty()))?this.getRevisionInformation():null);
            List<RevisionInformationType> rhsRevisionInformation;
            rhsRevisionInformation = (((that.revisionInformation!= null)&&(!that.revisionInformation.isEmpty()))?that.getRevisionInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revisionInformation", lhsRevisionInformation), LocatorUtils.property(thatLocator, "revisionInformation", rhsRevisionInformation), lhsRevisionInformation, rhsRevisionInformation, ((this.revisionInformation!= null)&&(!this.revisionInformation.isEmpty())), ((that.revisionInformation!= null)&&(!that.revisionInformation.isEmpty())))) {
                return false;
            }
        }
        {
            PricingInformationType lhsSupplierPricing;
            lhsSupplierPricing = this.getSupplierPricing();
            PricingInformationType rhsSupplierPricing;
            rhsSupplierPricing = that.getSupplierPricing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplierPricing", lhsSupplierPricing), LocatorUtils.property(thatLocator, "supplierPricing", rhsSupplierPricing), lhsSupplierPricing, rhsSupplierPricing, (this.supplierPricing!= null), (that.supplierPricing!= null))) {
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
            DatePeriodType theAuthorizationPeriod;
            theAuthorizationPeriod = this.getAuthorizationPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authorizationPeriod", theAuthorizationPeriod), currentHashCode, theAuthorizationPeriod, (this.authorizationPeriod!= null));
        }
        {
            List<BranchInformation> theBranchInformation;
            theBranchInformation = (((this.branchInformation!= null)&&(!this.branchInformation.isEmpty()))?this.getBranchInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "branchInformation", theBranchInformation), currentHashCode, theBranchInformation, ((this.branchInformation!= null)&&(!this.branchInformation.isEmpty())));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            ProductFamilyInformationType theProductFamilyInformation;
            theProductFamilyInformation = this.getProductFamilyInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productFamilyInformation", theProductFamilyInformation), currentHashCode, theProductFamilyInformation, (this.productFamilyInformation!= null));
        }
        {
            List<ProductInformationType> theProductInformation;
            theProductInformation = (((this.productInformation!= null)&&(!this.productInformation.isEmpty()))?this.getProductInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productInformation", theProductInformation), currentHashCode, theProductInformation, ((this.productInformation!= null)&&(!this.productInformation.isEmpty())));
        }
        {
            List<RevisionInformationType> theRevisionInformation;
            theRevisionInformation = (((this.revisionInformation!= null)&&(!this.revisionInformation.isEmpty()))?this.getRevisionInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revisionInformation", theRevisionInformation), currentHashCode, theRevisionInformation, ((this.revisionInformation!= null)&&(!this.revisionInformation.isEmpty())));
        }
        {
            PricingInformationType theSupplierPricing;
            theSupplierPricing = this.getSupplierPricing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplierPricing", theSupplierPricing), currentHashCode, theSupplierPricing, (this.supplierPricing!= null));
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
            DatePeriodType theAuthorizationPeriod;
            theAuthorizationPeriod = this.getAuthorizationPeriod();
            strategy.appendField(locator, this, "authorizationPeriod", buffer, theAuthorizationPeriod, (this.authorizationPeriod!= null));
        }
        {
            List<BranchInformation> theBranchInformation;
            theBranchInformation = (((this.branchInformation!= null)&&(!this.branchInformation.isEmpty()))?this.getBranchInformation():null);
            strategy.appendField(locator, this, "branchInformation", buffer, theBranchInformation, ((this.branchInformation!= null)&&(!this.branchInformation.isEmpty())));
        }
        {
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            ProductFamilyInformationType theProductFamilyInformation;
            theProductFamilyInformation = this.getProductFamilyInformation();
            strategy.appendField(locator, this, "productFamilyInformation", buffer, theProductFamilyInformation, (this.productFamilyInformation!= null));
        }
        {
            List<ProductInformationType> theProductInformation;
            theProductInformation = (((this.productInformation!= null)&&(!this.productInformation.isEmpty()))?this.getProductInformation():null);
            strategy.appendField(locator, this, "productInformation", buffer, theProductInformation, ((this.productInformation!= null)&&(!this.productInformation.isEmpty())));
        }
        {
            List<RevisionInformationType> theRevisionInformation;
            theRevisionInformation = (((this.revisionInformation!= null)&&(!this.revisionInformation.isEmpty()))?this.getRevisionInformation():null);
            strategy.appendField(locator, this, "revisionInformation", buffer, theRevisionInformation, ((this.revisionInformation!= null)&&(!this.revisionInformation.isEmpty())));
        }
        {
            PricingInformationType theSupplierPricing;
            theSupplierPricing = this.getSupplierPricing();
            strategy.appendField(locator, this, "supplierPricing", buffer, theSupplierPricing, (this.supplierPricing!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
