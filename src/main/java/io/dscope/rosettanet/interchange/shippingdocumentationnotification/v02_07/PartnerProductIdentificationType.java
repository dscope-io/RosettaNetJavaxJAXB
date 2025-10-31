
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.PhysicalDimension;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerIdentification;
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
 * <p>Java class for PartnerProductIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerProductIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}PhysicalDimension" minOccurs="0"/&gt;
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
@XmlType(name = "PartnerProductIdentificationType", propOrder = {
    "partnerIdentification",
    "physicalDimension"
})
public class PartnerProductIdentificationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "PartnerIdentification", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerIdentification.class)
    protected PartnerIdentification partnerIdentification;
    @XmlElementRef(name = "PhysicalDimension", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = PhysicalDimension.class, required = false)
    protected PhysicalDimension physicalDimension;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the partnerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerIdentification }
     *     
     */
    public PartnerIdentification getPartnerIdentification() {
        return partnerIdentification;
    }

    /**
     * Sets the value of the partnerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerIdentification }
     *     
     */
    public void setPartnerIdentification(PartnerIdentification value) {
        this.partnerIdentification = value;
    }

    /**
     * Gets the value of the physicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDimension }
     *     
     */
    public PhysicalDimension getPhysicalDimension() {
        return physicalDimension;
    }

    /**
     * Sets the value of the physicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDimension }
     *     
     */
    public void setPhysicalDimension(PhysicalDimension value) {
        this.physicalDimension = value;
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
        final PartnerProductIdentificationType that = ((PartnerProductIdentificationType) object);
        {
            PartnerIdentification lhsPartnerIdentification;
            lhsPartnerIdentification = this.getPartnerIdentification();
            PartnerIdentification rhsPartnerIdentification;
            rhsPartnerIdentification = that.getPartnerIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerIdentification", lhsPartnerIdentification), LocatorUtils.property(thatLocator, "partnerIdentification", rhsPartnerIdentification), lhsPartnerIdentification, rhsPartnerIdentification, (this.partnerIdentification!= null), (that.partnerIdentification!= null))) {
                return false;
            }
        }
        {
            PhysicalDimension lhsPhysicalDimension;
            lhsPhysicalDimension = this.getPhysicalDimension();
            PhysicalDimension rhsPhysicalDimension;
            rhsPhysicalDimension = that.getPhysicalDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "physicalDimension", lhsPhysicalDimension), LocatorUtils.property(thatLocator, "physicalDimension", rhsPhysicalDimension), lhsPhysicalDimension, rhsPhysicalDimension, (this.physicalDimension!= null), (that.physicalDimension!= null))) {
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
            PartnerIdentification thePartnerIdentification;
            thePartnerIdentification = this.getPartnerIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerIdentification", thePartnerIdentification), currentHashCode, thePartnerIdentification, (this.partnerIdentification!= null));
        }
        {
            PhysicalDimension thePhysicalDimension;
            thePhysicalDimension = this.getPhysicalDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "physicalDimension", thePhysicalDimension), currentHashCode, thePhysicalDimension, (this.physicalDimension!= null));
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
            PartnerIdentification thePartnerIdentification;
            thePartnerIdentification = this.getPartnerIdentification();
            strategy.appendField(locator, this, "partnerIdentification", buffer, thePartnerIdentification, (this.partnerIdentification!= null));
        }
        {
            PhysicalDimension thePhysicalDimension;
            thePhysicalDimension = this.getPhysicalDimension();
            strategy.appendField(locator, this, "physicalDimension", buffer, thePhysicalDimension, (this.physicalDimension!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
