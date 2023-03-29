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

package io.dscope.rosettanet.universal.datatype.v01_03;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.datatype.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.datatype.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Contact }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Contact }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", name = "Contact")
    public Contact createContact(String value) {
        return new Contact(value);
    }

    /**
     * Create an instance of {@link DUNS }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DUNS }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", name = "DUNS")
    public DUNS createDUNS(String value) {
        return new DUNS(value);
    }

    /**
     * Create an instance of {@link DUNSPlus4 }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DUNSPlus4 }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", name = "DUNSPlus4")
    public DUNSPlus4 createDUNSPlus4(String value) {
        return new DUNSPlus4(value);
    }

    /**
     * Create an instance of {@link GLN }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link GLN }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", name = "GLN")
    public GLN createGLN(String value) {
        return new GLN(value);
    }

    /**
     * Create an instance of {@link GTIN }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link GTIN }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", name = "GTIN")
    public GTIN createGTIN(String value) {
        return new GTIN(value);
    }

    /**
     * Create an instance of {@link Hexadecimal }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Hexadecimal }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", name = "Hexadecimal")
    public Hexadecimal createHexadecimal(String value) {
        return new Hexadecimal(value);
    }

    /**
     * Create an instance of {@link PercentAmount }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PercentAmount }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", name = "PercentAmount")
    public PercentAmount createPercentAmount(BigDecimal value) {
        return new PercentAmount(value);
    }

}
