
package io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WarrantyTypeType }
     * 
     */
    public WarrantyTypeType createWarrantyTypeType() {
        return new WarrantyTypeType();
    }

    /**
     * Create an instance of {@link WarrantyTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WarrantyTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01", name = "WarrantyTypeA")
    public WarrantyTypeA createWarrantyTypeA(Object value) {
        return new WarrantyTypeA(value);
    }

    /**
     * Create an instance of {@link WarrantyType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WarrantyType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01", name = "WarrantyType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01", substitutionHeadName = "WarrantyTypeA")
    public WarrantyType createWarrantyType(WarrantyTypeType value) {
        return new WarrantyType(value);
    }

}
