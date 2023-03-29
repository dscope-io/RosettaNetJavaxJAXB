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

package io.dscope.rosettanet.interchange.purchaseorderrequest.v02_05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PurchaseOrderRequest", namespace = "urn:rosettanet:specification:interchange:PurchaseOrderRequest:xsd:schema:02.05")
public class PurchaseOrderRequest
    extends JAXBElement<PurchaseOrderRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderRequest:xsd:schema:02.05", "PurchaseOrderRequest");

    public PurchaseOrderRequest(PurchaseOrderRequestType value) {
        super(NAME, ((Class) PurchaseOrderRequestType.class), null, value);
    }

    public PurchaseOrderRequest() {
        super(NAME, ((Class) PurchaseOrderRequestType.class), null, null);
    }

}
