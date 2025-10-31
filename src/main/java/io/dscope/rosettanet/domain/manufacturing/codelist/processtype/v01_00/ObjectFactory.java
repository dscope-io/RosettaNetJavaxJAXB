
package io.dscope.rosettanet.domain.manufacturing.codelist.processtype.v01_00;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.processtype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.processtype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessTypeType }
     * 
     */
    public ProcessTypeType createProcessTypeType() {
        return new ProcessTypeType();
    }

    /**
     * Create an instance of {@link ProcessTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProcessTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:1.0", name = "ProcessTypeA")
    public ProcessTypeA createProcessTypeA(Object value) {
        return new ProcessTypeA(value);
    }

    /**
     * Create an instance of {@link ProcessType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProcessType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:1.0", name = "ProcessType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:1.0", substitutionHeadName = "ProcessTypeA")
    public ProcessType createProcessType(ProcessTypeType value) {
        return new ProcessType(value);
    }

}
