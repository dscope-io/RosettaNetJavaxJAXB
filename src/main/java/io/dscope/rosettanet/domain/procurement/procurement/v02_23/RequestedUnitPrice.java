
package io.dscope.rosettanet.domain.procurement.procurement.v02_23;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RequestedUnitPrice
    extends JAXBElement<RequestedUnitPriceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23", "RequestedUnitPrice");

    public RequestedUnitPrice(RequestedUnitPriceType value) {
        super(NAME, ((Class) RequestedUnitPriceType.class), null, value);
    }

    public RequestedUnitPrice() {
        super(NAME, ((Class) RequestedUnitPriceType.class), null, null);
    }

}
