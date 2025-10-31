
package io.dscope.rosettanet.domain.salesreporting.codelist.transactiontype.v01_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for TransactionTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionTypeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:rosettanet:specification:domain:TransactionType:xsd:codelist:1.0&gt;TransactionTypeContentType"&gt;
 *       &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}token" fixed="TransactionType" /&gt;
 *       &lt;attribute name="codeListVersion" type="{http://www.w3.org/2001/XMLSchema}token" fixed="1.0" /&gt;
 *       &lt;attribute name="agency" type="{http://www.w3.org/2001/XMLSchema}token" fixed="RosettaNet" /&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" fixed="1.0" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTypeType", propOrder = {
    "value"
})
public class TransactionTypeType implements Equals2, HashCode2, ToString2
{

    @XmlValue
    protected TransactionTypeContentType value;
    @XmlAttribute(name = "identifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identifier;
    @XmlAttribute(name = "codeListVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codeListVersion;
    @XmlAttribute(name = "agency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String agency;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeContentType }
     *     
     */
    public TransactionTypeContentType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeContentType }
     *     
     */
    public void setValue(TransactionTypeContentType value) {
        this.value = value;
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
        if (identifier == null) {
            return "TransactionType";
        } else {
            return identifier;
        }
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
     * Gets the value of the codeListVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListVersion() {
        if (codeListVersion == null) {
            return "1.0";
        } else {
            return codeListVersion;
        }
    }

    /**
     * Sets the value of the codeListVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListVersion(String value) {
        this.codeListVersion = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgency() {
        if (agency == null) {
            return "RosettaNet";
        } else {
            return agency;
        }
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgency(String value) {
        this.agency = value;
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
        final TransactionTypeType that = ((TransactionTypeType) object);
        {
            TransactionTypeContentType lhsValue;
            lhsValue = this.getValue();
            TransactionTypeContentType rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
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
            String lhsCodeListVersion;
            lhsCodeListVersion = this.getCodeListVersion();
            String rhsCodeListVersion;
            rhsCodeListVersion = that.getCodeListVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "codeListVersion", lhsCodeListVersion), LocatorUtils.property(thatLocator, "codeListVersion", rhsCodeListVersion), lhsCodeListVersion, rhsCodeListVersion, (this.codeListVersion!= null), (that.codeListVersion!= null))) {
                return false;
            }
        }
        {
            String lhsAgency;
            lhsAgency = this.getAgency();
            String rhsAgency;
            rhsAgency = that.getAgency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agency", lhsAgency), LocatorUtils.property(thatLocator, "agency", rhsAgency), lhsAgency, rhsAgency, (this.agency!= null), (that.agency!= null))) {
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
            TransactionTypeContentType theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, (this.value!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            String theCodeListVersion;
            theCodeListVersion = this.getCodeListVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "codeListVersion", theCodeListVersion), currentHashCode, theCodeListVersion, (this.codeListVersion!= null));
        }
        {
            String theAgency;
            theAgency = this.getAgency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agency", theAgency), currentHashCode, theAgency, (this.agency!= null));
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
            TransactionTypeContentType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            String theCodeListVersion;
            theCodeListVersion = this.getCodeListVersion();
            strategy.appendField(locator, this, "codeListVersion", buffer, theCodeListVersion, (this.codeListVersion!= null));
        }
        {
            String theAgency;
            theAgency = this.getAgency();
            strategy.appendField(locator, this, "agency", buffer, theAgency, (this.agency!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
