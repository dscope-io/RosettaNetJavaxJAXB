
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderchangetype.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderChangeType
    extends JAXBElement<PurchaseOrderChangeTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.03", "PurchaseOrderChangeType");

    public PurchaseOrderChangeType(PurchaseOrderChangeTypeType value) {
        super(NAME, ((Class) PurchaseOrderChangeTypeType.class), null, value);
    }

    public PurchaseOrderChangeType() {
        super(NAME, ((Class) PurchaseOrderChangeTypeType.class), null, null);
    }

}
