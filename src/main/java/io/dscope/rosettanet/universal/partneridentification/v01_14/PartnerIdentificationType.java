
package io.dscope.rosettanet.universal.partneridentification.v01_14;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.abstracttype.v01_02.IdentifierType;
import io.dscope.rosettanet.universal.datatype.v01_04.DUNS;
import io.dscope.rosettanet.universal.datatype.v01_04.DUNSPlus4;
import io.dscope.rosettanet.universal.datatype.v01_04.GLN;
import io.dscope.rosettanet.universal.locations.v01_04.AlternativeIdentifier;
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
 *     &lt;extension base="{urn:rosettanet:specification:universal:AbstractType:xsd:schema:01.02}IdentifierType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}AlternativeIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}DUNS"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}DUNSPlus4"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}GLN"/&gt;
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
    "partnerName",
    "alternativeIdentifier",
    "duns",
    "dunsPlus4",
    "gln"
})
public class PartnerIdentificationType
    extends IdentifierType
    implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "PartnerName")
    protected String partnerName;
    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = AlternativeIdentifier.class, required = false)
    protected List<AlternativeIdentifier> alternativeIdentifier;
    @XmlElementRef(name = "DUNS", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.04", type = DUNS.class, required = false)
    protected DUNS duns;
    @XmlElementRef(name = "DUNSPlus4", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.04", type = DUNSPlus4 .class, required = false)
    protected DUNSPlus4 dunsPlus4;
    @XmlElementRef(name = "GLN", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.04", type = GLN.class, required = false)
    protected GLN gln;

    /**
     * Gets the value of the partnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the value of the partnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerName(String value) {
        this.partnerName = value;
    }

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
     *     {@link DUNS }
     *     
     */
    public DUNS getDUNS() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNS }
     *     
     */
    public void setDUNS(DUNS value) {
        this.duns = value;
    }

    /**
     * Gets the value of the dunsPlus4 property.
     * 
     * @return
     *     possible object is
     *     {@link DUNSPlus4 }
     *     
     */
    public DUNSPlus4 getDUNSPlus4() {
        return dunsPlus4;
    }

    /**
     * Sets the value of the dunsPlus4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNSPlus4 }
     *     
     */
    public void setDUNSPlus4(DUNSPlus4 value) {
        this.dunsPlus4 = value;
    }

    /**
     * Gets the value of the gln property.
     * 
     * @return
     *     possible object is
     *     {@link GLN }
     *     
     */
    public GLN getGLN() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLN }
     *     
     */
    public void setGLN(GLN value) {
        this.gln = value;
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
            String lhsPartnerName;
            lhsPartnerName = this.getPartnerName();
            String rhsPartnerName;
            rhsPartnerName = that.getPartnerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerName", lhsPartnerName), LocatorUtils.property(thatLocator, "partnerName", rhsPartnerName), lhsPartnerName, rhsPartnerName, (this.partnerName!= null), (that.partnerName!= null))) {
                return false;
            }
        }
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
            DUNS lhsDUNS;
            lhsDUNS = this.getDUNS();
            DUNS rhsDUNS;
            rhsDUNS = that.getDUNS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duns", lhsDUNS), LocatorUtils.property(thatLocator, "duns", rhsDUNS), lhsDUNS, rhsDUNS, (this.duns!= null), (that.duns!= null))) {
                return false;
            }
        }
        {
            DUNSPlus4 lhsDUNSPlus4;
            lhsDUNSPlus4 = this.getDUNSPlus4();
            DUNSPlus4 rhsDUNSPlus4;
            rhsDUNSPlus4 = that.getDUNSPlus4();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dunsPlus4", lhsDUNSPlus4), LocatorUtils.property(thatLocator, "dunsPlus4", rhsDUNSPlus4), lhsDUNSPlus4, rhsDUNSPlus4, (this.dunsPlus4 != null), (that.dunsPlus4 != null))) {
                return false;
            }
        }
        {
            GLN lhsGLN;
            lhsGLN = this.getGLN();
            GLN rhsGLN;
            rhsGLN = that.getGLN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gln", lhsGLN), LocatorUtils.property(thatLocator, "gln", rhsGLN), lhsGLN, rhsGLN, (this.gln!= null), (that.gln!= null))) {
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
            String thePartnerName;
            thePartnerName = this.getPartnerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerName", thePartnerName), currentHashCode, thePartnerName, (this.partnerName!= null));
        }
        {
            List<AlternativeIdentifier> theAlternativeIdentifier;
            theAlternativeIdentifier = (((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty()))?this.getAlternativeIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativeIdentifier", theAlternativeIdentifier), currentHashCode, theAlternativeIdentifier, ((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty())));
        }
        {
            DUNS theDUNS;
            theDUNS = this.getDUNS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duns", theDUNS), currentHashCode, theDUNS, (this.duns!= null));
        }
        {
            DUNSPlus4 theDUNSPlus4;
            theDUNSPlus4 = this.getDUNSPlus4();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dunsPlus4", theDUNSPlus4), currentHashCode, theDUNSPlus4, (this.dunsPlus4 != null));
        }
        {
            GLN theGLN;
            theGLN = this.getGLN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gln", theGLN), currentHashCode, theGLN, (this.gln!= null));
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
            String thePartnerName;
            thePartnerName = this.getPartnerName();
            strategy.appendField(locator, this, "partnerName", buffer, thePartnerName, (this.partnerName!= null));
        }
        {
            List<AlternativeIdentifier> theAlternativeIdentifier;
            theAlternativeIdentifier = (((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty()))?this.getAlternativeIdentifier():null);
            strategy.appendField(locator, this, "alternativeIdentifier", buffer, theAlternativeIdentifier, ((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty())));
        }
        {
            DUNS theDUNS;
            theDUNS = this.getDUNS();
            strategy.appendField(locator, this, "duns", buffer, theDUNS, (this.duns!= null));
        }
        {
            DUNSPlus4 theDUNSPlus4;
            theDUNSPlus4 = this.getDUNSPlus4();
            strategy.appendField(locator, this, "dunsPlus4", buffer, theDUNSPlus4, (this.dunsPlus4 != null));
        }
        {
            GLN theGLN;
            theGLN = this.getGLN();
            strategy.appendField(locator, this, "gln", buffer, theGLN, (this.gln!= null));
        }
        return buffer;
    }

}
