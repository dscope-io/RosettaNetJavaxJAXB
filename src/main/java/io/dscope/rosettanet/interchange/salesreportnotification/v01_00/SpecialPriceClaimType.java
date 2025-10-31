
package io.dscope.rosettanet.interchange.salesreportnotification.v01_00;

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
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.SpecialPrice;
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
 *         &lt;element name="DebitMemoNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceQuallifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}SpecialPrice"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" fixed="1.0" /&gt;
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
    "debitMemoNumber",
    "identifier",
    "referenceQuallifier",
    "referenceValue",
    "specialPrice"
})
public class SpecialPriceClaimType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AuthorizationNumber")
    protected String authorizationNumber;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "DebitMemoNumber")
    protected String debitMemoNumber;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "ReferenceQuallifier")
    protected List<String> referenceQuallifier;
    @XmlElement(name = "ReferenceValue")
    protected List<String> referenceValue;
    @XmlElementRef(name = "SpecialPrice", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = SpecialPrice.class)
    protected SpecialPrice specialPrice;
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
     * Gets the value of the debitMemoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitMemoNumber() {
        return debitMemoNumber;
    }

    /**
     * Sets the value of the debitMemoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitMemoNumber(String value) {
        this.debitMemoNumber = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the referenceQuallifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceQuallifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceQuallifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceQuallifier() {
        if (referenceQuallifier == null) {
            referenceQuallifier = new ArrayList<String>();
        }
        return this.referenceQuallifier;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceValue() {
        if (referenceValue == null) {
            referenceValue = new ArrayList<String>();
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
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        if (schemaVersion == null) {
            return "1.0";
        } else {
            return schemaVersion;
        }
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
            String lhsDebitMemoNumber;
            lhsDebitMemoNumber = this.getDebitMemoNumber();
            String rhsDebitMemoNumber;
            rhsDebitMemoNumber = that.getDebitMemoNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debitMemoNumber", lhsDebitMemoNumber), LocatorUtils.property(thatLocator, "debitMemoNumber", rhsDebitMemoNumber), lhsDebitMemoNumber, rhsDebitMemoNumber, (this.debitMemoNumber!= null), (that.debitMemoNumber!= null))) {
                return false;
            }
        }
        {
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            List<String> lhsReferenceQuallifier;
            lhsReferenceQuallifier = (((this.referenceQuallifier!= null)&&(!this.referenceQuallifier.isEmpty()))?this.getReferenceQuallifier():null);
            List<String> rhsReferenceQuallifier;
            rhsReferenceQuallifier = (((that.referenceQuallifier!= null)&&(!that.referenceQuallifier.isEmpty()))?that.getReferenceQuallifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceQuallifier", lhsReferenceQuallifier), LocatorUtils.property(thatLocator, "referenceQuallifier", rhsReferenceQuallifier), lhsReferenceQuallifier, rhsReferenceQuallifier, ((this.referenceQuallifier!= null)&&(!this.referenceQuallifier.isEmpty())), ((that.referenceQuallifier!= null)&&(!that.referenceQuallifier.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsReferenceValue;
            lhsReferenceValue = (((this.referenceValue!= null)&&(!this.referenceValue.isEmpty()))?this.getReferenceValue():null);
            List<String> rhsReferenceValue;
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
            String theDebitMemoNumber;
            theDebitMemoNumber = this.getDebitMemoNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debitMemoNumber", theDebitMemoNumber), currentHashCode, theDebitMemoNumber, (this.debitMemoNumber!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            List<String> theReferenceQuallifier;
            theReferenceQuallifier = (((this.referenceQuallifier!= null)&&(!this.referenceQuallifier.isEmpty()))?this.getReferenceQuallifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceQuallifier", theReferenceQuallifier), currentHashCode, theReferenceQuallifier, ((this.referenceQuallifier!= null)&&(!this.referenceQuallifier.isEmpty())));
        }
        {
            List<String> theReferenceValue;
            theReferenceValue = (((this.referenceValue!= null)&&(!this.referenceValue.isEmpty()))?this.getReferenceValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceValue", theReferenceValue), currentHashCode, theReferenceValue, ((this.referenceValue!= null)&&(!this.referenceValue.isEmpty())));
        }
        {
            SpecialPrice theSpecialPrice;
            theSpecialPrice = this.getSpecialPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialPrice", theSpecialPrice), currentHashCode, theSpecialPrice, (this.specialPrice!= null));
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
            String theDebitMemoNumber;
            theDebitMemoNumber = this.getDebitMemoNumber();
            strategy.appendField(locator, this, "debitMemoNumber", buffer, theDebitMemoNumber, (this.debitMemoNumber!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            List<String> theReferenceQuallifier;
            theReferenceQuallifier = (((this.referenceQuallifier!= null)&&(!this.referenceQuallifier.isEmpty()))?this.getReferenceQuallifier():null);
            strategy.appendField(locator, this, "referenceQuallifier", buffer, theReferenceQuallifier, ((this.referenceQuallifier!= null)&&(!this.referenceQuallifier.isEmpty())));
        }
        {
            List<String> theReferenceValue;
            theReferenceValue = (((this.referenceValue!= null)&&(!this.referenceValue.isEmpty()))?this.getReferenceValue():null);
            strategy.appendField(locator, this, "referenceValue", buffer, theReferenceValue, ((this.referenceValue!= null)&&(!this.referenceValue.isEmpty())));
        }
        {
            SpecialPrice theSpecialPrice;
            theSpecialPrice = this.getSpecialPrice();
            strategy.appendField(locator, this, "specialPrice", buffer, theSpecialPrice, (this.specialPrice!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
