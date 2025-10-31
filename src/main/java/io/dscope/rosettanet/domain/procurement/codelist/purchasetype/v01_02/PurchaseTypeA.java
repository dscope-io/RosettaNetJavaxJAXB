
package io.dscope.rosettanet.domain.procurement.codelist.purchasetype.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseType:xsd:codelist:01.02", "PurchaseTypeA");

    public PurchaseTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PurchaseTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
