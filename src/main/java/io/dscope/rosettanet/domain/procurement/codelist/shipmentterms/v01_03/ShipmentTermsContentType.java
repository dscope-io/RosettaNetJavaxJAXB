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

package io.dscope.rosettanet.domain.procurement.codelist.shipmentterms.v01_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentTermsContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentTermsContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADC"/&gt;
 *     &lt;enumeration value="ADP"/&gt;
 *     &lt;enumeration value="CAA"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CFC"/&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="CIF"/&gt;
 *     &lt;enumeration value="CIP"/&gt;
 *     &lt;enumeration value="COL"/&gt;
 *     &lt;enumeration value="CPT"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="CUP"/&gt;
 *     &lt;enumeration value="DAF"/&gt;
 *     &lt;enumeration value="DDP"/&gt;
 *     &lt;enumeration value="DDU"/&gt;
 *     &lt;enumeration value="DEQ"/&gt;
 *     &lt;enumeration value="DES"/&gt;
 *     &lt;enumeration value="EXW"/&gt;
 *     &lt;enumeration value="FAS"/&gt;
 *     &lt;enumeration value="FCA"/&gt;
 *     &lt;enumeration value="FOB"/&gt;
 *     &lt;enumeration value="LEC"/&gt;
 *     &lt;enumeration value="NOS"/&gt;
 *     &lt;enumeration value="PAE"/&gt;
 *     &lt;enumeration value="PCC"/&gt;
 *     &lt;enumeration value="PIU"/&gt;
 *     &lt;enumeration value="PRE"/&gt;
 *     &lt;enumeration value="PRS"/&gt;
 *     &lt;enumeration value="RFC"/&gt;
 *     &lt;enumeration value="RFF"/&gt;
 *     &lt;enumeration value="RFS"/&gt;
 *     &lt;enumeration value="TPP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentTermsContentType")
@XmlEnum
public enum ShipmentTermsContentType {

    ADC,
    ADP,
    CAA,
    CAD,
    CFC,
    CFR,
    CIF,
    CIP,
    COL,
    CPT,
    CRC,
    CUP,
    DAF,
    DDP,
    DDU,
    DEQ,
    DES,
    EXW,
    FAS,
    FCA,
    FOB,
    LEC,
    NOS,
    PAE,
    PCC,
    PIU,
    PRE,
    PRS,
    RFC,
    RFF,
    RFS,
    TPP;

    public String value() {
        return name();
    }

    public static ShipmentTermsContentType fromValue(String v) {
        return valueOf(v);
    }

}
