
package io.dscope.rosettanet.system.standarddocumentheader.v01_19;

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
 * <p>Java class for RequestingDocumentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestingDocumentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessProcessInstanceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestingDocumentCreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestingDocumentInstanceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlType(name = "RequestingDocumentInformationType", propOrder = {
    "businessProcessInstanceIdentifier",
    "requestingDocumentCreationDateTime",
    "requestingDocumentInstanceIdentifier",
    "responseDateTime"
})
public class RequestingDocumentInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BusinessProcessInstanceIdentifier")
    protected String businessProcessInstanceIdentifier;
    @XmlElement(name = "RequestingDocumentCreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestingDocumentCreationDateTime;
    @XmlElement(name = "RequestingDocumentInstanceIdentifier", required = true)
    protected String requestingDocumentInstanceIdentifier;
    @XmlElement(name = "ResponseDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseDateTime;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessProcessInstanceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessProcessInstanceIdentifier() {
        return businessProcessInstanceIdentifier;
    }

    /**
     * Sets the value of the businessProcessInstanceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessProcessInstanceIdentifier(String value) {
        this.businessProcessInstanceIdentifier = value;
    }

    /**
     * Gets the value of the requestingDocumentCreationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestingDocumentCreationDateTime() {
        return requestingDocumentCreationDateTime;
    }

    /**
     * Sets the value of the requestingDocumentCreationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestingDocumentCreationDateTime(XMLGregorianCalendar value) {
        this.requestingDocumentCreationDateTime = value;
    }

    /**
     * Gets the value of the requestingDocumentInstanceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingDocumentInstanceIdentifier() {
        return requestingDocumentInstanceIdentifier;
    }

    /**
     * Sets the value of the requestingDocumentInstanceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingDocumentInstanceIdentifier(String value) {
        this.requestingDocumentInstanceIdentifier = value;
    }

    /**
     * Gets the value of the responseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDateTime() {
        return responseDateTime;
    }

    /**
     * Sets the value of the responseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDateTime(XMLGregorianCalendar value) {
        this.responseDateTime = value;
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
        final RequestingDocumentInformationType that = ((RequestingDocumentInformationType) object);
        {
            String lhsBusinessProcessInstanceIdentifier;
            lhsBusinessProcessInstanceIdentifier = this.getBusinessProcessInstanceIdentifier();
            String rhsBusinessProcessInstanceIdentifier;
            rhsBusinessProcessInstanceIdentifier = that.getBusinessProcessInstanceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessProcessInstanceIdentifier", lhsBusinessProcessInstanceIdentifier), LocatorUtils.property(thatLocator, "businessProcessInstanceIdentifier", rhsBusinessProcessInstanceIdentifier), lhsBusinessProcessInstanceIdentifier, rhsBusinessProcessInstanceIdentifier, (this.businessProcessInstanceIdentifier!= null), (that.businessProcessInstanceIdentifier!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsRequestingDocumentCreationDateTime;
            lhsRequestingDocumentCreationDateTime = this.getRequestingDocumentCreationDateTime();
            XMLGregorianCalendar rhsRequestingDocumentCreationDateTime;
            rhsRequestingDocumentCreationDateTime = that.getRequestingDocumentCreationDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestingDocumentCreationDateTime", lhsRequestingDocumentCreationDateTime), LocatorUtils.property(thatLocator, "requestingDocumentCreationDateTime", rhsRequestingDocumentCreationDateTime), lhsRequestingDocumentCreationDateTime, rhsRequestingDocumentCreationDateTime, (this.requestingDocumentCreationDateTime!= null), (that.requestingDocumentCreationDateTime!= null))) {
                return false;
            }
        }
        {
            String lhsRequestingDocumentInstanceIdentifier;
            lhsRequestingDocumentInstanceIdentifier = this.getRequestingDocumentInstanceIdentifier();
            String rhsRequestingDocumentInstanceIdentifier;
            rhsRequestingDocumentInstanceIdentifier = that.getRequestingDocumentInstanceIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestingDocumentInstanceIdentifier", lhsRequestingDocumentInstanceIdentifier), LocatorUtils.property(thatLocator, "requestingDocumentInstanceIdentifier", rhsRequestingDocumentInstanceIdentifier), lhsRequestingDocumentInstanceIdentifier, rhsRequestingDocumentInstanceIdentifier, (this.requestingDocumentInstanceIdentifier!= null), (that.requestingDocumentInstanceIdentifier!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsResponseDateTime;
            lhsResponseDateTime = this.getResponseDateTime();
            XMLGregorianCalendar rhsResponseDateTime;
            rhsResponseDateTime = that.getResponseDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseDateTime", lhsResponseDateTime), LocatorUtils.property(thatLocator, "responseDateTime", rhsResponseDateTime), lhsResponseDateTime, rhsResponseDateTime, (this.responseDateTime!= null), (that.responseDateTime!= null))) {
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
            String theBusinessProcessInstanceIdentifier;
            theBusinessProcessInstanceIdentifier = this.getBusinessProcessInstanceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessProcessInstanceIdentifier", theBusinessProcessInstanceIdentifier), currentHashCode, theBusinessProcessInstanceIdentifier, (this.businessProcessInstanceIdentifier!= null));
        }
        {
            XMLGregorianCalendar theRequestingDocumentCreationDateTime;
            theRequestingDocumentCreationDateTime = this.getRequestingDocumentCreationDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestingDocumentCreationDateTime", theRequestingDocumentCreationDateTime), currentHashCode, theRequestingDocumentCreationDateTime, (this.requestingDocumentCreationDateTime!= null));
        }
        {
            String theRequestingDocumentInstanceIdentifier;
            theRequestingDocumentInstanceIdentifier = this.getRequestingDocumentInstanceIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestingDocumentInstanceIdentifier", theRequestingDocumentInstanceIdentifier), currentHashCode, theRequestingDocumentInstanceIdentifier, (this.requestingDocumentInstanceIdentifier!= null));
        }
        {
            XMLGregorianCalendar theResponseDateTime;
            theResponseDateTime = this.getResponseDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseDateTime", theResponseDateTime), currentHashCode, theResponseDateTime, (this.responseDateTime!= null));
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
            String theBusinessProcessInstanceIdentifier;
            theBusinessProcessInstanceIdentifier = this.getBusinessProcessInstanceIdentifier();
            strategy.appendField(locator, this, "businessProcessInstanceIdentifier", buffer, theBusinessProcessInstanceIdentifier, (this.businessProcessInstanceIdentifier!= null));
        }
        {
            XMLGregorianCalendar theRequestingDocumentCreationDateTime;
            theRequestingDocumentCreationDateTime = this.getRequestingDocumentCreationDateTime();
            strategy.appendField(locator, this, "requestingDocumentCreationDateTime", buffer, theRequestingDocumentCreationDateTime, (this.requestingDocumentCreationDateTime!= null));
        }
        {
            String theRequestingDocumentInstanceIdentifier;
            theRequestingDocumentInstanceIdentifier = this.getRequestingDocumentInstanceIdentifier();
            strategy.appendField(locator, this, "requestingDocumentInstanceIdentifier", buffer, theRequestingDocumentInstanceIdentifier, (this.requestingDocumentInstanceIdentifier!= null));
        }
        {
            XMLGregorianCalendar theResponseDateTime;
            theResponseDateTime = this.getResponseDateTime();
            strategy.appendField(locator, this, "responseDateTime", buffer, theResponseDateTime, (this.responseDateTime!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
