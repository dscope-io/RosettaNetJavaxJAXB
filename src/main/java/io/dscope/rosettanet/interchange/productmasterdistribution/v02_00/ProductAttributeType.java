
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
import io.dscope.rosettanet.domain.design.codelist.assemblylevelcode.v01_01.AssemblyLevelCode;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductDescription;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;
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
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dabcc="urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02" xmlns:dalc="urn:rosettanet:specification:domain:Design:AssemblyLevelCode:xsd:codelist:01.01" xmlns:dds="urn:rosettanet:specification:domain:Design:xsd:schema:02.15" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17" xmlns:dppt="urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03" xmlns:p841174_="http://annox.dev.java.net" xmlns:p861132_="http://java.sun.com/xml/ns/jaxb" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.10" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16" xmlns:tns="urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.03" xmlns:udt="urn:rosettanet:specification:universal:DataType:xsd:schema:01.04" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductAttribute, if the occurence of CommodityIdentifier is 1 then the occurence of commodityIdentifier/AlternativeIdentifier MUST be between 1 and unbounded.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:AssemblyLevelCode:xsd:codelist:01.01}AssemblyLevelCode"/&gt;
 *         &lt;element name="CommodityIdentifier" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="IsGeneric" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductDescription"/&gt;
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
@XmlType(name = "ProductAttributeType", propOrder = {
    "assemblyLevelCode",
    "commodityIdentifier",
    "isGeneric",
    "productDescription"
})
public class ProductAttributeType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AssemblyLevelCode", namespace = "urn:rosettanet:specification:domain:Design:AssemblyLevelCode:xsd:codelist:01.01", type = AssemblyLevelCode.class)
    protected AssemblyLevelCode assemblyLevelCode;
    @XmlElement(name = "CommodityIdentifier")
    protected ProductIdentificationType commodityIdentifier;
    @XmlElement(name = "IsGeneric")
    protected boolean isGeneric;
    @XmlElementRef(name = "ProductDescription", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductDescription.class)
    protected ProductDescription productDescription;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the assemblyLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyLevelCode }
     *     
     */
    public AssemblyLevelCode getAssemblyLevelCode() {
        return assemblyLevelCode;
    }

    /**
     * Sets the value of the assemblyLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyLevelCode }
     *     
     */
    public void setAssemblyLevelCode(AssemblyLevelCode value) {
        this.assemblyLevelCode = value;
    }

    /**
     * Gets the value of the commodityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getCommodityIdentifier() {
        return commodityIdentifier;
    }

    /**
     * Sets the value of the commodityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setCommodityIdentifier(ProductIdentificationType value) {
        this.commodityIdentifier = value;
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
        final ProductAttributeType that = ((ProductAttributeType) object);
        {
            AssemblyLevelCode lhsAssemblyLevelCode;
            lhsAssemblyLevelCode = this.getAssemblyLevelCode();
            AssemblyLevelCode rhsAssemblyLevelCode;
            rhsAssemblyLevelCode = that.getAssemblyLevelCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assemblyLevelCode", lhsAssemblyLevelCode), LocatorUtils.property(thatLocator, "assemblyLevelCode", rhsAssemblyLevelCode), lhsAssemblyLevelCode, rhsAssemblyLevelCode, (this.assemblyLevelCode!= null), (that.assemblyLevelCode!= null))) {
                return false;
            }
        }
        {
            ProductIdentificationType lhsCommodityIdentifier;
            lhsCommodityIdentifier = this.getCommodityIdentifier();
            ProductIdentificationType rhsCommodityIdentifier;
            rhsCommodityIdentifier = that.getCommodityIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commodityIdentifier", lhsCommodityIdentifier), LocatorUtils.property(thatLocator, "commodityIdentifier", rhsCommodityIdentifier), lhsCommodityIdentifier, rhsCommodityIdentifier, (this.commodityIdentifier!= null), (that.commodityIdentifier!= null))) {
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
            ProductDescription lhsProductDescription;
            lhsProductDescription = this.getProductDescription();
            ProductDescription rhsProductDescription;
            rhsProductDescription = that.getProductDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productDescription", lhsProductDescription), LocatorUtils.property(thatLocator, "productDescription", rhsProductDescription), lhsProductDescription, rhsProductDescription, (this.productDescription!= null), (that.productDescription!= null))) {
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
            AssemblyLevelCode theAssemblyLevelCode;
            theAssemblyLevelCode = this.getAssemblyLevelCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assemblyLevelCode", theAssemblyLevelCode), currentHashCode, theAssemblyLevelCode, (this.assemblyLevelCode!= null));
        }
        {
            ProductIdentificationType theCommodityIdentifier;
            theCommodityIdentifier = this.getCommodityIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commodityIdentifier", theCommodityIdentifier), currentHashCode, theCommodityIdentifier, (this.commodityIdentifier!= null));
        }
        {
            boolean theIsGeneric;
            theIsGeneric = this.isIsGeneric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isGeneric", theIsGeneric), currentHashCode, theIsGeneric, true);
        }
        {
            ProductDescription theProductDescription;
            theProductDescription = this.getProductDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productDescription", theProductDescription), currentHashCode, theProductDescription, (this.productDescription!= null));
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
            AssemblyLevelCode theAssemblyLevelCode;
            theAssemblyLevelCode = this.getAssemblyLevelCode();
            strategy.appendField(locator, this, "assemblyLevelCode", buffer, theAssemblyLevelCode, (this.assemblyLevelCode!= null));
        }
        {
            ProductIdentificationType theCommodityIdentifier;
            theCommodityIdentifier = this.getCommodityIdentifier();
            strategy.appendField(locator, this, "commodityIdentifier", buffer, theCommodityIdentifier, (this.commodityIdentifier!= null));
        }
        {
            boolean theIsGeneric;
            theIsGeneric = this.isIsGeneric();
            strategy.appendField(locator, this, "isGeneric", buffer, theIsGeneric, true);
        }
        {
            ProductDescription theProductDescription;
            theProductDescription = this.getProductDescription();
            strategy.appendField(locator, this, "productDescription", buffer, theProductDescription, (this.productDescription!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
