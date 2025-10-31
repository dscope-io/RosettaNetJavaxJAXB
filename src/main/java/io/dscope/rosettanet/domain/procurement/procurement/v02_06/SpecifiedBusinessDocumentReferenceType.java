
package io.dscope.rosettanet.domain.procurement.procurement.v02_06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for SpecifiedBusinessDocumentReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedBusinessDocumentReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SpecifiedBusinessDocumentReferenceType", propOrder = {
    "dateTime",
    "identifier",
    "line",
    "revision",
    "subLine"
})
public class SpecifiedBusinessDocumentReferenceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "Line")
    protected String line;
    @XmlElement(name = "Revision")
    protected String revision;
    @XmlElement(name = "SubLine")
    protected String subLine;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine(String value) {
        this.line = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the subLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLine() {
        return subLine;
    }

    /**
     * Sets the value of the subLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLine(String value) {
        this.subLine = value;
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
        final SpecifiedBusinessDocumentReferenceType that = ((SpecifiedBusinessDocumentReferenceType) object);
        {
            XMLGregorianCalendar lhsDateTime;
            lhsDateTime = this.getDateTime();
            XMLGregorianCalendar rhsDateTime;
            rhsDateTime = that.getDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTime", lhsDateTime), LocatorUtils.property(thatLocator, "dateTime", rhsDateTime), lhsDateTime, rhsDateTime, (this.dateTime!= null), (that.dateTime!= null))) {
                return false;
            }
        }
        {
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            String lhsLine;
            lhsLine = this.getLine();
            String rhsLine;
            rhsLine = that.getLine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line", lhsLine), LocatorUtils.property(thatLocator, "line", rhsLine), lhsLine, rhsLine, (this.line!= null), (that.line!= null))) {
                return false;
            }
        }
        {
            String lhsRevision;
            lhsRevision = this.getRevision();
            String rhsRevision;
            rhsRevision = that.getRevision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revision", lhsRevision), LocatorUtils.property(thatLocator, "revision", rhsRevision), lhsRevision, rhsRevision, (this.revision!= null), (that.revision!= null))) {
                return false;
            }
        }
        {
            String lhsSubLine;
            lhsSubLine = this.getSubLine();
            String rhsSubLine;
            rhsSubLine = that.getSubLine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subLine", lhsSubLine), LocatorUtils.property(thatLocator, "subLine", rhsSubLine), lhsSubLine, rhsSubLine, (this.subLine!= null), (that.subLine!= null))) {
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
            XMLGregorianCalendar theDateTime;
            theDateTime = this.getDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateTime", theDateTime), currentHashCode, theDateTime, (this.dateTime!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            String theLine;
            theLine = this.getLine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line", theLine), currentHashCode, theLine, (this.line!= null));
        }
        {
            String theRevision;
            theRevision = this.getRevision();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revision", theRevision), currentHashCode, theRevision, (this.revision!= null));
        }
        {
            String theSubLine;
            theSubLine = this.getSubLine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subLine", theSubLine), currentHashCode, theSubLine, (this.subLine!= null));
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
            XMLGregorianCalendar theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime, (this.dateTime!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            String theLine;
            theLine = this.getLine();
            strategy.appendField(locator, this, "line", buffer, theLine, (this.line!= null));
        }
        {
            String theRevision;
            theRevision = this.getRevision();
            strategy.appendField(locator, this, "revision", buffer, theRevision, (this.revision!= null));
        }
        {
            String theSubLine;
            theSubLine = this.getSubLine();
            strategy.appendField(locator, this, "subLine", buffer, theSubLine, (this.subLine!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
