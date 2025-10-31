
package io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_00;

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
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.IsDesignWin;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.IsSoleSource;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductClassification;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductDescription;
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
 * <p>Java class for ProductIdentificationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}IsDesignWin"/&gt;
 *         &lt;element name="IsGeneric" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}IsSoleSource"/&gt;
 *         &lt;element name="ProductClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductClassification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductDescription"/&gt;
 *         &lt;element name="ProductIdentificationInformation" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.00}ProductIdentificationInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductIdentificationInformationType", propOrder = {
    "isDesignWin",
    "isGeneric",
    "isSoleSource",
    "productClassCode",
    "productClassification",
    "productDescription",
    "productIdentificationInformation"
})
public class ProductIdentificationInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "IsDesignWin", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = IsDesignWin.class)
    protected IsDesignWin isDesignWin;
    @XmlElement(name = "IsGeneric")
    protected boolean isGeneric;
    @XmlElementRef(name = "IsSoleSource", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = IsSoleSource.class)
    protected IsSoleSource isSoleSource;
    @XmlElement(name = "ProductClassCode")
    protected String productClassCode;
    @XmlElementRef(name = "ProductClassification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ProductClassification.class, required = false)
    protected ProductClassification productClassification;
    @XmlElementRef(name = "ProductDescription", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductDescription.class)
    protected ProductDescription productDescription;
    @XmlElement(name = "ProductIdentificationInformation")
    protected List<ProductIdentificationInformationType> productIdentificationInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isDesignWin property.
     * 
     * @return
     *     possible object is
     *     {@link IsDesignWin }
     *     
     */
    public IsDesignWin getIsDesignWin() {
        return isDesignWin;
    }

    /**
     * Sets the value of the isDesignWin property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsDesignWin }
     *     
     */
    public void setIsDesignWin(IsDesignWin value) {
        this.isDesignWin = value;
    }

    /**
     * Gets the value of the isGeneric property.
     * 
     */
    public boolean isIsGeneric() {
        return isGeneric;
    }

    /**
     * Sets the value of the isGeneric property.
     * 
     */
    public void setIsGeneric(boolean value) {
        this.isGeneric = value;
    }

    /**
     * Gets the value of the isSoleSource property.
     * 
     * @return
     *     possible object is
     *     {@link IsSoleSource }
     *     
     */
    public IsSoleSource getIsSoleSource() {
        return isSoleSource;
    }

    /**
     * Sets the value of the isSoleSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsSoleSource }
     *     
     */
    public void setIsSoleSource(IsSoleSource value) {
        this.isSoleSource = value;
    }

    /**
     * Gets the value of the productClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClassCode() {
        return productClassCode;
    }

    /**
     * Sets the value of the productClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClassCode(String value) {
        this.productClassCode = value;
    }

    /**
     * Gets the value of the productClassification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductClassification }
     *     
     */
    public ProductClassification getProductClassification() {
        return productClassification;
    }

    /**
     * Sets the value of the productClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductClassification }
     *     
     */
    public void setProductClassification(ProductClassification value) {
        this.productClassification = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDescription }
     *     
     */
    public ProductDescription getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDescription }
     *     
     */
    public void setProductDescription(ProductDescription value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productIdentificationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentificationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentificationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationInformationType }
     * 
     * 
     */
    public List<ProductIdentificationInformationType> getProductIdentificationInformation() {
        if (productIdentificationInformation == null) {
            productIdentificationInformation = new ArrayList<ProductIdentificationInformationType>();
        }
        return this.productIdentificationInformation;
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
        final ProductIdentificationInformationType that = ((ProductIdentificationInformationType) object);
        {
            IsDesignWin lhsIsDesignWin;
            lhsIsDesignWin = this.getIsDesignWin();
            IsDesignWin rhsIsDesignWin;
            rhsIsDesignWin = that.getIsDesignWin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isDesignWin", lhsIsDesignWin), LocatorUtils.property(thatLocator, "isDesignWin", rhsIsDesignWin), lhsIsDesignWin, rhsIsDesignWin, (this.isDesignWin!= null), (that.isDesignWin!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsGeneric;
            lhsIsGeneric = this.isIsGeneric();
            boolean rhsIsGeneric;
            rhsIsGeneric = that.isIsGeneric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isGeneric", lhsIsGeneric), LocatorUtils.property(thatLocator, "isGeneric", rhsIsGeneric), lhsIsGeneric, rhsIsGeneric, true, true)) {
                return false;
            }
        }
        {
            IsSoleSource lhsIsSoleSource;
            lhsIsSoleSource = this.getIsSoleSource();
            IsSoleSource rhsIsSoleSource;
            rhsIsSoleSource = that.getIsSoleSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isSoleSource", lhsIsSoleSource), LocatorUtils.property(thatLocator, "isSoleSource", rhsIsSoleSource), lhsIsSoleSource, rhsIsSoleSource, (this.isSoleSource!= null), (that.isSoleSource!= null))) {
                return false;
            }
        }
        {
            String lhsProductClassCode;
            lhsProductClassCode = this.getProductClassCode();
            String rhsProductClassCode;
            rhsProductClassCode = that.getProductClassCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productClassCode", lhsProductClassCode), LocatorUtils.property(thatLocator, "productClassCode", rhsProductClassCode), lhsProductClassCode, rhsProductClassCode, (this.productClassCode!= null), (that.productClassCode!= null))) {
                return false;
            }
        }
        {
            ProductClassification lhsProductClassification;
            lhsProductClassification = this.getProductClassification();
            ProductClassification rhsProductClassification;
            rhsProductClassification = that.getProductClassification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productClassification", lhsProductClassification), LocatorUtils.property(thatLocator, "productClassification", rhsProductClassification), lhsProductClassification, rhsProductClassification, (this.productClassification!= null), (that.productClassification!= null))) {
                return false;
            }
        }
        {
            ProductDescription lhsProductDescription;
            lhsProductDescription = this.getProductDescription();
            ProductDescription rhsProductDescription;
            rhsProductDescription = that.getProductDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productDescription", lhsProductDescription), LocatorUtils.property(thatLocator, "productDescription", rhsProductDescription), lhsProductDescription, rhsProductDescription, (this.productDescription!= null), (that.productDescription!= null))) {
                return false;
            }
        }
        {
            List<ProductIdentificationInformationType> lhsProductIdentificationInformation;
            lhsProductIdentificationInformation = (((this.productIdentificationInformation!= null)&&(!this.productIdentificationInformation.isEmpty()))?this.getProductIdentificationInformation():null);
            List<ProductIdentificationInformationType> rhsProductIdentificationInformation;
            rhsProductIdentificationInformation = (((that.productIdentificationInformation!= null)&&(!that.productIdentificationInformation.isEmpty()))?that.getProductIdentificationInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentificationInformation", lhsProductIdentificationInformation), LocatorUtils.property(thatLocator, "productIdentificationInformation", rhsProductIdentificationInformation), lhsProductIdentificationInformation, rhsProductIdentificationInformation, ((this.productIdentificationInformation!= null)&&(!this.productIdentificationInformation.isEmpty())), ((that.productIdentificationInformation!= null)&&(!that.productIdentificationInformation.isEmpty())))) {
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
            IsDesignWin theIsDesignWin;
            theIsDesignWin = this.getIsDesignWin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isDesignWin", theIsDesignWin), currentHashCode, theIsDesignWin, (this.isDesignWin!= null));
        }
        {
            boolean theIsGeneric;
            theIsGeneric = this.isIsGeneric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isGeneric", theIsGeneric), currentHashCode, theIsGeneric, true);
        }
        {
            IsSoleSource theIsSoleSource;
            theIsSoleSource = this.getIsSoleSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isSoleSource", theIsSoleSource), currentHashCode, theIsSoleSource, (this.isSoleSource!= null));
        }
        {
            String theProductClassCode;
            theProductClassCode = this.getProductClassCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productClassCode", theProductClassCode), currentHashCode, theProductClassCode, (this.productClassCode!= null));
        }
        {
            ProductClassification theProductClassification;
            theProductClassification = this.getProductClassification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productClassification", theProductClassification), currentHashCode, theProductClassification, (this.productClassification!= null));
        }
        {
            ProductDescription theProductDescription;
            theProductDescription = this.getProductDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productDescription", theProductDescription), currentHashCode, theProductDescription, (this.productDescription!= null));
        }
        {
            List<ProductIdentificationInformationType> theProductIdentificationInformation;
            theProductIdentificationInformation = (((this.productIdentificationInformation!= null)&&(!this.productIdentificationInformation.isEmpty()))?this.getProductIdentificationInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentificationInformation", theProductIdentificationInformation), currentHashCode, theProductIdentificationInformation, ((this.productIdentificationInformation!= null)&&(!this.productIdentificationInformation.isEmpty())));
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
            IsDesignWin theIsDesignWin;
            theIsDesignWin = this.getIsDesignWin();
            strategy.appendField(locator, this, "isDesignWin", buffer, theIsDesignWin, (this.isDesignWin!= null));
        }
        {
            boolean theIsGeneric;
            theIsGeneric = this.isIsGeneric();
            strategy.appendField(locator, this, "isGeneric", buffer, theIsGeneric, true);
        }
        {
            IsSoleSource theIsSoleSource;
            theIsSoleSource = this.getIsSoleSource();
            strategy.appendField(locator, this, "isSoleSource", buffer, theIsSoleSource, (this.isSoleSource!= null));
        }
        {
            String theProductClassCode;
            theProductClassCode = this.getProductClassCode();
            strategy.appendField(locator, this, "productClassCode", buffer, theProductClassCode, (this.productClassCode!= null));
        }
        {
            ProductClassification theProductClassification;
            theProductClassification = this.getProductClassification();
            strategy.appendField(locator, this, "productClassification", buffer, theProductClassification, (this.productClassification!= null));
        }
        {
            ProductDescription theProductDescription;
            theProductDescription = this.getProductDescription();
            strategy.appendField(locator, this, "productDescription", buffer, theProductDescription, (this.productDescription!= null));
        }
        {
            List<ProductIdentificationInformationType> theProductIdentificationInformation;
            theProductIdentificationInformation = (((this.productIdentificationInformation!= null)&&(!this.productIdentificationInformation.isEmpty()))?this.getProductIdentificationInformation():null);
            strategy.appendField(locator, this, "productIdentificationInformation", buffer, theProductIdentificationInformation, ((this.productIdentificationInformation!= null)&&(!this.productIdentificationInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
