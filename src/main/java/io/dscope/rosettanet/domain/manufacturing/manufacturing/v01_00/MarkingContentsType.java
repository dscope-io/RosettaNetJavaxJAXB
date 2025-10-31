
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_00;

import java.math.BigInteger;
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
 * <p>Java class for MarkingContentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkingContentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MarkingLine" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="MarkingText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "MarkingContentsType", propOrder = {
    "markingLine",
    "markingText"
})
public class MarkingContentsType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "MarkingLine")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger markingLine;
    @XmlElement(name = "MarkingText", required = true)
    protected String markingText;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the markingLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarkingLine() {
        return markingLine;
    }

    /**
     * Sets the value of the markingLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarkingLine(BigInteger value) {
        this.markingLine = value;
    }

    /**
     * Gets the value of the markingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkingText() {
        return markingText;
    }

    /**
     * Sets the value of the markingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkingText(String value) {
        this.markingText = value;
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
        final MarkingContentsType that = ((MarkingContentsType) object);
        {
            BigInteger lhsMarkingLine;
            lhsMarkingLine = this.getMarkingLine();
            BigInteger rhsMarkingLine;
            rhsMarkingLine = that.getMarkingLine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markingLine", lhsMarkingLine), LocatorUtils.property(thatLocator, "markingLine", rhsMarkingLine), lhsMarkingLine, rhsMarkingLine, (this.markingLine!= null), (that.markingLine!= null))) {
                return false;
            }
        }
        {
            String lhsMarkingText;
            lhsMarkingText = this.getMarkingText();
            String rhsMarkingText;
            rhsMarkingText = that.getMarkingText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markingText", lhsMarkingText), LocatorUtils.property(thatLocator, "markingText", rhsMarkingText), lhsMarkingText, rhsMarkingText, (this.markingText!= null), (that.markingText!= null))) {
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
            BigInteger theMarkingLine;
            theMarkingLine = this.getMarkingLine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markingLine", theMarkingLine), currentHashCode, theMarkingLine, (this.markingLine!= null));
        }
        {
            String theMarkingText;
            theMarkingText = this.getMarkingText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markingText", theMarkingText), currentHashCode, theMarkingText, (this.markingText!= null));
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
            BigInteger theMarkingLine;
            theMarkingLine = this.getMarkingLine();
            strategy.appendField(locator, this, "markingLine", buffer, theMarkingLine, (this.markingLine!= null));
        }
        {
            String theMarkingText;
            theMarkingText = this.getMarkingText();
            strategy.appendField(locator, this, "markingText", buffer, theMarkingText, (this.markingText!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
