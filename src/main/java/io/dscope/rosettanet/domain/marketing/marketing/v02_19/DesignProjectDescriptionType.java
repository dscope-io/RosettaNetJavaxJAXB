
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.marketing.codelist.projectmarketsegment.v01_02.ProjectMarketSegment;
import io.dscope.rosettanet.universal.productidentification.v01_04.TextualDescription;
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
 * <p>Java class for DesignProjectDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignProjectDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:ProjectMarketSegment:xsd:codelist:01.02}ProjectMarketSegment" minOccurs="0"/&gt;
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescription" minOccurs="0"/&gt;
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
@XmlType(name = "DesignProjectDescriptionType", propOrder = {
    "projectComments",
    "projectMarketSegment",
    "projectName",
    "textualDescription"
})
public class DesignProjectDescriptionType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ProjectComments")
    protected String projectComments;
    @XmlElementRef(name = "ProjectMarketSegment", namespace = "urn:rosettanet:specification:domain:Marketing:ProjectMarketSegment:xsd:codelist:01.02", type = ProjectMarketSegment.class, required = false)
    protected ProjectMarketSegment projectMarketSegment;
    @XmlElement(name = "ProjectName")
    protected String projectName;
    @XmlElementRef(name = "TextualDescription", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = TextualDescription.class, required = false)
    protected TextualDescription textualDescription;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the projectComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectComments() {
        return projectComments;
    }

    /**
     * Sets the value of the projectComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectComments(String value) {
        this.projectComments = value;
    }

    /**
     * Gets the value of the projectMarketSegment property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectMarketSegment }
     *     
     */
    public ProjectMarketSegment getProjectMarketSegment() {
        return projectMarketSegment;
    }

    /**
     * Sets the value of the projectMarketSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectMarketSegment }
     *     
     */
    public void setProjectMarketSegment(ProjectMarketSegment value) {
        this.projectMarketSegment = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the textualDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescription }
     *     
     */
    public TextualDescription getTextualDescription() {
        return textualDescription;
    }

    /**
     * Sets the value of the textualDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescription }
     *     
     */
    public void setTextualDescription(TextualDescription value) {
        this.textualDescription = value;
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
        final DesignProjectDescriptionType that = ((DesignProjectDescriptionType) object);
        {
            String lhsProjectComments;
            lhsProjectComments = this.getProjectComments();
            String rhsProjectComments;
            rhsProjectComments = that.getProjectComments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projectComments", lhsProjectComments), LocatorUtils.property(thatLocator, "projectComments", rhsProjectComments), lhsProjectComments, rhsProjectComments, (this.projectComments!= null), (that.projectComments!= null))) {
                return false;
            }
        }
        {
            ProjectMarketSegment lhsProjectMarketSegment;
            lhsProjectMarketSegment = this.getProjectMarketSegment();
            ProjectMarketSegment rhsProjectMarketSegment;
            rhsProjectMarketSegment = that.getProjectMarketSegment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projectMarketSegment", lhsProjectMarketSegment), LocatorUtils.property(thatLocator, "projectMarketSegment", rhsProjectMarketSegment), lhsProjectMarketSegment, rhsProjectMarketSegment, (this.projectMarketSegment!= null), (that.projectMarketSegment!= null))) {
                return false;
            }
        }
        {
            String lhsProjectName;
            lhsProjectName = this.getProjectName();
            String rhsProjectName;
            rhsProjectName = that.getProjectName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "projectName", lhsProjectName), LocatorUtils.property(thatLocator, "projectName", rhsProjectName), lhsProjectName, rhsProjectName, (this.projectName!= null), (that.projectName!= null))) {
                return false;
            }
        }
        {
            TextualDescription lhsTextualDescription;
            lhsTextualDescription = this.getTextualDescription();
            TextualDescription rhsTextualDescription;
            rhsTextualDescription = that.getTextualDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "textualDescription", lhsTextualDescription), LocatorUtils.property(thatLocator, "textualDescription", rhsTextualDescription), lhsTextualDescription, rhsTextualDescription, (this.textualDescription!= null), (that.textualDescription!= null))) {
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
            String theProjectComments;
            theProjectComments = this.getProjectComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "projectComments", theProjectComments), currentHashCode, theProjectComments, (this.projectComments!= null));
        }
        {
            ProjectMarketSegment theProjectMarketSegment;
            theProjectMarketSegment = this.getProjectMarketSegment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "projectMarketSegment", theProjectMarketSegment), currentHashCode, theProjectMarketSegment, (this.projectMarketSegment!= null));
        }
        {
            String theProjectName;
            theProjectName = this.getProjectName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "projectName", theProjectName), currentHashCode, theProjectName, (this.projectName!= null));
        }
        {
            TextualDescription theTextualDescription;
            theTextualDescription = this.getTextualDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "textualDescription", theTextualDescription), currentHashCode, theTextualDescription, (this.textualDescription!= null));
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
            String theProjectComments;
            theProjectComments = this.getProjectComments();
            strategy.appendField(locator, this, "projectComments", buffer, theProjectComments, (this.projectComments!= null));
        }
        {
            ProjectMarketSegment theProjectMarketSegment;
            theProjectMarketSegment = this.getProjectMarketSegment();
            strategy.appendField(locator, this, "projectMarketSegment", buffer, theProjectMarketSegment, (this.projectMarketSegment!= null));
        }
        {
            String theProjectName;
            theProjectName = this.getProjectName();
            strategy.appendField(locator, this, "projectName", buffer, theProjectName, (this.projectName!= null));
        }
        {
            TextualDescription theTextualDescription;
            theTextualDescription = this.getTextualDescription();
            strategy.appendField(locator, this, "textualDescription", buffer, theTextualDescription, (this.textualDescription!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
