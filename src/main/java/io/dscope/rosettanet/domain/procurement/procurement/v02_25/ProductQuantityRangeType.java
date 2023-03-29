
package io.dscope.rosettanet.domain.procurement.procurement.v02_25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductQuantityRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductQuantityRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaximumOrderQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="MinimumOrderQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType"/&gt;
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
@XmlType(name = "ProductQuantityRangeType", propOrder = {
    "maximumOrderQuantity",
    "minimumOrderQuantity"
})
public class ProductQuantityRangeType {

    @XmlElement(name = "MaximumOrderQuantity")
    protected Float maximumOrderQuantity;
    @XmlElement(name = "MinimumOrderQuantity")
    protected float minimumOrderQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the maximumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumOrderQuantity() {
        return maximumOrderQuantity;
    }

    /**
     * Sets the value of the maximumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumOrderQuantity(Float value) {
        this.maximumOrderQuantity = value;
    }

    /**
     * Gets the value of the minimumOrderQuantity property.
     * 
     */
    public float getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the value of the minimumOrderQuantity property.
     * 
     */
    public void setMinimumOrderQuantity(float value) {
        this.minimumOrderQuantity = value;
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
