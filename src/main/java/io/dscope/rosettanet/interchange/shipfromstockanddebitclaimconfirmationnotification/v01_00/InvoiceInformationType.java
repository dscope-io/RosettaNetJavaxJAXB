
package io.dscope.rosettanet.interchange.shipfromstockanddebitclaimconfirmationnotification.v01_00;

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
 * <p>Java class for InvoiceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded"/&gt;
 *         &lt;element name="CreditReferenceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebitReferenceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductInformation" type="{urn:rosettanet:specification:interchange:ShipFromStockAndDebitClaimConfirmationNotification:xsd:schema:01.00}ProductInformationType"/&gt;
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
@XmlType(name = "InvoiceInformationType", propOrder = {
    "businessDocumentReference",
    "creditReferenceIdentifier",
    "debitReferenceIdentifier",
    "productInformation"
})
public class InvoiceInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "CreditReferenceIdentifier")
    protected String creditReferenceIdentifier;
    @XmlElement(name = "DebitReferenceIdentifier")
    protected String debitReferenceIdentifier;
    @XmlElement(name = "ProductInformation", required = true)
    protected ProductInformationType productInformation;
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
     * Gets the value of the creditReferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReferenceIdentifier() {
        return creditReferenceIdentifier;
    }

    /**
     * Sets the value of the creditReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReferenceIdentifier(String value) {
        this.creditReferenceIdentifier = value;
    }

    /**
     * Gets the value of the debitReferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitReferenceIdentifier() {
        return debitReferenceIdentifier;
    }

    /**
     * Sets the value of the debitReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitReferenceIdentifier(String value) {
        this.debitReferenceIdentifier = value;
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
        final InvoiceInformationType that = ((InvoiceInformationType) object);
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
            String lhsCreditReferenceIdentifier;
            lhsCreditReferenceIdentifier = this.getCreditReferenceIdentifier();
            String rhsCreditReferenceIdentifier;
            rhsCreditReferenceIdentifier = that.getCreditReferenceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditReferenceIdentifier", lhsCreditReferenceIdentifier), LocatorUtils.property(thatLocator, "creditReferenceIdentifier", rhsCreditReferenceIdentifier), lhsCreditReferenceIdentifier, rhsCreditReferenceIdentifier, (this.creditReferenceIdentifier!= null), (that.creditReferenceIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsDebitReferenceIdentifier;
            lhsDebitReferenceIdentifier = this.getDebitReferenceIdentifier();
            String rhsDebitReferenceIdentifier;
            rhsDebitReferenceIdentifier = that.getDebitReferenceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debitReferenceIdentifier", lhsDebitReferenceIdentifier), LocatorUtils.property(thatLocator, "debitReferenceIdentifier", rhsDebitReferenceIdentifier), lhsDebitReferenceIdentifier, rhsDebitReferenceIdentifier, (this.debitReferenceIdentifier!= null), (that.debitReferenceIdentifier!= null))) {
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
            String theCreditReferenceIdentifier;
            theCreditReferenceIdentifier = this.getCreditReferenceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditReferenceIdentifier", theCreditReferenceIdentifier), currentHashCode, theCreditReferenceIdentifier, (this.creditReferenceIdentifier!= null));
        }
        {
            String theDebitReferenceIdentifier;
            theDebitReferenceIdentifier = this.getDebitReferenceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debitReferenceIdentifier", theDebitReferenceIdentifier), currentHashCode, theDebitReferenceIdentifier, (this.debitReferenceIdentifier!= null));
        }
        {
            ProductInformationType theProductInformation;
            theProductInformation = this.getProductInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productInformation", theProductInformation), currentHashCode, theProductInformation, (this.productInformation!= null));
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
            String theCreditReferenceIdentifier;
            theCreditReferenceIdentifier = this.getCreditReferenceIdentifier();
            strategy.appendField(locator, this, "creditReferenceIdentifier", buffer, theCreditReferenceIdentifier, (this.creditReferenceIdentifier!= null));
        }
        {
            String theDebitReferenceIdentifier;
            theDebitReferenceIdentifier = this.getDebitReferenceIdentifier();
            strategy.appendField(locator, this, "debitReferenceIdentifier", buffer, theDebitReferenceIdentifier, (this.debitReferenceIdentifier!= null));
        }
        {
            ProductInformationType theProductInformation;
            theProductInformation = this.getProductInformation();
            strategy.appendField(locator, this, "productInformation", buffer, theProductInformation, (this.productInformation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
