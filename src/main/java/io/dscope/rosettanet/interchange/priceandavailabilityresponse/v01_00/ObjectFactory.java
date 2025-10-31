
package io.dscope.rosettanet.interchange.priceandavailabilityresponse.v01_00;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.priceandavailabilityresponse.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.priceandavailabilityresponse.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityResponseType }
     * 
     */
    public PriceAndAvailabilityResponseType createPriceAndAvailabilityResponseType() {
        return new PriceAndAvailabilityResponseType();
    }

    /**
     * Create an instance of {@link AdditionalProductPriceAndAvailabilityLineItemType }
     * 
     */
    public AdditionalProductPriceAndAvailabilityLineItemType createAdditionalProductPriceAndAvailabilityLineItemType() {
        return new AdditionalProductPriceAndAvailabilityLineItemType();
    }

    /**
     * Create an instance of {@link ProductPriceAndAvailabilityType }
     * 
     */
    public ProductPriceAndAvailabilityType createProductPriceAndAvailabilityType() {
        return new ProductPriceAndAvailabilityType();
    }

    /**
     * Create an instance of {@link ProductPriceAndAvailabilityLineItemType }
     * 
     */
    public ProductPriceAndAvailabilityLineItemType createProductPriceAndAvailabilityLineItemType() {
        return new ProductPriceAndAvailabilityLineItemType();
    }

    /**
     * Create an instance of {@link PriceAndAvailabilityResponse }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PriceAndAvailabilityResponse }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:PriceAndAvailabilityResponseNotification:xsd:schema:01.00", name = "PriceAndAvailabilityResponse")
    public PriceAndAvailabilityResponse createPriceAndAvailabilityResponse(PriceAndAvailabilityResponseType value) {
        return new PriceAndAvailabilityResponse(value);
    }

}
