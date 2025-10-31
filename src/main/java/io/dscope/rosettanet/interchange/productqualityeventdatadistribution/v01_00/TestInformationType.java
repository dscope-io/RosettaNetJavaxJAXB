
package io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.Environment;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.Result;
import io.dscope.rosettanet.universal.dates.v01_03.StartAndEndDateTime;
import io.dscope.rosettanet.universal.partneridentification.v01_12.PartnerDescription;
import io.dscope.rosettanet.universal.productidentification.v01_04.TextualDescriptionType;
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
 * <p>Java class for TestInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}Environment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsTestPass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="OperatorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}Result" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateTime"/&gt;
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
@XmlType(name = "TestInformationType", propOrder = {
    "comment",
    "environment",
    "isTestPass",
    "name",
    "operatorIdentifier",
    "partnerDescription",
    "result",
    "startAndEndDateTime"
})
public class TestInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElementRef(name = "Environment", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", type = Environment.class, required = false)
    protected List<Environment> environment;
    @XmlElement(name = "IsTestPass")
    protected Boolean isTestPass;
    @XmlElement(name = "Name")
    protected TextualDescriptionType name;
    @XmlElement(name = "OperatorIdentifier")
    protected String operatorIdentifier;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "Result", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", type = Result.class, required = false)
    protected List<Result> result;
    @XmlElementRef(name = "StartAndEndDateTime", namespace = "urn:rosettanet:specification:universal:Dates:xsd:schema:01.03", type = StartAndEndDateTime.class)
    protected StartAndEndDateTime startAndEndDateTime;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Environment }
     * 
     * 
     */
    public List<Environment> getEnvironment() {
        if (environment == null) {
            environment = new ArrayList<Environment>();
        }
        return this.environment;
    }

    /**
     * Gets the value of the isTestPass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTestPass() {
        return isTestPass;
    }

    /**
     * Sets the value of the isTestPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTestPass(Boolean value) {
        this.isTestPass = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescriptionType }
     *     
     */
    public TextualDescriptionType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescriptionType }
     *     
     */
    public void setName(TextualDescriptionType value) {
        this.name = value;
    }

    /**
     * Gets the value of the operatorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorIdentifier() {
        return operatorIdentifier;
    }

    /**
     * Sets the value of the operatorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorIdentifier(String value) {
        this.operatorIdentifier = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Result }
     * 
     * 
     */
    public List<Result> getResult() {
        if (result == null) {
            result = new ArrayList<Result>();
        }
        return this.result;
    }

    /**
     * Gets the value of the startAndEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateTime }
     *     
     */
    public StartAndEndDateTime getStartAndEndDateTime() {
        return startAndEndDateTime;
    }

    /**
     * Sets the value of the startAndEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateTime }
     *     
     */
    public void setStartAndEndDateTime(StartAndEndDateTime value) {
        this.startAndEndDateTime = value;
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
        final TestInformationType that = ((TestInformationType) object);
        {
            String lhsComment;
            lhsComment = this.getComment();
            String rhsComment;
            rhsComment = that.getComment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comment", lhsComment), LocatorUtils.property(thatLocator, "comment", rhsComment), lhsComment, rhsComment, (this.comment!= null), (that.comment!= null))) {
                return false;
            }
        }
        {
            List<Environment> lhsEnvironment;
            lhsEnvironment = (((this.environment!= null)&&(!this.environment.isEmpty()))?this.getEnvironment():null);
            List<Environment> rhsEnvironment;
            rhsEnvironment = (((that.environment!= null)&&(!that.environment.isEmpty()))?that.getEnvironment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "environment", lhsEnvironment), LocatorUtils.property(thatLocator, "environment", rhsEnvironment), lhsEnvironment, rhsEnvironment, ((this.environment!= null)&&(!this.environment.isEmpty())), ((that.environment!= null)&&(!that.environment.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsIsTestPass;
            lhsIsTestPass = this.isIsTestPass();
            Boolean rhsIsTestPass;
            rhsIsTestPass = that.isIsTestPass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isTestPass", lhsIsTestPass), LocatorUtils.property(thatLocator, "isTestPass", rhsIsTestPass), lhsIsTestPass, rhsIsTestPass, (this.isTestPass!= null), (that.isTestPass!= null))) {
                return false;
            }
        }
        {
            TextualDescriptionType lhsName;
            lhsName = this.getName();
            TextualDescriptionType rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsOperatorIdentifier;
            lhsOperatorIdentifier = this.getOperatorIdentifier();
            String rhsOperatorIdentifier;
            rhsOperatorIdentifier = that.getOperatorIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operatorIdentifier", lhsOperatorIdentifier), LocatorUtils.property(thatLocator, "operatorIdentifier", rhsOperatorIdentifier), lhsOperatorIdentifier, rhsOperatorIdentifier, (this.operatorIdentifier!= null), (that.operatorIdentifier!= null))) {
                return false;
            }
        }
        {
            PartnerDescription lhsPartnerDescription;
            lhsPartnerDescription = this.getPartnerDescription();
            PartnerDescription rhsPartnerDescription;
            rhsPartnerDescription = that.getPartnerDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, (this.partnerDescription!= null), (that.partnerDescription!= null))) {
                return false;
            }
        }
        {
            List<Result> lhsResult;
            lhsResult = (((this.result!= null)&&(!this.result.isEmpty()))?this.getResult():null);
            List<Result> rhsResult;
            rhsResult = (((that.result!= null)&&(!that.result.isEmpty()))?that.getResult():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "result", lhsResult), LocatorUtils.property(thatLocator, "result", rhsResult), lhsResult, rhsResult, ((this.result!= null)&&(!this.result.isEmpty())), ((that.result!= null)&&(!that.result.isEmpty())))) {
                return false;
            }
        }
        {
            StartAndEndDateTime lhsStartAndEndDateTime;
            lhsStartAndEndDateTime = this.getStartAndEndDateTime();
            StartAndEndDateTime rhsStartAndEndDateTime;
            rhsStartAndEndDateTime = that.getStartAndEndDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startAndEndDateTime", lhsStartAndEndDateTime), LocatorUtils.property(thatLocator, "startAndEndDateTime", rhsStartAndEndDateTime), lhsStartAndEndDateTime, rhsStartAndEndDateTime, (this.startAndEndDateTime!= null), (that.startAndEndDateTime!= null))) {
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
            String theComment;
            theComment = this.getComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comment", theComment), currentHashCode, theComment, (this.comment!= null));
        }
        {
            List<Environment> theEnvironment;
            theEnvironment = (((this.environment!= null)&&(!this.environment.isEmpty()))?this.getEnvironment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "environment", theEnvironment), currentHashCode, theEnvironment, ((this.environment!= null)&&(!this.environment.isEmpty())));
        }
        {
            Boolean theIsTestPass;
            theIsTestPass = this.isIsTestPass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isTestPass", theIsTestPass), currentHashCode, theIsTestPass, (this.isTestPass!= null));
        }
        {
            TextualDescriptionType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theOperatorIdentifier;
            theOperatorIdentifier = this.getOperatorIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operatorIdentifier", theOperatorIdentifier), currentHashCode, theOperatorIdentifier, (this.operatorIdentifier!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            List<Result> theResult;
            theResult = (((this.result!= null)&&(!this.result.isEmpty()))?this.getResult():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "result", theResult), currentHashCode, theResult, ((this.result!= null)&&(!this.result.isEmpty())));
        }
        {
            StartAndEndDateTime theStartAndEndDateTime;
            theStartAndEndDateTime = this.getStartAndEndDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startAndEndDateTime", theStartAndEndDateTime), currentHashCode, theStartAndEndDateTime, (this.startAndEndDateTime!= null));
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
            String theComment;
            theComment = this.getComment();
            strategy.appendField(locator, this, "comment", buffer, theComment, (this.comment!= null));
        }
        {
            List<Environment> theEnvironment;
            theEnvironment = (((this.environment!= null)&&(!this.environment.isEmpty()))?this.getEnvironment():null);
            strategy.appendField(locator, this, "environment", buffer, theEnvironment, ((this.environment!= null)&&(!this.environment.isEmpty())));
        }
        {
            Boolean theIsTestPass;
            theIsTestPass = this.isIsTestPass();
            strategy.appendField(locator, this, "isTestPass", buffer, theIsTestPass, (this.isTestPass!= null));
        }
        {
            TextualDescriptionType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theOperatorIdentifier;
            theOperatorIdentifier = this.getOperatorIdentifier();
            strategy.appendField(locator, this, "operatorIdentifier", buffer, theOperatorIdentifier, (this.operatorIdentifier!= null));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            List<Result> theResult;
            theResult = (((this.result!= null)&&(!this.result.isEmpty()))?this.getResult():null);
            strategy.appendField(locator, this, "result", buffer, theResult, ((this.result!= null)&&(!this.result.isEmpty())));
        }
        {
            StartAndEndDateTime theStartAndEndDateTime;
            theStartAndEndDateTime = this.getStartAndEndDateTime();
            strategy.appendField(locator, this, "startAndEndDateTime", buffer, theStartAndEndDateTime, (this.startAndEndDateTime!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
