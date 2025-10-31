
package io.dscope.rosettanet.domain.procurement.procurement.v01_13;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentInformation
    extends JAXBElement<PaymentInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13", "PaymentInformation");

    public PaymentInformation(PaymentInformationType value) {
        super(NAME, ((Class) PaymentInformationType.class), null, value);
    }

    public PaymentInformation() {
        super(NAME, ((Class) PaymentInformationType.class), null, null);
    }

}
