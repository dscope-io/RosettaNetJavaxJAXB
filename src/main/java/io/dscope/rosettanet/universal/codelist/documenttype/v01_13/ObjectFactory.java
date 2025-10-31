
package io.dscope.rosettanet.universal.codelist.documenttype.v01_13;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.codelist.documenttype.v01_13 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.codelist.documenttype.v01_13
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentTypeType }
     * 
     */
    public DocumentTypeType createDocumentTypeType() {
        return new DocumentTypeType();
    }

    /**
     * Create an instance of {@link DocumentTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DocumentTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.13", name = "DocumentTypeA")
    public DocumentTypeA createDocumentTypeA(Object value) {
        return new DocumentTypeA(value);
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DocumentType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.13", name = "DocumentType", substitutionHeadNamespace = "urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.13", substitutionHeadName = "DocumentTypeA")
    public DocumentType createDocumentType(DocumentTypeType value) {
        return new DocumentType(value);
    }

}
