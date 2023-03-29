
package io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationstatus.v01_03;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationstatus.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationstatus.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShippingOrderCancellationStatusType }
     * 
     */
    public ShippingOrderCancellationStatusType createShippingOrderCancellationStatusType() {
        return new ShippingOrderCancellationStatusType();
    }

    /**
     * Create an instance of {@link ShippingOrderCancellationStatusA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingOrderCancellationStatusA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationStatus:xsd:codelist:01.03", name = "ShippingOrderCancellationStatusA")
    public ShippingOrderCancellationStatusA createShippingOrderCancellationStatusA(Object value) {
        return new ShippingOrderCancellationStatusA(value);
    }

    /**
     * Create an instance of {@link ShippingOrderCancellationStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingOrderCancellationStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationStatus:xsd:codelist:01.03", name = "ShippingOrderCancellationStatus", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationStatus:xsd:codelist:01.03", substitutionHeadName = "ShippingOrderCancellationStatusA")
    public ShippingOrderCancellationStatus createShippingOrderCancellationStatus(ShippingOrderCancellationStatusType value) {
        return new ShippingOrderCancellationStatus(value);
    }

}