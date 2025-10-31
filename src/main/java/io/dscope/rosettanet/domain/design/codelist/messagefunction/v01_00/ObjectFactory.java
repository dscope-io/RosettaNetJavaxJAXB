
package io.dscope.rosettanet.domain.design.codelist.messagefunction.v01_00;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.design.codelist.messagefunction.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.design.codelist.messagefunction.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageFunctionType }
     * 
     */
    public MessageFunctionType createMessageFunctionType() {
        return new MessageFunctionType();
    }

    /**
     * Create an instance of {@link MessageFunctionA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MessageFunctionA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:MessageFunction:xsd:codelist:01.00", name = "MessageFunctionA")
    public MessageFunctionA createMessageFunctionA(Object value) {
        return new MessageFunctionA(value);
    }

    /**
     * Create an instance of {@link MessageFunction }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MessageFunction }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:MessageFunction:xsd:codelist:01.00", name = "MessageFunction", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Design:MessageFunction:xsd:codelist:01.00", substitutionHeadName = "MessageFunctionA")
    public MessageFunction createMessageFunction(MessageFunctionType value) {
        return new MessageFunction(value);
    }

}
