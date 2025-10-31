
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v01_02;

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
import io.dscope.rosettanet.domain.design.design.v01_05.Directive;
import io.dscope.rosettanet.domain.design.design.v01_05.ManufacturingProcessInfo;
import io.dscope.rosettanet.domain.design.design.v01_05.Material;
import io.dscope.rosettanet.domain.design.design.v01_05.ProductMass;
import io.dscope.rosettanet.domain.design.design.v01_05.Subpart;
import io.dscope.rosettanet.domain.design.design.v01_05.Substance;
import io.dscope.rosettanet.universal.partneridentification.v01_03.KnownPartner;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dds="urn:rosettanet:specification:domain:Design:xsd:schema:01.05" xmlns:p318985_="http://annox.dev.java.net" xmlns:p920706_="http://java.sun.com/xml/ns/jaxb" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.06" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:01.02" xmlns:uci="urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.01" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.01" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.03" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductInformation, if the occurence of ProductInformation/IsGeneric is 1 then the value of ProductInformation/IsGeneric MUST be 'true'.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternativeProductIdentifier" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:01.02}ProductIdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:01.02}ConditionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.05}Directive" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DistributionNote" type="{urn:rosettanet:specification:domain:Design:xsd:schema:01.05}NoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsGeneric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.03}KnownPartner" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.05}ManufacturingProcessInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.05}Material" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductIdentifier" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:01.02}ProductIdentifierType"/&gt;
 *         &lt;element name="ProductInformationObject" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:01.02}ProductInformationObjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.05}ProductMass" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.05}Subpart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.05}Substance" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductInformationType", propOrder = {
    "alternativeProductIdentifier",
    "condition",
    "directive",
    "distributionNote",
    "isGeneric",
    "knownPartner",
    "manufacturingProcessInfo",
    "material",
    "productIdentifier",
    "productInformationObject",
    "productMass",
    "subpart",
    "substance"
})
public class ProductInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AlternativeProductIdentifier")
    protected List<ProductIdentifierType> alternativeProductIdentifier;
    @XmlElement(name = "Condition")
    protected List<ConditionType> condition;
    @XmlElementRef(name = "Directive", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.05", type = Directive.class, required = false)
    protected List<Directive> directive;
    @XmlElement(name = "DistributionNote")
    protected List<String> distributionNote;
    @XmlElement(name = "IsGeneric")
    protected Boolean isGeneric;
    @XmlElementRef(name = "KnownPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.03", type = KnownPartner.class, required = false)
    protected KnownPartner knownPartner;
    @XmlElementRef(name = "ManufacturingProcessInfo", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.05", type = ManufacturingProcessInfo.class, required = false)
    protected List<ManufacturingProcessInfo> manufacturingProcessInfo;
    @XmlElementRef(name = "Material", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.05", type = Material.class, required = false)
    protected List<Material> material;
    @XmlElement(name = "ProductIdentifier", required = true)
    protected ProductIdentifierType productIdentifier;
    @XmlElement(name = "ProductInformationObject")
    protected List<ProductInformationObjectType> productInformationObject;
    @XmlElementRef(name = "ProductMass", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.05", type = ProductMass.class, required = false)
    protected ProductMass productMass;
    @XmlElementRef(name = "Subpart", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.05", type = Subpart.class, required = false)
    protected List<Subpart> subpart;
    @XmlElementRef(name = "Substance", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.05", type = Substance.class, required = false)
    protected List<Substance> substance;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternativeProductIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeProductIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeProductIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentifierType }
     * 
     * 
     */
    public List<ProductIdentifierType> getAlternativeProductIdentifier() {
        if (alternativeProductIdentifier == null) {
            alternativeProductIdentifier = new ArrayList<ProductIdentifierType>();
        }
        return this.alternativeProductIdentifier;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionType }
     * 
     * 
     */
    public List<ConditionType> getCondition() {
        if (condition == null) {
            condition = new ArrayList<ConditionType>();
        }
        return this.condition;
    }

    /**
     * Gets the value of the directive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Directive }
     * 
     * 
     */
    public List<Directive> getDirective() {
        if (directive == null) {
            directive = new ArrayList<Directive>();
        }
        return this.directive;
    }

    /**
     * Gets the value of the distributionNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDistributionNote() {
        if (distributionNote == null) {
            distributionNote = new ArrayList<String>();
        }
        return this.distributionNote;
    }

    /**
     * Gets the value of the isGeneric property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGeneric() {
        return isGeneric;
    }

    /**
     * Sets the value of the isGeneric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGeneric(Boolean value) {
        this.isGeneric = value;
    }

    /**
     * Gets the value of the knownPartner property.
     * 
     * @return
     *     possible object is
     *     {@link KnownPartner }
     *     
     */
    public KnownPartner getKnownPartner() {
        return knownPartner;
    }

    /**
     * Sets the value of the knownPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnownPartner }
     *     
     */
    public void setKnownPartner(KnownPartner value) {
        this.knownPartner = value;
    }

    /**
     * Gets the value of the manufacturingProcessInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturingProcessInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturingProcessInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManufacturingProcessInfo }
     * 
     * 
     */
    public List<ManufacturingProcessInfo> getManufacturingProcessInfo() {
        if (manufacturingProcessInfo == null) {
            manufacturingProcessInfo = new ArrayList<ManufacturingProcessInfo>();
        }
        return this.manufacturingProcessInfo;
    }

    /**
     * Gets the value of the material property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the material property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Material }
     * 
     * 
     */
    public List<Material> getMaterial() {
        if (material == null) {
            material = new ArrayList<Material>();
        }
        return this.material;
    }

    /**
     * Gets the value of the productIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentifierType }
     *     
     */
    public ProductIdentifierType getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentifierType }
     *     
     */
    public void setProductIdentifier(ProductIdentifierType value) {
        this.productIdentifier = value;
    }

    /**
     * Gets the value of the productInformationObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInformationObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInformationObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductInformationObjectType }
     * 
     * 
     */
    public List<ProductInformationObjectType> getProductInformationObject() {
        if (productInformationObject == null) {
            productInformationObject = new ArrayList<ProductInformationObjectType>();
        }
        return this.productInformationObject;
    }

    /**
     * Gets the value of the productMass property.
     * 
     * @return
     *     possible object is
     *     {@link ProductMass }
     *     
     */
    public ProductMass getProductMass() {
        return productMass;
    }

    /**
     * Sets the value of the productMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductMass }
     *     
     */
    public void setProductMass(ProductMass value) {
        this.productMass = value;
    }

    /**
     * Gets the value of the subpart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subpart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubpart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subpart }
     * 
     * 
     */
    public List<Subpart> getSubpart() {
        if (subpart == null) {
            subpart = new ArrayList<Subpart>();
        }
        return this.subpart;
    }

    /**
     * Gets the value of the substance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Substance }
     * 
     * 
     */
    public List<Substance> getSubstance() {
        if (substance == null) {
            substance = new ArrayList<Substance>();
        }
        return this.substance;
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
        final ProductInformationType that = ((ProductInformationType) object);
        {
            List<ProductIdentifierType> lhsAlternativeProductIdentifier;
            lhsAlternativeProductIdentifier = (((this.alternativeProductIdentifier!= null)&&(!this.alternativeProductIdentifier.isEmpty()))?this.getAlternativeProductIdentifier():null);
            List<ProductIdentifierType> rhsAlternativeProductIdentifier;
            rhsAlternativeProductIdentifier = (((that.alternativeProductIdentifier!= null)&&(!that.alternativeProductIdentifier.isEmpty()))?that.getAlternativeProductIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativeProductIdentifier", lhsAlternativeProductIdentifier), LocatorUtils.property(thatLocator, "alternativeProductIdentifier", rhsAlternativeProductIdentifier), lhsAlternativeProductIdentifier, rhsAlternativeProductIdentifier, ((this.alternativeProductIdentifier!= null)&&(!this.alternativeProductIdentifier.isEmpty())), ((that.alternativeProductIdentifier!= null)&&(!that.alternativeProductIdentifier.isEmpty())))) {
                return false;
            }
        }
        {
            List<ConditionType> lhsCondition;
            lhsCondition = (((this.condition!= null)&&(!this.condition.isEmpty()))?this.getCondition():null);
            List<ConditionType> rhsCondition;
            rhsCondition = (((that.condition!= null)&&(!that.condition.isEmpty()))?that.getCondition():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "condition", lhsCondition), LocatorUtils.property(thatLocator, "condition", rhsCondition), lhsCondition, rhsCondition, ((this.condition!= null)&&(!this.condition.isEmpty())), ((that.condition!= null)&&(!that.condition.isEmpty())))) {
                return false;
            }
        }
        {
            List<Directive> lhsDirective;
            lhsDirective = (((this.directive!= null)&&(!this.directive.isEmpty()))?this.getDirective():null);
            List<Directive> rhsDirective;
            rhsDirective = (((that.directive!= null)&&(!that.directive.isEmpty()))?that.getDirective():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directive", lhsDirective), LocatorUtils.property(thatLocator, "directive", rhsDirective), lhsDirective, rhsDirective, ((this.directive!= null)&&(!this.directive.isEmpty())), ((that.directive!= null)&&(!that.directive.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsDistributionNote;
            lhsDistributionNote = (((this.distributionNote!= null)&&(!this.distributionNote.isEmpty()))?this.getDistributionNote():null);
            List<String> rhsDistributionNote;
            rhsDistributionNote = (((that.distributionNote!= null)&&(!that.distributionNote.isEmpty()))?that.getDistributionNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distributionNote", lhsDistributionNote), LocatorUtils.property(thatLocator, "distributionNote", rhsDistributionNote), lhsDistributionNote, rhsDistributionNote, ((this.distributionNote!= null)&&(!this.distributionNote.isEmpty())), ((that.distributionNote!= null)&&(!that.distributionNote.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsIsGeneric;
            lhsIsGeneric = this.isIsGeneric();
            Boolean rhsIsGeneric;
            rhsIsGeneric = that.isIsGeneric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isGeneric", lhsIsGeneric), LocatorUtils.property(thatLocator, "isGeneric", rhsIsGeneric), lhsIsGeneric, rhsIsGeneric, (this.isGeneric!= null), (that.isGeneric!= null))) {
                return false;
            }
        }
        {
            KnownPartner lhsKnownPartner;
            lhsKnownPartner = this.getKnownPartner();
            KnownPartner rhsKnownPartner;
            rhsKnownPartner = that.getKnownPartner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "knownPartner", lhsKnownPartner), LocatorUtils.property(thatLocator, "knownPartner", rhsKnownPartner), lhsKnownPartner, rhsKnownPartner, (this.knownPartner!= null), (that.knownPartner!= null))) {
                return false;
            }
        }
        {
            List<ManufacturingProcessInfo> lhsManufacturingProcessInfo;
            lhsManufacturingProcessInfo = (((this.manufacturingProcessInfo!= null)&&(!this.manufacturingProcessInfo.isEmpty()))?this.getManufacturingProcessInfo():null);
            List<ManufacturingProcessInfo> rhsManufacturingProcessInfo;
            rhsManufacturingProcessInfo = (((that.manufacturingProcessInfo!= null)&&(!that.manufacturingProcessInfo.isEmpty()))?that.getManufacturingProcessInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturingProcessInfo", lhsManufacturingProcessInfo), LocatorUtils.property(thatLocator, "manufacturingProcessInfo", rhsManufacturingProcessInfo), lhsManufacturingProcessInfo, rhsManufacturingProcessInfo, ((this.manufacturingProcessInfo!= null)&&(!this.manufacturingProcessInfo.isEmpty())), ((that.manufacturingProcessInfo!= null)&&(!that.manufacturingProcessInfo.isEmpty())))) {
                return false;
            }
        }
        {
            List<Material> lhsMaterial;
            lhsMaterial = (((this.material!= null)&&(!this.material.isEmpty()))?this.getMaterial():null);
            List<Material> rhsMaterial;
            rhsMaterial = (((that.material!= null)&&(!that.material.isEmpty()))?that.getMaterial():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "material", lhsMaterial), LocatorUtils.property(thatLocator, "material", rhsMaterial), lhsMaterial, rhsMaterial, ((this.material!= null)&&(!this.material.isEmpty())), ((that.material!= null)&&(!that.material.isEmpty())))) {
                return false;
            }
        }
        {
            ProductIdentifierType lhsProductIdentifier;
            lhsProductIdentifier = this.getProductIdentifier();
            ProductIdentifierType rhsProductIdentifier;
            rhsProductIdentifier = that.getProductIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentifier", lhsProductIdentifier), LocatorUtils.property(thatLocator, "productIdentifier", rhsProductIdentifier), lhsProductIdentifier, rhsProductIdentifier, (this.productIdentifier!= null), (that.productIdentifier!= null))) {
                return false;
            }
        }
        {
            List<ProductInformationObjectType> lhsProductInformationObject;
            lhsProductInformationObject = (((this.productInformationObject!= null)&&(!this.productInformationObject.isEmpty()))?this.getProductInformationObject():null);
            List<ProductInformationObjectType> rhsProductInformationObject;
            rhsProductInformationObject = (((that.productInformationObject!= null)&&(!that.productInformationObject.isEmpty()))?that.getProductInformationObject():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productInformationObject", lhsProductInformationObject), LocatorUtils.property(thatLocator, "productInformationObject", rhsProductInformationObject), lhsProductInformationObject, rhsProductInformationObject, ((this.productInformationObject!= null)&&(!this.productInformationObject.isEmpty())), ((that.productInformationObject!= null)&&(!that.productInformationObject.isEmpty())))) {
                return false;
            }
        }
        {
            ProductMass lhsProductMass;
            lhsProductMass = this.getProductMass();
            ProductMass rhsProductMass;
            rhsProductMass = that.getProductMass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productMass", lhsProductMass), LocatorUtils.property(thatLocator, "productMass", rhsProductMass), lhsProductMass, rhsProductMass, (this.productMass!= null), (that.productMass!= null))) {
                return false;
            }
        }
        {
            List<Subpart> lhsSubpart;
            lhsSubpart = (((this.subpart!= null)&&(!this.subpart.isEmpty()))?this.getSubpart():null);
            List<Subpart> rhsSubpart;
            rhsSubpart = (((that.subpart!= null)&&(!that.subpart.isEmpty()))?that.getSubpart():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subpart", lhsSubpart), LocatorUtils.property(thatLocator, "subpart", rhsSubpart), lhsSubpart, rhsSubpart, ((this.subpart!= null)&&(!this.subpart.isEmpty())), ((that.subpart!= null)&&(!that.subpart.isEmpty())))) {
                return false;
            }
        }
        {
            List<Substance> lhsSubstance;
            lhsSubstance = (((this.substance!= null)&&(!this.substance.isEmpty()))?this.getSubstance():null);
            List<Substance> rhsSubstance;
            rhsSubstance = (((that.substance!= null)&&(!that.substance.isEmpty()))?that.getSubstance():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substance", lhsSubstance), LocatorUtils.property(thatLocator, "substance", rhsSubstance), lhsSubstance, rhsSubstance, ((this.substance!= null)&&(!this.substance.isEmpty())), ((that.substance!= null)&&(!that.substance.isEmpty())))) {
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
            List<ProductIdentifierType> theAlternativeProductIdentifier;
            theAlternativeProductIdentifier = (((this.alternativeProductIdentifier!= null)&&(!this.alternativeProductIdentifier.isEmpty()))?this.getAlternativeProductIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativeProductIdentifier", theAlternativeProductIdentifier), currentHashCode, theAlternativeProductIdentifier, ((this.alternativeProductIdentifier!= null)&&(!this.alternativeProductIdentifier.isEmpty())));
        }
        {
            List<ConditionType> theCondition;
            theCondition = (((this.condition!= null)&&(!this.condition.isEmpty()))?this.getCondition():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "condition", theCondition), currentHashCode, theCondition, ((this.condition!= null)&&(!this.condition.isEmpty())));
        }
        {
            List<Directive> theDirective;
            theDirective = (((this.directive!= null)&&(!this.directive.isEmpty()))?this.getDirective():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directive", theDirective), currentHashCode, theDirective, ((this.directive!= null)&&(!this.directive.isEmpty())));
        }
        {
            List<String> theDistributionNote;
            theDistributionNote = (((this.distributionNote!= null)&&(!this.distributionNote.isEmpty()))?this.getDistributionNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distributionNote", theDistributionNote), currentHashCode, theDistributionNote, ((this.distributionNote!= null)&&(!this.distributionNote.isEmpty())));
        }
        {
            Boolean theIsGeneric;
            theIsGeneric = this.isIsGeneric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isGeneric", theIsGeneric), currentHashCode, theIsGeneric, (this.isGeneric!= null));
        }
        {
            KnownPartner theKnownPartner;
            theKnownPartner = this.getKnownPartner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "knownPartner", theKnownPartner), currentHashCode, theKnownPartner, (this.knownPartner!= null));
        }
        {
            List<ManufacturingProcessInfo> theManufacturingProcessInfo;
            theManufacturingProcessInfo = (((this.manufacturingProcessInfo!= null)&&(!this.manufacturingProcessInfo.isEmpty()))?this.getManufacturingProcessInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturingProcessInfo", theManufacturingProcessInfo), currentHashCode, theManufacturingProcessInfo, ((this.manufacturingProcessInfo!= null)&&(!this.manufacturingProcessInfo.isEmpty())));
        }
        {
            List<Material> theMaterial;
            theMaterial = (((this.material!= null)&&(!this.material.isEmpty()))?this.getMaterial():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "material", theMaterial), currentHashCode, theMaterial, ((this.material!= null)&&(!this.material.isEmpty())));
        }
        {
            ProductIdentifierType theProductIdentifier;
            theProductIdentifier = this.getProductIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentifier", theProductIdentifier), currentHashCode, theProductIdentifier, (this.productIdentifier!= null));
        }
        {
            List<ProductInformationObjectType> theProductInformationObject;
            theProductInformationObject = (((this.productInformationObject!= null)&&(!this.productInformationObject.isEmpty()))?this.getProductInformationObject():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productInformationObject", theProductInformationObject), currentHashCode, theProductInformationObject, ((this.productInformationObject!= null)&&(!this.productInformationObject.isEmpty())));
        }
        {
            ProductMass theProductMass;
            theProductMass = this.getProductMass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productMass", theProductMass), currentHashCode, theProductMass, (this.productMass!= null));
        }
        {
            List<Subpart> theSubpart;
            theSubpart = (((this.subpart!= null)&&(!this.subpart.isEmpty()))?this.getSubpart():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subpart", theSubpart), currentHashCode, theSubpart, ((this.subpart!= null)&&(!this.subpart.isEmpty())));
        }
        {
            List<Substance> theSubstance;
            theSubstance = (((this.substance!= null)&&(!this.substance.isEmpty()))?this.getSubstance():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substance", theSubstance), currentHashCode, theSubstance, ((this.substance!= null)&&(!this.substance.isEmpty())));
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
            List<ProductIdentifierType> theAlternativeProductIdentifier;
            theAlternativeProductIdentifier = (((this.alternativeProductIdentifier!= null)&&(!this.alternativeProductIdentifier.isEmpty()))?this.getAlternativeProductIdentifier():null);
            strategy.appendField(locator, this, "alternativeProductIdentifier", buffer, theAlternativeProductIdentifier, ((this.alternativeProductIdentifier!= null)&&(!this.alternativeProductIdentifier.isEmpty())));
        }
        {
            List<ConditionType> theCondition;
            theCondition = (((this.condition!= null)&&(!this.condition.isEmpty()))?this.getCondition():null);
            strategy.appendField(locator, this, "condition", buffer, theCondition, ((this.condition!= null)&&(!this.condition.isEmpty())));
        }
        {
            List<Directive> theDirective;
            theDirective = (((this.directive!= null)&&(!this.directive.isEmpty()))?this.getDirective():null);
            strategy.appendField(locator, this, "directive", buffer, theDirective, ((this.directive!= null)&&(!this.directive.isEmpty())));
        }
        {
            List<String> theDistributionNote;
            theDistributionNote = (((this.distributionNote!= null)&&(!this.distributionNote.isEmpty()))?this.getDistributionNote():null);
            strategy.appendField(locator, this, "distributionNote", buffer, theDistributionNote, ((this.distributionNote!= null)&&(!this.distributionNote.isEmpty())));
        }
        {
            Boolean theIsGeneric;
            theIsGeneric = this.isIsGeneric();
            strategy.appendField(locator, this, "isGeneric", buffer, theIsGeneric, (this.isGeneric!= null));
        }
        {
            KnownPartner theKnownPartner;
            theKnownPartner = this.getKnownPartner();
            strategy.appendField(locator, this, "knownPartner", buffer, theKnownPartner, (this.knownPartner!= null));
        }
        {
            List<ManufacturingProcessInfo> theManufacturingProcessInfo;
            theManufacturingProcessInfo = (((this.manufacturingProcessInfo!= null)&&(!this.manufacturingProcessInfo.isEmpty()))?this.getManufacturingProcessInfo():null);
            strategy.appendField(locator, this, "manufacturingProcessInfo", buffer, theManufacturingProcessInfo, ((this.manufacturingProcessInfo!= null)&&(!this.manufacturingProcessInfo.isEmpty())));
        }
        {
            List<Material> theMaterial;
            theMaterial = (((this.material!= null)&&(!this.material.isEmpty()))?this.getMaterial():null);
            strategy.appendField(locator, this, "material", buffer, theMaterial, ((this.material!= null)&&(!this.material.isEmpty())));
        }
        {
            ProductIdentifierType theProductIdentifier;
            theProductIdentifier = this.getProductIdentifier();
            strategy.appendField(locator, this, "productIdentifier", buffer, theProductIdentifier, (this.productIdentifier!= null));
        }
        {
            List<ProductInformationObjectType> theProductInformationObject;
            theProductInformationObject = (((this.productInformationObject!= null)&&(!this.productInformationObject.isEmpty()))?this.getProductInformationObject():null);
            strategy.appendField(locator, this, "productInformationObject", buffer, theProductInformationObject, ((this.productInformationObject!= null)&&(!this.productInformationObject.isEmpty())));
        }
        {
            ProductMass theProductMass;
            theProductMass = this.getProductMass();
            strategy.appendField(locator, this, "productMass", buffer, theProductMass, (this.productMass!= null));
        }
        {
            List<Subpart> theSubpart;
            theSubpart = (((this.subpart!= null)&&(!this.subpart.isEmpty()))?this.getSubpart():null);
            strategy.appendField(locator, this, "subpart", buffer, theSubpart, ((this.subpart!= null)&&(!this.subpart.isEmpty())));
        }
        {
            List<Substance> theSubstance;
            theSubstance = (((this.substance!= null)&&(!this.substance.isEmpty()))?this.getSubstance():null);
            strategy.appendField(locator, this, "substance", buffer, theSubstance, ((this.substance!= null)&&(!this.substance.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
