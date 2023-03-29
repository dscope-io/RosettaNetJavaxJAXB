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

package io.dscope.rosettanet.domain.procurement.codelist.forecastevent.v01_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastEventContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ForecastEventContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADV"/&gt;
 *     &lt;enumeration value="APA"/&gt;
 *     &lt;enumeration value="DIP"/&gt;
 *     &lt;enumeration value="FOB"/&gt;
 *     &lt;enumeration value="IPC"/&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="MRP"/&gt;
 *     &lt;enumeration value="NLO"/&gt;
 *     &lt;enumeration value="NPO"/&gt;
 *     &lt;enumeration value="OPC"/&gt;
 *     &lt;enumeration value="PCO"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="QUC"/&gt;
 *     &lt;enumeration value="RPS"/&gt;
 *     &lt;enumeration value="SCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForecastEventContentType")
@XmlEnum
public enum ForecastEventContentType {

    ADV,
    APA,
    DIP,
    FOB,
    IPC,
    LOC,
    MRP,
    NLO,
    NPO,
    OPC,
    PCO,
    PRC,
    PRO,
    QUC,
    RPS,
    SCC;

    public String value() {
        return name();
    }

    public static ForecastEventContentType fromValue(String v) {
        return valueOf(v);
    }

}
