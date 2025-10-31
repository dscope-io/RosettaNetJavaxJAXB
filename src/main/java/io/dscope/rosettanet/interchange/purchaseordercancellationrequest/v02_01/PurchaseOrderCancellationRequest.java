
package io.dscope.rosettanet.interchange.purchaseordercancellationrequest.v02_01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PurchaseOrderCancellationRequest", namespace = "urn:rosettanet:specification:interchange:PurchaseOrderCancellationRequest:xsd:schema:02.01")
public class PurchaseOrderCancellationRequest
    extends JAXBElement<PurchaseOrderCancellationRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderCancellationRequest:xsd:schema:02.01", "PurchaseOrderCancellationRequest");

    public PurchaseOrderCancellationRequest(PurchaseOrderCancellationRequestType value) {
        super(NAME, ((Class) PurchaseOrderCancellationRequestType.class), null, value);
    }

    public PurchaseOrderCancellationRequest() {
        super(NAME, ((Class) PurchaseOrderCancellationRequestType.class), null, null);
    }

}
