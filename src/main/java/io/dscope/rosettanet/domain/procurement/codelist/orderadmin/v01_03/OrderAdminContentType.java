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

package io.dscope.rosettanet.domain.procurement.codelist.orderadmin.v01_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderAdminContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OrderAdminContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DDE"/&gt;
 *     &lt;enumeration value="DOA"/&gt;
 *     &lt;enumeration value="ERA"/&gt;
 *     &lt;enumeration value="GRA"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="MUL"/&gt;
 *     &lt;enumeration value="PRE"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="RZC"/&gt;
 *     &lt;enumeration value="SAM"/&gt;
 *     &lt;enumeration value="SPR"/&gt;
 *     &lt;enumeration value="STA"/&gt;
 *     &lt;enumeration value="TIO"/&gt;
 *     &lt;enumeration value="TIR"/&gt;
 *     &lt;enumeration value="UPG"/&gt;
 *     &lt;enumeration value="UZC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderAdminContentType")
@XmlEnum
public enum OrderAdminContentType {

    DDE,
    DOA,
    ERA,
    GRA,
    INT,
    MUL,
    PRE,
    REP,
    RZC,
    SAM,
    SPR,
    STA,
    TIO,
    TIR,
    UPG,
    UZC;

    public String value() {
        return name();
    }

    public static OrderAdminContentType fromValue(String v) {
        return valueOf(v);
    }

}
