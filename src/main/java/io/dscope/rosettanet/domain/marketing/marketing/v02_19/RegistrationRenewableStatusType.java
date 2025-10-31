
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for RegistrationRenewableStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationRenewableStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}IsRegistrationRenewable"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}RegistrationRenewableDate" minOccurs="0"/&gt;
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
@XmlType(name = "RegistrationRenewableStatusType", propOrder = {
    "isRegistrationRenewable",
    "registrationRenewableDate"
})
public class RegistrationRenewableStatusType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "IsRegistrationRenewable", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = IsRegistrationRenewable.class)
    protected IsRegistrationRenewable isRegistrationRenewable;
    @XmlElementRef(name = "RegistrationRenewableDate", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = RegistrationRenewableDate.class, required = false)
    protected RegistrationRenewableDate registrationRenewableDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isRegistrationRenewable property.
     * 
     * @return
     *     possible object is
     *     {@link IsRegistrationRenewable }
     *     
     */
    public IsRegistrationRenewable getIsRegistrationRenewable() {
        return isRegistrationRenewable;
    }

    /**
     * Sets the value of the isRegistrationRenewable property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsRegistrationRenewable }
     *     
     */
    public void setIsRegistrationRenewable(IsRegistrationRenewable value) {
        this.isRegistrationRenewable = value;
    }

    /**
     * Gets the value of the registrationRenewableDate property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationRenewableDate }
     *     
     */
    public RegistrationRenewableDate getRegistrationRenewableDate() {
        return registrationRenewableDate;
    }

    /**
     * Sets the value of the registrationRenewableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationRenewableDate }
     *     
     */
    public void setRegistrationRenewableDate(RegistrationRenewableDate value) {
        this.registrationRenewableDate = value;
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
        final RegistrationRenewableStatusType that = ((RegistrationRenewableStatusType) object);
        {
            IsRegistrationRenewable lhsIsRegistrationRenewable;
            lhsIsRegistrationRenewable = this.getIsRegistrationRenewable();
            IsRegistrationRenewable rhsIsRegistrationRenewable;
            rhsIsRegistrationRenewable = that.getIsRegistrationRenewable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isRegistrationRenewable", lhsIsRegistrationRenewable), LocatorUtils.property(thatLocator, "isRegistrationRenewable", rhsIsRegistrationRenewable), lhsIsRegistrationRenewable, rhsIsRegistrationRenewable, (this.isRegistrationRenewable!= null), (that.isRegistrationRenewable!= null))) {
                return false;
            }
        }
        {
            RegistrationRenewableDate lhsRegistrationRenewableDate;
            lhsRegistrationRenewableDate = this.getRegistrationRenewableDate();
            RegistrationRenewableDate rhsRegistrationRenewableDate;
            rhsRegistrationRenewableDate = that.getRegistrationRenewableDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationRenewableDate", lhsRegistrationRenewableDate), LocatorUtils.property(thatLocator, "registrationRenewableDate", rhsRegistrationRenewableDate), lhsRegistrationRenewableDate, rhsRegistrationRenewableDate, (this.registrationRenewableDate!= null), (that.registrationRenewableDate!= null))) {
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
            IsRegistrationRenewable theIsRegistrationRenewable;
            theIsRegistrationRenewable = this.getIsRegistrationRenewable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isRegistrationRenewable", theIsRegistrationRenewable), currentHashCode, theIsRegistrationRenewable, (this.isRegistrationRenewable!= null));
        }
        {
            RegistrationRenewableDate theRegistrationRenewableDate;
            theRegistrationRenewableDate = this.getRegistrationRenewableDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationRenewableDate", theRegistrationRenewableDate), currentHashCode, theRegistrationRenewableDate, (this.registrationRenewableDate!= null));
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
            IsRegistrationRenewable theIsRegistrationRenewable;
            theIsRegistrationRenewable = this.getIsRegistrationRenewable();
            strategy.appendField(locator, this, "isRegistrationRenewable", buffer, theIsRegistrationRenewable, (this.isRegistrationRenewable!= null));
        }
        {
            RegistrationRenewableDate theRegistrationRenewableDate;
            theRegistrationRenewableDate = this.getRegistrationRenewableDate();
            strategy.appendField(locator, this, "registrationRenewableDate", buffer, theRegistrationRenewableDate, (this.registrationRenewableDate!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
