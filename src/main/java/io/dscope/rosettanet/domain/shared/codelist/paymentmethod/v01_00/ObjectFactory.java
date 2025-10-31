
package io.dscope.rosettanet.domain.shared.codelist.paymentmethod.v01_00;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.codelist.paymentmethod.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.codelist.paymentmethod.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentMethodType }
     * 
     */
    public PaymentMethodType createPaymentMethodType() {
        return new PaymentMethodType();
    }

    /**
     * Create an instance of {@link PaymentMethodA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PaymentMethodA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.00", name = "PaymentMethodA")
    public PaymentMethodA createPaymentMethodA(Object value) {
        return new PaymentMethodA(value);
    }

    /**
     * Create an instance of {@link PaymentMethod }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PaymentMethod }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.00", name = "PaymentMethod", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.00", substitutionHeadName = "PaymentMethodA")
    public PaymentMethod createPaymentMethod(PaymentMethodType value) {
        return new PaymentMethod(value);
    }

}
