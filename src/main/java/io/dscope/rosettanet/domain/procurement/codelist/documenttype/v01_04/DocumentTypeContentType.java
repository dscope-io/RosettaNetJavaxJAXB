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

package io.dscope.rosettanet.domain.procurement.codelist.documenttype.v01_04;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocumentTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACM"/&gt;
 *     &lt;enumeration value="APO"/&gt;
 *     &lt;enumeration value="APR"/&gt;
 *     &lt;enumeration value="ARQ"/&gt;
 *     &lt;enumeration value="CIN"/&gt;
 *     &lt;enumeration value="CNT"/&gt;
 *     &lt;enumeration value="CRM"/&gt;
 *     &lt;enumeration value="DEM"/&gt;
 *     &lt;enumeration value="DEN"/&gt;
 *     &lt;enumeration value="DWN"/&gt;
 *     &lt;enumeration value="INV"/&gt;
 *     &lt;enumeration value="LID"/&gt;
 *     &lt;enumeration value="MDN"/&gt;
 *     &lt;enumeration value="MEN"/&gt;
 *     &lt;enumeration value="MID"/&gt;
 *     &lt;enumeration value="OCM"/&gt;
 *     &lt;enumeration value="OPO"/&gt;
 *     &lt;enumeration value="OPR"/&gt;
 *     &lt;enumeration value="POR"/&gt;
 *     &lt;enumeration value="POI"/&gt;
 *     &lt;enumeration value="POO"/&gt;
 *     &lt;enumeration value="QOT"/&gt;
 *     &lt;enumeration value="REQ"/&gt;
 *     &lt;enumeration value="RMA"/&gt;
 *     &lt;enumeration value="SBC"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SBI"/&gt;
 *     &lt;enumeration value="SEN"/&gt;
 *     &lt;enumeration value="SNC"/&gt;
 *     &lt;enumeration value="SOR"/&gt;
 *     &lt;enumeration value="SPN"/&gt;
 *     &lt;enumeration value="WCM"/&gt;
 *     &lt;enumeration value="WBL"/&gt;
 *     &lt;enumeration value="WOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentTypeContentType")
@XmlEnum
public enum DocumentTypeContentType {

    ACM,
    APO,
    APR,
    ARQ,
    CIN,
    CNT,
    CRM,
    DEM,
    DEN,
    DWN,
    INV,
    LID,
    MDN,
    MEN,
    MID,
    OCM,
    OPO,
    OPR,
    POR,
    POI,
    POO,
    QOT,
    REQ,
    RMA,
    SBC,
    SBD,
    SBI,
    SEN,
    SNC,
    SOR,
    SPN,
    WCM,
    WBL,
    WOR;

    public String value() {
        return name();
    }

    public static DocumentTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
