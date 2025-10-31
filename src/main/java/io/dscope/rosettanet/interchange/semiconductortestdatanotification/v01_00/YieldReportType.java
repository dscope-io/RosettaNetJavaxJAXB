
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_00;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for YieldReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YieldReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GoodDieQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="GrossDiePerWafer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="OtherDefectQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestQty" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TestYld" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:1.0}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element name="TotalFunctionalDie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "YieldReportType", propOrder = {
    "goodDieQuantity",
    "grossDiePerWafer",
    "otherDefectQuantity",
    "testQty",
    "testYld",
    "totalFunctionalDie"
})
public class YieldReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "GoodDieQuantity")
    protected BigInteger goodDieQuantity;
    @XmlElement(name = "GrossDiePerWafer")
    protected BigInteger grossDiePerWafer;
    @XmlElement(name = "OtherDefectQuantity")
    protected String otherDefectQuantity;
    @XmlElement(name = "TestQty")
    protected BigInteger testQty;
    @XmlElement(name = "TestYld")
    protected BigDecimal testYld;
    @XmlElement(name = "TotalFunctionalDie")
    protected String totalFunctionalDie;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the goodDieQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGoodDieQuantity() {
        return goodDieQuantity;
    }

    /**
     * Sets the value of the goodDieQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGoodDieQuantity(BigInteger value) {
        this.goodDieQuantity = value;
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
     * Gets the value of the otherDefectQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDefectQuantity() {
        return otherDefectQuantity;
    }

    /**
     * Sets the value of the otherDefectQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDefectQuantity(String value) {
        this.otherDefectQuantity = value;
    }

    /**
     * Gets the value of the testQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestQty() {
        return testQty;
    }

    /**
     * Sets the value of the testQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestQty(BigInteger value) {
        this.testQty = value;
    }

    /**
     * Gets the value of the testYld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTestYld() {
        return testYld;
    }

    /**
     * Sets the value of the testYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTestYld(BigDecimal value) {
        this.testYld = value;
    }

    /**
     * Gets the value of the totalFunctionalDie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFunctionalDie() {
        return totalFunctionalDie;
    }

    /**
     * Sets the value of the totalFunctionalDie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFunctionalDie(String value) {
        this.totalFunctionalDie = value;
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
        final YieldReportType that = ((YieldReportType) object);
        {
            BigInteger lhsGoodDieQuantity;
            lhsGoodDieQuantity = this.getGoodDieQuantity();
            BigInteger rhsGoodDieQuantity;
            rhsGoodDieQuantity = that.getGoodDieQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goodDieQuantity", lhsGoodDieQuantity), LocatorUtils.property(thatLocator, "goodDieQuantity", rhsGoodDieQuantity), lhsGoodDieQuantity, rhsGoodDieQuantity, (this.goodDieQuantity!= null), (that.goodDieQuantity!= null))) {
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
            String lhsOtherDefectQuantity;
            lhsOtherDefectQuantity = this.getOtherDefectQuantity();
            String rhsOtherDefectQuantity;
            rhsOtherDefectQuantity = that.getOtherDefectQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherDefectQuantity", lhsOtherDefectQuantity), LocatorUtils.property(thatLocator, "otherDefectQuantity", rhsOtherDefectQuantity), lhsOtherDefectQuantity, rhsOtherDefectQuantity, (this.otherDefectQuantity!= null), (that.otherDefectQuantity!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsTestQty;
            lhsTestQty = this.getTestQty();
            BigInteger rhsTestQty;
            rhsTestQty = that.getTestQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testQty", lhsTestQty), LocatorUtils.property(thatLocator, "testQty", rhsTestQty), lhsTestQty, rhsTestQty, (this.testQty!= null), (that.testQty!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTestYld;
            lhsTestYld = this.getTestYld();
            BigDecimal rhsTestYld;
            rhsTestYld = that.getTestYld();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testYld", lhsTestYld), LocatorUtils.property(thatLocator, "testYld", rhsTestYld), lhsTestYld, rhsTestYld, (this.testYld!= null), (that.testYld!= null))) {
                return false;
            }
        }
        {
            String lhsTotalFunctionalDie;
            lhsTotalFunctionalDie = this.getTotalFunctionalDie();
            String rhsTotalFunctionalDie;
            rhsTotalFunctionalDie = that.getTotalFunctionalDie();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalFunctionalDie", lhsTotalFunctionalDie), LocatorUtils.property(thatLocator, "totalFunctionalDie", rhsTotalFunctionalDie), lhsTotalFunctionalDie, rhsTotalFunctionalDie, (this.totalFunctionalDie!= null), (that.totalFunctionalDie!= null))) {
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
            BigInteger theGoodDieQuantity;
            theGoodDieQuantity = this.getGoodDieQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "goodDieQuantity", theGoodDieQuantity), currentHashCode, theGoodDieQuantity, (this.goodDieQuantity!= null));
        }
        {
            BigInteger theGrossDiePerWafer;
            theGrossDiePerWafer = this.getGrossDiePerWafer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grossDiePerWafer", theGrossDiePerWafer), currentHashCode, theGrossDiePerWafer, (this.grossDiePerWafer!= null));
        }
        {
            String theOtherDefectQuantity;
            theOtherDefectQuantity = this.getOtherDefectQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherDefectQuantity", theOtherDefectQuantity), currentHashCode, theOtherDefectQuantity, (this.otherDefectQuantity!= null));
        }
        {
            BigInteger theTestQty;
            theTestQty = this.getTestQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testQty", theTestQty), currentHashCode, theTestQty, (this.testQty!= null));
        }
        {
            BigDecimal theTestYld;
            theTestYld = this.getTestYld();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testYld", theTestYld), currentHashCode, theTestYld, (this.testYld!= null));
        }
        {
            String theTotalFunctionalDie;
            theTotalFunctionalDie = this.getTotalFunctionalDie();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalFunctionalDie", theTotalFunctionalDie), currentHashCode, theTotalFunctionalDie, (this.totalFunctionalDie!= null));
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
            BigInteger theGoodDieQuantity;
            theGoodDieQuantity = this.getGoodDieQuantity();
            strategy.appendField(locator, this, "goodDieQuantity", buffer, theGoodDieQuantity, (this.goodDieQuantity!= null));
        }
        {
            BigInteger theGrossDiePerWafer;
            theGrossDiePerWafer = this.getGrossDiePerWafer();
            strategy.appendField(locator, this, "grossDiePerWafer", buffer, theGrossDiePerWafer, (this.grossDiePerWafer!= null));
        }
        {
            String theOtherDefectQuantity;
            theOtherDefectQuantity = this.getOtherDefectQuantity();
            strategy.appendField(locator, this, "otherDefectQuantity", buffer, theOtherDefectQuantity, (this.otherDefectQuantity!= null));
        }
        {
            BigInteger theTestQty;
            theTestQty = this.getTestQty();
            strategy.appendField(locator, this, "testQty", buffer, theTestQty, (this.testQty!= null));
        }
        {
            BigDecimal theTestYld;
            theTestYld = this.getTestYld();
            strategy.appendField(locator, this, "testYld", buffer, theTestYld, (this.testYld!= null));
        }
        {
            String theTotalFunctionalDie;
            theTotalFunctionalDie = this.getTotalFunctionalDie();
            strategy.appendField(locator, this, "totalFunctionalDie", buffer, theTotalFunctionalDie, (this.totalFunctionalDie!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
