
package io.dscope.rosettanet.interchange.engineeringinformationinquirydistribution.v01_02;

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
import io.dscope.rosettanet.domain.design.design.v02_19.EngineeringInformationType;
import io.dscope.rosettanet.system.standarddocumentheader.v01_20.DocumentHeader;
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
 * <p>Java class for EngineeringInformationInquiryDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EngineeringInformationInquiryDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.20}DocumentHeader" minOccurs="0"/&gt;
 *         &lt;element name="EngineeringInformation" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.19}EngineeringInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EngineeringInformationHeader" type="{urn:rosettanet:specification:interchange:EngineeringInformationInquiryDistribution:xsd:schema:01.02}EngineeringInformationHeaderType"/&gt;
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
@XmlType(name = "EngineeringInformationInquiryDistributionType", propOrder = {
    "documentHeader",
    "engineeringInformation",
    "engineeringInformationHeader"
})
public class EngineeringInformationInquiryDistributionType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DocumentHeader", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.20", type = DocumentHeader.class, required = false)
    protected DocumentHeader documentHeader;
    @XmlElement(name = "EngineeringInformation")
    protected List<EngineeringInformationType> engineeringInformation;
    @XmlElement(name = "EngineeringInformationHeader", required = true)
    protected EngineeringInformationHeaderType engineeringInformationHeader;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the documentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHeader }
     *     
     */
    public DocumentHeader getDocumentHeader() {
        return documentHeader;
    }

    /**
     * Sets the value of the documentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHeader }
     *     
     */
    public void setDocumentHeader(DocumentHeader value) {
        this.documentHeader = value;
    }

    /**
     * Gets the value of the engineeringInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the engineeringInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEngineeringInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EngineeringInformationType }
     * 
     * 
     */
    public List<EngineeringInformationType> getEngineeringInformation() {
        if (engineeringInformation == null) {
            engineeringInformation = new ArrayList<EngineeringInformationType>();
        }
        return this.engineeringInformation;
    }

    /**
     * Gets the value of the engineeringInformationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link EngineeringInformationHeaderType }
     *     
     */
    public EngineeringInformationHeaderType getEngineeringInformationHeader() {
        return engineeringInformationHeader;
    }

    /**
     * Sets the value of the engineeringInformationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineeringInformationHeaderType }
     *     
     */
    public void setEngineeringInformationHeader(EngineeringInformationHeaderType value) {
        this.engineeringInformationHeader = value;
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
        final EngineeringInformationInquiryDistributionType that = ((EngineeringInformationInquiryDistributionType) object);
        {
            DocumentHeader lhsDocumentHeader;
            lhsDocumentHeader = this.getDocumentHeader();
            DocumentHeader rhsDocumentHeader;
            rhsDocumentHeader = that.getDocumentHeader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentHeader", lhsDocumentHeader), LocatorUtils.property(thatLocator, "documentHeader", rhsDocumentHeader), lhsDocumentHeader, rhsDocumentHeader, (this.documentHeader!= null), (that.documentHeader!= null))) {
                return false;
            }
        }
        {
            List<EngineeringInformationType> lhsEngineeringInformation;
            lhsEngineeringInformation = (((this.engineeringInformation!= null)&&(!this.engineeringInformation.isEmpty()))?this.getEngineeringInformation():null);
            List<EngineeringInformationType> rhsEngineeringInformation;
            rhsEngineeringInformation = (((that.engineeringInformation!= null)&&(!that.engineeringInformation.isEmpty()))?that.getEngineeringInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "engineeringInformation", lhsEngineeringInformation), LocatorUtils.property(thatLocator, "engineeringInformation", rhsEngineeringInformation), lhsEngineeringInformation, rhsEngineeringInformation, ((this.engineeringInformation!= null)&&(!this.engineeringInformation.isEmpty())), ((that.engineeringInformation!= null)&&(!that.engineeringInformation.isEmpty())))) {
                return false;
            }
        }
        {
            EngineeringInformationHeaderType lhsEngineeringInformationHeader;
            lhsEngineeringInformationHeader = this.getEngineeringInformationHeader();
            EngineeringInformationHeaderType rhsEngineeringInformationHeader;
            rhsEngineeringInformationHeader = that.getEngineeringInformationHeader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "engineeringInformationHeader", lhsEngineeringInformationHeader), LocatorUtils.property(thatLocator, "engineeringInformationHeader", rhsEngineeringInformationHeader), lhsEngineeringInformationHeader, rhsEngineeringInformationHeader, (this.engineeringInformationHeader!= null), (that.engineeringInformationHeader!= null))) {
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
            DocumentHeader theDocumentHeader;
            theDocumentHeader = this.getDocumentHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentHeader", theDocumentHeader), currentHashCode, theDocumentHeader, (this.documentHeader!= null));
        }
        {
            List<EngineeringInformationType> theEngineeringInformation;
            theEngineeringInformation = (((this.engineeringInformation!= null)&&(!this.engineeringInformation.isEmpty()))?this.getEngineeringInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "engineeringInformation", theEngineeringInformation), currentHashCode, theEngineeringInformation, ((this.engineeringInformation!= null)&&(!this.engineeringInformation.isEmpty())));
        }
        {
            EngineeringInformationHeaderType theEngineeringInformationHeader;
            theEngineeringInformationHeader = this.getEngineeringInformationHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "engineeringInformationHeader", theEngineeringInformationHeader), currentHashCode, theEngineeringInformationHeader, (this.engineeringInformationHeader!= null));
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
            DocumentHeader theDocumentHeader;
            theDocumentHeader = this.getDocumentHeader();
            strategy.appendField(locator, this, "documentHeader", buffer, theDocumentHeader, (this.documentHeader!= null));
        }
        {
            List<EngineeringInformationType> theEngineeringInformation;
            theEngineeringInformation = (((this.engineeringInformation!= null)&&(!this.engineeringInformation.isEmpty()))?this.getEngineeringInformation():null);
            strategy.appendField(locator, this, "engineeringInformation", buffer, theEngineeringInformation, ((this.engineeringInformation!= null)&&(!this.engineeringInformation.isEmpty())));
        }
        {
            EngineeringInformationHeaderType theEngineeringInformationHeader;
            theEngineeringInformationHeader = this.getEngineeringInformationHeader();
            strategy.appendField(locator, this, "engineeringInformationHeader", buffer, theEngineeringInformationHeader, (this.engineeringInformationHeader!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
