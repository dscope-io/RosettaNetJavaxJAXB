
package io.dscope.rosettanet.interchange.caseconfirmationnotification.v02_02;

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
import io.dscope.rosettanet.domain.service.service.v02_20.Part;
import io.dscope.rosettanet.domain.service.service.v02_20.ServiceInformation;
import io.dscope.rosettanet.domain.service.service.v02_20.Update;
import io.dscope.rosettanet.universal.partneridentification.v01_16.FullPartnerType;
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
 * <p>Java class for ServiceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosticCapabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Generation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GPSLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallationSite" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}FullPartnerType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}Part" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}ServiceInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}Update" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceDetailType", propOrder = {
    "accessDescription",
    "contractNumber",
    "diagnosticCapabilities",
    "endDate",
    "generation",
    "gpsLocation",
    "installationSite",
    "part",
    "serviceID",
    "serviceInformation",
    "serviceLevel",
    "startDate",
    "update"
})
public class ServiceDetailType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AccessDescription")
    protected String accessDescription;
    @XmlElement(name = "ContractNumber")
    protected String contractNumber;
    @XmlElement(name = "DiagnosticCapabilities")
    protected String diagnosticCapabilities;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Generation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generation;
    @XmlElement(name = "GPSLocation")
    protected String gpsLocation;
    @XmlElement(name = "InstallationSite")
    protected FullPartnerType installationSite;
    @XmlElementRef(name = "Part", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = Part.class, required = false)
    protected List<Part> part;
    @XmlElement(name = "ServiceID")
    protected String serviceID;
    @XmlElementRef(name = "ServiceInformation", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = ServiceInformation.class, required = false)
    protected List<ServiceInformation> serviceInformation;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElementRef(name = "Update", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = Update.class, required = false)
    protected Update update;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the accessDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessDescription() {
        return accessDescription;
    }

    /**
     * Sets the value of the accessDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessDescription(String value) {
        this.accessDescription = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the diagnosticCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticCapabilities() {
        return diagnosticCapabilities;
    }

    /**
     * Sets the value of the diagnosticCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticCapabilities(String value) {
        this.diagnosticCapabilities = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the generation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeneration() {
        return generation;
    }

    /**
     * Sets the value of the generation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeneration(XMLGregorianCalendar value) {
        this.generation = value;
    }

    /**
     * Gets the value of the gpsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPSLocation() {
        return gpsLocation;
    }

    /**
     * Sets the value of the gpsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPSLocation(String value) {
        this.gpsLocation = value;
    }

    /**
     * Gets the value of the installationSite property.
     * 
     * @return
     *     possible object is
     *     {@link FullPartnerType }
     *     
     */
    public FullPartnerType getInstallationSite() {
        return installationSite;
    }

    /**
     * Sets the value of the installationSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullPartnerType }
     *     
     */
    public void setInstallationSite(FullPartnerType value) {
        this.installationSite = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Part }
     * 
     * 
     */
    public List<Part> getPart() {
        if (part == null) {
            part = new ArrayList<Part>();
        }
        return this.part;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the serviceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceInformation }
     * 
     * 
     */
    public List<ServiceInformation> getServiceInformation() {
        if (serviceInformation == null) {
            serviceInformation = new ArrayList<ServiceInformation>();
        }
        return this.serviceInformation;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link Update }
     *     
     */
    public Update getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link Update }
     *     
     */
    public void setUpdate(Update value) {
        this.update = value;
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
        final ServiceDetailType that = ((ServiceDetailType) object);
        {
            String lhsAccessDescription;
            lhsAccessDescription = this.getAccessDescription();
            String rhsAccessDescription;
            rhsAccessDescription = that.getAccessDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessDescription", lhsAccessDescription), LocatorUtils.property(thatLocator, "accessDescription", rhsAccessDescription), lhsAccessDescription, rhsAccessDescription, (this.accessDescription!= null), (that.accessDescription!= null))) {
                return false;
            }
        }
        {
            String lhsContractNumber;
            lhsContractNumber = this.getContractNumber();
            String rhsContractNumber;
            rhsContractNumber = that.getContractNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractNumber", lhsContractNumber), LocatorUtils.property(thatLocator, "contractNumber", rhsContractNumber), lhsContractNumber, rhsContractNumber, (this.contractNumber!= null), (that.contractNumber!= null))) {
                return false;
            }
        }
        {
            String lhsDiagnosticCapabilities;
            lhsDiagnosticCapabilities = this.getDiagnosticCapabilities();
            String rhsDiagnosticCapabilities;
            rhsDiagnosticCapabilities = that.getDiagnosticCapabilities();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "diagnosticCapabilities", lhsDiagnosticCapabilities), LocatorUtils.property(thatLocator, "diagnosticCapabilities", rhsDiagnosticCapabilities), lhsDiagnosticCapabilities, rhsDiagnosticCapabilities, (this.diagnosticCapabilities!= null), (that.diagnosticCapabilities!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEndDate;
            lhsEndDate = this.getEndDate();
            XMLGregorianCalendar rhsEndDate;
            rhsEndDate = that.getEndDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDate", lhsEndDate), LocatorUtils.property(thatLocator, "endDate", rhsEndDate), lhsEndDate, rhsEndDate, (this.endDate!= null), (that.endDate!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsGeneration;
            lhsGeneration = this.getGeneration();
            XMLGregorianCalendar rhsGeneration;
            rhsGeneration = that.getGeneration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "generation", lhsGeneration), LocatorUtils.property(thatLocator, "generation", rhsGeneration), lhsGeneration, rhsGeneration, (this.generation!= null), (that.generation!= null))) {
                return false;
            }
        }
        {
            String lhsGPSLocation;
            lhsGPSLocation = this.getGPSLocation();
            String rhsGPSLocation;
            rhsGPSLocation = that.getGPSLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gpsLocation", lhsGPSLocation), LocatorUtils.property(thatLocator, "gpsLocation", rhsGPSLocation), lhsGPSLocation, rhsGPSLocation, (this.gpsLocation!= null), (that.gpsLocation!= null))) {
                return false;
            }
        }
        {
            FullPartnerType lhsInstallationSite;
            lhsInstallationSite = this.getInstallationSite();
            FullPartnerType rhsInstallationSite;
            rhsInstallationSite = that.getInstallationSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "installationSite", lhsInstallationSite), LocatorUtils.property(thatLocator, "installationSite", rhsInstallationSite), lhsInstallationSite, rhsInstallationSite, (this.installationSite!= null), (that.installationSite!= null))) {
                return false;
            }
        }
        {
            List<Part> lhsPart;
            lhsPart = (((this.part!= null)&&(!this.part.isEmpty()))?this.getPart():null);
            List<Part> rhsPart;
            rhsPart = (((that.part!= null)&&(!that.part.isEmpty()))?that.getPart():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "part", lhsPart), LocatorUtils.property(thatLocator, "part", rhsPart), lhsPart, rhsPart, ((this.part!= null)&&(!this.part.isEmpty())), ((that.part!= null)&&(!that.part.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsServiceID;
            lhsServiceID = this.getServiceID();
            String rhsServiceID;
            rhsServiceID = that.getServiceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceID", lhsServiceID), LocatorUtils.property(thatLocator, "serviceID", rhsServiceID), lhsServiceID, rhsServiceID, (this.serviceID!= null), (that.serviceID!= null))) {
                return false;
            }
        }
        {
            List<ServiceInformation> lhsServiceInformation;
            lhsServiceInformation = (((this.serviceInformation!= null)&&(!this.serviceInformation.isEmpty()))?this.getServiceInformation():null);
            List<ServiceInformation> rhsServiceInformation;
            rhsServiceInformation = (((that.serviceInformation!= null)&&(!that.serviceInformation.isEmpty()))?that.getServiceInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceInformation", lhsServiceInformation), LocatorUtils.property(thatLocator, "serviceInformation", rhsServiceInformation), lhsServiceInformation, rhsServiceInformation, ((this.serviceInformation!= null)&&(!this.serviceInformation.isEmpty())), ((that.serviceInformation!= null)&&(!that.serviceInformation.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsServiceLevel;
            lhsServiceLevel = this.getServiceLevel();
            String rhsServiceLevel;
            rhsServiceLevel = that.getServiceLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceLevel", lhsServiceLevel), LocatorUtils.property(thatLocator, "serviceLevel", rhsServiceLevel), lhsServiceLevel, rhsServiceLevel, (this.serviceLevel!= null), (that.serviceLevel!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsStartDate;
            lhsStartDate = this.getStartDate();
            XMLGregorianCalendar rhsStartDate;
            rhsStartDate = that.getStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate, (this.startDate!= null), (that.startDate!= null))) {
                return false;
            }
        }
        {
            Update lhsUpdate;
            lhsUpdate = this.getUpdate();
            Update rhsUpdate;
            rhsUpdate = that.getUpdate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "update", lhsUpdate), LocatorUtils.property(thatLocator, "update", rhsUpdate), lhsUpdate, rhsUpdate, (this.update!= null), (that.update!= null))) {
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
            String theAccessDescription;
            theAccessDescription = this.getAccessDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessDescription", theAccessDescription), currentHashCode, theAccessDescription, (this.accessDescription!= null));
        }
        {
            String theContractNumber;
            theContractNumber = this.getContractNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractNumber", theContractNumber), currentHashCode, theContractNumber, (this.contractNumber!= null));
        }
        {
            String theDiagnosticCapabilities;
            theDiagnosticCapabilities = this.getDiagnosticCapabilities();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "diagnosticCapabilities", theDiagnosticCapabilities), currentHashCode, theDiagnosticCapabilities, (this.diagnosticCapabilities!= null));
        }
        {
            XMLGregorianCalendar theEndDate;
            theEndDate = this.getEndDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDate", theEndDate), currentHashCode, theEndDate, (this.endDate!= null));
        }
        {
            XMLGregorianCalendar theGeneration;
            theGeneration = this.getGeneration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "generation", theGeneration), currentHashCode, theGeneration, (this.generation!= null));
        }
        {
            String theGPSLocation;
            theGPSLocation = this.getGPSLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gpsLocation", theGPSLocation), currentHashCode, theGPSLocation, (this.gpsLocation!= null));
        }
        {
            FullPartnerType theInstallationSite;
            theInstallationSite = this.getInstallationSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "installationSite", theInstallationSite), currentHashCode, theInstallationSite, (this.installationSite!= null));
        }
        {
            List<Part> thePart;
            thePart = (((this.part!= null)&&(!this.part.isEmpty()))?this.getPart():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "part", thePart), currentHashCode, thePart, ((this.part!= null)&&(!this.part.isEmpty())));
        }
        {
            String theServiceID;
            theServiceID = this.getServiceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceID", theServiceID), currentHashCode, theServiceID, (this.serviceID!= null));
        }
        {
            List<ServiceInformation> theServiceInformation;
            theServiceInformation = (((this.serviceInformation!= null)&&(!this.serviceInformation.isEmpty()))?this.getServiceInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceInformation", theServiceInformation), currentHashCode, theServiceInformation, ((this.serviceInformation!= null)&&(!this.serviceInformation.isEmpty())));
        }
        {
            String theServiceLevel;
            theServiceLevel = this.getServiceLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceLevel", theServiceLevel), currentHashCode, theServiceLevel, (this.serviceLevel!= null));
        }
        {
            XMLGregorianCalendar theStartDate;
            theStartDate = this.getStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDate", theStartDate), currentHashCode, theStartDate, (this.startDate!= null));
        }
        {
            Update theUpdate;
            theUpdate = this.getUpdate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "update", theUpdate), currentHashCode, theUpdate, (this.update!= null));
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
            String theAccessDescription;
            theAccessDescription = this.getAccessDescription();
            strategy.appendField(locator, this, "accessDescription", buffer, theAccessDescription, (this.accessDescription!= null));
        }
        {
            String theContractNumber;
            theContractNumber = this.getContractNumber();
            strategy.appendField(locator, this, "contractNumber", buffer, theContractNumber, (this.contractNumber!= null));
        }
        {
            String theDiagnosticCapabilities;
            theDiagnosticCapabilities = this.getDiagnosticCapabilities();
            strategy.appendField(locator, this, "diagnosticCapabilities", buffer, theDiagnosticCapabilities, (this.diagnosticCapabilities!= null));
        }
        {
            XMLGregorianCalendar theEndDate;
            theEndDate = this.getEndDate();
            strategy.appendField(locator, this, "endDate", buffer, theEndDate, (this.endDate!= null));
        }
        {
            XMLGregorianCalendar theGeneration;
            theGeneration = this.getGeneration();
            strategy.appendField(locator, this, "generation", buffer, theGeneration, (this.generation!= null));
        }
        {
            String theGPSLocation;
            theGPSLocation = this.getGPSLocation();
            strategy.appendField(locator, this, "gpsLocation", buffer, theGPSLocation, (this.gpsLocation!= null));
        }
        {
            FullPartnerType theInstallationSite;
            theInstallationSite = this.getInstallationSite();
            strategy.appendField(locator, this, "installationSite", buffer, theInstallationSite, (this.installationSite!= null));
        }
        {
            List<Part> thePart;
            thePart = (((this.part!= null)&&(!this.part.isEmpty()))?this.getPart():null);
            strategy.appendField(locator, this, "part", buffer, thePart, ((this.part!= null)&&(!this.part.isEmpty())));
        }
        {
            String theServiceID;
            theServiceID = this.getServiceID();
            strategy.appendField(locator, this, "serviceID", buffer, theServiceID, (this.serviceID!= null));
        }
        {
            List<ServiceInformation> theServiceInformation;
            theServiceInformation = (((this.serviceInformation!= null)&&(!this.serviceInformation.isEmpty()))?this.getServiceInformation():null);
            strategy.appendField(locator, this, "serviceInformation", buffer, theServiceInformation, ((this.serviceInformation!= null)&&(!this.serviceInformation.isEmpty())));
        }
        {
            String theServiceLevel;
            theServiceLevel = this.getServiceLevel();
            strategy.appendField(locator, this, "serviceLevel", buffer, theServiceLevel, (this.serviceLevel!= null));
        }
        {
            XMLGregorianCalendar theStartDate;
            theStartDate = this.getStartDate();
            strategy.appendField(locator, this, "startDate", buffer, theStartDate, (this.startDate!= null));
        }
        {
            Update theUpdate;
            theUpdate = this.getUpdate();
            strategy.appendField(locator, this, "update", buffer, theUpdate, (this.update!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
