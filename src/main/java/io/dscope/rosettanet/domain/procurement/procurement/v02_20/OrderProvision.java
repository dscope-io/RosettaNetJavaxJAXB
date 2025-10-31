
package io.dscope.rosettanet.domain.procurement.procurement.v02_20;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OrderProvision
    extends JAXBElement<OrderProvisionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20", "OrderProvision");

    public OrderProvision(OrderProvisionType value) {
        super(NAME, ((Class) OrderProvisionType.class), null, value);
    }

    public OrderProvision() {
        super(NAME, ((Class) OrderProvisionType.class), null, null);
    }

}
