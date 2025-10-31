
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
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.InstallLocation;
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.ProductInformation;
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.SalesOutAndTransaction;
import io.dscope.rosettanet.universal.document.v01_00.BusinessDocumentReference;
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
 * <p>Java class for SalesReportLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesReportLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:1.0}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}InstallLocation" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}ProductInformation"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}SalesOutAndTransaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPriceClaim" type="{urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:1.0}SpecialPriceClaimType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SalesReportLineItemType", propOrder = {
    "businessDocumentReference",
    "comment",
    "installLocation",
    "lineNumber",
    "productInformation",
    "quantity",
    "salesOutAndTransaction",
    "specialPriceClaim"
})
public class SalesReportLineItemType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:1.0", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElementRef(name = "InstallLocation", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = InstallLocation.class, required = false)
    protected InstallLocation installLocation;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "ProductInformation", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = ProductInformation.class)
    protected ProductInformation productInformation;
    @XmlElement(name = "Quantity")
    protected float quantity;
    @XmlElementRef(name = "SalesOutAndTransaction", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = SalesOutAndTransaction.class, required = false)
    protected List<SalesOutAndTransaction> salesOutAndTransaction;
    @XmlElement(name = "SpecialPriceClaim")
    protected List<SpecialPriceClaimType> specialPriceClaim;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the installLocation property.
     * 
     * @return
     *     possible object is
     *     {@link InstallLocation }
     *     
     */
    public InstallLocation getInstallLocation() {
        return installLocation;
    }

    /**
     * Sets the value of the installLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallLocation }
     *     
     */
    public void setInstallLocation(InstallLocation value) {
        this.installLocation = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the productInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformation }
     *     
     */
    public ProductInformation getProductInformation() {
        return productInformation;
    }

    /**
     * Sets the value of the productInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformation }
     *     
     */
    public void setProductInformation(ProductInformation value) {
        this.productInformation = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the salesOutAndTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOutAndTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOutAndTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOutAndTransaction }
     * 
     * 
     */
    public List<SalesOutAndTransaction> getSalesOutAndTransaction() {
        if (salesOutAndTransaction == null) {
            salesOutAndTransaction = new ArrayList<SalesOutAndTransaction>();
        }
        return this.salesOutAndTransaction;
    }

    /**
     * Gets the value of the specialPriceClaim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialPriceClaim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialPriceClaim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialPriceClaimType }
     * 
     * 
     */
    public List<SpecialPriceClaimType> getSpecialPriceClaim() {
        if (specialPriceClaim == null) {
            specialPriceClaim = new ArrayList<SpecialPriceClaimType>();
        }
        return this.specialPriceClaim;
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
        final SalesReportLineItemType that = ((SalesReportLineItemType) object);
        {
            List<BusinessDocumentReference> lhsBusinessDocumentReference;
            lhsBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            List<BusinessDocumentReference> rhsBusinessDocumentReference;
            rhsBusinessDocumentReference = (((that.businessDocumentReference!= null)&&(!that.businessDocumentReference.isEmpty()))?that.getBusinessDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentReference", lhsBusinessDocumentReference), LocatorUtils.property(thatLocator, "businessDocumentReference", rhsBusinessDocumentReference), lhsBusinessDocumentReference, rhsBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())), ((that.businessDocumentReference!= null)&&(!that.businessDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsComment;
            lhsComment = this.getComment();
            String rhsComment;
            rhsComment = that.getComment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comment", lhsComment), LocatorUtils.property(thatLocator, "comment", rhsComment), lhsComment, rhsComment, (this.comment!= null), (that.comment!= null))) {
                return false;
            }
        }
        {
            InstallLocation lhsInstallLocation;
            lhsInstallLocation = this.getInstallLocation();
            InstallLocation rhsInstallLocation;
            rhsInstallLocation = that.getInstallLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "installLocation", lhsInstallLocation), LocatorUtils.property(thatLocator, "installLocation", rhsInstallLocation), lhsInstallLocation, rhsInstallLocation, (this.installLocation!= null), (that.installLocation!= null))) {
                return false;
            }
        }
        {
            String lhsLineNumber;
            lhsLineNumber = this.getLineNumber();
            String rhsLineNumber;
            rhsLineNumber = that.getLineNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineNumber", lhsLineNumber), LocatorUtils.property(thatLocator, "lineNumber", rhsLineNumber), lhsLineNumber, rhsLineNumber, (this.lineNumber!= null), (that.lineNumber!= null))) {
                return false;
            }
        }
        {
            ProductInformation lhsProductInformation;
            lhsProductInformation = this.getProductInformation();
            ProductInformation rhsProductInformation;
            rhsProductInformation = that.getProductInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productInformation", lhsProductInformation), LocatorUtils.property(thatLocator, "productInformation", rhsProductInformation), lhsProductInformation, rhsProductInformation, (this.productInformation!= null), (that.productInformation!= null))) {
                return false;
            }
        }
        {
            float lhsQuantity;
            lhsQuantity = this.getQuantity();
            float rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, true, true)) {
                return false;
            }
        }
        {
            List<SalesOutAndTransaction> lhsSalesOutAndTransaction;
            lhsSalesOutAndTransaction = (((this.salesOutAndTransaction!= null)&&(!this.salesOutAndTransaction.isEmpty()))?this.getSalesOutAndTransaction():null);
            List<SalesOutAndTransaction> rhsSalesOutAndTransaction;
            rhsSalesOutAndTransaction = (((that.salesOutAndTransaction!= null)&&(!that.salesOutAndTransaction.isEmpty()))?that.getSalesOutAndTransaction():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesOutAndTransaction", lhsSalesOutAndTransaction), LocatorUtils.property(thatLocator, "salesOutAndTransaction", rhsSalesOutAndTransaction), lhsSalesOutAndTransaction, rhsSalesOutAndTransaction, ((this.salesOutAndTransaction!= null)&&(!this.salesOutAndTransaction.isEmpty())), ((that.salesOutAndTransaction!= null)&&(!that.salesOutAndTransaction.isEmpty())))) {
                return false;
            }
        }
        {
            List<SpecialPriceClaimType> lhsSpecialPriceClaim;
            lhsSpecialPriceClaim = (((this.specialPriceClaim!= null)&&(!this.specialPriceClaim.isEmpty()))?this.getSpecialPriceClaim():null);
            List<SpecialPriceClaimType> rhsSpecialPriceClaim;
            rhsSpecialPriceClaim = (((that.specialPriceClaim!= null)&&(!that.specialPriceClaim.isEmpty()))?that.getSpecialPriceClaim():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialPriceClaim", lhsSpecialPriceClaim), LocatorUtils.property(thatLocator, "specialPriceClaim", rhsSpecialPriceClaim), lhsSpecialPriceClaim, rhsSpecialPriceClaim, ((this.specialPriceClaim!= null)&&(!this.specialPriceClaim.isEmpty())), ((that.specialPriceClaim!= null)&&(!that.specialPriceClaim.isEmpty())))) {
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
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            String theComment;
            theComment = this.getComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comment", theComment), currentHashCode, theComment, (this.comment!= null));
        }
        {
            InstallLocation theInstallLocation;
            theInstallLocation = this.getInstallLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "installLocation", theInstallLocation), currentHashCode, theInstallLocation, (this.installLocation!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumber", theLineNumber), currentHashCode, theLineNumber, (this.lineNumber!= null));
        }
        {
            ProductInformation theProductInformation;
            theProductInformation = this.getProductInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productInformation", theProductInformation), currentHashCode, theProductInformation, (this.productInformation!= null));
        }
        {
            float theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, true);
        }
        {
            List<SalesOutAndTransaction> theSalesOutAndTransaction;
            theSalesOutAndTransaction = (((this.salesOutAndTransaction!= null)&&(!this.salesOutAndTransaction.isEmpty()))?this.getSalesOutAndTransaction():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesOutAndTransaction", theSalesOutAndTransaction), currentHashCode, theSalesOutAndTransaction, ((this.salesOutAndTransaction!= null)&&(!this.salesOutAndTransaction.isEmpty())));
        }
        {
            List<SpecialPriceClaimType> theSpecialPriceClaim;
            theSpecialPriceClaim = (((this.specialPriceClaim!= null)&&(!this.specialPriceClaim.isEmpty()))?this.getSpecialPriceClaim():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialPriceClaim", theSpecialPriceClaim), currentHashCode, theSpecialPriceClaim, ((this.specialPriceClaim!= null)&&(!this.specialPriceClaim.isEmpty())));
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
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            String theComment;
            theComment = this.getComment();
            strategy.appendField(locator, this, "comment", buffer, theComment, (this.comment!= null));
        }
        {
            InstallLocation theInstallLocation;
            theInstallLocation = this.getInstallLocation();
            strategy.appendField(locator, this, "installLocation", buffer, theInstallLocation, (this.installLocation!= null));
        }
        {
            String theLineNumber;
            theLineNumber = this.getLineNumber();
            strategy.appendField(locator, this, "lineNumber", buffer, theLineNumber, (this.lineNumber!= null));
        }
        {
            ProductInformation theProductInformation;
            theProductInformation = this.getProductInformation();
            strategy.appendField(locator, this, "productInformation", buffer, theProductInformation, (this.productInformation!= null));
        }
        {
            float theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, true);
        }
        {
            List<SalesOutAndTransaction> theSalesOutAndTransaction;
            theSalesOutAndTransaction = (((this.salesOutAndTransaction!= null)&&(!this.salesOutAndTransaction.isEmpty()))?this.getSalesOutAndTransaction():null);
            strategy.appendField(locator, this, "salesOutAndTransaction", buffer, theSalesOutAndTransaction, ((this.salesOutAndTransaction!= null)&&(!this.salesOutAndTransaction.isEmpty())));
        }
        {
            List<SpecialPriceClaimType> theSpecialPriceClaim;
            theSpecialPriceClaim = (((this.specialPriceClaim!= null)&&(!this.specialPriceClaim.isEmpty()))?this.getSpecialPriceClaim():null);
            strategy.appendField(locator, this, "specialPriceClaim", buffer, theSpecialPriceClaim, ((this.specialPriceClaim!= null)&&(!this.specialPriceClaim.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
