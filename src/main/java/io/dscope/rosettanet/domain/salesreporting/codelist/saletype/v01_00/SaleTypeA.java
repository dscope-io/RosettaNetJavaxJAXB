
package io.dscope.rosettanet.domain.salesreporting.codelist.saletype.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SaleTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:SaleType:xsd:codelist:1.0", "SaleTypeA");

    public SaleTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public SaleTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
