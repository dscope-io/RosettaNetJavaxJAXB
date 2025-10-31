
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Lot
    extends JAXBElement<LotType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", "Lot");

    public Lot(LotType value) {
        super(NAME, ((Class) LotType.class), null, value);
    }

    public Lot() {
        super(NAME, ((Class) LotType.class), null, null);
    }

}
