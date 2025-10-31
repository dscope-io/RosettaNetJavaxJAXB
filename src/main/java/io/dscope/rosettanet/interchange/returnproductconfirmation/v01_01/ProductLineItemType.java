
package io.dscope.rosettanet.interchange.returnproductconfirmation.v01_01;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.service.codelist.returnproductinstruction.v01_02.ReturnProductInstruction;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.monetaryexpression.v01_04.FinancialAmountType;
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerDescription;
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
 *         &lt;element name="AuthorizedReturnQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="RequestedReturnQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}ProductQuantityType"/&gt;
 *         &lt;element name="RequestedShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ReturnProductInstruction:xsd:codelist:01.02}ReturnProductInstruction"/&gt;
 *         &lt;element name="SerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel" minOccurs="0"/&gt;
 *         &lt;element name="StatusInformation" type="{urn:rosettanet:specification:interchange:ReturnProductConfirmation:xsd:schema:01.01}StatusInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.04}FinancialAmountType" minOccurs="0"/&gt;
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
    "authorizedReturnQuantity",
    "lineNumber",
    "partnerDescription",
    "productIdentification",
    "requestedReturnQuantity",
    "requestedShipDate",
    "returnProductInstruction",
    "serialIdentifier",
    "shipDate",
    "shippingServiceLevel",
    "statusInformation",
    "unitOfMeasure",
    "unitPrice"
})
public class ProductLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AuthorizedReturnQuantity")
    protected Float authorizedReturnQuantity;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "RequestedReturnQuantity")
    protected float requestedReturnQuantity;
    @XmlElement(name = "RequestedShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedShipDate;
    @XmlElementRef(name = "ReturnProductInstruction", namespace = "urn:rosettanet:specification:domain:Service:ReturnProductInstruction:xsd:codelist:01.02", type = ReturnProductInstruction.class)
    protected ReturnProductInstruction returnProductInstruction;
    @XmlElement(name = "SerialIdentifier")
    protected String serialIdentifier;
    @XmlElement(name = "ShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDate;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class, required = false)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElement(name = "StatusInformation")
    protected List<StatusInformationType> statusInformation;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class, required = false)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "UnitPrice")
    protected FinancialAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the authorizedReturnQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAuthorizedReturnQuantity() {
        return authorizedReturnQuantity;
    }

    /**
     * Sets the value of the authorizedReturnQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAuthorizedReturnQuantity(Float value) {
        this.authorizedReturnQuantity = value;
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
     * Gets the value of the requestedReturnQuantity property.
     * 
     */
    public float getRequestedReturnQuantity() {
        return requestedReturnQuantity;
    }

    /**
     * Sets the value of the requestedReturnQuantity property.
     * 
     */
    public void setRequestedReturnQuantity(float value) {
        this.requestedReturnQuantity = value;
    }

    /**
     * Gets the value of the requestedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedShipDate() {
        return requestedShipDate;
    }

    /**
     * Sets the value of the requestedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedShipDate(XMLGregorianCalendar value) {
        this.requestedShipDate = value;
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
     * Gets the value of the statusInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusInformationType }
     * 
     * 
     */
    public List<StatusInformationType> getStatusInformation() {
        if (statusInformation == null) {
            statusInformation = new ArrayList<StatusInformationType>();
        }
        return this.statusInformation;
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
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setUnitPrice(FinancialAmountType value) {
        this.unitPrice = value;
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
            Float lhsAuthorizedReturnQuantity;
            lhsAuthorizedReturnQuantity = this.getAuthorizedReturnQuantity();
            Float rhsAuthorizedReturnQuantity;
            rhsAuthorizedReturnQuantity = that.getAuthorizedReturnQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authorizedReturnQuantity", lhsAuthorizedReturnQuantity), LocatorUtils.property(thatLocator, "authorizedReturnQuantity", rhsAuthorizedReturnQuantity), lhsAuthorizedReturnQuantity, rhsAuthorizedReturnQuantity, (this.authorizedReturnQuantity!= null), (that.authorizedReturnQuantity!= null))) {
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
            float lhsRequestedReturnQuantity;
            lhsRequestedReturnQuantity = this.getRequestedReturnQuantity();
            float rhsRequestedReturnQuantity;
            rhsRequestedReturnQuantity = that.getRequestedReturnQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedReturnQuantity", lhsRequestedReturnQuantity), LocatorUtils.property(thatLocator, "requestedReturnQuantity", rhsRequestedReturnQuantity), lhsRequestedReturnQuantity, rhsRequestedReturnQuantity, true, true)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsRequestedShipDate;
            lhsRequestedShipDate = this.getRequestedShipDate();
            XMLGregorianCalendar rhsRequestedShipDate;
            rhsRequestedShipDate = that.getRequestedShipDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedShipDate", lhsRequestedShipDate), LocatorUtils.property(thatLocator, "requestedShipDate", rhsRequestedShipDate), lhsRequestedShipDate, rhsRequestedShipDate, (this.requestedShipDate!= null), (that.requestedShipDate!= null))) {
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
            List<StatusInformationType> lhsStatusInformation;
            lhsStatusInformation = (((this.statusInformation!= null)&&(!this.statusInformation.isEmpty()))?this.getStatusInformation():null);
            List<StatusInformationType> rhsStatusInformation;
            rhsStatusInformation = (((that.statusInformation!= null)&&(!that.statusInformation.isEmpty()))?that.getStatusInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusInformation", lhsStatusInformation), LocatorUtils.property(thatLocator, "statusInformation", rhsStatusInformation), lhsStatusInformation, rhsStatusInformation, ((this.statusInformation!= null)&&(!this.statusInformation.isEmpty())), ((that.statusInformation!= null)&&(!that.statusInformation.isEmpty())))) {
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
            FinancialAmountType lhsUnitPrice;
            lhsUnitPrice = this.getUnitPrice();
            FinancialAmountType rhsUnitPrice;
            rhsUnitPrice = that.getUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitPrice", lhsUnitPrice), LocatorUtils.property(thatLocator, "unitPrice", rhsUnitPrice), lhsUnitPrice, rhsUnitPrice, (this.unitPrice!= null), (that.unitPrice!= null))) {
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
            Float theAuthorizedReturnQuantity;
            theAuthorizedReturnQuantity = this.getAuthorizedReturnQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authorizedReturnQuantity", theAuthorizedReturnQuantity), currentHashCode, theAuthorizedReturnQuantity, (this.authorizedReturnQuantity!= null));
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
            float theRequestedReturnQuantity;
            theRequestedReturnQuantity = this.getRequestedReturnQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedReturnQuantity", theRequestedReturnQuantity), currentHashCode, theRequestedReturnQuantity, true);
        }
        {
            XMLGregorianCalendar theRequestedShipDate;
            theRequestedShipDate = this.getRequestedShipDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedShipDate", theRequestedShipDate), currentHashCode, theRequestedShipDate, (this.requestedShipDate!= null));
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
            List<StatusInformationType> theStatusInformation;
            theStatusInformation = (((this.statusInformation!= null)&&(!this.statusInformation.isEmpty()))?this.getStatusInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusInformation", theStatusInformation), currentHashCode, theStatusInformation, ((this.statusInformation!= null)&&(!this.statusInformation.isEmpty())));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            FinancialAmountType theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitPrice", theUnitPrice), currentHashCode, theUnitPrice, (this.unitPrice!= null));
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
            Float theAuthorizedReturnQuantity;
            theAuthorizedReturnQuantity = this.getAuthorizedReturnQuantity();
            strategy.appendField(locator, this, "authorizedReturnQuantity", buffer, theAuthorizedReturnQuantity, (this.authorizedReturnQuantity!= null));
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
            float theRequestedReturnQuantity;
            theRequestedReturnQuantity = this.getRequestedReturnQuantity();
            strategy.appendField(locator, this, "requestedReturnQuantity", buffer, theRequestedReturnQuantity, true);
        }
        {
            XMLGregorianCalendar theRequestedShipDate;
            theRequestedShipDate = this.getRequestedShipDate();
            strategy.appendField(locator, this, "requestedShipDate", buffer, theRequestedShipDate, (this.requestedShipDate!= null));
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
            List<StatusInformationType> theStatusInformation;
            theStatusInformation = (((this.statusInformation!= null)&&(!this.statusInformation.isEmpty()))?this.getStatusInformation():null);
            strategy.appendField(locator, this, "statusInformation", buffer, theStatusInformation, ((this.statusInformation!= null)&&(!this.statusInformation.isEmpty())));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            FinancialAmountType theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            strategy.appendField(locator, this, "unitPrice", buffer, theUnitPrice, (this.unitPrice!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
