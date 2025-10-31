
package io.dscope.rosettanet.domain.procurement.procurement.v02_20;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialPrice
    extends JAXBElement<SpecialPriceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20", "SpecialPrice");

    public SpecialPrice(SpecialPriceType value) {
        super(NAME, ((Class) SpecialPriceType.class), null, value);
    }

    public SpecialPrice() {
        super(NAME, ((Class) SpecialPriceType.class), null, null);
    }

}
