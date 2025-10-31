
package io.dscope.rosettanet.interchange.strategicforecastnotification.v02_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ForecastIdentifierReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.IsFinalForecast;
import io.dscope.rosettanet.interchange.codelist.forecasttype.v01_01.ForecastType;
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
 * <p>Java class for StrategicForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategicForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03}ForecastEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ForecastIdentifierReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:ForecastType:xsd:codelist:01.01}ForecastType"/&gt;
 *         &lt;element name="GenerationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}IsFinalForecast"/&gt;
 *         &lt;element name="PartnerProductForecast" type="{urn:rosettanet:specification:interchange:StrategicForecastNotification:xsd:schema:02.00}PartnerProductForecastType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "StrategicForecastType", propOrder = {
    "forecastEvent",
    "forecastIdentifierReference",
    "forecastType",
    "generationDateTime",
    "isFinalForecast",
    "partnerProductForecast",
    "revisionNumber"
})
public class StrategicForecastType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ForecastEvent", namespace = "urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03", type = ForecastEvent.class, required = false)
    protected ForecastEvent forecastEvent;
    @XmlElementRef(name = "ForecastIdentifierReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ForecastIdentifierReference.class, required = false)
    protected List<ForecastIdentifierReference> forecastIdentifierReference;
    @XmlElementRef(name = "ForecastType", namespace = "urn:rosettanet:specification:interchange:ForecastType:xsd:codelist:01.01", type = ForecastType.class)
    protected ForecastType forecastType;
    @XmlElement(name = "GenerationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generationDateTime;
    @XmlElementRef(name = "IsFinalForecast", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = IsFinalForecast.class)
    protected IsFinalForecast isFinalForecast;
    @XmlElement(name = "PartnerProductForecast", required = true)
    protected List<PartnerProductForecastType> partnerProductForecast;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
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
     * Gets the value of the forecastType property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastType }
     *     
     */
    public ForecastType getForecastType() {
        return forecastType;
    }

    /**
     * Sets the value of the forecastType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastType }
     *     
     */
    public void setForecastType(ForecastType value) {
        this.forecastType = value;
    }

    /**
     * Gets the value of the generationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGenerationDateTime() {
        return generationDateTime;
    }

    /**
     * Sets the value of the generationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGenerationDateTime(XMLGregorianCalendar value) {
        this.generationDateTime = value;
    }

    /**
     * Gets the value of the isFinalForecast property.
     * 
     * @return
     *     possible object is
     *     {@link IsFinalForecast }
     *     
     */
    public IsFinalForecast getIsFinalForecast() {
        return isFinalForecast;
    }

    /**
     * Sets the value of the isFinalForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsFinalForecast }
     *     
     */
    public void setIsFinalForecast(IsFinalForecast value) {
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
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
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
        final StrategicForecastType that = ((StrategicForecastType) object);
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
            List<ForecastIdentifierReference> lhsForecastIdentifierReference;
            lhsForecastIdentifierReference = (((this.forecastIdentifierReference!= null)&&(!this.forecastIdentifierReference.isEmpty()))?this.getForecastIdentifierReference():null);
            List<ForecastIdentifierReference> rhsForecastIdentifierReference;
            rhsForecastIdentifierReference = (((that.forecastIdentifierReference!= null)&&(!that.forecastIdentifierReference.isEmpty()))?that.getForecastIdentifierReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastIdentifierReference", lhsForecastIdentifierReference), LocatorUtils.property(thatLocator, "forecastIdentifierReference", rhsForecastIdentifierReference), lhsForecastIdentifierReference, rhsForecastIdentifierReference, ((this.forecastIdentifierReference!= null)&&(!this.forecastIdentifierReference.isEmpty())), ((that.forecastIdentifierReference!= null)&&(!that.forecastIdentifierReference.isEmpty())))) {
                return false;
            }
        }
        {
            ForecastType lhsForecastType;
            lhsForecastType = this.getForecastType();
            ForecastType rhsForecastType;
            rhsForecastType = that.getForecastType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastType", lhsForecastType), LocatorUtils.property(thatLocator, "forecastType", rhsForecastType), lhsForecastType, rhsForecastType, (this.forecastType!= null), (that.forecastType!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsGenerationDateTime;
            lhsGenerationDateTime = this.getGenerationDateTime();
            XMLGregorianCalendar rhsGenerationDateTime;
            rhsGenerationDateTime = that.getGenerationDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "generationDateTime", lhsGenerationDateTime), LocatorUtils.property(thatLocator, "generationDateTime", rhsGenerationDateTime), lhsGenerationDateTime, rhsGenerationDateTime, (this.generationDateTime!= null), (that.generationDateTime!= null))) {
                return false;
            }
        }
        {
            IsFinalForecast lhsIsFinalForecast;
            lhsIsFinalForecast = this.getIsFinalForecast();
            IsFinalForecast rhsIsFinalForecast;
            rhsIsFinalForecast = that.getIsFinalForecast();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isFinalForecast", lhsIsFinalForecast), LocatorUtils.property(thatLocator, "isFinalForecast", rhsIsFinalForecast), lhsIsFinalForecast, rhsIsFinalForecast, (this.isFinalForecast!= null), (that.isFinalForecast!= null))) {
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
            String lhsRevisionNumber;
            lhsRevisionNumber = this.getRevisionNumber();
            String rhsRevisionNumber;
            rhsRevisionNumber = that.getRevisionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revisionNumber", lhsRevisionNumber), LocatorUtils.property(thatLocator, "revisionNumber", rhsRevisionNumber), lhsRevisionNumber, rhsRevisionNumber, (this.revisionNumber!= null), (that.revisionNumber!= null))) {
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
            List<ForecastIdentifierReference> theForecastIdentifierReference;
            theForecastIdentifierReference = (((this.forecastIdentifierReference!= null)&&(!this.forecastIdentifierReference.isEmpty()))?this.getForecastIdentifierReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastIdentifierReference", theForecastIdentifierReference), currentHashCode, theForecastIdentifierReference, ((this.forecastIdentifierReference!= null)&&(!this.forecastIdentifierReference.isEmpty())));
        }
        {
            ForecastType theForecastType;
            theForecastType = this.getForecastType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastType", theForecastType), currentHashCode, theForecastType, (this.forecastType!= null));
        }
        {
            XMLGregorianCalendar theGenerationDateTime;
            theGenerationDateTime = this.getGenerationDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "generationDateTime", theGenerationDateTime), currentHashCode, theGenerationDateTime, (this.generationDateTime!= null));
        }
        {
            IsFinalForecast theIsFinalForecast;
            theIsFinalForecast = this.getIsFinalForecast();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isFinalForecast", theIsFinalForecast), currentHashCode, theIsFinalForecast, (this.isFinalForecast!= null));
        }
        {
            List<PartnerProductForecastType> thePartnerProductForecast;
            thePartnerProductForecast = (((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty()))?this.getPartnerProductForecast():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerProductForecast", thePartnerProductForecast), currentHashCode, thePartnerProductForecast, ((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty())));
        }
        {
            String theRevisionNumber;
            theRevisionNumber = this.getRevisionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revisionNumber", theRevisionNumber), currentHashCode, theRevisionNumber, (this.revisionNumber!= null));
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
            List<ForecastIdentifierReference> theForecastIdentifierReference;
            theForecastIdentifierReference = (((this.forecastIdentifierReference!= null)&&(!this.forecastIdentifierReference.isEmpty()))?this.getForecastIdentifierReference():null);
            strategy.appendField(locator, this, "forecastIdentifierReference", buffer, theForecastIdentifierReference, ((this.forecastIdentifierReference!= null)&&(!this.forecastIdentifierReference.isEmpty())));
        }
        {
            ForecastType theForecastType;
            theForecastType = this.getForecastType();
            strategy.appendField(locator, this, "forecastType", buffer, theForecastType, (this.forecastType!= null));
        }
        {
            XMLGregorianCalendar theGenerationDateTime;
            theGenerationDateTime = this.getGenerationDateTime();
            strategy.appendField(locator, this, "generationDateTime", buffer, theGenerationDateTime, (this.generationDateTime!= null));
        }
        {
            IsFinalForecast theIsFinalForecast;
            theIsFinalForecast = this.getIsFinalForecast();
            strategy.appendField(locator, this, "isFinalForecast", buffer, theIsFinalForecast, (this.isFinalForecast!= null));
        }
        {
            List<PartnerProductForecastType> thePartnerProductForecast;
            thePartnerProductForecast = (((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty()))?this.getPartnerProductForecast():null);
            strategy.appendField(locator, this, "partnerProductForecast", buffer, thePartnerProductForecast, ((this.partnerProductForecast!= null)&&(!this.partnerProductForecast.isEmpty())));
        }
        {
            String theRevisionNumber;
            theRevisionNumber = this.getRevisionNumber();
            strategy.appendField(locator, this, "revisionNumber", buffer, theRevisionNumber, (this.revisionNumber!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
