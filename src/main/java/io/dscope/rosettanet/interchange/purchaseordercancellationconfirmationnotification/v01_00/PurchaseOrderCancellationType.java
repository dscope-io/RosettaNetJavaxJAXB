
package io.dscope.rosettanet.interchange.purchaseordercancellationconfirmationnotification.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseordercancellationreason.v01_03.PurchaseOrderCancellationReason;
import io.dscope.rosettanet.interchange.codelist.response.v01_01.ResponseType;
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
 * <p>Java class for PurchaseOrderCancellationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderCancellationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderCancellationReason:xsd:codelist:01.03}PurchaseOrderCancellationReason" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderCancellationResponse" type="{urn:rosettanet:specification:interchange:Response:xsd:codelist:01.01}ResponseType"/&gt;
 *         &lt;element name="PurchaseOrderIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType"/&gt;
 *         &lt;element name="RequestingDocument" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PurchaseOrderCancellationType", propOrder = {
    "purchaseOrderCancellationReason",
    "purchaseOrderCancellationResponse",
    "purchaseOrderIdentifier",
    "requestingDocument",
    "revisionNumber"
})
public class PurchaseOrderCancellationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "PurchaseOrderCancellationReason", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderCancellationReason:xsd:codelist:01.03", type = PurchaseOrderCancellationReason.class, required = false)
    protected PurchaseOrderCancellationReason purchaseOrderCancellationReason;
    @XmlElement(name = "PurchaseOrderCancellationResponse", required = true)
    protected ResponseType purchaseOrderCancellationResponse;
    @XmlElement(name = "PurchaseOrderIdentifier", required = true)
    protected BusinessDocumentReferenceType purchaseOrderIdentifier;
    @XmlElement(name = "RequestingDocument", required = true)
    protected BusinessDocumentReferenceType requestingDocument;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the purchaseOrderCancellationReason property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderCancellationReason }
     *     
     */
    public PurchaseOrderCancellationReason getPurchaseOrderCancellationReason() {
        return purchaseOrderCancellationReason;
    }

    /**
     * Sets the value of the purchaseOrderCancellationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderCancellationReason }
     *     
     */
    public void setPurchaseOrderCancellationReason(PurchaseOrderCancellationReason value) {
        this.purchaseOrderCancellationReason = value;
    }

    /**
     * Gets the value of the purchaseOrderCancellationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getPurchaseOrderCancellationResponse() {
        return purchaseOrderCancellationResponse;
    }

    /**
     * Sets the value of the purchaseOrderCancellationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setPurchaseOrderCancellationResponse(ResponseType value) {
        this.purchaseOrderCancellationResponse = value;
    }

    /**
     * Gets the value of the purchaseOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPurchaseOrderIdentifier() {
        return purchaseOrderIdentifier;
    }

    /**
     * Sets the value of the purchaseOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPurchaseOrderIdentifier(BusinessDocumentReferenceType value) {
        this.purchaseOrderIdentifier = value;
    }

    /**
     * Gets the value of the requestingDocument property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getRequestingDocument() {
        return requestingDocument;
    }

    /**
     * Sets the value of the requestingDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setRequestingDocument(BusinessDocumentReferenceType value) {
        this.requestingDocument = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
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
        final PurchaseOrderCancellationType that = ((PurchaseOrderCancellationType) object);
        {
            PurchaseOrderCancellationReason lhsPurchaseOrderCancellationReason;
            lhsPurchaseOrderCancellationReason = this.getPurchaseOrderCancellationReason();
            PurchaseOrderCancellationReason rhsPurchaseOrderCancellationReason;
            rhsPurchaseOrderCancellationReason = that.getPurchaseOrderCancellationReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderCancellationReason", lhsPurchaseOrderCancellationReason), LocatorUtils.property(thatLocator, "purchaseOrderCancellationReason", rhsPurchaseOrderCancellationReason), lhsPurchaseOrderCancellationReason, rhsPurchaseOrderCancellationReason, (this.purchaseOrderCancellationReason!= null), (that.purchaseOrderCancellationReason!= null))) {
                return false;
            }
        }
        {
            ResponseType lhsPurchaseOrderCancellationResponse;
            lhsPurchaseOrderCancellationResponse = this.getPurchaseOrderCancellationResponse();
            ResponseType rhsPurchaseOrderCancellationResponse;
            rhsPurchaseOrderCancellationResponse = that.getPurchaseOrderCancellationResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderCancellationResponse", lhsPurchaseOrderCancellationResponse), LocatorUtils.property(thatLocator, "purchaseOrderCancellationResponse", rhsPurchaseOrderCancellationResponse), lhsPurchaseOrderCancellationResponse, rhsPurchaseOrderCancellationResponse, (this.purchaseOrderCancellationResponse!= null), (that.purchaseOrderCancellationResponse!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsPurchaseOrderIdentifier;
            lhsPurchaseOrderIdentifier = this.getPurchaseOrderIdentifier();
            BusinessDocumentReferenceType rhsPurchaseOrderIdentifier;
            rhsPurchaseOrderIdentifier = that.getPurchaseOrderIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseOrderIdentifier", lhsPurchaseOrderIdentifier), LocatorUtils.property(thatLocator, "purchaseOrderIdentifier", rhsPurchaseOrderIdentifier), lhsPurchaseOrderIdentifier, rhsPurchaseOrderIdentifier, (this.purchaseOrderIdentifier!= null), (that.purchaseOrderIdentifier!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsRequestingDocument;
            lhsRequestingDocument = this.getRequestingDocument();
            BusinessDocumentReferenceType rhsRequestingDocument;
            rhsRequestingDocument = that.getRequestingDocument();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestingDocument", lhsRequestingDocument), LocatorUtils.property(thatLocator, "requestingDocument", rhsRequestingDocument), lhsRequestingDocument, rhsRequestingDocument, (this.requestingDocument!= null), (that.requestingDocument!= null))) {
                return false;
            }
        }
        {
            String lhsRevisionNumber;
            lhsRevisionNumber = this.getRevisionNumber();
            String rhsRevisionNumber;
            rhsRevisionNumber = that.getRevisionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revisionNumber", lhsRevisionNumber), LocatorUtils.property(thatLocator, "revisionNumber", rhsRevisionNumber), lhsRevisionNumber, rhsRevisionNumber, (this.revisionNumber!= null), (that.revisionNumber!= null))) {
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
            PurchaseOrderCancellationReason thePurchaseOrderCancellationReason;
            thePurchaseOrderCancellationReason = this.getPurchaseOrderCancellationReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderCancellationReason", thePurchaseOrderCancellationReason), currentHashCode, thePurchaseOrderCancellationReason, (this.purchaseOrderCancellationReason!= null));
        }
        {
            ResponseType thePurchaseOrderCancellationResponse;
            thePurchaseOrderCancellationResponse = this.getPurchaseOrderCancellationResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderCancellationResponse", thePurchaseOrderCancellationResponse), currentHashCode, thePurchaseOrderCancellationResponse, (this.purchaseOrderCancellationResponse!= null));
        }
        {
            BusinessDocumentReferenceType thePurchaseOrderIdentifier;
            thePurchaseOrderIdentifier = this.getPurchaseOrderIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseOrderIdentifier", thePurchaseOrderIdentifier), currentHashCode, thePurchaseOrderIdentifier, (this.purchaseOrderIdentifier!= null));
        }
        {
            BusinessDocumentReferenceType theRequestingDocument;
            theRequestingDocument = this.getRequestingDocument();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestingDocument", theRequestingDocument), currentHashCode, theRequestingDocument, (this.requestingDocument!= null));
        }
        {
            String theRevisionNumber;
            theRevisionNumber = this.getRevisionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revisionNumber", theRevisionNumber), currentHashCode, theRevisionNumber, (this.revisionNumber!= null));
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
            PurchaseOrderCancellationReason thePurchaseOrderCancellationReason;
            thePurchaseOrderCancellationReason = this.getPurchaseOrderCancellationReason();
            strategy.appendField(locator, this, "purchaseOrderCancellationReason", buffer, thePurchaseOrderCancellationReason, (this.purchaseOrderCancellationReason!= null));
        }
        {
            ResponseType thePurchaseOrderCancellationResponse;
            thePurchaseOrderCancellationResponse = this.getPurchaseOrderCancellationResponse();
            strategy.appendField(locator, this, "purchaseOrderCancellationResponse", buffer, thePurchaseOrderCancellationResponse, (this.purchaseOrderCancellationResponse!= null));
        }
        {
            BusinessDocumentReferenceType thePurchaseOrderIdentifier;
            thePurchaseOrderIdentifier = this.getPurchaseOrderIdentifier();
            strategy.appendField(locator, this, "purchaseOrderIdentifier", buffer, thePurchaseOrderIdentifier, (this.purchaseOrderIdentifier!= null));
        }
        {
            BusinessDocumentReferenceType theRequestingDocument;
            theRequestingDocument = this.getRequestingDocument();
            strategy.appendField(locator, this, "requestingDocument", buffer, theRequestingDocument, (this.requestingDocument!= null));
        }
        {
            String theRevisionNumber;
            theRevisionNumber = this.getRevisionNumber();
            strategy.appendField(locator, this, "revisionNumber", buffer, theRevisionNumber, (this.revisionNumber!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
