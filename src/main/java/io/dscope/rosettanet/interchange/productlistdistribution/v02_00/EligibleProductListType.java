
package io.dscope.rosettanet.interchange.productlistdistribution.v02_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for EligibleProductListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligibleProductListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentIdentification" type="{urn:rosettanet:specification:interchange:ProductListDistribution:xsd:schema:02.00}DocumentIdentificationType"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="CoreProductInformation" type="{urn:rosettanet:specification:interchange:ProductListDistribution:xsd:schema:02.00}CoreProductInformationType"/&gt;
 *           &lt;element name="DeviceProductInformation" type="{urn:rosettanet:specification:interchange:ProductListDistribution:xsd:schema:02.00}DeviceProductInformationType"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "EligibleProductListType", propOrder = {
    "documentIdentification",
    "coreProductInformationOrDeviceProductInformation"
})
public class EligibleProductListType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DocumentIdentification", required = true)
    protected DocumentIdentificationType documentIdentification;
    @XmlElements({
        @XmlElement(name = "CoreProductInformation", type = CoreProductInformationType.class),
        @XmlElement(name = "DeviceProductInformation", type = DeviceProductInformationType.class)
    })
    protected List<Object> coreProductInformationOrDeviceProductInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the documentIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentificationType }
     *     
     */
    public DocumentIdentificationType getDocumentIdentification() {
        return documentIdentification;
    }

    /**
     * Sets the value of the documentIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentificationType }
     *     
     */
    public void setDocumentIdentification(DocumentIdentificationType value) {
        this.documentIdentification = value;
    }

    /**
     * Gets the value of the coreProductInformationOrDeviceProductInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coreProductInformationOrDeviceProductInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoreProductInformationOrDeviceProductInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoreProductInformationType }
     * {@link DeviceProductInformationType }
     * 
     * 
     */
    public List<Object> getCoreProductInformationOrDeviceProductInformation() {
        if (coreProductInformationOrDeviceProductInformation == null) {
            coreProductInformationOrDeviceProductInformation = new ArrayList<Object>();
        }
        return this.coreProductInformationOrDeviceProductInformation;
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
        final EligibleProductListType that = ((EligibleProductListType) object);
        {
            DocumentIdentificationType lhsDocumentIdentification;
            lhsDocumentIdentification = this.getDocumentIdentification();
            DocumentIdentificationType rhsDocumentIdentification;
            rhsDocumentIdentification = that.getDocumentIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentIdentification", lhsDocumentIdentification), LocatorUtils.property(thatLocator, "documentIdentification", rhsDocumentIdentification), lhsDocumentIdentification, rhsDocumentIdentification, (this.documentIdentification!= null), (that.documentIdentification!= null))) {
                return false;
            }
        }
        {
            List<Object> lhsCoreProductInformationOrDeviceProductInformation;
            lhsCoreProductInformationOrDeviceProductInformation = (((this.coreProductInformationOrDeviceProductInformation!= null)&&(!this.coreProductInformationOrDeviceProductInformation.isEmpty()))?this.getCoreProductInformationOrDeviceProductInformation():null);
            List<Object> rhsCoreProductInformationOrDeviceProductInformation;
            rhsCoreProductInformationOrDeviceProductInformation = (((that.coreProductInformationOrDeviceProductInformation!= null)&&(!that.coreProductInformationOrDeviceProductInformation.isEmpty()))?that.getCoreProductInformationOrDeviceProductInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coreProductInformationOrDeviceProductInformation", lhsCoreProductInformationOrDeviceProductInformation), LocatorUtils.property(thatLocator, "coreProductInformationOrDeviceProductInformation", rhsCoreProductInformationOrDeviceProductInformation), lhsCoreProductInformationOrDeviceProductInformation, rhsCoreProductInformationOrDeviceProductInformation, ((this.coreProductInformationOrDeviceProductInformation!= null)&&(!this.coreProductInformationOrDeviceProductInformation.isEmpty())), ((that.coreProductInformationOrDeviceProductInformation!= null)&&(!that.coreProductInformationOrDeviceProductInformation.isEmpty())))) {
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
            DocumentIdentificationType theDocumentIdentification;
            theDocumentIdentification = this.getDocumentIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentIdentification", theDocumentIdentification), currentHashCode, theDocumentIdentification, (this.documentIdentification!= null));
        }
        {
            List<Object> theCoreProductInformationOrDeviceProductInformation;
            theCoreProductInformationOrDeviceProductInformation = (((this.coreProductInformationOrDeviceProductInformation!= null)&&(!this.coreProductInformationOrDeviceProductInformation.isEmpty()))?this.getCoreProductInformationOrDeviceProductInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coreProductInformationOrDeviceProductInformation", theCoreProductInformationOrDeviceProductInformation), currentHashCode, theCoreProductInformationOrDeviceProductInformation, ((this.coreProductInformationOrDeviceProductInformation!= null)&&(!this.coreProductInformationOrDeviceProductInformation.isEmpty())));
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
            DocumentIdentificationType theDocumentIdentification;
            theDocumentIdentification = this.getDocumentIdentification();
            strategy.appendField(locator, this, "documentIdentification", buffer, theDocumentIdentification, (this.documentIdentification!= null));
        }
        {
            List<Object> theCoreProductInformationOrDeviceProductInformation;
            theCoreProductInformationOrDeviceProductInformation = (((this.coreProductInformationOrDeviceProductInformation!= null)&&(!this.coreProductInformationOrDeviceProductInformation.isEmpty()))?this.getCoreProductInformationOrDeviceProductInformation():null);
            strategy.appendField(locator, this, "coreProductInformationOrDeviceProductInformation", buffer, theCoreProductInformationOrDeviceProductInformation, ((this.coreProductInformationOrDeviceProductInformation!= null)&&(!this.coreProductInformationOrDeviceProductInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
