
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.changereason.v01_04.ChangeReason;
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
 * <p>Java class for ChangeDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04}ChangeReason" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Impact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ChangeDescriptionType", propOrder = {
    "category",
    "changeReason",
    "comment",
    "description",
    "impact",
    "title"
})
public class ChangeDescriptionType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Category")
    protected String category;
    @XmlElementRef(name = "ChangeReason", namespace = "urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04", type = ChangeReason.class, required = false)
    protected ChangeReason changeReason;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Impact")
    protected String impact;
    @XmlElement(name = "Title")
    protected String title;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the changeReason property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeReason }
     *     
     */
    public ChangeReason getChangeReason() {
        return changeReason;
    }

    /**
     * Sets the value of the changeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeReason }
     *     
     */
    public void setChangeReason(ChangeReason value) {
        this.changeReason = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the impact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpact() {
        return impact;
    }

    /**
     * Sets the value of the impact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpact(String value) {
        this.impact = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
        final ChangeDescriptionType that = ((ChangeDescriptionType) object);
        {
            String lhsCategory;
            lhsCategory = this.getCategory();
            String rhsCategory;
            rhsCategory = that.getCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory, (this.category!= null), (that.category!= null))) {
                return false;
            }
        }
        {
            ChangeReason lhsChangeReason;
            lhsChangeReason = this.getChangeReason();
            ChangeReason rhsChangeReason;
            rhsChangeReason = that.getChangeReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeReason", lhsChangeReason), LocatorUtils.property(thatLocator, "changeReason", rhsChangeReason), lhsChangeReason, rhsChangeReason, (this.changeReason!= null), (that.changeReason!= null))) {
                return false;
            }
        }
        {
            String lhsComment;
            lhsComment = this.getComment();
            String rhsComment;
            rhsComment = that.getComment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comment", lhsComment), LocatorUtils.property(thatLocator, "comment", rhsComment), lhsComment, rhsComment, (this.comment!= null), (that.comment!= null))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            String lhsImpact;
            lhsImpact = this.getImpact();
            String rhsImpact;
            rhsImpact = that.getImpact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "impact", lhsImpact), LocatorUtils.property(thatLocator, "impact", rhsImpact), lhsImpact, rhsImpact, (this.impact!= null), (that.impact!= null))) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle, (this.title!= null), (that.title!= null))) {
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
            String theCategory;
            theCategory = this.getCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "category", theCategory), currentHashCode, theCategory, (this.category!= null));
        }
        {
            ChangeReason theChangeReason;
            theChangeReason = this.getChangeReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeReason", theChangeReason), currentHashCode, theChangeReason, (this.changeReason!= null));
        }
        {
            String theComment;
            theComment = this.getComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comment", theComment), currentHashCode, theComment, (this.comment!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            String theImpact;
            theImpact = this.getImpact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "impact", theImpact), currentHashCode, theImpact, (this.impact!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle, (this.title!= null));
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
            String theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory, (this.category!= null));
        }
        {
            ChangeReason theChangeReason;
            theChangeReason = this.getChangeReason();
            strategy.appendField(locator, this, "changeReason", buffer, theChangeReason, (this.changeReason!= null));
        }
        {
            String theComment;
            theComment = this.getComment();
            strategy.appendField(locator, this, "comment", buffer, theComment, (this.comment!= null));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            String theImpact;
            theImpact = this.getImpact();
            strategy.appendField(locator, this, "impact", buffer, theImpact, (this.impact!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
