
package io.dscope.rosettanet.interchange.purchaseorderconfirmation.v02_01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PurchaseOrderConfirmation", namespace = "urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.01")
public class PurchaseOrderConfirmation
    extends JAXBElement<PurchaseOrderConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.01", "PurchaseOrderConfirmation");

    public PurchaseOrderConfirmation(PurchaseOrderConfirmationType value) {
        super(NAME, ((Class) PurchaseOrderConfirmationType.class), null, value);
    }

    public PurchaseOrderConfirmation() {
        super(NAME, ((Class) PurchaseOrderConfirmationType.class), null, null);
    }

}