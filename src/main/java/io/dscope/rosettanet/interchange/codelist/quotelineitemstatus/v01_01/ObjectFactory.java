
package io.dscope.rosettanet.interchange.codelist.quotelineitemstatus.v01_01;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.quotelineitemstatus.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.quotelineitemstatus.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuoteLineItemStatusType }
     * 
     */
    public QuoteLineItemStatusType createQuoteLineItemStatusType() {
        return new QuoteLineItemStatusType();
    }

    /**
     * Create an instance of {@link QuoteLineItemStatusA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuoteLineItemStatusA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:QuoteLineItemStatus:xsd:codelist:01.01", name = "QuoteLineItemStatusA")
    public QuoteLineItemStatusA createQuoteLineItemStatusA(Object value) {
        return new QuoteLineItemStatusA(value);
    }

    /**
     * Create an instance of {@link QuoteLineItemStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuoteLineItemStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:QuoteLineItemStatus:xsd:codelist:01.01", name = "QuoteLineItemStatus", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:QuoteLineItemStatus:xsd:codelist:01.01", substitutionHeadName = "QuoteLineItemStatusA")
    public QuoteLineItemStatus createQuoteLineItemStatus(QuoteLineItemStatusType value) {
        return new QuoteLineItemStatus(value);
    }

}