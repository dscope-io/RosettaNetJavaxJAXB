
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v01_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_00.KnownPartner;
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
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:drnct="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:1.0" xmlns:dsgn="urn:rosettanet:specification:domain:Design:xsd:schema:1.0" xmlns:p160557_="http://annox.dev.java.net" xmlns:p947740_="http://java.sun.com/xml/ns/jaxb" xmlns:sdctr="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:1.0" xmlns:tns="urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:1.0" xmlns:udcmn="urn:rosettanet:specification:universal:Document:xsd:schema:1.0" xmlns:updtn="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0" xmlns:uptrn="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;If the occurence of ProductInformationHeader is between 1 and 1 then the value of ProductInformationHeader/KnownPartner/ProcessRoleIdentifier MUST be 'MFG'.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductInformationHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}KnownPartner" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ProductInformationHeaderType", propOrder = {
    "knownPartner"
})
public class ProductInformationHeaderType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "KnownPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", type = KnownPartner.class)
    protected List<KnownPartner> knownPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the knownPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knownPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnownPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KnownPartner }
     * 
     * 
     */
    public List<KnownPartner> getKnownPartner() {
        if (knownPartner == null) {
            knownPartner = new ArrayList<KnownPartner>();
        }
        return this.knownPartner;
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
        final ProductInformationHeaderType that = ((ProductInformationHeaderType) object);
        {
            List<KnownPartner> lhsKnownPartner;
            lhsKnownPartner = (((this.knownPartner!= null)&&(!this.knownPartner.isEmpty()))?this.getKnownPartner():null);
            List<KnownPartner> rhsKnownPartner;
            rhsKnownPartner = (((that.knownPartner!= null)&&(!that.knownPartner.isEmpty()))?that.getKnownPartner():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "knownPartner", lhsKnownPartner), LocatorUtils.property(thatLocator, "knownPartner", rhsKnownPartner), lhsKnownPartner, rhsKnownPartner, ((this.knownPartner!= null)&&(!this.knownPartner.isEmpty())), ((that.knownPartner!= null)&&(!that.knownPartner.isEmpty())))) {
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
            List<KnownPartner> theKnownPartner;
            theKnownPartner = (((this.knownPartner!= null)&&(!this.knownPartner.isEmpty()))?this.getKnownPartner():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "knownPartner", theKnownPartner), currentHashCode, theKnownPartner, ((this.knownPartner!= null)&&(!this.knownPartner.isEmpty())));
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
            List<KnownPartner> theKnownPartner;
            theKnownPartner = (((this.knownPartner!= null)&&(!this.knownPartner.isEmpty()))?this.getKnownPartner():null);
            strategy.appendField(locator, this, "knownPartner", buffer, theKnownPartner, ((this.knownPartner!= null)&&(!this.knownPartner.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
