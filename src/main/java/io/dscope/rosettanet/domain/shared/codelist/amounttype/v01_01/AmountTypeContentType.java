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

package io.dscope.rosettanet.domain.shared.codelist.amounttype.v01_01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AmountTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="FRE"/&gt;
 *     &lt;enumeration value="INS"/&gt;
 *     &lt;enumeration value="UNI"/&gt;
 *     &lt;enumeration value="VAD"/&gt;
 *     &lt;enumeration value="MIS"/&gt;
 *     &lt;enumeration value="MAT"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="TOT"/&gt;
 *     &lt;enumeration value="TOD"/&gt;
 *     &lt;enumeration value="TOV"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AmountTypeContentType")
@XmlEnum
public enum AmountTypeContentType {

    FRE,
    INS,
    UNI,
    VAD,
    MIS,
    MAT,
    DIS,
    TOT,
    TOD,
    TOV,
    PRC;

    public String value() {
        return name();
    }

    public static AmountTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
