
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.completionstatus.v01_03.CompletionStatus;
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
 * <p>Java class for LotTimeStampType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotTimeStampType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:01.03}CompletionStatus" minOccurs="0"/&gt;
 *         &lt;element name="LotEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LotStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlType(name = "LotTimeStampType", propOrder = {
    "completionStatus",
    "lotEndDateTime",
    "lotStartDateTime"
})
public class LotTimeStampType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "CompletionStatus", namespace = "urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:01.03", type = CompletionStatus.class, required = false)
    protected CompletionStatus completionStatus;
    @XmlElement(name = "LotEndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lotEndDateTime;
    @XmlElement(name = "LotStartDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lotStartDateTime;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the completionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CompletionStatus }
     *     
     */
    public CompletionStatus getCompletionStatus() {
        return completionStatus;
    }

    /**
     * Sets the value of the completionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletionStatus }
     *     
     */
    public void setCompletionStatus(CompletionStatus value) {
        this.completionStatus = value;
    }

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
        final LotTimeStampType that = ((LotTimeStampType) object);
        {
            CompletionStatus lhsCompletionStatus;
            lhsCompletionStatus = this.getCompletionStatus();
            CompletionStatus rhsCompletionStatus;
            rhsCompletionStatus = that.getCompletionStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "completionStatus", lhsCompletionStatus), LocatorUtils.property(thatLocator, "completionStatus", rhsCompletionStatus), lhsCompletionStatus, rhsCompletionStatus, (this.completionStatus!= null), (that.completionStatus!= null))) {
                return false;
            }
        }
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
            CompletionStatus theCompletionStatus;
            theCompletionStatus = this.getCompletionStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "completionStatus", theCompletionStatus), currentHashCode, theCompletionStatus, (this.completionStatus!= null));
        }
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
            CompletionStatus theCompletionStatus;
            theCompletionStatus = this.getCompletionStatus();
            strategy.appendField(locator, this, "completionStatus", buffer, theCompletionStatus, (this.completionStatus!= null));
        }
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
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
