
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_28;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IntCoordinate
    extends JAXBElement<IntCoordinateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28", "IntCoordinate");

    public IntCoordinate(IntCoordinateType value) {
        super(NAME, ((Class) IntCoordinateType.class), null, value);
    }

    public IntCoordinate() {
        super(NAME, ((Class) IntCoordinateType.class), null, null);
    }

}
