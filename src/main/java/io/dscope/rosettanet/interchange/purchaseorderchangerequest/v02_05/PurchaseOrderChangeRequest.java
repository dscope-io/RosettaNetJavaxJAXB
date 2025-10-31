
package io.dscope.rosettanet.interchange.purchaseorderchangerequest.v02_05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PurchaseOrderChangeRequest", namespace = "urn:rosettanet:specification:interchange:PurchaseOrderChangeRequest:xsd:schema:02.05")
public class PurchaseOrderChangeRequest
    extends JAXBElement<PurchaseOrderChangeRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderChangeRequest:xsd:schema:02.05", "PurchaseOrderChangeRequest");

    public PurchaseOrderChangeRequest(PurchaseOrderChangeRequestType value) {
        super(NAME, ((Class) PurchaseOrderChangeRequestType.class), null, value);
    }

    public PurchaseOrderChangeRequest() {
        super(NAME, ((Class) PurchaseOrderChangeRequestType.class), null, null);
    }

}
