
package io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_01;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_06.LotQuantity;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.LotIdentification;
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
 * <p>Java class for LotShipReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotShipReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}LotIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.06}LotQuantity" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ManufacturingDateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LotShipReferenceType", propOrder = {
    "expiryDate",
    "lotIdentification",
    "lotQuantity",
    "manufacturingDateCode"
})
public class LotShipReferenceType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElementRef(name = "LotIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = LotIdentification.class)
    protected LotIdentification lotIdentification;
    @XmlElementRef(name = "LotQuantity", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.06", type = LotQuantity.class)
    protected List<LotQuantity> lotQuantity;
    @XmlElement(name = "ManufacturingDateCode")
    protected String manufacturingDateCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the lotIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentification }
     *     
     */
    public LotIdentification getLotIdentification() {
        return lotIdentification;
    }

    /**
     * Sets the value of the lotIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentification }
     *     
     */
    public void setLotIdentification(LotIdentification value) {
        this.lotIdentification = value;
    }

    /**
     * Gets the value of the lotQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotQuantity }
     * 
     * 
     */
    public List<LotQuantity> getLotQuantity() {
        if (lotQuantity == null) {
            lotQuantity = new ArrayList<LotQuantity>();
        }
        return this.lotQuantity;
    }

    /**
     * Gets the value of the manufacturingDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingDateCode() {
        return manufacturingDateCode;
    }

    /**
     * Sets the value of the manufacturingDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingDateCode(String value) {
        this.manufacturingDateCode = value;
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
        final LotShipReferenceType that = ((LotShipReferenceType) object);
        {
            XMLGregorianCalendar lhsExpiryDate;
            lhsExpiryDate = this.getExpiryDate();
            XMLGregorianCalendar rhsExpiryDate;
            rhsExpiryDate = that.getExpiryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expiryDate", lhsExpiryDate), LocatorUtils.property(thatLocator, "expiryDate", rhsExpiryDate), lhsExpiryDate, rhsExpiryDate, (this.expiryDate!= null), (that.expiryDate!= null))) {
                return false;
            }
        }
        {
            LotIdentification lhsLotIdentification;
            lhsLotIdentification = this.getLotIdentification();
            LotIdentification rhsLotIdentification;
            rhsLotIdentification = that.getLotIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotIdentification", lhsLotIdentification), LocatorUtils.property(thatLocator, "lotIdentification", rhsLotIdentification), lhsLotIdentification, rhsLotIdentification, (this.lotIdentification!= null), (that.lotIdentification!= null))) {
                return false;
            }
        }
        {
            List<LotQuantity> lhsLotQuantity;
            lhsLotQuantity = (((this.lotQuantity!= null)&&(!this.lotQuantity.isEmpty()))?this.getLotQuantity():null);
            List<LotQuantity> rhsLotQuantity;
            rhsLotQuantity = (((that.lotQuantity!= null)&&(!that.lotQuantity.isEmpty()))?that.getLotQuantity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotQuantity", lhsLotQuantity), LocatorUtils.property(thatLocator, "lotQuantity", rhsLotQuantity), lhsLotQuantity, rhsLotQuantity, ((this.lotQuantity!= null)&&(!this.lotQuantity.isEmpty())), ((that.lotQuantity!= null)&&(!that.lotQuantity.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsManufacturingDateCode;
            lhsManufacturingDateCode = this.getManufacturingDateCode();
            String rhsManufacturingDateCode;
            rhsManufacturingDateCode = that.getManufacturingDateCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturingDateCode", lhsManufacturingDateCode), LocatorUtils.property(thatLocator, "manufacturingDateCode", rhsManufacturingDateCode), lhsManufacturingDateCode, rhsManufacturingDateCode, (this.manufacturingDateCode!= null), (that.manufacturingDateCode!= null))) {
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
            XMLGregorianCalendar theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expiryDate", theExpiryDate), currentHashCode, theExpiryDate, (this.expiryDate!= null));
        }
        {
            LotIdentification theLotIdentification;
            theLotIdentification = this.getLotIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotIdentification", theLotIdentification), currentHashCode, theLotIdentification, (this.lotIdentification!= null));
        }
        {
            List<LotQuantity> theLotQuantity;
            theLotQuantity = (((this.lotQuantity!= null)&&(!this.lotQuantity.isEmpty()))?this.getLotQuantity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotQuantity", theLotQuantity), currentHashCode, theLotQuantity, ((this.lotQuantity!= null)&&(!this.lotQuantity.isEmpty())));
        }
        {
            String theManufacturingDateCode;
            theManufacturingDateCode = this.getManufacturingDateCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturingDateCode", theManufacturingDateCode), currentHashCode, theManufacturingDateCode, (this.manufacturingDateCode!= null));
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
            XMLGregorianCalendar theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            strategy.appendField(locator, this, "expiryDate", buffer, theExpiryDate, (this.expiryDate!= null));
        }
        {
            LotIdentification theLotIdentification;
            theLotIdentification = this.getLotIdentification();
            strategy.appendField(locator, this, "lotIdentification", buffer, theLotIdentification, (this.lotIdentification!= null));
        }
        {
            List<LotQuantity> theLotQuantity;
            theLotQuantity = (((this.lotQuantity!= null)&&(!this.lotQuantity.isEmpty()))?this.getLotQuantity():null);
            strategy.appendField(locator, this, "lotQuantity", buffer, theLotQuantity, ((this.lotQuantity!= null)&&(!this.lotQuantity.isEmpty())));
        }
        {
            String theManufacturingDateCode;
            theManufacturingDateCode = this.getManufacturingDateCode();
            strategy.appendField(locator, this, "manufacturingDateCode", buffer, theManufacturingDateCode, (this.manufacturingDateCode!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
