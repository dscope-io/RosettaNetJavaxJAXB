
package io.dscope.rosettanet.domain.shared.codelist.invoicechargetype.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InvoiceChargeTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:InvoiceChargeType:xsd:codelist:01.00", "InvoiceChargeTypeA");

    public InvoiceChargeTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public InvoiceChargeTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
