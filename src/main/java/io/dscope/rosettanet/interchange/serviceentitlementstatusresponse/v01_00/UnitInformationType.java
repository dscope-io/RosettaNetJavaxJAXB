
package io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_00;

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
import io.dscope.rosettanet.domain.service.service.v02_20.PurchaseDate;
import io.dscope.rosettanet.domain.service.service.v02_20.WarrantyInformation;
import io.dscope.rosettanet.universal.contactinformation.v01_04.ContactInformationType;
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
 * <p>Java class for UnitInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponseNotification:xsd:schema:01.00}ContractInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EndUser" type="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.04}ContactInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EventInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponseNotification:xsd:schema:01.00}EventInformationType" minOccurs="0"/&gt;
 *         &lt;element name="IsRequiredContractServiceProvider" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PartInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponseNotification:xsd:schema:01.00}PartInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductConfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}PurchaseDate" minOccurs="0"/&gt;
 *         &lt;element name="SerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StatusInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponseNotification:xsd:schema:01.00}StatusInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}WarrantyInformation"/&gt;
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
@XmlType(name = "UnitInformationType", propOrder = {
    "contractInformation",
    "endUser",
    "eventInformation",
    "isRequiredContractServiceProvider",
    "manufactureDate",
    "partInformation",
    "productClassification",
    "productConfiguration",
    "productIdentification",
    "purchaseDate",
    "serialIdentifier",
    "statusInformation",
    "warrantyInformation"
})
public class UnitInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ContractInformation")
    protected List<ContractInformationType> contractInformation;
    @XmlElement(name = "EndUser")
    protected List<ContactInformationType> endUser;
    @XmlElement(name = "EventInformation")
    protected EventInformationType eventInformation;
    @XmlElement(name = "IsRequiredContractServiceProvider")
    protected boolean isRequiredContractServiceProvider;
    @XmlElement(name = "ManufactureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar manufactureDate;
    @XmlElement(name = "PartInformation")
    protected List<PartInformationType> partInformation;
    @XmlElement(name = "ProductClassification")
    protected String productClassification;
    @XmlElement(name = "ProductConfiguration")
    protected String productConfiguration;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "PurchaseDate", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = PurchaseDate.class, required = false)
    protected PurchaseDate purchaseDate;
    @XmlElement(name = "SerialIdentifier", required = true)
    protected String serialIdentifier;
    @XmlElement(name = "StatusInformation")
    protected List<StatusInformationType> statusInformation;
    @XmlElementRef(name = "WarrantyInformation", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = WarrantyInformation.class)
    protected WarrantyInformation warrantyInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contractInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractInformationType }
     * 
     * 
     */
    public List<ContractInformationType> getContractInformation() {
        if (contractInformation == null) {
            contractInformation = new ArrayList<ContractInformationType>();
        }
        return this.contractInformation;
    }

    /**
     * Gets the value of the endUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationType }
     * 
     * 
     */
    public List<ContactInformationType> getEndUser() {
        if (endUser == null) {
            endUser = new ArrayList<ContactInformationType>();
        }
        return this.endUser;
    }

    /**
     * Gets the value of the eventInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EventInformationType }
     *     
     */
    public EventInformationType getEventInformation() {
        return eventInformation;
    }

    /**
     * Sets the value of the eventInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventInformationType }
     *     
     */
    public void setEventInformation(EventInformationType value) {
        this.eventInformation = value;
    }

    /**
     * Gets the value of the isRequiredContractServiceProvider property.
     * 
     */
    public boolean isIsRequiredContractServiceProvider() {
        return isRequiredContractServiceProvider;
    }

    /**
     * Sets the value of the isRequiredContractServiceProvider property.
     * 
     */
    public void setIsRequiredContractServiceProvider(boolean value) {
        this.isRequiredContractServiceProvider = value;
    }

    /**
     * Gets the value of the manufactureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Sets the value of the manufactureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setManufactureDate(XMLGregorianCalendar value) {
        this.manufactureDate = value;
    }

    /**
     * Gets the value of the partInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartInformationType }
     * 
     * 
     */
    public List<PartInformationType> getPartInformation() {
        if (partInformation == null) {
            partInformation = new ArrayList<PartInformationType>();
        }
        return this.partInformation;
    }

    /**
     * Gets the value of the productClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClassification() {
        return productClassification;
    }

    /**
     * Sets the value of the productClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClassification(String value) {
        this.productClassification = value;
    }

    /**
     * Gets the value of the productConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductConfiguration() {
        return productConfiguration;
    }

    /**
     * Sets the value of the productConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductConfiguration(String value) {
        this.productConfiguration = value;
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
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseDate }
     *     
     */
    public PurchaseDate getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseDate }
     *     
     */
    public void setPurchaseDate(PurchaseDate value) {
        this.purchaseDate = value;
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
     * Gets the value of the warrantyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyInformation }
     *     
     */
    public WarrantyInformation getWarrantyInformation() {
        return warrantyInformation;
    }

    /**
     * Sets the value of the warrantyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyInformation }
     *     
     */
    public void setWarrantyInformation(WarrantyInformation value) {
        this.warrantyInformation = value;
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
        final UnitInformationType that = ((UnitInformationType) object);
        {
            List<ContractInformationType> lhsContractInformation;
            lhsContractInformation = (((this.contractInformation!= null)&&(!this.contractInformation.isEmpty()))?this.getContractInformation():null);
            List<ContractInformationType> rhsContractInformation;
            rhsContractInformation = (((that.contractInformation!= null)&&(!that.contractInformation.isEmpty()))?that.getContractInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractInformation", lhsContractInformation), LocatorUtils.property(thatLocator, "contractInformation", rhsContractInformation), lhsContractInformation, rhsContractInformation, ((this.contractInformation!= null)&&(!this.contractInformation.isEmpty())), ((that.contractInformation!= null)&&(!that.contractInformation.isEmpty())))) {
                return false;
            }
        }
        {
            List<ContactInformationType> lhsEndUser;
            lhsEndUser = (((this.endUser!= null)&&(!this.endUser.isEmpty()))?this.getEndUser():null);
            List<ContactInformationType> rhsEndUser;
            rhsEndUser = (((that.endUser!= null)&&(!that.endUser.isEmpty()))?that.getEndUser():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endUser", lhsEndUser), LocatorUtils.property(thatLocator, "endUser", rhsEndUser), lhsEndUser, rhsEndUser, ((this.endUser!= null)&&(!this.endUser.isEmpty())), ((that.endUser!= null)&&(!that.endUser.isEmpty())))) {
                return false;
            }
        }
        {
            EventInformationType lhsEventInformation;
            lhsEventInformation = this.getEventInformation();
            EventInformationType rhsEventInformation;
            rhsEventInformation = that.getEventInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventInformation", lhsEventInformation), LocatorUtils.property(thatLocator, "eventInformation", rhsEventInformation), lhsEventInformation, rhsEventInformation, (this.eventInformation!= null), (that.eventInformation!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsRequiredContractServiceProvider;
            lhsIsRequiredContractServiceProvider = this.isIsRequiredContractServiceProvider();
            boolean rhsIsRequiredContractServiceProvider;
            rhsIsRequiredContractServiceProvider = that.isIsRequiredContractServiceProvider();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRequiredContractServiceProvider", lhsIsRequiredContractServiceProvider), LocatorUtils.property(thatLocator, "isRequiredContractServiceProvider", rhsIsRequiredContractServiceProvider), lhsIsRequiredContractServiceProvider, rhsIsRequiredContractServiceProvider, true, true)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsManufactureDate;
            lhsManufactureDate = this.getManufactureDate();
            XMLGregorianCalendar rhsManufactureDate;
            rhsManufactureDate = that.getManufactureDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufactureDate", lhsManufactureDate), LocatorUtils.property(thatLocator, "manufactureDate", rhsManufactureDate), lhsManufactureDate, rhsManufactureDate, (this.manufactureDate!= null), (that.manufactureDate!= null))) {
                return false;
            }
        }
        {
            List<PartInformationType> lhsPartInformation;
            lhsPartInformation = (((this.partInformation!= null)&&(!this.partInformation.isEmpty()))?this.getPartInformation():null);
            List<PartInformationType> rhsPartInformation;
            rhsPartInformation = (((that.partInformation!= null)&&(!that.partInformation.isEmpty()))?that.getPartInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partInformation", lhsPartInformation), LocatorUtils.property(thatLocator, "partInformation", rhsPartInformation), lhsPartInformation, rhsPartInformation, ((this.partInformation!= null)&&(!this.partInformation.isEmpty())), ((that.partInformation!= null)&&(!that.partInformation.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsProductClassification;
            lhsProductClassification = this.getProductClassification();
            String rhsProductClassification;
            rhsProductClassification = that.getProductClassification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productClassification", lhsProductClassification), LocatorUtils.property(thatLocator, "productClassification", rhsProductClassification), lhsProductClassification, rhsProductClassification, (this.productClassification!= null), (that.productClassification!= null))) {
                return false;
            }
        }
        {
            String lhsProductConfiguration;
            lhsProductConfiguration = this.getProductConfiguration();
            String rhsProductConfiguration;
            rhsProductConfiguration = that.getProductConfiguration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productConfiguration", lhsProductConfiguration), LocatorUtils.property(thatLocator, "productConfiguration", rhsProductConfiguration), lhsProductConfiguration, rhsProductConfiguration, (this.productConfiguration!= null), (that.productConfiguration!= null))) {
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
            PurchaseDate lhsPurchaseDate;
            lhsPurchaseDate = this.getPurchaseDate();
            PurchaseDate rhsPurchaseDate;
            rhsPurchaseDate = that.getPurchaseDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseDate", lhsPurchaseDate), LocatorUtils.property(thatLocator, "purchaseDate", rhsPurchaseDate), lhsPurchaseDate, rhsPurchaseDate, (this.purchaseDate!= null), (that.purchaseDate!= null))) {
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
            List<StatusInformationType> lhsStatusInformation;
            lhsStatusInformation = (((this.statusInformation!= null)&&(!this.statusInformation.isEmpty()))?this.getStatusInformation():null);
            List<StatusInformationType> rhsStatusInformation;
            rhsStatusInformation = (((that.statusInformation!= null)&&(!that.statusInformation.isEmpty()))?that.getStatusInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusInformation", lhsStatusInformation), LocatorUtils.property(thatLocator, "statusInformation", rhsStatusInformation), lhsStatusInformation, rhsStatusInformation, ((this.statusInformation!= null)&&(!this.statusInformation.isEmpty())), ((that.statusInformation!= null)&&(!that.statusInformation.isEmpty())))) {
                return false;
            }
        }
        {
            WarrantyInformation lhsWarrantyInformation;
            lhsWarrantyInformation = this.getWarrantyInformation();
            WarrantyInformation rhsWarrantyInformation;
            rhsWarrantyInformation = that.getWarrantyInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyInformation", lhsWarrantyInformation), LocatorUtils.property(thatLocator, "warrantyInformation", rhsWarrantyInformation), lhsWarrantyInformation, rhsWarrantyInformation, (this.warrantyInformation!= null), (that.warrantyInformation!= null))) {
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
            List<ContractInformationType> theContractInformation;
            theContractInformation = (((this.contractInformation!= null)&&(!this.contractInformation.isEmpty()))?this.getContractInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractInformation", theContractInformation), currentHashCode, theContractInformation, ((this.contractInformation!= null)&&(!this.contractInformation.isEmpty())));
        }
        {
            List<ContactInformationType> theEndUser;
            theEndUser = (((this.endUser!= null)&&(!this.endUser.isEmpty()))?this.getEndUser():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endUser", theEndUser), currentHashCode, theEndUser, ((this.endUser!= null)&&(!this.endUser.isEmpty())));
        }
        {
            EventInformationType theEventInformation;
            theEventInformation = this.getEventInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventInformation", theEventInformation), currentHashCode, theEventInformation, (this.eventInformation!= null));
        }
        {
            boolean theIsRequiredContractServiceProvider;
            theIsRequiredContractServiceProvider = this.isIsRequiredContractServiceProvider();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRequiredContractServiceProvider", theIsRequiredContractServiceProvider), currentHashCode, theIsRequiredContractServiceProvider, true);
        }
        {
            XMLGregorianCalendar theManufactureDate;
            theManufactureDate = this.getManufactureDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufactureDate", theManufactureDate), currentHashCode, theManufactureDate, (this.manufactureDate!= null));
        }
        {
            List<PartInformationType> thePartInformation;
            thePartInformation = (((this.partInformation!= null)&&(!this.partInformation.isEmpty()))?this.getPartInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partInformation", thePartInformation), currentHashCode, thePartInformation, ((this.partInformation!= null)&&(!this.partInformation.isEmpty())));
        }
        {
            String theProductClassification;
            theProductClassification = this.getProductClassification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productClassification", theProductClassification), currentHashCode, theProductClassification, (this.productClassification!= null));
        }
        {
            String theProductConfiguration;
            theProductConfiguration = this.getProductConfiguration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productConfiguration", theProductConfiguration), currentHashCode, theProductConfiguration, (this.productConfiguration!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            PurchaseDate thePurchaseDate;
            thePurchaseDate = this.getPurchaseDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseDate", thePurchaseDate), currentHashCode, thePurchaseDate, (this.purchaseDate!= null));
        }
        {
            String theSerialIdentifier;
            theSerialIdentifier = this.getSerialIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialIdentifier", theSerialIdentifier), currentHashCode, theSerialIdentifier, (this.serialIdentifier!= null));
        }
        {
            List<StatusInformationType> theStatusInformation;
            theStatusInformation = (((this.statusInformation!= null)&&(!this.statusInformation.isEmpty()))?this.getStatusInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusInformation", theStatusInformation), currentHashCode, theStatusInformation, ((this.statusInformation!= null)&&(!this.statusInformation.isEmpty())));
        }
        {
            WarrantyInformation theWarrantyInformation;
            theWarrantyInformation = this.getWarrantyInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyInformation", theWarrantyInformation), currentHashCode, theWarrantyInformation, (this.warrantyInformation!= null));
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
            List<ContractInformationType> theContractInformation;
            theContractInformation = (((this.contractInformation!= null)&&(!this.contractInformation.isEmpty()))?this.getContractInformation():null);
            strategy.appendField(locator, this, "contractInformation", buffer, theContractInformation, ((this.contractInformation!= null)&&(!this.contractInformation.isEmpty())));
        }
        {
            List<ContactInformationType> theEndUser;
            theEndUser = (((this.endUser!= null)&&(!this.endUser.isEmpty()))?this.getEndUser():null);
            strategy.appendField(locator, this, "endUser", buffer, theEndUser, ((this.endUser!= null)&&(!this.endUser.isEmpty())));
        }
        {
            EventInformationType theEventInformation;
            theEventInformation = this.getEventInformation();
            strategy.appendField(locator, this, "eventInformation", buffer, theEventInformation, (this.eventInformation!= null));
        }
        {
            boolean theIsRequiredContractServiceProvider;
            theIsRequiredContractServiceProvider = this.isIsRequiredContractServiceProvider();
            strategy.appendField(locator, this, "isRequiredContractServiceProvider", buffer, theIsRequiredContractServiceProvider, true);
        }
        {
            XMLGregorianCalendar theManufactureDate;
            theManufactureDate = this.getManufactureDate();
            strategy.appendField(locator, this, "manufactureDate", buffer, theManufactureDate, (this.manufactureDate!= null));
        }
        {
            List<PartInformationType> thePartInformation;
            thePartInformation = (((this.partInformation!= null)&&(!this.partInformation.isEmpty()))?this.getPartInformation():null);
            strategy.appendField(locator, this, "partInformation", buffer, thePartInformation, ((this.partInformation!= null)&&(!this.partInformation.isEmpty())));
        }
        {
            String theProductClassification;
            theProductClassification = this.getProductClassification();
            strategy.appendField(locator, this, "productClassification", buffer, theProductClassification, (this.productClassification!= null));
        }
        {
            String theProductConfiguration;
            theProductConfiguration = this.getProductConfiguration();
            strategy.appendField(locator, this, "productConfiguration", buffer, theProductConfiguration, (this.productConfiguration!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            PurchaseDate thePurchaseDate;
            thePurchaseDate = this.getPurchaseDate();
            strategy.appendField(locator, this, "purchaseDate", buffer, thePurchaseDate, (this.purchaseDate!= null));
        }
        {
            String theSerialIdentifier;
            theSerialIdentifier = this.getSerialIdentifier();
            strategy.appendField(locator, this, "serialIdentifier", buffer, theSerialIdentifier, (this.serialIdentifier!= null));
        }
        {
            List<StatusInformationType> theStatusInformation;
            theStatusInformation = (((this.statusInformation!= null)&&(!this.statusInformation.isEmpty()))?this.getStatusInformation():null);
            strategy.appendField(locator, this, "statusInformation", buffer, theStatusInformation, ((this.statusInformation!= null)&&(!this.statusInformation.isEmpty())));
        }
        {
            WarrantyInformation theWarrantyInformation;
            theWarrantyInformation = this.getWarrantyInformation();
            strategy.appendField(locator, this, "warrantyInformation", buffer, theWarrantyInformation, (this.warrantyInformation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
