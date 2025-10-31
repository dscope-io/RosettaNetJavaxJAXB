
package io.dscope.rosettanet.interchange.shippingordercancellationconfirmation.v02_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationreasontype.v01_03.ShippingOrderCancellationReasonType;
import io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationstatus.v01_03.ShippingOrderCancellationStatus;
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
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08" xmlns:doa="urn:rosettanet:specification:domain:Procurement:OrderAdmin:xsd:codelist:01.03" xmlns:dsocrt="urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationReasonType:xsd:codelist:01.03" xmlns:dsocs="urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationStatus:xsd:codelist:01.03" xmlns:p642930_="http://java.sun.com/xml/ns/jaxb" xmlns:p977647_="http://annox.dev.java.net" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:ShippingOrderCancellationConfirmation:xsd:schema:02.00" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In CancellationConfirmation, if the value of ShippingOrderCancellationStatus is equal to 'REJ' then the occurence of ShippingOrderCancellationReasonType MUST be 1.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CancellationConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancellationConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationReasonType:xsd:codelist:01.03}ShippingOrderCancellationReasonType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationStatus:xsd:codelist:01.03}ShippingOrderCancellationStatus"/&gt;
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
@XmlType(name = "CancellationConfirmationType", propOrder = {
    "shippingOrderCancellationReasonType",
    "shippingOrderCancellationStatus"
})
public class CancellationConfirmationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ShippingOrderCancellationReasonType", namespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationReasonType:xsd:codelist:01.03", type = ShippingOrderCancellationReasonType.class, required = false)
    protected ShippingOrderCancellationReasonType shippingOrderCancellationReasonType;
    @XmlElementRef(name = "ShippingOrderCancellationStatus", namespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationStatus:xsd:codelist:01.03", type = ShippingOrderCancellationStatus.class)
    protected ShippingOrderCancellationStatus shippingOrderCancellationStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the shippingOrderCancellationReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOrderCancellationReasonType }
     *     
     */
    public ShippingOrderCancellationReasonType getShippingOrderCancellationReasonType() {
        return shippingOrderCancellationReasonType;
    }

    /**
     * Sets the value of the shippingOrderCancellationReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOrderCancellationReasonType }
     *     
     */
    public void setShippingOrderCancellationReasonType(ShippingOrderCancellationReasonType value) {
        this.shippingOrderCancellationReasonType = value;
    }

    /**
     * Gets the value of the shippingOrderCancellationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOrderCancellationStatus }
     *     
     */
    public ShippingOrderCancellationStatus getShippingOrderCancellationStatus() {
        return shippingOrderCancellationStatus;
    }

    /**
     * Sets the value of the shippingOrderCancellationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOrderCancellationStatus }
     *     
     */
    public void setShippingOrderCancellationStatus(ShippingOrderCancellationStatus value) {
        this.shippingOrderCancellationStatus = value;
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
        final CancellationConfirmationType that = ((CancellationConfirmationType) object);
        {
            ShippingOrderCancellationReasonType lhsShippingOrderCancellationReasonType;
            lhsShippingOrderCancellationReasonType = this.getShippingOrderCancellationReasonType();
            ShippingOrderCancellationReasonType rhsShippingOrderCancellationReasonType;
            rhsShippingOrderCancellationReasonType = that.getShippingOrderCancellationReasonType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingOrderCancellationReasonType", lhsShippingOrderCancellationReasonType), LocatorUtils.property(thatLocator, "shippingOrderCancellationReasonType", rhsShippingOrderCancellationReasonType), lhsShippingOrderCancellationReasonType, rhsShippingOrderCancellationReasonType, (this.shippingOrderCancellationReasonType!= null), (that.shippingOrderCancellationReasonType!= null))) {
                return false;
            }
        }
        {
            ShippingOrderCancellationStatus lhsShippingOrderCancellationStatus;
            lhsShippingOrderCancellationStatus = this.getShippingOrderCancellationStatus();
            ShippingOrderCancellationStatus rhsShippingOrderCancellationStatus;
            rhsShippingOrderCancellationStatus = that.getShippingOrderCancellationStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingOrderCancellationStatus", lhsShippingOrderCancellationStatus), LocatorUtils.property(thatLocator, "shippingOrderCancellationStatus", rhsShippingOrderCancellationStatus), lhsShippingOrderCancellationStatus, rhsShippingOrderCancellationStatus, (this.shippingOrderCancellationStatus!= null), (that.shippingOrderCancellationStatus!= null))) {
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
            ShippingOrderCancellationReasonType theShippingOrderCancellationReasonType;
            theShippingOrderCancellationReasonType = this.getShippingOrderCancellationReasonType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingOrderCancellationReasonType", theShippingOrderCancellationReasonType), currentHashCode, theShippingOrderCancellationReasonType, (this.shippingOrderCancellationReasonType!= null));
        }
        {
            ShippingOrderCancellationStatus theShippingOrderCancellationStatus;
            theShippingOrderCancellationStatus = this.getShippingOrderCancellationStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingOrderCancellationStatus", theShippingOrderCancellationStatus), currentHashCode, theShippingOrderCancellationStatus, (this.shippingOrderCancellationStatus!= null));
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
            ShippingOrderCancellationReasonType theShippingOrderCancellationReasonType;
            theShippingOrderCancellationReasonType = this.getShippingOrderCancellationReasonType();
            strategy.appendField(locator, this, "shippingOrderCancellationReasonType", buffer, theShippingOrderCancellationReasonType, (this.shippingOrderCancellationReasonType!= null));
        }
        {
            ShippingOrderCancellationStatus theShippingOrderCancellationStatus;
            theShippingOrderCancellationStatus = this.getShippingOrderCancellationStatus();
            strategy.appendField(locator, this, "shippingOrderCancellationStatus", buffer, theShippingOrderCancellationStatus, (this.shippingOrderCancellationStatus!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
