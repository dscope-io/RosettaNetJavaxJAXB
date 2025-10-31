
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

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
import io.dscope.rosettanet.domain.shared.shared.v01_10.Warranty;
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
 * <p>Java class for MarketingInstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingInstructionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}ChangeNotification" minOccurs="0"/&gt;
 *         &lt;element name="PartActivityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}Warranty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MarketingInstructionType", propOrder = {
    "changeNotification",
    "partActivityIndicator",
    "warranty"
})
public class MarketingInstructionType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ChangeNotification", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = ChangeNotification.class, required = false)
    protected ChangeNotification changeNotification;
    @XmlElement(name = "PartActivityIndicator")
    protected String partActivityIndicator;
    @XmlElementRef(name = "Warranty", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = Warranty.class, required = false)
    protected List<Warranty> warranty;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the changeNotification property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeNotification }
     *     
     */
    public ChangeNotification getChangeNotification() {
        return changeNotification;
    }

    /**
     * Sets the value of the changeNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeNotification }
     *     
     */
    public void setChangeNotification(ChangeNotification value) {
        this.changeNotification = value;
    }

    /**
     * Gets the value of the partActivityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartActivityIndicator() {
        return partActivityIndicator;
    }

    /**
     * Sets the value of the partActivityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartActivityIndicator(String value) {
        this.partActivityIndicator = value;
    }

    /**
     * Gets the value of the warranty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warranty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarranty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Warranty }
     * 
     * 
     */
    public List<Warranty> getWarranty() {
        if (warranty == null) {
            warranty = new ArrayList<Warranty>();
        }
        return this.warranty;
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
        final MarketingInstructionType that = ((MarketingInstructionType) object);
        {
            ChangeNotification lhsChangeNotification;
            lhsChangeNotification = this.getChangeNotification();
            ChangeNotification rhsChangeNotification;
            rhsChangeNotification = that.getChangeNotification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeNotification", lhsChangeNotification), LocatorUtils.property(thatLocator, "changeNotification", rhsChangeNotification), lhsChangeNotification, rhsChangeNotification, (this.changeNotification!= null), (that.changeNotification!= null))) {
                return false;
            }
        }
        {
            String lhsPartActivityIndicator;
            lhsPartActivityIndicator = this.getPartActivityIndicator();
            String rhsPartActivityIndicator;
            rhsPartActivityIndicator = that.getPartActivityIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partActivityIndicator", lhsPartActivityIndicator), LocatorUtils.property(thatLocator, "partActivityIndicator", rhsPartActivityIndicator), lhsPartActivityIndicator, rhsPartActivityIndicator, (this.partActivityIndicator!= null), (that.partActivityIndicator!= null))) {
                return false;
            }
        }
        {
            List<Warranty> lhsWarranty;
            lhsWarranty = (((this.warranty!= null)&&(!this.warranty.isEmpty()))?this.getWarranty():null);
            List<Warranty> rhsWarranty;
            rhsWarranty = (((that.warranty!= null)&&(!that.warranty.isEmpty()))?that.getWarranty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warranty", lhsWarranty), LocatorUtils.property(thatLocator, "warranty", rhsWarranty), lhsWarranty, rhsWarranty, ((this.warranty!= null)&&(!this.warranty.isEmpty())), ((that.warranty!= null)&&(!that.warranty.isEmpty())))) {
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
            ChangeNotification theChangeNotification;
            theChangeNotification = this.getChangeNotification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeNotification", theChangeNotification), currentHashCode, theChangeNotification, (this.changeNotification!= null));
        }
        {
            String thePartActivityIndicator;
            thePartActivityIndicator = this.getPartActivityIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partActivityIndicator", thePartActivityIndicator), currentHashCode, thePartActivityIndicator, (this.partActivityIndicator!= null));
        }
        {
            List<Warranty> theWarranty;
            theWarranty = (((this.warranty!= null)&&(!this.warranty.isEmpty()))?this.getWarranty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warranty", theWarranty), currentHashCode, theWarranty, ((this.warranty!= null)&&(!this.warranty.isEmpty())));
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
            ChangeNotification theChangeNotification;
            theChangeNotification = this.getChangeNotification();
            strategy.appendField(locator, this, "changeNotification", buffer, theChangeNotification, (this.changeNotification!= null));
        }
        {
            String thePartActivityIndicator;
            thePartActivityIndicator = this.getPartActivityIndicator();
            strategy.appendField(locator, this, "partActivityIndicator", buffer, thePartActivityIndicator, (this.partActivityIndicator!= null));
        }
        {
            List<Warranty> theWarranty;
            theWarranty = (((this.warranty!= null)&&(!this.warranty.isEmpty()))?this.getWarranty():null);
            strategy.appendField(locator, this, "warranty", buffer, theWarranty, ((this.warranty!= null)&&(!this.warranty.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
