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

package io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QuoteTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BFB"/&gt;
 *     &lt;enumeration value="BFC"/&gt;
 *     &lt;enumeration value="BQU"/&gt;
 *     &lt;enumeration value="BQV"/&gt;
 *     &lt;enumeration value="BQW"/&gt;
 *     &lt;enumeration value="CQU"/&gt;
 *     &lt;enumeration value="CQV"/&gt;
 *     &lt;enumeration value="QWR"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="REW"/&gt;
 *     &lt;enumeration value="RFB"/&gt;
 *     &lt;enumeration value="SER"/&gt;
 *     &lt;enumeration value="SFS"/&gt;
 *     &lt;enumeration value="REN"/&gt;
 *     &lt;enumeration value="UPG"/&gt;
 *     &lt;enumeration value="DWG"/&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="CHG"/&gt;
 *     &lt;enumeration value="NCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuoteTypeContentType")
@XmlEnum
public enum QuoteTypeContentType {

    BFB,
    BFC,
    BQU,
    BQV,
    BQW,
    CQU,
    CQV,
    QWR,
    REP,
    REW,
    RFB,
    SER,
    SFS,
    REN,
    UPG,
    DWG,
    ADD,
    CHG,
    NCO;

    public String value() {
        return name();
    }

    public static QuoteTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
