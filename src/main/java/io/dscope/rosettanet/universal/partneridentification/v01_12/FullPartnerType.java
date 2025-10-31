
package io.dscope.rosettanet.universal.partneridentification.v01_12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.codelist.processroleidentifier.v01_08.ProcessRoleIdentifier;
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
 * <p>Java class for FullPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FullPartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedFullPartnerType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:01.08}ProcessRoleIdentifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullPartnerType", propOrder = {
    "processRoleIdentifier"
})
public class FullPartnerType
    extends SpecifiedFullPartnerType
    implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ProcessRoleIdentifier", namespace = "urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:01.08", type = ProcessRoleIdentifier.class)
    protected ProcessRoleIdentifier processRoleIdentifier;

    /**
     * Gets the value of the processRoleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRoleIdentifier }
     *     
     */
    public ProcessRoleIdentifier getProcessRoleIdentifier() {
        return processRoleIdentifier;
    }

    /**
     * Sets the value of the processRoleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRoleIdentifier }
     *     
     */
    public void setProcessRoleIdentifier(ProcessRoleIdentifier value) {
        this.processRoleIdentifier = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FullPartnerType that = ((FullPartnerType) object);
        {
            ProcessRoleIdentifier lhsProcessRoleIdentifier;
            lhsProcessRoleIdentifier = this.getProcessRoleIdentifier();
            ProcessRoleIdentifier rhsProcessRoleIdentifier;
            rhsProcessRoleIdentifier = that.getProcessRoleIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processRoleIdentifier", lhsProcessRoleIdentifier), LocatorUtils.property(thatLocator, "processRoleIdentifier", rhsProcessRoleIdentifier), lhsProcessRoleIdentifier, rhsProcessRoleIdentifier, (this.processRoleIdentifier!= null), (that.processRoleIdentifier!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ProcessRoleIdentifier theProcessRoleIdentifier;
            theProcessRoleIdentifier = this.getProcessRoleIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processRoleIdentifier", theProcessRoleIdentifier), currentHashCode, theProcessRoleIdentifier, (this.processRoleIdentifier!= null));
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
        super.appendFields(locator, buffer, strategy);
        {
            ProcessRoleIdentifier theProcessRoleIdentifier;
            theProcessRoleIdentifier = this.getProcessRoleIdentifier();
            strategy.appendField(locator, this, "processRoleIdentifier", buffer, theProcessRoleIdentifier, (this.processRoleIdentifier!= null));
        }
        return buffer;
    }

}
