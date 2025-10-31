
package io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_01;

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
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
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
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageTrackingID" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03}NotificationCode"/&gt;
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
    "comments",
    "messageTrackingID",
    "notificationCode"
})
public class StatusInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Comments", required = true)
    protected String comments;
    @XmlElement(name = "MessageTrackingID", required = true)
    protected BusinessDocumentReferenceType messageTrackingID;
    @XmlElementRef(name = "NotificationCode", namespace = "urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03", type = NotificationCode.class)
    protected NotificationCode notificationCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the messageTrackingID property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getMessageTrackingID() {
        return messageTrackingID;
    }

    /**
     * Sets the value of the messageTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setMessageTrackingID(BusinessDocumentReferenceType value) {
        this.messageTrackingID = value;
    }

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
            String lhsComments;
            lhsComments = this.getComments();
            String rhsComments;
            rhsComments = that.getComments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comments", lhsComments), LocatorUtils.property(thatLocator, "comments", rhsComments), lhsComments, rhsComments, (this.comments!= null), (that.comments!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsMessageTrackingID;
            lhsMessageTrackingID = this.getMessageTrackingID();
            BusinessDocumentReferenceType rhsMessageTrackingID;
            rhsMessageTrackingID = that.getMessageTrackingID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageTrackingID", lhsMessageTrackingID), LocatorUtils.property(thatLocator, "messageTrackingID", rhsMessageTrackingID), lhsMessageTrackingID, rhsMessageTrackingID, (this.messageTrackingID!= null), (that.messageTrackingID!= null))) {
                return false;
            }
        }
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
            String theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments, (this.comments!= null));
        }
        {
            BusinessDocumentReferenceType theMessageTrackingID;
            theMessageTrackingID = this.getMessageTrackingID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageTrackingID", theMessageTrackingID), currentHashCode, theMessageTrackingID, (this.messageTrackingID!= null));
        }
        {
            NotificationCode theNotificationCode;
            theNotificationCode = this.getNotificationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notificationCode", theNotificationCode), currentHashCode, theNotificationCode, (this.notificationCode!= null));
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
            String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments, (this.comments!= null));
        }
        {
            BusinessDocumentReferenceType theMessageTrackingID;
            theMessageTrackingID = this.getMessageTrackingID();
            strategy.appendField(locator, this, "messageTrackingID", buffer, theMessageTrackingID, (this.messageTrackingID!= null));
        }
        {
            NotificationCode theNotificationCode;
            theNotificationCode = this.getNotificationCode();
            strategy.appendField(locator, this, "notificationCode", buffer, theNotificationCode, (this.notificationCode!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
