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

package io.dscope.rosettanet.interchange.quoteconfirmation.v02_02;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.quoteconfirmation.v02_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.quoteconfirmation.v02_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuoteConfirmationType }
     * 
     */
    public QuoteConfirmationType createQuoteConfirmationType() {
        return new QuoteConfirmationType();
    }

    /**
     * Create an instance of {@link CompetitorReferenceType }
     * 
     */
    public CompetitorReferenceType createCompetitorReferenceType() {
        return new CompetitorReferenceType();
    }

    /**
     * Create an instance of {@link OrderLeadTimeType }
     * 
     */
    public OrderLeadTimeType createOrderLeadTimeType() {
        return new OrderLeadTimeType();
    }

    /**
     * Create an instance of {@link ProductLineItemType }
     * 
     */
    public ProductLineItemType createProductLineItemType() {
        return new ProductLineItemType();
    }

    /**
     * Create an instance of {@link QuantityType }
     * 
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link QuoteType }
     * 
     */
    public QuoteType createQuoteType() {
        return new QuoteType();
    }

    /**
     * Create an instance of {@link QuoteCustomerInformationType }
     * 
     */
    public QuoteCustomerInformationType createQuoteCustomerInformationType() {
        return new QuoteCustomerInformationType();
    }

    /**
     * Create an instance of {@link QuoteLineItemType }
     * 
     */
    public QuoteLineItemType createQuoteLineItemType() {
        return new QuoteLineItemType();
    }

    /**
     * Create an instance of {@link QuoteQuantityType }
     * 
     */
    public QuoteQuantityType createQuoteQuantityType() {
        return new QuoteQuantityType();
    }

    /**
     * Create an instance of {@link RequoteLineStatusType }
     * 
     */
    public RequoteLineStatusType createRequoteLineStatusType() {
        return new RequoteLineStatusType();
    }

    /**
     * Create an instance of {@link ServiceLineItemType }
     * 
     */
    public ServiceLineItemType createServiceLineItemType() {
        return new ServiceLineItemType();
    }

    /**
     * Create an instance of {@link ServiceLineItemByOptionType }
     * 
     */
    public ServiceLineItemByOptionType createServiceLineItemByOptionType() {
        return new ServiceLineItemByOptionType();
    }

    /**
     * Create an instance of {@link TermsAndConditionsType }
     * 
     */
    public TermsAndConditionsType createTermsAndConditionsType() {
        return new TermsAndConditionsType();
    }

    /**
     * Create an instance of {@link TransportationScheduleType }
     * 
     */
    public TransportationScheduleType createTransportationScheduleType() {
        return new TransportationScheduleType();
    }

    /**
     * Create an instance of {@link QuoteConfirmation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuoteConfirmation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.02", name = "QuoteConfirmation")
    public QuoteConfirmation createQuoteConfirmation(QuoteConfirmationType value) {
        return new QuoteConfirmation(value);
    }

}
