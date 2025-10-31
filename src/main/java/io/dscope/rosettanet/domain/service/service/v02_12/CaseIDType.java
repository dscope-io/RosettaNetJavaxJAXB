
package io.dscope.rosettanet.domain.service.service.v02_12;

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
 * <p>Java class for CaseIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternativeCaseID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "CaseIDType", propOrder = {
    "alternativeCaseID",
    "sp",
    "sr"
})
public class CaseIDType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AlternativeCaseID")
    protected List<String> alternativeCaseID;
    @XmlElement(name = "SP", required = true)
    protected List<String> sp;
    @XmlElement(name = "SR", required = true)
    protected String sr;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternativeCaseID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeCaseID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeCaseID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternativeCaseID() {
        if (alternativeCaseID == null) {
            alternativeCaseID = new ArrayList<String>();
        }
        return this.alternativeCaseID;
    }

    /**
     * Gets the value of the sp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSP() {
        if (sp == null) {
            sp = new ArrayList<String>();
        }
        return this.sp;
    }

    /**
     * Gets the value of the sr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSR() {
        return sr;
    }

    /**
     * Sets the value of the sr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSR(String value) {
        this.sr = value;
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
        final CaseIDType that = ((CaseIDType) object);
        {
            List<String> lhsAlternativeCaseID;
            lhsAlternativeCaseID = (((this.alternativeCaseID!= null)&&(!this.alternativeCaseID.isEmpty()))?this.getAlternativeCaseID():null);
            List<String> rhsAlternativeCaseID;
            rhsAlternativeCaseID = (((that.alternativeCaseID!= null)&&(!that.alternativeCaseID.isEmpty()))?that.getAlternativeCaseID():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativeCaseID", lhsAlternativeCaseID), LocatorUtils.property(thatLocator, "alternativeCaseID", rhsAlternativeCaseID), lhsAlternativeCaseID, rhsAlternativeCaseID, ((this.alternativeCaseID!= null)&&(!this.alternativeCaseID.isEmpty())), ((that.alternativeCaseID!= null)&&(!that.alternativeCaseID.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsSP;
            lhsSP = (((this.sp!= null)&&(!this.sp.isEmpty()))?this.getSP():null);
            List<String> rhsSP;
            rhsSP = (((that.sp!= null)&&(!that.sp.isEmpty()))?that.getSP():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sp", lhsSP), LocatorUtils.property(thatLocator, "sp", rhsSP), lhsSP, rhsSP, ((this.sp!= null)&&(!this.sp.isEmpty())), ((that.sp!= null)&&(!that.sp.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsSR;
            lhsSR = this.getSR();
            String rhsSR;
            rhsSR = that.getSR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sr", lhsSR), LocatorUtils.property(thatLocator, "sr", rhsSR), lhsSR, rhsSR, (this.sr!= null), (that.sr!= null))) {
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
            List<String> theAlternativeCaseID;
            theAlternativeCaseID = (((this.alternativeCaseID!= null)&&(!this.alternativeCaseID.isEmpty()))?this.getAlternativeCaseID():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativeCaseID", theAlternativeCaseID), currentHashCode, theAlternativeCaseID, ((this.alternativeCaseID!= null)&&(!this.alternativeCaseID.isEmpty())));
        }
        {
            List<String> theSP;
            theSP = (((this.sp!= null)&&(!this.sp.isEmpty()))?this.getSP():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sp", theSP), currentHashCode, theSP, ((this.sp!= null)&&(!this.sp.isEmpty())));
        }
        {
            String theSR;
            theSR = this.getSR();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sr", theSR), currentHashCode, theSR, (this.sr!= null));
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
            List<String> theAlternativeCaseID;
            theAlternativeCaseID = (((this.alternativeCaseID!= null)&&(!this.alternativeCaseID.isEmpty()))?this.getAlternativeCaseID():null);
            strategy.appendField(locator, this, "alternativeCaseID", buffer, theAlternativeCaseID, ((this.alternativeCaseID!= null)&&(!this.alternativeCaseID.isEmpty())));
        }
        {
            List<String> theSP;
            theSP = (((this.sp!= null)&&(!this.sp.isEmpty()))?this.getSP():null);
            strategy.appendField(locator, this, "sp", buffer, theSP, ((this.sp!= null)&&(!this.sp.isEmpty())));
        }
        {
            String theSR;
            theSR = this.getSR();
            strategy.appendField(locator, this, "sr", buffer, theSR, (this.sr!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
