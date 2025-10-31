
package io.dscope.rosettanet.interchange.designregistrationrequest.v02_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
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
 * <p>Java class for DesignCustomerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignCustomerInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesignCustomerDistributorBranch" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}DUNSPlus4Type" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PointOfSaleCustomerDistributorBranch" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}DUNSPlus4Type" minOccurs="0"/&gt;
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
@XmlType(name = "DesignCustomerInformationType", propOrder = {
    "designCustomerDistributorBranch",
    "partnerDescription",
    "pointOfSaleCustomerDistributorBranch"
})
public class DesignCustomerInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DesignCustomerDistributorBranch")
    protected String designCustomerDistributorBranch;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "PointOfSaleCustomerDistributorBranch")
    protected String pointOfSaleCustomerDistributorBranch;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designCustomerDistributorBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignCustomerDistributorBranch() {
        return designCustomerDistributorBranch;
    }

    /**
     * Sets the value of the designCustomerDistributorBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignCustomerDistributorBranch(String value) {
        this.designCustomerDistributorBranch = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
    }

    /**
     * Gets the value of the pointOfSaleCustomerDistributorBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleCustomerDistributorBranch() {
        return pointOfSaleCustomerDistributorBranch;
    }

    /**
     * Sets the value of the pointOfSaleCustomerDistributorBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleCustomerDistributorBranch(String value) {
        this.pointOfSaleCustomerDistributorBranch = value;
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
        final DesignCustomerInformationType that = ((DesignCustomerInformationType) object);
        {
            String lhsDesignCustomerDistributorBranch;
            lhsDesignCustomerDistributorBranch = this.getDesignCustomerDistributorBranch();
            String rhsDesignCustomerDistributorBranch;
            rhsDesignCustomerDistributorBranch = that.getDesignCustomerDistributorBranch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designCustomerDistributorBranch", lhsDesignCustomerDistributorBranch), LocatorUtils.property(thatLocator, "designCustomerDistributorBranch", rhsDesignCustomerDistributorBranch), lhsDesignCustomerDistributorBranch, rhsDesignCustomerDistributorBranch, (this.designCustomerDistributorBranch!= null), (that.designCustomerDistributorBranch!= null))) {
                return false;
            }
        }
        {
            List<PartnerDescription> lhsPartnerDescription;
            lhsPartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            List<PartnerDescription> rhsPartnerDescription;
            rhsPartnerDescription = (((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty()))?that.getPartnerDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())), ((that.partnerDescription!= null)&&(!that.partnerDescription.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsPointOfSaleCustomerDistributorBranch;
            lhsPointOfSaleCustomerDistributorBranch = this.getPointOfSaleCustomerDistributorBranch();
            String rhsPointOfSaleCustomerDistributorBranch;
            rhsPointOfSaleCustomerDistributorBranch = that.getPointOfSaleCustomerDistributorBranch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pointOfSaleCustomerDistributorBranch", lhsPointOfSaleCustomerDistributorBranch), LocatorUtils.property(thatLocator, "pointOfSaleCustomerDistributorBranch", rhsPointOfSaleCustomerDistributorBranch), lhsPointOfSaleCustomerDistributorBranch, rhsPointOfSaleCustomerDistributorBranch, (this.pointOfSaleCustomerDistributorBranch!= null), (that.pointOfSaleCustomerDistributorBranch!= null))) {
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
            String theDesignCustomerDistributorBranch;
            theDesignCustomerDistributorBranch = this.getDesignCustomerDistributorBranch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designCustomerDistributorBranch", theDesignCustomerDistributorBranch), currentHashCode, theDesignCustomerDistributorBranch, (this.designCustomerDistributorBranch!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            String thePointOfSaleCustomerDistributorBranch;
            thePointOfSaleCustomerDistributorBranch = this.getPointOfSaleCustomerDistributorBranch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pointOfSaleCustomerDistributorBranch", thePointOfSaleCustomerDistributorBranch), currentHashCode, thePointOfSaleCustomerDistributorBranch, (this.pointOfSaleCustomerDistributorBranch!= null));
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
            String theDesignCustomerDistributorBranch;
            theDesignCustomerDistributorBranch = this.getDesignCustomerDistributorBranch();
            strategy.appendField(locator, this, "designCustomerDistributorBranch", buffer, theDesignCustomerDistributorBranch, (this.designCustomerDistributorBranch!= null));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            String thePointOfSaleCustomerDistributorBranch;
            thePointOfSaleCustomerDistributorBranch = this.getPointOfSaleCustomerDistributorBranch();
            strategy.appendField(locator, this, "pointOfSaleCustomerDistributorBranch", buffer, thePointOfSaleCustomerDistributorBranch, (this.pointOfSaleCustomerDistributorBranch!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
