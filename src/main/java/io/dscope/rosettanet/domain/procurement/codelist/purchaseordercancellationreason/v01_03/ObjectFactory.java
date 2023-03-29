
package io.dscope.rosettanet.domain.procurement.codelist.purchaseordercancellationreason.v01_03;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.purchaseordercancellationreason.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.purchaseordercancellationreason.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseOrderCancellationReasonType }
     * 
     */
    public PurchaseOrderCancellationReasonType createPurchaseOrderCancellationReasonType() {
        return new PurchaseOrderCancellationReasonType();
    }

    /**
     * Create an instance of {@link PurchaseOrderCancellationReasonA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderCancellationReasonA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderCancellationReason:xsd:codelist:01.03", name = "PurchaseOrderCancellationReasonA")
    public PurchaseOrderCancellationReasonA createPurchaseOrderCancellationReasonA(Object value) {
        return new PurchaseOrderCancellationReasonA(value);
    }

    /**
     * Create an instance of {@link PurchaseOrderCancellationReason }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderCancellationReason }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderCancellationReason:xsd:codelist:01.03", name = "PurchaseOrderCancellationReason", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderCancellationReason:xsd:codelist:01.03", substitutionHeadName = "PurchaseOrderCancellationReasonA")
    public PurchaseOrderCancellationReason createPurchaseOrderCancellationReason(PurchaseOrderCancellationReasonType value) {
        return new PurchaseOrderCancellationReason(value);
    }

}
