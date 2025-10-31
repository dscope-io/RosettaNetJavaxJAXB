
package io.dscope.rosettanet.interchange.warrantyclaimrequest.v01_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.service.v02_20.PurchaseDate;
import io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductSerialIdentification;
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
 * <p>Java class for ServicedUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicedUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsEntitledToWarranty" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsProofOfPurchaseIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductSerialIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}PurchaseDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01}WarrantyType" minOccurs="0"/&gt;
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
@XmlType(name = "ServicedUnitType", propOrder = {
    "isEntitledToWarranty",
    "isProofOfPurchaseIncluded",
    "productSerialIdentification",
    "purchaseDate",
    "warrantyType"
})
public class ServicedUnitType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "IsEntitledToWarranty")
    protected boolean isEntitledToWarranty;
    @XmlElement(name = "IsProofOfPurchaseIncluded")
    protected Boolean isProofOfPurchaseIncluded;
    @XmlElementRef(name = "ProductSerialIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductSerialIdentification.class)
    protected ProductSerialIdentification productSerialIdentification;
    @XmlElementRef(name = "PurchaseDate", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = PurchaseDate.class, required = false)
    protected PurchaseDate purchaseDate;
    @XmlElementRef(name = "WarrantyType", namespace = "urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01", type = WarrantyType.class, required = false)
    protected WarrantyType warrantyType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isEntitledToWarranty property.
     * 
     */
    public boolean isIsEntitledToWarranty() {
        return isEntitledToWarranty;
    }

    /**
     * Sets the value of the isEntitledToWarranty property.
     * 
     */
    public void setIsEntitledToWarranty(boolean value) {
        this.isEntitledToWarranty = value;
    }

    /**
     * Gets the value of the isProofOfPurchaseIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProofOfPurchaseIncluded() {
        return isProofOfPurchaseIncluded;
    }

    /**
     * Sets the value of the isProofOfPurchaseIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProofOfPurchaseIncluded(Boolean value) {
        this.isProofOfPurchaseIncluded = value;
    }

    /**
     * Gets the value of the productSerialIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSerialIdentification }
     *     
     */
    public ProductSerialIdentification getProductSerialIdentification() {
        return productSerialIdentification;
    }

    /**
     * Sets the value of the productSerialIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSerialIdentification }
     *     
     */
    public void setProductSerialIdentification(ProductSerialIdentification value) {
        this.productSerialIdentification = value;
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseDate }
     *     
     */
    public PurchaseDate getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseDate }
     *     
     */
    public void setPurchaseDate(PurchaseDate value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyType }
     *     
     */
    public WarrantyType getWarrantyType() {
        return warrantyType;
    }

    /**
     * Sets the value of the warrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyType }
     *     
     */
    public void setWarrantyType(WarrantyType value) {
        this.warrantyType = value;
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
        final ServicedUnitType that = ((ServicedUnitType) object);
        {
            boolean lhsIsEntitledToWarranty;
            lhsIsEntitledToWarranty = this.isIsEntitledToWarranty();
            boolean rhsIsEntitledToWarranty;
            rhsIsEntitledToWarranty = that.isIsEntitledToWarranty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isEntitledToWarranty", lhsIsEntitledToWarranty), LocatorUtils.property(thatLocator, "isEntitledToWarranty", rhsIsEntitledToWarranty), lhsIsEntitledToWarranty, rhsIsEntitledToWarranty, true, true)) {
                return false;
            }
        }
        {
            Boolean lhsIsProofOfPurchaseIncluded;
            lhsIsProofOfPurchaseIncluded = this.isIsProofOfPurchaseIncluded();
            Boolean rhsIsProofOfPurchaseIncluded;
            rhsIsProofOfPurchaseIncluded = that.isIsProofOfPurchaseIncluded();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isProofOfPurchaseIncluded", lhsIsProofOfPurchaseIncluded), LocatorUtils.property(thatLocator, "isProofOfPurchaseIncluded", rhsIsProofOfPurchaseIncluded), lhsIsProofOfPurchaseIncluded, rhsIsProofOfPurchaseIncluded, (this.isProofOfPurchaseIncluded!= null), (that.isProofOfPurchaseIncluded!= null))) {
                return false;
            }
        }
        {
            ProductSerialIdentification lhsProductSerialIdentification;
            lhsProductSerialIdentification = this.getProductSerialIdentification();
            ProductSerialIdentification rhsProductSerialIdentification;
            rhsProductSerialIdentification = that.getProductSerialIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productSerialIdentification", lhsProductSerialIdentification), LocatorUtils.property(thatLocator, "productSerialIdentification", rhsProductSerialIdentification), lhsProductSerialIdentification, rhsProductSerialIdentification, (this.productSerialIdentification!= null), (that.productSerialIdentification!= null))) {
                return false;
            }
        }
        {
            PurchaseDate lhsPurchaseDate;
            lhsPurchaseDate = this.getPurchaseDate();
            PurchaseDate rhsPurchaseDate;
            rhsPurchaseDate = that.getPurchaseDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseDate", lhsPurchaseDate), LocatorUtils.property(thatLocator, "purchaseDate", rhsPurchaseDate), lhsPurchaseDate, rhsPurchaseDate, (this.purchaseDate!= null), (that.purchaseDate!= null))) {
                return false;
            }
        }
        {
            WarrantyType lhsWarrantyType;
            lhsWarrantyType = this.getWarrantyType();
            WarrantyType rhsWarrantyType;
            rhsWarrantyType = that.getWarrantyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyType", lhsWarrantyType), LocatorUtils.property(thatLocator, "warrantyType", rhsWarrantyType), lhsWarrantyType, rhsWarrantyType, (this.warrantyType!= null), (that.warrantyType!= null))) {
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
            boolean theIsEntitledToWarranty;
            theIsEntitledToWarranty = this.isIsEntitledToWarranty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isEntitledToWarranty", theIsEntitledToWarranty), currentHashCode, theIsEntitledToWarranty, true);
        }
        {
            Boolean theIsProofOfPurchaseIncluded;
            theIsProofOfPurchaseIncluded = this.isIsProofOfPurchaseIncluded();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isProofOfPurchaseIncluded", theIsProofOfPurchaseIncluded), currentHashCode, theIsProofOfPurchaseIncluded, (this.isProofOfPurchaseIncluded!= null));
        }
        {
            ProductSerialIdentification theProductSerialIdentification;
            theProductSerialIdentification = this.getProductSerialIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productSerialIdentification", theProductSerialIdentification), currentHashCode, theProductSerialIdentification, (this.productSerialIdentification!= null));
        }
        {
            PurchaseDate thePurchaseDate;
            thePurchaseDate = this.getPurchaseDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseDate", thePurchaseDate), currentHashCode, thePurchaseDate, (this.purchaseDate!= null));
        }
        {
            WarrantyType theWarrantyType;
            theWarrantyType = this.getWarrantyType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyType", theWarrantyType), currentHashCode, theWarrantyType, (this.warrantyType!= null));
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
            boolean theIsEntitledToWarranty;
            theIsEntitledToWarranty = this.isIsEntitledToWarranty();
            strategy.appendField(locator, this, "isEntitledToWarranty", buffer, theIsEntitledToWarranty, true);
        }
        {
            Boolean theIsProofOfPurchaseIncluded;
            theIsProofOfPurchaseIncluded = this.isIsProofOfPurchaseIncluded();
            strategy.appendField(locator, this, "isProofOfPurchaseIncluded", buffer, theIsProofOfPurchaseIncluded, (this.isProofOfPurchaseIncluded!= null));
        }
        {
            ProductSerialIdentification theProductSerialIdentification;
            theProductSerialIdentification = this.getProductSerialIdentification();
            strategy.appendField(locator, this, "productSerialIdentification", buffer, theProductSerialIdentification, (this.productSerialIdentification!= null));
        }
        {
            PurchaseDate thePurchaseDate;
            thePurchaseDate = this.getPurchaseDate();
            strategy.appendField(locator, this, "purchaseDate", buffer, thePurchaseDate, (this.purchaseDate!= null));
        }
        {
            WarrantyType theWarrantyType;
            theWarrantyType = this.getWarrantyType();
            strategy.appendField(locator, this, "warrantyType", buffer, theWarrantyType, (this.warrantyType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
