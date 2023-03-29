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

package io.dscope.rosettanet.domain.procurement.codelist.transactiontype.v01_04;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransactionTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CAN"/&gt;
 *     &lt;enumeration value="COS"/&gt;
 *     &lt;enumeration value="DSM"/&gt;
 *     &lt;enumeration value="ITC"/&gt;
 *     &lt;enumeration value="ITR"/&gt;
 *     &lt;enumeration value="ITT"/&gt;
 *     &lt;enumeration value="MSI"/&gt;
 *     &lt;enumeration value="MSO"/&gt;
 *     &lt;enumeration value="OOO"/&gt;
 *     &lt;enumeration value="OOS"/&gt;
 *     &lt;enumeration value="RET"/&gt;
 *     &lt;enumeration value="RPR"/&gt;
 *     &lt;enumeration value="SAL"/&gt;
 *     &lt;enumeration value="SEL"/&gt;
 *     &lt;enumeration value="SIN"/&gt;
 *     &lt;enumeration value="STI"/&gt;
 *     &lt;enumeration value="STO"/&gt;
 *     &lt;enumeration value="WHS"/&gt;
 *     &lt;enumeration value="WHA"/&gt;
 *     &lt;enumeration value="WHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionTypeContentType")
@XmlEnum
public enum TransactionTypeContentType {

    CAN,
    COS,
    DSM,
    ITC,
    ITR,
    ITT,
    MSI,
    MSO,
    OOO,
    OOS,
    RET,
    RPR,
    SAL,
    SEL,
    SIN,
    STI,
    STO,
    WHS,
    WHA,
    WHR;

    public String value() {
        return name();
    }

    public static TransactionTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
