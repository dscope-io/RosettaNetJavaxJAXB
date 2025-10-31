
package io.dscope.rosettanet.interchange.materialreleasenotification.v02_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_12.PartnerDescriptionType;
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
 * <p>Java class for PartnerProductReleaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerProductReleaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReleasePartnerDescription" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}PartnerDescriptionType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ReleaseProduct" type="{urn:rosettanet:specification:interchange:MaterialReleaseNotification:xsd:schema:02.00}ReleaseProductType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "PartnerProductReleaseType", propOrder = {
    "releasePartnerDescription",
    "releaseProduct"
})
public class PartnerProductReleaseType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ReleasePartnerDescription", required = true)
    protected List<PartnerDescriptionType> releasePartnerDescription;
    @XmlElement(name = "ReleaseProduct", required = true)
    protected List<ReleaseProductType> releaseProduct;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the releasePartnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the releasePartnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReleasePartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescriptionType }
     * 
     * 
     */
    public List<PartnerDescriptionType> getReleasePartnerDescription() {
        if (releasePartnerDescription == null) {
            releasePartnerDescription = new ArrayList<PartnerDescriptionType>();
        }
        return this.releasePartnerDescription;
    }

    /**
     * Gets the value of the releaseProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the releaseProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReleaseProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReleaseProductType }
     * 
     * 
     */
    public List<ReleaseProductType> getReleaseProduct() {
        if (releaseProduct == null) {
            releaseProduct = new ArrayList<ReleaseProductType>();
        }
        return this.releaseProduct;
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
        final PartnerProductReleaseType that = ((PartnerProductReleaseType) object);
        {
            List<PartnerDescriptionType> lhsReleasePartnerDescription;
            lhsReleasePartnerDescription = (((this.releasePartnerDescription!= null)&&(!this.releasePartnerDescription.isEmpty()))?this.getReleasePartnerDescription():null);
            List<PartnerDescriptionType> rhsReleasePartnerDescription;
            rhsReleasePartnerDescription = (((that.releasePartnerDescription!= null)&&(!that.releasePartnerDescription.isEmpty()))?that.getReleasePartnerDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "releasePartnerDescription", lhsReleasePartnerDescription), LocatorUtils.property(thatLocator, "releasePartnerDescription", rhsReleasePartnerDescription), lhsReleasePartnerDescription, rhsReleasePartnerDescription, ((this.releasePartnerDescription!= null)&&(!this.releasePartnerDescription.isEmpty())), ((that.releasePartnerDescription!= null)&&(!that.releasePartnerDescription.isEmpty())))) {
                return false;
            }
        }
        {
            List<ReleaseProductType> lhsReleaseProduct;
            lhsReleaseProduct = (((this.releaseProduct!= null)&&(!this.releaseProduct.isEmpty()))?this.getReleaseProduct():null);
            List<ReleaseProductType> rhsReleaseProduct;
            rhsReleaseProduct = (((that.releaseProduct!= null)&&(!that.releaseProduct.isEmpty()))?that.getReleaseProduct():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "releaseProduct", lhsReleaseProduct), LocatorUtils.property(thatLocator, "releaseProduct", rhsReleaseProduct), lhsReleaseProduct, rhsReleaseProduct, ((this.releaseProduct!= null)&&(!this.releaseProduct.isEmpty())), ((that.releaseProduct!= null)&&(!that.releaseProduct.isEmpty())))) {
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
            List<PartnerDescriptionType> theReleasePartnerDescription;
            theReleasePartnerDescription = (((this.releasePartnerDescription!= null)&&(!this.releasePartnerDescription.isEmpty()))?this.getReleasePartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "releasePartnerDescription", theReleasePartnerDescription), currentHashCode, theReleasePartnerDescription, ((this.releasePartnerDescription!= null)&&(!this.releasePartnerDescription.isEmpty())));
        }
        {
            List<ReleaseProductType> theReleaseProduct;
            theReleaseProduct = (((this.releaseProduct!= null)&&(!this.releaseProduct.isEmpty()))?this.getReleaseProduct():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "releaseProduct", theReleaseProduct), currentHashCode, theReleaseProduct, ((this.releaseProduct!= null)&&(!this.releaseProduct.isEmpty())));
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
            List<PartnerDescriptionType> theReleasePartnerDescription;
            theReleasePartnerDescription = (((this.releasePartnerDescription!= null)&&(!this.releasePartnerDescription.isEmpty()))?this.getReleasePartnerDescription():null);
            strategy.appendField(locator, this, "releasePartnerDescription", buffer, theReleasePartnerDescription, ((this.releasePartnerDescription!= null)&&(!this.releasePartnerDescription.isEmpty())));
        }
        {
            List<ReleaseProductType> theReleaseProduct;
            theReleaseProduct = (((this.releaseProduct!= null)&&(!this.releaseProduct.isEmpty()))?this.getReleaseProduct():null);
            strategy.appendField(locator, this, "releaseProduct", buffer, theReleaseProduct, ((this.releaseProduct!= null)&&(!this.releaseProduct.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
