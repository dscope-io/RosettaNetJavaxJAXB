
package io.dscope.rosettanet.interchange.serviceentitlementquery.v01_01;

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
import io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02.ServiceDeliveryMethodType;
import io.dscope.rosettanet.domain.service.codelist.warrantyprogram.v01_02.WarrantyProgram;
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
 * <p>Java class for EventInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FailureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDeliveryMethod" type="{urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02}ServiceDeliveryMethodType" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:WarrantyProgram:xsd:codelist:01.02}WarrantyProgram" minOccurs="0"/&gt;
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
@XmlType(name = "EventInformationType", propOrder = {
    "completionDate",
    "failureDate",
    "requestedDeliveryMethod",
    "startDate",
    "warrantyProgram"
})
public class EventInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CompletionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionDate;
    @XmlElement(name = "FailureDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar failureDate;
    @XmlElement(name = "RequestedDeliveryMethod")
    protected ServiceDeliveryMethodType requestedDeliveryMethod;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElementRef(name = "WarrantyProgram", namespace = "urn:rosettanet:specification:domain:Service:WarrantyProgram:xsd:codelist:01.02", type = WarrantyProgram.class, required = false)
    protected WarrantyProgram warrantyProgram;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the completionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionDate(XMLGregorianCalendar value) {
        this.completionDate = value;
    }

    /**
     * Gets the value of the failureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFailureDate() {
        return failureDate;
    }

    /**
     * Sets the value of the failureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFailureDate(XMLGregorianCalendar value) {
        this.failureDate = value;
    }

    /**
     * Gets the value of the requestedDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public ServiceDeliveryMethodType getRequestedDeliveryMethod() {
        return requestedDeliveryMethod;
    }

    /**
     * Sets the value of the requestedDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public void setRequestedDeliveryMethod(ServiceDeliveryMethodType value) {
        this.requestedDeliveryMethod = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the warrantyProgram property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyProgram }
     *     
     */
    public WarrantyProgram getWarrantyProgram() {
        return warrantyProgram;
    }

    /**
     * Sets the value of the warrantyProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyProgram }
     *     
     */
    public void setWarrantyProgram(WarrantyProgram value) {
        this.warrantyProgram = value;
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
        final EventInformationType that = ((EventInformationType) object);
        {
            XMLGregorianCalendar lhsCompletionDate;
            lhsCompletionDate = this.getCompletionDate();
            XMLGregorianCalendar rhsCompletionDate;
            rhsCompletionDate = that.getCompletionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "completionDate", lhsCompletionDate), LocatorUtils.property(thatLocator, "completionDate", rhsCompletionDate), lhsCompletionDate, rhsCompletionDate, (this.completionDate!= null), (that.completionDate!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsFailureDate;
            lhsFailureDate = this.getFailureDate();
            XMLGregorianCalendar rhsFailureDate;
            rhsFailureDate = that.getFailureDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failureDate", lhsFailureDate), LocatorUtils.property(thatLocator, "failureDate", rhsFailureDate), lhsFailureDate, rhsFailureDate, (this.failureDate!= null), (that.failureDate!= null))) {
                return false;
            }
        }
        {
            ServiceDeliveryMethodType lhsRequestedDeliveryMethod;
            lhsRequestedDeliveryMethod = this.getRequestedDeliveryMethod();
            ServiceDeliveryMethodType rhsRequestedDeliveryMethod;
            rhsRequestedDeliveryMethod = that.getRequestedDeliveryMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedDeliveryMethod", lhsRequestedDeliveryMethod), LocatorUtils.property(thatLocator, "requestedDeliveryMethod", rhsRequestedDeliveryMethod), lhsRequestedDeliveryMethod, rhsRequestedDeliveryMethod, (this.requestedDeliveryMethod!= null), (that.requestedDeliveryMethod!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsStartDate;
            lhsStartDate = this.getStartDate();
            XMLGregorianCalendar rhsStartDate;
            rhsStartDate = that.getStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate, (this.startDate!= null), (that.startDate!= null))) {
                return false;
            }
        }
        {
            WarrantyProgram lhsWarrantyProgram;
            lhsWarrantyProgram = this.getWarrantyProgram();
            WarrantyProgram rhsWarrantyProgram;
            rhsWarrantyProgram = that.getWarrantyProgram();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyProgram", lhsWarrantyProgram), LocatorUtils.property(thatLocator, "warrantyProgram", rhsWarrantyProgram), lhsWarrantyProgram, rhsWarrantyProgram, (this.warrantyProgram!= null), (that.warrantyProgram!= null))) {
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
            XMLGregorianCalendar theCompletionDate;
            theCompletionDate = this.getCompletionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "completionDate", theCompletionDate), currentHashCode, theCompletionDate, (this.completionDate!= null));
        }
        {
            XMLGregorianCalendar theFailureDate;
            theFailureDate = this.getFailureDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failureDate", theFailureDate), currentHashCode, theFailureDate, (this.failureDate!= null));
        }
        {
            ServiceDeliveryMethodType theRequestedDeliveryMethod;
            theRequestedDeliveryMethod = this.getRequestedDeliveryMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedDeliveryMethod", theRequestedDeliveryMethod), currentHashCode, theRequestedDeliveryMethod, (this.requestedDeliveryMethod!= null));
        }
        {
            XMLGregorianCalendar theStartDate;
            theStartDate = this.getStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDate", theStartDate), currentHashCode, theStartDate, (this.startDate!= null));
        }
        {
            WarrantyProgram theWarrantyProgram;
            theWarrantyProgram = this.getWarrantyProgram();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyProgram", theWarrantyProgram), currentHashCode, theWarrantyProgram, (this.warrantyProgram!= null));
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
            XMLGregorianCalendar theCompletionDate;
            theCompletionDate = this.getCompletionDate();
            strategy.appendField(locator, this, "completionDate", buffer, theCompletionDate, (this.completionDate!= null));
        }
        {
            XMLGregorianCalendar theFailureDate;
            theFailureDate = this.getFailureDate();
            strategy.appendField(locator, this, "failureDate", buffer, theFailureDate, (this.failureDate!= null));
        }
        {
            ServiceDeliveryMethodType theRequestedDeliveryMethod;
            theRequestedDeliveryMethod = this.getRequestedDeliveryMethod();
            strategy.appendField(locator, this, "requestedDeliveryMethod", buffer, theRequestedDeliveryMethod, (this.requestedDeliveryMethod!= null));
        }
        {
            XMLGregorianCalendar theStartDate;
            theStartDate = this.getStartDate();
            strategy.appendField(locator, this, "startDate", buffer, theStartDate, (this.startDate!= null));
        }
        {
            WarrantyProgram theWarrantyProgram;
            theWarrantyProgram = this.getWarrantyProgram();
            strategy.appendField(locator, this, "warrantyProgram", buffer, theWarrantyProgram, (this.warrantyProgram!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
