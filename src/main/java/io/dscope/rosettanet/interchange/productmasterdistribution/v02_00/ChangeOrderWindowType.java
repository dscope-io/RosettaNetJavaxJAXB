
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dabcc="urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02" xmlns:dalc="urn:rosettanet:specification:domain:Design:AssemblyLevelCode:xsd:codelist:01.01" xmlns:dds="urn:rosettanet:specification:domain:Design:xsd:schema:02.15" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17" xmlns:dppt="urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03" xmlns:p841174_="http://annox.dev.java.net" xmlns:p861132_="http://java.sun.com/xml/ns/jaxb" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.10" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16" xmlns:tns="urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.03" xmlns:udt="urn:rosettanet:specification:universal:DataType:xsd:schema:01.04" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ChangeOrderWindow, at least one occurrence of CancelOrderWindow or ChangeOrderWindow.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ChangeOrderWindowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeOrderWindowType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelOrderWindow" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="ChangeOrderWindow" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
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
@XmlType(name = "ChangeOrderWindowType", propOrder = {
    "cancelOrderWindow",
    "changeOrderWindow"
})
public class ChangeOrderWindowType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CancelOrderWindow")
    protected Duration cancelOrderWindow;
    @XmlElement(name = "ChangeOrderWindow")
    protected Duration changeOrderWindow;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the cancelOrderWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCancelOrderWindow() {
        return cancelOrderWindow;
    }

    /**
     * Sets the value of the cancelOrderWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCancelOrderWindow(Duration value) {
        this.cancelOrderWindow = value;
    }

    /**
     * Gets the value of the changeOrderWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getChangeOrderWindow() {
        return changeOrderWindow;
    }

    /**
     * Sets the value of the changeOrderWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setChangeOrderWindow(Duration value) {
        this.changeOrderWindow = value;
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
        final ChangeOrderWindowType that = ((ChangeOrderWindowType) object);
        {
            Duration lhsCancelOrderWindow;
            lhsCancelOrderWindow = this.getCancelOrderWindow();
            Duration rhsCancelOrderWindow;
            rhsCancelOrderWindow = that.getCancelOrderWindow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cancelOrderWindow", lhsCancelOrderWindow), LocatorUtils.property(thatLocator, "cancelOrderWindow", rhsCancelOrderWindow), lhsCancelOrderWindow, rhsCancelOrderWindow, (this.cancelOrderWindow!= null), (that.cancelOrderWindow!= null))) {
                return false;
            }
        }
        {
            Duration lhsChangeOrderWindow;
            lhsChangeOrderWindow = this.getChangeOrderWindow();
            Duration rhsChangeOrderWindow;
            rhsChangeOrderWindow = that.getChangeOrderWindow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeOrderWindow", lhsChangeOrderWindow), LocatorUtils.property(thatLocator, "changeOrderWindow", rhsChangeOrderWindow), lhsChangeOrderWindow, rhsChangeOrderWindow, (this.changeOrderWindow!= null), (that.changeOrderWindow!= null))) {
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
            Duration theCancelOrderWindow;
            theCancelOrderWindow = this.getCancelOrderWindow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cancelOrderWindow", theCancelOrderWindow), currentHashCode, theCancelOrderWindow, (this.cancelOrderWindow!= null));
        }
        {
            Duration theChangeOrderWindow;
            theChangeOrderWindow = this.getChangeOrderWindow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeOrderWindow", theChangeOrderWindow), currentHashCode, theChangeOrderWindow, (this.changeOrderWindow!= null));
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
            Duration theCancelOrderWindow;
            theCancelOrderWindow = this.getCancelOrderWindow();
            strategy.appendField(locator, this, "cancelOrderWindow", buffer, theCancelOrderWindow, (this.cancelOrderWindow!= null));
        }
        {
            Duration theChangeOrderWindow;
            theChangeOrderWindow = this.getChangeOrderWindow();
            strategy.appendField(locator, this, "changeOrderWindow", buffer, theChangeOrderWindow, (this.changeOrderWindow!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
