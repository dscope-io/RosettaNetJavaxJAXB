
package io.dscope.rosettanet.domain.procurement.procurement.v02_24;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PrePaymentDetail
    extends JAXBElement<PrePaymentDetailType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.24", "PrePaymentDetail");

    public PrePaymentDetail(PrePaymentDetailType value) {
        super(NAME, ((Class) PrePaymentDetailType.class), null, value);
    }

    public PrePaymentDetail() {
        super(NAME, ((Class) PrePaymentDetailType.class), null, null);
    }

}
