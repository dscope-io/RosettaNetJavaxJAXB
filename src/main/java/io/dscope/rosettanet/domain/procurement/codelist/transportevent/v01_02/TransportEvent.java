
package io.dscope.rosettanet.domain.procurement.codelist.transportevent.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TransportEvent
    extends JAXBElement<TransportEventType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.02", "TransportEvent");

    public TransportEvent(TransportEventType value) {
        super(NAME, ((Class) TransportEventType.class), null, value);
    }

    public TransportEvent() {
        super(NAME, ((Class) TransportEventType.class), null, null);
    }

}
