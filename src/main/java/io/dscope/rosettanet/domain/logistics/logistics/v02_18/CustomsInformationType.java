
package io.dscope.rosettanet.domain.logistics.logistics.v02_18;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
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
 * <p>Java class for CustomsInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18}Customs" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18}PortInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CustomsInformationType", propOrder = {
    "customs",
    "portInformation"
})
public class CustomsInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "Customs", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", type = Customs.class)
    protected List<Customs> customs;
    @XmlElementRef(name = "PortInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", type = PortInformation.class, required = false)
    protected List<PortInformation> portInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustoms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Customs }
     * 
     * 
     */
    public List<Customs> getCustoms() {
        if (customs == null) {
            customs = new ArrayList<Customs>();
        }
        return this.customs;
    }

    /**
     * Gets the value of the portInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortInformation }
     * 
     * 
     */
    public List<PortInformation> getPortInformation() {
        if (portInformation == null) {
            portInformation = new ArrayList<PortInformation>();
        }
        return this.portInformation;
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
        final CustomsInformationType that = ((CustomsInformationType) object);
        {
            List<Customs> lhsCustoms;
            lhsCustoms = (((this.customs!= null)&&(!this.customs.isEmpty()))?this.getCustoms():null);
            List<Customs> rhsCustoms;
            rhsCustoms = (((that.customs!= null)&&(!that.customs.isEmpty()))?that.getCustoms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customs", lhsCustoms), LocatorUtils.property(thatLocator, "customs", rhsCustoms), lhsCustoms, rhsCustoms, ((this.customs!= null)&&(!this.customs.isEmpty())), ((that.customs!= null)&&(!that.customs.isEmpty())))) {
                return false;
            }
        }
        {
            List<PortInformation> lhsPortInformation;
            lhsPortInformation = (((this.portInformation!= null)&&(!this.portInformation.isEmpty()))?this.getPortInformation():null);
            List<PortInformation> rhsPortInformation;
            rhsPortInformation = (((that.portInformation!= null)&&(!that.portInformation.isEmpty()))?that.getPortInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "portInformation", lhsPortInformation), LocatorUtils.property(thatLocator, "portInformation", rhsPortInformation), lhsPortInformation, rhsPortInformation, ((this.portInformation!= null)&&(!this.portInformation.isEmpty())), ((that.portInformation!= null)&&(!that.portInformation.isEmpty())))) {
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
            List<Customs> theCustoms;
            theCustoms = (((this.customs!= null)&&(!this.customs.isEmpty()))?this.getCustoms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customs", theCustoms), currentHashCode, theCustoms, ((this.customs!= null)&&(!this.customs.isEmpty())));
        }
        {
            List<PortInformation> thePortInformation;
            thePortInformation = (((this.portInformation!= null)&&(!this.portInformation.isEmpty()))?this.getPortInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "portInformation", thePortInformation), currentHashCode, thePortInformation, ((this.portInformation!= null)&&(!this.portInformation.isEmpty())));
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
            List<Customs> theCustoms;
            theCustoms = (((this.customs!= null)&&(!this.customs.isEmpty()))?this.getCustoms():null);
            strategy.appendField(locator, this, "customs", buffer, theCustoms, ((this.customs!= null)&&(!this.customs.isEmpty())));
        }
        {
            List<PortInformation> thePortInformation;
            thePortInformation = (((this.portInformation!= null)&&(!this.portInformation.isEmpty()))?this.getPortInformation():null);
            strategy.appendField(locator, this, "portInformation", buffer, thePortInformation, ((this.portInformation!= null)&&(!this.portInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
