
package io.dscope.rosettanet.system.standarddocumentheader.v01_17;

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
 * <p>Java class for DocumentSecurityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSecurityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NonRepudiableReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PersistentEncryption" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PersistentSignature" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "DocumentSecurityType", propOrder = {
    "nonRepudiableReceipt",
    "persistentEncryption",
    "persistentSignature"
})
public class DocumentSecurityType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "NonRepudiableReceipt")
    protected boolean nonRepudiableReceipt;
    @XmlElement(name = "PersistentEncryption")
    protected boolean persistentEncryption;
    @XmlElement(name = "PersistentSignature")
    protected boolean persistentSignature;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the nonRepudiableReceipt property.
     * 
     */
    public boolean isNonRepudiableReceipt() {
        return nonRepudiableReceipt;
    }

    /**
     * Sets the value of the nonRepudiableReceipt property.
     * 
     */
    public void setNonRepudiableReceipt(boolean value) {
        this.nonRepudiableReceipt = value;
    }

    /**
     * Gets the value of the persistentEncryption property.
     * 
     */
    public boolean isPersistentEncryption() {
        return persistentEncryption;
    }

    /**
     * Sets the value of the persistentEncryption property.
     * 
     */
    public void setPersistentEncryption(boolean value) {
        this.persistentEncryption = value;
    }

    /**
     * Gets the value of the persistentSignature property.
     * 
     */
    public boolean isPersistentSignature() {
        return persistentSignature;
    }

    /**
     * Sets the value of the persistentSignature property.
     * 
     */
    public void setPersistentSignature(boolean value) {
        this.persistentSignature = value;
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
        final DocumentSecurityType that = ((DocumentSecurityType) object);
        {
            boolean lhsNonRepudiableReceipt;
            lhsNonRepudiableReceipt = this.isNonRepudiableReceipt();
            boolean rhsNonRepudiableReceipt;
            rhsNonRepudiableReceipt = that.isNonRepudiableReceipt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nonRepudiableReceipt", lhsNonRepudiableReceipt), LocatorUtils.property(thatLocator, "nonRepudiableReceipt", rhsNonRepudiableReceipt), lhsNonRepudiableReceipt, rhsNonRepudiableReceipt, true, true)) {
                return false;
            }
        }
        {
            boolean lhsPersistentEncryption;
            lhsPersistentEncryption = this.isPersistentEncryption();
            boolean rhsPersistentEncryption;
            rhsPersistentEncryption = that.isPersistentEncryption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "persistentEncryption", lhsPersistentEncryption), LocatorUtils.property(thatLocator, "persistentEncryption", rhsPersistentEncryption), lhsPersistentEncryption, rhsPersistentEncryption, true, true)) {
                return false;
            }
        }
        {
            boolean lhsPersistentSignature;
            lhsPersistentSignature = this.isPersistentSignature();
            boolean rhsPersistentSignature;
            rhsPersistentSignature = that.isPersistentSignature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "persistentSignature", lhsPersistentSignature), LocatorUtils.property(thatLocator, "persistentSignature", rhsPersistentSignature), lhsPersistentSignature, rhsPersistentSignature, true, true)) {
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
            boolean theNonRepudiableReceipt;
            theNonRepudiableReceipt = this.isNonRepudiableReceipt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nonRepudiableReceipt", theNonRepudiableReceipt), currentHashCode, theNonRepudiableReceipt, true);
        }
        {
            boolean thePersistentEncryption;
            thePersistentEncryption = this.isPersistentEncryption();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "persistentEncryption", thePersistentEncryption), currentHashCode, thePersistentEncryption, true);
        }
        {
            boolean thePersistentSignature;
            thePersistentSignature = this.isPersistentSignature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "persistentSignature", thePersistentSignature), currentHashCode, thePersistentSignature, true);
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
            boolean theNonRepudiableReceipt;
            theNonRepudiableReceipt = this.isNonRepudiableReceipt();
            strategy.appendField(locator, this, "nonRepudiableReceipt", buffer, theNonRepudiableReceipt, true);
        }
        {
            boolean thePersistentEncryption;
            thePersistentEncryption = this.isPersistentEncryption();
            strategy.appendField(locator, this, "persistentEncryption", buffer, thePersistentEncryption, true);
        }
        {
            boolean thePersistentSignature;
            thePersistentSignature = this.isPersistentSignature();
            strategy.appendField(locator, this, "persistentSignature", buffer, thePersistentSignature, true);
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
