
package io.dscope.rosettanet.interchange.caseconfirmationnotification.v02_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.service.v02_20.ResponsePeriod;
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
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}ResponsePeriod" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AcceptanceCase" type="{urn:rosettanet:specification:interchange:CaseConfirmationNotification:xsd:schema:02.02}AcceptanceCaseType"/&gt;
 *           &lt;element name="CloseRejectCase" type="{urn:rosettanet:specification:interchange:CaseConfirmationNotification:xsd:schema:02.02}CloseRejectCaseType"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "ResponseType", propOrder = {
    "responsePeriod",
    "acceptanceCase",
    "closeRejectCase"
})
public class ResponseType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ResponsePeriod", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = ResponsePeriod.class, required = false)
    protected ResponsePeriod responsePeriod;
    @XmlElement(name = "AcceptanceCase")
    protected AcceptanceCaseType acceptanceCase;
    @XmlElement(name = "CloseRejectCase")
    protected CloseRejectCaseType closeRejectCase;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the responsePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePeriod }
     *     
     */
    public ResponsePeriod getResponsePeriod() {
        return responsePeriod;
    }

    /**
     * Sets the value of the responsePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePeriod }
     *     
     */
    public void setResponsePeriod(ResponsePeriod value) {
        this.responsePeriod = value;
    }

    /**
     * Gets the value of the acceptanceCase property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptanceCaseType }
     *     
     */
    public AcceptanceCaseType getAcceptanceCase() {
        return acceptanceCase;
    }

    /**
     * Sets the value of the acceptanceCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptanceCaseType }
     *     
     */
    public void setAcceptanceCase(AcceptanceCaseType value) {
        this.acceptanceCase = value;
    }

    /**
     * Gets the value of the closeRejectCase property.
     * 
     * @return
     *     possible object is
     *     {@link CloseRejectCaseType }
     *     
     */
    public CloseRejectCaseType getCloseRejectCase() {
        return closeRejectCase;
    }

    /**
     * Sets the value of the closeRejectCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseRejectCaseType }
     *     
     */
    public void setCloseRejectCase(CloseRejectCaseType value) {
        this.closeRejectCase = value;
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
        final ResponseType that = ((ResponseType) object);
        {
            ResponsePeriod lhsResponsePeriod;
            lhsResponsePeriod = this.getResponsePeriod();
            ResponsePeriod rhsResponsePeriod;
            rhsResponsePeriod = that.getResponsePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responsePeriod", lhsResponsePeriod), LocatorUtils.property(thatLocator, "responsePeriod", rhsResponsePeriod), lhsResponsePeriod, rhsResponsePeriod, (this.responsePeriod!= null), (that.responsePeriod!= null))) {
                return false;
            }
        }
        {
            AcceptanceCaseType lhsAcceptanceCase;
            lhsAcceptanceCase = this.getAcceptanceCase();
            AcceptanceCaseType rhsAcceptanceCase;
            rhsAcceptanceCase = that.getAcceptanceCase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptanceCase", lhsAcceptanceCase), LocatorUtils.property(thatLocator, "acceptanceCase", rhsAcceptanceCase), lhsAcceptanceCase, rhsAcceptanceCase, (this.acceptanceCase!= null), (that.acceptanceCase!= null))) {
                return false;
            }
        }
        {
            CloseRejectCaseType lhsCloseRejectCase;
            lhsCloseRejectCase = this.getCloseRejectCase();
            CloseRejectCaseType rhsCloseRejectCase;
            rhsCloseRejectCase = that.getCloseRejectCase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "closeRejectCase", lhsCloseRejectCase), LocatorUtils.property(thatLocator, "closeRejectCase", rhsCloseRejectCase), lhsCloseRejectCase, rhsCloseRejectCase, (this.closeRejectCase!= null), (that.closeRejectCase!= null))) {
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
            ResponsePeriod theResponsePeriod;
            theResponsePeriod = this.getResponsePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responsePeriod", theResponsePeriod), currentHashCode, theResponsePeriod, (this.responsePeriod!= null));
        }
        {
            AcceptanceCaseType theAcceptanceCase;
            theAcceptanceCase = this.getAcceptanceCase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceptanceCase", theAcceptanceCase), currentHashCode, theAcceptanceCase, (this.acceptanceCase!= null));
        }
        {
            CloseRejectCaseType theCloseRejectCase;
            theCloseRejectCase = this.getCloseRejectCase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "closeRejectCase", theCloseRejectCase), currentHashCode, theCloseRejectCase, (this.closeRejectCase!= null));
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
            ResponsePeriod theResponsePeriod;
            theResponsePeriod = this.getResponsePeriod();
            strategy.appendField(locator, this, "responsePeriod", buffer, theResponsePeriod, (this.responsePeriod!= null));
        }
        {
            AcceptanceCaseType theAcceptanceCase;
            theAcceptanceCase = this.getAcceptanceCase();
            strategy.appendField(locator, this, "acceptanceCase", buffer, theAcceptanceCase, (this.acceptanceCase!= null));
        }
        {
            CloseRejectCaseType theCloseRejectCase;
            theCloseRejectCase = this.getCloseRejectCase();
            strategy.appendField(locator, this, "closeRejectCase", buffer, theCloseRejectCase, (this.closeRejectCase!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
