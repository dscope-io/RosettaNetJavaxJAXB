
package io.dscope.rosettanet.interchange.invoicenotification.v01_07;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_01.InvoiceAmount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_01.PrePaymentDetail;
import io.dscope.rosettanet.domain.procurement.procurement.v02_01.SpecifiedBusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_05.PartnerDescriptionType;
import io.dscope.rosettanet.universal.partneridentification.v01_05.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for InvoiceLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01}InvoiceAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderStatus" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.07}OrderStatusType"/&gt;
 *         &lt;element name="PackingSlipIdentifier" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01}SpecifiedBusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01}PrePaymentDetail" minOccurs="0"/&gt;
 *         &lt;element name="PreTaxAmount" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.07}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.05}PartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItemAmount" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.07}AmountType"/&gt;
 *         &lt;element name="TransportedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.05}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="TransportedByAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "InvoiceLineItemType", propOrder = {
    "comments",
    "invoiceAmount",
    "lineNumber",
    "orderStatus",
    "packingSlipIdentifier",
    "prePaymentDetail",
    "preTaxAmount",
    "shipTo",
    "shipToAccount",
    "totalLineItemAmount",
    "transportedBy",
    "transportedByAccount"
})
public class InvoiceLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "InvoiceAmount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01", type = InvoiceAmount.class, required = false)
    protected List<InvoiceAmount> invoiceAmount;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "OrderStatus", required = true)
    protected OrderStatusType orderStatus;
    @XmlElement(name = "PackingSlipIdentifier")
    protected SpecifiedBusinessDocumentReferenceType packingSlipIdentifier;
    @XmlElementRef(name = "PrePaymentDetail", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01", type = PrePaymentDetail.class, required = false)
    protected PrePaymentDetail prePaymentDetail;
    @XmlElement(name = "PreTaxAmount")
    protected AmountType preTaxAmount;
    @XmlElement(name = "ShipTo")
    protected PartnerDescriptionType shipTo;
    @XmlElement(name = "ShipToAccount")
    protected List<String> shipToAccount;
    @XmlElement(name = "TotalLineItemAmount", required = true)
    protected AmountType totalLineItemAmount;
    @XmlElement(name = "TransportedBy")
    protected SpecifiedPartnerDescriptionType transportedBy;
    @XmlElement(name = "TransportedByAccount")
    protected List<String> transportedByAccount;
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
     * Gets the value of the invoiceAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceAmount }
     * 
     * 
     */
    public List<InvoiceAmount> getInvoiceAmount() {
        if (invoiceAmount == null) {
            invoiceAmount = new ArrayList<InvoiceAmount>();
        }
        return this.invoiceAmount;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusType }
     *     
     */
    public OrderStatusType getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusType }
     *     
     */
    public void setOrderStatus(OrderStatusType value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the packingSlipIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public SpecifiedBusinessDocumentReferenceType getPackingSlipIdentifier() {
        return packingSlipIdentifier;
    }

    /**
     * Sets the value of the packingSlipIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public void setPackingSlipIdentifier(SpecifiedBusinessDocumentReferenceType value) {
        this.packingSlipIdentifier = value;
    }

    /**
     * Gets the value of the prePaymentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrePaymentDetail }
     *     
     */
    public PrePaymentDetail getPrePaymentDetail() {
        return prePaymentDetail;
    }

    /**
     * Sets the value of the prePaymentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePaymentDetail }
     *     
     */
    public void setPrePaymentDetail(PrePaymentDetail value) {
        this.prePaymentDetail = value;
    }

    /**
     * Gets the value of the preTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPreTaxAmount() {
        return preTaxAmount;
    }

    /**
     * Sets the value of the preTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPreTaxAmount(AmountType value) {
        this.preTaxAmount = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public PartnerDescriptionType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public void setShipTo(PartnerDescriptionType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the shipToAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getShipToAccount() {
        if (shipToAccount == null) {
            shipToAccount = new ArrayList<String>();
        }
        return this.shipToAccount;
    }

    /**
     * Gets the value of the totalLineItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLineItemAmount() {
        return totalLineItemAmount;
    }

    /**
     * Sets the value of the totalLineItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLineItemAmount(AmountType value) {
        this.totalLineItemAmount = value;
    }

    /**
     * Gets the value of the transportedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getTransportedBy() {
        return transportedBy;
    }

    /**
     * Sets the value of the transportedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setTransportedBy(SpecifiedPartnerDescriptionType value) {
        this.transportedBy = value;
    }

    /**
     * Gets the value of the transportedByAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportedByAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportedByAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransportedByAccount() {
        if (transportedByAccount == null) {
            transportedByAccount = new ArrayList<String>();
        }
        return this.transportedByAccount;
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
        final InvoiceLineItemType that = ((InvoiceLineItemType) object);
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
            List<InvoiceAmount> lhsInvoiceAmount;
            lhsInvoiceAmount = (((this.invoiceAmount!= null)&&(!this.invoiceAmount.isEmpty()))?this.getInvoiceAmount():null);
            List<InvoiceAmount> rhsInvoiceAmount;
            rhsInvoiceAmount = (((that.invoiceAmount!= null)&&(!that.invoiceAmount.isEmpty()))?that.getInvoiceAmount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoiceAmount", lhsInvoiceAmount), LocatorUtils.property(thatLocator, "invoiceAmount", rhsInvoiceAmount), lhsInvoiceAmount, rhsInvoiceAmount, ((this.invoiceAmount!= null)&&(!this.invoiceAmount.isEmpty())), ((that.invoiceAmount!= null)&&(!that.invoiceAmount.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsLineNumber;
            lhsLineNumber = this.getLineNumber();
            String rhsLineNumber;
            rhsLineNumber = that.getLineNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineNumber", lhsLineNumber), LocatorUtils.property(thatLocator, "lineNumber", rhsLineNumber), lhsLineNumber, rhsLineNumber, (this.lineNumber!= null), (that.lineNumber!= null))) {
                return false;
            }
        }
        {
            OrderStatusType lhsOrderStatus;
            lhsOrderStatus = this.getOrderStatus();
            OrderStatusType rhsOrderStatus;
            rhsOrderStatus = that.getOrderStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderStatus", lhsOrderStatus), LocatorUtils.property(thatLocator, "orderStatus", rhsOrderStatus), lhsOrderStatus, rhsOrderStatus, (this.orderStatus!= null), (that.orderStatus!= null))) {
                return false;
            }
        }
        {
            SpecifiedBusinessDocumentReferenceType lhsPackingSlipIdentifier;
            lhsPackingSlipIdentifier = this.getPackingSlipIdentifier();
            SpecifiedBusinessDocumentReferenceType rhsPackingSlipIdentifier;
            rhsPackingSlipIdentifier = that.getPackingSlipIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packingSlipIdentifier", lhsPackingSlipIdentifier), LocatorUtils.property(thatLocator, "packingSlipIdentifier", rhsPackingSlipIdentifier), lhsPackingSlipIdentifier, rhsPackingSlipIdentifier, (this.packingSlipIdentifier!= null), (that.packingSlipIdentifier!= null))) {
                return false;
            }
        }
        {
            PrePaymentDetail lhsPrePaymentDetail;
            lhsPrePaymentDetail = this.getPrePaymentDetail();
            PrePaymentDetail rhsPrePaymentDetail;
            rhsPrePaymentDetail = that.getPrePaymentDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prePaymentDetail", lhsPrePaymentDetail), LocatorUtils.property(thatLocator, "prePaymentDetail", rhsPrePaymentDetail), lhsPrePaymentDetail, rhsPrePaymentDetail, (this.prePaymentDetail!= null), (that.prePaymentDetail!= null))) {
                return false;
            }
        }
        {
            AmountType lhsPreTaxAmount;
            lhsPreTaxAmount = this.getPreTaxAmount();
            AmountType rhsPreTaxAmount;
            rhsPreTaxAmount = that.getPreTaxAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preTaxAmount", lhsPreTaxAmount), LocatorUtils.property(thatLocator, "preTaxAmount", rhsPreTaxAmount), lhsPreTaxAmount, rhsPreTaxAmount, (this.preTaxAmount!= null), (that.preTaxAmount!= null))) {
                return false;
            }
        }
        {
            PartnerDescriptionType lhsShipTo;
            lhsShipTo = this.getShipTo();
            PartnerDescriptionType rhsShipTo;
            rhsShipTo = that.getShipTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipTo", lhsShipTo), LocatorUtils.property(thatLocator, "shipTo", rhsShipTo), lhsShipTo, rhsShipTo, (this.shipTo!= null), (that.shipTo!= null))) {
                return false;
            }
        }
        {
            List<String> lhsShipToAccount;
            lhsShipToAccount = (((this.shipToAccount!= null)&&(!this.shipToAccount.isEmpty()))?this.getShipToAccount():null);
            List<String> rhsShipToAccount;
            rhsShipToAccount = (((that.shipToAccount!= null)&&(!that.shipToAccount.isEmpty()))?that.getShipToAccount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipToAccount", lhsShipToAccount), LocatorUtils.property(thatLocator, "shipToAccount", rhsShipToAccount), lhsShipToAccount, rhsShipToAccount, ((this.shipToAccount!= null)&&(!this.shipToAccount.isEmpty())), ((that.shipToAccount!= null)&&(!that.shipToAccount.isEmpty())))) {
                return false;
            }
        }
        {
            AmountType lhsTotalLineItemAmount;
            lhsTotalLineItemAmount = this.getTotalLineItemAmount();
            AmountType rhsTotalLineItemAmount;
            rhsTotalLineItemAmount = that.getTotalLineItemAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalLineItemAmount", lhsTotalLineItemAmount), LocatorUtils.property(thatLocator, "totalLineItemAmount", rhsTotalLineItemAmount), lhsTotalLineItemAmount, rhsTotalLineItemAmount, (this.totalLineItemAmount!= null), (that.totalLineItemAmount!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsTransportedBy;
            lhsTransportedBy = this.getTransportedBy();
            SpecifiedPartnerDescriptionType rhsTransportedBy;
            rhsTransportedBy = that.getTransportedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportedBy", lhsTransportedBy), LocatorUtils.property(thatLocator, "transportedBy", rhsTransportedBy), lhsTransportedBy, rhsTransportedBy, (this.transportedBy!= null), (that.transportedBy!= null))) {
                return false;
            }
        }
        {
            List<String> lhsTransportedByAccount;
            lhsTransportedByAccount = (((this.transportedByAccount!= null)&&(!this.transportedByAccount.isEmpty()))?this.getTransportedByAccount():null);
            List<String> rhsTransportedByAccount;
            rhsTransportedByAccount = (((that.transportedByAccount!= null)&&(!that.transportedByAccount.isEmpty()))?that.getTransportedByAccount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportedByAccount", lhsTransportedByAccount), LocatorUtils.property(thatLocator, "transportedByAccount", rhsTransportedByAccount), lhsTransportedByAccount, rhsTransportedByAccount, ((this.transportedByAccount!= null)&&(!this.transportedByAccount.isEmpty())), ((that.transportedByAccount!= null)&&(!that.transportedByAccount.isEmpty())))) {
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
            List<InvoiceAmount> theInvoiceAmount;
            theInvoiceAmount = (((this.invoiceAmount!= null)&&(!this.invoiceAmount.isEmpty()))?this.getInvoiceAmount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoiceAmount", theInvoiceAmount), currentHashCode, theInvoiceAmount, ((this.invoiceAmount!= null)&&(!this.invoiceAmount.isEmpty())));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            OrderStatusType theOrderStatus;
            theOrderStatus = this.getOrderStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderStatus", theOrderStatus), currentHashCode, theOrderStatus, (this.orderStatus!= null));
        }
        {
            SpecifiedBusinessDocumentReferenceType thePackingSlipIdentifier;
            thePackingSlipIdentifier = this.getPackingSlipIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packingSlipIdentifier", thePackingSlipIdentifier), currentHashCode, thePackingSlipIdentifier, (this.packingSlipIdentifier!= null));
        }
        {
            PrePaymentDetail thePrePaymentDetail;
            thePrePaymentDetail = this.getPrePaymentDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prePaymentDetail", thePrePaymentDetail), currentHashCode, thePrePaymentDetail, (this.prePaymentDetail!= null));
        }
        {
            AmountType thePreTaxAmount;
            thePreTaxAmount = this.getPreTaxAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preTaxAmount", thePreTaxAmount), currentHashCode, thePreTaxAmount, (this.preTaxAmount!= null));
        }
        {
            PartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipTo", theShipTo), currentHashCode, theShipTo, (this.shipTo!= null));
        }
        {
            List<String> theShipToAccount;
            theShipToAccount = (((this.shipToAccount!= null)&&(!this.shipToAccount.isEmpty()))?this.getShipToAccount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipToAccount", theShipToAccount), currentHashCode, theShipToAccount, ((this.shipToAccount!= null)&&(!this.shipToAccount.isEmpty())));
        }
        {
            AmountType theTotalLineItemAmount;
            theTotalLineItemAmount = this.getTotalLineItemAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalLineItemAmount", theTotalLineItemAmount), currentHashCode, theTotalLineItemAmount, (this.totalLineItemAmount!= null));
        }
        {
            SpecifiedPartnerDescriptionType theTransportedBy;
            theTransportedBy = this.getTransportedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportedBy", theTransportedBy), currentHashCode, theTransportedBy, (this.transportedBy!= null));
        }
        {
            List<String> theTransportedByAccount;
            theTransportedByAccount = (((this.transportedByAccount!= null)&&(!this.transportedByAccount.isEmpty()))?this.getTransportedByAccount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportedByAccount", theTransportedByAccount), currentHashCode, theTransportedByAccount, ((this.transportedByAccount!= null)&&(!this.transportedByAccount.isEmpty())));
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
            List<InvoiceAmount> theInvoiceAmount;
            theInvoiceAmount = (((this.invoiceAmount!= null)&&(!this.invoiceAmount.isEmpty()))?this.getInvoiceAmount():null);
            strategy.appendField(locator, this, "invoiceAmount", buffer, theInvoiceAmount, ((this.invoiceAmount!= null)&&(!this.invoiceAmount.isEmpty())));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            OrderStatusType theOrderStatus;
            theOrderStatus = this.getOrderStatus();
            strategy.appendField(locator, this, "orderStatus", buffer, theOrderStatus, (this.orderStatus!= null));
        }
        {
            SpecifiedBusinessDocumentReferenceType thePackingSlipIdentifier;
            thePackingSlipIdentifier = this.getPackingSlipIdentifier();
            strategy.appendField(locator, this, "packingSlipIdentifier", buffer, thePackingSlipIdentifier, (this.packingSlipIdentifier!= null));
        }
        {
            PrePaymentDetail thePrePaymentDetail;
            thePrePaymentDetail = this.getPrePaymentDetail();
            strategy.appendField(locator, this, "prePaymentDetail", buffer, thePrePaymentDetail, (this.prePaymentDetail!= null));
        }
        {
            AmountType thePreTaxAmount;
            thePreTaxAmount = this.getPreTaxAmount();
            strategy.appendField(locator, this, "preTaxAmount", buffer, thePreTaxAmount, (this.preTaxAmount!= null));
        }
        {
            PartnerDescriptionType theShipTo;
            theShipTo = this.getShipTo();
            strategy.appendField(locator, this, "shipTo", buffer, theShipTo, (this.shipTo!= null));
        }
        {
            List<String> theShipToAccount;
            theShipToAccount = (((this.shipToAccount!= null)&&(!this.shipToAccount.isEmpty()))?this.getShipToAccount():null);
            strategy.appendField(locator, this, "shipToAccount", buffer, theShipToAccount, ((this.shipToAccount!= null)&&(!this.shipToAccount.isEmpty())));
        }
        {
            AmountType theTotalLineItemAmount;
            theTotalLineItemAmount = this.getTotalLineItemAmount();
            strategy.appendField(locator, this, "totalLineItemAmount", buffer, theTotalLineItemAmount, (this.totalLineItemAmount!= null));
        }
        {
            SpecifiedPartnerDescriptionType theTransportedBy;
            theTransportedBy = this.getTransportedBy();
            strategy.appendField(locator, this, "transportedBy", buffer, theTransportedBy, (this.transportedBy!= null));
        }
        {
            List<String> theTransportedByAccount;
            theTransportedByAccount = (((this.transportedByAccount!= null)&&(!this.transportedByAccount.isEmpty()))?this.getTransportedByAccount():null);
            strategy.appendField(locator, this, "transportedByAccount", buffer, theTransportedByAccount, ((this.transportedByAccount!= null)&&(!this.transportedByAccount.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
