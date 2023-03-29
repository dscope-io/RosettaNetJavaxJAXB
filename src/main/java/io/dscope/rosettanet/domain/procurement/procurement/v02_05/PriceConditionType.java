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

package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_03.BusinessDocumentReferenceType;


/**
 * <p>Java class for PriceConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceConditionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.03}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="GeneralServiceAdministrationNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.03}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPriceCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPricingDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
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
@XmlType(name = "PriceConditionType", propOrder = {
    "contractIdentifier",
    "generalServiceAdministrationNumber",
    "specialPriceCondition",
    "specialPricingDatePeriod"
})
public class PriceConditionType {

    @XmlElement(name = "ContractIdentifier")
    protected BusinessDocumentReferenceType contractIdentifier;
    @XmlElement(name = "GeneralServiceAdministrationNumber")
    protected BusinessDocumentReferenceType generalServiceAdministrationNumber;
    @XmlElement(name = "SpecialPriceCondition")
    protected String specialPriceCondition;
    @XmlElement(name = "SpecialPricingDatePeriod")
    protected DatePeriodType specialPricingDatePeriod;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getContractIdentifier() {
        return contractIdentifier;
    }

    /**
     * Sets the value of the contractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setContractIdentifier(BusinessDocumentReferenceType value) {
        this.contractIdentifier = value;
    }

    /**
     * Gets the value of the generalServiceAdministrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getGeneralServiceAdministrationNumber() {
        return generalServiceAdministrationNumber;
    }

    /**
     * Sets the value of the generalServiceAdministrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setGeneralServiceAdministrationNumber(BusinessDocumentReferenceType value) {
        this.generalServiceAdministrationNumber = value;
    }

    /**
     * Gets the value of the specialPriceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialPriceCondition() {
        return specialPriceCondition;
    }

    /**
     * Sets the value of the specialPriceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialPriceCondition(String value) {
        this.specialPriceCondition = value;
    }

    /**
     * Gets the value of the specialPricingDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getSpecialPricingDatePeriod() {
        return specialPricingDatePeriod;
    }

    /**
     * Sets the value of the specialPricingDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setSpecialPricingDatePeriod(DatePeriodType value) {
        this.specialPricingDatePeriod = value;
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
