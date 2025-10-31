
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_06;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Pin
    extends JAXBElement<PinType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.06", "Pin");

    public Pin(PinType value) {
        super(NAME, ((Class) PinType.class), null, value);
    }

    public Pin() {
        super(NAME, ((Class) PinType.class), null, null);
    }

}
