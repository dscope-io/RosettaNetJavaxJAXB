
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderacknowledgmentreason.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderAcknowledgmentReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:1.0", "PurchaseOrderAcknowledgmentReasonA");

    public PurchaseOrderAcknowledgmentReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PurchaseOrderAcknowledgmentReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
