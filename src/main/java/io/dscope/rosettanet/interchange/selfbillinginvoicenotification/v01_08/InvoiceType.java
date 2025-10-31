
package io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_08;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.paymentterms.v01_03.PaymentTermsType;
import io.dscope.rosettanet.domain.procurement.codelist.saletype.v01_04.SaleType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.AccountSummaryType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.Financing;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.PaymentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TaxSummaryType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.MonetaryAmountType;
import io.dscope.rosettanet.universal.codelist.documenttype.v01_13.DocumentType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for InvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AncillaryAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BillToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.13}DocumentType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}Financing" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineItem" type="{urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08}InvoiceLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="IsLockBoxUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsRebill" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTerms" type="{urn:rosettanet:specification:domain:Procurement:PaymentTerms:xsd:codelist:01.03}PaymentTermsType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemitTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="RemitToAccount" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}AccountSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemitToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.04}SaleType" minOccurs="0"/&gt;
 *         &lt;element name="SelfBillingFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="SelfBillingTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="SoldToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SoldToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="TotalInvoiceAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType"/&gt;
 *         &lt;element name="TransferToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "InvoiceType", propOrder = {
    "content"
})
public class InvoiceType implements Equals2, HashCode2, ToString2
{

    @XmlElementRefs({
        @XmlElementRef(name = "AncillaryAmount", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BillToAccount", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DocumentType", namespace = "urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.13", type = DocumentType.class, required = false),
        @XmlElementRef(name = "Financing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = Financing.class, required = false),
        @XmlElementRef(name = "InvoiceLineItem", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IsLockBoxUsed", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IsRebill", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false),
        @XmlElementRef(name = "PaymentTerms", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PaymentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = PaymentTerms.class, required = false),
        @XmlElementRef(name = "RemitTo", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RemitToAccount", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RemitToTax", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SaleType", namespace = "urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.04", type = SaleType.class, required = false),
        @XmlElementRef(name = "SelfBillingFrom", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SelfBillingTo", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SoldToAccount", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SoldToTax", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TotalInvoiceAmount", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TransferToAccount", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "PaymentTerms" is used by two different parts of a schema. See: 
     * line 4 of file:/Users/roman/Projects/DScope/RosettaNetJAXBBuilder/src/xsd/PIP3C7_V11.02.00_NotifyOfSelfBillingInvoice/XML/Interchange/SelfBillingInvoiceNotification_01_08.xsd
     * line 4 of file:/Users/roman/Projects/DScope/RosettaNetJAXBBuilder/src/xsd/PIP3C7_V11.02.00_NotifyOfSelfBillingInvoice/XML/Interchange/SelfBillingInvoiceNotification_01_08.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleType }
     * {@link Financing }
     * {@link PaymentTerms }
     * {@link DocumentType }
     * {@link PartnerDescription }
     * {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountSummaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxSummaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxSummaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     * {@link JAXBElement }{@code <}{@link InvoiceLineItemType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecifiedPartnerDescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecifiedPartnerDescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecifiedPartnerDescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
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
        final InvoiceType that = ((InvoiceType) object);
        {
            List<JAXBElement<?>> lhsContent;
            lhsContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            List<JAXBElement<?>> rhsContent;
            rhsContent = (((that.content!= null)&&(!that.content.isEmpty()))?that.getContent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent, ((this.content!= null)&&(!this.content.isEmpty())), ((that.content!= null)&&(!that.content.isEmpty())))) {
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
            List<JAXBElement<?>> theContent;
            theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "content", theContent), currentHashCode, theContent, ((this.content!= null)&&(!this.content.isEmpty())));
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
            List<JAXBElement<?>> theContent;
            theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            strategy.appendField(locator, this, "content", buffer, theContent, ((this.content!= null)&&(!this.content.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
