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

package io.dscope.rosettanet.domain.logistics.logistics.v02_22;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.codelist.weighttype.v01_02.WeightTypeType;
import io.dscope.rosettanet.universal.physicaldimension.v01_07.MeasureType;


/**
 * <p>Java class for MeasureWithTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasureWithTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07}MeasureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{urn:rosettanet:specification:universal:WeightType:xsd:codelist:01.02}WeightTypeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureWithTypeType", propOrder = {
    "type"
})
public class MeasureWithTypeType
    extends MeasureType
{

    @XmlElement(name = "Type")
    protected WeightTypeType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link WeightTypeType }
     *     
     */
    public WeightTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightTypeType }
     *     
     */
    public void setType(WeightTypeType value) {
        this.type = value;
    }

}
