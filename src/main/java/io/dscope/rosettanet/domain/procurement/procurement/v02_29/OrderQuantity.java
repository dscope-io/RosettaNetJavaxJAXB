
package io.dscope.rosettanet.domain.procurement.procurement.v02_29;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OrderQuantity
    extends JAXBElement<OrderQuantityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", "OrderQuantity");

    public OrderQuantity(OrderQuantityType value) {
        super(NAME, ((Class) OrderQuantityType.class), null, value);
    }

    public OrderQuantity() {
        super(NAME, ((Class) OrderQuantityType.class), null, null);
    }

}
