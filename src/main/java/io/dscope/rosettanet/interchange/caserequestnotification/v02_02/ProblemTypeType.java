
package io.dscope.rosettanet.interchange.caserequestnotification.v02_02;

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
 * <p>Java class for ProblemTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProblemTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProblemClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProblemSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProblemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ProblemTypeType", propOrder = {
    "problemClassification",
    "problemSubtype",
    "problemType"
})
public class ProblemTypeType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ProblemClassification")
    protected String problemClassification;
    @XmlElement(name = "ProblemSubtype")
    protected String problemSubtype;
    @XmlElement(name = "ProblemType")
    protected String problemType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the problemClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemClassification() {
        return problemClassification;
    }

    /**
     * Sets the value of the problemClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemClassification(String value) {
        this.problemClassification = value;
    }

    /**
     * Gets the value of the problemSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemSubtype() {
        return problemSubtype;
    }

    /**
     * Sets the value of the problemSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemSubtype(String value) {
        this.problemSubtype = value;
    }

    /**
     * Gets the value of the problemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemType() {
        return problemType;
    }

    /**
     * Sets the value of the problemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemType(String value) {
        this.problemType = value;
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
        final ProblemTypeType that = ((ProblemTypeType) object);
        {
            String lhsProblemClassification;
            lhsProblemClassification = this.getProblemClassification();
            String rhsProblemClassification;
            rhsProblemClassification = that.getProblemClassification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "problemClassification", lhsProblemClassification), LocatorUtils.property(thatLocator, "problemClassification", rhsProblemClassification), lhsProblemClassification, rhsProblemClassification, (this.problemClassification!= null), (that.problemClassification!= null))) {
                return false;
            }
        }
        {
            String lhsProblemSubtype;
            lhsProblemSubtype = this.getProblemSubtype();
            String rhsProblemSubtype;
            rhsProblemSubtype = that.getProblemSubtype();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "problemSubtype", lhsProblemSubtype), LocatorUtils.property(thatLocator, "problemSubtype", rhsProblemSubtype), lhsProblemSubtype, rhsProblemSubtype, (this.problemSubtype!= null), (that.problemSubtype!= null))) {
                return false;
            }
        }
        {
            String lhsProblemType;
            lhsProblemType = this.getProblemType();
            String rhsProblemType;
            rhsProblemType = that.getProblemType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "problemType", lhsProblemType), LocatorUtils.property(thatLocator, "problemType", rhsProblemType), lhsProblemType, rhsProblemType, (this.problemType!= null), (that.problemType!= null))) {
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
            String theProblemClassification;
            theProblemClassification = this.getProblemClassification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "problemClassification", theProblemClassification), currentHashCode, theProblemClassification, (this.problemClassification!= null));
        }
        {
            String theProblemSubtype;
            theProblemSubtype = this.getProblemSubtype();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "problemSubtype", theProblemSubtype), currentHashCode, theProblemSubtype, (this.problemSubtype!= null));
        }
        {
            String theProblemType;
            theProblemType = this.getProblemType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "problemType", theProblemType), currentHashCode, theProblemType, (this.problemType!= null));
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
            String theProblemClassification;
            theProblemClassification = this.getProblemClassification();
            strategy.appendField(locator, this, "problemClassification", buffer, theProblemClassification, (this.problemClassification!= null));
        }
        {
            String theProblemSubtype;
            theProblemSubtype = this.getProblemSubtype();
            strategy.appendField(locator, this, "problemSubtype", buffer, theProblemSubtype, (this.problemSubtype!= null));
        }
        {
            String theProblemType;
            theProblemType = this.getProblemType();
            strategy.appendField(locator, this, "problemType", buffer, theProblemType, (this.problemType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
