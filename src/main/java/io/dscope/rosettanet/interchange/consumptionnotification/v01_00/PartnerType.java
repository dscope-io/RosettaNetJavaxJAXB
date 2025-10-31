
package io.dscope.rosettanet.interchange.consumptionnotification.v01_00;

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
import io.dscope.rosettanet.universal.codelist.processroleidentifier.v01_08.ProcessRoleIdentifier;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_12.PartnerDescription;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
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
 * <p>Java class for PartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumptionLineItem" type="{urn:rosettanet:specification:interchange:ConsumptionNotification:xsd:schema:01.00}ConsumptionLineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LineItemReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}PartnerDescription"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:01.08}ProcessRoleIdentifier"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure" minOccurs="0"/&gt;
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
@XmlType(name = "PartnerType", propOrder = {
    "consumptionLineItem",
    "lineItemReference",
    "partnerDescription",
    "processRoleIdentifier",
    "productIdentification",
    "unitOfMeasure"
})
public class PartnerType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ConsumptionLineItem")
    protected List<ConsumptionLineItemType> consumptionLineItem;
    @XmlElement(name = "LineItemReference")
    protected List<BusinessDocumentReferenceType> lineItemReference;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", type = PartnerDescription.class)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "ProcessRoleIdentifier", namespace = "urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:01.08", type = ProcessRoleIdentifier.class)
    protected ProcessRoleIdentifier processRoleIdentifier;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class, required = false)
    protected List<ProductIdentification> productIdentification;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class, required = false)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the consumptionLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionLineItemType }
     * 
     * 
     */
    public List<ConsumptionLineItemType> getConsumptionLineItem() {
        if (consumptionLineItem == null) {
            consumptionLineItem = new ArrayList<ConsumptionLineItemType>();
        }
        return this.consumptionLineItem;
    }

    /**
     * Gets the value of the lineItemReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getLineItemReference() {
        if (lineItemReference == null) {
            lineItemReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.lineItemReference;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
    }

    /**
     * Gets the value of the processRoleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRoleIdentifier }
     *     
     */
    public ProcessRoleIdentifier getProcessRoleIdentifier() {
        return processRoleIdentifier;
    }

    /**
     * Sets the value of the processRoleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRoleIdentifier }
     *     
     */
    public void setProcessRoleIdentifier(ProcessRoleIdentifier value) {
        this.processRoleIdentifier = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentification }
     * 
     * 
     */
    public List<ProductIdentification> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<ProductIdentification>();
        }
        return this.productIdentification;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
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
        final PartnerType that = ((PartnerType) object);
        {
            List<ConsumptionLineItemType> lhsConsumptionLineItem;
            lhsConsumptionLineItem = (((this.consumptionLineItem!= null)&&(!this.consumptionLineItem.isEmpty()))?this.getConsumptionLineItem():null);
            List<ConsumptionLineItemType> rhsConsumptionLineItem;
            rhsConsumptionLineItem = (((that.consumptionLineItem!= null)&&(!that.consumptionLineItem.isEmpty()))?that.getConsumptionLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionLineItem", lhsConsumptionLineItem), LocatorUtils.property(thatLocator, "consumptionLineItem", rhsConsumptionLineItem), lhsConsumptionLineItem, rhsConsumptionLineItem, ((this.consumptionLineItem!= null)&&(!this.consumptionLineItem.isEmpty())), ((that.consumptionLineItem!= null)&&(!that.consumptionLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsLineItemReference;
            lhsLineItemReference = (((this.lineItemReference!= null)&&(!this.lineItemReference.isEmpty()))?this.getLineItemReference():null);
            List<BusinessDocumentReferenceType> rhsLineItemReference;
            rhsLineItemReference = (((that.lineItemReference!= null)&&(!that.lineItemReference.isEmpty()))?that.getLineItemReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineItemReference", lhsLineItemReference), LocatorUtils.property(thatLocator, "lineItemReference", rhsLineItemReference), lhsLineItemReference, rhsLineItemReference, ((this.lineItemReference!= null)&&(!this.lineItemReference.isEmpty())), ((that.lineItemReference!= null)&&(!that.lineItemReference.isEmpty())))) {
                return false;
            }
        }
        {
            PartnerDescription lhsPartnerDescription;
            lhsPartnerDescription = this.getPartnerDescription();
            PartnerDescription rhsPartnerDescription;
            rhsPartnerDescription = that.getPartnerDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partnerDescription", lhsPartnerDescription), LocatorUtils.property(thatLocator, "partnerDescription", rhsPartnerDescription), lhsPartnerDescription, rhsPartnerDescription, (this.partnerDescription!= null), (that.partnerDescription!= null))) {
                return false;
            }
        }
        {
            ProcessRoleIdentifier lhsProcessRoleIdentifier;
            lhsProcessRoleIdentifier = this.getProcessRoleIdentifier();
            ProcessRoleIdentifier rhsProcessRoleIdentifier;
            rhsProcessRoleIdentifier = that.getProcessRoleIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processRoleIdentifier", lhsProcessRoleIdentifier), LocatorUtils.property(thatLocator, "processRoleIdentifier", rhsProcessRoleIdentifier), lhsProcessRoleIdentifier, rhsProcessRoleIdentifier, (this.processRoleIdentifier!= null), (that.processRoleIdentifier!= null))) {
                return false;
            }
        }
        {
            List<ProductIdentification> lhsProductIdentification;
            lhsProductIdentification = (((this.productIdentification!= null)&&(!this.productIdentification.isEmpty()))?this.getProductIdentification():null);
            List<ProductIdentification> rhsProductIdentification;
            rhsProductIdentification = (((that.productIdentification!= null)&&(!that.productIdentification.isEmpty()))?that.getProductIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentification", lhsProductIdentification), LocatorUtils.property(thatLocator, "productIdentification", rhsProductIdentification), lhsProductIdentification, rhsProductIdentification, ((this.productIdentification!= null)&&(!this.productIdentification.isEmpty())), ((that.productIdentification!= null)&&(!that.productIdentification.isEmpty())))) {
                return false;
            }
        }
        {
            UnitOfMeasure lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            UnitOfMeasure rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, (this.unitOfMeasure!= null), (that.unitOfMeasure!= null))) {
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
            List<ConsumptionLineItemType> theConsumptionLineItem;
            theConsumptionLineItem = (((this.consumptionLineItem!= null)&&(!this.consumptionLineItem.isEmpty()))?this.getConsumptionLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionLineItem", theConsumptionLineItem), currentHashCode, theConsumptionLineItem, ((this.consumptionLineItem!= null)&&(!this.consumptionLineItem.isEmpty())));
        }
        {
            List<BusinessDocumentReferenceType> theLineItemReference;
            theLineItemReference = (((this.lineItemReference!= null)&&(!this.lineItemReference.isEmpty()))?this.getLineItemReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineItemReference", theLineItemReference), currentHashCode, theLineItemReference, ((this.lineItemReference!= null)&&(!this.lineItemReference.isEmpty())));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partnerDescription", thePartnerDescription), currentHashCode, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            ProcessRoleIdentifier theProcessRoleIdentifier;
            theProcessRoleIdentifier = this.getProcessRoleIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processRoleIdentifier", theProcessRoleIdentifier), currentHashCode, theProcessRoleIdentifier, (this.processRoleIdentifier!= null));
        }
        {
            List<ProductIdentification> theProductIdentification;
            theProductIdentification = (((this.productIdentification!= null)&&(!this.productIdentification.isEmpty()))?this.getProductIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, ((this.productIdentification!= null)&&(!this.productIdentification.isEmpty())));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
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
            List<ConsumptionLineItemType> theConsumptionLineItem;
            theConsumptionLineItem = (((this.consumptionLineItem!= null)&&(!this.consumptionLineItem.isEmpty()))?this.getConsumptionLineItem():null);
            strategy.appendField(locator, this, "consumptionLineItem", buffer, theConsumptionLineItem, ((this.consumptionLineItem!= null)&&(!this.consumptionLineItem.isEmpty())));
        }
        {
            List<BusinessDocumentReferenceType> theLineItemReference;
            theLineItemReference = (((this.lineItemReference!= null)&&(!this.lineItemReference.isEmpty()))?this.getLineItemReference():null);
            strategy.appendField(locator, this, "lineItemReference", buffer, theLineItemReference, ((this.lineItemReference!= null)&&(!this.lineItemReference.isEmpty())));
        }
        {
            PartnerDescription thePartnerDescription;
            thePartnerDescription = this.getPartnerDescription();
            strategy.appendField(locator, this, "partnerDescription", buffer, thePartnerDescription, (this.partnerDescription!= null));
        }
        {
            ProcessRoleIdentifier theProcessRoleIdentifier;
            theProcessRoleIdentifier = this.getProcessRoleIdentifier();
            strategy.appendField(locator, this, "processRoleIdentifier", buffer, theProcessRoleIdentifier, (this.processRoleIdentifier!= null));
        }
        {
            List<ProductIdentification> theProductIdentification;
            theProductIdentification = (((this.productIdentification!= null)&&(!this.productIdentification.isEmpty()))?this.getProductIdentification():null);
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, ((this.productIdentification!= null)&&(!this.productIdentification.isEmpty())));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
