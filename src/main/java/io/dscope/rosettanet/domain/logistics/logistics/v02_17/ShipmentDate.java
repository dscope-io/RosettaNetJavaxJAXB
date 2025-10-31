
package io.dscope.rosettanet.domain.logistics.logistics.v02_17;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentDate
    extends JAXBElement<ShipmentDateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", "ShipmentDate");

    public ShipmentDate(ShipmentDateType value) {
        super(NAME, ((Class) ShipmentDateType.class), null, value);
    }

    public ShipmentDate() {
        super(NAME, ((Class) ShipmentDateType.class), null, null);
    }

}
