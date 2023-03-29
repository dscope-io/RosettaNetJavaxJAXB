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

package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DayOfMonth
    extends JAXBElement<BigInteger>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", "DayOfMonth");

    public DayOfMonth(BigInteger value) {
        super(NAME, ((Class) BigInteger.class), null, value);
    }

    public DayOfMonth() {
        super(NAME, ((Class) BigInteger.class), null, null);
    }

}
