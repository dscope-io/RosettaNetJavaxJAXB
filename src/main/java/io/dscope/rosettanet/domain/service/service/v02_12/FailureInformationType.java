
package io.dscope.rosettanet.domain.service.service.v02_12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for FailureInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailureInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.12}FailureAnalysis" minOccurs="0"/&gt;
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
@XmlType(name = "FailureInformationType", propOrder = {
    "comment",
    "dateTimeStamp",
    "failureAnalysis"
})
public class FailureInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "DateTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStamp;
    @XmlElementRef(name = "FailureAnalysis", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", type = FailureAnalysis.class, required = false)
    protected FailureAnalysis failureAnalysis;
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
     * Gets the value of the dateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Sets the value of the dateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeStamp(XMLGregorianCalendar value) {
        this.dateTimeStamp = value;
    }

    /**
     * Gets the value of the failureAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link FailureAnalysis }
     *     
     */
    public FailureAnalysis getFailureAnalysis() {
        return failureAnalysis;
    }

    /**
     * Sets the value of the failureAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureAnalysis }
     *     
     */
    public void setFailureAnalysis(FailureAnalysis value) {
        this.failureAnalysis = value;
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
        final FailureInformationType that = ((FailureInformationType) object);
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
            XMLGregorianCalendar lhsDateTimeStamp;
            lhsDateTimeStamp = this.getDateTimeStamp();
            XMLGregorianCalendar rhsDateTimeStamp;
            rhsDateTimeStamp = that.getDateTimeStamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTimeStamp", lhsDateTimeStamp), LocatorUtils.property(thatLocator, "dateTimeStamp", rhsDateTimeStamp), lhsDateTimeStamp, rhsDateTimeStamp, (this.dateTimeStamp!= null), (that.dateTimeStamp!= null))) {
                return false;
            }
        }
        {
            FailureAnalysis lhsFailureAnalysis;
            lhsFailureAnalysis = this.getFailureAnalysis();
            FailureAnalysis rhsFailureAnalysis;
            rhsFailureAnalysis = that.getFailureAnalysis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failureAnalysis", lhsFailureAnalysis), LocatorUtils.property(thatLocator, "failureAnalysis", rhsFailureAnalysis), lhsFailureAnalysis, rhsFailureAnalysis, (this.failureAnalysis!= null), (that.failureAnalysis!= null))) {
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
            XMLGregorianCalendar theDateTimeStamp;
            theDateTimeStamp = this.getDateTimeStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateTimeStamp", theDateTimeStamp), currentHashCode, theDateTimeStamp, (this.dateTimeStamp!= null));
        }
        {
            FailureAnalysis theFailureAnalysis;
            theFailureAnalysis = this.getFailureAnalysis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failureAnalysis", theFailureAnalysis), currentHashCode, theFailureAnalysis, (this.failureAnalysis!= null));
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
            XMLGregorianCalendar theDateTimeStamp;
            theDateTimeStamp = this.getDateTimeStamp();
            strategy.appendField(locator, this, "dateTimeStamp", buffer, theDateTimeStamp, (this.dateTimeStamp!= null));
        }
        {
            FailureAnalysis theFailureAnalysis;
            theFailureAnalysis = this.getFailureAnalysis();
            strategy.appendField(locator, this, "failureAnalysis", buffer, theFailureAnalysis, (this.failureAnalysis!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
