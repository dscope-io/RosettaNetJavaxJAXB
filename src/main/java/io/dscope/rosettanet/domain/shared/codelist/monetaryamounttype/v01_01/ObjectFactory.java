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

package io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_01;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_01 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MonetaryAmountTypeType }
     * 
     */
    public MonetaryAmountTypeType createMonetaryAmountTypeType() {
        return new MonetaryAmountTypeType();
    }

    /**
     * Create an instance of {@link MonetaryAmountTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MonetaryAmountTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.01", name = "MonetaryAmountTypeA")
    public MonetaryAmountTypeA createMonetaryAmountTypeA(Object value) {
        return new MonetaryAmountTypeA(value);
    }

    /**
     * Create an instance of {@link MonetaryAmountType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MonetaryAmountType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.01", name = "MonetaryAmountType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.01", substitutionHeadName = "MonetaryAmountTypeA")
    public MonetaryAmountType createMonetaryAmountType(MonetaryAmountTypeType value) {
        return new MonetaryAmountType(value);
    }

}
