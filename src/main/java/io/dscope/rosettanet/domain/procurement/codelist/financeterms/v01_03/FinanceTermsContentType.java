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

package io.dscope.rosettanet.domain.procurement.codelist.financeterms.v01_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinanceTermsContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FinanceTermsContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BDO"/&gt;
 *     &lt;enumeration value="BNK"/&gt;
 *     &lt;enumeration value="CDC"/&gt;
 *     &lt;enumeration value="CSM"/&gt;
 *     &lt;enumeration value="EPS"/&gt;
 *     &lt;enumeration value="IKP"/&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="LSA"/&gt;
 *     &lt;enumeration value="MDT"/&gt;
 *     &lt;enumeration value="NMI"/&gt;
 *     &lt;enumeration value="PBC"/&gt;
 *     &lt;enumeration value="PCC"/&gt;
 *     &lt;enumeration value="PPC"/&gt;
 *     &lt;enumeration value="PPW"/&gt;
 *     &lt;enumeration value="PVC"/&gt;
 *     &lt;enumeration value="PVN"/&gt;
 *     &lt;enumeration value="TET"/&gt;
 *     &lt;enumeration value="WRT"/&gt;
 *     &lt;enumeration value="WVD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FinanceTermsContentType")
@XmlEnum
public enum FinanceTermsContentType {

    BDO,
    BNK,
    CDC,
    CSM,
    EPS,
    IKP,
    LOC,
    LSA,
    MDT,
    NMI,
    PBC,
    PCC,
    PPC,
    PPW,
    PVC,
    PVN,
    TET,
    WRT,
    WVD;

    public String value() {
        return name();
    }

    public static FinanceTermsContentType fromValue(String v) {
        return valueOf(v);
    }

}
