
package io.dscope.rosettanet.interchange.openshipfromstockanddebitauthorizationstatusdistribution.v01_01;

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
 * <p>Java class for ProductFamilyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductFamilyInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BlanketPromotionMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductFamilyInformationType", propOrder = {
    "blanketPromotionMessage",
    "familyName"
})
public class ProductFamilyInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BlanketPromotionMessage")
    protected String blanketPromotionMessage;
    @XmlElement(name = "FamilyName")
    protected List<String> familyName;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the blanketPromotionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlanketPromotionMessage() {
        return blanketPromotionMessage;
    }

    /**
     * Sets the value of the blanketPromotionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlanketPromotionMessage(String value) {
        this.blanketPromotionMessage = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFamilyName() {
        if (familyName == null) {
            familyName = new ArrayList<String>();
        }
        return this.familyName;
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
        final ProductFamilyInformationType that = ((ProductFamilyInformationType) object);
        {
            String lhsBlanketPromotionMessage;
            lhsBlanketPromotionMessage = this.getBlanketPromotionMessage();
            String rhsBlanketPromotionMessage;
            rhsBlanketPromotionMessage = that.getBlanketPromotionMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blanketPromotionMessage", lhsBlanketPromotionMessage), LocatorUtils.property(thatLocator, "blanketPromotionMessage", rhsBlanketPromotionMessage), lhsBlanketPromotionMessage, rhsBlanketPromotionMessage, (this.blanketPromotionMessage!= null), (that.blanketPromotionMessage!= null))) {
                return false;
            }
        }
        {
            List<String> lhsFamilyName;
            lhsFamilyName = (((this.familyName!= null)&&(!this.familyName.isEmpty()))?this.getFamilyName():null);
            List<String> rhsFamilyName;
            rhsFamilyName = (((that.familyName!= null)&&(!that.familyName.isEmpty()))?that.getFamilyName():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "familyName", lhsFamilyName), LocatorUtils.property(thatLocator, "familyName", rhsFamilyName), lhsFamilyName, rhsFamilyName, ((this.familyName!= null)&&(!this.familyName.isEmpty())), ((that.familyName!= null)&&(!that.familyName.isEmpty())))) {
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
            String theBlanketPromotionMessage;
            theBlanketPromotionMessage = this.getBlanketPromotionMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blanketPromotionMessage", theBlanketPromotionMessage), currentHashCode, theBlanketPromotionMessage, (this.blanketPromotionMessage!= null));
        }
        {
            List<String> theFamilyName;
            theFamilyName = (((this.familyName!= null)&&(!this.familyName.isEmpty()))?this.getFamilyName():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "familyName", theFamilyName), currentHashCode, theFamilyName, ((this.familyName!= null)&&(!this.familyName.isEmpty())));
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
            String theBlanketPromotionMessage;
            theBlanketPromotionMessage = this.getBlanketPromotionMessage();
            strategy.appendField(locator, this, "blanketPromotionMessage", buffer, theBlanketPromotionMessage, (this.blanketPromotionMessage!= null));
        }
        {
            List<String> theFamilyName;
            theFamilyName = (((this.familyName!= null)&&(!this.familyName.isEmpty()))?this.getFamilyName():null);
            strategy.appendField(locator, this, "familyName", buffer, theFamilyName, ((this.familyName!= null)&&(!this.familyName.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
