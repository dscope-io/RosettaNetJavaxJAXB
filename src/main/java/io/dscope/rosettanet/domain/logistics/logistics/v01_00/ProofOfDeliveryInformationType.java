
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_00.SpecifiedPartnerDescription;
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
 * <p>Java class for ProofOfDeliveryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProofOfDeliveryInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}SpecifiedPartnerDescription"/&gt;
 *         &lt;element name="TotalContainer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "ProofOfDeliveryInformationType", propOrder = {
    "specifiedPartnerDescription",
    "totalContainer"
})
public class ProofOfDeliveryInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "SpecifiedPartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", type = SpecifiedPartnerDescription.class)
    protected SpecifiedPartnerDescription specifiedPartnerDescription;
    @XmlElement(name = "TotalContainer")
    protected BigInteger totalContainer;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the specifiedPartnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescription }
     *     
     */
    public SpecifiedPartnerDescription getSpecifiedPartnerDescription() {
        return specifiedPartnerDescription;
    }

    /**
     * Sets the value of the specifiedPartnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescription }
     *     
     */
    public void setSpecifiedPartnerDescription(SpecifiedPartnerDescription value) {
        this.specifiedPartnerDescription = value;
    }

    /**
     * Gets the value of the totalContainer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalContainer() {
        return totalContainer;
    }

    /**
     * Sets the value of the totalContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalContainer(BigInteger value) {
        this.totalContainer = value;
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
        final ProofOfDeliveryInformationType that = ((ProofOfDeliveryInformationType) object);
        {
            SpecifiedPartnerDescription lhsSpecifiedPartnerDescription;
            lhsSpecifiedPartnerDescription = this.getSpecifiedPartnerDescription();
            SpecifiedPartnerDescription rhsSpecifiedPartnerDescription;
            rhsSpecifiedPartnerDescription = that.getSpecifiedPartnerDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specifiedPartnerDescription", lhsSpecifiedPartnerDescription), LocatorUtils.property(thatLocator, "specifiedPartnerDescription", rhsSpecifiedPartnerDescription), lhsSpecifiedPartnerDescription, rhsSpecifiedPartnerDescription, (this.specifiedPartnerDescription!= null), (that.specifiedPartnerDescription!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsTotalContainer;
            lhsTotalContainer = this.getTotalContainer();
            BigInteger rhsTotalContainer;
            rhsTotalContainer = that.getTotalContainer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalContainer", lhsTotalContainer), LocatorUtils.property(thatLocator, "totalContainer", rhsTotalContainer), lhsTotalContainer, rhsTotalContainer, (this.totalContainer!= null), (that.totalContainer!= null))) {
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
            SpecifiedPartnerDescription theSpecifiedPartnerDescription;
            theSpecifiedPartnerDescription = this.getSpecifiedPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specifiedPartnerDescription", theSpecifiedPartnerDescription), currentHashCode, theSpecifiedPartnerDescription, (this.specifiedPartnerDescription!= null));
        }
        {
            BigInteger theTotalContainer;
            theTotalContainer = this.getTotalContainer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalContainer", theTotalContainer), currentHashCode, theTotalContainer, (this.totalContainer!= null));
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
            SpecifiedPartnerDescription theSpecifiedPartnerDescription;
            theSpecifiedPartnerDescription = this.getSpecifiedPartnerDescription();
            strategy.appendField(locator, this, "specifiedPartnerDescription", buffer, theSpecifiedPartnerDescription, (this.specifiedPartnerDescription!= null));
        }
        {
            BigInteger theTotalContainer;
            theTotalContainer = this.getTotalContainer();
            strategy.appendField(locator, this, "totalContainer", buffer, theTotalContainer, (this.totalContainer!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
