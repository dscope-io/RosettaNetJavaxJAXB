
package io.dscope.rosettanet.universal.partneridentification.v01_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.abstracttype.v01_00.IdentifierType;
import io.dscope.rosettanet.universal.datatype.v01_00.Duns;
import io.dscope.rosettanet.universal.datatype.v01_00.DunsPlus4;
import io.dscope.rosettanet.universal.locations.v01_00.AlternativeIdentifier;
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
 * <p>Java class for PartnerIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:AbstractType:xsd:schema:1.0}IdentifierType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:1.0}AlternativeIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:1.0}Duns"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:1.0}DunsPlus4"/&gt;
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
@XmlType(name = "PartnerIdentificationType", propOrder = {
    "alternativeIdentifier",
    "duns",
    "dunsPlus4"
})
public class PartnerIdentificationType
    extends IdentifierType
    implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:1.0", type = AlternativeIdentifier.class, required = false)
    protected List<AlternativeIdentifier> alternativeIdentifier;
    @XmlElementRef(name = "Duns", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:1.0", type = Duns.class, required = false)
    protected Duns duns;
    @XmlElementRef(name = "DunsPlus4", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:1.0", type = DunsPlus4 .class, required = false)
    protected DunsPlus4 dunsPlus4;

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
     * Gets the value of the duns property.
     * 
     * @return
     *     possible object is
     *     {@link Duns }
     *     
     */
    public Duns getDuns() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duns }
     *     
     */
    public void setDuns(Duns value) {
        this.duns = value;
    }

    /**
     * Gets the value of the dunsPlus4 property.
     * 
     * @return
     *     possible object is
     *     {@link DunsPlus4 }
     *     
     */
    public DunsPlus4 getDunsPlus4() {
        return dunsPlus4;
    }

    /**
     * Sets the value of the dunsPlus4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DunsPlus4 }
     *     
     */
    public void setDunsPlus4(DunsPlus4 value) {
        this.dunsPlus4 = value;
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
        final PartnerIdentificationType that = ((PartnerIdentificationType) object);
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
            Duns lhsDuns;
            lhsDuns = this.getDuns();
            Duns rhsDuns;
            rhsDuns = that.getDuns();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duns", lhsDuns), LocatorUtils.property(thatLocator, "duns", rhsDuns), lhsDuns, rhsDuns, (this.duns!= null), (that.duns!= null))) {
                return false;
            }
        }
        {
            DunsPlus4 lhsDunsPlus4;
            lhsDunsPlus4 = this.getDunsPlus4();
            DunsPlus4 rhsDunsPlus4;
            rhsDunsPlus4 = that.getDunsPlus4();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dunsPlus4", lhsDunsPlus4), LocatorUtils.property(thatLocator, "dunsPlus4", rhsDunsPlus4), lhsDunsPlus4, rhsDunsPlus4, (this.dunsPlus4 != null), (that.dunsPlus4 != null))) {
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
            Duns theDuns;
            theDuns = this.getDuns();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duns", theDuns), currentHashCode, theDuns, (this.duns!= null));
        }
        {
            DunsPlus4 theDunsPlus4;
            theDunsPlus4 = this.getDunsPlus4();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dunsPlus4", theDunsPlus4), currentHashCode, theDunsPlus4, (this.dunsPlus4 != null));
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
            Duns theDuns;
            theDuns = this.getDuns();
            strategy.appendField(locator, this, "duns", buffer, theDuns, (this.duns!= null));
        }
        {
            DunsPlus4 theDunsPlus4;
            theDunsPlus4 = this.getDunsPlus4();
            strategy.appendField(locator, this, "dunsPlus4", buffer, theDunsPlus4, (this.dunsPlus4 != null));
        }
        return buffer;
    }

}
