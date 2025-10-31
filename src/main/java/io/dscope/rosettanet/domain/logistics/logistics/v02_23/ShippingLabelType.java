
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

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
 * <p>Java class for ShippingLabelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingLabelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BarcodeInstruction" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}LabelInstructionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}LabelServiceContent" minOccurs="0"/&gt;
 *         &lt;element name="RoutingInstruction" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}LabelInstructionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValueAddedService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ShippingLabelType", propOrder = {
    "barcodeInstruction",
    "description",
    "labelServiceContent",
    "routingInstruction",
    "serviceAccountNumber",
    "serviceText",
    "valueAddedService"
})
public class ShippingLabelType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BarcodeInstruction")
    protected List<LabelInstructionType> barcodeInstruction;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "LabelServiceContent", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = LabelServiceContent.class, required = false)
    protected LabelServiceContent labelServiceContent;
    @XmlElement(name = "RoutingInstruction")
    protected List<LabelInstructionType> routingInstruction;
    @XmlElement(name = "ServiceAccountNumber")
    protected String serviceAccountNumber;
    @XmlElement(name = "ServiceText")
    protected String serviceText;
    @XmlElement(name = "ValueAddedService")
    protected String valueAddedService;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the barcodeInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barcodeInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarcodeInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelInstructionType }
     * 
     * 
     */
    public List<LabelInstructionType> getBarcodeInstruction() {
        if (barcodeInstruction == null) {
            barcodeInstruction = new ArrayList<LabelInstructionType>();
        }
        return this.barcodeInstruction;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the labelServiceContent property.
     * 
     * @return
     *     possible object is
     *     {@link LabelServiceContent }
     *     
     */
    public LabelServiceContent getLabelServiceContent() {
        return labelServiceContent;
    }

    /**
     * Sets the value of the labelServiceContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelServiceContent }
     *     
     */
    public void setLabelServiceContent(LabelServiceContent value) {
        this.labelServiceContent = value;
    }

    /**
     * Gets the value of the routingInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelInstructionType }
     * 
     * 
     */
    public List<LabelInstructionType> getRoutingInstruction() {
        if (routingInstruction == null) {
            routingInstruction = new ArrayList<LabelInstructionType>();
        }
        return this.routingInstruction;
    }

    /**
     * Gets the value of the serviceAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountNumber() {
        return serviceAccountNumber;
    }

    /**
     * Sets the value of the serviceAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountNumber(String value) {
        this.serviceAccountNumber = value;
    }

    /**
     * Gets the value of the serviceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceText() {
        return serviceText;
    }

    /**
     * Sets the value of the serviceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceText(String value) {
        this.serviceText = value;
    }

    /**
     * Gets the value of the valueAddedService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAddedService() {
        return valueAddedService;
    }

    /**
     * Sets the value of the valueAddedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAddedService(String value) {
        this.valueAddedService = value;
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
        final ShippingLabelType that = ((ShippingLabelType) object);
        {
            List<LabelInstructionType> lhsBarcodeInstruction;
            lhsBarcodeInstruction = (((this.barcodeInstruction!= null)&&(!this.barcodeInstruction.isEmpty()))?this.getBarcodeInstruction():null);
            List<LabelInstructionType> rhsBarcodeInstruction;
            rhsBarcodeInstruction = (((that.barcodeInstruction!= null)&&(!that.barcodeInstruction.isEmpty()))?that.getBarcodeInstruction():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barcodeInstruction", lhsBarcodeInstruction), LocatorUtils.property(thatLocator, "barcodeInstruction", rhsBarcodeInstruction), lhsBarcodeInstruction, rhsBarcodeInstruction, ((this.barcodeInstruction!= null)&&(!this.barcodeInstruction.isEmpty())), ((that.barcodeInstruction!= null)&&(!that.barcodeInstruction.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            LabelServiceContent lhsLabelServiceContent;
            lhsLabelServiceContent = this.getLabelServiceContent();
            LabelServiceContent rhsLabelServiceContent;
            rhsLabelServiceContent = that.getLabelServiceContent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "labelServiceContent", lhsLabelServiceContent), LocatorUtils.property(thatLocator, "labelServiceContent", rhsLabelServiceContent), lhsLabelServiceContent, rhsLabelServiceContent, (this.labelServiceContent!= null), (that.labelServiceContent!= null))) {
                return false;
            }
        }
        {
            List<LabelInstructionType> lhsRoutingInstruction;
            lhsRoutingInstruction = (((this.routingInstruction!= null)&&(!this.routingInstruction.isEmpty()))?this.getRoutingInstruction():null);
            List<LabelInstructionType> rhsRoutingInstruction;
            rhsRoutingInstruction = (((that.routingInstruction!= null)&&(!that.routingInstruction.isEmpty()))?that.getRoutingInstruction():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "routingInstruction", lhsRoutingInstruction), LocatorUtils.property(thatLocator, "routingInstruction", rhsRoutingInstruction), lhsRoutingInstruction, rhsRoutingInstruction, ((this.routingInstruction!= null)&&(!this.routingInstruction.isEmpty())), ((that.routingInstruction!= null)&&(!that.routingInstruction.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsServiceAccountNumber;
            lhsServiceAccountNumber = this.getServiceAccountNumber();
            String rhsServiceAccountNumber;
            rhsServiceAccountNumber = that.getServiceAccountNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceAccountNumber", lhsServiceAccountNumber), LocatorUtils.property(thatLocator, "serviceAccountNumber", rhsServiceAccountNumber), lhsServiceAccountNumber, rhsServiceAccountNumber, (this.serviceAccountNumber!= null), (that.serviceAccountNumber!= null))) {
                return false;
            }
        }
        {
            String lhsServiceText;
            lhsServiceText = this.getServiceText();
            String rhsServiceText;
            rhsServiceText = that.getServiceText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceText", lhsServiceText), LocatorUtils.property(thatLocator, "serviceText", rhsServiceText), lhsServiceText, rhsServiceText, (this.serviceText!= null), (that.serviceText!= null))) {
                return false;
            }
        }
        {
            String lhsValueAddedService;
            lhsValueAddedService = this.getValueAddedService();
            String rhsValueAddedService;
            rhsValueAddedService = that.getValueAddedService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueAddedService", lhsValueAddedService), LocatorUtils.property(thatLocator, "valueAddedService", rhsValueAddedService), lhsValueAddedService, rhsValueAddedService, (this.valueAddedService!= null), (that.valueAddedService!= null))) {
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
            List<LabelInstructionType> theBarcodeInstruction;
            theBarcodeInstruction = (((this.barcodeInstruction!= null)&&(!this.barcodeInstruction.isEmpty()))?this.getBarcodeInstruction():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "barcodeInstruction", theBarcodeInstruction), currentHashCode, theBarcodeInstruction, ((this.barcodeInstruction!= null)&&(!this.barcodeInstruction.isEmpty())));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            LabelServiceContent theLabelServiceContent;
            theLabelServiceContent = this.getLabelServiceContent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "labelServiceContent", theLabelServiceContent), currentHashCode, theLabelServiceContent, (this.labelServiceContent!= null));
        }
        {
            List<LabelInstructionType> theRoutingInstruction;
            theRoutingInstruction = (((this.routingInstruction!= null)&&(!this.routingInstruction.isEmpty()))?this.getRoutingInstruction():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "routingInstruction", theRoutingInstruction), currentHashCode, theRoutingInstruction, ((this.routingInstruction!= null)&&(!this.routingInstruction.isEmpty())));
        }
        {
            String theServiceAccountNumber;
            theServiceAccountNumber = this.getServiceAccountNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceAccountNumber", theServiceAccountNumber), currentHashCode, theServiceAccountNumber, (this.serviceAccountNumber!= null));
        }
        {
            String theServiceText;
            theServiceText = this.getServiceText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceText", theServiceText), currentHashCode, theServiceText, (this.serviceText!= null));
        }
        {
            String theValueAddedService;
            theValueAddedService = this.getValueAddedService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueAddedService", theValueAddedService), currentHashCode, theValueAddedService, (this.valueAddedService!= null));
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
            List<LabelInstructionType> theBarcodeInstruction;
            theBarcodeInstruction = (((this.barcodeInstruction!= null)&&(!this.barcodeInstruction.isEmpty()))?this.getBarcodeInstruction():null);
            strategy.appendField(locator, this, "barcodeInstruction", buffer, theBarcodeInstruction, ((this.barcodeInstruction!= null)&&(!this.barcodeInstruction.isEmpty())));
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            LabelServiceContent theLabelServiceContent;
            theLabelServiceContent = this.getLabelServiceContent();
            strategy.appendField(locator, this, "labelServiceContent", buffer, theLabelServiceContent, (this.labelServiceContent!= null));
        }
        {
            List<LabelInstructionType> theRoutingInstruction;
            theRoutingInstruction = (((this.routingInstruction!= null)&&(!this.routingInstruction.isEmpty()))?this.getRoutingInstruction():null);
            strategy.appendField(locator, this, "routingInstruction", buffer, theRoutingInstruction, ((this.routingInstruction!= null)&&(!this.routingInstruction.isEmpty())));
        }
        {
            String theServiceAccountNumber;
            theServiceAccountNumber = this.getServiceAccountNumber();
            strategy.appendField(locator, this, "serviceAccountNumber", buffer, theServiceAccountNumber, (this.serviceAccountNumber!= null));
        }
        {
            String theServiceText;
            theServiceText = this.getServiceText();
            strategy.appendField(locator, this, "serviceText", buffer, theServiceText, (this.serviceText!= null));
        }
        {
            String theValueAddedService;
            theValueAddedService = this.getValueAddedService();
            strategy.appendField(locator, this, "valueAddedService", buffer, theValueAddedService, (this.valueAddedService!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
