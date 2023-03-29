
package io.dscope.rosettanet.domain.logistics.logistics.v02_22;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentServiceLevel
    extends JAXBElement<ShipmentServiceLevelType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", "ShipmentServiceLevel");

    public ShipmentServiceLevel(ShipmentServiceLevelType value) {
        super(NAME, ((Class) ShipmentServiceLevelType.class), null, value);
    }

    public ShipmentServiceLevel() {
        super(NAME, ((Class) ShipmentServiceLevelType.class), null, null);
    }

}