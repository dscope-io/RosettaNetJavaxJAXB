
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.manufacturing.codelist.statuschange.v01_01.StatusChange;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.ChangeDescriptionType;
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
 * <p>Java class for StatusChangeDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusChangeDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}ChangeDescriptionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:StatusChange:xsd:codelist:01.01}StatusChange"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusChangeDescriptionType", propOrder = {
    "statusChange"
})
public class StatusChangeDescriptionType
    extends ChangeDescriptionType
    implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "StatusChange", namespace = "urn:rosettanet:specification:domain:Manufacturing:StatusChange:xsd:codelist:01.01", type = StatusChange.class)
    protected StatusChange statusChange;

    /**
     * Gets the value of the statusChange property.
     * 
     * @return
     *     possible object is
     *     {@link StatusChange }
     *     
     */
    public StatusChange getStatusChange() {
        return statusChange;
    }

    /**
     * Sets the value of the statusChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusChange }
     *     
     */
    public void setStatusChange(StatusChange value) {
        this.statusChange = value;
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
        final StatusChangeDescriptionType that = ((StatusChangeDescriptionType) object);
        {
            StatusChange lhsStatusChange;
            lhsStatusChange = this.getStatusChange();
            StatusChange rhsStatusChange;
            rhsStatusChange = that.getStatusChange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusChange", lhsStatusChange), LocatorUtils.property(thatLocator, "statusChange", rhsStatusChange), lhsStatusChange, rhsStatusChange, (this.statusChange!= null), (that.statusChange!= null))) {
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
            StatusChange theStatusChange;
            theStatusChange = this.getStatusChange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusChange", theStatusChange), currentHashCode, theStatusChange, (this.statusChange!= null));
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
            StatusChange theStatusChange;
            theStatusChange = this.getStatusChange();
            strategy.appendField(locator, this, "statusChange", buffer, theStatusChange, (this.statusChange!= null));
        }
        return buffer;
    }

}
