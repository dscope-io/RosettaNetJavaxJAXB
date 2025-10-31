
package io.dscope.rosettanet.domain.service.codelist.operatingsystem.v01_02;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.codelist.operatingsystem.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.codelist.operatingsystem.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperatingSystemType }
     * 
     */
    public OperatingSystemType createOperatingSystemType() {
        return new OperatingSystemType();
    }

    /**
     * Create an instance of {@link OperatingSystemA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link OperatingSystemA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:OperatingSystem:xsd:codelist:01.02", name = "OperatingSystemA")
    public OperatingSystemA createOperatingSystemA(Object value) {
        return new OperatingSystemA(value);
    }

    /**
     * Create an instance of {@link OperatingSystem }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link OperatingSystem }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:OperatingSystem:xsd:codelist:01.02", name = "OperatingSystem", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Service:OperatingSystem:xsd:codelist:01.02", substitutionHeadName = "OperatingSystemA")
    public OperatingSystem createOperatingSystem(OperatingSystemType value) {
        return new OperatingSystem(value);
    }

}
