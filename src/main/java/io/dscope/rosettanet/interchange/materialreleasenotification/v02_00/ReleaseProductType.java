
package io.dscope.rosettanet.interchange.materialreleasenotification.v02_00;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.ManufacturerProfile;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.OrderShippingInformation;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_12.PartnerDescription;
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
 * <p>Java class for ReleaseProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReleaseProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}ManufacturerProfile" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}OrderShippingInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="ProductReleaseSchedule" type="{urn:rosettanet:specification:interchange:MaterialReleaseNotification:xsd:schema:02.00}ProductReleaseScheduleType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ReleaseIdentifierReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ReleaseProductType", propOrder = {
    "lineNumber",
    "manufacturerProfile",
    "orderShippingInformation",
    "partnerDescription",
    "productIdentification",
    "productReleaseSchedule",
    "releaseIdentifierReference",
    "unitOfMeasure"
})
public class ReleaseProductType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "LineNumber")
    protected String lineNumber;
    @XmlElementRef(name = "ManufacturerProfile", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = ManufacturerProfile.class, required = false)
    protected ManufacturerProfile manufacturerProfile;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = OrderShippingInformation.class, required = false)
    protected List<OrderShippingInformation> orderShippingInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProductReleaseSchedule", required = true)
    protected List<ProductReleaseScheduleType> productReleaseSchedule;
    @XmlElement(name = "ReleaseIdentifierReference")
    protected List<BusinessDocumentReferenceType> releaseIdentifierReference;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the manufacturerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturerProfile }
     *     
     */
    public ManufacturerProfile getManufacturerProfile() {
        return manufacturerProfile;
    }

    /**
     * Sets the value of the manufacturerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturerProfile }
     *     
     */
    public void setManufacturerProfile(ManufacturerProfile value) {
        this.manufacturerProfile = value;
    }

    /**
     * Gets the value of the orderShippingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderShippingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderShippingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderShippingInformation }
     * 
     * 
     */
    public List<OrderShippingInformation> getOrderShippingInformation() {
        if (orderShippingInformation == null) {
            orderShippingInformation = new ArrayList<OrderShippingInformation>();
        }
        return this.orderShippingInformation;
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
     * Gets the value of the productReleaseSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productReleaseSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductReleaseSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductReleaseScheduleType }
     * 
     * 
     */
    public List<ProductReleaseScheduleType> getProductReleaseSchedule() {
        if (productReleaseSchedule == null) {
            productReleaseSchedule = new ArrayList<ProductReleaseScheduleType>();
        }
        return this.productReleaseSchedule;
    }

    /**
     * Gets the value of the releaseIdentifierReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the releaseIdentifierReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReleaseIdentifierReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getReleaseIdentifierReference() {
        if (releaseIdentifierReference == null) {
            releaseIdentifierReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.releaseIdentifierReference;
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
        final ReleaseProductType that = ((ReleaseProductType) object);
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
            ManufacturerProfile lhsManufacturerProfile;
            lhsManufacturerProfile = this.getManufacturerProfile();
            ManufacturerProfile rhsManufacturerProfile;
            rhsManufacturerProfile = that.getManufacturerProfile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturerProfile", lhsManufacturerProfile), LocatorUtils.property(thatLocator, "manufacturerProfile", rhsManufacturerProfile), lhsManufacturerProfile, rhsManufacturerProfile, (this.manufacturerProfile!= null), (that.manufacturerProfile!= null))) {
                return false;
            }
        }
        {
            List<OrderShippingInformation> lhsOrderShippingInformation;
            lhsOrderShippingInformation = (((this.orderShippingInformation!= null)&&(!this.orderShippingInformation.isEmpty()))?this.getOrderShippingInformation():null);
            List<OrderShippingInformation> rhsOrderShippingInformation;
            rhsOrderShippingInformation = (((that.orderShippingInformation!= null)&&(!that.orderShippingInformation.isEmpty()))?that.getOrderShippingInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderShippingInformation", lhsOrderShippingInformation), LocatorUtils.property(thatLocator, "orderShippingInformation", rhsOrderShippingInformation), lhsOrderShippingInformation, rhsOrderShippingInformation, ((this.orderShippingInformation!= null)&&(!this.orderShippingInformation.isEmpty())), ((that.orderShippingInformation!= null)&&(!that.orderShippingInformation.isEmpty())))) {
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
            List<ProductReleaseScheduleType> lhsProductReleaseSchedule;
            lhsProductReleaseSchedule = (((this.productReleaseSchedule!= null)&&(!this.productReleaseSchedule.isEmpty()))?this.getProductReleaseSchedule():null);
            List<ProductReleaseScheduleType> rhsProductReleaseSchedule;
            rhsProductReleaseSchedule = (((that.productReleaseSchedule!= null)&&(!that.productReleaseSchedule.isEmpty()))?that.getProductReleaseSchedule():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productReleaseSchedule", lhsProductReleaseSchedule), LocatorUtils.property(thatLocator, "productReleaseSchedule", rhsProductReleaseSchedule), lhsProductReleaseSchedule, rhsProductReleaseSchedule, ((this.productReleaseSchedule!= null)&&(!this.productReleaseSchedule.isEmpty())), ((that.productReleaseSchedule!= null)&&(!that.productReleaseSchedule.isEmpty())))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsReleaseIdentifierReference;
            lhsReleaseIdentifierReference = (((this.releaseIdentifierReference!= null)&&(!this.releaseIdentifierReference.isEmpty()))?this.getReleaseIdentifierReference():null);
            List<BusinessDocumentReferenceType> rhsReleaseIdentifierReference;
            rhsReleaseIdentifierReference = (((that.releaseIdentifierReference!= null)&&(!that.releaseIdentifierReference.isEmpty()))?that.getReleaseIdentifierReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "releaseIdentifierReference", lhsReleaseIdentifierReference), LocatorUtils.property(thatLocator, "releaseIdentifierReference", rhsReleaseIdentifierReference), lhsReleaseIdentifierReference, rhsReleaseIdentifierReference, ((this.releaseIdentifierReference!= null)&&(!this.releaseIdentifierReference.isEmpty())), ((that.releaseIdentifierReference!= null)&&(!that.releaseIdentifierReference.isEmpty())))) {
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
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            ManufacturerProfile theManufacturerProfile;
            theManufacturerProfile = this.getManufacturerProfile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturerProfile", theManufacturerProfile), currentHashCode, theManufacturerProfile, (this.manufacturerProfile!= null));
        }
        {
            List<OrderShippingInformation> theOrderShippingInformation;
            theOrderShippingInformation = (((this.orderShippingInformation!= null)&&(!this.orderShippingInformation.isEmpty()))?this.getOrderShippingInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderShippingInformation", theOrderShippingInformation), currentHashCode, theOrderShippingInformation, ((this.orderShippingInformation!= null)&&(!this.orderShippingInformation.isEmpty())));
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
            List<ProductReleaseScheduleType> theProductReleaseSchedule;
            theProductReleaseSchedule = (((this.productReleaseSchedule!= null)&&(!this.productReleaseSchedule.isEmpty()))?this.getProductReleaseSchedule():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productReleaseSchedule", theProductReleaseSchedule), currentHashCode, theProductReleaseSchedule, ((this.productReleaseSchedule!= null)&&(!this.productReleaseSchedule.isEmpty())));
        }
        {
            List<BusinessDocumentReferenceType> theReleaseIdentifierReference;
            theReleaseIdentifierReference = (((this.releaseIdentifierReference!= null)&&(!this.releaseIdentifierReference.isEmpty()))?this.getReleaseIdentifierReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "releaseIdentifierReference", theReleaseIdentifierReference), currentHashCode, theReleaseIdentifierReference, ((this.releaseIdentifierReference!= null)&&(!this.releaseIdentifierReference.isEmpty())));
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
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            ManufacturerProfile theManufacturerProfile;
            theManufacturerProfile = this.getManufacturerProfile();
            strategy.appendField(locator, this, "manufacturerProfile", buffer, theManufacturerProfile, (this.manufacturerProfile!= null));
        }
        {
            List<OrderShippingInformation> theOrderShippingInformation;
            theOrderShippingInformation = (((this.orderShippingInformation!= null)&&(!this.orderShippingInformation.isEmpty()))?this.getOrderShippingInformation():null);
            strategy.appendField(locator, this, "orderShippingInformation", buffer, theOrderShippingInformation, ((this.orderShippingInformation!= null)&&(!this.orderShippingInformation.isEmpty())));
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
            List<ProductReleaseScheduleType> theProductReleaseSchedule;
            theProductReleaseSchedule = (((this.productReleaseSchedule!= null)&&(!this.productReleaseSchedule.isEmpty()))?this.getProductReleaseSchedule():null);
            strategy.appendField(locator, this, "productReleaseSchedule", buffer, theProductReleaseSchedule, ((this.productReleaseSchedule!= null)&&(!this.productReleaseSchedule.isEmpty())));
        }
        {
            List<BusinessDocumentReferenceType> theReleaseIdentifierReference;
            theReleaseIdentifierReference = (((this.releaseIdentifierReference!= null)&&(!this.releaseIdentifierReference.isEmpty()))?this.getReleaseIdentifierReference():null);
            strategy.appendField(locator, this, "releaseIdentifierReference", buffer, theReleaseIdentifierReference, ((this.releaseIdentifierReference!= null)&&(!this.releaseIdentifierReference.isEmpty())));
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
