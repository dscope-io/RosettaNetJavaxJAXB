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

package io.dscope.rosettanet.domain.procurement.codelist.event.v01_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EventContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACA"/&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="APG"/&gt;
 *     &lt;enumeration value="APS"/&gt;
 *     &lt;enumeration value="CME"/&gt;
 *     &lt;enumeration value="CWE"/&gt;
 *     &lt;enumeration value="CWS"/&gt;
 *     &lt;enumeration value="DDR"/&gt;
 *     &lt;enumeration value="DEL"/&gt;
 *     &lt;enumeration value="DIN"/&gt;
 *     &lt;enumeration value="DSF"/&gt;
 *     &lt;enumeration value="DSS"/&gt;
 *     &lt;enumeration value="EDS"/&gt;
 *     &lt;enumeration value="EIN"/&gt;
 *     &lt;enumeration value="ESD"/&gt;
 *     &lt;enumeration value="ETS"/&gt;
 *     &lt;enumeration value="EWC"/&gt;
 *     &lt;enumeration value="FSA"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="ITE"/&gt;
 *     &lt;enumeration value="LSG"/&gt;
 *     &lt;enumeration value="NCA"/&gt;
 *     &lt;enumeration value="PAC"/&gt;
 *     &lt;enumeration value="PDA"/&gt;
 *     &lt;enumeration value="RIN"/&gt;
 *     &lt;enumeration value="SAB"/&gt;
 *     &lt;enumeration value="SID"/&gt;
 *     &lt;enumeration value="SPV"/&gt;
 *     &lt;enumeration value="SRF"/&gt;
 *     &lt;enumeration value="SRR"/&gt;
 *     &lt;enumeration value="STI"/&gt;
 *     &lt;enumeration value="SVL"/&gt;
 *     &lt;enumeration value="TSS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventContentType")
@XmlEnum
public enum EventContentType {

    ACA,
    ACT,
    APG,
    APS,
    CME,
    CWE,
    CWS,
    DDR,
    DEL,
    DIN,
    DSF,
    DSS,
    EDS,
    EIN,
    ESD,
    ETS,
    EWC,
    FSA,
    INT,
    ITE,
    LSG,
    NCA,
    PAC,
    PDA,
    RIN,
    SAB,
    SID,
    SPV,
    SRF,
    SRR,
    STI,
    SVL,
    TSS;

    public String value() {
        return name();
    }

    public static EventContentType fromValue(String v) {
        return valueOf(v);
    }

}
