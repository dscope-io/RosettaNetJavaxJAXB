
package io.dscope.rosettanet.domain.service.service.v02_12;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RepairEvent
    extends JAXBElement<RepairEventType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.12", "RepairEvent");

    public RepairEvent(RepairEventType value) {
        super(NAME, ((Class) RepairEventType.class), null, value);
    }

    public RepairEvent() {
        super(NAME, ((Class) RepairEventType.class), null, null);
    }

}
