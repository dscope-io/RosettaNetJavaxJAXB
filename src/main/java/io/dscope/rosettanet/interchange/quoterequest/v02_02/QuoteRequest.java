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

package io.dscope.rosettanet.interchange.quoterequest.v02_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuoteRequest
    extends JAXBElement<QuoteRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:02.02", "QuoteRequest");

    public QuoteRequest(QuoteRequestType value) {
        super(NAME, ((Class) QuoteRequestType.class), null, value);
    }

    public QuoteRequest() {
        super(NAME, ((Class) QuoteRequestType.class), null, null);
    }

}
