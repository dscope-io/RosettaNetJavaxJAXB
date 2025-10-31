
package io.dscope.rosettanet.system.standarddocumentheader.v01_20;

import java.math.BigInteger;
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
 * <p>Java class for DocumentManifestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentManifestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.20}ManifestItem" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MultipleType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
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
@XmlType(name = "DocumentManifestType", propOrder = {
    "manifestItem",
    "multipleType",
    "numberOfItems"
})
public class DocumentManifestType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ManifestItem", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.20", type = ManifestItem.class)
    protected List<ManifestItem> manifestItem;
    @XmlElement(name = "MultipleType")
    protected Boolean multipleType;
    @XmlElement(name = "NumberOfItems", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfItems;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the manifestItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manifestItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManifestItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManifestItem }
     * 
     * 
     */
    public List<ManifestItem> getManifestItem() {
        if (manifestItem == null) {
            manifestItem = new ArrayList<ManifestItem>();
        }
        return this.manifestItem;
    }

    /**
     * Gets the value of the multipleType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleType() {
        return multipleType;
    }

    /**
     * Sets the value of the multipleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleType(Boolean value) {
        this.multipleType = value;
    }

    /**
     * Gets the value of the numberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Sets the value of the numberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItems(BigInteger value) {
        this.numberOfItems = value;
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
        final DocumentManifestType that = ((DocumentManifestType) object);
        {
            List<ManifestItem> lhsManifestItem;
            lhsManifestItem = (((this.manifestItem!= null)&&(!this.manifestItem.isEmpty()))?this.getManifestItem():null);
            List<ManifestItem> rhsManifestItem;
            rhsManifestItem = (((that.manifestItem!= null)&&(!that.manifestItem.isEmpty()))?that.getManifestItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manifestItem", lhsManifestItem), LocatorUtils.property(thatLocator, "manifestItem", rhsManifestItem), lhsManifestItem, rhsManifestItem, ((this.manifestItem!= null)&&(!this.manifestItem.isEmpty())), ((that.manifestItem!= null)&&(!that.manifestItem.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsMultipleType;
            lhsMultipleType = this.isMultipleType();
            Boolean rhsMultipleType;
            rhsMultipleType = that.isMultipleType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multipleType", lhsMultipleType), LocatorUtils.property(thatLocator, "multipleType", rhsMultipleType), lhsMultipleType, rhsMultipleType, (this.multipleType!= null), (that.multipleType!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsNumberOfItems;
            lhsNumberOfItems = this.getNumberOfItems();
            BigInteger rhsNumberOfItems;
            rhsNumberOfItems = that.getNumberOfItems();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfItems", lhsNumberOfItems), LocatorUtils.property(thatLocator, "numberOfItems", rhsNumberOfItems), lhsNumberOfItems, rhsNumberOfItems, (this.numberOfItems!= null), (that.numberOfItems!= null))) {
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
            List<ManifestItem> theManifestItem;
            theManifestItem = (((this.manifestItem!= null)&&(!this.manifestItem.isEmpty()))?this.getManifestItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manifestItem", theManifestItem), currentHashCode, theManifestItem, ((this.manifestItem!= null)&&(!this.manifestItem.isEmpty())));
        }
        {
            Boolean theMultipleType;
            theMultipleType = this.isMultipleType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multipleType", theMultipleType), currentHashCode, theMultipleType, (this.multipleType!= null));
        }
        {
            BigInteger theNumberOfItems;
            theNumberOfItems = this.getNumberOfItems();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberOfItems", theNumberOfItems), currentHashCode, theNumberOfItems, (this.numberOfItems!= null));
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
            List<ManifestItem> theManifestItem;
            theManifestItem = (((this.manifestItem!= null)&&(!this.manifestItem.isEmpty()))?this.getManifestItem():null);
            strategy.appendField(locator, this, "manifestItem", buffer, theManifestItem, ((this.manifestItem!= null)&&(!this.manifestItem.isEmpty())));
        }
        {
            Boolean theMultipleType;
            theMultipleType = this.isMultipleType();
            strategy.appendField(locator, this, "multipleType", buffer, theMultipleType, (this.multipleType!= null));
        }
        {
            BigInteger theNumberOfItems;
            theNumberOfItems = this.getNumberOfItems();
            strategy.appendField(locator, this, "numberOfItems", buffer, theNumberOfItems, (this.numberOfItems!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
