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

package io.dscope.rosettanet.domain.logistics.codelist.shippingorderstatus.v01_01;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingOrderStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShippingOrderStatus:xsd:codelist:01.01", "ShippingOrderStatusA");

    public ShippingOrderStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShippingOrderStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
