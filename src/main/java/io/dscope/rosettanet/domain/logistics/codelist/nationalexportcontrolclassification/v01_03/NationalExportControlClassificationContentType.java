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

package io.dscope.rosettanet.domain.logistics.codelist.nationalexportcontrolclassification.v01_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NationalExportControlClassificationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NationalExportControlClassificationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CLE"/&gt;
 *     &lt;enumeration value="CUC"/&gt;
 *     &lt;enumeration value="DET"/&gt;
 *     &lt;enumeration value="DOR"/&gt;
 *     &lt;enumeration value="DRC"/&gt;
 *     &lt;enumeration value="FUM"/&gt;
 *     &lt;enumeration value="IAC"/&gt;
 *     &lt;enumeration value="IAR"/&gt;
 *     &lt;enumeration value="INS"/&gt;
 *     &lt;enumeration value="LWI"/&gt;
 *     &lt;enumeration value="NCP"/&gt;
 *     &lt;enumeration value="SAC"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SEC"/&gt;
 *     &lt;enumeration value="SER"/&gt;
 *     &lt;enumeration value="STR"/&gt;
 *     &lt;enumeration value="TAC"/&gt;
 *     &lt;enumeration value="TAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NationalExportControlClassificationContentType")
@XmlEnum
public enum NationalExportControlClassificationContentType {

    CLE,
    CUC,
    DET,
    DOR,
    DRC,
    FUM,
    IAC,
    IAR,
    INS,
    LWI,
    NCP,
    SAC,
    SAR,
    SCR,
    SEC,
    SER,
    STR,
    TAC,
    TAR;

    public String value() {
        return name();
    }

    public static NationalExportControlClassificationContentType fromValue(String v) {
        return valueOf(v);
    }

}
