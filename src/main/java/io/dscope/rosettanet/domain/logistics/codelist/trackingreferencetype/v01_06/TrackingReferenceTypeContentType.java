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

package io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackingReferenceTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TrackingReferenceTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BKN"/&gt;
 *     &lt;enumeration value="BOL"/&gt;
 *     &lt;enumeration value="CIN"/&gt;
 *     &lt;enumeration value="CRN"/&gt;
 *     &lt;enumeration value="FTR"/&gt;
 *     &lt;enumeration value="HAN"/&gt;
 *     &lt;enumeration value="MAB"/&gt;
 *     &lt;enumeration value="OBL"/&gt;
 *     &lt;enumeration value="PON"/&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="PSN"/&gt;
 *     &lt;enumeration value="RFI"/&gt;
 *     &lt;enumeration value="RRN"/&gt;
 *     &lt;enumeration value="SID"/&gt;
 *     &lt;enumeration value="SON"/&gt;
 *     &lt;enumeration value="SRN"/&gt;
 *     &lt;enumeration value="TRN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackingReferenceTypeContentType")
@XmlEnum
public enum TrackingReferenceTypeContentType {

    BKN,
    BOL,
    CIN,
    CRN,
    FTR,
    HAN,
    MAB,
    OBL,
    PON,
    PRO,
    PSN,
    RFI,
    RRN,
    SID,
    SON,
    SRN,
    TRN;

    public String value() {
        return name();
    }

    public static TrackingReferenceTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
