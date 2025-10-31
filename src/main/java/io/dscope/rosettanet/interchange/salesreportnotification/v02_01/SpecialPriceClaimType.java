
package io.dscope.rosettanet.interchange.salesreportnotification.v02_01;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.SpecialPrice;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
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
 * <p>Java class for SpecialPriceClaimType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialPriceClaimType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebitMemo" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceValue" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}SpecialPrice" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPriceClaim" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPriceClaimQualifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SpecialPriceClaimType", propOrder = {
    "authorizationNumber",
    "comments",
    "debitMemo",
    "referenceValue",
    "specialPrice",
    "specialPriceClaim",
    "specialPriceClaimQualifier"
})
public class SpecialPriceClaimType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AuthorizationNumber")
    protected String authorizationNumber;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "DebitMemo")
    protected BusinessDocumentReferenceType debitMemo;
    @XmlElement(name = "ReferenceValue")
    protected List<BusinessDocumentReferenceType> referenceValue;
    @XmlElementRef(name = "SpecialPrice", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = SpecialPrice.class, required = false)
    protected SpecialPrice specialPrice;
    @XmlElement(name = "SpecialPriceClaim")
    protected BusinessDocumentReferenceType specialPriceClaim;
    @XmlElement(name = "SpecialPriceClaimQualifier")
    protected List<BusinessDocumentReferenceType> specialPriceClaimQualifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the authorizationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationNumber() {
        return authorizationNumber;
    }

    /**
     * Sets the value of the authorizationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationNumber(String value) {
        this.authorizationNumber = value;
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
     * Gets the value of the debitMemo property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getDebitMemo() {
        return debitMemo;
    }

    /**
     * Sets the value of the debitMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setDebitMemo(BusinessDocumentReferenceType value) {
        this.debitMemo = value;
    }

    /**
     * Gets the value of the referenceValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getReferenceValue() {
        if (referenceValue == null) {
            referenceValue = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.referenceValue;
    }

    /**
     * Gets the value of the specialPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialPrice }
     *     
     */
    public SpecialPrice getSpecialPrice() {
        return specialPrice;
    }

    /**
     * Sets the value of the specialPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialPrice }
     *     
     */
    public void setSpecialPrice(SpecialPrice value) {
        this.specialPrice = value;
    }

    /**
     * Gets the value of the specialPriceClaim property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getSpecialPriceClaim() {
        return specialPriceClaim;
    }

    /**
     * Sets the value of the specialPriceClaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setSpecialPriceClaim(BusinessDocumentReferenceType value) {
        this.specialPriceClaim = value;
    }

    /**
     * Gets the value of the specialPriceClaimQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialPriceClaimQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialPriceClaimQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getSpecialPriceClaimQualifier() {
        if (specialPriceClaimQualifier == null) {
            specialPriceClaimQualifier = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.specialPriceClaimQualifier;
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
        final SpecialPriceClaimType that = ((SpecialPriceClaimType) object);
        {
            String lhsAuthorizationNumber;
            lhsAuthorizationNumber = this.getAuthorizationNumber();
            String rhsAuthorizationNumber;
            rhsAuthorizationNumber = that.getAuthorizationNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authorizationNumber", lhsAuthorizationNumber), LocatorUtils.property(thatLocator, "authorizationNumber", rhsAuthorizationNumber), lhsAuthorizationNumber, rhsAuthorizationNumber, (this.authorizationNumber!= null), (that.authorizationNumber!= null))) {
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
            BusinessDocumentReferenceType lhsDebitMemo;
            lhsDebitMemo = this.getDebitMemo();
            BusinessDocumentReferenceType rhsDebitMemo;
            rhsDebitMemo = that.getDebitMemo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debitMemo", lhsDebitMemo), LocatorUtils.property(thatLocator, "debitMemo", rhsDebitMemo), lhsDebitMemo, rhsDebitMemo, (this.debitMemo!= null), (that.debitMemo!= null))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsReferenceValue;
            lhsReferenceValue = (((this.referenceValue!= null)&&(!this.referenceValue.isEmpty()))?this.getReferenceValue():null);
            List<BusinessDocumentReferenceType> rhsReferenceValue;
            rhsReferenceValue = (((that.referenceValue!= null)&&(!that.referenceValue.isEmpty()))?that.getReferenceValue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceValue", lhsReferenceValue), LocatorUtils.property(thatLocator, "referenceValue", rhsReferenceValue), lhsReferenceValue, rhsReferenceValue, ((this.referenceValue!= null)&&(!this.referenceValue.isEmpty())), ((that.referenceValue!= null)&&(!that.referenceValue.isEmpty())))) {
                return false;
            }
        }
        {
            SpecialPrice lhsSpecialPrice;
            lhsSpecialPrice = this.getSpecialPrice();
            SpecialPrice rhsSpecialPrice;
            rhsSpecialPrice = that.getSpecialPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialPrice", lhsSpecialPrice), LocatorUtils.property(thatLocator, "specialPrice", rhsSpecialPrice), lhsSpecialPrice, rhsSpecialPrice, (this.specialPrice!= null), (that.specialPrice!= null))) {
                return false;
            }
        }
        {
            BusinessDocumentReferenceType lhsSpecialPriceClaim;
            lhsSpecialPriceClaim = this.getSpecialPriceClaim();
            BusinessDocumentReferenceType rhsSpecialPriceClaim;
            rhsSpecialPriceClaim = that.getSpecialPriceClaim();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialPriceClaim", lhsSpecialPriceClaim), LocatorUtils.property(thatLocator, "specialPriceClaim", rhsSpecialPriceClaim), lhsSpecialPriceClaim, rhsSpecialPriceClaim, (this.specialPriceClaim!= null), (that.specialPriceClaim!= null))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsSpecialPriceClaimQualifier;
            lhsSpecialPriceClaimQualifier = (((this.specialPriceClaimQualifier!= null)&&(!this.specialPriceClaimQualifier.isEmpty()))?this.getSpecialPriceClaimQualifier():null);
            List<BusinessDocumentReferenceType> rhsSpecialPriceClaimQualifier;
            rhsSpecialPriceClaimQualifier = (((that.specialPriceClaimQualifier!= null)&&(!that.specialPriceClaimQualifier.isEmpty()))?that.getSpecialPriceClaimQualifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialPriceClaimQualifier", lhsSpecialPriceClaimQualifier), LocatorUtils.property(thatLocator, "specialPriceClaimQualifier", rhsSpecialPriceClaimQualifier), lhsSpecialPriceClaimQualifier, rhsSpecialPriceClaimQualifier, ((this.specialPriceClaimQualifier!= null)&&(!this.specialPriceClaimQualifier.isEmpty())), ((that.specialPriceClaimQualifier!= null)&&(!that.specialPriceClaimQualifier.isEmpty())))) {
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
            String theAuthorizationNumber;
            theAuthorizationNumber = this.getAuthorizationNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authorizationNumber", theAuthorizationNumber), currentHashCode, theAuthorizationNumber, (this.authorizationNumber!= null));
        }
        {
            String theComments;
            theComments = this.getComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comments", theComments), currentHashCode, theComments, (this.comments!= null));
        }
        {
            BusinessDocumentReferenceType theDebitMemo;
            theDebitMemo = this.getDebitMemo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debitMemo", theDebitMemo), currentHashCode, theDebitMemo, (this.debitMemo!= null));
        }
        {
            List<BusinessDocumentReferenceType> theReferenceValue;
            theReferenceValue = (((this.referenceValue!= null)&&(!this.referenceValue.isEmpty()))?this.getReferenceValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceValue", theReferenceValue), currentHashCode, theReferenceValue, ((this.referenceValue!= null)&&(!this.referenceValue.isEmpty())));
        }
        {
            SpecialPrice theSpecialPrice;
            theSpecialPrice = this.getSpecialPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialPrice", theSpecialPrice), currentHashCode, theSpecialPrice, (this.specialPrice!= null));
        }
        {
            BusinessDocumentReferenceType theSpecialPriceClaim;
            theSpecialPriceClaim = this.getSpecialPriceClaim();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialPriceClaim", theSpecialPriceClaim), currentHashCode, theSpecialPriceClaim, (this.specialPriceClaim!= null));
        }
        {
            List<BusinessDocumentReferenceType> theSpecialPriceClaimQualifier;
            theSpecialPriceClaimQualifier = (((this.specialPriceClaimQualifier!= null)&&(!this.specialPriceClaimQualifier.isEmpty()))?this.getSpecialPriceClaimQualifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialPriceClaimQualifier", theSpecialPriceClaimQualifier), currentHashCode, theSpecialPriceClaimQualifier, ((this.specialPriceClaimQualifier!= null)&&(!this.specialPriceClaimQualifier.isEmpty())));
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
            String theAuthorizationNumber;
            theAuthorizationNumber = this.getAuthorizationNumber();
            strategy.appendField(locator, this, "authorizationNumber", buffer, theAuthorizationNumber, (this.authorizationNumber!= null));
        }
        {
            String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments, (this.comments!= null));
        }
        {
            BusinessDocumentReferenceType theDebitMemo;
            theDebitMemo = this.getDebitMemo();
            strategy.appendField(locator, this, "debitMemo", buffer, theDebitMemo, (this.debitMemo!= null));
        }
        {
            List<BusinessDocumentReferenceType> theReferenceValue;
            theReferenceValue = (((this.referenceValue!= null)&&(!this.referenceValue.isEmpty()))?this.getReferenceValue():null);
            strategy.appendField(locator, this, "referenceValue", buffer, theReferenceValue, ((this.referenceValue!= null)&&(!this.referenceValue.isEmpty())));
        }
        {
            SpecialPrice theSpecialPrice;
            theSpecialPrice = this.getSpecialPrice();
            strategy.appendField(locator, this, "specialPrice", buffer, theSpecialPrice, (this.specialPrice!= null));
        }
        {
            BusinessDocumentReferenceType theSpecialPriceClaim;
            theSpecialPriceClaim = this.getSpecialPriceClaim();
            strategy.appendField(locator, this, "specialPriceClaim", buffer, theSpecialPriceClaim, (this.specialPriceClaim!= null));
        }
        {
            List<BusinessDocumentReferenceType> theSpecialPriceClaimQualifier;
            theSpecialPriceClaimQualifier = (((this.specialPriceClaimQualifier!= null)&&(!this.specialPriceClaimQualifier.isEmpty()))?this.getSpecialPriceClaimQualifier():null);
            strategy.appendField(locator, this, "specialPriceClaimQualifier", buffer, theSpecialPriceClaimQualifier, ((this.specialPriceClaimQualifier!= null)&&(!this.specialPriceClaimQualifier.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
