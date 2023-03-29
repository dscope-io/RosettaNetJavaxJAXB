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

package io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentModeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentModeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AIE"/&gt;
 *     &lt;enumeration value="AIF"/&gt;
 *     &lt;enumeration value="AIR"/&gt;
 *     &lt;enumeration value="COC"/&gt;
 *     &lt;enumeration value="COO"/&gt;
 *     &lt;enumeration value="CPI"/&gt;
 *     &lt;enumeration value="EXT"/&gt;
 *     &lt;enumeration value="INM"/&gt;
 *     &lt;enumeration value="MAT"/&gt;
 *     &lt;enumeration value="MOT"/&gt;
 *     &lt;enumeration value="OCE"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="RAI"/&gt;
 *     &lt;enumeration value="TRK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentModeContentType")
@XmlEnum
public enum ShipmentModeContentType {

    AIE,
    AIF,
    AIR,
    COC,
    COO,
    CPI,
    EXT,
    INM,
    MAT,
    MOT,
    OCE,
    OTH,
    PRC,
    RAI,
    TRK;

    public String value() {
        return name();
    }

    public static ShipmentModeContentType fromValue(String v) {
        return valueOf(v);
    }

}
