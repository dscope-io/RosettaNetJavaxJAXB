
package io.dscope.rosettanet.domain.procurement.procurement.v02_22;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CurrencyConversion
    extends JAXBElement<CurrencyConversionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.22", "CurrencyConversion");

    public CurrencyConversion(CurrencyConversionType value) {
        super(NAME, ((Class) CurrencyConversionType.class), null, value);
    }

    public CurrencyConversion() {
        super(NAME, ((Class) CurrencyConversionType.class), null, null);
    }

}
