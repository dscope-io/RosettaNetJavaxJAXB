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

package io.dscope.rosettanet.domain.shared.codelist.paymenttype.v01_01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CUR"/&gt;
 *     &lt;enumeration value="DBD"/&gt;
 *     &lt;enumeration value="EVE"/&gt;
 *     &lt;enumeration value="FIX"/&gt;
 *     &lt;enumeration value="MPR"/&gt;
 *     &lt;enumeration value="NFF"/&gt;
 *     &lt;enumeration value="ONS"/&gt;
 *     &lt;enumeration value="PCR"/&gt;
 *     &lt;enumeration value="PDU"/&gt;
 *     &lt;enumeration value="PFP"/&gt;
 *     &lt;enumeration value="PPE"/&gt;
 *     &lt;enumeration value="SCH"/&gt;
 *     &lt;enumeration value="TIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentTypeContentType")
@XmlEnum
public enum PaymentTypeContentType {

    CUR,
    DBD,
    EVE,
    FIX,
    MPR,
    NFF,
    ONS,
    PCR,
    PDU,
    PFP,
    PPE,
    SCH,
    TIN;

    public String value() {
        return name();
    }

    public static PaymentTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
