
package io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.DocumentHeader;
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
 * <p>Java class for ProductCatalogInformationDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCatalogInformationDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23}DocumentHeader" minOccurs="0"/&gt;
 *         &lt;element name="ProductCatalog" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.01}ProductCatalogType"/&gt;
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
@XmlType(name = "ProductCatalogInformationDistributionType", propOrder = {
    "documentHeader",
    "productCatalog"
})
public class ProductCatalogInformationDistributionType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DocumentHeader", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23", type = DocumentHeader.class, required = false)
    protected DocumentHeader documentHeader;
    @XmlElement(name = "ProductCatalog", required = true)
    protected ProductCatalogType productCatalog;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the productCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCatalogType }
     *     
     */
    public ProductCatalogType getProductCatalog() {
        return productCatalog;
    }

    /**
     * Sets the value of the productCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCatalogType }
     *     
     */
    public void setProductCatalog(ProductCatalogType value) {
        this.productCatalog = value;
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
        final ProductCatalogInformationDistributionType that = ((ProductCatalogInformationDistributionType) object);
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
            ProductCatalogType lhsProductCatalog;
            lhsProductCatalog = this.getProductCatalog();
            ProductCatalogType rhsProductCatalog;
            rhsProductCatalog = that.getProductCatalog();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productCatalog", lhsProductCatalog), LocatorUtils.property(thatLocator, "productCatalog", rhsProductCatalog), lhsProductCatalog, rhsProductCatalog, (this.productCatalog!= null), (that.productCatalog!= null))) {
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
            DocumentHeader theDocumentHeader;
            theDocumentHeader = this.getDocumentHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentHeader", theDocumentHeader), currentHashCode, theDocumentHeader, (this.documentHeader!= null));
        }
        {
            ProductCatalogType theProductCatalog;
            theProductCatalog = this.getProductCatalog();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productCatalog", theProductCatalog), currentHashCode, theProductCatalog, (this.productCatalog!= null));
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
            DocumentHeader theDocumentHeader;
            theDocumentHeader = this.getDocumentHeader();
            strategy.appendField(locator, this, "documentHeader", buffer, theDocumentHeader, (this.documentHeader!= null));
        }
        {
            ProductCatalogType theProductCatalog;
            theProductCatalog = this.getProductCatalog();
            strategy.appendField(locator, this, "productCatalog", buffer, theProductCatalog, (this.productCatalog!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
