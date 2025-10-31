
package io.dscope.rosettanet.domain.logistics.logistics.v02_20;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OrderInformation
    extends JAXBElement<OrderInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", "OrderInformation");

    public OrderInformation(OrderInformationType value) {
        super(NAME, ((Class) OrderInformationType.class), null, value);
    }

    public OrderInformation() {
        super(NAME, ((Class) OrderInformationType.class), null, null);
    }

}
