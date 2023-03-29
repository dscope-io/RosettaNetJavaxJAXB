/*-
 * ===LICENSE_START===
 * RosettaNet JAXB
 * ===
 * Copyright (C) 2023 Exilor Inc.
 * ===
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ===LICENSE_END===
 */

package io.dscope.rosettanet.domain.procurement.procurement.v02_29;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderProvisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProvisionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ProductAvailabilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ProductQuantityRangeType"/&gt;
 *         &lt;element name="OrderSizeRounding" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ProductLeadTime" minOccurs="0"/&gt;
 *         &lt;element name="SampleAvailability" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderProvisionType", propOrder = {
    "orderQuantity",
    "orderSizeRounding",
    "productLeadTime",
    "sampleAvailability"
})
public class OrderProvisionType
    extends ProductAvailabilityType
{

    @XmlElement(name = "OrderQuantity", required = true)
    protected ProductQuantityRangeType orderQuantity;
    @XmlElement(name = "OrderSizeRounding")
    protected Float orderSizeRounding;
    @XmlElementRef(name = "ProductLeadTime", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = ProductLeadTime.class, required = false)
    protected ProductLeadTime productLeadTime;
    @XmlElement(name = "SampleAvailability", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sampleAvailability;

    /**
     * Gets the value of the orderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityRangeType }
     *     
     */
    public ProductQuantityRangeType getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Sets the value of the orderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityRangeType }
     *     
     */
    public void setOrderQuantity(ProductQuantityRangeType value) {
        this.orderQuantity = value;
    }

    /**
     * Gets the value of the orderSizeRounding property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOrderSizeRounding() {
        return orderSizeRounding;
    }

    /**
     * Sets the value of the orderSizeRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOrderSizeRounding(Float value) {
        this.orderSizeRounding = value;
    }

    /**
     * Gets the value of the productLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLeadTime }
     *     
     */
    public ProductLeadTime getProductLeadTime() {
        return productLeadTime;
    }

    /**
     * Sets the value of the productLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLeadTime }
     *     
     */
    public void setProductLeadTime(ProductLeadTime value) {
        this.productLeadTime = value;
    }

    /**
     * Gets the value of the sampleAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSampleAvailability() {
        return sampleAvailability;
    }

    /**
     * Sets the value of the sampleAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSampleAvailability(XMLGregorianCalendar value) {
        this.sampleAvailability = value;
    }

}
