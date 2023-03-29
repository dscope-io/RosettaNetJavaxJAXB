
package io.dscope.rosettanet.domain.shared.codelist.amounttype.v01_01;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AmountTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:AmountType:xsd:codelist:01.01", "AmountTypeA");

    public AmountTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public AmountTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
