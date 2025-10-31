
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
import io.dscope.rosettanet.domain.salesreporting.codelist.reporttype.v01_00.ReportTypeType;
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.ContractDetails;
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.ParticipatingPartner;
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.ProductSummary;
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
 * <p>Java class for SalesReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountManagerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}ContractDetails" minOccurs="0"/&gt;
 *         &lt;element name="ExportReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarketType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}ParticipatingPartner" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}ProductSummary" minOccurs="0"/&gt;
 *         &lt;element name="ProductTransfer" type="{urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:1.0}ProductTransferType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ReportType" type="{urn:rosettanet:specification:domain:ReportType:xsd:codelist:1.0}ReportTypeType"/&gt;
 *         &lt;element name="SalesTerritoryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SalesReportType", propOrder = {
    "accountManagerCode",
    "comment",
    "contractDetails",
    "exportReferenceNumber",
    "marketType",
    "participatingPartner",
    "productSummary",
    "productTransfer",
    "reportType",
    "salesTerritoryNumber"
})
public class SalesReportType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AccountManagerCode")
    protected String accountManagerCode;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElementRef(name = "ContractDetails", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = ContractDetails.class, required = false)
    protected ContractDetails contractDetails;
    @XmlElement(name = "ExportReferenceNumber")
    protected String exportReferenceNumber;
    @XmlElement(name = "MarketType")
    protected String marketType;
    @XmlElementRef(name = "ParticipatingPartner", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = ParticipatingPartner.class)
    protected List<ParticipatingPartner> participatingPartner;
    @XmlElementRef(name = "ProductSummary", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = ProductSummary.class, required = false)
    protected ProductSummary productSummary;
    @XmlElement(name = "ProductTransfer", required = true)
    protected List<ProductTransferType> productTransfer;
    @XmlElement(name = "ReportType", required = true)
    protected ReportTypeType reportType;
    @XmlElement(name = "SalesTerritoryNumber")
    protected String salesTerritoryNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the accountManagerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountManagerCode() {
        return accountManagerCode;
    }

    /**
     * Sets the value of the accountManagerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountManagerCode(String value) {
        this.accountManagerCode = value;
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
     * Gets the value of the contractDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDetails }
     *     
     */
    public ContractDetails getContractDetails() {
        return contractDetails;
    }

    /**
     * Sets the value of the contractDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDetails }
     *     
     */
    public void setContractDetails(ContractDetails value) {
        this.contractDetails = value;
    }

    /**
     * Gets the value of the exportReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportReferenceNumber() {
        return exportReferenceNumber;
    }

    /**
     * Sets the value of the exportReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportReferenceNumber(String value) {
        this.exportReferenceNumber = value;
    }

    /**
     * Gets the value of the marketType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketType() {
        return marketType;
    }

    /**
     * Sets the value of the marketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketType(String value) {
        this.marketType = value;
    }

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
     * Gets the value of the productSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSummary }
     *     
     */
    public ProductSummary getProductSummary() {
        return productSummary;
    }

    /**
     * Sets the value of the productSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSummary }
     *     
     */
    public void setProductSummary(ProductSummary value) {
        this.productSummary = value;
    }

    /**
     * Gets the value of the productTransfer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productTransfer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductTransfer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductTransferType }
     * 
     * 
     */
    public List<ProductTransferType> getProductTransfer() {
        if (productTransfer == null) {
            productTransfer = new ArrayList<ProductTransferType>();
        }
        return this.productTransfer;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportTypeType }
     *     
     */
    public ReportTypeType getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTypeType }
     *     
     */
    public void setReportType(ReportTypeType value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the salesTerritoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTerritoryNumber() {
        return salesTerritoryNumber;
    }

    /**
     * Sets the value of the salesTerritoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTerritoryNumber(String value) {
        this.salesTerritoryNumber = value;
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
        final SalesReportType that = ((SalesReportType) object);
        {
            String lhsAccountManagerCode;
            lhsAccountManagerCode = this.getAccountManagerCode();
            String rhsAccountManagerCode;
            rhsAccountManagerCode = that.getAccountManagerCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountManagerCode", lhsAccountManagerCode), LocatorUtils.property(thatLocator, "accountManagerCode", rhsAccountManagerCode), lhsAccountManagerCode, rhsAccountManagerCode, (this.accountManagerCode!= null), (that.accountManagerCode!= null))) {
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
            ContractDetails lhsContractDetails;
            lhsContractDetails = this.getContractDetails();
            ContractDetails rhsContractDetails;
            rhsContractDetails = that.getContractDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractDetails", lhsContractDetails), LocatorUtils.property(thatLocator, "contractDetails", rhsContractDetails), lhsContractDetails, rhsContractDetails, (this.contractDetails!= null), (that.contractDetails!= null))) {
                return false;
            }
        }
        {
            String lhsExportReferenceNumber;
            lhsExportReferenceNumber = this.getExportReferenceNumber();
            String rhsExportReferenceNumber;
            rhsExportReferenceNumber = that.getExportReferenceNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exportReferenceNumber", lhsExportReferenceNumber), LocatorUtils.property(thatLocator, "exportReferenceNumber", rhsExportReferenceNumber), lhsExportReferenceNumber, rhsExportReferenceNumber, (this.exportReferenceNumber!= null), (that.exportReferenceNumber!= null))) {
                return false;
            }
        }
        {
            String lhsMarketType;
            lhsMarketType = this.getMarketType();
            String rhsMarketType;
            rhsMarketType = that.getMarketType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketType", lhsMarketType), LocatorUtils.property(thatLocator, "marketType", rhsMarketType), lhsMarketType, rhsMarketType, (this.marketType!= null), (that.marketType!= null))) {
                return false;
            }
        }
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
            ProductSummary lhsProductSummary;
            lhsProductSummary = this.getProductSummary();
            ProductSummary rhsProductSummary;
            rhsProductSummary = that.getProductSummary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productSummary", lhsProductSummary), LocatorUtils.property(thatLocator, "productSummary", rhsProductSummary), lhsProductSummary, rhsProductSummary, (this.productSummary!= null), (that.productSummary!= null))) {
                return false;
            }
        }
        {
            List<ProductTransferType> lhsProductTransfer;
            lhsProductTransfer = (((this.productTransfer!= null)&&(!this.productTransfer.isEmpty()))?this.getProductTransfer():null);
            List<ProductTransferType> rhsProductTransfer;
            rhsProductTransfer = (((that.productTransfer!= null)&&(!that.productTransfer.isEmpty()))?that.getProductTransfer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productTransfer", lhsProductTransfer), LocatorUtils.property(thatLocator, "productTransfer", rhsProductTransfer), lhsProductTransfer, rhsProductTransfer, ((this.productTransfer!= null)&&(!this.productTransfer.isEmpty())), ((that.productTransfer!= null)&&(!that.productTransfer.isEmpty())))) {
                return false;
            }
        }
        {
            ReportTypeType lhsReportType;
            lhsReportType = this.getReportType();
            ReportTypeType rhsReportType;
            rhsReportType = that.getReportType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportType", lhsReportType), LocatorUtils.property(thatLocator, "reportType", rhsReportType), lhsReportType, rhsReportType, (this.reportType!= null), (that.reportType!= null))) {
                return false;
            }
        }
        {
            String lhsSalesTerritoryNumber;
            lhsSalesTerritoryNumber = this.getSalesTerritoryNumber();
            String rhsSalesTerritoryNumber;
            rhsSalesTerritoryNumber = that.getSalesTerritoryNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesTerritoryNumber", lhsSalesTerritoryNumber), LocatorUtils.property(thatLocator, "salesTerritoryNumber", rhsSalesTerritoryNumber), lhsSalesTerritoryNumber, rhsSalesTerritoryNumber, (this.salesTerritoryNumber!= null), (that.salesTerritoryNumber!= null))) {
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
            String theAccountManagerCode;
            theAccountManagerCode = this.getAccountManagerCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountManagerCode", theAccountManagerCode), currentHashCode, theAccountManagerCode, (this.accountManagerCode!= null));
        }
        {
            String theComment;
            theComment = this.getComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comment", theComment), currentHashCode, theComment, (this.comment!= null));
        }
        {
            ContractDetails theContractDetails;
            theContractDetails = this.getContractDetails();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractDetails", theContractDetails), currentHashCode, theContractDetails, (this.contractDetails!= null));
        }
        {
            String theExportReferenceNumber;
            theExportReferenceNumber = this.getExportReferenceNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exportReferenceNumber", theExportReferenceNumber), currentHashCode, theExportReferenceNumber, (this.exportReferenceNumber!= null));
        }
        {
            String theMarketType;
            theMarketType = this.getMarketType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "marketType", theMarketType), currentHashCode, theMarketType, (this.marketType!= null));
        }
        {
            List<ParticipatingPartner> theParticipatingPartner;
            theParticipatingPartner = (((this.participatingPartner!= null)&&(!this.participatingPartner.isEmpty()))?this.getParticipatingPartner():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "participatingPartner", theParticipatingPartner), currentHashCode, theParticipatingPartner, ((this.participatingPartner!= null)&&(!this.participatingPartner.isEmpty())));
        }
        {
            ProductSummary theProductSummary;
            theProductSummary = this.getProductSummary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productSummary", theProductSummary), currentHashCode, theProductSummary, (this.productSummary!= null));
        }
        {
            List<ProductTransferType> theProductTransfer;
            theProductTransfer = (((this.productTransfer!= null)&&(!this.productTransfer.isEmpty()))?this.getProductTransfer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productTransfer", theProductTransfer), currentHashCode, theProductTransfer, ((this.productTransfer!= null)&&(!this.productTransfer.isEmpty())));
        }
        {
            ReportTypeType theReportType;
            theReportType = this.getReportType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportType", theReportType), currentHashCode, theReportType, (this.reportType!= null));
        }
        {
            String theSalesTerritoryNumber;
            theSalesTerritoryNumber = this.getSalesTerritoryNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesTerritoryNumber", theSalesTerritoryNumber), currentHashCode, theSalesTerritoryNumber, (this.salesTerritoryNumber!= null));
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
            String theAccountManagerCode;
            theAccountManagerCode = this.getAccountManagerCode();
            strategy.appendField(locator, this, "accountManagerCode", buffer, theAccountManagerCode, (this.accountManagerCode!= null));
        }
        {
            String theComment;
            theComment = this.getComment();
            strategy.appendField(locator, this, "comment", buffer, theComment, (this.comment!= null));
        }
        {
            ContractDetails theContractDetails;
            theContractDetails = this.getContractDetails();
            strategy.appendField(locator, this, "contractDetails", buffer, theContractDetails, (this.contractDetails!= null));
        }
        {
            String theExportReferenceNumber;
            theExportReferenceNumber = this.getExportReferenceNumber();
            strategy.appendField(locator, this, "exportReferenceNumber", buffer, theExportReferenceNumber, (this.exportReferenceNumber!= null));
        }
        {
            String theMarketType;
            theMarketType = this.getMarketType();
            strategy.appendField(locator, this, "marketType", buffer, theMarketType, (this.marketType!= null));
        }
        {
            List<ParticipatingPartner> theParticipatingPartner;
            theParticipatingPartner = (((this.participatingPartner!= null)&&(!this.participatingPartner.isEmpty()))?this.getParticipatingPartner():null);
            strategy.appendField(locator, this, "participatingPartner", buffer, theParticipatingPartner, ((this.participatingPartner!= null)&&(!this.participatingPartner.isEmpty())));
        }
        {
            ProductSummary theProductSummary;
            theProductSummary = this.getProductSummary();
            strategy.appendField(locator, this, "productSummary", buffer, theProductSummary, (this.productSummary!= null));
        }
        {
            List<ProductTransferType> theProductTransfer;
            theProductTransfer = (((this.productTransfer!= null)&&(!this.productTransfer.isEmpty()))?this.getProductTransfer():null);
            strategy.appendField(locator, this, "productTransfer", buffer, theProductTransfer, ((this.productTransfer!= null)&&(!this.productTransfer.isEmpty())));
        }
        {
            ReportTypeType theReportType;
            theReportType = this.getReportType();
            strategy.appendField(locator, this, "reportType", buffer, theReportType, (this.reportType!= null));
        }
        {
            String theSalesTerritoryNumber;
            theSalesTerritoryNumber = this.getSalesTerritoryNumber();
            strategy.appendField(locator, this, "salesTerritoryNumber", buffer, theSalesTerritoryNumber, (this.salesTerritoryNumber!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
