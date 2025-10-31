
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

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
 * <p>Java class for HardwareSetsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HardwareSetsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14}TesterAttachment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14}TesterFEH" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "HardwareSetsType", propOrder = {
    "testerAttachment",
    "testerFEH"
})
public class HardwareSetsType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "TesterAttachment", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", type = TesterAttachment.class, required = false)
    protected List<TesterAttachment> testerAttachment;
    @XmlElementRef(name = "TesterFEH", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", type = TesterFEH.class, required = false)
    protected List<TesterFEH> testerFEH;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the testerAttachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testerAttachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTesterAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TesterAttachment }
     * 
     * 
     */
    public List<TesterAttachment> getTesterAttachment() {
        if (testerAttachment == null) {
            testerAttachment = new ArrayList<TesterAttachment>();
        }
        return this.testerAttachment;
    }

    /**
     * Gets the value of the testerFEH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testerFEH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTesterFEH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TesterFEH }
     * 
     * 
     */
    public List<TesterFEH> getTesterFEH() {
        if (testerFEH == null) {
            testerFEH = new ArrayList<TesterFEH>();
        }
        return this.testerFEH;
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
        final HardwareSetsType that = ((HardwareSetsType) object);
        {
            List<TesterAttachment> lhsTesterAttachment;
            lhsTesterAttachment = (((this.testerAttachment!= null)&&(!this.testerAttachment.isEmpty()))?this.getTesterAttachment():null);
            List<TesterAttachment> rhsTesterAttachment;
            rhsTesterAttachment = (((that.testerAttachment!= null)&&(!that.testerAttachment.isEmpty()))?that.getTesterAttachment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testerAttachment", lhsTesterAttachment), LocatorUtils.property(thatLocator, "testerAttachment", rhsTesterAttachment), lhsTesterAttachment, rhsTesterAttachment, ((this.testerAttachment!= null)&&(!this.testerAttachment.isEmpty())), ((that.testerAttachment!= null)&&(!that.testerAttachment.isEmpty())))) {
                return false;
            }
        }
        {
            List<TesterFEH> lhsTesterFEH;
            lhsTesterFEH = (((this.testerFEH!= null)&&(!this.testerFEH.isEmpty()))?this.getTesterFEH():null);
            List<TesterFEH> rhsTesterFEH;
            rhsTesterFEH = (((that.testerFEH!= null)&&(!that.testerFEH.isEmpty()))?that.getTesterFEH():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testerFEH", lhsTesterFEH), LocatorUtils.property(thatLocator, "testerFEH", rhsTesterFEH), lhsTesterFEH, rhsTesterFEH, ((this.testerFEH!= null)&&(!this.testerFEH.isEmpty())), ((that.testerFEH!= null)&&(!that.testerFEH.isEmpty())))) {
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
            List<TesterAttachment> theTesterAttachment;
            theTesterAttachment = (((this.testerAttachment!= null)&&(!this.testerAttachment.isEmpty()))?this.getTesterAttachment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testerAttachment", theTesterAttachment), currentHashCode, theTesterAttachment, ((this.testerAttachment!= null)&&(!this.testerAttachment.isEmpty())));
        }
        {
            List<TesterFEH> theTesterFEH;
            theTesterFEH = (((this.testerFEH!= null)&&(!this.testerFEH.isEmpty()))?this.getTesterFEH():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testerFEH", theTesterFEH), currentHashCode, theTesterFEH, ((this.testerFEH!= null)&&(!this.testerFEH.isEmpty())));
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
            List<TesterAttachment> theTesterAttachment;
            theTesterAttachment = (((this.testerAttachment!= null)&&(!this.testerAttachment.isEmpty()))?this.getTesterAttachment():null);
            strategy.appendField(locator, this, "testerAttachment", buffer, theTesterAttachment, ((this.testerAttachment!= null)&&(!this.testerAttachment.isEmpty())));
        }
        {
            List<TesterFEH> theTesterFEH;
            theTesterFEH = (((this.testerFEH!= null)&&(!this.testerFEH.isEmpty()))?this.getTesterFEH():null);
            strategy.appendField(locator, this, "testerFEH", buffer, theTesterFEH, ((this.testerFEH!= null)&&(!this.testerFEH.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
