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

package io.dscope.rosettanet.domain.procurement.codelist.notificationtype.v01_04;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NotificationTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CAC"/&gt;
 *     &lt;enumeration value="DAC"/&gt;
 *     &lt;enumeration value="IAC"/&gt;
 *     &lt;enumeration value="OAC"/&gt;
 *     &lt;enumeration value="PAC"/&gt;
 *     &lt;enumeration value="PSU"/&gt;
 *     &lt;enumeration value="SAC"/&gt;
 *     &lt;enumeration value="SCC"/&gt;
 *     &lt;enumeration value="SCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationTypeContentType")
@XmlEnum
public enum NotificationTypeContentType {

    CAC,
    DAC,
    IAC,
    OAC,
    PAC,
    PSU,
    SAC,
    SCC,
    SCO;

    public String value() {
        return name();
    }

    public static NotificationTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
