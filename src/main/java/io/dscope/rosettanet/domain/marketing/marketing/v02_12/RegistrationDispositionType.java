
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.marketing.codelist.designwinstatusreason.v01_03.DesignWinStatusReason;
import io.dscope.rosettanet.domain.marketing.codelist.disposition.v01_02.Disposition;
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
 * <p>Java class for RegistrationDispositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationDispositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:DesignWinStatusReason:xsd:codelist:01.03}DesignWinStatusReason" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DesignWinStatusReasonCodeExplanation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:Disposition:xsd:codelist:01.02}Disposition"/&gt;
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
@XmlType(name = "RegistrationDispositionType", propOrder = {
    "designWinStatusReason",
    "designWinStatusReasonCodeExplanation",
    "disposition"
})
public class RegistrationDispositionType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DesignWinStatusReason", namespace = "urn:rosettanet:specification:domain:Marketing:DesignWinStatusReason:xsd:codelist:01.03", type = DesignWinStatusReason.class, required = false)
    protected DesignWinStatusReason designWinStatusReason;
    @XmlElementRef(name = "DesignWinStatusReasonCodeExplanation", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DesignWinStatusReasonCodeExplanation.class, required = false)
    protected DesignWinStatusReasonCodeExplanation designWinStatusReasonCodeExplanation;
    @XmlElementRef(name = "Disposition", namespace = "urn:rosettanet:specification:domain:Marketing:Disposition:xsd:codelist:01.02", type = Disposition.class)
    protected Disposition disposition;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designWinStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link DesignWinStatusReason }
     *     
     */
    public DesignWinStatusReason getDesignWinStatusReason() {
        return designWinStatusReason;
    }

    /**
     * Sets the value of the designWinStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignWinStatusReason }
     *     
     */
    public void setDesignWinStatusReason(DesignWinStatusReason value) {
        this.designWinStatusReason = value;
    }

    /**
     * Gets the value of the designWinStatusReasonCodeExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link DesignWinStatusReasonCodeExplanation }
     *     
     */
    public DesignWinStatusReasonCodeExplanation getDesignWinStatusReasonCodeExplanation() {
        return designWinStatusReasonCodeExplanation;
    }

    /**
     * Sets the value of the designWinStatusReasonCodeExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignWinStatusReasonCodeExplanation }
     *     
     */
    public void setDesignWinStatusReasonCodeExplanation(DesignWinStatusReasonCodeExplanation value) {
        this.designWinStatusReasonCodeExplanation = value;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link Disposition }
     *     
     */
    public Disposition getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disposition }
     *     
     */
    public void setDisposition(Disposition value) {
        this.disposition = value;
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
        final RegistrationDispositionType that = ((RegistrationDispositionType) object);
        {
            DesignWinStatusReason lhsDesignWinStatusReason;
            lhsDesignWinStatusReason = this.getDesignWinStatusReason();
            DesignWinStatusReason rhsDesignWinStatusReason;
            rhsDesignWinStatusReason = that.getDesignWinStatusReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designWinStatusReason", lhsDesignWinStatusReason), LocatorUtils.property(thatLocator, "designWinStatusReason", rhsDesignWinStatusReason), lhsDesignWinStatusReason, rhsDesignWinStatusReason, (this.designWinStatusReason!= null), (that.designWinStatusReason!= null))) {
                return false;
            }
        }
        {
            DesignWinStatusReasonCodeExplanation lhsDesignWinStatusReasonCodeExplanation;
            lhsDesignWinStatusReasonCodeExplanation = this.getDesignWinStatusReasonCodeExplanation();
            DesignWinStatusReasonCodeExplanation rhsDesignWinStatusReasonCodeExplanation;
            rhsDesignWinStatusReasonCodeExplanation = that.getDesignWinStatusReasonCodeExplanation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designWinStatusReasonCodeExplanation", lhsDesignWinStatusReasonCodeExplanation), LocatorUtils.property(thatLocator, "designWinStatusReasonCodeExplanation", rhsDesignWinStatusReasonCodeExplanation), lhsDesignWinStatusReasonCodeExplanation, rhsDesignWinStatusReasonCodeExplanation, (this.designWinStatusReasonCodeExplanation!= null), (that.designWinStatusReasonCodeExplanation!= null))) {
                return false;
            }
        }
        {
            Disposition lhsDisposition;
            lhsDisposition = this.getDisposition();
            Disposition rhsDisposition;
            rhsDisposition = that.getDisposition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "disposition", lhsDisposition), LocatorUtils.property(thatLocator, "disposition", rhsDisposition), lhsDisposition, rhsDisposition, (this.disposition!= null), (that.disposition!= null))) {
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
            DesignWinStatusReason theDesignWinStatusReason;
            theDesignWinStatusReason = this.getDesignWinStatusReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designWinStatusReason", theDesignWinStatusReason), currentHashCode, theDesignWinStatusReason, (this.designWinStatusReason!= null));
        }
        {
            DesignWinStatusReasonCodeExplanation theDesignWinStatusReasonCodeExplanation;
            theDesignWinStatusReasonCodeExplanation = this.getDesignWinStatusReasonCodeExplanation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designWinStatusReasonCodeExplanation", theDesignWinStatusReasonCodeExplanation), currentHashCode, theDesignWinStatusReasonCodeExplanation, (this.designWinStatusReasonCodeExplanation!= null));
        }
        {
            Disposition theDisposition;
            theDisposition = this.getDisposition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "disposition", theDisposition), currentHashCode, theDisposition, (this.disposition!= null));
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
            DesignWinStatusReason theDesignWinStatusReason;
            theDesignWinStatusReason = this.getDesignWinStatusReason();
            strategy.appendField(locator, this, "designWinStatusReason", buffer, theDesignWinStatusReason, (this.designWinStatusReason!= null));
        }
        {
            DesignWinStatusReasonCodeExplanation theDesignWinStatusReasonCodeExplanation;
            theDesignWinStatusReasonCodeExplanation = this.getDesignWinStatusReasonCodeExplanation();
            strategy.appendField(locator, this, "designWinStatusReasonCodeExplanation", buffer, theDesignWinStatusReasonCodeExplanation, (this.designWinStatusReasonCodeExplanation!= null));
        }
        {
            Disposition theDisposition;
            theDisposition = this.getDisposition();
            strategy.appendField(locator, this, "disposition", buffer, theDisposition, (this.disposition!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
