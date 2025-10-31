
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductQuantityRange;
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
 * <p>Java class for OrderProvisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProvisionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MultipleOrderQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductQuantityRange"/&gt;
 *         &lt;element name="SampleOrderQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
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
@XmlType(name = "OrderProvisionType", propOrder = {
    "multipleOrderQuantity",
    "productQuantityRange",
    "sampleOrderQuantity"
})
public class OrderProvisionType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "MultipleOrderQuantity")
    protected Float multipleOrderQuantity;
    @XmlElementRef(name = "ProductQuantityRange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ProductQuantityRange.class)
    protected ProductQuantityRange productQuantityRange;
    @XmlElement(name = "SampleOrderQuantity")
    protected Float sampleOrderQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the multipleOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMultipleOrderQuantity() {
        return multipleOrderQuantity;
    }

    /**
     * Sets the value of the multipleOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMultipleOrderQuantity(Float value) {
        this.multipleOrderQuantity = value;
    }

    /**
     * Gets the value of the productQuantityRange property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityRange }
     *     
     */
    public ProductQuantityRange getProductQuantityRange() {
        return productQuantityRange;
    }

    /**
     * Sets the value of the productQuantityRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityRange }
     *     
     */
    public void setProductQuantityRange(ProductQuantityRange value) {
        this.productQuantityRange = value;
    }

    /**
     * Gets the value of the sampleOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSampleOrderQuantity() {
        return sampleOrderQuantity;
    }

    /**
     * Sets the value of the sampleOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSampleOrderQuantity(Float value) {
        this.sampleOrderQuantity = value;
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
        final OrderProvisionType that = ((OrderProvisionType) object);
        {
            Float lhsMultipleOrderQuantity;
            lhsMultipleOrderQuantity = this.getMultipleOrderQuantity();
            Float rhsMultipleOrderQuantity;
            rhsMultipleOrderQuantity = that.getMultipleOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multipleOrderQuantity", lhsMultipleOrderQuantity), LocatorUtils.property(thatLocator, "multipleOrderQuantity", rhsMultipleOrderQuantity), lhsMultipleOrderQuantity, rhsMultipleOrderQuantity, (this.multipleOrderQuantity!= null), (that.multipleOrderQuantity!= null))) {
                return false;
            }
        }
        {
            ProductQuantityRange lhsProductQuantityRange;
            lhsProductQuantityRange = this.getProductQuantityRange();
            ProductQuantityRange rhsProductQuantityRange;
            rhsProductQuantityRange = that.getProductQuantityRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productQuantityRange", lhsProductQuantityRange), LocatorUtils.property(thatLocator, "productQuantityRange", rhsProductQuantityRange), lhsProductQuantityRange, rhsProductQuantityRange, (this.productQuantityRange!= null), (that.productQuantityRange!= null))) {
                return false;
            }
        }
        {
            Float lhsSampleOrderQuantity;
            lhsSampleOrderQuantity = this.getSampleOrderQuantity();
            Float rhsSampleOrderQuantity;
            rhsSampleOrderQuantity = that.getSampleOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sampleOrderQuantity", lhsSampleOrderQuantity), LocatorUtils.property(thatLocator, "sampleOrderQuantity", rhsSampleOrderQuantity), lhsSampleOrderQuantity, rhsSampleOrderQuantity, (this.sampleOrderQuantity!= null), (that.sampleOrderQuantity!= null))) {
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
            Float theMultipleOrderQuantity;
            theMultipleOrderQuantity = this.getMultipleOrderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multipleOrderQuantity", theMultipleOrderQuantity), currentHashCode, theMultipleOrderQuantity, (this.multipleOrderQuantity!= null));
        }
        {
            ProductQuantityRange theProductQuantityRange;
            theProductQuantityRange = this.getProductQuantityRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantityRange", theProductQuantityRange), currentHashCode, theProductQuantityRange, (this.productQuantityRange!= null));
        }
        {
            Float theSampleOrderQuantity;
            theSampleOrderQuantity = this.getSampleOrderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sampleOrderQuantity", theSampleOrderQuantity), currentHashCode, theSampleOrderQuantity, (this.sampleOrderQuantity!= null));
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
            Float theMultipleOrderQuantity;
            theMultipleOrderQuantity = this.getMultipleOrderQuantity();
            strategy.appendField(locator, this, "multipleOrderQuantity", buffer, theMultipleOrderQuantity, (this.multipleOrderQuantity!= null));
        }
        {
            ProductQuantityRange theProductQuantityRange;
            theProductQuantityRange = this.getProductQuantityRange();
            strategy.appendField(locator, this, "productQuantityRange", buffer, theProductQuantityRange, (this.productQuantityRange!= null));
        }
        {
            Float theSampleOrderQuantity;
            theSampleOrderQuantity = this.getSampleOrderQuantity();
            strategy.appendField(locator, this, "sampleOrderQuantity", buffer, theSampleOrderQuantity, (this.sampleOrderQuantity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
