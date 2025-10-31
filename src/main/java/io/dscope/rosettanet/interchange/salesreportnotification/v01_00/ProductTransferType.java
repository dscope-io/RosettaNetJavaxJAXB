
package io.dscope.rosettanet.interchange.salesreportnotification.v01_00;

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
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.ParticipatingPartner;
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
 * <p>Java class for ProductTransferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTransferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}ParticipatingPartner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesReportLineItem" type="{urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:1.0}SalesReportLineItemType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" fixed="1.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTransferType", propOrder = {
    "participatingPartner",
    "salesReportLineItem"
})
public class ProductTransferType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "ParticipatingPartner", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = ParticipatingPartner.class, required = false)
    protected List<ParticipatingPartner> participatingPartner;
    @XmlElement(name = "SalesReportLineItem", required = true)
    protected List<SalesReportLineItemType> salesReportLineItem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the participatingPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participatingPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipatingPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipatingPartner }
     * 
     * 
     */
    public List<ParticipatingPartner> getParticipatingPartner() {
        if (participatingPartner == null) {
            participatingPartner = new ArrayList<ParticipatingPartner>();
        }
        return this.participatingPartner;
    }

    /**
     * Gets the value of the salesReportLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesReportLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesReportLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesReportLineItemType }
     * 
     * 
     */
    public List<SalesReportLineItemType> getSalesReportLineItem() {
        if (salesReportLineItem == null) {
            salesReportLineItem = new ArrayList<SalesReportLineItemType>();
        }
        return this.salesReportLineItem;
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
        if (schemaVersion == null) {
            return "1.0";
        } else {
            return schemaVersion;
        }
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
        final ProductTransferType that = ((ProductTransferType) object);
        {
            List<ParticipatingPartner> lhsParticipatingPartner;
            lhsParticipatingPartner = (((this.participatingPartner!= null)&&(!this.participatingPartner.isEmpty()))?this.getParticipatingPartner():null);
            List<ParticipatingPartner> rhsParticipatingPartner;
            rhsParticipatingPartner = (((that.participatingPartner!= null)&&(!that.participatingPartner.isEmpty()))?that.getParticipatingPartner():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "participatingPartner", lhsParticipatingPartner), LocatorUtils.property(thatLocator, "participatingPartner", rhsParticipatingPartner), lhsParticipatingPartner, rhsParticipatingPartner, ((this.participatingPartner!= null)&&(!this.participatingPartner.isEmpty())), ((that.participatingPartner!= null)&&(!that.participatingPartner.isEmpty())))) {
                return false;
            }
        }
        {
            List<SalesReportLineItemType> lhsSalesReportLineItem;
            lhsSalesReportLineItem = (((this.salesReportLineItem!= null)&&(!this.salesReportLineItem.isEmpty()))?this.getSalesReportLineItem():null);
            List<SalesReportLineItemType> rhsSalesReportLineItem;
            rhsSalesReportLineItem = (((that.salesReportLineItem!= null)&&(!that.salesReportLineItem.isEmpty()))?that.getSalesReportLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesReportLineItem", lhsSalesReportLineItem), LocatorUtils.property(thatLocator, "salesReportLineItem", rhsSalesReportLineItem), lhsSalesReportLineItem, rhsSalesReportLineItem, ((this.salesReportLineItem!= null)&&(!this.salesReportLineItem.isEmpty())), ((that.salesReportLineItem!= null)&&(!that.salesReportLineItem.isEmpty())))) {
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
            List<ParticipatingPartner> theParticipatingPartner;
            theParticipatingPartner = (((this.participatingPartner!= null)&&(!this.participatingPartner.isEmpty()))?this.getParticipatingPartner():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "participatingPartner", theParticipatingPartner), currentHashCode, theParticipatingPartner, ((this.participatingPartner!= null)&&(!this.participatingPartner.isEmpty())));
        }
        {
            List<SalesReportLineItemType> theSalesReportLineItem;
            theSalesReportLineItem = (((this.salesReportLineItem!= null)&&(!this.salesReportLineItem.isEmpty()))?this.getSalesReportLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesReportLineItem", theSalesReportLineItem), currentHashCode, theSalesReportLineItem, ((this.salesReportLineItem!= null)&&(!this.salesReportLineItem.isEmpty())));
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
            List<ParticipatingPartner> theParticipatingPartner;
            theParticipatingPartner = (((this.participatingPartner!= null)&&(!this.participatingPartner.isEmpty()))?this.getParticipatingPartner():null);
            strategy.appendField(locator, this, "participatingPartner", buffer, theParticipatingPartner, ((this.participatingPartner!= null)&&(!this.participatingPartner.isEmpty())));
        }
        {
            List<SalesReportLineItemType> theSalesReportLineItem;
            theSalesReportLineItem = (((this.salesReportLineItem!= null)&&(!this.salesReportLineItem.isEmpty()))?this.getSalesReportLineItem():null);
            strategy.appendField(locator, this, "salesReportLineItem", buffer, theSalesReportLineItem, ((this.salesReportLineItem!= null)&&(!this.salesReportLineItem.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
