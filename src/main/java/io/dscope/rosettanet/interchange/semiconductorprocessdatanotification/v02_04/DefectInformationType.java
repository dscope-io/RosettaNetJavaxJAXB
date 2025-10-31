
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

import java.math.BigInteger;
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
 * <p>Java class for DefectInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefectInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefectCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DefectDescription" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DefectID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DefectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DefectInformationType", propOrder = {
    "defectCount",
    "defectDescription",
    "defectID",
    "defectType"
})
public class DefectInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DefectCount", required = true)
    protected BigInteger defectCount;
    @XmlElement(name = "DefectDescription")
    protected List<String> defectDescription;
    @XmlElement(name = "DefectID", required = true)
    protected List<String> defectID;
    @XmlElement(name = "DefectType")
    protected String defectType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the defectCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefectCount() {
        return defectCount;
    }

    /**
     * Sets the value of the defectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefectCount(BigInteger value) {
        this.defectCount = value;
    }

    /**
     * Gets the value of the defectDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defectDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefectDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDefectDescription() {
        if (defectDescription == null) {
            defectDescription = new ArrayList<String>();
        }
        return this.defectDescription;
    }

    /**
     * Gets the value of the defectID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defectID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefectID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDefectID() {
        if (defectID == null) {
            defectID = new ArrayList<String>();
        }
        return this.defectID;
    }

    /**
     * Gets the value of the defectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefectType() {
        return defectType;
    }

    /**
     * Sets the value of the defectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefectType(String value) {
        this.defectType = value;
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
        final DefectInformationType that = ((DefectInformationType) object);
        {
            BigInteger lhsDefectCount;
            lhsDefectCount = this.getDefectCount();
            BigInteger rhsDefectCount;
            rhsDefectCount = that.getDefectCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defectCount", lhsDefectCount), LocatorUtils.property(thatLocator, "defectCount", rhsDefectCount), lhsDefectCount, rhsDefectCount, (this.defectCount!= null), (that.defectCount!= null))) {
                return false;
            }
        }
        {
            List<String> lhsDefectDescription;
            lhsDefectDescription = (((this.defectDescription!= null)&&(!this.defectDescription.isEmpty()))?this.getDefectDescription():null);
            List<String> rhsDefectDescription;
            rhsDefectDescription = (((that.defectDescription!= null)&&(!that.defectDescription.isEmpty()))?that.getDefectDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defectDescription", lhsDefectDescription), LocatorUtils.property(thatLocator, "defectDescription", rhsDefectDescription), lhsDefectDescription, rhsDefectDescription, ((this.defectDescription!= null)&&(!this.defectDescription.isEmpty())), ((that.defectDescription!= null)&&(!that.defectDescription.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsDefectID;
            lhsDefectID = (((this.defectID!= null)&&(!this.defectID.isEmpty()))?this.getDefectID():null);
            List<String> rhsDefectID;
            rhsDefectID = (((that.defectID!= null)&&(!that.defectID.isEmpty()))?that.getDefectID():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defectID", lhsDefectID), LocatorUtils.property(thatLocator, "defectID", rhsDefectID), lhsDefectID, rhsDefectID, ((this.defectID!= null)&&(!this.defectID.isEmpty())), ((that.defectID!= null)&&(!that.defectID.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsDefectType;
            lhsDefectType = this.getDefectType();
            String rhsDefectType;
            rhsDefectType = that.getDefectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defectType", lhsDefectType), LocatorUtils.property(thatLocator, "defectType", rhsDefectType), lhsDefectType, rhsDefectType, (this.defectType!= null), (that.defectType!= null))) {
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
            BigInteger theDefectCount;
            theDefectCount = this.getDefectCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defectCount", theDefectCount), currentHashCode, theDefectCount, (this.defectCount!= null));
        }
        {
            List<String> theDefectDescription;
            theDefectDescription = (((this.defectDescription!= null)&&(!this.defectDescription.isEmpty()))?this.getDefectDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defectDescription", theDefectDescription), currentHashCode, theDefectDescription, ((this.defectDescription!= null)&&(!this.defectDescription.isEmpty())));
        }
        {
            List<String> theDefectID;
            theDefectID = (((this.defectID!= null)&&(!this.defectID.isEmpty()))?this.getDefectID():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defectID", theDefectID), currentHashCode, theDefectID, ((this.defectID!= null)&&(!this.defectID.isEmpty())));
        }
        {
            String theDefectType;
            theDefectType = this.getDefectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defectType", theDefectType), currentHashCode, theDefectType, (this.defectType!= null));
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
            BigInteger theDefectCount;
            theDefectCount = this.getDefectCount();
            strategy.appendField(locator, this, "defectCount", buffer, theDefectCount, (this.defectCount!= null));
        }
        {
            List<String> theDefectDescription;
            theDefectDescription = (((this.defectDescription!= null)&&(!this.defectDescription.isEmpty()))?this.getDefectDescription():null);
            strategy.appendField(locator, this, "defectDescription", buffer, theDefectDescription, ((this.defectDescription!= null)&&(!this.defectDescription.isEmpty())));
        }
        {
            List<String> theDefectID;
            theDefectID = (((this.defectID!= null)&&(!this.defectID.isEmpty()))?this.getDefectID():null);
            strategy.appendField(locator, this, "defectID", buffer, theDefectID, ((this.defectID!= null)&&(!this.defectID.isEmpty())));
        }
        {
            String theDefectType;
            theDefectType = this.getDefectType();
            strategy.appendField(locator, this, "defectType", buffer, theDefectType, (this.defectType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
