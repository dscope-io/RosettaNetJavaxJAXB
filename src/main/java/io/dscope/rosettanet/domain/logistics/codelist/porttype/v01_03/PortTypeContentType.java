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

package io.dscope.rosettanet.domain.logistics.codelist.porttype.v01_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PortTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="POC"/&gt;
 *     &lt;enumeration value="PON"/&gt;
 *     &lt;enumeration value="POE"/&gt;
 *     &lt;enumeration value="POI"/&gt;
 *     &lt;enumeration value="POL"/&gt;
 *     &lt;enumeration value="POO"/&gt;
 *     &lt;enumeration value="POH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PortTypeContentType")
@XmlEnum
public enum PortTypeContentType {

    POC,
    PON,
    POE,
    POI,
    POL,
    POO,
    POH;

    public String value() {
        return name();
    }

    public static PortTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
