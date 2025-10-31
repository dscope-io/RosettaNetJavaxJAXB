
package io.dscope.rosettanet.domain.logistics.logistics.v01_14;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsPartialShipment
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.14", "IsPartialShipment");

    public IsPartialShipment(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsPartialShipment() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
