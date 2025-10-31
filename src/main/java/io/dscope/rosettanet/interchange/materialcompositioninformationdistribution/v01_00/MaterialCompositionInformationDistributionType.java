
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v01_00;

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
import io.dscope.rosettanet.system.standarddocumentheader.v01_00.DocumentHeader;
import io.dscope.rosettanet.universal.document.v01_00.BusinessDocumentReferenceType;
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
 * <p>Java class for MaterialCompositionInformationDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialCompositionInformationDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgreementIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:1.0}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:1.0}DocumentHeader"/&gt;
 *         &lt;element name="ProductInformation" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:1.0}ProductInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ProductInformationHeader" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:1.0}ProductInformationHeaderType" minOccurs="0"/&gt;
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
@XmlType(name = "MaterialCompositionInformationDistributionType", propOrder = {
    "agreementIdentifier",
    "documentHeader",
    "productInformation",
    "productInformationHeader"
})
public class MaterialCompositionInformationDistributionType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "AgreementIdentifier")
    protected BusinessDocumentReferenceType agreementIdentifier;
    @XmlElementRef(name = "DocumentHeader", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:1.0", type = DocumentHeader.class)
    protected DocumentHeader documentHeader;
    @XmlElement(name = "ProductInformation", required = true)
    protected List<ProductInformationType> productInformation;
    @XmlElement(name = "ProductInformationHeader")
    protected ProductInformationHeaderType productInformationHeader;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the agreementIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getAgreementIdentifier() {
        return agreementIdentifier;
    }

    /**
     * Sets the value of the agreementIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setAgreementIdentifier(BusinessDocumentReferenceType value) {
        this.agreementIdentifier = value;
    }

    /**
     * Gets the value of the documentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHeader }
     *     
     */
    public DocumentHeader getDocumentHeader() {
        return documentHeader;
    }

    /**
     * Sets the value of the documentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHeader }
     *     
     */
    public void setDocumentHeader(DocumentHeader value) {
        this.documentHeader = value;
    }

    /**
     * Gets the value of the productInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductInformationType }
     * 
     * 
     */
    public List<ProductInformationType> getProductInformation() {
        if (productInformation == null) {
            productInformation = new ArrayList<ProductInformationType>();
        }
        return this.productInformation;
    }

    /**
     * Gets the value of the productInformationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationHeaderType }
     *     
     */
    public ProductInformationHeaderType getProductInformationHeader() {
        return productInformationHeader;
    }

    /**
     * Sets the value of the productInformationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationHeaderType }
     *     
     */
    public void setProductInformationHeader(ProductInformationHeaderType value) {
        this.productInformationHeader = value;
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
        final MaterialCompositionInformationDistributionType that = ((MaterialCompositionInformationDistributionType) object);
        {
            BusinessDocumentReferenceType lhsAgreementIdentifier;
            lhsAgreementIdentifier = this.getAgreementIdentifier();
            BusinessDocumentReferenceType rhsAgreementIdentifier;
            rhsAgreementIdentifier = that.getAgreementIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agreementIdentifier", lhsAgreementIdentifier), LocatorUtils.property(thatLocator, "agreementIdentifier", rhsAgreementIdentifier), lhsAgreementIdentifier, rhsAgreementIdentifier, (this.agreementIdentifier!= null), (that.agreementIdentifier!= null))) {
                return false;
            }
        }
        {
            DocumentHeader lhsDocumentHeader;
            lhsDocumentHeader = this.getDocumentHeader();
            DocumentHeader rhsDocumentHeader;
            rhsDocumentHeader = that.getDocumentHeader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentHeader", lhsDocumentHeader), LocatorUtils.property(thatLocator, "documentHeader", rhsDocumentHeader), lhsDocumentHeader, rhsDocumentHeader, (this.documentHeader!= null), (that.documentHeader!= null))) {
                return false;
            }
        }
        {
            List<ProductInformationType> lhsProductInformation;
            lhsProductInformation = (((this.productInformation!= null)&&(!this.productInformation.isEmpty()))?this.getProductInformation():null);
            List<ProductInformationType> rhsProductInformation;
            rhsProductInformation = (((that.productInformation!= null)&&(!that.productInformation.isEmpty()))?that.getProductInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productInformation", lhsProductInformation), LocatorUtils.property(thatLocator, "productInformation", rhsProductInformation), lhsProductInformation, rhsProductInformation, ((this.productInformation!= null)&&(!this.productInformation.isEmpty())), ((that.productInformation!= null)&&(!that.productInformation.isEmpty())))) {
                return false;
            }
        }
        {
            ProductInformationHeaderType lhsProductInformationHeader;
            lhsProductInformationHeader = this.getProductInformationHeader();
            ProductInformationHeaderType rhsProductInformationHeader;
            rhsProductInformationHeader = that.getProductInformationHeader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productInformationHeader", lhsProductInformationHeader), LocatorUtils.property(thatLocator, "productInformationHeader", rhsProductInformationHeader), lhsProductInformationHeader, rhsProductInformationHeader, (this.productInformationHeader!= null), (that.productInformationHeader!= null))) {
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
            BusinessDocumentReferenceType theAgreementIdentifier;
            theAgreementIdentifier = this.getAgreementIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agreementIdentifier", theAgreementIdentifier), currentHashCode, theAgreementIdentifier, (this.agreementIdentifier!= null));
        }
        {
            DocumentHeader theDocumentHeader;
            theDocumentHeader = this.getDocumentHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentHeader", theDocumentHeader), currentHashCode, theDocumentHeader, (this.documentHeader!= null));
        }
        {
            List<ProductInformationType> theProductInformation;
            theProductInformation = (((this.productInformation!= null)&&(!this.productInformation.isEmpty()))?this.getProductInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productInformation", theProductInformation), currentHashCode, theProductInformation, ((this.productInformation!= null)&&(!this.productInformation.isEmpty())));
        }
        {
            ProductInformationHeaderType theProductInformationHeader;
            theProductInformationHeader = this.getProductInformationHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productInformationHeader", theProductInformationHeader), currentHashCode, theProductInformationHeader, (this.productInformationHeader!= null));
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
            BusinessDocumentReferenceType theAgreementIdentifier;
            theAgreementIdentifier = this.getAgreementIdentifier();
            strategy.appendField(locator, this, "agreementIdentifier", buffer, theAgreementIdentifier, (this.agreementIdentifier!= null));
        }
        {
            DocumentHeader theDocumentHeader;
            theDocumentHeader = this.getDocumentHeader();
            strategy.appendField(locator, this, "documentHeader", buffer, theDocumentHeader, (this.documentHeader!= null));
        }
        {
            List<ProductInformationType> theProductInformation;
            theProductInformation = (((this.productInformation!= null)&&(!this.productInformation.isEmpty()))?this.getProductInformation():null);
            strategy.appendField(locator, this, "productInformation", buffer, theProductInformation, ((this.productInformation!= null)&&(!this.productInformation.isEmpty())));
        }
        {
            ProductInformationHeaderType theProductInformationHeader;
            theProductInformationHeader = this.getProductInformationHeader();
            strategy.appendField(locator, this, "productInformationHeader", buffer, theProductInformationHeader, (this.productInformationHeader!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
