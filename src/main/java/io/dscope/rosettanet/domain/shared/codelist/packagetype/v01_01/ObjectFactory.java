
package io.dscope.rosettanet.domain.shared.codelist.packagetype.v01_01;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.codelist.packagetype.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.codelist.packagetype.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PackageTypeType }
     * 
     */
    public PackageTypeType createPackageTypeType() {
        return new PackageTypeType();
    }

    /**
     * Create an instance of {@link PackageTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PackageTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01", name = "PackageTypeA")
    public PackageTypeA createPackageTypeA(Object value) {
        return new PackageTypeA(value);
    }

    /**
     * Create an instance of {@link PackageType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PackageType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01", name = "PackageType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01", substitutionHeadName = "PackageTypeA")
    public PackageType createPackageType(PackageTypeType value) {
        return new PackageType(value);
    }

}