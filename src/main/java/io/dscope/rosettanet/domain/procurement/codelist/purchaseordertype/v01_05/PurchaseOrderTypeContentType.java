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

package io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrderTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurchaseOrderTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="BLA"/&gt;
 *     &lt;enumeration value="CCO"/&gt;
 *     &lt;enumeration value="COO"/&gt;
 *     &lt;enumeration value="DCO"/&gt;
 *     &lt;enumeration value="DNS"/&gt;
 *     &lt;enumeration value="DSO"/&gt;
 *     &lt;enumeration value="ERS"/&gt;
 *     &lt;enumeration value="ESD"/&gt;
 *     &lt;enumeration value="EVA"/&gt;
 *     &lt;enumeration value="EXO"/&gt;
 *     &lt;enumeration value="FUL"/&gt;
 *     &lt;enumeration value="GOV"/&gt;
 *     &lt;enumeration value="MSCP"/&gt;
 *     &lt;enumeration value="NCO"/&gt;
 *     &lt;enumeration value="NON"/&gt;
 *     &lt;enumeration value="PAP"/&gt;
 *     &lt;enumeration value="PRD"/&gt;
 *     &lt;enumeration value="QUO"/&gt;
 *     &lt;enumeration value="RCO"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="RPD"/&gt;
 *     &lt;enumeration value="RPN"/&gt;
 *     &lt;enumeration value="RWK"/&gt;
 *     &lt;enumeration value="SAM"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="SSO"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="UCO"/&gt;
 *     &lt;enumeration value="WDW"/&gt;
 *     &lt;enumeration value="WRM"/&gt;
 *     &lt;enumeration value="WRP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseOrderTypeContentType")
@XmlEnum
public enum PurchaseOrderTypeContentType {

    ADD,
    BLA,
    CCO,
    COO,
    DCO,
    DNS,
    DSO,
    ERS,
    ESD,
    EVA,
    EXO,
    FUL,
    GOV,
    MSCP,
    NCO,
    NON,
    PAP,
    PRD,
    QUO,
    RCO,
    REP,
    RPD,
    RPN,
    RWK,
    SAM,
    SIT,
    SSO,
    STD,
    SVC,
    UCO,
    WDW,
    WRM,
    WRP;

    public String value() {
        return name();
    }

    public static PurchaseOrderTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
