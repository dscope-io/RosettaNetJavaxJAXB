
package io.dscope.rosettanet.domain.service.service.v02_20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.codelist.language.v01_02.Language;
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
 * <p>Java class for MessageInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attachment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Language:xsd:codelist:01.02}Language" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}RoutingInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MessageInformationType", propOrder = {
    "attachment",
    "language",
    "routingInformation"
})
public class MessageInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Attachment")
    protected List<String> attachment;
    @XmlElementRef(name = "Language", namespace = "urn:rosettanet:specification:universal:Language:xsd:codelist:01.02", type = Language.class, required = false)
    protected Language language;
    @XmlElementRef(name = "RoutingInformation", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = RoutingInformation.class, required = false)
    protected List<RoutingInformation> routingInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<String>();
        }
        return this.attachment;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Gets the value of the routingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingInformation }
     * 
     * 
     */
    public List<RoutingInformation> getRoutingInformation() {
        if (routingInformation == null) {
            routingInformation = new ArrayList<RoutingInformation>();
        }
        return this.routingInformation;
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
        final MessageInformationType that = ((MessageInformationType) object);
        {
            List<String> lhsAttachment;
            lhsAttachment = (((this.attachment!= null)&&(!this.attachment.isEmpty()))?this.getAttachment():null);
            List<String> rhsAttachment;
            rhsAttachment = (((that.attachment!= null)&&(!that.attachment.isEmpty()))?that.getAttachment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachment", lhsAttachment), LocatorUtils.property(thatLocator, "attachment", rhsAttachment), lhsAttachment, rhsAttachment, ((this.attachment!= null)&&(!this.attachment.isEmpty())), ((that.attachment!= null)&&(!that.attachment.isEmpty())))) {
                return false;
            }
        }
        {
            Language lhsLanguage;
            lhsLanguage = this.getLanguage();
            Language rhsLanguage;
            rhsLanguage = that.getLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage, (this.language!= null), (that.language!= null))) {
                return false;
            }
        }
        {
            List<RoutingInformation> lhsRoutingInformation;
            lhsRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            List<RoutingInformation> rhsRoutingInformation;
            rhsRoutingInformation = (((that.routingInformation!= null)&&(!that.routingInformation.isEmpty()))?that.getRoutingInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "routingInformation", lhsRoutingInformation), LocatorUtils.property(thatLocator, "routingInformation", rhsRoutingInformation), lhsRoutingInformation, rhsRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())), ((that.routingInformation!= null)&&(!that.routingInformation.isEmpty())))) {
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
            List<String> theAttachment;
            theAttachment = (((this.attachment!= null)&&(!this.attachment.isEmpty()))?this.getAttachment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachment", theAttachment), currentHashCode, theAttachment, ((this.attachment!= null)&&(!this.attachment.isEmpty())));
        }
        {
            Language theLanguage;
            theLanguage = this.getLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage, (this.language!= null));
        }
        {
            List<RoutingInformation> theRoutingInformation;
            theRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "routingInformation", theRoutingInformation), currentHashCode, theRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())));
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
            List<String> theAttachment;
            theAttachment = (((this.attachment!= null)&&(!this.attachment.isEmpty()))?this.getAttachment():null);
            strategy.appendField(locator, this, "attachment", buffer, theAttachment, ((this.attachment!= null)&&(!this.attachment.isEmpty())));
        }
        {
            Language theLanguage;
            theLanguage = this.getLanguage();
            strategy.appendField(locator, this, "language", buffer, theLanguage, (this.language!= null));
        }
        {
            List<RoutingInformation> theRoutingInformation;
            theRoutingInformation = (((this.routingInformation!= null)&&(!this.routingInformation.isEmpty()))?this.getRoutingInformation():null);
            strategy.appendField(locator, this, "routingInformation", buffer, theRoutingInformation, ((this.routingInformation!= null)&&(!this.routingInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
