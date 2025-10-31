
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_26;

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
 * <p>Java class for LotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternativePN" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContractorLotNumber" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.26}LotIdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLotNumber" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.26}LotIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPN" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04}LotType" minOccurs="0"/&gt;
 *         &lt;element name="NominalSize" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubLot" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.26}LotIdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Technology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LotType", propOrder = {
    "alternativePN",
    "contractorLotNumber",
    "customerLotNumber",
    "customerPN",
    "lotType",
    "nominalSize",
    "productName",
    "subLot",
    "technology"
})
public class LotType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AlternativePN")
    protected List<ProductIdentificationType> alternativePN;
    @XmlElement(name = "ContractorLotNumber")
    protected List<LotIdentifierType> contractorLotNumber;
    @XmlElement(name = "CustomerLotNumber")
    protected LotIdentifierType customerLotNumber;
    @XmlElement(name = "CustomerPN")
    protected ProductIdentificationType customerPN;
    @XmlElementRef(name = "LotType", namespace = "urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04", type = io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType.class, required = false)
    protected io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType lotType;
    @XmlElement(name = "NominalSize")
    protected Float nominalSize;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "SubLot")
    protected List<LotIdentifierType> subLot;
    @XmlElement(name = "Technology")
    protected String technology;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternativePN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativePN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativePN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getAlternativePN() {
        if (alternativePN == null) {
            alternativePN = new ArrayList<ProductIdentificationType>();
        }
        return this.alternativePN;
    }

    /**
     * Gets the value of the contractorLotNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractorLotNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractorLotNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotIdentifierType }
     * 
     * 
     */
    public List<LotIdentifierType> getContractorLotNumber() {
        if (contractorLotNumber == null) {
            contractorLotNumber = new ArrayList<LotIdentifierType>();
        }
        return this.contractorLotNumber;
    }

    /**
     * Gets the value of the customerLotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentifierType }
     *     
     */
    public LotIdentifierType getCustomerLotNumber() {
        return customerLotNumber;
    }

    /**
     * Sets the value of the customerLotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentifierType }
     *     
     */
    public void setCustomerLotNumber(LotIdentifierType value) {
        this.customerLotNumber = value;
    }

    /**
     * Gets the value of the customerPN property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getCustomerPN() {
        return customerPN;
    }

    /**
     * Sets the value of the customerPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setCustomerPN(ProductIdentificationType value) {
        this.customerPN = value;
    }

    /**
     * Gets the value of the lotType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType }
     *     
     */
    public io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType getLotType() {
        return lotType;
    }

    /**
     * Sets the value of the lotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType }
     *     
     */
    public void setLotType(io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType value) {
        this.lotType = value;
    }

    /**
     * Gets the value of the nominalSize property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNominalSize() {
        return nominalSize;
    }

    /**
     * Sets the value of the nominalSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNominalSize(Float value) {
        this.nominalSize = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the subLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotIdentifierType }
     * 
     * 
     */
    public List<LotIdentifierType> getSubLot() {
        if (subLot == null) {
            subLot = new ArrayList<LotIdentifierType>();
        }
        return this.subLot;
    }

    /**
     * Gets the value of the technology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnology() {
        return technology;
    }

    /**
     * Sets the value of the technology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnology(String value) {
        this.technology = value;
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
        final LotType that = ((LotType) object);
        {
            List<ProductIdentificationType> lhsAlternativePN;
            lhsAlternativePN = (((this.alternativePN!= null)&&(!this.alternativePN.isEmpty()))?this.getAlternativePN():null);
            List<ProductIdentificationType> rhsAlternativePN;
            rhsAlternativePN = (((that.alternativePN!= null)&&(!that.alternativePN.isEmpty()))?that.getAlternativePN():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativePN", lhsAlternativePN), LocatorUtils.property(thatLocator, "alternativePN", rhsAlternativePN), lhsAlternativePN, rhsAlternativePN, ((this.alternativePN!= null)&&(!this.alternativePN.isEmpty())), ((that.alternativePN!= null)&&(!that.alternativePN.isEmpty())))) {
                return false;
            }
        }
        {
            List<LotIdentifierType> lhsContractorLotNumber;
            lhsContractorLotNumber = (((this.contractorLotNumber!= null)&&(!this.contractorLotNumber.isEmpty()))?this.getContractorLotNumber():null);
            List<LotIdentifierType> rhsContractorLotNumber;
            rhsContractorLotNumber = (((that.contractorLotNumber!= null)&&(!that.contractorLotNumber.isEmpty()))?that.getContractorLotNumber():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractorLotNumber", lhsContractorLotNumber), LocatorUtils.property(thatLocator, "contractorLotNumber", rhsContractorLotNumber), lhsContractorLotNumber, rhsContractorLotNumber, ((this.contractorLotNumber!= null)&&(!this.contractorLotNumber.isEmpty())), ((that.contractorLotNumber!= null)&&(!that.contractorLotNumber.isEmpty())))) {
                return false;
            }
        }
        {
            LotIdentifierType lhsCustomerLotNumber;
            lhsCustomerLotNumber = this.getCustomerLotNumber();
            LotIdentifierType rhsCustomerLotNumber;
            rhsCustomerLotNumber = that.getCustomerLotNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerLotNumber", lhsCustomerLotNumber), LocatorUtils.property(thatLocator, "customerLotNumber", rhsCustomerLotNumber), lhsCustomerLotNumber, rhsCustomerLotNumber, (this.customerLotNumber!= null), (that.customerLotNumber!= null))) {
                return false;
            }
        }
        {
            ProductIdentificationType lhsCustomerPN;
            lhsCustomerPN = this.getCustomerPN();
            ProductIdentificationType rhsCustomerPN;
            rhsCustomerPN = that.getCustomerPN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerPN", lhsCustomerPN), LocatorUtils.property(thatLocator, "customerPN", rhsCustomerPN), lhsCustomerPN, rhsCustomerPN, (this.customerPN!= null), (that.customerPN!= null))) {
                return false;
            }
        }
        {
            io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType lhsLotType;
            lhsLotType = this.getLotType();
            io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType rhsLotType;
            rhsLotType = that.getLotType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotType", lhsLotType), LocatorUtils.property(thatLocator, "lotType", rhsLotType), lhsLotType, rhsLotType, (this.lotType!= null), (that.lotType!= null))) {
                return false;
            }
        }
        {
            Float lhsNominalSize;
            lhsNominalSize = this.getNominalSize();
            Float rhsNominalSize;
            rhsNominalSize = that.getNominalSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nominalSize", lhsNominalSize), LocatorUtils.property(thatLocator, "nominalSize", rhsNominalSize), lhsNominalSize, rhsNominalSize, (this.nominalSize!= null), (that.nominalSize!= null))) {
                return false;
            }
        }
        {
            String lhsProductName;
            lhsProductName = this.getProductName();
            String rhsProductName;
            rhsProductName = that.getProductName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productName", lhsProductName), LocatorUtils.property(thatLocator, "productName", rhsProductName), lhsProductName, rhsProductName, (this.productName!= null), (that.productName!= null))) {
                return false;
            }
        }
        {
            List<LotIdentifierType> lhsSubLot;
            lhsSubLot = (((this.subLot!= null)&&(!this.subLot.isEmpty()))?this.getSubLot():null);
            List<LotIdentifierType> rhsSubLot;
            rhsSubLot = (((that.subLot!= null)&&(!that.subLot.isEmpty()))?that.getSubLot():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subLot", lhsSubLot), LocatorUtils.property(thatLocator, "subLot", rhsSubLot), lhsSubLot, rhsSubLot, ((this.subLot!= null)&&(!this.subLot.isEmpty())), ((that.subLot!= null)&&(!that.subLot.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsTechnology;
            lhsTechnology = this.getTechnology();
            String rhsTechnology;
            rhsTechnology = that.getTechnology();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "technology", lhsTechnology), LocatorUtils.property(thatLocator, "technology", rhsTechnology), lhsTechnology, rhsTechnology, (this.technology!= null), (that.technology!= null))) {
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
            List<ProductIdentificationType> theAlternativePN;
            theAlternativePN = (((this.alternativePN!= null)&&(!this.alternativePN.isEmpty()))?this.getAlternativePN():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativePN", theAlternativePN), currentHashCode, theAlternativePN, ((this.alternativePN!= null)&&(!this.alternativePN.isEmpty())));
        }
        {
            List<LotIdentifierType> theContractorLotNumber;
            theContractorLotNumber = (((this.contractorLotNumber!= null)&&(!this.contractorLotNumber.isEmpty()))?this.getContractorLotNumber():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractorLotNumber", theContractorLotNumber), currentHashCode, theContractorLotNumber, ((this.contractorLotNumber!= null)&&(!this.contractorLotNumber.isEmpty())));
        }
        {
            LotIdentifierType theCustomerLotNumber;
            theCustomerLotNumber = this.getCustomerLotNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerLotNumber", theCustomerLotNumber), currentHashCode, theCustomerLotNumber, (this.customerLotNumber!= null));
        }
        {
            ProductIdentificationType theCustomerPN;
            theCustomerPN = this.getCustomerPN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerPN", theCustomerPN), currentHashCode, theCustomerPN, (this.customerPN!= null));
        }
        {
            io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType theLotType;
            theLotType = this.getLotType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotType", theLotType), currentHashCode, theLotType, (this.lotType!= null));
        }
        {
            Float theNominalSize;
            theNominalSize = this.getNominalSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nominalSize", theNominalSize), currentHashCode, theNominalSize, (this.nominalSize!= null));
        }
        {
            String theProductName;
            theProductName = this.getProductName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productName", theProductName), currentHashCode, theProductName, (this.productName!= null));
        }
        {
            List<LotIdentifierType> theSubLot;
            theSubLot = (((this.subLot!= null)&&(!this.subLot.isEmpty()))?this.getSubLot():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subLot", theSubLot), currentHashCode, theSubLot, ((this.subLot!= null)&&(!this.subLot.isEmpty())));
        }
        {
            String theTechnology;
            theTechnology = this.getTechnology();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "technology", theTechnology), currentHashCode, theTechnology, (this.technology!= null));
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
            List<ProductIdentificationType> theAlternativePN;
            theAlternativePN = (((this.alternativePN!= null)&&(!this.alternativePN.isEmpty()))?this.getAlternativePN():null);
            strategy.appendField(locator, this, "alternativePN", buffer, theAlternativePN, ((this.alternativePN!= null)&&(!this.alternativePN.isEmpty())));
        }
        {
            List<LotIdentifierType> theContractorLotNumber;
            theContractorLotNumber = (((this.contractorLotNumber!= null)&&(!this.contractorLotNumber.isEmpty()))?this.getContractorLotNumber():null);
            strategy.appendField(locator, this, "contractorLotNumber", buffer, theContractorLotNumber, ((this.contractorLotNumber!= null)&&(!this.contractorLotNumber.isEmpty())));
        }
        {
            LotIdentifierType theCustomerLotNumber;
            theCustomerLotNumber = this.getCustomerLotNumber();
            strategy.appendField(locator, this, "customerLotNumber", buffer, theCustomerLotNumber, (this.customerLotNumber!= null));
        }
        {
            ProductIdentificationType theCustomerPN;
            theCustomerPN = this.getCustomerPN();
            strategy.appendField(locator, this, "customerPN", buffer, theCustomerPN, (this.customerPN!= null));
        }
        {
            io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType theLotType;
            theLotType = this.getLotType();
            strategy.appendField(locator, this, "lotType", buffer, theLotType, (this.lotType!= null));
        }
        {
            Float theNominalSize;
            theNominalSize = this.getNominalSize();
            strategy.appendField(locator, this, "nominalSize", buffer, theNominalSize, (this.nominalSize!= null));
        }
        {
            String theProductName;
            theProductName = this.getProductName();
            strategy.appendField(locator, this, "productName", buffer, theProductName, (this.productName!= null));
        }
        {
            List<LotIdentifierType> theSubLot;
            theSubLot = (((this.subLot!= null)&&(!this.subLot.isEmpty()))?this.getSubLot():null);
            strategy.appendField(locator, this, "subLot", buffer, theSubLot, ((this.subLot!= null)&&(!this.subLot.isEmpty())));
        }
        {
            String theTechnology;
            theTechnology = this.getTechnology();
            strategy.appendField(locator, this, "technology", buffer, theTechnology, (this.technology!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
