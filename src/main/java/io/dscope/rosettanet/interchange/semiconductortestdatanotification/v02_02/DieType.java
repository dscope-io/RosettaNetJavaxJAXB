
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v02_02;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for DieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChipPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DieReticlePN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}TestReportType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "DieType", propOrder = {
    "chipPN",
    "dieReticlePN",
    "packageDescription",
    "partText",
    "serialNumber",
    "testReport"
})
public class DieType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ChipPN")
    protected String chipPN;
    @XmlElement(name = "DieReticlePN")
    protected String dieReticlePN;
    @XmlElement(name = "PackageDescription")
    protected String packageDescription;
    @XmlElement(name = "PartText")
    protected String partText;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "TestReport", required = true)
    protected List<TestReportType> testReport;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the chipPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipPN() {
        return chipPN;
    }

    /**
     * Sets the value of the chipPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipPN(String value) {
        this.chipPN = value;
    }

    /**
     * Gets the value of the dieReticlePN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDieReticlePN() {
        return dieReticlePN;
    }

    /**
     * Sets the value of the dieReticlePN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDieReticlePN(String value) {
        this.dieReticlePN = value;
    }

    /**
     * Gets the value of the packageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDescription() {
        return packageDescription;
    }

    /**
     * Sets the value of the packageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDescription(String value) {
        this.packageDescription = value;
    }

    /**
     * Gets the value of the partText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartText() {
        return partText;
    }

    /**
     * Sets the value of the partText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartText(String value) {
        this.partText = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the testReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestReportType }
     * 
     * 
     */
    public List<TestReportType> getTestReport() {
        if (testReport == null) {
            testReport = new ArrayList<TestReportType>();
        }
        return this.testReport;
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
        final DieType that = ((DieType) object);
        {
            String lhsChipPN;
            lhsChipPN = this.getChipPN();
            String rhsChipPN;
            rhsChipPN = that.getChipPN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chipPN", lhsChipPN), LocatorUtils.property(thatLocator, "chipPN", rhsChipPN), lhsChipPN, rhsChipPN, (this.chipPN!= null), (that.chipPN!= null))) {
                return false;
            }
        }
        {
            String lhsDieReticlePN;
            lhsDieReticlePN = this.getDieReticlePN();
            String rhsDieReticlePN;
            rhsDieReticlePN = that.getDieReticlePN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dieReticlePN", lhsDieReticlePN), LocatorUtils.property(thatLocator, "dieReticlePN", rhsDieReticlePN), lhsDieReticlePN, rhsDieReticlePN, (this.dieReticlePN!= null), (that.dieReticlePN!= null))) {
                return false;
            }
        }
        {
            String lhsPackageDescription;
            lhsPackageDescription = this.getPackageDescription();
            String rhsPackageDescription;
            rhsPackageDescription = that.getPackageDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageDescription", lhsPackageDescription), LocatorUtils.property(thatLocator, "packageDescription", rhsPackageDescription), lhsPackageDescription, rhsPackageDescription, (this.packageDescription!= null), (that.packageDescription!= null))) {
                return false;
            }
        }
        {
            String lhsPartText;
            lhsPartText = this.getPartText();
            String rhsPartText;
            rhsPartText = that.getPartText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partText", lhsPartText), LocatorUtils.property(thatLocator, "partText", rhsPartText), lhsPartText, rhsPartText, (this.partText!= null), (that.partText!= null))) {
                return false;
            }
        }
        {
            String lhsSerialNumber;
            lhsSerialNumber = this.getSerialNumber();
            String rhsSerialNumber;
            rhsSerialNumber = that.getSerialNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serialNumber", lhsSerialNumber), LocatorUtils.property(thatLocator, "serialNumber", rhsSerialNumber), lhsSerialNumber, rhsSerialNumber, (this.serialNumber!= null), (that.serialNumber!= null))) {
                return false;
            }
        }
        {
            List<TestReportType> lhsTestReport;
            lhsTestReport = (((this.testReport!= null)&&(!this.testReport.isEmpty()))?this.getTestReport():null);
            List<TestReportType> rhsTestReport;
            rhsTestReport = (((that.testReport!= null)&&(!that.testReport.isEmpty()))?that.getTestReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testReport", lhsTestReport), LocatorUtils.property(thatLocator, "testReport", rhsTestReport), lhsTestReport, rhsTestReport, ((this.testReport!= null)&&(!this.testReport.isEmpty())), ((that.testReport!= null)&&(!that.testReport.isEmpty())))) {
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
            String theChipPN;
            theChipPN = this.getChipPN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chipPN", theChipPN), currentHashCode, theChipPN, (this.chipPN!= null));
        }
        {
            String theDieReticlePN;
            theDieReticlePN = this.getDieReticlePN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dieReticlePN", theDieReticlePN), currentHashCode, theDieReticlePN, (this.dieReticlePN!= null));
        }
        {
            String thePackageDescription;
            thePackageDescription = this.getPackageDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageDescription", thePackageDescription), currentHashCode, thePackageDescription, (this.packageDescription!= null));
        }
        {
            String thePartText;
            thePartText = this.getPartText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partText", thePartText), currentHashCode, thePartText, (this.partText!= null));
        }
        {
            String theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialNumber", theSerialNumber), currentHashCode, theSerialNumber, (this.serialNumber!= null));
        }
        {
            List<TestReportType> theTestReport;
            theTestReport = (((this.testReport!= null)&&(!this.testReport.isEmpty()))?this.getTestReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testReport", theTestReport), currentHashCode, theTestReport, ((this.testReport!= null)&&(!this.testReport.isEmpty())));
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
            String theChipPN;
            theChipPN = this.getChipPN();
            strategy.appendField(locator, this, "chipPN", buffer, theChipPN, (this.chipPN!= null));
        }
        {
            String theDieReticlePN;
            theDieReticlePN = this.getDieReticlePN();
            strategy.appendField(locator, this, "dieReticlePN", buffer, theDieReticlePN, (this.dieReticlePN!= null));
        }
        {
            String thePackageDescription;
            thePackageDescription = this.getPackageDescription();
            strategy.appendField(locator, this, "packageDescription", buffer, thePackageDescription, (this.packageDescription!= null));
        }
        {
            String thePartText;
            thePartText = this.getPartText();
            strategy.appendField(locator, this, "partText", buffer, thePartText, (this.partText!= null));
        }
        {
            String theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            strategy.appendField(locator, this, "serialNumber", buffer, theSerialNumber, (this.serialNumber!= null));
        }
        {
            List<TestReportType> theTestReport;
            theTestReport = (((this.testReport!= null)&&(!this.testReport.isEmpty()))?this.getTestReport():null);
            strategy.appendField(locator, this, "testReport", buffer, theTestReport, ((this.testReport!= null)&&(!this.testReport.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
