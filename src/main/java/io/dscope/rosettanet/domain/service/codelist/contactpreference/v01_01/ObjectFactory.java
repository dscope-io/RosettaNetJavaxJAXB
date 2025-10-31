
package io.dscope.rosettanet.domain.service.codelist.contactpreference.v01_01;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.codelist.contactpreference.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.codelist.contactpreference.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactPreferenceType }
     * 
     */
    public ContactPreferenceType createContactPreferenceType() {
        return new ContactPreferenceType();
    }

    /**
     * Create an instance of {@link ContactPreferenceA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ContactPreferenceA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:ContactPreference:xsd:codelist:01.01", name = "ContactPreferenceA")
    public ContactPreferenceA createContactPreferenceA(Object value) {
        return new ContactPreferenceA(value);
    }

    /**
     * Create an instance of {@link ContactPreference }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ContactPreference }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:ContactPreference:xsd:codelist:01.01", name = "ContactPreference", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Service:ContactPreference:xsd:codelist:01.01", substitutionHeadName = "ContactPreferenceA")
    public ContactPreference createContactPreference(ContactPreferenceType value) {
        return new ContactPreference(value);
    }

}
