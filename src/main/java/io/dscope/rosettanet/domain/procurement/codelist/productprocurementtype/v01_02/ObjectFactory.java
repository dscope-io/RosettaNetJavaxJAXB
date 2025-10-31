
package io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_02;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductProcurementTypeType }
     * 
     */
    public ProductProcurementTypeType createProductProcurementTypeType() {
        return new ProductProcurementTypeType();
    }

    /**
     * Create an instance of {@link ProductProcurementTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductProcurementTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.02", name = "ProductProcurementTypeA")
    public ProductProcurementTypeA createProductProcurementTypeA(Object value) {
        return new ProductProcurementTypeA(value);
    }

    /**
     * Create an instance of {@link ProductProcurementType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductProcurementType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.02", name = "ProductProcurementType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.02", substitutionHeadName = "ProductProcurementTypeA")
    public ProductProcurementType createProductProcurementType(ProductProcurementTypeType value) {
        return new ProductProcurementType(value);
    }

}
