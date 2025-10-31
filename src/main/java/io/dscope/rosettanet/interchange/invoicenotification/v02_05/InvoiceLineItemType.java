
package io.dscope.rosettanet.interchange.invoicenotification.v02_05;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.AncillaryDates;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.FeeInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.InvoiceAmount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.PackingSlip;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.PartPayment;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.PrePaymentDetail;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}AncillaryDates" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}FeeInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}InvoiceAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderStatus" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.05}OrderStatusType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}PackingSlip" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}PartPayment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}PrePaymentDetail" minOccurs="0"/&gt;
 *         &lt;element name="PreTaxAmount" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.05}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItemAmount" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.05}AmountType"/&gt;
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
    "ancillaryDates",
    "comments",
    "feeInformation",
    "invoiceAmount",
    "lineNumber",
    "orderStatus",
    "packingSlip",
    "partnerDescription",
    "partPayment",
    "prePaymentDetail",
    "preTaxAmount",
    "shipToAccount",
    "totalLineItemAmount",
    "transportedByAccount"
})
public class InvoiceLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AncillaryDates", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = AncillaryDates.class, required = false)
    protected List<AncillaryDates> ancillaryDates;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "FeeInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = FeeInformation.class, required = false)
    protected List<FeeInformation> feeInformation;
    @XmlElementRef(name = "InvoiceAmount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = InvoiceAmount.class, required = false)
    protected List<InvoiceAmount> invoiceAmount;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "OrderStatus", required = true)
    protected OrderStatusType orderStatus;
    @XmlElementRef(name = "PackingSlip", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = PackingSlip.class, required = false)
    protected List<PackingSlip> packingSlip;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "PartPayment", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = PartPayment.class, required = false)
    protected PartPayment partPayment;
    @XmlElementRef(name = "PrePaymentDetail", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = PrePaymentDetail.class, required = false)
    protected PrePaymentDetail prePaymentDetail;
    @XmlElement(name = "PreTaxAmount")
    protected AmountType preTaxAmount;
    @XmlElement(name = "ShipToAccount")
    protected List<String> shipToAccount;
    @XmlElement(name = "TotalLineItemAmount", required = true)
    protected AmountType totalLineItemAmount;
    @XmlElement(name = "TransportedByAccount")
    protected List<String> transportedByAccount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the ancillaryDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryDates }
     * 
     * 
     */
    public List<AncillaryDates> getAncillaryDates() {
        if (ancillaryDates == null) {
            ancillaryDates = new ArrayList<AncillaryDates>();
        }
        return this.ancillaryDates;
    }

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
     * Gets the value of the feeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeInformation }
     * 
     * 
     */
    public List<FeeInformation> getFeeInformation() {
        if (feeInformation == null) {
            feeInformation = new ArrayList<FeeInformation>();
        }
        return this.feeInformation;
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
     * Gets the value of the packingSlip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packingSlip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackingSlip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackingSlip }
     * 
     * 
     */
    public List<PackingSlip> getPackingSlip() {
        if (packingSlip == null) {
            packingSlip = new ArrayList<PackingSlip>();
        }
        return this.packingSlip;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
    }

    /**
     * Gets the value of the partPayment property.
     * 
     * @return
     *     possible object is
     *     {@link PartPayment }
     *     
     */
    public PartPayment getPartPayment() {
        return partPayment;
    }

    /**
     * Sets the value of the partPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartPayment }
     *     
     */
    public void setPartPayment(PartPayment value) {
        this.partPayment = value;
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
            List<AncillaryDates> lhsAncillaryDates;
            lhsAncillaryDates = (((this.ancillaryDates!= null)&&(!this.ancillaryDates.isEmpty()))?this.getAncillaryDates():null);
            List<AncillaryDates> rhsAncillaryDates;
            rhsAncillaryDates = (((that.ancillaryDates!= null)&&(!that.ancillaryDates.isEmpty()))?that.getAncillaryDates():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ancillaryDates", lhsAncillaryDates), LocatorUtils.property(thatLocator, "ancillaryDates", rhsAncillaryDates), lhsAncillaryDates, rhsAncillaryDates, ((this.ancillaryDates!= null)&&(!this.ancillaryDates.isEmpty())), ((that.ancillaryDates!= null)&&(!that.ancillaryDates.isEmpty())))) {
                return false;
            }
        }
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
            List<FeeInformation> lhsFeeInformation;
            lhsFeeInformation = (((this.feeInformation!= null)&&(!this.feeInformation.isEmpty()))?this.getFeeInformation():null);
            List<FeeInformation> rhsFeeInformation;
            rhsFeeInformation = (((that.feeInformation!= null)&&(!that.feeInformation.isEmpty()))?that.getFeeInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feeInformation", lhsFeeInformation), LocatorUtils.property(thatLocator, "feeInformation", rhsFeeInformation), lhsFeeInformation, rhsFeeInformation, ((this.feeInformation!= null)&&(!this.feeInformation.isEmpty())), ((that.feeInformation!= null)&&(!that.feeInformation.isEmpty())))) {
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
            List<PackingSlip> lhsPackingSlip;
            lhsPackingSlip = (((this.packingSlip!= null)&&(!this.packingSlip.isEmpty()))?this.getPackingSlip():null);
            List<PackingSlip> rhsPackingSlip;
            rhsPackingSlip = (((that.packingSlip!= null)&&(!that.packingSlip.isEmpty()))?that.getPackingSlip():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packingSlip", lhsPackingSlip), LocatorUtils.property(thatLocator, "packingSlip", rhsPackingSlip), lhsPackingSlip, rhsPackingSlip, ((this.packingSlip!= null)&&(!this.packingSlip.isEmpty())), ((that.packingSlip!= null)&&(!that.packingSlip.isEmpty())))) {
                return false;
            }
        }
        {
            List<PartnerDescription> lhsPartnerDescription;
            lhsPartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            List<PartnerDescription> rhsPartnerDescription;
            rhsPartnerDescription = (((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty()))?that.getPartnerDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())), ((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty())))) {
                return false;
            }
        }
        {
            PartPayment lhsPartPayment;
            lhsPartPayment = this.getPartPayment();
            PartPayment rhsPartPayment;
            rhsPartPayment = that.getPartPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partPayment", lhsPartPayment), LocatorUtils.property(thatLocator, "partPayment", rhsPartPayment), lhsPartPayment, rhsPartPayment, (this.partPayment!= null), (that.partPayment!= null))) {
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
            List<AncillaryDates> theAncillaryDates;
            theAncillaryDates = (((this.ancillaryDates!= null)&&(!this.ancillaryDates.isEmpty()))?this.getAncillaryDates():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ancillaryDates", theAncillaryDates), currentHashCode, theAncillaryDates, ((this.ancillaryDates!= null)&&(!this.ancillaryDates.isEmpty())));
        }
        {
            String theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments, (this.comments!= null));
        }
        {
            List<FeeInformation> theFeeInformation;
            theFeeInformation = (((this.feeInformation!= null)&&(!this.feeInformation.isEmpty()))?this.getFeeInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feeInformation", theFeeInformation), currentHashCode, theFeeInformation, ((this.feeInformation!= null)&&(!this.feeInformation.isEmpty())));
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
            List<PackingSlip> thePackingSlip;
            thePackingSlip = (((this.packingSlip!= null)&&(!this.packingSlip.isEmpty()))?this.getPackingSlip():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packingSlip", thePackingSlip), currentHashCode, thePackingSlip, ((this.packingSlip!= null)&&(!this.packingSlip.isEmpty())));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            PartPayment thePartPayment;
            thePartPayment = this.getPartPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partPayment", thePartPayment), currentHashCode, thePartPayment, (this.partPayment!= null));
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
            List<AncillaryDates> theAncillaryDates;
            theAncillaryDates = (((this.ancillaryDates!= null)&&(!this.ancillaryDates.isEmpty()))?this.getAncillaryDates():null);
            strategy.appendField(locator, this, "ancillaryDates", buffer, theAncillaryDates, ((this.ancillaryDates!= null)&&(!this.ancillaryDates.isEmpty())));
        }
        {
            String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments, (this.comments!= null));
        }
        {
            List<FeeInformation> theFeeInformation;
            theFeeInformation = (((this.feeInformation!= null)&&(!this.feeInformation.isEmpty()))?this.getFeeInformation():null);
            strategy.appendField(locator, this, "feeInformation", buffer, theFeeInformation, ((this.feeInformation!= null)&&(!this.feeInformation.isEmpty())));
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
            List<PackingSlip> thePackingSlip;
            thePackingSlip = (((this.packingSlip!= null)&&(!this.packingSlip.isEmpty()))?this.getPackingSlip():null);
            strategy.appendField(locator, this, "packingSlip", buffer, thePackingSlip, ((this.packingSlip!= null)&&(!this.packingSlip.isEmpty())));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            PartPayment thePartPayment;
            thePartPayment = this.getPartPayment();
            strategy.appendField(locator, this, "partPayment", buffer, thePartPayment, (this.partPayment!= null));
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
