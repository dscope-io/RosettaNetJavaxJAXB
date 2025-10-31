
package io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_05;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentMode
    extends JAXBElement<ShipmentModeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05", "ShipmentMode");

    public ShipmentMode(ShipmentModeType value) {
        super(NAME, ((Class) ShipmentModeType.class), null, value);
    }

    public ShipmentMode() {
        super(NAME, ((Class) ShipmentModeType.class), null, null);
    }

}
