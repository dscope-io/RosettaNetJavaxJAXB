
package io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00;

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
import io.dscope.rosettanet.universal.productidentification.v01_00.ProductIdentification;
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
 * <p>Java class for ProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}LotIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0}ProductIdentification"/&gt;
 *         &lt;element name="ProvisionPeriod" type="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element name="SerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" fixed="1.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformationType", propOrder = {
    "contractIdentifier",
    "lotIdentification",
    "productIdentification",
    "provisionPeriod",
    "serialIdentifier"
})
public class ProductInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ContractIdentifier")
    protected String contractIdentifier;
    @XmlElementRef(name = "LotIdentification", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = LotIdentification.class, required = false)
    protected LotIdentification lotIdentification;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProvisionPeriod")
    protected DatePeriodAndDurationType provisionPeriod;
    @XmlElement(name = "SerialIdentifier")
    protected List<String> serialIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractIdentifier() {
        return contractIdentifier;
    }

    /**
     * Sets the value of the contractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractIdentifier(String value) {
        this.contractIdentifier = value;
    }

    /**
     * Gets the value of the lotIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentification }
     *     
     */
    public LotIdentification getLotIdentification() {
        return lotIdentification;
    }

    /**
     * Sets the value of the lotIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentification }
     *     
     */
    public void setLotIdentification(LotIdentification value) {
        this.lotIdentification = value;
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
     * Gets the value of the provisionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public DatePeriodAndDurationType getProvisionPeriod() {
        return provisionPeriod;
    }

    /**
     * Sets the value of the provisionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public void setProvisionPeriod(DatePeriodAndDurationType value) {
        this.provisionPeriod = value;
    }

    /**
     * Gets the value of the serialIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSerialIdentifier() {
        if (serialIdentifier == null) {
            serialIdentifier = new ArrayList<String>();
        }
        return this.serialIdentifier;
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
        if (schemaVersion == null) {
            return "1.0";
        } else {
            return schemaVersion;
        }
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
            String lhsContractIdentifier;
            lhsContractIdentifier = this.getContractIdentifier();
            String rhsContractIdentifier;
            rhsContractIdentifier = that.getContractIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractIdentifier", lhsContractIdentifier), LocatorUtils.property(thatLocator, "contractIdentifier", rhsContractIdentifier), lhsContractIdentifier, rhsContractIdentifier, (this.contractIdentifier!= null), (that.contractIdentifier!= null))) {
                return false;
            }
        }
        {
            LotIdentification lhsLotIdentification;
            lhsLotIdentification = this.getLotIdentification();
            LotIdentification rhsLotIdentification;
            rhsLotIdentification = that.getLotIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotIdentification", lhsLotIdentification), LocatorUtils.property(thatLocator, "lotIdentification", rhsLotIdentification), lhsLotIdentification, rhsLotIdentification, (this.lotIdentification!= null), (that.lotIdentification!= null))) {
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
            DatePeriodAndDurationType lhsProvisionPeriod;
            lhsProvisionPeriod = this.getProvisionPeriod();
            DatePeriodAndDurationType rhsProvisionPeriod;
            rhsProvisionPeriod = that.getProvisionPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "provisionPeriod", lhsProvisionPeriod), LocatorUtils.property(thatLocator, "provisionPeriod", rhsProvisionPeriod), lhsProvisionPeriod, rhsProvisionPeriod, (this.provisionPeriod!= null), (that.provisionPeriod!= null))) {
                return false;
            }
        }
        {
            List<String> lhsSerialIdentifier;
            lhsSerialIdentifier = (((this.serialIdentifier!= null)&&(!this.serialIdentifier.isEmpty()))?this.getSerialIdentifier():null);
            List<String> rhsSerialIdentifier;
            rhsSerialIdentifier = (((that.serialIdentifier!= null)&&(!that.serialIdentifier.isEmpty()))?that.getSerialIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serialIdentifier", lhsSerialIdentifier), LocatorUtils.property(thatLocator, "serialIdentifier", rhsSerialIdentifier), lhsSerialIdentifier, rhsSerialIdentifier, ((this.serialIdentifier!= null)&&(!this.serialIdentifier.isEmpty())), ((that.serialIdentifier!= null)&&(!that.serialIdentifier.isEmpty())))) {
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
            String theContractIdentifier;
            theContractIdentifier = this.getContractIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractIdentifier", theContractIdentifier), currentHashCode, theContractIdentifier, (this.contractIdentifier!= null));
        }
        {
            LotIdentification theLotIdentification;
            theLotIdentification = this.getLotIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotIdentification", theLotIdentification), currentHashCode, theLotIdentification, (this.lotIdentification!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            DatePeriodAndDurationType theProvisionPeriod;
            theProvisionPeriod = this.getProvisionPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "provisionPeriod", theProvisionPeriod), currentHashCode, theProvisionPeriod, (this.provisionPeriod!= null));
        }
        {
            List<String> theSerialIdentifier;
            theSerialIdentifier = (((this.serialIdentifier!= null)&&(!this.serialIdentifier.isEmpty()))?this.getSerialIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialIdentifier", theSerialIdentifier), currentHashCode, theSerialIdentifier, ((this.serialIdentifier!= null)&&(!this.serialIdentifier.isEmpty())));
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
            String theContractIdentifier;
            theContractIdentifier = this.getContractIdentifier();
            strategy.appendField(locator, this, "contractIdentifier", buffer, theContractIdentifier, (this.contractIdentifier!= null));
        }
        {
            LotIdentification theLotIdentification;
            theLotIdentification = this.getLotIdentification();
            strategy.appendField(locator, this, "lotIdentification", buffer, theLotIdentification, (this.lotIdentification!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            DatePeriodAndDurationType theProvisionPeriod;
            theProvisionPeriod = this.getProvisionPeriod();
            strategy.appendField(locator, this, "provisionPeriod", buffer, theProvisionPeriod, (this.provisionPeriod!= null));
        }
        {
            List<String> theSerialIdentifier;
            theSerialIdentifier = (((this.serialIdentifier!= null)&&(!this.serialIdentifier.isEmpty()))?this.getSerialIdentifier():null);
            strategy.appendField(locator, this, "serialIdentifier", buffer, theSerialIdentifier, ((this.serialIdentifier!= null)&&(!this.serialIdentifier.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
