
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v02_01;

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
import io.dscope.rosettanet.universal.partneridentification.v01_14.FullPartner;
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
 * <p>Java class for ProductInformationHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}FullPartner" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RequesterNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SupplierNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "fullPartner",
    "requesterNote",
    "responseByDate",
    "supplierNote"
})
public class ProductInformationHeaderType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "FullPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = FullPartner.class)
    protected List<FullPartner> fullPartner;
    @XmlElement(name = "RequesterNote")
    protected String requesterNote;
    @XmlElement(name = "ResponseByDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseByDate;
    @XmlElement(name = "SupplierNote")
    protected String supplierNote;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the fullPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullPartner }
     * 
     * 
     */
    public List<FullPartner> getFullPartner() {
        if (fullPartner == null) {
            fullPartner = new ArrayList<FullPartner>();
        }
        return this.fullPartner;
    }

    /**
     * Gets the value of the requesterNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterNote() {
        return requesterNote;
    }

    /**
     * Sets the value of the requesterNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterNote(String value) {
        this.requesterNote = value;
    }

    /**
     * Gets the value of the responseByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseByDate() {
        return responseByDate;
    }

    /**
     * Sets the value of the responseByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseByDate(XMLGregorianCalendar value) {
        this.responseByDate = value;
    }

    /**
     * Gets the value of the supplierNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierNote() {
        return supplierNote;
    }

    /**
     * Sets the value of the supplierNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierNote(String value) {
        this.supplierNote = value;
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
            List<FullPartner> lhsFullPartner;
            lhsFullPartner = (((this.fullPartner!= null)&&(!this.fullPartner.isEmpty()))?this.getFullPartner():null);
            List<FullPartner> rhsFullPartner;
            rhsFullPartner = (((that.fullPartner!= null)&&(!that.fullPartner.isEmpty()))?that.getFullPartner():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fullPartner", lhsFullPartner), LocatorUtils.property(thatLocator, "fullPartner", rhsFullPartner), lhsFullPartner, rhsFullPartner, ((this.fullPartner!= null)&&(!this.fullPartner.isEmpty())), ((that.fullPartner!= null)&&(!that.fullPartner.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsRequesterNote;
            lhsRequesterNote = this.getRequesterNote();
            String rhsRequesterNote;
            rhsRequesterNote = that.getRequesterNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requesterNote", lhsRequesterNote), LocatorUtils.property(thatLocator, "requesterNote", rhsRequesterNote), lhsRequesterNote, rhsRequesterNote, (this.requesterNote!= null), (that.requesterNote!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsResponseByDate;
            lhsResponseByDate = this.getResponseByDate();
            XMLGregorianCalendar rhsResponseByDate;
            rhsResponseByDate = that.getResponseByDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseByDate", lhsResponseByDate), LocatorUtils.property(thatLocator, "responseByDate", rhsResponseByDate), lhsResponseByDate, rhsResponseByDate, (this.responseByDate!= null), (that.responseByDate!= null))) {
                return false;
            }
        }
        {
            String lhsSupplierNote;
            lhsSupplierNote = this.getSupplierNote();
            String rhsSupplierNote;
            rhsSupplierNote = that.getSupplierNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplierNote", lhsSupplierNote), LocatorUtils.property(thatLocator, "supplierNote", rhsSupplierNote), lhsSupplierNote, rhsSupplierNote, (this.supplierNote!= null), (that.supplierNote!= null))) {
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
            List<FullPartner> theFullPartner;
            theFullPartner = (((this.fullPartner!= null)&&(!this.fullPartner.isEmpty()))?this.getFullPartner():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fullPartner", theFullPartner), currentHashCode, theFullPartner, ((this.fullPartner!= null)&&(!this.fullPartner.isEmpty())));
        }
        {
            String theRequesterNote;
            theRequesterNote = this.getRequesterNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requesterNote", theRequesterNote), currentHashCode, theRequesterNote, (this.requesterNote!= null));
        }
        {
            XMLGregorianCalendar theResponseByDate;
            theResponseByDate = this.getResponseByDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseByDate", theResponseByDate), currentHashCode, theResponseByDate, (this.responseByDate!= null));
        }
        {
            String theSupplierNote;
            theSupplierNote = this.getSupplierNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplierNote", theSupplierNote), currentHashCode, theSupplierNote, (this.supplierNote!= null));
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
            List<FullPartner> theFullPartner;
            theFullPartner = (((this.fullPartner!= null)&&(!this.fullPartner.isEmpty()))?this.getFullPartner():null);
            strategy.appendField(locator, this, "fullPartner", buffer, theFullPartner, ((this.fullPartner!= null)&&(!this.fullPartner.isEmpty())));
        }
        {
            String theRequesterNote;
            theRequesterNote = this.getRequesterNote();
            strategy.appendField(locator, this, "requesterNote", buffer, theRequesterNote, (this.requesterNote!= null));
        }
        {
            XMLGregorianCalendar theResponseByDate;
            theResponseByDate = this.getResponseByDate();
            strategy.appendField(locator, this, "responseByDate", buffer, theResponseByDate, (this.responseByDate!= null));
        }
        {
            String theSupplierNote;
            theSupplierNote = this.getSupplierNote();
            strategy.appendField(locator, this, "supplierNote", buffer, theSupplierNote, (this.supplierNote!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
