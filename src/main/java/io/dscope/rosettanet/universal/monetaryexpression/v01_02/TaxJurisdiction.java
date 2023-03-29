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

package io.dscope.rosettanet.universal.monetaryexpression.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxJurisdiction
    extends JAXBElement<TaxJurisdictionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02", "TaxJurisdiction");

    public TaxJurisdiction(TaxJurisdictionType value) {
        super(NAME, ((Class) TaxJurisdictionType.class), null, value);
    }

    public TaxJurisdiction() {
        super(NAME, ((Class) TaxJurisdictionType.class), null, null);
    }

}
