
package io.dscope.rosettanet.universal.productidentification.v01_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.abstracttype.v01_00.IdentifierType;
import io.dscope.rosettanet.universal.datatype.v01_00.Gtin;
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
 * <p>Java class for ProductIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:AbstractType:xsd:schema:1.0}IdentifierType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:1.0}AlternativeIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:1.0}Gtin"/&gt;
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
@XmlType(name = "ProductIdentificationType", propOrder = {
    "revision",
    "alternativeIdentifier",
    "gtin"
})
public class ProductIdentificationType
    extends IdentifierType
    implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Revision")
    protected String revision;
    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:1.0", type = AlternativeIdentifier.class, required = false)
    protected List<AlternativeIdentifier> alternativeIdentifier;
    @XmlElementRef(name = "Gtin", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:1.0", type = Gtin.class, required = false)
    protected Gtin gtin;

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
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
     * Gets the value of the gtin property.
     * 
     * @return
     *     possible object is
     *     {@link Gtin }
     *     
     */
    public Gtin getGtin() {
        return gtin;
    }

    /**
     * Sets the value of the gtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gtin }
     *     
     */
    public void setGtin(Gtin value) {
        this.gtin = value;
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
        final ProductIdentificationType that = ((ProductIdentificationType) object);
        {
            String lhsRevision;
            lhsRevision = this.getRevision();
            String rhsRevision;
            rhsRevision = that.getRevision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revision", lhsRevision), LocatorUtils.property(thatLocator, "revision", rhsRevision), lhsRevision, rhsRevision, (this.revision!= null), (that.revision!= null))) {
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
            Gtin lhsGtin;
            lhsGtin = this.getGtin();
            Gtin rhsGtin;
            rhsGtin = that.getGtin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gtin", lhsGtin), LocatorUtils.property(thatLocator, "gtin", rhsGtin), lhsGtin, rhsGtin, (this.gtin!= null), (that.gtin!= null))) {
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
            String theRevision;
            theRevision = this.getRevision();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revision", theRevision), currentHashCode, theRevision, (this.revision!= null));
        }
        {
            List<AlternativeIdentifier> theAlternativeIdentifier;
            theAlternativeIdentifier = (((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty()))?this.getAlternativeIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativeIdentifier", theAlternativeIdentifier), currentHashCode, theAlternativeIdentifier, ((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty())));
        }
        {
            Gtin theGtin;
            theGtin = this.getGtin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gtin", theGtin), currentHashCode, theGtin, (this.gtin!= null));
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
            String theRevision;
            theRevision = this.getRevision();
            strategy.appendField(locator, this, "revision", buffer, theRevision, (this.revision!= null));
        }
        {
            List<AlternativeIdentifier> theAlternativeIdentifier;
            theAlternativeIdentifier = (((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty()))?this.getAlternativeIdentifier():null);
            strategy.appendField(locator, this, "alternativeIdentifier", buffer, theAlternativeIdentifier, ((this.alternativeIdentifier!= null)&&(!this.alternativeIdentifier.isEmpty())));
        }
        {
            Gtin theGtin;
            theGtin = this.getGtin();
            strategy.appendField(locator, this, "gtin", buffer, theGtin, (this.gtin!= null));
        }
        return buffer;
    }

}
