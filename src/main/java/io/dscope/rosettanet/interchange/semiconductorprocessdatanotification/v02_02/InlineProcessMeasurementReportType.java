
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

import java.math.BigInteger;
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
 * <p>Java class for InlineProcessMeasurementReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InlineProcessMeasurementReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}MeasurementReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "InlineProcessMeasurementReportType", propOrder = {
    "disposition",
    "measurementReport",
    "primaryIdentifier",
    "testFlag"
})
public class InlineProcessMeasurementReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Disposition")
    protected String disposition;
    @XmlElement(name = "MeasurementReport")
    protected List<MeasurementReportType> measurementReport;
    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "TestFlag")
    protected String testFlag;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposition(String value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the measurementReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementReportType }
     * 
     * 
     */
    public List<MeasurementReportType> getMeasurementReport() {
        if (measurementReport == null) {
            measurementReport = new ArrayList<MeasurementReportType>();
        }
        return this.measurementReport;
    }

    /**
     * Gets the value of the primaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    /**
     * Sets the value of the primaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrimaryIdentifier(BigInteger value) {
        this.primaryIdentifier = value;
    }

    /**
     * Gets the value of the testFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestFlag() {
        return testFlag;
    }

    /**
     * Sets the value of the testFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestFlag(String value) {
        this.testFlag = value;
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
        final InlineProcessMeasurementReportType that = ((InlineProcessMeasurementReportType) object);
        {
            String lhsDisposition;
            lhsDisposition = this.getDisposition();
            String rhsDisposition;
            rhsDisposition = that.getDisposition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "disposition", lhsDisposition), LocatorUtils.property(thatLocator, "disposition", rhsDisposition), lhsDisposition, rhsDisposition, (this.disposition!= null), (that.disposition!= null))) {
                return false;
            }
        }
        {
            List<MeasurementReportType> lhsMeasurementReport;
            lhsMeasurementReport = (((this.measurementReport!= null)&&(!this.measurementReport.isEmpty()))?this.getMeasurementReport():null);
            List<MeasurementReportType> rhsMeasurementReport;
            rhsMeasurementReport = (((that.measurementReport!= null)&&(!that.measurementReport.isEmpty()))?that.getMeasurementReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementReport", lhsMeasurementReport), LocatorUtils.property(thatLocator, "measurementReport", rhsMeasurementReport), lhsMeasurementReport, rhsMeasurementReport, ((this.measurementReport!= null)&&(!this.measurementReport.isEmpty())), ((that.measurementReport!= null)&&(!that.measurementReport.isEmpty())))) {
                return false;
            }
        }
        {
            BigInteger lhsPrimaryIdentifier;
            lhsPrimaryIdentifier = this.getPrimaryIdentifier();
            BigInteger rhsPrimaryIdentifier;
            rhsPrimaryIdentifier = that.getPrimaryIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryIdentifier", lhsPrimaryIdentifier), LocatorUtils.property(thatLocator, "primaryIdentifier", rhsPrimaryIdentifier), lhsPrimaryIdentifier, rhsPrimaryIdentifier, (this.primaryIdentifier!= null), (that.primaryIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsTestFlag;
            lhsTestFlag = this.getTestFlag();
            String rhsTestFlag;
            rhsTestFlag = that.getTestFlag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testFlag", lhsTestFlag), LocatorUtils.property(thatLocator, "testFlag", rhsTestFlag), lhsTestFlag, rhsTestFlag, (this.testFlag!= null), (that.testFlag!= null))) {
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
            String theDisposition;
            theDisposition = this.getDisposition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "disposition", theDisposition), currentHashCode, theDisposition, (this.disposition!= null));
        }
        {
            List<MeasurementReportType> theMeasurementReport;
            theMeasurementReport = (((this.measurementReport!= null)&&(!this.measurementReport.isEmpty()))?this.getMeasurementReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementReport", theMeasurementReport), currentHashCode, theMeasurementReport, ((this.measurementReport!= null)&&(!this.measurementReport.isEmpty())));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryIdentifier", thePrimaryIdentifier), currentHashCode, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            String theTestFlag;
            theTestFlag = this.getTestFlag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testFlag", theTestFlag), currentHashCode, theTestFlag, (this.testFlag!= null));
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
            String theDisposition;
            theDisposition = this.getDisposition();
            strategy.appendField(locator, this, "disposition", buffer, theDisposition, (this.disposition!= null));
        }
        {
            List<MeasurementReportType> theMeasurementReport;
            theMeasurementReport = (((this.measurementReport!= null)&&(!this.measurementReport.isEmpty()))?this.getMeasurementReport():null);
            strategy.appendField(locator, this, "measurementReport", buffer, theMeasurementReport, ((this.measurementReport!= null)&&(!this.measurementReport.isEmpty())));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            strategy.appendField(locator, this, "primaryIdentifier", buffer, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            String theTestFlag;
            theTestFlag = this.getTestFlag();
            strategy.appendField(locator, this, "testFlag", buffer, theTestFlag, (this.testFlag!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
