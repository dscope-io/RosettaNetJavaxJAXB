
package io.dscope.rosettanet.interchange.returnproductrequest.v01_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.service.codelist.productreturnreason.v01_02.ProductReturnReason;
import io.dscope.rosettanet.domain.service.codelist.returnproductinstruction.v01_02.ReturnProductInstruction;
import io.dscope.rosettanet.domain.service.service.v02_20.FailureInformation;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductQuantity;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
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
 * <p>Java class for ProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}FailureInformation" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantity"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ProductReturnReason:xsd:codelist:01.02}ProductReturnReason"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ReturnProductInstruction:xsd:codelist:01.02}ReturnProductInstruction"/&gt;
 *         &lt;element name="SerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure" minOccurs="0"/&gt;
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
@XmlType(name = "ProductLineItemType", propOrder = {
    "failureInformation",
    "lineNumber",
    "partnerDescription",
    "productIdentification",
    "productQuantity",
    "productReturnReason",
    "returnProductInstruction",
    "serialIdentifier",
    "shipDate",
    "shippingServiceLevel",
    "unitOfMeasure"
})
public class ProductLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "FailureInformation", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = FailureInformation.class, required = false)
    protected FailureInformation failureInformation;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.17", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlElementRef(name = "ProductReturnReason", namespace = "urn:rosettanet:specification:domain:Service:ProductReturnReason:xsd:codelist:01.02", type = ProductReturnReason.class)
    protected ProductReturnReason productReturnReason;
    @XmlElementRef(name = "ReturnProductInstruction", namespace = "urn:rosettanet:specification:domain:Service:ReturnProductInstruction:xsd:codelist:01.02", type = ReturnProductInstruction.class)
    protected ReturnProductInstruction returnProductInstruction;
    @XmlElement(name = "SerialIdentifier")
    protected String serialIdentifier;
    @XmlElement(name = "ShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDate;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class, required = false)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class, required = false)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the failureInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FailureInformation }
     *     
     */
    public FailureInformation getFailureInformation() {
        return failureInformation;
    }

    /**
     * Sets the value of the failureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureInformation }
     *     
     */
    public void setFailureInformation(FailureInformation value) {
        this.failureInformation = value;
    }

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
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
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
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the productReturnReason property.
     * 
     * @return
     *     possible object is
     *     {@link ProductReturnReason }
     *     
     */
    public ProductReturnReason getProductReturnReason() {
        return productReturnReason;
    }

    /**
     * Sets the value of the productReturnReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductReturnReason }
     *     
     */
    public void setProductReturnReason(ProductReturnReason value) {
        this.productReturnReason = value;
    }

    /**
     * Gets the value of the returnProductInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnProductInstruction }
     *     
     */
    public ReturnProductInstruction getReturnProductInstruction() {
        return returnProductInstruction;
    }

    /**
     * Sets the value of the returnProductInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnProductInstruction }
     *     
     */
    public void setReturnProductInstruction(ReturnProductInstruction value) {
        this.returnProductInstruction = value;
    }

    /**
     * Gets the value of the serialIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialIdentifier() {
        return serialIdentifier;
    }

    /**
     * Sets the value of the serialIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialIdentifier(String value) {
        this.serialIdentifier = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shippingServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public ShippingServiceLevel getShippingServiceLevel() {
        return shippingServiceLevel;
    }

    /**
     * Sets the value of the shippingServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public void setShippingServiceLevel(ShippingServiceLevel value) {
        this.shippingServiceLevel = value;
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
        final ProductLineItemType that = ((ProductLineItemType) object);
        {
            FailureInformation lhsFailureInformation;
            lhsFailureInformation = this.getFailureInformation();
            FailureInformation rhsFailureInformation;
            rhsFailureInformation = that.getFailureInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failureInformation", lhsFailureInformation), LocatorUtils.property(thatLocator, "failureInformation", rhsFailureInformation), lhsFailureInformation, rhsFailureInformation, (this.failureInformation!= null), (that.failureInformation!= null))) {
                return false;
            }
        }
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
            PartnerDescription lhsPartnerDescription;
            lhsPartnerDescription = this.getPartnerDescription();
            PartnerDescription rhsPartnerDescription;
            rhsPartnerDescription = that.getPartnerDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, (this.partnerDescription!= null), (that.partnerDescription!= null))) {
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
            ProductQuantity lhsProductQuantity;
            lhsProductQuantity = this.getProductQuantity();
            ProductQuantity rhsProductQuantity;
            rhsProductQuantity = that.getProductQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productQuantity", lhsProductQuantity), LocatorUtils.property(thatLocator, "productQuantity", rhsProductQuantity), lhsProductQuantity, rhsProductQuantity, (this.productQuantity!= null), (that.productQuantity!= null))) {
                return false;
            }
        }
        {
            ProductReturnReason lhsProductReturnReason;
            lhsProductReturnReason = this.getProductReturnReason();
            ProductReturnReason rhsProductReturnReason;
            rhsProductReturnReason = that.getProductReturnReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productReturnReason", lhsProductReturnReason), LocatorUtils.property(thatLocator, "productReturnReason", rhsProductReturnReason), lhsProductReturnReason, rhsProductReturnReason, (this.productReturnReason!= null), (that.productReturnReason!= null))) {
                return false;
            }
        }
        {
            ReturnProductInstruction lhsReturnProductInstruction;
            lhsReturnProductInstruction = this.getReturnProductInstruction();
            ReturnProductInstruction rhsReturnProductInstruction;
            rhsReturnProductInstruction = that.getReturnProductInstruction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "returnProductInstruction", lhsReturnProductInstruction), LocatorUtils.property(thatLocator, "returnProductInstruction", rhsReturnProductInstruction), lhsReturnProductInstruction, rhsReturnProductInstruction, (this.returnProductInstruction!= null), (that.returnProductInstruction!= null))) {
                return false;
            }
        }
        {
            String lhsSerialIdentifier;
            lhsSerialIdentifier = this.getSerialIdentifier();
            String rhsSerialIdentifier;
            rhsSerialIdentifier = that.getSerialIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serialIdentifier", lhsSerialIdentifier), LocatorUtils.property(thatLocator, "serialIdentifier", rhsSerialIdentifier), lhsSerialIdentifier, rhsSerialIdentifier, (this.serialIdentifier!= null), (that.serialIdentifier!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsShipDate;
            lhsShipDate = this.getShipDate();
            XMLGregorianCalendar rhsShipDate;
            rhsShipDate = that.getShipDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipDate", lhsShipDate), LocatorUtils.property(thatLocator, "shipDate", rhsShipDate), lhsShipDate, rhsShipDate, (this.shipDate!= null), (that.shipDate!= null))) {
                return false;
            }
        }
        {
            ShippingServiceLevel lhsShippingServiceLevel;
            lhsShippingServiceLevel = this.getShippingServiceLevel();
            ShippingServiceLevel rhsShippingServiceLevel;
            rhsShippingServiceLevel = that.getShippingServiceLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingServiceLevel", lhsShippingServiceLevel), LocatorUtils.property(thatLocator, "shippingServiceLevel", rhsShippingServiceLevel), lhsShippingServiceLevel, rhsShippingServiceLevel, (this.shippingServiceLevel!= null), (that.shippingServiceLevel!= null))) {
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
            FailureInformation theFailureInformation;
            theFailureInformation = this.getFailureInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failureInformation", theFailureInformation), currentHashCode, theFailureInformation, (this.failureInformation!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantity", theProductQuantity), currentHashCode, theProductQuantity, (this.productQuantity!= null));
        }
        {
            ProductReturnReason theProductReturnReason;
            theProductReturnReason = this.getProductReturnReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productReturnReason", theProductReturnReason), currentHashCode, theProductReturnReason, (this.productReturnReason!= null));
        }
        {
            ReturnProductInstruction theReturnProductInstruction;
            theReturnProductInstruction = this.getReturnProductInstruction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnProductInstruction", theReturnProductInstruction), currentHashCode, theReturnProductInstruction, (this.returnProductInstruction!= null));
        }
        {
            String theSerialIdentifier;
            theSerialIdentifier = this.getSerialIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialIdentifier", theSerialIdentifier), currentHashCode, theSerialIdentifier, (this.serialIdentifier!= null));
        }
        {
            XMLGregorianCalendar theShipDate;
            theShipDate = this.getShipDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipDate", theShipDate), currentHashCode, theShipDate, (this.shipDate!= null));
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingServiceLevel", theShippingServiceLevel), currentHashCode, theShippingServiceLevel, (this.shippingServiceLevel!= null));
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
            FailureInformation theFailureInformation;
            theFailureInformation = this.getFailureInformation();
            strategy.appendField(locator, this, "failureInformation", buffer, theFailureInformation, (this.failureInformation!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            strategy.appendField(locator, this, "productQuantity", buffer, theProductQuantity, (this.productQuantity!= null));
        }
        {
            ProductReturnReason theProductReturnReason;
            theProductReturnReason = this.getProductReturnReason();
            strategy.appendField(locator, this, "productReturnReason", buffer, theProductReturnReason, (this.productReturnReason!= null));
        }
        {
            ReturnProductInstruction theReturnProductInstruction;
            theReturnProductInstruction = this.getReturnProductInstruction();
            strategy.appendField(locator, this, "returnProductInstruction", buffer, theReturnProductInstruction, (this.returnProductInstruction!= null));
        }
        {
            String theSerialIdentifier;
            theSerialIdentifier = this.getSerialIdentifier();
            strategy.appendField(locator, this, "serialIdentifier", buffer, theSerialIdentifier, (this.serialIdentifier!= null));
        }
        {
            XMLGregorianCalendar theShipDate;
            theShipDate = this.getShipDate();
            strategy.appendField(locator, this, "shipDate", buffer, theShipDate, (this.shipDate!= null));
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            strategy.appendField(locator, this, "shippingServiceLevel", buffer, theShippingServiceLevel, (this.shippingServiceLevel!= null));
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
