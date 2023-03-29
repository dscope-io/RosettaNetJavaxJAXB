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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.codelist.forecastreferencetype.v01_03.ForecastReferenceType;
import io.dscope.rosettanet.universal.document.v01_03.BusinessDocumentReferenceType;


/**
 * <p>Java class for ForecastIdentifierReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastIdentifierReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:Document:xsd:schema:01.03}BusinessDocumentReferenceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.03}ForecastReferenceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastIdentifierReferenceType", propOrder = {
    "forecastReferenceType"
})
public class ForecastIdentifierReferenceType
    extends BusinessDocumentReferenceType
{

    @XmlElementRef(name = "ForecastReferenceType", namespace = "urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.03", type = ForecastReferenceType.class)
    protected ForecastReferenceType forecastReferenceType;

    /**
     * Gets the value of the forecastReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastReferenceType }
     *     
     */
    public ForecastReferenceType getForecastReferenceType() {
        return forecastReferenceType;
    }

    /**
     * Sets the value of the forecastReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastReferenceType }
     *     
     */
    public void setForecastReferenceType(ForecastReferenceType value) {
        this.forecastReferenceType = value;
    }

}
