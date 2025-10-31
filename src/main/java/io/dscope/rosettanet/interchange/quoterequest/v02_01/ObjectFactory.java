
package io.dscope.rosettanet.interchange.quoterequest.v02_01;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.quoterequest.v02_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.quoterequest.v02_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuoteRequestType }
     * 
     */
    public QuoteRequestType createQuoteRequestType() {
        return new QuoteRequestType();
    }

    /**
     * Create an instance of {@link CompetitorReferenceType }
     * 
     */
    public CompetitorReferenceType createCompetitorReferenceType() {
        return new CompetitorReferenceType();
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
     * Create an instance of {@link TransportationScheduleType }
     * 
     */
    public TransportationScheduleType createTransportationScheduleType() {
        return new TransportationScheduleType();
    }

    /**
     * Create an instance of {@link QuoteRequest }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuoteRequest }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:02.01", name = "QuoteRequest")
    public QuoteRequest createQuoteRequest(QuoteRequestType value) {
        return new QuoteRequest(value);
    }

}
