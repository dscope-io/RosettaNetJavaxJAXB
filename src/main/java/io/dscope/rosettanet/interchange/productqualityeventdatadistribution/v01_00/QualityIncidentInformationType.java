
package io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00;

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
import io.dscope.rosettanet.domain.service.service.v02_12.IncidentDetailType;
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
 * <p>Java class for QualityIncidentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityIncidentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentRepairData" type="{urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00}ComponentRepairDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Detail" type="{urn:rosettanet:specification:domain:Service:xsd:schema:02.12}IncidentDetailType"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestInformation" type="{urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00}TestInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "QualityIncidentInformationType", propOrder = {
    "componentRepairData",
    "description",
    "detail",
    "number",
    "sequenceNumber",
    "testInformation"
})
public class QualityIncidentInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ComponentRepairData")
    protected List<ComponentRepairDataType> componentRepairData;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Detail", required = true)
    protected IncidentDetailType detail;
    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "TestInformation")
    protected List<TestInformationType> testInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the componentRepairData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentRepairData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentRepairData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentRepairDataType }
     * 
     * 
     */
    public List<ComponentRepairDataType> getComponentRepairData() {
        if (componentRepairData == null) {
            componentRepairData = new ArrayList<ComponentRepairDataType>();
        }
        return this.componentRepairData;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentDetailType }
     *     
     */
    public IncidentDetailType getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentDetailType }
     *     
     */
    public void setDetail(IncidentDetailType value) {
        this.detail = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the testInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestInformationType }
     * 
     * 
     */
    public List<TestInformationType> getTestInformation() {
        if (testInformation == null) {
            testInformation = new ArrayList<TestInformationType>();
        }
        return this.testInformation;
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
        final QualityIncidentInformationType that = ((QualityIncidentInformationType) object);
        {
            List<ComponentRepairDataType> lhsComponentRepairData;
            lhsComponentRepairData = (((this.componentRepairData!= null)&&(!this.componentRepairData.isEmpty()))?this.getComponentRepairData():null);
            List<ComponentRepairDataType> rhsComponentRepairData;
            rhsComponentRepairData = (((that.componentRepairData!= null)&&(!that.componentRepairData.isEmpty()))?that.getComponentRepairData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "componentRepairData", lhsComponentRepairData), LocatorUtils.property(thatLocator, "componentRepairData", rhsComponentRepairData), lhsComponentRepairData, rhsComponentRepairData, ((this.componentRepairData!= null)&&(!this.componentRepairData.isEmpty())), ((that.componentRepairData!= null)&&(!that.componentRepairData.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            IncidentDetailType lhsDetail;
            lhsDetail = this.getDetail();
            IncidentDetailType rhsDetail;
            rhsDetail = that.getDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "detail", lhsDetail), LocatorUtils.property(thatLocator, "detail", rhsDetail), lhsDetail, rhsDetail, (this.detail!= null), (that.detail!= null))) {
                return false;
            }
        }
        {
            String lhsNumber;
            lhsNumber = this.getNumber();
            String rhsNumber;
            rhsNumber = that.getNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "number", lhsNumber), LocatorUtils.property(thatLocator, "number", rhsNumber), lhsNumber, rhsNumber, (this.number!= null), (that.number!= null))) {
                return false;
            }
        }
        {
            String lhsSequenceNumber;
            lhsSequenceNumber = this.getSequenceNumber();
            String rhsSequenceNumber;
            rhsSequenceNumber = that.getSequenceNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNumber", lhsSequenceNumber), LocatorUtils.property(thatLocator, "sequenceNumber", rhsSequenceNumber), lhsSequenceNumber, rhsSequenceNumber, (this.sequenceNumber!= null), (that.sequenceNumber!= null))) {
                return false;
            }
        }
        {
            List<TestInformationType> lhsTestInformation;
            lhsTestInformation = (((this.testInformation!= null)&&(!this.testInformation.isEmpty()))?this.getTestInformation():null);
            List<TestInformationType> rhsTestInformation;
            rhsTestInformation = (((that.testInformation!= null)&&(!that.testInformation.isEmpty()))?that.getTestInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testInformation", lhsTestInformation), LocatorUtils.property(thatLocator, "testInformation", rhsTestInformation), lhsTestInformation, rhsTestInformation, ((this.testInformation!= null)&&(!this.testInformation.isEmpty())), ((that.testInformation!= null)&&(!that.testInformation.isEmpty())))) {
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
            List<ComponentRepairDataType> theComponentRepairData;
            theComponentRepairData = (((this.componentRepairData!= null)&&(!this.componentRepairData.isEmpty()))?this.getComponentRepairData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "componentRepairData", theComponentRepairData), currentHashCode, theComponentRepairData, ((this.componentRepairData!= null)&&(!this.componentRepairData.isEmpty())));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            IncidentDetailType theDetail;
            theDetail = this.getDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "detail", theDetail), currentHashCode, theDetail, (this.detail!= null));
        }
        {
            String theNumber;
            theNumber = this.getNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "number", theNumber), currentHashCode, theNumber, (this.number!= null));
        }
        {
            String theSequenceNumber;
            theSequenceNumber = this.getSequenceNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumber", theSequenceNumber), currentHashCode, theSequenceNumber, (this.sequenceNumber!= null));
        }
        {
            List<TestInformationType> theTestInformation;
            theTestInformation = (((this.testInformation!= null)&&(!this.testInformation.isEmpty()))?this.getTestInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testInformation", theTestInformation), currentHashCode, theTestInformation, ((this.testInformation!= null)&&(!this.testInformation.isEmpty())));
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
            List<ComponentRepairDataType> theComponentRepairData;
            theComponentRepairData = (((this.componentRepairData!= null)&&(!this.componentRepairData.isEmpty()))?this.getComponentRepairData():null);
            strategy.appendField(locator, this, "componentRepairData", buffer, theComponentRepairData, ((this.componentRepairData!= null)&&(!this.componentRepairData.isEmpty())));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            IncidentDetailType theDetail;
            theDetail = this.getDetail();
            strategy.appendField(locator, this, "detail", buffer, theDetail, (this.detail!= null));
        }
        {
            String theNumber;
            theNumber = this.getNumber();
            strategy.appendField(locator, this, "number", buffer, theNumber, (this.number!= null));
        }
        {
            String theSequenceNumber;
            theSequenceNumber = this.getSequenceNumber();
            strategy.appendField(locator, this, "sequenceNumber", buffer, theSequenceNumber, (this.sequenceNumber!= null));
        }
        {
            List<TestInformationType> theTestInformation;
            theTestInformation = (((this.testInformation!= null)&&(!this.testInformation.isEmpty()))?this.getTestInformation():null);
            strategy.appendField(locator, this, "testInformation", buffer, theTestInformation, ((this.testInformation!= null)&&(!this.testInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
