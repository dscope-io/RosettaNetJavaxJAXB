
package io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.shipmentterms.v01_03.ShipmentTerms;
import io.dscope.rosettanet.domain.shared.shared.v01_12.MonetaryAmountType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
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
 * <p>Java class for InvoiceLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PreTaxAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07}ProductDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03}ShipmentTerms" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItemAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}MonetaryAmountType"/&gt;
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
@XmlType(name = "InvoiceLineItemType", propOrder = {
    "governmentContractIdentifier",
    "lineNumber",
    "preTaxAmount",
    "primaryIdentifier",
    "productDescription",
    "productIdentification",
    "secondaryIdentifier",
    "shipmentTerms",
    "totalLineItemAmount"
})
public class InvoiceLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "PreTaxAmount")
    protected MonetaryAmountType preTaxAmount;
    @XmlElement(name = "PrimaryIdentifier")
    protected String primaryIdentifier;
    @XmlElement(name = "ProductDescription", required = true)
    protected ProductDescriptionType productDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class, required = false)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "SecondaryIdentifier")
    protected String secondaryIdentifier;
    @XmlElementRef(name = "ShipmentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03", type = ShipmentTerms.class, required = false)
    protected ShipmentTerms shipmentTerms;
    @XmlElement(name = "TotalLineItemAmount", required = true)
    protected MonetaryAmountType totalLineItemAmount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the governmentContractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getGovernmentContractIdentifier() {
        return governmentContractIdentifier;
    }

    /**
     * Sets the value of the governmentContractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setGovernmentContractIdentifier(BusinessDocumentReferenceType value) {
        this.governmentContractIdentifier = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the preTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getPreTaxAmount() {
        return preTaxAmount;
    }

    /**
     * Sets the value of the preTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setPreTaxAmount(MonetaryAmountType value) {
        this.preTaxAmount = value;
    }

    /**
     * Gets the value of the primaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    /**
     * Sets the value of the primaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryIdentifier(String value) {
        this.primaryIdentifier = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDescriptionType }
     *     
     */
    public ProductDescriptionType getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDescriptionType }
     *     
     */
    public void setProductDescription(ProductDescriptionType value) {
        this.productDescription = value;
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
     * Gets the value of the secondaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryIdentifier() {
        return secondaryIdentifier;
    }

    /**
     * Sets the value of the secondaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryIdentifier(String value) {
        this.secondaryIdentifier = value;
    }

    /**
     * Gets the value of the shipmentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentTerms }
     *     
     */
    public ShipmentTerms getShipmentTerms() {
        return shipmentTerms;
    }

    /**
     * Sets the value of the shipmentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTerms }
     *     
     */
    public void setShipmentTerms(ShipmentTerms value) {
        this.shipmentTerms = value;
    }

    /**
     * Gets the value of the totalLineItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getTotalLineItemAmount() {
        return totalLineItemAmount;
    }

    /**
     * Sets the value of the totalLineItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setTotalLineItemAmount(MonetaryAmountType value) {
        this.totalLineItemAmount = value;
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
        final InvoiceLineItemType that = ((InvoiceLineItemType) object);
        {
            BusinessDocumentReferenceType lhsGovernmentContractIdentifier;
            lhsGovernmentContractIdentifier = this.getGovernmentContractIdentifier();
            BusinessDocumentReferenceType rhsGovernmentContractIdentifier;
            rhsGovernmentContractIdentifier = that.getGovernmentContractIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "governmentContractIdentifier", lhsGovernmentContractIdentifier), LocatorUtils.property(thatLocator, "governmentContractIdentifier", rhsGovernmentContractIdentifier), lhsGovernmentContractIdentifier, rhsGovernmentContractIdentifier, (this.governmentContractIdentifier!= null), (that.governmentContractIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsLineNumber;
            lhsLineNumber = this.getLineNumber();
            String rhsLineNumber;
            rhsLineNumber = that.getLineNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineNumber", lhsLineNumber), LocatorUtils.property(thatLocator, "lineNumber", rhsLineNumber), lhsLineNumber, rhsLineNumber, (this.lineNumber!= null), (that.lineNumber!= null))) {
                return false;
            }
        }
        {
            MonetaryAmountType lhsPreTaxAmount;
            lhsPreTaxAmount = this.getPreTaxAmount();
            MonetaryAmountType rhsPreTaxAmount;
            rhsPreTaxAmount = that.getPreTaxAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preTaxAmount", lhsPreTaxAmount), LocatorUtils.property(thatLocator, "preTaxAmount", rhsPreTaxAmount), lhsPreTaxAmount, rhsPreTaxAmount, (this.preTaxAmount!= null), (that.preTaxAmount!= null))) {
                return false;
            }
        }
        {
            String lhsPrimaryIdentifier;
            lhsPrimaryIdentifier = this.getPrimaryIdentifier();
            String rhsPrimaryIdentifier;
            rhsPrimaryIdentifier = that.getPrimaryIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryIdentifier", lhsPrimaryIdentifier), LocatorUtils.property(thatLocator, "primaryIdentifier", rhsPrimaryIdentifier), lhsPrimaryIdentifier, rhsPrimaryIdentifier, (this.primaryIdentifier!= null), (that.primaryIdentifier!= null))) {
                return false;
            }
        }
        {
            ProductDescriptionType lhsProductDescription;
            lhsProductDescription = this.getProductDescription();
            ProductDescriptionType rhsProductDescription;
            rhsProductDescription = that.getProductDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productDescription", lhsProductDescription), LocatorUtils.property(thatLocator, "productDescription", rhsProductDescription), lhsProductDescription, rhsProductDescription, (this.productDescription!= null), (that.productDescription!= null))) {
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
            String lhsSecondaryIdentifier;
            lhsSecondaryIdentifier = this.getSecondaryIdentifier();
            String rhsSecondaryIdentifier;
            rhsSecondaryIdentifier = that.getSecondaryIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secondaryIdentifier", lhsSecondaryIdentifier), LocatorUtils.property(thatLocator, "secondaryIdentifier", rhsSecondaryIdentifier), lhsSecondaryIdentifier, rhsSecondaryIdentifier, (this.secondaryIdentifier!= null), (that.secondaryIdentifier!= null))) {
                return false;
            }
        }
        {
            ShipmentTerms lhsShipmentTerms;
            lhsShipmentTerms = this.getShipmentTerms();
            ShipmentTerms rhsShipmentTerms;
            rhsShipmentTerms = that.getShipmentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentTerms", lhsShipmentTerms), LocatorUtils.property(thatLocator, "shipmentTerms", rhsShipmentTerms), lhsShipmentTerms, rhsShipmentTerms, (this.shipmentTerms!= null), (that.shipmentTerms!= null))) {
                return false;
            }
        }
        {
            MonetaryAmountType lhsTotalLineItemAmount;
            lhsTotalLineItemAmount = this.getTotalLineItemAmount();
            MonetaryAmountType rhsTotalLineItemAmount;
            rhsTotalLineItemAmount = that.getTotalLineItemAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalLineItemAmount", lhsTotalLineItemAmount), LocatorUtils.property(thatLocator, "totalLineItemAmount", rhsTotalLineItemAmount), lhsTotalLineItemAmount, rhsTotalLineItemAmount, (this.totalLineItemAmount!= null), (that.totalLineItemAmount!= null))) {
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
            BusinessDocumentReferenceType theGovernmentContractIdentifier;
            theGovernmentContractIdentifier = this.getGovernmentContractIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "governmentContractIdentifier", theGovernmentContractIdentifier), currentHashCode, theGovernmentContractIdentifier, (this.governmentContractIdentifier!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            MonetaryAmountType thePreTaxAmount;
            thePreTaxAmount = this.getPreTaxAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preTaxAmount", thePreTaxAmount), currentHashCode, thePreTaxAmount, (this.preTaxAmount!= null));
        }
        {
            String thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryIdentifier", thePrimaryIdentifier), currentHashCode, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            ProductDescriptionType theProductDescription;
            theProductDescription = this.getProductDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productDescription", theProductDescription), currentHashCode, theProductDescription, (this.productDescription!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theSecondaryIdentifier;
            theSecondaryIdentifier = this.getSecondaryIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondaryIdentifier", theSecondaryIdentifier), currentHashCode, theSecondaryIdentifier, (this.secondaryIdentifier!= null));
        }
        {
            ShipmentTerms theShipmentTerms;
            theShipmentTerms = this.getShipmentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentTerms", theShipmentTerms), currentHashCode, theShipmentTerms, (this.shipmentTerms!= null));
        }
        {
            MonetaryAmountType theTotalLineItemAmount;
            theTotalLineItemAmount = this.getTotalLineItemAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalLineItemAmount", theTotalLineItemAmount), currentHashCode, theTotalLineItemAmount, (this.totalLineItemAmount!= null));
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
            BusinessDocumentReferenceType theGovernmentContractIdentifier;
            theGovernmentContractIdentifier = this.getGovernmentContractIdentifier();
            strategy.appendField(locator, this, "governmentContractIdentifier", buffer, theGovernmentContractIdentifier, (this.governmentContractIdentifier!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            MonetaryAmountType thePreTaxAmount;
            thePreTaxAmount = this.getPreTaxAmount();
            strategy.appendField(locator, this, "preTaxAmount", buffer, thePreTaxAmount, (this.preTaxAmount!= null));
        }
        {
            String thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            strategy.appendField(locator, this, "primaryIdentifier", buffer, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            ProductDescriptionType theProductDescription;
            theProductDescription = this.getProductDescription();
            strategy.appendField(locator, this, "productDescription", buffer, theProductDescription, (this.productDescription!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            String theSecondaryIdentifier;
            theSecondaryIdentifier = this.getSecondaryIdentifier();
            strategy.appendField(locator, this, "secondaryIdentifier", buffer, theSecondaryIdentifier, (this.secondaryIdentifier!= null));
        }
        {
            ShipmentTerms theShipmentTerms;
            theShipmentTerms = this.getShipmentTerms();
            strategy.appendField(locator, this, "shipmentTerms", buffer, theShipmentTerms, (this.shipmentTerms!= null));
        }
        {
            MonetaryAmountType theTotalLineItemAmount;
            theTotalLineItemAmount = this.getTotalLineItemAmount();
            strategy.appendField(locator, this, "totalLineItemAmount", buffer, theTotalLineItemAmount, (this.totalLineItemAmount!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
