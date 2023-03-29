
package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.totalqualifier.v01_03.TotalQualifier;
import io.dscope.rosettanet.domain.shared.shared.v01_05.ProductQuantity;


/**
 * <p>Java class for ProductUnitTotalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductUnitTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}ProductQuantity"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:TotalQualifier:xsd:codelist:01.03}TotalQualifier"/&gt;
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
@XmlType(name = "ProductUnitTotalType", propOrder = {
    "productQuantity",
    "totalQualifier"
})
public class ProductUnitTotalType {

    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlElementRef(name = "TotalQualifier", namespace = "urn:rosettanet:specification:domain:Procurement:TotalQualifier:xsd:codelist:01.03", type = TotalQualifier.class)
    protected TotalQualifier totalQualifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the totalQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link TotalQualifier }
     *     
     */
    public TotalQualifier getTotalQualifier() {
        return totalQualifier;
    }

    /**
     * Sets the value of the totalQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalQualifier }
     *     
     */
    public void setTotalQualifier(TotalQualifier value) {
        this.totalQualifier = value;
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

}
