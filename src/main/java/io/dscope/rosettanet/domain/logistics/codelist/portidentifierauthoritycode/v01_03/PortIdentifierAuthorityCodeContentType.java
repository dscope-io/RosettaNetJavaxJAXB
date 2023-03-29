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

package io.dscope.rosettanet.domain.logistics.codelist.portidentifierauthoritycode.v01_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortIdentifierAuthorityCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PortIdentifierAuthorityCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="IATA"/&gt;
 *     &lt;enumeration value="ICAO"/&gt;
 *     &lt;enumeration value="IMO"/&gt;
 *     &lt;enumeration value="ISO"/&gt;
 *     &lt;enumeration value="NVOCC"/&gt;
 *     &lt;enumeration value="VOCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PortIdentifierAuthorityCodeContentType")
@XmlEnum
public enum PortIdentifierAuthorityCodeContentType {

    IATA,
    ICAO,
    IMO,
    ISO,
    NVOCC,
    VOCC;

    public String value() {
        return name();
    }

    public static PortIdentifierAuthorityCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
