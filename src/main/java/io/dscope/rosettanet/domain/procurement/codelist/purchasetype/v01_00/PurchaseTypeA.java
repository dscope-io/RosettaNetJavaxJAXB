
package io.dscope.rosettanet.domain.procurement.codelist.purchasetype.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseType:xsd:codelist:1.0", "PurchaseTypeA");

    public PurchaseTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PurchaseTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
