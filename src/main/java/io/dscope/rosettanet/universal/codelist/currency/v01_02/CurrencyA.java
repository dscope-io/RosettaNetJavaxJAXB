
package io.dscope.rosettanet.universal.codelist.currency.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CurrencyA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Currency:xsd:codelist:01.02", "CurrencyA");

    public CurrencyA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CurrencyA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
