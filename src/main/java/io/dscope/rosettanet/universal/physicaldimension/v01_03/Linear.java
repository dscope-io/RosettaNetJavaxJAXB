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

package io.dscope.rosettanet.universal.physicaldimension.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Linear
    extends JAXBElement<LinearType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.03", "Linear");

    public Linear(LinearType value) {
        super(NAME, ((Class) LinearType.class), null, value);
    }

    public Linear() {
        super(NAME, ((Class) LinearType.class), null, null);
    }

}
