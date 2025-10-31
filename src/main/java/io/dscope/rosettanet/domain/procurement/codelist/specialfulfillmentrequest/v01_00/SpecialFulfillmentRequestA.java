
package io.dscope.rosettanet.domain.procurement.codelist.specialfulfillmentrequest.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialFulfillmentRequestA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:SpecialFulfillmentRequest:xsd:codelist:1.0", "SpecialFulfillmentRequestA");

    public SpecialFulfillmentRequestA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public SpecialFulfillmentRequestA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
