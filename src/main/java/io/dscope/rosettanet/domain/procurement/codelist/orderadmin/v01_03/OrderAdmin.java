
package io.dscope.rosettanet.domain.procurement.codelist.orderadmin.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OrderAdmin
    extends JAXBElement<OrderAdminType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:OrderAdmin:xsd:codelist:01.03", "OrderAdmin");

    public OrderAdmin(OrderAdminType value) {
        super(NAME, ((Class) OrderAdminType.class), null, value);
    }

    public OrderAdmin() {
        super(NAME, ((Class) OrderAdminType.class), null, null);
    }

}
