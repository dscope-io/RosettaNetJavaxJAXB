
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderchangetype.v01_02;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.purchaseorderchangetype.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.purchaseorderchangetype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseOrderChangeTypeType }
     * 
     */
    public PurchaseOrderChangeTypeType createPurchaseOrderChangeTypeType() {
        return new PurchaseOrderChangeTypeType();
    }

    /**
     * Create an instance of {@link PurchaseOrderChangeTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderChangeTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.02", name = "PurchaseOrderChangeTypeA")
    public PurchaseOrderChangeTypeA createPurchaseOrderChangeTypeA(Object value) {
        return new PurchaseOrderChangeTypeA(value);
    }

    /**
     * Create an instance of {@link PurchaseOrderChangeType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderChangeType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.02", name = "PurchaseOrderChangeType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.02", substitutionHeadName = "PurchaseOrderChangeTypeA")
    public PurchaseOrderChangeType createPurchaseOrderChangeType(PurchaseOrderChangeTypeType value) {
        return new PurchaseOrderChangeType(value);
    }

}
