
package io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_04;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_04 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PricingTypeCodeType }
     * 
     */
    public PricingTypeCodeType createPricingTypeCodeType() {
        return new PricingTypeCodeType();
    }

    /**
     * Create an instance of {@link PricingTypeCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PricingTypeCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04", name = "PricingTypeCodeA")
    public PricingTypeCodeA createPricingTypeCodeA(Object value) {
        return new PricingTypeCodeA(value);
    }

    /**
     * Create an instance of {@link PricingTypeCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PricingTypeCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04", name = "PricingTypeCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04", substitutionHeadName = "PricingTypeCodeA")
    public PricingTypeCode createPricingTypeCode(PricingTypeCodeType value) {
        return new PricingTypeCode(value);
    }

}