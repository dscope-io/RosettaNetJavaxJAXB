
package io.dscope.rosettanet.interchange.inventoryreportdistribution.v02_00;

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
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_12.PartnerDescription;
import io.dscope.rosettanet.universal.partneridentification.v01_12.SpecifiedKnownPartnerType;
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
 * <p>Java class for InventoryReportLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryReportLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IntraCompanyTransfer" type="{urn:rosettanet:specification:interchange:InventoryReportDistribution:xsd:schema:02.00}IntraCompanyTransferType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InventoryOwner" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedKnownPartnerType" minOccurs="0"/&gt;
 *         &lt;element name="InventoryProductQuantity" type="{urn:rosettanet:specification:interchange:InventoryReportDistribution:xsd:schema:02.00}InventoryProductQuantityType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
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
@XmlType(name = "InventoryReportLineItemType", propOrder = {
    "businessDocumentReference",
    "intraCompanyTransfer",
    "inventoryOwner",
    "inventoryProductQuantity",
    "partnerDescription",
    "productIdentification",
    "unitOfMeasure"
})
public class InventoryReportLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "IntraCompanyTransfer")
    protected List<IntraCompanyTransferType> intraCompanyTransfer;
    @XmlElement(name = "InventoryOwner")
    protected SpecifiedKnownPartnerType inventoryOwner;
    @XmlElement(name = "InventoryProductQuantity", required = true)
    protected List<InventoryProductQuantityType> inventoryProductQuantity;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
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
     * Gets the value of the intraCompanyTransfer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intraCompanyTransfer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntraCompanyTransfer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraCompanyTransferType }
     * 
     * 
     */
    public List<IntraCompanyTransferType> getIntraCompanyTransfer() {
        if (intraCompanyTransfer == null) {
            intraCompanyTransfer = new ArrayList<IntraCompanyTransferType>();
        }
        return this.intraCompanyTransfer;
    }

    /**
     * Gets the value of the inventoryOwner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedKnownPartnerType }
     *     
     */
    public SpecifiedKnownPartnerType getInventoryOwner() {
        return inventoryOwner;
    }

    /**
     * Sets the value of the inventoryOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedKnownPartnerType }
     *     
     */
    public void setInventoryOwner(SpecifiedKnownPartnerType value) {
        this.inventoryOwner = value;
    }

    /**
     * Gets the value of the inventoryProductQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryProductQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryProductQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryProductQuantityType }
     * 
     * 
     */
    public List<InventoryProductQuantityType> getInventoryProductQuantity() {
        if (inventoryProductQuantity == null) {
            inventoryProductQuantity = new ArrayList<InventoryProductQuantityType>();
        }
        return this.inventoryProductQuantity;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
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
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
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
        final InventoryReportLineItemType that = ((InventoryReportLineItemType) object);
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
            List<IntraCompanyTransferType> lhsIntraCompanyTransfer;
            lhsIntraCompanyTransfer = (((this.intraCompanyTransfer!= null)&&(!this.intraCompanyTransfer.isEmpty()))?this.getIntraCompanyTransfer():null);
            List<IntraCompanyTransferType> rhsIntraCompanyTransfer;
            rhsIntraCompanyTransfer = (((that.intraCompanyTransfer!= null)&&(!that.intraCompanyTransfer.isEmpty()))?that.getIntraCompanyTransfer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intraCompanyTransfer", lhsIntraCompanyTransfer), LocatorUtils.property(thatLocator, "intraCompanyTransfer", rhsIntraCompanyTransfer), lhsIntraCompanyTransfer, rhsIntraCompanyTransfer, ((this.intraCompanyTransfer!= null)&&(!this.intraCompanyTransfer.isEmpty())), ((that.intraCompanyTransfer!= null)&&(!that.intraCompanyTransfer.isEmpty())))) {
                return false;
            }
        }
        {
            SpecifiedKnownPartnerType lhsInventoryOwner;
            lhsInventoryOwner = this.getInventoryOwner();
            SpecifiedKnownPartnerType rhsInventoryOwner;
            rhsInventoryOwner = that.getInventoryOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inventoryOwner", lhsInventoryOwner), LocatorUtils.property(thatLocator, "inventoryOwner", rhsInventoryOwner), lhsInventoryOwner, rhsInventoryOwner, (this.inventoryOwner!= null), (that.inventoryOwner!= null))) {
                return false;
            }
        }
        {
            List<InventoryProductQuantityType> lhsInventoryProductQuantity;
            lhsInventoryProductQuantity = (((this.inventoryProductQuantity!= null)&&(!this.inventoryProductQuantity.isEmpty()))?this.getInventoryProductQuantity():null);
            List<InventoryProductQuantityType> rhsInventoryProductQuantity;
            rhsInventoryProductQuantity = (((that.inventoryProductQuantity!= null)&&(!that.inventoryProductQuantity.isEmpty()))?that.getInventoryProductQuantity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inventoryProductQuantity", lhsInventoryProductQuantity), LocatorUtils.property(thatLocator, "inventoryProductQuantity", rhsInventoryProductQuantity), lhsInventoryProductQuantity, rhsInventoryProductQuantity, ((this.inventoryProductQuantity!= null)&&(!this.inventoryProductQuantity.isEmpty())), ((that.inventoryProductQuantity!= null)&&(!that.inventoryProductQuantity.isEmpty())))) {
                return false;
            }
        }
        {
            List<PartnerDescription> lhsPartnerDescription;
            lhsPartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            List<PartnerDescription> rhsPartnerDescription;
            rhsPartnerDescription = (((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty()))?that.getPartnerDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())), ((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty())))) {
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
            UnitOfMeasure lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            UnitOfMeasure rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, (this.unitOfMeasure!= null), (that.unitOfMeasure!= null))) {
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
            List<IntraCompanyTransferType> theIntraCompanyTransfer;
            theIntraCompanyTransfer = (((this.intraCompanyTransfer!= null)&&(!this.intraCompanyTransfer.isEmpty()))?this.getIntraCompanyTransfer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intraCompanyTransfer", theIntraCompanyTransfer), currentHashCode, theIntraCompanyTransfer, ((this.intraCompanyTransfer!= null)&&(!this.intraCompanyTransfer.isEmpty())));
        }
        {
            SpecifiedKnownPartnerType theInventoryOwner;
            theInventoryOwner = this.getInventoryOwner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inventoryOwner", theInventoryOwner), currentHashCode, theInventoryOwner, (this.inventoryOwner!= null));
        }
        {
            List<InventoryProductQuantityType> theInventoryProductQuantity;
            theInventoryProductQuantity = (((this.inventoryProductQuantity!= null)&&(!this.inventoryProductQuantity.isEmpty()))?this.getInventoryProductQuantity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inventoryProductQuantity", theInventoryProductQuantity), currentHashCode, theInventoryProductQuantity, ((this.inventoryProductQuantity!= null)&&(!this.inventoryProductQuantity.isEmpty())));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
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
            List<IntraCompanyTransferType> theIntraCompanyTransfer;
            theIntraCompanyTransfer = (((this.intraCompanyTransfer!= null)&&(!this.intraCompanyTransfer.isEmpty()))?this.getIntraCompanyTransfer():null);
            strategy.appendField(locator, this, "intraCompanyTransfer", buffer, theIntraCompanyTransfer, ((this.intraCompanyTransfer!= null)&&(!this.intraCompanyTransfer.isEmpty())));
        }
        {
            SpecifiedKnownPartnerType theInventoryOwner;
            theInventoryOwner = this.getInventoryOwner();
            strategy.appendField(locator, this, "inventoryOwner", buffer, theInventoryOwner, (this.inventoryOwner!= null));
        }
        {
            List<InventoryProductQuantityType> theInventoryProductQuantity;
            theInventoryProductQuantity = (((this.inventoryProductQuantity!= null)&&(!this.inventoryProductQuantity.isEmpty()))?this.getInventoryProductQuantity():null);
            strategy.appendField(locator, this, "inventoryProductQuantity", buffer, theInventoryProductQuantity, ((this.inventoryProductQuantity!= null)&&(!this.inventoryProductQuantity.isEmpty())));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
