
package io.dscope.rosettanet.domain.logistics.logistics.v01_05;

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
import io.dscope.rosettanet.domain.logistics.codelist.freightpaymentterms.v01_02.FreightPaymentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v01_06.SpecialHandlingInstruction;
import io.dscope.rosettanet.universal.monetaryexpression.v01_01.FinancialAmountType;
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
 * <p>Java class for FreightPaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightPaymentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreightCharges" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.01}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.02}FreightPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.06}SpecialHandlingInstruction" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FreightPaymentInformationType", propOrder = {
    "freightCharges",
    "freightPaymentTerms",
    "specialHandlingInstruction"
})
public class FreightPaymentInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "FreightCharges")
    protected FinancialAmountType freightCharges;
    @XmlElementRef(name = "FreightPaymentTerms", namespace = "urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.02", type = FreightPaymentTerms.class, required = false)
    protected FreightPaymentTerms freightPaymentTerms;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.06", type = SpecialHandlingInstruction.class, required = false)
    protected List<SpecialHandlingInstruction> specialHandlingInstruction;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the freightCharges property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getFreightCharges() {
        return freightCharges;
    }

    /**
     * Sets the value of the freightCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setFreightCharges(FinancialAmountType value) {
        this.freightCharges = value;
    }

    /**
     * Gets the value of the freightPaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link FreightPaymentTerms }
     *     
     */
    public FreightPaymentTerms getFreightPaymentTerms() {
        return freightPaymentTerms;
    }

    /**
     * Sets the value of the freightPaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightPaymentTerms }
     *     
     */
    public void setFreightPaymentTerms(FreightPaymentTerms value) {
        this.freightPaymentTerms = value;
    }

    /**
     * Gets the value of the specialHandlingInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandlingInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandlingInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialHandlingInstruction }
     * 
     * 
     */
    public List<SpecialHandlingInstruction> getSpecialHandlingInstruction() {
        if (specialHandlingInstruction == null) {
            specialHandlingInstruction = new ArrayList<SpecialHandlingInstruction>();
        }
        return this.specialHandlingInstruction;
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
        final FreightPaymentInformationType that = ((FreightPaymentInformationType) object);
        {
            FinancialAmountType lhsFreightCharges;
            lhsFreightCharges = this.getFreightCharges();
            FinancialAmountType rhsFreightCharges;
            rhsFreightCharges = that.getFreightCharges();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightCharges", lhsFreightCharges), LocatorUtils.property(thatLocator, "freightCharges", rhsFreightCharges), lhsFreightCharges, rhsFreightCharges, (this.freightCharges!= null), (that.freightCharges!= null))) {
                return false;
            }
        }
        {
            FreightPaymentTerms lhsFreightPaymentTerms;
            lhsFreightPaymentTerms = this.getFreightPaymentTerms();
            FreightPaymentTerms rhsFreightPaymentTerms;
            rhsFreightPaymentTerms = that.getFreightPaymentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightPaymentTerms", lhsFreightPaymentTerms), LocatorUtils.property(thatLocator, "freightPaymentTerms", rhsFreightPaymentTerms), lhsFreightPaymentTerms, rhsFreightPaymentTerms, (this.freightPaymentTerms!= null), (that.freightPaymentTerms!= null))) {
                return false;
            }
        }
        {
            List<SpecialHandlingInstruction> lhsSpecialHandlingInstruction;
            lhsSpecialHandlingInstruction = (((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty()))?this.getSpecialHandlingInstruction():null);
            List<SpecialHandlingInstruction> rhsSpecialHandlingInstruction;
            rhsSpecialHandlingInstruction = (((that.specialHandlingInstruction!= null)&&(!that.specialHandlingInstruction.isEmpty()))?that.getSpecialHandlingInstruction():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialHandlingInstruction", lhsSpecialHandlingInstruction), LocatorUtils.property(thatLocator, "specialHandlingInstruction", rhsSpecialHandlingInstruction), lhsSpecialHandlingInstruction, rhsSpecialHandlingInstruction, ((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty())), ((that.specialHandlingInstruction!= null)&&(!that.specialHandlingInstruction.isEmpty())))) {
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
            FinancialAmountType theFreightCharges;
            theFreightCharges = this.getFreightCharges();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightCharges", theFreightCharges), currentHashCode, theFreightCharges, (this.freightCharges!= null));
        }
        {
            FreightPaymentTerms theFreightPaymentTerms;
            theFreightPaymentTerms = this.getFreightPaymentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightPaymentTerms", theFreightPaymentTerms), currentHashCode, theFreightPaymentTerms, (this.freightPaymentTerms!= null));
        }
        {
            List<SpecialHandlingInstruction> theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = (((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty()))?this.getSpecialHandlingInstruction():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialHandlingInstruction", theSpecialHandlingInstruction), currentHashCode, theSpecialHandlingInstruction, ((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty())));
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
            FinancialAmountType theFreightCharges;
            theFreightCharges = this.getFreightCharges();
            strategy.appendField(locator, this, "freightCharges", buffer, theFreightCharges, (this.freightCharges!= null));
        }
        {
            FreightPaymentTerms theFreightPaymentTerms;
            theFreightPaymentTerms = this.getFreightPaymentTerms();
            strategy.appendField(locator, this, "freightPaymentTerms", buffer, theFreightPaymentTerms, (this.freightPaymentTerms!= null));
        }
        {
            List<SpecialHandlingInstruction> theSpecialHandlingInstruction;
            theSpecialHandlingInstruction = (((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty()))?this.getSpecialHandlingInstruction():null);
            strategy.appendField(locator, this, "specialHandlingInstruction", buffer, theSpecialHandlingInstruction, ((this.specialHandlingInstruction!= null)&&(!this.specialHandlingInstruction.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
