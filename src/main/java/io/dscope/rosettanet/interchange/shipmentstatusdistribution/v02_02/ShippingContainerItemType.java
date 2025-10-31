
package io.dscope.rosettanet.interchange.shipmentstatusdistribution.v02_02;

import java.math.BigInteger;
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
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.RequestingOrderLineItemReference;
import io.dscope.rosettanet.domain.shared.shared.v01_12.QuantityInformation;
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
 * <p>Java class for ShippingContainerItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingContainerItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfItemPackages" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}QuantityInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}RequestingOrderLineItemReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TraceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ShippingContainerItemType", propOrder = {
    "identifier",
    "numberOfItemPackages",
    "quantityInformation",
    "requestingOrderLineItemReference",
    "traceIdentifier"
})
public class ShippingContainerItemType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "NumberOfItemPackages")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfItemPackages;
    @XmlElementRef(name = "QuantityInformation", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.12", type = QuantityInformation.class, required = false)
    protected QuantityInformation quantityInformation;
    @XmlElementRef(name = "RequestingOrderLineItemReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = RequestingOrderLineItemReference.class, required = false)
    protected List<RequestingOrderLineItemReference> requestingOrderLineItemReference;
    @XmlElement(name = "TraceIdentifier")
    protected List<String> traceIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the numberOfItemPackages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItemPackages() {
        return numberOfItemPackages;
    }

    /**
     * Sets the value of the numberOfItemPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItemPackages(BigInteger value) {
        this.numberOfItemPackages = value;
    }

    /**
     * Gets the value of the quantityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityInformation }
     *     
     */
    public QuantityInformation getQuantityInformation() {
        return quantityInformation;
    }

    /**
     * Sets the value of the quantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityInformation }
     *     
     */
    public void setQuantityInformation(QuantityInformation value) {
        this.quantityInformation = value;
    }

    /**
     * Gets the value of the requestingOrderLineItemReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestingOrderLineItemReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestingOrderLineItemReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestingOrderLineItemReference }
     * 
     * 
     */
    public List<RequestingOrderLineItemReference> getRequestingOrderLineItemReference() {
        if (requestingOrderLineItemReference == null) {
            requestingOrderLineItemReference = new ArrayList<RequestingOrderLineItemReference>();
        }
        return this.requestingOrderLineItemReference;
    }

    /**
     * Gets the value of the traceIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traceIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraceIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTraceIdentifier() {
        if (traceIdentifier == null) {
            traceIdentifier = new ArrayList<String>();
        }
        return this.traceIdentifier;
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
        final ShippingContainerItemType that = ((ShippingContainerItemType) object);
        {
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsNumberOfItemPackages;
            lhsNumberOfItemPackages = this.getNumberOfItemPackages();
            BigInteger rhsNumberOfItemPackages;
            rhsNumberOfItemPackages = that.getNumberOfItemPackages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfItemPackages", lhsNumberOfItemPackages), LocatorUtils.property(thatLocator, "numberOfItemPackages", rhsNumberOfItemPackages), lhsNumberOfItemPackages, rhsNumberOfItemPackages, (this.numberOfItemPackages!= null), (that.numberOfItemPackages!= null))) {
                return false;
            }
        }
        {
            QuantityInformation lhsQuantityInformation;
            lhsQuantityInformation = this.getQuantityInformation();
            QuantityInformation rhsQuantityInformation;
            rhsQuantityInformation = that.getQuantityInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityInformation", lhsQuantityInformation), LocatorUtils.property(thatLocator, "quantityInformation", rhsQuantityInformation), lhsQuantityInformation, rhsQuantityInformation, (this.quantityInformation!= null), (that.quantityInformation!= null))) {
                return false;
            }
        }
        {
            List<RequestingOrderLineItemReference> lhsRequestingOrderLineItemReference;
            lhsRequestingOrderLineItemReference = (((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty()))?this.getRequestingOrderLineItemReference():null);
            List<RequestingOrderLineItemReference> rhsRequestingOrderLineItemReference;
            rhsRequestingOrderLineItemReference = (((that.requestingOrderLineItemReference!= null)&&(!that.requestingOrderLineItemReference.isEmpty()))?that.getRequestingOrderLineItemReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestingOrderLineItemReference", lhsRequestingOrderLineItemReference), LocatorUtils.property(thatLocator, "requestingOrderLineItemReference", rhsRequestingOrderLineItemReference), lhsRequestingOrderLineItemReference, rhsRequestingOrderLineItemReference, ((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty())), ((that.requestingOrderLineItemReference!= null)&&(!that.requestingOrderLineItemReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsTraceIdentifier;
            lhsTraceIdentifier = (((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty()))?this.getTraceIdentifier():null);
            List<String> rhsTraceIdentifier;
            rhsTraceIdentifier = (((that.traceIdentifier!= null)&&(!that.traceIdentifier.isEmpty()))?that.getTraceIdentifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "traceIdentifier", lhsTraceIdentifier), LocatorUtils.property(thatLocator, "traceIdentifier", rhsTraceIdentifier), lhsTraceIdentifier, rhsTraceIdentifier, ((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty())), ((that.traceIdentifier!= null)&&(!that.traceIdentifier.isEmpty())))) {
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
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            BigInteger theNumberOfItemPackages;
            theNumberOfItemPackages = this.getNumberOfItemPackages();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberOfItemPackages", theNumberOfItemPackages), currentHashCode, theNumberOfItemPackages, (this.numberOfItemPackages!= null));
        }
        {
            QuantityInformation theQuantityInformation;
            theQuantityInformation = this.getQuantityInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityInformation", theQuantityInformation), currentHashCode, theQuantityInformation, (this.quantityInformation!= null));
        }
        {
            List<RequestingOrderLineItemReference> theRequestingOrderLineItemReference;
            theRequestingOrderLineItemReference = (((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty()))?this.getRequestingOrderLineItemReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestingOrderLineItemReference", theRequestingOrderLineItemReference), currentHashCode, theRequestingOrderLineItemReference, ((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty())));
        }
        {
            List<String> theTraceIdentifier;
            theTraceIdentifier = (((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty()))?this.getTraceIdentifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traceIdentifier", theTraceIdentifier), currentHashCode, theTraceIdentifier, ((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty())));
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
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            BigInteger theNumberOfItemPackages;
            theNumberOfItemPackages = this.getNumberOfItemPackages();
            strategy.appendField(locator, this, "numberOfItemPackages", buffer, theNumberOfItemPackages, (this.numberOfItemPackages!= null));
        }
        {
            QuantityInformation theQuantityInformation;
            theQuantityInformation = this.getQuantityInformation();
            strategy.appendField(locator, this, "quantityInformation", buffer, theQuantityInformation, (this.quantityInformation!= null));
        }
        {
            List<RequestingOrderLineItemReference> theRequestingOrderLineItemReference;
            theRequestingOrderLineItemReference = (((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty()))?this.getRequestingOrderLineItemReference():null);
            strategy.appendField(locator, this, "requestingOrderLineItemReference", buffer, theRequestingOrderLineItemReference, ((this.requestingOrderLineItemReference!= null)&&(!this.requestingOrderLineItemReference.isEmpty())));
        }
        {
            List<String> theTraceIdentifier;
            theTraceIdentifier = (((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty()))?this.getTraceIdentifier():null);
            strategy.appendField(locator, this, "traceIdentifier", buffer, theTraceIdentifier, ((this.traceIdentifier!= null)&&(!this.traceIdentifier.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
