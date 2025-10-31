
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
 * <p>Java class for IncidentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncidentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Detail" type="{urn:rosettanet:specification:domain:Service:xsd:schema:02.12}IncidentDetailType" minOccurs="0"/&gt;
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
@XmlType(name = "IncidentInformationType", propOrder = {
    "detail",
    "testInformation"
})
public class IncidentInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Detail")
    protected IncidentDetailType detail;
    @XmlElement(name = "TestInformation")
    protected List<TestInformationType> testInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
        final IncidentInformationType that = ((IncidentInformationType) object);
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
            IncidentDetailType theDetail;
            theDetail = this.getDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "detail", theDetail), currentHashCode, theDetail, (this.detail!= null));
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
            IncidentDetailType theDetail;
            theDetail = this.getDetail();
            strategy.appendField(locator, this, "detail", buffer, theDetail, (this.detail!= null));
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
