
package io.dscope.rosettanet.interchange.planningreleaseforecastnotification.v02_01;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ForecastIdentifierReference;
import io.dscope.rosettanet.interchange.codelist.planningreleaseforecasttransportevent.v01_02.PlanningReleaseForecastTransportEvent;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
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
 * <p>Java class for PlanningReleaseForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanningReleaseForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03}ForecastEvent" minOccurs="0"/&gt;
 *         &lt;element name="ForecastGeneration" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ForecastIdentifierReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsFinalForecast" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PartnerProductForecast" type="{urn:rosettanet:specification:interchange:PlanningReleaseForecastNotification:xsd:schema:02.01}PartnerProductForecastType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PlanningReleaseForecastRevision" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:PlanningReleaseForecastTransportEvent:xsd:codelist:01.02}PlanningReleaseForecastTransportEvent"/&gt;
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
@XmlType(name = "PlanningReleaseForecastType", propOrder = {
    "forecastEvent",
    "forecastGeneration",
    "forecastIdentifierReference",
    "isFinalForecast",
    "partnerProductForecast",
    "planningReleaseForecastRevision",
    "planningReleaseForecastTransportEvent"
})
public class PlanningReleaseForecastType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ForecastEvent", namespace = "urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03", type = ForecastEvent.class, required = false)
    protected ForecastEvent forecastEvent;
    @XmlElement(name = "ForecastGeneration", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar forecastGeneration;
    @XmlElementRef(name = "ForecastIdentifierReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = ForecastIdentifierReference.class, required = false)
    protected List<ForecastIdentifierReference> forecastIdentifierReference;
    @XmlElement(name = "IsFinalForecast")
    protected boolean isFinalForecast;
    @XmlElement(name = "PartnerProductForecast", required = true)
    protected List<PartnerProductForecastType> partnerProductForecast;
    @XmlElement(name = "PlanningReleaseForecastRevision")
    protected BusinessDocumentReferenceType planningReleaseForecastRevision;
    @XmlElementRef(name = "PlanningReleaseForecastTransportEvent", namespace = "urn:rosettanet:specification:interchange:PlanningReleaseForecastTransportEvent:xsd:codelist:01.02", type = PlanningReleaseForecastTransportEvent.class)
    protected PlanningReleaseForecastTransportEvent planningReleaseForecastTransportEvent;
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
     * Gets the value of the isFinalForecast property.
     * 
     */
    public boolean isIsFinalForecast() {
        return isFinalForecast;
    }

    /**
     * Sets the value of the isFinalForecast property.
     * 
     */
    public void setIsFinalForecast(boolean value) {
        this.isFinalForecast = value;
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
     * Gets the value of the planningReleaseForecastRevision property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPlanningReleaseForecastRevision() {
        return planningReleaseForecastRevision;
    }

    /**
     * Sets the value of the planningReleaseForecastRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPlanningReleaseForecastRevision(BusinessDocumentReferenceType value) {
        this.planningReleaseForecastRevision = value;
    }

    /**
     * Gets the value of the planningReleaseForecastTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link PlanningReleaseForecastTransportEvent }
     *     
     */
    public PlanningReleaseForecastTransportEvent getPlanningReleaseForecastTransportEvent() {
        return planningReleaseForecastTransportEvent;
    }

    /**
     * Sets the value of the planningReleaseForecastTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanningReleaseForecastTransportEvent }
     *     
     */
    public void setPlanningReleaseForecastTransportEvent(PlanningReleaseForecastTransportEvent value) {
        this.planningReleaseForecastTransportEvent = value;
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
        final PlanningReleaseForecastType that = ((PlanningReleaseForecastType) object);
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
            boolean lhsIsFinalForecast;
            lhsIsFinalForecast = this.isIsFinalForecast();
            boolean rhsIsFinalForecast;
            rhsIsFinalForecast = that.isIsFinalForecast();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isFinalForecast", lhsIsFinalForecast), LocatorUtils.property(thatLocator, "isFinalForecast", rhsIsFinalForecast), lhsIsFinalForecast, rhsIsFinalForecast, true, true)) {
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
            BusinessDocumentReferenceType lhsPlanningReleaseForecastRevision;
            lhsPlanningReleaseForecastRevision = this.getPlanningReleaseForecastRevision();
            BusinessDocumentReferenceType rhsPlanningReleaseForecastRevision;
            rhsPlanningReleaseForecastRevision = that.getPlanningReleaseForecastRevision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "planningReleaseForecastRevision", lhsPlanningReleaseForecastRevision), LocatorUtils.property(thatLocator, "planningReleaseForecastRevision", rhsPlanningReleaseForecastRevision), lhsPlanningReleaseForecastRevision, rhsPlanningReleaseForecastRevision, (this.planningReleaseForecastRevision!= null), (that.planningReleaseForecastRevision!= null))) {
                return false;
            }
        }
        {
            PlanningReleaseForecastTransportEvent lhsPlanningReleaseForecastTransportEvent;
            lhsPlanningReleaseForecastTransportEvent = this.getPlanningReleaseForecastTransportEvent();
            PlanningReleaseForecastTransportEvent rhsPlanningReleaseForecastTransportEvent;
            rhsPlanningReleaseForecastTransportEvent = that.getPlanningReleaseForecastTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "planningReleaseForecastTransportEvent", lhsPlanningReleaseForecastTransportEvent), LocatorUtils.property(thatLocator, "planningReleaseForecastTransportEvent", rhsPlanningReleaseForecastTransportEvent), lhsPlanningReleaseForecastTransportEvent, rhsPlanningReleaseForecastTransportEvent, (this.planningReleaseForecastTransportEvent!= null), (that.planningReleaseForecastTransportEvent!= null))) {
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
            boolean theIsFinalForecast;
            theIsFinalForecast = this.isIsFinalForecast();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isFinalForecast", theIsFinalForecast), currentHashCode, theIsFinalForecast, true);
        }
        {
            List<PartnerProductForecastType> thePartnerProductForecast;
            thePartnerProductForecast = (((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty()))?this.getPartnerProductForecast():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerProductForecast", thePartnerProductForecast), currentHashCode, thePartnerProductForecast, ((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty())));
        }
        {
            BusinessDocumentReferenceType thePlanningReleaseForecastRevision;
            thePlanningReleaseForecastRevision = this.getPlanningReleaseForecastRevision();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "planningReleaseForecastRevision", thePlanningReleaseForecastRevision), currentHashCode, thePlanningReleaseForecastRevision, (this.planningReleaseForecastRevision!= null));
        }
        {
            PlanningReleaseForecastTransportEvent thePlanningReleaseForecastTransportEvent;
            thePlanningReleaseForecastTransportEvent = this.getPlanningReleaseForecastTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "planningReleaseForecastTransportEvent", thePlanningReleaseForecastTransportEvent), currentHashCode, thePlanningReleaseForecastTransportEvent, (this.planningReleaseForecastTransportEvent!= null));
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
            boolean theIsFinalForecast;
            theIsFinalForecast = this.isIsFinalForecast();
            strategy.appendField(locator, this, "isFinalForecast", buffer, theIsFinalForecast, true);
        }
        {
            List<PartnerProductForecastType> thePartnerProductForecast;
            thePartnerProductForecast = (((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty()))?this.getPartnerProductForecast():null);
            strategy.appendField(locator, this, "partnerProductForecast", buffer, thePartnerProductForecast, ((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty())));
        }
        {
            BusinessDocumentReferenceType thePlanningReleaseForecastRevision;
            thePlanningReleaseForecastRevision = this.getPlanningReleaseForecastRevision();
            strategy.appendField(locator, this, "planningReleaseForecastRevision", buffer, thePlanningReleaseForecastRevision, (this.planningReleaseForecastRevision!= null));
        }
        {
            PlanningReleaseForecastTransportEvent thePlanningReleaseForecastTransportEvent;
            thePlanningReleaseForecastTransportEvent = this.getPlanningReleaseForecastTransportEvent();
            strategy.appendField(locator, this, "planningReleaseForecastTransportEvent", buffer, thePlanningReleaseForecastTransportEvent, (this.planningReleaseForecastTransportEvent!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
