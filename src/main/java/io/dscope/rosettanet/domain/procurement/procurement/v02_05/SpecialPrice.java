
package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialPrice
    extends JAXBElement<SpecialPriceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", "SpecialPrice");

    public SpecialPrice(SpecialPriceType value) {
        super(NAME, ((Class) SpecialPriceType.class), null, value);
    }

    public SpecialPrice() {
        super(NAME, ((Class) SpecialPriceType.class), null, null);
    }

}
