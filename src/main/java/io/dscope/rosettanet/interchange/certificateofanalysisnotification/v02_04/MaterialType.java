
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for MaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Characteristic" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.04}CharacteristicType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ContainerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}FullPartnerType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ManufacturedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Packaging" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.04}PackagingType" minOccurs="0"/&gt;
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Requirement" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.04}RequirementType"/&gt;
 *         &lt;element name="SerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MaterialType", propOrder = {
    "analysisDate",
    "characteristic",
    "containerIdentifier",
    "description",
    "grade",
    "manufacturedBy",
    "manufacturedDate",
    "packaging",
    "partNumber",
    "requirement",
    "serialIdentifier"
})
public class MaterialType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AnalysisDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar analysisDate;
    @XmlElement(name = "Characteristic", required = true)
    protected List<CharacteristicType> characteristic;
    @XmlElement(name = "ContainerIdentifier")
    protected List<String> containerIdentifier;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Grade")
    protected String grade;
    @XmlElement(name = "ManufacturedBy", required = true)
    protected List<FullPartnerType> manufacturedBy;
    @XmlElement(name = "ManufacturedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar manufacturedDate;
    @XmlElement(name = "Packaging")
    protected PackagingType packaging;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "Requirement", required = true)
    protected RequirementType requirement;
    @XmlElement(name = "SerialIdentifier")
    protected List<String> serialIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the analysisDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnalysisDate() {
        return analysisDate;
    }

    /**
     * Sets the value of the analysisDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnalysisDate(XMLGregorianCalendar value) {
        this.analysisDate = value;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicType }
     * 
     * 
     */
    public List<CharacteristicType> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<CharacteristicType>();
        }
        return this.characteristic;
    }

    /**
     * Gets the value of the containerIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContainerIdentifier() {
        if (containerIdentifier == null) {
            containerIdentifier = new ArrayList<String>();
        }
        return this.containerIdentifier;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
    }

    /**
     * Gets the value of the manufacturedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullPartnerType }
     * 
     * 
     */
    public List<FullPartnerType> getManufacturedBy() {
        if (manufacturedBy == null) {
            manufacturedBy = new ArrayList<FullPartnerType>();
        }
        return this.manufacturedBy;
    }

    /**
     * Gets the value of the manufacturedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getManufacturedDate() {
        return manufacturedDate;
    }

    /**
     * Sets the value of the manufacturedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setManufacturedDate(XMLGregorianCalendar value) {
        this.manufacturedDate = value;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingType }
     *     
     */
    public PackagingType getPackaging() {
        return packaging;
    }

    /**
     * Sets the value of the packaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingType }
     *     
     */
    public void setPackaging(PackagingType value) {
        this.packaging = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * @return
     *     possible object is
     *     {@link RequirementType }
     *     
     */
    public RequirementType getRequirement() {
        return requirement;
    }

    /**
     * Sets the value of the requirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementType }
     *     
     */
    public void setRequirement(RequirementType value) {
        this.requirement = value;
    }

    /**
     * Gets the value of the serialIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSerialIdentifier() {
        if (serialIdentifier == null) {
            serialIdentifier = new ArrayList<String>();
        }
        return this.serialIdentifier;
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
        final MaterialType that = ((MaterialType) object);
        {
            XMLGregorianCalendar lhsAnalysisDate;
            lhsAnalysisDate = this.getAnalysisDate();
            XMLGregorianCalendar rhsAnalysisDate;
            rhsAnalysisDate = that.getAnalysisDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "analysisDate", lhsAnalysisDate), LocatorUtils.property(thatLocator, "analysisDate", rhsAnalysisDate), lhsAnalysisDate, rhsAnalysisDate, (this.analysisDate!= null), (that.analysisDate!= null))) {
                return false;
            }
        }
        {
            List<CharacteristicType> lhsCharacteristic;
            lhsCharacteristic = (((this.characteristic!= null)&&(!this.characteristic.isEmpty()))?this.getCharacteristic():null);
            List<CharacteristicType> rhsCharacteristic;
            rhsCharacteristic = (((that.characteristic!= null)&&(!that.characteristic.isEmpty()))?that.getCharacteristic():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "characteristic", lhsCharacteristic), LocatorUtils.property(thatLocator, "characteristic", rhsCharacteristic), lhsCharacteristic, rhsCharacteristic, ((this.characteristic!= null)&&(!this.characteristic.isEmpty())), ((that.characteristic!= null)&&(!that.characteristic.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsContainerIdentifier;
            lhsContainerIdentifier = (((this.containerIdentifier!= null)&&(!this.containerIdentifier.isEmpty()))?this.getContainerIdentifier():null);
            List<String> rhsContainerIdentifier;
            rhsContainerIdentifier = (((that.containerIdentifier!= null)&&(!that.containerIdentifier.isEmpty()))?that.getContainerIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containerIdentifier", lhsContainerIdentifier), LocatorUtils.property(thatLocator, "containerIdentifier", rhsContainerIdentifier), lhsContainerIdentifier, rhsContainerIdentifier, ((this.containerIdentifier!= null)&&(!this.containerIdentifier.isEmpty())), ((that.containerIdentifier!= null)&&(!that.containerIdentifier.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            String lhsGrade;
            lhsGrade = this.getGrade();
            String rhsGrade;
            rhsGrade = that.getGrade();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grade", lhsGrade), LocatorUtils.property(thatLocator, "grade", rhsGrade), lhsGrade, rhsGrade, (this.grade!= null), (that.grade!= null))) {
                return false;
            }
        }
        {
            List<FullPartnerType> lhsManufacturedBy;
            lhsManufacturedBy = (((this.manufacturedBy!= null)&&(!this.manufacturedBy.isEmpty()))?this.getManufacturedBy():null);
            List<FullPartnerType> rhsManufacturedBy;
            rhsManufacturedBy = (((that.manufacturedBy!= null)&&(!that.manufacturedBy.isEmpty()))?that.getManufacturedBy():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturedBy", lhsManufacturedBy), LocatorUtils.property(thatLocator, "manufacturedBy", rhsManufacturedBy), lhsManufacturedBy, rhsManufacturedBy, ((this.manufacturedBy!= null)&&(!this.manufacturedBy.isEmpty())), ((that.manufacturedBy!= null)&&(!that.manufacturedBy.isEmpty())))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsManufacturedDate;
            lhsManufacturedDate = this.getManufacturedDate();
            XMLGregorianCalendar rhsManufacturedDate;
            rhsManufacturedDate = that.getManufacturedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturedDate", lhsManufacturedDate), LocatorUtils.property(thatLocator, "manufacturedDate", rhsManufacturedDate), lhsManufacturedDate, rhsManufacturedDate, (this.manufacturedDate!= null), (that.manufacturedDate!= null))) {
                return false;
            }
        }
        {
            PackagingType lhsPackaging;
            lhsPackaging = this.getPackaging();
            PackagingType rhsPackaging;
            rhsPackaging = that.getPackaging();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packaging", lhsPackaging), LocatorUtils.property(thatLocator, "packaging", rhsPackaging), lhsPackaging, rhsPackaging, (this.packaging!= null), (that.packaging!= null))) {
                return false;
            }
        }
        {
            String lhsPartNumber;
            lhsPartNumber = this.getPartNumber();
            String rhsPartNumber;
            rhsPartNumber = that.getPartNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partNumber", lhsPartNumber), LocatorUtils.property(thatLocator, "partNumber", rhsPartNumber), lhsPartNumber, rhsPartNumber, (this.partNumber!= null), (that.partNumber!= null))) {
                return false;
            }
        }
        {
            RequirementType lhsRequirement;
            lhsRequirement = this.getRequirement();
            RequirementType rhsRequirement;
            rhsRequirement = that.getRequirement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requirement", lhsRequirement), LocatorUtils.property(thatLocator, "requirement", rhsRequirement), lhsRequirement, rhsRequirement, (this.requirement!= null), (that.requirement!= null))) {
                return false;
            }
        }
        {
            List<String> lhsSerialIdentifier;
            lhsSerialIdentifier = (((this.serialIdentifier!= null)&&(!this.serialIdentifier.isEmpty()))?this.getSerialIdentifier():null);
            List<String> rhsSerialIdentifier;
            rhsSerialIdentifier = (((that.serialIdentifier!= null)&&(!that.serialIdentifier.isEmpty()))?that.getSerialIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serialIdentifier", lhsSerialIdentifier), LocatorUtils.property(thatLocator, "serialIdentifier", rhsSerialIdentifier), lhsSerialIdentifier, rhsSerialIdentifier, ((this.serialIdentifier!= null)&&(!this.serialIdentifier.isEmpty())), ((that.serialIdentifier!= null)&&(!that.serialIdentifier.isEmpty())))) {
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
            XMLGregorianCalendar theAnalysisDate;
            theAnalysisDate = this.getAnalysisDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "analysisDate", theAnalysisDate), currentHashCode, theAnalysisDate, (this.analysisDate!= null));
        }
        {
            List<CharacteristicType> theCharacteristic;
            theCharacteristic = (((this.characteristic!= null)&&(!this.characteristic.isEmpty()))?this.getCharacteristic():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "characteristic", theCharacteristic), currentHashCode, theCharacteristic, ((this.characteristic!= null)&&(!this.characteristic.isEmpty())));
        }
        {
            List<String> theContainerIdentifier;
            theContainerIdentifier = (((this.containerIdentifier!= null)&&(!this.containerIdentifier.isEmpty()))?this.getContainerIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerIdentifier", theContainerIdentifier), currentHashCode, theContainerIdentifier, ((this.containerIdentifier!= null)&&(!this.containerIdentifier.isEmpty())));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            String theGrade;
            theGrade = this.getGrade();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grade", theGrade), currentHashCode, theGrade, (this.grade!= null));
        }
        {
            List<FullPartnerType> theManufacturedBy;
            theManufacturedBy = (((this.manufacturedBy!= null)&&(!this.manufacturedBy.isEmpty()))?this.getManufacturedBy():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturedBy", theManufacturedBy), currentHashCode, theManufacturedBy, ((this.manufacturedBy!= null)&&(!this.manufacturedBy.isEmpty())));
        }
        {
            XMLGregorianCalendar theManufacturedDate;
            theManufacturedDate = this.getManufacturedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturedDate", theManufacturedDate), currentHashCode, theManufacturedDate, (this.manufacturedDate!= null));
        }
        {
            PackagingType thePackaging;
            thePackaging = this.getPackaging();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packaging", thePackaging), currentHashCode, thePackaging, (this.packaging!= null));
        }
        {
            String thePartNumber;
            thePartNumber = this.getPartNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partNumber", thePartNumber), currentHashCode, thePartNumber, (this.partNumber!= null));
        }
        {
            RequirementType theRequirement;
            theRequirement = this.getRequirement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requirement", theRequirement), currentHashCode, theRequirement, (this.requirement!= null));
        }
        {
            List<String> theSerialIdentifier;
            theSerialIdentifier = (((this.serialIdentifier!= null)&&(!this.serialIdentifier.isEmpty()))?this.getSerialIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialIdentifier", theSerialIdentifier), currentHashCode, theSerialIdentifier, ((this.serialIdentifier!= null)&&(!this.serialIdentifier.isEmpty())));
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
            XMLGregorianCalendar theAnalysisDate;
            theAnalysisDate = this.getAnalysisDate();
            strategy.appendField(locator, this, "analysisDate", buffer, theAnalysisDate, (this.analysisDate!= null));
        }
        {
            List<CharacteristicType> theCharacteristic;
            theCharacteristic = (((this.characteristic!= null)&&(!this.characteristic.isEmpty()))?this.getCharacteristic():null);
            strategy.appendField(locator, this, "characteristic", buffer, theCharacteristic, ((this.characteristic!= null)&&(!this.characteristic.isEmpty())));
        }
        {
            List<String> theContainerIdentifier;
            theContainerIdentifier = (((this.containerIdentifier!= null)&&(!this.containerIdentifier.isEmpty()))?this.getContainerIdentifier():null);
            strategy.appendField(locator, this, "containerIdentifier", buffer, theContainerIdentifier, ((this.containerIdentifier!= null)&&(!this.containerIdentifier.isEmpty())));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            String theGrade;
            theGrade = this.getGrade();
            strategy.appendField(locator, this, "grade", buffer, theGrade, (this.grade!= null));
        }
        {
            List<FullPartnerType> theManufacturedBy;
            theManufacturedBy = (((this.manufacturedBy!= null)&&(!this.manufacturedBy.isEmpty()))?this.getManufacturedBy():null);
            strategy.appendField(locator, this, "manufacturedBy", buffer, theManufacturedBy, ((this.manufacturedBy!= null)&&(!this.manufacturedBy.isEmpty())));
        }
        {
            XMLGregorianCalendar theManufacturedDate;
            theManufacturedDate = this.getManufacturedDate();
            strategy.appendField(locator, this, "manufacturedDate", buffer, theManufacturedDate, (this.manufacturedDate!= null));
        }
        {
            PackagingType thePackaging;
            thePackaging = this.getPackaging();
            strategy.appendField(locator, this, "packaging", buffer, thePackaging, (this.packaging!= null));
        }
        {
            String thePartNumber;
            thePartNumber = this.getPartNumber();
            strategy.appendField(locator, this, "partNumber", buffer, thePartNumber, (this.partNumber!= null));
        }
        {
            RequirementType theRequirement;
            theRequirement = this.getRequirement();
            strategy.appendField(locator, this, "requirement", buffer, theRequirement, (this.requirement!= null));
        }
        {
            List<String> theSerialIdentifier;
            theSerialIdentifier = (((this.serialIdentifier!= null)&&(!this.serialIdentifier.isEmpty()))?this.getSerialIdentifier():null);
            strategy.appendField(locator, this, "serialIdentifier", buffer, theSerialIdentifier, ((this.serialIdentifier!= null)&&(!this.serialIdentifier.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
