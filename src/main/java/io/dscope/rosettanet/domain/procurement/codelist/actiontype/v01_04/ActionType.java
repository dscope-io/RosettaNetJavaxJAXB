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

package io.dscope.rosettanet.domain.procurement.codelist.actiontype.v01_04;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ActionType
    extends JAXBElement<ActionTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ActionType:xsd:codelist:01.04", "ActionType");

    public ActionType(ActionTypeType value) {
        super(NAME, ((Class) ActionTypeType.class), null, value);
    }

    public ActionType() {
        super(NAME, ((Class) ActionTypeType.class), null, null);
    }

}
