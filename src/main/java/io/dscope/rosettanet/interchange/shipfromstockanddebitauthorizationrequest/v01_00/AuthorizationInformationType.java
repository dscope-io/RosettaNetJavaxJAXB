
package io.dscope.rosettanet.interchange.shipfromstockanddebitauthorizationrequest.v01_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.BranchInformation;
import io.dscope.rosettanet.universal.dates.v01_03.StartAndEndDateType;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}BranchInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" minOccurs="0"/&gt;
 *         &lt;element name="ProductInformation" type="{urn:rosettanet:specification:interchange:ShipFromStockAndDebitAuthorizationRequestNotification:xsd:schema:01.00}ProductInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RequestedAuthorizationPeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateType"/&gt;
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
    "branchInformation",
    "businessDocumentReference",
    "productInformation",
    "requestedAuthorizationPeriod"
})
public class AuthorizationInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BranchInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = BranchInformation.class, required = false)
    protected List<BranchInformation> branchInformation;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElement(name = "ProductInformation", required = true)
    protected List<ProductInformationType> productInformation;
    @XmlElement(name = "RequestedAuthorizationPeriod", required = true)
    protected StartAndEndDateType requestedAuthorizationPeriod;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * @return
     *     possible object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public BusinessDocumentReference getBusinessDocumentReference() {
        return businessDocumentReference;
    }

    /**
     * Sets the value of the businessDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public void setBusinessDocumentReference(BusinessDocumentReference value) {
        this.businessDocumentReference = value;
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
     * Gets the value of the requestedAuthorizationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateType }
     *     
     */
    public StartAndEndDateType getRequestedAuthorizationPeriod() {
        return requestedAuthorizationPeriod;
    }

    /**
     * Sets the value of the requestedAuthorizationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateType }
     *     
     */
    public void setRequestedAuthorizationPeriod(StartAndEndDateType value) {
        this.requestedAuthorizationPeriod = value;
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
            List<BranchInformation> lhsBranchInformation;
            lhsBranchInformation = (((this.branchInformation!= null)&&(!this.branchInformation.isEmpty()))?this.getBranchInformation():null);
            List<BranchInformation> rhsBranchInformation;
            rhsBranchInformation = (((that.branchInformation!= null)&&(!that.branchInformation.isEmpty()))?that.getBranchInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branchInformation", lhsBranchInformation), LocatorUtils.property(thatLocator, "branchInformation", rhsBranchInformation), lhsBranchInformation, rhsBranchInformation, ((this.branchInformation!= null)&&(!this.branchInformation.isEmpty())), ((that.branchInformation!= null)&&(!that.branchInformation.isEmpty())))) {
                return false;
            }
        }
        {
            BusinessDocumentReference lhsBusinessDocumentReference;
            lhsBusinessDocumentReference = this.getBusinessDocumentReference();
            BusinessDocumentReference rhsBusinessDocumentReference;
            rhsBusinessDocumentReference = that.getBusinessDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentReference", lhsBusinessDocumentReference), LocatorUtils.property(thatLocator, "businessDocumentReference", rhsBusinessDocumentReference), lhsBusinessDocumentReference, rhsBusinessDocumentReference, (this.businessDocumentReference!= null), (that.businessDocumentReference!= null))) {
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
            StartAndEndDateType lhsRequestedAuthorizationPeriod;
            lhsRequestedAuthorizationPeriod = this.getRequestedAuthorizationPeriod();
            StartAndEndDateType rhsRequestedAuthorizationPeriod;
            rhsRequestedAuthorizationPeriod = that.getRequestedAuthorizationPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedAuthorizationPeriod", lhsRequestedAuthorizationPeriod), LocatorUtils.property(thatLocator, "requestedAuthorizationPeriod", rhsRequestedAuthorizationPeriod), lhsRequestedAuthorizationPeriod, rhsRequestedAuthorizationPeriod, (this.requestedAuthorizationPeriod!= null), (that.requestedAuthorizationPeriod!= null))) {
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
            List<BranchInformation> theBranchInformation;
            theBranchInformation = (((this.branchInformation!= null)&&(!this.branchInformation.isEmpty()))?this.getBranchInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "branchInformation", theBranchInformation), currentHashCode, theBranchInformation, ((this.branchInformation!= null)&&(!this.branchInformation.isEmpty())));
        }
        {
            BusinessDocumentReference theBusinessDocumentReference;
            theBusinessDocumentReference = this.getBusinessDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, (this.businessDocumentReference!= null));
        }
        {
            List<ProductInformationType> theProductInformation;
            theProductInformation = (((this.productInformation!= null)&&(!this.productInformation.isEmpty()))?this.getProductInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productInformation", theProductInformation), currentHashCode, theProductInformation, ((this.productInformation!= null)&&(!this.productInformation.isEmpty())));
        }
        {
            StartAndEndDateType theRequestedAuthorizationPeriod;
            theRequestedAuthorizationPeriod = this.getRequestedAuthorizationPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedAuthorizationPeriod", theRequestedAuthorizationPeriod), currentHashCode, theRequestedAuthorizationPeriod, (this.requestedAuthorizationPeriod!= null));
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
            List<BranchInformation> theBranchInformation;
            theBranchInformation = (((this.branchInformation!= null)&&(!this.branchInformation.isEmpty()))?this.getBranchInformation():null);
            strategy.appendField(locator, this, "branchInformation", buffer, theBranchInformation, ((this.branchInformation!= null)&&(!this.branchInformation.isEmpty())));
        }
        {
            BusinessDocumentReference theBusinessDocumentReference;
            theBusinessDocumentReference = this.getBusinessDocumentReference();
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, (this.businessDocumentReference!= null));
        }
        {
            List<ProductInformationType> theProductInformation;
            theProductInformation = (((this.productInformation!= null)&&(!this.productInformation.isEmpty()))?this.getProductInformation():null);
            strategy.appendField(locator, this, "productInformation", buffer, theProductInformation, ((this.productInformation!= null)&&(!this.productInformation.isEmpty())));
        }
        {
            StartAndEndDateType theRequestedAuthorizationPeriod;
            theRequestedAuthorizationPeriod = this.getRequestedAuthorizationPeriod();
            strategy.appendField(locator, this, "requestedAuthorizationPeriod", buffer, theRequestedAuthorizationPeriod, (this.requestedAuthorizationPeriod!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
