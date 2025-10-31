
package io.dscope.rosettanet.domain.logistics.logistics.v01_05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.returnlabelcode.v01_02.ReturnLabelCode;
import io.dscope.rosettanet.universal.partneridentification.v01_03.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for ReturnLabelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnLabelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.03}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:01.02}ReturnLabelCode"/&gt;
 *         &lt;element name="ReturnTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.03}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.05}TrackingReference" minOccurs="0"/&gt;
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
@XmlType(name = "ReturnLabelType", propOrder = {
    "returnBy",
    "returnLabelCode",
    "returnTo",
    "trackingReference"
})
public class ReturnLabelType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ReturnBy")
    protected SpecifiedPartnerDescriptionType returnBy;
    @XmlElementRef(name = "ReturnLabelCode", namespace = "urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:01.02", type = ReturnLabelCode.class)
    protected ReturnLabelCode returnLabelCode;
    @XmlElement(name = "ReturnTo")
    protected SpecifiedPartnerDescriptionType returnTo;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.05", type = TrackingReference.class, required = false)
    protected TrackingReference trackingReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the returnBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getReturnBy() {
        return returnBy;
    }

    /**
     * Sets the value of the returnBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setReturnBy(SpecifiedPartnerDescriptionType value) {
        this.returnBy = value;
    }

    /**
     * Gets the value of the returnLabelCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnLabelCode }
     *     
     */
    public ReturnLabelCode getReturnLabelCode() {
        return returnLabelCode;
    }

    /**
     * Sets the value of the returnLabelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnLabelCode }
     *     
     */
    public void setReturnLabelCode(ReturnLabelCode value) {
        this.returnLabelCode = value;
    }

    /**
     * Gets the value of the returnTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getReturnTo() {
        return returnTo;
    }

    /**
     * Sets the value of the returnTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setReturnTo(SpecifiedPartnerDescriptionType value) {
        this.returnTo = value;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingReference }
     *     
     */
    public TrackingReference getTrackingReference() {
        return trackingReference;
    }

    /**
     * Sets the value of the trackingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingReference }
     *     
     */
    public void setTrackingReference(TrackingReference value) {
        this.trackingReference = value;
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
        final ReturnLabelType that = ((ReturnLabelType) object);
        {
            SpecifiedPartnerDescriptionType lhsReturnBy;
            lhsReturnBy = this.getReturnBy();
            SpecifiedPartnerDescriptionType rhsReturnBy;
            rhsReturnBy = that.getReturnBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "returnBy", lhsReturnBy), LocatorUtils.property(thatLocator, "returnBy", rhsReturnBy), lhsReturnBy, rhsReturnBy, (this.returnBy!= null), (that.returnBy!= null))) {
                return false;
            }
        }
        {
            ReturnLabelCode lhsReturnLabelCode;
            lhsReturnLabelCode = this.getReturnLabelCode();
            ReturnLabelCode rhsReturnLabelCode;
            rhsReturnLabelCode = that.getReturnLabelCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "returnLabelCode", lhsReturnLabelCode), LocatorUtils.property(thatLocator, "returnLabelCode", rhsReturnLabelCode), lhsReturnLabelCode, rhsReturnLabelCode, (this.returnLabelCode!= null), (that.returnLabelCode!= null))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsReturnTo;
            lhsReturnTo = this.getReturnTo();
            SpecifiedPartnerDescriptionType rhsReturnTo;
            rhsReturnTo = that.getReturnTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "returnTo", lhsReturnTo), LocatorUtils.property(thatLocator, "returnTo", rhsReturnTo), lhsReturnTo, rhsReturnTo, (this.returnTo!= null), (that.returnTo!= null))) {
                return false;
            }
        }
        {
            TrackingReference lhsTrackingReference;
            lhsTrackingReference = this.getTrackingReference();
            TrackingReference rhsTrackingReference;
            rhsTrackingReference = that.getTrackingReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingReference", lhsTrackingReference), LocatorUtils.property(thatLocator, "trackingReference", rhsTrackingReference), lhsTrackingReference, rhsTrackingReference, (this.trackingReference!= null), (that.trackingReference!= null))) {
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
            SpecifiedPartnerDescriptionType theReturnBy;
            theReturnBy = this.getReturnBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnBy", theReturnBy), currentHashCode, theReturnBy, (this.returnBy!= null));
        }
        {
            ReturnLabelCode theReturnLabelCode;
            theReturnLabelCode = this.getReturnLabelCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnLabelCode", theReturnLabelCode), currentHashCode, theReturnLabelCode, (this.returnLabelCode!= null));
        }
        {
            SpecifiedPartnerDescriptionType theReturnTo;
            theReturnTo = this.getReturnTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnTo", theReturnTo), currentHashCode, theReturnTo, (this.returnTo!= null));
        }
        {
            TrackingReference theTrackingReference;
            theTrackingReference = this.getTrackingReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingReference", theTrackingReference), currentHashCode, theTrackingReference, (this.trackingReference!= null));
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
            SpecifiedPartnerDescriptionType theReturnBy;
            theReturnBy = this.getReturnBy();
            strategy.appendField(locator, this, "returnBy", buffer, theReturnBy, (this.returnBy!= null));
        }
        {
            ReturnLabelCode theReturnLabelCode;
            theReturnLabelCode = this.getReturnLabelCode();
            strategy.appendField(locator, this, "returnLabelCode", buffer, theReturnLabelCode, (this.returnLabelCode!= null));
        }
        {
            SpecifiedPartnerDescriptionType theReturnTo;
            theReturnTo = this.getReturnTo();
            strategy.appendField(locator, this, "returnTo", buffer, theReturnTo, (this.returnTo!= null));
        }
        {
            TrackingReference theTrackingReference;
            theTrackingReference = this.getTrackingReference();
            strategy.appendField(locator, this, "trackingReference", buffer, theTrackingReference, (this.trackingReference!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
