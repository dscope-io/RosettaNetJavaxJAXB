
package io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
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
 * <p>Java class for DocumentSubLineLotShipReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSubLineLotShipReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LotShipReference" type="{urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.05}LotShipReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ShippedLotQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentSubLineLotShipReferenceType", propOrder = {
    "lotShipReference",
    "requestedQuantity",
    "shippedLotQuantity"
})
public class DocumentSubLineLotShipReferenceType
    extends BusinessDocumentReferenceType
    implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "LotShipReference")
    protected List<LotShipReferenceType> lotShipReference;
    @XmlElement(name = "RequestedQuantity")
    protected Float requestedQuantity;
    @XmlElement(name = "ShippedLotQuantity")
    protected float shippedLotQuantity;

    /**
     * Gets the value of the lotShipReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotShipReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotShipReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotShipReferenceType }
     * 
     * 
     */
    public List<LotShipReferenceType> getLotShipReference() {
        if (lotShipReference == null) {
            lotShipReference = new ArrayList<LotShipReferenceType>();
        }
        return this.lotShipReference;
    }

    /**
     * Gets the value of the requestedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Sets the value of the requestedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRequestedQuantity(Float value) {
        this.requestedQuantity = value;
    }

    /**
     * Gets the value of the shippedLotQuantity property.
     * 
     */
    public float getShippedLotQuantity() {
        return shippedLotQuantity;
    }

    /**
     * Sets the value of the shippedLotQuantity property.
     * 
     */
    public void setShippedLotQuantity(float value) {
        this.shippedLotQuantity = value;
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
        final DocumentSubLineLotShipReferenceType that = ((DocumentSubLineLotShipReferenceType) object);
        {
            List<LotShipReferenceType> lhsLotShipReference;
            lhsLotShipReference = (((this.lotShipReference!= null)&&(!this.lotShipReference.isEmpty()))?this.getLotShipReference():null);
            List<LotShipReferenceType> rhsLotShipReference;
            rhsLotShipReference = (((that.lotShipReference!= null)&&(!that.lotShipReference.isEmpty()))?that.getLotShipReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotShipReference", lhsLotShipReference), LocatorUtils.property(thatLocator, "lotShipReference", rhsLotShipReference), lhsLotShipReference, rhsLotShipReference, ((this.lotShipReference!= null)&&(!this.lotShipReference.isEmpty())), ((that.lotShipReference!= null)&&(!that.lotShipReference.isEmpty())))) {
                return false;
            }
        }
        {
            Float lhsRequestedQuantity;
            lhsRequestedQuantity = this.getRequestedQuantity();
            Float rhsRequestedQuantity;
            rhsRequestedQuantity = that.getRequestedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedQuantity", lhsRequestedQuantity), LocatorUtils.property(thatLocator, "requestedQuantity", rhsRequestedQuantity), lhsRequestedQuantity, rhsRequestedQuantity, (this.requestedQuantity!= null), (that.requestedQuantity!= null))) {
                return false;
            }
        }
        {
            float lhsShippedLotQuantity;
            lhsShippedLotQuantity = this.getShippedLotQuantity();
            float rhsShippedLotQuantity;
            rhsShippedLotQuantity = that.getShippedLotQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippedLotQuantity", lhsShippedLotQuantity), LocatorUtils.property(thatLocator, "shippedLotQuantity", rhsShippedLotQuantity), lhsShippedLotQuantity, rhsShippedLotQuantity, true, true)) {
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
            List<LotShipReferenceType> theLotShipReference;
            theLotShipReference = (((this.lotShipReference!= null)&&(!this.lotShipReference.isEmpty()))?this.getLotShipReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotShipReference", theLotShipReference), currentHashCode, theLotShipReference, ((this.lotShipReference!= null)&&(!this.lotShipReference.isEmpty())));
        }
        {
            Float theRequestedQuantity;
            theRequestedQuantity = this.getRequestedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedQuantity", theRequestedQuantity), currentHashCode, theRequestedQuantity, (this.requestedQuantity!= null));
        }
        {
            float theShippedLotQuantity;
            theShippedLotQuantity = this.getShippedLotQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippedLotQuantity", theShippedLotQuantity), currentHashCode, theShippedLotQuantity, true);
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
            List<LotShipReferenceType> theLotShipReference;
            theLotShipReference = (((this.lotShipReference!= null)&&(!this.lotShipReference.isEmpty()))?this.getLotShipReference():null);
            strategy.appendField(locator, this, "lotShipReference", buffer, theLotShipReference, ((this.lotShipReference!= null)&&(!this.lotShipReference.isEmpty())));
        }
        {
            Float theRequestedQuantity;
            theRequestedQuantity = this.getRequestedQuantity();
            strategy.appendField(locator, this, "requestedQuantity", buffer, theRequestedQuantity, (this.requestedQuantity!= null));
        }
        {
            float theShippedLotQuantity;
            theShippedLotQuantity = this.getShippedLotQuantity();
            strategy.appendField(locator, this, "shippedLotQuantity", buffer, theShippedLotQuantity, true);
        }
        return buffer;
    }

}
