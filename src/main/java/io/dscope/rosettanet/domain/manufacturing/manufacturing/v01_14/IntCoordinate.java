
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IntCoordinate
    extends JAXBElement<IntCoordinateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", "IntCoordinate");

    public IntCoordinate(IntCoordinateType value) {
        super(NAME, ((Class) IntCoordinateType.class), null, value);
    }

    public IntCoordinate() {
        super(NAME, ((Class) IntCoordinateType.class), null, null);
    }

}
