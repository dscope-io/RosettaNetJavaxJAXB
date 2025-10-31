
package io.dscope.rosettanet.system.standarddocumentheader.v01_21;

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
 * <p>Java class for CorrelationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrelationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.21}ContractInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.21}RequestingDocumentInformation" minOccurs="0"/&gt;
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
@XmlType(name = "CorrelationInformationType", propOrder = {
    "contractInformation",
    "requestingDocumentInformation"
})
public class CorrelationInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.21", type = ContractInformation.class, required = false)
    protected ContractInformation contractInformation;
    @XmlElementRef(name = "RequestingDocumentInformation", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.21", type = RequestingDocumentInformation.class, required = false)
    protected RequestingDocumentInformation requestingDocumentInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contractInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContractInformation }
     *     
     */
    public ContractInformation getContractInformation() {
        return contractInformation;
    }

    /**
     * Sets the value of the contractInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractInformation }
     *     
     */
    public void setContractInformation(ContractInformation value) {
        this.contractInformation = value;
    }

    /**
     * Gets the value of the requestingDocumentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RequestingDocumentInformation }
     *     
     */
    public RequestingDocumentInformation getRequestingDocumentInformation() {
        return requestingDocumentInformation;
    }

    /**
     * Sets the value of the requestingDocumentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestingDocumentInformation }
     *     
     */
    public void setRequestingDocumentInformation(RequestingDocumentInformation value) {
        this.requestingDocumentInformation = value;
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
        final CorrelationInformationType that = ((CorrelationInformationType) object);
        {
            ContractInformation lhsContractInformation;
            lhsContractInformation = this.getContractInformation();
            ContractInformation rhsContractInformation;
            rhsContractInformation = that.getContractInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractInformation", lhsContractInformation), LocatorUtils.property(thatLocator, "contractInformation", rhsContractInformation), lhsContractInformation, rhsContractInformation, (this.contractInformation!= null), (that.contractInformation!= null))) {
                return false;
            }
        }
        {
            RequestingDocumentInformation lhsRequestingDocumentInformation;
            lhsRequestingDocumentInformation = this.getRequestingDocumentInformation();
            RequestingDocumentInformation rhsRequestingDocumentInformation;
            rhsRequestingDocumentInformation = that.getRequestingDocumentInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestingDocumentInformation", lhsRequestingDocumentInformation), LocatorUtils.property(thatLocator, "requestingDocumentInformation", rhsRequestingDocumentInformation), lhsRequestingDocumentInformation, rhsRequestingDocumentInformation, (this.requestingDocumentInformation!= null), (that.requestingDocumentInformation!= null))) {
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
            ContractInformation theContractInformation;
            theContractInformation = this.getContractInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractInformation", theContractInformation), currentHashCode, theContractInformation, (this.contractInformation!= null));
        }
        {
            RequestingDocumentInformation theRequestingDocumentInformation;
            theRequestingDocumentInformation = this.getRequestingDocumentInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestingDocumentInformation", theRequestingDocumentInformation), currentHashCode, theRequestingDocumentInformation, (this.requestingDocumentInformation!= null));
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
            ContractInformation theContractInformation;
            theContractInformation = this.getContractInformation();
            strategy.appendField(locator, this, "contractInformation", buffer, theContractInformation, (this.contractInformation!= null));
        }
        {
            RequestingDocumentInformation theRequestingDocumentInformation;
            theRequestingDocumentInformation = this.getRequestingDocumentInformation();
            strategy.appendField(locator, this, "requestingDocumentInformation", buffer, theRequestingDocumentInformation, (this.requestingDocumentInformation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
