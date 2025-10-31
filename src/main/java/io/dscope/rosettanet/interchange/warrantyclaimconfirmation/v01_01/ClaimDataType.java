
package io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_01;

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
import io.dscope.rosettanet.domain.service.codelist.claimstatus.v01_02.ClaimStatus;
import io.dscope.rosettanet.domain.shared.shared.v01_17.PaymentInformation;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;
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
 * <p>Java class for ClaimDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ClaimStatus:xsd:codelist:01.02}ClaimStatus"/&gt;
 *         &lt;element name="IsFixedInTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}PaymentInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProcessDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="TotalReimbursement" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "ClaimDataType", propOrder = {
    "claimStatus",
    "isFixedInTime",
    "paymentInformation",
    "processDate",
    "totalReimbursement"
})
public class ClaimDataType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ClaimStatus", namespace = "urn:rosettanet:specification:domain:Service:ClaimStatus:xsd:codelist:01.02", type = ClaimStatus.class)
    protected ClaimStatus claimStatus;
    @XmlElement(name = "IsFixedInTime")
    protected boolean isFixedInTime;
    @XmlElementRef(name = "PaymentInformation", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.17", type = PaymentInformation.class, required = false)
    protected List<PaymentInformation> paymentInformation;
    @XmlElement(name = "ProcessDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar processDate;
    @XmlElement(name = "TotalReimbursement")
    protected FinancialAmountType totalReimbursement;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the claimStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimStatus }
     *     
     */
    public ClaimStatus getClaimStatus() {
        return claimStatus;
    }

    /**
     * Sets the value of the claimStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimStatus }
     *     
     */
    public void setClaimStatus(ClaimStatus value) {
        this.claimStatus = value;
    }

    /**
     * Gets the value of the isFixedInTime property.
     * 
     */
    public boolean isIsFixedInTime() {
        return isFixedInTime;
    }

    /**
     * Sets the value of the isFixedInTime property.
     * 
     */
    public void setIsFixedInTime(boolean value) {
        this.isFixedInTime = value;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInformation }
     * 
     * 
     */
    public List<PaymentInformation> getPaymentInformation() {
        if (paymentInformation == null) {
            paymentInformation = new ArrayList<PaymentInformation>();
        }
        return this.paymentInformation;
    }

    /**
     * Gets the value of the processDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessDate() {
        return processDate;
    }

    /**
     * Sets the value of the processDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessDate(XMLGregorianCalendar value) {
        this.processDate = value;
    }

    /**
     * Gets the value of the totalReimbursement property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalReimbursement() {
        return totalReimbursement;
    }

    /**
     * Sets the value of the totalReimbursement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalReimbursement(FinancialAmountType value) {
        this.totalReimbursement = value;
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
        final ClaimDataType that = ((ClaimDataType) object);
        {
            ClaimStatus lhsClaimStatus;
            lhsClaimStatus = this.getClaimStatus();
            ClaimStatus rhsClaimStatus;
            rhsClaimStatus = that.getClaimStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "claimStatus", lhsClaimStatus), LocatorUtils.property(thatLocator, "claimStatus", rhsClaimStatus), lhsClaimStatus, rhsClaimStatus, (this.claimStatus!= null), (that.claimStatus!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsFixedInTime;
            lhsIsFixedInTime = this.isIsFixedInTime();
            boolean rhsIsFixedInTime;
            rhsIsFixedInTime = that.isIsFixedInTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isFixedInTime", lhsIsFixedInTime), LocatorUtils.property(thatLocator, "isFixedInTime", rhsIsFixedInTime), lhsIsFixedInTime, rhsIsFixedInTime, true, true)) {
                return false;
            }
        }
        {
            List<PaymentInformation> lhsPaymentInformation;
            lhsPaymentInformation = (((this.paymentInformation!= null)&&(!this.paymentInformation.isEmpty()))?this.getPaymentInformation():null);
            List<PaymentInformation> rhsPaymentInformation;
            rhsPaymentInformation = (((that.paymentInformation!= null)&&(!that.paymentInformation.isEmpty()))?that.getPaymentInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentInformation", lhsPaymentInformation), LocatorUtils.property(thatLocator, "paymentInformation", rhsPaymentInformation), lhsPaymentInformation, rhsPaymentInformation, ((this.paymentInformation!= null)&&(!this.paymentInformation.isEmpty())), ((that.paymentInformation!= null)&&(!that.paymentInformation.isEmpty())))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsProcessDate;
            lhsProcessDate = this.getProcessDate();
            XMLGregorianCalendar rhsProcessDate;
            rhsProcessDate = that.getProcessDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processDate", lhsProcessDate), LocatorUtils.property(thatLocator, "processDate", rhsProcessDate), lhsProcessDate, rhsProcessDate, (this.processDate!= null), (that.processDate!= null))) {
                return false;
            }
        }
        {
            FinancialAmountType lhsTotalReimbursement;
            lhsTotalReimbursement = this.getTotalReimbursement();
            FinancialAmountType rhsTotalReimbursement;
            rhsTotalReimbursement = that.getTotalReimbursement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalReimbursement", lhsTotalReimbursement), LocatorUtils.property(thatLocator, "totalReimbursement", rhsTotalReimbursement), lhsTotalReimbursement, rhsTotalReimbursement, (this.totalReimbursement!= null), (that.totalReimbursement!= null))) {
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
            ClaimStatus theClaimStatus;
            theClaimStatus = this.getClaimStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "claimStatus", theClaimStatus), currentHashCode, theClaimStatus, (this.claimStatus!= null));
        }
        {
            boolean theIsFixedInTime;
            theIsFixedInTime = this.isIsFixedInTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isFixedInTime", theIsFixedInTime), currentHashCode, theIsFixedInTime, true);
        }
        {
            List<PaymentInformation> thePaymentInformation;
            thePaymentInformation = (((this.paymentInformation!= null)&&(!this.paymentInformation.isEmpty()))?this.getPaymentInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentInformation", thePaymentInformation), currentHashCode, thePaymentInformation, ((this.paymentInformation!= null)&&(!this.paymentInformation.isEmpty())));
        }
        {
            XMLGregorianCalendar theProcessDate;
            theProcessDate = this.getProcessDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processDate", theProcessDate), currentHashCode, theProcessDate, (this.processDate!= null));
        }
        {
            FinancialAmountType theTotalReimbursement;
            theTotalReimbursement = this.getTotalReimbursement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalReimbursement", theTotalReimbursement), currentHashCode, theTotalReimbursement, (this.totalReimbursement!= null));
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
            ClaimStatus theClaimStatus;
            theClaimStatus = this.getClaimStatus();
            strategy.appendField(locator, this, "claimStatus", buffer, theClaimStatus, (this.claimStatus!= null));
        }
        {
            boolean theIsFixedInTime;
            theIsFixedInTime = this.isIsFixedInTime();
            strategy.appendField(locator, this, "isFixedInTime", buffer, theIsFixedInTime, true);
        }
        {
            List<PaymentInformation> thePaymentInformation;
            thePaymentInformation = (((this.paymentInformation!= null)&&(!this.paymentInformation.isEmpty()))?this.getPaymentInformation():null);
            strategy.appendField(locator, this, "paymentInformation", buffer, thePaymentInformation, ((this.paymentInformation!= null)&&(!this.paymentInformation.isEmpty())));
        }
        {
            XMLGregorianCalendar theProcessDate;
            theProcessDate = this.getProcessDate();
            strategy.appendField(locator, this, "processDate", buffer, theProcessDate, (this.processDate!= null));
        }
        {
            FinancialAmountType theTotalReimbursement;
            theTotalReimbursement = this.getTotalReimbursement();
            strategy.appendField(locator, this, "totalReimbursement", buffer, theTotalReimbursement, (this.totalReimbursement!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
