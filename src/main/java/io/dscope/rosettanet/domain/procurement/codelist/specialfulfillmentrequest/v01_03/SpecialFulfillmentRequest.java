
package io.dscope.rosettanet.domain.procurement.codelist.specialfulfillmentrequest.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialFulfillmentRequest
    extends JAXBElement<SpecialFulfillmentRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:SpecialFulfillmentRequest:xsd:codelist:01.03", "SpecialFulfillmentRequest");

    public SpecialFulfillmentRequest(SpecialFulfillmentRequestType value) {
        super(NAME, ((Class) SpecialFulfillmentRequestType.class), null, value);
    }

    public SpecialFulfillmentRequest() {
        super(NAME, ((Class) SpecialFulfillmentRequestType.class), null, null);
    }

}
