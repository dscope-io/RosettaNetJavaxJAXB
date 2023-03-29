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

package io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationreasontype.v01_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingOrderCancellationReasonTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingOrderCancellationReasonTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADP"/&gt;
 *     &lt;enumeration value="ACA"/&gt;
 *     &lt;enumeration value="APF"/&gt;
 *     &lt;enumeration value="APS"/&gt;
 *     &lt;enumeration value="ALS"/&gt;
 *     &lt;enumeration value="IVS"/&gt;
 *     &lt;enumeration value="IVC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingOrderCancellationReasonTypeContentType")
@XmlEnum
public enum ShippingOrderCancellationReasonTypeContentType {

    ADP,
    ACA,
    APF,
    APS,
    ALS,
    IVS,
    IVC;

    public String value() {
        return name();
    }

    public static ShippingOrderCancellationReasonTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
