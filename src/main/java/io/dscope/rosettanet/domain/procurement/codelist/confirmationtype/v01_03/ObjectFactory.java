
package io.dscope.rosettanet.domain.procurement.codelist.confirmationtype.v01_03;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.confirmationtype.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.confirmationtype.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfirmationTypeType }
     * 
     */
    public ConfirmationTypeType createConfirmationTypeType() {
        return new ConfirmationTypeType();
    }

    /**
     * Create an instance of {@link ConfirmationTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ConfirmationTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ConfirmationType:xsd:codelist:01.03", name = "ConfirmationTypeA")
    public ConfirmationTypeA createConfirmationTypeA(Object value) {
        return new ConfirmationTypeA(value);
    }

    /**
     * Create an instance of {@link ConfirmationType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ConfirmationType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ConfirmationType:xsd:codelist:01.03", name = "ConfirmationType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ConfirmationType:xsd:codelist:01.03", substitutionHeadName = "ConfirmationTypeA")
    public ConfirmationType createConfirmationType(ConfirmationTypeType value) {
        return new ConfirmationType(value);
    }

}
