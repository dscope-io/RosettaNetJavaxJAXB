
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_01;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07.IntCoordinate;
import io.dscope.rosettanet.universal.dates.v01_01.DateTimePeriodType;
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
 * <p>Java class for DieReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DieReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CharFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CompositeFailSort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DieTestingPeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.01}DateTimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="FirstFailSort" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="GangTest" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.01}GangTestType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07}IntCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="UserSite" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "DieReportType", propOrder = {
    "charFlag",
    "compositeFailSort",
    "dieTestingPeriod",
    "firstFailSort",
    "gangTest",
    "intCoordinate",
    "userSite"
})
public class DieReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CharFlag")
    protected Boolean charFlag;
    @XmlElement(name = "CompositeFailSort")
    protected String compositeFailSort;
    @XmlElement(name = "DieTestingPeriod")
    protected DateTimePeriodType dieTestingPeriod;
    @XmlElement(name = "FirstFailSort")
    protected BigInteger firstFailSort;
    @XmlElement(name = "GangTest")
    protected GangTestType gangTest;
    @XmlElementRef(name = "IntCoordinate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", type = IntCoordinate.class, required = false)
    protected IntCoordinate intCoordinate;
    @XmlElement(name = "UserSite")
    protected BigInteger userSite;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the charFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCharFlag() {
        return charFlag;
    }

    /**
     * Sets the value of the charFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCharFlag(Boolean value) {
        this.charFlag = value;
    }

    /**
     * Gets the value of the compositeFailSort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeFailSort() {
        return compositeFailSort;
    }

    /**
     * Sets the value of the compositeFailSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeFailSort(String value) {
        this.compositeFailSort = value;
    }

    /**
     * Gets the value of the dieTestingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    public DateTimePeriodType getDieTestingPeriod() {
        return dieTestingPeriod;
    }

    /**
     * Sets the value of the dieTestingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    public void setDieTestingPeriod(DateTimePeriodType value) {
        this.dieTestingPeriod = value;
    }

    /**
     * Gets the value of the firstFailSort property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstFailSort() {
        return firstFailSort;
    }

    /**
     * Sets the value of the firstFailSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstFailSort(BigInteger value) {
        this.firstFailSort = value;
    }

    /**
     * Gets the value of the gangTest property.
     * 
     * @return
     *     possible object is
     *     {@link GangTestType }
     *     
     */
    public GangTestType getGangTest() {
        return gangTest;
    }

    /**
     * Sets the value of the gangTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GangTestType }
     *     
     */
    public void setGangTest(GangTestType value) {
        this.gangTest = value;
    }

    /**
     * Gets the value of the intCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link IntCoordinate }
     *     
     */
    public IntCoordinate getIntCoordinate() {
        return intCoordinate;
    }

    /**
     * Sets the value of the intCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntCoordinate }
     *     
     */
    public void setIntCoordinate(IntCoordinate value) {
        this.intCoordinate = value;
    }

    /**
     * Gets the value of the userSite property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserSite() {
        return userSite;
    }

    /**
     * Sets the value of the userSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserSite(BigInteger value) {
        this.userSite = value;
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
        final DieReportType that = ((DieReportType) object);
        {
            Boolean lhsCharFlag;
            lhsCharFlag = this.isCharFlag();
            Boolean rhsCharFlag;
            rhsCharFlag = that.isCharFlag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "charFlag", lhsCharFlag), LocatorUtils.property(thatLocator, "charFlag", rhsCharFlag), lhsCharFlag, rhsCharFlag, (this.charFlag!= null), (that.charFlag!= null))) {
                return false;
            }
        }
        {
            String lhsCompositeFailSort;
            lhsCompositeFailSort = this.getCompositeFailSort();
            String rhsCompositeFailSort;
            rhsCompositeFailSort = that.getCompositeFailSort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compositeFailSort", lhsCompositeFailSort), LocatorUtils.property(thatLocator, "compositeFailSort", rhsCompositeFailSort), lhsCompositeFailSort, rhsCompositeFailSort, (this.compositeFailSort!= null), (that.compositeFailSort!= null))) {
                return false;
            }
        }
        {
            DateTimePeriodType lhsDieTestingPeriod;
            lhsDieTestingPeriod = this.getDieTestingPeriod();
            DateTimePeriodType rhsDieTestingPeriod;
            rhsDieTestingPeriod = that.getDieTestingPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dieTestingPeriod", lhsDieTestingPeriod), LocatorUtils.property(thatLocator, "dieTestingPeriod", rhsDieTestingPeriod), lhsDieTestingPeriod, rhsDieTestingPeriod, (this.dieTestingPeriod!= null), (that.dieTestingPeriod!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsFirstFailSort;
            lhsFirstFailSort = this.getFirstFailSort();
            BigInteger rhsFirstFailSort;
            rhsFirstFailSort = that.getFirstFailSort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstFailSort", lhsFirstFailSort), LocatorUtils.property(thatLocator, "firstFailSort", rhsFirstFailSort), lhsFirstFailSort, rhsFirstFailSort, (this.firstFailSort!= null), (that.firstFailSort!= null))) {
                return false;
            }
        }
        {
            GangTestType lhsGangTest;
            lhsGangTest = this.getGangTest();
            GangTestType rhsGangTest;
            rhsGangTest = that.getGangTest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gangTest", lhsGangTest), LocatorUtils.property(thatLocator, "gangTest", rhsGangTest), lhsGangTest, rhsGangTest, (this.gangTest!= null), (that.gangTest!= null))) {
                return false;
            }
        }
        {
            IntCoordinate lhsIntCoordinate;
            lhsIntCoordinate = this.getIntCoordinate();
            IntCoordinate rhsIntCoordinate;
            rhsIntCoordinate = that.getIntCoordinate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intCoordinate", lhsIntCoordinate), LocatorUtils.property(thatLocator, "intCoordinate", rhsIntCoordinate), lhsIntCoordinate, rhsIntCoordinate, (this.intCoordinate!= null), (that.intCoordinate!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsUserSite;
            lhsUserSite = this.getUserSite();
            BigInteger rhsUserSite;
            rhsUserSite = that.getUserSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userSite", lhsUserSite), LocatorUtils.property(thatLocator, "userSite", rhsUserSite), lhsUserSite, rhsUserSite, (this.userSite!= null), (that.userSite!= null))) {
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
            Boolean theCharFlag;
            theCharFlag = this.isCharFlag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "charFlag", theCharFlag), currentHashCode, theCharFlag, (this.charFlag!= null));
        }
        {
            String theCompositeFailSort;
            theCompositeFailSort = this.getCompositeFailSort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compositeFailSort", theCompositeFailSort), currentHashCode, theCompositeFailSort, (this.compositeFailSort!= null));
        }
        {
            DateTimePeriodType theDieTestingPeriod;
            theDieTestingPeriod = this.getDieTestingPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dieTestingPeriod", theDieTestingPeriod), currentHashCode, theDieTestingPeriod, (this.dieTestingPeriod!= null));
        }
        {
            BigInteger theFirstFailSort;
            theFirstFailSort = this.getFirstFailSort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstFailSort", theFirstFailSort), currentHashCode, theFirstFailSort, (this.firstFailSort!= null));
        }
        {
            GangTestType theGangTest;
            theGangTest = this.getGangTest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gangTest", theGangTest), currentHashCode, theGangTest, (this.gangTest!= null));
        }
        {
            IntCoordinate theIntCoordinate;
            theIntCoordinate = this.getIntCoordinate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intCoordinate", theIntCoordinate), currentHashCode, theIntCoordinate, (this.intCoordinate!= null));
        }
        {
            BigInteger theUserSite;
            theUserSite = this.getUserSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userSite", theUserSite), currentHashCode, theUserSite, (this.userSite!= null));
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
            Boolean theCharFlag;
            theCharFlag = this.isCharFlag();
            strategy.appendField(locator, this, "charFlag", buffer, theCharFlag, (this.charFlag!= null));
        }
        {
            String theCompositeFailSort;
            theCompositeFailSort = this.getCompositeFailSort();
            strategy.appendField(locator, this, "compositeFailSort", buffer, theCompositeFailSort, (this.compositeFailSort!= null));
        }
        {
            DateTimePeriodType theDieTestingPeriod;
            theDieTestingPeriod = this.getDieTestingPeriod();
            strategy.appendField(locator, this, "dieTestingPeriod", buffer, theDieTestingPeriod, (this.dieTestingPeriod!= null));
        }
        {
            BigInteger theFirstFailSort;
            theFirstFailSort = this.getFirstFailSort();
            strategy.appendField(locator, this, "firstFailSort", buffer, theFirstFailSort, (this.firstFailSort!= null));
        }
        {
            GangTestType theGangTest;
            theGangTest = this.getGangTest();
            strategy.appendField(locator, this, "gangTest", buffer, theGangTest, (this.gangTest!= null));
        }
        {
            IntCoordinate theIntCoordinate;
            theIntCoordinate = this.getIntCoordinate();
            strategy.appendField(locator, this, "intCoordinate", buffer, theIntCoordinate, (this.intCoordinate!= null));
        }
        {
            BigInteger theUserSite;
            theUserSite = this.getUserSite();
            strategy.appendField(locator, this, "userSite", buffer, theUserSite, (this.userSite!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
