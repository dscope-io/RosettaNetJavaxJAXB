
package io.dscope.rosettanet.system.standarddocumentheader.v01_16;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for DocumentHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16}CorrelationInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16}DocumentInformation"/&gt;
 *         &lt;element name="HeaderVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16}Receiver"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16}Sender"/&gt;
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
@XmlType(name = "DocumentHeaderType", propOrder = {
    "correlationInformation",
    "documentInformation",
    "headerVersion",
    "receiver",
    "sender"
})
public class DocumentHeaderType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "CorrelationInformation", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16", type = CorrelationInformation.class, required = false)
    protected CorrelationInformation correlationInformation;
    @XmlElementRef(name = "DocumentInformation", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16", type = DocumentInformation.class)
    protected DocumentInformation documentInformation;
    @XmlElement(name = "HeaderVersion")
    protected String headerVersion;
    @XmlElementRef(name = "Receiver", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16", type = Receiver.class)
    protected Receiver receiver;
    @XmlElementRef(name = "Sender", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16", type = Sender.class)
    protected Sender sender;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the correlationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationInformation }
     *     
     */
    public CorrelationInformation getCorrelationInformation() {
        return correlationInformation;
    }

    /**
     * Sets the value of the correlationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationInformation }
     *     
     */
    public void setCorrelationInformation(CorrelationInformation value) {
        this.correlationInformation = value;
    }

    /**
     * Gets the value of the documentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInformation }
     *     
     */
    public DocumentInformation getDocumentInformation() {
        return documentInformation;
    }

    /**
     * Sets the value of the documentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInformation }
     *     
     */
    public void setDocumentInformation(DocumentInformation value) {
        this.documentInformation = value;
    }

    /**
     * Gets the value of the headerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderVersion() {
        return headerVersion;
    }

    /**
     * Sets the value of the headerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderVersion(String value) {
        this.headerVersion = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link Receiver }
     *     
     */
    public Receiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receiver }
     *     
     */
    public void setReceiver(Receiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
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
        final DocumentHeaderType that = ((DocumentHeaderType) object);
        {
            CorrelationInformation lhsCorrelationInformation;
            lhsCorrelationInformation = this.getCorrelationInformation();
            CorrelationInformation rhsCorrelationInformation;
            rhsCorrelationInformation = that.getCorrelationInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "correlationInformation", lhsCorrelationInformation), LocatorUtils.property(thatLocator, "correlationInformation", rhsCorrelationInformation), lhsCorrelationInformation, rhsCorrelationInformation, (this.correlationInformation!= null), (that.correlationInformation!= null))) {
                return false;
            }
        }
        {
            DocumentInformation lhsDocumentInformation;
            lhsDocumentInformation = this.getDocumentInformation();
            DocumentInformation rhsDocumentInformation;
            rhsDocumentInformation = that.getDocumentInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentInformation", lhsDocumentInformation), LocatorUtils.property(thatLocator, "documentInformation", rhsDocumentInformation), lhsDocumentInformation, rhsDocumentInformation, (this.documentInformation!= null), (that.documentInformation!= null))) {
                return false;
            }
        }
        {
            String lhsHeaderVersion;
            lhsHeaderVersion = this.getHeaderVersion();
            String rhsHeaderVersion;
            rhsHeaderVersion = that.getHeaderVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "headerVersion", lhsHeaderVersion), LocatorUtils.property(thatLocator, "headerVersion", rhsHeaderVersion), lhsHeaderVersion, rhsHeaderVersion, (this.headerVersion!= null), (that.headerVersion!= null))) {
                return false;
            }
        }
        {
            Receiver lhsReceiver;
            lhsReceiver = this.getReceiver();
            Receiver rhsReceiver;
            rhsReceiver = that.getReceiver();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receiver", lhsReceiver), LocatorUtils.property(thatLocator, "receiver", rhsReceiver), lhsReceiver, rhsReceiver, (this.receiver!= null), (that.receiver!= null))) {
                return false;
            }
        }
        {
            Sender lhsSender;
            lhsSender = this.getSender();
            Sender rhsSender;
            rhsSender = that.getSender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sender", lhsSender), LocatorUtils.property(thatLocator, "sender", rhsSender), lhsSender, rhsSender, (this.sender!= null), (that.sender!= null))) {
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
            CorrelationInformation theCorrelationInformation;
            theCorrelationInformation = this.getCorrelationInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "correlationInformation", theCorrelationInformation), currentHashCode, theCorrelationInformation, (this.correlationInformation!= null));
        }
        {
            DocumentInformation theDocumentInformation;
            theDocumentInformation = this.getDocumentInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentInformation", theDocumentInformation), currentHashCode, theDocumentInformation, (this.documentInformation!= null));
        }
        {
            String theHeaderVersion;
            theHeaderVersion = this.getHeaderVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "headerVersion", theHeaderVersion), currentHashCode, theHeaderVersion, (this.headerVersion!= null));
        }
        {
            Receiver theReceiver;
            theReceiver = this.getReceiver();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receiver", theReceiver), currentHashCode, theReceiver, (this.receiver!= null));
        }
        {
            Sender theSender;
            theSender = this.getSender();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sender", theSender), currentHashCode, theSender, (this.sender!= null));
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
            CorrelationInformation theCorrelationInformation;
            theCorrelationInformation = this.getCorrelationInformation();
            strategy.appendField(locator, this, "correlationInformation", buffer, theCorrelationInformation, (this.correlationInformation!= null));
        }
        {
            DocumentInformation theDocumentInformation;
            theDocumentInformation = this.getDocumentInformation();
            strategy.appendField(locator, this, "documentInformation", buffer, theDocumentInformation, (this.documentInformation!= null));
        }
        {
            String theHeaderVersion;
            theHeaderVersion = this.getHeaderVersion();
            strategy.appendField(locator, this, "headerVersion", buffer, theHeaderVersion, (this.headerVersion!= null));
        }
        {
            Receiver theReceiver;
            theReceiver = this.getReceiver();
            strategy.appendField(locator, this, "receiver", buffer, theReceiver, (this.receiver!= null));
        }
        {
            Sender theSender;
            theSender = this.getSender();
            strategy.appendField(locator, this, "sender", buffer, theSender, (this.sender!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
