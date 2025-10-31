
package io.dscope.rosettanet.interchange.priceandavailabilityresponse.v01_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.customerauthorizationcode.v01_03.CustomerAuthorizationCode;
import io.dscope.rosettanet.domain.procurement.codelist.productavailabilitycode.v01_03.ProductAvailabilityCode;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.StepPricing;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.SubstituteProductReference;
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
 * <p>Java class for AdditionalProductPriceAndAvailabilityLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductPriceAndAvailabilityLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:CustomerAuthorizationCode:xsd:codelist:01.03}CustomerAuthorizationCode" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ManufacturerMinimumPackageQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="PackingQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ProductAvailabilityCode:xsd:codelist:01.03}ProductAvailabilityCode" minOccurs="0"/&gt;
 *         &lt;element name="SmallestPackingQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}StepPricing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}SubstituteProductReference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AdditionalProductPriceAndAvailabilityLineItemType", propOrder = {
    "customerAuthorizationCode",
    "description",
    "manufacturerMinimumPackageQuantity",
    "packingQuantity",
    "productAvailabilityCode",
    "smallestPackingQuantity",
    "stepPricing",
    "substituteProductReference"
})
public class AdditionalProductPriceAndAvailabilityLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "CustomerAuthorizationCode", namespace = "urn:rosettanet:specification:domain:Procurement:CustomerAuthorizationCode:xsd:codelist:01.03", type = CustomerAuthorizationCode.class, required = false)
    protected CustomerAuthorizationCode customerAuthorizationCode;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "ManufacturerMinimumPackageQuantity")
    protected Float manufacturerMinimumPackageQuantity;
    @XmlElement(name = "PackingQuantity")
    protected Float packingQuantity;
    @XmlElementRef(name = "ProductAvailabilityCode", namespace = "urn:rosettanet:specification:domain:Procurement:ProductAvailabilityCode:xsd:codelist:01.03", type = ProductAvailabilityCode.class, required = false)
    protected ProductAvailabilityCode productAvailabilityCode;
    @XmlElement(name = "SmallestPackingQuantity")
    protected Float smallestPackingQuantity;
    @XmlElementRef(name = "StepPricing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = StepPricing.class, required = false)
    protected List<StepPricing> stepPricing;
    @XmlElementRef(name = "SubstituteProductReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = SubstituteProductReference.class, required = false)
    protected List<SubstituteProductReference> substituteProductReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customerAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAuthorizationCode }
     *     
     */
    public CustomerAuthorizationCode getCustomerAuthorizationCode() {
        return customerAuthorizationCode;
    }

    /**
     * Sets the value of the customerAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAuthorizationCode }
     *     
     */
    public void setCustomerAuthorizationCode(CustomerAuthorizationCode value) {
        this.customerAuthorizationCode = value;
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
     * Gets the value of the manufacturerMinimumPackageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getManufacturerMinimumPackageQuantity() {
        return manufacturerMinimumPackageQuantity;
    }

    /**
     * Sets the value of the manufacturerMinimumPackageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setManufacturerMinimumPackageQuantity(Float value) {
        this.manufacturerMinimumPackageQuantity = value;
    }

    /**
     * Gets the value of the packingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackingQuantity() {
        return packingQuantity;
    }

    /**
     * Sets the value of the packingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackingQuantity(Float value) {
        this.packingQuantity = value;
    }

    /**
     * Gets the value of the productAvailabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAvailabilityCode }
     *     
     */
    public ProductAvailabilityCode getProductAvailabilityCode() {
        return productAvailabilityCode;
    }

    /**
     * Sets the value of the productAvailabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAvailabilityCode }
     *     
     */
    public void setProductAvailabilityCode(ProductAvailabilityCode value) {
        this.productAvailabilityCode = value;
    }

    /**
     * Gets the value of the smallestPackingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSmallestPackingQuantity() {
        return smallestPackingQuantity;
    }

    /**
     * Sets the value of the smallestPackingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSmallestPackingQuantity(Float value) {
        this.smallestPackingQuantity = value;
    }

    /**
     * Gets the value of the stepPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStepPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StepPricing }
     * 
     * 
     */
    public List<StepPricing> getStepPricing() {
        if (stepPricing == null) {
            stepPricing = new ArrayList<StepPricing>();
        }
        return this.stepPricing;
    }

    /**
     * Gets the value of the substituteProductReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substituteProductReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstituteProductReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstituteProductReference }
     * 
     * 
     */
    public List<SubstituteProductReference> getSubstituteProductReference() {
        if (substituteProductReference == null) {
            substituteProductReference = new ArrayList<SubstituteProductReference>();
        }
        return this.substituteProductReference;
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
        final AdditionalProductPriceAndAvailabilityLineItemType that = ((AdditionalProductPriceAndAvailabilityLineItemType) object);
        {
            CustomerAuthorizationCode lhsCustomerAuthorizationCode;
            lhsCustomerAuthorizationCode = this.getCustomerAuthorizationCode();
            CustomerAuthorizationCode rhsCustomerAuthorizationCode;
            rhsCustomerAuthorizationCode = that.getCustomerAuthorizationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerAuthorizationCode", lhsCustomerAuthorizationCode), LocatorUtils.property(thatLocator, "customerAuthorizationCode", rhsCustomerAuthorizationCode), lhsCustomerAuthorizationCode, rhsCustomerAuthorizationCode, (this.customerAuthorizationCode!= null), (that.customerAuthorizationCode!= null))) {
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
            Float lhsManufacturerMinimumPackageQuantity;
            lhsManufacturerMinimumPackageQuantity = this.getManufacturerMinimumPackageQuantity();
            Float rhsManufacturerMinimumPackageQuantity;
            rhsManufacturerMinimumPackageQuantity = that.getManufacturerMinimumPackageQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturerMinimumPackageQuantity", lhsManufacturerMinimumPackageQuantity), LocatorUtils.property(thatLocator, "manufacturerMinimumPackageQuantity", rhsManufacturerMinimumPackageQuantity), lhsManufacturerMinimumPackageQuantity, rhsManufacturerMinimumPackageQuantity, (this.manufacturerMinimumPackageQuantity!= null), (that.manufacturerMinimumPackageQuantity!= null))) {
                return false;
            }
        }
        {
            Float lhsPackingQuantity;
            lhsPackingQuantity = this.getPackingQuantity();
            Float rhsPackingQuantity;
            rhsPackingQuantity = that.getPackingQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packingQuantity", lhsPackingQuantity), LocatorUtils.property(thatLocator, "packingQuantity", rhsPackingQuantity), lhsPackingQuantity, rhsPackingQuantity, (this.packingQuantity!= null), (that.packingQuantity!= null))) {
                return false;
            }
        }
        {
            ProductAvailabilityCode lhsProductAvailabilityCode;
            lhsProductAvailabilityCode = this.getProductAvailabilityCode();
            ProductAvailabilityCode rhsProductAvailabilityCode;
            rhsProductAvailabilityCode = that.getProductAvailabilityCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productAvailabilityCode", lhsProductAvailabilityCode), LocatorUtils.property(thatLocator, "productAvailabilityCode", rhsProductAvailabilityCode), lhsProductAvailabilityCode, rhsProductAvailabilityCode, (this.productAvailabilityCode!= null), (that.productAvailabilityCode!= null))) {
                return false;
            }
        }
        {
            Float lhsSmallestPackingQuantity;
            lhsSmallestPackingQuantity = this.getSmallestPackingQuantity();
            Float rhsSmallestPackingQuantity;
            rhsSmallestPackingQuantity = that.getSmallestPackingQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "smallestPackingQuantity", lhsSmallestPackingQuantity), LocatorUtils.property(thatLocator, "smallestPackingQuantity", rhsSmallestPackingQuantity), lhsSmallestPackingQuantity, rhsSmallestPackingQuantity, (this.smallestPackingQuantity!= null), (that.smallestPackingQuantity!= null))) {
                return false;
            }
        }
        {
            List<StepPricing> lhsStepPricing;
            lhsStepPricing = (((this.stepPricing!= null)&&(!this.stepPricing.isEmpty()))?this.getStepPricing():null);
            List<StepPricing> rhsStepPricing;
            rhsStepPricing = (((that.stepPricing!= null)&&(!that.stepPricing.isEmpty()))?that.getStepPricing():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stepPricing", lhsStepPricing), LocatorUtils.property(thatLocator, "stepPricing", rhsStepPricing), lhsStepPricing, rhsStepPricing, ((this.stepPricing!= null)&&(!this.stepPricing.isEmpty())), ((that.stepPricing!= null)&&(!that.stepPricing.isEmpty())))) {
                return false;
            }
        }
        {
            List<SubstituteProductReference> lhsSubstituteProductReference;
            lhsSubstituteProductReference = (((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty()))?this.getSubstituteProductReference():null);
            List<SubstituteProductReference> rhsSubstituteProductReference;
            rhsSubstituteProductReference = (((that.substituteProductReference!= null)&&(!that.substituteProductReference.isEmpty()))?that.getSubstituteProductReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substituteProductReference", lhsSubstituteProductReference), LocatorUtils.property(thatLocator, "substituteProductReference", rhsSubstituteProductReference), lhsSubstituteProductReference, rhsSubstituteProductReference, ((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty())), ((that.substituteProductReference!= null)&&(!that.substituteProductReference.isEmpty())))) {
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
            CustomerAuthorizationCode theCustomerAuthorizationCode;
            theCustomerAuthorizationCode = this.getCustomerAuthorizationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerAuthorizationCode", theCustomerAuthorizationCode), currentHashCode, theCustomerAuthorizationCode, (this.customerAuthorizationCode!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            Float theManufacturerMinimumPackageQuantity;
            theManufacturerMinimumPackageQuantity = this.getManufacturerMinimumPackageQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturerMinimumPackageQuantity", theManufacturerMinimumPackageQuantity), currentHashCode, theManufacturerMinimumPackageQuantity, (this.manufacturerMinimumPackageQuantity!= null));
        }
        {
            Float thePackingQuantity;
            thePackingQuantity = this.getPackingQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packingQuantity", thePackingQuantity), currentHashCode, thePackingQuantity, (this.packingQuantity!= null));
        }
        {
            ProductAvailabilityCode theProductAvailabilityCode;
            theProductAvailabilityCode = this.getProductAvailabilityCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productAvailabilityCode", theProductAvailabilityCode), currentHashCode, theProductAvailabilityCode, (this.productAvailabilityCode!= null));
        }
        {
            Float theSmallestPackingQuantity;
            theSmallestPackingQuantity = this.getSmallestPackingQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "smallestPackingQuantity", theSmallestPackingQuantity), currentHashCode, theSmallestPackingQuantity, (this.smallestPackingQuantity!= null));
        }
        {
            List<StepPricing> theStepPricing;
            theStepPricing = (((this.stepPricing!= null)&&(!this.stepPricing.isEmpty()))?this.getStepPricing():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stepPricing", theStepPricing), currentHashCode, theStepPricing, ((this.stepPricing!= null)&&(!this.stepPricing.isEmpty())));
        }
        {
            List<SubstituteProductReference> theSubstituteProductReference;
            theSubstituteProductReference = (((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty()))?this.getSubstituteProductReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substituteProductReference", theSubstituteProductReference), currentHashCode, theSubstituteProductReference, ((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty())));
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
            CustomerAuthorizationCode theCustomerAuthorizationCode;
            theCustomerAuthorizationCode = this.getCustomerAuthorizationCode();
            strategy.appendField(locator, this, "customerAuthorizationCode", buffer, theCustomerAuthorizationCode, (this.customerAuthorizationCode!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            Float theManufacturerMinimumPackageQuantity;
            theManufacturerMinimumPackageQuantity = this.getManufacturerMinimumPackageQuantity();
            strategy.appendField(locator, this, "manufacturerMinimumPackageQuantity", buffer, theManufacturerMinimumPackageQuantity, (this.manufacturerMinimumPackageQuantity!= null));
        }
        {
            Float thePackingQuantity;
            thePackingQuantity = this.getPackingQuantity();
            strategy.appendField(locator, this, "packingQuantity", buffer, thePackingQuantity, (this.packingQuantity!= null));
        }
        {
            ProductAvailabilityCode theProductAvailabilityCode;
            theProductAvailabilityCode = this.getProductAvailabilityCode();
            strategy.appendField(locator, this, "productAvailabilityCode", buffer, theProductAvailabilityCode, (this.productAvailabilityCode!= null));
        }
        {
            Float theSmallestPackingQuantity;
            theSmallestPackingQuantity = this.getSmallestPackingQuantity();
            strategy.appendField(locator, this, "smallestPackingQuantity", buffer, theSmallestPackingQuantity, (this.smallestPackingQuantity!= null));
        }
        {
            List<StepPricing> theStepPricing;
            theStepPricing = (((this.stepPricing!= null)&&(!this.stepPricing.isEmpty()))?this.getStepPricing():null);
            strategy.appendField(locator, this, "stepPricing", buffer, theStepPricing, ((this.stepPricing!= null)&&(!this.stepPricing.isEmpty())));
        }
        {
            List<SubstituteProductReference> theSubstituteProductReference;
            theSubstituteProductReference = (((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty()))?this.getSubstituteProductReference():null);
            strategy.appendField(locator, this, "substituteProductReference", buffer, theSubstituteProductReference, ((this.substituteProductReference!= null)&&(!this.substituteProductReference.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
