
package io.dscope.rosettanet.domain.shared.codelist.packagetypecode.v01_01;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.codelist.packagetypecode.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.codelist.packagetypecode.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PackageTypeCodeType }
     * 
     */
    public PackageTypeCodeType createPackageTypeCodeType() {
        return new PackageTypeCodeType();
    }

    /**
     * Create an instance of {@link PackageTypeCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PackageTypeCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01", name = "PackageTypeCodeA")
    public PackageTypeCodeA createPackageTypeCodeA(Object value) {
        return new PackageTypeCodeA(value);
    }

    /**
     * Create an instance of {@link PackageTypeCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PackageTypeCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01", name = "PackageTypeCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01", substitutionHeadName = "PackageTypeCodeA")
    public PackageTypeCode createPackageTypeCode(PackageTypeCodeType value) {
        return new PackageTypeCode(value);
    }

}