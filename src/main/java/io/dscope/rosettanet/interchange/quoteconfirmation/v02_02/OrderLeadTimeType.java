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

package io.dscope.rosettanet.interchange.quoteconfirmation.v02_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_03.LeadTimeClassificationCode;
import io.dscope.rosettanet.domain.shared.shared.v01_17.DatePeriodAndDuration;
import io.dscope.rosettanet.interchange.codelist.leadtimecommencement.v01_01.LeadTimeCommencement;


/**
 * <p>Java class for OrderLeadTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLeadTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}DatePeriodAndDuration"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03}LeadTimeClassificationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:LeadTimeCommencement:xsd:codelist:01.01}LeadTimeCommencement" minOccurs="0"/&gt;
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
@XmlType(name = "OrderLeadTimeType", propOrder = {
    "datePeriodAndDuration",
    "leadTimeClassificationCode",
    "leadTimeCommencement"
})
public class OrderLeadTimeType {

    @XmlElementRef(name = "DatePeriodAndDuration", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.17", type = DatePeriodAndDuration.class)
    protected DatePeriodAndDuration datePeriodAndDuration;
    @XmlElementRef(name = "LeadTimeClassificationCode", namespace = "urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03", type = LeadTimeClassificationCode.class, required = false)
    protected LeadTimeClassificationCode leadTimeClassificationCode;
    @XmlElementRef(name = "LeadTimeCommencement", namespace = "urn:rosettanet:specification:interchange:LeadTimeCommencement:xsd:codelist:01.01", type = LeadTimeCommencement.class, required = false)
    protected LeadTimeCommencement leadTimeCommencement;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the datePeriodAndDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDuration }
     *     
     */
    public DatePeriodAndDuration getDatePeriodAndDuration() {
        return datePeriodAndDuration;
    }

    /**
     * Sets the value of the datePeriodAndDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDuration }
     *     
     */
    public void setDatePeriodAndDuration(DatePeriodAndDuration value) {
        this.datePeriodAndDuration = value;
    }

    /**
     * Gets the value of the leadTimeClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link LeadTimeClassificationCode }
     *     
     */
    public LeadTimeClassificationCode getLeadTimeClassificationCode() {
        return leadTimeClassificationCode;
    }

    /**
     * Sets the value of the leadTimeClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadTimeClassificationCode }
     *     
     */
    public void setLeadTimeClassificationCode(LeadTimeClassificationCode value) {
        this.leadTimeClassificationCode = value;
    }

    /**
     * Gets the value of the leadTimeCommencement property.
     * 
     * @return
     *     possible object is
     *     {@link LeadTimeCommencement }
     *     
     */
    public LeadTimeCommencement getLeadTimeCommencement() {
        return leadTimeCommencement;
    }

    /**
     * Sets the value of the leadTimeCommencement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadTimeCommencement }
     *     
     */
    public void setLeadTimeCommencement(LeadTimeCommencement value) {
        this.leadTimeCommencement = value;
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
