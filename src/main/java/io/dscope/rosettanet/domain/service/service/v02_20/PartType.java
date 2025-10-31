
package io.dscope.rosettanet.domain.service.service.v02_20;

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
 * <p>Java class for PartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="List" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}ReplacedPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WarehouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PartType", propOrder = {
    "list",
    "replacedPart",
    "warehouseID"
})
public class PartType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "List", required = true)
    protected String list;
    @XmlElementRef(name = "ReplacedPart", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = ReplacedPart.class, required = false)
    protected List<ReplacedPart> replacedPart;
    @XmlElement(name = "WarehouseID")
    protected String warehouseID;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setList(String value) {
        this.list = value;
    }

    /**
     * Gets the value of the replacedPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacedPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacedPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplacedPart }
     * 
     * 
     */
    public List<ReplacedPart> getReplacedPart() {
        if (replacedPart == null) {
            replacedPart = new ArrayList<ReplacedPart>();
        }
        return this.replacedPart;
    }

    /**
     * Gets the value of the warehouseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseID() {
        return warehouseID;
    }

    /**
     * Sets the value of the warehouseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseID(String value) {
        this.warehouseID = value;
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
        final PartType that = ((PartType) object);
        {
            String lhsList;
            lhsList = this.getList();
            String rhsList;
            rhsList = that.getList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "list", lhsList), LocatorUtils.property(thatLocator, "list", rhsList), lhsList, rhsList, (this.list!= null), (that.list!= null))) {
                return false;
            }
        }
        {
            List<ReplacedPart> lhsReplacedPart;
            lhsReplacedPart = (((this.replacedPart!= null)&&(!this.replacedPart.isEmpty()))?this.getReplacedPart():null);
            List<ReplacedPart> rhsReplacedPart;
            rhsReplacedPart = (((that.replacedPart!= null)&&(!that.replacedPart.isEmpty()))?that.getReplacedPart():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replacedPart", lhsReplacedPart), LocatorUtils.property(thatLocator, "replacedPart", rhsReplacedPart), lhsReplacedPart, rhsReplacedPart, ((this.replacedPart!= null)&&(!this.replacedPart.isEmpty())), ((that.replacedPart!= null)&&(!that.replacedPart.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsWarehouseID;
            lhsWarehouseID = this.getWarehouseID();
            String rhsWarehouseID;
            rhsWarehouseID = that.getWarehouseID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warehouseID", lhsWarehouseID), LocatorUtils.property(thatLocator, "warehouseID", rhsWarehouseID), lhsWarehouseID, rhsWarehouseID, (this.warehouseID!= null), (that.warehouseID!= null))) {
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
            String theList;
            theList = this.getList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "list", theList), currentHashCode, theList, (this.list!= null));
        }
        {
            List<ReplacedPart> theReplacedPart;
            theReplacedPart = (((this.replacedPart!= null)&&(!this.replacedPart.isEmpty()))?this.getReplacedPart():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replacedPart", theReplacedPart), currentHashCode, theReplacedPart, ((this.replacedPart!= null)&&(!this.replacedPart.isEmpty())));
        }
        {
            String theWarehouseID;
            theWarehouseID = this.getWarehouseID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warehouseID", theWarehouseID), currentHashCode, theWarehouseID, (this.warehouseID!= null));
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
            String theList;
            theList = this.getList();
            strategy.appendField(locator, this, "list", buffer, theList, (this.list!= null));
        }
        {
            List<ReplacedPart> theReplacedPart;
            theReplacedPart = (((this.replacedPart!= null)&&(!this.replacedPart.isEmpty()))?this.getReplacedPart():null);
            strategy.appendField(locator, this, "replacedPart", buffer, theReplacedPart, ((this.replacedPart!= null)&&(!this.replacedPart.isEmpty())));
        }
        {
            String theWarehouseID;
            theWarehouseID = this.getWarehouseID();
            strategy.appendField(locator, this, "warehouseID", buffer, theWarehouseID, (this.warehouseID!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
