
package io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_01;

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
import io.dscope.rosettanet.domain.service.service.v02_20.PurchaseDate;
import io.dscope.rosettanet.domain.service.service.v02_20.WarrantyInformation;
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
 * <p>Java class for PartInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsPartValidForThisUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturingDateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}PurchaseDate" minOccurs="0"/&gt;
 *         &lt;element name="StatusInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponse:xsd:schema:01.01}StatusInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}WarrantyInformation" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "PartInformationType", propOrder = {
    "isPartValidForThisUnit",
    "manufacturingDateCode",
    "productIdentification",
    "purchaseDate",
    "statusInformation",
    "warrantyInformation"
})
public class PartInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "IsPartValidForThisUnit")
    protected Boolean isPartValidForThisUnit;
    @XmlElement(name = "ManufacturingDateCode")
    protected String manufacturingDateCode;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "PurchaseDate", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = PurchaseDate.class, required = false)
    protected PurchaseDate purchaseDate;
    @XmlElement(name = "StatusInformation")
    protected List<StatusInformationType> statusInformation;
    @XmlElementRef(name = "WarrantyInformation", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = WarrantyInformation.class)
    protected List<WarrantyInformation> warrantyInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isPartValidForThisUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartValidForThisUnit() {
        return isPartValidForThisUnit;
    }

    /**
     * Sets the value of the isPartValidForThisUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartValidForThisUnit(Boolean value) {
        this.isPartValidForThisUnit = value;
    }

    /**
     * Gets the value of the manufacturingDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingDateCode() {
        return manufacturingDateCode;
    }

    /**
     * Sets the value of the manufacturingDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingDateCode(String value) {
        this.manufacturingDateCode = value;
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
     * Gets the value of the statusInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusInformationType }
     * 
     * 
     */
    public List<StatusInformationType> getStatusInformation() {
        if (statusInformation == null) {
            statusInformation = new ArrayList<StatusInformationType>();
        }
        return this.statusInformation;
    }

    /**
     * Gets the value of the warrantyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarrantyInformation }
     * 
     * 
     */
    public List<WarrantyInformation> getWarrantyInformation() {
        if (warrantyInformation == null) {
            warrantyInformation = new ArrayList<WarrantyInformation>();
        }
        return this.warrantyInformation;
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
        final PartInformationType that = ((PartInformationType) object);
        {
            Boolean lhsIsPartValidForThisUnit;
            lhsIsPartValidForThisUnit = this.isIsPartValidForThisUnit();
            Boolean rhsIsPartValidForThisUnit;
            rhsIsPartValidForThisUnit = that.isIsPartValidForThisUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isPartValidForThisUnit", lhsIsPartValidForThisUnit), LocatorUtils.property(thatLocator, "isPartValidForThisUnit", rhsIsPartValidForThisUnit), lhsIsPartValidForThisUnit, rhsIsPartValidForThisUnit, (this.isPartValidForThisUnit!= null), (that.isPartValidForThisUnit!= null))) {
                return false;
            }
        }
        {
            String lhsManufacturingDateCode;
            lhsManufacturingDateCode = this.getManufacturingDateCode();
            String rhsManufacturingDateCode;
            rhsManufacturingDateCode = that.getManufacturingDateCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturingDateCode", lhsManufacturingDateCode), LocatorUtils.property(thatLocator, "manufacturingDateCode", rhsManufacturingDateCode), lhsManufacturingDateCode, rhsManufacturingDateCode, (this.manufacturingDateCode!= null), (that.manufacturingDateCode!= null))) {
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
            PurchaseDate lhsPurchaseDate;
            lhsPurchaseDate = this.getPurchaseDate();
            PurchaseDate rhsPurchaseDate;
            rhsPurchaseDate = that.getPurchaseDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseDate", lhsPurchaseDate), LocatorUtils.property(thatLocator, "purchaseDate", rhsPurchaseDate), lhsPurchaseDate, rhsPurchaseDate, (this.purchaseDate!= null), (that.purchaseDate!= null))) {
                return false;
            }
        }
        {
            List<StatusInformationType> lhsStatusInformation;
            lhsStatusInformation = (((this.statusInformation!= null)&&(!this.statusInformation.isEmpty()))?this.getStatusInformation():null);
            List<StatusInformationType> rhsStatusInformation;
            rhsStatusInformation = (((that.statusInformation!= null)&&(!that.statusInformation.isEmpty()))?that.getStatusInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusInformation", lhsStatusInformation), LocatorUtils.property(thatLocator, "statusInformation", rhsStatusInformation), lhsStatusInformation, rhsStatusInformation, ((this.statusInformation!= null)&&(!this.statusInformation.isEmpty())), ((that.statusInformation!= null)&&(!that.statusInformation.isEmpty())))) {
                return false;
            }
        }
        {
            List<WarrantyInformation> lhsWarrantyInformation;
            lhsWarrantyInformation = (((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty()))?this.getWarrantyInformation():null);
            List<WarrantyInformation> rhsWarrantyInformation;
            rhsWarrantyInformation = (((that.warrantyInformation!= null)&&(!that.warrantyInformation.isEmpty()))?that.getWarrantyInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyInformation", lhsWarrantyInformation), LocatorUtils.property(thatLocator, "warrantyInformation", rhsWarrantyInformation), lhsWarrantyInformation, rhsWarrantyInformation, ((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty())), ((that.warrantyInformation!= null)&&(!that.warrantyInformation.isEmpty())))) {
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
            Boolean theIsPartValidForThisUnit;
            theIsPartValidForThisUnit = this.isIsPartValidForThisUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isPartValidForThisUnit", theIsPartValidForThisUnit), currentHashCode, theIsPartValidForThisUnit, (this.isPartValidForThisUnit!= null));
        }
        {
            String theManufacturingDateCode;
            theManufacturingDateCode = this.getManufacturingDateCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturingDateCode", theManufacturingDateCode), currentHashCode, theManufacturingDateCode, (this.manufacturingDateCode!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            PurchaseDate thePurchaseDate;
            thePurchaseDate = this.getPurchaseDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseDate", thePurchaseDate), currentHashCode, thePurchaseDate, (this.purchaseDate!= null));
        }
        {
            List<StatusInformationType> theStatusInformation;
            theStatusInformation = (((this.statusInformation!= null)&&(!this.statusInformation.isEmpty()))?this.getStatusInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusInformation", theStatusInformation), currentHashCode, theStatusInformation, ((this.statusInformation!= null)&&(!this.statusInformation.isEmpty())));
        }
        {
            List<WarrantyInformation> theWarrantyInformation;
            theWarrantyInformation = (((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty()))?this.getWarrantyInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyInformation", theWarrantyInformation), currentHashCode, theWarrantyInformation, ((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty())));
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
            Boolean theIsPartValidForThisUnit;
            theIsPartValidForThisUnit = this.isIsPartValidForThisUnit();
            strategy.appendField(locator, this, "isPartValidForThisUnit", buffer, theIsPartValidForThisUnit, (this.isPartValidForThisUnit!= null));
        }
        {
            String theManufacturingDateCode;
            theManufacturingDateCode = this.getManufacturingDateCode();
            strategy.appendField(locator, this, "manufacturingDateCode", buffer, theManufacturingDateCode, (this.manufacturingDateCode!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            PurchaseDate thePurchaseDate;
            thePurchaseDate = this.getPurchaseDate();
            strategy.appendField(locator, this, "purchaseDate", buffer, thePurchaseDate, (this.purchaseDate!= null));
        }
        {
            List<StatusInformationType> theStatusInformation;
            theStatusInformation = (((this.statusInformation!= null)&&(!this.statusInformation.isEmpty()))?this.getStatusInformation():null);
            strategy.appendField(locator, this, "statusInformation", buffer, theStatusInformation, ((this.statusInformation!= null)&&(!this.statusInformation.isEmpty())));
        }
        {
            List<WarrantyInformation> theWarrantyInformation;
            theWarrantyInformation = (((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty()))?this.getWarrantyInformation():null);
            strategy.appendField(locator, this, "warrantyInformation", buffer, theWarrantyInformation, ((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
