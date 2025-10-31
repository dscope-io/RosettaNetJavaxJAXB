
package io.dscope.rosettanet.domain.logistics.codelist.urgencycode.v01_00;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.urgencycode.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.urgencycode.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UrgencyCodeType }
     * 
     */
    public UrgencyCodeType createUrgencyCodeType() {
        return new UrgencyCodeType();
    }

    /**
     * Create an instance of {@link UrgencyCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link UrgencyCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:UrgencyCode:xsd:codelist:01.00", name = "UrgencyCodeA")
    public UrgencyCodeA createUrgencyCodeA(Object value) {
        return new UrgencyCodeA(value);
    }

    /**
     * Create an instance of {@link UrgencyCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link UrgencyCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:UrgencyCode:xsd:codelist:01.00", name = "UrgencyCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:UrgencyCode:xsd:codelist:01.00", substitutionHeadName = "UrgencyCodeA")
    public UrgencyCode createUrgencyCode(UrgencyCodeType value) {
        return new UrgencyCode(value);
    }

}
