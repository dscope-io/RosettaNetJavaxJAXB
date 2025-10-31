
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_01;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.manufacturing.codelist.completionstatus.v01_02.CompletionStatusType;
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
 * <p>Java class for TestOperationDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestOperationDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LotEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LotStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LotStatusCompletion" type="{urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:01.02}CompletionStatusType" minOccurs="0"/&gt;
 *         &lt;element name="TestOpIdentification" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.01}TestOpIdentificationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TestPass" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TestOperationDescriptionType", propOrder = {
    "lotEndDateTime",
    "lotStartDateTime",
    "lotStatusCompletion",
    "testOpIdentification",
    "testPass"
})
public class TestOperationDescriptionType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "LotEndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lotEndDateTime;
    @XmlElement(name = "LotStartDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lotStartDateTime;
    @XmlElement(name = "LotStatusCompletion")
    protected CompletionStatusType lotStatusCompletion;
    @XmlElement(name = "TestOpIdentification", required = true)
    protected List<TestOpIdentificationType> testOpIdentification;
    @XmlElement(name = "TestPass")
    protected List<BigInteger> testPass;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lotEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLotEndDateTime() {
        return lotEndDateTime;
    }

    /**
     * Sets the value of the lotEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLotEndDateTime(XMLGregorianCalendar value) {
        this.lotEndDateTime = value;
    }

    /**
     * Gets the value of the lotStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLotStartDateTime() {
        return lotStartDateTime;
    }

    /**
     * Sets the value of the lotStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLotStartDateTime(XMLGregorianCalendar value) {
        this.lotStartDateTime = value;
    }

    /**
     * Gets the value of the lotStatusCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link CompletionStatusType }
     *     
     */
    public CompletionStatusType getLotStatusCompletion() {
        return lotStatusCompletion;
    }

    /**
     * Sets the value of the lotStatusCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletionStatusType }
     *     
     */
    public void setLotStatusCompletion(CompletionStatusType value) {
        this.lotStatusCompletion = value;
    }

    /**
     * Gets the value of the testOpIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testOpIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestOpIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestOpIdentificationType }
     * 
     * 
     */
    public List<TestOpIdentificationType> getTestOpIdentification() {
        if (testOpIdentification == null) {
            testOpIdentification = new ArrayList<TestOpIdentificationType>();
        }
        return this.testOpIdentification;
    }

    /**
     * Gets the value of the testPass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testPass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestPass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getTestPass() {
        if (testPass == null) {
            testPass = new ArrayList<BigInteger>();
        }
        return this.testPass;
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
        final TestOperationDescriptionType that = ((TestOperationDescriptionType) object);
        {
            XMLGregorianCalendar lhsLotEndDateTime;
            lhsLotEndDateTime = this.getLotEndDateTime();
            XMLGregorianCalendar rhsLotEndDateTime;
            rhsLotEndDateTime = that.getLotEndDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotEndDateTime", lhsLotEndDateTime), LocatorUtils.property(thatLocator, "lotEndDateTime", rhsLotEndDateTime), lhsLotEndDateTime, rhsLotEndDateTime, (this.lotEndDateTime!= null), (that.lotEndDateTime!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsLotStartDateTime;
            lhsLotStartDateTime = this.getLotStartDateTime();
            XMLGregorianCalendar rhsLotStartDateTime;
            rhsLotStartDateTime = that.getLotStartDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotStartDateTime", lhsLotStartDateTime), LocatorUtils.property(thatLocator, "lotStartDateTime", rhsLotStartDateTime), lhsLotStartDateTime, rhsLotStartDateTime, (this.lotStartDateTime!= null), (that.lotStartDateTime!= null))) {
                return false;
            }
        }
        {
            CompletionStatusType lhsLotStatusCompletion;
            lhsLotStatusCompletion = this.getLotStatusCompletion();
            CompletionStatusType rhsLotStatusCompletion;
            rhsLotStatusCompletion = that.getLotStatusCompletion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotStatusCompletion", lhsLotStatusCompletion), LocatorUtils.property(thatLocator, "lotStatusCompletion", rhsLotStatusCompletion), lhsLotStatusCompletion, rhsLotStatusCompletion, (this.lotStatusCompletion!= null), (that.lotStatusCompletion!= null))) {
                return false;
            }
        }
        {
            List<TestOpIdentificationType> lhsTestOpIdentification;
            lhsTestOpIdentification = (((this.testOpIdentification!= null)&&(!this.testOpIdentification.isEmpty()))?this.getTestOpIdentification():null);
            List<TestOpIdentificationType> rhsTestOpIdentification;
            rhsTestOpIdentification = (((that.testOpIdentification!= null)&&(!that.testOpIdentification.isEmpty()))?that.getTestOpIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testOpIdentification", lhsTestOpIdentification), LocatorUtils.property(thatLocator, "testOpIdentification", rhsTestOpIdentification), lhsTestOpIdentification, rhsTestOpIdentification, ((this.testOpIdentification!= null)&&(!this.testOpIdentification.isEmpty())), ((that.testOpIdentification!= null)&&(!that.testOpIdentification.isEmpty())))) {
                return false;
            }
        }
        {
            List<BigInteger> lhsTestPass;
            lhsTestPass = (((this.testPass!= null)&&(!this.testPass.isEmpty()))?this.getTestPass():null);
            List<BigInteger> rhsTestPass;
            rhsTestPass = (((that.testPass!= null)&&(!that.testPass.isEmpty()))?that.getTestPass():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testPass", lhsTestPass), LocatorUtils.property(thatLocator, "testPass", rhsTestPass), lhsTestPass, rhsTestPass, ((this.testPass!= null)&&(!this.testPass.isEmpty())), ((that.testPass!= null)&&(!that.testPass.isEmpty())))) {
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
            XMLGregorianCalendar theLotEndDateTime;
            theLotEndDateTime = this.getLotEndDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotEndDateTime", theLotEndDateTime), currentHashCode, theLotEndDateTime, (this.lotEndDateTime!= null));
        }
        {
            XMLGregorianCalendar theLotStartDateTime;
            theLotStartDateTime = this.getLotStartDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotStartDateTime", theLotStartDateTime), currentHashCode, theLotStartDateTime, (this.lotStartDateTime!= null));
        }
        {
            CompletionStatusType theLotStatusCompletion;
            theLotStatusCompletion = this.getLotStatusCompletion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotStatusCompletion", theLotStatusCompletion), currentHashCode, theLotStatusCompletion, (this.lotStatusCompletion!= null));
        }
        {
            List<TestOpIdentificationType> theTestOpIdentification;
            theTestOpIdentification = (((this.testOpIdentification!= null)&&(!this.testOpIdentification.isEmpty()))?this.getTestOpIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testOpIdentification", theTestOpIdentification), currentHashCode, theTestOpIdentification, ((this.testOpIdentification!= null)&&(!this.testOpIdentification.isEmpty())));
        }
        {
            List<BigInteger> theTestPass;
            theTestPass = (((this.testPass!= null)&&(!this.testPass.isEmpty()))?this.getTestPass():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testPass", theTestPass), currentHashCode, theTestPass, ((this.testPass!= null)&&(!this.testPass.isEmpty())));
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
            XMLGregorianCalendar theLotEndDateTime;
            theLotEndDateTime = this.getLotEndDateTime();
            strategy.appendField(locator, this, "lotEndDateTime", buffer, theLotEndDateTime, (this.lotEndDateTime!= null));
        }
        {
            XMLGregorianCalendar theLotStartDateTime;
            theLotStartDateTime = this.getLotStartDateTime();
            strategy.appendField(locator, this, "lotStartDateTime", buffer, theLotStartDateTime, (this.lotStartDateTime!= null));
        }
        {
            CompletionStatusType theLotStatusCompletion;
            theLotStatusCompletion = this.getLotStatusCompletion();
            strategy.appendField(locator, this, "lotStatusCompletion", buffer, theLotStatusCompletion, (this.lotStatusCompletion!= null));
        }
        {
            List<TestOpIdentificationType> theTestOpIdentification;
            theTestOpIdentification = (((this.testOpIdentification!= null)&&(!this.testOpIdentification.isEmpty()))?this.getTestOpIdentification():null);
            strategy.appendField(locator, this, "testOpIdentification", buffer, theTestOpIdentification, ((this.testOpIdentification!= null)&&(!this.testOpIdentification.isEmpty())));
        }
        {
            List<BigInteger> theTestPass;
            theTestPass = (((this.testPass!= null)&&(!this.testPass.isEmpty()))?this.getTestPass():null);
            strategy.appendField(locator, this, "testPass", buffer, theTestPass, ((this.testPass!= null)&&(!this.testPass.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
