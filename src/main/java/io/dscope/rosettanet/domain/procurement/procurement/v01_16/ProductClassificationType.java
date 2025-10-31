
package io.dscope.rosettanet.domain.procurement.procurement.v01_16;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.abstracttype.v01_01.IdentifierType;
import io.dscope.rosettanet.universal.locations.v01_02.AlternativeIdentifier;
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
 * <p>Java class for ProductClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:AbstractType:xsd:schema:01.01}IdentifierType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.02}AlternativeIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16}UNSPSC"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductClassificationType", propOrder = {
    "alternativeIdentifier",
    "unspsc"
})
public class ProductClassificationType
    extends IdentifierType
    implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.02", type = AlternativeIdentifier.class, required = false)
    protected List<AlternativeIdentifier> alternativeIdentifier;
    @XmlElementRef(name = "UNSPSC", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16", type = UNSPSC.class, required = false)
    protected UNSPSC unspsc;

    /**
     * Gets the value of the alternativeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeIdentifier }
     * 
     * 
     */
    public List<AlternativeIdentifier> getAlternativeIdentifier() {
        if (alternativeIdentifier == null) {
            alternativeIdentifier = new ArrayList<AlternativeIdentifier>();
        }
        return this.alternativeIdentifier;
    }

    /**
     * Gets the value of the unspsc property.
     * 
     * @return
     *     possible object is
     *     {@link UNSPSC }
     *     
     */
    public UNSPSC getUNSPSC() {
        return unspsc;
    }

    /**
     * Sets the value of the unspsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNSPSC }
     *     
     */
    public void setUNSPSC(UNSPSC value) {
        this.unspsc = value;
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
        final ProductClassificationType that = ((ProductClassificationType) object);
        {
            List<AlternativeIdentifier> lhsAlternativeIdentifier;
            lhsAlternativeIdentifier = (((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty()))?this.getAlternativeIdentifier():null);
            List<AlternativeIdentifier> rhsAlternativeIdentifier;
            rhsAlternativeIdentifier = (((that.alternativeIdentifier!= null)&&(!that.alternativeIdentifier.isEmpty()))?that.getAlternativeIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativeIdentifier", lhsAlternativeIdentifier), LocatorUtils.property(thatLocator, "alternativeIdentifier", rhsAlternativeIdentifier), lhsAlternativeIdentifier, rhsAlternativeIdentifier, ((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty())), ((that.alternativeIdentifier!= null)&&(!that.alternativeIdentifier.isEmpty())))) {
                return false;
            }
        }
        {
            UNSPSC lhsUNSPSC;
            lhsUNSPSC = this.getUNSPSC();
            UNSPSC rhsUNSPSC;
            rhsUNSPSC = that.getUNSPSC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unspsc", lhsUNSPSC), LocatorUtils.property(thatLocator, "unspsc", rhsUNSPSC), lhsUNSPSC, rhsUNSPSC, (this.unspsc!= null), (that.unspsc!= null))) {
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
            List<AlternativeIdentifier> theAlternativeIdentifier;
            theAlternativeIdentifier = (((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty()))?this.getAlternativeIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativeIdentifier", theAlternativeIdentifier), currentHashCode, theAlternativeIdentifier, ((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty())));
        }
        {
            UNSPSC theUNSPSC;
            theUNSPSC = this.getUNSPSC();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unspsc", theUNSPSC), currentHashCode, theUNSPSC, (this.unspsc!= null));
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
            List<AlternativeIdentifier> theAlternativeIdentifier;
            theAlternativeIdentifier = (((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty()))?this.getAlternativeIdentifier():null);
            strategy.appendField(locator, this, "alternativeIdentifier", buffer, theAlternativeIdentifier, ((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty())));
        }
        {
            UNSPSC theUNSPSC;
            theUNSPSC = this.getUNSPSC();
            strategy.appendField(locator, this, "unspsc", buffer, theUNSPSC, (this.unspsc!= null));
        }
        return buffer;
    }

}
