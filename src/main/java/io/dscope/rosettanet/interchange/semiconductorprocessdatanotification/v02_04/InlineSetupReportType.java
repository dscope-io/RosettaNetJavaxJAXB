
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.TestTemperature;
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
 * <p>Java class for InlineSetupReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InlineSetupReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeasOperationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeasOperationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Orientation" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}OrientationType" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ProcessRecipe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}TestTemperature" minOccurs="0"/&gt;
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
@XmlType(name = "InlineSetupReportType", propOrder = {
    "disposition",
    "measOperationID",
    "measOperationName",
    "orientation",
    "primaryIdentifier",
    "processRecipe",
    "testFlag",
    "testTemperature"
})
public class InlineSetupReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Disposition")
    protected String disposition;
    @XmlElement(name = "MeasOperationID")
    protected String measOperationID;
    @XmlElement(name = "MeasOperationName")
    protected String measOperationName;
    @XmlElement(name = "Orientation")
    protected OrientationType orientation;
    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "ProcessRecipe")
    protected String processRecipe;
    @XmlElement(name = "TestFlag")
    protected String testFlag;
    @XmlElementRef(name = "TestTemperature", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = TestTemperature.class, required = false)
    protected TestTemperature testTemperature;
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
     * Gets the value of the measOperationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasOperationID() {
        return measOperationID;
    }

    /**
     * Sets the value of the measOperationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasOperationID(String value) {
        this.measOperationID = value;
    }

    /**
     * Gets the value of the measOperationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasOperationName() {
        return measOperationName;
    }

    /**
     * Sets the value of the measOperationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasOperationName(String value) {
        this.measOperationName = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link OrientationType }
     *     
     */
    public OrientationType getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrientationType }
     *     
     */
    public void setOrientation(OrientationType value) {
        this.orientation = value;
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
     * Gets the value of the processRecipe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessRecipe() {
        return processRecipe;
    }

    /**
     * Sets the value of the processRecipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessRecipe(String value) {
        this.processRecipe = value;
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
     * Gets the value of the testTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TestTemperature }
     *     
     */
    public TestTemperature getTestTemperature() {
        return testTemperature;
    }

    /**
     * Sets the value of the testTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestTemperature }
     *     
     */
    public void setTestTemperature(TestTemperature value) {
        this.testTemperature = value;
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
        final InlineSetupReportType that = ((InlineSetupReportType) object);
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
            String lhsMeasOperationID;
            lhsMeasOperationID = this.getMeasOperationID();
            String rhsMeasOperationID;
            rhsMeasOperationID = that.getMeasOperationID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measOperationID", lhsMeasOperationID), LocatorUtils.property(thatLocator, "measOperationID", rhsMeasOperationID), lhsMeasOperationID, rhsMeasOperationID, (this.measOperationID!= null), (that.measOperationID!= null))) {
                return false;
            }
        }
        {
            String lhsMeasOperationName;
            lhsMeasOperationName = this.getMeasOperationName();
            String rhsMeasOperationName;
            rhsMeasOperationName = that.getMeasOperationName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measOperationName", lhsMeasOperationName), LocatorUtils.property(thatLocator, "measOperationName", rhsMeasOperationName), lhsMeasOperationName, rhsMeasOperationName, (this.measOperationName!= null), (that.measOperationName!= null))) {
                return false;
            }
        }
        {
            OrientationType lhsOrientation;
            lhsOrientation = this.getOrientation();
            OrientationType rhsOrientation;
            rhsOrientation = that.getOrientation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orientation", lhsOrientation), LocatorUtils.property(thatLocator, "orientation", rhsOrientation), lhsOrientation, rhsOrientation, (this.orientation!= null), (that.orientation!= null))) {
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
            String lhsProcessRecipe;
            lhsProcessRecipe = this.getProcessRecipe();
            String rhsProcessRecipe;
            rhsProcessRecipe = that.getProcessRecipe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processRecipe", lhsProcessRecipe), LocatorUtils.property(thatLocator, "processRecipe", rhsProcessRecipe), lhsProcessRecipe, rhsProcessRecipe, (this.processRecipe!= null), (that.processRecipe!= null))) {
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
            TestTemperature lhsTestTemperature;
            lhsTestTemperature = this.getTestTemperature();
            TestTemperature rhsTestTemperature;
            rhsTestTemperature = that.getTestTemperature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testTemperature", lhsTestTemperature), LocatorUtils.property(thatLocator, "testTemperature", rhsTestTemperature), lhsTestTemperature, rhsTestTemperature, (this.testTemperature!= null), (that.testTemperature!= null))) {
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
            String theMeasOperationID;
            theMeasOperationID = this.getMeasOperationID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measOperationID", theMeasOperationID), currentHashCode, theMeasOperationID, (this.measOperationID!= null));
        }
        {
            String theMeasOperationName;
            theMeasOperationName = this.getMeasOperationName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measOperationName", theMeasOperationName), currentHashCode, theMeasOperationName, (this.measOperationName!= null));
        }
        {
            OrientationType theOrientation;
            theOrientation = this.getOrientation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orientation", theOrientation), currentHashCode, theOrientation, (this.orientation!= null));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryIdentifier", thePrimaryIdentifier), currentHashCode, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            String theProcessRecipe;
            theProcessRecipe = this.getProcessRecipe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processRecipe", theProcessRecipe), currentHashCode, theProcessRecipe, (this.processRecipe!= null));
        }
        {
            String theTestFlag;
            theTestFlag = this.getTestFlag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testFlag", theTestFlag), currentHashCode, theTestFlag, (this.testFlag!= null));
        }
        {
            TestTemperature theTestTemperature;
            theTestTemperature = this.getTestTemperature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testTemperature", theTestTemperature), currentHashCode, theTestTemperature, (this.testTemperature!= null));
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
            String theMeasOperationID;
            theMeasOperationID = this.getMeasOperationID();
            strategy.appendField(locator, this, "measOperationID", buffer, theMeasOperationID, (this.measOperationID!= null));
        }
        {
            String theMeasOperationName;
            theMeasOperationName = this.getMeasOperationName();
            strategy.appendField(locator, this, "measOperationName", buffer, theMeasOperationName, (this.measOperationName!= null));
        }
        {
            OrientationType theOrientation;
            theOrientation = this.getOrientation();
            strategy.appendField(locator, this, "orientation", buffer, theOrientation, (this.orientation!= null));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            strategy.appendField(locator, this, "primaryIdentifier", buffer, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            String theProcessRecipe;
            theProcessRecipe = this.getProcessRecipe();
            strategy.appendField(locator, this, "processRecipe", buffer, theProcessRecipe, (this.processRecipe!= null));
        }
        {
            String theTestFlag;
            theTestFlag = this.getTestFlag();
            strategy.appendField(locator, this, "testFlag", buffer, theTestFlag, (this.testFlag!= null));
        }
        {
            TestTemperature theTestTemperature;
            theTestTemperature = this.getTestTemperature();
            strategy.appendField(locator, this, "testTemperature", buffer, theTestTemperature, (this.testTemperature!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
