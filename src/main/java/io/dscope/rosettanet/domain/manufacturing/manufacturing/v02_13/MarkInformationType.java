
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.markside.v01_03.MarkSide;
import io.dscope.rosettanet.domain.manufacturing.codelist.marktype.v01_03.MarkType;
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
 * <p>Java class for MarkInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}MarkingContents" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:MarkSide:xsd:codelist:01.03}MarkSide" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:MarkType:xsd:codelist:01.03}MarkType" minOccurs="0"/&gt;
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
@XmlType(name = "MarkInformationType", propOrder = {
    "markingContents",
    "markSide",
    "markType"
})
public class MarkInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "MarkingContents", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = MarkingContents.class)
    protected List<MarkingContents> markingContents;
    @XmlElementRef(name = "MarkSide", namespace = "urn:rosettanet:specification:domain:Manufacturing:MarkSide:xsd:codelist:01.03", type = MarkSide.class, required = false)
    protected MarkSide markSide;
    @XmlElementRef(name = "MarkType", namespace = "urn:rosettanet:specification:domain:Manufacturing:MarkType:xsd:codelist:01.03", type = MarkType.class, required = false)
    protected MarkType markType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the markingContents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markingContents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkingContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkingContents }
     * 
     * 
     */
    public List<MarkingContents> getMarkingContents() {
        if (markingContents == null) {
            markingContents = new ArrayList<MarkingContents>();
        }
        return this.markingContents;
    }

    /**
     * Gets the value of the markSide property.
     * 
     * @return
     *     possible object is
     *     {@link MarkSide }
     *     
     */
    public MarkSide getMarkSide() {
        return markSide;
    }

    /**
     * Sets the value of the markSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkSide }
     *     
     */
    public void setMarkSide(MarkSide value) {
        this.markSide = value;
    }

    /**
     * Gets the value of the markType property.
     * 
     * @return
     *     possible object is
     *     {@link MarkType }
     *     
     */
    public MarkType getMarkType() {
        return markType;
    }

    /**
     * Sets the value of the markType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkType }
     *     
     */
    public void setMarkType(MarkType value) {
        this.markType = value;
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
        final MarkInformationType that = ((MarkInformationType) object);
        {
            List<MarkingContents> lhsMarkingContents;
            lhsMarkingContents = (((this.markingContents!= null)&&(!this.markingContents.isEmpty()))?this.getMarkingContents():null);
            List<MarkingContents> rhsMarkingContents;
            rhsMarkingContents = (((that.markingContents!= null)&&(!that.markingContents.isEmpty()))?that.getMarkingContents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markingContents", lhsMarkingContents), LocatorUtils.property(thatLocator, "markingContents", rhsMarkingContents), lhsMarkingContents, rhsMarkingContents, ((this.markingContents!= null)&&(!this.markingContents.isEmpty())), ((that.markingContents!= null)&&(!that.markingContents.isEmpty())))) {
                return false;
            }
        }
        {
            MarkSide lhsMarkSide;
            lhsMarkSide = this.getMarkSide();
            MarkSide rhsMarkSide;
            rhsMarkSide = that.getMarkSide();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markSide", lhsMarkSide), LocatorUtils.property(thatLocator, "markSide", rhsMarkSide), lhsMarkSide, rhsMarkSide, (this.markSide!= null), (that.markSide!= null))) {
                return false;
            }
        }
        {
            MarkType lhsMarkType;
            lhsMarkType = this.getMarkType();
            MarkType rhsMarkType;
            rhsMarkType = that.getMarkType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markType", lhsMarkType), LocatorUtils.property(thatLocator, "markType", rhsMarkType), lhsMarkType, rhsMarkType, (this.markType!= null), (that.markType!= null))) {
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
            List<MarkingContents> theMarkingContents;
            theMarkingContents = (((this.markingContents!= null)&&(!this.markingContents.isEmpty()))?this.getMarkingContents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markingContents", theMarkingContents), currentHashCode, theMarkingContents, ((this.markingContents!= null)&&(!this.markingContents.isEmpty())));
        }
        {
            MarkSide theMarkSide;
            theMarkSide = this.getMarkSide();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markSide", theMarkSide), currentHashCode, theMarkSide, (this.markSide!= null));
        }
        {
            MarkType theMarkType;
            theMarkType = this.getMarkType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markType", theMarkType), currentHashCode, theMarkType, (this.markType!= null));
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
            List<MarkingContents> theMarkingContents;
            theMarkingContents = (((this.markingContents!= null)&&(!this.markingContents.isEmpty()))?this.getMarkingContents():null);
            strategy.appendField(locator, this, "markingContents", buffer, theMarkingContents, ((this.markingContents!= null)&&(!this.markingContents.isEmpty())));
        }
        {
            MarkSide theMarkSide;
            theMarkSide = this.getMarkSide();
            strategy.appendField(locator, this, "markSide", buffer, theMarkSide, (this.markSide!= null));
        }
        {
            MarkType theMarkType;
            theMarkType = this.getMarkType();
            strategy.appendField(locator, this, "markType", buffer, theMarkType, (this.markType!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
