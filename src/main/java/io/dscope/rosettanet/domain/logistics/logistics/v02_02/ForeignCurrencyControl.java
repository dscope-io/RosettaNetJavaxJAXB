
package io.dscope.rosettanet.domain.logistics.logistics.v02_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForeignCurrencyControl
    extends JAXBElement<ForeignCurrencyControlType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.02", "ForeignCurrencyControl");

    public ForeignCurrencyControl(ForeignCurrencyControlType value) {
        super(NAME, ((Class) ForeignCurrencyControlType.class), null, value);
    }

    public ForeignCurrencyControl() {
        super(NAME, ((Class) ForeignCurrencyControlType.class), null, null);
    }

}
