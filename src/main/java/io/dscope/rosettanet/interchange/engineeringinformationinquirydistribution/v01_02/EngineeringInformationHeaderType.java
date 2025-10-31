
package io.dscope.rosettanet.interchange.engineeringinformationinquirydistribution.v01_02;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.design.codelist.messagefunction.v01_00.MessageFunction;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_06.PurchaseOrderStatusType;
import io.dscope.rosettanet.universal.contactinformation.v01_03.ContactInformationType;
import io.dscope.rosettanet.universal.document.v01_10.BusinessDocumentReference;
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
 * <p>Java class for EngineeringInformationHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EngineeringInformationHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.10}BusinessDocumentReference" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedReplyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:MessageFunction:xsd:codelist:01.00}MessageFunction" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MessageReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Requester" type="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03}ContactInformationType"/&gt;
 *         &lt;element name="RequestPurpose" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Responder" type="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03}ContactInformationType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06}PurchaseOrderStatusType"/&gt;
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
@XmlType(name = "EngineeringInformationHeaderType", propOrder = {
    "businessDocumentReference",
    "description",
    "expectedReplyDate",
    "messageFunction",
    "messageReason",
    "requestDate",
    "requester",
    "requestPurpose",
    "responder",
    "status"
})
public class EngineeringInformationHeaderType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.10", type = BusinessDocumentReference.class, required = false)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElement(name = "Description")
    protected List<String> description;
    @XmlElement(name = "ExpectedReplyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedReplyDate;
    @XmlElementRef(name = "MessageFunction", namespace = "urn:rosettanet:specification:domain:Design:MessageFunction:xsd:codelist:01.00", type = MessageFunction.class)
    protected List<MessageFunction> messageFunction;
    @XmlElement(name = "MessageReason", required = true)
    protected String messageReason;
    @XmlElement(name = "RequestDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(name = "Requester", required = true)
    protected ContactInformationType requester;
    @XmlElement(name = "RequestPurpose")
    protected List<String> requestPurpose;
    @XmlElement(name = "Responder")
    protected ContactInformationType responder;
    @XmlElement(name = "Status", required = true)
    protected PurchaseOrderStatusType status;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public BusinessDocumentReference getBusinessDocumentReference() {
        return businessDocumentReference;
    }

    /**
     * Sets the value of the businessDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public void setBusinessDocumentReference(BusinessDocumentReference value) {
        this.businessDocumentReference = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    /**
     * Gets the value of the expectedReplyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedReplyDate() {
        return expectedReplyDate;
    }

    /**
     * Sets the value of the expectedReplyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedReplyDate(XMLGregorianCalendar value) {
        this.expectedReplyDate = value;
    }

    /**
     * Gets the value of the messageFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageFunction }
     * 
     * 
     */
    public List<MessageFunction> getMessageFunction() {
        if (messageFunction == null) {
            messageFunction = new ArrayList<MessageFunction>();
        }
        return this.messageFunction;
    }

    /**
     * Gets the value of the messageReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageReason() {
        return messageReason;
    }

    /**
     * Sets the value of the messageReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageReason(String value) {
        this.messageReason = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setRequester(ContactInformationType value) {
        this.requester = value;
    }

    /**
     * Gets the value of the requestPurpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestPurpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestPurpose() {
        if (requestPurpose == null) {
            requestPurpose = new ArrayList<String>();
        }
        return this.requestPurpose;
    }

    /**
     * Gets the value of the responder property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getResponder() {
        return responder;
    }

    /**
     * Sets the value of the responder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setResponder(ContactInformationType value) {
        this.responder = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public PurchaseOrderStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public void setStatus(PurchaseOrderStatusType value) {
        this.status = value;
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
        final EngineeringInformationHeaderType that = ((EngineeringInformationHeaderType) object);
        {
            BusinessDocumentReference lhsBusinessDocumentReference;
            lhsBusinessDocumentReference = this.getBusinessDocumentReference();
            BusinessDocumentReference rhsBusinessDocumentReference;
            rhsBusinessDocumentReference = that.getBusinessDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentReference", lhsBusinessDocumentReference), LocatorUtils.property(thatLocator, "businessDocumentReference", rhsBusinessDocumentReference), lhsBusinessDocumentReference, rhsBusinessDocumentReference, (this.businessDocumentReference!= null), (that.businessDocumentReference!= null))) {
                return false;
            }
        }
        {
            List<String> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<String> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsExpectedReplyDate;
            lhsExpectedReplyDate = this.getExpectedReplyDate();
            XMLGregorianCalendar rhsExpectedReplyDate;
            rhsExpectedReplyDate = that.getExpectedReplyDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedReplyDate", lhsExpectedReplyDate), LocatorUtils.property(thatLocator, "expectedReplyDate", rhsExpectedReplyDate), lhsExpectedReplyDate, rhsExpectedReplyDate, (this.expectedReplyDate!= null), (that.expectedReplyDate!= null))) {
                return false;
            }
        }
        {
            List<MessageFunction> lhsMessageFunction;
            lhsMessageFunction = (((this.messageFunction!= null)&&(!this.messageFunction.isEmpty()))?this.getMessageFunction():null);
            List<MessageFunction> rhsMessageFunction;
            rhsMessageFunction = (((that.messageFunction!= null)&&(!that.messageFunction.isEmpty()))?that.getMessageFunction():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageFunction", lhsMessageFunction), LocatorUtils.property(thatLocator, "messageFunction", rhsMessageFunction), lhsMessageFunction, rhsMessageFunction, ((this.messageFunction!= null)&&(!this.messageFunction.isEmpty())), ((that.messageFunction!= null)&&(!that.messageFunction.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsMessageReason;
            lhsMessageReason = this.getMessageReason();
            String rhsMessageReason;
            rhsMessageReason = that.getMessageReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageReason", lhsMessageReason), LocatorUtils.property(thatLocator, "messageReason", rhsMessageReason), lhsMessageReason, rhsMessageReason, (this.messageReason!= null), (that.messageReason!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsRequestDate;
            lhsRequestDate = this.getRequestDate();
            XMLGregorianCalendar rhsRequestDate;
            rhsRequestDate = that.getRequestDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestDate", lhsRequestDate), LocatorUtils.property(thatLocator, "requestDate", rhsRequestDate), lhsRequestDate, rhsRequestDate, (this.requestDate!= null), (that.requestDate!= null))) {
                return false;
            }
        }
        {
            ContactInformationType lhsRequester;
            lhsRequester = this.getRequester();
            ContactInformationType rhsRequester;
            rhsRequester = that.getRequester();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requester", lhsRequester), LocatorUtils.property(thatLocator, "requester", rhsRequester), lhsRequester, rhsRequester, (this.requester!= null), (that.requester!= null))) {
                return false;
            }
        }
        {
            List<String> lhsRequestPurpose;
            lhsRequestPurpose = (((this.requestPurpose!= null)&&(!this.requestPurpose.isEmpty()))?this.getRequestPurpose():null);
            List<String> rhsRequestPurpose;
            rhsRequestPurpose = (((that.requestPurpose!= null)&&(!that.requestPurpose.isEmpty()))?that.getRequestPurpose():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestPurpose", lhsRequestPurpose), LocatorUtils.property(thatLocator, "requestPurpose", rhsRequestPurpose), lhsRequestPurpose, rhsRequestPurpose, ((this.requestPurpose!= null)&&(!this.requestPurpose.isEmpty())), ((that.requestPurpose!= null)&&(!that.requestPurpose.isEmpty())))) {
                return false;
            }
        }
        {
            ContactInformationType lhsResponder;
            lhsResponder = this.getResponder();
            ContactInformationType rhsResponder;
            rhsResponder = that.getResponder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responder", lhsResponder), LocatorUtils.property(thatLocator, "responder", rhsResponder), lhsResponder, rhsResponder, (this.responder!= null), (that.responder!= null))) {
                return false;
            }
        }
        {
            PurchaseOrderStatusType lhsStatus;
            lhsStatus = this.getStatus();
            PurchaseOrderStatusType rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
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
            BusinessDocumentReference theBusinessDocumentReference;
            theBusinessDocumentReference = this.getBusinessDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, (this.businessDocumentReference!= null));
        }
        {
            List<String> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            XMLGregorianCalendar theExpectedReplyDate;
            theExpectedReplyDate = this.getExpectedReplyDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedReplyDate", theExpectedReplyDate), currentHashCode, theExpectedReplyDate, (this.expectedReplyDate!= null));
        }
        {
            List<MessageFunction> theMessageFunction;
            theMessageFunction = (((this.messageFunction!= null)&&(!this.messageFunction.isEmpty()))?this.getMessageFunction():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageFunction", theMessageFunction), currentHashCode, theMessageFunction, ((this.messageFunction!= null)&&(!this.messageFunction.isEmpty())));
        }
        {
            String theMessageReason;
            theMessageReason = this.getMessageReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageReason", theMessageReason), currentHashCode, theMessageReason, (this.messageReason!= null));
        }
        {
            XMLGregorianCalendar theRequestDate;
            theRequestDate = this.getRequestDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestDate", theRequestDate), currentHashCode, theRequestDate, (this.requestDate!= null));
        }
        {
            ContactInformationType theRequester;
            theRequester = this.getRequester();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requester", theRequester), currentHashCode, theRequester, (this.requester!= null));
        }
        {
            List<String> theRequestPurpose;
            theRequestPurpose = (((this.requestPurpose!= null)&&(!this.requestPurpose.isEmpty()))?this.getRequestPurpose():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestPurpose", theRequestPurpose), currentHashCode, theRequestPurpose, ((this.requestPurpose!= null)&&(!this.requestPurpose.isEmpty())));
        }
        {
            ContactInformationType theResponder;
            theResponder = this.getResponder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responder", theResponder), currentHashCode, theResponder, (this.responder!= null));
        }
        {
            PurchaseOrderStatusType theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
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
            BusinessDocumentReference theBusinessDocumentReference;
            theBusinessDocumentReference = this.getBusinessDocumentReference();
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, (this.businessDocumentReference!= null));
        }
        {
            List<String> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            XMLGregorianCalendar theExpectedReplyDate;
            theExpectedReplyDate = this.getExpectedReplyDate();
            strategy.appendField(locator, this, "expectedReplyDate", buffer, theExpectedReplyDate, (this.expectedReplyDate!= null));
        }
        {
            List<MessageFunction> theMessageFunction;
            theMessageFunction = (((this.messageFunction!= null)&&(!this.messageFunction.isEmpty()))?this.getMessageFunction():null);
            strategy.appendField(locator, this, "messageFunction", buffer, theMessageFunction, ((this.messageFunction!= null)&&(!this.messageFunction.isEmpty())));
        }
        {
            String theMessageReason;
            theMessageReason = this.getMessageReason();
            strategy.appendField(locator, this, "messageReason", buffer, theMessageReason, (this.messageReason!= null));
        }
        {
            XMLGregorianCalendar theRequestDate;
            theRequestDate = this.getRequestDate();
            strategy.appendField(locator, this, "requestDate", buffer, theRequestDate, (this.requestDate!= null));
        }
        {
            ContactInformationType theRequester;
            theRequester = this.getRequester();
            strategy.appendField(locator, this, "requester", buffer, theRequester, (this.requester!= null));
        }
        {
            List<String> theRequestPurpose;
            theRequestPurpose = (((this.requestPurpose!= null)&&(!this.requestPurpose.isEmpty()))?this.getRequestPurpose():null);
            strategy.appendField(locator, this, "requestPurpose", buffer, theRequestPurpose, ((this.requestPurpose!= null)&&(!this.requestPurpose.isEmpty())));
        }
        {
            ContactInformationType theResponder;
            theResponder = this.getResponder();
            strategy.appendField(locator, this, "responder", buffer, theResponder, (this.responder!= null));
        }
        {
            PurchaseOrderStatusType theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus, (this.status!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
