
package io.dscope.rosettanet.interchange.purchaseorderrequest.v02_04;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PurchaseOrderRequest", namespace = "urn:rosettanet:specification:interchange:PurchaseOrderRequest:xsd:schema:02.04")
public class PurchaseOrderRequest
    extends JAXBElement<PurchaseOrderRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderRequest:xsd:schema:02.04", "PurchaseOrderRequest");

    public PurchaseOrderRequest(PurchaseOrderRequestType value) {
        super(NAME, ((Class) PurchaseOrderRequestType.class), null, value);
    }

    public PurchaseOrderRequest() {
        super(NAME, ((Class) PurchaseOrderRequestType.class), null, null);
    }

}
