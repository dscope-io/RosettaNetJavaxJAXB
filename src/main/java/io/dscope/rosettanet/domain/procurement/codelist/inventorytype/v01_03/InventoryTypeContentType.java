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

package io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InventoryTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AVI"/&gt;
 *     &lt;enumeration value="COI"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="CQC"/&gt;
 *     &lt;enumeration value="CQR"/&gt;
 *     &lt;enumeration value="DEF"/&gt;
 *     &lt;enumeration value="FIG"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="ITB"/&gt;
 *     &lt;enumeration value="ITW"/&gt;
 *     &lt;enumeration value="MDS"/&gt;
 *     &lt;enumeration value="MDT"/&gt;
 *     &lt;enumeration value="MII"/&gt;
 *     &lt;enumeration value="MIT"/&gt;
 *     &lt;enumeration value="NAI"/&gt;
 *     &lt;enumeration value="NSA"/&gt;
 *     &lt;enumeration value="OHI"/&gt;
 *     &lt;enumeration value="ONH"/&gt;
 *     &lt;enumeration value="OPB"/&gt;
 *     &lt;enumeration value="PDD"/&gt;
 *     &lt;enumeration value="QUA"/&gt;
 *     &lt;enumeration value="RAW"/&gt;
 *     &lt;enumeration value="WPI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InventoryTypeContentType")
@XmlEnum
public enum InventoryTypeContentType {

    AVI,
    COI,
    COM,
    CQC,
    CQR,
    DEF,
    FIG,
    INT,
    ITB,
    ITW,
    MDS,
    MDT,
    MII,
    MIT,
    NAI,
    NSA,
    OHI,
    ONH,
    OPB,
    PDD,
    QUA,
    RAW,
    WPI;

    public String value() {
        return name();
    }

    public static InventoryTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
