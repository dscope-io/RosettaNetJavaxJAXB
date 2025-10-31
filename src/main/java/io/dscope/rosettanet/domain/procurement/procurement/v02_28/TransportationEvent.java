
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TransportationEvent
    extends JAXBElement<TransportationEventType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.28", "TransportationEvent");

    public TransportationEvent(TransportationEventType value) {
        super(NAME, ((Class) TransportationEventType.class), null, value);
    }

    public TransportationEvent() {
        super(NAME, ((Class) TransportationEventType.class), null, null);
    }

}
