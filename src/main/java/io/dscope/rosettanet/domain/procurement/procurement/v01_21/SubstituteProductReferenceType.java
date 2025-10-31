
package io.dscope.rosettanet.domain.procurement.procurement.v01_21;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.productsubstitutionreason.v01_02.ProductSubstitutionReason;
import io.dscope.rosettanet.universal.productidentification.v01_02.ProductIdentification;
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
 * <p>Java class for SubstituteProductReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstituteProductReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02}ProductIdentification" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ProductSubstitutionReason:xsd:codelist:01.02}ProductSubstitutionReason"/&gt;
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
@XmlType(name = "SubstituteProductReferenceType", propOrder = {
    "productIdentification",
    "productSubstitutionReason"
})
public class SubstituteProductReferenceType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02", type = ProductIdentification.class)
    protected List<ProductIdentification> productIdentification;
    @XmlElementRef(name = "ProductSubstitutionReason", namespace = "urn:rosettanet:specification:domain:Procurement:ProductSubstitutionReason:xsd:codelist:01.02", type = ProductSubstitutionReason.class)
    protected ProductSubstitutionReason productSubstitutionReason;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the productIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentification }
     * 
     * 
     */
    public List<ProductIdentification> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<ProductIdentification>();
        }
        return this.productIdentification;
    }

    /**
     * Gets the value of the productSubstitutionReason property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSubstitutionReason }
     *     
     */
    public ProductSubstitutionReason getProductSubstitutionReason() {
        return productSubstitutionReason;
    }

    /**
     * Sets the value of the productSubstitutionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSubstitutionReason }
     *     
     */
    public void setProductSubstitutionReason(ProductSubstitutionReason value) {
        this.productSubstitutionReason = value;
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
        final SubstituteProductReferenceType that = ((SubstituteProductReferenceType) object);
        {
            List<ProductIdentification> lhsProductIdentification;
            lhsProductIdentification = (((this.productIdentification!= null)&&(!this.productIdentification.isEmpty()))?this.getProductIdentification():null);
            List<ProductIdentification> rhsProductIdentification;
            rhsProductIdentification = (((that.productIdentification!= null)&&(!that.productIdentification.isEmpty()))?that.getProductIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentification", lhsProductIdentification), LocatorUtils.property(thatLocator, "productIdentification", rhsProductIdentification), lhsProductIdentification, rhsProductIdentification, ((this.productIdentification!= null)&&(!this.productIdentification.isEmpty())), ((that.productIdentification!= null)&&(!that.productIdentification.isEmpty())))) {
                return false;
            }
        }
        {
            ProductSubstitutionReason lhsProductSubstitutionReason;
            lhsProductSubstitutionReason = this.getProductSubstitutionReason();
            ProductSubstitutionReason rhsProductSubstitutionReason;
            rhsProductSubstitutionReason = that.getProductSubstitutionReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productSubstitutionReason", lhsProductSubstitutionReason), LocatorUtils.property(thatLocator, "productSubstitutionReason", rhsProductSubstitutionReason), lhsProductSubstitutionReason, rhsProductSubstitutionReason, (this.productSubstitutionReason!= null), (that.productSubstitutionReason!= null))) {
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
            List<ProductIdentification> theProductIdentification;
            theProductIdentification = (((this.productIdentification!= null)&&(!this.productIdentification.isEmpty()))?this.getProductIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, ((this.productIdentification!= null)&&(!this.productIdentification.isEmpty())));
        }
        {
            ProductSubstitutionReason theProductSubstitutionReason;
            theProductSubstitutionReason = this.getProductSubstitutionReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productSubstitutionReason", theProductSubstitutionReason), currentHashCode, theProductSubstitutionReason, (this.productSubstitutionReason!= null));
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
            List<ProductIdentification> theProductIdentification;
            theProductIdentification = (((this.productIdentification!= null)&&(!this.productIdentification.isEmpty()))?this.getProductIdentification():null);
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, ((this.productIdentification!= null)&&(!this.productIdentification.isEmpty())));
        }
        {
            ProductSubstitutionReason theProductSubstitutionReason;
            theProductSubstitutionReason = this.getProductSubstitutionReason();
            strategy.appendField(locator, this, "productSubstitutionReason", buffer, theProductSubstitutionReason, (this.productSubstitutionReason!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
