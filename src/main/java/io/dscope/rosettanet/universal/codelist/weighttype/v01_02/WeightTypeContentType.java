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

package io.dscope.rosettanet.universal.codelist.weighttype.v01_02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeightTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WeightTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CHR"/&gt;
 *     &lt;enumeration value="DMN"/&gt;
 *     &lt;enumeration value="EXA"/&gt;
 *     &lt;enumeration value="GNR"/&gt;
 *     &lt;enumeration value="GRS"/&gt;
 *     &lt;enumeration value="NET"/&gt;
 *     &lt;enumeration value="NOM"/&gt;
 *     &lt;enumeration value="TAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeightTypeContentType")
@XmlEnum
public enum WeightTypeContentType {

    CHR,
    DMN,
    EXA,
    GNR,
    GRS,
    NET,
    NOM,
    TAR;

    public String value() {
        return name();
    }

    public static WeightTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
