
package io.dscope.rosettanet.interchange.materialreleasenotification.v02_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.OrderShippingInformation;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_12.PartnerDescription;
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
 * <p>Java class for MaterialReleaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialReleaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}OrderShippingInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PartnerProductRelease" type="{urn:rosettanet:specification:interchange:MaterialReleaseNotification:xsd:schema:02.00}PartnerProductReleaseType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ReleaseIdentifierReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MaterialReleaseType", propOrder = {
    "orderShippingInformation",
    "partnerDescription",
    "partnerProductRelease",
    "releaseIdentifierReference"
})
public class MaterialReleaseType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = OrderShippingInformation.class, required = false)
    protected List<OrderShippingInformation> orderShippingInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "PartnerProductRelease", required = true)
    protected List<PartnerProductReleaseType> partnerProductRelease;
    @XmlElement(name = "ReleaseIdentifierReference")
    protected List<BusinessDocumentReferenceType> releaseIdentifierReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the orderShippingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderShippingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderShippingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderShippingInformation }
     * 
     * 
     */
    public List<OrderShippingInformation> getOrderShippingInformation() {
        if (orderShippingInformation == null) {
            orderShippingInformation = new ArrayList<OrderShippingInformation>();
        }
        return this.orderShippingInformation;
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
     * Gets the value of the partnerProductRelease property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerProductRelease property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerProductRelease().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerProductReleaseType }
     * 
     * 
     */
    public List<PartnerProductReleaseType> getPartnerProductRelease() {
        if (partnerProductRelease == null) {
            partnerProductRelease = new ArrayList<PartnerProductReleaseType>();
        }
        return this.partnerProductRelease;
    }

    /**
     * Gets the value of the releaseIdentifierReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the releaseIdentifierReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReleaseIdentifierReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getReleaseIdentifierReference() {
        if (releaseIdentifierReference == null) {
            releaseIdentifierReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.releaseIdentifierReference;
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
        final MaterialReleaseType that = ((MaterialReleaseType) object);
        {
            List<OrderShippingInformation> lhsOrderShippingInformation;
            lhsOrderShippingInformation = (((this.orderShippingInformation!= null)&&(!this.orderShippingInformation.isEmpty()))?this.getOrderShippingInformation():null);
            List<OrderShippingInformation> rhsOrderShippingInformation;
            rhsOrderShippingInformation = (((that.orderShippingInformation!= null)&&(!that.orderShippingInformation.isEmpty()))?that.getOrderShippingInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderShippingInformation", lhsOrderShippingInformation), LocatorUtils.property(thatLocator, "orderShippingInformation", rhsOrderShippingInformation), lhsOrderShippingInformation, rhsOrderShippingInformation, ((this.orderShippingInformation!= null)&&(!this.orderShippingInformation.isEmpty())), ((that.orderShippingInformation!= null)&&(!that.orderShippingInformation.isEmpty())))) {
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
            List<PartnerProductReleaseType> lhsPartnerProductRelease;
            lhsPartnerProductRelease = (((this.partnerProductRelease!= null)&&(!this.partnerProductRelease.isEmpty()))?this.getPartnerProductRelease():null);
            List<PartnerProductReleaseType> rhsPartnerProductRelease;
            rhsPartnerProductRelease = (((that.partnerProductRelease!= null)&&(!that.partnerProductRelease.isEmpty()))?that.getPartnerProductRelease():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerProductRelease", lhsPartnerProductRelease), LocatorUtils.property(thatLocator, "partnerProductRelease", rhsPartnerProductRelease), lhsPartnerProductRelease, rhsPartnerProductRelease, ((this.partnerProductRelease!= null)&&(!this.partnerProductRelease.isEmpty())), ((that.partnerProductRelease!= null)&&(!that.partnerProductRelease.isEmpty())))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsReleaseIdentifierReference;
            lhsReleaseIdentifierReference = (((this.releaseIdentifierReference!= null)&&(!this.releaseIdentifierReference.isEmpty()))?this.getReleaseIdentifierReference():null);
            List<BusinessDocumentReferenceType> rhsReleaseIdentifierReference;
            rhsReleaseIdentifierReference = (((that.releaseIdentifierReference!= null)&&(!that.releaseIdentifierReference.isEmpty()))?that.getReleaseIdentifierReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "releaseIdentifierReference", lhsReleaseIdentifierReference), LocatorUtils.property(thatLocator, "releaseIdentifierReference", rhsReleaseIdentifierReference), lhsReleaseIdentifierReference, rhsReleaseIdentifierReference, ((this.releaseIdentifierReference!= null)&&(!this.releaseIdentifierReference.isEmpty())), ((that.releaseIdentifierReference!= null)&&(!that.releaseIdentifierReference.isEmpty())))) {
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
            List<OrderShippingInformation> theOrderShippingInformation;
            theOrderShippingInformation = (((this.orderShippingInformation!= null)&&(!this.orderShippingInformation.isEmpty()))?this.getOrderShippingInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderShippingInformation", theOrderShippingInformation), currentHashCode, theOrderShippingInformation, ((this.orderShippingInformation!= null)&&(!this.orderShippingInformation.isEmpty())));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            List<PartnerProductReleaseType> thePartnerProductRelease;
            thePartnerProductRelease = (((this.partnerProductRelease!= null)&&(!this.partnerProductRelease.isEmpty()))?this.getPartnerProductRelease():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerProductRelease", thePartnerProductRelease), currentHashCode, thePartnerProductRelease, ((this.partnerProductRelease!= null)&&(!this.partnerProductRelease.isEmpty())));
        }
        {
            List<BusinessDocumentReferenceType> theReleaseIdentifierReference;
            theReleaseIdentifierReference = (((this.releaseIdentifierReference!= null)&&(!this.releaseIdentifierReference.isEmpty()))?this.getReleaseIdentifierReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "releaseIdentifierReference", theReleaseIdentifierReference), currentHashCode, theReleaseIdentifierReference, ((this.releaseIdentifierReference!= null)&&(!this.releaseIdentifierReference.isEmpty())));
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
            List<OrderShippingInformation> theOrderShippingInformation;
            theOrderShippingInformation = (((this.orderShippingInformation!= null)&&(!this.orderShippingInformation.isEmpty()))?this.getOrderShippingInformation():null);
            strategy.appendField(locator, this, "orderShippingInformation", buffer, theOrderShippingInformation, ((this.orderShippingInformation!= null)&&(!this.orderShippingInformation.isEmpty())));
        }
        {
            List<PartnerDescription> thePartnerDescription;
            thePartnerDescription = (((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty()))?this.getPartnerDescription():null);
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, ((this.partnerDescription!= null)&&(!this.partnerDescription.isEmpty())));
        }
        {
            List<PartnerProductReleaseType> thePartnerProductRelease;
            thePartnerProductRelease = (((this.partnerProductRelease!= null)&&(!this.partnerProductRelease.isEmpty()))?this.getPartnerProductRelease():null);
            strategy.appendField(locator, this, "partnerProductRelease", buffer, thePartnerProductRelease, ((this.partnerProductRelease!= null)&&(!this.partnerProductRelease.isEmpty())));
        }
        {
            List<BusinessDocumentReferenceType> theReleaseIdentifierReference;
            theReleaseIdentifierReference = (((this.releaseIdentifierReference!= null)&&(!this.releaseIdentifierReference.isEmpty()))?this.getReleaseIdentifierReference():null);
            strategy.appendField(locator, this, "releaseIdentifierReference", buffer, theReleaseIdentifierReference, ((this.releaseIdentifierReference!= null)&&(!this.releaseIdentifierReference.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
