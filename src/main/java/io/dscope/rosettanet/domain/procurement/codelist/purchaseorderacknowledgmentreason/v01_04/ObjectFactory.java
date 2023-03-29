
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderacknowledgmentreason.v01_04;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.purchaseorderacknowledgmentreason.v01_04 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.purchaseorderacknowledgmentreason.v01_04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseOrderAcknowledgmentReasonType }
     * 
     */
    public PurchaseOrderAcknowledgmentReasonType createPurchaseOrderAcknowledgmentReasonType() {
        return new PurchaseOrderAcknowledgmentReasonType();
    }

    /**
     * Create an instance of {@link PurchaseOrderAcknowledgmentReasonA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderAcknowledgmentReasonA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04", name = "PurchaseOrderAcknowledgmentReasonA")
    public PurchaseOrderAcknowledgmentReasonA createPurchaseOrderAcknowledgmentReasonA(Object value) {
        return new PurchaseOrderAcknowledgmentReasonA(value);
    }

    /**
     * Create an instance of {@link PurchaseOrderAcknowledgmentReason }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderAcknowledgmentReason }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04", name = "PurchaseOrderAcknowledgmentReason", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04", substitutionHeadName = "PurchaseOrderAcknowledgmentReasonA")
    public PurchaseOrderAcknowledgmentReason createPurchaseOrderAcknowledgmentReason(PurchaseOrderAcknowledgmentReasonType value) {
        return new PurchaseOrderAcknowledgmentReason(value);
    }

}