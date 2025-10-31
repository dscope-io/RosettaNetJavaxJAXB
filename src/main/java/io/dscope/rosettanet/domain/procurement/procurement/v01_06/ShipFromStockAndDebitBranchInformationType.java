
package io.dscope.rosettanet.domain.procurement.procurement.v01_06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_03.SpecifiedPartnerDescriptionType;
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
 * <p>Java class for ShipFromStockAndDebitBranchInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipFromStockAndDebitBranchInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistributedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.03}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.06}ShipFromStockAndDebitCustomerInformation" minOccurs="0"/&gt;
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
@XmlType(name = "ShipFromStockAndDebitBranchInformationType", propOrder = {
    "distributedBy",
    "shipFromStockAndDebitCustomerInformation"
})
public class ShipFromStockAndDebitBranchInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DistributedBy", required = true)
    protected SpecifiedPartnerDescriptionType distributedBy;
    @XmlElementRef(name = "ShipFromStockAndDebitCustomerInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.06", type = ShipFromStockAndDebitCustomerInformation.class, required = false)
    protected ShipFromStockAndDebitCustomerInformation shipFromStockAndDebitCustomerInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the distributedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getDistributedBy() {
        return distributedBy;
    }

    /**
     * Sets the value of the distributedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setDistributedBy(SpecifiedPartnerDescriptionType value) {
        this.distributedBy = value;
    }

    /**
     * Gets the value of the shipFromStockAndDebitCustomerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShipFromStockAndDebitCustomerInformation }
     *     
     */
    public ShipFromStockAndDebitCustomerInformation getShipFromStockAndDebitCustomerInformation() {
        return shipFromStockAndDebitCustomerInformation;
    }

    /**
     * Sets the value of the shipFromStockAndDebitCustomerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipFromStockAndDebitCustomerInformation }
     *     
     */
    public void setShipFromStockAndDebitCustomerInformation(ShipFromStockAndDebitCustomerInformation value) {
        this.shipFromStockAndDebitCustomerInformation = value;
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
        final ShipFromStockAndDebitBranchInformationType that = ((ShipFromStockAndDebitBranchInformationType) object);
        {
            SpecifiedPartnerDescriptionType lhsDistributedBy;
            lhsDistributedBy = this.getDistributedBy();
            SpecifiedPartnerDescriptionType rhsDistributedBy;
            rhsDistributedBy = that.getDistributedBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distributedBy", lhsDistributedBy), LocatorUtils.property(thatLocator, "distributedBy", rhsDistributedBy), lhsDistributedBy, rhsDistributedBy, (this.distributedBy!= null), (that.distributedBy!= null))) {
                return false;
            }
        }
        {
            ShipFromStockAndDebitCustomerInformation lhsShipFromStockAndDebitCustomerInformation;
            lhsShipFromStockAndDebitCustomerInformation = this.getShipFromStockAndDebitCustomerInformation();
            ShipFromStockAndDebitCustomerInformation rhsShipFromStockAndDebitCustomerInformation;
            rhsShipFromStockAndDebitCustomerInformation = that.getShipFromStockAndDebitCustomerInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipFromStockAndDebitCustomerInformation", lhsShipFromStockAndDebitCustomerInformation), LocatorUtils.property(thatLocator, "shipFromStockAndDebitCustomerInformation", rhsShipFromStockAndDebitCustomerInformation), lhsShipFromStockAndDebitCustomerInformation, rhsShipFromStockAndDebitCustomerInformation, (this.shipFromStockAndDebitCustomerInformation!= null), (that.shipFromStockAndDebitCustomerInformation!= null))) {
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
            SpecifiedPartnerDescriptionType theDistributedBy;
            theDistributedBy = this.getDistributedBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distributedBy", theDistributedBy), currentHashCode, theDistributedBy, (this.distributedBy!= null));
        }
        {
            ShipFromStockAndDebitCustomerInformation theShipFromStockAndDebitCustomerInformation;
            theShipFromStockAndDebitCustomerInformation = this.getShipFromStockAndDebitCustomerInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipFromStockAndDebitCustomerInformation", theShipFromStockAndDebitCustomerInformation), currentHashCode, theShipFromStockAndDebitCustomerInformation, (this.shipFromStockAndDebitCustomerInformation!= null));
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
            SpecifiedPartnerDescriptionType theDistributedBy;
            theDistributedBy = this.getDistributedBy();
            strategy.appendField(locator, this, "distributedBy", buffer, theDistributedBy, (this.distributedBy!= null));
        }
        {
            ShipFromStockAndDebitCustomerInformation theShipFromStockAndDebitCustomerInformation;
            theShipFromStockAndDebitCustomerInformation = this.getShipFromStockAndDebitCustomerInformation();
            strategy.appendField(locator, this, "shipFromStockAndDebitCustomerInformation", buffer, theShipFromStockAndDebitCustomerInformation, (this.shipFromStockAndDebitCustomerInformation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
