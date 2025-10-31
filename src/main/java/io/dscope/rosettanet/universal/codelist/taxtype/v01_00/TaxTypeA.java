
package io.dscope.rosettanet.universal.codelist.taxtype.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:TaxType:xsd:codelist:1.0", "TaxTypeA");

    public TaxTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public TaxTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
