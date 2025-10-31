
package io.dscope.rosettanet.interchange.codelist.documentissuancetype.v02_00;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.documentissuancetype.v02_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.documentissuancetype.v02_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentIssuanceTypeType }
     * 
     */
    public DocumentIssuanceTypeType createDocumentIssuanceTypeType() {
        return new DocumentIssuanceTypeType();
    }

    /**
     * Create an instance of {@link DocumentIssuanceTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DocumentIssuanceTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:DocumentIssuanceType:xsd:codelist:02.00", name = "DocumentIssuanceTypeA")
    public DocumentIssuanceTypeA createDocumentIssuanceTypeA(Object value) {
        return new DocumentIssuanceTypeA(value);
    }

    /**
     * Create an instance of {@link DocumentIssuanceType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DocumentIssuanceType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:DocumentIssuanceType:xsd:codelist:02.00", name = "DocumentIssuanceType", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:DocumentIssuanceType:xsd:codelist:02.00", substitutionHeadName = "DocumentIssuanceTypeA")
    public DocumentIssuanceType createDocumentIssuanceType(DocumentIssuanceTypeType value) {
        return new DocumentIssuanceType(value);
    }

}
