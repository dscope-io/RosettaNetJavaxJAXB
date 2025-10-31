
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for RequirementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequirementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuyerProjectedExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MaterialSpecification" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.06}MaterialSpecificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaterialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverallShelfLife" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemainingShelfLife" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SellerProjectedExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
@XmlType(name = "RequirementType", propOrder = {
    "buyerProjectedExpiryDate",
    "materialSpecification",
    "materialType",
    "overallShelfLife",
    "partNumber",
    "remainingShelfLife",
    "revisionNumber",
    "sellerProjectedExpiryDate"
})
public class RequirementType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BuyerProjectedExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar buyerProjectedExpiryDate;
    @XmlElement(name = "MaterialSpecification")
    protected List<MaterialSpecificationType> materialSpecification;
    @XmlElement(name = "MaterialType")
    protected String materialType;
    @XmlElement(name = "OverallShelfLife")
    protected Duration overallShelfLife;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "RemainingShelfLife")
    protected Duration remainingShelfLife;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
    @XmlElement(name = "SellerProjectedExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sellerProjectedExpiryDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the buyerProjectedExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuyerProjectedExpiryDate() {
        return buyerProjectedExpiryDate;
    }

    /**
     * Sets the value of the buyerProjectedExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuyerProjectedExpiryDate(XMLGregorianCalendar value) {
        this.buyerProjectedExpiryDate = value;
    }

    /**
     * Gets the value of the materialSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialSpecificationType }
     * 
     * 
     */
    public List<MaterialSpecificationType> getMaterialSpecification() {
        if (materialSpecification == null) {
            materialSpecification = new ArrayList<MaterialSpecificationType>();
        }
        return this.materialSpecification;
    }

    /**
     * Gets the value of the materialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * Sets the value of the materialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialType(String value) {
        this.materialType = value;
    }

    /**
     * Gets the value of the overallShelfLife property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOverallShelfLife() {
        return overallShelfLife;
    }

    /**
     * Sets the value of the overallShelfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOverallShelfLife(Duration value) {
        this.overallShelfLife = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the remainingShelfLife property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRemainingShelfLife() {
        return remainingShelfLife;
    }

    /**
     * Sets the value of the remainingShelfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRemainingShelfLife(Duration value) {
        this.remainingShelfLife = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
    }

    /**
     * Gets the value of the sellerProjectedExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSellerProjectedExpiryDate() {
        return sellerProjectedExpiryDate;
    }

    /**
     * Sets the value of the sellerProjectedExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSellerProjectedExpiryDate(XMLGregorianCalendar value) {
        this.sellerProjectedExpiryDate = value;
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
        final RequirementType that = ((RequirementType) object);
        {
            XMLGregorianCalendar lhsBuyerProjectedExpiryDate;
            lhsBuyerProjectedExpiryDate = this.getBuyerProjectedExpiryDate();
            XMLGregorianCalendar rhsBuyerProjectedExpiryDate;
            rhsBuyerProjectedExpiryDate = that.getBuyerProjectedExpiryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buyerProjectedExpiryDate", lhsBuyerProjectedExpiryDate), LocatorUtils.property(thatLocator, "buyerProjectedExpiryDate", rhsBuyerProjectedExpiryDate), lhsBuyerProjectedExpiryDate, rhsBuyerProjectedExpiryDate, (this.buyerProjectedExpiryDate!= null), (that.buyerProjectedExpiryDate!= null))) {
                return false;
            }
        }
        {
            List<MaterialSpecificationType> lhsMaterialSpecification;
            lhsMaterialSpecification = (((this.materialSpecification!= null)&&(!this.materialSpecification.isEmpty()))?this.getMaterialSpecification():null);
            List<MaterialSpecificationType> rhsMaterialSpecification;
            rhsMaterialSpecification = (((that.materialSpecification!= null)&&(!that.materialSpecification.isEmpty()))?that.getMaterialSpecification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "materialSpecification", lhsMaterialSpecification), LocatorUtils.property(thatLocator, "materialSpecification", rhsMaterialSpecification), lhsMaterialSpecification, rhsMaterialSpecification, ((this.materialSpecification!= null)&&(!this.materialSpecification.isEmpty())), ((that.materialSpecification!= null)&&(!that.materialSpecification.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsMaterialType;
            lhsMaterialType = this.getMaterialType();
            String rhsMaterialType;
            rhsMaterialType = that.getMaterialType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "materialType", lhsMaterialType), LocatorUtils.property(thatLocator, "materialType", rhsMaterialType), lhsMaterialType, rhsMaterialType, (this.materialType!= null), (that.materialType!= null))) {
                return false;
            }
        }
        {
            Duration lhsOverallShelfLife;
            lhsOverallShelfLife = this.getOverallShelfLife();
            Duration rhsOverallShelfLife;
            rhsOverallShelfLife = that.getOverallShelfLife();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "overallShelfLife", lhsOverallShelfLife), LocatorUtils.property(thatLocator, "overallShelfLife", rhsOverallShelfLife), lhsOverallShelfLife, rhsOverallShelfLife, (this.overallShelfLife!= null), (that.overallShelfLife!= null))) {
                return false;
            }
        }
        {
            String lhsPartNumber;
            lhsPartNumber = this.getPartNumber();
            String rhsPartNumber;
            rhsPartNumber = that.getPartNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partNumber", lhsPartNumber), LocatorUtils.property(thatLocator, "partNumber", rhsPartNumber), lhsPartNumber, rhsPartNumber, (this.partNumber!= null), (that.partNumber!= null))) {
                return false;
            }
        }
        {
            Duration lhsRemainingShelfLife;
            lhsRemainingShelfLife = this.getRemainingShelfLife();
            Duration rhsRemainingShelfLife;
            rhsRemainingShelfLife = that.getRemainingShelfLife();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remainingShelfLife", lhsRemainingShelfLife), LocatorUtils.property(thatLocator, "remainingShelfLife", rhsRemainingShelfLife), lhsRemainingShelfLife, rhsRemainingShelfLife, (this.remainingShelfLife!= null), (that.remainingShelfLife!= null))) {
                return false;
            }
        }
        {
            String lhsRevisionNumber;
            lhsRevisionNumber = this.getRevisionNumber();
            String rhsRevisionNumber;
            rhsRevisionNumber = that.getRevisionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revisionNumber", lhsRevisionNumber), LocatorUtils.property(thatLocator, "revisionNumber", rhsRevisionNumber), lhsRevisionNumber, rhsRevisionNumber, (this.revisionNumber!= null), (that.revisionNumber!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsSellerProjectedExpiryDate;
            lhsSellerProjectedExpiryDate = this.getSellerProjectedExpiryDate();
            XMLGregorianCalendar rhsSellerProjectedExpiryDate;
            rhsSellerProjectedExpiryDate = that.getSellerProjectedExpiryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sellerProjectedExpiryDate", lhsSellerProjectedExpiryDate), LocatorUtils.property(thatLocator, "sellerProjectedExpiryDate", rhsSellerProjectedExpiryDate), lhsSellerProjectedExpiryDate, rhsSellerProjectedExpiryDate, (this.sellerProjectedExpiryDate!= null), (that.sellerProjectedExpiryDate!= null))) {
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
            XMLGregorianCalendar theBuyerProjectedExpiryDate;
            theBuyerProjectedExpiryDate = this.getBuyerProjectedExpiryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buyerProjectedExpiryDate", theBuyerProjectedExpiryDate), currentHashCode, theBuyerProjectedExpiryDate, (this.buyerProjectedExpiryDate!= null));
        }
        {
            List<MaterialSpecificationType> theMaterialSpecification;
            theMaterialSpecification = (((this.materialSpecification!= null)&&(!this.materialSpecification.isEmpty()))?this.getMaterialSpecification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "materialSpecification", theMaterialSpecification), currentHashCode, theMaterialSpecification, ((this.materialSpecification!= null)&&(!this.materialSpecification.isEmpty())));
        }
        {
            String theMaterialType;
            theMaterialType = this.getMaterialType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "materialType", theMaterialType), currentHashCode, theMaterialType, (this.materialType!= null));
        }
        {
            Duration theOverallShelfLife;
            theOverallShelfLife = this.getOverallShelfLife();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "overallShelfLife", theOverallShelfLife), currentHashCode, theOverallShelfLife, (this.overallShelfLife!= null));
        }
        {
            String thePartNumber;
            thePartNumber = this.getPartNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partNumber", thePartNumber), currentHashCode, thePartNumber, (this.partNumber!= null));
        }
        {
            Duration theRemainingShelfLife;
            theRemainingShelfLife = this.getRemainingShelfLife();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remainingShelfLife", theRemainingShelfLife), currentHashCode, theRemainingShelfLife, (this.remainingShelfLife!= null));
        }
        {
            String theRevisionNumber;
            theRevisionNumber = this.getRevisionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revisionNumber", theRevisionNumber), currentHashCode, theRevisionNumber, (this.revisionNumber!= null));
        }
        {
            XMLGregorianCalendar theSellerProjectedExpiryDate;
            theSellerProjectedExpiryDate = this.getSellerProjectedExpiryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sellerProjectedExpiryDate", theSellerProjectedExpiryDate), currentHashCode, theSellerProjectedExpiryDate, (this.sellerProjectedExpiryDate!= null));
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
            XMLGregorianCalendar theBuyerProjectedExpiryDate;
            theBuyerProjectedExpiryDate = this.getBuyerProjectedExpiryDate();
            strategy.appendField(locator, this, "buyerProjectedExpiryDate", buffer, theBuyerProjectedExpiryDate, (this.buyerProjectedExpiryDate!= null));
        }
        {
            List<MaterialSpecificationType> theMaterialSpecification;
            theMaterialSpecification = (((this.materialSpecification!= null)&&(!this.materialSpecification.isEmpty()))?this.getMaterialSpecification():null);
            strategy.appendField(locator, this, "materialSpecification", buffer, theMaterialSpecification, ((this.materialSpecification!= null)&&(!this.materialSpecification.isEmpty())));
        }
        {
            String theMaterialType;
            theMaterialType = this.getMaterialType();
            strategy.appendField(locator, this, "materialType", buffer, theMaterialType, (this.materialType!= null));
        }
        {
            Duration theOverallShelfLife;
            theOverallShelfLife = this.getOverallShelfLife();
            strategy.appendField(locator, this, "overallShelfLife", buffer, theOverallShelfLife, (this.overallShelfLife!= null));
        }
        {
            String thePartNumber;
            thePartNumber = this.getPartNumber();
            strategy.appendField(locator, this, "partNumber", buffer, thePartNumber, (this.partNumber!= null));
        }
        {
            Duration theRemainingShelfLife;
            theRemainingShelfLife = this.getRemainingShelfLife();
            strategy.appendField(locator, this, "remainingShelfLife", buffer, theRemainingShelfLife, (this.remainingShelfLife!= null));
        }
        {
            String theRevisionNumber;
            theRevisionNumber = this.getRevisionNumber();
            strategy.appendField(locator, this, "revisionNumber", buffer, theRevisionNumber, (this.revisionNumber!= null));
        }
        {
            XMLGregorianCalendar theSellerProjectedExpiryDate;
            theSellerProjectedExpiryDate = this.getSellerProjectedExpiryDate();
            strategy.appendField(locator, this, "sellerProjectedExpiryDate", buffer, theSellerProjectedExpiryDate, (this.sellerProjectedExpiryDate!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
