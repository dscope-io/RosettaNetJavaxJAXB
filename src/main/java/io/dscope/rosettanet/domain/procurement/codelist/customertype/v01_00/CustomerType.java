
package io.dscope.rosettanet.domain.procurement.codelist.customertype.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CustomerType
    extends JAXBElement<CustomerTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:CustomerType:xsd:codelist:1.0", "CustomerType");

    public CustomerType(CustomerTypeType value) {
        super(NAME, ((Class) CustomerTypeType.class), null, value);
    }

    public CustomerType() {
        super(NAME, ((Class) CustomerTypeType.class), null, null);
    }

}
