
package io.dscope.rosettanet.domain.logistics.codelist.responsecode.v01_00;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.responsecode.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.responsecode.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseCodeType }
     * 
     */
    public ResponseCodeType createResponseCodeType() {
        return new ResponseCodeType();
    }

    /**
     * Create an instance of {@link ResponseCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ResponseCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ResponseCode:xsd:codelist:01.00", name = "ResponseCodeA")
    public ResponseCodeA createResponseCodeA(Object value) {
        return new ResponseCodeA(value);
    }

    /**
     * Create an instance of {@link ResponseCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ResponseCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ResponseCode:xsd:codelist:01.00", name = "ResponseCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ResponseCode:xsd:codelist:01.00", substitutionHeadName = "ResponseCodeA")
    public ResponseCode createResponseCode(ResponseCodeType value) {
        return new ResponseCode(value);
    }

}
