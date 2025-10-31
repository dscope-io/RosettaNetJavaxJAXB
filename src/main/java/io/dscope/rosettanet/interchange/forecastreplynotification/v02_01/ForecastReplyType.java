
package io.dscope.rosettanet.interchange.forecastreplynotification.v02_01;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.procurement.codelist.forecastevent.v01_03.ForecastEvent;
import io.dscope.rosettanet.domain.procurement.codelist.transportevent.v01_03.TransportEvent;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ForecastIdentifierReference;
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
 * <p>Java class for ForecastReplyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastReplyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03}ForecastEvent" minOccurs="0"/&gt;
 *         &lt;element name="ForecastGeneration" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ForecastIdentifierReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsForecastFinal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PartnerProductForecast" type="{urn:rosettanet:specification:interchange:ForecastReplyNotification:xsd:schema:02.01}PartnerProductForecastType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PreviousForecastNotification" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PreviousIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03}TransportEvent" minOccurs="0"/&gt;
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
@XmlType(name = "ForecastReplyType", propOrder = {
    "forecastEvent",
    "forecastGeneration",
    "forecastIdentifierReference",
    "isForecastFinal",
    "partnerProductForecast",
    "previousForecastNotification",
    "previousIdentifier",
    "previousRevision",
    "revision",
    "transportEvent"
})
public class ForecastReplyType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ForecastEvent", namespace = "urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03", type = ForecastEvent.class, required = false)
    protected ForecastEvent forecastEvent;
    @XmlElement(name = "ForecastGeneration", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar forecastGeneration;
    @XmlElementRef(name = "ForecastIdentifierReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = ForecastIdentifierReference.class, required = false)
    protected List<ForecastIdentifierReference> forecastIdentifierReference;
    @XmlElement(name = "IsForecastFinal")
    protected Boolean isForecastFinal;
    @XmlElement(name = "PartnerProductForecast", required = true)
    protected List<PartnerProductForecastType> partnerProductForecast;
    @XmlElement(name = "PreviousForecastNotification")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar previousForecastNotification;
    @XmlElement(name = "PreviousIdentifier")
    protected String previousIdentifier;
    @XmlElement(name = "PreviousRevision")
    protected String previousRevision;
    @XmlElement(name = "Revision")
    protected String revision;
    @XmlElementRef(name = "TransportEvent", namespace = "urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03", type = TransportEvent.class, required = false)
    protected TransportEvent transportEvent;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the forecastEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastEvent }
     *     
     */
    public ForecastEvent getForecastEvent() {
        return forecastEvent;
    }

    /**
     * Sets the value of the forecastEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastEvent }
     *     
     */
    public void setForecastEvent(ForecastEvent value) {
        this.forecastEvent = value;
    }

    /**
     * Gets the value of the forecastGeneration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForecastGeneration() {
        return forecastGeneration;
    }

    /**
     * Sets the value of the forecastGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForecastGeneration(XMLGregorianCalendar value) {
        this.forecastGeneration = value;
    }

    /**
     * Gets the value of the forecastIdentifierReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastIdentifierReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastIdentifierReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastIdentifierReference }
     * 
     * 
     */
    public List<ForecastIdentifierReference> getForecastIdentifierReference() {
        if (forecastIdentifierReference == null) {
            forecastIdentifierReference = new ArrayList<ForecastIdentifierReference>();
        }
        return this.forecastIdentifierReference;
    }

    /**
     * Gets the value of the isForecastFinal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsForecastFinal() {
        return isForecastFinal;
    }

    /**
     * Sets the value of the isForecastFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsForecastFinal(Boolean value) {
        this.isForecastFinal = value;
    }

    /**
     * Gets the value of the partnerProductForecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerProductForecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerProductForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerProductForecastType }
     * 
     * 
     */
    public List<PartnerProductForecastType> getPartnerProductForecast() {
        if (partnerProductForecast == null) {
            partnerProductForecast = new ArrayList<PartnerProductForecastType>();
        }
        return this.partnerProductForecast;
    }

    /**
     * Gets the value of the previousForecastNotification property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreviousForecastNotification() {
        return previousForecastNotification;
    }

    /**
     * Sets the value of the previousForecastNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreviousForecastNotification(XMLGregorianCalendar value) {
        this.previousForecastNotification = value;
    }

    /**
     * Gets the value of the previousIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousIdentifier() {
        return previousIdentifier;
    }

    /**
     * Sets the value of the previousIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousIdentifier(String value) {
        this.previousIdentifier = value;
    }

    /**
     * Gets the value of the previousRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousRevision() {
        return previousRevision;
    }

    /**
     * Sets the value of the previousRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousRevision(String value) {
        this.previousRevision = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the transportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEvent }
     *     
     */
    public TransportEvent getTransportEvent() {
        return transportEvent;
    }

    /**
     * Sets the value of the transportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEvent }
     *     
     */
    public void setTransportEvent(TransportEvent value) {
        this.transportEvent = value;
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
        final ForecastReplyType that = ((ForecastReplyType) object);
        {
            ForecastEvent lhsForecastEvent;
            lhsForecastEvent = this.getForecastEvent();
            ForecastEvent rhsForecastEvent;
            rhsForecastEvent = that.getForecastEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastEvent", lhsForecastEvent), LocatorUtils.property(thatLocator, "forecastEvent", rhsForecastEvent), lhsForecastEvent, rhsForecastEvent, (this.forecastEvent!= null), (that.forecastEvent!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsForecastGeneration;
            lhsForecastGeneration = this.getForecastGeneration();
            XMLGregorianCalendar rhsForecastGeneration;
            rhsForecastGeneration = that.getForecastGeneration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastGeneration", lhsForecastGeneration), LocatorUtils.property(thatLocator, "forecastGeneration", rhsForecastGeneration), lhsForecastGeneration, rhsForecastGeneration, (this.forecastGeneration!= null), (that.forecastGeneration!= null))) {
                return false;
            }
        }
        {
            List<ForecastIdentifierReference> lhsForecastIdentifierReference;
            lhsForecastIdentifierReference = (((this.forecastIdentifierReference!= null)&&(!this.forecastIdentifierReference.isEmpty()))?this.getForecastIdentifierReference():null);
            List<ForecastIdentifierReference> rhsForecastIdentifierReference;
            rhsForecastIdentifierReference = (((that.forecastIdentifierReference!= null)&&(!that.forecastIdentifierReference.isEmpty()))?that.getForecastIdentifierReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastIdentifierReference", lhsForecastIdentifierReference), LocatorUtils.property(thatLocator, "forecastIdentifierReference", rhsForecastIdentifierReference), lhsForecastIdentifierReference, rhsForecastIdentifierReference, ((this.forecastIdentifierReference!= null)&&(!this.forecastIdentifierReference.isEmpty())), ((that.forecastIdentifierReference!= null)&&(!that.forecastIdentifierReference.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsIsForecastFinal;
            lhsIsForecastFinal = this.isIsForecastFinal();
            Boolean rhsIsForecastFinal;
            rhsIsForecastFinal = that.isIsForecastFinal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isForecastFinal", lhsIsForecastFinal), LocatorUtils.property(thatLocator, "isForecastFinal", rhsIsForecastFinal), lhsIsForecastFinal, rhsIsForecastFinal, (this.isForecastFinal!= null), (that.isForecastFinal!= null))) {
                return false;
            }
        }
        {
            List<PartnerProductForecastType> lhsPartnerProductForecast;
            lhsPartnerProductForecast = (((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty()))?this.getPartnerProductForecast():null);
            List<PartnerProductForecastType> rhsPartnerProductForecast;
            rhsPartnerProductForecast = (((that.partnerProductForecast!= null)&&(!that.partnerProductForecast.isEmpty()))?that.getPartnerProductForecast():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerProductForecast", lhsPartnerProductForecast), LocatorUtils.property(thatLocator, "partnerProductForecast", rhsPartnerProductForecast), lhsPartnerProductForecast, rhsPartnerProductForecast, ((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty())), ((that.partnerProductForecast!= null)&&(!that.partnerProductForecast.isEmpty())))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsPreviousForecastNotification;
            lhsPreviousForecastNotification = this.getPreviousForecastNotification();
            XMLGregorianCalendar rhsPreviousForecastNotification;
            rhsPreviousForecastNotification = that.getPreviousForecastNotification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousForecastNotification", lhsPreviousForecastNotification), LocatorUtils.property(thatLocator, "previousForecastNotification", rhsPreviousForecastNotification), lhsPreviousForecastNotification, rhsPreviousForecastNotification, (this.previousForecastNotification!= null), (that.previousForecastNotification!= null))) {
                return false;
            }
        }
        {
            String lhsPreviousIdentifier;
            lhsPreviousIdentifier = this.getPreviousIdentifier();
            String rhsPreviousIdentifier;
            rhsPreviousIdentifier = that.getPreviousIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousIdentifier", lhsPreviousIdentifier), LocatorUtils.property(thatLocator, "previousIdentifier", rhsPreviousIdentifier), lhsPreviousIdentifier, rhsPreviousIdentifier, (this.previousIdentifier!= null), (that.previousIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsPreviousRevision;
            lhsPreviousRevision = this.getPreviousRevision();
            String rhsPreviousRevision;
            rhsPreviousRevision = that.getPreviousRevision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousRevision", lhsPreviousRevision), LocatorUtils.property(thatLocator, "previousRevision", rhsPreviousRevision), lhsPreviousRevision, rhsPreviousRevision, (this.previousRevision!= null), (that.previousRevision!= null))) {
                return false;
            }
        }
        {
            String lhsRevision;
            lhsRevision = this.getRevision();
            String rhsRevision;
            rhsRevision = that.getRevision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revision", lhsRevision), LocatorUtils.property(thatLocator, "revision", rhsRevision), lhsRevision, rhsRevision, (this.revision!= null), (that.revision!= null))) {
                return false;
            }
        }
        {
            TransportEvent lhsTransportEvent;
            lhsTransportEvent = this.getTransportEvent();
            TransportEvent rhsTransportEvent;
            rhsTransportEvent = that.getTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportEvent", lhsTransportEvent), LocatorUtils.property(thatLocator, "transportEvent", rhsTransportEvent), lhsTransportEvent, rhsTransportEvent, (this.transportEvent!= null), (that.transportEvent!= null))) {
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
            ForecastEvent theForecastEvent;
            theForecastEvent = this.getForecastEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastEvent", theForecastEvent), currentHashCode, theForecastEvent, (this.forecastEvent!= null));
        }
        {
            XMLGregorianCalendar theForecastGeneration;
            theForecastGeneration = this.getForecastGeneration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastGeneration", theForecastGeneration), currentHashCode, theForecastGeneration, (this.forecastGeneration!= null));
        }
        {
            List<ForecastIdentifierReference> theForecastIdentifierReference;
            theForecastIdentifierReference = (((this.forecastIdentifierReference!= null)&&(!this.forecastIdentifierReference.isEmpty()))?this.getForecastIdentifierReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastIdentifierReference", theForecastIdentifierReference), currentHashCode, theForecastIdentifierReference, ((this.forecastIdentifierReference!= null)&&(!this.forecastIdentifierReference.isEmpty())));
        }
        {
            Boolean theIsForecastFinal;
            theIsForecastFinal = this.isIsForecastFinal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isForecastFinal", theIsForecastFinal), currentHashCode, theIsForecastFinal, (this.isForecastFinal!= null));
        }
        {
            List<PartnerProductForecastType> thePartnerProductForecast;
            thePartnerProductForecast = (((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty()))?this.getPartnerProductForecast():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerProductForecast", thePartnerProductForecast), currentHashCode, thePartnerProductForecast, ((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty())));
        }
        {
            XMLGregorianCalendar thePreviousForecastNotification;
            thePreviousForecastNotification = this.getPreviousForecastNotification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousForecastNotification", thePreviousForecastNotification), currentHashCode, thePreviousForecastNotification, (this.previousForecastNotification!= null));
        }
        {
            String thePreviousIdentifier;
            thePreviousIdentifier = this.getPreviousIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousIdentifier", thePreviousIdentifier), currentHashCode, thePreviousIdentifier, (this.previousIdentifier!= null));
        }
        {
            String thePreviousRevision;
            thePreviousRevision = this.getPreviousRevision();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousRevision", thePreviousRevision), currentHashCode, thePreviousRevision, (this.previousRevision!= null));
        }
        {
            String theRevision;
            theRevision = this.getRevision();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revision", theRevision), currentHashCode, theRevision, (this.revision!= null));
        }
        {
            TransportEvent theTransportEvent;
            theTransportEvent = this.getTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportEvent", theTransportEvent), currentHashCode, theTransportEvent, (this.transportEvent!= null));
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
            ForecastEvent theForecastEvent;
            theForecastEvent = this.getForecastEvent();
            strategy.appendField(locator, this, "forecastEvent", buffer, theForecastEvent, (this.forecastEvent!= null));
        }
        {
            XMLGregorianCalendar theForecastGeneration;
            theForecastGeneration = this.getForecastGeneration();
            strategy.appendField(locator, this, "forecastGeneration", buffer, theForecastGeneration, (this.forecastGeneration!= null));
        }
        {
            List<ForecastIdentifierReference> theForecastIdentifierReference;
            theForecastIdentifierReference = (((this.forecastIdentifierReference!= null)&&(!this.forecastIdentifierReference.isEmpty()))?this.getForecastIdentifierReference():null);
            strategy.appendField(locator, this, "forecastIdentifierReference", buffer, theForecastIdentifierReference, ((this.forecastIdentifierReference!= null)&&(!this.forecastIdentifierReference.isEmpty())));
        }
        {
            Boolean theIsForecastFinal;
            theIsForecastFinal = this.isIsForecastFinal();
            strategy.appendField(locator, this, "isForecastFinal", buffer, theIsForecastFinal, (this.isForecastFinal!= null));
        }
        {
            List<PartnerProductForecastType> thePartnerProductForecast;
            thePartnerProductForecast = (((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty()))?this.getPartnerProductForecast():null);
            strategy.appendField(locator, this, "partnerProductForecast", buffer, thePartnerProductForecast, ((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty())));
        }
        {
            XMLGregorianCalendar thePreviousForecastNotification;
            thePreviousForecastNotification = this.getPreviousForecastNotification();
            strategy.appendField(locator, this, "previousForecastNotification", buffer, thePreviousForecastNotification, (this.previousForecastNotification!= null));
        }
        {
            String thePreviousIdentifier;
            thePreviousIdentifier = this.getPreviousIdentifier();
            strategy.appendField(locator, this, "previousIdentifier", buffer, thePreviousIdentifier, (this.previousIdentifier!= null));
        }
        {
            String thePreviousRevision;
            thePreviousRevision = this.getPreviousRevision();
            strategy.appendField(locator, this, "previousRevision", buffer, thePreviousRevision, (this.previousRevision!= null));
        }
        {
            String theRevision;
            theRevision = this.getRevision();
            strategy.appendField(locator, this, "revision", buffer, theRevision, (this.revision!= null));
        }
        {
            TransportEvent theTransportEvent;
            theTransportEvent = this.getTransportEvent();
            strategy.appendField(locator, this, "transportEvent", buffer, theTransportEvent, (this.transportEvent!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
