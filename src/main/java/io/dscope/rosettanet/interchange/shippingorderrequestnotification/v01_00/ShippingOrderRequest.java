
package io.dscope.rosettanet.interchange.shippingorderrequestnotification.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingOrderRequest
    extends JAXBElement<ShippingOrderRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShippingOrderRequestNotification:xsd:schema:01.00", "ShippingOrderRequest");

    public ShippingOrderRequest(ShippingOrderRequestType value) {
        super(NAME, ((Class) ShippingOrderRequestType.class), null, value);
    }

    public ShippingOrderRequest() {
        super(NAME, ((Class) ShippingOrderRequestType.class), null, null);
    }

}
