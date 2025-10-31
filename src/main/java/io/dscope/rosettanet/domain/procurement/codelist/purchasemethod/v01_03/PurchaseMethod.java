
package io.dscope.rosettanet.domain.procurement.codelist.purchasemethod.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseMethod
    extends JAXBElement<PurchaseMethodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseMethod:xsd:codelist:01.03", "PurchaseMethod");

    public PurchaseMethod(PurchaseMethodType value) {
        super(NAME, ((Class) PurchaseMethodType.class), null, value);
    }

    public PurchaseMethod() {
        super(NAME, ((Class) PurchaseMethodType.class), null, null);
    }

}
