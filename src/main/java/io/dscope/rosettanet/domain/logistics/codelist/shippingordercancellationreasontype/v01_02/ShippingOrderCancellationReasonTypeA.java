
package io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationreasontype.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingOrderCancellationReasonTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationReasonType:xsd:codelist:01.02", "ShippingOrderCancellationReasonTypeA");

    public ShippingOrderCancellationReasonTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShippingOrderCancellationReasonTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
