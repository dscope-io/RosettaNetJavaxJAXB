
package io.dscope.rosettanet.domain.logistics.codelist.shipmentchangedisposition.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentChangeDisposition
    extends JAXBElement<ShipmentChangeDispositionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShipmentChangeDisposition:xsd:codelist:1.0", "ShipmentChangeDisposition");

    public ShipmentChangeDisposition(ShipmentChangeDispositionType value) {
        super(NAME, ((Class) ShipmentChangeDispositionType.class), null, value);
    }

    public ShipmentChangeDisposition() {
        super(NAME, ((Class) ShipmentChangeDispositionType.class), null, null);
    }

}
