
package io.dscope.rosettanet.domain.logistics.logistics.v01_05;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentChangeReason
    extends JAXBElement<ShipmentChangeReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.05", "ShipmentChangeReason");

    public ShipmentChangeReason(ShipmentChangeReasonType value) {
        super(NAME, ((Class) ShipmentChangeReasonType.class), null, value);
    }

    public ShipmentChangeReason() {
        super(NAME, ((Class) ShipmentChangeReasonType.class), null, null);
    }

}
