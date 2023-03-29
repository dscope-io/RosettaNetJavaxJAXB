
package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

import java.math.BigDecimal;
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
import io.dscope.rosettanet.domain.procurement.codelist.paymentcondition.v01_03.PaymentCondition;


/**
 * <p>Java class for PaymentTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}Discounts" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}NetTerms"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PaymentCondition:xsd:codelist:01.03}PaymentCondition" minOccurs="0"/&gt;
 *         &lt;element name="PercentDue" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.03}PercentAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "PaymentTermsType", propOrder = {
    "discounts",
    "netTerms",
    "paymentCondition",
    "percentDue"
})
public class PaymentTermsType {

    @XmlElementRef(name = "Discounts", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = Discounts.class, required = false)
    protected List<Discounts> discounts;
    @XmlElementRef(name = "NetTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = NetTerms.class)
    protected NetTerms netTerms;
    @XmlElementRef(name = "PaymentCondition", namespace = "urn:rosettanet:specification:domain:Procurement:PaymentCondition:xsd:codelist:01.03", type = PaymentCondition.class, required = false)
    protected PaymentCondition paymentCondition;
    @XmlElement(name = "PercentDue")
    protected BigDecimal percentDue;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the discounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discounts }
     * 
     * 
     */
    public List<Discounts> getDiscounts() {
        if (discounts == null) {
            discounts = new ArrayList<Discounts>();
        }
        return this.discounts;
    }

    /**
     * Gets the value of the netTerms property.
     * 
     * @return
     *     possible object is
     *     {@link NetTerms }
     *     
     */
    public NetTerms getNetTerms() {
        return netTerms;
    }

    /**
     * Sets the value of the netTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetTerms }
     *     
     */
    public void setNetTerms(NetTerms value) {
        this.netTerms = value;
    }

    /**
     * Gets the value of the paymentCondition property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCondition }
     *     
     */
    public PaymentCondition getPaymentCondition() {
        return paymentCondition;
    }

    /**
     * Sets the value of the paymentCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCondition }
     *     
     */
    public void setPaymentCondition(PaymentCondition value) {
        this.paymentCondition = value;
    }

    /**
     * Gets the value of the percentDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentDue() {
        return percentDue;
    }

    /**
     * Sets the value of the percentDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentDue(BigDecimal value) {
        this.percentDue = value;
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

}
