
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class HardwareSets
    extends JAXBElement<HardwareSetsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", "HardwareSets");

    public HardwareSets(HardwareSetsType value) {
        super(NAME, ((Class) HardwareSetsType.class), null, value);
    }

    public HardwareSets() {
        super(NAME, ((Class) HardwareSetsType.class), null, null);
    }

}
