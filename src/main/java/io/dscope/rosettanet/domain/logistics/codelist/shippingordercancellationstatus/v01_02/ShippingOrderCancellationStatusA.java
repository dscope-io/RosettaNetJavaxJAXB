
package io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationstatus.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingOrderCancellationStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationStatus:xsd:codelist:01.02", "ShippingOrderCancellationStatusA");

    public ShippingOrderCancellationStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShippingOrderCancellationStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
