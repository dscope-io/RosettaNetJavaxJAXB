
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_04;

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
 * <p>Java class for TestSpecificationReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestSpecificationReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassKeyItemDefect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TestID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.04}TestParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TestSpecificationReportType", propOrder = {
    "category",
    "passKeyItemDefect",
    "primaryIdentifier",
    "testID",
    "testName",
    "testParameter"
})
public class TestSpecificationReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "PassKeyItemDefect")
    protected Boolean passKeyItemDefect;
    @XmlElement(name = "PrimaryIdentifier", required = true)
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "TestID", required = true)
    protected BigInteger testID;
    @XmlElement(name = "TestName")
    protected String testName;
    @XmlElementRef(name = "TestParameter", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.04", type = TestParameter.class, required = false)
    protected List<TestParameter> testParameter;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the passKeyItemDefect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassKeyItemDefect() {
        return passKeyItemDefect;
    }

    /**
     * Sets the value of the passKeyItemDefect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassKeyItemDefect(Boolean value) {
        this.passKeyItemDefect = value;
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
     * Gets the value of the testID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestID() {
        return testID;
    }

    /**
     * Sets the value of the testID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestID(BigInteger value) {
        this.testID = value;
    }

    /**
     * Gets the value of the testName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestName() {
        return testName;
    }

    /**
     * Sets the value of the testName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestName(String value) {
        this.testName = value;
    }

    /**
     * Gets the value of the testParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestParameter }
     * 
     * 
     */
    public List<TestParameter> getTestParameter() {
        if (testParameter == null) {
            testParameter = new ArrayList<TestParameter>();
        }
        return this.testParameter;
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
        final TestSpecificationReportType that = ((TestSpecificationReportType) object);
        {
            String lhsCategory;
            lhsCategory = this.getCategory();
            String rhsCategory;
            rhsCategory = that.getCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory, (this.category!= null), (that.category!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPassKeyItemDefect;
            lhsPassKeyItemDefect = this.isPassKeyItemDefect();
            Boolean rhsPassKeyItemDefect;
            rhsPassKeyItemDefect = that.isPassKeyItemDefect();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "passKeyItemDefect", lhsPassKeyItemDefect), LocatorUtils.property(thatLocator, "passKeyItemDefect", rhsPassKeyItemDefect), lhsPassKeyItemDefect, rhsPassKeyItemDefect, (this.passKeyItemDefect!= null), (that.passKeyItemDefect!= null))) {
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
            BigInteger lhsTestID;
            lhsTestID = this.getTestID();
            BigInteger rhsTestID;
            rhsTestID = that.getTestID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testID", lhsTestID), LocatorUtils.property(thatLocator, "testID", rhsTestID), lhsTestID, rhsTestID, (this.testID!= null), (that.testID!= null))) {
                return false;
            }
        }
        {
            String lhsTestName;
            lhsTestName = this.getTestName();
            String rhsTestName;
            rhsTestName = that.getTestName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testName", lhsTestName), LocatorUtils.property(thatLocator, "testName", rhsTestName), lhsTestName, rhsTestName, (this.testName!= null), (that.testName!= null))) {
                return false;
            }
        }
        {
            List<TestParameter> lhsTestParameter;
            lhsTestParameter = (((this.testParameter!= null)&&(!this.testParameter.isEmpty()))?this.getTestParameter():null);
            List<TestParameter> rhsTestParameter;
            rhsTestParameter = (((that.testParameter!= null)&&(!that.testParameter.isEmpty()))?that.getTestParameter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testParameter", lhsTestParameter), LocatorUtils.property(thatLocator, "testParameter", rhsTestParameter), lhsTestParameter, rhsTestParameter, ((this.testParameter!= null)&&(!this.testParameter.isEmpty())), ((that.testParameter!= null)&&(!that.testParameter.isEmpty())))) {
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
            String theCategory;
            theCategory = this.getCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "category", theCategory), currentHashCode, theCategory, (this.category!= null));
        }
        {
            Boolean thePassKeyItemDefect;
            thePassKeyItemDefect = this.isPassKeyItemDefect();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "passKeyItemDefect", thePassKeyItemDefect), currentHashCode, thePassKeyItemDefect, (this.passKeyItemDefect!= null));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryIdentifier", thePrimaryIdentifier), currentHashCode, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            BigInteger theTestID;
            theTestID = this.getTestID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testID", theTestID), currentHashCode, theTestID, (this.testID!= null));
        }
        {
            String theTestName;
            theTestName = this.getTestName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testName", theTestName), currentHashCode, theTestName, (this.testName!= null));
        }
        {
            List<TestParameter> theTestParameter;
            theTestParameter = (((this.testParameter!= null)&&(!this.testParameter.isEmpty()))?this.getTestParameter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testParameter", theTestParameter), currentHashCode, theTestParameter, ((this.testParameter!= null)&&(!this.testParameter.isEmpty())));
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
            String theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory, (this.category!= null));
        }
        {
            Boolean thePassKeyItemDefect;
            thePassKeyItemDefect = this.isPassKeyItemDefect();
            strategy.appendField(locator, this, "passKeyItemDefect", buffer, thePassKeyItemDefect, (this.passKeyItemDefect!= null));
        }
        {
            BigInteger thePrimaryIdentifier;
            thePrimaryIdentifier = this.getPrimaryIdentifier();
            strategy.appendField(locator, this, "primaryIdentifier", buffer, thePrimaryIdentifier, (this.primaryIdentifier!= null));
        }
        {
            BigInteger theTestID;
            theTestID = this.getTestID();
            strategy.appendField(locator, this, "testID", buffer, theTestID, (this.testID!= null));
        }
        {
            String theTestName;
            theTestName = this.getTestName();
            strategy.appendField(locator, this, "testName", buffer, theTestName, (this.testName!= null));
        }
        {
            List<TestParameter> theTestParameter;
            theTestParameter = (((this.testParameter!= null)&&(!this.testParameter.isEmpty()))?this.getTestParameter():null);
            strategy.appendField(locator, this, "testParameter", buffer, theTestParameter, ((this.testParameter!= null)&&(!this.testParameter.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
