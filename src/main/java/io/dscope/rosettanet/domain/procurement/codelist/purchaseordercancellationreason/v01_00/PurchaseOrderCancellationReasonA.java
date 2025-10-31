
package io.dscope.rosettanet.domain.procurement.codelist.purchaseordercancellationreason.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderCancellationReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderCancellationReason:xsd:codelist:1.0", "PurchaseOrderCancellationReasonA");

    public PurchaseOrderCancellationReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PurchaseOrderCancellationReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
