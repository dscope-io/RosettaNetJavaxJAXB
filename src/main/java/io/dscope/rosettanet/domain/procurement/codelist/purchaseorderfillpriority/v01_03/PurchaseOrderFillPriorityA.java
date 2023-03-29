
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderFillPriorityA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", "PurchaseOrderFillPriorityA");

    public PurchaseOrderFillPriorityA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PurchaseOrderFillPriorityA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
