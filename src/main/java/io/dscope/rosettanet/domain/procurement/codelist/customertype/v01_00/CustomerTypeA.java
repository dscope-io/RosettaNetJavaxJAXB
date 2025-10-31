
package io.dscope.rosettanet.domain.procurement.codelist.customertype.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CustomerTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:CustomerType:xsd:codelist:1.0", "CustomerTypeA");

    public CustomerTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CustomerTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
