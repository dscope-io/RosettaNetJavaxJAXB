
package io.dscope.rosettanet.domain.salesreporting.codelist.purchasemethod.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseMethodA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:PurchaseMethod:xsd:codelist:1.0", "PurchaseMethodA");

    public PurchaseMethodA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PurchaseMethodA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
