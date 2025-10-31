
package io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.codelist.notificationcode.v01_03.NotificationCode;
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
 * <p>Java class for StatusInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03}NotificationCode"/&gt;
 *         &lt;element name="WarrantyNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "StatusInformationType", propOrder = {
    "notificationCode",
    "warrantyNotes"
})
public class StatusInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "NotificationCode", namespace = "urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03", type = NotificationCode.class)
    protected NotificationCode notificationCode;
    @XmlElement(name = "WarrantyNotes")
    protected String warrantyNotes;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the notificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCode }
     *     
     */
    public NotificationCode getNotificationCode() {
        return notificationCode;
    }

    /**
     * Sets the value of the notificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCode }
     *     
     */
    public void setNotificationCode(NotificationCode value) {
        this.notificationCode = value;
    }

    /**
     * Gets the value of the warrantyNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyNotes() {
        return warrantyNotes;
    }

    /**
     * Sets the value of the warrantyNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyNotes(String value) {
        this.warrantyNotes = value;
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
        final StatusInformationType that = ((StatusInformationType) object);
        {
            NotificationCode lhsNotificationCode;
            lhsNotificationCode = this.getNotificationCode();
            NotificationCode rhsNotificationCode;
            rhsNotificationCode = that.getNotificationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notificationCode", lhsNotificationCode), LocatorUtils.property(thatLocator, "notificationCode", rhsNotificationCode), lhsNotificationCode, rhsNotificationCode, (this.notificationCode!= null), (that.notificationCode!= null))) {
                return false;
            }
        }
        {
            String lhsWarrantyNotes;
            lhsWarrantyNotes = this.getWarrantyNotes();
            String rhsWarrantyNotes;
            rhsWarrantyNotes = that.getWarrantyNotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyNotes", lhsWarrantyNotes), LocatorUtils.property(thatLocator, "warrantyNotes", rhsWarrantyNotes), lhsWarrantyNotes, rhsWarrantyNotes, (this.warrantyNotes!= null), (that.warrantyNotes!= null))) {
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
            NotificationCode theNotificationCode;
            theNotificationCode = this.getNotificationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notificationCode", theNotificationCode), currentHashCode, theNotificationCode, (this.notificationCode!= null));
        }
        {
            String theWarrantyNotes;
            theWarrantyNotes = this.getWarrantyNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyNotes", theWarrantyNotes), currentHashCode, theWarrantyNotes, (this.warrantyNotes!= null));
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
            NotificationCode theNotificationCode;
            theNotificationCode = this.getNotificationCode();
            strategy.appendField(locator, this, "notificationCode", buffer, theNotificationCode, (this.notificationCode!= null));
        }
        {
            String theWarrantyNotes;
            theWarrantyNotes = this.getWarrantyNotes();
            strategy.appendField(locator, this, "warrantyNotes", buffer, theWarrantyNotes, (this.warrantyNotes!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
