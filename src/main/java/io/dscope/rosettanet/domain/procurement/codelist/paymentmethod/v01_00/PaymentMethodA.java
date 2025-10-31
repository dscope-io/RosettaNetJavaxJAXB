
package io.dscope.rosettanet.domain.procurement.codelist.paymentmethod.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentMethodA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PaymentMethod:xsd:codelist:1.0", "PaymentMethodA");

    public PaymentMethodA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PaymentMethodA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
