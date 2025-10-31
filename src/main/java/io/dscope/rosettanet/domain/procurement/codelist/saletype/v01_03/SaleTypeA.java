
package io.dscope.rosettanet.domain.procurement.codelist.saletype.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SaleTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.03", "SaleTypeA");

    public SaleTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public SaleTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
