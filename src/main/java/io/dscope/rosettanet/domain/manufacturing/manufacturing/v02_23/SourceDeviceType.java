
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23;

import java.math.BigInteger;
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
import io.dscope.rosettanet.universal.physicaldimension.v01_06.LinearType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
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
 * <p>Java class for SourceDeviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceDeviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternateSourceDevice" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DiePerWaferWorkOn" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="GrossDiePerWafer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}SourceLot" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}WaferBacksideInformation" minOccurs="0"/&gt;
 *         &lt;element name="WaferSize" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.06}LinearType" minOccurs="0"/&gt;
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
@XmlType(name = "SourceDeviceType", propOrder = {
    "alternateSourceDevice",
    "diePerWaferWorkOn",
    "grossDiePerWafer",
    "productIdentification",
    "sourceLot",
    "waferBacksideInformation",
    "waferSize"
})
public class SourceDeviceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AlternateSourceDevice")
    protected List<ProductIdentificationType> alternateSourceDevice;
    @XmlElement(name = "DiePerWaferWorkOn")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger diePerWaferWorkOn;
    @XmlElement(name = "GrossDiePerWafer")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger grossDiePerWafer;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "SourceLot", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = SourceLot.class)
    protected List<SourceLot> sourceLot;
    @XmlElementRef(name = "WaferBacksideInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = WaferBacksideInformation.class, required = false)
    protected WaferBacksideInformation waferBacksideInformation;
    @XmlElement(name = "WaferSize")
    protected LinearType waferSize;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternateSourceDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateSourceDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateSourceDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getAlternateSourceDevice() {
        if (alternateSourceDevice == null) {
            alternateSourceDevice = new ArrayList<ProductIdentificationType>();
        }
        return this.alternateSourceDevice;
    }

    /**
     * Gets the value of the diePerWaferWorkOn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiePerWaferWorkOn() {
        return diePerWaferWorkOn;
    }

    /**
     * Sets the value of the diePerWaferWorkOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiePerWaferWorkOn(BigInteger value) {
        this.diePerWaferWorkOn = value;
    }

    /**
     * Gets the value of the grossDiePerWafer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrossDiePerWafer() {
        return grossDiePerWafer;
    }

    /**
     * Sets the value of the grossDiePerWafer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrossDiePerWafer(BigInteger value) {
        this.grossDiePerWafer = value;
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
     * Gets the value of the sourceLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceLot }
     * 
     * 
     */
    public List<SourceLot> getSourceLot() {
        if (sourceLot == null) {
            sourceLot = new ArrayList<SourceLot>();
        }
        return this.sourceLot;
    }

    /**
     * Gets the value of the waferBacksideInformation property.
     * 
     * @return
     *     possible object is
     *     {@link WaferBacksideInformation }
     *     
     */
    public WaferBacksideInformation getWaferBacksideInformation() {
        return waferBacksideInformation;
    }

    /**
     * Sets the value of the waferBacksideInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferBacksideInformation }
     *     
     */
    public void setWaferBacksideInformation(WaferBacksideInformation value) {
        this.waferBacksideInformation = value;
    }

    /**
     * Gets the value of the waferSize property.
     * 
     * @return
     *     possible object is
     *     {@link LinearType }
     *     
     */
    public LinearType getWaferSize() {
        return waferSize;
    }

    /**
     * Sets the value of the waferSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearType }
     *     
     */
    public void setWaferSize(LinearType value) {
        this.waferSize = value;
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
        final SourceDeviceType that = ((SourceDeviceType) object);
        {
            List<ProductIdentificationType> lhsAlternateSourceDevice;
            lhsAlternateSourceDevice = (((this.alternateSourceDevice!= null)&&(!this.alternateSourceDevice.isEmpty()))?this.getAlternateSourceDevice():null);
            List<ProductIdentificationType> rhsAlternateSourceDevice;
            rhsAlternateSourceDevice = (((that.alternateSourceDevice!= null)&&(!that.alternateSourceDevice.isEmpty()))?that.getAlternateSourceDevice():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternateSourceDevice", lhsAlternateSourceDevice), LocatorUtils.property(thatLocator, "alternateSourceDevice", rhsAlternateSourceDevice), lhsAlternateSourceDevice, rhsAlternateSourceDevice, ((this.alternateSourceDevice!= null)&&(!this.alternateSourceDevice.isEmpty())), ((that.alternateSourceDevice!= null)&&(!that.alternateSourceDevice.isEmpty())))) {
                return false;
            }
        }
        {
            BigInteger lhsDiePerWaferWorkOn;
            lhsDiePerWaferWorkOn = this.getDiePerWaferWorkOn();
            BigInteger rhsDiePerWaferWorkOn;
            rhsDiePerWaferWorkOn = that.getDiePerWaferWorkOn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "diePerWaferWorkOn", lhsDiePerWaferWorkOn), LocatorUtils.property(thatLocator, "diePerWaferWorkOn", rhsDiePerWaferWorkOn), lhsDiePerWaferWorkOn, rhsDiePerWaferWorkOn, (this.diePerWaferWorkOn!= null), (that.diePerWaferWorkOn!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsGrossDiePerWafer;
            lhsGrossDiePerWafer = this.getGrossDiePerWafer();
            BigInteger rhsGrossDiePerWafer;
            rhsGrossDiePerWafer = that.getGrossDiePerWafer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grossDiePerWafer", lhsGrossDiePerWafer), LocatorUtils.property(thatLocator, "grossDiePerWafer", rhsGrossDiePerWafer), lhsGrossDiePerWafer, rhsGrossDiePerWafer, (this.grossDiePerWafer!= null), (that.grossDiePerWafer!= null))) {
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
            List<SourceLot> lhsSourceLot;
            lhsSourceLot = (((this.sourceLot!= null)&&(!this.sourceLot.isEmpty()))?this.getSourceLot():null);
            List<SourceLot> rhsSourceLot;
            rhsSourceLot = (((that.sourceLot!= null)&&(!that.sourceLot.isEmpty()))?that.getSourceLot():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceLot", lhsSourceLot), LocatorUtils.property(thatLocator, "sourceLot", rhsSourceLot), lhsSourceLot, rhsSourceLot, ((this.sourceLot!= null)&&(!this.sourceLot.isEmpty())), ((that.sourceLot!= null)&&(!that.sourceLot.isEmpty())))) {
                return false;
            }
        }
        {
            WaferBacksideInformation lhsWaferBacksideInformation;
            lhsWaferBacksideInformation = this.getWaferBacksideInformation();
            WaferBacksideInformation rhsWaferBacksideInformation;
            rhsWaferBacksideInformation = that.getWaferBacksideInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferBacksideInformation", lhsWaferBacksideInformation), LocatorUtils.property(thatLocator, "waferBacksideInformation", rhsWaferBacksideInformation), lhsWaferBacksideInformation, rhsWaferBacksideInformation, (this.waferBacksideInformation!= null), (that.waferBacksideInformation!= null))) {
                return false;
            }
        }
        {
            LinearType lhsWaferSize;
            lhsWaferSize = this.getWaferSize();
            LinearType rhsWaferSize;
            rhsWaferSize = that.getWaferSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferSize", lhsWaferSize), LocatorUtils.property(thatLocator, "waferSize", rhsWaferSize), lhsWaferSize, rhsWaferSize, (this.waferSize!= null), (that.waferSize!= null))) {
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
            List<ProductIdentificationType> theAlternateSourceDevice;
            theAlternateSourceDevice = (((this.alternateSourceDevice!= null)&&(!this.alternateSourceDevice.isEmpty()))?this.getAlternateSourceDevice():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternateSourceDevice", theAlternateSourceDevice), currentHashCode, theAlternateSourceDevice, ((this.alternateSourceDevice!= null)&&(!this.alternateSourceDevice.isEmpty())));
        }
        {
            BigInteger theDiePerWaferWorkOn;
            theDiePerWaferWorkOn = this.getDiePerWaferWorkOn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "diePerWaferWorkOn", theDiePerWaferWorkOn), currentHashCode, theDiePerWaferWorkOn, (this.diePerWaferWorkOn!= null));
        }
        {
            BigInteger theGrossDiePerWafer;
            theGrossDiePerWafer = this.getGrossDiePerWafer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grossDiePerWafer", theGrossDiePerWafer), currentHashCode, theGrossDiePerWafer, (this.grossDiePerWafer!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            List<SourceLot> theSourceLot;
            theSourceLot = (((this.sourceLot!= null)&&(!this.sourceLot.isEmpty()))?this.getSourceLot():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceLot", theSourceLot), currentHashCode, theSourceLot, ((this.sourceLot!= null)&&(!this.sourceLot.isEmpty())));
        }
        {
            WaferBacksideInformation theWaferBacksideInformation;
            theWaferBacksideInformation = this.getWaferBacksideInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferBacksideInformation", theWaferBacksideInformation), currentHashCode, theWaferBacksideInformation, (this.waferBacksideInformation!= null));
        }
        {
            LinearType theWaferSize;
            theWaferSize = this.getWaferSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferSize", theWaferSize), currentHashCode, theWaferSize, (this.waferSize!= null));
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
            List<ProductIdentificationType> theAlternateSourceDevice;
            theAlternateSourceDevice = (((this.alternateSourceDevice!= null)&&(!this.alternateSourceDevice.isEmpty()))?this.getAlternateSourceDevice():null);
            strategy.appendField(locator, this, "alternateSourceDevice", buffer, theAlternateSourceDevice, ((this.alternateSourceDevice!= null)&&(!this.alternateSourceDevice.isEmpty())));
        }
        {
            BigInteger theDiePerWaferWorkOn;
            theDiePerWaferWorkOn = this.getDiePerWaferWorkOn();
            strategy.appendField(locator, this, "diePerWaferWorkOn", buffer, theDiePerWaferWorkOn, (this.diePerWaferWorkOn!= null));
        }
        {
            BigInteger theGrossDiePerWafer;
            theGrossDiePerWafer = this.getGrossDiePerWafer();
            strategy.appendField(locator, this, "grossDiePerWafer", buffer, theGrossDiePerWafer, (this.grossDiePerWafer!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            List<SourceLot> theSourceLot;
            theSourceLot = (((this.sourceLot!= null)&&(!this.sourceLot.isEmpty()))?this.getSourceLot():null);
            strategy.appendField(locator, this, "sourceLot", buffer, theSourceLot, ((this.sourceLot!= null)&&(!this.sourceLot.isEmpty())));
        }
        {
            WaferBacksideInformation theWaferBacksideInformation;
            theWaferBacksideInformation = this.getWaferBacksideInformation();
            strategy.appendField(locator, this, "waferBacksideInformation", buffer, theWaferBacksideInformation, (this.waferBacksideInformation!= null));
        }
        {
            LinearType theWaferSize;
            theWaferSize = this.getWaferSize();
            strategy.appendField(locator, this, "waferSize", buffer, theWaferSize, (this.waferSize!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
