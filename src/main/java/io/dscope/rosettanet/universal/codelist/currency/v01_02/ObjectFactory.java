
package io.dscope.rosettanet.universal.codelist.currency.v01_02;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.codelist.currency.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.codelist.currency.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CurrencyType }
     * 
     */
    public CurrencyType createCurrencyType() {
        return new CurrencyType();
    }

    /**
     * Create an instance of {@link CurrencyA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CurrencyA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:Currency:xsd:codelist:01.02", name = "CurrencyA")
    public CurrencyA createCurrencyA(Object value) {
        return new CurrencyA(value);
    }

    /**
     * Create an instance of {@link Currency }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Currency }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:Currency:xsd:codelist:01.02", name = "Currency", substitutionHeadNamespace = "urn:rosettanet:specification:universal:Currency:xsd:codelist:01.02", substitutionHeadName = "CurrencyA")
    public Currency createCurrency(CurrencyType value) {
        return new Currency(value);
    }

}