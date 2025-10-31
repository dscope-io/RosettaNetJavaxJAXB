
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

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
import io.dscope.rosettanet.domain.shared.shared.v01_17.MonetaryAmountType;
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
 * <p>Java class for FreightValuationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightValuationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomsValue" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DeclaredValue" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="InsuredValue" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "FreightValuationType", propOrder = {
    "customsValue",
    "declaredValue",
    "insuredValue"
})
public class FreightValuationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CustomsValue")
    protected List<MonetaryAmountType> customsValue;
    @XmlElement(name = "DeclaredValue")
    protected MonetaryAmountType declaredValue;
    @XmlElement(name = "InsuredValue")
    protected MonetaryAmountType insuredValue;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customsValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryAmountType }
     * 
     * 
     */
    public List<MonetaryAmountType> getCustomsValue() {
        if (customsValue == null) {
            customsValue = new ArrayList<MonetaryAmountType>();
        }
        return this.customsValue;
    }

    /**
     * Gets the value of the declaredValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getDeclaredValue() {
        return declaredValue;
    }

    /**
     * Sets the value of the declaredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setDeclaredValue(MonetaryAmountType value) {
        this.declaredValue = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setInsuredValue(MonetaryAmountType value) {
        this.insuredValue = value;
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
        final FreightValuationType that = ((FreightValuationType) object);
        {
            List<MonetaryAmountType> lhsCustomsValue;
            lhsCustomsValue = (((this.customsValue!= null)&&(!this.customsValue.isEmpty()))?this.getCustomsValue():null);
            List<MonetaryAmountType> rhsCustomsValue;
            rhsCustomsValue = (((that.customsValue!= null)&&(!that.customsValue.isEmpty()))?that.getCustomsValue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customsValue", lhsCustomsValue), LocatorUtils.property(thatLocator, "customsValue", rhsCustomsValue), lhsCustomsValue, rhsCustomsValue, ((this.customsValue!= null)&&(!this.customsValue.isEmpty())), ((that.customsValue!= null)&&(!that.customsValue.isEmpty())))) {
                return false;
            }
        }
        {
            MonetaryAmountType lhsDeclaredValue;
            lhsDeclaredValue = this.getDeclaredValue();
            MonetaryAmountType rhsDeclaredValue;
            rhsDeclaredValue = that.getDeclaredValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "declaredValue", lhsDeclaredValue), LocatorUtils.property(thatLocator, "declaredValue", rhsDeclaredValue), lhsDeclaredValue, rhsDeclaredValue, (this.declaredValue!= null), (that.declaredValue!= null))) {
                return false;
            }
        }
        {
            MonetaryAmountType lhsInsuredValue;
            lhsInsuredValue = this.getInsuredValue();
            MonetaryAmountType rhsInsuredValue;
            rhsInsuredValue = that.getInsuredValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "insuredValue", lhsInsuredValue), LocatorUtils.property(thatLocator, "insuredValue", rhsInsuredValue), lhsInsuredValue, rhsInsuredValue, (this.insuredValue!= null), (that.insuredValue!= null))) {
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
            List<MonetaryAmountType> theCustomsValue;
            theCustomsValue = (((this.customsValue!= null)&&(!this.customsValue.isEmpty()))?this.getCustomsValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customsValue", theCustomsValue), currentHashCode, theCustomsValue, ((this.customsValue!= null)&&(!this.customsValue.isEmpty())));
        }
        {
            MonetaryAmountType theDeclaredValue;
            theDeclaredValue = this.getDeclaredValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "declaredValue", theDeclaredValue), currentHashCode, theDeclaredValue, (this.declaredValue!= null));
        }
        {
            MonetaryAmountType theInsuredValue;
            theInsuredValue = this.getInsuredValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "insuredValue", theInsuredValue), currentHashCode, theInsuredValue, (this.insuredValue!= null));
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
            List<MonetaryAmountType> theCustomsValue;
            theCustomsValue = (((this.customsValue!= null)&&(!this.customsValue.isEmpty()))?this.getCustomsValue():null);
            strategy.appendField(locator, this, "customsValue", buffer, theCustomsValue, ((this.customsValue!= null)&&(!this.customsValue.isEmpty())));
        }
        {
            MonetaryAmountType theDeclaredValue;
            theDeclaredValue = this.getDeclaredValue();
            strategy.appendField(locator, this, "declaredValue", buffer, theDeclaredValue, (this.declaredValue!= null));
        }
        {
            MonetaryAmountType theInsuredValue;
            theInsuredValue = this.getInsuredValue();
            strategy.appendField(locator, this, "insuredValue", buffer, theInsuredValue, (this.insuredValue!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
