
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.02", "PurchaseOrderStatusA");

    public PurchaseOrderStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PurchaseOrderStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
