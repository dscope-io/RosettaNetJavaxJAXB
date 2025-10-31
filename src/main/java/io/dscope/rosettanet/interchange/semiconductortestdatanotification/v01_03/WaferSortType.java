
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03;

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
 * <p>Java class for WaferSortType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaferSortType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Die" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}DieType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="YieldReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}YieldReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "WaferSortType", propOrder = {
    "die",
    "yieldReport"
})
public class WaferSortType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Die", required = true)
    protected List<DieType> die;
    @XmlElement(name = "YieldReport")
    protected List<YieldReportType> yieldReport;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the die property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the die property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DieType }
     * 
     * 
     */
    public List<DieType> getDie() {
        if (die == null) {
            die = new ArrayList<DieType>();
        }
        return this.die;
    }

    /**
     * Gets the value of the yieldReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yieldReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYieldReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YieldReportType }
     * 
     * 
     */
    public List<YieldReportType> getYieldReport() {
        if (yieldReport == null) {
            yieldReport = new ArrayList<YieldReportType>();
        }
        return this.yieldReport;
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
        final WaferSortType that = ((WaferSortType) object);
        {
            List<DieType> lhsDie;
            lhsDie = (((this.die!= null)&&(!this.die.isEmpty()))?this.getDie():null);
            List<DieType> rhsDie;
            rhsDie = (((that.die!= null)&&(!that.die.isEmpty()))?that.getDie():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "die", lhsDie), LocatorUtils.property(thatLocator, "die", rhsDie), lhsDie, rhsDie, ((this.die!= null)&&(!this.die.isEmpty())), ((that.die!= null)&&(!that.die.isEmpty())))) {
                return false;
            }
        }
        {
            List<YieldReportType> lhsYieldReport;
            lhsYieldReport = (((this.yieldReport!= null)&&(!this.yieldReport.isEmpty()))?this.getYieldReport():null);
            List<YieldReportType> rhsYieldReport;
            rhsYieldReport = (((that.yieldReport!= null)&&(!that.yieldReport.isEmpty()))?that.getYieldReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "yieldReport", lhsYieldReport), LocatorUtils.property(thatLocator, "yieldReport", rhsYieldReport), lhsYieldReport, rhsYieldReport, ((this.yieldReport!= null)&&(!this.yieldReport.isEmpty())), ((that.yieldReport!= null)&&(!that.yieldReport.isEmpty())))) {
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
            List<DieType> theDie;
            theDie = (((this.die!= null)&&(!this.die.isEmpty()))?this.getDie():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "die", theDie), currentHashCode, theDie, ((this.die!= null)&&(!this.die.isEmpty())));
        }
        {
            List<YieldReportType> theYieldReport;
            theYieldReport = (((this.yieldReport!= null)&&(!this.yieldReport.isEmpty()))?this.getYieldReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "yieldReport", theYieldReport), currentHashCode, theYieldReport, ((this.yieldReport!= null)&&(!this.yieldReport.isEmpty())));
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
            List<DieType> theDie;
            theDie = (((this.die!= null)&&(!this.die.isEmpty()))?this.getDie():null);
            strategy.appendField(locator, this, "die", buffer, theDie, ((this.die!= null)&&(!this.die.isEmpty())));
        }
        {
            List<YieldReportType> theYieldReport;
            theYieldReport = (((this.yieldReport!= null)&&(!this.yieldReport.isEmpty()))?this.getYieldReport():null);
            strategy.appendField(locator, this, "yieldReport", buffer, theYieldReport, ((this.yieldReport!= null)&&(!this.yieldReport.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
