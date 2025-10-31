
package io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00;

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
 * <p>Java class for LocationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceDesignatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LocationInformationType", propOrder = {
    "referenceDesignatorName",
    "secondaryLocationDescription"
})
public class LocationInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ReferenceDesignatorName")
    protected String referenceDesignatorName;
    @XmlElement(name = "SecondaryLocationDescription")
    protected List<String> secondaryLocationDescription;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the referenceDesignatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDesignatorName() {
        return referenceDesignatorName;
    }

    /**
     * Sets the value of the referenceDesignatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDesignatorName(String value) {
        this.referenceDesignatorName = value;
    }

    /**
     * Gets the value of the secondaryLocationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryLocationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryLocationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSecondaryLocationDescription() {
        if (secondaryLocationDescription == null) {
            secondaryLocationDescription = new ArrayList<String>();
        }
        return this.secondaryLocationDescription;
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
        final LocationInformationType that = ((LocationInformationType) object);
        {
            String lhsReferenceDesignatorName;
            lhsReferenceDesignatorName = this.getReferenceDesignatorName();
            String rhsReferenceDesignatorName;
            rhsReferenceDesignatorName = that.getReferenceDesignatorName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceDesignatorName", lhsReferenceDesignatorName), LocatorUtils.property(thatLocator, "referenceDesignatorName", rhsReferenceDesignatorName), lhsReferenceDesignatorName, rhsReferenceDesignatorName, (this.referenceDesignatorName!= null), (that.referenceDesignatorName!= null))) {
                return false;
            }
        }
        {
            List<String> lhsSecondaryLocationDescription;
            lhsSecondaryLocationDescription = (((this.secondaryLocationDescription!= null)&&(!this.secondaryLocationDescription.isEmpty()))?this.getSecondaryLocationDescription():null);
            List<String> rhsSecondaryLocationDescription;
            rhsSecondaryLocationDescription = (((that.secondaryLocationDescription!= null)&&(!that.secondaryLocationDescription.isEmpty()))?that.getSecondaryLocationDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secondaryLocationDescription", lhsSecondaryLocationDescription), LocatorUtils.property(thatLocator, "secondaryLocationDescription", rhsSecondaryLocationDescription), lhsSecondaryLocationDescription, rhsSecondaryLocationDescription, ((this.secondaryLocationDescription!= null)&&(!this.secondaryLocationDescription.isEmpty())), ((that.secondaryLocationDescription!= null)&&(!that.secondaryLocationDescription.isEmpty())))) {
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
            String theReferenceDesignatorName;
            theReferenceDesignatorName = this.getReferenceDesignatorName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceDesignatorName", theReferenceDesignatorName), currentHashCode, theReferenceDesignatorName, (this.referenceDesignatorName!= null));
        }
        {
            List<String> theSecondaryLocationDescription;
            theSecondaryLocationDescription = (((this.secondaryLocationDescription!= null)&&(!this.secondaryLocationDescription.isEmpty()))?this.getSecondaryLocationDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondaryLocationDescription", theSecondaryLocationDescription), currentHashCode, theSecondaryLocationDescription, ((this.secondaryLocationDescription!= null)&&(!this.secondaryLocationDescription.isEmpty())));
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
            String theReferenceDesignatorName;
            theReferenceDesignatorName = this.getReferenceDesignatorName();
            strategy.appendField(locator, this, "referenceDesignatorName", buffer, theReferenceDesignatorName, (this.referenceDesignatorName!= null));
        }
        {
            List<String> theSecondaryLocationDescription;
            theSecondaryLocationDescription = (((this.secondaryLocationDescription!= null)&&(!this.secondaryLocationDescription.isEmpty()))?this.getSecondaryLocationDescription():null);
            strategy.appendField(locator, this, "secondaryLocationDescription", buffer, theSecondaryLocationDescription, ((this.secondaryLocationDescription!= null)&&(!this.secondaryLocationDescription.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
