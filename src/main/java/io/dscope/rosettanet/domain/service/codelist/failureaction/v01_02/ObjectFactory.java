
package io.dscope.rosettanet.domain.service.codelist.failureaction.v01_02;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.codelist.failureaction.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.codelist.failureaction.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FailureActionType }
     * 
     */
    public FailureActionType createFailureActionType() {
        return new FailureActionType();
    }

    /**
     * Create an instance of {@link FailureActionA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FailureActionA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:FailureAction:xsd:codelist:01.02", name = "FailureActionA")
    public FailureActionA createFailureActionA(Object value) {
        return new FailureActionA(value);
    }

    /**
     * Create an instance of {@link FailureAction }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FailureAction }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:FailureAction:xsd:codelist:01.02", name = "FailureAction", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Service:FailureAction:xsd:codelist:01.02", substitutionHeadName = "FailureActionA")
    public FailureAction createFailureAction(FailureActionType value) {
        return new FailureAction(value);
    }

}
