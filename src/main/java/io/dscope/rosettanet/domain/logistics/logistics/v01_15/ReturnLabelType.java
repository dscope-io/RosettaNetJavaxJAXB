
package io.dscope.rosettanet.domain.logistics.logistics.v01_15;

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
import io.dscope.rosettanet.domain.logistics.codelist.returnlabelcode.v01_02.ReturnLabelCode;
import io.dscope.rosettanet.universal.partneridentification.v01_09.SpecifiedPartnerDescriptionType;
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
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PartIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.09}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.15}ReturnInstructions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:01.02}ReturnLabelCode"/&gt;
 *         &lt;element name="ReturnTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.09}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="RMAIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TagIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.15}TrackingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "dateTime",
    "partIdentifier",
    "returnBy",
    "returnInstructions",
    "returnLabelCode",
    "returnTo",
    "rmaIdentifier",
    "tagIdentifier",
    "trackingReference"
})
public class ReturnLabelType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "PartIdentifier")
    protected String partIdentifier;
    @XmlElement(name = "ReturnBy")
    protected SpecifiedPartnerDescriptionType returnBy;
    @XmlElementRef(name = "ReturnInstructions", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.15", type = ReturnInstructions.class, required = false)
    protected ReturnInstructions returnInstructions;
    @XmlElementRef(name = "ReturnLabelCode", namespace = "urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:01.02", type = ReturnLabelCode.class)
    protected ReturnLabelCode returnLabelCode;
    @XmlElement(name = "ReturnTo")
    protected SpecifiedPartnerDescriptionType returnTo;
    @XmlElement(name = "RMAIdentifier")
    protected String rmaIdentifier;
    @XmlElement(name = "TagIdentifier")
    protected String tagIdentifier;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.15", type = TrackingReference.class, required = false)
    protected List<TrackingReference> trackingReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the partIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartIdentifier() {
        return partIdentifier;
    }

    /**
     * Sets the value of the partIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartIdentifier(String value) {
        this.partIdentifier = value;
    }

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
     * Gets the value of the returnInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInstructions }
     *     
     */
    public ReturnInstructions getReturnInstructions() {
        return returnInstructions;
    }

    /**
     * Sets the value of the returnInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInstructions }
     *     
     */
    public void setReturnInstructions(ReturnInstructions value) {
        this.returnInstructions = value;
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
     * Gets the value of the rmaIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMAIdentifier() {
        return rmaIdentifier;
    }

    /**
     * Sets the value of the rmaIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMAIdentifier(String value) {
        this.rmaIdentifier = value;
    }

    /**
     * Gets the value of the tagIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagIdentifier() {
        return tagIdentifier;
    }

    /**
     * Sets the value of the tagIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagIdentifier(String value) {
        this.tagIdentifier = value;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingReference }
     * 
     * 
     */
    public List<TrackingReference> getTrackingReference() {
        if (trackingReference == null) {
            trackingReference = new ArrayList<TrackingReference>();
        }
        return this.trackingReference;
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
            XMLGregorianCalendar lhsDateTime;
            lhsDateTime = this.getDateTime();
            XMLGregorianCalendar rhsDateTime;
            rhsDateTime = that.getDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTime", lhsDateTime), LocatorUtils.property(thatLocator, "dateTime", rhsDateTime), lhsDateTime, rhsDateTime, (this.dateTime!= null), (that.dateTime!= null))) {
                return false;
            }
        }
        {
            String lhsPartIdentifier;
            lhsPartIdentifier = this.getPartIdentifier();
            String rhsPartIdentifier;
            rhsPartIdentifier = that.getPartIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partIdentifier", lhsPartIdentifier), LocatorUtils.property(thatLocator, "partIdentifier", rhsPartIdentifier), lhsPartIdentifier, rhsPartIdentifier, (this.partIdentifier!= null), (that.partIdentifier!= null))) {
                return false;
            }
        }
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
            ReturnInstructions lhsReturnInstructions;
            lhsReturnInstructions = this.getReturnInstructions();
            ReturnInstructions rhsReturnInstructions;
            rhsReturnInstructions = that.getReturnInstructions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "returnInstructions", lhsReturnInstructions), LocatorUtils.property(thatLocator, "returnInstructions", rhsReturnInstructions), lhsReturnInstructions, rhsReturnInstructions, (this.returnInstructions!= null), (that.returnInstructions!= null))) {
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
            String lhsRMAIdentifier;
            lhsRMAIdentifier = this.getRMAIdentifier();
            String rhsRMAIdentifier;
            rhsRMAIdentifier = that.getRMAIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rmaIdentifier", lhsRMAIdentifier), LocatorUtils.property(thatLocator, "rmaIdentifier", rhsRMAIdentifier), lhsRMAIdentifier, rhsRMAIdentifier, (this.rmaIdentifier!= null), (that.rmaIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsTagIdentifier;
            lhsTagIdentifier = this.getTagIdentifier();
            String rhsTagIdentifier;
            rhsTagIdentifier = that.getTagIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tagIdentifier", lhsTagIdentifier), LocatorUtils.property(thatLocator, "tagIdentifier", rhsTagIdentifier), lhsTagIdentifier, rhsTagIdentifier, (this.tagIdentifier!= null), (that.tagIdentifier!= null))) {
                return false;
            }
        }
        {
            List<TrackingReference> lhsTrackingReference;
            lhsTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            List<TrackingReference> rhsTrackingReference;
            rhsTrackingReference = (((that.trackingReference!= null)&&(!that.trackingReference.isEmpty()))?that.getTrackingReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingReference", lhsTrackingReference), LocatorUtils.property(thatLocator, "trackingReference", rhsTrackingReference), lhsTrackingReference, rhsTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())), ((that.trackingReference!= null)&&(!that.trackingReference.isEmpty())))) {
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
            XMLGregorianCalendar theDateTime;
            theDateTime = this.getDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateTime", theDateTime), currentHashCode, theDateTime, (this.dateTime!= null));
        }
        {
            String thePartIdentifier;
            thePartIdentifier = this.getPartIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partIdentifier", thePartIdentifier), currentHashCode, thePartIdentifier, (this.partIdentifier!= null));
        }
        {
            SpecifiedPartnerDescriptionType theReturnBy;
            theReturnBy = this.getReturnBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnBy", theReturnBy), currentHashCode, theReturnBy, (this.returnBy!= null));
        }
        {
            ReturnInstructions theReturnInstructions;
            theReturnInstructions = this.getReturnInstructions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnInstructions", theReturnInstructions), currentHashCode, theReturnInstructions, (this.returnInstructions!= null));
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
            String theRMAIdentifier;
            theRMAIdentifier = this.getRMAIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rmaIdentifier", theRMAIdentifier), currentHashCode, theRMAIdentifier, (this.rmaIdentifier!= null));
        }
        {
            String theTagIdentifier;
            theTagIdentifier = this.getTagIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tagIdentifier", theTagIdentifier), currentHashCode, theTagIdentifier, (this.tagIdentifier!= null));
        }
        {
            List<TrackingReference> theTrackingReference;
            theTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingReference", theTrackingReference), currentHashCode, theTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())));
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
            XMLGregorianCalendar theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime, (this.dateTime!= null));
        }
        {
            String thePartIdentifier;
            thePartIdentifier = this.getPartIdentifier();
            strategy.appendField(locator, this, "partIdentifier", buffer, thePartIdentifier, (this.partIdentifier!= null));
        }
        {
            SpecifiedPartnerDescriptionType theReturnBy;
            theReturnBy = this.getReturnBy();
            strategy.appendField(locator, this, "returnBy", buffer, theReturnBy, (this.returnBy!= null));
        }
        {
            ReturnInstructions theReturnInstructions;
            theReturnInstructions = this.getReturnInstructions();
            strategy.appendField(locator, this, "returnInstructions", buffer, theReturnInstructions, (this.returnInstructions!= null));
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
            String theRMAIdentifier;
            theRMAIdentifier = this.getRMAIdentifier();
            strategy.appendField(locator, this, "rmaIdentifier", buffer, theRMAIdentifier, (this.rmaIdentifier!= null));
        }
        {
            String theTagIdentifier;
            theTagIdentifier = this.getTagIdentifier();
            strategy.appendField(locator, this, "tagIdentifier", buffer, theTagIdentifier, (this.tagIdentifier!= null));
        }
        {
            List<TrackingReference> theTrackingReference;
            theTrackingReference = (((this.trackingReference!= null)&&(!this.trackingReference.isEmpty()))?this.getTrackingReference():null);
            strategy.appendField(locator, this, "trackingReference", buffer, theTrackingReference, ((this.trackingReference!= null)&&(!this.trackingReference.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
