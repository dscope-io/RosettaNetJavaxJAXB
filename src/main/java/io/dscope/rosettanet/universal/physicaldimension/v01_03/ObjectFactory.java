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

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.physicaldimension.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.physicaldimension.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LinearType }
     * 
     */
    public LinearType createLinearType() {
        return new LinearType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link VolumeType }
     * 
     */
    public VolumeType createVolumeType() {
        return new VolumeType();
    }

    /**
     * Create an instance of {@link WeightType }
     * 
     */
    public WeightType createWeightType() {
        return new WeightType();
    }

    /**
     * Create an instance of {@link Linear }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Linear }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.03", name = "Linear")
    public Linear createLinear(LinearType value) {
        return new Linear(value);
    }

    /**
     * Create an instance of {@link Measure }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Measure }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.03", name = "Measure")
    public Measure createMeasure(MeasureType value) {
        return new Measure(value);
    }

    /**
     * Create an instance of {@link Volume }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Volume }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.03", name = "Volume")
    public Volume createVolume(VolumeType value) {
        return new Volume(value);
    }

    /**
     * Create an instance of {@link Weight }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Weight }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.03", name = "Weight")
    public Weight createWeight(WeightType value) {
        return new Weight(value);
    }

}
