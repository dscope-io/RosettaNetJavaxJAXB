
package io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShippingServiceLevelType }
     * 
     */
    public ShippingServiceLevelType createShippingServiceLevelType() {
        return new ShippingServiceLevelType();
    }

    /**
     * Create an instance of {@link ShippingServiceLevelA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingServiceLevelA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", name = "ShippingServiceLevelA")
    public ShippingServiceLevelA createShippingServiceLevelA(Object value) {
        return new ShippingServiceLevelA(value);
    }

    /**
     * Create an instance of {@link ShippingServiceLevel }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingServiceLevel }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", name = "ShippingServiceLevel", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", substitutionHeadName = "ShippingServiceLevelA")
    public ShippingServiceLevel createShippingServiceLevel(ShippingServiceLevelType value) {
        return new ShippingServiceLevel(value);
    }

}