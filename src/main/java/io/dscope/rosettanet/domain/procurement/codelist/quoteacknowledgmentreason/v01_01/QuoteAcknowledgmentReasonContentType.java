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

package io.dscope.rosettanet.domain.procurement.codelist.quoteacknowledgmentreason.v01_01;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteAcknowledgmentReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QuoteAcknowledgmentReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="IPR"/&gt;
 *     &lt;enumeration value="ISL"/&gt;
 *     &lt;enumeration value="ISN"/&gt;
 *     &lt;enumeration value="DSN"/&gt;
 *     &lt;enumeration value="ISV"/&gt;
 *     &lt;enumeration value="IDT"/&gt;
 *     &lt;enumeration value="ICN"/&gt;
 *     &lt;enumeration value="ICO"/&gt;
 *     &lt;enumeration value="IBL"/&gt;
 *     &lt;enumeration value="IPO"/&gt;
 *     &lt;enumeration value="IQN"/&gt;
 *     &lt;enumeration value="IPC"/&gt;
 *     &lt;enumeration value="IQT"/&gt;
 *     &lt;enumeration value="ISA"/&gt;
 *     &lt;enumeration value="ICW"/&gt;
 *     &lt;enumeration value="IPL"/&gt;
 *     &lt;enumeration value="OTR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuoteAcknowledgmentReasonContentType")
@XmlEnum
public enum QuoteAcknowledgmentReasonContentType {

    IPR,
    ISL,
    ISN,
    DSN,
    ISV,
    IDT,
    ICN,
    ICO,
    IBL,
    IPO,
    IQN,
    IPC,
    IQT,
    ISA,
    ICW,
    IPL,
    OTR;

    public String value() {
        return name();
    }

    public static QuoteAcknowledgmentReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
