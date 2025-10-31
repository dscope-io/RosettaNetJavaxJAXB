
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

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
import io.dscope.rosettanet.domain.procurement.codelist.creditcardclassification.v01_03.CreditCardClassification;
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
 * <p>Java class for CreditCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CidIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:CreditCardClassification:xsd:codelist:01.03}CreditCardClassification"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "CreditCardType", propOrder = {
    "cardHolderName",
    "cidIdentifier",
    "creditCardClassification",
    "expiryDate",
    "identifier"
})
public class CreditCardType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CardHolderName", required = true)
    protected String cardHolderName;
    @XmlElement(name = "CidIdentifier")
    protected String cidIdentifier;
    @XmlElementRef(name = "CreditCardClassification", namespace = "urn:rosettanet:specification:domain:Procurement:CreditCardClassification:xsd:codelist:01.03", type = CreditCardClassification.class)
    protected CreditCardClassification creditCardClassification;
    @XmlElement(name = "ExpiryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the cidIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidIdentifier() {
        return cidIdentifier;
    }

    /**
     * Sets the value of the cidIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidIdentifier(String value) {
        this.cidIdentifier = value;
    }

    /**
     * Gets the value of the creditCardClassification property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardClassification }
     *     
     */
    public CreditCardClassification getCreditCardClassification() {
        return creditCardClassification;
    }

    /**
     * Sets the value of the creditCardClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardClassification }
     *     
     */
    public void setCreditCardClassification(CreditCardClassification value) {
        this.creditCardClassification = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
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
        final CreditCardType that = ((CreditCardType) object);
        {
            String lhsCardHolderName;
            lhsCardHolderName = this.getCardHolderName();
            String rhsCardHolderName;
            rhsCardHolderName = that.getCardHolderName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardHolderName", lhsCardHolderName), LocatorUtils.property(thatLocator, "cardHolderName", rhsCardHolderName), lhsCardHolderName, rhsCardHolderName, (this.cardHolderName!= null), (that.cardHolderName!= null))) {
                return false;
            }
        }
        {
            String lhsCidIdentifier;
            lhsCidIdentifier = this.getCidIdentifier();
            String rhsCidIdentifier;
            rhsCidIdentifier = that.getCidIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cidIdentifier", lhsCidIdentifier), LocatorUtils.property(thatLocator, "cidIdentifier", rhsCidIdentifier), lhsCidIdentifier, rhsCidIdentifier, (this.cidIdentifier!= null), (that.cidIdentifier!= null))) {
                return false;
            }
        }
        {
            CreditCardClassification lhsCreditCardClassification;
            lhsCreditCardClassification = this.getCreditCardClassification();
            CreditCardClassification rhsCreditCardClassification;
            rhsCreditCardClassification = that.getCreditCardClassification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditCardClassification", lhsCreditCardClassification), LocatorUtils.property(thatLocator, "creditCardClassification", rhsCreditCardClassification), lhsCreditCardClassification, rhsCreditCardClassification, (this.creditCardClassification!= null), (that.creditCardClassification!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsExpiryDate;
            lhsExpiryDate = this.getExpiryDate();
            XMLGregorianCalendar rhsExpiryDate;
            rhsExpiryDate = that.getExpiryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expiryDate", lhsExpiryDate), LocatorUtils.property(thatLocator, "expiryDate", rhsExpiryDate), lhsExpiryDate, rhsExpiryDate, (this.expiryDate!= null), (that.expiryDate!= null))) {
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
            String theCardHolderName;
            theCardHolderName = this.getCardHolderName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardHolderName", theCardHolderName), currentHashCode, theCardHolderName, (this.cardHolderName!= null));
        }
        {
            String theCidIdentifier;
            theCidIdentifier = this.getCidIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cidIdentifier", theCidIdentifier), currentHashCode, theCidIdentifier, (this.cidIdentifier!= null));
        }
        {
            CreditCardClassification theCreditCardClassification;
            theCreditCardClassification = this.getCreditCardClassification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditCardClassification", theCreditCardClassification), currentHashCode, theCreditCardClassification, (this.creditCardClassification!= null));
        }
        {
            XMLGregorianCalendar theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expiryDate", theExpiryDate), currentHashCode, theExpiryDate, (this.expiryDate!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
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
            String theCardHolderName;
            theCardHolderName = this.getCardHolderName();
            strategy.appendField(locator, this, "cardHolderName", buffer, theCardHolderName, (this.cardHolderName!= null));
        }
        {
            String theCidIdentifier;
            theCidIdentifier = this.getCidIdentifier();
            strategy.appendField(locator, this, "cidIdentifier", buffer, theCidIdentifier, (this.cidIdentifier!= null));
        }
        {
            CreditCardClassification theCreditCardClassification;
            theCreditCardClassification = this.getCreditCardClassification();
            strategy.appendField(locator, this, "creditCardClassification", buffer, theCreditCardClassification, (this.creditCardClassification!= null));
        }
        {
            XMLGregorianCalendar theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            strategy.appendField(locator, this, "expiryDate", buffer, theExpiryDate, (this.expiryDate!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
