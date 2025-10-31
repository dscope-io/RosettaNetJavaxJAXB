
package io.dscope.rosettanet.domain.service.service.v02_20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType;
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
 * <p>Java class for WarrantyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarrantyInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}ExpiryDate" minOccurs="0"/&gt;
 *         &lt;element name="IsEntitledToWarranty" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01}WarrantyType" minOccurs="0"/&gt;
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
@XmlType(name = "WarrantyInformationType", propOrder = {
    "expiryDate",
    "isEntitledToWarranty",
    "shippingServiceLevel",
    "warrantyType"
})
public class WarrantyInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ExpiryDate", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = ExpiryDate.class, required = false)
    protected ExpiryDate expiryDate;
    @XmlElement(name = "IsEntitledToWarranty")
    protected boolean isEntitledToWarranty;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class, required = false)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElementRef(name = "WarrantyType", namespace = "urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01", type = WarrantyType.class, required = false)
    protected WarrantyType warrantyType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDate }
     *     
     */
    public ExpiryDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDate }
     *     
     */
    public void setExpiryDate(ExpiryDate value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the isEntitledToWarranty property.
     * 
     */
    public boolean isIsEntitledToWarranty() {
        return isEntitledToWarranty;
    }

    /**
     * Sets the value of the isEntitledToWarranty property.
     * 
     */
    public void setIsEntitledToWarranty(boolean value) {
        this.isEntitledToWarranty = value;
    }

    /**
     * Gets the value of the shippingServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public ShippingServiceLevel getShippingServiceLevel() {
        return shippingServiceLevel;
    }

    /**
     * Sets the value of the shippingServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public void setShippingServiceLevel(ShippingServiceLevel value) {
        this.shippingServiceLevel = value;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyType }
     *     
     */
    public WarrantyType getWarrantyType() {
        return warrantyType;
    }

    /**
     * Sets the value of the warrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyType }
     *     
     */
    public void setWarrantyType(WarrantyType value) {
        this.warrantyType = value;
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
        final WarrantyInformationType that = ((WarrantyInformationType) object);
        {
            ExpiryDate lhsExpiryDate;
            lhsExpiryDate = this.getExpiryDate();
            ExpiryDate rhsExpiryDate;
            rhsExpiryDate = that.getExpiryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expiryDate", lhsExpiryDate), LocatorUtils.property(thatLocator, "expiryDate", rhsExpiryDate), lhsExpiryDate, rhsExpiryDate, (this.expiryDate!= null), (that.expiryDate!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsEntitledToWarranty;
            lhsIsEntitledToWarranty = this.isIsEntitledToWarranty();
            boolean rhsIsEntitledToWarranty;
            rhsIsEntitledToWarranty = that.isIsEntitledToWarranty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isEntitledToWarranty", lhsIsEntitledToWarranty), LocatorUtils.property(thatLocator, "isEntitledToWarranty", rhsIsEntitledToWarranty), lhsIsEntitledToWarranty, rhsIsEntitledToWarranty, true, true)) {
                return false;
            }
        }
        {
            ShippingServiceLevel lhsShippingServiceLevel;
            lhsShippingServiceLevel = this.getShippingServiceLevel();
            ShippingServiceLevel rhsShippingServiceLevel;
            rhsShippingServiceLevel = that.getShippingServiceLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingServiceLevel", lhsShippingServiceLevel), LocatorUtils.property(thatLocator, "shippingServiceLevel", rhsShippingServiceLevel), lhsShippingServiceLevel, rhsShippingServiceLevel, (this.shippingServiceLevel!= null), (that.shippingServiceLevel!= null))) {
                return false;
            }
        }
        {
            WarrantyType lhsWarrantyType;
            lhsWarrantyType = this.getWarrantyType();
            WarrantyType rhsWarrantyType;
            rhsWarrantyType = that.getWarrantyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyType", lhsWarrantyType), LocatorUtils.property(thatLocator, "warrantyType", rhsWarrantyType), lhsWarrantyType, rhsWarrantyType, (this.warrantyType!= null), (that.warrantyType!= null))) {
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
            ExpiryDate theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expiryDate", theExpiryDate), currentHashCode, theExpiryDate, (this.expiryDate!= null));
        }
        {
            boolean theIsEntitledToWarranty;
            theIsEntitledToWarranty = this.isIsEntitledToWarranty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isEntitledToWarranty", theIsEntitledToWarranty), currentHashCode, theIsEntitledToWarranty, true);
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingServiceLevel", theShippingServiceLevel), currentHashCode, theShippingServiceLevel, (this.shippingServiceLevel!= null));
        }
        {
            WarrantyType theWarrantyType;
            theWarrantyType = this.getWarrantyType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyType", theWarrantyType), currentHashCode, theWarrantyType, (this.warrantyType!= null));
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
            ExpiryDate theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            strategy.appendField(locator, this, "expiryDate", buffer, theExpiryDate, (this.expiryDate!= null));
        }
        {
            boolean theIsEntitledToWarranty;
            theIsEntitledToWarranty = this.isIsEntitledToWarranty();
            strategy.appendField(locator, this, "isEntitledToWarranty", buffer, theIsEntitledToWarranty, true);
        }
        {
            ShippingServiceLevel theShippingServiceLevel;
            theShippingServiceLevel = this.getShippingServiceLevel();
            strategy.appendField(locator, this, "shippingServiceLevel", buffer, theShippingServiceLevel, (this.shippingServiceLevel!= null));
        }
        {
            WarrantyType theWarrantyType;
            theWarrantyType = this.getWarrantyType();
            strategy.appendField(locator, this, "warrantyType", buffer, theWarrantyType, (this.warrantyType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
