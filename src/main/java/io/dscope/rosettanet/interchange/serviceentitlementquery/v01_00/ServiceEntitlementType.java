
package io.dscope.rosettanet.interchange.serviceentitlementquery.v01_00;

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
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
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
 * <p>Java class for ServiceEntitlementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceEntitlementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementQueryNotification:xsd:schema:01.00}EventInformationType" minOccurs="0"/&gt;
 *         &lt;element name="PartInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementQueryNotification:xsd:schema:01.00}PartInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element name="QueryConstraint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementQueryNotification:xsd:schema:01.00}UnitInformationType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ServiceEntitlementType", propOrder = {
    "eventInformation",
    "partInformation",
    "partnerDescription",
    "queryConstraint",
    "unitInformation"
})
public class ServiceEntitlementType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "EventInformation")
    protected EventInformationType eventInformation;
    @XmlElement(name = "PartInformation")
    protected List<PartInformationType> partInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElement(name = "QueryConstraint")
    protected String queryConstraint;
    @XmlElement(name = "UnitInformation", required = true)
    protected List<UnitInformationType> unitInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the eventInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EventInformationType }
     *     
     */
    public EventInformationType getEventInformation() {
        return eventInformation;
    }

    /**
     * Sets the value of the eventInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventInformationType }
     *     
     */
    public void setEventInformation(EventInformationType value) {
        this.eventInformation = value;
    }

    /**
     * Gets the value of the partInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartInformationType }
     * 
     * 
     */
    public List<PartInformationType> getPartInformation() {
        if (partInformation == null) {
            partInformation = new ArrayList<PartInformationType>();
        }
        return this.partInformation;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
    }

    /**
     * Gets the value of the queryConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryConstraint() {
        return queryConstraint;
    }

    /**
     * Sets the value of the queryConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryConstraint(String value) {
        this.queryConstraint = value;
    }

    /**
     * Gets the value of the unitInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitInformationType }
     * 
     * 
     */
    public List<UnitInformationType> getUnitInformation() {
        if (unitInformation == null) {
            unitInformation = new ArrayList<UnitInformationType>();
        }
        return this.unitInformation;
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
        final ServiceEntitlementType that = ((ServiceEntitlementType) object);
        {
            EventInformationType lhsEventInformation;
            lhsEventInformation = this.getEventInformation();
            EventInformationType rhsEventInformation;
            rhsEventInformation = that.getEventInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventInformation", lhsEventInformation), LocatorUtils.property(thatLocator, "eventInformation", rhsEventInformation), lhsEventInformation, rhsEventInformation, (this.eventInformation!= null), (that.eventInformation!= null))) {
                return false;
            }
        }
        {
            List<PartInformationType> lhsPartInformation;
            lhsPartInformation = (((this.partInformation!= null)&&(!this.partInformation.isEmpty()))?this.getPartInformation():null);
            List<PartInformationType> rhsPartInformation;
            rhsPartInformation = (((that.partInformation!= null)&&(!that.partInformation.isEmpty()))?that.getPartInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partInformation", lhsPartInformation), LocatorUtils.property(thatLocator, "partInformation", rhsPartInformation), lhsPartInformation, rhsPartInformation, ((this.partInformation!= null)&&(!this.partInformation.isEmpty())), ((that.partInformation!= null)&&(!that.partInformation.isEmpty())))) {
                return false;
            }
        }
        {
            PartnerDescription lhsPartnerDescription;
            lhsPartnerDescription = this.getPartnerDescription();
            PartnerDescription rhsPartnerDescription;
            rhsPartnerDescription = that.getPartnerDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, (this.partnerDescription!= null), (that.partnerDescription!= null))) {
                return false;
            }
        }
        {
            String lhsQueryConstraint;
            lhsQueryConstraint = this.getQueryConstraint();
            String rhsQueryConstraint;
            rhsQueryConstraint = that.getQueryConstraint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "queryConstraint", lhsQueryConstraint), LocatorUtils.property(thatLocator, "queryConstraint", rhsQueryConstraint), lhsQueryConstraint, rhsQueryConstraint, (this.queryConstraint!= null), (that.queryConstraint!= null))) {
                return false;
            }
        }
        {
            List<UnitInformationType> lhsUnitInformation;
            lhsUnitInformation = (((this.unitInformation!= null)&&(!this.unitInformation.isEmpty()))?this.getUnitInformation():null);
            List<UnitInformationType> rhsUnitInformation;
            rhsUnitInformation = (((that.unitInformation!= null)&&(!that.unitInformation.isEmpty()))?that.getUnitInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitInformation", lhsUnitInformation), LocatorUtils.property(thatLocator, "unitInformation", rhsUnitInformation), lhsUnitInformation, rhsUnitInformation, ((this.unitInformation!= null)&&(!this.unitInformation.isEmpty())), ((that.unitInformation!= null)&&(!that.unitInformation.isEmpty())))) {
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
            EventInformationType theEventInformation;
            theEventInformation = this.getEventInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventInformation", theEventInformation), currentHashCode, theEventInformation, (this.eventInformation!= null));
        }
        {
            List<PartInformationType> thePartInformation;
            thePartInformation = (((this.partInformation!= null)&&(!this.partInformation.isEmpty()))?this.getPartInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partInformation", thePartInformation), currentHashCode, thePartInformation, ((this.partInformation!= null)&&(!this.partInformation.isEmpty())));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            String theQueryConstraint;
            theQueryConstraint = this.getQueryConstraint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryConstraint", theQueryConstraint), currentHashCode, theQueryConstraint, (this.queryConstraint!= null));
        }
        {
            List<UnitInformationType> theUnitInformation;
            theUnitInformation = (((this.unitInformation!= null)&&(!this.unitInformation.isEmpty()))?this.getUnitInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitInformation", theUnitInformation), currentHashCode, theUnitInformation, ((this.unitInformation!= null)&&(!this.unitInformation.isEmpty())));
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
            EventInformationType theEventInformation;
            theEventInformation = this.getEventInformation();
            strategy.appendField(locator, this, "eventInformation", buffer, theEventInformation, (this.eventInformation!= null));
        }
        {
            List<PartInformationType> thePartInformation;
            thePartInformation = (((this.partInformation!= null)&&(!this.partInformation.isEmpty()))?this.getPartInformation():null);
            strategy.appendField(locator, this, "partInformation", buffer, thePartInformation, ((this.partInformation!= null)&&(!this.partInformation.isEmpty())));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            String theQueryConstraint;
            theQueryConstraint = this.getQueryConstraint();
            strategy.appendField(locator, this, "queryConstraint", buffer, theQueryConstraint, (this.queryConstraint!= null));
        }
        {
            List<UnitInformationType> theUnitInformation;
            theUnitInformation = (((this.unitInformation!= null)&&(!this.unitInformation.isEmpty()))?this.getUnitInformation():null);
            strategy.appendField(locator, this, "unitInformation", buffer, theUnitInformation, ((this.unitInformation!= null)&&(!this.unitInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
