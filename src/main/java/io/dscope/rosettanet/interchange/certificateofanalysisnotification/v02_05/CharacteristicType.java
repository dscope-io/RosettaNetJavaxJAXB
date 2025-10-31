
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_05;

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
 * <p>Java class for CharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="CodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QualityData" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.05}QualityDataType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SubCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestingData" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.05}TestingDataType"/&gt;
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
@XmlType(name = "CharacteristicType", propOrder = {
    "code",
    "codeDescription",
    "qualityData",
    "subCode",
    "subCodeDescription",
    "testingData"
})
public class CharacteristicType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Code", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger code;
    @XmlElement(name = "CodeDescription")
    protected String codeDescription;
    @XmlElement(name = "QualityData", required = true)
    protected List<QualityDataType> qualityData;
    @XmlElement(name = "SubCode")
    protected String subCode;
    @XmlElement(name = "SubCodeDescription")
    protected String subCodeDescription;
    @XmlElement(name = "TestingData", required = true)
    protected TestingDataType testingData;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCode(BigInteger value) {
        this.code = value;
    }

    /**
     * Gets the value of the codeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDescription() {
        return codeDescription;
    }

    /**
     * Sets the value of the codeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDescription(String value) {
        this.codeDescription = value;
    }

    /**
     * Gets the value of the qualityData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualityData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualityDataType }
     * 
     * 
     */
    public List<QualityDataType> getQualityData() {
        if (qualityData == null) {
            qualityData = new ArrayList<QualityDataType>();
        }
        return this.qualityData;
    }

    /**
     * Gets the value of the subCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

    /**
     * Gets the value of the subCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCodeDescription() {
        return subCodeDescription;
    }

    /**
     * Sets the value of the subCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCodeDescription(String value) {
        this.subCodeDescription = value;
    }

    /**
     * Gets the value of the testingData property.
     * 
     * @return
     *     possible object is
     *     {@link TestingDataType }
     *     
     */
    public TestingDataType getTestingData() {
        return testingData;
    }

    /**
     * Sets the value of the testingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestingDataType }
     *     
     */
    public void setTestingData(TestingDataType value) {
        this.testingData = value;
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
        final CharacteristicType that = ((CharacteristicType) object);
        {
            BigInteger lhsCode;
            lhsCode = this.getCode();
            BigInteger rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode, (this.code!= null), (that.code!= null))) {
                return false;
            }
        }
        {
            String lhsCodeDescription;
            lhsCodeDescription = this.getCodeDescription();
            String rhsCodeDescription;
            rhsCodeDescription = that.getCodeDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "codeDescription", lhsCodeDescription), LocatorUtils.property(thatLocator, "codeDescription", rhsCodeDescription), lhsCodeDescription, rhsCodeDescription, (this.codeDescription!= null), (that.codeDescription!= null))) {
                return false;
            }
        }
        {
            List<QualityDataType> lhsQualityData;
            lhsQualityData = (((this.qualityData!= null)&&(!this.qualityData.isEmpty()))?this.getQualityData():null);
            List<QualityDataType> rhsQualityData;
            rhsQualityData = (((that.qualityData!= null)&&(!that.qualityData.isEmpty()))?that.getQualityData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qualityData", lhsQualityData), LocatorUtils.property(thatLocator, "qualityData", rhsQualityData), lhsQualityData, rhsQualityData, ((this.qualityData!= null)&&(!this.qualityData.isEmpty())), ((that.qualityData!= null)&&(!that.qualityData.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsSubCode;
            lhsSubCode = this.getSubCode();
            String rhsSubCode;
            rhsSubCode = that.getSubCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subCode", lhsSubCode), LocatorUtils.property(thatLocator, "subCode", rhsSubCode), lhsSubCode, rhsSubCode, (this.subCode!= null), (that.subCode!= null))) {
                return false;
            }
        }
        {
            String lhsSubCodeDescription;
            lhsSubCodeDescription = this.getSubCodeDescription();
            String rhsSubCodeDescription;
            rhsSubCodeDescription = that.getSubCodeDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subCodeDescription", lhsSubCodeDescription), LocatorUtils.property(thatLocator, "subCodeDescription", rhsSubCodeDescription), lhsSubCodeDescription, rhsSubCodeDescription, (this.subCodeDescription!= null), (that.subCodeDescription!= null))) {
                return false;
            }
        }
        {
            TestingDataType lhsTestingData;
            lhsTestingData = this.getTestingData();
            TestingDataType rhsTestingData;
            rhsTestingData = that.getTestingData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testingData", lhsTestingData), LocatorUtils.property(thatLocator, "testingData", rhsTestingData), lhsTestingData, rhsTestingData, (this.testingData!= null), (that.testingData!= null))) {
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
            BigInteger theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode, (this.code!= null));
        }
        {
            String theCodeDescription;
            theCodeDescription = this.getCodeDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "codeDescription", theCodeDescription), currentHashCode, theCodeDescription, (this.codeDescription!= null));
        }
        {
            List<QualityDataType> theQualityData;
            theQualityData = (((this.qualityData!= null)&&(!this.qualityData.isEmpty()))?this.getQualityData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualityData", theQualityData), currentHashCode, theQualityData, ((this.qualityData!= null)&&(!this.qualityData.isEmpty())));
        }
        {
            String theSubCode;
            theSubCode = this.getSubCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subCode", theSubCode), currentHashCode, theSubCode, (this.subCode!= null));
        }
        {
            String theSubCodeDescription;
            theSubCodeDescription = this.getSubCodeDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subCodeDescription", theSubCodeDescription), currentHashCode, theSubCodeDescription, (this.subCodeDescription!= null));
        }
        {
            TestingDataType theTestingData;
            theTestingData = this.getTestingData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testingData", theTestingData), currentHashCode, theTestingData, (this.testingData!= null));
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
            BigInteger theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode, (this.code!= null));
        }
        {
            String theCodeDescription;
            theCodeDescription = this.getCodeDescription();
            strategy.appendField(locator, this, "codeDescription", buffer, theCodeDescription, (this.codeDescription!= null));
        }
        {
            List<QualityDataType> theQualityData;
            theQualityData = (((this.qualityData!= null)&&(!this.qualityData.isEmpty()))?this.getQualityData():null);
            strategy.appendField(locator, this, "qualityData", buffer, theQualityData, ((this.qualityData!= null)&&(!this.qualityData.isEmpty())));
        }
        {
            String theSubCode;
            theSubCode = this.getSubCode();
            strategy.appendField(locator, this, "subCode", buffer, theSubCode, (this.subCode!= null));
        }
        {
            String theSubCodeDescription;
            theSubCodeDescription = this.getSubCodeDescription();
            strategy.appendField(locator, this, "subCodeDescription", buffer, theSubCodeDescription, (this.subCodeDescription!= null));
        }
        {
            TestingDataType theTestingData;
            theTestingData = this.getTestingData();
            strategy.appendField(locator, this, "testingData", buffer, theTestingData, (this.testingData!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
