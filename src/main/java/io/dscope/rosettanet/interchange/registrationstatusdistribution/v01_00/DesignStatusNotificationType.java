
package io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00;

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
import io.dscope.rosettanet.interchange.codelist.filetransmission.v01_00.FileTransmission;
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
 * <p>Java class for DesignStatusNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignStatusNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesignRegistrationInformation" type="{urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00}DesignRegistrationInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:FileTransmission:xsd:codelist:01.00}FileTransmission"/&gt;
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
@XmlType(name = "DesignStatusNotificationType", propOrder = {
    "designRegistrationInformation",
    "fileTransmission"
})
public class DesignStatusNotificationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DesignRegistrationInformation", required = true)
    protected List<DesignRegistrationInformationType> designRegistrationInformation;
    @XmlElementRef(name = "FileTransmission", namespace = "urn:rosettanet:specification:interchange:FileTransmission:xsd:codelist:01.00", type = FileTransmission.class)
    protected FileTransmission fileTransmission;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designRegistrationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designRegistrationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignRegistrationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignRegistrationInformationType }
     * 
     * 
     */
    public List<DesignRegistrationInformationType> getDesignRegistrationInformation() {
        if (designRegistrationInformation == null) {
            designRegistrationInformation = new ArrayList<DesignRegistrationInformationType>();
        }
        return this.designRegistrationInformation;
    }

    /**
     * Gets the value of the fileTransmission property.
     * 
     * @return
     *     possible object is
     *     {@link FileTransmission }
     *     
     */
    public FileTransmission getFileTransmission() {
        return fileTransmission;
    }

    /**
     * Sets the value of the fileTransmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransmission }
     *     
     */
    public void setFileTransmission(FileTransmission value) {
        this.fileTransmission = value;
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
        final DesignStatusNotificationType that = ((DesignStatusNotificationType) object);
        {
            List<DesignRegistrationInformationType> lhsDesignRegistrationInformation;
            lhsDesignRegistrationInformation = (((this.designRegistrationInformation!= null)&&(!this.designRegistrationInformation.isEmpty()))?this.getDesignRegistrationInformation():null);
            List<DesignRegistrationInformationType> rhsDesignRegistrationInformation;
            rhsDesignRegistrationInformation = (((that.designRegistrationInformation!= null)&&(!that.designRegistrationInformation.isEmpty()))?that.getDesignRegistrationInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designRegistrationInformation", lhsDesignRegistrationInformation), LocatorUtils.property(thatLocator, "designRegistrationInformation", rhsDesignRegistrationInformation), lhsDesignRegistrationInformation, rhsDesignRegistrationInformation, ((this.designRegistrationInformation!= null)&&(!this.designRegistrationInformation.isEmpty())), ((that.designRegistrationInformation!= null)&&(!that.designRegistrationInformation.isEmpty())))) {
                return false;
            }
        }
        {
            FileTransmission lhsFileTransmission;
            lhsFileTransmission = this.getFileTransmission();
            FileTransmission rhsFileTransmission;
            rhsFileTransmission = that.getFileTransmission();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileTransmission", lhsFileTransmission), LocatorUtils.property(thatLocator, "fileTransmission", rhsFileTransmission), lhsFileTransmission, rhsFileTransmission, (this.fileTransmission!= null), (that.fileTransmission!= null))) {
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
            List<DesignRegistrationInformationType> theDesignRegistrationInformation;
            theDesignRegistrationInformation = (((this.designRegistrationInformation!= null)&&(!this.designRegistrationInformation.isEmpty()))?this.getDesignRegistrationInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designRegistrationInformation", theDesignRegistrationInformation), currentHashCode, theDesignRegistrationInformation, ((this.designRegistrationInformation!= null)&&(!this.designRegistrationInformation.isEmpty())));
        }
        {
            FileTransmission theFileTransmission;
            theFileTransmission = this.getFileTransmission();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileTransmission", theFileTransmission), currentHashCode, theFileTransmission, (this.fileTransmission!= null));
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
            List<DesignRegistrationInformationType> theDesignRegistrationInformation;
            theDesignRegistrationInformation = (((this.designRegistrationInformation!= null)&&(!this.designRegistrationInformation.isEmpty()))?this.getDesignRegistrationInformation():null);
            strategy.appendField(locator, this, "designRegistrationInformation", buffer, theDesignRegistrationInformation, ((this.designRegistrationInformation!= null)&&(!this.designRegistrationInformation.isEmpty())));
        }
        {
            FileTransmission theFileTransmission;
            theFileTransmission = this.getFileTransmission();
            strategy.appendField(locator, this, "fileTransmission", buffer, theFileTransmission, (this.fileTransmission!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
