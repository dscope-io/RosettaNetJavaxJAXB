
package io.dscope.rosettanet.domain.service.service.v02_20;

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
 * <p>Java class for NotesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NoteSecurity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoteText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "NotesType", propOrder = {
    "noteSecurity",
    "noteText",
    "noteType"
})
public class NotesType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "NoteSecurity")
    protected String noteSecurity;
    @XmlElement(name = "NoteText", required = true)
    protected String noteText;
    @XmlElement(name = "NoteType")
    protected String noteType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the noteSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteSecurity() {
        return noteSecurity;
    }

    /**
     * Sets the value of the noteSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteSecurity(String value) {
        this.noteSecurity = value;
    }

    /**
     * Gets the value of the noteText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * Sets the value of the noteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteText(String value) {
        this.noteText = value;
    }

    /**
     * Gets the value of the noteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteType() {
        return noteType;
    }

    /**
     * Sets the value of the noteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteType(String value) {
        this.noteType = value;
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
        final NotesType that = ((NotesType) object);
        {
            String lhsNoteSecurity;
            lhsNoteSecurity = this.getNoteSecurity();
            String rhsNoteSecurity;
            rhsNoteSecurity = that.getNoteSecurity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noteSecurity", lhsNoteSecurity), LocatorUtils.property(thatLocator, "noteSecurity", rhsNoteSecurity), lhsNoteSecurity, rhsNoteSecurity, (this.noteSecurity!= null), (that.noteSecurity!= null))) {
                return false;
            }
        }
        {
            String lhsNoteText;
            lhsNoteText = this.getNoteText();
            String rhsNoteText;
            rhsNoteText = that.getNoteText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noteText", lhsNoteText), LocatorUtils.property(thatLocator, "noteText", rhsNoteText), lhsNoteText, rhsNoteText, (this.noteText!= null), (that.noteText!= null))) {
                return false;
            }
        }
        {
            String lhsNoteType;
            lhsNoteType = this.getNoteType();
            String rhsNoteType;
            rhsNoteType = that.getNoteType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noteType", lhsNoteType), LocatorUtils.property(thatLocator, "noteType", rhsNoteType), lhsNoteType, rhsNoteType, (this.noteType!= null), (that.noteType!= null))) {
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
            String theNoteSecurity;
            theNoteSecurity = this.getNoteSecurity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noteSecurity", theNoteSecurity), currentHashCode, theNoteSecurity, (this.noteSecurity!= null));
        }
        {
            String theNoteText;
            theNoteText = this.getNoteText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noteText", theNoteText), currentHashCode, theNoteText, (this.noteText!= null));
        }
        {
            String theNoteType;
            theNoteType = this.getNoteType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noteType", theNoteType), currentHashCode, theNoteType, (this.noteType!= null));
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
            String theNoteSecurity;
            theNoteSecurity = this.getNoteSecurity();
            strategy.appendField(locator, this, "noteSecurity", buffer, theNoteSecurity, (this.noteSecurity!= null));
        }
        {
            String theNoteText;
            theNoteText = this.getNoteText();
            strategy.appendField(locator, this, "noteText", buffer, theNoteText, (this.noteText!= null));
        }
        {
            String theNoteType;
            theNoteType = this.getNoteType();
            strategy.appendField(locator, this, "noteType", buffer, theNoteType, (this.noteType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
