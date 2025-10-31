
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PartPayment
    extends JAXBElement<PartPaymentType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.28", "PartPayment");

    public PartPayment(PartPaymentType value) {
        super(NAME, ((Class) PartPaymentType.class), null, value);
    }

    public PartPayment() {
        super(NAME, ((Class) PartPaymentType.class), null, null);
    }

}
