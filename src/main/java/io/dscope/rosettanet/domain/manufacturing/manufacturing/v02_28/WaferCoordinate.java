
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_28;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WaferCoordinate
    extends JAXBElement<WaferCoordinateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28", "WaferCoordinate");

    public WaferCoordinate(WaferCoordinateType value) {
        super(NAME, ((Class) WaferCoordinateType.class), null, value);
    }

    public WaferCoordinate() {
        super(NAME, ((Class) WaferCoordinateType.class), null, null);
    }

}
