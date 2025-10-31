
package io.dscope.rosettanet.interchange.shippingordercancellationrequest.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShippingOrderCancellationRequest", namespace = "urn:rosettanet:specification:interchange:ShippingOrderCancellationRequestNotification:xsd:schema:01.00")
public class ShippingOrderCancellationRequest
    extends JAXBElement<ShippingOrderCancellationRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShippingOrderCancellationRequestNotification:xsd:schema:01.00", "ShippingOrderCancellationRequest");

    public ShippingOrderCancellationRequest(ShippingOrderCancellationRequestType value) {
        super(NAME, ((Class) ShippingOrderCancellationRequestType.class), null, value);
    }

    public ShippingOrderCancellationRequest() {
        super(NAME, ((Class) ShippingOrderCancellationRequestType.class), null, null);
    }

}
